// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g 2010-03-16 17:20:41
package org.netbeans.modules.languages.pl_sql.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PL_SQLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK_COMMENT"
    };
    public static final int BLOCK_COMMENT=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public PL_SQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PL_SQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PL_SQLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g"; }


    	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

    	@Override
    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String message = super.getErrorMessage(e, tokenNames);
    		SyntaxError syntaxError = new SyntaxError();
    		syntaxError.exception = e;
    		syntaxError.message = message;
    		syntaxErrors.add(syntaxError);
    		return message;
    	}

    	public static class SyntaxError {
    		public RecognitionException exception;
    		public String message;
    		public int line;
    		public int charPositionInLine;
    	}


    public static class grammar_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "grammar_def"
    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:44:1: grammar_def : ( BLOCK_COMMENT )* EOF ;
    public final PL_SQLParser.grammar_def_return grammar_def() throws RecognitionException {
        PL_SQLParser.grammar_def_return retval = new PL_SQLParser.grammar_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BLOCK_COMMENT1=null;
        Token EOF2=null;

        Object BLOCK_COMMENT1_tree=null;
        Object EOF2_tree=null;

        try {
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:45:2: ( ( BLOCK_COMMENT )* EOF )
            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:45:4: ( BLOCK_COMMENT )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:45:4: ( BLOCK_COMMENT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BLOCK_COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Work\\NetBeansProjects\\pl-sql-editor.svn\\trunk\\PL SQL Language\\ext_lib.antlr\\PL_SQL.g:45:4: BLOCK_COMMENT
            	    {
            	    BLOCK_COMMENT1=(Token)match(input,BLOCK_COMMENT,FOLLOW_BLOCK_COMMENT_in_grammar_def66); 
            	    BLOCK_COMMENT1_tree = (Object)adaptor.create(BLOCK_COMMENT1);
            	    adaptor.addChild(root_0, BLOCK_COMMENT1_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_grammar_def69); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "grammar_def"

    // Delegated rules


 

    public static final BitSet FOLLOW_BLOCK_COMMENT_in_grammar_def66 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EOF_in_grammar_def69 = new BitSet(new long[]{0x0000000000000002L});

}