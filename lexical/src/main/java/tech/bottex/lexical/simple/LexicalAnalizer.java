package tech.bottex.lexical.simple;

import java.io.IOException;
import java.io.Reader;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import tech.bottex.lexical.Lexeme;
import tech.bottex.lexical.LexemeImpl;
import tech.bottex.lexical.simple.simple;

/**
 * @author mathter
 */
class LexicalAnalizer implements tech.bottex.lexical.LexicalAnalizer
{

    private final CommonTokenStream commonTokenStream;

    private int index = -1;

    public LexicalAnalizer( Reader reader ) throws IOException
    {
        CharStream stream = new ANTLRInputStream( reader );
        simple lexer = new simple( stream );

        this.commonTokenStream = new CommonTokenStream( lexer );
    }

    @Override
    public Lexeme next()
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

    @Override
    public boolean hasNext()
    {
        if ( this.index < 0 )
        {
            this.commonTokenStream.fill();
        }
        
        return this.index < this.commonTokenStream.size() - 2;
    }

    @Override
    public Stream< Lexeme > streem()
    {
        return StreamSupport.stream( spliterator(), false );
    }

    private Spliterator< Lexeme > spliterator()
    {
        return Spliterators.spliterator( this, this.commonTokenStream.size(), Spliterator.IMMUTABLE );
    }

    private Lexeme build( Token token )
    {
        return token.getType() != simple.EOF ? new LexemeImpl( Translator.translate( token.getType() ), token.getText().toCharArray() )
            : null;
    }
}
