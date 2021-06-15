package analysisContext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

class Ident{

    static class Params{
        String name;
        String type;

        public Params(String name, String type) {
            this.name = name;
            this.type = type;
        }
    }

    String  tok;
    String type;
    int nivel;
    boolean initialited;
    ParserRuleContext declCtx;
    List<Params> listParams;


    public Ident(String t, String tp, ParserRuleContext decl, int nivelActual, List<Params> params ) {
        tok = t;
        type = tp;
        nivel = nivelActual;
        declCtx = decl;
        initialited = false;
        listParams = params;
    }

}