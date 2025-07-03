package dut.control.sysmloc.parser.antlr.internal;

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
import dut.control.sysmloc.services.SysMLOCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSysMLOCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_EXP_VALUE", "RULE_OPERATOR", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "';'", "'doc'", "'attribute'", "'def'", "'part'", "'action'", "'='", "':='", "'default'", "'['", "'..'", "']'", "'ordered'", "'nonunique'", "':'", "'defined'", "'by'", "','", "':>'", "'specializes'", "'subsets'", "'::>'", "'references'", "'=>'", "'crosses'", "':>>'", "'redefines'", "'::'", "'.'", "'public'", "'private'", "'protected'"
    };
    public static final int RULE_SL_NOTE=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int RULE_DECIMAL_VALUE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=11;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_REGULAR_COMMENT=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=9;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_UNRESTRICTED_NAME=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=10;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_EXP_VALUE=8;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSysMLOCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSysMLOCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSysMLOCParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSysMLOC.g"; }



     	private SysMLOCGrammarAccess grammarAccess;

        public InternalSysMLOCParser(TokenStream input, SysMLOCGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Namespace";
       	}

       	@Override
       	protected SysMLOCGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNamespace"
    // InternalSysMLOC.g:65:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalSysMLOC.g:65:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalSysMLOC.g:66:2: iv_ruleNamespace= ruleNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:72:1: ruleNamespace returns [EObject current=null] : ( (lv_packages_0_0= rulePackage ) )* ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:78:2: ( ( (lv_packages_0_0= rulePackage ) )* )
            // InternalSysMLOC.g:79:2: ( (lv_packages_0_0= rulePackage ) )*
            {
            // InternalSysMLOC.g:79:2: ( (lv_packages_0_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSysMLOC.g:80:3: (lv_packages_0_0= rulePackage )
            	    {
            	    // InternalSysMLOC.g:80:3: (lv_packages_0_0= rulePackage )
            	    // InternalSysMLOC.g:81:4: lv_packages_0_0= rulePackage
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getNamespaceAccess().getPackagesPackageParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_packages_0_0=rulePackage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	      				}
            	      				add(
            	      					current,
            	      					"packages",
            	      					lv_packages_0_0,
            	      					"dut.control.sysmloc.SysMLOC.Package");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRulePackage"
    // InternalSysMLOC.g:101:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSysMLOC.g:101:48: (iv_rulePackage= rulePackage EOF )
            // InternalSysMLOC.g:102:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:108:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_declaredName_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:114:2: ( (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) )
            // InternalSysMLOC.g:115:2: (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' )
            {
            // InternalSysMLOC.g:115:2: (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' )
            // InternalSysMLOC.g:116:3: otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
              		
            }
            // InternalSysMLOC.g:120:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:121:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:121:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:122:5: lv_declaredName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_declaredName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_1_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSysMLOC.g:143:3: ( (lv_elements_3_0= ruleBaseElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||(LA2_0>=19 && LA2_0<=20)||(LA2_0>=22 && LA2_0<=23)||(LA2_0>=47 && LA2_0<=49)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:144:4: (lv_elements_3_0= ruleBaseElement )
            	    {
            	    // InternalSysMLOC.g:144:4: (lv_elements_3_0= ruleBaseElement )
            	    // InternalSysMLOC.g:145:5: lv_elements_3_0= ruleBaseElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackageAccess().getElementsBaseElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleBaseElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackageRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_3_0,
            	      						"dut.control.sysmloc.SysMLOC.BaseElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleBaseElement"
    // InternalSysMLOC.g:170:1: entryRuleBaseElement returns [EObject current=null] : iv_ruleBaseElement= ruleBaseElement EOF ;
    public final EObject entryRuleBaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseElement = null;


        try {
            // InternalSysMLOC.g:170:52: (iv_ruleBaseElement= ruleBaseElement EOF )
            // InternalSysMLOC.g:171:2: iv_ruleBaseElement= ruleBaseElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseElement=ruleBaseElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseElement"


    // $ANTLR start "ruleBaseElement"
    // InternalSysMLOC.g:177:1: ruleBaseElement returns [EObject current=null] : (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement ) ;
    public final EObject ruleBaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_AnnotatingElement_1 = null;

        EObject this_ImportElement_2 = null;

        EObject this_DefinitionElement_3 = null;

        EObject this_UsageElement_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:183:2: ( (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement ) )
            // InternalSysMLOC.g:184:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement )
            {
            // InternalSysMLOC.g:184:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 47:
            case 48:
            case 49:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)) ) {
                    alt3=5;
                }
                else if ( (LA3_4==21) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA3_5 = input.LA(2);

                if ( ((LA3_5>=RULE_ID && LA3_5<=RULE_UNRESTRICTED_NAME)||LA3_5==15||LA3_5==18||(LA3_5>=24 && LA3_5<=27)||(LA3_5>=30 && LA3_5<=33)||(LA3_5>=36 && LA3_5<=44)) ) {
                    alt3=5;
                }
                else if ( (LA3_5==21) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSysMLOC.g:185:3: this_Package_0= rulePackage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseElementAccess().getPackageParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Package_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:194:3: this_AnnotatingElement_1= ruleAnnotatingElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseElementAccess().getAnnotatingElementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AnnotatingElement_1=ruleAnnotatingElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnnotatingElement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:203:3: this_ImportElement_2= ruleImportElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseElementAccess().getImportElementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportElement_2=ruleImportElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ImportElement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:212:3: this_DefinitionElement_3= ruleDefinitionElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseElementAccess().getDefinitionElementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefinitionElement_3=ruleDefinitionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionElement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:221:3: this_UsageElement_4= ruleUsageElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UsageElement_4=ruleUsageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UsageElement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBaseElement"


    // $ANTLR start "entryRuleAnnotatingElement"
    // InternalSysMLOC.g:233:1: entryRuleAnnotatingElement returns [EObject current=null] : iv_ruleAnnotatingElement= ruleAnnotatingElement EOF ;
    public final EObject entryRuleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatingElement = null;


        try {
            // InternalSysMLOC.g:233:58: (iv_ruleAnnotatingElement= ruleAnnotatingElement EOF )
            // InternalSysMLOC.g:234:2: iv_ruleAnnotatingElement= ruleAnnotatingElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatingElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotatingElement=ruleAnnotatingElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatingElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:240:1: ruleAnnotatingElement returns [EObject current=null] : this_Comment_0= ruleComment ;
    public final EObject ruleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:246:2: (this_Comment_0= ruleComment )
            // InternalSysMLOC.g:247:2: this_Comment_0= ruleComment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Comment_0=ruleComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Comment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnnotatingElement"


    // $ANTLR start "entryRuleImportElement"
    // InternalSysMLOC.g:258:1: entryRuleImportElement returns [EObject current=null] : iv_ruleImportElement= ruleImportElement EOF ;
    public final EObject entryRuleImportElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportElement = null;


        try {
            // InternalSysMLOC.g:258:54: (iv_ruleImportElement= ruleImportElement EOF )
            // InternalSysMLOC.g:259:2: iv_ruleImportElement= ruleImportElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportElement=ruleImportElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:265:1: ruleImportElement returns [EObject current=null] : this_NamespaceImport_0= ruleNamespaceImport ;
    public final EObject ruleImportElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceImport_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:271:2: (this_NamespaceImport_0= ruleNamespaceImport )
            // InternalSysMLOC.g:272:2: this_NamespaceImport_0= ruleNamespaceImport
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getImportElementAccess().getNamespaceImportParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_NamespaceImport_0=ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_NamespaceImport_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImportElement"


    // $ANTLR start "entryRuleDefinitionElement"
    // InternalSysMLOC.g:283:1: entryRuleDefinitionElement returns [EObject current=null] : iv_ruleDefinitionElement= ruleDefinitionElement EOF ;
    public final EObject entryRuleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionElement = null;


        try {
            // InternalSysMLOC.g:283:58: (iv_ruleDefinitionElement= ruleDefinitionElement EOF )
            // InternalSysMLOC.g:284:2: iv_ruleDefinitionElement= ruleDefinitionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionElement=ruleDefinitionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionElement"


    // $ANTLR start "ruleDefinitionElement"
    // InternalSysMLOC.g:290:1: ruleDefinitionElement returns [EObject current=null] : (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition ) ;
    public final EObject ruleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeDefinition_0 = null;

        EObject this_PartDefinition_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:296:2: ( (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition ) )
            // InternalSysMLOC.g:297:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition )
            {
            // InternalSysMLOC.g:297:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSysMLOC.g:298:3: this_AttributeDefinition_0= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AttributeDefinition_0=ruleAttributeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeDefinition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:307:3: this_PartDefinition_1= rulePartDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartDefinition_1=rulePartDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartDefinition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefinitionElement"


    // $ANTLR start "entryRuleUsageElement"
    // InternalSysMLOC.g:319:1: entryRuleUsageElement returns [EObject current=null] : iv_ruleUsageElement= ruleUsageElement EOF ;
    public final EObject entryRuleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageElement = null;


        try {
            // InternalSysMLOC.g:319:53: (iv_ruleUsageElement= ruleUsageElement EOF )
            // InternalSysMLOC.g:320:2: iv_ruleUsageElement= ruleUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUsageElement=ruleUsageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUsageElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUsageElement"


    // $ANTLR start "ruleUsageElement"
    // InternalSysMLOC.g:326:1: ruleUsageElement returns [EObject current=null] : (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) ;
    public final EObject ruleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_NonOccurrenceUsageElement_0 = null;

        EObject this_OccurrenceUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:332:2: ( (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) )
            // InternalSysMLOC.g:333:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            {
            // InternalSysMLOC.g:333:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=22 && LA5_0<=23)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSysMLOC.g:334:3: this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUsageElementAccess().getNonOccurrenceUsageElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NonOccurrenceUsageElement_0=ruleNonOccurrenceUsageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NonOccurrenceUsageElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:343:3: this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUsageElementAccess().getOccurrenceUsageElementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OccurrenceUsageElement_1=ruleOccurrenceUsageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OccurrenceUsageElement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUsageElement"


    // $ANTLR start "entryRuleNonOccurrenceUsageElement"
    // InternalSysMLOC.g:355:1: entryRuleNonOccurrenceUsageElement returns [EObject current=null] : iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF ;
    public final EObject entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:355:66: (iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:356:2: iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonOccurrenceUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNonOccurrenceUsageElement=ruleNonOccurrenceUsageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonOccurrenceUsageElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNonOccurrenceUsageElement"


    // $ANTLR start "ruleNonOccurrenceUsageElement"
    // InternalSysMLOC.g:362:1: ruleNonOccurrenceUsageElement returns [EObject current=null] : this_AttributeUsage_0= ruleAttributeUsage ;
    public final EObject ruleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:368:2: (this_AttributeUsage_0= ruleAttributeUsage )
            // InternalSysMLOC.g:369:2: this_AttributeUsage_0= ruleAttributeUsage
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNonOccurrenceUsageElementAccess().getAttributeUsageParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_AttributeUsage_0=ruleAttributeUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_AttributeUsage_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNonOccurrenceUsageElement"


    // $ANTLR start "entryRuleOccurrenceUsageElement"
    // InternalSysMLOC.g:380:1: entryRuleOccurrenceUsageElement returns [EObject current=null] : iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF ;
    public final EObject entryRuleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:380:63: (iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:381:2: iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOccurrenceUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOccurrenceUsageElement=ruleOccurrenceUsageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOccurrenceUsageElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOccurrenceUsageElement"


    // $ANTLR start "ruleOccurrenceUsageElement"
    // InternalSysMLOC.g:387:1: ruleOccurrenceUsageElement returns [EObject current=null] : (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) ;
    public final EObject ruleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_StructureUsageElement_0 = null;

        EObject this_BehaviorUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:393:2: ( (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) )
            // InternalSysMLOC.g:394:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            {
            // InternalSysMLOC.g:394:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSysMLOC.g:395:3: this_StructureUsageElement_0= ruleStructureUsageElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOccurrenceUsageElementAccess().getStructureUsageElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructureUsageElement_0=ruleStructureUsageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StructureUsageElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:404:3: this_BehaviorUsageElement_1= ruleBehaviorUsageElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOccurrenceUsageElementAccess().getBehaviorUsageElementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BehaviorUsageElement_1=ruleBehaviorUsageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BehaviorUsageElement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOccurrenceUsageElement"


    // $ANTLR start "entryRuleStructureUsageElement"
    // InternalSysMLOC.g:416:1: entryRuleStructureUsageElement returns [EObject current=null] : iv_ruleStructureUsageElement= ruleStructureUsageElement EOF ;
    public final EObject entryRuleStructureUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureUsageElement = null;


        try {
            // InternalSysMLOC.g:416:62: (iv_ruleStructureUsageElement= ruleStructureUsageElement EOF )
            // InternalSysMLOC.g:417:2: iv_ruleStructureUsageElement= ruleStructureUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructureUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStructureUsageElement=ruleStructureUsageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructureUsageElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructureUsageElement"


    // $ANTLR start "ruleStructureUsageElement"
    // InternalSysMLOC.g:423:1: ruleStructureUsageElement returns [EObject current=null] : this_PartUsage_0= rulePartUsage ;
    public final EObject ruleStructureUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_PartUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:429:2: (this_PartUsage_0= rulePartUsage )
            // InternalSysMLOC.g:430:2: this_PartUsage_0= rulePartUsage
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getStructureUsageElementAccess().getPartUsageParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_PartUsage_0=rulePartUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_PartUsage_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStructureUsageElement"


    // $ANTLR start "entryRuleBehaviorUsageElement"
    // InternalSysMLOC.g:441:1: entryRuleBehaviorUsageElement returns [EObject current=null] : iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF ;
    public final EObject entryRuleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorUsageElement = null;


        try {
            // InternalSysMLOC.g:441:61: (iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF )
            // InternalSysMLOC.g:442:2: iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorUsageElement=ruleBehaviorUsageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviorUsageElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBehaviorUsageElement"


    // $ANTLR start "ruleBehaviorUsageElement"
    // InternalSysMLOC.g:448:1: ruleBehaviorUsageElement returns [EObject current=null] : this_ActionUsage_0= ruleActionUsage ;
    public final EObject ruleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:454:2: (this_ActionUsage_0= ruleActionUsage )
            // InternalSysMLOC.g:455:2: this_ActionUsage_0= ruleActionUsage
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBehaviorUsageElementAccess().getActionUsageParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ActionUsage_0=ruleActionUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ActionUsage_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBehaviorUsageElement"


    // $ANTLR start "entryRuleNamespaceImport"
    // InternalSysMLOC.g:466:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // InternalSysMLOC.g:466:56: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // InternalSysMLOC.g:467:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamespaceImport=ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamespaceImport"


    // $ANTLR start "ruleNamespaceImport"
    // InternalSysMLOC.g:473:1: ruleNamespaceImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleNamespaceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_2_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:479:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSysMLOC.g:480:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSysMLOC.g:480:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSysMLOC.g:481:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSysMLOC.g:481:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:482:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:482:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalSysMLOC.g:483:5: lv_visibility_0_0= ruleVisibilityIndicator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamespaceImportAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_visibility_0_0=ruleVisibilityIndicator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNamespaceImportRule());
              					}
              					set(
              						current,
              						"visibility",
              						lv_visibility_0_0,
              						"dut.control.sysmloc.SysMLOC.VisibilityIndicator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNamespaceImportAccess().getImportKeyword_1());
              		
            }
            // InternalSysMLOC.g:504:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:505:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:505:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:506:5: lv_declaredName_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamespaceImportAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_declaredName_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNamespaceImportRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_2_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNamespaceImport"


    // $ANTLR start "entryRuleComment"
    // InternalSysMLOC.g:531:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSysMLOC.g:531:48: (iv_ruleComment= ruleComment EOF )
            // InternalSysMLOC.g:532:2: iv_ruleComment= ruleComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:538:1: ruleComment returns [EObject current=null] : (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:544:2: ( (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:545:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:545:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:546:3: otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getDocKeyword_0());
              		
            }
            // InternalSysMLOC.g:550:3: ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:551:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:551:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:552:5: lv_body_1_0= RULE_REGULAR_COMMENT
            {
            lv_body_1_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_body_1_0, grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCommentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"body",
              						lv_body_1_0,
              						"dut.control.sysmloc.SysMLOC.REGULAR_COMMENT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalSysMLOC.g:572:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSysMLOC.g:572:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:573:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalSysMLOC.g:579:1: ruleAttributeDefinition returns [EObject current=null] : (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_declaredName_2_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:585:2: ( (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:586:2: (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:586:2: (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:587:3: otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1());
              		
            }
            // InternalSysMLOC.g:595:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:596:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:596:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:597:5: lv_declaredName_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_declaredName_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_2_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSysMLOC.g:614:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:615:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:620:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:620:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:621:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:625:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14||(LA7_0>=19 && LA7_0<=20)||(LA7_0>=22 && LA7_0<=23)||(LA7_0>=47 && LA7_0<=49)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSysMLOC.g:626:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:626:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:627:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRulePartDefinition"
    // InternalSysMLOC.g:654:1: entryRulePartDefinition returns [EObject current=null] : iv_rulePartDefinition= rulePartDefinition EOF ;
    public final EObject entryRulePartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDefinition = null;


        try {
            // InternalSysMLOC.g:654:55: (iv_rulePartDefinition= rulePartDefinition EOF )
            // InternalSysMLOC.g:655:2: iv_rulePartDefinition= rulePartDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartDefinition=rulePartDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartDefinition"


    // $ANTLR start "rulePartDefinition"
    // InternalSysMLOC.g:661:1: rulePartDefinition returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject rulePartDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_declaredName_2_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:667:2: ( (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:668:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:668:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:669:3: otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartDefinitionAccess().getPartKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartDefinitionAccess().getDefKeyword_1());
              		
            }
            // InternalSysMLOC.g:677:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:678:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:678:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:679:5: lv_declaredName_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPartDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_declaredName_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPartDefinitionRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_2_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3());
              		
            }
            // InternalSysMLOC.g:700:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSysMLOC.g:701:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:706:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:706:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:707:5: otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:711:5: ( (lv_elements_6_0= ruleBaseElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14||(LA9_0>=19 && LA9_0<=20)||(LA9_0>=22 && LA9_0<=23)||(LA9_0>=47 && LA9_0<=49)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSysMLOC.g:712:6: (lv_elements_6_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:712:6: (lv_elements_6_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:713:7: lv_elements_6_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPartDefinitionAccess().getElementsBaseElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_6_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPartDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_4_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePartDefinition"


    // $ANTLR start "entryRuleAttributeUsage"
    // InternalSysMLOC.g:740:1: entryRuleAttributeUsage returns [EObject current=null] : iv_ruleAttributeUsage= ruleAttributeUsage EOF ;
    public final EObject entryRuleAttributeUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeUsage = null;


        try {
            // InternalSysMLOC.g:740:55: (iv_ruleAttributeUsage= ruleAttributeUsage EOF )
            // InternalSysMLOC.g:741:2: iv_ruleAttributeUsage= ruleAttributeUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeUsage=ruleAttributeUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeUsage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeUsage"


    // $ANTLR start "ruleAttributeUsage"
    // InternalSysMLOC.g:747:1: ruleAttributeUsage returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) ;
    public final EObject ruleAttributeUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_declaredName_1_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:753:2: ( (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:754:2: (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:754:2: (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:755:3: otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0());
              		
            }
            // InternalSysMLOC.g:759:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:760:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:760:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:761:5: lv_declaredName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_declaredName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeUsageRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_1_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSysMLOC.g:778:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSysMLOC.g:779:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:784:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:784:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:785:5: otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalSysMLOC.g:789:5: ( (lv_elements_4_0= ruleBaseElement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14||(LA11_0>=19 && LA11_0<=20)||(LA11_0>=22 && LA11_0<=23)||(LA11_0>=47 && LA11_0<=49)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSysMLOC.g:790:6: (lv_elements_4_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:790:6: (lv_elements_4_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:791:7: lv_elements_4_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAttributeUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_4_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAttributeUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeUsage"


    // $ANTLR start "entryRuleActionUsage"
    // InternalSysMLOC.g:818:1: entryRuleActionUsage returns [EObject current=null] : iv_ruleActionUsage= ruleActionUsage EOF ;
    public final EObject entryRuleActionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionUsage = null;


        try {
            // InternalSysMLOC.g:818:52: (iv_ruleActionUsage= ruleActionUsage EOF )
            // InternalSysMLOC.g:819:2: iv_ruleActionUsage= ruleActionUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActionUsage=ruleActionUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionUsage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActionUsage"


    // $ANTLR start "ruleActionUsage"
    // InternalSysMLOC.g:825:1: ruleActionUsage returns [EObject current=null] : (otherlv_0= 'action' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) ;
    public final EObject ruleActionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_declaredName_1_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:831:2: ( (otherlv_0= 'action' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:832:2: (otherlv_0= 'action' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:832:2: (otherlv_0= 'action' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:833:3: otherlv_0= 'action' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActionUsageAccess().getActionKeyword_0());
              		
            }
            // InternalSysMLOC.g:837:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:838:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:838:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:839:5: lv_declaredName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActionUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_declaredName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActionUsageRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_1_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSysMLOC.g:856:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==15) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSysMLOC.g:857:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getActionUsageAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:862:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:862:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:863:5: otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getActionUsageAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalSysMLOC.g:867:5: ( (lv_elements_4_0= ruleBaseElement ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14||(LA13_0>=19 && LA13_0<=20)||(LA13_0>=22 && LA13_0<=23)||(LA13_0>=47 && LA13_0<=49)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSysMLOC.g:868:6: (lv_elements_4_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:868:6: (lv_elements_4_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:869:7: lv_elements_4_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActionUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_4_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActionUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getActionUsageAccess().getRightCurlyBracketKeyword_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActionUsage"


    // $ANTLR start "entryRulePartUsage"
    // InternalSysMLOC.g:896:1: entryRulePartUsage returns [EObject current=null] : iv_rulePartUsage= rulePartUsage EOF ;
    public final EObject entryRulePartUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartUsage = null;


        try {
            // InternalSysMLOC.g:896:50: (iv_rulePartUsage= rulePartUsage EOF )
            // InternalSysMLOC.g:897:2: iv_rulePartUsage= rulePartUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartUsage=rulePartUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartUsage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartUsage"


    // $ANTLR start "rulePartUsage"
    // InternalSysMLOC.g:903:1: rulePartUsage returns [EObject current=null] : (otherlv_0= 'part' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) ;
    public final EObject rulePartUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Usage_1 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:909:2: ( (otherlv_0= 'part' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:910:2: (otherlv_0= 'part' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:910:2: (otherlv_0= 'part' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:911:3: otherlv_0= 'part' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartUsageAccess().getPartKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPartUsageAccess().getUsageParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_11);
            this_Usage_1=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:926:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSysMLOC.g:927:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPartUsageAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:932:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:932:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:933:5: otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getPartUsageAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalSysMLOC.g:937:5: ( (lv_elements_4_0= ruleBaseElement ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14||(LA15_0>=19 && LA15_0<=20)||(LA15_0>=22 && LA15_0<=23)||(LA15_0>=47 && LA15_0<=49)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSysMLOC.g:938:6: (lv_elements_4_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:938:6: (lv_elements_4_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:939:7: lv_elements_4_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPartUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_4_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPartUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPartUsageAccess().getRightCurlyBracketKeyword_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePartUsage"


    // $ANTLR start "ruleUsage"
    // InternalSysMLOC.g:967:1: ruleUsage[EObject in_current] returns [EObject current=in_current] : ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? ) ;
    public final EObject ruleUsage(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureValue_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:973:2: ( ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? ) )
            // InternalSysMLOC.g:974:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            {
            // InternalSysMLOC.g:974:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            // InternalSysMLOC.g:975:3: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )?
            {
            // InternalSysMLOC.g:975:3: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_UNRESTRICTED_NAME)||LA17_0==27||(LA17_0>=30 && LA17_0<=33)||(LA17_0>=36 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSysMLOC.g:976:4: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getUsageAccess().getFeatureDeclarationParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    this_FeatureDeclaration_0=ruleFeatureDeclaration(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FeatureDeclaration_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:988:3: (this_FeatureValue_1= ruleFeatureValue[$current] )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=24 && LA18_0<=26)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSysMLOC.g:989:4: this_FeatureValue_1= ruleFeatureValue[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getUsageAccess().getFeatureValueParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureValue_1=ruleFeatureValue(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FeatureValue_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUsage"


    // $ANTLR start "ruleFeatureValue"
    // InternalSysMLOC.g:1006:1: ruleFeatureValue[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_ownedExpression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleFeatureValue(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isInitial_1_0=null;
        Token lv_isDefault_2_0=null;
        Token otherlv_3=null;
        Token lv_isInitial_4_0=null;
        AntlrDatatypeRuleToken lv_ownedExpression_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1012:2: ( ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_ownedExpression_5_0= ruleExpression ) ) ) )
            // InternalSysMLOC.g:1013:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_ownedExpression_5_0= ruleExpression ) ) )
            {
            // InternalSysMLOC.g:1013:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_ownedExpression_5_0= ruleExpression ) ) )
            // InternalSysMLOC.g:1014:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_ownedExpression_5_0= ruleExpression ) )
            {
            // InternalSysMLOC.g:1014:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 25:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSysMLOC.g:1015:4: otherlv_0= '='
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1020:4: ( (lv_isInitial_1_0= ':=' ) )
                    {
                    // InternalSysMLOC.g:1020:4: ( (lv_isInitial_1_0= ':=' ) )
                    // InternalSysMLOC.g:1021:5: (lv_isInitial_1_0= ':=' )
                    {
                    // InternalSysMLOC.g:1021:5: (lv_isInitial_1_0= ':=' )
                    // InternalSysMLOC.g:1022:6: lv_isInitial_1_0= ':='
                    {
                    lv_isInitial_1_0=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isInitial_1_0, grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeatureValueRule());
                      						}
                      						setWithLastConsumed(current, "isInitial", lv_isInitial_1_0 != null, ":=");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:1035:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    {
                    // InternalSysMLOC.g:1035:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    // InternalSysMLOC.g:1036:5: ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    {
                    // InternalSysMLOC.g:1036:5: ( (lv_isDefault_2_0= 'default' ) )
                    // InternalSysMLOC.g:1037:6: (lv_isDefault_2_0= 'default' )
                    {
                    // InternalSysMLOC.g:1037:6: (lv_isDefault_2_0= 'default' )
                    // InternalSysMLOC.g:1038:7: lv_isDefault_2_0= 'default'
                    {
                    lv_isDefault_2_0=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isDefault_2_0, grammarAccess.getFeatureValueAccess().getIsDefaultDefaultKeyword_0_2_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFeatureValueRule());
                      							}
                      							setWithLastConsumed(current, "isDefault", lv_isDefault_2_0 != null, "default");
                      						
                    }

                    }


                    }

                    // InternalSysMLOC.g:1050:5: (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    int alt19=3;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==24) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==25) ) {
                        alt19=2;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSysMLOC.g:1051:6: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:1056:6: ( (lv_isInitial_4_0= ':=' ) )
                            {
                            // InternalSysMLOC.g:1056:6: ( (lv_isInitial_4_0= ':=' ) )
                            // InternalSysMLOC.g:1057:7: (lv_isInitial_4_0= ':=' )
                            {
                            // InternalSysMLOC.g:1057:7: (lv_isInitial_4_0= ':=' )
                            // InternalSysMLOC.g:1058:8: lv_isInitial_4_0= ':='
                            {
                            lv_isInitial_4_0=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isInitial_4_0, grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_2_1_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getFeatureValueRule());
                              								}
                              								setWithLastConsumed(current, "isInitial", lv_isInitial_4_0 != null, ":=");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:1073:3: ( (lv_ownedExpression_5_0= ruleExpression ) )
            // InternalSysMLOC.g:1074:4: (lv_ownedExpression_5_0= ruleExpression )
            {
            // InternalSysMLOC.g:1074:4: (lv_ownedExpression_5_0= ruleExpression )
            // InternalSysMLOC.g:1075:5: lv_ownedExpression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureValueAccess().getOwnedExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedExpression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureValueRule());
              					}
              					add(
              						current,
              						"ownedExpression",
              						lv_ownedExpression_5_0,
              						"dut.control.sysmloc.SysMLOC.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureValue"


    // $ANTLR start "ruleFeatureDeclaration"
    // InternalSysMLOC.g:1097:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_declaredName_0_0 = null;

        EObject this_FeatureSpecializationPart_1 = null;

        EObject this_FeatureSpecializationPart_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1103:2: ( ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) )
            // InternalSysMLOC.g:1104:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            {
            // InternalSysMLOC.g:1104:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt22=1;
            }
            else if ( (LA22_0==27||(LA22_0>=30 && LA22_0<=33)||(LA22_0>=36 && LA22_0<=44)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSysMLOC.g:1105:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    {
                    // InternalSysMLOC.g:1105:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    // InternalSysMLOC.g:1106:4: ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    {
                    // InternalSysMLOC.g:1106:4: ( (lv_declaredName_0_0= ruleName ) )
                    // InternalSysMLOC.g:1107:5: (lv_declaredName_0_0= ruleName )
                    {
                    // InternalSysMLOC.g:1107:5: (lv_declaredName_0_0= ruleName )
                    // InternalSysMLOC.g:1108:6: lv_declaredName_0_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_declaredName_0_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"declaredName",
                      							lv_declaredName_0_0,
                      							"dut.control.sysmloc.SysMLOC.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:1125:4: (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==27||(LA21_0>=30 && LA21_0<=33)||(LA21_0>=36 && LA21_0<=44)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSysMLOC.g:1126:5: this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                              					}
                              					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getFeatureSpecializationPartParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_FeatureSpecializationPart_1=ruleFeatureSpecializationPart(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_FeatureSpecializationPart_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1140:3: this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                      			}
                      			newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getFeatureSpecializationPartParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureSpecializationPart_2=ruleFeatureSpecializationPart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FeatureSpecializationPart_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureDeclaration"


    // $ANTLR start "ruleFeatureSpecializationPart"
    // InternalSysMLOC.g:1156:1: ruleFeatureSpecializationPart[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) ;
    public final EObject ruleFeatureSpecializationPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureSpecialization_0 = null;

        EObject this_MultiplicityPart_1 = null;

        EObject this_FeatureSpecialization_2 = null;

        EObject this_MultiplicityPart_3 = null;

        EObject this_FeatureSpecialization_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1162:2: ( ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) )
            // InternalSysMLOC.g:1163:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            {
            // InternalSysMLOC.g:1163:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=32 && LA27_0<=33)||(LA27_0>=36 && LA27_0<=44)) ) {
                alt27=1;
            }
            else if ( (LA27_0==27||(LA27_0>=30 && LA27_0<=31)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSysMLOC.g:1164:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:1164:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:1165:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    {
                    // InternalSysMLOC.g:1165:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        alt23 = dfa23.predict(input);
                        switch (alt23) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1166:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    this_FeatureSpecialization_0=ruleFeatureSpecialization(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_FeatureSpecialization_0;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    // InternalSysMLOC.g:1179:4: (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==27||(LA24_0>=30 && LA24_0<=31)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSysMLOC.g:1180:5: this_MultiplicityPart_1= ruleMultiplicityPart[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                              					}
                              					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_17);
                            this_MultiplicityPart_1=ruleMultiplicityPart(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_MultiplicityPart_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1192:4: (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=32 && LA25_0<=33)||(LA25_0>=36 && LA25_0<=44)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1193:5: this_FeatureSpecialization_2= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    this_FeatureSpecialization_2=ruleFeatureSpecialization(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_FeatureSpecialization_2;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1207:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:1207:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:1208:4: this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_MultiplicityPart_3=ruleMultiplicityPart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityPart_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:1219:4: (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=32 && LA26_0<=33)||(LA26_0>=36 && LA26_0<=44)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1220:5: this_FeatureSpecialization_4= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    this_FeatureSpecialization_4=ruleFeatureSpecialization(current);

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current = this_FeatureSpecialization_4;
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureSpecializationPart"


    // $ANTLR start "ruleMultiplicityPart"
    // InternalSysMLOC.g:1238:1: ruleMultiplicityPart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) ) ;
    public final EObject ruleMultiplicityPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_Multiplicity_1_0=null;
        Token otherlv_2=null;
        Token lv_Multiplicity_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_Multiplicity_6_0=null;
        Token otherlv_7=null;
        Token lv_Multiplicity_8_0=null;
        Token otherlv_9=null;
        Token lv_isOrdered_10_0=null;
        Token lv_isNonunique_11_0=null;
        Token lv_isNonunique_12_0=null;
        Token lv_isOrdered_13_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:1244:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) ) )
            // InternalSysMLOC.g:1245:2: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) )
            {
            // InternalSysMLOC.g:1245:2: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_DECIMAL_VALUE) ) {
                    int LA34_3 = input.LA(3);

                    if ( (LA34_3==28) ) {
                        int LA34_4 = input.LA(4);

                        if ( (LA34_4==RULE_DECIMAL_VALUE) ) {
                            int LA34_6 = input.LA(5);

                            if ( (LA34_6==29) ) {
                                int LA34_5 = input.LA(6);

                                if ( (LA34_5==15||LA34_5==18||(LA34_5>=24 && LA34_5<=26)||(LA34_5>=32 && LA34_5<=33)||(LA34_5>=36 && LA34_5<=44)) ) {
                                    alt34=1;
                                }
                                else if ( ((LA34_5>=30 && LA34_5<=31)) ) {
                                    alt34=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 34, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA34_3==29) ) {
                        int LA34_5 = input.LA(4);

                        if ( (LA34_5==15||LA34_5==18||(LA34_5>=24 && LA34_5<=26)||(LA34_5>=32 && LA34_5<=33)||(LA34_5>=36 && LA34_5<=44)) ) {
                            alt34=1;
                        }
                        else if ( ((LA34_5>=30 && LA34_5<=31)) ) {
                            alt34=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA34_0>=30 && LA34_0<=31)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSysMLOC.g:1246:3: (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' )
                    {
                    // InternalSysMLOC.g:1246:3: (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' )
                    // InternalSysMLOC.g:1247:4: otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:1251:4: ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) )
                    // InternalSysMLOC.g:1252:5: (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE )
                    {
                    // InternalSysMLOC.g:1252:5: (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE )
                    // InternalSysMLOC.g:1253:6: lv_Multiplicity_1_0= RULE_DECIMAL_VALUE
                    {
                    lv_Multiplicity_1_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_Multiplicity_1_0, grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultiplicityPartRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"Multiplicity",
                      							lv_Multiplicity_1_0,
                      							"dut.control.sysmloc.SysMLOC.DECIMAL_VALUE");
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:1269:4: (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==28) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSysMLOC.g:1270:5: otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) )
                            {
                            otherlv_2=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_0_2_0());
                              				
                            }
                            // InternalSysMLOC.g:1274:5: ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) )
                            // InternalSysMLOC.g:1275:6: (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE )
                            {
                            // InternalSysMLOC.g:1275:6: (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE )
                            // InternalSysMLOC.g:1276:7: lv_Multiplicity_3_0= RULE_DECIMAL_VALUE
                            {
                            lv_Multiplicity_3_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_Multiplicity_3_0, grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_0_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              							}
                              							addWithLastConsumed(
                              								current,
                              								"Multiplicity",
                              								lv_Multiplicity_3_0,
                              								"dut.control.sysmloc.SysMLOC.DECIMAL_VALUE");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1299:3: ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) )
                    {
                    // InternalSysMLOC.g:1299:3: ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) )
                    // InternalSysMLOC.g:1300:4: (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) )
                    {
                    // InternalSysMLOC.g:1300:4: (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==27) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSysMLOC.g:1301:5: otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_0());
                              				
                            }
                            // InternalSysMLOC.g:1305:5: ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) )
                            // InternalSysMLOC.g:1306:6: (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE )
                            {
                            // InternalSysMLOC.g:1306:6: (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE )
                            // InternalSysMLOC.g:1307:7: lv_Multiplicity_6_0= RULE_DECIMAL_VALUE
                            {
                            lv_Multiplicity_6_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_19); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_Multiplicity_6_0, grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              							}
                              							addWithLastConsumed(
                              								current,
                              								"Multiplicity",
                              								lv_Multiplicity_6_0,
                              								"dut.control.sysmloc.SysMLOC.DECIMAL_VALUE");
                              						
                            }

                            }


                            }

                            // InternalSysMLOC.g:1323:5: (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==28) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // InternalSysMLOC.g:1324:6: otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) )
                                    {
                                    otherlv_7=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_7, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_1_0_2_0());
                                      					
                                    }
                                    // InternalSysMLOC.g:1328:6: ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) )
                                    // InternalSysMLOC.g:1329:7: (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE )
                                    {
                                    // InternalSysMLOC.g:1329:7: (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE )
                                    // InternalSysMLOC.g:1330:8: lv_Multiplicity_8_0= RULE_DECIMAL_VALUE
                                    {
                                    lv_Multiplicity_8_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_20); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_Multiplicity_8_0, grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_1_0_2_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                                      								}
                                      								addWithLastConsumed(
                                      									current,
                                      									"Multiplicity",
                                      									lv_Multiplicity_8_0,
                                      									"dut.control.sysmloc.SysMLOC.DECIMAL_VALUE");
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_9=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1352:4: ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==30) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==31) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalSysMLOC.g:1353:5: ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? )
                            {
                            // InternalSysMLOC.g:1353:5: ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? )
                            // InternalSysMLOC.g:1354:6: ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )?
                            {
                            // InternalSysMLOC.g:1354:6: ( (lv_isOrdered_10_0= 'ordered' ) )
                            // InternalSysMLOC.g:1355:7: (lv_isOrdered_10_0= 'ordered' )
                            {
                            // InternalSysMLOC.g:1355:7: (lv_isOrdered_10_0= 'ordered' )
                            // InternalSysMLOC.g:1356:8: lv_isOrdered_10_0= 'ordered'
                            {
                            lv_isOrdered_10_0=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isOrdered_10_0, grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              								}
                              								setWithLastConsumed(current, "isOrdered", lv_isOrdered_10_0 != null, "ordered");
                              							
                            }

                            }


                            }

                            // InternalSysMLOC.g:1368:6: ( (lv_isNonunique_11_0= 'nonunique' ) )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==31) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // InternalSysMLOC.g:1369:7: (lv_isNonunique_11_0= 'nonunique' )
                                    {
                                    // InternalSysMLOC.g:1369:7: (lv_isNonunique_11_0= 'nonunique' )
                                    // InternalSysMLOC.g:1370:8: lv_isNonunique_11_0= 'nonunique'
                                    {
                                    lv_isNonunique_11_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_isNonunique_11_0, grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_0_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                                      								}
                                      								setWithLastConsumed(current, "isNonunique", lv_isNonunique_11_0 != null, "nonunique");
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:1384:5: ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? )
                            {
                            // InternalSysMLOC.g:1384:5: ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? )
                            // InternalSysMLOC.g:1385:6: ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )?
                            {
                            // InternalSysMLOC.g:1385:6: ( (lv_isNonunique_12_0= 'nonunique' ) )
                            // InternalSysMLOC.g:1386:7: (lv_isNonunique_12_0= 'nonunique' )
                            {
                            // InternalSysMLOC.g:1386:7: (lv_isNonunique_12_0= 'nonunique' )
                            // InternalSysMLOC.g:1387:8: lv_isNonunique_12_0= 'nonunique'
                            {
                            lv_isNonunique_12_0=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isNonunique_12_0, grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              								}
                              								setWithLastConsumed(current, "isNonunique", lv_isNonunique_12_0 != null, "nonunique");
                              							
                            }

                            }


                            }

                            // InternalSysMLOC.g:1399:6: ( (lv_isOrdered_13_0= 'ordered' ) )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==30) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalSysMLOC.g:1400:7: (lv_isOrdered_13_0= 'ordered' )
                                    {
                                    // InternalSysMLOC.g:1400:7: (lv_isOrdered_13_0= 'ordered' )
                                    // InternalSysMLOC.g:1401:8: lv_isOrdered_13_0= 'ordered'
                                    {
                                    lv_isOrdered_13_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_isOrdered_13_0, grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_1_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                                      								}
                                      								setWithLastConsumed(current, "isOrdered", lv_isOrdered_13_0 != null, "ordered");
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicityPart"


    // $ANTLR start "ruleFeatureSpecialization"
    // InternalSysMLOC.g:1421:1: ruleFeatureSpecialization[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) ;
    public final EObject ruleFeatureSpecialization(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_typings_3_0 = null;

        AntlrDatatypeRuleToken lv_typings_5_0 = null;

        AntlrDatatypeRuleToken lv_subsetting_9_0 = null;

        AntlrDatatypeRuleToken lv_subsetting_11_0 = null;

        AntlrDatatypeRuleToken lv_references_14_0 = null;

        AntlrDatatypeRuleToken lv_references_16_0 = null;

        AntlrDatatypeRuleToken lv_crosses_19_0 = null;

        AntlrDatatypeRuleToken lv_crosses_21_0 = null;

        AntlrDatatypeRuleToken lv_redefinitions_24_0 = null;

        AntlrDatatypeRuleToken lv_redefinitions_26_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1427:2: ( ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) )
            // InternalSysMLOC.g:1428:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            {
            // InternalSysMLOC.g:1428:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
                {
                alt45=1;
                }
                break;
            case 36:
            case 37:
            case 38:
                {
                alt45=2;
                }
                break;
            case 39:
            case 40:
                {
                alt45=3;
                }
                break;
            case 41:
            case 42:
                {
                alt45=4;
                }
                break;
            case 43:
            case 44:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSysMLOC.g:1429:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:1429:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:1430:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:1430:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==32) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==33) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalSysMLOC.g:1431:5: otherlv_0= ':'
                            {
                            otherlv_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getFeatureSpecializationAccess().getColonKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:1436:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            {
                            // InternalSysMLOC.g:1436:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            // InternalSysMLOC.g:1437:6: otherlv_1= 'defined' otherlv_2= 'by'
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getFeatureSpecializationAccess().getDefinedKeyword_0_0_1_0());
                              					
                            }
                            otherlv_2=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getFeatureSpecializationAccess().getByKeyword_0_0_1_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSysMLOC.g:1447:4: ( (lv_typings_3_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:1448:5: (lv_typings_3_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1448:5: (lv_typings_3_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:1449:6: lv_typings_3_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_typings_3_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                      						}
                      						add(
                      							current,
                      							"typings",
                      							lv_typings_3_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:1466:4: (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==35) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1467:5: otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_0_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:1471:5: ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:1472:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:1472:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:1473:7: lv_typings_5_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_typings_5_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typings",
                    	      								lv_typings_5_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1493:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:1493:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:1494:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:1494:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt37=1;
                        }
                        break;
                    case 37:
                        {
                        alt37=2;
                        }
                        break;
                    case 38:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // InternalSysMLOC.g:1495:5: otherlv_6= ':>'
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:1500:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getFeatureSpecializationAccess().getSpecializesKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSysMLOC.g:1505:5: otherlv_8= 'subsets'
                            {
                            otherlv_8=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getFeatureSpecializationAccess().getSubsetsKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1510:4: ( (lv_subsetting_9_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:1511:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1511:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:1512:6: lv_subsetting_9_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_subsetting_9_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                      						}
                      						add(
                      							current,
                      							"subsetting",
                      							lv_subsetting_9_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:1529:4: (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==35) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1530:5: otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:1534:5: ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:1535:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:1535:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:1536:7: lv_subsetting_11_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_subsetting_11_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subsetting",
                    	      								lv_subsetting_11_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:1556:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:1556:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:1557:4: (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:1557:4: (otherlv_12= '::>' | otherlv_13= 'references' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==39) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==40) ) {
                        alt39=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSysMLOC.g:1558:5: otherlv_12= '::>'
                            {
                            otherlv_12=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getFeatureSpecializationAccess().getColonColonGreaterThanSignKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:1563:5: otherlv_13= 'references'
                            {
                            otherlv_13=(Token)match(input,40,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getFeatureSpecializationAccess().getReferencesKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1568:4: ( (lv_references_14_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:1569:5: (lv_references_14_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1569:5: (lv_references_14_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:1570:6: lv_references_14_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_references_14_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                      						}
                      						add(
                      							current,
                      							"references",
                      							lv_references_14_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:1587:4: (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==35) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1588:5: otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_15=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_15, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:1592:5: ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:1593:6: (lv_references_16_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:1593:6: (lv_references_16_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:1594:7: lv_references_16_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_references_16_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"references",
                    	      								lv_references_16_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:1614:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:1614:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:1615:4: (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:1615:4: (otherlv_17= '=>' | otherlv_18= 'crosses' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==41) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==42) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSysMLOC.g:1616:5: otherlv_17= '=>'
                            {
                            otherlv_17=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getFeatureSpecializationAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:1621:5: otherlv_18= 'crosses'
                            {
                            otherlv_18=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getFeatureSpecializationAccess().getCrossesKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1626:4: ( (lv_crosses_19_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:1627:5: (lv_crosses_19_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1627:5: (lv_crosses_19_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:1628:6: lv_crosses_19_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_crosses_19_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                      						}
                      						add(
                      							current,
                      							"crosses",
                      							lv_crosses_19_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:1645:4: (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==35) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1646:5: otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_20=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_20, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:1650:5: ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:1651:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:1651:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:1652:7: lv_crosses_21_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_crosses_21_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"crosses",
                    	      								lv_crosses_21_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:1672:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:1672:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:1673:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:1673:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==43) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==44) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalSysMLOC.g:1674:5: otherlv_22= ':>>'
                            {
                            otherlv_22=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_22, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:1679:5: otherlv_23= 'redefines'
                            {
                            otherlv_23=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_23, grammarAccess.getFeatureSpecializationAccess().getRedefinesKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1684:4: ( (lv_redefinitions_24_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:1685:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1685:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:1686:6: lv_redefinitions_24_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_redefinitions_24_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                      						}
                      						add(
                      							current,
                      							"redefinitions",
                      							lv_redefinitions_24_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:1703:4: (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==35) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1704:5: otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_25=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_25, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:1708:5: ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:1709:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:1709:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:1710:7: lv_redefinitions_26_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_redefinitions_26_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFeatureSpecializationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"redefinitions",
                    	      								lv_redefinitions_26_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureSpecialization"


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:1733:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysMLOC.g:1733:44: (iv_ruleName= ruleName EOF )
            // InternalSysMLOC.g:1734:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:1740:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:1746:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalSysMLOC.g:1747:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalSysMLOC.g:1747:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_UNRESTRICTED_NAME) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSysMLOC.g:1748:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1756:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
                    {
                    this_UNRESTRICTED_NAME_1=(Token)match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UNRESTRICTED_NAME_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSysMLOC.g:1767:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysMLOC.g:1767:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysMLOC.g:1768:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:1774:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1780:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) )
            // InternalSysMLOC.g:1781:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            {
            // InternalSysMLOC.g:1781:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            // InternalSysMLOC.g:1782:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1792:3: (kw= '::' this_Name_2= ruleName )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==45) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSysMLOC.g:1793:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_26);
            	    this_Name_2=ruleName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Name_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFeatureChainName"
    // InternalSysMLOC.g:1813:1: entryRuleFeatureChainName returns [String current=null] : iv_ruleFeatureChainName= ruleFeatureChainName EOF ;
    public final String entryRuleFeatureChainName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureChainName = null;


        try {
            // InternalSysMLOC.g:1813:56: (iv_ruleFeatureChainName= ruleFeatureChainName EOF )
            // InternalSysMLOC.g:1814:2: iv_ruleFeatureChainName= ruleFeatureChainName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureChainNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureChainName=ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureChainName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:1820:1: ruleFeatureChainName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFeatureChainName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1826:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalSysMLOC.g:1827:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalSysMLOC.g:1827:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalSysMLOC.g:1828:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1838:3: (kw= '.' this_Name_2= ruleName )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==46) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSysMLOC.g:1839:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_27);
            	    this_Name_2=ruleName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Name_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureChainName"


    // $ANTLR start "entryRuleExpressionName"
    // InternalSysMLOC.g:1859:1: entryRuleExpressionName returns [String current=null] : iv_ruleExpressionName= ruleExpressionName EOF ;
    public final String entryRuleExpressionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionName = null;


        try {
            // InternalSysMLOC.g:1859:54: (iv_ruleExpressionName= ruleExpressionName EOF )
            // InternalSysMLOC.g:1860:2: iv_ruleExpressionName= ruleExpressionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionName=ruleExpressionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionName"


    // $ANTLR start "ruleExpressionName"
    // InternalSysMLOC.g:1866:1: ruleExpressionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureChainName_0= ruleFeatureChainName | this_EXP_VALUE_1= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleExpressionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXP_VALUE_1=null;
        AntlrDatatypeRuleToken this_FeatureChainName_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1872:2: ( (this_FeatureChainName_0= ruleFeatureChainName | this_EXP_VALUE_1= RULE_EXP_VALUE ) )
            // InternalSysMLOC.g:1873:2: (this_FeatureChainName_0= ruleFeatureChainName | this_EXP_VALUE_1= RULE_EXP_VALUE )
            {
            // InternalSysMLOC.g:1873:2: (this_FeatureChainName_0= ruleFeatureChainName | this_EXP_VALUE_1= RULE_EXP_VALUE )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_EXP_VALUE) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalSysMLOC.g:1874:3: this_FeatureChainName_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionNameAccess().getFeatureChainNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureChainName_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FeatureChainName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1885:3: this_EXP_VALUE_1= RULE_EXP_VALUE
                    {
                    this_EXP_VALUE_1=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXP_VALUE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXP_VALUE_1, grammarAccess.getExpressionNameAccess().getEXP_VALUETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionName"


    // $ANTLR start "entryRuleExpression"
    // InternalSysMLOC.g:1896:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalSysMLOC.g:1896:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalSysMLOC.g:1897:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSysMLOC.g:1903:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR this_Expression_3= ruleExpression )* (this_OPERATOR_4= RULE_OPERATOR )* ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OPERATOR_0=null;
        Token this_OPERATOR_2=null;
        Token this_OPERATOR_4=null;
        AntlrDatatypeRuleToken this_ExpressionName_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1909:2: ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR this_Expression_3= ruleExpression )* (this_OPERATOR_4= RULE_OPERATOR )* ) )
            // InternalSysMLOC.g:1910:2: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR this_Expression_3= ruleExpression )* (this_OPERATOR_4= RULE_OPERATOR )* )
            {
            // InternalSysMLOC.g:1910:2: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR this_Expression_3= ruleExpression )* (this_OPERATOR_4= RULE_OPERATOR )* )
            // InternalSysMLOC.g:1911:3: (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR this_Expression_3= ruleExpression )* (this_OPERATOR_4= RULE_OPERATOR )*
            {
            // InternalSysMLOC.g:1911:3: (this_OPERATOR_0= RULE_OPERATOR )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_OPERATOR) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSysMLOC.g:1912:4: this_OPERATOR_0= RULE_OPERATOR
            	    {
            	    this_OPERATOR_0=(Token)match(input,RULE_OPERATOR,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_OPERATOR_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_OPERATOR_0, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_28);
            this_ExpressionName_1=ruleExpressionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExpressionName_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1930:3: (this_OPERATOR_2= RULE_OPERATOR this_Expression_3= ruleExpression )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_OPERATOR) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSysMLOC.g:1931:4: this_OPERATOR_2= RULE_OPERATOR this_Expression_3= ruleExpression
            	    {
            	    this_OPERATOR_2=(Token)match(input,RULE_OPERATOR,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_OPERATOR_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_OPERATOR_2, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_28);
            	    this_Expression_3=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Expression_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalSysMLOC.g:1949:3: (this_OPERATOR_4= RULE_OPERATOR )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_OPERATOR) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSysMLOC.g:1950:4: this_OPERATOR_4= RULE_OPERATOR
            	    {
            	    this_OPERATOR_4=(Token)match(input,RULE_OPERATOR,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_OPERATOR_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_OPERATOR_4, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalSysMLOC.g:1962:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:1968:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalSysMLOC.g:1969:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalSysMLOC.g:1969:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt53=1;
                }
                break;
            case 48:
                {
                alt53=2;
                }
                break;
            case 49:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalSysMLOC.g:1970:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSysMLOC.g:1970:3: (enumLiteral_0= 'public' )
                    // InternalSysMLOC.g:1971:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1978:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSysMLOC.g:1978:3: (enumLiteral_1= 'private' )
                    // InternalSysMLOC.g:1979:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:1986:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalSysMLOC.g:1986:3: (enumLiteral_2= 'protected' )
                    // InternalSysMLOC.g:1987:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVisibilityIndicator"

    // $ANTLR start synpred1_InternalSysMLOC
    public final void synpred1_InternalSysMLOC_fragment() throws RecognitionException {   
        // InternalSysMLOC.g:1166:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )
        // InternalSysMLOC.g:
        {
        if ( (input.LA(1)>=32 && input.LA(1)<=33)||(input.LA(1)>=36 && input.LA(1)<=44) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalSysMLOC

    // Delegated rules

    public final boolean synpred1_InternalSysMLOC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSysMLOC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\17\1\uffff\1\6\1\42\11\6\2\0\1\6\10\0\1\uffff";
    static final String dfa_3s = "\1\54\1\uffff\1\7\1\42\11\7\2\0\1\7\10\0\1\uffff";
    static final String dfa_4s = "\1\uffff\1\2\26\uffff\1\1";
    static final String dfa_5s = "\15\uffff\1\5\1\0\1\uffff\1\11\1\4\1\2\1\7\1\6\1\1\1\10\1\3\1\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\1\5\uffff\4\1\2\uffff\2\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "\1\15\1\16",
            "\1\17",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\22\1\23",
            "\1\22\1\23",
            "\1\24\1\25",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\26\1\27",
            "\1\uffff",
            "\1\uffff",
            "\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 1165:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_21 = input.LA(1);

                         
                        int index23_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_18 = input.LA(1);

                         
                        int index23_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_23 = input.LA(1);

                         
                        int index23_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_17 = input.LA(1);

                         
                        int index23_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_20 = input.LA(1);

                         
                        int index23_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_19 = input.LA(1);

                         
                        int index23_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_22 = input.LA(1);

                         
                        int index23_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_22);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_16 = input.LA(1);

                         
                        int index23_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0003800000D94000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00001FF3CF0480C0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000030003C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00001FF3C80000C2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00001FF300000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000202L});

}