package dut.control.sysmloc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSysMLOCLexer extends Lexer {
    public static final int RULE_REGULAR_COMMENT=9;
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
    public static final int RULE_DECIMAL_VALUE=5;
    public static final int RULE_UNRESTRICTED_NAME=7;
    public static final int RULE_STRING_VALUE=8;
    public static final int RULE_ML_NOTE=10;
    public static final int RULE_EXP_VALUE=6;

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
            // InternalSysMLOC.g:11:7: ( 'datatype' )
            // InternalSysMLOC.g:11:9: 'datatype'
            {
            match("datatype"); 


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
            // InternalSysMLOC.g:12:7: ( 'entity' )
            // InternalSysMLOC.g:12:9: 'entity'
            {
            match("entity"); 


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
            // InternalSysMLOC.g:13:7: ( 'extends' )
            // InternalSysMLOC.g:13:9: 'extends'
            {
            match("extends"); 


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
            // InternalSysMLOC.g:14:7: ( '{' )
            // InternalSysMLOC.g:14:9: '{'
            {
            match('{'); 

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
            // InternalSysMLOC.g:15:7: ( '}' )
            // InternalSysMLOC.g:15:9: '}'
            {
            match('}'); 

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
            // InternalSysMLOC.g:16:7: ( 'many' )
            // InternalSysMLOC.g:16:9: 'many'
            {
            match("many"); 


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
            // InternalSysMLOC.g:17:7: ( ':' )
            // InternalSysMLOC.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_DECIMAL_VALUE"
    public final void mRULE_DECIMAL_VALUE() throws RecognitionException {
        try {
            // InternalSysMLOC.g:331:29: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalSysMLOC.g:331:31: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalSysMLOC.g:331:40: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSysMLOC.g:331:41: '0' .. '9'
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
            // InternalSysMLOC.g:333:16: ( RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:333:18: RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE
            {
            mRULE_DECIMAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSysMLOC.g:333:47: ( '+' | '-' )?
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
            // InternalSysMLOC.g:335:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSysMLOC.g:335:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSysMLOC.g:335:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalSysMLOC.g:337:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalSysMLOC.g:337:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalSysMLOC.g:337:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalSysMLOC.g:337:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSysMLOC.g:337:73: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSysMLOC.g:339:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSysMLOC.g:339:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSysMLOC.g:339:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalSysMLOC.g:339:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSysMLOC.g:339:67: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalSysMLOC.g:341:22: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSysMLOC.g:341:24: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSysMLOC.g:341:29: ( options {greedy=false; } : . )*
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
            	    // InternalSysMLOC.g:341:57: .
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
            // InternalSysMLOC.g:343:14: ( '//*' ( options {greedy=false; } : . )* '*/' )
            // InternalSysMLOC.g:343:16: '//*' ( options {greedy=false; } : . )* '*/'
            {
            match("//*"); 

            // InternalSysMLOC.g:343:22: ( options {greedy=false; } : . )*
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
            	    // InternalSysMLOC.g:343:50: .
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
            // InternalSysMLOC.g:345:14: ( '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalSysMLOC.g:345:16: '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSysMLOC.g:345:21: (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:345:22: ~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSysMLOC.g:345:37: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSysMLOC.g:345:37: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSysMLOC.g:345:55: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSysMLOC.g:345:56: ( '\\r' )? '\\n'
                    {
                    // InternalSysMLOC.g:345:56: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSysMLOC.g:345:56: '\\r'
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
            // InternalSysMLOC.g:347:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSysMLOC.g:347:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSysMLOC.g:347:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // InternalSysMLOC.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS )
        int alt13=15;
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
                // InternalSysMLOC.g:1:52: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 9 :
                // InternalSysMLOC.g:1:67: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // InternalSysMLOC.g:1:75: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 11 :
                // InternalSysMLOC.g:1:98: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 12 :
                // InternalSysMLOC.g:1:116: RULE_REGULAR_COMMENT
                {
                mRULE_REGULAR_COMMENT(); 

                }
                break;
            case 13 :
                // InternalSysMLOC.g:1:137: RULE_ML_NOTE
                {
                mRULE_ML_NOTE(); 

                }
                break;
            case 14 :
                // InternalSysMLOC.g:1:150: RULE_SL_NOTE
                {
                mRULE_SL_NOTE(); 

                }
                break;
            case 15 :
                // InternalSysMLOC.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\10\2\uffff\1\10\7\uffff\4\10\1\uffff\1\30\4\10\1\30\1\uffff\3\10\1\44\1\30\1\uffff\2\30\3\10\1\uffff\1\46\1\uffff\1\10\1\53\2\10\1\uffff\1\56\1\57\2\uffff";
    static final String DFA13_eofS =
        "\60\uffff";
    static final String DFA13_minS =
        "\1\11\1\141\1\156\2\uffff\1\141\5\uffff\1\52\1\uffff\3\164\1\156\1\uffff\1\52\1\141\1\151\1\145\1\171\1\0\1\uffff\2\164\1\156\1\60\4\0\2\171\1\144\1\uffff\1\0\1\uffff\1\160\1\60\1\163\1\145\1\uffff\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\175\1\141\1\170\2\uffff\1\141\5\uffff\1\57\1\uffff\3\164\1\156\1\uffff\1\52\1\141\1\151\1\145\1\171\1\uffff\1\uffff\2\164\1\156\1\172\4\uffff\2\171\1\144\1\uffff\1\uffff\1\uffff\1\160\1\172\1\163\1\145\1\uffff\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff\1\17\4\uffff\1\14\6\uffff\1\16\13\uffff\1\6\1\uffff\1\15\4\uffff\1\2\2\uffff\1\3\1\1";
    static final String DFA13_specialS =
        "\27\uffff\1\0\5\uffff\1\3\1\5\1\4\1\1\4\uffff\1\2\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\1\uffff\1\12\4\uffff\1\11\7\uffff\1\13\12\7\1\6\6\uffff\32\10\4\uffff\1\10\1\uffff\3\10\1\1\1\2\7\10\1\5\15\10\1\3\1\uffff\1\4",
            "\1\15",
            "\1\16\11\uffff\1\17",
            "",
            "",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\21\4\uffff\1\22",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "\1\27",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\12\40\1\37\2\40\1\36\34\40\1\35\uffd5\40",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\12\40\1\37\2\40\1\36\34\40\1\35\4\40\1\45\uffd0\40",
            "\12\46\1\37\ufff5\46",
            "\0\46",
            "\12\40\1\37\2\40\1\36\34\40\1\35\uffd5\40",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\12\40\1\37\2\40\1\36\34\40\1\35\uffd5\40",
            "",
            "\1\52",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\1\54",
            "\1\55",
            "",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
            "\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( (LA13_23=='*') ) {s = 29;}

                        else if ( (LA13_23=='\r') ) {s = 30;}

                        else if ( (LA13_23=='\n') ) {s = 31;}

                        else if ( ((LA13_23>='\u0000' && LA13_23<='\t')||(LA13_23>='\u000B' && LA13_23<='\f')||(LA13_23>='\u000E' && LA13_23<=')')||(LA13_23>='+' && LA13_23<='\uFFFF')) ) {s = 32;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( (LA13_32=='*') ) {s = 29;}

                        else if ( (LA13_32=='\r') ) {s = 30;}

                        else if ( (LA13_32=='\n') ) {s = 31;}

                        else if ( ((LA13_32>='\u0000' && LA13_32<='\t')||(LA13_32>='\u000B' && LA13_32<='\f')||(LA13_32>='\u000E' && LA13_32<=')')||(LA13_32>='+' && LA13_32<='\uFFFF')) ) {s = 32;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( (LA13_37=='*') ) {s = 29;}

                        else if ( (LA13_37=='\r') ) {s = 30;}

                        else if ( (LA13_37=='\n') ) {s = 31;}

                        else if ( ((LA13_37>='\u0000' && LA13_37<='\t')||(LA13_37>='\u000B' && LA13_37<='\f')||(LA13_37>='\u000E' && LA13_37<=')')||(LA13_37>='+' && LA13_37<='\uFFFF')) ) {s = 32;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_29 = input.LA(1);

                        s = -1;
                        if ( (LA13_29=='/') ) {s = 37;}

                        else if ( (LA13_29=='*') ) {s = 29;}

                        else if ( (LA13_29=='\r') ) {s = 30;}

                        else if ( (LA13_29=='\n') ) {s = 31;}

                        else if ( ((LA13_29>='\u0000' && LA13_29<='\t')||(LA13_29>='\u000B' && LA13_29<='\f')||(LA13_29>='\u000E' && LA13_29<=')')||(LA13_29>='+' && LA13_29<='.')||(LA13_29>='0' && LA13_29<='\uFFFF')) ) {s = 32;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_31 = input.LA(1);

                        s = -1;
                        if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFF')) ) {s = 38;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_30 = input.LA(1);

                        s = -1;
                        if ( ((LA13_30>='\u0000' && LA13_30<='\t')||(LA13_30>='\u000B' && LA13_30<='\uFFFF')) ) {s = 38;}

                        else if ( (LA13_30=='\n') ) {s = 31;}

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