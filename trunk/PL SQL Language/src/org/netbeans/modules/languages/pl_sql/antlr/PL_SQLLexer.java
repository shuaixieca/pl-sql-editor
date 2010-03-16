// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g 2010-03-16 17:20:41
package org.netbeans.modules.languages.pl_sql.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PL_SQLLexer extends Lexer {
    public static final int BLOCK_COMMENT=4;
    public static final int EOF=-1;

    // delegates
    // delegators

    public PL_SQLLexer() {;} 
    public PL_SQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PL_SQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g"; }

    // $ANTLR start "BLOCK_COMMENT"
    public final void mBLOCK_COMMENT() throws RecognitionException {
        try {
            int _type = BLOCK_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:41:2: ( '/*' ( . )* '*/' )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:41:4: '/*' ( . )* '*/'
            {
            match("/*"); 

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:41:9: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:41:9: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:8: ( BLOCK_COMMENT )
        // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:1:10: BLOCK_COMMENT
        {
        mBLOCK_COMMENT(); 

        }


    }


 

}