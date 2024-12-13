package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Distributed Persistent Project Indexing
 * InternshipProject Task
 */
public class App 
{

    /*
        Example input: "x = 1 print x scope { x = 2 print x scope { x = 3 y = x print x print y } print x print y } print x"
     */

    public static void main( String[] args )
    {

        if(args.length == 0) {
            System.out.println("No input specified!");
            return;
        }

        String program = args[0];

        ProjectLexer projectLexer = new ProjectLexer(CharStreams.fromString(program));

        CommonTokenStream stream = new CommonTokenStream(projectLexer);
        stream.fill();

        ProjectParser parser = new ProjectParser(stream);

        ParseTree tree = parser.document();

        ProjectScopeListener listener = new ProjectScopeListener();

        ParseTreeWalker.DEFAULT.walk(listener,tree);
    }
}
