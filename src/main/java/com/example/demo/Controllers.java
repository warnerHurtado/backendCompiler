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

    private String analizador(){
        miScanner inst = null;
        miParser parser = null;
        ParseTree tree=null;
        CharStream input=null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new miScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new miParser(tokens);
            errorListener = new MyErrorListener();
            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );
            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );
            tree = parser.program();
            AnalisisContextual ac = new AnalisisContextual();
            Interprete inter = new Interprete();


            if( !errorListener.hasErrors() ){ //Errores de parser y scanner
                ac.visit(tree); // Visita al contextual
                if ( ac.errors.length() == 0 ){ // Se verifica que el contextual no tenga errores
                    System.out.println("Sin errores de contextualidad");
                    inter.visit(tree); // Se debe de validar los errores
                    System.out.println(json());
                    return json();
                }else{
                    // Se retorna los errores contextuales
                    System.out.println("Con errores de contextualidad");
                    return ac.errors;
                }
            }else{
                System.out.println("Errores de parser y scanner");
                return errorListener.toString();
            }


        } catch (IOException e) {
            e.printStackTrace();
            return "No hay archivo, error interno";
        }

    }





    @GetMapping("/getAllWords")
    public Response getAllWord() {
        Response res;
        String result = analizador();
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
