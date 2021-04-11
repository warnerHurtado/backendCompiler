package com.example.demo;

import generated.*;

import netscape.javascript.JSObject;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.io.*;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controllers {
    private static  final String data = "%s!";

    //Metodo para crear y escribir en archivos
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

    private String test(){
        miScanner inst = null;
        miParser parser = null;
        ParseTree tree=null;

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
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }

            if ( !errorListener.hasErrors() ) {
                //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                //treeGUI.get().setVisible(true);

                return errorListener.toString();
            }
            else {
                return errorListener.toString();
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
