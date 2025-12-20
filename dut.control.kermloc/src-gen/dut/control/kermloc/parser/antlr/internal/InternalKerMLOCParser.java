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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STRING_VALUE", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_PREFIXNAME_TEXT", "RULE_REGULAR_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'aaa'", "'::'", "'USELESS'", "'.'", "'~'", "'if'", "'?'", "'else'", "'??'", "'implies'", "'|'", "'or'", "'xor'", "'&'", "'and'", "'=='", "'!='", "'==='", "'!=='", "'hastype'", "'istype'", "'@'", "'as'", "'@@'", "'meta'", "'<'", "'>'", "'<='", "'>='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'^'", "'not'", "'all'", "'#'", "'('", "')'", "'['", "']'", "'->'", "'.?'", "','", "'='", "'null'", "'metadata'", "'new'", "'{'", "'in'", "';'", "'ref'", "'private'", "':'", "'attribute'", "':>>'", "'}'", "'defined'", "'by'", "':>'", "'specializes'", "'subsets'", "'::>'", "'references'", "'=>'", "'crosses'", "'redefines'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL_VALUE=7;
    public static final int RULE_PREFIXNAME_TEXT=9;
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
    public static final int RULE_ML_NOTE=11;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_REGULAR_COMMENT=10;
    public static final int T__72=72;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_UNRESTRICTED_NAME=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int RULE_EXP_VALUE=8;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "Namespace";
       	}

       	@Override
       	protected KerMLOCGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNamespace"
    // InternalKerMLOC.g:65:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalKerMLOC.g:65:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalKerMLOC.g:66:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalKerMLOC.g:72:1: ruleNamespace returns [EObject current=null] : ( (lv_elements_0_0= ruleGeneralBodyElements ) )* ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;



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

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKerMLOC.g:80:3: (lv_elements_0_0= ruleGeneralBodyElements )
            	    {
            	    // InternalKerMLOC.g:80:3: (lv_elements_0_0= ruleGeneralBodyElements )
            	    // InternalKerMLOC.g:81:4: lv_elements_0_0= ruleGeneralBodyElements
            	    {

            	    				newCompositeNode(grammarAccess.getNamespaceAccess().getElementsGeneralBodyElementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleGeneralBodyElements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getNamespaceRule());
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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGeneralBodyElements"
    // InternalKerMLOC.g:101:1: entryRuleGeneralBodyElements returns [String current=null] : iv_ruleGeneralBodyElements= ruleGeneralBodyElements EOF ;
    public final String entryRuleGeneralBodyElements() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGeneralBodyElements = null;


        try {
            // InternalKerMLOC.g:101:59: (iv_ruleGeneralBodyElements= ruleGeneralBodyElements EOF )
            // InternalKerMLOC.g:102:2: iv_ruleGeneralBodyElements= ruleGeneralBodyElements EOF
            {
             newCompositeNode(grammarAccess.getGeneralBodyElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralBodyElements=ruleGeneralBodyElements();

            state._fsp--;

             current =iv_ruleGeneralBodyElements.getText(); 
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
    // InternalKerMLOC.g:108:1: ruleGeneralBodyElements returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'aaa' ;
    public final AntlrDatatypeRuleToken ruleGeneralBodyElements() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:114:2: (kw= 'aaa' )
            // InternalKerMLOC.g:115:2: kw= 'aaa'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGeneralBodyElementsAccess().getAaaKeyword());
            	

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


    // $ANTLR start "entryRuleName"
    // InternalKerMLOC.g:123:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalKerMLOC.g:123:44: (iv_ruleName= ruleName EOF )
            // InternalKerMLOC.g:124:2: iv_ruleName= ruleName EOF
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
    // InternalKerMLOC.g:130:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:136:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalKerMLOC.g:137:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalKerMLOC.g:137:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_UNRESTRICTED_NAME) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKerMLOC.g:138:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:146:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalKerMLOC.g:157:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalKerMLOC.g:157:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalKerMLOC.g:158:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalKerMLOC.g:164:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:170:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalKerMLOC.g:171:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalKerMLOC.g:171:2: (this_Name_0= ruleName kw= '::' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==15) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3==15) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLOC.g:172:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_4);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,15,FOLLOW_5); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalKerMLOC.g:191:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKerMLOC.g:191:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKerMLOC.g:192:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalKerMLOC.g:198:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:204:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalKerMLOC.g:205:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalKerMLOC.g:205:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalKerMLOC.g:206:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalKerMLOC.g:206:3: (this_Qualification_0= ruleQualification )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    alt4=1;
                }
            }
            else if ( (LA4_0==RULE_UNRESTRICTED_NAME) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==15) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalKerMLOC.g:207:4: this_Qualification_0= ruleQualification
                    {

                    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_6);
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
    // InternalKerMLOC.g:232:1: entryRuleFeatureChainName returns [String current=null] : iv_ruleFeatureChainName= ruleFeatureChainName EOF ;
    public final String entryRuleFeatureChainName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureChainName = null;


        try {
            // InternalKerMLOC.g:232:56: (iv_ruleFeatureChainName= ruleFeatureChainName EOF )
            // InternalKerMLOC.g:233:2: iv_ruleFeatureChainName= ruleFeatureChainName EOF
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
    // InternalKerMLOC.g:239:1: ruleFeatureChainName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFeatureChainName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_Name_3 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:245:2: ( ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) )
            // InternalKerMLOC.g:246:2: ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            {
            // InternalKerMLOC.g:246:2: ( (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            // InternalKerMLOC.g:247:3: (kw= 'USELESS' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )*
            {
            // InternalKerMLOC.g:247:3: (kw= 'USELESS' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKerMLOC.g:248:4: kw= 'USELESS'
                    {
                    kw=(Token)match(input,16,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getUSELESSKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getFeatureChainNameAccess().getQualifiedNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:264:3: (kw= '.' this_Name_3= ruleName )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    int LA6_2 = input.LA(2);

                    if ( ((LA6_2>=RULE_ID && LA6_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLOC.g:265:4: kw= '.' this_Name_3= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getFullStopKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_8);
            	    this_Name_3=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalKerMLOC.g:285:1: entryRuleFeatureTypingName returns [String current=null] : iv_ruleFeatureTypingName= ruleFeatureTypingName EOF ;
    public final String entryRuleFeatureTypingName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureTypingName = null;


        try {
            // InternalKerMLOC.g:285:57: (iv_ruleFeatureTypingName= ruleFeatureTypingName EOF )
            // InternalKerMLOC.g:286:2: iv_ruleFeatureTypingName= ruleFeatureTypingName EOF
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
    // InternalKerMLOC.g:292:1: ruleFeatureTypingName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) ) ;
    public final AntlrDatatypeRuleToken ruleFeatureTypingName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureChainName_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:298:2: ( (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) ) )
            // InternalKerMLOC.g:299:2: (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) )
            {
            // InternalKerMLOC.g:299:2: (this_FeatureChainName_0= ruleFeatureChainName | (kw= '~' this_QualifiedName_2= ruleQualifiedName ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_UNRESTRICTED_NAME)||LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKerMLOC.g:300:3: this_FeatureChainName_0= ruleFeatureChainName
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
                    // InternalKerMLOC.g:311:3: (kw= '~' this_QualifiedName_2= ruleQualifiedName )
                    {
                    // InternalKerMLOC.g:311:3: (kw= '~' this_QualifiedName_2= ruleQualifiedName )
                    // InternalKerMLOC.g:312:4: kw= '~' this_QualifiedName_2= ruleQualifiedName
                    {
                    kw=(Token)match(input,18,FOLLOW_7); 

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


    // $ANTLR start "entryRuleOwnedExpression"
    // InternalKerMLOC.g:332:1: entryRuleOwnedExpression returns [String current=null] : iv_ruleOwnedExpression= ruleOwnedExpression EOF ;
    public final String entryRuleOwnedExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOwnedExpression = null;


        try {
            // InternalKerMLOC.g:332:55: (iv_ruleOwnedExpression= ruleOwnedExpression EOF )
            // InternalKerMLOC.g:333:2: iv_ruleOwnedExpression= ruleOwnedExpression EOF
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
    // InternalKerMLOC.g:339:1: ruleOwnedExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ConditionalExpression_0= ruleConditionalExpression ;
    public final AntlrDatatypeRuleToken ruleOwnedExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConditionalExpression_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:345:2: (this_ConditionalExpression_0= ruleConditionalExpression )
            // InternalKerMLOC.g:346:2: this_ConditionalExpression_0= ruleConditionalExpression
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
    // InternalKerMLOC.g:359:1: entryRuleConditionalExpression returns [String current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final String entryRuleConditionalExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalExpression = null;


        try {
            // InternalKerMLOC.g:359:61: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalKerMLOC.g:360:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
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
    // InternalKerMLOC.g:366:1: ruleConditionalExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) ) ;
    public final AntlrDatatypeRuleToken ruleConditionalExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NullCoalescingExpression_0 = null;

        AntlrDatatypeRuleToken this_NullCoalescingExpression_2 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_4 = null;

        AntlrDatatypeRuleToken this_OwnedExpression_6 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:372:2: ( (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) ) )
            // InternalKerMLOC.g:373:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) )
            {
            // InternalKerMLOC.g:373:2: (this_NullCoalescingExpression_0= ruleNullCoalescingExpression | (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_EXP_VALUE)||(LA8_0>=16 && LA8_0<=18)||(LA8_0>=33 && LA8_0<=36)||(LA8_0>=44 && LA8_0<=46)||(LA8_0>=51 && LA8_0<=52)||LA8_0==54||LA8_0==62||(LA8_0>=64 && LA8_0<=65)||(LA8_0>=84 && LA8_0<=85)) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKerMLOC.g:374:3: this_NullCoalescingExpression_0= ruleNullCoalescingExpression
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
                    // InternalKerMLOC.g:385:3: (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression )
                    {
                    // InternalKerMLOC.g:385:3: (kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression )
                    // InternalKerMLOC.g:386:4: kw= 'if' this_NullCoalescingExpression_2= ruleNullCoalescingExpression kw= '?' this_OwnedExpression_4= ruleOwnedExpression kw= 'else' this_OwnedExpression_6= ruleOwnedExpression
                    {
                    kw=(Token)match(input,19,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionalExpressionAccess().getIfKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getNullCoalescingExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_NullCoalescingExpression_2=ruleNullCoalescingExpression();

                    state._fsp--;


                    				current.merge(this_NullCoalescingExpression_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,20,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_2());
                    			

                    				newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOwnedExpressionParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_13);
                    this_OwnedExpression_4=ruleOwnedExpression();

                    state._fsp--;


                    				current.merge(this_OwnedExpression_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,21,FOLLOW_12); 

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
    // InternalKerMLOC.g:436:1: entryRuleNullCoalescingExpression returns [String current=null] : iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF ;
    public final String entryRuleNullCoalescingExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullCoalescingExpression = null;


        try {
            // InternalKerMLOC.g:436:64: (iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF )
            // InternalKerMLOC.g:437:2: iv_ruleNullCoalescingExpression= ruleNullCoalescingExpression EOF
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
    // InternalKerMLOC.g:443:1: ruleNullCoalescingExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleNullCoalescingExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ImpliesExpression_0 = null;

        AntlrDatatypeRuleToken this_ImpliesExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:449:2: ( (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* ) )
            // InternalKerMLOC.g:450:2: (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* )
            {
            // InternalKerMLOC.g:450:2: (this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )* )
            // InternalKerMLOC.g:451:3: this_ImpliesExpression_0= ruleImpliesExpression (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )*
            {

            			newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;


            			current.merge(this_ImpliesExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:461:3: (kw= '??' this_ImpliesExpression_2= ruleImpliesExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKerMLOC.g:462:4: kw= '??' this_ImpliesExpression_2= ruleImpliesExpression
            	    {
            	    kw=(Token)match(input,22,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNullCoalescingExpressionAccess().getQuestionMarkQuestionMarkKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNullCoalescingExpressionAccess().getImpliesExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_14);
            	    this_ImpliesExpression_2=ruleImpliesExpression();

            	    state._fsp--;


            	    				current.merge(this_ImpliesExpression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalKerMLOC.g:482:1: entryRuleImpliesExpression returns [String current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final String entryRuleImpliesExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpliesExpression = null;


        try {
            // InternalKerMLOC.g:482:57: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalKerMLOC.g:483:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
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
    // InternalKerMLOC.g:489:1: ruleImpliesExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleImpliesExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OrExpression_0 = null;

        AntlrDatatypeRuleToken this_OrExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:495:2: ( (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* ) )
            // InternalKerMLOC.g:496:2: (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* )
            {
            // InternalKerMLOC.g:496:2: (this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )* )
            // InternalKerMLOC.g:497:3: this_OrExpression_0= ruleOrExpression (kw= 'implies' this_OrExpression_2= ruleOrExpression )*
            {

            			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current.merge(this_OrExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:507:3: (kw= 'implies' this_OrExpression_2= ruleOrExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKerMLOC.g:508:4: kw= 'implies' this_OrExpression_2= ruleOrExpression
            	    {
            	    kw=(Token)match(input,23,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_15);
            	    this_OrExpression_2=ruleOrExpression();

            	    state._fsp--;


            	    				current.merge(this_OrExpression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalKerMLOC.g:528:1: entryRuleOrExpression returns [String current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final String entryRuleOrExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrExpression = null;


        try {
            // InternalKerMLOC.g:528:52: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalKerMLOC.g:529:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalKerMLOC.g:535:1: ruleOrExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* ) ;
    public final AntlrDatatypeRuleToken ruleOrExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XorExpression_0 = null;

        AntlrDatatypeRuleToken this_XorExpression_2 = null;

        AntlrDatatypeRuleToken this_XorExpression_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:541:2: ( (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* ) )
            // InternalKerMLOC.g:542:2: (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* )
            {
            // InternalKerMLOC.g:542:2: (this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )* )
            // InternalKerMLOC.g:543:3: this_XorExpression_0= ruleXorExpression ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current.merge(this_XorExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:553:3: ( (kw= '|' this_XorExpression_2= ruleXorExpression ) | (kw= 'or' this_XorExpression_4= ruleXorExpression ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }
                else if ( (LA11_0==25) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKerMLOC.g:554:4: (kw= '|' this_XorExpression_2= ruleXorExpression )
            	    {
            	    // InternalKerMLOC.g:554:4: (kw= '|' this_XorExpression_2= ruleXorExpression )
            	    // InternalKerMLOC.g:555:5: kw= '|' this_XorExpression_2= ruleXorExpression
            	    {
            	    kw=(Token)match(input,24,FOLLOW_10); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_1_0_1());
            	    				
            	    pushFollow(FOLLOW_16);
            	    this_XorExpression_2=ruleXorExpression();

            	    state._fsp--;


            	    					current.merge(this_XorExpression_2);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLOC.g:572:4: (kw= 'or' this_XorExpression_4= ruleXorExpression )
            	    {
            	    // InternalKerMLOC.g:572:4: (kw= 'or' this_XorExpression_4= ruleXorExpression )
            	    // InternalKerMLOC.g:573:5: kw= 'or' this_XorExpression_4= ruleXorExpression
            	    {
            	    kw=(Token)match(input,25,FOLLOW_10); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1_0());
            	    				

            	    					newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_1_1_1());
            	    				
            	    pushFollow(FOLLOW_16);
            	    this_XorExpression_4=ruleXorExpression();

            	    state._fsp--;


            	    					current.merge(this_XorExpression_4);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalKerMLOC.g:594:1: entryRuleXorExpression returns [String current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final String entryRuleXorExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorExpression = null;


        try {
            // InternalKerMLOC.g:594:53: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalKerMLOC.g:595:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalKerMLOC.g:601:1: ruleXorExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleXorExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AndExpression_0 = null;

        AntlrDatatypeRuleToken this_AndExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:607:2: ( (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* ) )
            // InternalKerMLOC.g:608:2: (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* )
            {
            // InternalKerMLOC.g:608:2: (this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )* )
            // InternalKerMLOC.g:609:3: this_AndExpression_0= ruleAndExpression (kw= 'xor' this_AndExpression_2= ruleAndExpression )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current.merge(this_AndExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:619:3: (kw= 'xor' this_AndExpression_2= ruleAndExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKerMLOC.g:620:4: kw= 'xor' this_AndExpression_2= ruleAndExpression
            	    {
            	    kw=(Token)match(input,26,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getXorExpressionAccess().getXorKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_AndExpression_2=ruleAndExpression();

            	    state._fsp--;


            	    				current.merge(this_AndExpression_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalKerMLOC.g:640:1: entryRuleAndExpression returns [String current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final String entryRuleAndExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndExpression = null;


        try {
            // InternalKerMLOC.g:640:53: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKerMLOC.g:641:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalKerMLOC.g:647:1: ruleAndExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* ) ;
    public final AntlrDatatypeRuleToken ruleAndExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken this_EqualityExpression_2 = null;

        AntlrDatatypeRuleToken this_EqualityExpression_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:653:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* ) )
            // InternalKerMLOC.g:654:2: (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* )
            {
            // InternalKerMLOC.g:654:2: (this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )* )
            // InternalKerMLOC.g:655:3: this_EqualityExpression_0= ruleEqualityExpression ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current.merge(this_EqualityExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:665:3: ( (kw= '&' this_EqualityExpression_2= ruleEqualityExpression ) | (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }
                else if ( (LA13_0==28) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKerMLOC.g:666:4: (kw= '&' this_EqualityExpression_2= ruleEqualityExpression )
            	    {
            	    // InternalKerMLOC.g:666:4: (kw= '&' this_EqualityExpression_2= ruleEqualityExpression )
            	    // InternalKerMLOC.g:667:5: kw= '&' this_EqualityExpression_2= ruleEqualityExpression
            	    {
            	    kw=(Token)match(input,27,FOLLOW_10); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_1_0_1());
            	    				
            	    pushFollow(FOLLOW_18);
            	    this_EqualityExpression_2=ruleEqualityExpression();

            	    state._fsp--;


            	    					current.merge(this_EqualityExpression_2);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKerMLOC.g:684:4: (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression )
            	    {
            	    // InternalKerMLOC.g:684:4: (kw= 'and' this_EqualityExpression_4= ruleEqualityExpression )
            	    // InternalKerMLOC.g:685:5: kw= 'and' this_EqualityExpression_4= ruleEqualityExpression
            	    {
            	    kw=(Token)match(input,28,FOLLOW_10); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0());
            	    				

            	    					newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_1_1_1());
            	    				
            	    pushFollow(FOLLOW_18);
            	    this_EqualityExpression_4=ruleEqualityExpression();

            	    state._fsp--;


            	    					current.merge(this_EqualityExpression_4);
            	    				

            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalKerMLOC.g:706:1: entryRuleEqualityExpression returns [String current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final String entryRuleEqualityExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityExpression = null;


        try {
            // InternalKerMLOC.g:706:58: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalKerMLOC.g:707:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalKerMLOC.g:713:1: ruleEqualityExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleEqualityExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ClassificationExpression_0 = null;

        AntlrDatatypeRuleToken this_ClassificationExpression_5 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:719:2: ( (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* ) )
            // InternalKerMLOC.g:720:2: (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* )
            {
            // InternalKerMLOC.g:720:2: (this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )* )
            // InternalKerMLOC.g:721:3: this_ClassificationExpression_0= ruleClassificationExpression ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ClassificationExpression_0=ruleClassificationExpression();

            state._fsp--;


            			current.merge(this_ClassificationExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:731:3: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=29 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKerMLOC.g:732:4: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) this_ClassificationExpression_5= ruleClassificationExpression
            	    {
            	    // InternalKerMLOC.g:732:4: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalKerMLOC.g:733:5: kw= '=='
            	            {
            	            kw=(Token)match(input,29,FOLLOW_10); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getEqualsSignEqualsSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:739:5: kw= '!='
            	            {
            	            kw=(Token)match(input,30,FOLLOW_10); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:745:5: kw= '==='
            	            {
            	            kw=(Token)match(input,31,FOLLOW_10); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalKerMLOC.g:751:5: kw= '!=='
            	            {
            	            kw=(Token)match(input,32,FOLLOW_10); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getEqualityExpressionAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_3());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_19);
            	    this_ClassificationExpression_5=ruleClassificationExpression();

            	    state._fsp--;


            	    				current.merge(this_ClassificationExpression_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalKerMLOC.g:772:1: entryRuleClassificationExpression returns [String current=null] : iv_ruleClassificationExpression= ruleClassificationExpression EOF ;
    public final String entryRuleClassificationExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationExpression = null;


        try {
            // InternalKerMLOC.g:772:64: (iv_ruleClassificationExpression= ruleClassificationExpression EOF )
            // InternalKerMLOC.g:773:2: iv_ruleClassificationExpression= ruleClassificationExpression EOF
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
    // InternalKerMLOC.g:779:1: ruleClassificationExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) ) ;
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
            // InternalKerMLOC.g:785:2: ( ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) ) )
            // InternalKerMLOC.g:786:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) )
            {
            // InternalKerMLOC.g:786:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalKerMLOC.g:787:3: (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? )
                    {
                    // InternalKerMLOC.g:787:3: (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? )
                    // InternalKerMLOC.g:788:4: this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )?
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getRelationalExpressionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_20);
                    this_RelationalExpression_0=ruleRelationalExpression();

                    state._fsp--;


                    				current.merge(this_RelationalExpression_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:798:4: ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )?
                    int alt17=3;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=33 && LA17_0<=35)) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==36) ) {
                        alt17=2;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalKerMLOC.g:799:5: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName )
                            {
                            // InternalKerMLOC.g:799:5: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName )
                            // InternalKerMLOC.g:800:6: (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName
                            {
                            // InternalKerMLOC.g:800:6: (kw= 'hastype' | kw= 'istype' | kw= '@' )
                            int alt16=3;
                            switch ( input.LA(1) ) {
                            case 33:
                                {
                                alt16=1;
                                }
                                break;
                            case 34:
                                {
                                alt16=2;
                                }
                                break;
                            case 35:
                                {
                                alt16=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 0, input);

                                throw nvae;
                            }

                            switch (alt16) {
                                case 1 :
                                    // InternalKerMLOC.g:801:7: kw= 'hastype'
                                    {
                                    kw=(Token)match(input,33,FOLLOW_7); 

                                    							current.merge(kw);
                                    							newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getHastypeKeyword_0_1_0_0_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalKerMLOC.g:807:7: kw= 'istype'
                                    {
                                    kw=(Token)match(input,34,FOLLOW_7); 

                                    							current.merge(kw);
                                    							newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getIstypeKeyword_0_1_0_0_1());
                                    						

                                    }
                                    break;
                                case 3 :
                                    // InternalKerMLOC.g:813:7: kw= '@'
                                    {
                                    kw=(Token)match(input,35,FOLLOW_7); 

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
                            // InternalKerMLOC.g:831:5: (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName )
                            {
                            // InternalKerMLOC.g:831:5: (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName )
                            // InternalKerMLOC.g:832:6: kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName
                            {
                            kw=(Token)match(input,36,FOLLOW_7); 

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
                    // InternalKerMLOC.g:851:3: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:851:3: ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName )
                    // InternalKerMLOC.g:852:4: (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName
                    {
                    // InternalKerMLOC.g:852:4: (kw= 'hastype' | kw= 'istype' | kw= '@' )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt18=1;
                        }
                        break;
                    case 34:
                        {
                        alt18=2;
                        }
                        break;
                    case 35:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // InternalKerMLOC.g:853:5: kw= 'hastype'
                            {
                            kw=(Token)match(input,33,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getHastypeKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:859:5: kw= 'istype'
                            {
                            kw=(Token)match(input,34,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getClassificationExpressionAccess().getIstypeKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalKerMLOC.g:865:5: kw= '@'
                            {
                            kw=(Token)match(input,35,FOLLOW_7); 

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
                    // InternalKerMLOC.g:883:3: (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:883:3: (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName )
                    // InternalKerMLOC.g:884:4: this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getMetadataReferenceNameParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_21);
                    this_MetadataReferenceName_11=ruleMetadataReferenceName();

                    state._fsp--;


                    				current.merge(this_MetadataReferenceName_11);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,37,FOLLOW_7); 

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
                    // InternalKerMLOC.g:911:3: (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:911:3: (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName )
                    // InternalKerMLOC.g:912:4: kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName
                    {
                    kw=(Token)match(input,36,FOLLOW_7); 

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
                    // InternalKerMLOC.g:929:3: (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:929:3: (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName )
                    // InternalKerMLOC.g:930:4: this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName
                    {

                    				newCompositeNode(grammarAccess.getClassificationExpressionAccess().getMetadataReferenceNameParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_22);
                    this_MetadataReferenceName_16=ruleMetadataReferenceName();

                    state._fsp--;


                    				current.merge(this_MetadataReferenceName_16);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,38,FOLLOW_7); 

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
    // InternalKerMLOC.g:960:1: entryRuleReferenceTypingName returns [String current=null] : iv_ruleReferenceTypingName= ruleReferenceTypingName EOF ;
    public final String entryRuleReferenceTypingName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferenceTypingName = null;


        try {
            // InternalKerMLOC.g:960:59: (iv_ruleReferenceTypingName= ruleReferenceTypingName EOF )
            // InternalKerMLOC.g:961:2: iv_ruleReferenceTypingName= ruleReferenceTypingName EOF
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
    // InternalKerMLOC.g:967:1: ruleReferenceTypingName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleReferenceTypingName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:973:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:974:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalKerMLOC.g:987:1: entryRuleMetadataReferenceName returns [String current=null] : iv_ruleMetadataReferenceName= ruleMetadataReferenceName EOF ;
    public final String entryRuleMetadataReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadataReferenceName = null;


        try {
            // InternalKerMLOC.g:987:61: (iv_ruleMetadataReferenceName= ruleMetadataReferenceName EOF )
            // InternalKerMLOC.g:988:2: iv_ruleMetadataReferenceName= ruleMetadataReferenceName EOF
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
    // InternalKerMLOC.g:994:1: ruleMetadataReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleMetadataReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1000:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:1001:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalKerMLOC.g:1014:1: entryRuleRelationalExpression returns [String current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final String entryRuleRelationalExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalExpression = null;


        try {
            // InternalKerMLOC.g:1014:60: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalKerMLOC.g:1015:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalKerMLOC.g:1021:1: ruleRelationalExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleRelationalExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_RangeExpression_0 = null;

        AntlrDatatypeRuleToken this_RangeExpression_5 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1027:2: ( (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* ) )
            // InternalKerMLOC.g:1028:2: (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* )
            {
            // InternalKerMLOC.g:1028:2: (this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )* )
            // InternalKerMLOC.g:1029:3: this_RangeExpression_0= ruleRangeExpression ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_RangeExpression_0=ruleRangeExpression();

            state._fsp--;


            			current.merge(this_RangeExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1039:3: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=39 && LA21_0<=42)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKerMLOC.g:1040:4: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_RangeExpression_5= ruleRangeExpression
            	    {
            	    // InternalKerMLOC.g:1040:4: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalKerMLOC.g:1041:5: kw= '<'
            	            {
            	            kw=(Token)match(input,39,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getLessThanSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:1047:5: kw= '>'
            	            {
            	            kw=(Token)match(input,40,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getGreaterThanSignKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:1053:5: kw= '<='
            	            {
            	            kw=(Token)match(input,41,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalKerMLOC.g:1059:5: kw= '>='
            	            {
            	            kw=(Token)match(input,42,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getRelationalExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_3());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRangeExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_23);
            	    this_RangeExpression_5=ruleRangeExpression();

            	    state._fsp--;


            	    				current.merge(this_RangeExpression_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKerMLOC.g:1080:1: entryRuleRangeExpression returns [String current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final String entryRuleRangeExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRangeExpression = null;


        try {
            // InternalKerMLOC.g:1080:55: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalKerMLOC.g:1081:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalKerMLOC.g:1087:1: ruleRangeExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleRangeExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken this_AdditiveExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1093:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? ) )
            // InternalKerMLOC.g:1094:2: (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? )
            {
            // InternalKerMLOC.g:1094:2: (this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )? )
            // InternalKerMLOC.g:1095:3: this_AdditiveExpression_0= ruleAdditiveExpression (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )?
            {

            			newCompositeNode(grammarAccess.getRangeExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current.merge(this_AdditiveExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1105:3: (kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKerMLOC.g:1106:4: kw= '..' this_AdditiveExpression_2= ruleAdditiveExpression
                    {
                    kw=(Token)match(input,43,FOLLOW_24); 

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
    // InternalKerMLOC.g:1126:1: entryRuleAdditiveExpression returns [String current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final String entryRuleAdditiveExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveExpression = null;


        try {
            // InternalKerMLOC.g:1126:58: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalKerMLOC.g:1127:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalKerMLOC.g:1133:1: ruleAdditiveExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken this_MultiplicativeExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1139:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* ) )
            // InternalKerMLOC.g:1140:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* )
            {
            // InternalKerMLOC.g:1140:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )* )
            // InternalKerMLOC.g:1141:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current.merge(this_MultiplicativeExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1151:3: ( (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=44 && LA24_0<=45)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKerMLOC.g:1152:4: (kw= '+' | kw= '-' ) this_MultiplicativeExpression_3= ruleMultiplicativeExpression
            	    {
            	    // InternalKerMLOC.g:1152:4: (kw= '+' | kw= '-' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==44) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==45) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalKerMLOC.g:1153:5: kw= '+'
            	            {
            	            kw=(Token)match(input,44,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:1159:5: kw= '-'
            	            {
            	            kw=(Token)match(input,45,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_26);
            	    this_MultiplicativeExpression_3=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    				current.merge(this_MultiplicativeExpression_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKerMLOC.g:1180:1: entryRuleMultiplicativeExpression returns [String current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final String entryRuleMultiplicativeExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeExpression = null;


        try {
            // InternalKerMLOC.g:1180:64: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalKerMLOC.g:1181:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalKerMLOC.g:1187:1: ruleMultiplicativeExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExponentiationExpression_0 = null;

        AntlrDatatypeRuleToken this_ExponentiationExpression_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1193:2: ( (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* ) )
            // InternalKerMLOC.g:1194:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* )
            {
            // InternalKerMLOC.g:1194:2: (this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )* )
            // InternalKerMLOC.g:1195:3: this_ExponentiationExpression_0= ruleExponentiationExpression ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_ExponentiationExpression_0=ruleExponentiationExpression();

            state._fsp--;


            			current.merge(this_ExponentiationExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1205:3: ( (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=46 && LA26_0<=48)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKerMLOC.g:1206:4: (kw= '*' | kw= '/' | kw= '%' ) this_ExponentiationExpression_4= ruleExponentiationExpression
            	    {
            	    // InternalKerMLOC.g:1206:4: (kw= '*' | kw= '/' | kw= '%' )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalKerMLOC.g:1207:5: kw= '*'
            	            {
            	            kw=(Token)match(input,46,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:1213:5: kw= '/'
            	            {
            	            kw=(Token)match(input,47,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:1219:5: kw= '%'
            	            {
            	            kw=(Token)match(input,48,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getMultiplicativeExpressionAccess().getPercentSignKeyword_1_0_2());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentiationExpressionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_27);
            	    this_ExponentiationExpression_4=ruleExponentiationExpression();

            	    state._fsp--;


            	    				current.merge(this_ExponentiationExpression_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKerMLOC.g:1240:1: entryRuleExponentiationExpression returns [String current=null] : iv_ruleExponentiationExpression= ruleExponentiationExpression EOF ;
    public final String entryRuleExponentiationExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponentiationExpression = null;


        try {
            // InternalKerMLOC.g:1240:64: (iv_ruleExponentiationExpression= ruleExponentiationExpression EOF )
            // InternalKerMLOC.g:1241:2: iv_ruleExponentiationExpression= ruleExponentiationExpression EOF
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
    // InternalKerMLOC.g:1247:1: ruleExponentiationExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleExponentiationExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken this_UnaryExpression_3 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1253:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? ) )
            // InternalKerMLOC.g:1254:2: (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? )
            {
            // InternalKerMLOC.g:1254:2: (this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )? )
            // InternalKerMLOC.g:1255:3: this_UnaryExpression_0= ruleUnaryExpression ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )?
            {

            			newCompositeNode(grammarAccess.getExponentiationExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current.merge(this_UnaryExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1265:3: ( (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=49 && LA28_0<=50)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKerMLOC.g:1266:4: (kw= '**' | kw= '^' ) this_UnaryExpression_3= ruleUnaryExpression
                    {
                    // InternalKerMLOC.g:1266:4: (kw= '**' | kw= '^' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==49) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==50) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalKerMLOC.g:1267:5: kw= '**'
                            {
                            kw=(Token)match(input,49,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getExponentiationExpressionAccess().getAsteriskAsteriskKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:1273:5: kw= '^'
                            {
                            kw=(Token)match(input,50,FOLLOW_24); 

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
    // InternalKerMLOC.g:1294:1: entryRuleUnaryExpression returns [String current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final String entryRuleUnaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpression = null;


        try {
            // InternalKerMLOC.g:1294:55: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalKerMLOC.g:1295:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalKerMLOC.g:1301:1: ruleUnaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExtentExpression_4 = null;

        AntlrDatatypeRuleToken this_ExtentExpression_5 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1307:2: ( ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression ) )
            // InternalKerMLOC.g:1308:2: ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression )
            {
            // InternalKerMLOC.g:1308:2: ( ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression ) | this_ExtentExpression_5= ruleExtentExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18||(LA30_0>=44 && LA30_0<=45)||LA30_0==51) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_EXP_VALUE)||(LA30_0>=16 && LA30_0<=17)||LA30_0==46||LA30_0==52||LA30_0==54||LA30_0==62||(LA30_0>=64 && LA30_0<=65)||(LA30_0>=84 && LA30_0<=85)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalKerMLOC.g:1309:3: ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression )
                    {
                    // InternalKerMLOC.g:1309:3: ( (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression )
                    // InternalKerMLOC.g:1310:4: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' ) this_ExtentExpression_4= ruleExtentExpression
                    {
                    // InternalKerMLOC.g:1310:4: (kw= '+' | kw= '-' | kw= '~' | kw= 'not' )
                    int alt29=4;
                    switch ( input.LA(1) ) {
                    case 44:
                        {
                        alt29=1;
                        }
                        break;
                    case 45:
                        {
                        alt29=2;
                        }
                        break;
                    case 18:
                        {
                        alt29=3;
                        }
                        break;
                    case 51:
                        {
                        alt29=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // InternalKerMLOC.g:1311:5: kw= '+'
                            {
                            kw=(Token)match(input,44,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:1317:5: kw= '-'
                            {
                            kw=(Token)match(input,45,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalKerMLOC.g:1323:5: kw= '~'
                            {
                            kw=(Token)match(input,18,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getUnaryExpressionAccess().getTildeKeyword_0_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalKerMLOC.g:1329:5: kw= 'not'
                            {
                            kw=(Token)match(input,51,FOLLOW_24); 

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
                    // InternalKerMLOC.g:1347:3: this_ExtentExpression_5= ruleExtentExpression
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
    // InternalKerMLOC.g:1361:1: entryRuleExtentExpression returns [String current=null] : iv_ruleExtentExpression= ruleExtentExpression EOF ;
    public final String entryRuleExtentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtentExpression = null;


        try {
            // InternalKerMLOC.g:1361:56: (iv_ruleExtentExpression= ruleExtentExpression EOF )
            // InternalKerMLOC.g:1362:2: iv_ruleExtentExpression= ruleExtentExpression EOF
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
    // InternalKerMLOC.g:1368:1: ruleExtentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression ) ;
    public final AntlrDatatypeRuleToken ruleExtentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ReferenceTypingName_1 = null;

        AntlrDatatypeRuleToken this_PrimaryExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1374:2: ( ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression ) )
            // InternalKerMLOC.g:1375:2: ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression )
            {
            // InternalKerMLOC.g:1375:2: ( (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName ) | this_PrimaryExpression_2= rulePrimaryExpression )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_EXP_VALUE)||(LA31_0>=16 && LA31_0<=17)||LA31_0==46||LA31_0==54||LA31_0==62||(LA31_0>=64 && LA31_0<=65)||(LA31_0>=84 && LA31_0<=85)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalKerMLOC.g:1376:3: (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName )
                    {
                    // InternalKerMLOC.g:1376:3: (kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName )
                    // InternalKerMLOC.g:1377:4: kw= 'all' this_ReferenceTypingName_1= ruleReferenceTypingName
                    {
                    kw=(Token)match(input,52,FOLLOW_7); 

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
                    // InternalKerMLOC.g:1394:3: this_PrimaryExpression_2= rulePrimaryExpression
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
    // InternalKerMLOC.g:1408:1: entryRulePrimaryExpression returns [String current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final String entryRulePrimaryExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpression = null;


        try {
            // InternalKerMLOC.g:1408:57: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalKerMLOC.g:1409:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalKerMLOC.g:1415:1: rulePrimaryExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* ) ;
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
            // InternalKerMLOC.g:1421:2: ( (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* ) )
            // InternalKerMLOC.g:1422:2: (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* )
            {
            // InternalKerMLOC.g:1422:2: (this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )* )
            // InternalKerMLOC.g:1423:3: this_BaseExpression_0= ruleBaseExpression (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )? ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current.merge(this_BaseExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1433:3: (kw= '.' this_FeatureChainName_2= ruleFeatureChainName )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1>=RULE_ID && LA32_1<=RULE_UNRESTRICTED_NAME)||LA32_1==16) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalKerMLOC.g:1434:4: kw= '.' this_FeatureChainName_2= ruleFeatureChainName
                    {
                    kw=(Token)match(input,17,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureChainNameParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_FeatureChainName_2=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:1450:3: ( ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17||LA36_0==53||LA36_0==56||(LA36_0>=58 && LA36_0<=59)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKerMLOC.g:1451:4: ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) ) (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )?
            	    {
            	    // InternalKerMLOC.g:1451:4: ( (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) | (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' ) | (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) ) | (kw= '.' this_BodyExpression_16= ruleBodyExpression ) | (kw= '.?' this_BodyExpression_18= ruleBodyExpression ) )
            	    int alt34=5;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt34=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // InternalKerMLOC.g:1452:5: (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
            	            {
            	            // InternalKerMLOC.g:1452:5: (kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
            	            // InternalKerMLOC.g:1453:6: kw= '#' kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')'
            	            {
            	            kw=(Token)match(input,53,FOLLOW_31); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getNumberSignKeyword_2_0_0_0());
            	            					
            	            kw=(Token)match(input,54,FOLLOW_12); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0_0_1());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceExpressionParserRuleCall_2_0_0_2());
            	            					
            	            pushFollow(FOLLOW_32);
            	            this_SequenceExpression_5=ruleSequenceExpression();

            	            state._fsp--;


            	            						current.merge(this_SequenceExpression_5);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					
            	            kw=(Token)match(input,55,FOLLOW_29); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_0_0_3());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKerMLOC.g:1480:5: (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' )
            	            {
            	            // InternalKerMLOC.g:1480:5: (kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']' )
            	            // InternalKerMLOC.g:1481:6: kw= '[' this_SequenceExpression_8= ruleSequenceExpression kw= ']'
            	            {
            	            kw=(Token)match(input,56,FOLLOW_12); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getLeftSquareBracketKeyword_2_0_1_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceExpressionParserRuleCall_2_0_1_1());
            	            					
            	            pushFollow(FOLLOW_33);
            	            this_SequenceExpression_8=ruleSequenceExpression();

            	            state._fsp--;


            	            						current.merge(this_SequenceExpression_8);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					
            	            kw=(Token)match(input,57,FOLLOW_29); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_2_0_1_2());
            	            					

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKerMLOC.g:1503:5: (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) )
            	            {
            	            // InternalKerMLOC.g:1503:5: (kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList ) )
            	            // InternalKerMLOC.g:1504:6: kw= '->' this_ReferenceTypingName_11= ruleReferenceTypingName (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList )
            	            {
            	            kw=(Token)match(input,58,FOLLOW_7); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_2_0_2_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getReferenceTypingNameParserRuleCall_2_0_2_1());
            	            					
            	            pushFollow(FOLLOW_34);
            	            this_ReferenceTypingName_11=ruleReferenceTypingName();

            	            state._fsp--;


            	            						current.merge(this_ReferenceTypingName_11);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					
            	            // InternalKerMLOC.g:1519:6: (this_BodyExpression_12= ruleBodyExpression | this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression | this_ArgumentList_14= ruleArgumentList )
            	            int alt33=3;
            	            switch ( input.LA(1) ) {
            	            case 65:
            	                {
            	                alt33=1;
            	                }
            	                break;
            	            case RULE_ID:
            	            case RULE_UNRESTRICTED_NAME:
            	                {
            	                alt33=2;
            	                }
            	                break;
            	            case 54:
            	                {
            	                alt33=3;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 33, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt33) {
            	                case 1 :
            	                    // InternalKerMLOC.g:1520:7: this_BodyExpression_12= ruleBodyExpression
            	                    {

            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyExpressionParserRuleCall_2_0_2_2_0());
            	                    						
            	                    pushFollow(FOLLOW_29);
            	                    this_BodyExpression_12=ruleBodyExpression();

            	                    state._fsp--;


            	                    							current.merge(this_BodyExpression_12);
            	                    						

            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalKerMLOC.g:1531:7: this_FunctionReferenceExpression_13= ruleFunctionReferenceExpression
            	                    {

            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionReferenceExpressionParserRuleCall_2_0_2_2_1());
            	                    						
            	                    pushFollow(FOLLOW_29);
            	                    this_FunctionReferenceExpression_13=ruleFunctionReferenceExpression();

            	                    state._fsp--;


            	                    							current.merge(this_FunctionReferenceExpression_13);
            	                    						

            	                    							afterParserOrEnumRuleCall();
            	                    						

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalKerMLOC.g:1542:7: this_ArgumentList_14= ruleArgumentList
            	                    {

            	                    							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentListParserRuleCall_2_0_2_2_2());
            	                    						
            	                    pushFollow(FOLLOW_29);
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
            	            // InternalKerMLOC.g:1555:5: (kw= '.' this_BodyExpression_16= ruleBodyExpression )
            	            {
            	            // InternalKerMLOC.g:1555:5: (kw= '.' this_BodyExpression_16= ruleBodyExpression )
            	            // InternalKerMLOC.g:1556:6: kw= '.' this_BodyExpression_16= ruleBodyExpression
            	            {
            	            kw=(Token)match(input,17,FOLLOW_35); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_0_3_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyExpressionParserRuleCall_2_0_3_1());
            	            					
            	            pushFollow(FOLLOW_29);
            	            this_BodyExpression_16=ruleBodyExpression();

            	            state._fsp--;


            	            						current.merge(this_BodyExpression_16);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalKerMLOC.g:1573:5: (kw= '.?' this_BodyExpression_18= ruleBodyExpression )
            	            {
            	            // InternalKerMLOC.g:1573:5: (kw= '.?' this_BodyExpression_18= ruleBodyExpression )
            	            // InternalKerMLOC.g:1574:6: kw= '.?' this_BodyExpression_18= ruleBodyExpression
            	            {
            	            kw=(Token)match(input,59,FOLLOW_35); 

            	            						current.merge(kw);
            	            						newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopQuestionMarkKeyword_2_0_4_0());
            	            					

            	            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyExpressionParserRuleCall_2_0_4_1());
            	            					
            	            pushFollow(FOLLOW_29);
            	            this_BodyExpression_18=ruleBodyExpression();

            	            state._fsp--;


            	            						current.merge(this_BodyExpression_18);
            	            					

            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKerMLOC.g:1591:4: (kw= '.' this_FeatureChainName_20= ruleFeatureChainName )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==17) ) {
            	        int LA35_1 = input.LA(2);

            	        if ( ((LA35_1>=RULE_ID && LA35_1<=RULE_UNRESTRICTED_NAME)||LA35_1==16) ) {
            	            alt35=1;
            	        }
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalKerMLOC.g:1592:5: kw= '.' this_FeatureChainName_20= ruleFeatureChainName
            	            {
            	            kw=(Token)match(input,17,FOLLOW_30); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0());
            	            				

            	            					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureChainNameParserRuleCall_2_1_1());
            	            				
            	            pushFollow(FOLLOW_29);
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
            	    break loop36;
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
    // InternalKerMLOC.g:1613:1: entryRuleBaseExpression returns [String current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final String entryRuleBaseExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseExpression = null;


        try {
            // InternalKerMLOC.g:1613:54: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalKerMLOC.g:1614:2: iv_ruleBaseExpression= ruleBaseExpression EOF
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
    // InternalKerMLOC.g:1620:1: ruleBaseExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) ) ;
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
            // InternalKerMLOC.g:1626:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) ) )
            // InternalKerMLOC.g:1627:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) )
            {
            // InternalKerMLOC.g:1627:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) )
            int alt37=7;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalKerMLOC.g:1628:3: this_NullExpression_0= ruleNullExpression
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
                    // InternalKerMLOC.g:1639:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalKerMLOC.g:1650:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
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
                    // InternalKerMLOC.g:1661:3: this_MetadataAccessExpression_3= ruleMetadataAccessExpression
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
                    // InternalKerMLOC.g:1672:3: this_InvocationExpression_4= ruleInvocationExpression
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
                    // InternalKerMLOC.g:1683:3: this_BodyExpression_5= ruleBodyExpression
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
                    // InternalKerMLOC.g:1694:3: (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' )
                    {
                    // InternalKerMLOC.g:1694:3: (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' )
                    // InternalKerMLOC.g:1695:4: kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')'
                    {
                    kw=(Token)match(input,54,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceExpressionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_32);
                    this_SequenceExpression_7=ruleSequenceExpression();

                    state._fsp--;


                    				current.merge(this_SequenceExpression_7);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalKerMLOC.g:1720:1: entryRuleFunctionReferenceExpression returns [String current=null] : iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF ;
    public final String entryRuleFunctionReferenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionReferenceExpression = null;


        try {
            // InternalKerMLOC.g:1720:67: (iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF )
            // InternalKerMLOC.g:1721:2: iv_ruleFunctionReferenceExpression= ruleFunctionReferenceExpression EOF
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
    // InternalKerMLOC.g:1727:1: ruleFunctionReferenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleFunctionReferenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1733:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:1734:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalKerMLOC.g:1747:1: entryRuleArgumentList returns [String current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final String entryRuleArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgumentList = null;


        try {
            // InternalKerMLOC.g:1747:52: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalKerMLOC.g:1748:2: iv_ruleArgumentList= ruleArgumentList EOF
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
    // InternalKerMLOC.g:1754:1: ruleArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PositionalArgumentList_1 = null;

        AntlrDatatypeRuleToken this_NamedArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1760:2: ( (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' ) )
            // InternalKerMLOC.g:1761:2: (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' )
            {
            // InternalKerMLOC.g:1761:2: (kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')' )
            // InternalKerMLOC.g:1762:3: kw= '(' (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )? kw= ')'
            {
            kw=(Token)match(input,54,FOLLOW_36); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalKerMLOC.g:1767:3: (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )?
            int alt38=3;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalKerMLOC.g:1768:4: this_PositionalArgumentList_1= rulePositionalArgumentList
                    {

                    				newCompositeNode(grammarAccess.getArgumentListAccess().getPositionalArgumentListParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_32);
                    this_PositionalArgumentList_1=rulePositionalArgumentList();

                    state._fsp--;


                    				current.merge(this_PositionalArgumentList_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1779:4: this_NamedArgumentList_2= ruleNamedArgumentList
                    {

                    				newCompositeNode(grammarAccess.getArgumentListAccess().getNamedArgumentListParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_32);
                    this_NamedArgumentList_2=ruleNamedArgumentList();

                    state._fsp--;


                    				current.merge(this_NamedArgumentList_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalKerMLOC.g:1799:1: entryRulePositionalArgumentList returns [String current=null] : iv_rulePositionalArgumentList= rulePositionalArgumentList EOF ;
    public final String entryRulePositionalArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePositionalArgumentList = null;


        try {
            // InternalKerMLOC.g:1799:62: (iv_rulePositionalArgumentList= rulePositionalArgumentList EOF )
            // InternalKerMLOC.g:1800:2: iv_rulePositionalArgumentList= rulePositionalArgumentList EOF
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
    // InternalKerMLOC.g:1806:1: rulePositionalArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* ) ;
    public final AntlrDatatypeRuleToken rulePositionalArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArgumentValue_0 = null;

        AntlrDatatypeRuleToken this_ArgumentValue_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1812:2: ( (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* ) )
            // InternalKerMLOC.g:1813:2: (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* )
            {
            // InternalKerMLOC.g:1813:2: (this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )* )
            // InternalKerMLOC.g:1814:3: this_ArgumentValue_0= ruleArgumentValue (kw= ',' this_ArgumentValue_2= ruleArgumentValue )*
            {

            			newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getArgumentValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_ArgumentValue_0=ruleArgumentValue();

            state._fsp--;


            			current.merge(this_ArgumentValue_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1824:3: (kw= ',' this_ArgumentValue_2= ruleArgumentValue )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==60) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKerMLOC.g:1825:4: kw= ',' this_ArgumentValue_2= ruleArgumentValue
            	    {
            	    kw=(Token)match(input,60,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPositionalArgumentListAccess().getCommaKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getPositionalArgumentListAccess().getArgumentValueParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_37);
            	    this_ArgumentValue_2=ruleArgumentValue();

            	    state._fsp--;


            	    				current.merge(this_ArgumentValue_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalKerMLOC.g:1845:1: entryRuleNamedArgumentList returns [String current=null] : iv_ruleNamedArgumentList= ruleNamedArgumentList EOF ;
    public final String entryRuleNamedArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamedArgumentList = null;


        try {
            // InternalKerMLOC.g:1845:57: (iv_ruleNamedArgumentList= ruleNamedArgumentList EOF )
            // InternalKerMLOC.g:1846:2: iv_ruleNamedArgumentList= ruleNamedArgumentList EOF
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
    // InternalKerMLOC.g:1852:1: ruleNamedArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* ) ;
    public final AntlrDatatypeRuleToken ruleNamedArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NamedArgument_0 = null;

        AntlrDatatypeRuleToken this_NamedArgument_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1858:2: ( (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* ) )
            // InternalKerMLOC.g:1859:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* )
            {
            // InternalKerMLOC.g:1859:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )* )
            // InternalKerMLOC.g:1860:3: this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )*
            {

            			newCompositeNode(grammarAccess.getNamedArgumentListAccess().getNamedArgumentParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_NamedArgument_0=ruleNamedArgument();

            state._fsp--;


            			current.merge(this_NamedArgument_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:1870:3: (kw= ',' this_NamedArgument_2= ruleNamedArgument )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==60) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKerMLOC.g:1871:4: kw= ',' this_NamedArgument_2= ruleNamedArgument
            	    {
            	    kw=(Token)match(input,60,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNamedArgumentListAccess().getCommaKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamedArgumentListAccess().getNamedArgumentParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_37);
            	    this_NamedArgument_2=ruleNamedArgument();

            	    state._fsp--;


            	    				current.merge(this_NamedArgument_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalKerMLOC.g:1891:1: entryRuleArgumentValue returns [String current=null] : iv_ruleArgumentValue= ruleArgumentValue EOF ;
    public final String entryRuleArgumentValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgumentValue = null;


        try {
            // InternalKerMLOC.g:1891:53: (iv_ruleArgumentValue= ruleArgumentValue EOF )
            // InternalKerMLOC.g:1892:2: iv_ruleArgumentValue= ruleArgumentValue EOF
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
    // InternalKerMLOC.g:1898:1: ruleArgumentValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OwnedExpression_0= ruleOwnedExpression ;
    public final AntlrDatatypeRuleToken ruleArgumentValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OwnedExpression_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1904:2: (this_OwnedExpression_0= ruleOwnedExpression )
            // InternalKerMLOC.g:1905:2: this_OwnedExpression_0= ruleOwnedExpression
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
    // InternalKerMLOC.g:1918:1: entryRuleNamedArgument returns [String current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final String entryRuleNamedArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamedArgument = null;


        try {
            // InternalKerMLOC.g:1918:53: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalKerMLOC.g:1919:2: iv_ruleNamedArgument= ruleNamedArgument EOF
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
    // InternalKerMLOC.g:1925:1: ruleNamedArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue ) ;
    public final AntlrDatatypeRuleToken ruleNamedArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_ArgumentValue_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:1931:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue ) )
            // InternalKerMLOC.g:1932:2: (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue )
            {
            // InternalKerMLOC.g:1932:2: (this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue )
            // InternalKerMLOC.g:1933:3: this_QualifiedName_0= ruleQualifiedName kw= '=' this_ArgumentValue_2= ruleArgumentValue
            {

            			newCompositeNode(grammarAccess.getNamedArgumentAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,61,FOLLOW_12); 

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
    // InternalKerMLOC.g:1962:1: entryRuleNullExpression returns [String current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final String entryRuleNullExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullExpression = null;


        try {
            // InternalKerMLOC.g:1962:54: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalKerMLOC.g:1963:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalKerMLOC.g:1969:1: ruleNullExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'null' | (kw= '(' kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleNullExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:1975:2: ( (kw= 'null' | (kw= '(' kw= ')' ) ) )
            // InternalKerMLOC.g:1976:2: (kw= 'null' | (kw= '(' kw= ')' ) )
            {
            // InternalKerMLOC.g:1976:2: (kw= 'null' | (kw= '(' kw= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==62) ) {
                alt41=1;
            }
            else if ( (LA41_0==54) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalKerMLOC.g:1977:3: kw= 'null'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNullExpressionAccess().getNullKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:1983:3: (kw= '(' kw= ')' )
                    {
                    // InternalKerMLOC.g:1983:3: (kw= '(' kw= ')' )
                    // InternalKerMLOC.g:1984:4: kw= '(' kw= ')'
                    {
                    kw=(Token)match(input,54,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNullExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalKerMLOC.g:1999:1: entryRuleMetadataAccessExpression returns [String current=null] : iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF ;
    public final String entryRuleMetadataAccessExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadataAccessExpression = null;


        try {
            // InternalKerMLOC.g:1999:64: (iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF )
            // InternalKerMLOC.g:2000:2: iv_ruleMetadataAccessExpression= ruleMetadataAccessExpression EOF
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
    // InternalKerMLOC.g:2006:1: ruleMetadataAccessExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' ) ;
    public final AntlrDatatypeRuleToken ruleMetadataAccessExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2012:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' ) )
            // InternalKerMLOC.g:2013:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' )
            {
            // InternalKerMLOC.g:2013:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata' )
            // InternalKerMLOC.g:2014:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= 'metadata'
            {

            			newCompositeNode(grammarAccess.getMetadataAccessExpressionAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,17,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMetadataAccessExpressionAccess().getFullStopKeyword_1());
            		
            kw=(Token)match(input,63,FOLLOW_2); 

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
    // InternalKerMLOC.g:2038:1: entryRuleInvocationExpression returns [String current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final String entryRuleInvocationExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInvocationExpression = null;


        try {
            // InternalKerMLOC.g:2038:60: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalKerMLOC.g:2039:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
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
    // InternalKerMLOC.g:2045:1: ruleInvocationExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList ) ;
    public final AntlrDatatypeRuleToken ruleInvocationExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureChainName_1 = null;

        AntlrDatatypeRuleToken this_ArgumentList_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2051:2: ( ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList ) )
            // InternalKerMLOC.g:2052:2: ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList )
            {
            // InternalKerMLOC.g:2052:2: ( (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList )
            // InternalKerMLOC.g:2053:3: (kw= 'new' )? this_FeatureChainName_1= ruleFeatureChainName this_ArgumentList_2= ruleArgumentList
            {
            // InternalKerMLOC.g:2053:3: (kw= 'new' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKerMLOC.g:2054:4: kw= 'new'
                    {
                    kw=(Token)match(input,64,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getInvocationExpressionAccess().getNewKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getInvocationExpressionAccess().getFeatureChainNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_34);
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
    // InternalKerMLOC.g:2084:1: entryRuleBodyExpression returns [String current=null] : iv_ruleBodyExpression= ruleBodyExpression EOF ;
    public final String entryRuleBodyExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBodyExpression = null;


        try {
            // InternalKerMLOC.g:2084:54: (iv_ruleBodyExpression= ruleBodyExpression EOF )
            // InternalKerMLOC.g:2085:2: iv_ruleBodyExpression= ruleBodyExpression EOF
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
    // InternalKerMLOC.g:2091:1: ruleBodyExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' ) ;
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
            // InternalKerMLOC.g:2097:2: ( (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' ) )
            // InternalKerMLOC.g:2098:2: (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' )
            {
            // InternalKerMLOC.g:2098:2: (kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}' )
            // InternalKerMLOC.g:2099:3: kw= '{' (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )* (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )* (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )? (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )? this_OwnedExpression_35= ruleOwnedExpression kw= '}'
            {
            kw=(Token)match(input,65,FOLLOW_41); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalKerMLOC.g:2104:3: (kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';' )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==66) ) {
                    int LA44_1 = input.LA(2);

                    if ( ((LA44_1>=RULE_ID && LA44_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalKerMLOC.g:2105:4: kw= 'in' this_Name_2= ruleName (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )* kw= ';'
            	    {
            	    kw=(Token)match(input,66,FOLLOW_42); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getInKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_43);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalKerMLOC.g:2120:4: (this_FeatureSpecializationName_3= ruleFeatureSpecializationName )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==70||LA43_0==72||LA43_0==74||(LA43_0>=76 && LA43_0<=83)) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalKerMLOC.g:2121:5: this_FeatureSpecializationName_3= ruleFeatureSpecializationName
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureSpecializationNameParserRuleCall_1_2());
            	    	    				
            	    	    pushFollow(FOLLOW_43);
            	    	    this_FeatureSpecializationName_3=ruleFeatureSpecializationName();

            	    	    state._fsp--;


            	    	    					current.merge(this_FeatureSpecializationName_3);
            	    	    				

            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    kw=(Token)match(input,67,FOLLOW_41); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalKerMLOC.g:2138:3: (kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==66) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKerMLOC.g:2139:4: kw= 'in' kw= 'ref' this_Name_7= ruleName (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )* kw= ';'
            	    {
            	    kw=(Token)match(input,66,FOLLOW_44); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getInKeyword_2_0());
            	    			
            	    kw=(Token)match(input,68,FOLLOW_42); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getRefKeyword_2_1());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getNameParserRuleCall_2_2());
            	    			
            	    pushFollow(FOLLOW_43);
            	    this_Name_7=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_7);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalKerMLOC.g:2159:4: (this_FeatureSpecializationName_8= ruleFeatureSpecializationName )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==70||LA45_0==72||LA45_0==74||(LA45_0>=76 && LA45_0<=83)) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // InternalKerMLOC.g:2160:5: this_FeatureSpecializationName_8= ruleFeatureSpecializationName
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureSpecializationNameParserRuleCall_2_3());
            	    	    				
            	    	    pushFollow(FOLLOW_43);
            	    	    this_FeatureSpecializationName_8=ruleFeatureSpecializationName();

            	    	    state._fsp--;


            	    	    					current.merge(this_FeatureSpecializationName_8);
            	    	    				

            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);

            	    kw=(Token)match(input,67,FOLLOW_41); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalKerMLOC.g:2177:3: (kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==69) ) {
                    int LA47_1 = input.LA(2);

                    if ( ((LA47_1>=RULE_ID && LA47_1<=RULE_UNRESTRICTED_NAME)||LA47_1==16) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalKerMLOC.g:2178:4: kw= 'private' this_FeatureChainName_11= ruleFeatureChainName kw= ':' this_QualifiedName_13= ruleQualifiedName kw= '=' this_OwnedExpression_15= ruleOwnedExpression kw= ';'
            	    {
            	    kw=(Token)match(input,69,FOLLOW_30); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getPrivateKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_45);
            	    this_FeatureChainName_11=ruleFeatureChainName();

            	    state._fsp--;


            	    				current.merge(this_FeatureChainName_11);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,70,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getColonKeyword_3_2());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getQualifiedNameParserRuleCall_3_3());
            	    			
            	    pushFollow(FOLLOW_38);
            	    this_QualifiedName_13=ruleQualifiedName();

            	    state._fsp--;


            	    				current.merge(this_QualifiedName_13);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,61,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getEqualsSignKeyword_3_4());
            	    			

            	    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_3_5());
            	    			
            	    pushFollow(FOLLOW_46);
            	    this_OwnedExpression_15=ruleOwnedExpression();

            	    state._fsp--;


            	    				current.merge(this_OwnedExpression_15);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,67,FOLLOW_47); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_3_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalKerMLOC.g:2229:3: (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )?
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalKerMLOC.g:2230:4: kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';'
                    {
                    kw=(Token)match(input,69,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getPrivateKeyword_4_0());
                    			
                    kw=(Token)match(input,71,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getAttributeKeyword_4_1());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_4_2());
                    			
                    pushFollow(FOLLOW_38);
                    this_FeatureChainName_19=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_19);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,61,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getEqualsSignKeyword_4_3());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_4_4());
                    			
                    pushFollow(FOLLOW_46);
                    this_OwnedExpression_21=ruleOwnedExpression();

                    state._fsp--;


                    				current.merge(this_OwnedExpression_21);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,67,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalKerMLOC.g:2271:3: (kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==69) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKerMLOC.g:2272:4: kw= 'private' kw= 'attribute' this_FeatureChainName_25= ruleFeatureChainName kw= ':' this_QualifiedName_27= ruleQualifiedName kw= '{' (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )* kw= '}'
                    {
                    kw=(Token)match(input,69,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getPrivateKeyword_5_0());
                    			
                    kw=(Token)match(input,71,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getAttributeKeyword_5_1());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_5_2());
                    			
                    pushFollow(FOLLOW_45);
                    this_FeatureChainName_25=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_25);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,70,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getColonKeyword_5_3());
                    			

                    				newCompositeNode(grammarAccess.getBodyExpressionAccess().getQualifiedNameParserRuleCall_5_4());
                    			
                    pushFollow(FOLLOW_35);
                    this_QualifiedName_27=ruleQualifiedName();

                    state._fsp--;


                    				current.merge(this_QualifiedName_27);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,65,FOLLOW_49); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getLeftCurlyBracketKeyword_5_5());
                    			
                    // InternalKerMLOC.g:2312:4: (kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';' )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==72) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2313:5: kw= ':>>' this_FeatureChainName_30= ruleFeatureChainName kw= '=' this_OwnedExpression_32= ruleOwnedExpression kw= ';'
                    	    {
                    	    kw=(Token)match(input,72,FOLLOW_30); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getColonGreaterThanSignGreaterThanSignKeyword_5_6_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getFeatureChainNameParserRuleCall_5_6_1());
                    	    				
                    	    pushFollow(FOLLOW_38);
                    	    this_FeatureChainName_30=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_30);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    kw=(Token)match(input,61,FOLLOW_12); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getEqualsSignKeyword_5_6_2());
                    	    				

                    	    					newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_5_6_3());
                    	    				
                    	    pushFollow(FOLLOW_46);
                    	    this_OwnedExpression_32=ruleOwnedExpression();

                    	    state._fsp--;


                    	    					current.merge(this_OwnedExpression_32);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    kw=(Token)match(input,67,FOLLOW_49); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getSemicolonKeyword_5_6_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    kw=(Token)match(input,73,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBodyExpressionAccess().getRightCurlyBracketKeyword_5_7());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedExpressionParserRuleCall_6());
            		
            pushFollow(FOLLOW_50);
            this_OwnedExpression_35=ruleOwnedExpression();

            state._fsp--;


            			current.merge(this_OwnedExpression_35);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,73,FOLLOW_2); 

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
    // InternalKerMLOC.g:2374:1: entryRuleFeatureSpecializationName returns [String current=null] : iv_ruleFeatureSpecializationName= ruleFeatureSpecializationName EOF ;
    public final String entryRuleFeatureSpecializationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureSpecializationName = null;


        try {
            // InternalKerMLOC.g:2374:65: (iv_ruleFeatureSpecializationName= ruleFeatureSpecializationName EOF )
            // InternalKerMLOC.g:2375:2: iv_ruleFeatureSpecializationName= ruleFeatureSpecializationName EOF
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
    // InternalKerMLOC.g:2381:1: ruleFeatureSpecializationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) ) ;
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
            // InternalKerMLOC.g:2387:2: ( ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) ) )
            // InternalKerMLOC.g:2388:2: ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) )
            {
            // InternalKerMLOC.g:2388:2: ( ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* ) | ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* ) | ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* ) | ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* ) | ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* ) )
            int alt61=5;
            switch ( input.LA(1) ) {
            case 70:
            case 74:
                {
                alt61=1;
                }
                break;
            case 76:
            case 77:
            case 78:
                {
                alt61=2;
                }
                break;
            case 79:
            case 80:
                {
                alt61=3;
                }
                break;
            case 81:
            case 82:
                {
                alt61=4;
                }
                break;
            case 72:
            case 83:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalKerMLOC.g:2389:3: ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* )
                    {
                    // InternalKerMLOC.g:2389:3: ( (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )* )
                    // InternalKerMLOC.g:2390:4: (kw= ':' | (kw= 'defined' kw= 'by' ) ) this_FeatureTypingName_3= ruleFeatureTypingName (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )*
                    {
                    // InternalKerMLOC.g:2390:4: (kw= ':' | (kw= 'defined' kw= 'by' ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==70) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==74) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalKerMLOC.g:2391:5: kw= ':'
                            {
                            kw=(Token)match(input,70,FOLLOW_51); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:2397:5: (kw= 'defined' kw= 'by' )
                            {
                            // InternalKerMLOC.g:2397:5: (kw= 'defined' kw= 'by' )
                            // InternalKerMLOC.g:2398:6: kw= 'defined' kw= 'by'
                            {
                            kw=(Token)match(input,74,FOLLOW_52); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getDefinedKeyword_0_0_1_0());
                            					
                            kw=(Token)match(input,75,FOLLOW_51); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getByKeyword_0_0_1_1());
                            					

                            }


                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureTypingNameParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_FeatureTypingName_3=ruleFeatureTypingName();

                    state._fsp--;


                    				current.merge(this_FeatureTypingName_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:2420:4: (kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==60) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2421:5: kw= ',' this_FeatureTypingName_5= ruleFeatureTypingName
                    	    {
                    	    kw=(Token)match(input,60,FOLLOW_51); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_0_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureTypingNameParserRuleCall_0_2_1());
                    	    				
                    	    pushFollow(FOLLOW_37);
                    	    this_FeatureTypingName_5=ruleFeatureTypingName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureTypingName_5);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2439:3: ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:2439:3: ( (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:2440:4: (kw= ':>' | kw= 'specializes' | kw= 'subsets' ) this_FeatureChainName_9= ruleFeatureChainName (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:2440:4: (kw= ':>' | kw= 'specializes' | kw= 'subsets' )
                    int alt53=3;
                    switch ( input.LA(1) ) {
                    case 76:
                        {
                        alt53=1;
                        }
                        break;
                    case 77:
                        {
                        alt53=2;
                        }
                        break;
                    case 78:
                        {
                        alt53=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }

                    switch (alt53) {
                        case 1 :
                            // InternalKerMLOC.g:2441:5: kw= ':>'
                            {
                            kw=(Token)match(input,76,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonGreaterThanSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:2447:5: kw= 'specializes'
                            {
                            kw=(Token)match(input,77,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getSpecializesKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalKerMLOC.g:2453:5: kw= 'subsets'
                            {
                            kw=(Token)match(input,78,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getSubsetsKeyword_1_0_2());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_FeatureChainName_9=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_9);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:2469:4: (kw= ',' this_FeatureChainName_11= ruleFeatureChainName )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==60) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2470:5: kw= ',' this_FeatureChainName_11= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,60,FOLLOW_30); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_1_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_1_2_1());
                    	    				
                    	    pushFollow(FOLLOW_37);
                    	    this_FeatureChainName_11=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_11);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalKerMLOC.g:2488:3: ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:2488:3: ( (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:2489:4: (kw= '::>' | kw= 'references' ) this_FeatureChainName_14= ruleFeatureChainName (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:2489:4: (kw= '::>' | kw= 'references' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==79) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==80) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalKerMLOC.g:2490:5: kw= '::>'
                            {
                            kw=(Token)match(input,79,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonColonGreaterThanSignKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:2496:5: kw= 'references'
                            {
                            kw=(Token)match(input,80,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getReferencesKeyword_2_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_FeatureChainName_14=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:2512:4: (kw= ',' this_FeatureChainName_16= ruleFeatureChainName )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==60) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2513:5: kw= ',' this_FeatureChainName_16= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,60,FOLLOW_30); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_2_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_2_2_1());
                    	    				
                    	    pushFollow(FOLLOW_37);
                    	    this_FeatureChainName_16=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_16);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalKerMLOC.g:2531:3: ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:2531:3: ( (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:2532:4: (kw= '=>' | kw= 'crosses' ) this_FeatureChainName_19= ruleFeatureChainName (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:2532:4: (kw= '=>' | kw= 'crosses' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==81) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==82) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalKerMLOC.g:2533:5: kw= '=>'
                            {
                            kw=(Token)match(input,81,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:2539:5: kw= 'crosses'
                            {
                            kw=(Token)match(input,82,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCrossesKeyword_3_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_FeatureChainName_19=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_19);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:2555:4: (kw= ',' this_FeatureChainName_21= ruleFeatureChainName )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==60) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2556:5: kw= ',' this_FeatureChainName_21= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,60,FOLLOW_30); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_3_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_3_2_1());
                    	    				
                    	    pushFollow(FOLLOW_37);
                    	    this_FeatureChainName_21=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_21);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalKerMLOC.g:2574:3: ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* )
                    {
                    // InternalKerMLOC.g:2574:3: ( (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )* )
                    // InternalKerMLOC.g:2575:4: (kw= ':>>' | kw= 'redefines' ) this_FeatureChainName_24= ruleFeatureChainName (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )*
                    {
                    // InternalKerMLOC.g:2575:4: (kw= ':>>' | kw= 'redefines' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==72) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==83) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalKerMLOC.g:2576:5: kw= ':>>'
                            {
                            kw=(Token)match(input,72,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:2582:5: kw= 'redefines'
                            {
                            kw=(Token)match(input,83,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getRedefinesKeyword_4_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_FeatureChainName_24=ruleFeatureChainName();

                    state._fsp--;


                    				current.merge(this_FeatureChainName_24);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalKerMLOC.g:2598:4: (kw= ',' this_FeatureChainName_26= ruleFeatureChainName )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==60) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalKerMLOC.g:2599:5: kw= ',' this_FeatureChainName_26= ruleFeatureChainName
                    	    {
                    	    kw=(Token)match(input,60,FOLLOW_30); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getFeatureSpecializationNameAccess().getCommaKeyword_4_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getFeatureSpecializationNameAccess().getFeatureChainNameParserRuleCall_4_2_1());
                    	    				
                    	    pushFollow(FOLLOW_37);
                    	    this_FeatureChainName_26=ruleFeatureChainName();

                    	    state._fsp--;


                    	    					current.merge(this_FeatureChainName_26);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
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
    // InternalKerMLOC.g:2620:1: entryRuleSequenceExpression returns [String current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final String entryRuleSequenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSequenceExpression = null;


        try {
            // InternalKerMLOC.g:2620:58: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalKerMLOC.g:2621:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalKerMLOC.g:2627:1: ruleSequenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleSequenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OwnedExpression_0 = null;

        AntlrDatatypeRuleToken this_SequenceExpression_2 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2633:2: ( (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? ) )
            // InternalKerMLOC.g:2634:2: (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? )
            {
            // InternalKerMLOC.g:2634:2: (this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )? )
            // InternalKerMLOC.g:2635:3: this_OwnedExpression_0= ruleOwnedExpression (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )?
            {

            			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getOwnedExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_OwnedExpression_0=ruleOwnedExpression();

            state._fsp--;


            			current.merge(this_OwnedExpression_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalKerMLOC.g:2645:3: (kw= ',' this_SequenceExpression_2= ruleSequenceExpression )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==60) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalKerMLOC.g:2646:4: kw= ',' this_SequenceExpression_2= ruleSequenceExpression
                    {
                    kw=(Token)match(input,60,FOLLOW_12); 

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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalKerMLOC.g:2666:1: entryRuleLiteralExpression returns [String current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final String entryRuleLiteralExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralExpression = null;


        try {
            // InternalKerMLOC.g:2666:57: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalKerMLOC.g:2667:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalKerMLOC.g:2673:1: ruleLiteralExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final AntlrDatatypeRuleToken ruleLiteralExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralBoolean_0 = null;

        AntlrDatatypeRuleToken this_LiteralString_1 = null;

        AntlrDatatypeRuleToken this_LiteralInteger_2 = null;

        AntlrDatatypeRuleToken this_LiteralReal_3 = null;

        AntlrDatatypeRuleToken this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2679:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalKerMLOC.g:2680:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalKerMLOC.g:2680:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt63=5;
            switch ( input.LA(1) ) {
            case 84:
            case 85:
                {
                alt63=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt63=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA63_3 = input.LA(2);

                if ( (LA63_3==17) ) {
                    int LA63_6 = input.LA(3);

                    if ( ((LA63_6>=RULE_DECIMAL_VALUE && LA63_6<=RULE_EXP_VALUE)) ) {
                        alt63=4;
                    }
                    else if ( ((LA63_6>=RULE_ID && LA63_6<=RULE_UNRESTRICTED_NAME)||LA63_6==16||LA63_6==65) ) {
                        alt63=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA63_3==EOF||(LA63_3>=20 && LA63_3<=36)||(LA63_3>=39 && LA63_3<=50)||LA63_3==53||(LA63_3>=55 && LA63_3<=60)||LA63_3==67||LA63_3==73) ) {
                    alt63=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 17:
                {
                alt63=4;
                }
                break;
            case 46:
                {
                alt63=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalKerMLOC.g:2681:3: this_LiteralBoolean_0= ruleLiteralBoolean
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
                    // InternalKerMLOC.g:2692:3: this_LiteralString_1= ruleLiteralString
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
                    // InternalKerMLOC.g:2703:3: this_LiteralInteger_2= ruleLiteralInteger
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
                    // InternalKerMLOC.g:2714:3: this_LiteralReal_3= ruleLiteralReal
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
                    // InternalKerMLOC.g:2725:3: this_LiteralInfinity_4= ruleLiteralInfinity
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
    // InternalKerMLOC.g:2739:1: entryRuleLiteralBoolean returns [String current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final String entryRuleLiteralBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralBoolean = null;


        try {
            // InternalKerMLOC.g:2739:54: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalKerMLOC.g:2740:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
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
    // InternalKerMLOC.g:2746:1: ruleLiteralBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BooleanValue_0= ruleBooleanValue ;
    public final AntlrDatatypeRuleToken ruleLiteralBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanValue_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2752:2: (this_BooleanValue_0= ruleBooleanValue )
            // InternalKerMLOC.g:2753:2: this_BooleanValue_0= ruleBooleanValue
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
    // InternalKerMLOC.g:2766:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalKerMLOC.g:2766:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKerMLOC.g:2767:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalKerMLOC.g:2773:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:2779:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalKerMLOC.g:2780:2: (kw= 'true' | kw= 'false' )
            {
            // InternalKerMLOC.g:2780:2: (kw= 'true' | kw= 'false' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==84) ) {
                alt64=1;
            }
            else if ( (LA64_0==85) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalKerMLOC.g:2781:3: kw= 'true'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKerMLOC.g:2787:3: kw= 'false'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

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
    // InternalKerMLOC.g:2796:1: entryRuleLiteralString returns [String current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final String entryRuleLiteralString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralString = null;


        try {
            // InternalKerMLOC.g:2796:53: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalKerMLOC.g:2797:2: iv_ruleLiteralString= ruleLiteralString EOF
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
    // InternalKerMLOC.g:2803:1: ruleLiteralString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_VALUE_0= RULE_STRING_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_VALUE_0=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:2809:2: (this_STRING_VALUE_0= RULE_STRING_VALUE )
            // InternalKerMLOC.g:2810:2: this_STRING_VALUE_0= RULE_STRING_VALUE
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
    // InternalKerMLOC.g:2820:1: entryRuleLiteralInteger returns [String current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final String entryRuleLiteralInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInteger = null;


        try {
            // InternalKerMLOC.g:2820:54: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalKerMLOC.g:2821:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
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
    // InternalKerMLOC.g:2827:1: ruleLiteralInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:2833:2: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )
            // InternalKerMLOC.g:2834:2: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
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
    // InternalKerMLOC.g:2844:1: entryRuleLiteralReal returns [String current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final String entryRuleLiteralReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralReal = null;


        try {
            // InternalKerMLOC.g:2844:51: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalKerMLOC.g:2845:2: iv_ruleLiteralReal= ruleLiteralReal EOF
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
    // InternalKerMLOC.g:2851:1: ruleLiteralReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_RealValue_0= ruleRealValue ;
    public final AntlrDatatypeRuleToken ruleLiteralReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_RealValue_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2857:2: (this_RealValue_0= ruleRealValue )
            // InternalKerMLOC.g:2858:2: this_RealValue_0= ruleRealValue
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
    // InternalKerMLOC.g:2871:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalKerMLOC.g:2871:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKerMLOC.g:2872:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKerMLOC.g:2878:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:2884:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalKerMLOC.g:2885:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalKerMLOC.g:2885:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_DECIMAL_VALUE||LA67_0==17) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_EXP_VALUE) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalKerMLOC.g:2886:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalKerMLOC.g:2886:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalKerMLOC.g:2887:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalKerMLOC.g:2887:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_DECIMAL_VALUE) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalKerMLOC.g:2888:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_39); 

                            					current.merge(this_DECIMAL_VALUE_0);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,17,FOLLOW_53); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalKerMLOC.g:2901:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_DECIMAL_VALUE) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==RULE_EXP_VALUE) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalKerMLOC.g:2902:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); 

                            					current.merge(this_DECIMAL_VALUE_2);
                            				

                            					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalKerMLOC.g:2910:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalKerMLOC.g:2920:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalKerMLOC.g:2931:1: entryRuleLiteralInfinity returns [String current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final String entryRuleLiteralInfinity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInfinity = null;


        try {
            // InternalKerMLOC.g:2931:55: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalKerMLOC.g:2932:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
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
    // InternalKerMLOC.g:2938:1: ruleLiteralInfinity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleLiteralInfinity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKerMLOC.g:2944:2: (kw= '*' )
            // InternalKerMLOC.g:2945:2: kw= '*'
            {
            kw=(Token)match(input,46,FOLLOW_2); 

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
    // InternalKerMLOC.g:2953:1: entryRuleFeatureReferenceExpression returns [String current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final String entryRuleFeatureReferenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalKerMLOC.g:2953:66: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalKerMLOC.g:2954:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalKerMLOC.g:2960:1: ruleFeatureReferenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleFeatureReferenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalKerMLOC.g:2966:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalKerMLOC.g:2967:2: this_QualifiedName_0= ruleQualifiedName
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

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\uffff\2\1\5\uffff";
    static final String dfa_3s = "\1\4\1\uffff\2\17\2\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\125\1\uffff\2\111\2\uffff\1\5\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\4\1\uffff\1\3\1\5";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\3\1\7\uffff\3\1\16\uffff\3\4\1\5\7\uffff\3\1\4\uffff\2\1\1\uffff\1\1\7\uffff\1\1\1\uffff\2\1\22\uffff\2\1",
            "",
            "\1\6\1\uffff\1\1\2\uffff\21\1\1\7\1\10\14\1\2\uffff\10\1\6\uffff\1\1\5\uffff\1\1",
            "\1\6\1\uffff\1\1\2\uffff\21\1\1\7\1\10\14\1\2\uffff\10\1\6\uffff\1\1\5\uffff\1\1",
            "",
            "",
            "\1\2\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "786:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_4= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_6= ruleReferenceTypingName ) )? ) | ( (kw= 'hastype' | kw= 'istype' | kw= '@' ) this_ReferenceTypingName_10= ruleReferenceTypingName ) | (this_MetadataReferenceName_11= ruleMetadataReferenceName kw= '@@' this_ReferenceTypingName_13= ruleReferenceTypingName ) | (kw= 'as' this_ReferenceTypingName_15= ruleReferenceTypingName ) | (this_MetadataReferenceName_16= ruleMetadataReferenceName kw= 'meta' this_ReferenceTypingName_18= ruleReferenceTypingName ) )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\4\uffff\2\13\7\uffff\2\13\1\uffff\2\13";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\uffff\2\17\3\uffff\2\4\2\uffff\2\17\1\4\2\21";
    static final String dfa_11s = "\1\125\1\uffff\1\125\1\uffff\2\111\3\uffff\1\101\1\5\2\uffff\2\111\1\101\2\111";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\5\1\6\1\7\2\uffff\1\3\1\4\5\uffff";
    static final String dfa_13s = "\22\uffff}>";
    static final String[] dfa_14s = {
            "\1\4\1\5\3\3\7\uffff\1\6\1\3\34\uffff\1\3\7\uffff\1\2\7\uffff\1\1\1\uffff\1\6\1\7\22\uffff\2\3",
            "",
            "\5\10\7\uffff\4\10\15\uffff\4\10\7\uffff\3\10\4\uffff\2\10\1\uffff\1\10\1\1\6\uffff\1\10\1\uffff\2\10\22\uffff\2\10",
            "",
            "\1\12\1\uffff\1\11\2\uffff\21\13\2\uffff\14\13\2\uffff\1\13\1\6\6\13\6\uffff\1\13\5\uffff\1\13",
            "\1\12\1\uffff\1\11\2\uffff\21\13\2\uffff\14\13\2\uffff\1\13\1\6\6\13\6\uffff\1\13\5\uffff\1\13",
            "",
            "",
            "",
            "\1\15\1\16\12\uffff\1\13\56\uffff\1\14\1\uffff\1\13",
            "\1\4\1\5",
            "",
            "",
            "\1\13\1\uffff\1\17\2\uffff\21\13\2\uffff\14\13\2\uffff\1\13\1\6\6\13\6\uffff\1\13\5\uffff\1\13",
            "\1\13\1\uffff\1\17\2\uffff\21\13\2\uffff\14\13\2\uffff\1\13\1\6\6\13\6\uffff\1\13\5\uffff\1\13",
            "\1\20\1\21\73\uffff\1\13",
            "\1\17\2\uffff\21\13\2\uffff\14\13\2\uffff\1\13\1\6\6\13\6\uffff\1\13\5\uffff\1\13",
            "\1\17\2\uffff\21\13\2\uffff\14\13\2\uffff\1\13\1\6\6\13\6\uffff\1\13\5\uffff\1\13"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1627:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_BodyExpression_5= ruleBodyExpression | (kw= '(' this_SequenceExpression_7= ruleSequenceExpression kw= ')' ) )";
        }
    }
    static final String dfa_15s = "\7\uffff";
    static final String dfa_16s = "\1\4\1\uffff\2\17\1\uffff\1\4\1\uffff";
    static final String dfa_17s = "\1\125\1\uffff\2\75\1\uffff\1\5\1\uffff";
    static final String dfa_18s = "\1\uffff\1\1\2\uffff\1\3\1\uffff\1\2";
    static final String dfa_19s = "\7\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\1\3\3\1\7\uffff\4\1\15\uffff\4\1\7\uffff\3\1\4\uffff\2\1\1\uffff\1\1\1\4\6\uffff\1\1\1\uffff\2\1\22\uffff\2\1",
            "",
            "\1\5\1\uffff\1\1\4\uffff\35\1\2\uffff\4\1\1\uffff\3\1\1\6",
            "\1\5\1\uffff\1\1\4\uffff\35\1\2\uffff\4\1\1\uffff\3\1\1\6",
            "",
            "\1\2\1\3",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1767:3: (this_PositionalArgumentList_1= rulePositionalArgumentList | this_NamedArgumentList_2= ruleNamedArgumentList )?";
        }
    }
    static final String dfa_21s = "\14\uffff";
    static final String dfa_22s = "\1\4\1\107\1\uffff\2\4\2\17\1\4\1\uffff\1\4\2\21";
    static final String dfa_23s = "\1\125\1\107\1\uffff\1\20\1\5\2\106\1\5\1\uffff\1\5\2\106";
    static final String dfa_24s = "\2\uffff\1\2\5\uffff\1\1\3\uffff";
    static final String dfa_25s = "\14\uffff}>";
    static final String[] dfa_26s = {
            "\5\2\7\uffff\4\2\15\uffff\4\2\7\uffff\3\2\4\uffff\2\2\1\uffff\1\2\7\uffff\1\2\1\uffff\2\2\3\uffff\1\1\16\uffff\2\2",
            "\1\3",
            "",
            "\1\5\1\6\12\uffff\1\4",
            "\1\5\1\6",
            "\1\11\1\uffff\1\7\53\uffff\1\10\10\uffff\1\2",
            "\1\11\1\uffff\1\7\53\uffff\1\10\10\uffff\1\2",
            "\1\12\1\13",
            "",
            "\1\5\1\6",
            "\1\7\53\uffff\1\10\10\uffff\1\2",
            "\1\7\53\uffff\1\10\10\uffff\1\2"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2229:3: (kw= 'private' kw= 'attribute' this_FeatureChainName_19= ruleFeatureChainName kw= '=' this_OwnedExpression_21= ruleOwnedExpression kw= ';' )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4058701E000781F0L,0x0000000000300003L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x4058701E000F81F0L,0x0000000000300003L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x40587000000781F0L,0x0000000000300003L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0D20000000020002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000018030L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000008030L,0x0000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x40D8701E000F81F0L,0x0000000000300003L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4058701E000F81F0L,0x0000000000300027L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000030L,0x00000000000FF548L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x00000000000FF548L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4058701E000F81F0L,0x0000000000300023L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000058030L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000180L});

}