package com.example.demo;

import analysisContext.AnalisisContextual;
import generated.*;


import interprete.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import org.springframework.web.bind.annotation.*;
import java.io.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controllers {


    private static  final String data = "%s!";


    public static void crearEscribirArchivo(String nomArchi, String nuevoDato) {

        try {
            //String contenido = "Contenido de ejemplo";
            File file = new File(nomArchi+".txt");
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nuevoDato);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String json(){
        Almacen alma = Almacen.getInstance();
        StringBuilder elJson = new StringBuilder("{");
        for (int i = 0; i < alma.tablaAlmacen.size(); i++) {

            elJson.append("dato_").append(i).append(": [");
            elJson.append(alma.tablaAlmacen.get(i).nombre).append(",");
            elJson.append(alma.tablaAlmacen.get(i).valor).append(",");
            elJson.append(alma.tablaAlmacen.get(i).valor.getClass().getSimpleName());
            elJson.append("],");

        }
        elJson.append("}");

        return elJson.toString();

    }

// Función que debe de ser sustituída en el archivo controller

    private String test() {
        String errores = "";
        miScanner inst = null;
        miParser parser = null;
        ParseTree tree=null;
        AnalisisContextual ac = null;
        Interprete inter = null;

        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            inst = new miScanner(CharStreams.fromFileName("test.txt"));
            tokens = new CommonTokenStream(inst);
            parser = new miParser(tokens);

            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );

            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );


            try {
                tree = parser.program();
                ac = new AnalisisContextual();
                inter = new Interprete();

                ac.visit(tree);
            }
            catch(Exception e){

                e.printStackTrace();
            }

            if ( !errorListener.hasErrors() ) {

                 if ((ac.errors.equals(""))){
                    assert inter != null;
                    inter.visit(tree);


                    return json();

                }
                errores = ac.errors;
                return errores;
            }
            else {

                if (ac.errors == null){
                    return errorListener.toString();
                }
                errores += ac.errors +"\n"+errorListener.toString();
                return errores;
            }
        }

        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}

        return null;
    }


    @GetMapping("/getWords")
    public Response getWord(@RequestParam(value = "name") String name) {
        Response res;
        String result = test();

        System.out.println( name );
        try {
            res = new Response(String.format(data, result), "200");
        }catch (Error error){
            res = new Response(null, "500");
        }

        return res;
    }

    @GetMapping("/getAllWords")
    public Response getAllWord() {
        Response res;
        String result = test();

        try {
            res = new Response(String.format(data, result), "200");
        }catch (Error error){
            res = new Response(null, "500");
        }

        return res;
    }

    @PostMapping("/postWord")
    public void postWord(@RequestBody String name){

        crearEscribirArchivo("test", name);
    }



}
