package com.example.demo;

import generated.*;

import netscape.javascript.JSObject;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controllers {
    private static  final String data = "%s!";

    private String test(String input){
        miScanner inst = null;
        miParser parser = null;
        ParseTree tree=null;

        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            inst = new miScanner(CharStreams.fromString(input));
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
                System.out.println("Exitoso\n");
                //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                //treeGUI.get().setVisible(true);

                return errorListener.toString();
            }
            else {
                System.out.println("Parser Error\n");
                return errorListener.toString();
            }
        }

        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}

        return null;
    }


    @GetMapping("/words")
    public Response getWord(@RequestParam(value = "name") String name) {
        Response res;
        String result = test(name);
        try {
            test(name);
            res = new Response(String.format(data, result), "200");
        }catch (Error error){
            res = new Response(null, "500");
        }

        return res;
    }

    @PostMapping("/postWord")
    public Response postWord(@RequestBody JSObject name){
        Response res;
        String result = test(name.toString());
        System.out.println( name );
        try {
            test(name.toString());
            res = new Response(String.format(data, result), "200");
        }catch (Error error){
            res = new Response(null, "500");
        }

        return res;
    }



}
