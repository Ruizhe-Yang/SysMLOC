package dut.control.sysmloc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSysMLOCLexer extends Lexer {
    public static final int RULE_REGULAR_COMMENT=6;
    public static final int RULE_SL_NOTE=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_DECIMAL_VALUE=7;
    public static final int RULE_UNRESTRICTED_NAME=5;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_STRING_VALUE=9;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=10;
    public static final int RULE_EXP_VALUE=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalSysMLOCLexer() {;} 
    public InternalSysMLOCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSysMLOCLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSysMLOC.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:11:7: ( ';' )
            // InternalSysMLOC.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:12:7: ( 'public' )
            // InternalSysMLOC.g:12:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:13:7: ( 'private' )
            // InternalSysMLOC.g:13:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:14:7: ( 'protected' )
            // InternalSysMLOC.g:14:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:15:7: ( 'package' )
            // InternalSysMLOC.g:15:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:16:7: ( '{' )
            // InternalSysMLOC.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:17:7: ( '}' )
            // InternalSysMLOC.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:18:7: ( 'import' )
            // InternalSysMLOC.g:18:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:19:7: ( 'doc' )
            // InternalSysMLOC.g:19:9: 'doc'
            {
            match("doc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:20:7: ( 'attribute' )
            // InternalSysMLOC.g:20:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:21:7: ( 'def' )
            // InternalSysMLOC.g:21:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:22:7: ( 'part' )
            // InternalSysMLOC.g:22:9: 'part'
            {
            match("part"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:23:7: ( '::' )
            // InternalSysMLOC.g:23:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_DECIMAL_VALUE"
    public final void mRULE_DECIMAL_VALUE() throws RecognitionException {
        try {
            // InternalSysMLOC.g:1798:29: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalSysMLOC.g:1798:31: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalSysMLOC.g:1798:40: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSysMLOC.g:1798:41: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_VALUE"

    // $ANTLR start "RULE_EXP_VALUE"
    public final void mRULE_EXP_VALUE() throws RecognitionException {
        try {
            int _type = RULE_EXP_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1800:16: ( RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:1800:18: RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE
            {
            mRULE_DECIMAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSysMLOC.g:1800:47: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSysMLOC.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_DECIMAL_VALUE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP_VALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1802:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSysMLOC.g:1802:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSysMLOC.g:1802:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSysMLOC.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_UNRESTRICTED_NAME"
    public final void mRULE_UNRESTRICTED_NAME() throws RecognitionException {
        try {
            int _type = RULE_UNRESTRICTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1804:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalSysMLOC.g:1804:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalSysMLOC.g:1804:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSysMLOC.g:1804:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalSysMLOC.g:1804:73: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNRESTRICTED_NAME"

    // $ANTLR start "RULE_STRING_VALUE"
    public final void mRULE_STRING_VALUE() throws RecognitionException {
        try {
            int _type = RULE_STRING_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1806:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSysMLOC.g:1806:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSysMLOC.g:1806:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSysMLOC.g:1806:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalSysMLOC.g:1806:67: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_VALUE"

    // $ANTLR start "RULE_REGULAR_COMMENT"
    public final void mRULE_REGULAR_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_REGULAR_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1808:22: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSysMLOC.g:1808:24: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSysMLOC.g:1808:29: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSysMLOC.g:1808:57: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGULAR_COMMENT"

    // $ANTLR start "RULE_ML_NOTE"
    public final void mRULE_ML_NOTE() throws RecognitionException {
        try {
            int _type = RULE_ML_NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1810:14: ( '//*' ( options {greedy=false; } : . )* '*/' )
            // InternalSysMLOC.g:1810:16: '//*' ( options {greedy=false; } : . )* '*/'
            {
            match("//*"); 

            // InternalSysMLOC.g:1810:22: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSysMLOC.g:1810:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_NOTE"

    // $ANTLR start "RULE_SL_NOTE"
    public final void mRULE_SL_NOTE() throws RecognitionException {
        try {
            int _type = RULE_SL_NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1812:14: ( '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalSysMLOC.g:1812:16: '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSysMLOC.g:1812:21: (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:1812:22: ~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSysMLOC.g:1812:37: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1812:37: ~ ( ( '\\n' | '\\r' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSysMLOC.g:1812:55: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSysMLOC.g:1812:56: ( '\\r' )? '\\n'
                    {
                    // InternalSysMLOC.g:1812:56: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSysMLOC.g:1812:56: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_NOTE"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:1814:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSysMLOC.g:1814:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSysMLOC.g:1814:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSysMLOC.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalSysMLOC.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS )
        int alt13=21;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalSysMLOC.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalSysMLOC.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalSysMLOC.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalSysMLOC.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalSysMLOC.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalSysMLOC.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalSysMLOC.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalSysMLOC.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalSysMLOC.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalSysMLOC.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalSysMLOC.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalSysMLOC.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalSysMLOC.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalSysMLOC.g:1:88: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 15 :
                // InternalSysMLOC.g:1:103: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalSysMLOC.g:1:111: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 17 :
                // InternalSysMLOC.g:1:134: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 18 :
                // InternalSysMLOC.g:1:152: RULE_REGULAR_COMMENT
                {
                mRULE_REGULAR_COMMENT(); 

                }
                break;
            case 19 :
                // InternalSysMLOC.g:1:173: RULE_ML_NOTE
                {
                mRULE_ML_NOTE(); 

                }
                break;
            case 20 :
                // InternalSysMLOC.g:1:186: RULE_SL_NOTE
                {
                mRULE_SL_NOTE(); 

                }
                break;
            case 21 :
                // InternalSysMLOC.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\1\12\2\uffff\3\12\7\uffff\7\12\1\uffff\1\42\6\12\1\51\1\52\1\12\1\42\1\uffff\4\12\1\64\1\12\2\uffff\1\12\1\42\1\uffff\2\42\4\12\1\uffff\2\12\1\70\1\uffff\1\77\3\12\1\103\1\12\1\uffff\1\105\1\12\1\107\1\uffff\1\12\1\uffff\1\12\1\uffff\1\12\1\113\1\114\2\uffff";
    static final String DFA13_eofS =
        "\115\uffff";
    static final String DFA13_minS =
        "\1\11\1\uffff\1\141\2\uffff\1\155\1\145\1\164\5\uffff\1\52\1\uffff\1\142\1\151\1\143\1\160\1\143\1\146\1\164\1\uffff\1\52\1\154\1\166\1\164\1\153\1\164\1\157\2\60\1\162\1\0\1\uffff\1\151\1\141\1\145\1\141\1\60\1\162\2\uffff\1\151\4\0\1\143\1\164\1\143\1\147\1\uffff\1\164\1\142\1\0\1\uffff\1\60\1\145\1\164\1\145\1\60\1\165\1\uffff\1\60\1\145\1\60\1\uffff\1\164\1\uffff\1\144\1\uffff\1\145\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\175\1\uffff\1\165\2\uffff\1\155\1\157\1\164\5\uffff\1\57\1\uffff\1\142\1\157\1\162\1\160\1\143\1\146\1\164\1\uffff\1\52\1\154\1\166\1\164\1\153\1\164\1\157\2\172\1\162\1\uffff\1\uffff\1\151\1\141\1\145\1\141\1\172\1\162\2\uffff\1\151\4\uffff\1\143\1\164\1\143\1\147\1\uffff\1\164\1\142\1\uffff\1\uffff\1\172\1\145\1\164\1\145\1\172\1\165\1\uffff\1\172\1\145\1\172\1\uffff\1\164\1\uffff\1\144\1\uffff\1\145\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\6\1\7\3\uffff\1\15\1\16\1\17\1\20\1\21\1\uffff\1\25\7\uffff\1\22\13\uffff\1\24\6\uffff\1\11\1\13\11\uffff\1\14\3\uffff\1\23\6\uffff\1\2\3\uffff\1\10\1\uffff\1\3\1\uffff\1\5\3\uffff\1\4\1\12";
    static final String DFA13_specialS =
        "\41\uffff\1\1\12\uffff\1\2\1\5\1\0\1\3\7\uffff\1\4\25\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\16\2\uffff\1\16\22\uffff\1\16\1\uffff\1\14\4\uffff\1\13\7\uffff\1\15\12\11\1\10\1\1\5\uffff\32\12\4\uffff\1\12\1\uffff\1\7\2\12\1\6\4\12\1\5\6\12\1\2\12\12\1\3\1\uffff\1\4",
            "",
            "\1\21\20\uffff\1\20\2\uffff\1\17",
            "",
            "",
            "\1\22",
            "\1\24\11\uffff\1\23",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\26\4\uffff\1\27",
            "",
            "\1\30",
            "\1\31\5\uffff\1\32",
            "\1\33\16\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\41",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\53",
            "\12\57\1\56\2\57\1\55\34\57\1\54\uffd5\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\65",
            "",
            "",
            "\1\66",
            "\12\57\1\56\2\57\1\55\34\57\1\54\4\57\1\67\uffd0\57",
            "\12\70\1\56\ufff5\70",
            "\0\70",
            "\12\57\1\56\2\57\1\55\34\57\1\54\uffd5\57",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\12\57\1\56\2\57\1\55\34\57\1\54\uffd5\57",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\104",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\106",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "\1\110",
            "",
            "\1\111",
            "",
            "\1\112",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_46 = input.LA(1);

                        s = -1;
                        if ( ((LA13_46>='\u0000' && LA13_46<='\uFFFF')) ) {s = 56;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( (LA13_33=='*') ) {s = 44;}

                        else if ( (LA13_33=='\r') ) {s = 45;}

                        else if ( (LA13_33=='\n') ) {s = 46;}

                        else if ( ((LA13_33>='\u0000' && LA13_33<='\t')||(LA13_33>='\u000B' && LA13_33<='\f')||(LA13_33>='\u000E' && LA13_33<=')')||(LA13_33>='+' && LA13_33<='\uFFFF')) ) {s = 47;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_44 = input.LA(1);

                        s = -1;
                        if ( (LA13_44=='/') ) {s = 55;}

                        else if ( (LA13_44=='*') ) {s = 44;}

                        else if ( (LA13_44=='\r') ) {s = 45;}

                        else if ( (LA13_44=='\n') ) {s = 46;}

                        else if ( ((LA13_44>='\u0000' && LA13_44<='\t')||(LA13_44>='\u000B' && LA13_44<='\f')||(LA13_44>='\u000E' && LA13_44<=')')||(LA13_44>='+' && LA13_44<='.')||(LA13_44>='0' && LA13_44<='\uFFFF')) ) {s = 47;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_47 = input.LA(1);

                        s = -1;
                        if ( (LA13_47=='*') ) {s = 44;}

                        else if ( (LA13_47=='\r') ) {s = 45;}

                        else if ( (LA13_47=='\n') ) {s = 46;}

                        else if ( ((LA13_47>='\u0000' && LA13_47<='\t')||(LA13_47>='\u000B' && LA13_47<='\f')||(LA13_47>='\u000E' && LA13_47<=')')||(LA13_47>='+' && LA13_47<='\uFFFF')) ) {s = 47;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_55 = input.LA(1);

                        s = -1;
                        if ( (LA13_55=='*') ) {s = 44;}

                        else if ( (LA13_55=='\r') ) {s = 45;}

                        else if ( (LA13_55=='\n') ) {s = 46;}

                        else if ( ((LA13_55>='\u0000' && LA13_55<='\t')||(LA13_55>='\u000B' && LA13_55<='\f')||(LA13_55>='\u000E' && LA13_55<=')')||(LA13_55>='+' && LA13_55<='\uFFFF')) ) {s = 47;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_45 = input.LA(1);

                        s = -1;
                        if ( ((LA13_45>='\u0000' && LA13_45<='\t')||(LA13_45>='\u000B' && LA13_45<='\uFFFF')) ) {s = 56;}

                        else if ( (LA13_45=='\n') ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}