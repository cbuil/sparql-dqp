import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SparqlLexer lex = new SparqlLexer(new ANTLRFileStream("/media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/output/__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser g = new SparqlParser(tokens, 49105, null);
        try {
            g.query();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}