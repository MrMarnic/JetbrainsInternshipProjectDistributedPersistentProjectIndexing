package org.example;

import junit.framework.ComparisonFailure;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);

        PrintStream originalOut = System.out;
        System.setOut(printStream);

        String program = "x = 1 print x scope { x = 2 print x scope { x = 3 y = x print x print y } print x print y } print x";

        ProjectLexer projectLexer = new ProjectLexer(CharStreams.fromString(program));

        CommonTokenStream stream = new CommonTokenStream(projectLexer);
        stream.fill();

        ProjectParser parser = new ProjectParser(stream);

        ParseTree tree = parser.document();

        ProjectScopeListener listener = new ProjectScopeListener();

        ParseTreeWalker.DEFAULT.walk(listener,tree);
        System.setOut(originalOut);

        String expected = "1\n" +
                "2\n" +
                "3\n" +
                "3\n" +
                "2\n" +
                "null\n" +
                "1";

        String out = outStream.toString().replace("\r\n", "\n").trim();

        assertEquals(expected,out);
    }
    public void testException() {
        Assert.assertThrows(ComparisonFailure.class, () -> {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outStream);

            PrintStream originalOut = System.out;
            System.setOut(printStream);

            String program = "x = 1 print x scope { x = 2 print x scope { x = 3 y = x ";

            ProjectLexer projectLexer = new ProjectLexer(CharStreams.fromString(program));

            CommonTokenStream stream = new CommonTokenStream(projectLexer);
            stream.fill();

            ProjectParser parser = new ProjectParser(stream);

            ParseTree tree = parser.document();

            ProjectScopeListener listener = new ProjectScopeListener();

            ParseTreeWalker.DEFAULT.walk(listener,tree);
            System.setOut(originalOut);

            String expected = "1\n" +
                    "2\n" +
                    "3\n" +
                    "3\n" +
                    "2\n" +
                    "null\n" +
                    "1";

            String out = outStream.toString().replace("\r\n", "\n").trim();

            assertEquals(expected,out);
        });
    }

    public void testEmpty() {
        Assert.assertThrows(ComparisonFailure.class, () -> {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outStream);

            PrintStream originalOut = System.out;
            System.setOut(printStream);

            String program = "";

            ProjectLexer projectLexer = new ProjectLexer(CharStreams.fromString(program));

            CommonTokenStream stream = new CommonTokenStream(projectLexer);
            stream.fill();

            ProjectParser parser = new ProjectParser(stream);

            ParseTree tree = parser.document();

            ProjectScopeListener listener = new ProjectScopeListener();

            ParseTreeWalker.DEFAULT.walk(listener,tree);
            System.setOut(originalOut);

            String out = outStream.toString().replace("\r\n", "\n").trim();

            assertEquals("",out);
        });
    }
}
