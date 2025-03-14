package com.example.demo;

import analysisContext.AnalisisContextual;
import analysisContext.TablaSimbolos;
import generated.*;


import interprete.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import org.springframework.web.bind.annotation.*;
import java.io.*;

@RestController
@CrossOrigin

public class Controllers {


    private static  final String data = "%s";
    private boolean error = false;


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

    public static String json( String prints ){
        Almacen alma = Almacen.getInstance();
        StringBuilder elJson = new StringBuilder("{");
        for (int i = 0; i < alma.tablaAlmacen.size(); i++) {
            elJson.append("\"datos").append(i).append("\"").append(": [");
            elJson.append("\"").append(alma.tablaAlmacen.get(i).nombre).append("\"").append(",");
            elJson.append("\"").append(alma.tablaAlmacen.get(i).valor).append("\"").append(",");
            elJson.append("\"").append(alma.tablaAlmacen.get(i).valor.getClass().getSimpleName()).append("\"");
            elJson.append("],");
        }
        elJson.append("\"printable\":").append("[").append("\"").append(prints).append("\"").append("],");
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
            this.error = false;
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
                    if ( inter.errors.length() == 0 ){
                        System.out.println("Sin errores de interpretación");
                        System.out.println(json( inter.prints ));
                        return json( inter.prints );
                    }else{
                        System.out.println("Con errores de interpretación");
                        this.error = true;
                        return inter.errors;
                    }
                }else{
                    // Se retorna los errores contextuales
                    System.out.println("Con errores de contextualidad");
                    this.error = true;
                    return ac.errors;
                }
            }else{
                System.out.println("Errores de parser y scanner");
                this.error = true;
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
        if ( !this.error ){
            res = new Response(String.format(data, result), "200");
        }else{
            res = new Response(String.format(data, result), "500");
        }
        return res;
    }

    @PostMapping("/postWord")
    public void postWord(@RequestBody String name){
        crearEscribirArchivo("test", name);
    }

    @GetMapping("/wipeData")
    public Response wipeData(){
        Response res;
        Almacen alma = Almacen.getInstance();
        TablaSimbolos tabla = TablaSimbolos.getInstance();
        alma.wipeData();
        tabla.wipeTable();
        return new Response( "Table cleaned", "200" );
    }



}
