package test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Test
{
    public static void main( String[] args ) throws Exception
    {
        InputStream is = Test.class.getResourceAsStream( "test.txt" );
        Reader reader = new InputStreamReader( is );
        CharStream stream = new ANTLRInputStream( reader );
        test test = new test( stream );
        CommonTokenStream cts = new CommonTokenStream( test );

        cts.fill();

        System.out.println( cts.getTokens() );
    }
}
