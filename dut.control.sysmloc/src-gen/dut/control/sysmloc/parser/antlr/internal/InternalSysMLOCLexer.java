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
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=13;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_DECIMAL_VALUE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_ML_NOTE=12;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_REGULAR_COMMENT=4;
    public static final int T__72=72;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_OPERATOR=8;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=14;
    public static final int RULE_UNRESTRICTED_NAME=7;
    public static final int RULE_NORMAL_VALUE=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=11;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_EXP_VALUE=10;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:11:7: ( 'package' )
            // InternalSysMLOC.g:11:9: 'package'
            {
            match("package"); 


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
            // InternalSysMLOC.g:12:7: ( '{' )
            // InternalSysMLOC.g:12:9: '{'
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
            // InternalSysMLOC.g:13:7: ( '}' )
            // InternalSysMLOC.g:13:9: '}'
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
            // InternalSysMLOC.g:14:7: ( 'import' )
            // InternalSysMLOC.g:14:9: 'import'
            {
            match("import"); 


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
            // InternalSysMLOC.g:15:7: ( '::' )
            // InternalSysMLOC.g:15:9: '::'
            {
            match("::"); 


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
            // InternalSysMLOC.g:16:7: ( '*' )
            // InternalSysMLOC.g:16:9: '*'
            {
            match('*'); 

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
            // InternalSysMLOC.g:17:7: ( '**' )
            // InternalSysMLOC.g:17:9: '**'
            {
            match("**"); 


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
            // InternalSysMLOC.g:18:7: ( ';' )
            // InternalSysMLOC.g:18:9: ';'
            {
            match(';'); 

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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:22:7: ( 'item' )
            // InternalSysMLOC.g:22:9: 'item'
            {
            match("item"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:23:7: ( 'part' )
            // InternalSysMLOC.g:23:9: 'part'
            {
            match("part"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:24:7: ( 'port' )
            // InternalSysMLOC.g:24:9: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:25:7: ( 'connection' )
            // InternalSysMLOC.g:25:9: 'connection'
            {
            match("connection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:26:7: ( 'connect' )
            // InternalSysMLOC.g:26:9: 'connect'
            {
            match("connect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:27:7: ( 'interface' )
            // InternalSysMLOC.g:27:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:28:7: ( 'flow' )
            // InternalSysMLOC.g:28:9: 'flow'
            {
            match("flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:29:7: ( 'of' )
            // InternalSysMLOC.g:29:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:30:7: ( 'from' )
            // InternalSysMLOC.g:30:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:31:7: ( 'to' )
            // InternalSysMLOC.g:31:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:32:7: ( 'action' )
            // InternalSysMLOC.g:32:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:33:7: ( 'end' )
            // InternalSysMLOC.g:33:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:34:7: ( 'individual' )
            // InternalSysMLOC.g:34:9: 'individual'
            {
            match("individual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:35:7: ( 'abstract' )
            // InternalSysMLOC.g:35:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:36:7: ( 'variation' )
            // InternalSysMLOC.g:36:9: 'variation'
            {
            match("variation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:37:7: ( 'readonly' )
            // InternalSysMLOC.g:37:9: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:38:7: ( 'derived' )
            // InternalSysMLOC.g:38:9: 'derived'
            {
            match("derived"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:39:7: ( 'ref' )
            // InternalSysMLOC.g:39:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:40:7: ( '(' )
            // InternalSysMLOC.g:40:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:41:7: ( ',' )
            // InternalSysMLOC.g:41:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:42:7: ( ')' )
            // InternalSysMLOC.g:42:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:43:7: ( ':' )
            // InternalSysMLOC.g:43:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:44:7: ( ':>' )
            // InternalSysMLOC.g:44:9: ':>'
            {
            match(":>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:45:7: ( 'specializes' )
            // InternalSysMLOC.g:45:9: 'specializes'
            {
            match("specializes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:46:7: ( '=' )
            // InternalSysMLOC.g:46:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:47:7: ( ':=' )
            // InternalSysMLOC.g:47:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:48:7: ( 'default' )
            // InternalSysMLOC.g:48:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:49:7: ( '[' )
            // InternalSysMLOC.g:49:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:50:7: ( ']' )
            // InternalSysMLOC.g:50:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:51:7: ( '..' )
            // InternalSysMLOC.g:51:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:52:7: ( 'ordered' )
            // InternalSysMLOC.g:52:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:53:7: ( 'nonunique' )
            // InternalSysMLOC.g:53:9: 'nonunique'
            {
            match("nonunique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:54:7: ( 'defined' )
            // InternalSysMLOC.g:54:9: 'defined'
            {
            match("defined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:55:7: ( 'by' )
            // InternalSysMLOC.g:55:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:56:7: ( 'subsets' )
            // InternalSysMLOC.g:56:9: 'subsets'
            {
            match("subsets"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:57:7: ( '::>' )
            // InternalSysMLOC.g:57:9: '::>'
            {
            match("::>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:58:7: ( 'references' )
            // InternalSysMLOC.g:58:9: 'references'
            {
            match("references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:59:7: ( '=>' )
            // InternalSysMLOC.g:59:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:60:7: ( 'crosses' )
            // InternalSysMLOC.g:60:9: 'crosses'
            {
            match("crosses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:61:7: ( ':>>' )
            // InternalSysMLOC.g:61:9: ':>>'
            {
            match(":>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:62:7: ( 'redefines' )
            // InternalSysMLOC.g:62:9: 'redefines'
            {
            match("redefines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:63:7: ( '~' )
            // InternalSysMLOC.g:63:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:64:7: ( '.' )
            // InternalSysMLOC.g:64:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:65:7: ( 'public' )
            // InternalSysMLOC.g:65:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:66:7: ( 'private' )
            // InternalSysMLOC.g:66:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:67:7: ( 'protected' )
            // InternalSysMLOC.g:67:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:68:7: ( 'in' )
            // InternalSysMLOC.g:68:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:69:7: ( 'out' )
            // InternalSysMLOC.g:69:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:70:7: ( 'inout' )
            // InternalSysMLOC.g:70:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:71:7: ( 'snapshot' )
            // InternalSysMLOC.g:71:9: 'snapshot'
            {
            match("snapshot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:72:7: ( 'timeslice' )
            // InternalSysMLOC.g:72:9: 'timeslice'
            {
            match("timeslice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:3839:15: ( ( 'if' | '??' | 'implies' | '|' | 'or' | 'xor' | '&' | 'and' | '==' | '!=' | '===' | '!==' | 'hastype' | 'istype' | '@' | '@@' | 'as' | 'meta' | '<' | '>' | '<=' | '>=' | '+' | '-' | '*' | '/' | '%' | '..' | '**' | '^' | '~' | 'not' | 'true' | 'false' ) )
            // InternalSysMLOC.g:3839:17: ( 'if' | '??' | 'implies' | '|' | 'or' | 'xor' | '&' | 'and' | '==' | '!=' | '===' | '!==' | 'hastype' | 'istype' | '@' | '@@' | 'as' | 'meta' | '<' | '>' | '<=' | '>=' | '+' | '-' | '*' | '/' | '%' | '..' | '**' | '^' | '~' | 'not' | 'true' | 'false' )
            {
            // InternalSysMLOC.g:3839:17: ( 'if' | '??' | 'implies' | '|' | 'or' | 'xor' | '&' | 'and' | '==' | '!=' | '===' | '!==' | 'hastype' | 'istype' | '@' | '@@' | 'as' | 'meta' | '<' | '>' | '<=' | '>=' | '+' | '-' | '*' | '/' | '%' | '..' | '**' | '^' | '~' | 'not' | 'true' | 'false' )
            int alt1=34;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSysMLOC.g:3839:18: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3839:23: '??'
                    {
                    match("??"); 


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:3839:28: 'implies'
                    {
                    match("implies"); 


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:3839:38: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:3839:42: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:3839:47: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 7 :
                    // InternalSysMLOC.g:3839:53: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 8 :
                    // InternalSysMLOC.g:3839:57: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 9 :
                    // InternalSysMLOC.g:3839:63: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 10 :
                    // InternalSysMLOC.g:3839:68: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 11 :
                    // InternalSysMLOC.g:3839:73: '==='
                    {
                    match("==="); 


                    }
                    break;
                case 12 :
                    // InternalSysMLOC.g:3839:79: '!=='
                    {
                    match("!=="); 


                    }
                    break;
                case 13 :
                    // InternalSysMLOC.g:3839:85: 'hastype'
                    {
                    match("hastype"); 


                    }
                    break;
                case 14 :
                    // InternalSysMLOC.g:3839:95: 'istype'
                    {
                    match("istype"); 


                    }
                    break;
                case 15 :
                    // InternalSysMLOC.g:3839:104: '@'
                    {
                    match('@'); 

                    }
                    break;
                case 16 :
                    // InternalSysMLOC.g:3839:108: '@@'
                    {
                    match("@@"); 


                    }
                    break;
                case 17 :
                    // InternalSysMLOC.g:3839:113: 'as'
                    {
                    match("as"); 


                    }
                    break;
                case 18 :
                    // InternalSysMLOC.g:3839:118: 'meta'
                    {
                    match("meta"); 


                    }
                    break;
                case 19 :
                    // InternalSysMLOC.g:3839:125: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 20 :
                    // InternalSysMLOC.g:3839:129: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 21 :
                    // InternalSysMLOC.g:3839:133: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 22 :
                    // InternalSysMLOC.g:3839:138: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 23 :
                    // InternalSysMLOC.g:3839:143: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 24 :
                    // InternalSysMLOC.g:3839:147: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 25 :
                    // InternalSysMLOC.g:3839:151: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 26 :
                    // InternalSysMLOC.g:3839:155: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 27 :
                    // InternalSysMLOC.g:3839:159: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 28 :
                    // InternalSysMLOC.g:3839:163: '..'
                    {
                    match(".."); 


                    }
                    break;
                case 29 :
                    // InternalSysMLOC.g:3839:168: '**'
                    {
                    match("**"); 


                    }
                    break;
                case 30 :
                    // InternalSysMLOC.g:3839:173: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 31 :
                    // InternalSysMLOC.g:3839:177: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 32 :
                    // InternalSysMLOC.g:3839:181: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 33 :
                    // InternalSysMLOC.g:3839:187: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 34 :
                    // InternalSysMLOC.g:3839:194: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_DECIMAL_VALUE"
    public final void mRULE_DECIMAL_VALUE() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:3841:20: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalSysMLOC.g:3841:22: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalSysMLOC.g:3841:31: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:3841:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_VALUE"

    // $ANTLR start "RULE_NORMAL_VALUE"
    public final void mRULE_NORMAL_VALUE() throws RecognitionException {
        try {
            // InternalSysMLOC.g:3843:28: ( RULE_DECIMAL_VALUE ( '.' RULE_DECIMAL_VALUE )? )
            // InternalSysMLOC.g:3843:30: RULE_DECIMAL_VALUE ( '.' RULE_DECIMAL_VALUE )?
            {
            mRULE_DECIMAL_VALUE(); 
            // InternalSysMLOC.g:3843:49: ( '.' RULE_DECIMAL_VALUE )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSysMLOC.g:3843:50: '.' RULE_DECIMAL_VALUE
                    {
                    match('.'); 
                    mRULE_DECIMAL_VALUE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NORMAL_VALUE"

    // $ANTLR start "RULE_EXP_VALUE"
    public final void mRULE_EXP_VALUE() throws RecognitionException {
        try {
            int _type = RULE_EXP_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSysMLOC.g:3845:16: ( RULE_NORMAL_VALUE ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE )? )
            // InternalSysMLOC.g:3845:18: RULE_NORMAL_VALUE ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE )?
            {
            mRULE_NORMAL_VALUE(); 
            // InternalSysMLOC.g:3845:36: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='E'||LA5_0=='e') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSysMLOC.g:3845:37: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSysMLOC.g:3845:47: ( '+' | '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
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
                    break;

            }


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
            // InternalSysMLOC.g:3847:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSysMLOC.g:3847:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSysMLOC.g:3847:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // InternalSysMLOC.g:3849:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalSysMLOC.g:3849:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalSysMLOC.g:3849:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSysMLOC.g:3849:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSysMLOC.g:3849:73: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop7;
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
            // InternalSysMLOC.g:3851:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSysMLOC.g:3851:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSysMLOC.g:3851:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSysMLOC.g:3851:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSysMLOC.g:3851:67: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop8;
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
            // InternalSysMLOC.g:3853:22: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSysMLOC.g:3853:24: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSysMLOC.g:3853:29: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSysMLOC.g:3853:57: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalSysMLOC.g:3855:14: ( '//*' ( options {greedy=false; } : . )* '*/' )
            // InternalSysMLOC.g:3855:16: '//*' ( options {greedy=false; } : . )* '*/'
            {
            match("//*"); 

            // InternalSysMLOC.g:3855:22: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSysMLOC.g:3855:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalSysMLOC.g:3857:14: ( '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalSysMLOC.g:3857:16: '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSysMLOC.g:3857:21: (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSysMLOC.g:3857:22: ~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSysMLOC.g:3857:37: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3857:37: ~ ( ( '\\n' | '\\r' ) )
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSysMLOC.g:3857:55: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSysMLOC.g:3857:56: ( '\\r' )? '\\n'
                    {
                    // InternalSysMLOC.g:3857:56: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSysMLOC.g:3857:56: '\\r'
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
            // InternalSysMLOC.g:3859:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSysMLOC.g:3859:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSysMLOC.g:3859:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
        // InternalSysMLOC.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_OPERATOR | RULE_DECIMAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS )
        int alt16=72;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalSysMLOC.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalSysMLOC.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalSysMLOC.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalSysMLOC.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalSysMLOC.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalSysMLOC.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalSysMLOC.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalSysMLOC.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalSysMLOC.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalSysMLOC.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalSysMLOC.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalSysMLOC.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalSysMLOC.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalSysMLOC.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalSysMLOC.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalSysMLOC.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalSysMLOC.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalSysMLOC.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalSysMLOC.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalSysMLOC.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalSysMLOC.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalSysMLOC.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalSysMLOC.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalSysMLOC.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalSysMLOC.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalSysMLOC.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalSysMLOC.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalSysMLOC.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalSysMLOC.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalSysMLOC.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalSysMLOC.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalSysMLOC.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalSysMLOC.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalSysMLOC.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalSysMLOC.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalSysMLOC.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalSysMLOC.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalSysMLOC.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalSysMLOC.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalSysMLOC.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalSysMLOC.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalSysMLOC.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalSysMLOC.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalSysMLOC.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalSysMLOC.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalSysMLOC.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalSysMLOC.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalSysMLOC.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalSysMLOC.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalSysMLOC.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalSysMLOC.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalSysMLOC.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalSysMLOC.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalSysMLOC.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalSysMLOC.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalSysMLOC.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalSysMLOC.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalSysMLOC.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalSysMLOC.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalSysMLOC.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalSysMLOC.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalSysMLOC.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalSysMLOC.g:1:382: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 64 :
                // InternalSysMLOC.g:1:396: RULE_DECIMAL_VALUE
                {
                mRULE_DECIMAL_VALUE(); 

                }
                break;
            case 65 :
                // InternalSysMLOC.g:1:415: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 66 :
                // InternalSysMLOC.g:1:430: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 67 :
                // InternalSysMLOC.g:1:438: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 68 :
                // InternalSysMLOC.g:1:461: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 69 :
                // InternalSysMLOC.g:1:479: RULE_REGULAR_COMMENT
                {
                mRULE_REGULAR_COMMENT(); 

                }
                break;
            case 70 :
                // InternalSysMLOC.g:1:500: RULE_ML_NOTE
                {
                mRULE_ML_NOTE(); 

                }
                break;
            case 71 :
                // InternalSysMLOC.g:1:513: RULE_SL_NOTE
                {
                mRULE_SL_NOTE(); 

                }
                break;
            case 72 :
                // InternalSysMLOC.g:1:526: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\13\uffff\1\42\1\uffff\1\44\1\46\2\uffff\1\50\15\uffff\1\52\1\54\14\uffff";
    static final String DFA1_eofS =
        "\55\uffff";
    static final String DFA1_minS =
        "\1\41\1\146\5\uffff\1\156\2\75\1\uffff\1\100\1\uffff\2\75\2\uffff\1\52\15\uffff\2\75\14\uffff";
    static final String DFA1_maxS =
        "\1\176\1\163\5\uffff\1\163\2\75\1\uffff\1\100\1\uffff\2\75\2\uffff\1\52\15\uffff\2\75\14\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\3\uffff\1\15\1\uffff\1\22\2\uffff\1\27\1\30\1\uffff\1\32\1\33\1\34\1\36\1\37\1\40\1\41\1\42\1\1\1\3\1\16\1\10\1\21\2\uffff\1\20\1\17\1\25\1\23\1\26\1\24\1\35\1\31\1\13\1\11\1\14\1\12";
    static final String DFA1_specialS =
        "\55\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\11\3\uffff\1\23\1\6\3\uffff\1\21\1\17\1\uffff\1\20\1\24\1\22\14\uffff\1\15\1\10\1\16\1\2\1\13\35\uffff\1\25\2\uffff\1\7\4\uffff\1\31\1\uffff\1\12\1\1\3\uffff\1\14\1\27\1\4\4\uffff\1\30\3\uffff\1\5\3\uffff\1\3\1\uffff\1\26",
            "\1\32\6\uffff\1\33\5\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "\1\35\4\uffff\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\41",
            "",
            "\1\43",
            "\1\45",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "3839:17: ( 'if' | '??' | 'implies' | '|' | 'or' | 'xor' | '&' | 'and' | '==' | '!=' | '===' | '!==' | 'hastype' | 'istype' | '@' | '@@' | 'as' | 'meta' | '<' | '>' | '<=' | '>=' | '+' | '-' | '*' | '/' | '%' | '..' | '**' | '^' | '~' | 'not' | 'true' | 'false' )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\42\2\uffff\1\42\1\62\1\64\1\uffff\11\42\3\uffff\1\42\1\116\2\uffff\1\120\2\42\2\uffff\3\42\1\34\1\132\4\uffff\6\42\1\147\1\34\1\42\1\152\1\154\4\uffff\6\42\1\34\5\42\1\172\1\34\1\42\1\175\10\42\4\uffff\1\42\1\u008b\1\uffff\3\42\1\uffff\1\u0090\1\132\2\uffff\13\42\1\uffff\1\42\5\uffff\1\u009e\1\u00a1\4\42\1\34\5\42\1\uffff\1\42\1\u00ac\1\uffff\2\42\1\u00af\2\42\1\u00b3\4\42\1\uffff\1\42\1\34\1\uffff\1\34\2\42\1\u0090\1\uffff\1\42\1\u00c0\1\u00c1\5\42\1\u00c7\4\42\1\uffff\2\42\1\uffff\6\42\1\u00d4\1\u00d5\2\42\1\uffff\1\42\1\34\1\uffff\3\42\1\uffff\6\42\1\34\1\u0090\1\uffff\2\u0090\1\42\2\uffff\5\42\1\uffff\2\42\1\u00ec\11\42\2\uffff\1\34\13\42\1\u00e3\1\uffff\1\42\1\u0102\2\42\1\u0105\3\42\1\uffff\1\34\4\42\1\u010d\16\42\1\u011c\1\uffff\1\u011d\1\42\1\uffff\1\34\2\42\1\u0121\1\u0122\1\u0123\1\42\1\uffff\1\42\1\u0127\1\u0128\1\u0129\6\42\1\u0130\2\42\1\34\2\uffff\3\42\3\uffff\1\42\1\u0137\1\42\3\uffff\2\42\1\u013b\3\42\1\uffff\1\u013f\1\42\1\u0141\1\u0142\1\42\1\u0144\1\uffff\1\42\1\u0146\1\u0147\1\uffff\1\42\1\u0149\1\42\1\uffff\1\u014b\2\uffff\1\u014c\1\uffff\1\u014d\2\uffff\1\u014e\1\uffff\1\42\4\uffff\1\u0150\1\uffff";
    static final String DFA16_eofS =
        "\u0151\uffff";
    static final String DFA16_minS =
        "\1\11\1\141\2\uffff\1\146\1\72\1\52\1\uffff\1\145\1\142\1\157\1\141\1\146\1\151\1\156\1\141\1\145\3\uffff\1\156\1\75\2\uffff\1\56\1\157\1\171\2\uffff\1\157\1\141\1\145\1\52\1\56\4\uffff\1\143\1\162\1\142\1\151\1\160\1\145\2\60\1\164\2\76\4\uffff\1\143\1\146\2\164\1\163\1\144\1\60\1\156\3\157\1\154\2\60\1\164\1\60\1\155\1\165\1\144\1\162\1\141\1\145\1\142\1\141\4\uffff\1\156\1\60\1\uffff\1\162\1\163\1\164\1\uffff\1\52\1\56\2\uffff\1\153\2\164\1\154\1\166\1\164\1\154\1\155\1\145\1\151\1\165\1\uffff\1\171\5\uffff\2\60\1\151\1\162\1\151\1\164\1\60\1\156\1\163\1\167\1\155\1\163\1\uffff\1\145\1\60\1\uffff\2\145\1\60\1\151\1\144\1\60\1\145\1\143\1\163\1\160\1\uffff\1\165\1\60\1\uffff\1\60\1\164\1\141\1\0\1\uffff\1\141\2\60\1\151\1\141\1\145\1\162\1\151\1\60\1\162\1\166\1\164\1\160\1\uffff\1\165\1\156\1\uffff\1\166\1\151\1\157\1\162\1\145\1\163\2\60\1\145\1\162\1\uffff\1\163\1\60\1\uffff\1\141\1\157\1\162\1\uffff\1\146\1\151\1\145\1\163\1\156\1\171\1\60\4\0\1\147\2\uffff\1\143\1\164\1\143\1\164\1\145\1\uffff\1\146\1\151\1\60\1\145\1\154\2\145\1\142\1\156\1\141\1\143\1\145\2\uffff\1\60\1\145\1\154\1\164\1\156\1\145\1\151\1\141\1\164\1\150\1\151\1\160\1\0\1\uffff\1\145\1\60\1\145\1\164\1\60\1\163\1\141\1\144\1\uffff\1\60\1\164\2\144\1\165\1\60\1\143\1\164\1\163\1\144\2\151\1\154\2\156\1\154\1\163\1\157\1\161\1\145\1\60\1\uffff\1\60\1\145\1\uffff\1\60\1\143\1\165\3\60\1\164\1\uffff\1\164\3\60\1\143\1\157\1\171\1\143\1\145\1\151\1\60\1\164\1\165\1\60\2\uffff\1\144\1\145\1\141\3\uffff\1\145\1\60\1\157\3\uffff\1\145\1\156\1\60\1\145\1\163\1\172\1\uffff\1\60\1\145\2\60\1\154\1\60\1\uffff\1\156\2\60\1\uffff\1\163\1\60\1\145\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\163\4\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\176\1\165\2\uffff\1\164\1\76\1\52\1\uffff\1\157\1\164\2\162\1\165\1\162\1\156\1\141\1\145\3\uffff\1\165\1\76\2\uffff\1\56\1\157\1\171\2\uffff\1\157\1\141\1\145\1\57\1\145\4\uffff\2\162\1\142\1\157\1\160\1\145\2\172\1\164\2\76\4\uffff\1\143\1\162\2\164\1\163\1\144\1\172\1\156\3\157\1\154\2\172\1\164\1\172\1\155\1\165\1\144\1\162\1\146\1\145\1\142\1\141\4\uffff\1\164\1\172\1\uffff\1\162\1\163\1\164\1\uffff\1\52\1\145\2\uffff\1\153\2\164\1\154\1\166\1\164\1\157\1\155\1\145\1\151\1\165\1\uffff\1\171\5\uffff\2\172\1\151\1\162\1\151\1\164\1\172\1\156\1\163\1\167\1\155\1\163\1\uffff\1\145\1\172\1\uffff\2\145\1\172\1\151\1\144\1\172\1\145\1\143\1\163\1\160\1\uffff\1\165\1\172\1\uffff\1\172\1\164\1\141\1\uffff\1\uffff\1\141\2\172\1\151\1\141\1\145\1\162\1\151\1\172\1\162\1\166\1\164\1\160\1\uffff\1\165\1\156\1\uffff\1\166\1\151\1\157\1\162\1\145\1\163\2\172\1\145\1\162\1\uffff\1\163\1\172\1\uffff\1\141\1\157\1\162\1\uffff\1\146\1\151\1\145\1\163\1\156\1\171\1\172\4\uffff\1\147\2\uffff\1\143\1\164\1\143\1\164\1\145\1\uffff\1\146\1\151\1\172\1\145\1\154\2\145\1\142\1\156\1\141\1\143\1\145\2\uffff\1\172\1\145\1\154\1\164\1\156\1\145\1\151\1\141\1\164\1\150\1\151\1\160\1\uffff\1\uffff\1\145\1\172\1\145\1\164\1\172\1\163\1\141\1\144\1\uffff\1\172\1\164\2\144\1\165\1\172\1\143\1\164\1\163\1\144\2\151\1\154\2\156\1\154\1\163\1\157\1\161\1\145\1\172\1\uffff\1\172\1\145\1\uffff\1\172\1\143\1\165\3\172\1\164\1\uffff\1\164\3\172\1\143\1\157\1\171\1\143\1\145\1\151\1\172\1\164\1\165\1\172\2\uffff\1\144\1\145\1\141\3\uffff\1\145\1\172\1\157\3\uffff\1\145\1\156\1\172\1\145\1\163\1\172\1\uffff\1\172\1\145\2\172\1\154\1\172\1\uffff\1\156\2\172\1\uffff\1\163\1\172\1\145\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\163\4\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\10\11\uffff\1\36\1\37\1\40\2\uffff\1\47\1\50\3\uffff\1\65\1\77\5\uffff\1\102\1\103\1\104\1\110\13\uffff\1\45\1\41\1\7\1\6\30\uffff\1\61\1\44\1\51\1\66\2\uffff\1\65\3\uffff\1\105\2\uffff\1\100\1\101\13\uffff\1\72\1\uffff\1\57\1\5\1\63\1\42\1\7\14\uffff\1\23\2\uffff\1\25\12\uffff\1\51\2\uffff\1\55\4\uffff\1\107\15\uffff\1\11\2\uffff\1\13\12\uffff\1\73\2\uffff\1\27\3\uffff\1\35\14\uffff\1\15\1\16\5\uffff\1\14\14\uffff\1\22\1\24\15\uffff\1\106\10\uffff\1\74\25\uffff\1\67\2\uffff\1\4\7\uffff\1\26\16\uffff\1\1\1\70\3\uffff\1\46\1\54\1\34\3\uffff\1\20\1\62\1\52\6\uffff\1\56\6\uffff\1\31\3\uffff\1\33\3\uffff\1\75\1\uffff\1\71\1\21\1\uffff\1\12\1\uffff\1\76\1\32\1\uffff\1\64\1\uffff\1\53\1\30\1\17\1\60\1\uffff\1\43";
    static final String DFA16_specialS =
        "\u008f\uffff\1\3\53\uffff\1\0\1\4\1\5\1\2\43\uffff\1\1\156\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\34\1\44\2\uffff\2\34\1\43\1\21\1\23\1\6\1\34\1\22\1\34\1\30\1\40\12\41\1\5\1\7\1\34\1\25\3\34\32\42\1\26\1\uffff\1\27\1\34\1\42\1\uffff\1\11\1\32\1\12\1\10\1\16\1\13\1\42\1\36\1\4\3\42\1\37\1\31\1\14\1\1\1\42\1\20\1\24\1\15\1\42\1\17\1\42\1\35\2\42\1\2\1\34\1\3\1\33",
            "\1\46\15\uffff\1\47\2\uffff\1\51\2\uffff\1\50",
            "",
            "",
            "\1\55\6\uffff\1\52\1\54\4\uffff\1\56\1\53",
            "\1\57\2\uffff\1\61\1\60",
            "\1\63",
            "",
            "\1\66\11\uffff\1\65",
            "\1\71\1\70\12\uffff\1\72\4\uffff\1\73\1\67",
            "\1\74\2\uffff\1\75",
            "\1\100\12\uffff\1\76\5\uffff\1\77",
            "\1\101\13\uffff\1\102\2\uffff\1\103",
            "\1\105\5\uffff\1\104\2\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\114\1\uffff\1\112\4\uffff\1\113",
            "\1\34\1\115",
            "",
            "",
            "\1\117",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127\4\uffff\1\130",
            "\1\133\1\uffff\12\131\13\uffff\1\133\37\uffff\1\133",
            "",
            "",
            "",
            "",
            "\1\134\16\uffff\1\135",
            "\1\136",
            "\1\137",
            "\1\140\5\uffff\1\141",
            "\1\142",
            "\1\143",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\145\12\42\1\146\4\42\1\144\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\150",
            "\1\151",
            "\1\153",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157\13\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\173\26\42",
            "\1\174",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\2\uffff\1\u0084\1\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "",
            "",
            "\1\u0089\5\uffff\1\u008a",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\133\1\uffff\12\131\13\uffff\1\133\37\uffff\1\133",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0098\2\uffff\1\u0097",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\u009f\7\42\1\u00a0\21\42",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00b0",
            "\1\u00b1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00b2\25\42",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00b9",
            "\1\u00ba",
            "\12\u00be\1\u00bd\2\u00be\1\u00bc\34\u00be\1\u00bb\uffd5\u00be",
            "",
            "\1\u00bf",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\u00be\1\u00bd\2\u00be\1\u00bc\34\u00be\1\u00bb\4\u00be\1\u00e2\uffd0\u00be",
            "\12\u00e3\1\u00bd\ufff5\u00e3",
            "\0\u00e3",
            "\12\u00be\1\u00bd\2\u00be\1\u00bc\34\u00be\1\u00bb\uffd5\u00be",
            "\1\u00e4",
            "",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\u00be\1\u00bd\2\u00be\1\u00bc\34\u00be\1\u00bb\uffd5\u00be",
            "",
            "\1\u0101",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0103",
            "\1\u0104",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u011e",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u011f",
            "\1\u0120",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0124",
            "",
            "\1\u0125",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u0126\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0131",
            "\1\u0132",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "",
            "",
            "\1\u0136",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0138",
            "",
            "",
            "",
            "\1\u0139",
            "\1\u013a",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0140",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0143",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0145",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0148",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u014a",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u014f",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_OPERATOR | RULE_DECIMAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_187 = input.LA(1);

                        s = -1;
                        if ( (LA16_187=='/') ) {s = 226;}

                        else if ( (LA16_187=='\r') ) {s = 188;}

                        else if ( (LA16_187=='\n') ) {s = 189;}

                        else if ( (LA16_187=='*') ) {s = 187;}

                        else if ( ((LA16_187>='\u0000' && LA16_187<='\t')||(LA16_187>='\u000B' && LA16_187<='\f')||(LA16_187>='\u000E' && LA16_187<=')')||(LA16_187>='+' && LA16_187<='.')||(LA16_187>='0' && LA16_187<='\uFFFF')) ) {s = 190;}

                        else s = 144;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_226 = input.LA(1);

                        s = -1;
                        if ( (LA16_226=='\r') ) {s = 188;}

                        else if ( (LA16_226=='\n') ) {s = 189;}

                        else if ( (LA16_226=='*') ) {s = 187;}

                        else if ( ((LA16_226>='\u0000' && LA16_226<='\t')||(LA16_226>='\u000B' && LA16_226<='\f')||(LA16_226>='\u000E' && LA16_226<=')')||(LA16_226>='+' && LA16_226<='\uFFFF')) ) {s = 190;}

                        else s = 227;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_190 = input.LA(1);

                        s = -1;
                        if ( (LA16_190=='\r') ) {s = 188;}

                        else if ( (LA16_190=='\n') ) {s = 189;}

                        else if ( (LA16_190=='*') ) {s = 187;}

                        else if ( ((LA16_190>='\u0000' && LA16_190<='\t')||(LA16_190>='\u000B' && LA16_190<='\f')||(LA16_190>='\u000E' && LA16_190<=')')||(LA16_190>='+' && LA16_190<='\uFFFF')) ) {s = 190;}

                        else s = 144;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_143 = input.LA(1);

                        s = -1;
                        if ( (LA16_143=='*') ) {s = 187;}

                        else if ( (LA16_143=='\r') ) {s = 188;}

                        else if ( (LA16_143=='\n') ) {s = 189;}

                        else if ( ((LA16_143>='\u0000' && LA16_143<='\t')||(LA16_143>='\u000B' && LA16_143<='\f')||(LA16_143>='\u000E' && LA16_143<=')')||(LA16_143>='+' && LA16_143<='\uFFFF')) ) {s = 190;}

                        else s = 144;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_188 = input.LA(1);

                        s = -1;
                        if ( (LA16_188=='\n') ) {s = 189;}

                        else if ( ((LA16_188>='\u0000' && LA16_188<='\t')||(LA16_188>='\u000B' && LA16_188<='\uFFFF')) ) {s = 227;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_189 = input.LA(1);

                        s = -1;
                        if ( ((LA16_189>='\u0000' && LA16_189<='\uFFFF')) ) {s = 227;}

                        else s = 144;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}