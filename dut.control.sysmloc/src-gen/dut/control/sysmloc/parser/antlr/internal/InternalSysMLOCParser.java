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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_NORMAL_VALUE", "RULE_OPERATOR", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "'::'", "'*'", "'**'", "';'", "'doc'", "'attribute'", "'def'", "'item'", "'part'", "'port'", "'connection'", "'connect'", "'interface'", "'flow'", "'of'", "'from'", "'to'", "'action'", "'end'", "'ref'", "'('", "','", "')'", "':'", "':>'", "'specializes'", "'='", "':='", "'default'", "'['", "'..'", "']'", "'ordered'", "'nonunique'", "'defined'", "'by'", "'subsets'", "'::>'", "'references'", "'=>'", "'crosses'", "':>>'", "'redefines'", "'~'", "'.'", "'public'", "'private'", "'protected'", "'in'", "'out'", "'inout'"
    };
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
    public static final int RULE_WS=14;
    public static final int RULE_UNRESTRICTED_NAME=7;
    public static final int RULE_NORMAL_VALUE=8;
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

                if ( (LA1_0==15) ) {
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
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalSysMLOC.g:143:3: ( (lv_elements_3_0= ruleBaseElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_REGULAR_COMMENT||(LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||(LA2_0>=15 && LA2_0<=16)||(LA2_0>=22 && LA2_0<=24)||(LA2_0>=26 && LA2_0<=34)||(LA2_0>=36 && LA2_0<=38)||(LA2_0>=42 && LA2_0<=48)||(LA2_0>=51 && LA2_0<=53)||(LA2_0>=55 && LA2_0<=62)||(LA2_0>=64 && LA2_0<=69)) ) {
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

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
            alt3 = dfa3.predict(input);
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
    // InternalSysMLOC.g:290:1: ruleDefinitionElement returns [EObject current=null] : (this_AttributeDefinition_0= ruleAttributeDefinition | this_ItemDefinition_1= ruleItemDefinition | this_PartDefinition_2= rulePartDefinition | this_ConnectionDefinition_3= ruleConnectionDefinition | this_FlowConnectionDefinition_4= ruleFlowConnectionDefinition | this_InterfaceDefinition_5= ruleInterfaceDefinition | this_PortDefinition_6= rulePortDefinition ) ;
    public final EObject ruleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeDefinition_0 = null;

        EObject this_ItemDefinition_1 = null;

        EObject this_PartDefinition_2 = null;

        EObject this_ConnectionDefinition_3 = null;

        EObject this_FlowConnectionDefinition_4 = null;

        EObject this_InterfaceDefinition_5 = null;

        EObject this_PortDefinition_6 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:296:2: ( (this_AttributeDefinition_0= ruleAttributeDefinition | this_ItemDefinition_1= ruleItemDefinition | this_PartDefinition_2= rulePartDefinition | this_ConnectionDefinition_3= ruleConnectionDefinition | this_FlowConnectionDefinition_4= ruleFlowConnectionDefinition | this_InterfaceDefinition_5= ruleInterfaceDefinition | this_PortDefinition_6= rulePortDefinition ) )
            // InternalSysMLOC.g:297:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_ItemDefinition_1= ruleItemDefinition | this_PartDefinition_2= rulePartDefinition | this_ConnectionDefinition_3= ruleConnectionDefinition | this_FlowConnectionDefinition_4= ruleFlowConnectionDefinition | this_InterfaceDefinition_5= ruleInterfaceDefinition | this_PortDefinition_6= rulePortDefinition )
            {
            // InternalSysMLOC.g:297:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_ItemDefinition_1= ruleItemDefinition | this_PartDefinition_2= rulePartDefinition | this_ConnectionDefinition_3= ruleConnectionDefinition | this_FlowConnectionDefinition_4= ruleFlowConnectionDefinition | this_InterfaceDefinition_5= ruleInterfaceDefinition | this_PortDefinition_6= rulePortDefinition )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 31:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            default:
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
                    // InternalSysMLOC.g:307:3: this_ItemDefinition_1= ruleItemDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getItemDefinitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ItemDefinition_1=ruleItemDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ItemDefinition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:316:3: this_PartDefinition_2= rulePartDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartDefinition_2=rulePartDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartDefinition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:325:3: this_ConnectionDefinition_3= ruleConnectionDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getConnectionDefinitionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConnectionDefinition_3=ruleConnectionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConnectionDefinition_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:334:3: this_FlowConnectionDefinition_4= ruleFlowConnectionDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getFlowConnectionDefinitionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowConnectionDefinition_4=ruleFlowConnectionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FlowConnectionDefinition_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:343:3: this_InterfaceDefinition_5= ruleInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfaceDefinition_5=ruleInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InterfaceDefinition_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSysMLOC.g:352:3: this_PortDefinition_6= rulePortDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getPortDefinitionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PortDefinition_6=rulePortDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PortDefinition_6;
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
    // InternalSysMLOC.g:364:1: entryRuleUsageElement returns [EObject current=null] : iv_ruleUsageElement= ruleUsageElement EOF ;
    public final EObject entryRuleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageElement = null;


        try {
            // InternalSysMLOC.g:364:53: (iv_ruleUsageElement= ruleUsageElement EOF )
            // InternalSysMLOC.g:365:2: iv_ruleUsageElement= ruleUsageElement EOF
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
    // InternalSysMLOC.g:371:1: ruleUsageElement returns [EObject current=null] : (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) ;
    public final EObject ruleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_NonOccurrenceUsageElement_0 = null;

        EObject this_OccurrenceUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:377:2: ( (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) )
            // InternalSysMLOC.g:378:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            {
            // InternalSysMLOC.g:378:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)||LA5_0==16||LA5_0==22||(LA5_0>=26 && LA5_0<=34)||(LA5_0>=36 && LA5_0<=38)||(LA5_0>=42 && LA5_0<=48)||(LA5_0>=51 && LA5_0<=53)||(LA5_0>=55 && LA5_0<=62)||(LA5_0>=67 && LA5_0<=69)) ) {
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
                    // InternalSysMLOC.g:379:3: this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement
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
                    // InternalSysMLOC.g:388:3: this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement
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
    // InternalSysMLOC.g:400:1: entryRuleNonOccurrenceUsageElement returns [EObject current=null] : iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF ;
    public final EObject entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:400:66: (iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:401:2: iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF
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
    // InternalSysMLOC.g:407:1: ruleNonOccurrenceUsageElement returns [EObject current=null] : this_AttributeUsage_0= ruleAttributeUsage ;
    public final EObject ruleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:413:2: (this_AttributeUsage_0= ruleAttributeUsage )
            // InternalSysMLOC.g:414:2: this_AttributeUsage_0= ruleAttributeUsage
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
    // InternalSysMLOC.g:425:1: entryRuleOccurrenceUsageElement returns [EObject current=null] : iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF ;
    public final EObject entryRuleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:425:63: (iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:426:2: iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF
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
    // InternalSysMLOC.g:432:1: ruleOccurrenceUsageElement returns [EObject current=null] : (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) ;
    public final EObject ruleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_StructureUsageElement_0 = null;

        EObject this_BehaviorUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:438:2: ( (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) )
            // InternalSysMLOC.g:439:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            {
            // InternalSysMLOC.g:439:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 16:
            case 22:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=RULE_ID && LA6_2<=RULE_UNRESTRICTED_NAME)||LA6_2==16||LA6_2==22||(LA6_2>=27 && LA6_2<=32)||(LA6_2>=42 && LA6_2<=48)||(LA6_2>=51 && LA6_2<=53)||(LA6_2>=55 && LA6_2<=61)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==36) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA6_6 = input.LA(3);

                    if ( ((LA6_6>=RULE_ID && LA6_6<=RULE_UNRESTRICTED_NAME)||LA6_6==16||LA6_6==22||(LA6_6>=27 && LA6_6<=32)||(LA6_6>=42 && LA6_6<=48)||(LA6_6>=51 && LA6_6<=53)||(LA6_6>=55 && LA6_6<=61)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==36) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 16:
                case 22:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 51:
                case 52:
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                    {
                    alt6=1;
                    }
                    break;
                case 36:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            case 68:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA6_6 = input.LA(3);

                    if ( ((LA6_6>=RULE_ID && LA6_6<=RULE_UNRESTRICTED_NAME)||LA6_6==16||LA6_6==22||(LA6_6>=27 && LA6_6<=32)||(LA6_6>=42 && LA6_6<=48)||(LA6_6>=51 && LA6_6<=53)||(LA6_6>=55 && LA6_6<=61)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==36) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 16:
                case 22:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 51:
                case 52:
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                    {
                    alt6=1;
                    }
                    break;
                case 36:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }

                }
                break;
            case 69:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA6_6 = input.LA(3);

                    if ( ((LA6_6>=RULE_ID && LA6_6<=RULE_UNRESTRICTED_NAME)||LA6_6==16||LA6_6==22||(LA6_6>=27 && LA6_6<=32)||(LA6_6>=42 && LA6_6<=48)||(LA6_6>=51 && LA6_6<=53)||(LA6_6>=55 && LA6_6<=61)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==36) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 16:
                case 22:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 51:
                case 52:
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                    {
                    alt6=1;
                    }
                    break;
                case 36:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                int LA6_6 = input.LA(2);

                if ( ((LA6_6>=RULE_ID && LA6_6<=RULE_UNRESTRICTED_NAME)||LA6_6==16||LA6_6==22||(LA6_6>=27 && LA6_6<=32)||(LA6_6>=42 && LA6_6<=48)||(LA6_6>=51 && LA6_6<=53)||(LA6_6>=55 && LA6_6<=61)) ) {
                    alt6=1;
                }
                else if ( (LA6_6==36) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 6, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSysMLOC.g:440:3: this_StructureUsageElement_0= ruleStructureUsageElement
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
                    // InternalSysMLOC.g:449:3: this_BehaviorUsageElement_1= ruleBehaviorUsageElement
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
    // InternalSysMLOC.g:461:1: entryRuleStructureUsageElement returns [EObject current=null] : iv_ruleStructureUsageElement= ruleStructureUsageElement EOF ;
    public final EObject entryRuleStructureUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureUsageElement = null;


        try {
            // InternalSysMLOC.g:461:62: (iv_ruleStructureUsageElement= ruleStructureUsageElement EOF )
            // InternalSysMLOC.g:462:2: iv_ruleStructureUsageElement= ruleStructureUsageElement EOF
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
    // InternalSysMLOC.g:468:1: ruleStructureUsageElement returns [EObject current=null] : (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage ) ;
    public final EObject ruleStructureUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_ItemUsage_0 = null;

        EObject this_PartUsage_1 = null;

        EObject this_PortUsage_2 = null;

        EObject this_ConnectionUsage_3 = null;

        EObject this_InterfaceUsage_4 = null;

        EObject this_FlowConnectionUsage_5 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:474:2: ( (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage ) )
            // InternalSysMLOC.g:475:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )
            {
            // InternalSysMLOC.g:475:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )
            int alt7=6;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSysMLOC.g:476:3: this_ItemUsage_0= ruleItemUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureUsageElementAccess().getItemUsageParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ItemUsage_0=ruleItemUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ItemUsage_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:485:3: this_PartUsage_1= rulePartUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureUsageElementAccess().getPartUsageParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartUsage_1=rulePartUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartUsage_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:494:3: this_PortUsage_2= rulePortUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureUsageElementAccess().getPortUsageParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PortUsage_2=rulePortUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PortUsage_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:503:3: this_ConnectionUsage_3= ruleConnectionUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureUsageElementAccess().getConnectionUsageParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConnectionUsage_3=ruleConnectionUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConnectionUsage_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:512:3: this_InterfaceUsage_4= ruleInterfaceUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureUsageElementAccess().getInterfaceUsageParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfaceUsage_4=ruleInterfaceUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InterfaceUsage_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:521:3: this_FlowConnectionUsage_5= ruleFlowConnectionUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStructureUsageElementAccess().getFlowConnectionUsageParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowConnectionUsage_5=ruleFlowConnectionUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FlowConnectionUsage_5;
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
    // $ANTLR end "ruleStructureUsageElement"


    // $ANTLR start "entryRuleBehaviorUsageElement"
    // InternalSysMLOC.g:533:1: entryRuleBehaviorUsageElement returns [EObject current=null] : iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF ;
    public final EObject entryRuleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorUsageElement = null;


        try {
            // InternalSysMLOC.g:533:61: (iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF )
            // InternalSysMLOC.g:534:2: iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF
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
    // InternalSysMLOC.g:540:1: ruleBehaviorUsageElement returns [EObject current=null] : this_ActionUsage_0= ruleActionUsage ;
    public final EObject ruleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:546:2: (this_ActionUsage_0= ruleActionUsage )
            // InternalSysMLOC.g:547:2: this_ActionUsage_0= ruleActionUsage
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
    // InternalSysMLOC.g:558:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // InternalSysMLOC.g:558:56: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // InternalSysMLOC.g:559:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
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
    // InternalSysMLOC.g:565:1: ruleNamespaceImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= '::' (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleNamespaceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_isRecursive_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_2_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:571:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= '::' (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' ) )
            // InternalSysMLOC.g:572:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= '::' (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' )
            {
            // InternalSysMLOC.g:572:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= '::' (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' )
            // InternalSysMLOC.g:573:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= '::' (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';'
            {
            // InternalSysMLOC.g:573:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:574:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:574:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalSysMLOC.g:575:5: lv_visibility_0_0= ruleVisibilityIndicator
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

            otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNamespaceImportAccess().getImportKeyword_1());
              		
            }
            // InternalSysMLOC.g:596:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:597:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:597:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:598:5: lv_declaredName_2_0= ruleQualifiedName
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

            otherlv_3=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNamespaceImportAccess().getColonColonKeyword_3());
              		
            }
            // InternalSysMLOC.g:619:3: (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:620:4: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNamespaceImportAccess().getAsteriskKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:625:4: ( (lv_isRecursive_5_0= '**' ) )
                    {
                    // InternalSysMLOC.g:625:4: ( (lv_isRecursive_5_0= '**' ) )
                    // InternalSysMLOC.g:626:5: (lv_isRecursive_5_0= '**' )
                    {
                    // InternalSysMLOC.g:626:5: (lv_isRecursive_5_0= '**' )
                    // InternalSysMLOC.g:627:6: lv_isRecursive_5_0= '**'
                    {
                    lv_isRecursive_5_0=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isRecursive_5_0, grammarAccess.getNamespaceImportAccess().getIsRecursiveAsteriskAsteriskKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNamespaceImportRule());
                      						}
                      						setWithLastConsumed(current, "isRecursive", lv_isRecursive_5_0 != null, "**");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_5());
              		
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
    // InternalSysMLOC.g:648:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSysMLOC.g:648:48: (iv_ruleComment= ruleComment EOF )
            // InternalSysMLOC.g:649:2: iv_ruleComment= ruleComment EOF
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
    // InternalSysMLOC.g:655:1: ruleComment returns [EObject current=null] : ( (otherlv_0= 'doc' )? ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:661:2: ( ( (otherlv_0= 'doc' )? ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:662:2: ( (otherlv_0= 'doc' )? ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:662:2: ( (otherlv_0= 'doc' )? ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:663:3: (otherlv_0= 'doc' )? ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            {
            // InternalSysMLOC.g:663:3: (otherlv_0= 'doc' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:664:4: otherlv_0= 'doc'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getDocKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:669:3: ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:670:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:670:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:671:5: lv_body_1_0= RULE_REGULAR_COMMENT
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
    // InternalSysMLOC.g:691:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSysMLOC.g:691:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:692:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalSysMLOC.g:698:1: ruleAttributeDefinition returns [EObject current=null] : (otherlv_0= 'attribute' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_DefinitionDeclaration_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:704:2: ( (otherlv_0= 'attribute' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:705:2: (otherlv_0= 'attribute' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:705:2: (otherlv_0= 'attribute' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:706:3: otherlv_0= 'attribute' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:725:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSysMLOC.g:726:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:731:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:731:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:732:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:736:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_REGULAR_COMMENT||(LA10_0>=RULE_ID && LA10_0<=RULE_UNRESTRICTED_NAME)||(LA10_0>=15 && LA10_0<=16)||(LA10_0>=22 && LA10_0<=24)||(LA10_0>=26 && LA10_0<=34)||(LA10_0>=36 && LA10_0<=38)||(LA10_0>=42 && LA10_0<=48)||(LA10_0>=51 && LA10_0<=53)||(LA10_0>=55 && LA10_0<=62)||(LA10_0>=64 && LA10_0<=69)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSysMLOC.g:737:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:737:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:738:7: lv_elements_5_0= ruleBaseElement
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAttributeUsage"
    // InternalSysMLOC.g:765:1: entryRuleAttributeUsage returns [EObject current=null] : iv_ruleAttributeUsage= ruleAttributeUsage EOF ;
    public final EObject entryRuleAttributeUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeUsage = null;


        try {
            // InternalSysMLOC.g:765:55: (iv_ruleAttributeUsage= ruleAttributeUsage EOF )
            // InternalSysMLOC.g:766:2: iv_ruleAttributeUsage= ruleAttributeUsage EOF
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
    // InternalSysMLOC.g:772:1: ruleAttributeUsage returns [EObject current=null] : (otherlv_0= 'attribute' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) ;
    public final EObject ruleAttributeUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Usage_1 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:778:2: ( (otherlv_0= 'attribute' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:779:2: (otherlv_0= 'attribute' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:779:2: (otherlv_0= 'attribute' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:780:3: otherlv_0= 'attribute' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAttributeUsageRule());
              			}
              			newCompositeNode(grammarAccess.getAttributeUsageAccess().getUsageParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_14);
            this_Usage_1=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:795:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==16) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSysMLOC.g:796:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:801:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:801:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:802:5: otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalSysMLOC.g:806:5: ( (lv_elements_4_0= ruleBaseElement ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_REGULAR_COMMENT||(LA12_0>=RULE_ID && LA12_0<=RULE_UNRESTRICTED_NAME)||(LA12_0>=15 && LA12_0<=16)||(LA12_0>=22 && LA12_0<=24)||(LA12_0>=26 && LA12_0<=34)||(LA12_0>=36 && LA12_0<=38)||(LA12_0>=42 && LA12_0<=48)||(LA12_0>=51 && LA12_0<=53)||(LA12_0>=55 && LA12_0<=62)||(LA12_0>=64 && LA12_0<=69)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSysMLOC.g:807:6: (lv_elements_4_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:807:6: (lv_elements_4_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:808:7: lv_elements_4_0= ruleBaseElement
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleItemDefinition"
    // InternalSysMLOC.g:835:1: entryRuleItemDefinition returns [EObject current=null] : iv_ruleItemDefinition= ruleItemDefinition EOF ;
    public final EObject entryRuleItemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDefinition = null;


        try {
            // InternalSysMLOC.g:835:55: (iv_ruleItemDefinition= ruleItemDefinition EOF )
            // InternalSysMLOC.g:836:2: iv_ruleItemDefinition= ruleItemDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemDefinition=ruleItemDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemDefinition; 
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
    // $ANTLR end "entryRuleItemDefinition"


    // $ANTLR start "ruleItemDefinition"
    // InternalSysMLOC.g:842:1: ruleItemDefinition returns [EObject current=null] : (otherlv_0= 'item' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleItemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_DefinitionDeclaration_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:848:2: ( (otherlv_0= 'item' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:849:2: (otherlv_0= 'item' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:849:2: (otherlv_0= 'item' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:850:3: otherlv_0= 'item' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getItemDefinitionAccess().getItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getItemDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getItemDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:869:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSysMLOC.g:870:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getItemDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:875:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:875:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:876:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getItemDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:880:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_REGULAR_COMMENT||(LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)||(LA14_0>=15 && LA14_0<=16)||(LA14_0>=22 && LA14_0<=24)||(LA14_0>=26 && LA14_0<=34)||(LA14_0>=36 && LA14_0<=38)||(LA14_0>=42 && LA14_0<=48)||(LA14_0>=51 && LA14_0<=53)||(LA14_0>=55 && LA14_0<=62)||(LA14_0>=64 && LA14_0<=69)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSysMLOC.g:881:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:881:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:882:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getItemDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getItemDefinitionRule());
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getItemDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "ruleItemDefinition"


    // $ANTLR start "entryRuleItemUsage"
    // InternalSysMLOC.g:909:1: entryRuleItemUsage returns [EObject current=null] : iv_ruleItemUsage= ruleItemUsage EOF ;
    public final EObject entryRuleItemUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemUsage = null;


        try {
            // InternalSysMLOC.g:909:50: (iv_ruleItemUsage= ruleItemUsage EOF )
            // InternalSysMLOC.g:910:2: iv_ruleItemUsage= ruleItemUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemUsage=ruleItemUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemUsage; 
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
    // $ANTLR end "entryRuleItemUsage"


    // $ANTLR start "ruleItemUsage"
    // InternalSysMLOC.g:916:1: ruleItemUsage returns [EObject current=null] : (otherlv_0= 'item' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) ;
    public final EObject ruleItemUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Usage_1 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:922:2: ( (otherlv_0= 'item' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:923:2: (otherlv_0= 'item' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:923:2: (otherlv_0= 'item' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:924:3: otherlv_0= 'item' this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getItemUsageAccess().getItemKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemUsageRule());
              			}
              			newCompositeNode(grammarAccess.getItemUsageAccess().getUsageParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_14);
            this_Usage_1=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:939:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            else if ( (LA17_0==16) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSysMLOC.g:940:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getItemUsageAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:945:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:945:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:946:5: otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getItemUsageAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalSysMLOC.g:950:5: ( (lv_elements_4_0= ruleBaseElement ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_REGULAR_COMMENT||(LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)||(LA16_0>=15 && LA16_0<=16)||(LA16_0>=22 && LA16_0<=24)||(LA16_0>=26 && LA16_0<=34)||(LA16_0>=36 && LA16_0<=38)||(LA16_0>=42 && LA16_0<=48)||(LA16_0>=51 && LA16_0<=53)||(LA16_0>=55 && LA16_0<=62)||(LA16_0>=64 && LA16_0<=69)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSysMLOC.g:951:6: (lv_elements_4_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:951:6: (lv_elements_4_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:952:7: lv_elements_4_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getItemUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_4_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getItemUsageRule());
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getItemUsageAccess().getRightCurlyBracketKeyword_2_1_2());
                      				
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
    // $ANTLR end "ruleItemUsage"


    // $ANTLR start "entryRulePartDefinition"
    // InternalSysMLOC.g:979:1: entryRulePartDefinition returns [EObject current=null] : iv_rulePartDefinition= rulePartDefinition EOF ;
    public final EObject entryRulePartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDefinition = null;


        try {
            // InternalSysMLOC.g:979:55: (iv_rulePartDefinition= rulePartDefinition EOF )
            // InternalSysMLOC.g:980:2: iv_rulePartDefinition= rulePartDefinition EOF
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
    // InternalSysMLOC.g:986:1: rulePartDefinition returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject rulePartDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_DefinitionDeclaration_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:992:2: ( (otherlv_0= 'part' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:993:2: (otherlv_0= 'part' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:993:2: (otherlv_0= 'part' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:994:3: otherlv_0= 'part' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPartDefinitionAccess().getPartKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPartDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1013:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            else if ( (LA19_0==16) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSysMLOC.g:1014:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1019:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1019:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1020:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1024:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_REGULAR_COMMENT||(LA18_0>=RULE_ID && LA18_0<=RULE_UNRESTRICTED_NAME)||(LA18_0>=15 && LA18_0<=16)||(LA18_0>=22 && LA18_0<=24)||(LA18_0>=26 && LA18_0<=34)||(LA18_0>=36 && LA18_0<=38)||(LA18_0>=42 && LA18_0<=48)||(LA18_0>=51 && LA18_0<=53)||(LA18_0>=55 && LA18_0<=62)||(LA18_0>=64 && LA18_0<=69)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1025:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1025:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1026:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPartDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPartDefinitionRule());
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
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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


    // $ANTLR start "entryRulePartUsage"
    // InternalSysMLOC.g:1053:1: entryRulePartUsage returns [EObject current=null] : iv_rulePartUsage= rulePartUsage EOF ;
    public final EObject entryRulePartUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartUsage = null;


        try {
            // InternalSysMLOC.g:1053:50: (iv_rulePartUsage= rulePartUsage EOF )
            // InternalSysMLOC.g:1054:2: iv_rulePartUsage= rulePartUsage EOF
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
    // InternalSysMLOC.g:1060:1: rulePartUsage returns [EObject current=null] : (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'part' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject rulePartUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_OccurrenceUsagePrefix_0 = null;

        EObject this_Usage_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1066:2: ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'part' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1067:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'part' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1067:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'part' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1068:3: this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'part' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPartUsageAccess().getOccurrenceUsagePrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_OccurrenceUsagePrefix_0=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartUsageAccess().getPartKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPartUsageAccess().getUsageParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_Usage_2=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1094:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            else if ( (LA21_0==16) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSysMLOC.g:1095:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPartUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1100:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1100:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1101:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPartUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1105:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_REGULAR_COMMENT||(LA20_0>=RULE_ID && LA20_0<=RULE_UNRESTRICTED_NAME)||(LA20_0>=15 && LA20_0<=16)||(LA20_0>=22 && LA20_0<=24)||(LA20_0>=26 && LA20_0<=34)||(LA20_0>=36 && LA20_0<=38)||(LA20_0>=42 && LA20_0<=48)||(LA20_0>=51 && LA20_0<=53)||(LA20_0>=55 && LA20_0<=62)||(LA20_0>=64 && LA20_0<=69)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1106:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1106:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1107:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPartUsageAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPartUsageRule());
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPartUsageAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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


    // $ANTLR start "entryRulePortDefinition"
    // InternalSysMLOC.g:1134:1: entryRulePortDefinition returns [EObject current=null] : iv_rulePortDefinition= rulePortDefinition EOF ;
    public final EObject entryRulePortDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortDefinition = null;


        try {
            // InternalSysMLOC.g:1134:55: (iv_rulePortDefinition= rulePortDefinition EOF )
            // InternalSysMLOC.g:1135:2: iv_rulePortDefinition= rulePortDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePortDefinition=rulePortDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePortDefinition; 
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
    // $ANTLR end "entryRulePortDefinition"


    // $ANTLR start "rulePortDefinition"
    // InternalSysMLOC.g:1141:1: rulePortDefinition returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject rulePortDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_DefinitionDeclaration_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1147:2: ( (otherlv_0= 'port' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1148:2: (otherlv_0= 'port' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1148:2: (otherlv_0= 'port' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1149:3: otherlv_0= 'port' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPortDefinitionAccess().getPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPortDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPortDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1168:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            else if ( (LA23_0==16) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSysMLOC.g:1169:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPortDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1174:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1174:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1175:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPortDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1179:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_REGULAR_COMMENT||(LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)||(LA22_0>=15 && LA22_0<=16)||(LA22_0>=22 && LA22_0<=24)||(LA22_0>=26 && LA22_0<=34)||(LA22_0>=36 && LA22_0<=38)||(LA22_0>=42 && LA22_0<=48)||(LA22_0>=51 && LA22_0<=53)||(LA22_0>=55 && LA22_0<=62)||(LA22_0>=64 && LA22_0<=69)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1180:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1180:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1181:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPortDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPortDefinitionRule());
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPortDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "rulePortDefinition"


    // $ANTLR start "entryRulePortUsage"
    // InternalSysMLOC.g:1208:1: entryRulePortUsage returns [EObject current=null] : iv_rulePortUsage= rulePortUsage EOF ;
    public final EObject entryRulePortUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortUsage = null;


        try {
            // InternalSysMLOC.g:1208:50: (iv_rulePortUsage= rulePortUsage EOF )
            // InternalSysMLOC.g:1209:2: iv_rulePortUsage= rulePortUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePortUsage=rulePortUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePortUsage; 
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
    // $ANTLR end "entryRulePortUsage"


    // $ANTLR start "rulePortUsage"
    // InternalSysMLOC.g:1215:1: rulePortUsage returns [EObject current=null] : (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] (otherlv_1= 'port' )? this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject rulePortUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_OccurrenceUsagePrefix_0 = null;

        EObject this_Usage_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1221:2: ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] (otherlv_1= 'port' )? this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1222:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] (otherlv_1= 'port' )? this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1222:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] (otherlv_1= 'port' )? this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1223:3: this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] (otherlv_1= 'port' )? this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPortUsageAccess().getOccurrenceUsagePrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_OccurrenceUsagePrefix_0=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1234:3: (otherlv_1= 'port' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSysMLOC.g:1235:4: otherlv_1= 'port'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPortUsageAccess().getPortKeyword_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPortUsageAccess().getUsageParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_Usage_2=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1251:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            else if ( (LA26_0==16) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSysMLOC.g:1252:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPortUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1257:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1257:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1258:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPortUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1262:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_REGULAR_COMMENT||(LA25_0>=RULE_ID && LA25_0<=RULE_UNRESTRICTED_NAME)||(LA25_0>=15 && LA25_0<=16)||(LA25_0>=22 && LA25_0<=24)||(LA25_0>=26 && LA25_0<=34)||(LA25_0>=36 && LA25_0<=38)||(LA25_0>=42 && LA25_0<=48)||(LA25_0>=51 && LA25_0<=53)||(LA25_0>=55 && LA25_0<=62)||(LA25_0>=64 && LA25_0<=69)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1263:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1263:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1264:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPortUsageAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPortUsageRule());
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPortUsageAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "rulePortUsage"


    // $ANTLR start "entryRuleConnectionDefinition"
    // InternalSysMLOC.g:1291:1: entryRuleConnectionDefinition returns [EObject current=null] : iv_ruleConnectionDefinition= ruleConnectionDefinition EOF ;
    public final EObject entryRuleConnectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDefinition = null;


        try {
            // InternalSysMLOC.g:1291:61: (iv_ruleConnectionDefinition= ruleConnectionDefinition EOF )
            // InternalSysMLOC.g:1292:2: iv_ruleConnectionDefinition= ruleConnectionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectionDefinition=ruleConnectionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectionDefinition; 
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
    // $ANTLR end "entryRuleConnectionDefinition"


    // $ANTLR start "ruleConnectionDefinition"
    // InternalSysMLOC.g:1298:1: ruleConnectionDefinition returns [EObject current=null] : (otherlv_0= 'connection' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleConnectionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_DefinitionDeclaration_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1304:2: ( (otherlv_0= 'connection' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1305:2: (otherlv_0= 'connection' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1305:2: (otherlv_0= 'connection' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1306:3: otherlv_0= 'connection' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectionDefinitionAccess().getConnectionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectionDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1325:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            else if ( (LA28_0==16) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSysMLOC.g:1326:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConnectionDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1331:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1331:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1332:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getConnectionDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1336:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_REGULAR_COMMENT||(LA27_0>=RULE_ID && LA27_0<=RULE_UNRESTRICTED_NAME)||(LA27_0>=15 && LA27_0<=16)||(LA27_0>=22 && LA27_0<=24)||(LA27_0>=26 && LA27_0<=34)||(LA27_0>=36 && LA27_0<=38)||(LA27_0>=42 && LA27_0<=48)||(LA27_0>=51 && LA27_0<=53)||(LA27_0>=55 && LA27_0<=62)||(LA27_0>=64 && LA27_0<=69)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1337:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1337:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1338:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConnectionDefinitionRule());
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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getConnectionDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "ruleConnectionDefinition"


    // $ANTLR start "entryRuleConnectionUsage"
    // InternalSysMLOC.g:1365:1: entryRuleConnectionUsage returns [EObject current=null] : iv_ruleConnectionUsage= ruleConnectionUsage EOF ;
    public final EObject entryRuleConnectionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionUsage = null;


        try {
            // InternalSysMLOC.g:1365:56: (iv_ruleConnectionUsage= ruleConnectionUsage EOF )
            // InternalSysMLOC.g:1366:2: iv_ruleConnectionUsage= ruleConnectionUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectionUsage=ruleConnectionUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectionUsage; 
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
    // $ANTLR end "entryRuleConnectionUsage"


    // $ANTLR start "ruleConnectionUsage"
    // InternalSysMLOC.g:1372:1: ruleConnectionUsage returns [EObject current=null] : ( ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' ) ) ) ;
    public final EObject ruleConnectionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_OccurrenceUsagePrefix_0 = null;

        EObject this_UsageDeclaration_2 = null;

        EObject this_FeatureValue_3 = null;

        EObject this_ConnectorPart_5 = null;

        EObject this_OccurrenceUsagePrefix_6 = null;

        EObject this_ConnectorPart_8 = null;

        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1378:2: ( ( ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' ) ) ) )
            // InternalSysMLOC.g:1379:2: ( ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' ) ) )
            {
            // InternalSysMLOC.g:1379:2: ( ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' ) ) )
            // InternalSysMLOC.g:1380:3: ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' ) )
            {
            // InternalSysMLOC.g:1380:3: ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==30) ) {
                    alt31=2;
                }
                else if ( (LA31_1==29) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA31_5 = input.LA(3);

                    if ( (LA31_5==30) ) {
                        alt31=2;
                    }
                    else if ( (LA31_5==29) ) {
                        alt31=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 30:
                    {
                    alt31=2;
                    }
                    break;
                case 29:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }

                }
                break;
            case 68:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA31_5 = input.LA(3);

                    if ( (LA31_5==30) ) {
                        alt31=2;
                    }
                    else if ( (LA31_5==29) ) {
                        alt31=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    alt31=1;
                    }
                    break;
                case 30:
                    {
                    alt31=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }

                }
                break;
            case 69:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA31_5 = input.LA(3);

                    if ( (LA31_5==30) ) {
                        alt31=2;
                    }
                    else if ( (LA31_5==29) ) {
                        alt31=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    alt31=1;
                    }
                    break;
                case 30:
                    {
                    alt31=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 4, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                int LA31_5 = input.LA(2);

                if ( (LA31_5==30) ) {
                    alt31=2;
                }
                else if ( (LA31_5==29) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 5, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt31=1;
                }
                break;
            case 30:
                {
                alt31=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalSysMLOC.g:1381:4: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? )
                    {
                    // InternalSysMLOC.g:1381:4: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? )
                    // InternalSysMLOC.g:1382:5: this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'connection' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )?
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectionUsageRule());
                      					}
                      					newCompositeNode(grammarAccess.getConnectionUsageAccess().getOccurrenceUsagePrefixParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    this_OccurrenceUsagePrefix_0=ruleOccurrenceUsagePrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_OccurrenceUsagePrefix_0;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    otherlv_1=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getConnectionUsageAccess().getConnectionKeyword_0_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectionUsageRule());
                      					}
                      					newCompositeNode(grammarAccess.getConnectionUsageAccess().getUsageDeclarationParserRuleCall_0_0_2());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    this_UsageDeclaration_2=ruleUsageDeclaration(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_UsageDeclaration_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalSysMLOC.g:1408:5: (this_FeatureValue_3= ruleFeatureValue[$current] )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=45 && LA29_0<=47)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalSysMLOC.g:1409:6: this_FeatureValue_3= ruleFeatureValue[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConnectionUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getConnectionUsageAccess().getFeatureValueParserRuleCall_0_0_3());
                              					
                            }
                            pushFollow(FOLLOW_21);
                            this_FeatureValue_3=ruleFeatureValue(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_FeatureValue_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1421:5: (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==30) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSysMLOC.g:1422:6: otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current]
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getConnectionUsageAccess().getConnectKeyword_0_0_4_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConnectionUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getConnectionUsageAccess().getConnectorPartParserRuleCall_0_0_4_1());
                              					
                            }
                            pushFollow(FOLLOW_14);
                            this_ConnectorPart_5=ruleConnectorPart(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_ConnectorPart_5;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1440:4: (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] )
                    {
                    // InternalSysMLOC.g:1440:4: (this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] )
                    // InternalSysMLOC.g:1441:5: this_OccurrenceUsagePrefix_6= ruleOccurrenceUsagePrefix[$current] otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current]
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectionUsageRule());
                      					}
                      					newCompositeNode(grammarAccess.getConnectionUsageAccess().getOccurrenceUsagePrefixParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    this_OccurrenceUsagePrefix_6=ruleOccurrenceUsagePrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_OccurrenceUsagePrefix_6;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    otherlv_7=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getConnectionUsageAccess().getConnectKeyword_0_1_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectionUsageRule());
                      					}
                      					newCompositeNode(grammarAccess.getConnectionUsageAccess().getConnectorPartParserRuleCall_0_1_2());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    this_ConnectorPart_8=ruleConnectorPart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_ConnectorPart_8;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:1469:3: (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            else if ( (LA33_0==16) ) {
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
                    // InternalSysMLOC.g:1470:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConnectionUsageAccess().getSemicolonKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1475:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' )
                    {
                    // InternalSysMLOC.g:1475:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}' )
                    // InternalSysMLOC.g:1476:5: otherlv_10= '{' ( (lv_elements_11_0= ruleBaseElement ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getConnectionUsageAccess().getLeftCurlyBracketKeyword_1_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1480:5: ( (lv_elements_11_0= ruleBaseElement ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_REGULAR_COMMENT||(LA32_0>=RULE_ID && LA32_0<=RULE_UNRESTRICTED_NAME)||(LA32_0>=15 && LA32_0<=16)||(LA32_0>=22 && LA32_0<=24)||(LA32_0>=26 && LA32_0<=34)||(LA32_0>=36 && LA32_0<=38)||(LA32_0>=42 && LA32_0<=48)||(LA32_0>=51 && LA32_0<=53)||(LA32_0>=55 && LA32_0<=62)||(LA32_0>=64 && LA32_0<=69)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1481:6: (lv_elements_11_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1481:6: (lv_elements_11_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1482:7: lv_elements_11_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConnectionUsageAccess().getElementsBaseElementParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_11_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConnectionUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_11_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getConnectionUsageAccess().getRightCurlyBracketKeyword_1_1_2());
                      				
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
    // $ANTLR end "ruleConnectionUsage"


    // $ANTLR start "entryRuleInterfaceDefinition"
    // InternalSysMLOC.g:1509:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalSysMLOC.g:1509:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalSysMLOC.g:1510:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
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
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // InternalSysMLOC.g:1516:1: ruleInterfaceDefinition returns [EObject current=null] : (otherlv_0= 'interface' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_DefinitionDeclaration_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1522:2: ( (otherlv_0= 'interface' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1523:2: (otherlv_0= 'interface' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1523:2: (otherlv_0= 'interface' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1524:3: otherlv_0= 'interface' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1543:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            else if ( (LA35_0==16) ) {
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
                    // InternalSysMLOC.g:1544:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1549:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1549:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1550:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1554:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_REGULAR_COMMENT||(LA34_0>=RULE_ID && LA34_0<=RULE_UNRESTRICTED_NAME)||(LA34_0>=15 && LA34_0<=16)||(LA34_0>=22 && LA34_0<=24)||(LA34_0>=26 && LA34_0<=34)||(LA34_0>=36 && LA34_0<=38)||(LA34_0>=42 && LA34_0<=48)||(LA34_0>=51 && LA34_0<=53)||(LA34_0>=55 && LA34_0<=62)||(LA34_0>=64 && LA34_0<=69)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1555:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1555:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1556:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleInterfaceUsage"
    // InternalSysMLOC.g:1583:1: entryRuleInterfaceUsage returns [EObject current=null] : iv_ruleInterfaceUsage= ruleInterfaceUsage EOF ;
    public final EObject entryRuleInterfaceUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceUsage = null;


        try {
            // InternalSysMLOC.g:1583:55: (iv_ruleInterfaceUsage= ruleInterfaceUsage EOF )
            // InternalSysMLOC.g:1584:2: iv_ruleInterfaceUsage= ruleInterfaceUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceUsage=ruleInterfaceUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceUsage; 
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
    // $ANTLR end "entryRuleInterfaceUsage"


    // $ANTLR start "ruleInterfaceUsage"
    // InternalSysMLOC.g:1590:1: ruleInterfaceUsage returns [EObject current=null] : (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'interface' ( (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? ) | this_InterfacePart_5= ruleInterfacePart[$current] ) (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' ) ) ) ;
    public final EObject ruleInterfaceUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_OccurrenceUsagePrefix_0 = null;

        EObject this_UsageDeclaration_2 = null;

        EObject this_InterfacePart_4 = null;

        EObject this_InterfacePart_5 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1596:2: ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'interface' ( (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? ) | this_InterfacePart_5= ruleInterfacePart[$current] ) (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' ) ) ) )
            // InternalSysMLOC.g:1597:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'interface' ( (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? ) | this_InterfacePart_5= ruleInterfacePart[$current] ) (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' ) ) )
            {
            // InternalSysMLOC.g:1597:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'interface' ( (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? ) | this_InterfacePart_5= ruleInterfacePart[$current] ) (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' ) ) )
            // InternalSysMLOC.g:1598:3: this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'interface' ( (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? ) | this_InterfacePart_5= ruleInterfacePart[$current] ) (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getInterfaceUsageRule());
              			}
              			newCompositeNode(grammarAccess.getInterfaceUsageAccess().getOccurrenceUsagePrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_OccurrenceUsagePrefix_0=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInterfaceUsageAccess().getInterfaceKeyword_1());
              		
            }
            // InternalSysMLOC.g:1613:3: ( (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? ) | this_InterfacePart_5= ruleInterfacePart[$current] )
            int alt37=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==16||LA37_1==22||LA37_1==30||(LA37_1>=42 && LA37_1<=44)||LA37_1==48||(LA37_1>=51 && LA37_1<=53)||(LA37_1>=55 && LA37_1<=61)) ) {
                    alt37=1;
                }
                else if ( (LA37_1==19||LA37_1==35||LA37_1==63) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==16||LA37_2==22||LA37_2==30||(LA37_2>=42 && LA37_2<=44)||LA37_2==48||(LA37_2>=51 && LA37_2<=53)||(LA37_2>=55 && LA37_2<=61)) ) {
                    alt37=1;
                }
                else if ( (LA37_2==19||LA37_2==35||LA37_2==63) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
            case 22:
            case 30:
            case 42:
            case 43:
            case 44:
            case 48:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt37=1;
                }
                break;
            case 39:
            case 62:
                {
                alt37=2;
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
                    // InternalSysMLOC.g:1614:4: (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? )
                    {
                    // InternalSysMLOC.g:1614:4: (this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )? )
                    // InternalSysMLOC.g:1615:5: this_UsageDeclaration_2= ruleUsageDeclaration[$current] (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )?
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getInterfaceUsageRule());
                      					}
                      					newCompositeNode(grammarAccess.getInterfaceUsageAccess().getUsageDeclarationParserRuleCall_2_0_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    this_UsageDeclaration_2=ruleUsageDeclaration(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_UsageDeclaration_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalSysMLOC.g:1626:5: (otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current] )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==30) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalSysMLOC.g:1627:6: otherlv_3= 'connect' this_InterfacePart_4= ruleInterfacePart[$current]
                            {
                            otherlv_3=(Token)match(input,30,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getInterfaceUsageAccess().getConnectKeyword_2_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getInterfaceUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getInterfaceUsageAccess().getInterfacePartParserRuleCall_2_0_1_1());
                              					
                            }
                            pushFollow(FOLLOW_14);
                            this_InterfacePart_4=ruleInterfacePart(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_InterfacePart_4;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1645:4: this_InterfacePart_5= ruleInterfacePart[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getInterfaceUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getInterfaceUsageAccess().getInterfacePartParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_InterfacePart_5=ruleInterfacePart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfacePart_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:1657:3: (otherlv_6= ';' | (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            else if ( (LA39_0==16) ) {
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
                    // InternalSysMLOC.g:1658:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getInterfaceUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1663:4: (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' )
                    {
                    // InternalSysMLOC.g:1663:4: (otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}' )
                    // InternalSysMLOC.g:1664:5: otherlv_7= '{' ( (lv_elements_8_0= ruleBaseElement ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getInterfaceUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1668:5: ( (lv_elements_8_0= ruleBaseElement ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_REGULAR_COMMENT||(LA38_0>=RULE_ID && LA38_0<=RULE_UNRESTRICTED_NAME)||(LA38_0>=15 && LA38_0<=16)||(LA38_0>=22 && LA38_0<=24)||(LA38_0>=26 && LA38_0<=34)||(LA38_0>=36 && LA38_0<=38)||(LA38_0>=42 && LA38_0<=48)||(LA38_0>=51 && LA38_0<=53)||(LA38_0>=55 && LA38_0<=62)||(LA38_0>=64 && LA38_0<=69)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1669:6: (lv_elements_8_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1669:6: (lv_elements_8_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1670:7: lv_elements_8_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfaceUsageAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_8_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInterfaceUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_8_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getInterfaceUsageAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "ruleInterfaceUsage"


    // $ANTLR start "entryRuleFlowConnectionDefinition"
    // InternalSysMLOC.g:1697:1: entryRuleFlowConnectionDefinition returns [EObject current=null] : iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF ;
    public final EObject entryRuleFlowConnectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowConnectionDefinition = null;


        try {
            // InternalSysMLOC.g:1697:65: (iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF )
            // InternalSysMLOC.g:1698:2: iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowConnectionDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowConnectionDefinition=ruleFlowConnectionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowConnectionDefinition; 
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
    // $ANTLR end "entryRuleFlowConnectionDefinition"


    // $ANTLR start "ruleFlowConnectionDefinition"
    // InternalSysMLOC.g:1704:1: ruleFlowConnectionDefinition returns [EObject current=null] : (otherlv_0= 'flow' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleFlowConnectionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_DefinitionDeclaration_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1710:2: ( (otherlv_0= 'flow' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1711:2: (otherlv_0= 'flow' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1711:2: (otherlv_0= 'flow' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1712:3: otherlv_0= 'flow' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFlowConnectionDefinitionAccess().getFlowKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowConnectionDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1731:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            else if ( (LA41_0==16) ) {
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
                    // InternalSysMLOC.g:1732:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFlowConnectionDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1737:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1737:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1738:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getFlowConnectionDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1742:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_REGULAR_COMMENT||(LA40_0>=RULE_ID && LA40_0<=RULE_UNRESTRICTED_NAME)||(LA40_0>=15 && LA40_0<=16)||(LA40_0>=22 && LA40_0<=24)||(LA40_0>=26 && LA40_0<=34)||(LA40_0>=36 && LA40_0<=38)||(LA40_0>=42 && LA40_0<=48)||(LA40_0>=51 && LA40_0<=53)||(LA40_0>=55 && LA40_0<=62)||(LA40_0>=64 && LA40_0<=69)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1743:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1743:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1744:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFlowConnectionDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFlowConnectionDefinitionRule());
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFlowConnectionDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "ruleFlowConnectionDefinition"


    // $ANTLR start "entryRuleFlowConnectionUsage"
    // InternalSysMLOC.g:1771:1: entryRuleFlowConnectionUsage returns [EObject current=null] : iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF ;
    public final EObject entryRuleFlowConnectionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowConnectionUsage = null;


        try {
            // InternalSysMLOC.g:1771:60: (iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF )
            // InternalSysMLOC.g:1772:2: iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowConnectionUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFlowConnectionUsage=ruleFlowConnectionUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowConnectionUsage; 
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
    // $ANTLR end "entryRuleFlowConnectionUsage"


    // $ANTLR start "ruleFlowConnectionUsage"
    // InternalSysMLOC.g:1778:1: ruleFlowConnectionUsage returns [EObject current=null] : (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'flow' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'of' ( (lv_ItemFeature_5_0= ruleName ) ) )? ( (otherlv_6= 'from' )? ( (lv_FlowEnd_7_0= ruleFeatureChainName ) ) otherlv_8= 'to' ( (lv_FlowEnd_9_0= ruleFeatureChainName ) ) )? (otherlv_10= ';' | (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' ) ) ) ;
    public final EObject ruleFlowConnectionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_OccurrenceUsagePrefix_0 = null;

        EObject this_UsageDeclaration_2 = null;

        EObject this_FeatureValue_3 = null;

        AntlrDatatypeRuleToken lv_ItemFeature_5_0 = null;

        AntlrDatatypeRuleToken lv_FlowEnd_7_0 = null;

        AntlrDatatypeRuleToken lv_FlowEnd_9_0 = null;

        EObject lv_elements_12_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1784:2: ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'flow' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'of' ( (lv_ItemFeature_5_0= ruleName ) ) )? ( (otherlv_6= 'from' )? ( (lv_FlowEnd_7_0= ruleFeatureChainName ) ) otherlv_8= 'to' ( (lv_FlowEnd_9_0= ruleFeatureChainName ) ) )? (otherlv_10= ';' | (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' ) ) ) )
            // InternalSysMLOC.g:1785:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'flow' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'of' ( (lv_ItemFeature_5_0= ruleName ) ) )? ( (otherlv_6= 'from' )? ( (lv_FlowEnd_7_0= ruleFeatureChainName ) ) otherlv_8= 'to' ( (lv_FlowEnd_9_0= ruleFeatureChainName ) ) )? (otherlv_10= ';' | (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' ) ) )
            {
            // InternalSysMLOC.g:1785:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'flow' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'of' ( (lv_ItemFeature_5_0= ruleName ) ) )? ( (otherlv_6= 'from' )? ( (lv_FlowEnd_7_0= ruleFeatureChainName ) ) otherlv_8= 'to' ( (lv_FlowEnd_9_0= ruleFeatureChainName ) ) )? (otherlv_10= ';' | (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' ) ) )
            // InternalSysMLOC.g:1786:3: this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'flow' this_UsageDeclaration_2= ruleUsageDeclaration[$current] (this_FeatureValue_3= ruleFeatureValue[$current] )? (otherlv_4= 'of' ( (lv_ItemFeature_5_0= ruleName ) ) )? ( (otherlv_6= 'from' )? ( (lv_FlowEnd_7_0= ruleFeatureChainName ) ) otherlv_8= 'to' ( (lv_FlowEnd_9_0= ruleFeatureChainName ) ) )? (otherlv_10= ';' | (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getOccurrenceUsagePrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_OccurrenceUsagePrefix_0=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,32,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFlowConnectionUsageAccess().getFlowKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getUsageDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_28);
            this_UsageDeclaration_2=ruleUsageDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UsageDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1812:3: (this_FeatureValue_3= ruleFeatureValue[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=45 && LA42_0<=47)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSysMLOC.g:1813:4: this_FeatureValue_3= ruleFeatureValue[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowConnectionUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getFeatureValueParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_FeatureValue_3=ruleFeatureValue(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FeatureValue_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:1825:3: (otherlv_4= 'of' ( (lv_ItemFeature_5_0= ruleName ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSysMLOC.g:1826:4: otherlv_4= 'of' ( (lv_ItemFeature_5_0= ruleName ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFlowConnectionUsageAccess().getOfKeyword_4_0());
                      			
                    }
                    // InternalSysMLOC.g:1830:4: ( (lv_ItemFeature_5_0= ruleName ) )
                    // InternalSysMLOC.g:1831:5: (lv_ItemFeature_5_0= ruleName )
                    {
                    // InternalSysMLOC.g:1831:5: (lv_ItemFeature_5_0= ruleName )
                    // InternalSysMLOC.g:1832:6: lv_ItemFeature_5_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getItemFeatureNameParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_ItemFeature_5_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                      						}
                      						add(
                      							current,
                      							"ItemFeature",
                      							lv_ItemFeature_5_0,
                      							"dut.control.sysmloc.SysMLOC.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:1850:3: ( (otherlv_6= 'from' )? ( (lv_FlowEnd_7_0= ruleFeatureChainName ) ) otherlv_8= 'to' ( (lv_FlowEnd_9_0= ruleFeatureChainName ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_UNRESTRICTED_NAME)||LA45_0==34||LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSysMLOC.g:1851:4: (otherlv_6= 'from' )? ( (lv_FlowEnd_7_0= ruleFeatureChainName ) ) otherlv_8= 'to' ( (lv_FlowEnd_9_0= ruleFeatureChainName ) )
                    {
                    // InternalSysMLOC.g:1851:4: (otherlv_6= 'from' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==34) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalSysMLOC.g:1852:5: otherlv_6= 'from'
                            {
                            otherlv_6=(Token)match(input,34,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getFlowConnectionUsageAccess().getFromKeyword_5_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1857:4: ( (lv_FlowEnd_7_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:1858:5: (lv_FlowEnd_7_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1858:5: (lv_FlowEnd_7_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:1859:6: lv_FlowEnd_7_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getFlowEndFeatureChainNameParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_FlowEnd_7_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                      						}
                      						add(
                      							current,
                      							"FlowEnd",
                      							lv_FlowEnd_7_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,35,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFlowConnectionUsageAccess().getToKeyword_5_2());
                      			
                    }
                    // InternalSysMLOC.g:1880:4: ( (lv_FlowEnd_9_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:1881:5: (lv_FlowEnd_9_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1881:5: (lv_FlowEnd_9_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:1882:6: lv_FlowEnd_9_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getFlowEndFeatureChainNameParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_FlowEnd_9_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                      						}
                      						add(
                      							current,
                      							"FlowEnd",
                      							lv_FlowEnd_9_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:1900:3: (otherlv_10= ';' | (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==22) ) {
                alt47=1;
            }
            else if ( (LA47_0==16) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSysMLOC.g:1901:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFlowConnectionUsageAccess().getSemicolonKeyword_6_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1906:4: (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' )
                    {
                    // InternalSysMLOC.g:1906:4: (otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}' )
                    // InternalSysMLOC.g:1907:5: otherlv_11= '{' ( (lv_elements_12_0= ruleBaseElement ) )* otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getFlowConnectionUsageAccess().getLeftCurlyBracketKeyword_6_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1911:5: ( (lv_elements_12_0= ruleBaseElement ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_REGULAR_COMMENT||(LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)||(LA46_0>=15 && LA46_0<=16)||(LA46_0>=22 && LA46_0<=24)||(LA46_0>=26 && LA46_0<=34)||(LA46_0>=36 && LA46_0<=38)||(LA46_0>=42 && LA46_0<=48)||(LA46_0>=51 && LA46_0<=53)||(LA46_0>=55 && LA46_0<=62)||(LA46_0>=64 && LA46_0<=69)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1912:6: (lv_elements_12_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:1912:6: (lv_elements_12_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:1913:7: lv_elements_12_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getElementsBaseElementParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_12_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_12_0,
                    	      								"dut.control.sysmloc.SysMLOC.BaseElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getFlowConnectionUsageAccess().getRightCurlyBracketKeyword_6_1_2());
                      				
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
    // $ANTLR end "ruleFlowConnectionUsage"


    // $ANTLR start "entryRuleActionUsage"
    // InternalSysMLOC.g:1940:1: entryRuleActionUsage returns [EObject current=null] : iv_ruleActionUsage= ruleActionUsage EOF ;
    public final EObject entryRuleActionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionUsage = null;


        try {
            // InternalSysMLOC.g:1940:52: (iv_ruleActionUsage= ruleActionUsage EOF )
            // InternalSysMLOC.g:1941:2: iv_ruleActionUsage= ruleActionUsage EOF
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
    // InternalSysMLOC.g:1947:1: ruleActionUsage returns [EObject current=null] : (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'action' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleActionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_OccurrenceUsagePrefix_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_2_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1953:2: ( (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'action' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1954:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'action' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1954:2: (this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'action' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1955:3: this_OccurrenceUsagePrefix_0= ruleOccurrenceUsagePrefix[$current] otherlv_1= 'action' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getActionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getActionUsageAccess().getOccurrenceUsagePrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_OccurrenceUsagePrefix_0=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getActionUsageAccess().getActionKeyword_1());
              		
            }
            // InternalSysMLOC.g:1970:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:1971:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:1971:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:1972:5: lv_declaredName_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActionUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_declaredName_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActionUsageRule());
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

            // InternalSysMLOC.g:1989:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==22) ) {
                alt49=1;
            }
            else if ( (LA49_0==16) ) {
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
                    // InternalSysMLOC.g:1990:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getActionUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1995:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1995:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1996:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getActionUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2000:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_REGULAR_COMMENT||(LA48_0>=RULE_ID && LA48_0<=RULE_UNRESTRICTED_NAME)||(LA48_0>=15 && LA48_0<=16)||(LA48_0>=22 && LA48_0<=24)||(LA48_0>=26 && LA48_0<=34)||(LA48_0>=36 && LA48_0<=38)||(LA48_0>=42 && LA48_0<=48)||(LA48_0>=51 && LA48_0<=53)||(LA48_0>=55 && LA48_0<=62)||(LA48_0>=64 && LA48_0<=69)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2001:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:2001:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:2002:7: lv_elements_5_0= ruleBaseElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActionUsageAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActionUsageRule());
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getActionUsageAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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


    // $ANTLR start "ruleOccurrenceUsagePrefix"
    // InternalSysMLOC.g:2030:1: ruleOccurrenceUsagePrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isEnd_0_0= 'end' ) ) | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ) ;
    public final EObject ruleOccurrenceUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isEnd_0_0=null;
        EObject this_BasicUsagePrefix_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2036:2: ( ( ( (lv_isEnd_0_0= 'end' ) ) | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ) )
            // InternalSysMLOC.g:2037:2: ( ( (lv_isEnd_0_0= 'end' ) ) | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] )
            {
            // InternalSysMLOC.g:2037:2: ( ( (lv_isEnd_0_0= 'end' ) ) | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==37) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)||LA50_0==16||LA50_0==22||(LA50_0>=27 && LA50_0<=34)||LA50_0==36||LA50_0==38||(LA50_0>=42 && LA50_0<=48)||(LA50_0>=51 && LA50_0<=53)||(LA50_0>=55 && LA50_0<=62)||(LA50_0>=67 && LA50_0<=69)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalSysMLOC.g:2038:3: ( (lv_isEnd_0_0= 'end' ) )
                    {
                    // InternalSysMLOC.g:2038:3: ( (lv_isEnd_0_0= 'end' ) )
                    // InternalSysMLOC.g:2039:4: (lv_isEnd_0_0= 'end' )
                    {
                    // InternalSysMLOC.g:2039:4: (lv_isEnd_0_0= 'end' )
                    // InternalSysMLOC.g:2040:5: lv_isEnd_0_0= 'end'
                    {
                    lv_isEnd_0_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isEnd_0_0, grammarAccess.getOccurrenceUsagePrefixAccess().getIsEndEndKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOccurrenceUsagePrefixRule());
                      					}
                      					setWithLastConsumed(current, "isEnd", lv_isEnd_0_0 != null, "end");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2053:3: this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getOccurrenceUsagePrefixRule());
                      			}
                      			newCompositeNode(grammarAccess.getOccurrenceUsagePrefixAccess().getBasicUsagePrefixParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicUsagePrefix_1=ruleBasicUsagePrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicUsagePrefix_1;
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
    // $ANTLR end "ruleOccurrenceUsagePrefix"


    // $ANTLR start "ruleRefPrefix"
    // InternalSysMLOC.g:2069:1: ruleRefPrefix[EObject in_current] returns [EObject current=in_current] : ( (lv_direction_0_0= ruleFeatureDirection ) )? ;
    public final EObject ruleRefPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Enumerator lv_direction_0_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2075:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? )
            // InternalSysMLOC.g:2076:2: ( (lv_direction_0_0= ruleFeatureDirection ) )?
            {
            // InternalSysMLOC.g:2076:2: ( (lv_direction_0_0= ruleFeatureDirection ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=67 && LA51_0<=69)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSysMLOC.g:2077:3: (lv_direction_0_0= ruleFeatureDirection )
                    {
                    // InternalSysMLOC.g:2077:3: (lv_direction_0_0= ruleFeatureDirection )
                    // InternalSysMLOC.g:2078:4: lv_direction_0_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRefPrefixAccess().getDirectionFeatureDirectionEnumRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    lv_direction_0_0=ruleFeatureDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElementForParent(grammarAccess.getRefPrefixRule());
                      				}
                      				set(
                      					current,
                      					"direction",
                      					lv_direction_0_0,
                      					"dut.control.sysmloc.SysMLOC.FeatureDirection");
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleRefPrefix"


    // $ANTLR start "ruleBasicUsagePrefix"
    // InternalSysMLOC.g:2099:1: ruleBasicUsagePrefix[EObject in_current] returns [EObject current=in_current] : (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? ) ;
    public final EObject ruleBasicUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isReference_1_0=null;
        EObject this_RefPrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2105:2: ( (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? ) )
            // InternalSysMLOC.g:2106:2: (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? )
            {
            // InternalSysMLOC.g:2106:2: (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? )
            // InternalSysMLOC.g:2107:3: this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )?
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getBasicUsagePrefixRule());
              			}
              			newCompositeNode(grammarAccess.getBasicUsagePrefixAccess().getRefPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_RefPrefix_0=ruleRefPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2118:3: ( (lv_isReference_1_0= 'ref' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSysMLOC.g:2119:4: (lv_isReference_1_0= 'ref' )
                    {
                    // InternalSysMLOC.g:2119:4: (lv_isReference_1_0= 'ref' )
                    // InternalSysMLOC.g:2120:5: lv_isReference_1_0= 'ref'
                    {
                    lv_isReference_1_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReference_1_0, grammarAccess.getBasicUsagePrefixAccess().getIsReferenceRefKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicUsagePrefixRule());
                      					}
                      					setWithLastConsumed(current, "isReference", lv_isReference_1_0 != null, "ref");
                      				
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
    // $ANTLR end "ruleBasicUsagePrefix"


    // $ANTLR start "ruleConnectorPart"
    // InternalSysMLOC.g:2137:1: ruleConnectorPart[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_connectorEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_connectorEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_connectorEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_connectorEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) ) ;
    public final EObject ruleConnectorPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_connectorEnd_0_0 = null;

        AntlrDatatypeRuleToken lv_connectorEnd_2_0 = null;

        AntlrDatatypeRuleToken lv_connectorEnd_4_0 = null;

        AntlrDatatypeRuleToken lv_connectorEnd_6_0 = null;

        AntlrDatatypeRuleToken lv_connectorEnd_8_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2143:2: ( ( ( ( (lv_connectorEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_connectorEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_connectorEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_connectorEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) ) )
            // InternalSysMLOC.g:2144:2: ( ( ( (lv_connectorEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_connectorEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_connectorEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_connectorEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) )
            {
            // InternalSysMLOC.g:2144:2: ( ( ( (lv_connectorEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_connectorEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_connectorEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_connectorEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_UNRESTRICTED_NAME)||LA54_0==62) ) {
                alt54=1;
            }
            else if ( (LA54_0==39) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalSysMLOC.g:2145:3: ( ( (lv_connectorEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_connectorEnd_2_0= ruleFeatureChainName ) ) )
                    {
                    // InternalSysMLOC.g:2145:3: ( ( (lv_connectorEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_connectorEnd_2_0= ruleFeatureChainName ) ) )
                    // InternalSysMLOC.g:2146:4: ( (lv_connectorEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_connectorEnd_2_0= ruleFeatureChainName ) )
                    {
                    // InternalSysMLOC.g:2146:4: ( (lv_connectorEnd_0_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2147:5: (lv_connectorEnd_0_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2147:5: (lv_connectorEnd_0_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2148:6: lv_connectorEnd_0_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorEndFeatureChainNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_connectorEnd_0_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorEnd",
                      							lv_connectorEnd_0_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConnectorPartAccess().getToKeyword_0_1());
                      			
                    }
                    // InternalSysMLOC.g:2169:4: ( (lv_connectorEnd_2_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2170:5: (lv_connectorEnd_2_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2170:5: (lv_connectorEnd_2_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2171:6: lv_connectorEnd_2_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorEndFeatureChainNameParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_connectorEnd_2_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorEnd",
                      							lv_connectorEnd_2_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2190:3: (otherlv_3= '(' ( (lv_connectorEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_connectorEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' )
                    {
                    // InternalSysMLOC.g:2190:3: (otherlv_3= '(' ( (lv_connectorEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_connectorEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' )
                    // InternalSysMLOC.g:2191:4: otherlv_3= '(' ( (lv_connectorEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_connectorEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConnectorPartAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalSysMLOC.g:2195:4: ( (lv_connectorEnd_4_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2196:5: (lv_connectorEnd_4_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2196:5: (lv_connectorEnd_4_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2197:6: lv_connectorEnd_4_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorEndFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_connectorEnd_4_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorEnd",
                      							lv_connectorEnd_4_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConnectorPartAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalSysMLOC.g:2218:4: ( (lv_connectorEnd_6_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2219:5: (lv_connectorEnd_6_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2219:5: (lv_connectorEnd_6_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2220:6: lv_connectorEnd_6_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorEndFeatureChainNameParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_connectorEnd_6_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorEnd",
                      							lv_connectorEnd_6_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:2237:4: (otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==40) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2238:5: otherlv_7= ',' ( (lv_connectorEnd_8_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getConnectorPartAccess().getCommaKeyword_1_4_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:2242:5: ( (lv_connectorEnd_8_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:2243:6: (lv_connectorEnd_8_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:2243:6: (lv_connectorEnd_8_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:2244:7: lv_connectorEnd_8_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorEndFeatureChainNameParserRuleCall_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_connectorEnd_8_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"connectorEnd",
                    	      								lv_connectorEnd_8_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConnectorPartAccess().getRightParenthesisKeyword_1_5());
                      			
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
    // $ANTLR end "ruleConnectorPart"


    // $ANTLR start "ruleInterfacePart"
    // InternalSysMLOC.g:2272:1: ruleInterfacePart[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) ) ;
    public final EObject ruleInterfacePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_InterfaceEnd_0_0 = null;

        AntlrDatatypeRuleToken lv_InterfaceEnd_2_0 = null;

        AntlrDatatypeRuleToken lv_InterfaceEnd_4_0 = null;

        AntlrDatatypeRuleToken lv_InterfaceEnd_6_0 = null;

        AntlrDatatypeRuleToken lv_InterfaceEnd_8_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2278:2: ( ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) ) )
            // InternalSysMLOC.g:2279:2: ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) )
            {
            // InternalSysMLOC.g:2279:2: ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_UNRESTRICTED_NAME)||LA56_0==62) ) {
                alt56=1;
            }
            else if ( (LA56_0==39) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalSysMLOC.g:2280:3: ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) )
                    {
                    // InternalSysMLOC.g:2280:3: ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) )
                    // InternalSysMLOC.g:2281:4: ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) )
                    {
                    // InternalSysMLOC.g:2281:4: ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2282:5: (lv_InterfaceEnd_0_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2282:5: (lv_InterfaceEnd_0_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2283:6: lv_InterfaceEnd_0_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_InterfaceEnd_0_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterfacePartRule());
                      						}
                      						add(
                      							current,
                      							"InterfaceEnd",
                      							lv_InterfaceEnd_0_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInterfacePartAccess().getToKeyword_0_1());
                      			
                    }
                    // InternalSysMLOC.g:2304:4: ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2305:5: (lv_InterfaceEnd_2_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2305:5: (lv_InterfaceEnd_2_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2306:6: lv_InterfaceEnd_2_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_InterfaceEnd_2_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterfacePartRule());
                      						}
                      						add(
                      							current,
                      							"InterfaceEnd",
                      							lv_InterfaceEnd_2_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2325:3: (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' )
                    {
                    // InternalSysMLOC.g:2325:3: (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' )
                    // InternalSysMLOC.g:2326:4: otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfacePartAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalSysMLOC.g:2330:4: ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2331:5: (lv_InterfaceEnd_4_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2331:5: (lv_InterfaceEnd_4_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2332:6: lv_InterfaceEnd_4_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_InterfaceEnd_4_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterfacePartRule());
                      						}
                      						add(
                      							current,
                      							"InterfaceEnd",
                      							lv_InterfaceEnd_4_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getInterfacePartAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalSysMLOC.g:2353:4: ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2354:5: (lv_InterfaceEnd_6_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2354:5: (lv_InterfaceEnd_6_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2355:6: lv_InterfaceEnd_6_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_InterfaceEnd_6_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterfacePartRule());
                      						}
                      						add(
                      							current,
                      							"InterfaceEnd",
                      							lv_InterfaceEnd_6_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:2372:4: (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==40) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2373:5: otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getInterfacePartAccess().getCommaKeyword_1_4_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:2377:5: ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:2378:6: (lv_InterfaceEnd_8_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:2378:6: (lv_InterfaceEnd_8_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:2379:7: lv_InterfaceEnd_8_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_InterfaceEnd_8_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInterfacePartRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"InterfaceEnd",
                    	      								lv_InterfaceEnd_8_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getInterfacePartAccess().getRightParenthesisKeyword_1_5());
                      			
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
    // $ANTLR end "ruleInterfacePart"


    // $ANTLR start "ruleDefinitionDeclaration"
    // InternalSysMLOC.g:2407:1: ruleDefinitionDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? ) ;
    public final EObject ruleDefinitionDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_declaredName_0_0 = null;

        AntlrDatatypeRuleToken lv_superclassifiers_4_0 = null;

        AntlrDatatypeRuleToken lv_superclassifiers_6_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2413:2: ( ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? ) )
            // InternalSysMLOC.g:2414:2: ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? )
            {
            // InternalSysMLOC.g:2414:2: ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? )
            // InternalSysMLOC.g:2415:3: ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )?
            {
            // InternalSysMLOC.g:2415:3: ( (lv_declaredName_0_0= ruleName ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSysMLOC.g:2416:4: (lv_declaredName_0_0= ruleName )
                    {
                    // InternalSysMLOC.g:2416:4: (lv_declaredName_0_0= ruleName )
                    // InternalSysMLOC.g:2417:5: lv_declaredName_0_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_37);
                    lv_declaredName_0_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefinitionDeclarationRule());
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
                    break;

            }

            // InternalSysMLOC.g:2434:3: ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=42 && LA60_0<=44)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSysMLOC.g:2435:4: (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:2435:4: (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' )
                    int alt58=3;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt58=1;
                        }
                        break;
                    case 43:
                        {
                        alt58=2;
                        }
                        break;
                    case 44:
                        {
                        alt58=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // InternalSysMLOC.g:2436:5: otherlv_1= ':'
                            {
                            otherlv_1=(Token)match(input,42,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getDefinitionDeclarationAccess().getColonKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:2441:5: otherlv_2= ':>'
                            {
                            otherlv_2=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getDefinitionDeclarationAccess().getColonGreaterThanSignKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSysMLOC.g:2446:5: otherlv_3= 'specializes'
                            {
                            otherlv_3=(Token)match(input,44,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getDefinitionDeclarationAccess().getSpecializesKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:2451:4: ( (lv_superclassifiers_4_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2452:5: (lv_superclassifiers_4_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2452:5: (lv_superclassifiers_4_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2453:6: lv_superclassifiers_4_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getSuperclassifiersFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_superclassifiers_4_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefinitionDeclarationRule());
                      						}
                      						add(
                      							current,
                      							"superclassifiers",
                      							lv_superclassifiers_4_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:2470:4: (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==40) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2471:5: otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDefinitionDeclarationAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:2475:5: ( (lv_superclassifiers_6_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:2476:6: (lv_superclassifiers_6_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:2476:6: (lv_superclassifiers_6_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:2477:7: lv_superclassifiers_6_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getSuperclassifiersFeatureChainNameParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    lv_superclassifiers_6_0=ruleFeatureChainName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDefinitionDeclarationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"superclassifiers",
                    	      								lv_superclassifiers_6_0,
                    	      								"dut.control.sysmloc.SysMLOC.FeatureChainName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


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
    // $ANTLR end "ruleDefinitionDeclaration"


    // $ANTLR start "ruleUsage"
    // InternalSysMLOC.g:2501:1: ruleUsage[EObject in_current] returns [EObject current=in_current] : (this_UsageDeclaration_0= ruleUsageDeclaration[$current] (this_FeatureValue_1= ruleFeatureValue[$current] )? ) ;
    public final EObject ruleUsage(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_UsageDeclaration_0 = null;

        EObject this_FeatureValue_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2507:2: ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] (this_FeatureValue_1= ruleFeatureValue[$current] )? ) )
            // InternalSysMLOC.g:2508:2: (this_UsageDeclaration_0= ruleUsageDeclaration[$current] (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            {
            // InternalSysMLOC.g:2508:2: (this_UsageDeclaration_0= ruleUsageDeclaration[$current] (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            // InternalSysMLOC.g:2509:3: this_UsageDeclaration_0= ruleUsageDeclaration[$current] (this_FeatureValue_1= ruleFeatureValue[$current] )?
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getUsageRule());
              			}
              			newCompositeNode(grammarAccess.getUsageAccess().getUsageDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_UsageDeclaration_0=ruleUsageDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UsageDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2520:3: (this_FeatureValue_1= ruleFeatureValue[$current] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=45 && LA61_0<=47)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSysMLOC.g:2521:4: this_FeatureValue_1= ruleFeatureValue[$current]
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


    // $ANTLR start "ruleUsageDeclaration"
    // InternalSysMLOC.g:2538:1: ruleUsageDeclaration[EObject in_current] returns [EObject current=in_current] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )? ;
    public final EObject ruleUsageDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureDeclaration_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2544:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )? )
            // InternalSysMLOC.g:2545:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )?
            {
            // InternalSysMLOC.g:2545:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )?
            int alt62=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA62_1 = input.LA(2);

                    if ( ((LA62_1>=RULE_ID && LA62_1<=RULE_UNRESTRICTED_NAME)||LA62_1==16||LA62_1==22||LA62_1==30||(LA62_1>=33 && LA62_1<=34)||(LA62_1>=42 && LA62_1<=48)||(LA62_1>=51 && LA62_1<=53)||(LA62_1>=55 && LA62_1<=62)) ) {
                        alt62=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA62_2 = input.LA(2);

                    if ( ((LA62_2>=RULE_ID && LA62_2<=RULE_UNRESTRICTED_NAME)||LA62_2==16||LA62_2==22||LA62_2==30||(LA62_2>=33 && LA62_2<=34)||(LA62_2>=42 && LA62_2<=48)||(LA62_2>=51 && LA62_2<=53)||(LA62_2>=55 && LA62_2<=62)) ) {
                        alt62=1;
                    }
                    }
                    break;
                case 42:
                case 43:
                case 44:
                case 48:
                case 51:
                case 52:
                case 53:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                    {
                    alt62=1;
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // InternalSysMLOC.g:2546:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getUsageDeclarationRule());
                      			}
                      			newCompositeNode(grammarAccess.getUsageDeclarationAccess().getFeatureDeclarationParserRuleCall());
                      		
                    }
                    pushFollow(FOLLOW_2);
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
    // $ANTLR end "ruleUsageDeclaration"


    // $ANTLR start "ruleFeatureValue"
    // InternalSysMLOC.g:2562:1: ruleFeatureValue[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) ) ;
    public final EObject ruleFeatureValue(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isInitial_1_0=null;
        Token lv_isDefault_2_0=null;
        Token otherlv_3=null;
        Token lv_isInitial_4_0=null;
        AntlrDatatypeRuleToken lv_valuePart_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2568:2: ( ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) ) )
            // InternalSysMLOC.g:2569:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) )
            {
            // InternalSysMLOC.g:2569:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) )
            // InternalSysMLOC.g:2570:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) )
            {
            // InternalSysMLOC.g:2570:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt64=1;
                }
                break;
            case 46:
                {
                alt64=2;
                }
                break;
            case 47:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalSysMLOC.g:2571:4: otherlv_0= '='
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2576:4: ( (lv_isInitial_1_0= ':=' ) )
                    {
                    // InternalSysMLOC.g:2576:4: ( (lv_isInitial_1_0= ':=' ) )
                    // InternalSysMLOC.g:2577:5: (lv_isInitial_1_0= ':=' )
                    {
                    // InternalSysMLOC.g:2577:5: (lv_isInitial_1_0= ':=' )
                    // InternalSysMLOC.g:2578:6: lv_isInitial_1_0= ':='
                    {
                    lv_isInitial_1_0=(Token)match(input,46,FOLLOW_40); if (state.failed) return current;
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
                    // InternalSysMLOC.g:2591:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    {
                    // InternalSysMLOC.g:2591:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    // InternalSysMLOC.g:2592:5: ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    {
                    // InternalSysMLOC.g:2592:5: ( (lv_isDefault_2_0= 'default' ) )
                    // InternalSysMLOC.g:2593:6: (lv_isDefault_2_0= 'default' )
                    {
                    // InternalSysMLOC.g:2593:6: (lv_isDefault_2_0= 'default' )
                    // InternalSysMLOC.g:2594:7: lv_isDefault_2_0= 'default'
                    {
                    lv_isDefault_2_0=(Token)match(input,47,FOLLOW_41); if (state.failed) return current;
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

                    // InternalSysMLOC.g:2606:5: (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    int alt63=3;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==45) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==46) ) {
                        alt63=2;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalSysMLOC.g:2607:6: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,45,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:2612:6: ( (lv_isInitial_4_0= ':=' ) )
                            {
                            // InternalSysMLOC.g:2612:6: ( (lv_isInitial_4_0= ':=' ) )
                            // InternalSysMLOC.g:2613:7: (lv_isInitial_4_0= ':=' )
                            {
                            // InternalSysMLOC.g:2613:7: (lv_isInitial_4_0= ':=' )
                            // InternalSysMLOC.g:2614:8: lv_isInitial_4_0= ':='
                            {
                            lv_isInitial_4_0=(Token)match(input,46,FOLLOW_40); if (state.failed) return current;
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

            // InternalSysMLOC.g:2629:3: ( (lv_valuePart_5_0= ruleExpression ) )
            // InternalSysMLOC.g:2630:4: (lv_valuePart_5_0= ruleExpression )
            {
            // InternalSysMLOC.g:2630:4: (lv_valuePart_5_0= ruleExpression )
            // InternalSysMLOC.g:2631:5: lv_valuePart_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureValueAccess().getValuePartExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_valuePart_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureValueRule());
              					}
              					add(
              						current,
              						"valuePart",
              						lv_valuePart_5_0,
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
    // InternalSysMLOC.g:2653:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_declaredName_0_0 = null;

        EObject this_FeatureSpecializationPart_1 = null;

        EObject this_FeatureSpecializationPart_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2659:2: ( ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) )
            // InternalSysMLOC.g:2660:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            {
            // InternalSysMLOC.g:2660:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt66=1;
            }
            else if ( ((LA66_0>=42 && LA66_0<=44)||LA66_0==48||(LA66_0>=51 && LA66_0<=53)||(LA66_0>=55 && LA66_0<=61)) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalSysMLOC.g:2661:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    {
                    // InternalSysMLOC.g:2661:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    // InternalSysMLOC.g:2662:4: ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    {
                    // InternalSysMLOC.g:2662:4: ( (lv_declaredName_0_0= ruleName ) )
                    // InternalSysMLOC.g:2663:5: (lv_declaredName_0_0= ruleName )
                    {
                    // InternalSysMLOC.g:2663:5: (lv_declaredName_0_0= ruleName )
                    // InternalSysMLOC.g:2664:6: lv_declaredName_0_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
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

                    // InternalSysMLOC.g:2681:4: (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=42 && LA65_0<=44)||LA65_0==48||(LA65_0>=51 && LA65_0<=53)||(LA65_0>=55 && LA65_0<=61)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalSysMLOC.g:2682:5: this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current]
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
                    // InternalSysMLOC.g:2696:3: this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current]
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
    // InternalSysMLOC.g:2712:1: ruleFeatureSpecializationPart[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) ;
    public final EObject ruleFeatureSpecializationPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureSpecialization_0 = null;

        EObject this_MultiplicityPart_1 = null;

        EObject this_FeatureSpecialization_2 = null;

        EObject this_MultiplicityPart_3 = null;

        EObject this_FeatureSpecialization_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2718:2: ( ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) )
            // InternalSysMLOC.g:2719:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            {
            // InternalSysMLOC.g:2719:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=42 && LA71_0<=44)||LA71_0==53||(LA71_0>=55 && LA71_0<=61)) ) {
                alt71=1;
            }
            else if ( (LA71_0==48||(LA71_0>=51 && LA71_0<=52)) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalSysMLOC.g:2720:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:2720:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:2721:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    {
                    // InternalSysMLOC.g:2721:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        alt67 = dfa67.predict(input);
                        switch (alt67) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2722:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_42);
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
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    // InternalSysMLOC.g:2735:4: (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==48||(LA68_0>=51 && LA68_0<=52)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalSysMLOC.g:2736:5: this_MultiplicityPart_1= ruleMultiplicityPart[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                              					}
                              					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_43);
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

                    // InternalSysMLOC.g:2748:4: (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( ((LA69_0>=42 && LA69_0<=44)||LA69_0==53||(LA69_0>=55 && LA69_0<=61)) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2749:5: this_FeatureSpecialization_2= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2763:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:2763:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:2764:4: this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_43);
                    this_MultiplicityPart_3=ruleMultiplicityPart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityPart_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:2775:4: (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=42 && LA70_0<=44)||LA70_0==53||(LA70_0>=55 && LA70_0<=61)) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2776:5: this_FeatureSpecialization_4= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop70;
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
    // InternalSysMLOC.g:2794:1: ruleMultiplicityPart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) ) ;
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
            // InternalSysMLOC.g:2800:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) ) )
            // InternalSysMLOC.g:2801:2: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) )
            {
            // InternalSysMLOC.g:2801:2: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' ) | ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==48) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==RULE_DECIMAL_VALUE) ) {
                    int LA78_3 = input.LA(3);

                    if ( (LA78_3==49) ) {
                        int LA78_4 = input.LA(4);

                        if ( (LA78_4==RULE_DECIMAL_VALUE) ) {
                            int LA78_6 = input.LA(5);

                            if ( (LA78_6==50) ) {
                                int LA78_5 = input.LA(6);

                                if ( ((LA78_5>=RULE_ID && LA78_5<=RULE_UNRESTRICTED_NAME)||LA78_5==16||LA78_5==22||LA78_5==30||(LA78_5>=33 && LA78_5<=34)||(LA78_5>=42 && LA78_5<=47)||LA78_5==53||(LA78_5>=55 && LA78_5<=62)) ) {
                                    alt78=1;
                                }
                                else if ( ((LA78_5>=51 && LA78_5<=52)) ) {
                                    alt78=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 78, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 78, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA78_3==50) ) {
                        int LA78_5 = input.LA(4);

                        if ( ((LA78_5>=RULE_ID && LA78_5<=RULE_UNRESTRICTED_NAME)||LA78_5==16||LA78_5==22||LA78_5==30||(LA78_5>=33 && LA78_5<=34)||(LA78_5>=42 && LA78_5<=47)||LA78_5==53||(LA78_5>=55 && LA78_5<=62)) ) {
                            alt78=1;
                        }
                        else if ( ((LA78_5>=51 && LA78_5<=52)) ) {
                            alt78=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 78, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA78_0>=51 && LA78_0<=52)) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalSysMLOC.g:2802:3: (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' )
                    {
                    // InternalSysMLOC.g:2802:3: (otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']' )
                    // InternalSysMLOC.g:2803:4: otherlv_0= '[' ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) ) (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )? otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:2807:4: ( (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE ) )
                    // InternalSysMLOC.g:2808:5: (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE )
                    {
                    // InternalSysMLOC.g:2808:5: (lv_Multiplicity_1_0= RULE_DECIMAL_VALUE )
                    // InternalSysMLOC.g:2809:6: lv_Multiplicity_1_0= RULE_DECIMAL_VALUE
                    {
                    lv_Multiplicity_1_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_45); if (state.failed) return current;
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

                    // InternalSysMLOC.g:2825:4: (otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==49) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalSysMLOC.g:2826:5: otherlv_2= '..' ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) )
                            {
                            otherlv_2=(Token)match(input,49,FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_0_2_0());
                              				
                            }
                            // InternalSysMLOC.g:2830:5: ( (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE ) )
                            // InternalSysMLOC.g:2831:6: (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE )
                            {
                            // InternalSysMLOC.g:2831:6: (lv_Multiplicity_3_0= RULE_DECIMAL_VALUE )
                            // InternalSysMLOC.g:2832:7: lv_Multiplicity_3_0= RULE_DECIMAL_VALUE
                            {
                            lv_Multiplicity_3_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_46); if (state.failed) return current;
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

                    otherlv_4=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2855:3: ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) )
                    {
                    // InternalSysMLOC.g:2855:3: ( (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) ) )
                    // InternalSysMLOC.g:2856:4: (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )? ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) )
                    {
                    // InternalSysMLOC.g:2856:4: (otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==48) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalSysMLOC.g:2857:5: otherlv_5= '[' ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) ) (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )? otherlv_9= ']'
                            {
                            otherlv_5=(Token)match(input,48,FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_0());
                              				
                            }
                            // InternalSysMLOC.g:2861:5: ( (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE ) )
                            // InternalSysMLOC.g:2862:6: (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE )
                            {
                            // InternalSysMLOC.g:2862:6: (lv_Multiplicity_6_0= RULE_DECIMAL_VALUE )
                            // InternalSysMLOC.g:2863:7: lv_Multiplicity_6_0= RULE_DECIMAL_VALUE
                            {
                            lv_Multiplicity_6_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_45); if (state.failed) return current;
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

                            // InternalSysMLOC.g:2879:5: (otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) ) )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==49) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // InternalSysMLOC.g:2880:6: otherlv_7= '..' ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) )
                                    {
                                    otherlv_7=(Token)match(input,49,FOLLOW_44); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_7, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_1_0_2_0());
                                      					
                                    }
                                    // InternalSysMLOC.g:2884:6: ( (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE ) )
                                    // InternalSysMLOC.g:2885:7: (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE )
                                    {
                                    // InternalSysMLOC.g:2885:7: (lv_Multiplicity_8_0= RULE_DECIMAL_VALUE )
                                    // InternalSysMLOC.g:2886:8: lv_Multiplicity_8_0= RULE_DECIMAL_VALUE
                                    {
                                    lv_Multiplicity_8_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_46); if (state.failed) return current;
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

                            otherlv_9=(Token)match(input,50,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_3());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:2908:4: ( ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? ) )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==51) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==52) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalSysMLOC.g:2909:5: ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? )
                            {
                            // InternalSysMLOC.g:2909:5: ( ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )? )
                            // InternalSysMLOC.g:2910:6: ( (lv_isOrdered_10_0= 'ordered' ) ) ( (lv_isNonunique_11_0= 'nonunique' ) )?
                            {
                            // InternalSysMLOC.g:2910:6: ( (lv_isOrdered_10_0= 'ordered' ) )
                            // InternalSysMLOC.g:2911:7: (lv_isOrdered_10_0= 'ordered' )
                            {
                            // InternalSysMLOC.g:2911:7: (lv_isOrdered_10_0= 'ordered' )
                            // InternalSysMLOC.g:2912:8: lv_isOrdered_10_0= 'ordered'
                            {
                            lv_isOrdered_10_0=(Token)match(input,51,FOLLOW_48); if (state.failed) return current;
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

                            // InternalSysMLOC.g:2924:6: ( (lv_isNonunique_11_0= 'nonunique' ) )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==52) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // InternalSysMLOC.g:2925:7: (lv_isNonunique_11_0= 'nonunique' )
                                    {
                                    // InternalSysMLOC.g:2925:7: (lv_isNonunique_11_0= 'nonunique' )
                                    // InternalSysMLOC.g:2926:8: lv_isNonunique_11_0= 'nonunique'
                                    {
                                    lv_isNonunique_11_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
                            // InternalSysMLOC.g:2940:5: ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? )
                            {
                            // InternalSysMLOC.g:2940:5: ( ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )? )
                            // InternalSysMLOC.g:2941:6: ( (lv_isNonunique_12_0= 'nonunique' ) ) ( (lv_isOrdered_13_0= 'ordered' ) )?
                            {
                            // InternalSysMLOC.g:2941:6: ( (lv_isNonunique_12_0= 'nonunique' ) )
                            // InternalSysMLOC.g:2942:7: (lv_isNonunique_12_0= 'nonunique' )
                            {
                            // InternalSysMLOC.g:2942:7: (lv_isNonunique_12_0= 'nonunique' )
                            // InternalSysMLOC.g:2943:8: lv_isNonunique_12_0= 'nonunique'
                            {
                            lv_isNonunique_12_0=(Token)match(input,52,FOLLOW_49); if (state.failed) return current;
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

                            // InternalSysMLOC.g:2955:6: ( (lv_isOrdered_13_0= 'ordered' ) )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==51) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // InternalSysMLOC.g:2956:7: (lv_isOrdered_13_0= 'ordered' )
                                    {
                                    // InternalSysMLOC.g:2956:7: (lv_isOrdered_13_0= 'ordered' )
                                    // InternalSysMLOC.g:2957:8: lv_isOrdered_13_0= 'ordered'
                                    {
                                    lv_isOrdered_13_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:2977:1: ruleFeatureSpecialization[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) ;
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
            // InternalSysMLOC.g:2983:2: ( ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) )
            // InternalSysMLOC.g:2984:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            {
            // InternalSysMLOC.g:2984:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            int alt89=5;
            switch ( input.LA(1) ) {
            case 42:
            case 53:
                {
                alt89=1;
                }
                break;
            case 43:
            case 44:
            case 55:
                {
                alt89=2;
                }
                break;
            case 56:
            case 57:
                {
                alt89=3;
                }
                break;
            case 58:
            case 59:
                {
                alt89=4;
                }
                break;
            case 60:
            case 61:
                {
                alt89=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalSysMLOC.g:2985:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:2985:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:2986:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:2986:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==42) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==53) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalSysMLOC.g:2987:5: otherlv_0= ':'
                            {
                            otherlv_0=(Token)match(input,42,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getFeatureSpecializationAccess().getColonKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:2992:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            {
                            // InternalSysMLOC.g:2992:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            // InternalSysMLOC.g:2993:6: otherlv_1= 'defined' otherlv_2= 'by'
                            {
                            otherlv_1=(Token)match(input,53,FOLLOW_50); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getFeatureSpecializationAccess().getDefinedKeyword_0_0_1_0());
                              					
                            }
                            otherlv_2=(Token)match(input,54,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getFeatureSpecializationAccess().getByKeyword_0_0_1_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSysMLOC.g:3003:4: ( (lv_typings_3_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3004:5: (lv_typings_3_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3004:5: (lv_typings_3_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3005:6: lv_typings_3_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalSysMLOC.g:3022:4: (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==40) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3023:5: otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_0_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3027:5: ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:3028:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:3028:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:3029:7: lv_typings_5_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3049:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:3049:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:3050:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:3050:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' )
                    int alt81=3;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt81=1;
                        }
                        break;
                    case 44:
                        {
                        alt81=2;
                        }
                        break;
                    case 55:
                        {
                        alt81=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }

                    switch (alt81) {
                        case 1 :
                            // InternalSysMLOC.g:3051:5: otherlv_6= ':>'
                            {
                            otherlv_6=(Token)match(input,43,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:3056:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,44,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getFeatureSpecializationAccess().getSpecializesKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSysMLOC.g:3061:5: otherlv_8= 'subsets'
                            {
                            otherlv_8=(Token)match(input,55,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getFeatureSpecializationAccess().getSubsetsKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:3066:4: ( (lv_subsetting_9_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3067:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3067:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3068:6: lv_subsetting_9_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalSysMLOC.g:3085:4: (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==40) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3086:5: otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3090:5: ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:3091:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:3091:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:3092:7: lv_subsetting_11_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop82;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:3112:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:3112:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:3113:4: (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:3113:4: (otherlv_12= '::>' | otherlv_13= 'references' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==56) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==57) ) {
                        alt83=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalSysMLOC.g:3114:5: otherlv_12= '::>'
                            {
                            otherlv_12=(Token)match(input,56,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getFeatureSpecializationAccess().getColonColonGreaterThanSignKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:3119:5: otherlv_13= 'references'
                            {
                            otherlv_13=(Token)match(input,57,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getFeatureSpecializationAccess().getReferencesKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:3124:4: ( (lv_references_14_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3125:5: (lv_references_14_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3125:5: (lv_references_14_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3126:6: lv_references_14_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalSysMLOC.g:3143:4: (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==40) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3144:5: otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_15=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_15, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3148:5: ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:3149:6: (lv_references_16_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:3149:6: (lv_references_16_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:3150:7: lv_references_16_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop84;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:3170:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:3170:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:3171:4: (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:3171:4: (otherlv_17= '=>' | otherlv_18= 'crosses' )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==58) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==59) ) {
                        alt85=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalSysMLOC.g:3172:5: otherlv_17= '=>'
                            {
                            otherlv_17=(Token)match(input,58,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getFeatureSpecializationAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:3177:5: otherlv_18= 'crosses'
                            {
                            otherlv_18=(Token)match(input,59,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getFeatureSpecializationAccess().getCrossesKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:3182:4: ( (lv_crosses_19_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3183:5: (lv_crosses_19_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3183:5: (lv_crosses_19_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3184:6: lv_crosses_19_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalSysMLOC.g:3201:4: (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==40) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3202:5: otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_20=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_20, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3206:5: ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:3207:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:3207:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:3208:7: lv_crosses_21_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop86;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:3228:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:3228:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:3229:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:3229:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==60) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==61) ) {
                        alt87=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalSysMLOC.g:3230:5: otherlv_22= ':>>'
                            {
                            otherlv_22=(Token)match(input,60,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_22, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:3235:5: otherlv_23= 'redefines'
                            {
                            otherlv_23=(Token)match(input,61,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_23, grammarAccess.getFeatureSpecializationAccess().getRedefinesKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:3240:4: ( (lv_redefinitions_24_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3241:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3241:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3242:6: lv_redefinitions_24_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalSysMLOC.g:3259:4: (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==40) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3260:5: otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_25=(Token)match(input,40,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_25, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3264:5: ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:3265:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:3265:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:3266:7: lv_redefinitions_26_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop88;
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
    // InternalSysMLOC.g:3289:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysMLOC.g:3289:44: (iv_ruleName= ruleName EOF )
            // InternalSysMLOC.g:3290:2: iv_ruleName= ruleName EOF
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
    // InternalSysMLOC.g:3296:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3302:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalSysMLOC.g:3303:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalSysMLOC.g:3303:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_UNRESTRICTED_NAME) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalSysMLOC.g:3304:3: this_ID_0= RULE_ID
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
                    // InternalSysMLOC.g:3312:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalSysMLOC.g:3323:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysMLOC.g:3323:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysMLOC.g:3324:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSysMLOC.g:3330:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3336:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) )
            // InternalSysMLOC.g:3337:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            {
            // InternalSysMLOC.g:3337:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            // InternalSysMLOC.g:3338:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:3348:3: (kw= '::' this_Name_2= ruleName )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==19) ) {
                    int LA91_2 = input.LA(2);

                    if ( ((LA91_2>=RULE_ID && LA91_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt91=1;
                    }


                }


                switch (alt91) {
            	case 1 :
            	    // InternalSysMLOC.g:3349:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_51);
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
            	    break loop91;
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
    // InternalSysMLOC.g:3369:1: entryRuleFeatureChainName returns [String current=null] : iv_ruleFeatureChainName= ruleFeatureChainName EOF ;
    public final String entryRuleFeatureChainName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureChainName = null;


        try {
            // InternalSysMLOC.g:3369:56: (iv_ruleFeatureChainName= ruleFeatureChainName EOF )
            // InternalSysMLOC.g:3370:2: iv_ruleFeatureChainName= ruleFeatureChainName EOF
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
    // InternalSysMLOC.g:3376:1: ruleFeatureChainName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFeatureChainName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_Name_3 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3382:2: ( ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) )
            // InternalSysMLOC.g:3383:2: ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            {
            // InternalSysMLOC.g:3383:2: ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            // InternalSysMLOC.g:3384:3: (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )*
            {
            // InternalSysMLOC.g:3384:3: (kw= '~' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==62) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSysMLOC.g:3385:4: kw= '~'
                    {
                    kw=(Token)match(input,62,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getTildeKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFeatureChainNameAccess().getQualifiedNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_52);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:3401:3: (kw= '.' this_Name_3= ruleName )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==63) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalSysMLOC.g:3402:4: kw= '.' this_Name_3= ruleName
            	    {
            	    kw=(Token)match(input,63,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_52);
            	    this_Name_3=ruleName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Name_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop93;
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
    // InternalSysMLOC.g:3422:1: entryRuleExpressionName returns [String current=null] : iv_ruleExpressionName= ruleExpressionName EOF ;
    public final String entryRuleExpressionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionName = null;


        try {
            // InternalSysMLOC.g:3422:54: (iv_ruleExpressionName= ruleExpressionName EOF )
            // InternalSysMLOC.g:3423:2: iv_ruleExpressionName= ruleExpressionName EOF
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
    // InternalSysMLOC.g:3429:1: ruleExpressionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureChainName_0= ruleFeatureChainName | this_NORMAL_VALUE_1= RULE_NORMAL_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleExpressionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NORMAL_VALUE_1=null;
        AntlrDatatypeRuleToken this_FeatureChainName_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3435:2: ( (this_FeatureChainName_0= ruleFeatureChainName | this_NORMAL_VALUE_1= RULE_NORMAL_VALUE ) )
            // InternalSysMLOC.g:3436:2: (this_FeatureChainName_0= ruleFeatureChainName | this_NORMAL_VALUE_1= RULE_NORMAL_VALUE )
            {
            // InternalSysMLOC.g:3436:2: (this_FeatureChainName_0= ruleFeatureChainName | this_NORMAL_VALUE_1= RULE_NORMAL_VALUE )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_ID && LA94_0<=RULE_UNRESTRICTED_NAME)||LA94_0==62) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_NORMAL_VALUE) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalSysMLOC.g:3437:3: this_FeatureChainName_0= ruleFeatureChainName
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
                    // InternalSysMLOC.g:3448:3: this_NORMAL_VALUE_1= RULE_NORMAL_VALUE
                    {
                    this_NORMAL_VALUE_1=(Token)match(input,RULE_NORMAL_VALUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NORMAL_VALUE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NORMAL_VALUE_1, grammarAccess.getExpressionNameAccess().getNORMAL_VALUETerminalRuleCall_1());
                      		
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
    // InternalSysMLOC.g:3459:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalSysMLOC.g:3459:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalSysMLOC.g:3460:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSysMLOC.g:3466:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OPERATOR_0=null;
        Token this_OPERATOR_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionName_1 = null;

        AntlrDatatypeRuleToken this_ExpressionName_3 = null;

        AntlrDatatypeRuleToken this_SequenceExpression_5 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3472:2: ( ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) ) )
            // InternalSysMLOC.g:3473:2: ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) )
            {
            // InternalSysMLOC.g:3473:2: ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=RULE_ID && LA98_0<=RULE_OPERATOR)||LA98_0==62) ) {
                alt98=1;
            }
            else if ( (LA98_0==39) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalSysMLOC.g:3474:3: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* )
                    {
                    // InternalSysMLOC.g:3474:3: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* )
                    // InternalSysMLOC.g:3475:4: (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )*
                    {
                    // InternalSysMLOC.g:3475:4: (this_OPERATOR_0= RULE_OPERATOR )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==RULE_OPERATOR) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3476:5: this_OPERATOR_0= RULE_OPERATOR
                    	    {
                    	    this_OPERATOR_0=(Token)match(input,RULE_OPERATOR,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_OPERATOR_0);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OPERATOR_0, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_ExpressionName_1=ruleExpressionName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionName_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:3494:4: (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==RULE_OPERATOR) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3495:5: this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )?
                    	    {
                    	    this_OPERATOR_2=(Token)match(input,RULE_OPERATOR,FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_OPERATOR_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OPERATOR_2, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3502:5: (this_ExpressionName_3= ruleExpressionName )?
                    	    int alt96=2;
                    	    alt96 = dfa96.predict(input);
                    	    switch (alt96) {
                    	        case 1 :
                    	            // InternalSysMLOC.g:3503:6: this_ExpressionName_3= ruleExpressionName
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_0_2_1());
                    	              					
                    	            }
                    	            pushFollow(FOLLOW_54);
                    	            this_ExpressionName_3=ruleExpressionName();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_ExpressionName_3);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						afterParserOrEnumRuleCall();
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3517:3: (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
                    {
                    // InternalSysMLOC.g:3517:3: (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
                    // InternalSysMLOC.g:3518:4: kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')'
                    {
                    kw=(Token)match(input,39,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getSequenceExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_SequenceExpression_5=ruleSequenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SequenceExpression_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSequenceExpression"
    // InternalSysMLOC.g:3543:1: entryRuleSequenceExpression returns [String current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final String entryRuleSequenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSequenceExpression = null;


        try {
            // InternalSysMLOC.g:3543:58: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalSysMLOC.g:3544:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequenceExpression=ruleSequenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceExpression.getText(); 
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
    // $ANTLR end "entryRuleSequenceExpression"


    // $ANTLR start "ruleSequenceExpression"
    // InternalSysMLOC.g:3550:1: ruleSequenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleSequenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3556:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalSysMLOC.g:3557:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalSysMLOC.g:3557:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalSysMLOC.g:3558:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:3568:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==40) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalSysMLOC.g:3569:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSequenceExpressionAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_38);
            	    this_Expression_2=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
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
    // $ANTLR end "ruleSequenceExpression"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalSysMLOC.g:3589:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3595:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalSysMLOC.g:3596:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalSysMLOC.g:3596:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt100=1;
                }
                break;
            case 65:
                {
                alt100=2;
                }
                break;
            case 66:
                {
                alt100=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalSysMLOC.g:3597:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSysMLOC.g:3597:3: (enumLiteral_0= 'public' )
                    // InternalSysMLOC.g:3598:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3605:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSysMLOC.g:3605:3: (enumLiteral_1= 'private' )
                    // InternalSysMLOC.g:3606:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:3613:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalSysMLOC.g:3613:3: (enumLiteral_2= 'protected' )
                    // InternalSysMLOC.g:3614:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleFeatureDirection"
    // InternalSysMLOC.g:3624:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3630:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalSysMLOC.g:3631:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalSysMLOC.g:3631:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt101=1;
                }
                break;
            case 68:
                {
                alt101=2;
                }
                break;
            case 69:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalSysMLOC.g:3632:3: (enumLiteral_0= 'in' )
                    {
                    // InternalSysMLOC.g:3632:3: (enumLiteral_0= 'in' )
                    // InternalSysMLOC.g:3633:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3640:3: (enumLiteral_1= 'out' )
                    {
                    // InternalSysMLOC.g:3640:3: (enumLiteral_1= 'out' )
                    // InternalSysMLOC.g:3641:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:3648:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalSysMLOC.g:3648:3: (enumLiteral_2= 'inout' )
                    // InternalSysMLOC.g:3649:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleFeatureDirection"

    // $ANTLR start synpred1_InternalSysMLOC
    public final void synpred1_InternalSysMLOC_fragment() throws RecognitionException {   
        // InternalSysMLOC.g:2722:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )
        // InternalSysMLOC.g:
        {
        if ( (input.LA(1)>=42 && input.LA(1)<=44)||input.LA(1)==53||(input.LA(1)>=55 && input.LA(1)<=61) ) {
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\uffff\7\6\2\uffff";
    static final String dfa_3s = "\1\105\3\uffff\4\75\2\76\1\75\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\7\uffff\1\5\1\4";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\2\13\7\uffff\1\1\1\13\5\uffff\1\13\1\2\1\4\1\uffff\1\5\1\6\1\12\1\7\1\13\1\11\1\10\3\uffff\3\13\3\uffff\7\13\2\uffff\3\13\1\uffff\7\13\2\uffff\3\3\3\13",
            "",
            "",
            "",
            "\2\13\10\uffff\1\13\5\uffff\1\13\2\uffff\1\14\20\uffff\7\13\2\uffff\3\13\1\uffff\7\13",
            "\2\13\10\uffff\1\13\5\uffff\1\13\2\uffff\1\14\20\uffff\7\13\2\uffff\3\13\1\uffff\7\13",
            "\2\13\10\uffff\1\13\5\uffff\1\13\2\uffff\1\14\20\uffff\7\13\2\uffff\3\13\1\uffff\7\13",
            "\2\13\10\uffff\1\13\5\uffff\1\13\2\uffff\1\14\4\uffff\1\13\13\uffff\7\13\2\uffff\3\13\1\uffff\7\13",
            "\2\13\10\uffff\1\13\5\uffff\1\13\2\uffff\1\14\7\uffff\2\13\7\uffff\7\13\2\uffff\3\13\1\uffff\10\13",
            "\2\13\10\uffff\1\13\5\uffff\1\13\2\uffff\1\14\4\uffff\1\13\10\uffff\1\13\2\uffff\3\13\3\uffff\1\13\2\uffff\3\13\1\uffff\10\13",
            "\2\13\10\uffff\1\13\5\uffff\1\13\2\uffff\1\14\20\uffff\7\13\2\uffff\3\13\1\uffff\7\13",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "184:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\6\1\uffff\5\6\5\uffff";
    static final String dfa_9s = "\1\105\1\uffff\5\75\5\uffff";
    static final String dfa_10s = "\1\uffff\1\1\5\uffff\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\2\10\10\uffff\1\10\5\uffff\1\10\3\uffff\1\1\1\7\1\10\2\11\1\12\1\13\4\uffff\1\2\1\6\3\uffff\7\10\2\uffff\3\10\1\uffff\7\10\5\uffff\1\3\1\4\1\5",
            "",
            "\2\10\10\uffff\1\10\5\uffff\1\10\4\uffff\1\7\1\10\2\11\1\12\1\13\11\uffff\7\10\2\uffff\3\10\1\uffff\7\10",
            "\2\10\10\uffff\1\10\5\uffff\1\10\4\uffff\1\7\1\10\2\11\1\12\1\13\5\uffff\1\6\3\uffff\7\10\2\uffff\3\10\1\uffff\7\10",
            "\2\10\10\uffff\1\10\5\uffff\1\10\4\uffff\1\7\1\10\2\11\1\12\1\13\5\uffff\1\6\3\uffff\7\10\2\uffff\3\10\1\uffff\7\10",
            "\2\10\10\uffff\1\10\5\uffff\1\10\4\uffff\1\7\1\10\2\11\1\12\1\13\5\uffff\1\6\3\uffff\7\10\2\uffff\3\10\1\uffff\7\10",
            "\2\10\10\uffff\1\10\5\uffff\1\10\4\uffff\1\7\1\10\2\11\1\12\1\13\11\uffff\7\10\2\uffff\3\10\1\uffff\7\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "475:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )";
        }
    }
    static final String dfa_13s = "\36\uffff";
    static final String dfa_14s = "\1\6\1\uffff\1\6\1\66\12\6\2\0\2\6\2\0\1\6\2\0\1\6\2\0\1\6\2\0\1\uffff";
    static final String dfa_15s = "\1\76\1\uffff\1\76\1\66\11\76\1\7\2\0\1\76\1\7\2\0\1\7\2\0\1\7\2\0\1\7\2\0\1\uffff";
    static final String dfa_16s = "\1\uffff\1\2\33\uffff\1\1";
    static final String dfa_17s = "\16\uffff\1\4\1\11\2\uffff\1\5\1\3\1\uffff\1\1\1\7\1\uffff\1\2\1\10\1\uffff\1\6\1\0\1\uffff}>";
    static final String[] dfa_18s = {
            "\2\1\10\uffff\1\1\5\uffff\1\1\7\uffff\1\1\2\uffff\2\1\7\uffff\1\2\1\4\1\5\4\1\2\uffff\2\1\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\1",
            "",
            "\1\16\1\17\66\uffff\1\15",
            "\1\20",
            "\1\22\1\23\66\uffff\1\21",
            "\1\22\1\23\66\uffff\1\21",
            "\1\22\1\23\66\uffff\1\21",
            "\1\25\1\26\66\uffff\1\24",
            "\1\25\1\26\66\uffff\1\24",
            "\1\30\1\31\66\uffff\1\27",
            "\1\30\1\31\66\uffff\1\27",
            "\1\33\1\34\66\uffff\1\32",
            "\1\33\1\34\66\uffff\1\32",
            "\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\16\1\17\66\uffff\1\15",
            "\1\22\1\23",
            "\1\uffff",
            "\1\uffff",
            "\1\25\1\26",
            "\1\uffff",
            "\1\uffff",
            "\1\30\1\31",
            "\1\uffff",
            "\1\uffff",
            "\1\33\1\34",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()+ loopback of 2721:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_28 = input.LA(1);

                         
                        int index67_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_28);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_24 = input.LA(1);

                         
                        int index67_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_24);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_27 = input.LA(1);

                         
                        int index67_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_22);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_25 = input.LA(1);

                         
                        int index67_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\1\5\1\uffff\2\4\4\uffff\4\4";
    static final String dfa_20s = "\4\6\2\uffff\6\6";
    static final String dfa_21s = "\1\76\1\7\2\77\2\uffff\2\7\4\77";
    static final String dfa_22s = "\4\uffff\1\1\1\2\6\uffff";
    static final String[] dfa_23s = {
            "\1\2\1\3\1\4\1\5\6\uffff\1\5\5\uffff\1\5\7\uffff\1\5\2\uffff\2\5\5\uffff\2\5\24\uffff\1\1",
            "\1\2\1\3",
            "\2\4\1\uffff\1\4\6\uffff\1\4\2\uffff\1\6\2\uffff\1\4\7\uffff\1\4\2\uffff\2\4\1\5\4\uffff\2\4\24\uffff\1\4\1\7",
            "\2\4\1\uffff\1\4\6\uffff\1\4\2\uffff\1\6\2\uffff\1\4\7\uffff\1\4\2\uffff\2\4\1\5\4\uffff\2\4\24\uffff\1\4\1\7",
            "",
            "",
            "\1\10\1\11",
            "\1\12\1\13",
            "\2\4\1\uffff\1\4\6\uffff\1\4\2\uffff\1\6\2\uffff\1\4\7\uffff\1\4\2\uffff\2\4\1\5\4\uffff\2\4\24\uffff\1\4\1\7",
            "\2\4\1\uffff\1\4\6\uffff\1\4\2\uffff\1\6\2\uffff\1\4\7\uffff\1\4\2\uffff\2\4\1\5\4\uffff\2\4\24\uffff\1\4\1\7",
            "\2\4\1\uffff\1\4\6\uffff\1\4\5\uffff\1\4\7\uffff\1\4\2\uffff\2\4\1\5\4\uffff\2\4\24\uffff\1\4\1\7",
            "\2\4\1\uffff\1\4\6\uffff\1\4\5\uffff\1\4\7\uffff\1\4\2\uffff\2\4\1\5\4\uffff\2\4\24\uffff\1\4\1\7"
    };
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_7;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_11;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "3502:5: (this_ExpressionName_3= ruleExpressionName )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000061BD828010L,0x000000000000003FL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001C00004100C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x3FB9FC00000000C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x3FB9FC00100000C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x3FB9FC00404100C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000E00040410000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040410000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x40000080000000C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x7FB91C80404100C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x7FB9FC06004100C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000E006004100C0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x40000006004100C0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x40000004004100C0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x40000000000000C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x40000080000003C0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x40006080000003C0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3FB91C00000000C2L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x3FA01C0000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x40000000000003C0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x40000000000003C2L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000020000000000L});

}