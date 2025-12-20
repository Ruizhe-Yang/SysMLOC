package dut.control.kermloc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dut.control.kermloc.services.KerMLOCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKerMLOCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_VALUE", "RULE_REGULAR_COMMENT", "RULE_SL_NOTE", "RULE_ML_NOTE", "RULE_PREFIXNAME_TEXT", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_WS", "'package'", "';'", "'{'", "'}'", "'standard'", "'library'", "'dependency'", "'from'", "','", "'to'", "'comment'", "'about'", "'locale'", "'doc'", "'rep'", "'language'", "'import'", "'all'", "'::'", "'*'", "'**'", "'['", "']'", "'alias'", "'<'", "'>'", "'for'", "'filter'", "'multiplicity'", "'namespace'", "'type'", "'classifier'", "'class'", "'struct'", "'metaclass'", "'datatype'", "'assoc'", "'interaction'", "'behavior'", "'function'", "'predicate'", "'variant'", "'..'", "':>'", "'subsets'", "'abstract'", "'specializes'", "'~'", "'conjugates'", "'disjoint'", "'unions'", "'intersects'", "'differences'", "'USELESS'", "'.'", "'if'", "'?'", "'else'", "'??'", "'implies'", "'|'", "'or'", "'xor'", "'&'", "'and'", "'=='", "'!='", "'==='", "'!=='", "'hastype'", "'istype'", "'@'", "'as'", "'@@'", "'meta'", "'<='", "'>='", "'+'", "'-'", "'/'", "'%'", "'^'", "'not'", "'#'", "'('", "')'", "'->'", "'.?'", "'='", "'null'", "'metadata'", "'new'", "'in'", "'ref'", "'private'", "':'", "'attribute'", "':>>'", "'defined'", "'by'", "'::>'", "'references'", "'=>'", "'crosses'", "'redefines'", "'true'", "'false'", "'NULLVisibility'", "'public'", "'protected'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
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
    public static final int RULE_ID=9;
    public static final int RULE_PREFIXNAME_TEXT=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_REGULAR_COMMENT=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_UNRESTRICTED_NAME=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=4;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_SL_NOTE=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL_VALUE=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=7;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int RULE_EXP_VALUE=12;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalKerMLOCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKerMLOCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKerMLOCParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKerMLOC.g"; }



     	private KerMLOCGrammarAccess grammarAccess;

        public InternalKerMLOCParser(TokenStream input, KerMLOCGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RootNamespace";
       	}

       	@Override
       	protected KerMLOCGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRootNamespace"
    // InternalKerMLOC.g:65:1: entryRuleRootNamespace returns [EObject current=null] : iv_ruleRootNamespace= ruleRootNamespace EOF ;
    public final EObject entryRuleRootNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootNamespace = null;


        try {
            // InternalKerMLOC.g:65:54: (iv_ruleRootNamespace= ruleRootNamespace EOF )
            // InternalKerMLOC.g:66:2: iv_ruleRootNamespace= ruleRootNamespace EOF
            {
             newCompositeNode(grammarAccess.getRootNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootNamespace=ruleRootNamespace();

            state._fsp--;

             current =iv_ruleRootNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootNamespace"


    // $ANTLR start "ruleRootNamespace"
    // InternalKerMLOC.g:72:1: ruleRootNamespace returns [EObject current=null] : ( (lv_elements_0_0= ruleGeneralBodyElements ) )* ;
    public final EObject ruleRootNamespace() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:78:2: ( ( (lv_elements_0_0= ruleGeneralBodyElements ) )* )
            // InternalKerMLOC.g:79:2: ( (lv_elements_0_0= ruleGeneralBodyElements ) )*
            {
            // InternalKerMLOC.g:79:2: ( (lv_elements_0_0= ruleGeneralBodyElements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING_VALUE && LA1_0<=RULE_EXP_VALUE)||LA1_0==14||LA1_0==16||(LA1_0>=18 && LA1_0<=20)||LA1_0==24||(LA1_0>=26 && LA1_0<=29)||LA1_0==31||LA1_0==33||LA1_0==37||(LA1_0>=41 && LA1_0<=55)||LA1_0==59||LA1_0==61||(LA1_0>=67 && LA1_0<=69)||(LA1_0>=83 && LA1_0<=86)||(LA1_0>=91 && LA1_0<=92)||LA1_0==96||LA1_0==98||LA1_0==103||LA1_0==105||LA1_0==108||(LA1_0>=119 && LA1_0<=123)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKerMLOC.g:80:3: (lv_elements_0_0= ruleGeneralBodyElements )
            	    {
            	    // InternalKerMLOC.g:80:3: (lv_elements_0_0= ruleGeneralBodyElements )
            	    // InternalKerMLOC.g:81:4: lv_elements_0_0= ruleGeneralBodyElements
            	    {

            	    				newCompositeNode(grammarAccess.getRootNamespaceAccess().getElementsGeneralBodyElementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleGeneralBodyElements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRootNamespaceRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"dut.control.kermloc.KerMLOC.GeneralBodyElements");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootNamespace"


    // $ANTLR start "entryRuleGeneralBodyElements"
    // InternalKerMLOC.g:101:1: entryRuleGeneralBodyElements returns [EObject current=null] : iv_ruleGeneralBodyElements= ruleGeneralBodyElements EOF ;
    public final EObject entryRuleGeneralBodyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralBodyElements = null;


        try {
            // InternalKerMLOC.g:101:60: (iv_ruleGeneralBodyElements= ruleGeneralBodyElements EOF )
            // InternalKerMLOC.g:102:2: iv_ruleGeneralBodyElements= ruleGeneralBodyElements EOF
            {
             newCompositeNode(grammarAccess.getGeneralBodyElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralBodyElements=ruleGeneralBodyElements();

            state._fsp--;

             current =iv_ruleGeneralBodyElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralBodyElements"


    // $ANTLR start "ruleGeneralBodyElements"
    // InternalKerMLOC.g:108:1: ruleGeneralBodyElements returns [EObject current=null] : (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_AliasElement_2= ruleAliasElement | this_CodeAnnotation_3= ruleCodeAnnotation | this_NonFeatureElement_4= ruleNonFeatureElement ) ;
    public final EObject ruleGeneralBodyElements() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotatingElement_0 = null;

        EObject this_ImportElement_1 = null;

        EObject this_AliasElement_2 = null;

        EObject this_CodeAnnotation_3 = null;

        EObject this_NonFeatureElement_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:114:2: ( (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_AliasElement_2= ruleAliasElement | this_CodeAnnotation_3= ruleCodeAnnotation | this_NonFeatureElement_4= ruleNonFeatureElement ) )
            // InternalKerMLOC.g:115:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_AliasElement_2= ruleAliasElement | this_CodeAnnotation_3= ruleCodeAnnotation | this_NonFeatureElement_4= ruleNonFeatureElement )
            {
            // InternalKerMLOC.g:115:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_AliasElement_2= ruleAliasElement | this_CodeAnnotation_3= ruleCodeAnnotation | this_NonFeatureElement_4= ruleNonFeatureElement )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalKerMLOC.g:116:3: this_AnnotatingElement_0= ruleAnnotatingElement
                    {

                    			newCompositeNode(grammarAccess.getGeneralBodyElementsAccess().getAnnotatingElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotatingElement_0=ruleAnnotatingElement();

                    state._fsp--;


                    			current = this_AnnotatingElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:125:3: this_ImportElement_1= ruleImportElement
                    {

                    			newCompositeNode(grammarAccess.getGeneralBodyElementsAccess().getImportElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImportElement_1=ruleImportElement();

                    state._fsp--;


                    			current = this_ImportElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:134:3: this_AliasElement_2= ruleAliasElement
                    {

                    			newCompositeNode(grammarAccess.getGeneralBodyElementsAccess().getAliasElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AliasElement_2=ruleAliasElement();

                    state._fsp--;


                    			current = this_AliasElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:143:3: this_CodeAnnotation_3= ruleCodeAnnotation
                    {

                    			newCompositeNode(grammarAccess.getGeneralBodyElementsAccess().getCodeAnnotationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeAnnotation_3=ruleCodeAnnotation();

                    state._fsp--;


                    			current = this_CodeAnnotation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLOC.g:152:3: this_NonFeatureElement_4= ruleNonFeatureElement
                    {

                    			newCompositeNode(grammarAccess.getGeneralBodyElementsAccess().getNonFeatureElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureElement_4=ruleNonFeatureElement();

                    state._fsp--;


                    			current = this_NonFeatureElement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralBodyElements"


    // $ANTLR start "entryRuleAnnotatingBodyElement"
    // InternalKerMLOC.g:164:1: entryRuleAnnotatingBodyElement returns [EObject current=null] : iv_ruleAnnotatingBodyElement= ruleAnnotatingBodyElement EOF ;
    public final EObject entryRuleAnnotatingBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatingBodyElement = null;


        try {
            // InternalKerMLOC.g:164:62: (iv_ruleAnnotatingBodyElement= ruleAnnotatingBodyElement EOF )
            // InternalKerMLOC.g:165:2: iv_ruleAnnotatingBodyElement= ruleAnnotatingBodyElement EOF
            {
             newCompositeNode(grammarAccess.getAnnotatingBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotatingBodyElement=ruleAnnotatingBodyElement();

            state._fsp--;

             current =iv_ruleAnnotatingBodyElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatingBodyElement"


    // $ANTLR start "ruleAnnotatingBodyElement"
    // InternalKerMLOC.g:171:1: ruleAnnotatingBodyElement returns [EObject current=null] : (this_AnnotatingElement_0= ruleAnnotatingElement | this_CodeAnnotation_1= ruleCodeAnnotation ) ;
    public final EObject ruleAnnotatingBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotatingElement_0 = null;

        EObject this_CodeAnnotation_1 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:177:2: ( (this_AnnotatingElement_0= ruleAnnotatingElement | this_CodeAnnotation_1= ruleCodeAnnotation ) )
            // InternalKerMLOC.g:178:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_CodeAnnotation_1= ruleCodeAnnotation )
            {
            // InternalKerMLOC.g:178:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_CodeAnnotation_1= ruleCodeAnnotation )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING_VALUE && LA3_0<=RULE_REGULAR_COMMENT)||(LA3_0>=RULE_PREFIXNAME_TEXT && LA3_0<=RULE_EXP_VALUE)||LA3_0==14||LA3_0==16||(LA3_0>=18 && LA3_0<=20)||LA3_0==24||(LA3_0>=26 && LA3_0<=29)||LA3_0==31||LA3_0==33||LA3_0==37||(LA3_0>=41 && LA3_0<=42)||(LA3_0>=44 && LA3_0<=55)||LA3_0==59||LA3_0==61||(LA3_0>=67 && LA3_0<=69)||(LA3_0>=83 && LA3_0<=86)||(LA3_0>=91 && LA3_0<=92)||LA3_0==96||LA3_0==98||LA3_0==103||LA3_0==105||LA3_0==108||(LA3_0>=119 && LA3_0<=123)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_SL_NOTE && LA3_0<=RULE_ML_NOTE)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKerMLOC.g:179:3: this_AnnotatingElement_0= ruleAnnotatingElement
                    {

                    			newCompositeNode(grammarAccess.getAnnotatingBodyElementAccess().getAnnotatingElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotatingElement_0=ruleAnnotatingElement();

                    state._fsp--;


                    			current = this_AnnotatingElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:188:3: this_CodeAnnotation_1= ruleCodeAnnotation
                    {

                    			newCompositeNode(grammarAccess.getAnnotatingBodyElementAccess().getCodeAnnotationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeAnnotation_1=ruleCodeAnnotation();

                    state._fsp--;


                    			current = this_CodeAnnotation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatingBodyElement"


    // $ANTLR start "entryRulePackageBodyElement"
    // InternalKerMLOC.g:200:1: entryRulePackageBodyElement returns [EObject current=null] : iv_rulePackageBodyElement= rulePackageBodyElement EOF ;
    public final EObject entryRulePackageBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageBodyElement = null;


        try {
            // InternalKerMLOC.g:200:59: (iv_rulePackageBodyElement= rulePackageBodyElement EOF )
            // InternalKerMLOC.g:201:2: iv_rulePackageBodyElement= rulePackageBodyElement EOF
            {
             newCompositeNode(grammarAccess.getPackageBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageBodyElement=rulePackageBodyElement();

            state._fsp--;

             current =iv_rulePackageBodyElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageBodyElement"


    // $ANTLR start "rulePackageBodyElement"
    // InternalKerMLOC.g:207:1: rulePackageBodyElement returns [EObject current=null] : (this_GeneralBodyElements_0= ruleGeneralBodyElements | this_ElementFilterElement_1= ruleElementFilterElement ) ;
    public final EObject rulePackageBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralBodyElements_0 = null;

        EObject this_ElementFilterElement_1 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:213:2: ( (this_GeneralBodyElements_0= ruleGeneralBodyElements | this_ElementFilterElement_1= ruleElementFilterElement ) )
            // InternalKerMLOC.g:214:2: (this_GeneralBodyElements_0= ruleGeneralBodyElements | this_ElementFilterElement_1= ruleElementFilterElement )
            {
            // InternalKerMLOC.g:214:2: (this_GeneralBodyElements_0= ruleGeneralBodyElements | this_ElementFilterElement_1= ruleElementFilterElement )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 121:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==RULE_REGULAR_COMMENT||LA4_5==RULE_PREFIXNAME_TEXT||LA4_5==14||(LA4_5>=18 && LA4_5<=20)||LA4_5==24||(LA4_5>=26 && LA4_5<=29)||LA4_5==37||LA4_5==42||(LA4_5>=44 && LA4_5<=54)||LA4_5==59) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==41) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_REGULAR_COMMENT:
                case RULE_PREFIXNAME_TEXT:
                case 14:
                case 18:
                case 19:
                case 20:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 37:
                case 42:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 59:
                    {
                    alt4=1;
                    }
                    break;
                case 41:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 122:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==RULE_REGULAR_COMMENT||LA4_5==RULE_PREFIXNAME_TEXT||LA4_5==14||(LA4_5>=18 && LA4_5<=20)||LA4_5==24||(LA4_5>=26 && LA4_5<=29)||LA4_5==37||LA4_5==42||(LA4_5>=44 && LA4_5<=54)||LA4_5==59) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==41) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_REGULAR_COMMENT:
                case RULE_PREFIXNAME_TEXT:
                case 14:
                case 18:
                case 19:
                case 20:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 37:
                case 42:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 59:
                    {
                    alt4=1;
                    }
                    break;
                case 41:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case 108:
                {
                switch ( input.LA(2) ) {
                case RULE_REGULAR_COMMENT:
                case RULE_PREFIXNAME_TEXT:
                case 14:
                case 18:
                case 19:
                case 20:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 37:
                case 42:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 59:
                    {
                    alt4=1;
                    }
                    break;
                case 55:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==RULE_REGULAR_COMMENT||LA4_5==RULE_PREFIXNAME_TEXT||LA4_5==14||(LA4_5>=18 && LA4_5<=20)||LA4_5==24||(LA4_5>=26 && LA4_5<=29)||LA4_5==37||LA4_5==42||(LA4_5>=44 && LA4_5<=54)||LA4_5==59) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==41) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }

                }
                break;
            case 123:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==RULE_REGULAR_COMMENT||LA4_5==RULE_PREFIXNAME_TEXT||LA4_5==14||(LA4_5>=18 && LA4_5<=20)||LA4_5==24||(LA4_5>=26 && LA4_5<=29)||LA4_5==37||LA4_5==42||(LA4_5>=44 && LA4_5<=54)||LA4_5==59) ) {
                        alt4=1;
                    }
                    else if ( (LA4_5==41) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_REGULAR_COMMENT:
                case RULE_PREFIXNAME_TEXT:
                case 14:
                case 18:
                case 19:
                case 20:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 37:
                case 42:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 59:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }

                }
                break;
            case 55:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==RULE_REGULAR_COMMENT||LA4_5==RULE_PREFIXNAME_TEXT||LA4_5==14||(LA4_5>=18 && LA4_5<=20)||LA4_5==24||(LA4_5>=26 && LA4_5<=29)||LA4_5==37||LA4_5==42||(LA4_5>=44 && LA4_5<=54)||LA4_5==59) ) {
                    alt4=1;
                }
                else if ( (LA4_5==41) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REGULAR_COMMENT:
            case RULE_SL_NOTE:
            case RULE_ML_NOTE:
            case RULE_PREFIXNAME_TEXT:
            case 14:
            case 18:
            case 19:
            case 20:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 37:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 59:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKerMLOC.g:215:3: this_GeneralBodyElements_0= ruleGeneralBodyElements
                    {

                    			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getGeneralBodyElementsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralBodyElements_0=ruleGeneralBodyElements();

                    state._fsp--;


                    			current = this_GeneralBodyElements_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:224:3: this_ElementFilterElement_1= ruleElementFilterElement
                    {

                    			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getElementFilterElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementFilterElement_1=ruleElementFilterElement();

                    state._fsp--;


                    			current = this_ElementFilterElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageBodyElement"


    // $ANTLR start "entryRuleTypeBodyElement"
    // InternalKerMLOC.g:236:1: entryRuleTypeBodyElement returns [EObject current=null] : iv_ruleTypeBodyElement= ruleTypeBodyElement EOF ;
    public final EObject entryRuleTypeBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBodyElement = null;


        try {
            // InternalKerMLOC.g:236:56: (iv_ruleTypeBodyElement= ruleTypeBodyElement EOF )
            // InternalKerMLOC.g:237:2: iv_ruleTypeBodyElement= ruleTypeBodyElement EOF
            {
             newCompositeNode(grammarAccess.getTypeBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeBodyElement=ruleTypeBodyElement();

            state._fsp--;

             current =iv_ruleTypeBodyElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeBodyElement"


    // $ANTLR start "ruleTypeBodyElement"
    // InternalKerMLOC.g:243:1: ruleTypeBodyElement returns [EObject current=null] : this_GeneralBodyElements_0= ruleGeneralBodyElements ;
    public final EObject ruleTypeBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralBodyElements_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:249:2: (this_GeneralBodyElements_0= ruleGeneralBodyElements )
            // InternalKerMLOC.g:250:2: this_GeneralBodyElements_0= ruleGeneralBodyElements
            {

            		newCompositeNode(grammarAccess.getTypeBodyElementAccess().getGeneralBodyElementsParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_GeneralBodyElements_0=ruleGeneralBodyElements();

            state._fsp--;


            		current = this_GeneralBodyElements_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeBodyElement"


    // $ANTLR start "entryRuleNamespaceBodyElement"
    // InternalKerMLOC.g:261:1: entryRuleNamespaceBodyElement returns [EObject current=null] : iv_ruleNamespaceBodyElement= ruleNamespaceBodyElement EOF ;
    public final EObject entryRuleNamespaceBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceBodyElement = null;


        try {
            // InternalKerMLOC.g:261:61: (iv_ruleNamespaceBodyElement= ruleNamespaceBodyElement EOF )
            // InternalKerMLOC.g:262:2: iv_ruleNamespaceBodyElement= ruleNamespaceBodyElement EOF
            {
             newCompositeNode(grammarAccess.getNamespaceBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespaceBodyElement=ruleNamespaceBodyElement();

            state._fsp--;

             current =iv_ruleNamespaceBodyElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceBodyElement"


    // $ANTLR start "ruleNamespaceBodyElement"
    // InternalKerMLOC.g:268:1: ruleNamespaceBodyElement returns [EObject current=null] : this_GeneralBodyElements_0= ruleGeneralBodyElements ;
    public final EObject ruleNamespaceBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralBodyElements_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:274:2: (this_GeneralBodyElements_0= ruleGeneralBodyElements )
            // InternalKerMLOC.g:275:2: this_GeneralBodyElements_0= ruleGeneralBodyElements
            {

            		newCompositeNode(grammarAccess.getNamespaceBodyElementAccess().getGeneralBodyElementsParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_GeneralBodyElements_0=ruleGeneralBodyElements();

            state._fsp--;


            		current = this_GeneralBodyElements_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceBodyElement"


    // $ANTLR start "entryRuleFunctionBodyElement"
    // InternalKerMLOC.g:286:1: entryRuleFunctionBodyElement returns [EObject current=null] : iv_ruleFunctionBodyElement= ruleFunctionBodyElement EOF ;
    public final EObject entryRuleFunctionBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBodyElement = null;


        try {
            // InternalKerMLOC.g:286:60: (iv_ruleFunctionBodyElement= ruleFunctionBodyElement EOF )
            // InternalKerMLOC.g:287:2: iv_ruleFunctionBodyElement= ruleFunctionBodyElement EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBodyElement=ruleFunctionBodyElement();

            state._fsp--;

             current =iv_ruleFunctionBodyElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBodyElement"


    // $ANTLR start "ruleFunctionBodyElement"
    // InternalKerMLOC.g:293:1: ruleFunctionBodyElement returns [EObject current=null] : this_GeneralBodyElements_0= ruleGeneralBodyElements ;
    public final EObject ruleFunctionBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralBodyElements_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:299:2: (this_GeneralBodyElements_0= ruleGeneralBodyElements )
            // InternalKerMLOC.g:300:2: this_GeneralBodyElements_0= ruleGeneralBodyElements
            {

            		newCompositeNode(grammarAccess.getFunctionBodyElementAccess().getGeneralBodyElementsParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_GeneralBodyElements_0=ruleGeneralBodyElements();

            state._fsp--;


            		current = this_GeneralBodyElements_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBodyElement"


    // $ANTLR start "entryRuleAnnotatingElement"
    // InternalKerMLOC.g:311:1: entryRuleAnnotatingElement returns [EObject current=null] : iv_ruleAnnotatingElement= ruleAnnotatingElement EOF ;
    public final EObject entryRuleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatingElement = null;


        try {
            // InternalKerMLOC.g:311:58: (iv_ruleAnnotatingElement= ruleAnnotatingElement EOF )
            // InternalKerMLOC.g:312:2: iv_ruleAnnotatingElement= ruleAnnotatingElement EOF
            {
             newCompositeNode(grammarAccess.getAnnotatingElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotatingElement=ruleAnnotatingElement();

            state._fsp--;

             current =iv_ruleAnnotatingElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatingElement"


    // $ANTLR start "ruleAnnotatingElement"
    // InternalKerMLOC.g:318:1: ruleAnnotatingElement returns [EObject current=null] : (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation ) ;
    public final EObject ruleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;

        EObject this_Documentation_1 = null;

        EObject this_TextualRepresentation_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:324:2: ( (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation ) )
            // InternalKerMLOC.g:325:2: (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation )
            {
            // InternalKerMLOC.g:325:2: (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 121:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_REGULAR_COMMENT:
                    case 24:
                    case 26:
                        {
                        alt5=1;
                        }
                        break;
                    case 28:
                    case 29:
                        {
                        alt5=3;
                        }
                        break;
                    case 27:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_REGULAR_COMMENT:
                case 24:
                case 26:
                    {
                    alt5=1;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt5=3;
                    }
                    break;
                case 27:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 122:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_REGULAR_COMMENT:
                    case 24:
                    case 26:
                        {
                        alt5=1;
                        }
                        break;
                    case 28:
                    case 29:
                        {
                        alt5=3;
                        }
                        break;
                    case 27:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_REGULAR_COMMENT:
                case 24:
                case 26:
                    {
                    alt5=1;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt5=3;
                    }
                    break;
                case 27:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

                }
                break;
            case 108:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_REGULAR_COMMENT:
                    case 24:
                    case 26:
                        {
                        alt5=1;
                        }
                        break;
                    case 28:
                    case 29:
                        {
                        alt5=3;
                        }
                        break;
                    case 27:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_REGULAR_COMMENT:
                case 24:
                case 26:
                    {
                    alt5=1;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt5=3;
                    }
                    break;
                case 27:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }

                }
                break;
            case 123:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_REGULAR_COMMENT:
                    case 24:
                    case 26:
                        {
                        alt5=1;
                        }
                        break;
                    case 28:
                    case 29:
                        {
                        alt5=3;
                        }
                        break;
                    case 27:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_REGULAR_COMMENT:
                case 24:
                case 26:
                    {
                    alt5=1;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt5=3;
                    }
                    break;
                case 27:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }

                }
                break;
            case 55:
                {
                switch ( input.LA(2) ) {
                case RULE_REGULAR_COMMENT:
                case 24:
                case 26:
                    {
                    alt5=1;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt5=3;
                    }
                    break;
                case 27:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REGULAR_COMMENT:
            case 24:
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
            case 29:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKerMLOC.g:326:3: this_Comment_0= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_0=ruleComment();

                    state._fsp--;


                    			current = this_Comment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:335:3: this_Documentation_1= ruleDocumentation
                    {

                    			newCompositeNode(grammarAccess.getAnnotatingElementAccess().getDocumentationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Documentation_1=ruleDocumentation();

                    state._fsp--;


                    			current = this_Documentation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:344:3: this_TextualRepresentation_2= ruleTextualRepresentation
                    {

                    			newCompositeNode(grammarAccess.getAnnotatingElementAccess().getTextualRepresentationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextualRepresentation_2=ruleTextualRepresentation();

                    state._fsp--;


                    			current = this_TextualRepresentation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotatingElement"


    // $ANTLR start "entryRuleNonFeatureElement"
    // InternalKerMLOC.g:356:1: entryRuleNonFeatureElement returns [EObject current=null] : iv_ruleNonFeatureElement= ruleNonFeatureElement EOF ;
    public final EObject entryRuleNonFeatureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureElement = null;


        try {
            // InternalKerMLOC.g:356:58: (iv_ruleNonFeatureElement= ruleNonFeatureElement EOF )
            // InternalKerMLOC.g:357:2: iv_ruleNonFeatureElement= ruleNonFeatureElement EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureElement=ruleNonFeatureElement();

            state._fsp--;

             current =iv_ruleNonFeatureElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureElement"


    // $ANTLR start "ruleNonFeatureElement"
    // InternalKerMLOC.g:363:1: ruleNonFeatureElement returns [EObject current=null] : (this_Dependency_0= ruleDependency | this_Namespace_1= ruleNamespace | this_Package_2= rulePackage | this_LibraryPackage_3= ruleLibraryPackage | this_Multiplicity_4= ruleMultiplicity | this_Type_5= ruleType | this_Classifier_6= ruleClassifier | this_Class_7= ruleClass | this_Structure_8= ruleStructure | this_Metaclass_9= ruleMetaclass | this_DataType_10= ruleDataType | this_Association_11= ruleAssociation | this_AssociationStructure_12= ruleAssociationStructure | this_Interaction_13= ruleInteraction | this_Behavior_14= ruleBehavior | this_Function_15= ruleFunction | this_Predicate_16= rulePredicate ) ;
    public final EObject ruleNonFeatureElement() throws RecognitionException {
        EObject current = null;

        EObject this_Dependency_0 = null;

        EObject this_Namespace_1 = null;

        EObject this_Package_2 = null;

        EObject this_LibraryPackage_3 = null;

        EObject this_Multiplicity_4 = null;

        EObject this_Type_5 = null;

        EObject this_Classifier_6 = null;

        EObject this_Class_7 = null;

        EObject this_Structure_8 = null;

        EObject this_Metaclass_9 = null;

        EObject this_DataType_10 = null;

        EObject this_Association_11 = null;

        EObject this_AssociationStructure_12 = null;

        EObject this_Interaction_13 = null;

        EObject this_Behavior_14 = null;

        EObject this_Function_15 = null;

        EObject this_Predicate_16 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:369:2: ( (this_Dependency_0= ruleDependency | this_Namespace_1= ruleNamespace | this_Package_2= rulePackage | this_LibraryPackage_3= ruleLibraryPackage | this_Multiplicity_4= ruleMultiplicity | this_Type_5= ruleType | this_Classifier_6= ruleClassifier | this_Class_7= ruleClass | this_Structure_8= ruleStructure | this_Metaclass_9= ruleMetaclass | this_DataType_10= ruleDataType | this_Association_11= ruleAssociation | this_AssociationStructure_12= ruleAssociationStructure | this_Interaction_13= ruleInteraction | this_Behavior_14= ruleBehavior | this_Function_15= ruleFunction | this_Predicate_16= rulePredicate ) )
            // InternalKerMLOC.g:370:2: (this_Dependency_0= ruleDependency | this_Namespace_1= ruleNamespace | this_Package_2= rulePackage | this_LibraryPackage_3= ruleLibraryPackage | this_Multiplicity_4= ruleMultiplicity | this_Type_5= ruleType | this_Classifier_6= ruleClassifier | this_Class_7= ruleClass | this_Structure_8= ruleStructure | this_Metaclass_9= ruleMetaclass | this_DataType_10= ruleDataType | this_Association_11= ruleAssociation | this_AssociationStructure_12= ruleAssociationStructure | this_Interaction_13= ruleInteraction | this_Behavior_14= ruleBehavior | this_Function_15= ruleFunction | this_Predicate_16= rulePredicate )
            {
            // InternalKerMLOC.g:370:2: (this_Dependency_0= ruleDependency | this_Namespace_1= ruleNamespace | this_Package_2= rulePackage | this_LibraryPackage_3= ruleLibraryPackage | this_Multiplicity_4= ruleMultiplicity | this_Type_5= ruleType | this_Classifier_6= ruleClassifier | this_Class_7= ruleClass | this_Structure_8= ruleStructure | this_Metaclass_9= ruleMetaclass | this_DataType_10= ruleDataType | this_Association_11= ruleAssociation | this_AssociationStructure_12= ruleAssociationStructure | this_Interaction_13= ruleInteraction | this_Behavior_14= ruleBehavior | this_Function_15= ruleFunction | this_Predicate_16= rulePredicate )
            int alt6=17;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKerMLOC.g:371:3: this_Dependency_0= ruleDependency
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getDependencyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dependency_0=ruleDependency();

                    state._fsp--;


                    			current = this_Dependency_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:380:3: this_Namespace_1= ruleNamespace
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getNamespaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Namespace_1=ruleNamespace();

                    state._fsp--;


                    			current = this_Namespace_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:389:3: this_Package_2= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getPackageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_2=rulePackage();

                    state._fsp--;


                    			current = this_Package_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:398:3: this_LibraryPackage_3= ruleLibraryPackage
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getLibraryPackageParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LibraryPackage_3=ruleLibraryPackage();

                    state._fsp--;


                    			current = this_LibraryPackage_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLOC.g:407:3: this_Multiplicity_4= ruleMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getMultiplicityParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Multiplicity_4=ruleMultiplicity();

                    state._fsp--;


                    			current = this_Multiplicity_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKerMLOC.g:416:3: this_Type_5= ruleType
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_5=ruleType();

                    state._fsp--;


                    			current = this_Type_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalKerMLOC.g:425:3: this_Classifier_6= ruleClassifier
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getClassifierParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Classifier_6=ruleClassifier();

                    state._fsp--;


                    			current = this_Classifier_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalKerMLOC.g:434:3: this_Class_7= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getClassParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_7=ruleClass();

                    state._fsp--;


                    			current = this_Class_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalKerMLOC.g:443:3: this_Structure_8= ruleStructure
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getStructureParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Structure_8=ruleStructure();

                    state._fsp--;


                    			current = this_Structure_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalKerMLOC.g:452:3: this_Metaclass_9= ruleMetaclass
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getMetaclassParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Metaclass_9=ruleMetaclass();

                    state._fsp--;


                    			current = this_Metaclass_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalKerMLOC.g:461:3: this_DataType_10= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getDataTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_10=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalKerMLOC.g:470:3: this_Association_11= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getAssociationParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_11=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalKerMLOC.g:479:3: this_AssociationStructure_12= ruleAssociationStructure
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getAssociationStructureParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationStructure_12=ruleAssociationStructure();

                    state._fsp--;


                    			current = this_AssociationStructure_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalKerMLOC.g:488:3: this_Interaction_13= ruleInteraction
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getInteractionParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interaction_13=ruleInteraction();

                    state._fsp--;


                    			current = this_Interaction_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalKerMLOC.g:497:3: this_Behavior_14= ruleBehavior
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getBehaviorParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Behavior_14=ruleBehavior();

                    state._fsp--;


                    			current = this_Behavior_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalKerMLOC.g:506:3: this_Function_15= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getFunctionParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_15=ruleFunction();

                    state._fsp--;


                    			current = this_Function_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalKerMLOC.g:515:3: this_Predicate_16= rulePredicate
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureElementAccess().getPredicateParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_Predicate_16=rulePredicate();

                    state._fsp--;


                    			current = this_Predicate_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFeatureElement"


    // $ANTLR start "entryRulePackage"
    // InternalKerMLOC.g:527:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalKerMLOC.g:527:48: (iv_rulePackage= rulePackage EOF )
            // InternalKerMLOC.g:528:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalKerMLOC.g:534:1: rulePackage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'package' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_PrefixMetadata_1 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:540:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'package' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:541:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'package' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:541:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'package' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:542:3: this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'package' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPackageRule());
            			}
            			newCompositeNode(grammarAccess.getPackageAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:553:3: (this_PrefixMetadata_1= rulePrefixMetadata[$current] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_PREFIXNAME_TEXT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKerMLOC.g:554:4: this_PrefixMetadata_1= rulePrefixMetadata[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getPackageRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getPackageAccess().getPrefixMetadataParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_4);
            	    this_PrefixMetadata_1=rulePrefixMetadata(current);

            	    state._fsp--;


            	    				current = this_PrefixMetadata_1;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getPackageKeyword_2());
            		
            // InternalKerMLOC.g:570:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalKerMLOC.g:571:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalKerMLOC.g:571:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalKerMLOC.g:572:5: lv_declaredName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getDeclaredNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_declaredName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"declaredName",
            						lv_declaredName_3_0,
            						"dut.control.kermloc.KerMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:589:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKerMLOC.g:590:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:595:4: (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:595:4: (otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:596:5: otherlv_5= '{' ( (lv_elements_6_0= rulePackageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_7); 

                    					newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:600:5: ( (lv_elements_6_0= rulePackageBodyElement ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_STRING_VALUE && LA8_0<=RULE_EXP_VALUE)||LA8_0==14||LA8_0==16||(LA8_0>=18 && LA8_0<=20)||LA8_0==24||(LA8_0>=26 && LA8_0<=29)||LA8_0==31||LA8_0==33||LA8_0==37||(LA8_0>=41 && LA8_0<=55)||LA8_0==59||LA8_0==61||(LA8_0>=67 && LA8_0<=69)||(LA8_0>=83 && LA8_0<=86)||(LA8_0>=91 && LA8_0<=92)||LA8_0==96||LA8_0==98||LA8_0==103||LA8_0==105||LA8_0==108||(LA8_0>=119 && LA8_0<=123)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKerMLOC.g:601:6: (lv_elements_6_0= rulePackageBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:601:6: (lv_elements_6_0= rulePackageBodyElement )
                    	    // InternalKerMLOC.g:602:7: lv_elements_6_0= rulePackageBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getElementsPackageBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_6_0=rulePackageBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.PackageBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleLibraryPackage"
    // InternalKerMLOC.g:629:1: entryRuleLibraryPackage returns [EObject current=null] : iv_ruleLibraryPackage= ruleLibraryPackage EOF ;
    public final EObject entryRuleLibraryPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryPackage = null;


        try {
            // InternalKerMLOC.g:629:55: (iv_ruleLibraryPackage= ruleLibraryPackage EOF )
            // InternalKerMLOC.g:630:2: iv_ruleLibraryPackage= ruleLibraryPackage EOF
            {
             newCompositeNode(grammarAccess.getLibraryPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraryPackage=ruleLibraryPackage();

            state._fsp--;

             current =iv_ruleLibraryPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLibraryPackage"


    // $ANTLR start "ruleLibraryPackage"
    // InternalKerMLOC.g:636:1: ruleLibraryPackage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_isStandard_1_0= 'standard' ) )? ( (lv_isLibrary_2_0= 'library' ) ) (this_PrefixMetadata_3= rulePrefixMetadata[$current] )* otherlv_4= 'package' (this_Identification_5= ruleIdentification[$current] )? (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' ) ) ) ;
    public final EObject ruleLibraryPackage() throws RecognitionException {
        EObject current = null;

        Token lv_isStandard_1_0=null;
        Token lv_isLibrary_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_PrefixMetadata_3 = null;

        EObject this_Identification_5 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:642:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_isStandard_1_0= 'standard' ) )? ( (lv_isLibrary_2_0= 'library' ) ) (this_PrefixMetadata_3= rulePrefixMetadata[$current] )* otherlv_4= 'package' (this_Identification_5= ruleIdentification[$current] )? (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' ) ) ) )
            // InternalKerMLOC.g:643:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_isStandard_1_0= 'standard' ) )? ( (lv_isLibrary_2_0= 'library' ) ) (this_PrefixMetadata_3= rulePrefixMetadata[$current] )* otherlv_4= 'package' (this_Identification_5= ruleIdentification[$current] )? (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' ) ) )
            {
            // InternalKerMLOC.g:643:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_isStandard_1_0= 'standard' ) )? ( (lv_isLibrary_2_0= 'library' ) ) (this_PrefixMetadata_3= rulePrefixMetadata[$current] )* otherlv_4= 'package' (this_Identification_5= ruleIdentification[$current] )? (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' ) ) )
            // InternalKerMLOC.g:644:3: this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_isStandard_1_0= 'standard' ) )? ( (lv_isLibrary_2_0= 'library' ) ) (this_PrefixMetadata_3= rulePrefixMetadata[$current] )* otherlv_4= 'package' (this_Identification_5= ruleIdentification[$current] )? (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getLibraryPackageRule());
            			}
            			newCompositeNode(grammarAccess.getLibraryPackageAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:655:3: ( (lv_isStandard_1_0= 'standard' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKerMLOC.g:656:4: (lv_isStandard_1_0= 'standard' )
                    {
                    // InternalKerMLOC.g:656:4: (lv_isStandard_1_0= 'standard' )
                    // InternalKerMLOC.g:657:5: lv_isStandard_1_0= 'standard'
                    {
                    lv_isStandard_1_0=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(lv_isStandard_1_0, grammarAccess.getLibraryPackageAccess().getIsStandardStandardKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLibraryPackageRule());
                    					}
                    					setWithLastConsumed(current, "isStandard", lv_isStandard_1_0 != null, "standard");
                    				

                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:669:3: ( (lv_isLibrary_2_0= 'library' ) )
            // InternalKerMLOC.g:670:4: (lv_isLibrary_2_0= 'library' )
            {
            // InternalKerMLOC.g:670:4: (lv_isLibrary_2_0= 'library' )
            // InternalKerMLOC.g:671:5: lv_isLibrary_2_0= 'library'
            {
            lv_isLibrary_2_0=(Token)match(input,19,FOLLOW_4); 

            					newLeafNode(lv_isLibrary_2_0, grammarAccess.getLibraryPackageAccess().getIsLibraryLibraryKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryPackageRule());
            					}
            					setWithLastConsumed(current, "isLibrary", lv_isLibrary_2_0 != null, "library");
            				

            }


            }

            // InternalKerMLOC.g:683:3: (this_PrefixMetadata_3= rulePrefixMetadata[$current] )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_PREFIXNAME_TEXT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKerMLOC.g:684:4: this_PrefixMetadata_3= rulePrefixMetadata[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getLibraryPackageRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getLibraryPackageAccess().getPrefixMetadataParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_4);
            	    this_PrefixMetadata_3=rulePrefixMetadata(current);

            	    state._fsp--;


            	    				current = this_PrefixMetadata_3;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLibraryPackageAccess().getPackageKeyword_4());
            		
            // InternalKerMLOC.g:700:3: (this_Identification_5= ruleIdentification[$current] )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_UNRESTRICTED_NAME)||LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKerMLOC.g:701:4: this_Identification_5= ruleIdentification[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getLibraryPackageRule());
                    				}
                    				newCompositeNode(grammarAccess.getLibraryPackageAccess().getIdentificationParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_6);
                    this_Identification_5=ruleIdentification(current);

                    state._fsp--;


                    				current = this_Identification_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:713:3: (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            else if ( (LA14_0==16) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKerMLOC.g:714:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getLibraryPackageAccess().getSemicolonKeyword_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:719:4: (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' )
                    {
                    // InternalKerMLOC.g:719:4: (otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}' )
                    // InternalKerMLOC.g:720:5: otherlv_7= '{' ( (lv_elements_8_0= rulePackageBodyElement ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_7); 

                    					newLeafNode(otherlv_7, grammarAccess.getLibraryPackageAccess().getLeftCurlyBracketKeyword_6_1_0());
                    				
                    // InternalKerMLOC.g:724:5: ( (lv_elements_8_0= rulePackageBodyElement ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=RULE_STRING_VALUE && LA13_0<=RULE_EXP_VALUE)||LA13_0==14||LA13_0==16||(LA13_0>=18 && LA13_0<=20)||LA13_0==24||(LA13_0>=26 && LA13_0<=29)||LA13_0==31||LA13_0==33||LA13_0==37||(LA13_0>=41 && LA13_0<=55)||LA13_0==59||LA13_0==61||(LA13_0>=67 && LA13_0<=69)||(LA13_0>=83 && LA13_0<=86)||(LA13_0>=91 && LA13_0<=92)||LA13_0==96||LA13_0==98||LA13_0==103||LA13_0==105||LA13_0==108||(LA13_0>=119 && LA13_0<=123)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalKerMLOC.g:725:6: (lv_elements_8_0= rulePackageBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:725:6: (lv_elements_8_0= rulePackageBodyElement )
                    	    // InternalKerMLOC.g:726:7: lv_elements_8_0= rulePackageBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getLibraryPackageAccess().getElementsPackageBodyElementParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_8_0=rulePackageBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLibraryPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_8_0,
                    	    								"dut.control.kermloc.KerMLOC.PackageBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getLibraryPackageAccess().getRightCurlyBracketKeyword_6_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibraryPackage"


    // $ANTLR start "entryRuleDependency"
    // InternalKerMLOC.g:753:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalKerMLOC.g:753:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalKerMLOC.g:754:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalKerMLOC.g:760:1: ruleDependency returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'dependency' ( (this_Identification_3= ruleIdentification[$current] )? otherlv_4= 'from' )? ( (lv_client_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_client_7_0= ruleQualifiedName ) ) )* otherlv_8= 'to' ( (lv_supplier_9_0= ruleQualifiedName ) ) (otherlv_10= ',' ( (lv_supplier_11_0= ruleQualifiedName ) ) )* (otherlv_12= ';' | (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_PrefixMetadata_1 = null;

        EObject this_Identification_3 = null;

        AntlrDatatypeRuleToken lv_client_5_0 = null;

        AntlrDatatypeRuleToken lv_client_7_0 = null;

        AntlrDatatypeRuleToken lv_supplier_9_0 = null;

        AntlrDatatypeRuleToken lv_supplier_11_0 = null;

        EObject lv_elements_14_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:766:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'dependency' ( (this_Identification_3= ruleIdentification[$current] )? otherlv_4= 'from' )? ( (lv_client_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_client_7_0= ruleQualifiedName ) ) )* otherlv_8= 'to' ( (lv_supplier_9_0= ruleQualifiedName ) ) (otherlv_10= ',' ( (lv_supplier_11_0= ruleQualifiedName ) ) )* (otherlv_12= ';' | (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' ) ) ) )
            // InternalKerMLOC.g:767:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'dependency' ( (this_Identification_3= ruleIdentification[$current] )? otherlv_4= 'from' )? ( (lv_client_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_client_7_0= ruleQualifiedName ) ) )* otherlv_8= 'to' ( (lv_supplier_9_0= ruleQualifiedName ) ) (otherlv_10= ',' ( (lv_supplier_11_0= ruleQualifiedName ) ) )* (otherlv_12= ';' | (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' ) ) )
            {
            // InternalKerMLOC.g:767:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'dependency' ( (this_Identification_3= ruleIdentification[$current] )? otherlv_4= 'from' )? ( (lv_client_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_client_7_0= ruleQualifiedName ) ) )* otherlv_8= 'to' ( (lv_supplier_9_0= ruleQualifiedName ) ) (otherlv_10= ',' ( (lv_supplier_11_0= ruleQualifiedName ) ) )* (otherlv_12= ';' | (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' ) ) )
            // InternalKerMLOC.g:768:3: this_MemberPrefix_0= ruleMemberPrefix[$current] (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* otherlv_2= 'dependency' ( (this_Identification_3= ruleIdentification[$current] )? otherlv_4= 'from' )? ( (lv_client_5_0= ruleQualifiedName ) ) (otherlv_6= ',' ( (lv_client_7_0= ruleQualifiedName ) ) )* otherlv_8= 'to' ( (lv_supplier_9_0= ruleQualifiedName ) ) (otherlv_10= ',' ( (lv_supplier_11_0= ruleQualifiedName ) ) )* (otherlv_12= ';' | (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getDependencyRule());
            			}
            			newCompositeNode(grammarAccess.getDependencyAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:779:3: (this_PrefixMetadata_1= rulePrefixMetadata[$current] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_PREFIXNAME_TEXT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKerMLOC.g:780:4: this_PrefixMetadata_1= rulePrefixMetadata[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getDependencyRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getDependencyAccess().getPrefixMetadataParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_11);
            	    this_PrefixMetadata_1=rulePrefixMetadata(current);

            	    state._fsp--;


            	    				current = this_PrefixMetadata_1;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getDependencyKeyword_2());
            		
            // InternalKerMLOC.g:796:3: ( (this_Identification_3= ruleIdentification[$current] )? otherlv_4= 'from' )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case 21:
                case 38:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==21) ) {
                        alt17=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==21) ) {
                        alt17=1;
                    }
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // InternalKerMLOC.g:797:4: (this_Identification_3= ruleIdentification[$current] )? otherlv_4= 'from'
                    {
                    // InternalKerMLOC.g:797:4: (this_Identification_3= ruleIdentification[$current] )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)||LA16_0==38) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKerMLOC.g:798:5: this_Identification_3= ruleIdentification[$current]
                            {

                            					if (current==null) {
                            						current = createModelElement(grammarAccess.getDependencyRule());
                            					}
                            					newCompositeNode(grammarAccess.getDependencyAccess().getIdentificationParserRuleCall_3_0());
                            				
                            pushFollow(FOLLOW_13);
                            this_Identification_3=ruleIdentification(current);

                            state._fsp--;


                            					current = this_Identification_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDependencyAccess().getFromKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:815:3: ( (lv_client_5_0= ruleQualifiedName ) )
            // InternalKerMLOC.g:816:4: (lv_client_5_0= ruleQualifiedName )
            {
            // InternalKerMLOC.g:816:4: (lv_client_5_0= ruleQualifiedName )
            // InternalKerMLOC.g:817:5: lv_client_5_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDependencyAccess().getClientQualifiedNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_client_5_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependencyRule());
            					}
            					add(
            						current,
            						"client",
            						lv_client_5_0,
            						"dut.control.kermloc.KerMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:834:3: (otherlv_6= ',' ( (lv_client_7_0= ruleQualifiedName ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKerMLOC.g:835:4: otherlv_6= ',' ( (lv_client_7_0= ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDependencyAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalKerMLOC.g:839:4: ( (lv_client_7_0= ruleQualifiedName ) )
            	    // InternalKerMLOC.g:840:5: (lv_client_7_0= ruleQualifiedName )
            	    {
            	    // InternalKerMLOC.g:840:5: (lv_client_7_0= ruleQualifiedName )
            	    // InternalKerMLOC.g:841:6: lv_client_7_0= ruleQualifiedName
            	    {

            	    						newCompositeNode(grammarAccess.getDependencyAccess().getClientQualifiedNameParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_client_7_0=ruleQualifiedName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDependencyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"client",
            	    							lv_client_7_0,
            	    							"dut.control.kermloc.KerMLOC.QualifiedName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getDependencyAccess().getToKeyword_6());
            		
            // InternalKerMLOC.g:863:3: ( (lv_supplier_9_0= ruleQualifiedName ) )
            // InternalKerMLOC.g:864:4: (lv_supplier_9_0= ruleQualifiedName )
            {
            // InternalKerMLOC.g:864:4: (lv_supplier_9_0= ruleQualifiedName )
            // InternalKerMLOC.g:865:5: lv_supplier_9_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDependencyAccess().getSupplierQualifiedNameParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_supplier_9_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependencyRule());
            					}
            					add(
            						current,
            						"supplier",
            						lv_supplier_9_0,
            						"dut.control.kermloc.KerMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:882:3: (otherlv_10= ',' ( (lv_supplier_11_0= ruleQualifiedName ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKerMLOC.g:883:4: otherlv_10= ',' ( (lv_supplier_11_0= ruleQualifiedName ) )
            	    {
            	    otherlv_10=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_10, grammarAccess.getDependencyAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalKerMLOC.g:887:4: ( (lv_supplier_11_0= ruleQualifiedName ) )
            	    // InternalKerMLOC.g:888:5: (lv_supplier_11_0= ruleQualifiedName )
            	    {
            	    // InternalKerMLOC.g:888:5: (lv_supplier_11_0= ruleQualifiedName )
            	    // InternalKerMLOC.g:889:6: lv_supplier_11_0= ruleQualifiedName
            	    {

            	    						newCompositeNode(grammarAccess.getDependencyAccess().getSupplierQualifiedNameParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_supplier_11_0=ruleQualifiedName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDependencyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"supplier",
            	    							lv_supplier_11_0,
            	    							"dut.control.kermloc.KerMLOC.QualifiedName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalKerMLOC.g:907:3: (otherlv_12= ';' | (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            else if ( (LA21_0==16) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalKerMLOC.g:908:4: otherlv_12= ';'
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getDependencyAccess().getSemicolonKeyword_9_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:913:4: (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' )
                    {
                    // InternalKerMLOC.g:913:4: (otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}' )
                    // InternalKerMLOC.g:914:5: otherlv_13= '{' ( (lv_elements_14_0= ruleAnnotatingElement ) )* otherlv_15= '}'
                    {
                    otherlv_13=(Token)match(input,16,FOLLOW_16); 

                    					newLeafNode(otherlv_13, grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_9_1_0());
                    				
                    // InternalKerMLOC.g:918:5: ( (lv_elements_14_0= ruleAnnotatingElement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=RULE_STRING_VALUE && LA20_0<=RULE_REGULAR_COMMENT)||(LA20_0>=RULE_PREFIXNAME_TEXT && LA20_0<=RULE_EXP_VALUE)||LA20_0==14||LA20_0==16||(LA20_0>=18 && LA20_0<=20)||LA20_0==24||(LA20_0>=26 && LA20_0<=29)||LA20_0==31||LA20_0==33||LA20_0==37||(LA20_0>=41 && LA20_0<=42)||(LA20_0>=44 && LA20_0<=55)||LA20_0==59||LA20_0==61||(LA20_0>=67 && LA20_0<=69)||(LA20_0>=83 && LA20_0<=86)||(LA20_0>=91 && LA20_0<=92)||LA20_0==96||LA20_0==98||LA20_0==103||LA20_0==105||LA20_0==108||(LA20_0>=119 && LA20_0<=123)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalKerMLOC.g:919:6: (lv_elements_14_0= ruleAnnotatingElement )
                    	    {
                    	    // InternalKerMLOC.g:919:6: (lv_elements_14_0= ruleAnnotatingElement )
                    	    // InternalKerMLOC.g:920:7: lv_elements_14_0= ruleAnnotatingElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getDependencyAccess().getElementsAnnotatingElementParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_elements_14_0=ruleAnnotatingElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDependencyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_14_0,
                    	    								"dut.control.kermloc.KerMLOC.AnnotatingElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_15, grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_9_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleComment"
    // InternalKerMLOC.g:947:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalKerMLOC.g:947:48: (iv_ruleComment= ruleComment EOF )
            // InternalKerMLOC.g:948:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalKerMLOC.g:954:1: ruleComment returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'comment' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )? )? (otherlv_7= 'locale' ( (lv_locale_8_0= RULE_STRING_VALUE ) ) )? ( (lv_body_9_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_locale_8_0=null;
        Token lv_body_9_0=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_Identification_2 = null;

        AntlrDatatypeRuleToken lv_annotatedElement_4_0 = null;

        AntlrDatatypeRuleToken lv_annotatedElement_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:960:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'comment' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )? )? (otherlv_7= 'locale' ( (lv_locale_8_0= RULE_STRING_VALUE ) ) )? ( (lv_body_9_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalKerMLOC.g:961:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'comment' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )? )? (otherlv_7= 'locale' ( (lv_locale_8_0= RULE_STRING_VALUE ) ) )? ( (lv_body_9_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalKerMLOC.g:961:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'comment' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )? )? (otherlv_7= 'locale' ( (lv_locale_8_0= RULE_STRING_VALUE ) ) )? ( (lv_body_9_0= RULE_REGULAR_COMMENT ) ) )
            // InternalKerMLOC.g:962:3: this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'comment' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )? )? (otherlv_7= 'locale' ( (lv_locale_8_0= RULE_STRING_VALUE ) ) )? ( (lv_body_9_0= RULE_REGULAR_COMMENT ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getCommentRule());
            			}
            			newCompositeNode(grammarAccess.getCommentAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:973:3: (otherlv_1= 'comment' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKerMLOC.g:974:4: otherlv_1= 'comment' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )?
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getCommentKeyword_1_0());
                    			
                    // InternalKerMLOC.g:978:4: (this_Identification_2= ruleIdentification[$current] )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)||LA22_0==38) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalKerMLOC.g:979:5: this_Identification_2= ruleIdentification[$current]
                            {

                            					if (current==null) {
                            						current = createModelElement(grammarAccess.getCommentRule());
                            					}
                            					newCompositeNode(grammarAccess.getCommentAccess().getIdentificationParserRuleCall_1_1());
                            				
                            pushFollow(FOLLOW_19);
                            this_Identification_2=ruleIdentification(current);

                            state._fsp--;


                            					current = this_Identification_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalKerMLOC.g:991:4: (otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==25) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalKerMLOC.g:992:5: otherlv_3= 'about' ( (lv_annotatedElement_4_0= ruleQualifiedName ) ) (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )*
                            {
                            otherlv_3=(Token)match(input,25,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getCommentAccess().getAboutKeyword_1_2_0());
                            				
                            // InternalKerMLOC.g:996:5: ( (lv_annotatedElement_4_0= ruleQualifiedName ) )
                            // InternalKerMLOC.g:997:6: (lv_annotatedElement_4_0= ruleQualifiedName )
                            {
                            // InternalKerMLOC.g:997:6: (lv_annotatedElement_4_0= ruleQualifiedName )
                            // InternalKerMLOC.g:998:7: lv_annotatedElement_4_0= ruleQualifiedName
                            {

                            							newCompositeNode(grammarAccess.getCommentAccess().getAnnotatedElementQualifiedNameParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_20);
                            lv_annotatedElement_4_0=ruleQualifiedName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCommentRule());
                            							}
                            							add(
                            								current,
                            								"annotatedElement",
                            								lv_annotatedElement_4_0,
                            								"dut.control.kermloc.KerMLOC.QualifiedName");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalKerMLOC.g:1015:5: (otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==22) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalKerMLOC.g:1016:6: otherlv_5= ',' ( (lv_annotatedElement_6_0= ruleQualifiedName ) )
                            	    {
                            	    otherlv_5=(Token)match(input,22,FOLLOW_5); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getCommentAccess().getCommaKeyword_1_2_2_0());
                            	    					
                            	    // InternalKerMLOC.g:1020:6: ( (lv_annotatedElement_6_0= ruleQualifiedName ) )
                            	    // InternalKerMLOC.g:1021:7: (lv_annotatedElement_6_0= ruleQualifiedName )
                            	    {
                            	    // InternalKerMLOC.g:1021:7: (lv_annotatedElement_6_0= ruleQualifiedName )
                            	    // InternalKerMLOC.g:1022:8: lv_annotatedElement_6_0= ruleQualifiedName
                            	    {

                            	    								newCompositeNode(grammarAccess.getCommentAccess().getAnnotatedElementQualifiedNameParserRuleCall_1_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_20);
                            	    lv_annotatedElement_6_0=ruleQualifiedName();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getCommentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"annotatedElement",
                            	    									lv_annotatedElement_6_0,
                            	    									"dut.control.kermloc.KerMLOC.QualifiedName");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:1042:3: (otherlv_7= 'locale' ( (lv_locale_8_0= RULE_STRING_VALUE ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKerMLOC.g:1043:4: otherlv_7= 'locale' ( (lv_locale_8_0= RULE_STRING_VALUE ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommentAccess().getLocaleKeyword_2_0());
                    			
                    // InternalKerMLOC.g:1047:4: ( (lv_locale_8_0= RULE_STRING_VALUE ) )
                    // InternalKerMLOC.g:1048:5: (lv_locale_8_0= RULE_STRING_VALUE )
                    {
                    // InternalKerMLOC.g:1048:5: (lv_locale_8_0= RULE_STRING_VALUE )
                    // InternalKerMLOC.g:1049:6: lv_locale_8_0= RULE_STRING_VALUE
                    {
                    lv_locale_8_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_22); 

                    						newLeafNode(lv_locale_8_0, grammarAccess.getCommentAccess().getLocaleSTRING_VALUETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"locale",
                    							lv_locale_8_0,
                    							"dut.control.kermloc.KerMLOC.STRING_VALUE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:1066:3: ( (lv_body_9_0= RULE_REGULAR_COMMENT ) )
            // InternalKerMLOC.g:1067:4: (lv_body_9_0= RULE_REGULAR_COMMENT )
            {
            // InternalKerMLOC.g:1067:4: (lv_body_9_0= RULE_REGULAR_COMMENT )
            // InternalKerMLOC.g:1068:5: lv_body_9_0= RULE_REGULAR_COMMENT
            {
            lv_body_9_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_body_9_0, grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_9_0,
            						"dut.control.kermloc.KerMLOC.REGULAR_COMMENT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleDocumentation"
    // InternalKerMLOC.g:1088:1: entryRuleDocumentation returns [EObject current=null] : iv_ruleDocumentation= ruleDocumentation EOF ;
    public final EObject entryRuleDocumentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentation = null;


        try {
            // InternalKerMLOC.g:1088:54: (iv_ruleDocumentation= ruleDocumentation EOF )
            // InternalKerMLOC.g:1089:2: iv_ruleDocumentation= ruleDocumentation EOF
            {
             newCompositeNode(grammarAccess.getDocumentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentation=ruleDocumentation();

            state._fsp--;

             current =iv_ruleDocumentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentation"


    // $ANTLR start "ruleDocumentation"
    // InternalKerMLOC.g:1095:1: ruleDocumentation returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'doc' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'locale' ( (lv_locale_4_0= RULE_STRING_VALUE ) ) )? ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleDocumentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_locale_4_0=null;
        Token lv_body_5_0=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_Identification_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1101:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'doc' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'locale' ( (lv_locale_4_0= RULE_STRING_VALUE ) ) )? ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalKerMLOC.g:1102:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'doc' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'locale' ( (lv_locale_4_0= RULE_STRING_VALUE ) ) )? ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalKerMLOC.g:1102:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'doc' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'locale' ( (lv_locale_4_0= RULE_STRING_VALUE ) ) )? ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) )
            // InternalKerMLOC.g:1103:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'doc' (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= 'locale' ( (lv_locale_4_0= RULE_STRING_VALUE ) ) )? ( (lv_body_5_0= RULE_REGULAR_COMMENT ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getDocumentationRule());
            			}
            			newCompositeNode(grammarAccess.getDocumentationAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentationAccess().getDocKeyword_1());
            		
            // InternalKerMLOC.g:1118:3: (this_Identification_2= ruleIdentification[$current] )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)||LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKerMLOC.g:1119:4: this_Identification_2= ruleIdentification[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getDocumentationRule());
                    				}
                    				newCompositeNode(grammarAccess.getDocumentationAccess().getIdentificationParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_25);
                    this_Identification_2=ruleIdentification(current);

                    state._fsp--;


                    				current = this_Identification_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1131:3: (otherlv_3= 'locale' ( (lv_locale_4_0= RULE_STRING_VALUE ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKerMLOC.g:1132:4: otherlv_3= 'locale' ( (lv_locale_4_0= RULE_STRING_VALUE ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getDocumentationAccess().getLocaleKeyword_3_0());
                    			
                    // InternalKerMLOC.g:1136:4: ( (lv_locale_4_0= RULE_STRING_VALUE ) )
                    // InternalKerMLOC.g:1137:5: (lv_locale_4_0= RULE_STRING_VALUE )
                    {
                    // InternalKerMLOC.g:1137:5: (lv_locale_4_0= RULE_STRING_VALUE )
                    // InternalKerMLOC.g:1138:6: lv_locale_4_0= RULE_STRING_VALUE
                    {
                    lv_locale_4_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_22); 

                    						newLeafNode(lv_locale_4_0, grammarAccess.getDocumentationAccess().getLocaleSTRING_VALUETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDocumentationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"locale",
                    							lv_locale_4_0,
                    							"dut.control.kermloc.KerMLOC.STRING_VALUE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:1155:3: ( (lv_body_5_0= RULE_REGULAR_COMMENT ) )
            // InternalKerMLOC.g:1156:4: (lv_body_5_0= RULE_REGULAR_COMMENT )
            {
            // InternalKerMLOC.g:1156:4: (lv_body_5_0= RULE_REGULAR_COMMENT )
            // InternalKerMLOC.g:1157:5: lv_body_5_0= RULE_REGULAR_COMMENT
            {
            lv_body_5_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_body_5_0, grammarAccess.getDocumentationAccess().getBodyREGULAR_COMMENTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_5_0,
            						"dut.control.kermloc.KerMLOC.REGULAR_COMMENT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentation"


    // $ANTLR start "entryRuleTextualRepresentation"
    // InternalKerMLOC.g:1177:1: entryRuleTextualRepresentation returns [EObject current=null] : iv_ruleTextualRepresentation= ruleTextualRepresentation EOF ;
    public final EObject entryRuleTextualRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualRepresentation = null;


        try {
            // InternalKerMLOC.g:1177:62: (iv_ruleTextualRepresentation= ruleTextualRepresentation EOF )
            // InternalKerMLOC.g:1178:2: iv_ruleTextualRepresentation= ruleTextualRepresentation EOF
            {
             newCompositeNode(grammarAccess.getTextualRepresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextualRepresentation=ruleTextualRepresentation();

            state._fsp--;

             current =iv_ruleTextualRepresentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextualRepresentation"


    // $ANTLR start "ruleTextualRepresentation"
    // InternalKerMLOC.g:1184:1: ruleTextualRepresentation returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'rep' (this_Identification_2= ruleIdentification[$current] )? )? otherlv_3= 'language' ( (lv_language_4_0= RULE_STRING_VALUE ) ) ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleTextualRepresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_language_4_0=null;
        Token lv_body_5_0=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_Identification_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1190:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'rep' (this_Identification_2= ruleIdentification[$current] )? )? otherlv_3= 'language' ( (lv_language_4_0= RULE_STRING_VALUE ) ) ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalKerMLOC.g:1191:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'rep' (this_Identification_2= ruleIdentification[$current] )? )? otherlv_3= 'language' ( (lv_language_4_0= RULE_STRING_VALUE ) ) ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalKerMLOC.g:1191:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'rep' (this_Identification_2= ruleIdentification[$current] )? )? otherlv_3= 'language' ( (lv_language_4_0= RULE_STRING_VALUE ) ) ( (lv_body_5_0= RULE_REGULAR_COMMENT ) ) )
            // InternalKerMLOC.g:1192:3: this_MemberPrefix_0= ruleMemberPrefix[$current] (otherlv_1= 'rep' (this_Identification_2= ruleIdentification[$current] )? )? otherlv_3= 'language' ( (lv_language_4_0= RULE_STRING_VALUE ) ) ( (lv_body_5_0= RULE_REGULAR_COMMENT ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getTextualRepresentationRule());
            			}
            			newCompositeNode(grammarAccess.getTextualRepresentationAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1203:3: (otherlv_1= 'rep' (this_Identification_2= ruleIdentification[$current] )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKerMLOC.g:1204:4: otherlv_1= 'rep' (this_Identification_2= ruleIdentification[$current] )?
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextualRepresentationAccess().getRepKeyword_1_0());
                    			
                    // InternalKerMLOC.g:1208:4: (this_Identification_2= ruleIdentification[$current] )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_UNRESTRICTED_NAME)||LA29_0==38) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalKerMLOC.g:1209:5: this_Identification_2= ruleIdentification[$current]
                            {

                            					if (current==null) {
                            						current = createModelElement(grammarAccess.getTextualRepresentationRule());
                            					}
                            					newCompositeNode(grammarAccess.getTextualRepresentationAccess().getIdentificationParserRuleCall_1_1());
                            				
                            pushFollow(FOLLOW_28);
                            this_Identification_2=ruleIdentification(current);

                            state._fsp--;


                            					current = this_Identification_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTextualRepresentationAccess().getLanguageKeyword_2());
            		
            // InternalKerMLOC.g:1226:3: ( (lv_language_4_0= RULE_STRING_VALUE ) )
            // InternalKerMLOC.g:1227:4: (lv_language_4_0= RULE_STRING_VALUE )
            {
            // InternalKerMLOC.g:1227:4: (lv_language_4_0= RULE_STRING_VALUE )
            // InternalKerMLOC.g:1228:5: lv_language_4_0= RULE_STRING_VALUE
            {
            lv_language_4_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_22); 

            					newLeafNode(lv_language_4_0, grammarAccess.getTextualRepresentationAccess().getLanguageSTRING_VALUETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextualRepresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_4_0,
            						"dut.control.kermloc.KerMLOC.STRING_VALUE");
            				

            }


            }

            // InternalKerMLOC.g:1244:3: ( (lv_body_5_0= RULE_REGULAR_COMMENT ) )
            // InternalKerMLOC.g:1245:4: (lv_body_5_0= RULE_REGULAR_COMMENT )
            {
            // InternalKerMLOC.g:1245:4: (lv_body_5_0= RULE_REGULAR_COMMENT )
            // InternalKerMLOC.g:1246:5: lv_body_5_0= RULE_REGULAR_COMMENT
            {
            lv_body_5_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_body_5_0, grammarAccess.getTextualRepresentationAccess().getBodyREGULAR_COMMENTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextualRepresentationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_5_0,
            						"dut.control.kermloc.KerMLOC.REGULAR_COMMENT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextualRepresentation"


    // $ANTLR start "entryRuleImportElement"
    // InternalKerMLOC.g:1266:1: entryRuleImportElement returns [EObject current=null] : iv_ruleImportElement= ruleImportElement EOF ;
    public final EObject entryRuleImportElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportElement = null;


        try {
            // InternalKerMLOC.g:1266:54: (iv_ruleImportElement= ruleImportElement EOF )
            // InternalKerMLOC.g:1267:2: iv_ruleImportElement= ruleImportElement EOF
            {
             newCompositeNode(grammarAccess.getImportElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportElement=ruleImportElement();

            state._fsp--;

             current =iv_ruleImportElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportElement"


    // $ANTLR start "ruleImportElement"
    // InternalKerMLOC.g:1273:1: ruleImportElement returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_isImportAll_2_0= 'all' ) )? ( (lv_declaredName_3_0= ruleQualifiedName ) ) ( ( (lv_isNamespace_4_0= '::' ) ) otherlv_5= '*' )? (otherlv_6= '::' ( (lv_isRecursive_7_0= '**' ) ) )? (otherlv_8= '[' ( (lv_filterPackageExpression_9_0= ruleExpression ) ) otherlv_10= ']' )* (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' ) ) ) ;
    public final EObject ruleImportElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isImportAll_2_0=null;
        Token lv_isNamespace_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_isRecursive_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;

        AntlrDatatypeRuleToken lv_filterPackageExpression_9_0 = null;

        EObject lv_elements_13_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1279:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_isImportAll_2_0= 'all' ) )? ( (lv_declaredName_3_0= ruleQualifiedName ) ) ( ( (lv_isNamespace_4_0= '::' ) ) otherlv_5= '*' )? (otherlv_6= '::' ( (lv_isRecursive_7_0= '**' ) ) )? (otherlv_8= '[' ( (lv_filterPackageExpression_9_0= ruleExpression ) ) otherlv_10= ']' )* (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' ) ) ) )
            // InternalKerMLOC.g:1280:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_isImportAll_2_0= 'all' ) )? ( (lv_declaredName_3_0= ruleQualifiedName ) ) ( ( (lv_isNamespace_4_0= '::' ) ) otherlv_5= '*' )? (otherlv_6= '::' ( (lv_isRecursive_7_0= '**' ) ) )? (otherlv_8= '[' ( (lv_filterPackageExpression_9_0= ruleExpression ) ) otherlv_10= ']' )* (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' ) ) )
            {
            // InternalKerMLOC.g:1280:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_isImportAll_2_0= 'all' ) )? ( (lv_declaredName_3_0= ruleQualifiedName ) ) ( ( (lv_isNamespace_4_0= '::' ) ) otherlv_5= '*' )? (otherlv_6= '::' ( (lv_isRecursive_7_0= '**' ) ) )? (otherlv_8= '[' ( (lv_filterPackageExpression_9_0= ruleExpression ) ) otherlv_10= ']' )* (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' ) ) )
            // InternalKerMLOC.g:1281:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_isImportAll_2_0= 'all' ) )? ( (lv_declaredName_3_0= ruleQualifiedName ) ) ( ( (lv_isNamespace_4_0= '::' ) ) otherlv_5= '*' )? (otherlv_6= '::' ( (lv_isRecursive_7_0= '**' ) ) )? (otherlv_8= '[' ( (lv_filterPackageExpression_9_0= ruleExpression ) ) otherlv_10= ']' )* (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' ) )
            {
            // InternalKerMLOC.g:1281:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalKerMLOC.g:1282:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalKerMLOC.g:1282:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalKerMLOC.g:1283:5: lv_visibility_0_0= ruleVisibilityIndicator
            {

            					newCompositeNode(grammarAccess.getImportElementAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_visibility_0_0=ruleVisibilityIndicator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportElementRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"dut.control.kermloc.KerMLOC.VisibilityIndicator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getImportElementAccess().getImportKeyword_1());
            		
            // InternalKerMLOC.g:1304:3: ( (lv_isImportAll_2_0= 'all' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKerMLOC.g:1305:4: (lv_isImportAll_2_0= 'all' )
                    {
                    // InternalKerMLOC.g:1305:4: (lv_isImportAll_2_0= 'all' )
                    // InternalKerMLOC.g:1306:5: lv_isImportAll_2_0= 'all'
                    {
                    lv_isImportAll_2_0=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(lv_isImportAll_2_0, grammarAccess.getImportElementAccess().getIsImportAllAllKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportElementRule());
                    					}
                    					setWithLastConsumed(current, "isImportAll", lv_isImportAll_2_0 != null, "all");
                    				

                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:1318:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalKerMLOC.g:1319:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalKerMLOC.g:1319:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalKerMLOC.g:1320:5: lv_declaredName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportElementAccess().getDeclaredNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_declaredName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportElementRule());
            					}
            					set(
            						current,
            						"declaredName",
            						lv_declaredName_3_0,
            						"dut.control.kermloc.KerMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:1337:3: ( ( (lv_isNamespace_4_0= '::' ) ) otherlv_5= '*' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==33) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalKerMLOC.g:1338:4: ( (lv_isNamespace_4_0= '::' ) ) otherlv_5= '*'
                    {
                    // InternalKerMLOC.g:1338:4: ( (lv_isNamespace_4_0= '::' ) )
                    // InternalKerMLOC.g:1339:5: (lv_isNamespace_4_0= '::' )
                    {
                    // InternalKerMLOC.g:1339:5: (lv_isNamespace_4_0= '::' )
                    // InternalKerMLOC.g:1340:6: lv_isNamespace_4_0= '::'
                    {
                    lv_isNamespace_4_0=(Token)match(input,32,FOLLOW_32); 

                    						newLeafNode(lv_isNamespace_4_0, grammarAccess.getImportElementAccess().getIsNamespaceColonColonKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportElementRule());
                    						}
                    						setWithLastConsumed(current, "isNamespace", lv_isNamespace_4_0 != null, "::");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getImportElementAccess().getAsteriskKeyword_4_1());
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1357:3: (otherlv_6= '::' ( (lv_isRecursive_7_0= '**' ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKerMLOC.g:1358:4: otherlv_6= '::' ( (lv_isRecursive_7_0= '**' ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getImportElementAccess().getColonColonKeyword_5_0());
                    			
                    // InternalKerMLOC.g:1362:4: ( (lv_isRecursive_7_0= '**' ) )
                    // InternalKerMLOC.g:1363:5: (lv_isRecursive_7_0= '**' )
                    {
                    // InternalKerMLOC.g:1363:5: (lv_isRecursive_7_0= '**' )
                    // InternalKerMLOC.g:1364:6: lv_isRecursive_7_0= '**'
                    {
                    lv_isRecursive_7_0=(Token)match(input,34,FOLLOW_34); 

                    						newLeafNode(lv_isRecursive_7_0, grammarAccess.getImportElementAccess().getIsRecursiveAsteriskAsteriskKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportElementRule());
                    						}
                    						setWithLastConsumed(current, "isRecursive", lv_isRecursive_7_0 != null, "**");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:1377:3: (otherlv_8= '[' ( (lv_filterPackageExpression_9_0= ruleExpression ) ) otherlv_10= ']' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKerMLOC.g:1378:4: otherlv_8= '[' ( (lv_filterPackageExpression_9_0= ruleExpression ) ) otherlv_10= ']'
            	    {
            	    otherlv_8=(Token)match(input,35,FOLLOW_35); 

            	    				newLeafNode(otherlv_8, grammarAccess.getImportElementAccess().getLeftSquareBracketKeyword_6_0());
            	    			
            	    // InternalKerMLOC.g:1382:4: ( (lv_filterPackageExpression_9_0= ruleExpression ) )
            	    // InternalKerMLOC.g:1383:5: (lv_filterPackageExpression_9_0= ruleExpression )
            	    {
            	    // InternalKerMLOC.g:1383:5: (lv_filterPackageExpression_9_0= ruleExpression )
            	    // InternalKerMLOC.g:1384:6: lv_filterPackageExpression_9_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getImportElementAccess().getFilterPackageExpressionExpressionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_filterPackageExpression_9_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImportElementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"filterPackageExpression",
            	    							lv_filterPackageExpression_9_0,
            	    							"dut.control.kermloc.KerMLOC.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,36,FOLLOW_34); 

            	    				newLeafNode(otherlv_10, grammarAccess.getImportElementAccess().getRightSquareBracketKeyword_6_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalKerMLOC.g:1406:3: (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==15) ) {
                alt36=1;
            }
            else if ( (LA36_0==16) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalKerMLOC.g:1407:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getImportElementAccess().getSemicolonKeyword_7_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1412:4: (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' )
                    {
                    // InternalKerMLOC.g:1412:4: (otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}' )
                    // InternalKerMLOC.g:1413:5: otherlv_12= '{' ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_37); 

                    					newLeafNode(otherlv_12, grammarAccess.getImportElementAccess().getLeftCurlyBracketKeyword_7_1_0());
                    				
                    // InternalKerMLOC.g:1417:5: ( (lv_elements_13_0= ruleAnnotatingBodyElement ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=RULE_STRING_VALUE && LA35_0<=RULE_EXP_VALUE)||LA35_0==14||LA35_0==16||(LA35_0>=18 && LA35_0<=20)||LA35_0==24||(LA35_0>=26 && LA35_0<=29)||LA35_0==31||LA35_0==33||LA35_0==37||(LA35_0>=41 && LA35_0<=42)||(LA35_0>=44 && LA35_0<=55)||LA35_0==59||LA35_0==61||(LA35_0>=67 && LA35_0<=69)||(LA35_0>=83 && LA35_0<=86)||(LA35_0>=91 && LA35_0<=92)||LA35_0==96||LA35_0==98||LA35_0==103||LA35_0==105||LA35_0==108||(LA35_0>=119 && LA35_0<=123)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalKerMLOC.g:1418:6: (lv_elements_13_0= ruleAnnotatingBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:1418:6: (lv_elements_13_0= ruleAnnotatingBodyElement )
                    	    // InternalKerMLOC.g:1419:7: lv_elements_13_0= ruleAnnotatingBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getImportElementAccess().getElementsAnnotatingBodyElementParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_elements_13_0=ruleAnnotatingBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImportElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_13_0,
                    	    								"dut.control.kermloc.KerMLOC.AnnotatingBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_14, grammarAccess.getImportElementAccess().getRightCurlyBracketKeyword_7_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportElement"


    // $ANTLR start "entryRuleCodeAnnotation"
    // InternalKerMLOC.g:1446:1: entryRuleCodeAnnotation returns [EObject current=null] : iv_ruleCodeAnnotation= ruleCodeAnnotation EOF ;
    public final EObject entryRuleCodeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeAnnotation = null;


        try {
            // InternalKerMLOC.g:1446:55: (iv_ruleCodeAnnotation= ruleCodeAnnotation EOF )
            // InternalKerMLOC.g:1447:2: iv_ruleCodeAnnotation= ruleCodeAnnotation EOF
            {
             newCompositeNode(grammarAccess.getCodeAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeAnnotation=ruleCodeAnnotation();

            state._fsp--;

             current =iv_ruleCodeAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeAnnotation"


    // $ANTLR start "ruleCodeAnnotation"
    // InternalKerMLOC.g:1453:1: ruleCodeAnnotation returns [EObject current=null] : ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) ) ;
    public final EObject ruleCodeAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:1459:2: ( ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) ) )
            // InternalKerMLOC.g:1460:2: ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) )
            {
            // InternalKerMLOC.g:1460:2: ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_SL_NOTE) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ML_NOTE) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalKerMLOC.g:1461:3: ( (lv_body_0_0= RULE_SL_NOTE ) )
                    {
                    // InternalKerMLOC.g:1461:3: ( (lv_body_0_0= RULE_SL_NOTE ) )
                    // InternalKerMLOC.g:1462:4: (lv_body_0_0= RULE_SL_NOTE )
                    {
                    // InternalKerMLOC.g:1462:4: (lv_body_0_0= RULE_SL_NOTE )
                    // InternalKerMLOC.g:1463:5: lv_body_0_0= RULE_SL_NOTE
                    {
                    lv_body_0_0=(Token)match(input,RULE_SL_NOTE,FOLLOW_2); 

                    					newLeafNode(lv_body_0_0, grammarAccess.getCodeAnnotationAccess().getBodySL_NOTETerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCodeAnnotationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"body",
                    						lv_body_0_0,
                    						"dut.control.kermloc.KerMLOC.SL_NOTE");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1480:3: ( (lv_body_1_0= RULE_ML_NOTE ) )
                    {
                    // InternalKerMLOC.g:1480:3: ( (lv_body_1_0= RULE_ML_NOTE ) )
                    // InternalKerMLOC.g:1481:4: (lv_body_1_0= RULE_ML_NOTE )
                    {
                    // InternalKerMLOC.g:1481:4: (lv_body_1_0= RULE_ML_NOTE )
                    // InternalKerMLOC.g:1482:5: lv_body_1_0= RULE_ML_NOTE
                    {
                    lv_body_1_0=(Token)match(input,RULE_ML_NOTE,FOLLOW_2); 

                    					newLeafNode(lv_body_1_0, grammarAccess.getCodeAnnotationAccess().getBodyML_NOTETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCodeAnnotationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"body",
                    						lv_body_1_0,
                    						"dut.control.kermloc.KerMLOC.ML_NOTE");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeAnnotation"


    // $ANTLR start "entryRuleAliasElement"
    // InternalKerMLOC.g:1502:1: entryRuleAliasElement returns [EObject current=null] : iv_ruleAliasElement= ruleAliasElement EOF ;
    public final EObject entryRuleAliasElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasElement = null;


        try {
            // InternalKerMLOC.g:1502:53: (iv_ruleAliasElement= ruleAliasElement EOF )
            // InternalKerMLOC.g:1503:2: iv_ruleAliasElement= ruleAliasElement EOF
            {
             newCompositeNode(grammarAccess.getAliasElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliasElement=ruleAliasElement();

            state._fsp--;

             current =iv_ruleAliasElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasElement"


    // $ANTLR start "ruleAliasElement"
    // InternalKerMLOC.g:1509:1: ruleAliasElement returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' ) ) ) ;
    public final EObject ruleAliasElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_MemberPrefix_0 = null;

        AntlrDatatypeRuleToken lv_memberShortName_3_0 = null;

        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_memberElement_7_0 = null;

        EObject lv_elements_10_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1515:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' ) ) ) )
            // InternalKerMLOC.g:1516:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' ) ) )
            {
            // InternalKerMLOC.g:1516:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' ) ) )
            // InternalKerMLOC.g:1517:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAliasElementRule());
            			}
            			newCompositeNode(grammarAccess.getAliasElementAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,37,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getAliasElementAccess().getAliasKeyword_1());
            		
            // InternalKerMLOC.g:1532:3: (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKerMLOC.g:1533:4: otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAliasElementAccess().getLessThanSignKeyword_2_0());
                    			
                    // InternalKerMLOC.g:1537:4: ( (lv_memberShortName_3_0= ruleName ) )
                    // InternalKerMLOC.g:1538:5: (lv_memberShortName_3_0= ruleName )
                    {
                    // InternalKerMLOC.g:1538:5: (lv_memberShortName_3_0= ruleName )
                    // InternalKerMLOC.g:1539:6: lv_memberShortName_3_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getAliasElementAccess().getMemberShortNameNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_memberShortName_3_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAliasElementRule());
                    						}
                    						set(
                    							current,
                    							"memberShortName",
                    							lv_memberShortName_3_0,
                    							"dut.control.kermloc.KerMLOC.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getAliasElementAccess().getGreaterThanSignKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1561:3: ( (lv_memberName_5_0= ruleName ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKerMLOC.g:1562:4: (lv_memberName_5_0= ruleName )
                    {
                    // InternalKerMLOC.g:1562:4: (lv_memberName_5_0= ruleName )
                    // InternalKerMLOC.g:1563:5: lv_memberName_5_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getAliasElementAccess().getMemberNameNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_memberName_5_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAliasElementRule());
                    					}
                    					set(
                    						current,
                    						"memberName",
                    						lv_memberName_5_0,
                    						"dut.control.kermloc.KerMLOC.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getAliasElementAccess().getForKeyword_4());
            		
            // InternalKerMLOC.g:1584:3: ( (lv_memberElement_7_0= ruleQualifiedName ) )
            // InternalKerMLOC.g:1585:4: (lv_memberElement_7_0= ruleQualifiedName )
            {
            // InternalKerMLOC.g:1585:4: (lv_memberElement_7_0= ruleQualifiedName )
            // InternalKerMLOC.g:1586:5: lv_memberElement_7_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAliasElementAccess().getMemberElementQualifiedNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_memberElement_7_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasElementRule());
            					}
            					set(
            						current,
            						"memberElement",
            						lv_memberElement_7_0,
            						"dut.control.kermloc.KerMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:1603:3: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                alt41=1;
            }
            else if ( (LA41_0==16) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLOC.g:1604:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAliasElementAccess().getSemicolonKeyword_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1609:4: (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' )
                    {
                    // InternalKerMLOC.g:1609:4: (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}' )
                    // InternalKerMLOC.g:1610:5: otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_37); 

                    					newLeafNode(otherlv_9, grammarAccess.getAliasElementAccess().getLeftCurlyBracketKeyword_6_1_0());
                    				
                    // InternalKerMLOC.g:1614:5: ( (lv_elements_10_0= ruleAnnotatingBodyElement ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_STRING_VALUE && LA40_0<=RULE_EXP_VALUE)||LA40_0==14||LA40_0==16||(LA40_0>=18 && LA40_0<=20)||LA40_0==24||(LA40_0>=26 && LA40_0<=29)||LA40_0==31||LA40_0==33||LA40_0==37||(LA40_0>=41 && LA40_0<=42)||(LA40_0>=44 && LA40_0<=55)||LA40_0==59||LA40_0==61||(LA40_0>=67 && LA40_0<=69)||(LA40_0>=83 && LA40_0<=86)||(LA40_0>=91 && LA40_0<=92)||LA40_0==96||LA40_0==98||LA40_0==103||LA40_0==105||LA40_0==108||(LA40_0>=119 && LA40_0<=123)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalKerMLOC.g:1615:6: (lv_elements_10_0= ruleAnnotatingBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:1615:6: (lv_elements_10_0= ruleAnnotatingBodyElement )
                    	    // InternalKerMLOC.g:1616:7: lv_elements_10_0= ruleAnnotatingBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAliasElementAccess().getElementsAnnotatingBodyElementParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_elements_10_0=ruleAnnotatingBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAliasElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_10_0,
                    	    								"dut.control.kermloc.KerMLOC.AnnotatingBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getAliasElementAccess().getRightCurlyBracketKeyword_6_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasElement"


    // $ANTLR start "entryRuleElementFilterElement"
    // InternalKerMLOC.g:1643:1: entryRuleElementFilterElement returns [EObject current=null] : iv_ruleElementFilterElement= ruleElementFilterElement EOF ;
    public final EObject entryRuleElementFilterElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementFilterElement = null;


        try {
            // InternalKerMLOC.g:1643:61: (iv_ruleElementFilterElement= ruleElementFilterElement EOF )
            // InternalKerMLOC.g:1644:2: iv_ruleElementFilterElement= ruleElementFilterElement EOF
            {
             newCompositeNode(grammarAccess.getElementFilterElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementFilterElement=ruleElementFilterElement();

            state._fsp--;

             current =iv_ruleElementFilterElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementFilterElement"


    // $ANTLR start "ruleElementFilterElement"
    // InternalKerMLOC.g:1650:1: ruleElementFilterElement returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'filter' ( (lv_filterExpression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleElementFilterElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MemberPrefix_0 = null;

        AntlrDatatypeRuleToken lv_filterExpression_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1656:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'filter' ( (lv_filterExpression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalKerMLOC.g:1657:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'filter' ( (lv_filterExpression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalKerMLOC.g:1657:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'filter' ( (lv_filterExpression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalKerMLOC.g:1658:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'filter' ( (lv_filterExpression_2_0= ruleExpression ) ) otherlv_3= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getElementFilterElementRule());
            			}
            			newCompositeNode(grammarAccess.getElementFilterElementAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,41,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getElementFilterElementAccess().getFilterKeyword_1());
            		
            // InternalKerMLOC.g:1673:3: ( (lv_filterExpression_2_0= ruleExpression ) )
            // InternalKerMLOC.g:1674:4: (lv_filterExpression_2_0= ruleExpression )
            {
            // InternalKerMLOC.g:1674:4: (lv_filterExpression_2_0= ruleExpression )
            // InternalKerMLOC.g:1675:5: lv_filterExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getElementFilterElementAccess().getFilterExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
            lv_filterExpression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementFilterElementRule());
            					}
            					set(
            						current,
            						"filterExpression",
            						lv_filterExpression_2_0,
            						"dut.control.kermloc.KerMLOC.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getElementFilterElementAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementFilterElement"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalKerMLOC.g:1700:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalKerMLOC.g:1700:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalKerMLOC.g:1701:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalKerMLOC.g:1707:1: ruleMultiplicity returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'multiplicity' (this_Identification_2= ruleIdentification[$current] )? (this_Subsets_3= ruleSubsets[$current] | this_MultiplicityBounds_4= ruleMultiplicityBounds[$current] ) (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_Identification_2 = null;

        EObject this_Subsets_3 = null;

        EObject this_MultiplicityBounds_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1713:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'multiplicity' (this_Identification_2= ruleIdentification[$current] )? (this_Subsets_3= ruleSubsets[$current] | this_MultiplicityBounds_4= ruleMultiplicityBounds[$current] ) (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalKerMLOC.g:1714:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'multiplicity' (this_Identification_2= ruleIdentification[$current] )? (this_Subsets_3= ruleSubsets[$current] | this_MultiplicityBounds_4= ruleMultiplicityBounds[$current] ) (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalKerMLOC.g:1714:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'multiplicity' (this_Identification_2= ruleIdentification[$current] )? (this_Subsets_3= ruleSubsets[$current] | this_MultiplicityBounds_4= ruleMultiplicityBounds[$current] ) (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalKerMLOC.g:1715:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'multiplicity' (this_Identification_2= ruleIdentification[$current] )? (this_Subsets_3= ruleSubsets[$current] | this_MultiplicityBounds_4= ruleMultiplicityBounds[$current] ) (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getMultiplicityRule());
            			}
            			newCompositeNode(grammarAccess.getMultiplicityAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,42,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getMultiplicityKeyword_1());
            		
            // InternalKerMLOC.g:1730:3: (this_Identification_2= ruleIdentification[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_UNRESTRICTED_NAME)||LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKerMLOC.g:1731:4: this_Identification_2= ruleIdentification[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMultiplicityRule());
                    				}
                    				newCompositeNode(grammarAccess.getMultiplicityAccess().getIdentificationParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_46);
                    this_Identification_2=ruleIdentification(current);

                    state._fsp--;


                    				current = this_Identification_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1743:3: (this_Subsets_3= ruleSubsets[$current] | this_MultiplicityBounds_4= ruleMultiplicityBounds[$current] )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=57 && LA43_0<=58)) ) {
                alt43=1;
            }
            else if ( (LA43_0==35) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalKerMLOC.g:1744:4: this_Subsets_3= ruleSubsets[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMultiplicityRule());
                    				}
                    				newCompositeNode(grammarAccess.getMultiplicityAccess().getSubsetsParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Subsets_3=ruleSubsets(current);

                    state._fsp--;


                    				current = this_Subsets_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1756:4: this_MultiplicityBounds_4= ruleMultiplicityBounds[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMultiplicityRule());
                    				}
                    				newCompositeNode(grammarAccess.getMultiplicityAccess().getMultiplicityBoundsParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_MultiplicityBounds_4=ruleMultiplicityBounds(current);

                    state._fsp--;


                    				current = this_MultiplicityBounds_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1768:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==15) ) {
                alt45=1;
            }
            else if ( (LA45_0==16) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalKerMLOC.g:1769:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getMultiplicityAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1774:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalKerMLOC.g:1774:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' )
                    // InternalKerMLOC.g:1775:5: otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_6, grammarAccess.getMultiplicityAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:1779:5: ( (lv_elements_7_0= ruleTypeBodyElement ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=RULE_STRING_VALUE && LA44_0<=RULE_EXP_VALUE)||LA44_0==14||LA44_0==16||(LA44_0>=18 && LA44_0<=20)||LA44_0==24||(LA44_0>=26 && LA44_0<=29)||LA44_0==31||LA44_0==33||LA44_0==37||(LA44_0>=41 && LA44_0<=55)||LA44_0==59||LA44_0==61||(LA44_0>=67 && LA44_0<=69)||(LA44_0>=83 && LA44_0<=86)||(LA44_0>=91 && LA44_0<=92)||LA44_0==96||LA44_0==98||LA44_0==103||LA44_0==105||LA44_0==108||(LA44_0>=119 && LA44_0<=123)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalKerMLOC.g:1780:6: (lv_elements_7_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:1780:6: (lv_elements_7_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:1781:7: lv_elements_7_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMultiplicityAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_7_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getMultiplicityAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleNamespace"
    // InternalKerMLOC.g:1808:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalKerMLOC.g:1808:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalKerMLOC.g:1809:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalKerMLOC.g:1815:1: ruleNamespace returns [EObject current=null] : ( (this_PrefixMetadata_0= rulePrefixMetadata[$current] )* ( (lv_isNamespace_1_0= 'namespace' ) ) (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token lv_isNamespace_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_PrefixMetadata_0 = null;

        EObject this_Identification_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1821:2: ( ( (this_PrefixMetadata_0= rulePrefixMetadata[$current] )* ( (lv_isNamespace_1_0= 'namespace' ) ) (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' ) ) ) )
            // InternalKerMLOC.g:1822:2: ( (this_PrefixMetadata_0= rulePrefixMetadata[$current] )* ( (lv_isNamespace_1_0= 'namespace' ) ) (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalKerMLOC.g:1822:2: ( (this_PrefixMetadata_0= rulePrefixMetadata[$current] )* ( (lv_isNamespace_1_0= 'namespace' ) ) (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' ) ) )
            // InternalKerMLOC.g:1823:3: (this_PrefixMetadata_0= rulePrefixMetadata[$current] )* ( (lv_isNamespace_1_0= 'namespace' ) ) (this_Identification_2= ruleIdentification[$current] )? (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' ) )
            {
            // InternalKerMLOC.g:1823:3: (this_PrefixMetadata_0= rulePrefixMetadata[$current] )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_PREFIXNAME_TEXT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKerMLOC.g:1824:4: this_PrefixMetadata_0= rulePrefixMetadata[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getNamespaceRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getNamespaceAccess().getPrefixMetadataParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_48);
            	    this_PrefixMetadata_0=rulePrefixMetadata(current);

            	    state._fsp--;


            	    				current = this_PrefixMetadata_0;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalKerMLOC.g:1836:3: ( (lv_isNamespace_1_0= 'namespace' ) )
            // InternalKerMLOC.g:1837:4: (lv_isNamespace_1_0= 'namespace' )
            {
            // InternalKerMLOC.g:1837:4: (lv_isNamespace_1_0= 'namespace' )
            // InternalKerMLOC.g:1838:5: lv_isNamespace_1_0= 'namespace'
            {
            lv_isNamespace_1_0=(Token)match(input,43,FOLLOW_10); 

            					newLeafNode(lv_isNamespace_1_0, grammarAccess.getNamespaceAccess().getIsNamespaceNamespaceKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamespaceRule());
            					}
            					setWithLastConsumed(current, "isNamespace", lv_isNamespace_1_0 != null, "namespace");
            				

            }


            }

            // InternalKerMLOC.g:1850:3: (this_Identification_2= ruleIdentification[$current] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_UNRESTRICTED_NAME)||LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKerMLOC.g:1851:4: this_Identification_2= ruleIdentification[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getNamespaceRule());
                    				}
                    				newCompositeNode(grammarAccess.getNamespaceAccess().getIdentificationParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_6);
                    this_Identification_2=ruleIdentification(current);

                    state._fsp--;


                    				current = this_Identification_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1863:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                alt49=1;
            }
            else if ( (LA49_0==16) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalKerMLOC.g:1864:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getNamespaceAccess().getSemicolonKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1869:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' )
                    {
                    // InternalKerMLOC.g:1869:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}' )
                    // InternalKerMLOC.g:1870:5: otherlv_4= '{' ( (lv_elements_5_0= ruleNamespaceBodyElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalKerMLOC.g:1874:5: ( (lv_elements_5_0= ruleNamespaceBodyElement ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=RULE_STRING_VALUE && LA48_0<=RULE_EXP_VALUE)||LA48_0==14||LA48_0==16||(LA48_0>=18 && LA48_0<=20)||LA48_0==24||(LA48_0>=26 && LA48_0<=29)||LA48_0==31||LA48_0==33||LA48_0==37||(LA48_0>=41 && LA48_0<=55)||LA48_0==59||LA48_0==61||(LA48_0>=67 && LA48_0<=69)||(LA48_0>=83 && LA48_0<=86)||(LA48_0>=91 && LA48_0<=92)||LA48_0==96||LA48_0==98||LA48_0==103||LA48_0==105||LA48_0==108||(LA48_0>=119 && LA48_0<=123)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalKerMLOC.g:1875:6: (lv_elements_5_0= ruleNamespaceBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:1875:6: (lv_elements_5_0= ruleNamespaceBodyElement )
                    	    // InternalKerMLOC.g:1876:7: lv_elements_5_0= ruleNamespaceBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getNamespaceAccess().getElementsNamespaceBodyElementParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_5_0=ruleNamespaceBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_5_0,
                    	    								"dut.control.kermloc.KerMLOC.NamespaceBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_3_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleType"
    // InternalKerMLOC.g:1903:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalKerMLOC.g:1903:45: (iv_ruleType= ruleType EOF )
            // InternalKerMLOC.g:1904:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalKerMLOC.g:1910:1: ruleType returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'type' ( (lv_isSufficient_3_0= 'all' ) )? (this_Identification_4= ruleIdentification[$current] )? (this_MultiplicityBounds_5= ruleMultiplicityBounds[$current] )? (this_SpecializationPart_6= ruleSpecializationPart[$current] | this_ConjugationPart_7= ruleConjugationPart[$current] ) (this_TypeRelationshipPart_8= ruleTypeRelationshipPart[$current] )* (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_isSufficient_3_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_Identification_4 = null;

        EObject this_MultiplicityBounds_5 = null;

        EObject this_SpecializationPart_6 = null;

        EObject this_ConjugationPart_7 = null;

        EObject this_TypeRelationshipPart_8 = null;

        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1916:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'type' ( (lv_isSufficient_3_0= 'all' ) )? (this_Identification_4= ruleIdentification[$current] )? (this_MultiplicityBounds_5= ruleMultiplicityBounds[$current] )? (this_SpecializationPart_6= ruleSpecializationPart[$current] | this_ConjugationPart_7= ruleConjugationPart[$current] ) (this_TypeRelationshipPart_8= ruleTypeRelationshipPart[$current] )* (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' ) ) ) )
            // InternalKerMLOC.g:1917:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'type' ( (lv_isSufficient_3_0= 'all' ) )? (this_Identification_4= ruleIdentification[$current] )? (this_MultiplicityBounds_5= ruleMultiplicityBounds[$current] )? (this_SpecializationPart_6= ruleSpecializationPart[$current] | this_ConjugationPart_7= ruleConjugationPart[$current] ) (this_TypeRelationshipPart_8= ruleTypeRelationshipPart[$current] )* (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' ) ) )
            {
            // InternalKerMLOC.g:1917:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'type' ( (lv_isSufficient_3_0= 'all' ) )? (this_Identification_4= ruleIdentification[$current] )? (this_MultiplicityBounds_5= ruleMultiplicityBounds[$current] )? (this_SpecializationPart_6= ruleSpecializationPart[$current] | this_ConjugationPart_7= ruleConjugationPart[$current] ) (this_TypeRelationshipPart_8= ruleTypeRelationshipPart[$current] )* (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' ) ) )
            // InternalKerMLOC.g:1918:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'type' ( (lv_isSufficient_3_0= 'all' ) )? (this_Identification_4= ruleIdentification[$current] )? (this_MultiplicityBounds_5= ruleMultiplicityBounds[$current] )? (this_SpecializationPart_6= ruleSpecializationPart[$current] | this_ConjugationPart_7= ruleConjugationPart[$current] ) (this_TypeRelationshipPart_8= ruleTypeRelationshipPart[$current] )* (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getTypeRule());
            			}
            			newCompositeNode(grammarAccess.getTypeAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getTypeRule());
            			}
            			newCompositeNode(grammarAccess.getTypeAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_50);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,44,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getTypeKeyword_2());
            		
            // InternalKerMLOC.g:1944:3: ( (lv_isSufficient_3_0= 'all' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==31) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKerMLOC.g:1945:4: (lv_isSufficient_3_0= 'all' )
                    {
                    // InternalKerMLOC.g:1945:4: (lv_isSufficient_3_0= 'all' )
                    // InternalKerMLOC.g:1946:5: lv_isSufficient_3_0= 'all'
                    {
                    lv_isSufficient_3_0=(Token)match(input,31,FOLLOW_51); 

                    					newLeafNode(lv_isSufficient_3_0, grammarAccess.getTypeAccess().getIsSufficientAllKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "isSufficient", lv_isSufficient_3_0 != null, "all");
                    				

                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:1958:3: (this_Identification_4= ruleIdentification[$current] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_UNRESTRICTED_NAME)||LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalKerMLOC.g:1959:4: this_Identification_4= ruleIdentification[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getTypeRule());
                    				}
                    				newCompositeNode(grammarAccess.getTypeAccess().getIdentificationParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_51);
                    this_Identification_4=ruleIdentification(current);

                    state._fsp--;


                    				current = this_Identification_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1971:3: (this_MultiplicityBounds_5= ruleMultiplicityBounds[$current] )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==35) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKerMLOC.g:1972:4: this_MultiplicityBounds_5= ruleMultiplicityBounds[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getTypeRule());
                    				}
                    				newCompositeNode(grammarAccess.getTypeAccess().getMultiplicityBoundsParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_51);
                    this_MultiplicityBounds_5=ruleMultiplicityBounds(current);

                    state._fsp--;


                    				current = this_MultiplicityBounds_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1984:3: (this_SpecializationPart_6= ruleSpecializationPart[$current] | this_ConjugationPart_7= ruleConjugationPart[$current] )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==57||LA53_0==60) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=61 && LA53_0<=62)) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalKerMLOC.g:1985:4: this_SpecializationPart_6= ruleSpecializationPart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getTypeRule());
                    				}
                    				newCompositeNode(grammarAccess.getTypeAccess().getSpecializationPartParserRuleCall_6_0());
                    			
                    pushFollow(FOLLOW_52);
                    this_SpecializationPart_6=ruleSpecializationPart(current);

                    state._fsp--;


                    				current = this_SpecializationPart_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1997:4: this_ConjugationPart_7= ruleConjugationPart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getTypeRule());
                    				}
                    				newCompositeNode(grammarAccess.getTypeAccess().getConjugationPartParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_52);
                    this_ConjugationPart_7=ruleConjugationPart(current);

                    state._fsp--;


                    				current = this_ConjugationPart_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:2009:3: (this_TypeRelationshipPart_8= ruleTypeRelationshipPart[$current] )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=63 && LA54_0<=66)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalKerMLOC.g:2010:4: this_TypeRelationshipPart_8= ruleTypeRelationshipPart[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getTypeRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getTypeAccess().getTypeRelationshipPartParserRuleCall_7());
            	    			
            	    pushFollow(FOLLOW_52);
            	    this_TypeRelationshipPart_8=ruleTypeRelationshipPart(current);

            	    state._fsp--;


            	    				current = this_TypeRelationshipPart_8;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalKerMLOC.g:2022:3: (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==15) ) {
                alt56=1;
            }
            else if ( (LA56_0==16) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalKerMLOC.g:2023:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getSemicolonKeyword_8_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2028:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' )
                    {
                    // InternalKerMLOC.g:2028:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}' )
                    // InternalKerMLOC.g:2029:5: otherlv_10= '{' ( (lv_elements_11_0= ruleTypeBodyElement ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_8_1_0());
                    				
                    // InternalKerMLOC.g:2033:5: ( (lv_elements_11_0= ruleTypeBodyElement ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=RULE_STRING_VALUE && LA55_0<=RULE_EXP_VALUE)||LA55_0==14||LA55_0==16||(LA55_0>=18 && LA55_0<=20)||LA55_0==24||(LA55_0>=26 && LA55_0<=29)||LA55_0==31||LA55_0==33||LA55_0==37||(LA55_0>=41 && LA55_0<=55)||LA55_0==59||LA55_0==61||(LA55_0>=67 && LA55_0<=69)||(LA55_0>=83 && LA55_0<=86)||(LA55_0>=91 && LA55_0<=92)||LA55_0==96||LA55_0==98||LA55_0==103||LA55_0==105||LA55_0==108||(LA55_0>=119 && LA55_0<=123)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2034:6: (lv_elements_11_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2034:6: (lv_elements_11_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2035:7: lv_elements_11_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypeAccess().getElementsTypeBodyElementParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_11_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_11_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_8_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleClassifier"
    // InternalKerMLOC.g:2062:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalKerMLOC.g:2062:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalKerMLOC.g:2063:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // InternalKerMLOC.g:2069:1: ruleClassifier returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'classifier' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2075:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'classifier' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2076:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'classifier' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2076:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'classifier' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2077:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'classifier' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassifierRule());
            			}
            			newCompositeNode(grammarAccess.getClassifierAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassifierRule());
            			}
            			newCompositeNode(grammarAccess.getClassifierAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_54);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,45,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getClassifierAccess().getClassifierKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassifierRule());
            			}
            			newCompositeNode(grammarAccess.getClassifierAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2114:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==15) ) {
                alt58=1;
            }
            else if ( (LA58_0==16) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalKerMLOC.g:2115:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassifierAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2120:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2120:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2121:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getClassifierAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2125:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=RULE_STRING_VALUE && LA57_0<=RULE_EXP_VALUE)||LA57_0==14||LA57_0==16||(LA57_0>=18 && LA57_0<=20)||LA57_0==24||(LA57_0>=26 && LA57_0<=29)||LA57_0==31||LA57_0==33||LA57_0==37||(LA57_0>=41 && LA57_0<=55)||LA57_0==59||LA57_0==61||(LA57_0>=67 && LA57_0<=69)||(LA57_0>=83 && LA57_0<=86)||(LA57_0>=91 && LA57_0<=92)||LA57_0==96||LA57_0==98||LA57_0==103||LA57_0==105||LA57_0==108||(LA57_0>=119 && LA57_0<=123)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2126:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2126:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2127:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassifierAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassifierRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getClassifierAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleClass"
    // InternalKerMLOC.g:2154:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalKerMLOC.g:2154:46: (iv_ruleClass= ruleClass EOF )
            // InternalKerMLOC.g:2155:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalKerMLOC.g:2161:1: ruleClass returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'class' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2167:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'class' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2168:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'class' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2168:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'class' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2169:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'class' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassRule());
            			}
            			newCompositeNode(grammarAccess.getClassAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassRule());
            			}
            			newCompositeNode(grammarAccess.getClassAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_57);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,46,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getClassKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassRule());
            			}
            			newCompositeNode(grammarAccess.getClassAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2206:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==15) ) {
                alt60=1;
            }
            else if ( (LA60_0==16) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalKerMLOC.g:2207:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2212:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2212:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2213:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2217:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=RULE_STRING_VALUE && LA59_0<=RULE_EXP_VALUE)||LA59_0==14||LA59_0==16||(LA59_0>=18 && LA59_0<=20)||LA59_0==24||(LA59_0>=26 && LA59_0<=29)||LA59_0==31||LA59_0==33||LA59_0==37||(LA59_0>=41 && LA59_0<=55)||LA59_0==59||LA59_0==61||(LA59_0>=67 && LA59_0<=69)||(LA59_0>=83 && LA59_0<=86)||(LA59_0>=91 && LA59_0<=92)||LA59_0==96||LA59_0==98||LA59_0==103||LA59_0==105||LA59_0==108||(LA59_0>=119 && LA59_0<=123)) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2218:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2218:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2219:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleStructure"
    // InternalKerMLOC.g:2246:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalKerMLOC.g:2246:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalKerMLOC.g:2247:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalKerMLOC.g:2253:1: ruleStructure returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'struct' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2259:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'struct' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2260:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'struct' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2260:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'struct' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2261:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'struct' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getStructureRule());
            			}
            			newCompositeNode(grammarAccess.getStructureAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_58);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getStructureRule());
            			}
            			newCompositeNode(grammarAccess.getStructureAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_59);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,47,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getStructureAccess().getStructKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getStructureRule());
            			}
            			newCompositeNode(grammarAccess.getStructureAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2298:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==15) ) {
                alt62=1;
            }
            else if ( (LA62_0==16) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalKerMLOC.g:2299:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStructureAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2304:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2304:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2305:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2309:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( ((LA61_0>=RULE_STRING_VALUE && LA61_0<=RULE_EXP_VALUE)||LA61_0==14||LA61_0==16||(LA61_0>=18 && LA61_0<=20)||LA61_0==24||(LA61_0>=26 && LA61_0<=29)||LA61_0==31||LA61_0==33||LA61_0==37||(LA61_0>=41 && LA61_0<=55)||LA61_0==59||LA61_0==61||(LA61_0>=67 && LA61_0<=69)||(LA61_0>=83 && LA61_0<=86)||(LA61_0>=91 && LA61_0<=92)||LA61_0==96||LA61_0==98||LA61_0==103||LA61_0==105||LA61_0==108||(LA61_0>=119 && LA61_0<=123)) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2310:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2310:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2311:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getStructureAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStructureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleMetaclass"
    // InternalKerMLOC.g:2338:1: entryRuleMetaclass returns [EObject current=null] : iv_ruleMetaclass= ruleMetaclass EOF ;
    public final EObject entryRuleMetaclass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaclass = null;


        try {
            // InternalKerMLOC.g:2338:50: (iv_ruleMetaclass= ruleMetaclass EOF )
            // InternalKerMLOC.g:2339:2: iv_ruleMetaclass= ruleMetaclass EOF
            {
             newCompositeNode(grammarAccess.getMetaclassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaclass=ruleMetaclass();

            state._fsp--;

             current =iv_ruleMetaclass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaclass"


    // $ANTLR start "ruleMetaclass"
    // InternalKerMLOC.g:2345:1: ruleMetaclass returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'metaclass' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleMetaclass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2351:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'metaclass' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2352:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'metaclass' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2352:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'metaclass' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2353:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'metaclass' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getMetaclassRule());
            			}
            			newCompositeNode(grammarAccess.getMetaclassAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_60);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getMetaclassRule());
            			}
            			newCompositeNode(grammarAccess.getMetaclassAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_61);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,48,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaclassAccess().getMetaclassKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getMetaclassRule());
            			}
            			newCompositeNode(grammarAccess.getMetaclassAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2390:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==15) ) {
                alt64=1;
            }
            else if ( (LA64_0==16) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalKerMLOC.g:2391:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getMetaclassAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2396:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2396:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2397:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getMetaclassAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2401:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=RULE_STRING_VALUE && LA63_0<=RULE_EXP_VALUE)||LA63_0==14||LA63_0==16||(LA63_0>=18 && LA63_0<=20)||LA63_0==24||(LA63_0>=26 && LA63_0<=29)||LA63_0==31||LA63_0==33||LA63_0==37||(LA63_0>=41 && LA63_0<=55)||LA63_0==59||LA63_0==61||(LA63_0>=67 && LA63_0<=69)||(LA63_0>=83 && LA63_0<=86)||(LA63_0>=91 && LA63_0<=92)||LA63_0==96||LA63_0==98||LA63_0==103||LA63_0==105||LA63_0==108||(LA63_0>=119 && LA63_0<=123)) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2402:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2402:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2403:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMetaclassAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMetaclassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getMetaclassAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaclass"


    // $ANTLR start "entryRuleDataType"
    // InternalKerMLOC.g:2430:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalKerMLOC.g:2430:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalKerMLOC.g:2431:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalKerMLOC.g:2437:1: ruleDataType returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'datatype' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2443:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'datatype' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2444:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'datatype' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2444:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'datatype' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2445:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'datatype' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getDataTypeRule());
            			}
            			newCompositeNode(grammarAccess.getDataTypeAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getDataTypeRule());
            			}
            			newCompositeNode(grammarAccess.getDataTypeAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_63);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,49,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getDatatypeKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getDataTypeRule());
            			}
            			newCompositeNode(grammarAccess.getDataTypeAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2482:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==15) ) {
                alt66=1;
            }
            else if ( (LA66_0==16) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalKerMLOC.g:2483:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2488:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2488:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2489:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2493:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=RULE_STRING_VALUE && LA65_0<=RULE_EXP_VALUE)||LA65_0==14||LA65_0==16||(LA65_0>=18 && LA65_0<=20)||LA65_0==24||(LA65_0>=26 && LA65_0<=29)||LA65_0==31||LA65_0==33||LA65_0==37||(LA65_0>=41 && LA65_0<=55)||LA65_0==59||LA65_0==61||(LA65_0>=67 && LA65_0<=69)||(LA65_0>=83 && LA65_0<=86)||(LA65_0>=91 && LA65_0<=92)||LA65_0==96||LA65_0==98||LA65_0==103||LA65_0==105||LA65_0==108||(LA65_0>=119 && LA65_0<=123)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2494:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2494:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2495:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleAssociation"
    // InternalKerMLOC.g:2522:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalKerMLOC.g:2522:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalKerMLOC.g:2523:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalKerMLOC.g:2529:1: ruleAssociation returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2535:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2536:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2536:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2537:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_64);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_65);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,50,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getAssocKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2574:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==15) ) {
                alt68=1;
            }
            else if ( (LA68_0==16) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalKerMLOC.g:2575:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2580:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2580:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2581:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2585:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( ((LA67_0>=RULE_STRING_VALUE && LA67_0<=RULE_EXP_VALUE)||LA67_0==14||LA67_0==16||(LA67_0>=18 && LA67_0<=20)||LA67_0==24||(LA67_0>=26 && LA67_0<=29)||LA67_0==31||LA67_0==33||LA67_0==37||(LA67_0>=41 && LA67_0<=55)||LA67_0==59||LA67_0==61||(LA67_0>=67 && LA67_0<=69)||(LA67_0>=83 && LA67_0<=86)||(LA67_0>=91 && LA67_0<=92)||LA67_0==96||LA67_0==98||LA67_0==103||LA67_0==105||LA67_0==108||(LA67_0>=119 && LA67_0<=123)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2586:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2586:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2587:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAssociationStructure"
    // InternalKerMLOC.g:2614:1: entryRuleAssociationStructure returns [EObject current=null] : iv_ruleAssociationStructure= ruleAssociationStructure EOF ;
    public final EObject entryRuleAssociationStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationStructure = null;


        try {
            // InternalKerMLOC.g:2614:61: (iv_ruleAssociationStructure= ruleAssociationStructure EOF )
            // InternalKerMLOC.g:2615:2: iv_ruleAssociationStructure= ruleAssociationStructure EOF
            {
             newCompositeNode(grammarAccess.getAssociationStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationStructure=ruleAssociationStructure();

            state._fsp--;

             current =iv_ruleAssociationStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationStructure"


    // $ANTLR start "ruleAssociationStructure"
    // InternalKerMLOC.g:2621:1: ruleAssociationStructure returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' otherlv_3= 'struct' this_ClassifierDeclaration_4= ruleClassifierDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleAssociationStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2627:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' otherlv_3= 'struct' this_ClassifierDeclaration_4= ruleClassifierDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalKerMLOC.g:2628:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' otherlv_3= 'struct' this_ClassifierDeclaration_4= ruleClassifierDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalKerMLOC.g:2628:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' otherlv_3= 'struct' this_ClassifierDeclaration_4= ruleClassifierDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalKerMLOC.g:2629:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'assoc' otherlv_3= 'struct' this_ClassifierDeclaration_4= ruleClassifierDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationStructureRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationStructureAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_64);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationStructureRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationStructureAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_65);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,50,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationStructureAccess().getAssocKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationStructureAccess().getStructKeyword_3());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationStructureRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationStructureAccess().getClassifierDeclarationParserRuleCall_4());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_4=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_4;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2670:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==15) ) {
                alt70=1;
            }
            else if ( (LA70_0==16) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalKerMLOC.g:2671:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssociationStructureAccess().getSemicolonKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2676:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalKerMLOC.g:2676:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}' )
                    // InternalKerMLOC.g:2677:5: otherlv_6= '{' ( (lv_elements_7_0= ruleTypeBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationStructureAccess().getLeftCurlyBracketKeyword_5_1_0());
                    				
                    // InternalKerMLOC.g:2681:5: ( (lv_elements_7_0= ruleTypeBodyElement ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=RULE_STRING_VALUE && LA69_0<=RULE_EXP_VALUE)||LA69_0==14||LA69_0==16||(LA69_0>=18 && LA69_0<=20)||LA69_0==24||(LA69_0>=26 && LA69_0<=29)||LA69_0==31||LA69_0==33||LA69_0==37||(LA69_0>=41 && LA69_0<=55)||LA69_0==59||LA69_0==61||(LA69_0>=67 && LA69_0<=69)||(LA69_0>=83 && LA69_0<=86)||(LA69_0>=91 && LA69_0<=92)||LA69_0==96||LA69_0==98||LA69_0==103||LA69_0==105||LA69_0==108||(LA69_0>=119 && LA69_0<=123)) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2682:6: (lv_elements_7_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2682:6: (lv_elements_7_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2683:7: lv_elements_7_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationStructureAccess().getElementsTypeBodyElementParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_7_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationStructureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getAssociationStructureAccess().getRightCurlyBracketKeyword_5_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationStructure"


    // $ANTLR start "entryRuleInteraction"
    // InternalKerMLOC.g:2710:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalKerMLOC.g:2710:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalKerMLOC.g:2711:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalKerMLOC.g:2717:1: ruleInteraction returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'interaction' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2723:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'interaction' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2724:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'interaction' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2724:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'interaction' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2725:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'interaction' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getInteractionRule());
            			}
            			newCompositeNode(grammarAccess.getInteractionAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_66);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getInteractionRule());
            			}
            			newCompositeNode(grammarAccess.getInteractionAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_67);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,51,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getInteractionKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getInteractionRule());
            			}
            			newCompositeNode(grammarAccess.getInteractionAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2762:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==15) ) {
                alt72=1;
            }
            else if ( (LA72_0==16) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalKerMLOC.g:2763:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2768:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2768:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2769:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2773:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=RULE_STRING_VALUE && LA71_0<=RULE_EXP_VALUE)||LA71_0==14||LA71_0==16||(LA71_0>=18 && LA71_0<=20)||LA71_0==24||(LA71_0>=26 && LA71_0<=29)||LA71_0==31||LA71_0==33||LA71_0==37||(LA71_0>=41 && LA71_0<=55)||LA71_0==59||LA71_0==61||(LA71_0>=67 && LA71_0<=69)||(LA71_0>=83 && LA71_0<=86)||(LA71_0>=91 && LA71_0<=92)||LA71_0==96||LA71_0==98||LA71_0==103||LA71_0==105||LA71_0==108||(LA71_0>=119 && LA71_0<=123)) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2774:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2774:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2775:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getInteractionAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleBehavior"
    // InternalKerMLOC.g:2802:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalKerMLOC.g:2802:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalKerMLOC.g:2803:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalKerMLOC.g:2809:1: ruleBehavior returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'behavior' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2815:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'behavior' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalKerMLOC.g:2816:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'behavior' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalKerMLOC.g:2816:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'behavior' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalKerMLOC.g:2817:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'behavior' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_68);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_69);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,52,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getBehaviorKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2854:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==15) ) {
                alt74=1;
            }
            else if ( (LA74_0==16) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalKerMLOC.g:2855:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2860:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalKerMLOC.g:2860:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}' )
                    // InternalKerMLOC.g:2861:5: otherlv_5= '{' ( (lv_elements_6_0= ruleTypeBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_47); 

                    					newLeafNode(otherlv_5, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2865:5: ( (lv_elements_6_0= ruleTypeBodyElement ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( ((LA73_0>=RULE_STRING_VALUE && LA73_0<=RULE_EXP_VALUE)||LA73_0==14||LA73_0==16||(LA73_0>=18 && LA73_0<=20)||LA73_0==24||(LA73_0>=26 && LA73_0<=29)||LA73_0==31||LA73_0==33||LA73_0==37||(LA73_0>=41 && LA73_0<=55)||LA73_0==59||LA73_0==61||(LA73_0>=67 && LA73_0<=69)||(LA73_0>=83 && LA73_0<=86)||(LA73_0>=91 && LA73_0<=92)||LA73_0==96||LA73_0==98||LA73_0==103||LA73_0==105||LA73_0==108||(LA73_0>=119 && LA73_0<=123)) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2866:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2866:6: (lv_elements_6_0= ruleTypeBodyElement )
                    	    // InternalKerMLOC.g:2867:7: lv_elements_6_0= ruleTypeBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorAccess().getElementsTypeBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
                    	    lv_elements_6_0=ruleTypeBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.TypeBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleFunction"
    // InternalKerMLOC.g:2894:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalKerMLOC.g:2894:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalKerMLOC.g:2895:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalKerMLOC.g:2901:1: ruleFunction returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'function' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_resultExpressionParameter_7_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2907:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'function' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) ) )
            // InternalKerMLOC.g:2908:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'function' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) )
            {
            // InternalKerMLOC.g:2908:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'function' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) )
            // InternalKerMLOC.g:2909:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'function' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_70);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_71);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,53,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getFunctionKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2946:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==15) ) {
                alt77=1;
            }
            else if ( (LA77_0==16) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalKerMLOC.g:2947:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2952:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' )
                    {
                    // InternalKerMLOC.g:2952:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' )
                    // InternalKerMLOC.g:2953:5: otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_72); 

                    					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:2957:5: ( (lv_elements_6_0= ruleFunctionBodyElement ) )*
                    loop75:
                    do {
                        int alt75=2;
                        switch ( input.LA(1) ) {
                        case 121:
                            {
                            int LA75_1 = input.LA(2);

                            if ( (LA75_1==55) ) {
                                int LA75_5 = input.LA(3);

                                if ( (LA75_5==RULE_REGULAR_COMMENT||LA75_5==RULE_PREFIXNAME_TEXT||LA75_5==14||(LA75_5>=18 && LA75_5<=20)||LA75_5==24||(LA75_5>=26 && LA75_5<=29)||LA75_5==37||LA75_5==42||(LA75_5>=44 && LA75_5<=54)||LA75_5==59) ) {
                                    alt75=1;
                                }


                            }
                            else if ( (LA75_1==RULE_REGULAR_COMMENT||LA75_1==RULE_PREFIXNAME_TEXT||LA75_1==14||(LA75_1>=18 && LA75_1<=20)||LA75_1==24||(LA75_1>=26 && LA75_1<=30)||LA75_1==37||LA75_1==42||(LA75_1>=44 && LA75_1<=54)||LA75_1==59) ) {
                                alt75=1;
                            }


                            }
                            break;
                        case 122:
                            {
                            int LA75_2 = input.LA(2);

                            if ( (LA75_2==55) ) {
                                int LA75_5 = input.LA(3);

                                if ( (LA75_5==RULE_REGULAR_COMMENT||LA75_5==RULE_PREFIXNAME_TEXT||LA75_5==14||(LA75_5>=18 && LA75_5<=20)||LA75_5==24||(LA75_5>=26 && LA75_5<=29)||LA75_5==37||LA75_5==42||(LA75_5>=44 && LA75_5<=54)||LA75_5==59) ) {
                                    alt75=1;
                                }


                            }
                            else if ( (LA75_2==RULE_REGULAR_COMMENT||LA75_2==RULE_PREFIXNAME_TEXT||LA75_2==14||(LA75_2>=18 && LA75_2<=20)||LA75_2==24||(LA75_2>=26 && LA75_2<=30)||LA75_2==37||LA75_2==42||(LA75_2>=44 && LA75_2<=54)||LA75_2==59) ) {
                                alt75=1;
                            }


                            }
                            break;
                        case 108:
                            {
                            int LA75_3 = input.LA(2);

                            if ( (LA75_3==55) ) {
                                int LA75_5 = input.LA(3);

                                if ( (LA75_5==RULE_REGULAR_COMMENT||LA75_5==RULE_PREFIXNAME_TEXT||LA75_5==14||(LA75_5>=18 && LA75_5<=20)||LA75_5==24||(LA75_5>=26 && LA75_5<=29)||LA75_5==37||LA75_5==42||(LA75_5>=44 && LA75_5<=54)||LA75_5==59) ) {
                                    alt75=1;
                                }


                            }
                            else if ( (LA75_3==RULE_REGULAR_COMMENT||LA75_3==RULE_PREFIXNAME_TEXT||LA75_3==14||(LA75_3>=18 && LA75_3<=20)||LA75_3==24||(LA75_3>=26 && LA75_3<=30)||LA75_3==37||LA75_3==42||(LA75_3>=44 && LA75_3<=54)||LA75_3==59) ) {
                                alt75=1;
                            }


                            }
                            break;
                        case 123:
                            {
                            int LA75_4 = input.LA(2);

                            if ( (LA75_4==55) ) {
                                int LA75_5 = input.LA(3);

                                if ( (LA75_5==RULE_REGULAR_COMMENT||LA75_5==RULE_PREFIXNAME_TEXT||LA75_5==14||(LA75_5>=18 && LA75_5<=20)||LA75_5==24||(LA75_5>=26 && LA75_5<=29)||LA75_5==37||LA75_5==42||(LA75_5>=44 && LA75_5<=54)||LA75_5==59) ) {
                                    alt75=1;
                                }


                            }
                            else if ( (LA75_4==RULE_REGULAR_COMMENT||LA75_4==RULE_PREFIXNAME_TEXT||LA75_4==14||(LA75_4>=18 && LA75_4<=20)||LA75_4==24||(LA75_4>=26 && LA75_4<=30)||LA75_4==37||LA75_4==42||(LA75_4>=44 && LA75_4<=54)||LA75_4==59) ) {
                                alt75=1;
                            }


                            }
                            break;
                        case 55:
                            {
                            int LA75_5 = input.LA(2);

                            if ( (LA75_5==RULE_REGULAR_COMMENT||LA75_5==RULE_PREFIXNAME_TEXT||LA75_5==14||(LA75_5>=18 && LA75_5<=20)||LA75_5==24||(LA75_5>=26 && LA75_5<=29)||LA75_5==37||LA75_5==42||(LA75_5>=44 && LA75_5<=54)||LA75_5==59) ) {
                                alt75=1;
                            }


                            }
                            break;
                        case RULE_REGULAR_COMMENT:
                        case RULE_SL_NOTE:
                        case RULE_ML_NOTE:
                        case RULE_PREFIXNAME_TEXT:
                        case 14:
                        case 18:
                        case 19:
                        case 20:
                        case 24:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 37:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 59:
                            {
                            alt75=1;
                            }
                            break;

                        }

                        switch (alt75) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2958:6: (lv_elements_6_0= ruleFunctionBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:2958:6: (lv_elements_6_0= ruleFunctionBodyElement )
                    	    // InternalKerMLOC.g:2959:7: lv_elements_6_0= ruleFunctionBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getElementsFunctionBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_72);
                    	    lv_elements_6_0=ruleFunctionBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.FunctionBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    // InternalKerMLOC.g:2976:5: ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( ((LA76_0>=RULE_STRING_VALUE && LA76_0<=RULE_REGULAR_COMMENT)||(LA76_0>=RULE_PREFIXNAME_TEXT && LA76_0<=RULE_EXP_VALUE)||LA76_0==14||LA76_0==16||(LA76_0>=18 && LA76_0<=20)||LA76_0==24||(LA76_0>=26 && LA76_0<=29)||LA76_0==31||LA76_0==33||LA76_0==37||(LA76_0>=41 && LA76_0<=42)||(LA76_0>=44 && LA76_0<=55)||LA76_0==59||LA76_0==61||(LA76_0>=67 && LA76_0<=69)||(LA76_0>=83 && LA76_0<=86)||(LA76_0>=91 && LA76_0<=92)||LA76_0==96||LA76_0==98||LA76_0==103||LA76_0==105||LA76_0==108||(LA76_0>=119 && LA76_0<=123)) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalKerMLOC.g:2977:6: (lv_resultExpressionParameter_7_0= ruleResultExpression )
                            {
                            // InternalKerMLOC.g:2977:6: (lv_resultExpressionParameter_7_0= ruleResultExpression )
                            // InternalKerMLOC.g:2978:7: lv_resultExpressionParameter_7_0= ruleResultExpression
                            {

                            							newCompositeNode(grammarAccess.getFunctionAccess().getResultExpressionParameterResultExpressionParserRuleCall_4_1_2_0());
                            						
                            pushFollow(FOLLOW_73);
                            lv_resultExpressionParameter_7_0=ruleResultExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFunctionRule());
                            							}
                            							add(
                            								current,
                            								"resultExpressionParameter",
                            								lv_resultExpressionParameter_7_0,
                            								"dut.control.kermloc.KerMLOC.ResultExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_4_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRulePredicate"
    // InternalKerMLOC.g:3005:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalKerMLOC.g:3005:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalKerMLOC.g:3006:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalKerMLOC.g:3012:1: rulePredicate returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'predicate' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_TypePrefix_1 = null;

        EObject this_ClassifierDeclaration_3 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_resultExpressionParameter_7_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3018:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'predicate' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) ) )
            // InternalKerMLOC.g:3019:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'predicate' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) )
            {
            // InternalKerMLOC.g:3019:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'predicate' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) ) )
            // InternalKerMLOC.g:3020:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_TypePrefix_1= ruleTypePrefix[$current] otherlv_2= 'predicate' this_ClassifierDeclaration_3= ruleClassifierDeclaration[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPredicateRule());
            			}
            			newCompositeNode(grammarAccess.getPredicateAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_74);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPredicateRule());
            			}
            			newCompositeNode(grammarAccess.getPredicateAccess().getTypePrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_75);
            this_TypePrefix_1=ruleTypePrefix(current);

            state._fsp--;


            			current = this_TypePrefix_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,54,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getPredicateAccess().getPredicateKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPredicateRule());
            			}
            			newCompositeNode(grammarAccess.getPredicateAccess().getClassifierDeclarationParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassifierDeclaration_3=ruleClassifierDeclaration(current);

            state._fsp--;


            			current = this_ClassifierDeclaration_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:3057:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==15) ) {
                alt80=1;
            }
            else if ( (LA80_0==16) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalKerMLOC.g:3058:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPredicateAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3063:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' )
                    {
                    // InternalKerMLOC.g:3063:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}' )
                    // InternalKerMLOC.g:3064:5: otherlv_5= '{' ( (lv_elements_6_0= ruleFunctionBodyElement ) )* ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )? otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_72); 

                    					newLeafNode(otherlv_5, grammarAccess.getPredicateAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalKerMLOC.g:3068:5: ( (lv_elements_6_0= ruleFunctionBodyElement ) )*
                    loop78:
                    do {
                        int alt78=2;
                        switch ( input.LA(1) ) {
                        case 121:
                            {
                            int LA78_1 = input.LA(2);

                            if ( (LA78_1==55) ) {
                                int LA78_5 = input.LA(3);

                                if ( (LA78_5==RULE_REGULAR_COMMENT||LA78_5==RULE_PREFIXNAME_TEXT||LA78_5==14||(LA78_5>=18 && LA78_5<=20)||LA78_5==24||(LA78_5>=26 && LA78_5<=29)||LA78_5==37||LA78_5==42||(LA78_5>=44 && LA78_5<=54)||LA78_5==59) ) {
                                    alt78=1;
                                }


                            }
                            else if ( (LA78_1==RULE_REGULAR_COMMENT||LA78_1==RULE_PREFIXNAME_TEXT||LA78_1==14||(LA78_1>=18 && LA78_1<=20)||LA78_1==24||(LA78_1>=26 && LA78_1<=30)||LA78_1==37||LA78_1==42||(LA78_1>=44 && LA78_1<=54)||LA78_1==59) ) {
                                alt78=1;
                            }


                            }
                            break;
                        case 122:
                            {
                            int LA78_2 = input.LA(2);

                            if ( (LA78_2==55) ) {
                                int LA78_5 = input.LA(3);

                                if ( (LA78_5==RULE_REGULAR_COMMENT||LA78_5==RULE_PREFIXNAME_TEXT||LA78_5==14||(LA78_5>=18 && LA78_5<=20)||LA78_5==24||(LA78_5>=26 && LA78_5<=29)||LA78_5==37||LA78_5==42||(LA78_5>=44 && LA78_5<=54)||LA78_5==59) ) {
                                    alt78=1;
                                }


                            }
                            else if ( (LA78_2==RULE_REGULAR_COMMENT||LA78_2==RULE_PREFIXNAME_TEXT||LA78_2==14||(LA78_2>=18 && LA78_2<=20)||LA78_2==24||(LA78_2>=26 && LA78_2<=30)||LA78_2==37||LA78_2==42||(LA78_2>=44 && LA78_2<=54)||LA78_2==59) ) {
                                alt78=1;
                            }


                            }
                            break;
                        case 108:
                            {
                            int LA78_3 = input.LA(2);

                            if ( (LA78_3==55) ) {
                                int LA78_5 = input.LA(3);

                                if ( (LA78_5==RULE_REGULAR_COMMENT||LA78_5==RULE_PREFIXNAME_TEXT||LA78_5==14||(LA78_5>=18 && LA78_5<=20)||LA78_5==24||(LA78_5>=26 && LA78_5<=29)||LA78_5==37||LA78_5==42||(LA78_5>=44 && LA78_5<=54)||LA78_5==59) ) {
                                    alt78=1;
                                }


                            }
                            else if ( (LA78_3==RULE_REGULAR_COMMENT||LA78_3==RULE_PREFIXNAME_TEXT||LA78_3==14||(LA78_3>=18 && LA78_3<=20)||LA78_3==24||(LA78_3>=26 && LA78_3<=30)||LA78_3==37||LA78_3==42||(LA78_3>=44 && LA78_3<=54)||LA78_3==59) ) {
                                alt78=1;
                            }


                            }
                            break;
                        case 123:
                            {
                            int LA78_4 = input.LA(2);

                            if ( (LA78_4==55) ) {
                                int LA78_5 = input.LA(3);

                                if ( (LA78_5==RULE_REGULAR_COMMENT||LA78_5==RULE_PREFIXNAME_TEXT||LA78_5==14||(LA78_5>=18 && LA78_5<=20)||LA78_5==24||(LA78_5>=26 && LA78_5<=29)||LA78_5==37||LA78_5==42||(LA78_5>=44 && LA78_5<=54)||LA78_5==59) ) {
                                    alt78=1;
                                }


                            }
                            else if ( (LA78_4==RULE_REGULAR_COMMENT||LA78_4==RULE_PREFIXNAME_TEXT||LA78_4==14||(LA78_4>=18 && LA78_4<=20)||LA78_4==24||(LA78_4>=26 && LA78_4<=30)||LA78_4==37||LA78_4==42||(LA78_4>=44 && LA78_4<=54)||LA78_4==59) ) {
                                alt78=1;
                            }


                            }
                            break;
                        case 55:
                            {
                            int LA78_5 = input.LA(2);

                            if ( (LA78_5==RULE_REGULAR_COMMENT||LA78_5==RULE_PREFIXNAME_TEXT||LA78_5==14||(LA78_5>=18 && LA78_5<=20)||LA78_5==24||(LA78_5>=26 && LA78_5<=29)||LA78_5==37||LA78_5==42||(LA78_5>=44 && LA78_5<=54)||LA78_5==59) ) {
                                alt78=1;
                            }


                            }
                            break;
                        case RULE_REGULAR_COMMENT:
                        case RULE_SL_NOTE:
                        case RULE_ML_NOTE:
                        case RULE_PREFIXNAME_TEXT:
                        case 14:
                        case 18:
                        case 19:
                        case 20:
                        case 24:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 37:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 59:
                            {
                            alt78=1;
                            }
                            break;

                        }

                        switch (alt78) {
                    	case 1 :
                    	    // InternalKerMLOC.g:3069:6: (lv_elements_6_0= ruleFunctionBodyElement )
                    	    {
                    	    // InternalKerMLOC.g:3069:6: (lv_elements_6_0= ruleFunctionBodyElement )
                    	    // InternalKerMLOC.g:3070:7: lv_elements_6_0= ruleFunctionBodyElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getPredicateAccess().getElementsFunctionBodyElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_72);
                    	    lv_elements_6_0=ruleFunctionBodyElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPredicateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_6_0,
                    	    								"dut.control.kermloc.KerMLOC.FunctionBodyElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    // InternalKerMLOC.g:3087:5: ( (lv_resultExpressionParameter_7_0= ruleResultExpression ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( ((LA79_0>=RULE_STRING_VALUE && LA79_0<=RULE_REGULAR_COMMENT)||(LA79_0>=RULE_PREFIXNAME_TEXT && LA79_0<=RULE_EXP_VALUE)||LA79_0==14||LA79_0==16||(LA79_0>=18 && LA79_0<=20)||LA79_0==24||(LA79_0>=26 && LA79_0<=29)||LA79_0==31||LA79_0==33||LA79_0==37||(LA79_0>=41 && LA79_0<=42)||(LA79_0>=44 && LA79_0<=55)||LA79_0==59||LA79_0==61||(LA79_0>=67 && LA79_0<=69)||(LA79_0>=83 && LA79_0<=86)||(LA79_0>=91 && LA79_0<=92)||LA79_0==96||LA79_0==98||LA79_0==103||LA79_0==105||LA79_0==108||(LA79_0>=119 && LA79_0<=123)) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalKerMLOC.g:3088:6: (lv_resultExpressionParameter_7_0= ruleResultExpression )
                            {
                            // InternalKerMLOC.g:3088:6: (lv_resultExpressionParameter_7_0= ruleResultExpression )
                            // InternalKerMLOC.g:3089:7: lv_resultExpressionParameter_7_0= ruleResultExpression
                            {

                            							newCompositeNode(grammarAccess.getPredicateAccess().getResultExpressionParameterResultExpressionParserRuleCall_4_1_2_0());
                            						
                            pushFollow(FOLLOW_73);
                            lv_resultExpressionParameter_7_0=ruleResultExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPredicateRule());
                            							}
                            							add(
                            								current,
                            								"resultExpressionParameter",
                            								lv_resultExpressionParameter_7_0,
                            								"dut.control.kermloc.KerMLOC.ResultExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getPredicateAccess().getRightCurlyBracketKeyword_4_1_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleResultExpression"
    // InternalKerMLOC.g:3116:1: entryRuleResultExpression returns [EObject current=null] : iv_ruleResultExpression= ruleResultExpression EOF ;
    public final EObject entryRuleResultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultExpression = null;


        try {
            // InternalKerMLOC.g:3116:57: (iv_ruleResultExpression= ruleResultExpression EOF )
            // InternalKerMLOC.g:3117:2: iv_ruleResultExpression= ruleResultExpression EOF
            {
             newCompositeNode(grammarAccess.getResultExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultExpression=ruleResultExpression();

            state._fsp--;

             current =iv_ruleResultExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultExpression"


    // $ANTLR start "ruleResultExpression"
    // InternalKerMLOC.g:3123:1: ruleResultExpression returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_resultExpression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleResultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MemberPrefix_0 = null;

        AntlrDatatypeRuleToken lv_resultExpression_1_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3129:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_resultExpression_1_0= ruleExpression ) ) ) )
            // InternalKerMLOC.g:3130:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_resultExpression_1_0= ruleExpression ) ) )
            {
            // InternalKerMLOC.g:3130:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_resultExpression_1_0= ruleExpression ) ) )
            // InternalKerMLOC.g:3131:3: this_MemberPrefix_0= ruleMemberPrefix[$current] ( (lv_resultExpression_1_0= ruleExpression ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getResultExpressionRule());
            			}
            			newCompositeNode(grammarAccess.getResultExpressionAccess().getMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;


            			current = this_MemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:3142:3: ( (lv_resultExpression_1_0= ruleExpression ) )
            // InternalKerMLOC.g:3143:4: (lv_resultExpression_1_0= ruleExpression )
            {
            // InternalKerMLOC.g:3143:4: (lv_resultExpression_1_0= ruleExpression )
            // InternalKerMLOC.g:3144:5: lv_resultExpression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getResultExpressionAccess().getResultExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_resultExpression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResultExpressionRule());
            					}
            					set(
            						current,
            						"resultExpression",
            						lv_resultExpression_1_0,
            						"dut.control.kermloc.KerMLOC.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResultExpression"


    // $ANTLR start "ruleIdentification"
    // InternalKerMLOC.g:3166:1: ruleIdentification[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) ) ;
    public final EObject ruleIdentification(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_declaredShortName_1_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_4_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3172:2: ( ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) ) )
            // InternalKerMLOC.g:3173:2: ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) )
            {
            // InternalKerMLOC.g:3173:2: ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==38) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalKerMLOC.g:3174:3: (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? )
                    {
                    // InternalKerMLOC.g:3174:3: (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? )
                    // InternalKerMLOC.g:3175:4: otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )?
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getIdentificationAccess().getLessThanSignKeyword_0_0());
                    			
                    // InternalKerMLOC.g:3179:4: ( (lv_declaredShortName_1_0= ruleName ) )
                    // InternalKerMLOC.g:3180:5: (lv_declaredShortName_1_0= ruleName )
                    {
                    // InternalKerMLOC.g:3180:5: (lv_declaredShortName_1_0= ruleName )
                    // InternalKerMLOC.g:3181:6: lv_declaredShortName_1_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getIdentificationAccess().getDeclaredShortNameNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_declaredShortName_1_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIdentificationRule());
                    						}
                    						set(
                    							current,
                    							"declaredShortName",
                    							lv_declaredShortName_1_0,
                    							"dut.control.kermloc.KerMLOC.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_76); 

                    				newLeafNode(otherlv_2, grammarAccess.getIdentificationAccess().getGreaterThanSignKeyword_0_2());
                    			
                    // InternalKerMLOC.g:3202:4: ( (lv_declaredName_3_0= ruleName ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalKerMLOC.g:3203:5: (lv_declaredName_3_0= ruleName )
                            {
                            // InternalKerMLOC.g:3203:5: (lv_declaredName_3_0= ruleName )
                            // InternalKerMLOC.g:3204:6: lv_declaredName_3_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getIdentificationAccess().getDeclaredNameNameParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_declaredName_3_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIdentificationRule());
                            						}
                            						set(
                            							current,
                            							"declaredName",
                            							lv_declaredName_3_0,
                            							"dut.control.kermloc.KerMLOC.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3223:3: ( (lv_declaredName_4_0= ruleName ) )
                    {
                    // InternalKerMLOC.g:3223:3: ( (lv_declaredName_4_0= ruleName ) )
                    // InternalKerMLOC.g:3224:4: (lv_declaredName_4_0= ruleName )
                    {
                    // InternalKerMLOC.g:3224:4: (lv_declaredName_4_0= ruleName )
                    // InternalKerMLOC.g:3225:5: lv_declaredName_4_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getIdentificationAccess().getDeclaredNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_declaredName_4_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIdentificationRule());
                    					}
                    					set(
                    						current,
                    						"declaredName",
                    						lv_declaredName_4_0,
                    						"dut.control.kermloc.KerMLOC.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentification"


    // $ANTLR start "ruleMemberPrefix"
    // InternalKerMLOC.g:3247:1: ruleMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( (lv_isVariant_1_0= 'variant' ) )? ) ;
    public final EObject ruleMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isVariant_1_0=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3253:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( (lv_isVariant_1_0= 'variant' ) )? ) )
            // InternalKerMLOC.g:3254:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( (lv_isVariant_1_0= 'variant' ) )? )
            {
            // InternalKerMLOC.g:3254:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( (lv_isVariant_1_0= 'variant' ) )? )
            // InternalKerMLOC.g:3255:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( (lv_isVariant_1_0= 'variant' ) )?
            {
            // InternalKerMLOC.g:3255:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==108||(LA83_0>=121 && LA83_0<=123)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalKerMLOC.g:3256:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalKerMLOC.g:3256:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalKerMLOC.g:3257:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getMemberPrefixAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_77);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMemberPrefixRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"dut.control.kermloc.KerMLOC.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:3274:3: ( (lv_isVariant_1_0= 'variant' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==55) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalKerMLOC.g:3275:4: (lv_isVariant_1_0= 'variant' )
                    {
                    // InternalKerMLOC.g:3275:4: (lv_isVariant_1_0= 'variant' )
                    // InternalKerMLOC.g:3276:5: lv_isVariant_1_0= 'variant'
                    {
                    lv_isVariant_1_0=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_isVariant_1_0, grammarAccess.getMemberPrefixAccess().getIsVariantVariantKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemberPrefixRule());
                    					}
                    					setWithLastConsumed(current, "isVariant", lv_isVariant_1_0 != null, "variant");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberPrefix"


    // $ANTLR start "rulePrefixMetadata"
    // InternalKerMLOC.g:3293:1: rulePrefixMetadata[EObject in_current] returns [EObject current=in_current] : ( (lv_prefixMetadataExtension_0_0= RULE_PREFIXNAME_TEXT ) ) ;
    public final EObject rulePrefixMetadata(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_prefixMetadataExtension_0_0=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:3299:2: ( ( (lv_prefixMetadataExtension_0_0= RULE_PREFIXNAME_TEXT ) ) )
            // InternalKerMLOC.g:3300:2: ( (lv_prefixMetadataExtension_0_0= RULE_PREFIXNAME_TEXT ) )
            {
            // InternalKerMLOC.g:3300:2: ( (lv_prefixMetadataExtension_0_0= RULE_PREFIXNAME_TEXT ) )
            // InternalKerMLOC.g:3301:3: (lv_prefixMetadataExtension_0_0= RULE_PREFIXNAME_TEXT )
            {
            // InternalKerMLOC.g:3301:3: (lv_prefixMetadataExtension_0_0= RULE_PREFIXNAME_TEXT )
            // InternalKerMLOC.g:3302:4: lv_prefixMetadataExtension_0_0= RULE_PREFIXNAME_TEXT
            {
            lv_prefixMetadataExtension_0_0=(Token)match(input,RULE_PREFIXNAME_TEXT,FOLLOW_2); 

            				newLeafNode(lv_prefixMetadataExtension_0_0, grammarAccess.getPrefixMetadataAccess().getPrefixMetadataExtensionPREFIXNAME_TEXTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPrefixMetadataRule());
            				}
            				addWithLastConsumed(
            					current,
            					"prefixMetadataExtension",
            					lv_prefixMetadataExtension_0_0,
            					"dut.control.kermloc.KerMLOC.PREFIXNAME_TEXT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixMetadata"


    // $ANTLR start "ruleMultiplicityBounds"
    // InternalKerMLOC.g:3322:1: ruleMultiplicityBounds[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_MultiLow_1_0= ruleMultiplicityExpression ) ) (otherlv_2= '..' ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMultiplicityBounds(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_MultiLow_1_0 = null;

        AntlrDatatypeRuleToken lv_MultiHigh_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3328:2: ( (otherlv_0= '[' ( (lv_MultiLow_1_0= ruleMultiplicityExpression ) ) (otherlv_2= '..' ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) ) )? otherlv_4= ']' ) )
            // InternalKerMLOC.g:3329:2: (otherlv_0= '[' ( (lv_MultiLow_1_0= ruleMultiplicityExpression ) ) (otherlv_2= '..' ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) ) )? otherlv_4= ']' )
            {
            // InternalKerMLOC.g:3329:2: (otherlv_0= '[' ( (lv_MultiLow_1_0= ruleMultiplicityExpression ) ) (otherlv_2= '..' ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) ) )? otherlv_4= ']' )
            // InternalKerMLOC.g:3330:3: otherlv_0= '[' ( (lv_MultiLow_1_0= ruleMultiplicityExpression ) ) (otherlv_2= '..' ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityBoundsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalKerMLOC.g:3334:3: ( (lv_MultiLow_1_0= ruleMultiplicityExpression ) )
            // InternalKerMLOC.g:3335:4: (lv_MultiLow_1_0= ruleMultiplicityExpression )
            {
            // InternalKerMLOC.g:3335:4: (lv_MultiLow_1_0= ruleMultiplicityExpression )
            // InternalKerMLOC.g:3336:5: lv_MultiLow_1_0= ruleMultiplicityExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityBoundsAccess().getMultiLowMultiplicityExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_79);
            lv_MultiLow_1_0=ruleMultiplicityExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicityBoundsRule());
            					}
            					set(
            						current,
            						"MultiLow",
            						lv_MultiLow_1_0,
            						"dut.control.kermloc.KerMLOC.MultiplicityExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:3353:3: (otherlv_2= '..' ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==56) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalKerMLOC.g:3354:4: otherlv_2= '..' ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) )
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_78); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityBoundsAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalKerMLOC.g:3358:4: ( (lv_MultiHigh_3_0= ruleMultiplicityExpression ) )
                    // InternalKerMLOC.g:3359:5: (lv_MultiHigh_3_0= ruleMultiplicityExpression )
                    {
                    // InternalKerMLOC.g:3359:5: (lv_MultiHigh_3_0= ruleMultiplicityExpression )
                    // InternalKerMLOC.g:3360:6: lv_MultiHigh_3_0= ruleMultiplicityExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityBoundsAccess().getMultiHighMultiplicityExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_MultiHigh_3_0=ruleMultiplicityExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiplicityBoundsRule());
                    						}
                    						set(
                    							current,
                    							"MultiHigh",
                    							lv_MultiHigh_3_0,
                    							"dut.control.kermloc.KerMLOC.MultiplicityExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiplicityBoundsAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityBounds"


    // $ANTLR start "ruleTypingFeatureTyping"
    // InternalKerMLOC.g:3387:1: ruleTypingFeatureTyping[EObject in_current] returns [EObject current=in_current] : ( ( (lv_typings_0_0= ruleFeatureTypingName ) ) (otherlv_1= ',' ( (lv_typings_2_0= ruleFeatureTypingName ) ) )* ) ;
    public final EObject ruleTypingFeatureTyping(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_typings_0_0 = null;

        AntlrDatatypeRuleToken lv_typings_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3393:2: ( ( ( (lv_typings_0_0= ruleFeatureTypingName ) ) (otherlv_1= ',' ( (lv_typings_2_0= ruleFeatureTypingName ) ) )* ) )
            // InternalKerMLOC.g:3394:2: ( ( (lv_typings_0_0= ruleFeatureTypingName ) ) (otherlv_1= ',' ( (lv_typings_2_0= ruleFeatureTypingName ) ) )* )
            {
            // InternalKerMLOC.g:3394:2: ( ( (lv_typings_0_0= ruleFeatureTypingName ) ) (otherlv_1= ',' ( (lv_typings_2_0= ruleFeatureTypingName ) ) )* )
            // InternalKerMLOC.g:3395:3: ( (lv_typings_0_0= ruleFeatureTypingName ) ) (otherlv_1= ',' ( (lv_typings_2_0= ruleFeatureTypingName ) ) )*
            {
            // InternalKerMLOC.g:3395:3: ( (lv_typings_0_0= ruleFeatureTypingName ) )
            // InternalKerMLOC.g:3396:4: (lv_typings_0_0= ruleFeatureTypingName )
            {
            // InternalKerMLOC.g:3396:4: (lv_typings_0_0= ruleFeatureTypingName )
            // InternalKerMLOC.g:3397:5: lv_typings_0_0= ruleFeatureTypingName
            {

            					newCompositeNode(grammarAccess.getTypingFeatureTypingAccess().getTypingsFeatureTypingNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
            lv_typings_0_0=ruleFeatureTypingName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypingFeatureTypingRule());
            					}
            					add(
            						current,
            						"typings",
            						lv_typings_0_0,
            						"dut.control.kermloc.KerMLOC.FeatureTypingName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:3414:3: (otherlv_1= ',' ( (lv_typings_2_0= ruleFeatureTypingName ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==22) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalKerMLOC.g:3415:4: otherlv_1= ',' ( (lv_typings_2_0= ruleFeatureTypingName ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_81); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypingFeatureTypingAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLOC.g:3419:4: ( (lv_typings_2_0= ruleFeatureTypingName ) )
            	    // InternalKerMLOC.g:3420:5: (lv_typings_2_0= ruleFeatureTypingName )
            	    {
            	    // InternalKerMLOC.g:3420:5: (lv_typings_2_0= ruleFeatureTypingName )
            	    // InternalKerMLOC.g:3421:6: lv_typings_2_0= ruleFeatureTypingName
            	    {

            	    						newCompositeNode(grammarAccess.getTypingFeatureTypingAccess().getTypingsFeatureTypingNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_typings_2_0=ruleFeatureTypingName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypingFeatureTypingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"typings",
            	    							lv_typings_2_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureTypingName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypingFeatureTyping"


    // $ANTLR start "ruleSubsettingFeatureChain"
    // InternalKerMLOC.g:3444:1: ruleSubsettingFeatureChain[EObject in_current] returns [EObject current=in_current] : ( ( (lv_subsetting_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_subsetting_2_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleSubsettingFeatureChain(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_subsetting_0_0 = null;

        AntlrDatatypeRuleToken lv_subsetting_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3450:2: ( ( ( (lv_subsetting_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_subsetting_2_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:3451:2: ( ( (lv_subsetting_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_subsetting_2_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:3451:2: ( ( (lv_subsetting_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_subsetting_2_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:3452:3: ( (lv_subsetting_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_subsetting_2_0= ruleFeatureChainName ) ) )*
            {
            // InternalKerMLOC.g:3452:3: ( (lv_subsetting_0_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:3453:4: (lv_subsetting_0_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:3453:4: (lv_subsetting_0_0= ruleFeatureChainName )
            // InternalKerMLOC.g:3454:5: lv_subsetting_0_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getSubsettingFeatureChainAccess().getSubsettingFeatureChainNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
            lv_subsetting_0_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsettingFeatureChainRule());
            					}
            					add(
            						current,
            						"subsetting",
            						lv_subsetting_0_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:3471:3: (otherlv_1= ',' ( (lv_subsetting_2_0= ruleFeatureChainName ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==22) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalKerMLOC.g:3472:4: otherlv_1= ',' ( (lv_subsetting_2_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSubsettingFeatureChainAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLOC.g:3476:4: ( (lv_subsetting_2_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:3477:5: (lv_subsetting_2_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:3477:5: (lv_subsetting_2_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:3478:6: lv_subsetting_2_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getSubsettingFeatureChainAccess().getSubsettingFeatureChainNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_subsetting_2_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubsettingFeatureChainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subsetting",
            	    							lv_subsetting_2_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsettingFeatureChain"


    // $ANTLR start "ruleReferenceFeatureChain"
    // InternalKerMLOC.g:3501:1: ruleReferenceFeatureChain[EObject in_current] returns [EObject current=in_current] : ( ( (lv_references_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_references_2_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleReferenceFeatureChain(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_references_0_0 = null;

        AntlrDatatypeRuleToken lv_references_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3507:2: ( ( ( (lv_references_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_references_2_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:3508:2: ( ( (lv_references_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_references_2_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:3508:2: ( ( (lv_references_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_references_2_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:3509:3: ( (lv_references_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_references_2_0= ruleFeatureChainName ) ) )*
            {
            // InternalKerMLOC.g:3509:3: ( (lv_references_0_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:3510:4: (lv_references_0_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:3510:4: (lv_references_0_0= ruleFeatureChainName )
            // InternalKerMLOC.g:3511:5: lv_references_0_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getReferenceFeatureChainAccess().getReferencesFeatureChainNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
            lv_references_0_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceFeatureChainRule());
            					}
            					add(
            						current,
            						"references",
            						lv_references_0_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:3528:3: (otherlv_1= ',' ( (lv_references_2_0= ruleFeatureChainName ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==22) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalKerMLOC.g:3529:4: otherlv_1= ',' ( (lv_references_2_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_1, grammarAccess.getReferenceFeatureChainAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLOC.g:3533:4: ( (lv_references_2_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:3534:5: (lv_references_2_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:3534:5: (lv_references_2_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:3535:6: lv_references_2_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getReferenceFeatureChainAccess().getReferencesFeatureChainNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_references_2_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReferenceFeatureChainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"references",
            	    							lv_references_2_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceFeatureChain"


    // $ANTLR start "ruleCrossFeatureChain"
    // InternalKerMLOC.g:3558:1: ruleCrossFeatureChain[EObject in_current] returns [EObject current=in_current] : ( ( (lv_crosses_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_crosses_2_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleCrossFeatureChain(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_crosses_0_0 = null;

        AntlrDatatypeRuleToken lv_crosses_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3564:2: ( ( ( (lv_crosses_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_crosses_2_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:3565:2: ( ( (lv_crosses_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_crosses_2_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:3565:2: ( ( (lv_crosses_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_crosses_2_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:3566:3: ( (lv_crosses_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_crosses_2_0= ruleFeatureChainName ) ) )*
            {
            // InternalKerMLOC.g:3566:3: ( (lv_crosses_0_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:3567:4: (lv_crosses_0_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:3567:4: (lv_crosses_0_0= ruleFeatureChainName )
            // InternalKerMLOC.g:3568:5: lv_crosses_0_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getCrossFeatureChainAccess().getCrossesFeatureChainNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
            lv_crosses_0_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrossFeatureChainRule());
            					}
            					add(
            						current,
            						"crosses",
            						lv_crosses_0_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:3585:3: (otherlv_1= ',' ( (lv_crosses_2_0= ruleFeatureChainName ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==22) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalKerMLOC.g:3586:4: otherlv_1= ',' ( (lv_crosses_2_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCrossFeatureChainAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLOC.g:3590:4: ( (lv_crosses_2_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:3591:5: (lv_crosses_2_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:3591:5: (lv_crosses_2_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:3592:6: lv_crosses_2_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getCrossFeatureChainAccess().getCrossesFeatureChainNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_crosses_2_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCrossFeatureChainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"crosses",
            	    							lv_crosses_2_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossFeatureChain"


    // $ANTLR start "ruleRedefinitionFeatureChain"
    // InternalKerMLOC.g:3615:1: ruleRedefinitionFeatureChain[EObject in_current] returns [EObject current=in_current] : ( ( (lv_redefinitions_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_redefinitions_2_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleRedefinitionFeatureChain(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_redefinitions_0_0 = null;

        AntlrDatatypeRuleToken lv_redefinitions_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3621:2: ( ( ( (lv_redefinitions_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_redefinitions_2_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:3622:2: ( ( (lv_redefinitions_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_redefinitions_2_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:3622:2: ( ( (lv_redefinitions_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_redefinitions_2_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:3623:3: ( (lv_redefinitions_0_0= ruleFeatureChainName ) ) (otherlv_1= ',' ( (lv_redefinitions_2_0= ruleFeatureChainName ) ) )*
            {
            // InternalKerMLOC.g:3623:3: ( (lv_redefinitions_0_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:3624:4: (lv_redefinitions_0_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:3624:4: (lv_redefinitions_0_0= ruleFeatureChainName )
            // InternalKerMLOC.g:3625:5: lv_redefinitions_0_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getRedefinitionFeatureChainAccess().getRedefinitionsFeatureChainNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
            lv_redefinitions_0_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedefinitionFeatureChainRule());
            					}
            					add(
            						current,
            						"redefinitions",
            						lv_redefinitions_0_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:3642:3: (otherlv_1= ',' ( (lv_redefinitions_2_0= ruleFeatureChainName ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==22) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalKerMLOC.g:3643:4: otherlv_1= ',' ( (lv_redefinitions_2_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRedefinitionFeatureChainAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalKerMLOC.g:3647:4: ( (lv_redefinitions_2_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:3648:5: (lv_redefinitions_2_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:3648:5: (lv_redefinitions_2_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:3649:6: lv_redefinitions_2_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getRedefinitionFeatureChainAccess().getRedefinitionsFeatureChainNameParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_redefinitions_2_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRedefinitionFeatureChainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"redefinitions",
            	    							lv_redefinitions_2_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedefinitionFeatureChain"


    // $ANTLR start "ruleSubsets"
    // InternalKerMLOC.g:3672:1: ruleSubsets[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= ':>' | otherlv_1= 'subsets' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] ) ;
    public final EObject ruleSubsets(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_SubsettingFeatureChain_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3678:2: ( ( (otherlv_0= ':>' | otherlv_1= 'subsets' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] ) )
            // InternalKerMLOC.g:3679:2: ( (otherlv_0= ':>' | otherlv_1= 'subsets' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] )
            {
            // InternalKerMLOC.g:3679:2: ( (otherlv_0= ':>' | otherlv_1= 'subsets' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] )
            // InternalKerMLOC.g:3680:3: (otherlv_0= ':>' | otherlv_1= 'subsets' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current]
            {
            // InternalKerMLOC.g:3680:3: (otherlv_0= ':>' | otherlv_1= 'subsets' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==57) ) {
                alt91=1;
            }
            else if ( (LA91_0==58) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalKerMLOC.g:3681:4: otherlv_0= ':>'
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_82); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubsetsAccess().getColonGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3686:4: otherlv_1= 'subsets'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_82); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubsetsAccess().getSubsetsKeyword_0_1());
                    			

                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSubsetsRule());
            			}
            			newCompositeNode(grammarAccess.getSubsetsAccess().getSubsettingFeatureChainParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SubsettingFeatureChain_2=ruleSubsettingFeatureChain(current);

            state._fsp--;


            			current = this_SubsettingFeatureChain_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsets"


    // $ANTLR start "ruleTypePrefix"
    // InternalKerMLOC.g:3707:1: ruleTypePrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* ) ;
    public final EObject ruleTypePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        EObject this_PrefixMetadata_1 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3713:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* ) )
            // InternalKerMLOC.g:3714:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* )
            {
            // InternalKerMLOC.g:3714:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? (this_PrefixMetadata_1= rulePrefixMetadata[$current] )* )
            // InternalKerMLOC.g:3715:3: ( (lv_isAbstract_0_0= 'abstract' ) )? (this_PrefixMetadata_1= rulePrefixMetadata[$current] )*
            {
            // InternalKerMLOC.g:3715:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==59) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalKerMLOC.g:3716:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalKerMLOC.g:3716:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalKerMLOC.g:3717:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,59,FOLLOW_83); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getTypePrefixAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypePrefixRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", lv_isAbstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:3729:3: (this_PrefixMetadata_1= rulePrefixMetadata[$current] )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==RULE_PREFIXNAME_TEXT) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalKerMLOC.g:3730:4: this_PrefixMetadata_1= rulePrefixMetadata[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getTypePrefixRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getTypePrefixAccess().getPrefixMetadataParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_83);
            	    this_PrefixMetadata_1=rulePrefixMetadata(current);

            	    state._fsp--;


            	    				current = this_PrefixMetadata_1;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypePrefix"


    // $ANTLR start "ruleSpecializationPart"
    // InternalKerMLOC.g:3747:1: ruleSpecializationPart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] ) ;
    public final EObject ruleSpecializationPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_SubsettingFeatureChain_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3753:2: ( ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] ) )
            // InternalKerMLOC.g:3754:2: ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] )
            {
            // InternalKerMLOC.g:3754:2: ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] )
            // InternalKerMLOC.g:3755:3: (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current]
            {
            // InternalKerMLOC.g:3755:3: (otherlv_0= ':>' | otherlv_1= 'specializes' )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==57) ) {
                alt94=1;
            }
            else if ( (LA94_0==60) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalKerMLOC.g:3756:4: otherlv_0= ':>'
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_82); 

                    				newLeafNode(otherlv_0, grammarAccess.getSpecializationPartAccess().getColonGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3761:4: otherlv_1= 'specializes'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_82); 

                    				newLeafNode(otherlv_1, grammarAccess.getSpecializationPartAccess().getSpecializesKeyword_0_1());
                    			

                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSpecializationPartRule());
            			}
            			newCompositeNode(grammarAccess.getSpecializationPartAccess().getSubsettingFeatureChainParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SubsettingFeatureChain_2=ruleSubsettingFeatureChain(current);

            state._fsp--;


            			current = this_SubsettingFeatureChain_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecializationPart"


    // $ANTLR start "ruleSuperclassingPart"
    // InternalKerMLOC.g:3782:1: ruleSuperclassingPart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] ) ;
    public final EObject ruleSuperclassingPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_SubsettingFeatureChain_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3788:2: ( ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] ) )
            // InternalKerMLOC.g:3789:2: ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] )
            {
            // InternalKerMLOC.g:3789:2: ( (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current] )
            // InternalKerMLOC.g:3790:3: (otherlv_0= ':>' | otherlv_1= 'specializes' ) this_SubsettingFeatureChain_2= ruleSubsettingFeatureChain[$current]
            {
            // InternalKerMLOC.g:3790:3: (otherlv_0= ':>' | otherlv_1= 'specializes' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==57) ) {
                alt95=1;
            }
            else if ( (LA95_0==60) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalKerMLOC.g:3791:4: otherlv_0= ':>'
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_82); 

                    				newLeafNode(otherlv_0, grammarAccess.getSuperclassingPartAccess().getColonGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3796:4: otherlv_1= 'specializes'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_82); 

                    				newLeafNode(otherlv_1, grammarAccess.getSuperclassingPartAccess().getSpecializesKeyword_0_1());
                    			

                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getSuperclassingPartRule());
            			}
            			newCompositeNode(grammarAccess.getSuperclassingPartAccess().getSubsettingFeatureChainParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_SubsettingFeatureChain_2=ruleSubsettingFeatureChain(current);

            state._fsp--;


            			current = this_SubsettingFeatureChain_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperclassingPart"


    // $ANTLR start "ruleClassifierConjugationPart"
    // InternalKerMLOC.g:3817:1: ruleClassifierConjugationPart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) ) ;
    public final EObject ruleClassifierConjugationPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_originalType_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3823:2: ( ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) ) )
            // InternalKerMLOC.g:3824:2: ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) )
            {
            // InternalKerMLOC.g:3824:2: ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) )
            // InternalKerMLOC.g:3825:3: (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) )
            {
            // InternalKerMLOC.g:3825:3: (otherlv_0= '~' | otherlv_1= 'conjugates' )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==61) ) {
                alt96=1;
            }
            else if ( (LA96_0==62) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalKerMLOC.g:3826:4: otherlv_0= '~'
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_82); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassifierConjugationPartAccess().getTildeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3831:4: otherlv_1= 'conjugates'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_82); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassifierConjugationPartAccess().getConjugatesKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:3836:3: ( (lv_originalType_2_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:3837:4: (lv_originalType_2_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:3837:4: (lv_originalType_2_0= ruleFeatureChainName )
            // InternalKerMLOC.g:3838:5: lv_originalType_2_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getClassifierConjugationPartAccess().getOriginalTypeFeatureChainNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_originalType_2_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassifierConjugationPartRule());
            					}
            					set(
            						current,
            						"originalType",
            						lv_originalType_2_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifierConjugationPart"


    // $ANTLR start "ruleConjugationPart"
    // InternalKerMLOC.g:3860:1: ruleConjugationPart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) ) ;
    public final EObject ruleConjugationPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_originalType_2_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3866:2: ( ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) ) )
            // InternalKerMLOC.g:3867:2: ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) )
            {
            // InternalKerMLOC.g:3867:2: ( (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) ) )
            // InternalKerMLOC.g:3868:3: (otherlv_0= '~' | otherlv_1= 'conjugates' ) ( (lv_originalType_2_0= ruleFeatureChainName ) )
            {
            // InternalKerMLOC.g:3868:3: (otherlv_0= '~' | otherlv_1= 'conjugates' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==61) ) {
                alt97=1;
            }
            else if ( (LA97_0==62) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalKerMLOC.g:3869:4: otherlv_0= '~'
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_82); 

                    				newLeafNode(otherlv_0, grammarAccess.getConjugationPartAccess().getTildeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3874:4: otherlv_1= 'conjugates'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_82); 

                    				newLeafNode(otherlv_1, grammarAccess.getConjugationPartAccess().getConjugatesKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:3879:3: ( (lv_originalType_2_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:3880:4: (lv_originalType_2_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:3880:4: (lv_originalType_2_0= ruleFeatureChainName )
            // InternalKerMLOC.g:3881:5: lv_originalType_2_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getConjugationPartAccess().getOriginalTypeFeatureChainNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_originalType_2_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConjugationPartRule());
            					}
            					set(
            						current,
            						"originalType",
            						lv_originalType_2_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjugationPart"


    // $ANTLR start "ruleTypeRelationshipPart"
    // InternalKerMLOC.g:3903:1: ruleTypeRelationshipPart[EObject in_current] returns [EObject current=in_current] : (this_DisjoiningPart_0= ruleDisjoiningPart[$current] | this_UnioningPart_1= ruleUnioningPart[$current] | this_IntersectingPart_2= ruleIntersectingPart[$current] | this_DifferencingPart_3= ruleDifferencingPart[$current] ) ;
    public final EObject ruleTypeRelationshipPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_DisjoiningPart_0 = null;

        EObject this_UnioningPart_1 = null;

        EObject this_IntersectingPart_2 = null;

        EObject this_DifferencingPart_3 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3909:2: ( (this_DisjoiningPart_0= ruleDisjoiningPart[$current] | this_UnioningPart_1= ruleUnioningPart[$current] | this_IntersectingPart_2= ruleIntersectingPart[$current] | this_DifferencingPart_3= ruleDifferencingPart[$current] ) )
            // InternalKerMLOC.g:3910:2: (this_DisjoiningPart_0= ruleDisjoiningPart[$current] | this_UnioningPart_1= ruleUnioningPart[$current] | this_IntersectingPart_2= ruleIntersectingPart[$current] | this_DifferencingPart_3= ruleDifferencingPart[$current] )
            {
            // InternalKerMLOC.g:3910:2: (this_DisjoiningPart_0= ruleDisjoiningPart[$current] | this_UnioningPart_1= ruleUnioningPart[$current] | this_IntersectingPart_2= ruleIntersectingPart[$current] | this_DifferencingPart_3= ruleDifferencingPart[$current] )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt98=1;
                }
                break;
            case 64:
                {
                alt98=2;
                }
                break;
            case 65:
                {
                alt98=3;
                }
                break;
            case 66:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalKerMLOC.g:3911:3: this_DisjoiningPart_0= ruleDisjoiningPart[$current]
                    {

                    			if (current==null) {
                    				current = createModelElement(grammarAccess.getTypeRelationshipPartRule());
                    			}
                    			newCompositeNode(grammarAccess.getTypeRelationshipPartAccess().getDisjoiningPartParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisjoiningPart_0=ruleDisjoiningPart(current);

                    state._fsp--;


                    			current = this_DisjoiningPart_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:3923:3: this_UnioningPart_1= ruleUnioningPart[$current]
                    {

                    			if (current==null) {
                    				current = createModelElement(grammarAccess.getTypeRelationshipPartRule());
                    			}
                    			newCompositeNode(grammarAccess.getTypeRelationshipPartAccess().getUnioningPartParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnioningPart_1=ruleUnioningPart(current);

                    state._fsp--;


                    			current = this_UnioningPart_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:3935:3: this_IntersectingPart_2= ruleIntersectingPart[$current]
                    {

                    			if (current==null) {
                    				current = createModelElement(grammarAccess.getTypeRelationshipPartRule());
                    			}
                    			newCompositeNode(grammarAccess.getTypeRelationshipPartAccess().getIntersectingPartParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntersectingPart_2=ruleIntersectingPart(current);

                    state._fsp--;


                    			current = this_IntersectingPart_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:3947:3: this_DifferencingPart_3= ruleDifferencingPart[$current]
                    {

                    			if (current==null) {
                    				current = createModelElement(grammarAccess.getTypeRelationshipPartRule());
                    			}
                    			newCompositeNode(grammarAccess.getTypeRelationshipPartAccess().getDifferencingPartParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DifferencingPart_3=ruleDifferencingPart(current);

                    state._fsp--;


                    			current = this_DifferencingPart_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRelationshipPart"


    // $ANTLR start "ruleDisjoiningPart"
    // InternalKerMLOC.g:3963:1: ruleDisjoiningPart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'disjoint' otherlv_1= 'from' ( (lv_disjoining_2_0= ruleFeatureChainName ) ) (otherlv_3= ',' ( (lv_disjoining_4_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleDisjoiningPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_disjoining_2_0 = null;

        AntlrDatatypeRuleToken lv_disjoining_4_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:3969:2: ( (otherlv_0= 'disjoint' otherlv_1= 'from' ( (lv_disjoining_2_0= ruleFeatureChainName ) ) (otherlv_3= ',' ( (lv_disjoining_4_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:3970:2: (otherlv_0= 'disjoint' otherlv_1= 'from' ( (lv_disjoining_2_0= ruleFeatureChainName ) ) (otherlv_3= ',' ( (lv_disjoining_4_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:3970:2: (otherlv_0= 'disjoint' otherlv_1= 'from' ( (lv_disjoining_2_0= ruleFeatureChainName ) ) (otherlv_3= ',' ( (lv_disjoining_4_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:3971:3: otherlv_0= 'disjoint' otherlv_1= 'from' ( (lv_disjoining_2_0= ruleFeatureChainName ) ) (otherlv_3= ',' ( (lv_disjoining_4_0= ruleFeatureChainName ) ) )*
            {
            otherlv_0=(Token)match(input,63,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjoiningPartAccess().getDisjointKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_82); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjoiningPartAccess().getFromKeyword_1());
            		
            // InternalKerMLOC.g:3979:3: ( (lv_disjoining_2_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:3980:4: (lv_disjoining_2_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:3980:4: (lv_disjoining_2_0= ruleFeatureChainName )
            // InternalKerMLOC.g:3981:5: lv_disjoining_2_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getDisjoiningPartAccess().getDisjoiningFeatureChainNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_80);
            lv_disjoining_2_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisjoiningPartRule());
            					}
            					add(
            						current,
            						"disjoining",
            						lv_disjoining_2_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:3998:3: (otherlv_3= ',' ( (lv_disjoining_4_0= ruleFeatureChainName ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==22) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalKerMLOC.g:3999:4: otherlv_3= ',' ( (lv_disjoining_4_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDisjoiningPartAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalKerMLOC.g:4003:4: ( (lv_disjoining_4_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:4004:5: (lv_disjoining_4_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:4004:5: (lv_disjoining_4_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:4005:6: lv_disjoining_4_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getDisjoiningPartAccess().getDisjoiningFeatureChainNameParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_disjoining_4_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDisjoiningPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"disjoining",
            	    							lv_disjoining_4_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjoiningPart"


    // $ANTLR start "ruleUnioningPart"
    // InternalKerMLOC.g:4028:1: ruleUnioningPart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'unions' ( (lv_unioning_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_unioning_3_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleUnioningPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_unioning_1_0 = null;

        AntlrDatatypeRuleToken lv_unioning_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4034:2: ( (otherlv_0= 'unions' ( (lv_unioning_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_unioning_3_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:4035:2: (otherlv_0= 'unions' ( (lv_unioning_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_unioning_3_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:4035:2: (otherlv_0= 'unions' ( (lv_unioning_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_unioning_3_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:4036:3: otherlv_0= 'unions' ( (lv_unioning_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_unioning_3_0= ruleFeatureChainName ) ) )*
            {
            otherlv_0=(Token)match(input,64,FOLLOW_82); 

            			newLeafNode(otherlv_0, grammarAccess.getUnioningPartAccess().getUnionsKeyword_0());
            		
            // InternalKerMLOC.g:4040:3: ( (lv_unioning_1_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:4041:4: (lv_unioning_1_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:4041:4: (lv_unioning_1_0= ruleFeatureChainName )
            // InternalKerMLOC.g:4042:5: lv_unioning_1_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getUnioningPartAccess().getUnioningFeatureChainNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_80);
            lv_unioning_1_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnioningPartRule());
            					}
            					add(
            						current,
            						"unioning",
            						lv_unioning_1_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:4059:3: (otherlv_2= ',' ( (lv_unioning_3_0= ruleFeatureChainName ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==22) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalKerMLOC.g:4060:4: otherlv_2= ',' ( (lv_unioning_3_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUnioningPartAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalKerMLOC.g:4064:4: ( (lv_unioning_3_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:4065:5: (lv_unioning_3_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:4065:5: (lv_unioning_3_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:4066:6: lv_unioning_3_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getUnioningPartAccess().getUnioningFeatureChainNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_unioning_3_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnioningPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"unioning",
            	    							lv_unioning_3_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnioningPart"


    // $ANTLR start "ruleIntersectingPart"
    // InternalKerMLOC.g:4089:1: ruleIntersectingPart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'intersects' ( (lv_intersecting_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_intersecting_3_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleIntersectingPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_intersecting_1_0 = null;

        AntlrDatatypeRuleToken lv_intersecting_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4095:2: ( (otherlv_0= 'intersects' ( (lv_intersecting_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_intersecting_3_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:4096:2: (otherlv_0= 'intersects' ( (lv_intersecting_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_intersecting_3_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:4096:2: (otherlv_0= 'intersects' ( (lv_intersecting_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_intersecting_3_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:4097:3: otherlv_0= 'intersects' ( (lv_intersecting_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_intersecting_3_0= ruleFeatureChainName ) ) )*
            {
            otherlv_0=(Token)match(input,65,FOLLOW_82); 

            			newLeafNode(otherlv_0, grammarAccess.getIntersectingPartAccess().getIntersectsKeyword_0());
            		
            // InternalKerMLOC.g:4101:3: ( (lv_intersecting_1_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:4102:4: (lv_intersecting_1_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:4102:4: (lv_intersecting_1_0= ruleFeatureChainName )
            // InternalKerMLOC.g:4103:5: lv_intersecting_1_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getIntersectingPartAccess().getIntersectingFeatureChainNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_80);
            lv_intersecting_1_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntersectingPartRule());
            					}
            					add(
            						current,
            						"intersecting",
            						lv_intersecting_1_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:4120:3: (otherlv_2= ',' ( (lv_intersecting_3_0= ruleFeatureChainName ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==22) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalKerMLOC.g:4121:4: otherlv_2= ',' ( (lv_intersecting_3_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIntersectingPartAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalKerMLOC.g:4125:4: ( (lv_intersecting_3_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:4126:5: (lv_intersecting_3_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:4126:5: (lv_intersecting_3_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:4127:6: lv_intersecting_3_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getIntersectingPartAccess().getIntersectingFeatureChainNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_intersecting_3_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIntersectingPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"intersecting",
            	    							lv_intersecting_3_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntersectingPart"


    // $ANTLR start "ruleDifferencingPart"
    // InternalKerMLOC.g:4150:1: ruleDifferencingPart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'differences' ( (lv_differencing_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_differencing_3_0= ruleFeatureChainName ) ) )* ) ;
    public final EObject ruleDifferencingPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_differencing_1_0 = null;

        AntlrDatatypeRuleToken lv_differencing_3_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4156:2: ( (otherlv_0= 'differences' ( (lv_differencing_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_differencing_3_0= ruleFeatureChainName ) ) )* ) )
            // InternalKerMLOC.g:4157:2: (otherlv_0= 'differences' ( (lv_differencing_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_differencing_3_0= ruleFeatureChainName ) ) )* )
            {
            // InternalKerMLOC.g:4157:2: (otherlv_0= 'differences' ( (lv_differencing_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_differencing_3_0= ruleFeatureChainName ) ) )* )
            // InternalKerMLOC.g:4158:3: otherlv_0= 'differences' ( (lv_differencing_1_0= ruleFeatureChainName ) ) (otherlv_2= ',' ( (lv_differencing_3_0= ruleFeatureChainName ) ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_82); 

            			newLeafNode(otherlv_0, grammarAccess.getDifferencingPartAccess().getDifferencesKeyword_0());
            		
            // InternalKerMLOC.g:4162:3: ( (lv_differencing_1_0= ruleFeatureChainName ) )
            // InternalKerMLOC.g:4163:4: (lv_differencing_1_0= ruleFeatureChainName )
            {
            // InternalKerMLOC.g:4163:4: (lv_differencing_1_0= ruleFeatureChainName )
            // InternalKerMLOC.g:4164:5: lv_differencing_1_0= ruleFeatureChainName
            {

            					newCompositeNode(grammarAccess.getDifferencingPartAccess().getDifferencingFeatureChainNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_80);
            lv_differencing_1_0=ruleFeatureChainName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDifferencingPartRule());
            					}
            					add(
            						current,
            						"differencing",
            						lv_differencing_1_0,
            						"dut.control.kermloc.KerMLOC.FeatureChainName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKerMLOC.g:4181:3: (otherlv_2= ',' ( (lv_differencing_3_0= ruleFeatureChainName ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==22) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalKerMLOC.g:4182:4: otherlv_2= ',' ( (lv_differencing_3_0= ruleFeatureChainName ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_82); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDifferencingPartAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalKerMLOC.g:4186:4: ( (lv_differencing_3_0= ruleFeatureChainName ) )
            	    // InternalKerMLOC.g:4187:5: (lv_differencing_3_0= ruleFeatureChainName )
            	    {
            	    // InternalKerMLOC.g:4187:5: (lv_differencing_3_0= ruleFeatureChainName )
            	    // InternalKerMLOC.g:4188:6: lv_differencing_3_0= ruleFeatureChainName
            	    {

            	    						newCompositeNode(grammarAccess.getDifferencingPartAccess().getDifferencingFeatureChainNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_80);
            	    lv_differencing_3_0=ruleFeatureChainName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDifferencingPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"differencing",
            	    							lv_differencing_3_0,
            	    							"dut.control.kermloc.KerMLOC.FeatureChainName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDifferencingPart"


    // $ANTLR start "ruleClassifierDeclaration"
    // InternalKerMLOC.g:4211:1: ruleClassifierDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isSufficient_0_0= 'all' ) )? (this_Identification_1= ruleIdentification[$current] )? (this_MultiplicityBounds_2= ruleMultiplicityBounds[$current] )? (this_SuperclassingPart_3= ruleSuperclassingPart[$current] | this_ClassifierConjugationPart_4= ruleClassifierConjugationPart[$current] )? (this_TypeRelationshipPart_5= ruleTypeRelationshipPart[$current] )* ) ;
    public final EObject ruleClassifierDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isSufficient_0_0=null;
        EObject this_Identification_1 = null;

        EObject this_MultiplicityBounds_2 = null;

        EObject this_SuperclassingPart_3 = null;

        EObject this_ClassifierConjugationPart_4 = null;

        EObject this_TypeRelationshipPart_5 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4217:2: ( ( ( (lv_isSufficient_0_0= 'all' ) )? (this_Identification_1= ruleIdentification[$current] )? (this_MultiplicityBounds_2= ruleMultiplicityBounds[$current] )? (this_SuperclassingPart_3= ruleSuperclassingPart[$current] | this_ClassifierConjugationPart_4= ruleClassifierConjugationPart[$current] )? (this_TypeRelationshipPart_5= ruleTypeRelationshipPart[$current] )* ) )
            // InternalKerMLOC.g:4218:2: ( ( (lv_isSufficient_0_0= 'all' ) )? (this_Identification_1= ruleIdentification[$current] )? (this_MultiplicityBounds_2= ruleMultiplicityBounds[$current] )? (this_SuperclassingPart_3= ruleSuperclassingPart[$current] | this_ClassifierConjugationPart_4= ruleClassifierConjugationPart[$current] )? (this_TypeRelationshipPart_5= ruleTypeRelationshipPart[$current] )* )
            {
            // InternalKerMLOC.g:4218:2: ( ( (lv_isSufficient_0_0= 'all' ) )? (this_Identification_1= ruleIdentification[$current] )? (this_MultiplicityBounds_2= ruleMultiplicityBounds[$current] )? (this_SuperclassingPart_3= ruleSuperclassingPart[$current] | this_ClassifierConjugationPart_4= ruleClassifierConjugationPart[$current] )? (this_TypeRelationshipPart_5= ruleTypeRelationshipPart[$current] )* )
            // InternalKerMLOC.g:4219:3: ( (lv_isSufficient_0_0= 'all' ) )? (this_Identification_1= ruleIdentification[$current] )? (this_MultiplicityBounds_2= ruleMultiplicityBounds[$current] )? (this_SuperclassingPart_3= ruleSuperclassingPart[$current] | this_ClassifierConjugationPart_4= ruleClassifierConjugationPart[$current] )? (this_TypeRelationshipPart_5= ruleTypeRelationshipPart[$current] )*
            {
            // InternalKerMLOC.g:4219:3: ( (lv_isSufficient_0_0= 'all' ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==31) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalKerMLOC.g:4220:4: (lv_isSufficient_0_0= 'all' )
                    {
                    // InternalKerMLOC.g:4220:4: (lv_isSufficient_0_0= 'all' )
                    // InternalKerMLOC.g:4221:5: lv_isSufficient_0_0= 'all'
                    {
                    lv_isSufficient_0_0=(Token)match(input,31,FOLLOW_84); 

                    					newLeafNode(lv_isSufficient_0_0, grammarAccess.getClassifierDeclarationAccess().getIsSufficientAllKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassifierDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isSufficient", lv_isSufficient_0_0 != null, "all");
                    				

                    }


                    }
                    break;

            }

            // InternalKerMLOC.g:4233:3: (this_Identification_1= ruleIdentification[$current] )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=RULE_ID && LA104_0<=RULE_UNRESTRICTED_NAME)||LA104_0==38) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalKerMLOC.g:4234:4: this_Identification_1= ruleIdentification[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getClassifierDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getClassifierDeclarationAccess().getIdentificationParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_84);
                    this_Identification_1=ruleIdentification(current);

                    state._fsp--;


                    				current = this_Identification_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:4246:3: (this_MultiplicityBounds_2= ruleMultiplicityBounds[$current] )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==35) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalKerMLOC.g:4247:4: this_MultiplicityBounds_2= ruleMultiplicityBounds[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getClassifierDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getClassifierDeclarationAccess().getMultiplicityBoundsParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_85);
                    this_MultiplicityBounds_2=ruleMultiplicityBounds(current);

                    state._fsp--;


                    				current = this_MultiplicityBounds_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:4259:3: (this_SuperclassingPart_3= ruleSuperclassingPart[$current] | this_ClassifierConjugationPart_4= ruleClassifierConjugationPart[$current] )?
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==57||LA106_0==60) ) {
                alt106=1;
            }
            else if ( ((LA106_0>=61 && LA106_0<=62)) ) {
                alt106=2;
            }
            switch (alt106) {
                case 1 :
                    // InternalKerMLOC.g:4260:4: this_SuperclassingPart_3= ruleSuperclassingPart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getClassifierDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getClassifierDeclarationAccess().getSuperclassingPartParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_86);
                    this_SuperclassingPart_3=ruleSuperclassingPart(current);

                    state._fsp--;


                    				current = this_SuperclassingPart_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:4272:4: this_ClassifierConjugationPart_4= ruleClassifierConjugationPart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getClassifierDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getClassifierDeclarationAccess().getClassifierConjugationPartParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_86);
                    this_ClassifierConjugationPart_4=ruleClassifierConjugationPart(current);

                    state._fsp--;


                    				current = this_ClassifierConjugationPart_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:4284:3: (this_TypeRelationshipPart_5= ruleTypeRelationshipPart[$current] )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( ((LA107_0>=63 && LA107_0<=66)) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalKerMLOC.g:4285:4: this_TypeRelationshipPart_5= ruleTypeRelationshipPart[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getClassifierDeclarationRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getClassifierDeclarationAccess().getTypeRelationshipPartParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_86);
            	    this_TypeRelationshipPart_5=ruleTypeRelationshipPart(current);

            	    state._fsp--;


            	    				current = this_TypeRelationshipPart_5;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifierDeclaration"


    // $ANTLR start "entryRuleName"
    // InternalKerMLOC.g:4301:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLOC.g:4301:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLOC.g:4302:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalKerMLOC.g:4308:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:4314:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLOC.g:4315:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLOC.g:4315:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_ID) ) {
                alt108=1;
            }
            else if ( (LA108_0==RULE_UNRESTRICTED_NAME) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalKerMLOC.g:4316:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:4324:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
                    {
                    this_UNRESTRICTED_NAME_1=(Token)match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); 

                    			current.merge(this_UNRESTRICTED_NAME_1);
                    		

                    			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualification"
    // InternalKerMLOC.g:4335:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalKerMLOC.g:4335:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalKerMLOC.g:4336:2: iv_ruleQualification= ruleQualification EOF
            {
             newCompositeNode(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualification=ruleQualification();

            state._fsp--;

             current =iv_ruleQualification.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalKerMLOC.g:4342:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4348:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalKerMLOC.g:4349:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalKerMLOC.g:4349:2: (this_Name_0= ruleName kw= '::' )+
            int cnt109=0;
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==RULE_ID) ) {
                    int LA109_2 = input.LA(2);

                    if ( (LA109_2==32) ) {
                        int LA109_4 = input.LA(3);

                        if ( (LA109_4==EOF||(LA109_4>=RULE_ID && LA109_4<=RULE_UNRESTRICTED_NAME)) ) {
                            alt109=1;
                        }


                    }


                }
                else if ( (LA109_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA109_3 = input.LA(2);

                    if ( (LA109_3==32) ) {
                        int LA109_4 = input.LA(3);

                        if ( (LA109_4==EOF||(LA109_4>=RULE_ID && LA109_4<=RULE_UNRESTRICTED_NAME)) ) {
                            alt109=1;
                        }


                    }


                }


                switch (alt109) {
            	case 1 :
            	    // InternalKerMLOC.g:4350:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_87);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,32,FOLLOW_76); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt109 >= 1 ) break loop109;
                        EarlyExitException eee =
                            new EarlyExitException(109, input);
                        throw eee;
                }
                cnt109++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKerMLOC.g:4369:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLOC.g:4369:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLOC.g:4370:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalKerMLOC.g:4376:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4382:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalKerMLOC.g:4383:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalKerMLOC.g:4383:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalKerMLOC.g:4384:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalKerMLOC.g:4384:3: (this_Qualification_0= ruleQualification )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_ID) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==32) ) {
                    int LA110_4 = input.LA(3);

                    if ( ((LA110_4>=RULE_ID && LA110_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt110=1;
                    }
                }
            }
            else if ( (LA110_0==RULE_UNRESTRICTED_NAME) ) {
                int LA110_2 = input.LA(2);

                if ( (LA110_2==32) ) {
                    int LA110_4 = input.LA(3);

                    if ( ((LA110_4>=RULE_ID && LA110_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt110=1;
                    }
                }
            }
            switch (alt110) {
                case 1 :
                    // InternalKerMLOC.g:4385:4: this_Qualification_0= ruleQualification
                    {

                    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_Qualification_0=ruleQualification();

                    state._fsp--;


                    				current.merge(this_Qualification_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Name_1=ruleName();

            state._fsp--;


            			current.merge(this_Name_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFeatureChainName"
    // InternalKerMLOC.g:4410:1: entryRuleFeatureChainName returns [String current=null] : iv_ruleFeatureChainName= ruleFeatureChainName EOF ;
    public final String entryRuleFeatureChainName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureChainName = null;


        try {
            // InternalKerMLOC.g:4410:56: (iv_ruleFeatureChainName= ruleFeatureChainName EOF )
            // InternalKerMLOC.g:4411:2: iv_ruleFeatureChainName= ruleFeatureChainName EOF
            {
             newCompositeNode(grammarAccess.getFeatureChainNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureChainName=ruleFeatureChainName();

            state._fsp--;

             current =iv_ruleFeatureChainName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureChainName"


    // $ANTLR start "ruleFeatureChainName"
    // InternalKerMLOC.g:4417:1: ruleFeatureChainName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFeatureChainName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_Name_3 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4423:2: ( ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) )
            // InternalKerMLOC.g:4424:2: ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            {
            // InternalKerMLOC.g:4424:2: ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            // InternalKerMLOC.g:4425:3: (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )*
            {
            // InternalKerMLOC.g:4425:3: (kw= 'USELESS' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==67) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalKerMLOC.g:4426:4: kw= 'USELESS'
                    {
                    kw=(Token)match(input,67,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getUSELESSKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getFeatureChainNameAccess().getQualifiedNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_88);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:4442:3: (kw= '.' this_Name_3= ruleName )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==68) ) {
                    int LA112_2 = input.LA(2);

                    if ( ((LA112_2>=RULE_ID && LA112_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // InternalKerMLOC.g:4443:4: kw= '.' this_Name_3= ruleName
            	    {
            	    kw=(Token)match(input,68,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getFullStopKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_88);
            	    this_Name_3=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureChainName"


    // $ANTLR start "entryRuleFeatureTypingName"
    // InternalKerMLOC.g:4463:1: entryRuleFeatureTypingName returns [String current=null] : iv_ruleFeatureTypingName= ruleFeatureTypingName EOF ;
    public final String entryRuleFeatureTypingName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureTypingName = null;


        try {
            // InternalKerMLOC.g:4463:57: (iv_ruleFeatureTypingName= ruleFeatureTypingName EOF )
            // InternalKerMLOC.g:4464:2: iv_ruleFeatureTypingName= ruleFeatureTypingName EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypingNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureTypingName=ruleFeatureTypingName();

            state._fsp--;

             current =iv_ruleFeatureTypingName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureTypingName"


    // $ANTLR start "ruleFeatureTypingName"
    // InternalKerMLOC.g:4470:1: ruleFeatureTypingName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) ) ;
    public final AntlrDatatypeRuleToken ruleFeatureTypingName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureChainName_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4476:2: ( (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) ) )
            // InternalKerMLOC.g:4477:2: (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) )
            {
            // InternalKerMLOC.g:4477:2: (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_ID && LA113_0<=RULE_UNRESTRICTED_NAME)||LA113_0==67) ) {
                alt113=1;
            }
            else if ( (LA113_0==61) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalKerMLOC.g:4478:3: this_FeatureChainName_0= ruleFeatureChainName
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypingNameAccess().getFeatureChainNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureChainName_0=ruleFeatureChainName();

                    state._fsp--;


                    			current.merge(this_FeatureChainName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:4489:3: (kw= '~' this_QualifiedName_2= ruleQualifiedName )
                    {
                    // InternalKerMLOC.g:4489:3: (kw= '~' this_QualifiedName_2= ruleQualifiedName )
                    // InternalKerMLOC.g:4490:4: kw= '~' this_QualifiedName_2= ruleQualifiedName
                    {
                    kw=(Token)match(input,61,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFeatureTypingNameAccess().getTildeKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getFeatureTypingNameAccess().getQualifiedNameParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_QualifiedName_2=ruleQualifiedName();

                    state._fsp--;


                    				current.merge(this_QualifiedName_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureTypingName"


    // $ANTLR start "entryRuleExpression"
    // InternalKerMLOC.g:4510:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalKerMLOC.g:4510:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalKerMLOC.g:4511:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalKerMLOC.g:4517:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OwnedExpression_0= ruleOwnedExpression ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OwnedExpression_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4523:2: (this_OwnedExpression_0= ruleOwnedExpression )
            // InternalKerMLOC.g:4524:2: this_OwnedExpression_0= ruleOwnedExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOwnedExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            		current.merge(this_OwnedExpression_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOwnedExpression"
    // InternalKerMLOC.g:4537:1: entryRuleOwnedExpression returns [String current=null] : iv_ruleOwnedExpression= ruleOwnedExpression EOF ;
    public final String entryRuleOwnedExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOwnedExpression = null;


        try {
            // InternalKerMLOC.g:4537:55: (iv_ruleOwnedExpression= ruleOwnedExpression EOF )
            // InternalKerMLOC.g:4538:2: iv_ruleOwnedExpression= ruleOwnedExpression EOF
            {
             newCompositeNode(grammarAccess.getOwnedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedExpression=ruleOwnedExpression();

            state._fsp--;

             current =iv_ruleOwnedExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedExpression"


    // $ANTLR start "ruleOwnedExpression"
    // InternalKerMLOC.g:4544:1: ruleOwnedExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ConditionalExpression_0= ruleConditionalExpression ;
    public final AntlrDatatypeRuleToken ruleOwnedExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConditionalExpression_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4550:2: (this_ConditionalExpression_0= ruleConditionalExpression )
            // InternalKerMLOC.g:4551:2: this_ConditionalExpression_0= ruleConditionalExpression
            {

            		newCompositeNode(grammarAccess.getOwnedExpressionAccess().getConditionalExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;


            		current.merge(this_ConditionalExpression_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwnedExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalKerMLOC.g:4564:1: entryRuleConditionalExpression returns [String current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final String entryRuleConditionalExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalExpression = null;


        try {
            // InternalKerMLOC.g:4564:61: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalKerMLOC.g:4565:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalKerMLOC.g:4571:1: ruleConditionalExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) ) ;
    public final AntlrDatatypeRuleToken ruleConditionalExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NullCoalescingExpression_0 = null;

        AntlrDatatypeRuleToken this_NullCoalescingExpression_2 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_4 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_6 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4577:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) ) )
            // InternalKerMLOC.g:4578:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) )
            {
            // InternalKerMLOC.g:4578:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_STRING_VALUE||(LA114_0>=RULE_ID && LA114_0<=RULE_EXP_VALUE)||LA114_0==16||LA114_0==31||LA114_0==33||LA114_0==61||(LA114_0>=67 && LA114_0<=68)||(LA114_0>=83 && LA114_0<=86)||(LA114_0>=91 && LA114_0<=92)||LA114_0==96||LA114_0==98||LA114_0==103||LA114_0==105||(LA114_0>=119 && LA114_0<=120)) ) {
                alt114=1;
            }
            else if ( (LA114_0==69) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalKerMLOC.g:4579:3: this_NullCoalescingExpression_0= ruleNullCoalescingExpression
                    {

                    			newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullCoalescingExpression_0=ruleNullCoalescingExpression();

                    state._fsp--;


                    			current.merge(this_NullCoalescingExpression_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:4590:3: (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression )
                    {
                    // InternalKerMLOC.g:4590:3: (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression )
                    // InternalKerMLOC.g:4591:4: kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression
                    {
                    kw=(Token)match(input,69,FOLLOW_89); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionalExpressionAccess().getIfKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_90);
                    this_NullCoalescingExpression_2=ruleNullCoalescingExpression();

                    state._fsp--;


                    				current.merge(this_NullCoalescingExpression_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,70,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_2());
                    			

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOwnedExpressionParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_91);
                    this_OwnedExpression_4=ruleOwnedExpression();

                    state._fsp--;


                    				current.merge(this_OwnedExpression_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,71,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionalExpressionAccess().getElseKeyword_1_4());
                    			

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOwnedExpressionParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_OwnedExpression_6=ruleOwnedExpression();

                    state._fsp--;


                    				current.merge(this_OwnedExpression_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleNullCoalescingExpression"
    // InternalKerMLOC.g:4641:1: entryRuleNullCoalescingExpression returns [String current=null] : iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF ;
    public final String entryRuleNullCoalescingExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingExpression = null;


        try {
            // InternalKerMLOC.g:4641:64: (iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF )
            // InternalKerMLOC.g:4642:2: iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF
            {
             newCompositeNode(grammarAccess.getNullCoalescingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullCoalescingExpression=ruleNullCoalescingExpression();

            state._fsp--;

             current =iv_ruleNullCoalescingExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullCoalescingExpression"


    // $ANTLR start "ruleNullCoalescingExpression"
    // InternalKerMLOC.g:4648:1: ruleNullCoalescingExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ImpliesExpression_0 = null;

        AntlrDatatypeRuleToken this_ImpliesExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4654:2: ( (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* ) )
            // InternalKerMLOC.g:4655:2: (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* )
            {
            // InternalKerMLOC.g:4655:2: (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* )
            // InternalKerMLOC.g:4656:3: this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )*
            {

            			newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_92);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;


            			current.merge(this_ImpliesExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:4666:3: (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==72) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // InternalKerMLOC.g:4667:4: kw= '??' this_ImpliesExpression_2= ruleImpliesExpression
            	    {
            	    kw=(Token)match(input,72,FOLLOW_89); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNullCoalescingExpressionAccess().getQuestionMarkQuestionMarkKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_92);
            	    this_ImpliesExpression_2=ruleImpliesExpression();

            	    state._fsp--;


            	    				current.merge(this_ImpliesExpression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullCoalescingExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalKerMLOC.g:4687:1: entryRuleImpliesExpression returns [String current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final String entryRuleImpliesExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpliesExpression = null;


        try {
            // InternalKerMLOC.g:4687:57: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalKerMLOC.g:4688:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
             newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;

             current =iv_ruleImpliesExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalKerMLOC.g:4694:1: ruleImpliesExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleImpliesExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OrExpression_0 = null;

        AntlrDatatypeRuleToken this_OrExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4700:2: ( (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* ) )
            // InternalKerMLOC.g:4701:2: (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* )
            {
            // InternalKerMLOC.g:4701:2: (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* )
            // InternalKerMLOC.g:4702:3: this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )*
            {

            			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_93);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current.merge(this_OrExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:4712:3: (kw= 'implies' this_OrExpression_2= ruleOrExpression )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==73) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalKerMLOC.g:4713:4: kw= 'implies' this_OrExpression_2= ruleOrExpression
            	    {
            	    kw=(Token)match(input,73,FOLLOW_89); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_93);
            	    this_OrExpression_2=ruleOrExpression();

            	    state._fsp--;


            	    				current.merge(this_OrExpression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalKerMLOC.g:4733:1: entryRuleOrExpression returns [String current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final String entryRuleOrExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrExpression = null;


        try {
            // InternalKerMLOC.g:4733:52: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLOC.g:4734:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalKerMLOC.g:4740:1: ruleOrExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* ) ;
    public final AntlrDatatypeRuleToken ruleOrExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XorExpression_0 = null;

        AntlrDatatypeRuleToken this_XorExpression_2 = null;

        AntlrDatatypeRuleToken this_XorExpression_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4746:2: ( (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* ) )
            // InternalKerMLOC.g:4747:2: (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* )
            {
            // InternalKerMLOC.g:4747:2: (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* )
            // InternalKerMLOC.g:4748:3: this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_94);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current.merge(this_XorExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:4758:3: ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )*
            loop117:
            do {
                int alt117=3;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==74) ) {
                    alt117=1;
                }
                else if ( (LA117_0==75) ) {
                    alt117=2;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalKerMLOC.g:4759:4: (kw= '|' this_XorExpression_2= ruleXorExpression )
            	    {
            	    // InternalKerMLOC.g:4759:4: (kw= '|' this_XorExpression_2= ruleXorExpression )
            	    // InternalKerMLOC.g:4760:5: kw= '|' this_XorExpression_2= ruleXorExpression
            	    {
            	    kw=(Token)match(input,74,FOLLOW_89); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_1_0_1());
            	    				
            	    pushFollow(FOLLOW_94);
            	    this_XorExpression_2=ruleXorExpression();

            	    state._fsp--;


            	    					current.merge(this_XorExpression_2);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLOC.g:4777:4: (kw= 'or' this_XorExpression_4= ruleXorExpression )
            	    {
            	    // InternalKerMLOC.g:4777:4: (kw= 'or' this_XorExpression_4= ruleXorExpression )
            	    // InternalKerMLOC.g:4778:5: kw= 'or' this_XorExpression_4= ruleXorExpression
            	    {
            	    kw=(Token)match(input,75,FOLLOW_89); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1_0());
            	    				

            	    					newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_1_1_1());
            	    				
            	    pushFollow(FOLLOW_94);
            	    this_XorExpression_4=ruleXorExpression();

            	    state._fsp--;


            	    					current.merge(this_XorExpression_4);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalKerMLOC.g:4799:1: entryRuleXorExpression returns [String current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final String entryRuleXorExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorExpression = null;


        try {
            // InternalKerMLOC.g:4799:53: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLOC.g:4800:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalKerMLOC.g:4806:1: ruleXorExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleXorExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AndExpression_0 = null;

        AntlrDatatypeRuleToken this_AndExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4812:2: ( (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* ) )
            // InternalKerMLOC.g:4813:2: (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* )
            {
            // InternalKerMLOC.g:4813:2: (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* )
            // InternalKerMLOC.g:4814:3: this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_95);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current.merge(this_AndExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:4824:3: (kw= 'xor' this_AndExpression_2= ruleAndExpression )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==76) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalKerMLOC.g:4825:4: kw= 'xor' this_AndExpression_2= ruleAndExpression
            	    {
            	    kw=(Token)match(input,76,FOLLOW_89); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getXorExpressionAccess().getXorKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_95);
            	    this_AndExpression_2=ruleAndExpression();

            	    state._fsp--;


            	    				current.merge(this_AndExpression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalKerMLOC.g:4845:1: entryRuleAndExpression returns [String current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final String entryRuleAndExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndExpression = null;


        try {
            // InternalKerMLOC.g:4845:53: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLOC.g:4846:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalKerMLOC.g:4852:1: ruleAndExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* ) ;
    public final AntlrDatatypeRuleToken ruleAndExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken this_EqualityExpression_2 = null;

        AntlrDatatypeRuleToken this_EqualityExpression_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4858:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* ) )
            // InternalKerMLOC.g:4859:2: (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* )
            {
            // InternalKerMLOC.g:4859:2: (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* )
            // InternalKerMLOC.g:4860:3: this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_96);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current.merge(this_EqualityExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:4870:3: ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )*
            loop119:
            do {
                int alt119=3;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==77) ) {
                    alt119=1;
                }
                else if ( (LA119_0==78) ) {
                    alt119=2;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalKerMLOC.g:4871:4: (kw= '&' this_EqualityExpression_2= ruleEqualityExpression )
            	    {
            	    // InternalKerMLOC.g:4871:4: (kw= '&' this_EqualityExpression_2= ruleEqualityExpression )
            	    // InternalKerMLOC.g:4872:5: kw= '&' this_EqualityExpression_2= ruleEqualityExpression
            	    {
            	    kw=(Token)match(input,77,FOLLOW_89); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_1_0_1());
            	    				
            	    pushFollow(FOLLOW_96);
            	    this_EqualityExpression_2=ruleEqualityExpression();

            	    state._fsp--;


            	    					current.merge(this_EqualityExpression_2);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLOC.g:4889:4: (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression )
            	    {
            	    // InternalKerMLOC.g:4889:4: (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression )
            	    // InternalKerMLOC.g:4890:5: kw= 'and' this_EqualityExpression_4= ruleEqualityExpression
            	    {
            	    kw=(Token)match(input,78,FOLLOW_89); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0());
            	    				

            	    					newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_1_1_1());
            	    				
            	    pushFollow(FOLLOW_96);
            	    this_EqualityExpression_4=ruleEqualityExpression();

            	    state._fsp--;


            	    					current.merge(this_EqualityExpression_4);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalKerMLOC.g:4911:1: entryRuleEqualityExpression returns [String current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final String entryRuleEqualityExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLOC.g:4911:58: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLOC.g:4912:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalKerMLOC.g:4918:1: ruleEqualityExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleEqualityExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken this_ClassificationExpression_5 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4924:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* ) )
            // InternalKerMLOC.g:4925:2: (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* )
            {
            // InternalKerMLOC.g:4925:2: (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* )
            // InternalKerMLOC.g:4926:3: this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_97);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;


            			current.merge(this_ClassificationExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:4936:3: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( ((LA121_0>=79 && LA121_0<=82)) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // InternalKerMLOC.g:4937:4: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression
            	    {
            	    // InternalKerMLOC.g:4937:4: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            	    int alt120=4;
            	    switch ( input.LA(1) ) {
            	    case 79:
            	        {
            	        alt120=1;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt120=2;
            	        }
            	        break;
            	    case 81:
            	        {
            	        alt120=3;
            	        }
            	        break;
            	    case 82:
            	        {
            	        alt120=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 120, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt120) {
            	        case 1 :
            	            // InternalKerMLOC.g:4938:5: kw= '=='
            	            {
            	            kw=(Token)match(input,79,FOLLOW_89); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getEqualsSignEqualsSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:4944:5: kw= '!='
            	            {
            	            kw=(Token)match(input,80,FOLLOW_89); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:4950:5: kw= '==='
            	            {
            	            kw=(Token)match(input,81,FOLLOW_89); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalKerMLOC.g:4956:5: kw= '!=='
            	            {
            	            kw=(Token)match(input,82,FOLLOW_89); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_3());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_97);
            	    this_ClassificationExpression_5=ruleClassificationExpression();

            	    state._fsp--;


            	    				current.merge(this_ClassificationExpression_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleClassificationExpression"
    // InternalKerMLOC.g:4977:1: entryRuleClassificationExpression returns [String current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final String entryRuleClassificationExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLOC.g:4977:64: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLOC.g:4978:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
            {
             newCompositeNode(grammarAccess.getClassificationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassificationExpression=ruleClassificationExpression();

            state._fsp--;

             current =iv_ruleClassificationExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassificationExpression"


    // $ANTLR start "ruleClassificationExpression"
    // InternalKerMLOC.g:4984:1: ruleClassificationExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) ) ;
    public final AntlrDatatypeRuleToken ruleClassificationExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken this_ReferenceTypingName_4 = null;

        AntlrDatatypeRuleToken this_ReferenceTypingName_6 = null;

        AntlrDatatypeRuleToken this_ReferenceTypingName_10 = null;

        AntlrDatatypeRuleToken this_MetadataReferenceName_11 = null;

        AntlrDatatypeRuleToken this_ReferenceTypingName_13 = null;

        AntlrDatatypeRuleToken this_ReferenceTypingName_15 = null;

        AntlrDatatypeRuleToken this_MetadataReferenceName_16 = null;

        AntlrDatatypeRuleToken this_ReferenceTypingName_18 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:4990:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) ) )
            // InternalKerMLOC.g:4991:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) )
            {
            // InternalKerMLOC.g:4991:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) )
            int alt125=5;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // InternalKerMLOC.g:4992:3: (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? )
                    {
                    // InternalKerMLOC.g:4992:3: (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? )
                    // InternalKerMLOC.g:4993:4: this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )?
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_98);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;


                    				current.merge(this_RelationalExpression_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:5003:4: ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )?
                    int alt123=3;
                    int LA123_0 = input.LA(1);

                    if ( ((LA123_0>=83 && LA123_0<=85)) ) {
                        alt123=1;
                    }
                    else if ( (LA123_0==86) ) {
                        alt123=2;
                    }
                    switch (alt123) {
                        case 1 :
                            // InternalKerMLOC.g:5004:5: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName )
                            {
                            // InternalKerMLOC.g:5004:5: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName )
                            // InternalKerMLOC.g:5005:6: (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName
                            {
                            // InternalKerMLOC.g:5005:6: (kw= 'hastype' | kw= 'istype' | kw= '@' )
                            int alt122=3;
                            switch ( input.LA(1) ) {
                            case 83:
                                {
                                alt122=1;
                                }
                                break;
                            case 84:
                                {
                                alt122=2;
                                }
                                break;
                            case 85:
                                {
                                alt122=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 122, 0, input);

                                throw nvae;
                            }

                            switch (alt122) {
                                case 1 :
                                    // InternalKerMLOC.g:5006:7: kw= 'hastype'
                                    {
                                    kw=(Token)match(input,83,FOLLOW_5); 

                                    							current.merge(kw);
                                    							newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getHastypeKeyword_0_1_0_0_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalKerMLOC.g:5012:7: kw= 'istype'
                                    {
                                    kw=(Token)match(input,84,FOLLOW_5); 

                                    							current.merge(kw);
                                    							newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getIstypeKeyword_0_1_0_0_1());
                                    						

                                    }
                                    break;
                                case 3 :
                                    // InternalKerMLOC.g:5018:7: kw= '@'
                                    {
                                    kw=(Token)match(input,85,FOLLOW_5); 

                                    							current.merge(kw);
                                    							newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getCommercialAtKeyword_0_1_0_0_2());
                                    						

                                    }
                                    break;

                            }


                            						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getReferenceTypingNameParserRuleCall_0_1_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            this_ReferenceTypingName_4=ruleReferenceTypingName();

                            state._fsp--;


                            						current.merge(this_ReferenceTypingName_4);
                            					

                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:5036:5: (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName )
                            {
                            // InternalKerMLOC.g:5036:5: (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName )
                            // InternalKerMLOC.g:5037:6: kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName
                            {
                            kw=(Token)match(input,86,FOLLOW_5); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getAsKeyword_0_1_1_0());
                            					

                            						newCompositeNode(grammarAccess.getClassificationExpressionAccess().getReferenceTypingNameParserRuleCall_0_1_1_1());
                            					
                            pushFollow(FOLLOW_2);
                            this_ReferenceTypingName_6=ruleReferenceTypingName();

                            state._fsp--;


                            						current.merge(this_ReferenceTypingName_6);
                            					

                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:5056:3: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:5056:3: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName )
                    // InternalKerMLOC.g:5057:4: (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName
                    {
                    // InternalKerMLOC.g:5057:4: (kw= 'hastype' | kw= 'istype' | kw= '@' )
                    int alt124=3;
                    switch ( input.LA(1) ) {
                    case 83:
                        {
                        alt124=1;
                        }
                        break;
                    case 84:
                        {
                        alt124=2;
                        }
                        break;
                    case 85:
                        {
                        alt124=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;
                    }

                    switch (alt124) {
                        case 1 :
                            // InternalKerMLOC.g:5058:5: kw= 'hastype'
                            {
                            kw=(Token)match(input,83,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getHastypeKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:5064:5: kw= 'istype'
                            {
                            kw=(Token)match(input,84,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getIstypeKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalKerMLOC.g:5070:5: kw= '@'
                            {
                            kw=(Token)match(input,85,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getCommercialAtKeyword_1_0_2());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getReferenceTypingNameParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ReferenceTypingName_10=ruleReferenceTypingName();

                    state._fsp--;


                    				current.merge(this_ReferenceTypingName_10);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:5088:3: (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:5088:3: (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName )
                    // InternalKerMLOC.g:5089:4: this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getMetadataReferenceNameParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_99);
                    this_MetadataReferenceName_11=ruleMetadataReferenceName();

                    state._fsp--;


                    				current.merge(this_MetadataReferenceName_11);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,87,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getCommercialAtCommercialAtKeyword_2_1());
                    			

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getReferenceTypingNameParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_ReferenceTypingName_13=ruleReferenceTypingName();

                    state._fsp--;


                    				current.merge(this_ReferenceTypingName_13);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:5116:3: (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:5116:3: (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName )
                    // InternalKerMLOC.g:5117:4: kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName
                    {
                    kw=(Token)match(input,86,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getAsKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getReferenceTypingNameParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ReferenceTypingName_15=ruleReferenceTypingName();

                    state._fsp--;


                    				current.merge(this_ReferenceTypingName_15);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLOC.g:5134:3: (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:5134:3: (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName )
                    // InternalKerMLOC.g:5135:4: this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getMetadataReferenceNameParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_100);
                    this_MetadataReferenceName_16=ruleMetadataReferenceName();

                    state._fsp--;


                    				current.merge(this_MetadataReferenceName_16);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,88,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getMetaKeyword_4_1());
                    			

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getReferenceTypingNameParserRuleCall_4_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_ReferenceTypingName_18=ruleReferenceTypingName();

                    state._fsp--;


                    				current.merge(this_ReferenceTypingName_18);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassificationExpression"


    // $ANTLR start "entryRuleReferenceTypingName"
    // InternalKerMLOC.g:5165:1: entryRuleReferenceTypingName returns [String current=null] : iv_ruleReferenceTypingName= ruleReferenceTypingName EOF ;
    public final String entryRuleReferenceTypingName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferenceTypingName = null;


        try {
            // InternalKerMLOC.g:5165:59: (iv_ruleReferenceTypingName= ruleReferenceTypingName EOF )
            // InternalKerMLOC.g:5166:2: iv_ruleReferenceTypingName= ruleReferenceTypingName EOF
            {
             newCompositeNode(grammarAccess.getReferenceTypingNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceTypingName=ruleReferenceTypingName();

            state._fsp--;

             current =iv_ruleReferenceTypingName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceTypingName"


    // $ANTLR start "ruleReferenceTypingName"
    // InternalKerMLOC.g:5172:1: ruleReferenceTypingName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleReferenceTypingName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5178:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:5179:2: this_QualifiedName_0= ruleQualifiedName
            {

            		newCompositeNode(grammarAccess.getReferenceTypingNameAccess().getQualifiedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceTypingName"


    // $ANTLR start "entryRuleMetadataReferenceName"
    // InternalKerMLOC.g:5192:1: entryRuleMetadataReferenceName returns [String current=null] : iv_ruleMetadataReferenceName= ruleMetadataReferenceName EOF ;
    public final String entryRuleMetadataReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadataReferenceName = null;


        try {
            // InternalKerMLOC.g:5192:61: (iv_ruleMetadataReferenceName= ruleMetadataReferenceName EOF )
            // InternalKerMLOC.g:5193:2: iv_ruleMetadataReferenceName= ruleMetadataReferenceName EOF
            {
             newCompositeNode(grammarAccess.getMetadataReferenceNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataReferenceName=ruleMetadataReferenceName();

            state._fsp--;

             current =iv_ruleMetadataReferenceName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadataReferenceName"


    // $ANTLR start "ruleMetadataReferenceName"
    // InternalKerMLOC.g:5199:1: ruleMetadataReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleMetadataReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5205:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:5206:2: this_QualifiedName_0= ruleQualifiedName
            {

            		newCompositeNode(grammarAccess.getMetadataReferenceNameAccess().getQualifiedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadataReferenceName"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalKerMLOC.g:5219:1: entryRuleRelationalExpression returns [String current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final String entryRuleRelationalExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLOC.g:5219:60: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLOC.g:5220:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalKerMLOC.g:5226:1: ruleRelationalExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleRelationalExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_RangeExpression_0 = null;

        AntlrDatatypeRuleToken this_RangeExpression_5 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5232:2: ( (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* ) )
            // InternalKerMLOC.g:5233:2: (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* )
            {
            // InternalKerMLOC.g:5233:2: (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* )
            // InternalKerMLOC.g:5234:3: this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_101);
            this_RangeExpression_0=ruleRangeExpression();

            state._fsp--;


            			current.merge(this_RangeExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:5244:3: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( ((LA127_0>=38 && LA127_0<=39)||(LA127_0>=89 && LA127_0<=90)) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // InternalKerMLOC.g:5245:4: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression
            	    {
            	    // InternalKerMLOC.g:5245:4: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            	    int alt126=4;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt126=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt126=2;
            	        }
            	        break;
            	    case 89:
            	        {
            	        alt126=3;
            	        }
            	        break;
            	    case 90:
            	        {
            	        alt126=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 126, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt126) {
            	        case 1 :
            	            // InternalKerMLOC.g:5246:5: kw= '<'
            	            {
            	            kw=(Token)match(input,38,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getLessThanSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:5252:5: kw= '>'
            	            {
            	            kw=(Token)match(input,39,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getGreaterThanSignKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:5258:5: kw= '<='
            	            {
            	            kw=(Token)match(input,89,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalKerMLOC.g:5264:5: kw= '>='
            	            {
            	            kw=(Token)match(input,90,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_3());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_101);
            	    this_RangeExpression_5=ruleRangeExpression();

            	    state._fsp--;


            	    				current.merge(this_RangeExpression_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRangeExpression"
    // InternalKerMLOC.g:5285:1: entryRuleRangeExpression returns [String current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final String entryRuleRangeExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRangeExpression = null;


        try {
            // InternalKerMLOC.g:5285:55: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalKerMLOC.g:5286:2: iv_ruleRangeExpression= ruleRangeExpression EOF
            {
             newCompositeNode(grammarAccess.getRangeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeExpression=ruleRangeExpression();

            state._fsp--;

             current =iv_ruleRangeExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeExpression"


    // $ANTLR start "ruleRangeExpression"
    // InternalKerMLOC.g:5292:1: ruleRangeExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleRangeExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken this_AdditiveExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5298:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? ) )
            // InternalKerMLOC.g:5299:2: (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? )
            {
            // InternalKerMLOC.g:5299:2: (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? )
            // InternalKerMLOC.g:5300:3: this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )?
            {

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_103);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current.merge(this_AdditiveExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:5310:3: (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==56) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalKerMLOC.g:5311:4: kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression
                    {
                    kw=(Token)match(input,56,FOLLOW_102); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRangeExpressionAccess().getFullStopFullStopKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_AdditiveExpression_2=ruleAdditiveExpression();

                    state._fsp--;


                    				current.merge(this_AdditiveExpression_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalKerMLOC.g:5331:1: entryRuleAdditiveExpression returns [String current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final String entryRuleAdditiveExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLOC.g:5331:58: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLOC.g:5332:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalKerMLOC.g:5338:1: ruleAdditiveExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken this_MultiplicativeExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5344:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* ) )
            // InternalKerMLOC.g:5345:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* )
            {
            // InternalKerMLOC.g:5345:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* )
            // InternalKerMLOC.g:5346:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_104);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current.merge(this_MultiplicativeExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:5356:3: ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=91 && LA130_0<=92)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalKerMLOC.g:5357:4: (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression
            	    {
            	    // InternalKerMLOC.g:5357:4: (kw= '+' | kw= '-' )
            	    int alt129=2;
            	    int LA129_0 = input.LA(1);

            	    if ( (LA129_0==91) ) {
            	        alt129=1;
            	    }
            	    else if ( (LA129_0==92) ) {
            	        alt129=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 129, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt129) {
            	        case 1 :
            	            // InternalKerMLOC.g:5358:5: kw= '+'
            	            {
            	            kw=(Token)match(input,91,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:5364:5: kw= '-'
            	            {
            	            kw=(Token)match(input,92,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_104);
            	    this_MultiplicativeExpression_3=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    				current.merge(this_MultiplicativeExpression_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalKerMLOC.g:5385:1: entryRuleMultiplicativeExpression returns [String current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final String entryRuleMultiplicativeExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLOC.g:5385:64: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLOC.g:5386:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalKerMLOC.g:5392:1: ruleMultiplicativeExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken this_ExponentiationExpression_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5398:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* ) )
            // InternalKerMLOC.g:5399:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* )
            {
            // InternalKerMLOC.g:5399:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* )
            // InternalKerMLOC.g:5400:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_105);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current.merge(this_ExponentiationExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:5410:3: ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==33||(LA132_0>=93 && LA132_0<=94)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // InternalKerMLOC.g:5411:4: (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression
            	    {
            	    // InternalKerMLOC.g:5411:4: (kw= '*' | kw= '/' | kw= '%' )
            	    int alt131=3;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt131=1;
            	        }
            	        break;
            	    case 93:
            	        {
            	        alt131=2;
            	        }
            	        break;
            	    case 94:
            	        {
            	        alt131=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 131, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt131) {
            	        case 1 :
            	            // InternalKerMLOC.g:5412:5: kw= '*'
            	            {
            	            kw=(Token)match(input,33,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:5418:5: kw= '/'
            	            {
            	            kw=(Token)match(input,93,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:5424:5: kw= '%'
            	            {
            	            kw=(Token)match(input,94,FOLLOW_102); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicativeExpressionAccess().getPercentSignKeyword_1_0_2());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_105);
            	    this_ExponentiationExpression_4=ruleExponentiationExpression();

            	    state._fsp--;


            	    				current.merge(this_ExponentiationExpression_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleExponentiationExpression"
    // InternalKerMLOC.g:5445:1: entryRuleExponentiationExpression returns [String current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final String entryRuleExponentiationExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLOC.g:5445:64: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLOC.g:5446:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
            {
             newCompositeNode(grammarAccess.getExponentiationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentiationExpression=ruleExponentiationExpression();

            state._fsp--;

             current =iv_ruleExponentiationExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExponentiationExpression"


    // $ANTLR start "ruleExponentiationExpression"
    // InternalKerMLOC.g:5452:1: ruleExponentiationExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleExponentiationExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken this_UnaryExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5458:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? ) )
            // InternalKerMLOC.g:5459:2: (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? )
            {
            // InternalKerMLOC.g:5459:2: (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? )
            // InternalKerMLOC.g:5460:3: this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )?
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_106);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current.merge(this_UnaryExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:5470:3: ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==34||LA134_0==95) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalKerMLOC.g:5471:4: (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression
                    {
                    // InternalKerMLOC.g:5471:4: (kw= '**' | kw= '^' )
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==34) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==95) ) {
                        alt133=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;
                    }
                    switch (alt133) {
                        case 1 :
                            // InternalKerMLOC.g:5472:5: kw= '**'
                            {
                            kw=(Token)match(input,34,FOLLOW_102); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getExponentiationExpressionAccess().getAsteriskAsteriskKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:5478:5: kw= '^'
                            {
                            kw=(Token)match(input,95,FOLLOW_102); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getExponentiationExpressionAccess().getCircumflexAccentKeyword_1_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_3=ruleUnaryExpression();

                    state._fsp--;


                    				current.merge(this_UnaryExpression_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExponentiationExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalKerMLOC.g:5499:1: entryRuleUnaryExpression returns [String current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final String entryRuleUnaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLOC.g:5499:55: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLOC.g:5500:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalKerMLOC.g:5506:1: ruleUnaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExtentExpression_4 = null;

        AntlrDatatypeRuleToken this_ExtentExpression_5 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5512:2: ( ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression ) )
            // InternalKerMLOC.g:5513:2: ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression )
            {
            // InternalKerMLOC.g:5513:2: ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==61||(LA136_0>=91 && LA136_0<=92)||LA136_0==96) ) {
                alt136=1;
            }
            else if ( (LA136_0==RULE_STRING_VALUE||(LA136_0>=RULE_ID && LA136_0<=RULE_EXP_VALUE)||LA136_0==16||LA136_0==31||LA136_0==33||(LA136_0>=67 && LA136_0<=68)||LA136_0==98||LA136_0==103||LA136_0==105||(LA136_0>=119 && LA136_0<=120)) ) {
                alt136=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }
            switch (alt136) {
                case 1 :
                    // InternalKerMLOC.g:5514:3: ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression )
                    {
                    // InternalKerMLOC.g:5514:3: ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression )
                    // InternalKerMLOC.g:5515:4: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression
                    {
                    // InternalKerMLOC.g:5515:4: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' )
                    int alt135=4;
                    switch ( input.LA(1) ) {
                    case 91:
                        {
                        alt135=1;
                        }
                        break;
                    case 92:
                        {
                        alt135=2;
                        }
                        break;
                    case 61:
                        {
                        alt135=3;
                        }
                        break;
                    case 96:
                        {
                        alt135=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }

                    switch (alt135) {
                        case 1 :
                            // InternalKerMLOC.g:5516:5: kw= '+'
                            {
                            kw=(Token)match(input,91,FOLLOW_102); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:5522:5: kw= '-'
                            {
                            kw=(Token)match(input,92,FOLLOW_102); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalKerMLOC.g:5528:5: kw= '~'
                            {
                            kw=(Token)match(input,61,FOLLOW_102); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getTildeKeyword_0_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalKerMLOC.g:5534:5: kw= 'not'
                            {
                            kw=(Token)match(input,96,FOLLOW_102); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getNotKeyword_0_0_3());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ExtentExpression_4=ruleExtentExpression();

                    state._fsp--;


                    				current.merge(this_ExtentExpression_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:5552:3: this_ExtentExpression_5= ruleExtentExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExtentExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtentExpression_5=ruleExtentExpression();

                    state._fsp--;


                    			current.merge(this_ExtentExpression_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleExtentExpression"
    // InternalKerMLOC.g:5566:1: entryRuleExtentExpression returns [String current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final String entryRuleExtentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtentExpression = null;


        try {
            // InternalKerMLOC.g:5566:56: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLOC.g:5567:2: iv_ruleExtentExpression= ruleExtentExpression EOF
            {
             newCompositeNode(grammarAccess.getExtentExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtentExpression=ruleExtentExpression();

            state._fsp--;

             current =iv_ruleExtentExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtentExpression"


    // $ANTLR start "ruleExtentExpression"
    // InternalKerMLOC.g:5573:1: ruleExtentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression ) ;
    public final AntlrDatatypeRuleToken ruleExtentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ReferenceTypingName_1 = null;

        AntlrDatatypeRuleToken this_PrimaryExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5579:2: ( ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression ) )
            // InternalKerMLOC.g:5580:2: ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression )
            {
            // InternalKerMLOC.g:5580:2: ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==31) ) {
                alt137=1;
            }
            else if ( (LA137_0==RULE_STRING_VALUE||(LA137_0>=RULE_ID && LA137_0<=RULE_EXP_VALUE)||LA137_0==16||LA137_0==33||(LA137_0>=67 && LA137_0<=68)||LA137_0==98||LA137_0==103||LA137_0==105||(LA137_0>=119 && LA137_0<=120)) ) {
                alt137=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalKerMLOC.g:5581:3: (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:5581:3: (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName )
                    // InternalKerMLOC.g:5582:4: kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName
                    {
                    kw=(Token)match(input,31,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getExtentExpressionAccess().getAllKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getExtentExpressionAccess().getReferenceTypingNameParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ReferenceTypingName_1=ruleReferenceTypingName();

                    state._fsp--;


                    				current.merge(this_ReferenceTypingName_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:5599:3: this_PrimaryExpression_2= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExtentExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_2=rulePrimaryExpression();

                    state._fsp--;


                    			current.merge(this_PrimaryExpression_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtentExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalKerMLOC.g:5613:1: entryRulePrimaryExpression returns [String current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final String entryRulePrimaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpression = null;


        try {
            // InternalKerMLOC.g:5613:57: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKerMLOC.g:5614:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalKerMLOC.g:5620:1: rulePrimaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseExpression_0 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_2 = null;

        AntlrDatatypeRuleToken this_SequenceExpression_5 = null;

        AntlrDatatypeRuleToken this_SequenceExpression_8 = null;

        AntlrDatatypeRuleToken this_ReferenceTypingName_11 = null;

        AntlrDatatypeRuleToken this_BodyExpression_12 = null;

        AntlrDatatypeRuleToken this_FunctionReferenceExpression_13 = null;

        AntlrDatatypeRuleToken this_ArgumentList_14 = null;

        AntlrDatatypeRuleToken this_BodyExpression_16 = null;

        AntlrDatatypeRuleToken this_BodyExpression_18 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_20 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5626:2: ( (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* ) )
            // InternalKerMLOC.g:5627:2: (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* )
            {
            // InternalKerMLOC.g:5627:2: (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* )
            // InternalKerMLOC.g:5628:3: this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_107);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current.merge(this_BaseExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:5638:3: (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==68) ) {
                int LA138_1 = input.LA(2);

                if ( ((LA138_1>=RULE_ID && LA138_1<=RULE_UNRESTRICTED_NAME)||LA138_1==67) ) {
                    alt138=1;
                }
            }
            switch (alt138) {
                case 1 :
                    // InternalKerMLOC.g:5639:4: kw= '.' this_FeatureChainName_2= ruleFeatureChainName
                    {
                    kw=(Token)match(input,68,FOLLOW_82); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureChainNameParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_107);
                    this_FeatureChainName_2=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:5655:3: ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==35||LA142_0==68||LA142_0==97||(LA142_0>=100 && LA142_0<=101)) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // InternalKerMLOC.g:5656:4: ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )?
            	    {
            	    // InternalKerMLOC.g:5656:4: ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) )
            	    int alt140=5;
            	    switch ( input.LA(1) ) {
            	    case 97:
            	        {
            	        alt140=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt140=2;
            	        }
            	        break;
            	    case 100:
            	        {
            	        alt140=3;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt140=4;
            	        }
            	        break;
            	    case 101:
            	        {
            	        alt140=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 140, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt140) {
            	        case 1 :
            	            // InternalKerMLOC.g:5657:5: (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
            	            {
            	            // InternalKerMLOC.g:5657:5: (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
            	            // InternalKerMLOC.g:5658:6: kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')'
            	            {
            	            kw=(Token)match(input,97,FOLLOW_108); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getNumberSignKeyword_2_0_0_0());
            	            					
            	            kw=(Token)match(input,98,FOLLOW_35); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0_0_1());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceExpressionParserRuleCall_2_0_0_2());
            	            					
            	            pushFollow(FOLLOW_109);
            	            this_SequenceExpression_5=ruleSequenceExpression();

            	            state._fsp--;


            	            						current.merge(this_SequenceExpression_5);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					
            	            kw=(Token)match(input,99,FOLLOW_107); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_0_0_3());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:5685:5: (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' )
            	            {
            	            // InternalKerMLOC.g:5685:5: (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' )
            	            // InternalKerMLOC.g:5686:6: kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']'
            	            {
            	            kw=(Token)match(input,35,FOLLOW_35); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getLeftSquareBracketKeyword_2_0_1_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceExpressionParserRuleCall_2_0_1_1());
            	            					
            	            pushFollow(FOLLOW_36);
            	            this_SequenceExpression_8=ruleSequenceExpression();

            	            state._fsp--;


            	            						current.merge(this_SequenceExpression_8);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					
            	            kw=(Token)match(input,36,FOLLOW_107); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_2_0_1_2());
            	            					

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:5708:5: (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) )
            	            {
            	            // InternalKerMLOC.g:5708:5: (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) )
            	            // InternalKerMLOC.g:5709:6: kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList )
            	            {
            	            kw=(Token)match(input,100,FOLLOW_5); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getReferenceTypingNameParserRuleCall_2_0_2_1());
            	            					
            	            pushFollow(FOLLOW_110);
            	            this_ReferenceTypingName_11=ruleReferenceTypingName();

            	            state._fsp--;


            	            						current.merge(this_ReferenceTypingName_11);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					
            	            // InternalKerMLOC.g:5724:6: (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList )
            	            int alt139=3;
            	            switch ( input.LA(1) ) {
            	            case 16:
            	                {
            	                alt139=1;
            	                }
            	                break;
            	            case RULE_ID:
            	            case RULE_UNRESTRICTED_NAME:
            	                {
            	                alt139=2;
            	                }
            	                break;
            	            case 98:
            	                {
            	                alt139=3;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 139, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt139) {
            	                case 1 :
            	                    // InternalKerMLOC.g:5725:7: this_BodyExpression_12= ruleBodyExpression
            	                    {

            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyExpressionParserRuleCall_2_0_2_2_0());
            	                    						
            	                    pushFollow(FOLLOW_107);
            	                    this_BodyExpression_12=ruleBodyExpression();

            	                    state._fsp--;


            	                    							current.merge(this_BodyExpression_12);
            	                    						

            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalKerMLOC.g:5736:7: this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression
            	                    {

            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionReferenceExpressionParserRuleCall_2_0_2_2_1());
            	                    						
            	                    pushFollow(FOLLOW_107);
            	                    this_FunctionReferenceExpression_13=ruleFunctionReferenceExpression();

            	                    state._fsp--;


            	                    							current.merge(this_FunctionReferenceExpression_13);
            	                    						

            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalKerMLOC.g:5747:7: this_ArgumentList_14= ruleArgumentList
            	                    {

            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_2_0_2_2_2());
            	                    						
            	                    pushFollow(FOLLOW_107);
            	                    this_ArgumentList_14=ruleArgumentList();

            	                    state._fsp--;


            	                    							current.merge(this_ArgumentList_14);
            	                    						

            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalKerMLOC.g:5760:5: (kw= '.' this_BodyExpression_16= ruleBodyExpression )
            	            {
            	            // InternalKerMLOC.g:5760:5: (kw= '.' this_BodyExpression_16= ruleBodyExpression )
            	            // InternalKerMLOC.g:5761:6: kw= '.' this_BodyExpression_16= ruleBodyExpression
            	            {
            	            kw=(Token)match(input,68,FOLLOW_111); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_0_3_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyExpressionParserRuleCall_2_0_3_1());
            	            					
            	            pushFollow(FOLLOW_107);
            	            this_BodyExpression_16=ruleBodyExpression();

            	            state._fsp--;


            	            						current.merge(this_BodyExpression_16);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalKerMLOC.g:5778:5: (kw= '.?' this_BodyExpression_18= ruleBodyExpression )
            	            {
            	            // InternalKerMLOC.g:5778:5: (kw= '.?' this_BodyExpression_18= ruleBodyExpression )
            	            // InternalKerMLOC.g:5779:6: kw= '.?' this_BodyExpression_18= ruleBodyExpression
            	            {
            	            kw=(Token)match(input,101,FOLLOW_111); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopQuestionMarkKeyword_2_0_4_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyExpressionParserRuleCall_2_0_4_1());
            	            					
            	            pushFollow(FOLLOW_107);
            	            this_BodyExpression_18=ruleBodyExpression();

            	            state._fsp--;


            	            						current.merge(this_BodyExpression_18);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKerMLOC.g:5796:4: (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )?
            	    int alt141=2;
            	    int LA141_0 = input.LA(1);

            	    if ( (LA141_0==68) ) {
            	        int LA141_1 = input.LA(2);

            	        if ( ((LA141_1>=RULE_ID && LA141_1<=RULE_UNRESTRICTED_NAME)||LA141_1==67) ) {
            	            alt141=1;
            	        }
            	    }
            	    switch (alt141) {
            	        case 1 :
            	            // InternalKerMLOC.g:5797:5: kw= '.' this_FeatureChainName_20= ruleFeatureChainName
            	            {
            	            kw=(Token)match(input,68,FOLLOW_82); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0());
            	            				

            	            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureChainNameParserRuleCall_2_1_1());
            	            				
            	            pushFollow(FOLLOW_107);
            	            this_FeatureChainName_20=ruleFeatureChainName();

            	            state._fsp--;


            	            					current.merge(this_FeatureChainName_20);
            	            				

            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalKerMLOC.g:5818:1: entryRuleBaseExpression returns [String current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final String entryRuleBaseExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseExpression = null;


        try {
            // InternalKerMLOC.g:5818:54: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLOC.g:5819:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;

             current =iv_ruleBaseExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // InternalKerMLOC.g:5825:1: ruleBaseExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleBaseExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NullExpression_0 = null;

        AntlrDatatypeRuleToken this_LiteralExpression_1 = null;

        AntlrDatatypeRuleToken this_FeatureReferenceExpression_2 = null;

        AntlrDatatypeRuleToken this_MetadataAccessExpression_3 = null;

        AntlrDatatypeRuleToken this_InvocationExpression_4 = null;

        AntlrDatatypeRuleToken this_BodyExpression_5 = null;

        AntlrDatatypeRuleToken this_SequenceExpression_7 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5831:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) ) )
            // InternalKerMLOC.g:5832:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) )
            {
            // InternalKerMLOC.g:5832:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) )
            int alt143=7;
            alt143 = dfa143.predict(input);
            switch (alt143) {
                case 1 :
                    // InternalKerMLOC.g:5833:3: this_NullExpression_0= ruleNullExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullExpression_0=ruleNullExpression();

                    state._fsp--;


                    			current.merge(this_NullExpression_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:5844:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current.merge(this_LiteralExpression_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:5855:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureReferenceExpression_2=ruleFeatureReferenceExpression();

                    state._fsp--;


                    			current.merge(this_FeatureReferenceExpression_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:5866:3: this_MetadataAccessExpression_3= ruleMetadataAccessExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getMetadataAccessExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetadataAccessExpression_3=ruleMetadataAccessExpression();

                    state._fsp--;


                    			current.merge(this_MetadataAccessExpression_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLOC.g:5877:3: this_InvocationExpression_4= ruleInvocationExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvocationExpression_4=ruleInvocationExpression();

                    state._fsp--;


                    			current.merge(this_InvocationExpression_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKerMLOC.g:5888:3: this_BodyExpression_5= ruleBodyExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getBodyExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BodyExpression_5=ruleBodyExpression();

                    state._fsp--;


                    			current.merge(this_BodyExpression_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalKerMLOC.g:5899:3: (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' )
                    {
                    // InternalKerMLOC.g:5899:3: (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' )
                    // InternalKerMLOC.g:5900:4: kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')'
                    {
                    kw=(Token)match(input,98,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_109);
                    this_SequenceExpression_7=ruleSequenceExpression();

                    state._fsp--;


                    				current.merge(this_SequenceExpression_7);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,99,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_6_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleFunctionReferenceExpression"
    // InternalKerMLOC.g:5925:1: entryRuleFunctionReferenceExpression returns [String current=null] : iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF ;
    public final String entryRuleFunctionReferenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionReferenceExpression = null;


        try {
            // InternalKerMLOC.g:5925:67: (iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF )
            // InternalKerMLOC.g:5926:2: iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getFunctionReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReferenceExpression=ruleFunctionReferenceExpression();

            state._fsp--;

             current =iv_ruleFunctionReferenceExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionReferenceExpression"


    // $ANTLR start "ruleFunctionReferenceExpression"
    // InternalKerMLOC.g:5932:1: ruleFunctionReferenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleFunctionReferenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5938:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:5939:2: this_QualifiedName_0= ruleQualifiedName
            {

            		newCompositeNode(grammarAccess.getFunctionReferenceExpressionAccess().getQualifiedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionReferenceExpression"


    // $ANTLR start "entryRuleArgumentList"
    // InternalKerMLOC.g:5952:1: entryRuleArgumentList returns [String current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final String entryRuleArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgumentList = null;


        try {
            // InternalKerMLOC.g:5952:52: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalKerMLOC.g:5953:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
             newCompositeNode(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;

             current =iv_ruleArgumentList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // InternalKerMLOC.g:5959:1: ruleArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PositionalArgumentList_1 = null;

        AntlrDatatypeRuleToken this_NamedArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:5965:2: ( (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' ) )
            // InternalKerMLOC.g:5966:2: (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' )
            {
            // InternalKerMLOC.g:5966:2: (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' )
            // InternalKerMLOC.g:5967:3: kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')'
            {
            kw=(Token)match(input,98,FOLLOW_112); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalKerMLOC.g:5972:3: (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )?
            int alt144=3;
            alt144 = dfa144.predict(input);
            switch (alt144) {
                case 1 :
                    // InternalKerMLOC.g:5973:4: this_PositionalArgumentList_1= rulePositionalArgumentList
                    {

                    				newCompositeNode(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_109);
                    this_PositionalArgumentList_1=rulePositionalArgumentList();

                    state._fsp--;


                    				current.merge(this_PositionalArgumentList_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:5984:4: this_NamedArgumentList_2= ruleNamedArgumentList
                    {

                    				newCompositeNode(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_109);
                    this_NamedArgumentList_2=ruleNamedArgumentList();

                    state._fsp--;


                    				current.merge(this_NamedArgumentList_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            kw=(Token)match(input,99,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArgumentListAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRulePositionalArgumentList"
    // InternalKerMLOC.g:6004:1: entryRulePositionalArgumentList returns [String current=null] : iv_rulePositionalArgumentList= rulePositionalArgumentList EOF ;
    public final String entryRulePositionalArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePositionalArgumentList = null;


        try {
            // InternalKerMLOC.g:6004:62: (iv_rulePositionalArgumentList= rulePositionalArgumentList EOF )
            // InternalKerMLOC.g:6005:2: iv_rulePositionalArgumentList= rulePositionalArgumentList EOF
            {
             newCompositeNode(grammarAccess.getPositionalArgumentListRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositionalArgumentList=rulePositionalArgumentList();

            state._fsp--;

             current =iv_rulePositionalArgumentList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositionalArgumentList"


    // $ANTLR start "rulePositionalArgumentList"
    // InternalKerMLOC.g:6011:1: rulePositionalArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* ) ;
    public final AntlrDatatypeRuleToken rulePositionalArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArgumentValue_0 = null;

        AntlrDatatypeRuleToken this_ArgumentValue_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6017:2: ( (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* ) )
            // InternalKerMLOC.g:6018:2: (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* )
            {
            // InternalKerMLOC.g:6018:2: (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* )
            // InternalKerMLOC.g:6019:3: this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )*
            {

            			newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getArgumentValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_80);
            this_ArgumentValue_0=ruleArgumentValue();

            state._fsp--;


            			current.merge(this_ArgumentValue_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:6029:3: (kw= ',' this_ArgumentValue_2= ruleArgumentValue )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==22) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // InternalKerMLOC.g:6030:4: kw= ',' this_ArgumentValue_2= ruleArgumentValue
            	    {
            	    kw=(Token)match(input,22,FOLLOW_35); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getArgumentValueParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_80);
            	    this_ArgumentValue_2=ruleArgumentValue();

            	    state._fsp--;


            	    				current.merge(this_ArgumentValue_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop145;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionalArgumentList"


    // $ANTLR start "entryRuleNamedArgumentList"
    // InternalKerMLOC.g:6050:1: entryRuleNamedArgumentList returns [String current=null] : iv_ruleNamedArgumentList= ruleNamedArgumentList EOF ;
    public final String entryRuleNamedArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamedArgumentList = null;


        try {
            // InternalKerMLOC.g:6050:57: (iv_ruleNamedArgumentList= ruleNamedArgumentList EOF )
            // InternalKerMLOC.g:6051:2: iv_ruleNamedArgumentList= ruleNamedArgumentList EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedArgumentList=ruleNamedArgumentList();

            state._fsp--;

             current =iv_ruleNamedArgumentList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgumentList"


    // $ANTLR start "ruleNamedArgumentList"
    // InternalKerMLOC.g:6057:1: ruleNamedArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* ) ;
    public final AntlrDatatypeRuleToken ruleNamedArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NamedArgument_0 = null;

        AntlrDatatypeRuleToken this_NamedArgument_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6063:2: ( (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* ) )
            // InternalKerMLOC.g:6064:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* )
            {
            // InternalKerMLOC.g:6064:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* )
            // InternalKerMLOC.g:6065:3: this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )*
            {

            			newCompositeNode(grammarAccess.getNamedArgumentListAccess().getNamedArgumentParserRuleCall_0());
            		
            pushFollow(FOLLOW_80);
            this_NamedArgument_0=ruleNamedArgument();

            state._fsp--;


            			current.merge(this_NamedArgument_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:6075:3: (kw= ',' this_NamedArgument_2= ruleNamedArgument )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==22) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // InternalKerMLOC.g:6076:4: kw= ',' this_NamedArgument_2= ruleNamedArgument
            	    {
            	    kw=(Token)match(input,22,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamedArgumentListAccess().getNamedArgumentParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_80);
            	    this_NamedArgument_2=ruleNamedArgument();

            	    state._fsp--;


            	    				current.merge(this_NamedArgument_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgumentList"


    // $ANTLR start "entryRuleArgumentValue"
    // InternalKerMLOC.g:6096:1: entryRuleArgumentValue returns [String current=null] : iv_ruleArgumentValue= ruleArgumentValue EOF ;
    public final String entryRuleArgumentValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgumentValue = null;


        try {
            // InternalKerMLOC.g:6096:53: (iv_ruleArgumentValue= ruleArgumentValue EOF )
            // InternalKerMLOC.g:6097:2: iv_ruleArgumentValue= ruleArgumentValue EOF
            {
             newCompositeNode(grammarAccess.getArgumentValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentValue=ruleArgumentValue();

            state._fsp--;

             current =iv_ruleArgumentValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentValue"


    // $ANTLR start "ruleArgumentValue"
    // InternalKerMLOC.g:6103:1: ruleArgumentValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OwnedExpression_0= ruleOwnedExpression ;
    public final AntlrDatatypeRuleToken ruleArgumentValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OwnedExpression_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6109:2: (this_OwnedExpression_0= ruleOwnedExpression )
            // InternalKerMLOC.g:6110:2: this_OwnedExpression_0= ruleOwnedExpression
            {

            		newCompositeNode(grammarAccess.getArgumentValueAccess().getOwnedExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            		current.merge(this_OwnedExpression_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentValue"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalKerMLOC.g:6123:1: entryRuleNamedArgument returns [String current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final String entryRuleNamedArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamedArgument = null;


        try {
            // InternalKerMLOC.g:6123:53: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalKerMLOC.g:6124:2: iv_ruleNamedArgument= ruleNamedArgument EOF
            {
             newCompositeNode(grammarAccess.getNamedArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedArgument=ruleNamedArgument();

            state._fsp--;

             current =iv_ruleNamedArgument.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalKerMLOC.g:6130:1: ruleNamedArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue ) ;
    public final AntlrDatatypeRuleToken ruleNamedArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_ArgumentValue_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6136:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue ) )
            // InternalKerMLOC.g:6137:2: (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue )
            {
            // InternalKerMLOC.g:6137:2: (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue )
            // InternalKerMLOC.g:6138:3: this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue
            {

            			newCompositeNode(grammarAccess.getNamedArgumentAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_113);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,102,FOLLOW_35); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1());
            		

            			newCompositeNode(grammarAccess.getNamedArgumentAccess().getArgumentValueParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ArgumentValue_2=ruleArgumentValue();

            state._fsp--;


            			current.merge(this_ArgumentValue_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleNullExpression"
    // InternalKerMLOC.g:6167:1: entryRuleNullExpression returns [String current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final String entryRuleNullExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullExpression = null;


        try {
            // InternalKerMLOC.g:6167:54: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLOC.g:6168:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // InternalKerMLOC.g:6174:1: ruleNullExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'null' | (kw= '(' kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleNullExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:6180:2: ( (kw= 'null' | (kw= '(' kw= ')' ) ) )
            // InternalKerMLOC.g:6181:2: (kw= 'null' | (kw= '(' kw= ')' ) )
            {
            // InternalKerMLOC.g:6181:2: (kw= 'null' | (kw= '(' kw= ')' ) )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==103) ) {
                alt147=1;
            }
            else if ( (LA147_0==98) ) {
                alt147=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalKerMLOC.g:6182:3: kw= 'null'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNullExpressionAccess().getNullKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:6188:3: (kw= '(' kw= ')' )
                    {
                    // InternalKerMLOC.g:6188:3: (kw= '(' kw= ')' )
                    // InternalKerMLOC.g:6189:4: kw= '(' kw= ')'
                    {
                    kw=(Token)match(input,98,FOLLOW_109); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    kw=(Token)match(input,99,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNullExpressionAccess().getRightParenthesisKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleMetadataAccessExpression"
    // InternalKerMLOC.g:6204:1: entryRuleMetadataAccessExpression returns [String current=null] : iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF ;
    public final String entryRuleMetadataAccessExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadataAccessExpression = null;


        try {
            // InternalKerMLOC.g:6204:64: (iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF )
            // InternalKerMLOC.g:6205:2: iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF
            {
             newCompositeNode(grammarAccess.getMetadataAccessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadataAccessExpression=ruleMetadataAccessExpression();

            state._fsp--;

             current =iv_ruleMetadataAccessExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadataAccessExpression"


    // $ANTLR start "ruleMetadataAccessExpression"
    // InternalKerMLOC.g:6211:1: ruleMetadataAccessExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' ) ;
    public final AntlrDatatypeRuleToken ruleMetadataAccessExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6217:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' ) )
            // InternalKerMLOC.g:6218:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' )
            {
            // InternalKerMLOC.g:6218:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' )
            // InternalKerMLOC.g:6219:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata'
            {

            			newCompositeNode(grammarAccess.getMetadataAccessExpressionAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_114);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,68,FOLLOW_115); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMetadataAccessExpressionAccess().getFullStopKeyword_1());
            		
            kw=(Token)match(input,104,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMetadataAccessExpressionAccess().getMetadataKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadataAccessExpression"


    // $ANTLR start "entryRuleInvocationExpression"
    // InternalKerMLOC.g:6243:1: entryRuleInvocationExpression returns [String current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final String entryRuleInvocationExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLOC.g:6243:60: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLOC.g:6244:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
            {
             newCompositeNode(grammarAccess.getInvocationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvocationExpression=ruleInvocationExpression();

            state._fsp--;

             current =iv_ruleInvocationExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvocationExpression"


    // $ANTLR start "ruleInvocationExpression"
    // InternalKerMLOC.g:6250:1: ruleInvocationExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList ) ;
    public final AntlrDatatypeRuleToken ruleInvocationExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureChainName_1 = null;

        AntlrDatatypeRuleToken this_ArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6256:2: ( ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList ) )
            // InternalKerMLOC.g:6257:2: ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList )
            {
            // InternalKerMLOC.g:6257:2: ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList )
            // InternalKerMLOC.g:6258:3: (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList
            {
            // InternalKerMLOC.g:6258:3: (kw= 'new' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==105) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalKerMLOC.g:6259:4: kw= 'new'
                    {
                    kw=(Token)match(input,105,FOLLOW_82); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getInvocationExpressionAccess().getNewKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getInvocationExpressionAccess().getFeatureChainNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_110);
            this_FeatureChainName_1=ruleFeatureChainName();

            state._fsp--;


            			current.merge(this_FeatureChainName_1);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getInvocationExpressionAccess().getArgumentListParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ArgumentList_2=ruleArgumentList();

            state._fsp--;


            			current.merge(this_ArgumentList_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvocationExpression"


    // $ANTLR start "entryRuleBodyExpression"
    // InternalKerMLOC.g:6289:1: entryRuleBodyExpression returns [String current=null] : iv_ruleBodyExpression= ruleBodyExpression EOF ;
    public final String entryRuleBodyExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBodyExpression = null;


        try {
            // InternalKerMLOC.g:6289:54: (iv_ruleBodyExpression= ruleBodyExpression EOF )
            // InternalKerMLOC.g:6290:2: iv_ruleBodyExpression= ruleBodyExpression EOF
            {
             newCompositeNode(grammarAccess.getBodyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyExpression=ruleBodyExpression();

            state._fsp--;

             current =iv_ruleBodyExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyExpression"


    // $ANTLR start "ruleBodyExpression"
    // InternalKerMLOC.g:6296:1: ruleBodyExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBodyExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_2 = null;

        AntlrDatatypeRuleToken this_FeatureSpecializationName_3 = null;

        AntlrDatatypeRuleToken this_Name_7 = null;

        AntlrDatatypeRuleToken this_FeatureSpecializationName_8 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_11 = null;

        AntlrDatatypeRuleToken this_QualifiedName_13 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_15 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_19 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_21 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_25 = null;

        AntlrDatatypeRuleToken this_QualifiedName_27 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_30 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_32 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_35 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6302:2: ( (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' ) )
            // InternalKerMLOC.g:6303:2: (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' )
            {
            // InternalKerMLOC.g:6303:2: (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' )
            // InternalKerMLOC.g:6304:3: kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}'
            {
            kw=(Token)match(input,16,FOLLOW_116); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKerMLOC.g:6309:3: (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==106) ) {
                    int LA150_1 = input.LA(2);

                    if ( ((LA150_1>=RULE_ID && LA150_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt150=1;
                    }


                }


                switch (alt150) {
            	case 1 :
            	    // InternalKerMLOC.g:6310:4: kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';'
            	    {
            	    kw=(Token)match(input,106,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getInKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_117);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalKerMLOC.g:6325:4: (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )*
            	    loop149:
            	    do {
            	        int alt149=2;
            	        int LA149_0 = input.LA(1);

            	        if ( ((LA149_0>=57 && LA149_0<=58)||LA149_0==60||LA149_0==109||(LA149_0>=111 && LA149_0<=112)||(LA149_0>=114 && LA149_0<=118)) ) {
            	            alt149=1;
            	        }


            	        switch (alt149) {
            	    	case 1 :
            	    	    // InternalKerMLOC.g:6326:5: this_FeatureSpecializationName_3= ruleFeatureSpecializationName
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureSpecializationNameParserRuleCall_1_2());
            	    	    				
            	    	    pushFollow(FOLLOW_117);
            	    	    this_FeatureSpecializationName_3=ruleFeatureSpecializationName();

            	    	    state._fsp--;


            	    	    					current.merge(this_FeatureSpecializationName_3);
            	    	    				

            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop149;
            	        }
            	    } while (true);

            	    kw=(Token)match(input,15,FOLLOW_116); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);

            // InternalKerMLOC.g:6343:3: (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==106) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // InternalKerMLOC.g:6344:4: kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';'
            	    {
            	    kw=(Token)match(input,106,FOLLOW_118); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getInKeyword_2_0());
            	    			
            	    kw=(Token)match(input,107,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getRefKeyword_2_1());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getNameParserRuleCall_2_2());
            	    			
            	    pushFollow(FOLLOW_117);
            	    this_Name_7=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_7);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalKerMLOC.g:6364:4: (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )*
            	    loop151:
            	    do {
            	        int alt151=2;
            	        int LA151_0 = input.LA(1);

            	        if ( ((LA151_0>=57 && LA151_0<=58)||LA151_0==60||LA151_0==109||(LA151_0>=111 && LA151_0<=112)||(LA151_0>=114 && LA151_0<=118)) ) {
            	            alt151=1;
            	        }


            	        switch (alt151) {
            	    	case 1 :
            	    	    // InternalKerMLOC.g:6365:5: this_FeatureSpecializationName_8= ruleFeatureSpecializationName
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureSpecializationNameParserRuleCall_2_3());
            	    	    				
            	    	    pushFollow(FOLLOW_117);
            	    	    this_FeatureSpecializationName_8=ruleFeatureSpecializationName();

            	    	    state._fsp--;


            	    	    					current.merge(this_FeatureSpecializationName_8);
            	    	    				

            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop151;
            	        }
            	    } while (true);

            	    kw=(Token)match(input,15,FOLLOW_116); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop152;
                }
            } while (true);

            // InternalKerMLOC.g:6382:3: (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==108) ) {
                    int LA153_1 = input.LA(2);

                    if ( ((LA153_1>=RULE_ID && LA153_1<=RULE_UNRESTRICTED_NAME)||LA153_1==67) ) {
                        alt153=1;
                    }


                }


                switch (alt153) {
            	case 1 :
            	    // InternalKerMLOC.g:6383:4: kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';'
            	    {
            	    kw=(Token)match(input,108,FOLLOW_82); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getPrivateKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_119);
            	    this_FeatureChainName_11=ruleFeatureChainName();

            	    state._fsp--;


            	    				current.merge(this_FeatureChainName_11);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,109,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getColonKeyword_3_2());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getQualifiedNameParserRuleCall_3_3());
            	    			
            	    pushFollow(FOLLOW_113);
            	    this_QualifiedName_13=ruleQualifiedName();

            	    state._fsp--;


            	    				current.merge(this_QualifiedName_13);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,102,FOLLOW_35); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getEqualsSignKeyword_3_4());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_3_5());
            	    			
            	    pushFollow(FOLLOW_44);
            	    this_OwnedExpression_15=ruleOwnedExpression();

            	    state._fsp--;


            	    				current.merge(this_OwnedExpression_15);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,15,FOLLOW_120); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_3_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop153;
                }
            } while (true);

            // InternalKerMLOC.g:6434:3: (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )?
            int alt154=2;
            alt154 = dfa154.predict(input);
            switch (alt154) {
                case 1 :
                    // InternalKerMLOC.g:6435:4: kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';'
                    {
                    kw=(Token)match(input,108,FOLLOW_121); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getPrivateKeyword_4_0());
                    			
                    kw=(Token)match(input,110,FOLLOW_82); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getAttributeKeyword_4_1());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_4_2());
                    			
                    pushFollow(FOLLOW_113);
                    this_FeatureChainName_19=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_19);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,102,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getEqualsSignKeyword_4_3());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_4_4());
                    			
                    pushFollow(FOLLOW_44);
                    this_OwnedExpression_21=ruleOwnedExpression();

                    state._fsp--;


                    				current.merge(this_OwnedExpression_21);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,15,FOLLOW_120); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:6476:3: (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==108) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalKerMLOC.g:6477:4: kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}'
                    {
                    kw=(Token)match(input,108,FOLLOW_121); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getPrivateKeyword_5_0());
                    			
                    kw=(Token)match(input,110,FOLLOW_82); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getAttributeKeyword_5_1());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_5_2());
                    			
                    pushFollow(FOLLOW_119);
                    this_FeatureChainName_25=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_25);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,109,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getColonKeyword_5_3());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getQualifiedNameParserRuleCall_5_4());
                    			
                    pushFollow(FOLLOW_111);
                    this_QualifiedName_27=ruleQualifiedName();

                    state._fsp--;


                    				current.merge(this_QualifiedName_27);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,16,FOLLOW_122); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getLeftCurlyBracketKeyword_5_5());
                    			
                    // InternalKerMLOC.g:6517:4: (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==111) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // InternalKerMLOC.g:6518:5: kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';'
                    	    {
                    	    kw=(Token)match(input,111,FOLLOW_82); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getColonGreaterThanSignGreaterThanSignKeyword_5_6_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_5_6_1());
                    	    				
                    	    pushFollow(FOLLOW_113);
                    	    this_FeatureChainName_30=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_30);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    kw=(Token)match(input,102,FOLLOW_35); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getEqualsSignKeyword_5_6_2());
                    	    				

                    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_5_6_3());
                    	    				
                    	    pushFollow(FOLLOW_44);
                    	    this_OwnedExpression_32=ruleOwnedExpression();

                    	    state._fsp--;


                    	    					current.merge(this_OwnedExpression_32);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    kw=(Token)match(input,15,FOLLOW_122); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_5_6_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    kw=(Token)match(input,17,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getRightCurlyBracketKeyword_5_7());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_6());
            		
            pushFollow(FOLLOW_73);
            this_OwnedExpression_35=ruleOwnedExpression();

            state._fsp--;


            			current.merge(this_OwnedExpression_35);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyExpression"


    // $ANTLR start "entryRuleFeatureSpecializationName"
    // InternalKerMLOC.g:6579:1: entryRuleFeatureSpecializationName returns [String current=null] : iv_ruleFeatureSpecializationName= ruleFeatureSpecializationName EOF ;
    public final String entryRuleFeatureSpecializationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureSpecializationName = null;


        try {
            // InternalKerMLOC.g:6579:65: (iv_ruleFeatureSpecializationName= ruleFeatureSpecializationName EOF )
            // InternalKerMLOC.g:6580:2: iv_ruleFeatureSpecializationName= ruleFeatureSpecializationName EOF
            {
             newCompositeNode(grammarAccess.getFeatureSpecializationNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureSpecializationName=ruleFeatureSpecializationName();

            state._fsp--;

             current =iv_ruleFeatureSpecializationName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureSpecializationName"


    // $ANTLR start "ruleFeatureSpecializationName"
    // InternalKerMLOC.g:6586:1: ruleFeatureSpecializationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) ) ;
    public final AntlrDatatypeRuleToken ruleFeatureSpecializationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureTypingName_3 = null;

        AntlrDatatypeRuleToken this_FeatureTypingName_5 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_9 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_11 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_14 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_16 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_19 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_21 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_24 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_26 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6592:2: ( ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) ) )
            // InternalKerMLOC.g:6593:2: ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) )
            {
            // InternalKerMLOC.g:6593:2: ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) )
            int alt167=5;
            switch ( input.LA(1) ) {
            case 109:
            case 112:
                {
                alt167=1;
                }
                break;
            case 57:
            case 58:
            case 60:
                {
                alt167=2;
                }
                break;
            case 114:
            case 115:
                {
                alt167=3;
                }
                break;
            case 116:
            case 117:
                {
                alt167=4;
                }
                break;
            case 111:
            case 118:
                {
                alt167=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }

            switch (alt167) {
                case 1 :
                    // InternalKerMLOC.g:6594:3: ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* )
                    {
                    // InternalKerMLOC.g:6594:3: ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* )
                    // InternalKerMLOC.g:6595:4: (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )*
                    {
                    // InternalKerMLOC.g:6595:4: (kw= ':' | (kw= 'defined' kw= 'by' ) )
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==109) ) {
                        alt157=1;
                    }
                    else if ( (LA157_0==112) ) {
                        alt157=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;
                    }
                    switch (alt157) {
                        case 1 :
                            // InternalKerMLOC.g:6596:5: kw= ':'
                            {
                            kw=(Token)match(input,109,FOLLOW_81); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:6602:5: (kw= 'defined' kw= 'by' )
                            {
                            // InternalKerMLOC.g:6602:5: (kw= 'defined' kw= 'by' )
                            // InternalKerMLOC.g:6603:6: kw= 'defined' kw= 'by'
                            {
                            kw=(Token)match(input,112,FOLLOW_123); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getDefinedKeyword_0_0_1_0());
                            					
                            kw=(Token)match(input,113,FOLLOW_81); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getByKeyword_0_0_1_1());
                            					

                            }


                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureTypingNameParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_80);
                    this_FeatureTypingName_3=ruleFeatureTypingName();

                    state._fsp--;


                    				current.merge(this_FeatureTypingName_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:6625:4: (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==22) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // InternalKerMLOC.g:6626:5: kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_81); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_0_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureTypingNameParserRuleCall_0_2_1());
                    	    				
                    	    pushFollow(FOLLOW_80);
                    	    this_FeatureTypingName_5=ruleFeatureTypingName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureTypingName_5);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:6644:3: ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:6644:3: ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:6645:4: (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:6645:4: (kw= ':>' | kw= 'specializes' | kw= 'subsets' )
                    int alt159=3;
                    switch ( input.LA(1) ) {
                    case 57:
                        {
                        alt159=1;
                        }
                        break;
                    case 60:
                        {
                        alt159=2;
                        }
                        break;
                    case 58:
                        {
                        alt159=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 159, 0, input);

                        throw nvae;
                    }

                    switch (alt159) {
                        case 1 :
                            // InternalKerMLOC.g:6646:5: kw= ':>'
                            {
                            kw=(Token)match(input,57,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonGreaterThanSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:6652:5: kw= 'specializes'
                            {
                            kw=(Token)match(input,60,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getSpecializesKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalKerMLOC.g:6658:5: kw= 'subsets'
                            {
                            kw=(Token)match(input,58,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getSubsetsKeyword_1_0_2());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_80);
                    this_FeatureChainName_9=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_9);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:6674:4: (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==22) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // InternalKerMLOC.g:6675:5: kw= ',' this_FeatureChainName_11= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_82); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_1_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_1_2_1());
                    	    				
                    	    pushFollow(FOLLOW_80);
                    	    this_FeatureChainName_11=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_11);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:6693:3: ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:6693:3: ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:6694:4: (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:6694:4: (kw= '::>' | kw= 'references' )
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==114) ) {
                        alt161=1;
                    }
                    else if ( (LA161_0==115) ) {
                        alt161=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 161, 0, input);

                        throw nvae;
                    }
                    switch (alt161) {
                        case 1 :
                            // InternalKerMLOC.g:6695:5: kw= '::>'
                            {
                            kw=(Token)match(input,114,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonColonGreaterThanSignKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:6701:5: kw= 'references'
                            {
                            kw=(Token)match(input,115,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getReferencesKeyword_2_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_80);
                    this_FeatureChainName_14=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:6717:4: (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==22) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // InternalKerMLOC.g:6718:5: kw= ',' this_FeatureChainName_16= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_82); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_2_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_2_2_1());
                    	    				
                    	    pushFollow(FOLLOW_80);
                    	    this_FeatureChainName_16=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_16);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:6736:3: ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:6736:3: ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:6737:4: (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:6737:4: (kw= '=>' | kw= 'crosses' )
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==116) ) {
                        alt163=1;
                    }
                    else if ( (LA163_0==117) ) {
                        alt163=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 163, 0, input);

                        throw nvae;
                    }
                    switch (alt163) {
                        case 1 :
                            // InternalKerMLOC.g:6738:5: kw= '=>'
                            {
                            kw=(Token)match(input,116,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:6744:5: kw= 'crosses'
                            {
                            kw=(Token)match(input,117,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCrossesKeyword_3_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_80);
                    this_FeatureChainName_19=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_19);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:6760:4: (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==22) ) {
                            alt164=1;
                        }


                        switch (alt164) {
                    	case 1 :
                    	    // InternalKerMLOC.g:6761:5: kw= ',' this_FeatureChainName_21= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_82); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_3_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_3_2_1());
                    	    				
                    	    pushFollow(FOLLOW_80);
                    	    this_FeatureChainName_21=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_21);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop164;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLOC.g:6779:3: ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:6779:3: ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:6780:4: (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:6780:4: (kw= ':>>' | kw= 'redefines' )
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==111) ) {
                        alt165=1;
                    }
                    else if ( (LA165_0==118) ) {
                        alt165=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 165, 0, input);

                        throw nvae;
                    }
                    switch (alt165) {
                        case 1 :
                            // InternalKerMLOC.g:6781:5: kw= ':>>'
                            {
                            kw=(Token)match(input,111,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:6787:5: kw= 'redefines'
                            {
                            kw=(Token)match(input,118,FOLLOW_82); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getRedefinesKeyword_4_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_80);
                    this_FeatureChainName_24=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_24);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:6803:4: (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )*
                    loop166:
                    do {
                        int alt166=2;
                        int LA166_0 = input.LA(1);

                        if ( (LA166_0==22) ) {
                            alt166=1;
                        }


                        switch (alt166) {
                    	case 1 :
                    	    // InternalKerMLOC.g:6804:5: kw= ',' this_FeatureChainName_26= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_82); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_4_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_4_2_1());
                    	    				
                    	    pushFollow(FOLLOW_80);
                    	    this_FeatureChainName_26=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_26);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop166;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureSpecializationName"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalKerMLOC.g:6825:1: entryRuleSequenceExpression returns [String current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final String entryRuleSequenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLOC.g:6825:58: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLOC.g:6826:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceExpression=ruleSequenceExpression();

            state._fsp--;

             current =iv_ruleSequenceExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceExpression"


    // $ANTLR start "ruleSequenceExpression"
    // InternalKerMLOC.g:6832:1: ruleSequenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleSequenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OwnedExpression_0 = null;

        AntlrDatatypeRuleToken this_SequenceExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6838:2: ( (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? ) )
            // InternalKerMLOC.g:6839:2: (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? )
            {
            // InternalKerMLOC.g:6839:2: (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? )
            // InternalKerMLOC.g:6840:3: this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )?
            {

            			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_80);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            			current.merge(this_OwnedExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:6850:3: (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==22) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalKerMLOC.g:6851:4: kw= ',' this_SequenceExpression_2= ruleSequenceExpression
                    {
                    kw=(Token)match(input,22,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getSequenceExpressionAccess().getSequenceExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_SequenceExpression_2=ruleSequenceExpression();

                    state._fsp--;


                    				current.merge(this_SequenceExpression_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceExpression"


    // $ANTLR start "entryRuleMultiplicityExpression"
    // InternalKerMLOC.g:6871:1: entryRuleMultiplicityExpression returns [String current=null] : iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF ;
    public final String entryRuleMultiplicityExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityExpression = null;


        try {
            // InternalKerMLOC.g:6871:62: (iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF )
            // InternalKerMLOC.g:6872:2: iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityExpression=ruleMultiplicityExpression();

            state._fsp--;

             current =iv_ruleMultiplicityExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityExpression"


    // $ANTLR start "ruleMultiplicityExpression"
    // InternalKerMLOC.g:6878:1: ruleMultiplicityExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralExpression_0 = null;

        AntlrDatatypeRuleToken this_FeatureReferenceExpression_1 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6884:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) )
            // InternalKerMLOC.g:6885:2: (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            {
            // InternalKerMLOC.g:6885:2: (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==RULE_STRING_VALUE||(LA169_0>=RULE_DECIMAL_VALUE && LA169_0<=RULE_EXP_VALUE)||LA169_0==33||LA169_0==68||(LA169_0>=119 && LA169_0<=120)) ) {
                alt169=1;
            }
            else if ( ((LA169_0>=RULE_ID && LA169_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt169=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }
            switch (alt169) {
                case 1 :
                    // InternalKerMLOC.g:6886:3: this_LiteralExpression_0= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityExpressionAccess().getLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;


                    			current.merge(this_LiteralExpression_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:6897:3: this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityExpressionAccess().getFeatureReferenceExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureReferenceExpression_1=ruleFeatureReferenceExpression();

                    state._fsp--;


                    			current.merge(this_FeatureReferenceExpression_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalKerMLOC.g:6911:1: entryRuleLiteralExpression returns [String current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final String entryRuleLiteralExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLOC.g:6911:57: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLOC.g:6912:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalKerMLOC.g:6918:1: ruleLiteralExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final AntlrDatatypeRuleToken ruleLiteralExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralBoolean_0 = null;

        AntlrDatatypeRuleToken this_LiteralString_1 = null;

        AntlrDatatypeRuleToken this_LiteralInteger_2 = null;

        AntlrDatatypeRuleToken this_LiteralReal_3 = null;

        AntlrDatatypeRuleToken this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6924:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalKerMLOC.g:6925:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalKerMLOC.g:6925:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt170=5;
            switch ( input.LA(1) ) {
            case 119:
            case 120:
                {
                alt170=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt170=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA170_3 = input.LA(2);

                if ( (LA170_3==68) ) {
                    int LA170_6 = input.LA(3);

                    if ( ((LA170_6>=RULE_DECIMAL_VALUE && LA170_6<=RULE_EXP_VALUE)) ) {
                        alt170=4;
                    }
                    else if ( ((LA170_6>=RULE_ID && LA170_6<=RULE_UNRESTRICTED_NAME)||LA170_6==16||LA170_6==67) ) {
                        alt170=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 170, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA170_3==EOF||LA170_3==15||LA170_3==17||LA170_3==22||(LA170_3>=33 && LA170_3<=36)||(LA170_3>=38 && LA170_3<=39)||LA170_3==56||(LA170_3>=70 && LA170_3<=86)||(LA170_3>=89 && LA170_3<=95)||LA170_3==97||(LA170_3>=99 && LA170_3<=101)) ) {
                    alt170=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 170, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 68:
                {
                alt170=4;
                }
                break;
            case 33:
                {
                alt170=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }

            switch (alt170) {
                case 1 :
                    // InternalKerMLOC.g:6926:3: this_LiteralBoolean_0= ruleLiteralBoolean
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralBoolean_0=ruleLiteralBoolean();

                    state._fsp--;


                    			current.merge(this_LiteralBoolean_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:6937:3: this_LiteralString_1= ruleLiteralString
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralString_1=ruleLiteralString();

                    state._fsp--;


                    			current.merge(this_LiteralString_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:6948:3: this_LiteralInteger_2= ruleLiteralInteger
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralInteger_2=ruleLiteralInteger();

                    state._fsp--;


                    			current.merge(this_LiteralInteger_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:6959:3: this_LiteralReal_3= ruleLiteralReal
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralReal_3=ruleLiteralReal();

                    state._fsp--;


                    			current.merge(this_LiteralReal_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKerMLOC.g:6970:3: this_LiteralInfinity_4= ruleLiteralInfinity
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralInfinityParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralInfinity_4=ruleLiteralInfinity();

                    state._fsp--;


                    			current.merge(this_LiteralInfinity_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalKerMLOC.g:6984:1: entryRuleLiteralBoolean returns [String current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final String entryRuleLiteralBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLOC.g:6984:54: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLOC.g:6985:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;

             current =iv_ruleLiteralBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalKerMLOC.g:6991:1: ruleLiteralBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BooleanValue_0= ruleBooleanValue ;
    public final AntlrDatatypeRuleToken ruleLiteralBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanValue_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:6997:2: (this_BooleanValue_0= ruleBooleanValue )
            // InternalKerMLOC.g:6998:2: this_BooleanValue_0= ruleBooleanValue
            {

            		newCompositeNode(grammarAccess.getLiteralBooleanAccess().getBooleanValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BooleanValue_0=ruleBooleanValue();

            state._fsp--;


            		current.merge(this_BooleanValue_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalKerMLOC.g:7011:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLOC.g:7011:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLOC.g:7012:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalKerMLOC.g:7018:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:7024:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLOC.g:7025:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLOC.g:7025:2: (kw= 'true' | kw= 'false' )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==119) ) {
                alt171=1;
            }
            else if ( (LA171_0==120) ) {
                alt171=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;
            }
            switch (alt171) {
                case 1 :
                    // InternalKerMLOC.g:7026:3: kw= 'true'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:7032:3: kw= 'false'
                    {
                    kw=(Token)match(input,120,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLiteralString"
    // InternalKerMLOC.g:7041:1: entryRuleLiteralString returns [String current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final String entryRuleLiteralString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralString = null;


        try {
            // InternalKerMLOC.g:7041:53: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLOC.g:7042:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             newCompositeNode(grammarAccess.getLiteralStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralString=ruleLiteralString();

            state._fsp--;

             current =iv_ruleLiteralString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // InternalKerMLOC.g:7048:1: ruleLiteralString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_VALUE_0= RULE_STRING_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_VALUE_0=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:7054:2: (this_STRING_VALUE_0= RULE_STRING_VALUE )
            // InternalKerMLOC.g:7055:2: this_STRING_VALUE_0= RULE_STRING_VALUE
            {
            this_STRING_VALUE_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_2); 

            		current.merge(this_STRING_VALUE_0);
            	

            		newLeafNode(this_STRING_VALUE_0, grammarAccess.getLiteralStringAccess().getSTRING_VALUETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalKerMLOC.g:7065:1: entryRuleLiteralInteger returns [String current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final String entryRuleLiteralInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLOC.g:7065:54: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLOC.g:7066:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             newCompositeNode(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInteger=ruleLiteralInteger();

            state._fsp--;

             current =iv_ruleLiteralInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalKerMLOC.g:7072:1: ruleLiteralInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:7078:2: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )
            // InternalKerMLOC.g:7079:2: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
            {
            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

            		current.merge(this_DECIMAL_VALUE_0);
            	

            		newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getLiteralIntegerAccess().getDECIMAL_VALUETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleLiteralReal"
    // InternalKerMLOC.g:7089:1: entryRuleLiteralReal returns [String current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final String entryRuleLiteralReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralReal = null;


        try {
            // InternalKerMLOC.g:7089:51: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLOC.g:7090:2: iv_ruleLiteralReal= ruleLiteralReal EOF
            {
             newCompositeNode(grammarAccess.getLiteralRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralReal=ruleLiteralReal();

            state._fsp--;

             current =iv_ruleLiteralReal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralReal"


    // $ANTLR start "ruleLiteralReal"
    // InternalKerMLOC.g:7096:1: ruleLiteralReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_RealValue_0= ruleRealValue ;
    public final AntlrDatatypeRuleToken ruleLiteralReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_RealValue_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:7102:2: (this_RealValue_0= ruleRealValue )
            // InternalKerMLOC.g:7103:2: this_RealValue_0= ruleRealValue
            {

            		newCompositeNode(grammarAccess.getLiteralRealAccess().getRealValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RealValue_0=ruleRealValue();

            state._fsp--;


            		current.merge(this_RealValue_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralReal"


    // $ANTLR start "entryRuleRealValue"
    // InternalKerMLOC.g:7116:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLOC.g:7116:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLOC.g:7117:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalKerMLOC.g:7123:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:7129:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLOC.g:7130:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLOC.g:7130:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==RULE_DECIMAL_VALUE||LA174_0==68) ) {
                alt174=1;
            }
            else if ( (LA174_0==RULE_EXP_VALUE) ) {
                alt174=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }
            switch (alt174) {
                case 1 :
                    // InternalKerMLOC.g:7131:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLOC.g:7131:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLOC.g:7132:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLOC.g:7132:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==RULE_DECIMAL_VALUE) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // InternalKerMLOC.g:7133:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_114); 

                            					current.merge(this_DECIMAL_VALUE_0);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,68,FOLLOW_124); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalKerMLOC.g:7146:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==RULE_DECIMAL_VALUE) ) {
                        alt173=1;
                    }
                    else if ( (LA173_0==RULE_EXP_VALUE) ) {
                        alt173=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 173, 0, input);

                        throw nvae;
                    }
                    switch (alt173) {
                        case 1 :
                            // InternalKerMLOC.g:7147:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                            					current.merge(this_DECIMAL_VALUE_2);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:7155:5: this_EXP_VALUE_3= RULE_EXP_VALUE
                            {
                            this_EXP_VALUE_3=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); 

                            					current.merge(this_EXP_VALUE_3);
                            				

                            					newLeafNode(this_EXP_VALUE_3, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:7165:3: this_EXP_VALUE_4= RULE_EXP_VALUE
                    {
                    this_EXP_VALUE_4=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); 

                    			current.merge(this_EXP_VALUE_4);
                    		

                    			newLeafNode(this_EXP_VALUE_4, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleLiteralInfinity"
    // InternalKerMLOC.g:7176:1: entryRuleLiteralInfinity returns [String current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final String entryRuleLiteralInfinity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInfinity = null;


        try {
            // InternalKerMLOC.g:7176:55: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalKerMLOC.g:7177:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
            {
             newCompositeNode(grammarAccess.getLiteralInfinityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInfinity=ruleLiteralInfinity();

            state._fsp--;

             current =iv_ruleLiteralInfinity.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralInfinity"


    // $ANTLR start "ruleLiteralInfinity"
    // InternalKerMLOC.g:7183:1: ruleLiteralInfinity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleLiteralInfinity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:7189:2: (kw= '*' )
            // InternalKerMLOC.g:7190:2: kw= '*'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLiteralInfinityAccess().getAsteriskKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralInfinity"


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalKerMLOC.g:7198:1: entryRuleFeatureReferenceExpression returns [String current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final String entryRuleFeatureReferenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLOC.g:7198:66: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLOC.g:7199:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReferenceExpression=ruleFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleFeatureReferenceExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureReferenceExpression"


    // $ANTLR start "ruleFeatureReferenceExpression"
    // InternalKerMLOC.g:7205:1: ruleFeatureReferenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleFeatureReferenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:7211:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:7212:2: this_QualifiedName_0= ruleQualifiedName
            {

            		newCompositeNode(grammarAccess.getFeatureReferenceExpressionAccess().getQualifiedNameParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureReferenceExpression"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalKerMLOC.g:7225:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLVisibility' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'protected' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:7231:2: ( ( (enumLiteral_0= 'NULLVisibility' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'protected' ) ) )
            // InternalKerMLOC.g:7232:2: ( (enumLiteral_0= 'NULLVisibility' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'protected' ) )
            {
            // InternalKerMLOC.g:7232:2: ( (enumLiteral_0= 'NULLVisibility' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'private' ) | (enumLiteral_3= 'protected' ) )
            int alt175=4;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt175=1;
                }
                break;
            case 122:
                {
                alt175=2;
                }
                break;
            case 108:
                {
                alt175=3;
                }
                break;
            case 123:
                {
                alt175=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }

            switch (alt175) {
                case 1 :
                    // InternalKerMLOC.g:7233:3: (enumLiteral_0= 'NULLVisibility' )
                    {
                    // InternalKerMLOC.g:7233:3: (enumLiteral_0= 'NULLVisibility' )
                    // InternalKerMLOC.g:7234:4: enumLiteral_0= 'NULLVisibility'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getNullEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:7241:3: (enumLiteral_1= 'public' )
                    {
                    // InternalKerMLOC.g:7241:3: (enumLiteral_1= 'public' )
                    // InternalKerMLOC.g:7242:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:7249:3: (enumLiteral_2= 'private' )
                    {
                    // InternalKerMLOC.g:7249:3: (enumLiteral_2= 'private' )
                    // InternalKerMLOC.g:7250:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:7257:3: (enumLiteral_3= 'protected' )
                    {
                    // InternalKerMLOC.g:7257:3: (enumLiteral_3= 'protected' )
                    // InternalKerMLOC.g:7258:4: enumLiteral_3= 'protected'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityIndicator"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA143 dfa143 = new DFA143(this);
    protected DFA144 dfa144 = new DFA144(this);
    protected DFA154 dfa154 = new DFA154(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\6\5\5\uffff";
    static final String dfa_3s = "\1\173\5\73\5\uffff";
    static final String dfa_4s = "\6\uffff\1\1\1\3\1\4\1\5\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\2\10\1\11\5\uffff\1\11\3\uffff\3\11\3\uffff\1\6\1\uffff\4\6\7\uffff\1\7\4\uffff\15\11\1\5\3\uffff\1\11\60\uffff\1\3\14\uffff\1\1\1\2\1\4",
            "\1\6\2\uffff\1\11\5\uffff\1\11\3\uffff\3\11\3\uffff\1\6\1\uffff\4\6\1\12\6\uffff\1\7\4\uffff\1\11\1\uffff\13\11\1\5\3\uffff\1\11",
            "\1\6\2\uffff\1\11\5\uffff\1\11\3\uffff\3\11\3\uffff\1\6\1\uffff\4\6\1\12\6\uffff\1\7\4\uffff\1\11\1\uffff\13\11\1\5\3\uffff\1\11",
            "\1\6\2\uffff\1\11\5\uffff\1\11\3\uffff\3\11\3\uffff\1\6\1\uffff\4\6\1\12\6\uffff\1\7\4\uffff\1\11\1\uffff\13\11\1\5\3\uffff\1\11",
            "\1\6\2\uffff\1\11\5\uffff\1\11\3\uffff\3\11\3\uffff\1\6\1\uffff\4\6\1\12\6\uffff\1\7\4\uffff\1\11\1\uffff\13\11\1\5\3\uffff\1\11",
            "\1\6\2\uffff\1\11\5\uffff\1\11\3\uffff\3\11\3\uffff\1\6\1\uffff\4\6\7\uffff\1\7\4\uffff\1\11\1\uffff\13\11\4\uffff\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_AliasElement_2= ruleAliasElement | this_CodeAnnotation_3= ruleCodeAnnotation | this_NonFeatureElement_4= ruleNonFeatureElement )";
        }
    }
    static final String dfa_7s = "\34\uffff";
    static final String dfa_8s = "\7\10\5\uffff\1\10\6\uffff\1\11\4\uffff\2\10\2\uffff";
    static final String dfa_9s = "\1\173\5\73\1\66\5\uffff\1\66\6\uffff\1\102\4\uffff\2\66\2\uffff";
    static final String dfa_10s = "\7\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff\1\16\1\17\1\20\1\21\2\uffff\1\14\1\15";
    static final String dfa_11s = "\34\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\5\uffff\1\11\3\uffff\2\12\1\7\25\uffff\1\13\1\10\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\5\3\uffff\1\14\60\uffff\1\3\14\uffff\1\1\1\2\1\4",
            "\1\30\5\uffff\1\11\3\uffff\2\12\1\7\25\uffff\1\13\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\5\3\uffff\1\14",
            "\1\30\5\uffff\1\11\3\uffff\2\12\1\7\25\uffff\1\13\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\5\3\uffff\1\14",
            "\1\30\5\uffff\1\11\3\uffff\2\12\1\7\25\uffff\1\13\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\5\3\uffff\1\14",
            "\1\30\5\uffff\1\11\3\uffff\2\12\1\7\25\uffff\1\13\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\5\3\uffff\1\14",
            "\1\30\5\uffff\1\11\3\uffff\2\12\1\7\25\uffff\1\13\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\4\uffff\1\14",
            "\1\6\5\uffff\1\11\5\uffff\1\7\26\uffff\1\10\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "",
            "",
            "",
            "",
            "",
            "\1\31\43\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\32\4\uffff\2\32\16\uffff\1\32\3\uffff\1\32\2\uffff\1\32\10\uffff\1\33\11\uffff\1\32\2\uffff\7\32",
            "",
            "",
            "",
            "",
            "\1\30\5\uffff\1\11\5\uffff\1\7\27\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "\1\31\43\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "370:2: (this_Dependency_0= ruleDependency | this_Namespace_1= ruleNamespace | this_Package_2= rulePackage | this_LibraryPackage_3= ruleLibraryPackage | this_Multiplicity_4= ruleMultiplicity | this_Type_5= ruleType | this_Classifier_6= ruleClassifier | this_Class_7= ruleClass | this_Structure_8= ruleStructure | this_Metaclass_9= ruleMetaclass | this_DataType_10= ruleDataType | this_Association_11= ruleAssociation | this_AssociationStructure_12= ruleAssociationStructure | this_Interaction_13= ruleInteraction | this_Behavior_14= ruleBehavior | this_Function_15= ruleFunction | this_Predicate_16= rulePredicate )";
        }
    }
    static final String dfa_13s = "\11\uffff";
    static final String dfa_14s = "\2\uffff\2\1\5\uffff";
    static final String dfa_15s = "\1\4\1\uffff\2\17\2\uffff\1\11\2\uffff";
    static final String dfa_16s = "\1\170\1\uffff\2\145\2\uffff\1\12\2\uffff";
    static final String dfa_17s = "\1\uffff\1\1\2\uffff\1\2\1\4\1\uffff\1\5\1\3";
    static final String dfa_18s = "\11\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\4\uffff\1\2\1\3\2\1\3\uffff\1\1\16\uffff\1\1\1\uffff\1\1\33\uffff\1\1\5\uffff\2\1\16\uffff\3\4\1\5\4\uffff\2\1\3\uffff\1\1\1\uffff\1\1\4\uffff\1\1\1\uffff\1\1\15\uffff\2\1",
            "",
            "\1\1\1\uffff\1\1\4\uffff\1\1\11\uffff\1\6\4\1\1\uffff\2\1\20\uffff\1\1\13\uffff\1\1\1\uffff\21\1\1\10\1\7\7\1\1\uffff\5\1",
            "\1\1\1\uffff\1\1\4\uffff\1\1\11\uffff\1\6\4\1\1\uffff\2\1\20\uffff\1\1\13\uffff\1\1\1\uffff\21\1\1\10\1\7\7\1\1\uffff\5\1",
            "",
            "",
            "\1\2\1\3",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "4991:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) )";
        }
    }
    static final String dfa_20s = "\22\uffff";
    static final String dfa_21s = "\4\uffff\2\12\6\uffff\2\12\2\uffff\2\12";
    static final String dfa_22s = "\1\4\1\uffff\1\4\1\uffff\2\17\3\uffff\1\11\1\uffff\1\11\2\17\1\uffff\1\11\2\17";
    static final String dfa_23s = "\1\170\1\uffff\1\170\1\uffff\2\145\3\uffff\1\150\1\uffff\1\12\2\145\1\uffff\1\20\2\145";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\5\1\6\1\7\1\uffff\1\3\3\uffff\1\4\3\uffff";
    static final String dfa_25s = "\22\uffff}>";
    static final String[] dfa_26s = {
            "\1\3\4\uffff\1\4\1\5\2\3\3\uffff\1\7\20\uffff\1\3\41\uffff\1\6\1\3\35\uffff\1\2\4\uffff\1\1\1\uffff\1\6\15\uffff\2\3",
            "",
            "\1\10\4\uffff\4\10\3\uffff\1\10\16\uffff\1\10\1\uffff\1\10\33\uffff\1\10\5\uffff\3\10\15\uffff\4\10\4\uffff\2\10\3\uffff\1\10\1\uffff\1\10\1\1\3\uffff\1\10\1\uffff\1\10\15\uffff\2\10",
            "",
            "\1\12\1\uffff\1\12\4\uffff\1\12\11\uffff\1\13\4\12\1\uffff\2\12\20\uffff\1\12\13\uffff\1\11\1\uffff\21\12\2\uffff\7\12\1\uffff\1\12\1\6\3\12",
            "\1\12\1\uffff\1\12\4\uffff\1\12\11\uffff\1\13\4\12\1\uffff\2\12\20\uffff\1\12\13\uffff\1\11\1\uffff\21\12\2\uffff\7\12\1\uffff\1\12\1\6\3\12",
            "",
            "",
            "",
            "\1\14\1\15\5\uffff\1\12\62\uffff\1\12\44\uffff\1\16",
            "",
            "\1\4\1\5",
            "\1\12\1\uffff\1\12\4\uffff\1\12\11\uffff\5\12\1\uffff\2\12\20\uffff\1\12\13\uffff\1\17\1\uffff\21\12\2\uffff\7\12\1\uffff\1\12\1\6\3\12",
            "\1\12\1\uffff\1\12\4\uffff\1\12\11\uffff\5\12\1\uffff\2\12\20\uffff\1\12\13\uffff\1\17\1\uffff\21\12\2\uffff\7\12\1\uffff\1\12\1\6\3\12",
            "",
            "\1\20\1\21\5\uffff\1\12",
            "\1\12\1\uffff\1\12\4\uffff\1\12\12\uffff\4\12\1\uffff\2\12\20\uffff\1\12\13\uffff\1\17\1\uffff\21\12\2\uffff\7\12\1\uffff\1\12\1\6\3\12",
            "\1\12\1\uffff\1\12\4\uffff\1\12\12\uffff\4\12\1\uffff\2\12\20\uffff\1\12\13\uffff\1\17\1\uffff\21\12\2\uffff\7\12\1\uffff\1\12\1\6\3\12"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA143 extends DFA {

        public DFA143(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 143;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "5832:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) )";
        }
    }
    static final String dfa_27s = "\7\uffff";
    static final String dfa_28s = "\1\4\1\uffff\2\26\1\uffff\1\11\1\uffff";
    static final String dfa_29s = "\1\170\1\uffff\2\146\1\uffff\1\12\1\uffff";
    static final String dfa_30s = "\1\uffff\1\1\2\uffff\1\3\1\uffff\1\2";
    static final String dfa_31s = "\7\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\4\uffff\1\2\1\3\2\1\3\uffff\1\1\16\uffff\1\1\1\uffff\1\1\33\uffff\1\1\5\uffff\3\1\15\uffff\4\1\4\uffff\2\1\3\uffff\1\1\1\uffff\1\1\1\4\3\uffff\1\1\1\uffff\1\1\15\uffff\2\1",
            "",
            "\1\1\11\uffff\1\5\3\1\2\uffff\2\1\20\uffff\1\1\13\uffff\1\1\3\uffff\30\1\1\uffff\5\1\1\6",
            "\1\1\11\uffff\1\5\3\1\2\uffff\2\1\20\uffff\1\1\13\uffff\1\1\3\uffff\30\1\1\uffff\5\1\1\6",
            "",
            "\1\2\1\3",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA144 extends DFA {

        public DFA144(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 144;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "5972:3: (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )?";
        }
    }
    static final String dfa_33s = "\14\uffff";
    static final String dfa_34s = "\1\4\1\156\1\uffff\2\11\2\40\2\11\1\uffff\2\104";
    static final String dfa_35s = "\1\170\1\156\1\uffff\1\103\1\12\2\155\2\12\1\uffff\2\155";
    static final String dfa_36s = "\2\uffff\1\2\6\uffff\1\1\2\uffff";
    static final String dfa_37s = "\14\uffff}>";
    static final String[] dfa_38s = {
            "\1\2\4\uffff\4\2\3\uffff\1\2\16\uffff\1\2\1\uffff\1\2\33\uffff\1\2\5\uffff\3\2\15\uffff\4\2\4\uffff\2\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\2\1\uffff\1\2\2\uffff\1\1\12\uffff\2\2",
            "\1\3",
            "",
            "\1\5\1\6\70\uffff\1\4",
            "\1\5\1\6",
            "\1\7\43\uffff\1\10\41\uffff\1\11\6\uffff\1\2",
            "\1\7\43\uffff\1\10\41\uffff\1\11\6\uffff\1\2",
            "\1\5\1\6",
            "\1\12\1\13",
            "",
            "\1\10\41\uffff\1\11\6\uffff\1\2",
            "\1\10\41\uffff\1\11\6\uffff\1\2"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA154 extends DFA {

        public DFA154(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 154;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "6434:3: (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x08FFFC203D1C41E2L,0x0E00100000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x08FFFE203D1E41E0L,0x0E00100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000018600L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000200600L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000418000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x008000003D020020L,0x0E00100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000005000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004006000620L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004400020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004004000620L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004020000600L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000600L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000900018000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800018000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000280011E10L,0x0180028518780038L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x008000003D0200E0L,0x0E00100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000014000000600L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000600L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0600004800000600L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x08FFFC203D1E41E0L,0x0E00100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800100000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x7600004880000600L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000018000L,0x0000000000000007L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800200000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xF600004880018600L,0x0000000000000007L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800400000000100L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800800000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0801000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0802000000000100L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0804000000000100L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0808000000000100L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0810000000000100L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0820000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x28FFFC22BD1F5FF0L,0x0F80128518780038L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0840000000000100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000200001E10L,0x0180000000000010L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0100001000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x2000000000000600L,0x0000020000000008L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000600L,0x0000020000000008L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0xF600004800000602L,0x0000000000000007L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0xF200000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x2000000280011E10L,0x0180028518780018L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000000078000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x000000C000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x2000000280011E10L,0x0180028518000018L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000200000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000400000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000800000002L,0x0000003200000010L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000010600L,0x0000000400000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x2000000280011E10L,0x0180028D18780038L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x2000000280011E10L,0x0180168518780038L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x1600000000008000L,0x007DA00000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x2000000280011E10L,0x0180128518780038L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000020000L,0x0000800000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000001800L});

}