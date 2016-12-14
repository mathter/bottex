package biz.ostw.bottex.lexical.simple;

import java.io.IOException;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import biz.ostw.bottex.lexical.Lexeme;
import biz.ostw.bottex.lexical.LexemeImpl;

/**
 * @author mathter
 */
class LexicalAnalizer implements biz.ostw.bottex.lexical.LexicalAnalizer
{

    private final CommonTokenStream commonTokenStream;

    private int index = -1;

    public LexicalAnalizer( Reader reader ) throws IOException
    {
        CharStream stream = new ANTLRInputStream( reader );
        simple lexer = new simple( stream );

        this.commonTokenStream = new CommonTokenStream( lexer );
    }

    public Lexeme next() throws IOException
    {
        if ( this.index < 0 )
        {
            this.commonTokenStream.fill();
        }

        if ( ++ this.index < this.commonTokenStream.size() )
        {
            return this.build( this.commonTokenStream.get( this.index ) );
        } else
        {
            return null;
        }
    }

    private Lexeme build( Token token )
    {
        return token.getType() != simple.EOF ? new LexemeImpl( Translator.translate( token.getType() ), token.getText().toCharArray() )
            : null;
    }
}
