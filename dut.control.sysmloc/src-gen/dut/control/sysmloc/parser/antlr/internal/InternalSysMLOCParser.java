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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_NOTE", "RULE_ML_NOTE", "RULE_STRING_VALUE", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_OPERATOR", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "'::'", "'*'", "'**'", "';'", "'comment'", "'about'", "','", "'locale'", "'doc'", "'rep'", "'language'", "'attribute'", "'def'", "'enum'", "'item'", "'part'", "'port'", "'connection'", "'connect'", "'interface'", "'flow'", "'of'", "'from'", "'to'", "'action'", "'alias'", "'<'", "'>'", "'for'", "'all'", "'individual'", "'abstract'", "'variation'", "'end'", "'readonly'", "'derived'", "'ref'", "'('", "')'", "':'", "':>'", "'specializes'", "'='", "':='", "'default'", "'['", "']'", "'..'", "'ordered'", "'nonunique'", "'defined'", "'by'", "'subsets'", "'::>'", "'references'", "'=>'", "'crosses'", "':>>'", "'redefines'", "'true'", "'false'", "'.'", "'~'", "'public'", "'private'", "'protected'", "'in'", "'out'", "'inout'", "'snapshot'", "'timeslice'"
    };
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=4;
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
    public static final int RULE_ID=10;
    public static final int RULE_DECIMAL_VALUE=8;
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
    public static final int RULE_ML_NOTE=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_REGULAR_COMMENT=7;
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
    public static final int RULE_OPERATOR=12;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_UNRESTRICTED_NAME=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int RULE_EXP_VALUE=9;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
    // InternalSysMLOC.g:72:1: ruleNamespace returns [EObject current=null] : ( ( (lv_intro_0_0= ruleCodeAnnotation ) )? ( (lv_packages_1_0= rulePackage ) )* ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject lv_intro_0_0 = null;

        EObject lv_packages_1_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:78:2: ( ( ( (lv_intro_0_0= ruleCodeAnnotation ) )? ( (lv_packages_1_0= rulePackage ) )* ) )
            // InternalSysMLOC.g:79:2: ( ( (lv_intro_0_0= ruleCodeAnnotation ) )? ( (lv_packages_1_0= rulePackage ) )* )
            {
            // InternalSysMLOC.g:79:2: ( ( (lv_intro_0_0= ruleCodeAnnotation ) )? ( (lv_packages_1_0= rulePackage ) )* )
            // InternalSysMLOC.g:80:3: ( (lv_intro_0_0= ruleCodeAnnotation ) )? ( (lv_packages_1_0= rulePackage ) )*
            {
            // InternalSysMLOC.g:80:3: ( (lv_intro_0_0= ruleCodeAnnotation ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_SL_NOTE && LA1_0<=RULE_ML_NOTE)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSysMLOC.g:81:4: (lv_intro_0_0= ruleCodeAnnotation )
                    {
                    // InternalSysMLOC.g:81:4: (lv_intro_0_0= ruleCodeAnnotation )
                    // InternalSysMLOC.g:82:5: lv_intro_0_0= ruleCodeAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNamespaceAccess().getIntroCodeAnnotationParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_intro_0_0=ruleCodeAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNamespaceRule());
                      					}
                      					add(
                      						current,
                      						"intro",
                      						lv_intro_0_0,
                      						"dut.control.sysmloc.SysMLOC.CodeAnnotation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:99:3: ( (lv_packages_1_0= rulePackage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:100:4: (lv_packages_1_0= rulePackage )
            	    {
            	    // InternalSysMLOC.g:100:4: (lv_packages_1_0= rulePackage )
            	    // InternalSysMLOC.g:101:5: lv_packages_1_0= rulePackage
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNamespaceAccess().getPackagesPackageParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_packages_1_0=rulePackage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"packages",
            	      						lv_packages_1_0,
            	      						"dut.control.sysmloc.SysMLOC.Package");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRulePackage"
    // InternalSysMLOC.g:122:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSysMLOC.g:122:48: (iv_rulePackage= rulePackage EOF )
            // InternalSysMLOC.g:123:2: iv_rulePackage= rulePackage EOF
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
    // InternalSysMLOC.g:129:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= rulePackageBodyElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_declaredName_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:135:2: ( (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= rulePackageBodyElement ) )* otherlv_4= '}' ) )
            // InternalSysMLOC.g:136:2: (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= rulePackageBodyElement ) )* otherlv_4= '}' )
            {
            // InternalSysMLOC.g:136:2: (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= rulePackageBodyElement ) )* otherlv_4= '}' )
            // InternalSysMLOC.g:137:3: otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= rulePackageBodyElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
              		
            }
            // InternalSysMLOC.g:141:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:142:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:142:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:143:5: lv_declaredName_1_0= ruleQualifiedName
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
            // InternalSysMLOC.g:164:3: ( (lv_elements_3_0= rulePackageBodyElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_SL_NOTE && LA3_0<=RULE_ML_NOTE)||LA3_0==RULE_REGULAR_COMMENT||(LA3_0>=RULE_ID && LA3_0<=RULE_UNRESTRICTED_NAME)||(LA3_0>=14 && LA3_0<=15)||(LA3_0>=21 && LA3_0<=22)||(LA3_0>=25 && LA3_0<=29)||(LA3_0>=31 && LA3_0<=38)||(LA3_0>=42 && LA3_0<=43)||(LA3_0>=48 && LA3_0<=54)||(LA3_0>=57 && LA3_0<=63)||(LA3_0>=66 && LA3_0<=68)||(LA3_0>=70 && LA3_0<=76)||(LA3_0>=81 && LA3_0<=88)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSysMLOC.g:165:4: (lv_elements_3_0= rulePackageBodyElement )
            	    {
            	    // InternalSysMLOC.g:165:4: (lv_elements_3_0= rulePackageBodyElement )
            	    // InternalSysMLOC.g:166:5: lv_elements_3_0= rulePackageBodyElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackageAccess().getElementsPackageBodyElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=rulePackageBodyElement();

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
            	      						"dut.control.sysmloc.SysMLOC.PackageBodyElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRulePackageBodyElement"
    // InternalSysMLOC.g:191:1: entryRulePackageBodyElement returns [EObject current=null] : iv_rulePackageBodyElement= rulePackageBodyElement EOF ;
    public final EObject entryRulePackageBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageBodyElement = null;


        try {
            // InternalSysMLOC.g:191:59: (iv_rulePackageBodyElement= rulePackageBodyElement EOF )
            // InternalSysMLOC.g:192:2: iv_rulePackageBodyElement= rulePackageBodyElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageBodyElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageBodyElement=rulePackageBodyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageBodyElement; 
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
    // $ANTLR end "entryRulePackageBodyElement"


    // $ANTLR start "rulePackageBodyElement"
    // InternalSysMLOC.g:198:1: rulePackageBodyElement returns [EObject current=null] : (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_AliasElement_4= ruleAliasElement | this_ImportElement_5= ruleImportElement | this_CodeAnnotation_6= ruleCodeAnnotation ) ;
    public final EObject rulePackageBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_AnnotatingElement_1 = null;

        EObject this_DefinitionElement_2 = null;

        EObject this_UsageElement_3 = null;

        EObject this_AliasElement_4 = null;

        EObject this_ImportElement_5 = null;

        EObject this_CodeAnnotation_6 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:204:2: ( (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_AliasElement_4= ruleAliasElement | this_ImportElement_5= ruleImportElement | this_CodeAnnotation_6= ruleCodeAnnotation ) )
            // InternalSysMLOC.g:205:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_AliasElement_4= ruleAliasElement | this_ImportElement_5= ruleImportElement | this_CodeAnnotation_6= ruleCodeAnnotation )
            {
            // InternalSysMLOC.g:205:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_AliasElement_4= ruleAliasElement | this_ImportElement_5= ruleImportElement | this_CodeAnnotation_6= ruleCodeAnnotation )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSysMLOC.g:206:3: this_Package_0= rulePackage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getPackageParserRuleCall_0());
                      		
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
                    // InternalSysMLOC.g:215:3: this_AnnotatingElement_1= ruleAnnotatingElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getAnnotatingElementParserRuleCall_1());
                      		
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
                    // InternalSysMLOC.g:224:3: this_DefinitionElement_2= ruleDefinitionElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getDefinitionElementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefinitionElement_2=ruleDefinitionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionElement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:233:3: this_UsageElement_3= ruleUsageElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getUsageElementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UsageElement_3=ruleUsageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UsageElement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:242:3: this_AliasElement_4= ruleAliasElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getAliasElementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AliasElement_4=ruleAliasElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AliasElement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:251:3: this_ImportElement_5= ruleImportElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getImportElementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportElement_5=ruleImportElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ImportElement_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSysMLOC.g:260:3: this_CodeAnnotation_6= ruleCodeAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageBodyElementAccess().getCodeAnnotationParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CodeAnnotation_6=ruleCodeAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CodeAnnotation_6;
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
    // $ANTLR end "rulePackageBodyElement"


    // $ANTLR start "entryRuleDefinitionBodyElement"
    // InternalSysMLOC.g:272:1: entryRuleDefinitionBodyElement returns [EObject current=null] : iv_ruleDefinitionBodyElement= ruleDefinitionBodyElement EOF ;
    public final EObject entryRuleDefinitionBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionBodyElement = null;


        try {
            // InternalSysMLOC.g:272:62: (iv_ruleDefinitionBodyElement= ruleDefinitionBodyElement EOF )
            // InternalSysMLOC.g:273:2: iv_ruleDefinitionBodyElement= ruleDefinitionBodyElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionBodyElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionBodyElement=ruleDefinitionBodyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionBodyElement; 
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
    // $ANTLR end "entryRuleDefinitionBodyElement"


    // $ANTLR start "ruleDefinitionBodyElement"
    // InternalSysMLOC.g:279:1: ruleDefinitionBodyElement returns [EObject current=null] : (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_CodeAnnotation_4= ruleCodeAnnotation | this_AliasElement_5= ruleAliasElement ) ;
    public final EObject ruleDefinitionBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotatingElement_0 = null;

        EObject this_ImportElement_1 = null;

        EObject this_DefinitionElement_2 = null;

        EObject this_UsageElement_3 = null;

        EObject this_CodeAnnotation_4 = null;

        EObject this_AliasElement_5 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:285:2: ( (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_CodeAnnotation_4= ruleCodeAnnotation | this_AliasElement_5= ruleAliasElement ) )
            // InternalSysMLOC.g:286:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_CodeAnnotation_4= ruleCodeAnnotation | this_AliasElement_5= ruleAliasElement )
            {
            // InternalSysMLOC.g:286:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_CodeAnnotation_4= ruleCodeAnnotation | this_AliasElement_5= ruleAliasElement )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSysMLOC.g:287:3: this_AnnotatingElement_0= ruleAnnotatingElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionBodyElementAccess().getAnnotatingElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AnnotatingElement_0=ruleAnnotatingElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnnotatingElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:296:3: this_ImportElement_1= ruleImportElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionBodyElementAccess().getImportElementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportElement_1=ruleImportElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ImportElement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:305:3: this_DefinitionElement_2= ruleDefinitionElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionBodyElementAccess().getDefinitionElementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefinitionElement_2=ruleDefinitionElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionElement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:314:3: this_UsageElement_3= ruleUsageElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionBodyElementAccess().getUsageElementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UsageElement_3=ruleUsageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UsageElement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:323:3: this_CodeAnnotation_4= ruleCodeAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionBodyElementAccess().getCodeAnnotationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CodeAnnotation_4=ruleCodeAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CodeAnnotation_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:332:3: this_AliasElement_5= ruleAliasElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionBodyElementAccess().getAliasElementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AliasElement_5=ruleAliasElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AliasElement_5;
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
    // $ANTLR end "ruleDefinitionBodyElement"


    // $ANTLR start "entryRuleUsageBodyElement"
    // InternalSysMLOC.g:344:1: entryRuleUsageBodyElement returns [EObject current=null] : iv_ruleUsageBodyElement= ruleUsageBodyElement EOF ;
    public final EObject entryRuleUsageBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageBodyElement = null;


        try {
            // InternalSysMLOC.g:344:57: (iv_ruleUsageBodyElement= ruleUsageBodyElement EOF )
            // InternalSysMLOC.g:345:2: iv_ruleUsageBodyElement= ruleUsageBodyElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUsageBodyElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUsageBodyElement=ruleUsageBodyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUsageBodyElement; 
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
    // $ANTLR end "entryRuleUsageBodyElement"


    // $ANTLR start "ruleUsageBodyElement"
    // InternalSysMLOC.g:351:1: ruleUsageBodyElement returns [EObject current=null] : this_DefinitionBodyElement_0= ruleDefinitionBodyElement ;
    public final EObject ruleUsageBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionBodyElement_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:357:2: (this_DefinitionBodyElement_0= ruleDefinitionBodyElement )
            // InternalSysMLOC.g:358:2: this_DefinitionBodyElement_0= ruleDefinitionBodyElement
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUsageBodyElementAccess().getDefinitionBodyElementParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_DefinitionBodyElement_0=ruleDefinitionBodyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DefinitionBodyElement_0;
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
    // $ANTLR end "ruleUsageBodyElement"


    // $ANTLR start "entryRuleEnumerationBodyElement"
    // InternalSysMLOC.g:369:1: entryRuleEnumerationBodyElement returns [EObject current=null] : iv_ruleEnumerationBodyElement= ruleEnumerationBodyElement EOF ;
    public final EObject entryRuleEnumerationBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationBodyElement = null;


        try {
            // InternalSysMLOC.g:369:63: (iv_ruleEnumerationBodyElement= ruleEnumerationBodyElement EOF )
            // InternalSysMLOC.g:370:2: iv_ruleEnumerationBodyElement= ruleEnumerationBodyElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationBodyElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationBodyElement=ruleEnumerationBodyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationBodyElement; 
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
    // $ANTLR end "entryRuleEnumerationBodyElement"


    // $ANTLR start "ruleEnumerationBodyElement"
    // InternalSysMLOC.g:376:1: ruleEnumerationBodyElement returns [EObject current=null] : (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement ) ;
    public final EObject ruleEnumerationBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotatingElement_0 = null;

        EObject this_EnumerationElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:382:2: ( (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement ) )
            // InternalSysMLOC.g:383:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement )
            {
            // InternalSysMLOC.g:383:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_REGULAR_COMMENT||LA6_0==22||(LA6_0>=25 && LA6_0<=28)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_UNRESTRICTED_NAME)||LA6_0==15||LA6_0==21||LA6_0==31||(LA6_0>=57 && LA6_0<=63)||(LA6_0>=66 && LA6_0<=68)||(LA6_0>=70 && LA6_0<=76)) ) {
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
                    // InternalSysMLOC.g:384:3: this_AnnotatingElement_0= ruleAnnotatingElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnumerationBodyElementAccess().getAnnotatingElementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AnnotatingElement_0=ruleAnnotatingElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnnotatingElement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:393:3: this_EnumerationElement_1= ruleEnumerationElement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnumerationBodyElementAccess().getEnumerationElementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumerationElement_1=ruleEnumerationElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumerationElement_1;
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
    // $ANTLR end "ruleEnumerationBodyElement"


    // $ANTLR start "entryRuleAnnotatingElement"
    // InternalSysMLOC.g:405:1: entryRuleAnnotatingElement returns [EObject current=null] : iv_ruleAnnotatingElement= ruleAnnotatingElement EOF ;
    public final EObject entryRuleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatingElement = null;


        try {
            // InternalSysMLOC.g:405:58: (iv_ruleAnnotatingElement= ruleAnnotatingElement EOF )
            // InternalSysMLOC.g:406:2: iv_ruleAnnotatingElement= ruleAnnotatingElement EOF
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
    // InternalSysMLOC.g:412:1: ruleAnnotatingElement returns [EObject current=null] : (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation ) ;
    public final EObject ruleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;

        EObject this_Documentation_1 = null;

        EObject this_TextualRepresentation_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:418:2: ( (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation ) )
            // InternalSysMLOC.g:419:2: (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation )
            {
            // InternalSysMLOC.g:419:2: (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_REGULAR_COMMENT:
            case 22:
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSysMLOC.g:420:3: this_Comment_0= ruleComment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalSysMLOC.g:429:3: this_Documentation_1= ruleDocumentation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotatingElementAccess().getDocumentationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Documentation_1=ruleDocumentation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Documentation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:438:3: this_TextualRepresentation_2= ruleTextualRepresentation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotatingElementAccess().getTextualRepresentationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TextualRepresentation_2=ruleTextualRepresentation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextualRepresentation_2;
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
    // $ANTLR end "ruleAnnotatingElement"


    // $ANTLR start "entryRuleImportElement"
    // InternalSysMLOC.g:450:1: entryRuleImportElement returns [EObject current=null] : iv_ruleImportElement= ruleImportElement EOF ;
    public final EObject entryRuleImportElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportElement = null;


        try {
            // InternalSysMLOC.g:450:54: (iv_ruleImportElement= ruleImportElement EOF )
            // InternalSysMLOC.g:451:2: iv_ruleImportElement= ruleImportElement EOF
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
    // InternalSysMLOC.g:457:1: ruleImportElement returns [EObject current=null] : (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport ) ;
    public final EObject ruleImportElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceImport_0 = null;

        EObject this_MembershipImport_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:463:2: ( (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport ) )
            // InternalSysMLOC.g:464:2: (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport )
            {
            // InternalSysMLOC.g:464:2: (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:465:3: this_NamespaceImport_0= ruleNamespaceImport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImportElementAccess().getNamespaceImportParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalSysMLOC.g:474:3: this_MembershipImport_1= ruleMembershipImport
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getImportElementAccess().getMembershipImportParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MembershipImport_1=ruleMembershipImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MembershipImport_1;
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
    // $ANTLR end "ruleImportElement"


    // $ANTLR start "entryRuleDefinitionElement"
    // InternalSysMLOC.g:486:1: entryRuleDefinitionElement returns [EObject current=null] : iv_ruleDefinitionElement= ruleDefinitionElement EOF ;
    public final EObject entryRuleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionElement = null;


        try {
            // InternalSysMLOC.g:486:58: (iv_ruleDefinitionElement= ruleDefinitionElement EOF )
            // InternalSysMLOC.g:487:2: iv_ruleDefinitionElement= ruleDefinitionElement EOF
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
    // InternalSysMLOC.g:493:1: ruleDefinitionElement returns [EObject current=null] : (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition ) ;
    public final EObject ruleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeDefinition_0 = null;

        EObject this_EnumerationDefinition_1 = null;

        EObject this_ItemDefinition_2 = null;

        EObject this_PartDefinition_3 = null;

        EObject this_ConnectionDefinition_4 = null;

        EObject this_FlowConnectionDefinition_5 = null;

        EObject this_InterfaceDefinition_6 = null;

        EObject this_PortDefinition_7 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:499:2: ( (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition ) )
            // InternalSysMLOC.g:500:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition )
            {
            // InternalSysMLOC.g:500:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:501:3: this_AttributeDefinition_0= ruleAttributeDefinition
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
                    // InternalSysMLOC.g:510:3: this_EnumerationDefinition_1= ruleEnumerationDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getEnumerationDefinitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumerationDefinition_1=ruleEnumerationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumerationDefinition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:519:3: this_ItemDefinition_2= ruleItemDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getItemDefinitionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ItemDefinition_2=ruleItemDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ItemDefinition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:528:3: this_PartDefinition_3= rulePartDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PartDefinition_3=rulePartDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PartDefinition_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:537:3: this_ConnectionDefinition_4= ruleConnectionDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getConnectionDefinitionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConnectionDefinition_4=ruleConnectionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConnectionDefinition_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:546:3: this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getFlowConnectionDefinitionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FlowConnectionDefinition_5=ruleFlowConnectionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FlowConnectionDefinition_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalSysMLOC.g:555:3: this_InterfaceDefinition_6= ruleInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getInterfaceDefinitionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfaceDefinition_6=ruleInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InterfaceDefinition_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalSysMLOC.g:564:3: this_PortDefinition_7= rulePortDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionElementAccess().getPortDefinitionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PortDefinition_7=rulePortDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PortDefinition_7;
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
    // InternalSysMLOC.g:576:1: entryRuleUsageElement returns [EObject current=null] : iv_ruleUsageElement= ruleUsageElement EOF ;
    public final EObject entryRuleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageElement = null;


        try {
            // InternalSysMLOC.g:576:53: (iv_ruleUsageElement= ruleUsageElement EOF )
            // InternalSysMLOC.g:577:2: iv_ruleUsageElement= ruleUsageElement EOF
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
    // InternalSysMLOC.g:583:1: ruleUsageElement returns [EObject current=null] : (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) ;
    public final EObject ruleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_NonOccurrenceUsageElement_0 = null;

        EObject this_OccurrenceUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:589:2: ( (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) )
            // InternalSysMLOC.g:590:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            {
            // InternalSysMLOC.g:590:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSysMLOC.g:591:3: this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement
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
                    // InternalSysMLOC.g:600:3: this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement
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
    // InternalSysMLOC.g:612:1: entryRuleNonOccurrenceUsageElement returns [EObject current=null] : iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF ;
    public final EObject entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:612:66: (iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:613:2: iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF
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
    // InternalSysMLOC.g:619:1: ruleNonOccurrenceUsageElement returns [EObject current=null] : (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage ) ;
    public final EObject ruleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeUsage_0 = null;

        EObject this_EnumerationUsage_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:625:2: ( (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage ) )
            // InternalSysMLOC.g:626:2: (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage )
            {
            // InternalSysMLOC.g:626:2: (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29||(LA11_0>=81 && LA11_0<=83)) ) {
                alt11=1;
            }
            else if ( (LA11_0==31||(LA11_0>=49 && LA11_0<=54)||(LA11_0>=84 && LA11_0<=86)) ) {
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
                    // InternalSysMLOC.g:627:3: this_AttributeUsage_0= ruleAttributeUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonOccurrenceUsageElementAccess().getAttributeUsageParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalSysMLOC.g:636:3: this_EnumerationUsage_1= ruleEnumerationUsage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonOccurrenceUsageElementAccess().getEnumerationUsageParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumerationUsage_1=ruleEnumerationUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumerationUsage_1;
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
    // $ANTLR end "ruleNonOccurrenceUsageElement"


    // $ANTLR start "entryRuleOccurrenceUsageElement"
    // InternalSysMLOC.g:648:1: entryRuleOccurrenceUsageElement returns [EObject current=null] : iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF ;
    public final EObject entryRuleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:648:63: (iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:649:2: iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF
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
    // InternalSysMLOC.g:655:1: ruleOccurrenceUsageElement returns [EObject current=null] : (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) ;
    public final EObject ruleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_StructureUsageElement_0 = null;

        EObject this_BehaviorUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:661:2: ( (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) )
            // InternalSysMLOC.g:662:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            {
            // InternalSysMLOC.g:662:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSysMLOC.g:663:3: this_StructureUsageElement_0= ruleStructureUsageElement
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
                    // InternalSysMLOC.g:672:3: this_BehaviorUsageElement_1= ruleBehaviorUsageElement
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
    // InternalSysMLOC.g:684:1: entryRuleStructureUsageElement returns [EObject current=null] : iv_ruleStructureUsageElement= ruleStructureUsageElement EOF ;
    public final EObject entryRuleStructureUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureUsageElement = null;


        try {
            // InternalSysMLOC.g:684:62: (iv_ruleStructureUsageElement= ruleStructureUsageElement EOF )
            // InternalSysMLOC.g:685:2: iv_ruleStructureUsageElement= ruleStructureUsageElement EOF
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
    // InternalSysMLOC.g:691:1: ruleStructureUsageElement returns [EObject current=null] : (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage ) ;
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
            // InternalSysMLOC.g:697:2: ( (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage ) )
            // InternalSysMLOC.g:698:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )
            {
            // InternalSysMLOC.g:698:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )
            int alt13=6;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSysMLOC.g:699:3: this_ItemUsage_0= ruleItemUsage
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
                    // InternalSysMLOC.g:708:3: this_PartUsage_1= rulePartUsage
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
                    // InternalSysMLOC.g:717:3: this_PortUsage_2= rulePortUsage
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
                    // InternalSysMLOC.g:726:3: this_ConnectionUsage_3= ruleConnectionUsage
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
                    // InternalSysMLOC.g:735:3: this_InterfaceUsage_4= ruleInterfaceUsage
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
                    // InternalSysMLOC.g:744:3: this_FlowConnectionUsage_5= ruleFlowConnectionUsage
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
    // InternalSysMLOC.g:756:1: entryRuleBehaviorUsageElement returns [EObject current=null] : iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF ;
    public final EObject entryRuleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorUsageElement = null;


        try {
            // InternalSysMLOC.g:756:61: (iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF )
            // InternalSysMLOC.g:757:2: iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF
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
    // InternalSysMLOC.g:763:1: ruleBehaviorUsageElement returns [EObject current=null] : this_ActionUsage_0= ruleActionUsage ;
    public final EObject ruleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:769:2: (this_ActionUsage_0= ruleActionUsage )
            // InternalSysMLOC.g:770:2: this_ActionUsage_0= ruleActionUsage
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


    // $ANTLR start "entryRuleEnumerationElement"
    // InternalSysMLOC.g:781:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalSysMLOC.g:781:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalSysMLOC.g:782:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationElement=ruleEnumerationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationElement; 
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
    // $ANTLR end "entryRuleEnumerationElement"


    // $ANTLR start "ruleEnumerationElement"
    // InternalSysMLOC.g:788:1: ruleEnumerationElement returns [EObject current=null] : this_EnumeratedValue_0= ruleEnumeratedValue ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumeratedValue_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:794:2: (this_EnumeratedValue_0= ruleEnumeratedValue )
            // InternalSysMLOC.g:795:2: this_EnumeratedValue_0= ruleEnumeratedValue
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEnumerationElementAccess().getEnumeratedValueParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EnumeratedValue_0=ruleEnumeratedValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_EnumeratedValue_0;
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
    // $ANTLR end "ruleEnumerationElement"


    // $ANTLR start "entryRuleNamespaceImport"
    // InternalSysMLOC.g:806:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // InternalSysMLOC.g:806:56: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // InternalSysMLOC.g:807:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
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
    // InternalSysMLOC.g:813:1: ruleNamespaceImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleNamespaceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_isRecursive_6_0=null;
        Token otherlv_7=null;
        Enumerator lv_visibility_0_0 = null;

        EObject this_isImportAllFragment_1 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:819:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' ) )
            // InternalSysMLOC.g:820:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' )
            {
            // InternalSysMLOC.g:820:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' )
            // InternalSysMLOC.g:821:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';'
            {
            // InternalSysMLOC.g:821:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:822:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:822:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalSysMLOC.g:823:5: lv_visibility_0_0= ruleVisibilityIndicator
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

            // InternalSysMLOC.g:840:3: (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSysMLOC.g:841:4: this_isImportAllFragment_1= ruleisImportAllFragment[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getNamespaceImportRule());
                      				}
                      				newCompositeNode(grammarAccess.getNamespaceImportAccess().getIsImportAllFragmentParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_isImportAllFragment_1=ruleisImportAllFragment(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_isImportAllFragment_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNamespaceImportAccess().getImportKeyword_2());
              		
            }
            // InternalSysMLOC.g:857:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:858:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:858:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalSysMLOC.g:859:5: lv_declaredName_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNamespaceImportAccess().getDeclaredNameQualifiedNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_declaredName_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNamespaceImportRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_3_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNamespaceImportAccess().getColonColonKeyword_4());
              		
            }
            // InternalSysMLOC.g:880:3: (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalSysMLOC.g:881:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNamespaceImportAccess().getAsteriskKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:886:4: ( (lv_isRecursive_6_0= '**' ) )
                    {
                    // InternalSysMLOC.g:886:4: ( (lv_isRecursive_6_0= '**' ) )
                    // InternalSysMLOC.g:887:5: (lv_isRecursive_6_0= '**' )
                    {
                    // InternalSysMLOC.g:887:5: (lv_isRecursive_6_0= '**' )
                    // InternalSysMLOC.g:888:6: lv_isRecursive_6_0= '**'
                    {
                    lv_isRecursive_6_0=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isRecursive_6_0, grammarAccess.getNamespaceImportAccess().getIsRecursiveAsteriskAsteriskKeyword_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNamespaceImportRule());
                      						}
                      						setWithLastConsumed(current, "isRecursive", lv_isRecursive_6_0 != null, "**");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_6());
              		
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


    // $ANTLR start "entryRuleMembershipImport"
    // InternalSysMLOC.g:909:1: entryRuleMembershipImport returns [EObject current=null] : iv_ruleMembershipImport= ruleMembershipImport EOF ;
    public final EObject entryRuleMembershipImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipImport = null;


        try {
            // InternalSysMLOC.g:909:57: (iv_ruleMembershipImport= ruleMembershipImport EOF )
            // InternalSysMLOC.g:910:2: iv_ruleMembershipImport= ruleMembershipImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMembershipImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMembershipImport=ruleMembershipImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMembershipImport; 
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
    // $ANTLR end "entryRuleMembershipImport"


    // $ANTLR start "ruleMembershipImport"
    // InternalSysMLOC.g:916:1: ruleMembershipImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleMembershipImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_isRecursive_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        EObject this_isImportAllFragment_1 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:922:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' ) )
            // InternalSysMLOC.g:923:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' )
            {
            // InternalSysMLOC.g:923:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' )
            // InternalSysMLOC.g:924:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';'
            {
            // InternalSysMLOC.g:924:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:925:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:925:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalSysMLOC.g:926:5: lv_visibility_0_0= ruleVisibilityIndicator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMembershipImportAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_visibility_0_0=ruleVisibilityIndicator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMembershipImportRule());
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

            // InternalSysMLOC.g:943:3: (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSysMLOC.g:944:4: this_isImportAllFragment_1= ruleisImportAllFragment[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getMembershipImportRule());
                      				}
                      				newCompositeNode(grammarAccess.getMembershipImportAccess().getIsImportAllFragmentParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_isImportAllFragment_1=ruleisImportAllFragment(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_isImportAllFragment_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMembershipImportAccess().getImportKeyword_2());
              		
            }
            // InternalSysMLOC.g:960:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:961:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:961:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalSysMLOC.g:962:5: lv_declaredName_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMembershipImportAccess().getDeclaredNameQualifiedNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_declaredName_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMembershipImportRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_3_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSysMLOC.g:979:3: (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            else if ( (LA17_0==20) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalSysMLOC.g:980:4: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMembershipImportAccess().getAsteriskKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:985:4: ( (lv_isRecursive_5_0= '**' ) )
                    {
                    // InternalSysMLOC.g:985:4: ( (lv_isRecursive_5_0= '**' ) )
                    // InternalSysMLOC.g:986:5: (lv_isRecursive_5_0= '**' )
                    {
                    // InternalSysMLOC.g:986:5: (lv_isRecursive_5_0= '**' )
                    // InternalSysMLOC.g:987:6: lv_isRecursive_5_0= '**'
                    {
                    lv_isRecursive_5_0=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isRecursive_5_0, grammarAccess.getMembershipImportAccess().getIsRecursiveAsteriskAsteriskKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMembershipImportRule());
                      						}
                      						setWithLastConsumed(current, "isRecursive", lv_isRecursive_5_0 != null, "**");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMembershipImportAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleMembershipImport"


    // $ANTLR start "entryRuleCodeAnnotation"
    // InternalSysMLOC.g:1008:1: entryRuleCodeAnnotation returns [EObject current=null] : iv_ruleCodeAnnotation= ruleCodeAnnotation EOF ;
    public final EObject entryRuleCodeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeAnnotation = null;


        try {
            // InternalSysMLOC.g:1008:55: (iv_ruleCodeAnnotation= ruleCodeAnnotation EOF )
            // InternalSysMLOC.g:1009:2: iv_ruleCodeAnnotation= ruleCodeAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCodeAnnotation=ruleCodeAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeAnnotation; 
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
    // $ANTLR end "entryRuleCodeAnnotation"


    // $ANTLR start "ruleCodeAnnotation"
    // InternalSysMLOC.g:1015:1: ruleCodeAnnotation returns [EObject current=null] : ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) ) ;
    public final EObject ruleCodeAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:1021:2: ( ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) ) )
            // InternalSysMLOC.g:1022:2: ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) )
            {
            // InternalSysMLOC.g:1022:2: ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SL_NOTE) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ML_NOTE) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSysMLOC.g:1023:3: ( (lv_body_0_0= RULE_SL_NOTE ) )
                    {
                    // InternalSysMLOC.g:1023:3: ( (lv_body_0_0= RULE_SL_NOTE ) )
                    // InternalSysMLOC.g:1024:4: (lv_body_0_0= RULE_SL_NOTE )
                    {
                    // InternalSysMLOC.g:1024:4: (lv_body_0_0= RULE_SL_NOTE )
                    // InternalSysMLOC.g:1025:5: lv_body_0_0= RULE_SL_NOTE
                    {
                    lv_body_0_0=(Token)match(input,RULE_SL_NOTE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_body_0_0, grammarAccess.getCodeAnnotationAccess().getBodySL_NOTETerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCodeAnnotationRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"body",
                      						lv_body_0_0,
                      						"dut.control.sysmloc.SysMLOC.SL_NOTE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1042:3: ( (lv_body_1_0= RULE_ML_NOTE ) )
                    {
                    // InternalSysMLOC.g:1042:3: ( (lv_body_1_0= RULE_ML_NOTE ) )
                    // InternalSysMLOC.g:1043:4: (lv_body_1_0= RULE_ML_NOTE )
                    {
                    // InternalSysMLOC.g:1043:4: (lv_body_1_0= RULE_ML_NOTE )
                    // InternalSysMLOC.g:1044:5: lv_body_1_0= RULE_ML_NOTE
                    {
                    lv_body_1_0=(Token)match(input,RULE_ML_NOTE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_body_1_0, grammarAccess.getCodeAnnotationAccess().getBodyML_NOTETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCodeAnnotationRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"body",
                      						lv_body_1_0,
                      						"dut.control.sysmloc.SysMLOC.ML_NOTE");
                      				
                    }

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
    // $ANTLR end "ruleCodeAnnotation"


    // $ANTLR start "entryRuleComment"
    // InternalSysMLOC.g:1064:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSysMLOC.g:1064:48: (iv_ruleComment= ruleComment EOF )
            // InternalSysMLOC.g:1065:2: iv_ruleComment= ruleComment EOF
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
    // InternalSysMLOC.g:1071:1: ruleComment returns [EObject current=null] : ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_locale_7_0=null;
        Token lv_body_8_0=null;
        EObject this_Identification_1 = null;

        AntlrDatatypeRuleToken lv_annotatedElement_3_0 = null;

        AntlrDatatypeRuleToken lv_annotatedElement_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1077:2: ( ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:1078:2: ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:1078:2: ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:1079:3: (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) )
            {
            // InternalSysMLOC.g:1079:3: (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSysMLOC.g:1080:4: otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )?
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:1084:4: (this_Identification_1= ruleIdentification[$current] )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)||LA19_0==44) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSysMLOC.g:1085:5: this_Identification_1= ruleIdentification[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getCommentRule());
                              					}
                              					newCompositeNode(grammarAccess.getCommentAccess().getIdentificationParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_13);
                            this_Identification_1=ruleIdentification(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_Identification_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:1097:4: (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==23) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSysMLOC.g:1098:5: otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )*
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getAboutKeyword_0_2_0());
                              				
                            }
                            // InternalSysMLOC.g:1102:5: ( (lv_annotatedElement_3_0= ruleQualifiedName ) )
                            // InternalSysMLOC.g:1103:6: (lv_annotatedElement_3_0= ruleQualifiedName )
                            {
                            // InternalSysMLOC.g:1103:6: (lv_annotatedElement_3_0= ruleQualifiedName )
                            // InternalSysMLOC.g:1104:7: lv_annotatedElement_3_0= ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCommentAccess().getAnnotatedElementQualifiedNameParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_14);
                            lv_annotatedElement_3_0=ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCommentRule());
                              							}
                              							add(
                              								current,
                              								"annotatedElement",
                              								lv_annotatedElement_3_0,
                              								"dut.control.sysmloc.SysMLOC.QualifiedName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalSysMLOC.g:1121:5: (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==24) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalSysMLOC.g:1122:6: otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) )
                            	    {
                            	    otherlv_4=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalSysMLOC.g:1126:6: ( (lv_annotatedElement_5_0= ruleQualifiedName ) )
                            	    // InternalSysMLOC.g:1127:7: (lv_annotatedElement_5_0= ruleQualifiedName )
                            	    {
                            	    // InternalSysMLOC.g:1127:7: (lv_annotatedElement_5_0= ruleQualifiedName )
                            	    // InternalSysMLOC.g:1128:8: lv_annotatedElement_5_0= ruleQualifiedName
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getCommentAccess().getAnnotatedElementQualifiedNameParserRuleCall_0_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_14);
                            	    lv_annotatedElement_5_0=ruleQualifiedName();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getCommentRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"annotatedElement",
                            	      									lv_annotatedElement_5_0,
                            	      									"dut.control.sysmloc.SysMLOC.QualifiedName");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:1148:3: (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSysMLOC.g:1149:4: otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCommentAccess().getLocaleKeyword_1_0());
                      			
                    }
                    // InternalSysMLOC.g:1153:4: ( (lv_locale_7_0= RULE_STRING_VALUE ) )
                    // InternalSysMLOC.g:1154:5: (lv_locale_7_0= RULE_STRING_VALUE )
                    {
                    // InternalSysMLOC.g:1154:5: (lv_locale_7_0= RULE_STRING_VALUE )
                    // InternalSysMLOC.g:1155:6: lv_locale_7_0= RULE_STRING_VALUE
                    {
                    lv_locale_7_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_locale_7_0, grammarAccess.getCommentAccess().getLocaleSTRING_VALUETerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCommentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"locale",
                      							lv_locale_7_0,
                      							"dut.control.sysmloc.SysMLOC.STRING_VALUE");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:1172:3: ( (lv_body_8_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1173:4: (lv_body_8_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1173:4: (lv_body_8_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1174:5: lv_body_8_0= RULE_REGULAR_COMMENT
            {
            lv_body_8_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_body_8_0, grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCommentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"body",
              						lv_body_8_0,
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


    // $ANTLR start "entryRuleDocumentation"
    // InternalSysMLOC.g:1194:1: entryRuleDocumentation returns [EObject current=null] : iv_ruleDocumentation= ruleDocumentation EOF ;
    public final EObject entryRuleDocumentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentation = null;


        try {
            // InternalSysMLOC.g:1194:54: (iv_ruleDocumentation= ruleDocumentation EOF )
            // InternalSysMLOC.g:1195:2: iv_ruleDocumentation= ruleDocumentation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDocumentation=ruleDocumentation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocumentation; 
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
    // $ANTLR end "entryRuleDocumentation"


    // $ANTLR start "ruleDocumentation"
    // InternalSysMLOC.g:1201:1: ruleDocumentation returns [EObject current=null] : (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleDocumentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_locale_3_0=null;
        Token lv_body_4_0=null;
        EObject this_Identification_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1207:2: ( (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:1208:2: (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:1208:2: (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:1209:3: otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDocumentationAccess().getDocKeyword_0());
              		
            }
            // InternalSysMLOC.g:1213:3: (this_Identification_1= ruleIdentification[$current] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_UNRESTRICTED_NAME)||LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSysMLOC.g:1214:4: this_Identification_1= ruleIdentification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDocumentationRule());
                      				}
                      				newCompositeNode(grammarAccess.getDocumentationAccess().getIdentificationParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_Identification_1=ruleIdentification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Identification_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:1226:3: (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSysMLOC.g:1227:4: otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDocumentationAccess().getLocaleKeyword_2_0());
                      			
                    }
                    // InternalSysMLOC.g:1231:4: ( (lv_locale_3_0= RULE_STRING_VALUE ) )
                    // InternalSysMLOC.g:1232:5: (lv_locale_3_0= RULE_STRING_VALUE )
                    {
                    // InternalSysMLOC.g:1232:5: (lv_locale_3_0= RULE_STRING_VALUE )
                    // InternalSysMLOC.g:1233:6: lv_locale_3_0= RULE_STRING_VALUE
                    {
                    lv_locale_3_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_locale_3_0, grammarAccess.getDocumentationAccess().getLocaleSTRING_VALUETerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDocumentationRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"locale",
                      							lv_locale_3_0,
                      							"dut.control.sysmloc.SysMLOC.STRING_VALUE");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:1250:3: ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1251:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1251:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1252:5: lv_body_4_0= RULE_REGULAR_COMMENT
            {
            lv_body_4_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_body_4_0, grammarAccess.getDocumentationAccess().getBodyREGULAR_COMMENTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDocumentationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"body",
              						lv_body_4_0,
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
    // $ANTLR end "ruleDocumentation"


    // $ANTLR start "entryRuleTextualRepresentation"
    // InternalSysMLOC.g:1272:1: entryRuleTextualRepresentation returns [EObject current=null] : iv_ruleTextualRepresentation= ruleTextualRepresentation EOF ;
    public final EObject entryRuleTextualRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualRepresentation = null;


        try {
            // InternalSysMLOC.g:1272:62: (iv_ruleTextualRepresentation= ruleTextualRepresentation EOF )
            // InternalSysMLOC.g:1273:2: iv_ruleTextualRepresentation= ruleTextualRepresentation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextualRepresentationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTextualRepresentation=ruleTextualRepresentation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextualRepresentation; 
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
    // $ANTLR end "entryRuleTextualRepresentation"


    // $ANTLR start "ruleTextualRepresentation"
    // InternalSysMLOC.g:1279:1: ruleTextualRepresentation returns [EObject current=null] : ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleTextualRepresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_language_3_0=null;
        Token lv_body_4_0=null;
        EObject this_Identification_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1285:2: ( ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:1286:2: ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:1286:2: ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:1287:3: (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            {
            // InternalSysMLOC.g:1287:3: (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSysMLOC.g:1288:4: otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )?
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTextualRepresentationAccess().getRepKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:1292:4: (this_Identification_1= ruleIdentification[$current] )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_UNRESTRICTED_NAME)||LA26_0==44) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSysMLOC.g:1293:5: this_Identification_1= ruleIdentification[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getTextualRepresentationRule());
                              					}
                              					newCompositeNode(grammarAccess.getTextualRepresentationAccess().getIdentificationParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_20);
                            this_Identification_1=ruleIdentification(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_Identification_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTextualRepresentationAccess().getLanguageKeyword_1());
              		
            }
            // InternalSysMLOC.g:1310:3: ( (lv_language_3_0= RULE_STRING_VALUE ) )
            // InternalSysMLOC.g:1311:4: (lv_language_3_0= RULE_STRING_VALUE )
            {
            // InternalSysMLOC.g:1311:4: (lv_language_3_0= RULE_STRING_VALUE )
            // InternalSysMLOC.g:1312:5: lv_language_3_0= RULE_STRING_VALUE
            {
            lv_language_3_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_language_3_0, grammarAccess.getTextualRepresentationAccess().getLanguageSTRING_VALUETerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTextualRepresentationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"language",
              						lv_language_3_0,
              						"dut.control.sysmloc.SysMLOC.STRING_VALUE");
              				
            }

            }


            }

            // InternalSysMLOC.g:1328:3: ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1329:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1329:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1330:5: lv_body_4_0= RULE_REGULAR_COMMENT
            {
            lv_body_4_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_body_4_0, grammarAccess.getTextualRepresentationAccess().getBodyREGULAR_COMMENTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTextualRepresentationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"body",
              						lv_body_4_0,
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
    // $ANTLR end "ruleTextualRepresentation"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalSysMLOC.g:1350:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSysMLOC.g:1350:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:1351:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalSysMLOC.g:1357:1: ruleAttributeDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_DefinitionPrefix_1 = null;

        EObject this_DefinitionDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1363:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:1364:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:1364:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:1365:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefinitionPrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_22);
            this_DefinitionPrefix_1=ruleDefinitionPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionPrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getDefKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefinitionDeclarationParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_4=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1406:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            else if ( (LA29_0==15) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSysMLOC.g:1407:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1412:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:1412:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:1413:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1417:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_SL_NOTE && LA28_0<=RULE_ML_NOTE)||LA28_0==RULE_REGULAR_COMMENT||(LA28_0>=RULE_ID && LA28_0<=RULE_UNRESTRICTED_NAME)||LA28_0==15||(LA28_0>=21 && LA28_0<=22)||(LA28_0>=25 && LA28_0<=29)||(LA28_0>=31 && LA28_0<=38)||(LA28_0>=42 && LA28_0<=43)||(LA28_0>=48 && LA28_0<=54)||(LA28_0>=57 && LA28_0<=63)||(LA28_0>=66 && LA28_0<=68)||(LA28_0>=70 && LA28_0<=76)||(LA28_0>=81 && LA28_0<=88)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1418:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1418:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:1419:7: lv_elements_7_0= ruleDefinitionBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getElementsDefinitionBodyElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleDefinitionBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"dut.control.sysmloc.SysMLOC.DefinitionBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_5_1_2());
                      				
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
    // InternalSysMLOC.g:1446:1: entryRuleAttributeUsage returns [EObject current=null] : iv_ruleAttributeUsage= ruleAttributeUsage EOF ;
    public final EObject entryRuleAttributeUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeUsage = null;


        try {
            // InternalSysMLOC.g:1446:55: (iv_ruleAttributeUsage= ruleAttributeUsage EOF )
            // InternalSysMLOC.g:1447:2: iv_ruleAttributeUsage= ruleAttributeUsage EOF
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
    // InternalSysMLOC.g:1453:1: ruleAttributeUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleAttributeUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_Usage_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1459:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1460:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1460:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1461:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAttributeUsageRule());
              			}
              			newCompositeNode(grammarAccess.getAttributeUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeUsageAccess().getAttributeKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAttributeUsageRule());
              			}
              			newCompositeNode(grammarAccess.getAttributeUsageAccess().getUsageParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_25);
            this_Usage_2=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1487:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            else if ( (LA31_0==15) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSysMLOC.g:1488:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1493:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1493:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1494:5: otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1498:5: ( (lv_elements_5_0= ruleUsageBodyElement ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_SL_NOTE && LA30_0<=RULE_ML_NOTE)||LA30_0==RULE_REGULAR_COMMENT||(LA30_0>=RULE_ID && LA30_0<=RULE_UNRESTRICTED_NAME)||LA30_0==15||(LA30_0>=21 && LA30_0<=22)||(LA30_0>=25 && LA30_0<=29)||(LA30_0>=31 && LA30_0<=38)||(LA30_0>=42 && LA30_0<=43)||(LA30_0>=48 && LA30_0<=54)||(LA30_0>=57 && LA30_0<=63)||(LA30_0>=66 && LA30_0<=68)||(LA30_0>=70 && LA30_0<=76)||(LA30_0>=81 && LA30_0<=88)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1499:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1499:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1500:7: lv_elements_5_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAttributeUsageAccess().getElementsUsageBodyElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAttributeUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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


    // $ANTLR start "entryRuleEnumerationDefinition"
    // InternalSysMLOC.g:1527:1: entryRuleEnumerationDefinition returns [EObject current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final EObject entryRuleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDefinition = null;


        try {
            // InternalSysMLOC.g:1527:62: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // InternalSysMLOC.g:1528:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationDefinition=ruleEnumerationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationDefinition; 
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
    // $ANTLR end "entryRuleEnumerationDefinition"


    // $ANTLR start "ruleEnumerationDefinition"
    // InternalSysMLOC.g:1534:1: ruleEnumerationDefinition returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleEnumerationDefinition() throws RecognitionException {
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
            // InternalSysMLOC.g:1540:2: ( (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1541:2: (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1541:2: (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1542:3: otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationDefinitionAccess().getEnumKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumerationDefinitionAccess().getDefKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEnumerationDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getDefinitionDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_2=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1561:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            else if ( (LA33_0==15) ) {
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
                    // InternalSysMLOC.g:1562:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEnumerationDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1567:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1567:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1568:5: otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1572:5: ( (lv_elements_5_0= ruleEnumerationBodyElement ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_REGULAR_COMMENT||(LA32_0>=RULE_ID && LA32_0<=RULE_UNRESTRICTED_NAME)||LA32_0==15||(LA32_0>=21 && LA32_0<=22)||(LA32_0>=25 && LA32_0<=28)||LA32_0==31||(LA32_0>=57 && LA32_0<=63)||(LA32_0>=66 && LA32_0<=68)||(LA32_0>=70 && LA32_0<=76)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1573:6: (lv_elements_5_0= ruleEnumerationBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1573:6: (lv_elements_5_0= ruleEnumerationBodyElement )
                    	    // InternalSysMLOC.g:1574:7: lv_elements_5_0= ruleEnumerationBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getElementsEnumerationBodyElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_elements_5_0=ruleEnumerationBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnumerationDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"dut.control.sysmloc.SysMLOC.EnumerationBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "ruleEnumerationDefinition"


    // $ANTLR start "entryRuleEnumeratedValue"
    // InternalSysMLOC.g:1601:1: entryRuleEnumeratedValue returns [EObject current=null] : iv_ruleEnumeratedValue= ruleEnumeratedValue EOF ;
    public final EObject entryRuleEnumeratedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeratedValue = null;


        try {
            // InternalSysMLOC.g:1601:56: (iv_ruleEnumeratedValue= ruleEnumeratedValue EOF )
            // InternalSysMLOC.g:1602:2: iv_ruleEnumeratedValue= ruleEnumeratedValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratedValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumeratedValue=ruleEnumeratedValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeratedValue; 
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
    // $ANTLR end "entryRuleEnumeratedValue"


    // $ANTLR start "ruleEnumeratedValue"
    // InternalSysMLOC.g:1608:1: ruleEnumeratedValue returns [EObject current=null] : ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) ) ;
    public final EObject ruleEnumeratedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Usage_1 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1614:2: ( ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:1615:2: ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:1615:2: ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:1616:3: (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) )
            {
            // InternalSysMLOC.g:1616:3: (otherlv_0= 'enum' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSysMLOC.g:1617:4: otherlv_0= 'enum'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getEnumeratedValueAccess().getEnumKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEnumeratedValueRule());
              			}
              			newCompositeNode(grammarAccess.getEnumeratedValueAccess().getUsageParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_25);
            this_Usage_1=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1633:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            else if ( (LA36_0==15) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSysMLOC.g:1634:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEnumeratedValueAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1639:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:1639:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:1640:5: otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getEnumeratedValueAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1644:5: ( (lv_elements_4_0= ruleUsageBodyElement ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=RULE_SL_NOTE && LA35_0<=RULE_ML_NOTE)||LA35_0==RULE_REGULAR_COMMENT||(LA35_0>=RULE_ID && LA35_0<=RULE_UNRESTRICTED_NAME)||LA35_0==15||(LA35_0>=21 && LA35_0<=22)||(LA35_0>=25 && LA35_0<=29)||(LA35_0>=31 && LA35_0<=38)||(LA35_0>=42 && LA35_0<=43)||(LA35_0>=48 && LA35_0<=54)||(LA35_0>=57 && LA35_0<=63)||(LA35_0>=66 && LA35_0<=68)||(LA35_0>=70 && LA35_0<=76)||(LA35_0>=81 && LA35_0<=88)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1645:6: (lv_elements_4_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1645:6: (lv_elements_4_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1646:7: lv_elements_4_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnumeratedValueAccess().getElementsUsageBodyElementParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_4_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnumeratedValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getEnumeratedValueAccess().getRightCurlyBracketKeyword_2_1_2());
                      				
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
    // $ANTLR end "ruleEnumeratedValue"


    // $ANTLR start "entryRuleEnumerationUsage"
    // InternalSysMLOC.g:1673:1: entryRuleEnumerationUsage returns [EObject current=null] : iv_ruleEnumerationUsage= ruleEnumerationUsage EOF ;
    public final EObject entryRuleEnumerationUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationUsage = null;


        try {
            // InternalSysMLOC.g:1673:57: (iv_ruleEnumerationUsage= ruleEnumerationUsage EOF )
            // InternalSysMLOC.g:1674:2: iv_ruleEnumerationUsage= ruleEnumerationUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationUsage=ruleEnumerationUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationUsage; 
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
    // $ANTLR end "entryRuleEnumerationUsage"


    // $ANTLR start "ruleEnumerationUsage"
    // InternalSysMLOC.g:1680:1: ruleEnumerationUsage returns [EObject current=null] : (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleEnumerationUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UsagePrefix_0 = null;

        EObject this_Usage_2 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1686:2: ( (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1687:2: (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1687:2: (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1688:3: this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEnumerationUsageRule());
              			}
              			newCompositeNode(grammarAccess.getEnumerationUsageAccess().getUsagePrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_UsagePrefix_0=ruleUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UsagePrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumerationUsageAccess().getEnumKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEnumerationUsageRule());
              			}
              			newCompositeNode(grammarAccess.getEnumerationUsageAccess().getUsageParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_25);
            this_Usage_2=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1714:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            else if ( (LA38_0==15) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSysMLOC.g:1715:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEnumerationUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1720:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1720:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1721:5: otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getEnumerationUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1725:5: ( (lv_elements_5_0= ruleUsageBodyElement ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=RULE_SL_NOTE && LA37_0<=RULE_ML_NOTE)||LA37_0==RULE_REGULAR_COMMENT||(LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)||LA37_0==15||(LA37_0>=21 && LA37_0<=22)||(LA37_0>=25 && LA37_0<=29)||(LA37_0>=31 && LA37_0<=38)||(LA37_0>=42 && LA37_0<=43)||(LA37_0>=48 && LA37_0<=54)||(LA37_0>=57 && LA37_0<=63)||(LA37_0>=66 && LA37_0<=68)||(LA37_0>=70 && LA37_0<=76)||(LA37_0>=81 && LA37_0<=88)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1726:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1726:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1727:7: lv_elements_5_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnumerationUsageAccess().getElementsUsageBodyElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnumerationUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getEnumerationUsageAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // $ANTLR end "ruleEnumerationUsage"


    // $ANTLR start "entryRuleItemDefinition"
    // InternalSysMLOC.g:1754:1: entryRuleItemDefinition returns [EObject current=null] : iv_ruleItemDefinition= ruleItemDefinition EOF ;
    public final EObject entryRuleItemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDefinition = null;


        try {
            // InternalSysMLOC.g:1754:55: (iv_ruleItemDefinition= ruleItemDefinition EOF )
            // InternalSysMLOC.g:1755:2: iv_ruleItemDefinition= ruleItemDefinition EOF
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
    // InternalSysMLOC.g:1761:1: ruleItemDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleItemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceDefinitionPrefix_1 = null;

        EObject this_DefinitionDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1767:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:1768:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:1768:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:1769:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getItemDefinitionAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getItemDefinitionAccess().getOccurrenceDefinitionPrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_30);
            this_OccurrenceDefinitionPrefix_1=ruleOccurrenceDefinitionPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceDefinitionPrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getItemDefinitionAccess().getItemKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getItemDefinitionAccess().getDefKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getItemDefinitionAccess().getDefinitionDeclarationParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_4=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1810:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            else if ( (LA40_0==15) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSysMLOC.g:1811:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getItemDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1816:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:1816:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:1817:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getItemDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1821:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=RULE_SL_NOTE && LA39_0<=RULE_ML_NOTE)||LA39_0==RULE_REGULAR_COMMENT||(LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)||LA39_0==15||(LA39_0>=21 && LA39_0<=22)||(LA39_0>=25 && LA39_0<=29)||(LA39_0>=31 && LA39_0<=38)||(LA39_0>=42 && LA39_0<=43)||(LA39_0>=48 && LA39_0<=54)||(LA39_0>=57 && LA39_0<=63)||(LA39_0>=66 && LA39_0<=68)||(LA39_0>=70 && LA39_0<=76)||(LA39_0>=81 && LA39_0<=88)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1822:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1822:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:1823:7: lv_elements_7_0= ruleDefinitionBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getItemDefinitionAccess().getElementsDefinitionBodyElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleDefinitionBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getItemDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"dut.control.sysmloc.SysMLOC.DefinitionBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getItemDefinitionAccess().getRightCurlyBracketKeyword_5_1_2());
                      				
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
    // InternalSysMLOC.g:1850:1: entryRuleItemUsage returns [EObject current=null] : iv_ruleItemUsage= ruleItemUsage EOF ;
    public final EObject entryRuleItemUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemUsage = null;


        try {
            // InternalSysMLOC.g:1850:50: (iv_ruleItemUsage= ruleItemUsage EOF )
            // InternalSysMLOC.g:1851:2: iv_ruleItemUsage= ruleItemUsage EOF
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
    // InternalSysMLOC.g:1857:1: ruleItemUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleItemUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceUsagePrefix_1 = null;

        EObject this_Usage_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1863:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:1864:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:1864:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:1865:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemUsageRule());
              			}
              			newCompositeNode(grammarAccess.getItemUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemUsageRule());
              			}
              			newCompositeNode(grammarAccess.getItemUsageAccess().getOccurrenceUsagePrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_30);
            this_OccurrenceUsagePrefix_1=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,32,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getItemUsageAccess().getItemKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getItemUsageRule());
              			}
              			newCompositeNode(grammarAccess.getItemUsageAccess().getUsageParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_25);
            this_Usage_3=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1902:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            else if ( (LA42_0==15) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSysMLOC.g:1903:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getItemUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1908:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:1908:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:1909:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getItemUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1913:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_SL_NOTE && LA41_0<=RULE_ML_NOTE)||LA41_0==RULE_REGULAR_COMMENT||(LA41_0>=RULE_ID && LA41_0<=RULE_UNRESTRICTED_NAME)||LA41_0==15||(LA41_0>=21 && LA41_0<=22)||(LA41_0>=25 && LA41_0<=29)||(LA41_0>=31 && LA41_0<=38)||(LA41_0>=42 && LA41_0<=43)||(LA41_0>=48 && LA41_0<=54)||(LA41_0>=57 && LA41_0<=63)||(LA41_0>=66 && LA41_0<=68)||(LA41_0>=70 && LA41_0<=76)||(LA41_0>=81 && LA41_0<=88)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1914:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1914:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1915:7: lv_elements_6_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getItemUsageAccess().getElementsUsageBodyElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_6_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getItemUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getItemUsageAccess().getRightCurlyBracketKeyword_4_1_2());
                      				
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
    // InternalSysMLOC.g:1942:1: entryRulePartDefinition returns [EObject current=null] : iv_rulePartDefinition= rulePartDefinition EOF ;
    public final EObject entryRulePartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDefinition = null;


        try {
            // InternalSysMLOC.g:1942:55: (iv_rulePartDefinition= rulePartDefinition EOF )
            // InternalSysMLOC.g:1943:2: iv_rulePartDefinition= rulePartDefinition EOF
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
    // InternalSysMLOC.g:1949:1: rulePartDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject rulePartDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceDefinitionPrefix_1 = null;

        EObject this_DefinitionDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1955:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:1956:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:1956:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:1957:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPartDefinitionAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPartDefinitionAccess().getOccurrenceDefinitionPrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_33);
            this_OccurrenceDefinitionPrefix_1=ruleOccurrenceDefinitionPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceDefinitionPrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPartDefinitionAccess().getPartKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPartDefinitionAccess().getDefKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPartDefinitionAccess().getDefinitionDeclarationParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_4=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:1998:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            else if ( (LA44_0==15) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSysMLOC.g:1999:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2004:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2004:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2005:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2009:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_SL_NOTE && LA43_0<=RULE_ML_NOTE)||LA43_0==RULE_REGULAR_COMMENT||(LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)||LA43_0==15||(LA43_0>=21 && LA43_0<=22)||(LA43_0>=25 && LA43_0<=29)||(LA43_0>=31 && LA43_0<=38)||(LA43_0>=42 && LA43_0<=43)||(LA43_0>=48 && LA43_0<=54)||(LA43_0>=57 && LA43_0<=63)||(LA43_0>=66 && LA43_0<=68)||(LA43_0>=70 && LA43_0<=76)||(LA43_0>=81 && LA43_0<=88)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2010:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2010:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2011:7: lv_elements_7_0= ruleDefinitionBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPartDefinitionAccess().getElementsDefinitionBodyElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleDefinitionBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPartDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"dut.control.sysmloc.SysMLOC.DefinitionBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_5_1_2());
                      				
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
    // InternalSysMLOC.g:2038:1: entryRulePartUsage returns [EObject current=null] : iv_rulePartUsage= rulePartUsage EOF ;
    public final EObject entryRulePartUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartUsage = null;


        try {
            // InternalSysMLOC.g:2038:50: (iv_rulePartUsage= rulePartUsage EOF )
            // InternalSysMLOC.g:2039:2: iv_rulePartUsage= rulePartUsage EOF
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
    // InternalSysMLOC.g:2045:1: rulePartUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject rulePartUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceUsagePrefix_1 = null;

        EObject this_Usage_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2051:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:2052:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:2052:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:2053:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPartUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPartUsageAccess().getOccurrenceUsagePrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_33);
            this_OccurrenceUsagePrefix_1=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPartUsageAccess().getPartKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPartUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPartUsageAccess().getUsageParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_25);
            this_Usage_3=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2090:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==21) ) {
                alt46=1;
            }
            else if ( (LA46_0==15) ) {
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
                    // InternalSysMLOC.g:2091:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPartUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2096:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:2096:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:2097:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPartUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2101:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=RULE_SL_NOTE && LA45_0<=RULE_ML_NOTE)||LA45_0==RULE_REGULAR_COMMENT||(LA45_0>=RULE_ID && LA45_0<=RULE_UNRESTRICTED_NAME)||LA45_0==15||(LA45_0>=21 && LA45_0<=22)||(LA45_0>=25 && LA45_0<=29)||(LA45_0>=31 && LA45_0<=38)||(LA45_0>=42 && LA45_0<=43)||(LA45_0>=48 && LA45_0<=54)||(LA45_0>=57 && LA45_0<=63)||(LA45_0>=66 && LA45_0<=68)||(LA45_0>=70 && LA45_0<=76)||(LA45_0>=81 && LA45_0<=88)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2102:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2102:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:2103:7: lv_elements_6_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPartUsageAccess().getElementsUsageBodyElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_6_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPartUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getPartUsageAccess().getRightCurlyBracketKeyword_4_1_2());
                      				
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
    // InternalSysMLOC.g:2130:1: entryRulePortDefinition returns [EObject current=null] : iv_rulePortDefinition= rulePortDefinition EOF ;
    public final EObject entryRulePortDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortDefinition = null;


        try {
            // InternalSysMLOC.g:2130:55: (iv_rulePortDefinition= rulePortDefinition EOF )
            // InternalSysMLOC.g:2131:2: iv_rulePortDefinition= rulePortDefinition EOF
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
    // InternalSysMLOC.g:2137:1: rulePortDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject rulePortDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_DefinitionPrefix_1 = null;

        EObject this_DefinitionDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2143:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2144:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2144:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2145:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPortDefinitionAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPortDefinitionAccess().getDefinitionPrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_35);
            this_DefinitionPrefix_1=ruleDefinitionPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionPrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPortDefinitionAccess().getPortKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPortDefinitionAccess().getDefKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getPortDefinitionAccess().getDefinitionDeclarationParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_4=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2186:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==21) ) {
                alt48=1;
            }
            else if ( (LA48_0==15) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalSysMLOC.g:2187:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPortDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2192:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2192:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2193:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPortDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2197:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0>=RULE_SL_NOTE && LA47_0<=RULE_ML_NOTE)||LA47_0==RULE_REGULAR_COMMENT||(LA47_0>=RULE_ID && LA47_0<=RULE_UNRESTRICTED_NAME)||LA47_0==15||(LA47_0>=21 && LA47_0<=22)||(LA47_0>=25 && LA47_0<=29)||(LA47_0>=31 && LA47_0<=38)||(LA47_0>=42 && LA47_0<=43)||(LA47_0>=48 && LA47_0<=54)||(LA47_0>=57 && LA47_0<=63)||(LA47_0>=66 && LA47_0<=68)||(LA47_0>=70 && LA47_0<=76)||(LA47_0>=81 && LA47_0<=88)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2198:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2198:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2199:7: lv_elements_7_0= ruleDefinitionBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPortDefinitionAccess().getElementsDefinitionBodyElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleDefinitionBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPortDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"dut.control.sysmloc.SysMLOC.DefinitionBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getPortDefinitionAccess().getRightCurlyBracketKeyword_5_1_2());
                      				
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
    // InternalSysMLOC.g:2226:1: entryRulePortUsage returns [EObject current=null] : iv_rulePortUsage= rulePortUsage EOF ;
    public final EObject entryRulePortUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortUsage = null;


        try {
            // InternalSysMLOC.g:2226:50: (iv_rulePortUsage= rulePortUsage EOF )
            // InternalSysMLOC.g:2227:2: iv_rulePortUsage= rulePortUsage EOF
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
    // InternalSysMLOC.g:2233:1: rulePortUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject rulePortUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceUsagePrefix_1 = null;

        EObject this_Usage_3 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2239:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:2240:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:2240:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:2241:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPortUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPortUsageAccess().getOccurrenceUsagePrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_36);
            this_OccurrenceUsagePrefix_1=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2263:3: (otherlv_2= 'port' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSysMLOC.g:2264:4: otherlv_2= 'port'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPortUsageAccess().getPortKeyword_2());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getPortUsageRule());
              			}
              			newCompositeNode(grammarAccess.getPortUsageAccess().getUsageParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_25);
            this_Usage_3=ruleUsage(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Usage_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2280:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==21) ) {
                alt51=1;
            }
            else if ( (LA51_0==15) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalSysMLOC.g:2281:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPortUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2286:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:2286:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:2287:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPortUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2291:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=RULE_SL_NOTE && LA50_0<=RULE_ML_NOTE)||LA50_0==RULE_REGULAR_COMMENT||(LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)||LA50_0==15||(LA50_0>=21 && LA50_0<=22)||(LA50_0>=25 && LA50_0<=29)||(LA50_0>=31 && LA50_0<=38)||(LA50_0>=42 && LA50_0<=43)||(LA50_0>=48 && LA50_0<=54)||(LA50_0>=57 && LA50_0<=63)||(LA50_0>=66 && LA50_0<=68)||(LA50_0>=70 && LA50_0<=76)||(LA50_0>=81 && LA50_0<=88)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2292:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2292:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:2293:7: lv_elements_6_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPortUsageAccess().getElementsUsageBodyElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_6_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPortUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getPortUsageAccess().getRightCurlyBracketKeyword_4_1_2());
                      				
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
    // InternalSysMLOC.g:2320:1: entryRuleConnectionDefinition returns [EObject current=null] : iv_ruleConnectionDefinition= ruleConnectionDefinition EOF ;
    public final EObject entryRuleConnectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDefinition = null;


        try {
            // InternalSysMLOC.g:2320:61: (iv_ruleConnectionDefinition= ruleConnectionDefinition EOF )
            // InternalSysMLOC.g:2321:2: iv_ruleConnectionDefinition= ruleConnectionDefinition EOF
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
    // InternalSysMLOC.g:2327:1: ruleConnectionDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleConnectionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceDefinitionPrefix_1 = null;

        EObject this_DefinitionDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2333:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2334:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2334:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2335:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getOccurrenceDefinitionPrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_38);
            this_OccurrenceDefinitionPrefix_1=ruleOccurrenceDefinitionPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceDefinitionPrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConnectionDefinitionAccess().getConnectionKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConnectionDefinitionAccess().getDefKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getDefinitionDeclarationParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_4=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2376:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==21) ) {
                alt53=1;
            }
            else if ( (LA53_0==15) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalSysMLOC.g:2377:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConnectionDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2382:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2382:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2383:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getConnectionDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2387:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_SL_NOTE && LA52_0<=RULE_ML_NOTE)||LA52_0==RULE_REGULAR_COMMENT||(LA52_0>=RULE_ID && LA52_0<=RULE_UNRESTRICTED_NAME)||LA52_0==15||(LA52_0>=21 && LA52_0<=22)||(LA52_0>=25 && LA52_0<=29)||(LA52_0>=31 && LA52_0<=38)||(LA52_0>=42 && LA52_0<=43)||(LA52_0>=48 && LA52_0<=54)||(LA52_0>=57 && LA52_0<=63)||(LA52_0>=66 && LA52_0<=68)||(LA52_0>=70 && LA52_0<=76)||(LA52_0>=81 && LA52_0<=88)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2388:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2388:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2389:7: lv_elements_7_0= ruleDefinitionBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConnectionDefinitionAccess().getElementsDefinitionBodyElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleDefinitionBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConnectionDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"dut.control.sysmloc.SysMLOC.DefinitionBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getConnectionDefinitionAccess().getRightCurlyBracketKeyword_5_1_2());
                      				
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
    // InternalSysMLOC.g:2416:1: entryRuleConnectionUsage returns [EObject current=null] : iv_ruleConnectionUsage= ruleConnectionUsage EOF ;
    public final EObject entryRuleConnectionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionUsage = null;


        try {
            // InternalSysMLOC.g:2416:56: (iv_ruleConnectionUsage= ruleConnectionUsage EOF )
            // InternalSysMLOC.g:2417:2: iv_ruleConnectionUsage= ruleConnectionUsage EOF
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
    // InternalSysMLOC.g:2423:1: ruleConnectionUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) ) ;
    public final EObject ruleConnectionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceUsagePrefix_1 = null;

        EObject this_UsageDeclaration_3 = null;

        EObject this_FeatureValue_4 = null;

        EObject this_ConnectorPart_6 = null;

        EObject this_ConnectorPart_8 = null;

        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2429:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) ) )
            // InternalSysMLOC.g:2430:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) )
            {
            // InternalSysMLOC.g:2430:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) )
            // InternalSysMLOC.g:2431:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConnectionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getConnectionUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConnectionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getConnectionUsageAccess().getOccurrenceUsagePrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_39);
            this_OccurrenceUsagePrefix_1=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2453:3: ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==35) ) {
                alt57=1;
            }
            else if ( (LA57_0==36) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalSysMLOC.g:2454:4: (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? )
                    {
                    // InternalSysMLOC.g:2454:4: (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? )
                    // InternalSysMLOC.g:2455:5: otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )?
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getConnectionUsageAccess().getConnectionKeyword_2_0_0());
                      				
                    }
                    // InternalSysMLOC.g:2459:5: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_UNRESTRICTED_NAME)||(LA54_0>=57 && LA54_0<=59)||LA54_0==63||(LA54_0>=66 && LA54_0<=68)||(LA54_0>=70 && LA54_0<=76)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalSysMLOC.g:2460:6: this_UsageDeclaration_3= ruleUsageDeclaration[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConnectionUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getConnectionUsageAccess().getUsageDeclarationParserRuleCall_2_0_1());
                              					
                            }
                            pushFollow(FOLLOW_41);
                            this_UsageDeclaration_3=ruleUsageDeclaration(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_UsageDeclaration_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:2472:5: (this_FeatureValue_4= ruleFeatureValue[$current] )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=60 && LA55_0<=62)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSysMLOC.g:2473:6: this_FeatureValue_4= ruleFeatureValue[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConnectionUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getConnectionUsageAccess().getFeatureValueParserRuleCall_2_0_2());
                              					
                            }
                            pushFollow(FOLLOW_42);
                            this_FeatureValue_4=ruleFeatureValue(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_FeatureValue_4;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:2485:5: (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==36) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalSysMLOC.g:2486:6: otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current]
                            {
                            otherlv_5=(Token)match(input,36,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getConnectionUsageAccess().getConnectKeyword_2_0_3_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConnectionUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getConnectionUsageAccess().getConnectorPartParserRuleCall_2_0_3_1());
                              					
                            }
                            pushFollow(FOLLOW_25);
                            this_ConnectorPart_6=ruleConnectorPart(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_ConnectorPart_6;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2504:4: (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] )
                    {
                    // InternalSysMLOC.g:2504:4: (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] )
                    // InternalSysMLOC.g:2505:5: otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current]
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getConnectionUsageAccess().getConnectKeyword_2_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConnectionUsageRule());
                      					}
                      					newCompositeNode(grammarAccess.getConnectionUsageAccess().getConnectorPartParserRuleCall_2_1_1());
                      				
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalSysMLOC.g:2522:3: (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==21) ) {
                alt59=1;
            }
            else if ( (LA59_0==15) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalSysMLOC.g:2523:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConnectionUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2528:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' )
                    {
                    // InternalSysMLOC.g:2528:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' )
                    // InternalSysMLOC.g:2529:5: otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getConnectionUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2533:5: ( (lv_elements_11_0= ruleUsageBodyElement ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=RULE_SL_NOTE && LA58_0<=RULE_ML_NOTE)||LA58_0==RULE_REGULAR_COMMENT||(LA58_0>=RULE_ID && LA58_0<=RULE_UNRESTRICTED_NAME)||LA58_0==15||(LA58_0>=21 && LA58_0<=22)||(LA58_0>=25 && LA58_0<=29)||(LA58_0>=31 && LA58_0<=38)||(LA58_0>=42 && LA58_0<=43)||(LA58_0>=48 && LA58_0<=54)||(LA58_0>=57 && LA58_0<=63)||(LA58_0>=66 && LA58_0<=68)||(LA58_0>=70 && LA58_0<=76)||(LA58_0>=81 && LA58_0<=88)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2534:6: (lv_elements_11_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2534:6: (lv_elements_11_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:2535:7: lv_elements_11_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConnectionUsageAccess().getElementsUsageBodyElementParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_11_0=ruleUsageBodyElement();

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
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getConnectionUsageAccess().getRightCurlyBracketKeyword_3_1_2());
                      				
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
    // InternalSysMLOC.g:2562:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalSysMLOC.g:2562:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalSysMLOC.g:2563:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
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
    // InternalSysMLOC.g:2569:1: ruleInterfaceDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceDefinitionPrefix_1 = null;

        EObject this_DefinitionDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2575:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2576:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2576:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2577:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getOccurrenceDefinitionPrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_45);
            this_OccurrenceDefinitionPrefix_1=ruleOccurrenceDefinitionPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceDefinitionPrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,37,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInterfaceDefinitionAccess().getDefKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getInterfaceDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getDefinitionDeclarationParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_4=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2618:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==21) ) {
                alt61=1;
            }
            else if ( (LA61_0==15) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalSysMLOC.g:2619:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2624:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2624:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2625:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2629:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_SL_NOTE && LA60_0<=RULE_ML_NOTE)||LA60_0==RULE_REGULAR_COMMENT||(LA60_0>=RULE_ID && LA60_0<=RULE_UNRESTRICTED_NAME)||LA60_0==15||(LA60_0>=21 && LA60_0<=22)||(LA60_0>=25 && LA60_0<=29)||(LA60_0>=31 && LA60_0<=38)||(LA60_0>=42 && LA60_0<=43)||(LA60_0>=48 && LA60_0<=54)||(LA60_0>=57 && LA60_0<=63)||(LA60_0>=66 && LA60_0<=68)||(LA60_0>=70 && LA60_0<=76)||(LA60_0>=81 && LA60_0<=88)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2630:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2630:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2631:7: lv_elements_7_0= ruleDefinitionBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getElementsDefinitionBodyElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleDefinitionBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"dut.control.sysmloc.SysMLOC.DefinitionBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_5_1_2());
                      				
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
    // InternalSysMLOC.g:2658:1: entryRuleInterfaceUsage returns [EObject current=null] : iv_ruleInterfaceUsage= ruleInterfaceUsage EOF ;
    public final EObject entryRuleInterfaceUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceUsage = null;


        try {
            // InternalSysMLOC.g:2658:55: (iv_ruleInterfaceUsage= ruleInterfaceUsage EOF )
            // InternalSysMLOC.g:2659:2: iv_ruleInterfaceUsage= ruleInterfaceUsage EOF
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
    // InternalSysMLOC.g:2665:1: ruleInterfaceUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? ) | this_InterfacePart_6= ruleInterfacePart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' ) ) ) ;
    public final EObject ruleInterfaceUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceUsagePrefix_1 = null;

        EObject this_UsageDeclaration_3 = null;

        EObject this_InterfacePart_5 = null;

        EObject this_InterfacePart_6 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2671:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? ) | this_InterfacePart_6= ruleInterfacePart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' ) ) ) )
            // InternalSysMLOC.g:2672:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? ) | this_InterfacePart_6= ruleInterfacePart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' ) ) )
            {
            // InternalSysMLOC.g:2672:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? ) | this_InterfacePart_6= ruleInterfacePart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' ) ) )
            // InternalSysMLOC.g:2673:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? ) | this_InterfacePart_6= ruleInterfacePart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getInterfaceUsageRule());
              			}
              			newCompositeNode(grammarAccess.getInterfaceUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getInterfaceUsageRule());
              			}
              			newCompositeNode(grammarAccess.getInterfaceUsageAccess().getOccurrenceUsagePrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_45);
            this_OccurrenceUsagePrefix_1=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,37,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInterfaceUsageAccess().getInterfaceKeyword_2());
              		
            }
            // InternalSysMLOC.g:2699:3: ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? ) | this_InterfacePart_6= ruleInterfacePart[$current] )
            int alt64=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==15||LA64_1==21||LA64_1==36||(LA64_1>=57 && LA64_1<=59)||LA64_1==63||(LA64_1>=66 && LA64_1<=68)||(LA64_1>=70 && LA64_1<=76)) ) {
                    alt64=1;
                }
                else if ( (LA64_1==18||LA64_1==41||LA64_1==79) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==15||LA64_2==21||LA64_2==36||(LA64_2>=57 && LA64_2<=59)||LA64_2==63||(LA64_2>=66 && LA64_2<=68)||(LA64_2>=70 && LA64_2<=76)) ) {
                    alt64=1;
                }
                else if ( (LA64_2==18||LA64_2==41||LA64_2==79) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 21:
            case 36:
            case 57:
            case 58:
            case 59:
            case 63:
            case 66:
            case 67:
            case 68:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt64=1;
                }
                break;
            case 55:
            case 80:
                {
                alt64=2;
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
                    // InternalSysMLOC.g:2700:4: ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? )
                    {
                    // InternalSysMLOC.g:2700:4: ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )? )
                    // InternalSysMLOC.g:2701:5: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )?
                    {
                    // InternalSysMLOC.g:2701:5: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_UNRESTRICTED_NAME)||(LA62_0>=57 && LA62_0<=59)||LA62_0==63||(LA62_0>=66 && LA62_0<=68)||(LA62_0>=70 && LA62_0<=76)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSysMLOC.g:2702:6: this_UsageDeclaration_3= ruleUsageDeclaration[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getInterfaceUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getInterfaceUsageAccess().getUsageDeclarationParserRuleCall_3_0_0());
                              					
                            }
                            pushFollow(FOLLOW_42);
                            this_UsageDeclaration_3=ruleUsageDeclaration(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_UsageDeclaration_3;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:2714:5: (otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current] )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==36) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalSysMLOC.g:2715:6: otherlv_4= 'connect' this_InterfacePart_5= ruleInterfacePart[$current]
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_46); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getInterfaceUsageAccess().getConnectKeyword_3_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getInterfaceUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getInterfaceUsageAccess().getInterfacePartParserRuleCall_3_0_1_1());
                              					
                            }
                            pushFollow(FOLLOW_25);
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


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2733:4: this_InterfacePart_6= ruleInterfacePart[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getInterfaceUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getInterfaceUsageAccess().getInterfacePartParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_InterfacePart_6=ruleInterfacePart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_InterfacePart_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:2745:3: (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==21) ) {
                alt66=1;
            }
            else if ( (LA66_0==15) ) {
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
                    // InternalSysMLOC.g:2746:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getInterfaceUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2751:4: (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' )
                    {
                    // InternalSysMLOC.g:2751:4: (otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}' )
                    // InternalSysMLOC.g:2752:5: otherlv_8= '{' ( (lv_elements_9_0= ruleUsageBodyElement ) )* otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getInterfaceUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2756:5: ( (lv_elements_9_0= ruleUsageBodyElement ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=RULE_SL_NOTE && LA65_0<=RULE_ML_NOTE)||LA65_0==RULE_REGULAR_COMMENT||(LA65_0>=RULE_ID && LA65_0<=RULE_UNRESTRICTED_NAME)||LA65_0==15||(LA65_0>=21 && LA65_0<=22)||(LA65_0>=25 && LA65_0<=29)||(LA65_0>=31 && LA65_0<=38)||(LA65_0>=42 && LA65_0<=43)||(LA65_0>=48 && LA65_0<=54)||(LA65_0>=57 && LA65_0<=63)||(LA65_0>=66 && LA65_0<=68)||(LA65_0>=70 && LA65_0<=76)||(LA65_0>=81 && LA65_0<=88)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2757:6: (lv_elements_9_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2757:6: (lv_elements_9_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:2758:7: lv_elements_9_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfaceUsageAccess().getElementsUsageBodyElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_9_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInterfaceUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_9_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getInterfaceUsageAccess().getRightCurlyBracketKeyword_4_1_2());
                      				
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
    // InternalSysMLOC.g:2785:1: entryRuleFlowConnectionDefinition returns [EObject current=null] : iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF ;
    public final EObject entryRuleFlowConnectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowConnectionDefinition = null;


        try {
            // InternalSysMLOC.g:2785:65: (iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF )
            // InternalSysMLOC.g:2786:2: iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF
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
    // InternalSysMLOC.g:2792:1: ruleFlowConnectionDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
    public final EObject ruleFlowConnectionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceDefinitionPrefix_1 = null;

        EObject this_DefinitionDeclaration_4 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2798:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2799:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2799:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2800:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionDefinitionAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionDefinitionAccess().getOccurrenceDefinitionPrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_48);
            this_OccurrenceDefinitionPrefix_1=ruleOccurrenceDefinitionPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceDefinitionPrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowConnectionDefinitionAccess().getFlowKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFlowConnectionDefinitionAccess().getDefKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionDefinitionRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionDefinitionAccess().getDefinitionDeclarationParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_25);
            this_DefinitionDeclaration_4=ruleDefinitionDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DefinitionDeclaration_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:2841:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==21) ) {
                alt68=1;
            }
            else if ( (LA68_0==15) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalSysMLOC.g:2842:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFlowConnectionDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2847:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2847:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2848:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFlowConnectionDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2852:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( ((LA67_0>=RULE_SL_NOTE && LA67_0<=RULE_ML_NOTE)||LA67_0==RULE_REGULAR_COMMENT||(LA67_0>=RULE_ID && LA67_0<=RULE_UNRESTRICTED_NAME)||LA67_0==15||(LA67_0>=21 && LA67_0<=22)||(LA67_0>=25 && LA67_0<=29)||(LA67_0>=31 && LA67_0<=38)||(LA67_0>=42 && LA67_0<=43)||(LA67_0>=48 && LA67_0<=54)||(LA67_0>=57 && LA67_0<=63)||(LA67_0>=66 && LA67_0<=68)||(LA67_0>=70 && LA67_0<=76)||(LA67_0>=81 && LA67_0<=88)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2853:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2853:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2854:7: lv_elements_7_0= ruleDefinitionBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFlowConnectionDefinitionAccess().getElementsDefinitionBodyElementParserRuleCall_5_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleDefinitionBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFlowConnectionDefinitionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_7_0,
                    	      								"dut.control.sysmloc.SysMLOC.DefinitionBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getFlowConnectionDefinitionAccess().getRightCurlyBracketKeyword_5_1_2());
                      				
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
    // InternalSysMLOC.g:2881:1: entryRuleFlowConnectionUsage returns [EObject current=null] : iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF ;
    public final EObject entryRuleFlowConnectionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowConnectionUsage = null;


        try {
            // InternalSysMLOC.g:2881:60: (iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF )
            // InternalSysMLOC.g:2882:2: iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF
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
    // InternalSysMLOC.g:2888:1: ruleFlowConnectionUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) ) ;
    public final EObject ruleFlowConnectionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceUsagePrefix_1 = null;

        EObject this_UsageDeclaration_3 = null;

        EObject this_FeatureValue_4 = null;

        AntlrDatatypeRuleToken lv_ItemFeature_6_0 = null;

        AntlrDatatypeRuleToken lv_FlowEnd_8_0 = null;

        AntlrDatatypeRuleToken lv_FlowEnd_10_0 = null;

        EObject lv_elements_13_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2894:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) ) )
            // InternalSysMLOC.g:2895:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) )
            {
            // InternalSysMLOC.g:2895:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) )
            // InternalSysMLOC.g:2896:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFlowConnectionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getOccurrenceUsagePrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_48);
            this_OccurrenceUsagePrefix_1=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFlowConnectionUsageAccess().getFlowKeyword_2());
              		
            }
            // InternalSysMLOC.g:2922:3: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )?
            int alt69=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA69_1 = input.LA(2);

                    if ( ((LA69_1>=RULE_ID && LA69_1<=RULE_UNRESTRICTED_NAME)||LA69_1==15||LA69_1==21||(LA69_1>=39 && LA69_1<=40)||(LA69_1>=57 && LA69_1<=63)||(LA69_1>=66 && LA69_1<=68)||(LA69_1>=70 && LA69_1<=76)||LA69_1==80) ) {
                        alt69=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA69_2 = input.LA(2);

                    if ( ((LA69_2>=RULE_ID && LA69_2<=RULE_UNRESTRICTED_NAME)||LA69_2==15||LA69_2==21||(LA69_2>=39 && LA69_2<=40)||(LA69_2>=57 && LA69_2<=63)||(LA69_2>=66 && LA69_2<=68)||(LA69_2>=70 && LA69_2<=76)||LA69_2==80) ) {
                        alt69=1;
                    }
                    }
                    break;
                case 57:
                case 58:
                case 59:
                case 63:
                case 66:
                case 67:
                case 68:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                    {
                    alt69=1;
                    }
                    break;
            }

            switch (alt69) {
                case 1 :
                    // InternalSysMLOC.g:2923:4: this_UsageDeclaration_3= ruleUsageDeclaration[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowConnectionUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getUsageDeclarationParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_50);
                    this_UsageDeclaration_3=ruleUsageDeclaration(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UsageDeclaration_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:2935:3: (this_FeatureValue_4= ruleFeatureValue[$current] )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=60 && LA70_0<=62)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSysMLOC.g:2936:4: this_FeatureValue_4= ruleFeatureValue[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFlowConnectionUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getFeatureValueParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_51);
                    this_FeatureValue_4=ruleFeatureValue(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FeatureValue_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:2948:3: (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==39) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSysMLOC.g:2949:4: otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFlowConnectionUsageAccess().getOfKeyword_5_0());
                      			
                    }
                    // InternalSysMLOC.g:2953:4: ( (lv_ItemFeature_6_0= ruleName ) )
                    // InternalSysMLOC.g:2954:5: (lv_ItemFeature_6_0= ruleName )
                    {
                    // InternalSysMLOC.g:2954:5: (lv_ItemFeature_6_0= ruleName )
                    // InternalSysMLOC.g:2955:6: lv_ItemFeature_6_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getItemFeatureNameParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_ItemFeature_6_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                      						}
                      						add(
                      							current,
                      							"ItemFeature",
                      							lv_ItemFeature_6_0,
                      							"dut.control.sysmloc.SysMLOC.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:2973:3: ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_UNRESTRICTED_NAME)||LA73_0==40||LA73_0==80) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSysMLOC.g:2974:4: (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) )
                    {
                    // InternalSysMLOC.g:2974:4: (otherlv_7= 'from' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==40) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalSysMLOC.g:2975:5: otherlv_7= 'from'
                            {
                            otherlv_7=(Token)match(input,40,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getFlowConnectionUsageAccess().getFromKeyword_6_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:2980:4: ( (lv_FlowEnd_8_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:2981:5: (lv_FlowEnd_8_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:2981:5: (lv_FlowEnd_8_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:2982:6: lv_FlowEnd_8_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getFlowEndFeatureChainNameParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_FlowEnd_8_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                      						}
                      						add(
                      							current,
                      							"FlowEnd",
                      							lv_FlowEnd_8_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFlowConnectionUsageAccess().getToKeyword_6_2());
                      			
                    }
                    // InternalSysMLOC.g:3003:4: ( (lv_FlowEnd_10_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3004:5: (lv_FlowEnd_10_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3004:5: (lv_FlowEnd_10_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3005:6: lv_FlowEnd_10_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getFlowEndFeatureChainNameParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_FlowEnd_10_0=ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                      						}
                      						add(
                      							current,
                      							"FlowEnd",
                      							lv_FlowEnd_10_0,
                      							"dut.control.sysmloc.SysMLOC.FeatureChainName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:3023:3: (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==21) ) {
                alt75=1;
            }
            else if ( (LA75_0==15) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalSysMLOC.g:3024:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFlowConnectionUsageAccess().getSemicolonKeyword_7_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3029:4: (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' )
                    {
                    // InternalSysMLOC.g:3029:4: (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' )
                    // InternalSysMLOC.g:3030:5: otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getFlowConnectionUsageAccess().getLeftCurlyBracketKeyword_7_1_0());
                      				
                    }
                    // InternalSysMLOC.g:3034:5: ( (lv_elements_13_0= ruleUsageBodyElement ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=RULE_SL_NOTE && LA74_0<=RULE_ML_NOTE)||LA74_0==RULE_REGULAR_COMMENT||(LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)||LA74_0==15||(LA74_0>=21 && LA74_0<=22)||(LA74_0>=25 && LA74_0<=29)||(LA74_0>=31 && LA74_0<=38)||(LA74_0>=42 && LA74_0<=43)||(LA74_0>=48 && LA74_0<=54)||(LA74_0>=57 && LA74_0<=63)||(LA74_0>=66 && LA74_0<=68)||(LA74_0>=70 && LA74_0<=76)||(LA74_0>=81 && LA74_0<=88)) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3035:6: (lv_elements_13_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:3035:6: (lv_elements_13_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:3036:7: lv_elements_13_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFlowConnectionUsageAccess().getElementsUsageBodyElementParserRuleCall_7_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_13_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFlowConnectionUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_13_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getFlowConnectionUsageAccess().getRightCurlyBracketKeyword_7_1_2());
                      				
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
    // InternalSysMLOC.g:3063:1: entryRuleActionUsage returns [EObject current=null] : iv_ruleActionUsage= ruleActionUsage EOF ;
    public final EObject entryRuleActionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionUsage = null;


        try {
            // InternalSysMLOC.g:3063:52: (iv_ruleActionUsage= ruleActionUsage EOF )
            // InternalSysMLOC.g:3064:2: iv_ruleActionUsage= ruleActionUsage EOF
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
    // InternalSysMLOC.g:3070:1: ruleActionUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
    public final EObject ruleActionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MemberPrefix_0 = null;

        EObject this_OccurrenceUsagePrefix_1 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3076:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:3077:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:3077:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:3078:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getActionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getActionUsageAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getActionUsageRule());
              			}
              			newCompositeNode(grammarAccess.getActionUsageAccess().getOccurrenceUsagePrefixParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_55);
            this_OccurrenceUsagePrefix_1=ruleOccurrenceUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OccurrenceUsagePrefix_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActionUsageAccess().getActionKeyword_2());
              		
            }
            // InternalSysMLOC.g:3104:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:3105:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:3105:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalSysMLOC.g:3106:5: lv_declaredName_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActionUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_declaredName_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActionUsageRule());
              					}
              					set(
              						current,
              						"declaredName",
              						lv_declaredName_3_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSysMLOC.g:3123:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==21) ) {
                alt77=1;
            }
            else if ( (LA77_0==15) ) {
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
                    // InternalSysMLOC.g:3124:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getActionUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3129:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:3129:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:3130:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getActionUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:3134:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( ((LA76_0>=RULE_SL_NOTE && LA76_0<=RULE_ML_NOTE)||LA76_0==RULE_REGULAR_COMMENT||(LA76_0>=RULE_ID && LA76_0<=RULE_UNRESTRICTED_NAME)||LA76_0==15||(LA76_0>=21 && LA76_0<=22)||(LA76_0>=25 && LA76_0<=29)||(LA76_0>=31 && LA76_0<=38)||(LA76_0>=42 && LA76_0<=43)||(LA76_0>=48 && LA76_0<=54)||(LA76_0>=57 && LA76_0<=63)||(LA76_0>=66 && LA76_0<=68)||(LA76_0>=70 && LA76_0<=76)||(LA76_0>=81 && LA76_0<=88)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3135:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:3135:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:3136:7: lv_elements_6_0= ruleUsageBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getActionUsageAccess().getElementsUsageBodyElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_6_0=ruleUsageBodyElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getActionUsageRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"dut.control.sysmloc.SysMLOC.UsageBodyElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getActionUsageAccess().getRightCurlyBracketKeyword_4_1_2());
                      				
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


    // $ANTLR start "entryRuleAliasElement"
    // InternalSysMLOC.g:3163:1: entryRuleAliasElement returns [EObject current=null] : iv_ruleAliasElement= ruleAliasElement EOF ;
    public final EObject entryRuleAliasElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasElement = null;


        try {
            // InternalSysMLOC.g:3163:53: (iv_ruleAliasElement= ruleAliasElement EOF )
            // InternalSysMLOC.g:3164:2: iv_ruleAliasElement= ruleAliasElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAliasElement=ruleAliasElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasElement; 
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
    // $ANTLR end "entryRuleAliasElement"


    // $ANTLR start "ruleAliasElement"
    // InternalSysMLOC.g:3170:1: ruleAliasElement returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) ) ;
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
            // InternalSysMLOC.g:3176:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) ) )
            // InternalSysMLOC.g:3177:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) )
            {
            // InternalSysMLOC.g:3177:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) )
            // InternalSysMLOC.g:3178:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAliasElementRule());
              			}
              			newCompositeNode(grammarAccess.getAliasElementAccess().getMemberPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_MemberPrefix_0=ruleMemberPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,43,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAliasElementAccess().getAliasKeyword_1());
              		
            }
            // InternalSysMLOC.g:3193:3: (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==44) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSysMLOC.g:3194:4: otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAliasElementAccess().getLessThanSignKeyword_2_0());
                      			
                    }
                    // InternalSysMLOC.g:3198:4: ( (lv_memberShortName_3_0= ruleName ) )
                    // InternalSysMLOC.g:3199:5: (lv_memberShortName_3_0= ruleName )
                    {
                    // InternalSysMLOC.g:3199:5: (lv_memberShortName_3_0= ruleName )
                    // InternalSysMLOC.g:3200:6: lv_memberShortName_3_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAliasElementAccess().getMemberShortNameNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_memberShortName_3_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAliasElementRule());
                      						}
                      						set(
                      							current,
                      							"memberShortName",
                      							lv_memberShortName_3_0,
                      							"dut.control.sysmloc.SysMLOC.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAliasElementAccess().getGreaterThanSignKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:3222:3: ( (lv_memberName_5_0= ruleName ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSysMLOC.g:3223:4: (lv_memberName_5_0= ruleName )
                    {
                    // InternalSysMLOC.g:3223:4: (lv_memberName_5_0= ruleName )
                    // InternalSysMLOC.g:3224:5: lv_memberName_5_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAliasElementAccess().getMemberNameNameParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_60);
                    lv_memberName_5_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAliasElementRule());
                      					}
                      					set(
                      						current,
                      						"memberName",
                      						lv_memberName_5_0,
                      						"dut.control.sysmloc.SysMLOC.Name");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAliasElementAccess().getForKeyword_4());
              		
            }
            // InternalSysMLOC.g:3245:3: ( (lv_memberElement_7_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:3246:4: (lv_memberElement_7_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:3246:4: (lv_memberElement_7_0= ruleQualifiedName )
            // InternalSysMLOC.g:3247:5: lv_memberElement_7_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAliasElementAccess().getMemberElementQualifiedNameParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_memberElement_7_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAliasElementRule());
              					}
              					set(
              						current,
              						"memberElement",
              						lv_memberElement_7_0,
              						"dut.control.sysmloc.SysMLOC.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSysMLOC.g:3264:3: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==21) ) {
                alt81=1;
            }
            else if ( (LA81_0==15) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalSysMLOC.g:3265:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getAliasElementAccess().getSemicolonKeyword_6_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3270:4: (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' )
                    {
                    // InternalSysMLOC.g:3270:4: (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' )
                    // InternalSysMLOC.g:3271:5: otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getAliasElementAccess().getLeftCurlyBracketKeyword_6_1_0());
                      				
                    }
                    // InternalSysMLOC.g:3275:5: ( (lv_elements_10_0= ruleAnnotatingElement ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==RULE_REGULAR_COMMENT||LA80_0==22||(LA80_0>=25 && LA80_0<=28)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3276:6: (lv_elements_10_0= ruleAnnotatingElement )
                    	    {
                    	    // InternalSysMLOC.g:3276:6: (lv_elements_10_0= ruleAnnotatingElement )
                    	    // InternalSysMLOC.g:3277:7: lv_elements_10_0= ruleAnnotatingElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAliasElementAccess().getElementsAnnotatingElementParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_elements_10_0=ruleAnnotatingElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAliasElementRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_10_0,
                    	      								"dut.control.sysmloc.SysMLOC.AnnotatingElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getAliasElementAccess().getRightCurlyBracketKeyword_6_1_2());
                      				
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
    // $ANTLR end "ruleAliasElement"


    // $ANTLR start "ruleisImportAllFragment"
    // InternalSysMLOC.g:3305:1: ruleisImportAllFragment[EObject in_current] returns [EObject current=in_current] : ( (lv_isImportAll_0_0= 'all' ) ) ;
    public final EObject ruleisImportAllFragment(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isImportAll_0_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3311:2: ( ( (lv_isImportAll_0_0= 'all' ) ) )
            // InternalSysMLOC.g:3312:2: ( (lv_isImportAll_0_0= 'all' ) )
            {
            // InternalSysMLOC.g:3312:2: ( (lv_isImportAll_0_0= 'all' ) )
            // InternalSysMLOC.g:3313:3: (lv_isImportAll_0_0= 'all' )
            {
            // InternalSysMLOC.g:3313:3: (lv_isImportAll_0_0= 'all' )
            // InternalSysMLOC.g:3314:4: lv_isImportAll_0_0= 'all'
            {
            lv_isImportAll_0_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_isImportAll_0_0, grammarAccess.getIsImportAllFragmentAccess().getIsImportAllAllKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIsImportAllFragmentRule());
              				}
              				setWithLastConsumed(current, "isImportAll", lv_isImportAll_0_0 != null, "all");
              			
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
    // $ANTLR end "ruleisImportAllFragment"


    // $ANTLR start "ruleMemberPrefix"
    // InternalSysMLOC.g:3330:1: ruleMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ;
    public final EObject ruleMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3336:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? )
            // InternalSysMLOC.g:3337:2: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            {
            // InternalSysMLOC.g:3337:2: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=81 && LA82_0<=83)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSysMLOC.g:3338:3: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalSysMLOC.g:3338:3: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalSysMLOC.g:3339:4: lv_visibility_0_0= ruleVisibilityIndicator
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMemberPrefixAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElementForParent(grammarAccess.getMemberPrefixRule());
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
    // $ANTLR end "ruleMemberPrefix"


    // $ANTLR start "ruleDefinitionPrefix"
    // InternalSysMLOC.g:3360:1: ruleDefinitionPrefix[EObject in_current] returns [EObject current=in_current] : (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ;
    public final EObject ruleDefinitionPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_BasicDefinitionPrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3366:2: ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? )
            // InternalSysMLOC.g:3367:2: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )?
            {
            // InternalSysMLOC.g:3367:2: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=49 && LA83_0<=50)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSysMLOC.g:3368:3: this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getDefinitionPrefixRule());
                      			}
                      			newCompositeNode(grammarAccess.getDefinitionPrefixAccess().getBasicDefinitionPrefixParserRuleCall());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicDefinitionPrefix_0=ruleBasicDefinitionPrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BasicDefinitionPrefix_0;
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
    // $ANTLR end "ruleDefinitionPrefix"


    // $ANTLR start "ruleOccurrenceDefinitionPrefix"
    // InternalSysMLOC.g:3384:1: ruleOccurrenceDefinitionPrefix[EObject in_current] returns [EObject current=in_current] : ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? ) ;
    public final EObject ruleOccurrenceDefinitionPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isIndividual_1_0=null;
        EObject this_BasicDefinitionPrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3390:2: ( ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? ) )
            // InternalSysMLOC.g:3391:2: ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? )
            {
            // InternalSysMLOC.g:3391:2: ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? )
            // InternalSysMLOC.g:3392:3: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )?
            {
            // InternalSysMLOC.g:3392:3: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=49 && LA84_0<=50)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalSysMLOC.g:3393:4: this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getOccurrenceDefinitionPrefixRule());
                      				}
                      				newCompositeNode(grammarAccess.getOccurrenceDefinitionPrefixAccess().getBasicDefinitionPrefixParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_62);
                    this_BasicDefinitionPrefix_0=ruleBasicDefinitionPrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BasicDefinitionPrefix_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:3405:3: ( (lv_isIndividual_1_0= 'individual' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==48) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSysMLOC.g:3406:4: (lv_isIndividual_1_0= 'individual' )
                    {
                    // InternalSysMLOC.g:3406:4: (lv_isIndividual_1_0= 'individual' )
                    // InternalSysMLOC.g:3407:5: lv_isIndividual_1_0= 'individual'
                    {
                    lv_isIndividual_1_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isIndividual_1_0, grammarAccess.getOccurrenceDefinitionPrefixAccess().getIsIndividualIndividualKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOccurrenceDefinitionPrefixRule());
                      					}
                      					setWithLastConsumed(current, "isIndividual", lv_isIndividual_1_0 != null, "individual");
                      				
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
    // $ANTLR end "ruleOccurrenceDefinitionPrefix"


    // $ANTLR start "ruleBasicDefinitionPrefix"
    // InternalSysMLOC.g:3424:1: ruleBasicDefinitionPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) ) ;
    public final EObject ruleBasicDefinitionPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token lv_isVariation_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3430:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) ) )
            // InternalSysMLOC.g:3431:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) )
            {
            // InternalSysMLOC.g:3431:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==49) ) {
                alt86=1;
            }
            else if ( (LA86_0==50) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalSysMLOC.g:3432:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    {
                    // InternalSysMLOC.g:3432:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    // InternalSysMLOC.g:3433:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalSysMLOC.g:3433:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalSysMLOC.g:3434:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAbstract_0_0, grammarAccess.getBasicDefinitionPrefixAccess().getIsAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicDefinitionPrefixRule());
                      					}
                      					setWithLastConsumed(current, "isAbstract", lv_isAbstract_0_0 != null, "abstract");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3447:3: ( (lv_isVariation_1_0= 'variation' ) )
                    {
                    // InternalSysMLOC.g:3447:3: ( (lv_isVariation_1_0= 'variation' ) )
                    // InternalSysMLOC.g:3448:4: (lv_isVariation_1_0= 'variation' )
                    {
                    // InternalSysMLOC.g:3448:4: (lv_isVariation_1_0= 'variation' )
                    // InternalSysMLOC.g:3449:5: lv_isVariation_1_0= 'variation'
                    {
                    lv_isVariation_1_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isVariation_1_0, grammarAccess.getBasicDefinitionPrefixAccess().getIsVariationVariationKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicDefinitionPrefixRule());
                      					}
                      					setWithLastConsumed(current, "isVariation", lv_isVariation_1_0 != null, "variation");
                      				
                    }

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
    // $ANTLR end "ruleBasicDefinitionPrefix"


    // $ANTLR start "ruleUsagePrefix"
    // InternalSysMLOC.g:3466:1: ruleUsagePrefix[EObject in_current] returns [EObject current=in_current] : this_UnextendedUsagePrefix_0= ruleUnextendedUsagePrefix[$current] ;
    public final EObject ruleUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_UnextendedUsagePrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3472:2: (this_UnextendedUsagePrefix_0= ruleUnextendedUsagePrefix[$current] )
            // InternalSysMLOC.g:3473:2: this_UnextendedUsagePrefix_0= ruleUnextendedUsagePrefix[$current]
            {
            if ( state.backtracking==0 ) {

              		if (current==null) {
              			current = createModelElement(grammarAccess.getUsagePrefixRule());
              		}
              		newCompositeNode(grammarAccess.getUsagePrefixAccess().getUnextendedUsagePrefixParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_UnextendedUsagePrefix_0=ruleUnextendedUsagePrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_UnextendedUsagePrefix_0;
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
    // $ANTLR end "ruleUsagePrefix"


    // $ANTLR start "ruleUnextendedUsagePrefix"
    // InternalSysMLOC.g:3488:1: ruleUnextendedUsagePrefix[EObject in_current] returns [EObject current=in_current] : (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ) ;
    public final EObject ruleUnextendedUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_EndUsagePrefix_0 = null;

        EObject this_BasicUsagePrefix_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3494:2: ( (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ) )
            // InternalSysMLOC.g:3495:2: (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] )
            {
            // InternalSysMLOC.g:3495:2: (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==51) ) {
                alt87=1;
            }
            else if ( ((LA87_0>=RULE_ID && LA87_0<=RULE_UNRESTRICTED_NAME)||LA87_0==15||LA87_0==21||(LA87_0>=31 && LA87_0<=38)||LA87_0==42||(LA87_0>=48 && LA87_0<=50)||(LA87_0>=52 && LA87_0<=54)||(LA87_0>=57 && LA87_0<=63)||(LA87_0>=66 && LA87_0<=68)||(LA87_0>=70 && LA87_0<=76)||(LA87_0>=84 && LA87_0<=88)) ) {
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
                    // InternalSysMLOC.g:3496:3: this_EndUsagePrefix_0= ruleEndUsagePrefix[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getUnextendedUsagePrefixRule());
                      			}
                      			newCompositeNode(grammarAccess.getUnextendedUsagePrefixAccess().getEndUsagePrefixParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EndUsagePrefix_0=ruleEndUsagePrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EndUsagePrefix_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3508:3: this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getUnextendedUsagePrefixRule());
                      			}
                      			newCompositeNode(grammarAccess.getUnextendedUsagePrefixAccess().getBasicUsagePrefixParserRuleCall_1());
                      		
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
    // $ANTLR end "ruleUnextendedUsagePrefix"


    // $ANTLR start "ruleEndUsagePrefix"
    // InternalSysMLOC.g:3524:1: ruleEndUsagePrefix[EObject in_current] returns [EObject current=in_current] : ( (lv_isEnd_0_0= 'end' ) ) ;
    public final EObject ruleEndUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isEnd_0_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3530:2: ( ( (lv_isEnd_0_0= 'end' ) ) )
            // InternalSysMLOC.g:3531:2: ( (lv_isEnd_0_0= 'end' ) )
            {
            // InternalSysMLOC.g:3531:2: ( (lv_isEnd_0_0= 'end' ) )
            // InternalSysMLOC.g:3532:3: (lv_isEnd_0_0= 'end' )
            {
            // InternalSysMLOC.g:3532:3: (lv_isEnd_0_0= 'end' )
            // InternalSysMLOC.g:3533:4: lv_isEnd_0_0= 'end'
            {
            lv_isEnd_0_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_isEnd_0_0, grammarAccess.getEndUsagePrefixAccess().getIsEndEndKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEndUsagePrefixRule());
              				}
              				setWithLastConsumed(current, "isEnd", lv_isEnd_0_0 != null, "end");
              			
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
    // $ANTLR end "ruleEndUsagePrefix"


    // $ANTLR start "ruleOccurrenceUsagePrefix"
    // InternalSysMLOC.g:3549:1: ruleOccurrenceUsagePrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) ) ;
    public final EObject ruleOccurrenceUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isEnd_0_0=null;
        Token lv_isIndividual_2_0=null;
        EObject this_BasicUsagePrefix_1 = null;

        Enumerator lv_portionKind_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3555:2: ( ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) ) )
            // InternalSysMLOC.g:3556:2: ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) )
            {
            // InternalSysMLOC.g:3556:2: ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==51) ) {
                alt90=1;
            }
            else if ( ((LA90_0>=RULE_ID && LA90_0<=RULE_UNRESTRICTED_NAME)||LA90_0==15||LA90_0==21||(LA90_0>=31 && LA90_0<=38)||LA90_0==42||(LA90_0>=48 && LA90_0<=50)||(LA90_0>=52 && LA90_0<=54)||(LA90_0>=57 && LA90_0<=63)||(LA90_0>=66 && LA90_0<=68)||(LA90_0>=70 && LA90_0<=76)||(LA90_0>=84 && LA90_0<=88)) ) {
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
                    // InternalSysMLOC.g:3557:3: ( (lv_isEnd_0_0= 'end' ) )
                    {
                    // InternalSysMLOC.g:3557:3: ( (lv_isEnd_0_0= 'end' ) )
                    // InternalSysMLOC.g:3558:4: (lv_isEnd_0_0= 'end' )
                    {
                    // InternalSysMLOC.g:3558:4: (lv_isEnd_0_0= 'end' )
                    // InternalSysMLOC.g:3559:5: lv_isEnd_0_0= 'end'
                    {
                    lv_isEnd_0_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSysMLOC.g:3572:3: (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? )
                    {
                    // InternalSysMLOC.g:3572:3: (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? )
                    // InternalSysMLOC.g:3573:4: this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getOccurrenceUsagePrefixRule());
                      				}
                      				newCompositeNode(grammarAccess.getOccurrenceUsagePrefixAccess().getBasicUsagePrefixParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_63);
                    this_BasicUsagePrefix_1=ruleBasicUsagePrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BasicUsagePrefix_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:3584:4: ( (lv_isIndividual_2_0= 'individual' ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==48) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalSysMLOC.g:3585:5: (lv_isIndividual_2_0= 'individual' )
                            {
                            // InternalSysMLOC.g:3585:5: (lv_isIndividual_2_0= 'individual' )
                            // InternalSysMLOC.g:3586:6: lv_isIndividual_2_0= 'individual'
                            {
                            lv_isIndividual_2_0=(Token)match(input,48,FOLLOW_64); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_isIndividual_2_0, grammarAccess.getOccurrenceUsagePrefixAccess().getIsIndividualIndividualKeyword_1_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getOccurrenceUsagePrefixRule());
                              						}
                              						setWithLastConsumed(current, "isIndividual", lv_isIndividual_2_0 != null, "individual");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSysMLOC.g:3598:4: ( (lv_portionKind_3_0= rulePortionKind ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=87 && LA89_0<=88)) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalSysMLOC.g:3599:5: (lv_portionKind_3_0= rulePortionKind )
                            {
                            // InternalSysMLOC.g:3599:5: (lv_portionKind_3_0= rulePortionKind )
                            // InternalSysMLOC.g:3600:6: lv_portionKind_3_0= rulePortionKind
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getOccurrenceUsagePrefixAccess().getPortionKindPortionKindEnumRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_portionKind_3_0=rulePortionKind();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getOccurrenceUsagePrefixRule());
                              						}
                              						set(
                              							current,
                              							"portionKind",
                              							lv_portionKind_3_0,
                              							"dut.control.sysmloc.SysMLOC.PortionKind");
                              						afterParserOrEnumRuleCall();
                              					
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
    // $ANTLR end "ruleOccurrenceUsagePrefix"


    // $ANTLR start "ruleRefPrefix"
    // InternalSysMLOC.g:3623:1: ruleRefPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? ) ;
    public final EObject ruleRefPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_1_0=null;
        Token lv_isVariation_2_0=null;
        Token lv_isReadOnly_3_0=null;
        Token lv_isDerived_4_0=null;
        Enumerator lv_direction_0_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3629:2: ( ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? ) )
            // InternalSysMLOC.g:3630:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? )
            {
            // InternalSysMLOC.g:3630:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? )
            // InternalSysMLOC.g:3631:3: ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )?
            {
            // InternalSysMLOC.g:3631:3: ( (lv_direction_0_0= ruleFeatureDirection ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=84 && LA91_0<=86)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalSysMLOC.g:3632:4: (lv_direction_0_0= ruleFeatureDirection )
                    {
                    // InternalSysMLOC.g:3632:4: (lv_direction_0_0= ruleFeatureDirection )
                    // InternalSysMLOC.g:3633:5: lv_direction_0_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRefPrefixAccess().getDirectionFeatureDirectionEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_65);
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

            // InternalSysMLOC.g:3650:3: ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )?
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==49) ) {
                alt92=1;
            }
            else if ( (LA92_0==50) ) {
                alt92=2;
            }
            switch (alt92) {
                case 1 :
                    // InternalSysMLOC.g:3651:4: ( (lv_isAbstract_1_0= 'abstract' ) )
                    {
                    // InternalSysMLOC.g:3651:4: ( (lv_isAbstract_1_0= 'abstract' ) )
                    // InternalSysMLOC.g:3652:5: (lv_isAbstract_1_0= 'abstract' )
                    {
                    // InternalSysMLOC.g:3652:5: (lv_isAbstract_1_0= 'abstract' )
                    // InternalSysMLOC.g:3653:6: lv_isAbstract_1_0= 'abstract'
                    {
                    lv_isAbstract_1_0=(Token)match(input,49,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isAbstract_1_0, grammarAccess.getRefPrefixAccess().getIsAbstractAbstractKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRefPrefixRule());
                      						}
                      						setWithLastConsumed(current, "isAbstract", lv_isAbstract_1_0 != null, "abstract");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3666:4: ( (lv_isVariation_2_0= 'variation' ) )
                    {
                    // InternalSysMLOC.g:3666:4: ( (lv_isVariation_2_0= 'variation' ) )
                    // InternalSysMLOC.g:3667:5: (lv_isVariation_2_0= 'variation' )
                    {
                    // InternalSysMLOC.g:3667:5: (lv_isVariation_2_0= 'variation' )
                    // InternalSysMLOC.g:3668:6: lv_isVariation_2_0= 'variation'
                    {
                    lv_isVariation_2_0=(Token)match(input,50,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isVariation_2_0, grammarAccess.getRefPrefixAccess().getIsVariationVariationKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRefPrefixRule());
                      						}
                      						setWithLastConsumed(current, "isVariation", lv_isVariation_2_0 != null, "variation");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:3681:3: ( (lv_isReadOnly_3_0= 'readonly' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==52) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSysMLOC.g:3682:4: (lv_isReadOnly_3_0= 'readonly' )
                    {
                    // InternalSysMLOC.g:3682:4: (lv_isReadOnly_3_0= 'readonly' )
                    // InternalSysMLOC.g:3683:5: lv_isReadOnly_3_0= 'readonly'
                    {
                    lv_isReadOnly_3_0=(Token)match(input,52,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReadOnly_3_0, grammarAccess.getRefPrefixAccess().getIsReadOnlyReadonlyKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRefPrefixRule());
                      					}
                      					setWithLastConsumed(current, "isReadOnly", lv_isReadOnly_3_0 != null, "readonly");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:3695:3: ( (lv_isDerived_4_0= 'derived' ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==53) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSysMLOC.g:3696:4: (lv_isDerived_4_0= 'derived' )
                    {
                    // InternalSysMLOC.g:3696:4: (lv_isDerived_4_0= 'derived' )
                    // InternalSysMLOC.g:3697:5: lv_isDerived_4_0= 'derived'
                    {
                    lv_isDerived_4_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isDerived_4_0, grammarAccess.getRefPrefixAccess().getIsDerivedDerivedKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRefPrefixRule());
                      					}
                      					setWithLastConsumed(current, "isDerived", lv_isDerived_4_0 != null, "derived");
                      				
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
    // $ANTLR end "ruleRefPrefix"


    // $ANTLR start "ruleBasicUsagePrefix"
    // InternalSysMLOC.g:3714:1: ruleBasicUsagePrefix[EObject in_current] returns [EObject current=in_current] : (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? ) ;
    public final EObject ruleBasicUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isReference_1_0=null;
        EObject this_RefPrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3720:2: ( (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? ) )
            // InternalSysMLOC.g:3721:2: (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? )
            {
            // InternalSysMLOC.g:3721:2: (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? )
            // InternalSysMLOC.g:3722:3: this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )?
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getBasicUsagePrefixRule());
              			}
              			newCompositeNode(grammarAccess.getBasicUsagePrefixAccess().getRefPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_RefPrefix_0=ruleRefPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:3733:3: ( (lv_isReference_1_0= 'ref' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==54) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSysMLOC.g:3734:4: (lv_isReference_1_0= 'ref' )
                    {
                    // InternalSysMLOC.g:3734:4: (lv_isReference_1_0= 'ref' )
                    // InternalSysMLOC.g:3735:5: lv_isReference_1_0= 'ref'
                    {
                    lv_isReference_1_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3752:1: ruleConnectorPart[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) ) ;
    public final EObject ruleConnectorPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_connectorPart_0_0 = null;

        AntlrDatatypeRuleToken lv_connectorPart_2_0 = null;

        AntlrDatatypeRuleToken lv_connectorPart_4_0 = null;

        AntlrDatatypeRuleToken lv_connectorPart_6_0 = null;

        AntlrDatatypeRuleToken lv_connectorPart_8_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3758:2: ( ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) ) )
            // InternalSysMLOC.g:3759:2: ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) )
            {
            // InternalSysMLOC.g:3759:2: ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=RULE_ID && LA97_0<=RULE_UNRESTRICTED_NAME)||LA97_0==63||LA97_0==80) ) {
                alt97=1;
            }
            else if ( (LA97_0==55) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalSysMLOC.g:3760:3: ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) )
                    {
                    // InternalSysMLOC.g:3760:3: ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) )
                    // InternalSysMLOC.g:3761:4: ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) )
                    {
                    // InternalSysMLOC.g:3761:4: ( (lv_connectorPart_0_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3762:5: (lv_connectorPart_0_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3762:5: (lv_connectorPart_0_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3763:6: lv_connectorPart_0_0= ruleConnectorEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
                    lv_connectorPart_0_0=ruleConnectorEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorPart",
                      							lv_connectorPart_0_0,
                      							"dut.control.sysmloc.SysMLOC.ConnectorEnd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,41,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConnectorPartAccess().getToKeyword_0_1());
                      			
                    }
                    // InternalSysMLOC.g:3784:4: ( (lv_connectorPart_2_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3785:5: (lv_connectorPart_2_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3785:5: (lv_connectorPart_2_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3786:6: lv_connectorPart_2_0= ruleConnectorEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_connectorPart_2_0=ruleConnectorEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorPart",
                      							lv_connectorPart_2_0,
                      							"dut.control.sysmloc.SysMLOC.ConnectorEnd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3805:3: (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
                    {
                    // InternalSysMLOC.g:3805:3: (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
                    // InternalSysMLOC.g:3806:4: otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConnectorPartAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalSysMLOC.g:3810:4: ( (lv_connectorPart_4_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3811:5: (lv_connectorPart_4_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3811:5: (lv_connectorPart_4_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3812:6: lv_connectorPart_4_0= ruleConnectorEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_connectorPart_4_0=ruleConnectorEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorPart",
                      							lv_connectorPart_4_0,
                      							"dut.control.sysmloc.SysMLOC.ConnectorEnd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConnectorPartAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalSysMLOC.g:3833:4: ( (lv_connectorPart_6_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3834:5: (lv_connectorPart_6_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3834:5: (lv_connectorPart_6_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3835:6: lv_connectorPart_6_0= ruleConnectorEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_70);
                    lv_connectorPart_6_0=ruleConnectorEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                      						}
                      						add(
                      							current,
                      							"connectorPart",
                      							lv_connectorPart_6_0,
                      							"dut.control.sysmloc.SysMLOC.ConnectorEnd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:3852:4: (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==24) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3853:5: otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getConnectorPartAccess().getCommaKeyword_1_4_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3857:5: ( (lv_connectorPart_8_0= ruleConnectorEnd ) )
                    	    // InternalSysMLOC.g:3858:6: (lv_connectorPart_8_0= ruleConnectorEnd )
                    	    {
                    	    // InternalSysMLOC.g:3858:6: (lv_connectorPart_8_0= ruleConnectorEnd )
                    	    // InternalSysMLOC.g:3859:7: lv_connectorPart_8_0= ruleConnectorEnd
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_70);
                    	    lv_connectorPart_8_0=ruleConnectorEnd();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConnectorPartRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"connectorPart",
                    	      								lv_connectorPart_8_0,
                    	      								"dut.control.sysmloc.SysMLOC.ConnectorEnd");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3887:1: ruleInterfacePart[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) ) ;
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
            // InternalSysMLOC.g:3893:2: ( ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) ) )
            // InternalSysMLOC.g:3894:2: ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) )
            {
            // InternalSysMLOC.g:3894:2: ( ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) ) | (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=RULE_ID && LA99_0<=RULE_UNRESTRICTED_NAME)||LA99_0==80) ) {
                alt99=1;
            }
            else if ( (LA99_0==55) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalSysMLOC.g:3895:3: ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) )
                    {
                    // InternalSysMLOC.g:3895:3: ( ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) ) )
                    // InternalSysMLOC.g:3896:4: ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) ) otherlv_1= 'to' ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) )
                    {
                    // InternalSysMLOC.g:3896:4: ( (lv_InterfaceEnd_0_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3897:5: (lv_InterfaceEnd_0_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3897:5: (lv_InterfaceEnd_0_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3898:6: lv_InterfaceEnd_0_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_54);
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

                    otherlv_1=(Token)match(input,41,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInterfacePartAccess().getToKeyword_0_1());
                      			
                    }
                    // InternalSysMLOC.g:3919:4: ( (lv_InterfaceEnd_2_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3920:5: (lv_InterfaceEnd_2_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3920:5: (lv_InterfaceEnd_2_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3921:6: lv_InterfaceEnd_2_0= ruleFeatureChainName
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
                    // InternalSysMLOC.g:3940:3: (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' )
                    {
                    // InternalSysMLOC.g:3940:3: (otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')' )
                    // InternalSysMLOC.g:3941:4: otherlv_3= '(' ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) ) otherlv_5= ',' ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) ) (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )* otherlv_9= ')'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfacePartAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalSysMLOC.g:3945:4: ( (lv_InterfaceEnd_4_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3946:5: (lv_InterfaceEnd_4_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3946:5: (lv_InterfaceEnd_4_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3947:6: lv_InterfaceEnd_4_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
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

                    otherlv_5=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getInterfacePartAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalSysMLOC.g:3968:4: ( (lv_InterfaceEnd_6_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3969:5: (lv_InterfaceEnd_6_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3969:5: (lv_InterfaceEnd_6_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3970:6: lv_InterfaceEnd_6_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_70);
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

                    // InternalSysMLOC.g:3987:4: (otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==24) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3988:5: otherlv_7= ',' ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getInterfacePartAccess().getCommaKeyword_1_4_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:3992:5: ( (lv_InterfaceEnd_8_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:3993:6: (lv_InterfaceEnd_8_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:3993:6: (lv_InterfaceEnd_8_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:3994:7: lv_InterfaceEnd_8_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfacePartAccess().getInterfaceEndFeatureChainNameParserRuleCall_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_70);
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
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:4022:1: ruleDefinitionDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? ) ;
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
            // InternalSysMLOC.g:4028:2: ( ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? ) )
            // InternalSysMLOC.g:4029:2: ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? )
            {
            // InternalSysMLOC.g:4029:2: ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? )
            // InternalSysMLOC.g:4030:3: ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )?
            {
            // InternalSysMLOC.g:4030:3: ( (lv_declaredName_0_0= ruleName ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_ID && LA100_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSysMLOC.g:4031:4: (lv_declaredName_0_0= ruleName )
                    {
                    // InternalSysMLOC.g:4031:4: (lv_declaredName_0_0= ruleName )
                    // InternalSysMLOC.g:4032:5: lv_declaredName_0_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_71);
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

            // InternalSysMLOC.g:4049:3: ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=57 && LA103_0<=59)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalSysMLOC.g:4050:4: (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4050:4: (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' )
                    int alt101=3;
                    switch ( input.LA(1) ) {
                    case 57:
                        {
                        alt101=1;
                        }
                        break;
                    case 58:
                        {
                        alt101=2;
                        }
                        break;
                    case 59:
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
                            // InternalSysMLOC.g:4051:5: otherlv_1= ':'
                            {
                            otherlv_1=(Token)match(input,57,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getDefinitionDeclarationAccess().getColonKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4056:5: otherlv_2= ':>'
                            {
                            otherlv_2=(Token)match(input,58,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getDefinitionDeclarationAccess().getColonGreaterThanSignKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSysMLOC.g:4061:5: otherlv_3= 'specializes'
                            {
                            otherlv_3=(Token)match(input,59,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getDefinitionDeclarationAccess().getSpecializesKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4066:4: ( (lv_superclassifiers_4_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4067:5: (lv_superclassifiers_4_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4067:5: (lv_superclassifiers_4_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4068:6: lv_superclassifiers_4_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getSuperclassifiersFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalSysMLOC.g:4085:4: (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==24) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4086:5: otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDefinitionDeclarationAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4090:5: ( (lv_superclassifiers_6_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4091:6: (lv_superclassifiers_6_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4091:6: (lv_superclassifiers_6_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4092:7: lv_superclassifiers_6_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getSuperclassifiersFeatureChainNameParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop102;
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
    // InternalSysMLOC.g:4116:1: ruleUsage[EObject in_current] returns [EObject current=in_current] : ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? ) ;
    public final EObject ruleUsage(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_UsageDeclaration_0 = null;

        EObject this_FeatureValue_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4122:2: ( ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? ) )
            // InternalSysMLOC.g:4123:2: ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            {
            // InternalSysMLOC.g:4123:2: ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            // InternalSysMLOC.g:4124:3: (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )?
            {
            // InternalSysMLOC.g:4124:3: (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=RULE_ID && LA104_0<=RULE_UNRESTRICTED_NAME)||(LA104_0>=57 && LA104_0<=59)||LA104_0==63||(LA104_0>=66 && LA104_0<=68)||(LA104_0>=70 && LA104_0<=76)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalSysMLOC.g:4125:4: this_UsageDeclaration_0= ruleUsageDeclaration[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getUsageAccess().getUsageDeclarationParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_73);
                    this_UsageDeclaration_0=ruleUsageDeclaration(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UsageDeclaration_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:4137:3: (this_FeatureValue_1= ruleFeatureValue[$current] )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=60 && LA105_0<=62)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSysMLOC.g:4138:4: this_FeatureValue_1= ruleFeatureValue[$current]
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
    // InternalSysMLOC.g:4155:1: ruleUsageDeclaration[EObject in_current] returns [EObject current=in_current] : this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] ;
    public final EObject ruleUsageDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureDeclaration_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4161:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )
            // InternalSysMLOC.g:4162:2: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current]
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
    // InternalSysMLOC.g:4177:1: ruleFeatureValue[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) ) ;
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
            // InternalSysMLOC.g:4183:2: ( ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) ) )
            // InternalSysMLOC.g:4184:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) )
            {
            // InternalSysMLOC.g:4184:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) )
            // InternalSysMLOC.g:4185:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) )
            {
            // InternalSysMLOC.g:4185:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt107=1;
                }
                break;
            case 61:
                {
                alt107=2;
                }
                break;
            case 62:
                {
                alt107=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalSysMLOC.g:4186:4: otherlv_0= '='
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4191:4: ( (lv_isInitial_1_0= ':=' ) )
                    {
                    // InternalSysMLOC.g:4191:4: ( (lv_isInitial_1_0= ':=' ) )
                    // InternalSysMLOC.g:4192:5: (lv_isInitial_1_0= ':=' )
                    {
                    // InternalSysMLOC.g:4192:5: (lv_isInitial_1_0= ':=' )
                    // InternalSysMLOC.g:4193:6: lv_isInitial_1_0= ':='
                    {
                    lv_isInitial_1_0=(Token)match(input,61,FOLLOW_74); if (state.failed) return current;
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
                    // InternalSysMLOC.g:4206:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    {
                    // InternalSysMLOC.g:4206:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    // InternalSysMLOC.g:4207:5: ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    {
                    // InternalSysMLOC.g:4207:5: ( (lv_isDefault_2_0= 'default' ) )
                    // InternalSysMLOC.g:4208:6: (lv_isDefault_2_0= 'default' )
                    {
                    // InternalSysMLOC.g:4208:6: (lv_isDefault_2_0= 'default' )
                    // InternalSysMLOC.g:4209:7: lv_isDefault_2_0= 'default'
                    {
                    lv_isDefault_2_0=(Token)match(input,62,FOLLOW_75); if (state.failed) return current;
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

                    // InternalSysMLOC.g:4221:5: (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    int alt106=3;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==60) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==61) ) {
                        alt106=2;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalSysMLOC.g:4222:6: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,60,FOLLOW_74); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4227:6: ( (lv_isInitial_4_0= ':=' ) )
                            {
                            // InternalSysMLOC.g:4227:6: ( (lv_isInitial_4_0= ':=' ) )
                            // InternalSysMLOC.g:4228:7: (lv_isInitial_4_0= ':=' )
                            {
                            // InternalSysMLOC.g:4228:7: (lv_isInitial_4_0= ':=' )
                            // InternalSysMLOC.g:4229:8: lv_isInitial_4_0= ':='
                            {
                            lv_isInitial_4_0=(Token)match(input,61,FOLLOW_74); if (state.failed) return current;
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

            // InternalSysMLOC.g:4244:3: ( (lv_valuePart_5_0= ruleExpression ) )
            // InternalSysMLOC.g:4245:4: (lv_valuePart_5_0= ruleExpression )
            {
            // InternalSysMLOC.g:4245:4: (lv_valuePart_5_0= ruleExpression )
            // InternalSysMLOC.g:4246:5: lv_valuePart_5_0= ruleExpression
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
    // InternalSysMLOC.g:4268:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_declaredName_0_0 = null;

        EObject this_FeatureSpecializationPart_1 = null;

        EObject this_FeatureSpecializationPart_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4274:2: ( ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) )
            // InternalSysMLOC.g:4275:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            {
            // InternalSysMLOC.g:4275:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=RULE_ID && LA109_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt109=1;
            }
            else if ( ((LA109_0>=57 && LA109_0<=59)||LA109_0==63||(LA109_0>=66 && LA109_0<=68)||(LA109_0>=70 && LA109_0<=76)) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalSysMLOC.g:4276:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    {
                    // InternalSysMLOC.g:4276:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    // InternalSysMLOC.g:4277:4: ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    {
                    // InternalSysMLOC.g:4277:4: ( (lv_declaredName_0_0= ruleName ) )
                    // InternalSysMLOC.g:4278:5: (lv_declaredName_0_0= ruleName )
                    {
                    // InternalSysMLOC.g:4278:5: (lv_declaredName_0_0= ruleName )
                    // InternalSysMLOC.g:4279:6: lv_declaredName_0_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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

                    // InternalSysMLOC.g:4296:4: (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( ((LA108_0>=57 && LA108_0<=59)||LA108_0==63||(LA108_0>=66 && LA108_0<=68)||(LA108_0>=70 && LA108_0<=76)) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalSysMLOC.g:4297:5: this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current]
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
                    // InternalSysMLOC.g:4311:3: this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current]
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
    // InternalSysMLOC.g:4327:1: ruleFeatureSpecializationPart[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) ;
    public final EObject ruleFeatureSpecializationPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureSpecialization_0 = null;

        EObject this_MultiplicityPart_1 = null;

        EObject this_FeatureSpecialization_2 = null;

        EObject this_MultiplicityPart_3 = null;

        EObject this_FeatureSpecialization_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4333:2: ( ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) )
            // InternalSysMLOC.g:4334:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            {
            // InternalSysMLOC.g:4334:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=57 && LA114_0<=59)||LA114_0==68||(LA114_0>=70 && LA114_0<=76)) ) {
                alt114=1;
            }
            else if ( (LA114_0==63||(LA114_0>=66 && LA114_0<=67)) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalSysMLOC.g:4335:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:4335:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:4336:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    {
                    // InternalSysMLOC.g:4336:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+
                    int cnt110=0;
                    loop110:
                    do {
                        int alt110=2;
                        alt110 = dfa110.predict(input);
                        switch (alt110) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4337:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_76);
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
                    	    if ( cnt110 >= 1 ) break loop110;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(110, input);
                                throw eee;
                        }
                        cnt110++;
                    } while (true);

                    // InternalSysMLOC.g:4350:4: (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==63||(LA111_0>=66 && LA111_0<=67)) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // InternalSysMLOC.g:4351:5: this_MultiplicityPart_1= ruleMultiplicityPart[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                              					}
                              					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_77);
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

                    // InternalSysMLOC.g:4363:4: (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( ((LA112_0>=57 && LA112_0<=59)||LA112_0==68||(LA112_0>=70 && LA112_0<=76)) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4364:5: this_FeatureSpecialization_2= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_77);
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
                    	    break loop112;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4378:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:4378:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:4379:4: this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_77);
                    this_MultiplicityPart_3=ruleMultiplicityPart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityPart_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:4390:4: (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( ((LA113_0>=57 && LA113_0<=59)||LA113_0==68||(LA113_0>=70 && LA113_0<=76)) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4391:5: this_FeatureSpecialization_4= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_77);
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
                    	    break loop113;
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


    // $ANTLR start "ruleIdentification"
    // InternalSysMLOC.g:4409:1: ruleIdentification[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) ) ;
    public final EObject ruleIdentification(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_declaredShortName_1_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4415:2: ( ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) ) )
            // InternalSysMLOC.g:4416:2: ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) )
            {
            // InternalSysMLOC.g:4416:2: ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==44) ) {
                alt116=1;
            }
            else if ( ((LA116_0>=RULE_ID && LA116_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalSysMLOC.g:4417:3: (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? )
                    {
                    // InternalSysMLOC.g:4417:3: (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? )
                    // InternalSysMLOC.g:4418:4: otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )?
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getIdentificationAccess().getLessThanSignKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:4422:4: ( (lv_declaredShortName_1_0= ruleName ) )
                    // InternalSysMLOC.g:4423:5: (lv_declaredShortName_1_0= ruleName )
                    {
                    // InternalSysMLOC.g:4423:5: (lv_declaredShortName_1_0= ruleName )
                    // InternalSysMLOC.g:4424:6: lv_declaredShortName_1_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIdentificationAccess().getDeclaredShortNameNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_declaredShortName_1_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIdentificationRule());
                      						}
                      						set(
                      							current,
                      							"declaredShortName",
                      							lv_declaredShortName_1_0,
                      							"dut.control.sysmloc.SysMLOC.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,45,FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getIdentificationAccess().getGreaterThanSignKeyword_0_2());
                      			
                    }
                    // InternalSysMLOC.g:4445:4: ( (lv_declaredName_3_0= ruleName ) )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( ((LA115_0>=RULE_ID && LA115_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // InternalSysMLOC.g:4446:5: (lv_declaredName_3_0= ruleName )
                            {
                            // InternalSysMLOC.g:4446:5: (lv_declaredName_3_0= ruleName )
                            // InternalSysMLOC.g:4447:6: lv_declaredName_3_0= ruleName
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getIdentificationAccess().getDeclaredNameNameParserRuleCall_0_3_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_declaredName_3_0=ruleName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getIdentificationRule());
                              						}
                              						set(
                              							current,
                              							"declaredName",
                              							lv_declaredName_3_0,
                              							"dut.control.sysmloc.SysMLOC.Name");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4466:3: ( (lv_declaredName_4_0= ruleName ) )
                    {
                    // InternalSysMLOC.g:4466:3: ( (lv_declaredName_4_0= ruleName ) )
                    // InternalSysMLOC.g:4467:4: (lv_declaredName_4_0= ruleName )
                    {
                    // InternalSysMLOC.g:4467:4: (lv_declaredName_4_0= ruleName )
                    // InternalSysMLOC.g:4468:5: lv_declaredName_4_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIdentificationAccess().getDeclaredNameNameParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_declaredName_4_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIdentificationRule());
                      					}
                      					set(
                      						current,
                      						"declaredName",
                      						lv_declaredName_4_0,
                      						"dut.control.sysmloc.SysMLOC.Name");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // $ANTLR end "ruleIdentification"


    // $ANTLR start "ruleMultiplicityPart"
    // InternalSysMLOC.g:4490:1: ruleMultiplicityPart[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) ) ;
    public final EObject ruleMultiplicityPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_isOrdered_16_0=null;
        Token lv_isNonunique_17_0=null;
        Token lv_isNonunique_18_0=null;
        Token lv_isOrdered_19_0=null;
        AntlrDatatypeRuleToken lv_Multiplicity_1_0 = null;

        AntlrDatatypeRuleToken lv_Multiplicity_4_0 = null;

        AntlrDatatypeRuleToken lv_Multiplicity_6_0 = null;

        AntlrDatatypeRuleToken lv_Multiplicity_9_0 = null;

        AntlrDatatypeRuleToken lv_Multiplicity_12_0 = null;

        AntlrDatatypeRuleToken lv_Multiplicity_14_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4496:2: ( ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) ) )
            // InternalSysMLOC.g:4497:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) )
            {
            // InternalSysMLOC.g:4497:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) )
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // InternalSysMLOC.g:4498:3: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalSysMLOC.g:4498:3: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) )
                    int alt117=2;
                    alt117 = dfa117.predict(input);
                    switch (alt117) {
                        case 1 :
                            // InternalSysMLOC.g:4499:4: (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' )
                            {
                            // InternalSysMLOC.g:4499:4: (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' )
                            // InternalSysMLOC.g:4500:5: otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']'
                            {
                            otherlv_0=(Token)match(input,63,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_0_0());
                              				
                            }
                            // InternalSysMLOC.g:4504:5: ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4505:6: (lv_Multiplicity_1_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4505:6: (lv_Multiplicity_1_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4506:7: lv_Multiplicity_1_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_80);
                            lv_Multiplicity_1_0=ruleMultiplicityExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMultiplicityPartRule());
                              							}
                              							add(
                              								current,
                              								"Multiplicity",
                              								lv_Multiplicity_1_0,
                              								"dut.control.sysmloc.SysMLOC.MultiplicityExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_2=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_0_0_2());
                              				
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4529:4: (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' )
                            {
                            // InternalSysMLOC.g:4529:4: (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' )
                            // InternalSysMLOC.g:4530:5: otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']'
                            {
                            otherlv_3=(Token)match(input,63,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_1_0());
                              				
                            }
                            // InternalSysMLOC.g:4534:5: ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4535:6: (lv_Multiplicity_4_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4535:6: (lv_Multiplicity_4_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4536:7: lv_Multiplicity_4_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_81);
                            lv_Multiplicity_4_0=ruleMultiplicityExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMultiplicityPartRule());
                              							}
                              							add(
                              								current,
                              								"Multiplicity",
                              								lv_Multiplicity_4_0,
                              								"dut.control.sysmloc.SysMLOC.MultiplicityExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,65,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_0_1_2());
                              				
                            }
                            // InternalSysMLOC.g:4557:5: ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4558:6: (lv_Multiplicity_6_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4558:6: (lv_Multiplicity_6_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4559:7: lv_Multiplicity_6_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_1_3_0());
                              						
                            }
                            pushFollow(FOLLOW_80);
                            lv_Multiplicity_6_0=ruleMultiplicityExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getMultiplicityPartRule());
                              							}
                              							add(
                              								current,
                              								"Multiplicity",
                              								lv_Multiplicity_6_0,
                              								"dut.control.sysmloc.SysMLOC.MultiplicityExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_7=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_0_1_4());
                              				
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4583:3: ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) )
                    {
                    // InternalSysMLOC.g:4583:3: ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) )
                    // InternalSysMLOC.g:4584:4: ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) )
                    {
                    // InternalSysMLOC.g:4584:4: ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )?
                    int alt118=3;
                    alt118 = dfa118.predict(input);
                    switch (alt118) {
                        case 1 :
                            // InternalSysMLOC.g:4585:5: (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' )
                            {
                            // InternalSysMLOC.g:4585:5: (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' )
                            // InternalSysMLOC.g:4586:6: otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']'
                            {
                            otherlv_8=(Token)match(input,63,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_0_0());
                              					
                            }
                            // InternalSysMLOC.g:4590:6: ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4591:7: (lv_Multiplicity_9_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4591:7: (lv_Multiplicity_9_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4592:8: lv_Multiplicity_9_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_1_0_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_80);
                            lv_Multiplicity_9_0=ruleMultiplicityExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getMultiplicityPartRule());
                              								}
                              								add(
                              									current,
                              									"Multiplicity",
                              									lv_Multiplicity_9_0,
                              									"dut.control.sysmloc.SysMLOC.MultiplicityExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,64,FOLLOW_82); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4615:5: (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' )
                            {
                            // InternalSysMLOC.g:4615:5: (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' )
                            // InternalSysMLOC.g:4616:6: otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']'
                            {
                            otherlv_11=(Token)match(input,63,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_1_0());
                              					
                            }
                            // InternalSysMLOC.g:4620:6: ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4621:7: (lv_Multiplicity_12_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4621:7: (lv_Multiplicity_12_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4622:8: lv_Multiplicity_12_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_1_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_81);
                            lv_Multiplicity_12_0=ruleMultiplicityExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getMultiplicityPartRule());
                              								}
                              								add(
                              									current,
                              									"Multiplicity",
                              									lv_Multiplicity_12_0,
                              									"dut.control.sysmloc.SysMLOC.MultiplicityExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_13=(Token)match(input,65,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_13, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_1_0_1_2());
                              					
                            }
                            // InternalSysMLOC.g:4643:6: ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4644:7: (lv_Multiplicity_14_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4644:7: (lv_Multiplicity_14_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4645:8: lv_Multiplicity_14_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_1_0_1_3_0());
                              							
                            }
                            pushFollow(FOLLOW_80);
                            lv_Multiplicity_14_0=ruleMultiplicityExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getMultiplicityPartRule());
                              								}
                              								add(
                              									current,
                              									"Multiplicity",
                              									lv_Multiplicity_14_0,
                              									"dut.control.sysmloc.SysMLOC.MultiplicityExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_15=(Token)match(input,64,FOLLOW_82); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_1_4());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSysMLOC.g:4668:4: ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) )
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==66) ) {
                        alt121=1;
                    }
                    else if ( (LA121_0==67) ) {
                        alt121=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        throw nvae;
                    }
                    switch (alt121) {
                        case 1 :
                            // InternalSysMLOC.g:4669:5: ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? )
                            {
                            // InternalSysMLOC.g:4669:5: ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? )
                            // InternalSysMLOC.g:4670:6: ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )?
                            {
                            // InternalSysMLOC.g:4670:6: ( (lv_isOrdered_16_0= 'ordered' ) )
                            // InternalSysMLOC.g:4671:7: (lv_isOrdered_16_0= 'ordered' )
                            {
                            // InternalSysMLOC.g:4671:7: (lv_isOrdered_16_0= 'ordered' )
                            // InternalSysMLOC.g:4672:8: lv_isOrdered_16_0= 'ordered'
                            {
                            lv_isOrdered_16_0=(Token)match(input,66,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isOrdered_16_0, grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              								}
                              								setWithLastConsumed(current, "isOrdered", lv_isOrdered_16_0 != null, "ordered");
                              							
                            }

                            }


                            }

                            // InternalSysMLOC.g:4684:6: ( (lv_isNonunique_17_0= 'nonunique' ) )?
                            int alt119=2;
                            int LA119_0 = input.LA(1);

                            if ( (LA119_0==67) ) {
                                alt119=1;
                            }
                            switch (alt119) {
                                case 1 :
                                    // InternalSysMLOC.g:4685:7: (lv_isNonunique_17_0= 'nonunique' )
                                    {
                                    // InternalSysMLOC.g:4685:7: (lv_isNonunique_17_0= 'nonunique' )
                                    // InternalSysMLOC.g:4686:8: lv_isNonunique_17_0= 'nonunique'
                                    {
                                    lv_isNonunique_17_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_isNonunique_17_0, grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_0_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                                      								}
                                      								setWithLastConsumed(current, "isNonunique", lv_isNonunique_17_0 != null, "nonunique");
                                      							
                                    }

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4700:5: ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? )
                            {
                            // InternalSysMLOC.g:4700:5: ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? )
                            // InternalSysMLOC.g:4701:6: ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )?
                            {
                            // InternalSysMLOC.g:4701:6: ( (lv_isNonunique_18_0= 'nonunique' ) )
                            // InternalSysMLOC.g:4702:7: (lv_isNonunique_18_0= 'nonunique' )
                            {
                            // InternalSysMLOC.g:4702:7: (lv_isNonunique_18_0= 'nonunique' )
                            // InternalSysMLOC.g:4703:8: lv_isNonunique_18_0= 'nonunique'
                            {
                            lv_isNonunique_18_0=(Token)match(input,67,FOLLOW_84); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isNonunique_18_0, grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                              								}
                              								setWithLastConsumed(current, "isNonunique", lv_isNonunique_18_0 != null, "nonunique");
                              							
                            }

                            }


                            }

                            // InternalSysMLOC.g:4715:6: ( (lv_isOrdered_19_0= 'ordered' ) )?
                            int alt120=2;
                            int LA120_0 = input.LA(1);

                            if ( (LA120_0==66) ) {
                                alt120=1;
                            }
                            switch (alt120) {
                                case 1 :
                                    // InternalSysMLOC.g:4716:7: (lv_isOrdered_19_0= 'ordered' )
                                    {
                                    // InternalSysMLOC.g:4716:7: (lv_isOrdered_19_0= 'ordered' )
                                    // InternalSysMLOC.g:4717:8: lv_isOrdered_19_0= 'ordered'
                                    {
                                    lv_isOrdered_19_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_isOrdered_19_0, grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_1_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getMultiplicityPartRule());
                                      								}
                                      								setWithLastConsumed(current, "isOrdered", lv_isOrdered_19_0 != null, "ordered");
                                      							
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
    // InternalSysMLOC.g:4737:1: ruleFeatureSpecialization[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) ;
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
            // InternalSysMLOC.g:4743:2: ( ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) )
            // InternalSysMLOC.g:4744:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            {
            // InternalSysMLOC.g:4744:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            int alt133=5;
            switch ( input.LA(1) ) {
            case 57:
            case 68:
                {
                alt133=1;
                }
                break;
            case 58:
            case 59:
            case 70:
                {
                alt133=2;
                }
                break;
            case 71:
            case 72:
                {
                alt133=3;
                }
                break;
            case 73:
            case 74:
                {
                alt133=4;
                }
                break;
            case 75:
            case 76:
                {
                alt133=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // InternalSysMLOC.g:4745:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4745:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4746:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4746:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) )
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==57) ) {
                        alt123=1;
                    }
                    else if ( (LA123_0==68) ) {
                        alt123=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        throw nvae;
                    }
                    switch (alt123) {
                        case 1 :
                            // InternalSysMLOC.g:4747:5: otherlv_0= ':'
                            {
                            otherlv_0=(Token)match(input,57,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getFeatureSpecializationAccess().getColonKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4752:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            {
                            // InternalSysMLOC.g:4752:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            // InternalSysMLOC.g:4753:6: otherlv_1= 'defined' otherlv_2= 'by'
                            {
                            otherlv_1=(Token)match(input,68,FOLLOW_85); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getFeatureSpecializationAccess().getDefinedKeyword_0_0_1_0());
                              					
                            }
                            otherlv_2=(Token)match(input,69,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getFeatureSpecializationAccess().getByKeyword_0_0_1_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSysMLOC.g:4763:4: ( (lv_typings_3_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4764:5: (lv_typings_3_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4764:5: (lv_typings_3_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4765:6: lv_typings_3_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalSysMLOC.g:4782:4: (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==24) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4783:5: otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_0_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4787:5: ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4788:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4788:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4789:7: lv_typings_5_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop124;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4809:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4809:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4810:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4810:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' )
                    int alt125=3;
                    switch ( input.LA(1) ) {
                    case 58:
                        {
                        alt125=1;
                        }
                        break;
                    case 59:
                        {
                        alt125=2;
                        }
                        break;
                    case 70:
                        {
                        alt125=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 125, 0, input);

                        throw nvae;
                    }

                    switch (alt125) {
                        case 1 :
                            // InternalSysMLOC.g:4811:5: otherlv_6= ':>'
                            {
                            otherlv_6=(Token)match(input,58,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4816:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,59,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getFeatureSpecializationAccess().getSpecializesKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSysMLOC.g:4821:5: otherlv_8= 'subsets'
                            {
                            otherlv_8=(Token)match(input,70,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getFeatureSpecializationAccess().getSubsetsKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4826:4: ( (lv_subsetting_9_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4827:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4827:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4828:6: lv_subsetting_9_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalSysMLOC.g:4845:4: (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==24) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4846:5: otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4850:5: ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4851:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4851:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4852:7: lv_subsetting_11_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop126;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:4872:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4872:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4873:4: (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4873:4: (otherlv_12= '::>' | otherlv_13= 'references' )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==71) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==72) ) {
                        alt127=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalSysMLOC.g:4874:5: otherlv_12= '::>'
                            {
                            otherlv_12=(Token)match(input,71,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getFeatureSpecializationAccess().getColonColonGreaterThanSignKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4879:5: otherlv_13= 'references'
                            {
                            otherlv_13=(Token)match(input,72,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getFeatureSpecializationAccess().getReferencesKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4884:4: ( (lv_references_14_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4885:5: (lv_references_14_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4885:5: (lv_references_14_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4886:6: lv_references_14_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalSysMLOC.g:4903:4: (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==24) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4904:5: otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_15=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_15, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4908:5: ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4909:6: (lv_references_16_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4909:6: (lv_references_16_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4910:7: lv_references_16_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop128;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:4930:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4930:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4931:4: (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4931:4: (otherlv_17= '=>' | otherlv_18= 'crosses' )
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==73) ) {
                        alt129=1;
                    }
                    else if ( (LA129_0==74) ) {
                        alt129=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }
                    switch (alt129) {
                        case 1 :
                            // InternalSysMLOC.g:4932:5: otherlv_17= '=>'
                            {
                            otherlv_17=(Token)match(input,73,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getFeatureSpecializationAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4937:5: otherlv_18= 'crosses'
                            {
                            otherlv_18=(Token)match(input,74,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getFeatureSpecializationAccess().getCrossesKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4942:4: ( (lv_crosses_19_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4943:5: (lv_crosses_19_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4943:5: (lv_crosses_19_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4944:6: lv_crosses_19_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalSysMLOC.g:4961:4: (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==24) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4962:5: otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_20=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_20, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4966:5: ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4967:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4967:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4968:7: lv_crosses_21_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop130;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:4988:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4988:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4989:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4989:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==75) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==76) ) {
                        alt131=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // InternalSysMLOC.g:4990:5: otherlv_22= ':>>'
                            {
                            otherlv_22=(Token)match(input,75,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_22, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4995:5: otherlv_23= 'redefines'
                            {
                            otherlv_23=(Token)match(input,76,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_23, grammarAccess.getFeatureSpecializationAccess().getRedefinesKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:5000:4: ( (lv_redefinitions_24_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:5001:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:5001:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:5002:6: lv_redefinitions_24_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
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

                    // InternalSysMLOC.g:5019:4: (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==24) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalSysMLOC.g:5020:5: otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_25=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_25, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:5024:5: ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:5025:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:5025:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:5026:7: lv_redefinitions_26_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop132;
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


    // $ANTLR start "entryRuleConnectorEnd"
    // InternalSysMLOC.g:5049:1: entryRuleConnectorEnd returns [String current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final String entryRuleConnectorEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectorEnd = null;


        try {
            // InternalSysMLOC.g:5049:52: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalSysMLOC.g:5050:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectorEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectorEnd=ruleConnectorEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectorEnd.getText(); 
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
    // $ANTLR end "entryRuleConnectorEnd"


    // $ANTLR start "ruleConnectorEnd"
    // InternalSysMLOC.g:5056:1: ruleConnectorEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_MultiplicityExpression_1= ruleMultiplicityExpression kw= '..' this_MultiplicityExpression_3= ruleMultiplicityExpression kw= ']' )? (this_Name_5= ruleName (kw= '::>' | kw= 'references' ) )? this_FeatureChainName_8= ruleFeatureChainName ) ;
    public final AntlrDatatypeRuleToken ruleConnectorEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MultiplicityExpression_1 = null;

        AntlrDatatypeRuleToken this_MultiplicityExpression_3 = null;

        AntlrDatatypeRuleToken this_Name_5 = null;

        AntlrDatatypeRuleToken this_FeatureChainName_8 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5062:2: ( ( (kw= '[' this_MultiplicityExpression_1= ruleMultiplicityExpression kw= '..' this_MultiplicityExpression_3= ruleMultiplicityExpression kw= ']' )? (this_Name_5= ruleName (kw= '::>' | kw= 'references' ) )? this_FeatureChainName_8= ruleFeatureChainName ) )
            // InternalSysMLOC.g:5063:2: ( (kw= '[' this_MultiplicityExpression_1= ruleMultiplicityExpression kw= '..' this_MultiplicityExpression_3= ruleMultiplicityExpression kw= ']' )? (this_Name_5= ruleName (kw= '::>' | kw= 'references' ) )? this_FeatureChainName_8= ruleFeatureChainName )
            {
            // InternalSysMLOC.g:5063:2: ( (kw= '[' this_MultiplicityExpression_1= ruleMultiplicityExpression kw= '..' this_MultiplicityExpression_3= ruleMultiplicityExpression kw= ']' )? (this_Name_5= ruleName (kw= '::>' | kw= 'references' ) )? this_FeatureChainName_8= ruleFeatureChainName )
            // InternalSysMLOC.g:5064:3: (kw= '[' this_MultiplicityExpression_1= ruleMultiplicityExpression kw= '..' this_MultiplicityExpression_3= ruleMultiplicityExpression kw= ']' )? (this_Name_5= ruleName (kw= '::>' | kw= 'references' ) )? this_FeatureChainName_8= ruleFeatureChainName
            {
            // InternalSysMLOC.g:5064:3: (kw= '[' this_MultiplicityExpression_1= ruleMultiplicityExpression kw= '..' this_MultiplicityExpression_3= ruleMultiplicityExpression kw= ']' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==63) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalSysMLOC.g:5065:4: kw= '[' this_MultiplicityExpression_1= ruleMultiplicityExpression kw= '..' this_MultiplicityExpression_3= ruleMultiplicityExpression kw= ']'
                    {
                    kw=(Token)match(input,63,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConnectorEndAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_81);
                    this_MultiplicityExpression_1=ruleMultiplicityExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MultiplicityExpression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,65,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConnectorEndAccess().getFullStopFullStopKeyword_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityExpressionParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_80);
                    this_MultiplicityExpression_3=ruleMultiplicityExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MultiplicityExpression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,64,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConnectorEndAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:5101:3: (this_Name_5= ruleName (kw= '::>' | kw= 'references' ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RULE_ID) ) {
                int LA136_1 = input.LA(2);

                if ( ((LA136_1>=71 && LA136_1<=72)) ) {
                    alt136=1;
                }
            }
            else if ( (LA136_0==RULE_UNRESTRICTED_NAME) ) {
                int LA136_2 = input.LA(2);

                if ( ((LA136_2>=71 && LA136_2<=72)) ) {
                    alt136=1;
                }
            }
            switch (alt136) {
                case 1 :
                    // InternalSysMLOC.g:5102:4: this_Name_5= ruleName (kw= '::>' | kw= 'references' )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConnectorEndAccess().getNameParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_86);
                    this_Name_5=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Name_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:5112:4: (kw= '::>' | kw= 'references' )
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==71) ) {
                        alt135=1;
                    }
                    else if ( (LA135_0==72) ) {
                        alt135=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }
                    switch (alt135) {
                        case 1 :
                            // InternalSysMLOC.g:5113:5: kw= '::>'
                            {
                            kw=(Token)match(input,71,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getConnectorEndAccess().getColonColonGreaterThanSignKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:5119:5: kw= 'references'
                            {
                            kw=(Token)match(input,72,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getConnectorEndAccess().getReferencesKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureChainNameParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_FeatureChainName_8=ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FeatureChainName_8);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleConnectorEnd"


    // $ANTLR start "entryRuleMultiplicityExpression"
    // InternalSysMLOC.g:5140:1: entryRuleMultiplicityExpression returns [String current=null] : iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF ;
    public final String entryRuleMultiplicityExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityExpression = null;


        try {
            // InternalSysMLOC.g:5140:62: (iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF )
            // InternalSysMLOC.g:5141:2: iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityExpression=ruleMultiplicityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityExpression.getText(); 
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
    // $ANTLR end "entryRuleMultiplicityExpression"


    // $ANTLR start "ruleMultiplicityExpression"
    // InternalSysMLOC.g:5147:1: ruleMultiplicityExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralExpression_0 = null;

        AntlrDatatypeRuleToken this_FeatureReferenceExpression_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5153:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) )
            // InternalSysMLOC.g:5154:2: (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            {
            // InternalSysMLOC.g:5154:2: (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RULE_STRING_VALUE||(LA137_0>=RULE_DECIMAL_VALUE && LA137_0<=RULE_EXP_VALUE)||LA137_0==19||(LA137_0>=77 && LA137_0<=79)) ) {
                alt137=1;
            }
            else if ( ((LA137_0>=RULE_ID && LA137_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalSysMLOC.g:5155:3: this_LiteralExpression_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMultiplicityExpressionAccess().getLiteralExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralExpression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5166:3: this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMultiplicityExpressionAccess().getFeatureReferenceExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureReferenceExpression_1=ruleFeatureReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FeatureReferenceExpression_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleMultiplicityExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalSysMLOC.g:5180:1: entryRuleLiteralExpression returns [String current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final String entryRuleLiteralExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralExpression = null;


        try {
            // InternalSysMLOC.g:5180:57: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalSysMLOC.g:5181:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression.getText(); 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalSysMLOC.g:5187:1: ruleLiteralExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final AntlrDatatypeRuleToken ruleLiteralExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralBoolean_0 = null;

        AntlrDatatypeRuleToken this_LiteralString_1 = null;

        AntlrDatatypeRuleToken this_LiteralInteger_2 = null;

        AntlrDatatypeRuleToken this_LiteralReal_3 = null;

        AntlrDatatypeRuleToken this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5193:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalSysMLOC.g:5194:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalSysMLOC.g:5194:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt138=5;
            switch ( input.LA(1) ) {
            case 77:
            case 78:
                {
                alt138=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt138=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA138_3 = input.LA(2);

                if ( (LA138_3==79) ) {
                    alt138=4;
                }
                else if ( (LA138_3==EOF||(LA138_3>=64 && LA138_3<=65)) ) {
                    alt138=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 138, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 79:
                {
                alt138=4;
                }
                break;
            case 19:
                {
                alt138=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // InternalSysMLOC.g:5195:3: this_LiteralBoolean_0= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralBoolean_0=ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralBoolean_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5206:3: this_LiteralString_1= ruleLiteralString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralString_1=ruleLiteralString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralString_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:5217:3: this_LiteralInteger_2= ruleLiteralInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralInteger_2=ruleLiteralInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralInteger_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:5228:3: this_LiteralReal_3= ruleLiteralReal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralRealParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralReal_3=ruleLiteralReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralReal_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:5239:3: this_LiteralInfinity_4= ruleLiteralInfinity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralInfinityParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralInfinity_4=ruleLiteralInfinity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralInfinity_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalSysMLOC.g:5253:1: entryRuleLiteralBoolean returns [String current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final String entryRuleLiteralBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralBoolean = null;


        try {
            // InternalSysMLOC.g:5253:54: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalSysMLOC.g:5254:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean.getText(); 
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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalSysMLOC.g:5260:1: ruleLiteralBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BooleanValue_0= ruleBooleanValue ;
    public final AntlrDatatypeRuleToken ruleLiteralBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanValue_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5266:2: (this_BooleanValue_0= ruleBooleanValue )
            // InternalSysMLOC.g:5267:2: this_BooleanValue_0= ruleBooleanValue
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLiteralBooleanAccess().getBooleanValueParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_BooleanValue_0=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BooleanValue_0);
              	
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalSysMLOC.g:5280:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalSysMLOC.g:5280:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalSysMLOC.g:5281:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue.getText(); 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalSysMLOC.g:5287:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5293:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSysMLOC.g:5294:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSysMLOC.g:5294:2: (kw= 'true' | kw= 'false' )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==77) ) {
                alt139=1;
            }
            else if ( (LA139_0==78) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // InternalSysMLOC.g:5295:3: kw= 'true'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5301:3: kw= 'false'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getFalseKeyword_1());
                      		
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLiteralString"
    // InternalSysMLOC.g:5310:1: entryRuleLiteralString returns [String current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final String entryRuleLiteralString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralString = null;


        try {
            // InternalSysMLOC.g:5310:53: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalSysMLOC.g:5311:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralString=ruleLiteralString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralString.getText(); 
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
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // InternalSysMLOC.g:5317:1: ruleLiteralString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_VALUE_0= RULE_STRING_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_VALUE_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5323:2: (this_STRING_VALUE_0= RULE_STRING_VALUE )
            // InternalSysMLOC.g:5324:2: this_STRING_VALUE_0= RULE_STRING_VALUE
            {
            this_STRING_VALUE_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_VALUE_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_VALUE_0, grammarAccess.getLiteralStringAccess().getSTRING_VALUETerminalRuleCall());
              	
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
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalSysMLOC.g:5334:1: entryRuleLiteralInteger returns [String current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final String entryRuleLiteralInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInteger = null;


        try {
            // InternalSysMLOC.g:5334:54: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalSysMLOC.g:5335:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInteger=ruleLiteralInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralInteger.getText(); 
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
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalSysMLOC.g:5341:1: ruleLiteralInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5347:2: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:5348:2: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
            {
            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DECIMAL_VALUE_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getLiteralIntegerAccess().getDECIMAL_VALUETerminalRuleCall());
              	
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
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleLiteralReal"
    // InternalSysMLOC.g:5358:1: entryRuleLiteralReal returns [String current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final String entryRuleLiteralReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralReal = null;


        try {
            // InternalSysMLOC.g:5358:51: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalSysMLOC.g:5359:2: iv_ruleLiteralReal= ruleLiteralReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRealRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralReal=ruleLiteralReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralReal.getText(); 
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
    // $ANTLR end "entryRuleLiteralReal"


    // $ANTLR start "ruleLiteralReal"
    // InternalSysMLOC.g:5365:1: ruleLiteralReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_RealValue_0= ruleRealValue ;
    public final AntlrDatatypeRuleToken ruleLiteralReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_RealValue_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5371:2: (this_RealValue_0= ruleRealValue )
            // InternalSysMLOC.g:5372:2: this_RealValue_0= ruleRealValue
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLiteralRealAccess().getRealValueParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_RealValue_0=ruleRealValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_RealValue_0);
              	
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleLiteralReal"


    // $ANTLR start "entryRuleRealValue"
    // InternalSysMLOC.g:5385:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalSysMLOC.g:5385:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalSysMLOC.g:5386:2: iv_ruleRealValue= ruleRealValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealValue.getText(); 
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
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalSysMLOC.g:5392:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5398:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalSysMLOC.g:5399:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalSysMLOC.g:5399:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==RULE_DECIMAL_VALUE||LA142_0==79) ) {
                alt142=1;
            }
            else if ( (LA142_0==RULE_EXP_VALUE) ) {
                alt142=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // InternalSysMLOC.g:5400:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalSysMLOC.g:5400:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalSysMLOC.g:5401:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalSysMLOC.g:5401:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==RULE_DECIMAL_VALUE) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // InternalSysMLOC.g:5402:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_0=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_87); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_DECIMAL_VALUE_0);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_DECIMAL_VALUE_0, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_0());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,79,FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalSysMLOC.g:5415:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==RULE_DECIMAL_VALUE) ) {
                        alt141=1;
                    }
                    else if ( (LA141_0==RULE_EXP_VALUE) ) {
                        alt141=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }
                    switch (alt141) {
                        case 1 :
                            // InternalSysMLOC.g:5416:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
                            {
                            this_DECIMAL_VALUE_2=(Token)match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_DECIMAL_VALUE_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_DECIMAL_VALUE_2, grammarAccess.getRealValueAccess().getDECIMAL_VALUETerminalRuleCall_0_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:5424:5: this_EXP_VALUE_3= RULE_EXP_VALUE
                            {
                            this_EXP_VALUE_3=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_EXP_VALUE_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_EXP_VALUE_3, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5434:3: this_EXP_VALUE_4= RULE_EXP_VALUE
                    {
                    this_EXP_VALUE_4=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXP_VALUE_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXP_VALUE_4, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleLiteralInfinity"
    // InternalSysMLOC.g:5445:1: entryRuleLiteralInfinity returns [String current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final String entryRuleLiteralInfinity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInfinity = null;


        try {
            // InternalSysMLOC.g:5445:55: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalSysMLOC.g:5446:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralInfinityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInfinity=ruleLiteralInfinity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralInfinity.getText(); 
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
    // $ANTLR end "entryRuleLiteralInfinity"


    // $ANTLR start "ruleLiteralInfinity"
    // InternalSysMLOC.g:5452:1: ruleLiteralInfinity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleLiteralInfinity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5458:2: (kw= '*' )
            // InternalSysMLOC.g:5459:2: kw= '*'
            {
            kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLiteralInfinityAccess().getAsteriskKeyword());
              	
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
    // $ANTLR end "ruleLiteralInfinity"


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalSysMLOC.g:5467:1: entryRuleFeatureReferenceExpression returns [String current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final String entryRuleFeatureReferenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalSysMLOC.g:5467:66: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalSysMLOC.g:5468:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReferenceExpression=ruleFeatureReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureReferenceExpression.getText(); 
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
    // $ANTLR end "entryRuleFeatureReferenceExpression"


    // $ANTLR start "ruleFeatureReferenceExpression"
    // InternalSysMLOC.g:5474:1: ruleFeatureReferenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleFeatureReferenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5480:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalSysMLOC.g:5481:2: this_QualifiedName_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFeatureReferenceExpressionAccess().getQualifiedNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
              	
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleFeatureReferenceExpression"


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:5494:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysMLOC.g:5494:44: (iv_ruleName= ruleName EOF )
            // InternalSysMLOC.g:5495:2: iv_ruleName= ruleName EOF
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
    // InternalSysMLOC.g:5501:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5507:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalSysMLOC.g:5508:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalSysMLOC.g:5508:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==RULE_ID) ) {
                alt143=1;
            }
            else if ( (LA143_0==RULE_UNRESTRICTED_NAME) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalSysMLOC.g:5509:3: this_ID_0= RULE_ID
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
                    // InternalSysMLOC.g:5517:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalSysMLOC.g:5528:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysMLOC.g:5528:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysMLOC.g:5529:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSysMLOC.g:5535:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5541:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) )
            // InternalSysMLOC.g:5542:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            {
            // InternalSysMLOC.g:5542:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            // InternalSysMLOC.g:5543:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_89);
            this_Name_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:5553:3: (kw= '::' this_Name_2= ruleName )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==18) ) {
                    int LA144_2 = input.LA(2);

                    if ( ((LA144_2>=RULE_ID && LA144_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt144=1;
                    }


                }


                switch (alt144) {
            	case 1 :
            	    // InternalSysMLOC.g:5554:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_89);
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
            	    break loop144;
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
    // InternalSysMLOC.g:5574:1: entryRuleFeatureChainName returns [String current=null] : iv_ruleFeatureChainName= ruleFeatureChainName EOF ;
    public final String entryRuleFeatureChainName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureChainName = null;


        try {
            // InternalSysMLOC.g:5574:56: (iv_ruleFeatureChainName= ruleFeatureChainName EOF )
            // InternalSysMLOC.g:5575:2: iv_ruleFeatureChainName= ruleFeatureChainName EOF
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
    // InternalSysMLOC.g:5581:1: ruleFeatureChainName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFeatureChainName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_Name_3 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5587:2: ( ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) )
            // InternalSysMLOC.g:5588:2: ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            {
            // InternalSysMLOC.g:5588:2: ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            // InternalSysMLOC.g:5589:3: (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )*
            {
            // InternalSysMLOC.g:5589:3: (kw= '~' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==80) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalSysMLOC.g:5590:4: kw= '~'
                    {
                    kw=(Token)match(input,80,FOLLOW_4); if (state.failed) return current;
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
            pushFollow(FOLLOW_90);
            this_QualifiedName_1=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:5606:3: (kw= '.' this_Name_3= ruleName )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==79) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // InternalSysMLOC.g:5607:4: kw= '.' this_Name_3= ruleName
            	    {
            	    kw=(Token)match(input,79,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFeatureChainNameAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_90);
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
            	    break loop146;
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
    // InternalSysMLOC.g:5627:1: entryRuleExpressionName returns [String current=null] : iv_ruleExpressionName= ruleExpressionName EOF ;
    public final String entryRuleExpressionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionName = null;


        try {
            // InternalSysMLOC.g:5627:54: (iv_ruleExpressionName= ruleExpressionName EOF )
            // InternalSysMLOC.g:5628:2: iv_ruleExpressionName= ruleExpressionName EOF
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
    // InternalSysMLOC.g:5634:1: ruleExpressionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue ) ;
    public final AntlrDatatypeRuleToken ruleExpressionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FeatureChainName_0 = null;

        AntlrDatatypeRuleToken this_RealValue_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5640:2: ( (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue ) )
            // InternalSysMLOC.g:5641:2: (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue )
            {
            // InternalSysMLOC.g:5641:2: (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( ((LA147_0>=RULE_ID && LA147_0<=RULE_UNRESTRICTED_NAME)||LA147_0==80) ) {
                alt147=1;
            }
            else if ( ((LA147_0>=RULE_DECIMAL_VALUE && LA147_0<=RULE_EXP_VALUE)||LA147_0==79) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalSysMLOC.g:5642:3: this_FeatureChainName_0= ruleFeatureChainName
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
                    // InternalSysMLOC.g:5653:3: this_RealValue_1= ruleRealValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionNameAccess().getRealValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealValue_1=ruleRealValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RealValue_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleExpressionName"


    // $ANTLR start "entryRuleExpression"
    // InternalSysMLOC.g:5667:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalSysMLOC.g:5667:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalSysMLOC.g:5668:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSysMLOC.g:5674:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) ) ;
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
            // InternalSysMLOC.g:5680:2: ( ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) ) )
            // InternalSysMLOC.g:5681:2: ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) )
            {
            // InternalSysMLOC.g:5681:2: ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( ((LA151_0>=RULE_DECIMAL_VALUE && LA151_0<=RULE_OPERATOR)||(LA151_0>=79 && LA151_0<=80)) ) {
                alt151=1;
            }
            else if ( (LA151_0==55) ) {
                alt151=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // InternalSysMLOC.g:5682:3: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* )
                    {
                    // InternalSysMLOC.g:5682:3: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* )
                    // InternalSysMLOC.g:5683:4: (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )*
                    {
                    // InternalSysMLOC.g:5683:4: (this_OPERATOR_0= RULE_OPERATOR )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==RULE_OPERATOR) ) {
                            alt148=1;
                        }


                        switch (alt148) {
                    	case 1 :
                    	    // InternalSysMLOC.g:5684:5: this_OPERATOR_0= RULE_OPERATOR
                    	    {
                    	    this_OPERATOR_0=(Token)match(input,RULE_OPERATOR,FOLLOW_91); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_OPERATOR_0);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OPERATOR_0, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_92);
                    this_ExpressionName_1=ruleExpressionName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionName_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:5702:4: (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==RULE_OPERATOR) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // InternalSysMLOC.g:5703:5: this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )?
                    	    {
                    	    this_OPERATOR_2=(Token)match(input,RULE_OPERATOR,FOLLOW_93); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_OPERATOR_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OPERATOR_2, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:5710:5: (this_ExpressionName_3= ruleExpressionName )?
                    	    int alt149=2;
                    	    alt149 = dfa149.predict(input);
                    	    switch (alt149) {
                    	        case 1 :
                    	            // InternalSysMLOC.g:5711:6: this_ExpressionName_3= ruleExpressionName
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_0_2_1());
                    	              					
                    	            }
                    	            pushFollow(FOLLOW_92);
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
                    	    break loop150;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5725:3: (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
                    {
                    // InternalSysMLOC.g:5725:3: (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
                    // InternalSysMLOC.g:5726:4: kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')'
                    {
                    kw=(Token)match(input,55,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getSequenceExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_94);
                    this_SequenceExpression_5=ruleSequenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SequenceExpression_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:5751:1: entryRuleSequenceExpression returns [String current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final String entryRuleSequenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSequenceExpression = null;


        try {
            // InternalSysMLOC.g:5751:58: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalSysMLOC.g:5752:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalSysMLOC.g:5758:1: ruleSequenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleSequenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5764:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalSysMLOC.g:5765:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalSysMLOC.g:5765:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalSysMLOC.g:5766:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_72);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:5776:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==24) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // InternalSysMLOC.g:5777:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,24,FOLLOW_74); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSequenceExpressionAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_72);
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
            	    break loop152;
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
    // InternalSysMLOC.g:5797:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5803:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalSysMLOC.g:5804:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalSysMLOC.g:5804:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt153=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt153=1;
                }
                break;
            case 82:
                {
                alt153=2;
                }
                break;
            case 83:
                {
                alt153=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // InternalSysMLOC.g:5805:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSysMLOC.g:5805:3: (enumLiteral_0= 'public' )
                    // InternalSysMLOC.g:5806:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5813:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSysMLOC.g:5813:3: (enumLiteral_1= 'private' )
                    // InternalSysMLOC.g:5814:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:5821:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalSysMLOC.g:5821:3: (enumLiteral_2= 'protected' )
                    // InternalSysMLOC.g:5822:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:5832:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5838:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalSysMLOC.g:5839:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalSysMLOC.g:5839:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt154=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt154=1;
                }
                break;
            case 85:
                {
                alt154=2;
                }
                break;
            case 86:
                {
                alt154=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // InternalSysMLOC.g:5840:3: (enumLiteral_0= 'in' )
                    {
                    // InternalSysMLOC.g:5840:3: (enumLiteral_0= 'in' )
                    // InternalSysMLOC.g:5841:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5848:3: (enumLiteral_1= 'out' )
                    {
                    // InternalSysMLOC.g:5848:3: (enumLiteral_1= 'out' )
                    // InternalSysMLOC.g:5849:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:5856:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalSysMLOC.g:5856:3: (enumLiteral_2= 'inout' )
                    // InternalSysMLOC.g:5857:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "rulePortionKind"
    // InternalSysMLOC.g:5867:1: rulePortionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) ) ;
    public final Enumerator rulePortionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5873:2: ( ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) ) )
            // InternalSysMLOC.g:5874:2: ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) )
            {
            // InternalSysMLOC.g:5874:2: ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==87) ) {
                alt155=1;
            }
            else if ( (LA155_0==88) ) {
                alt155=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalSysMLOC.g:5875:3: (enumLiteral_0= 'snapshot' )
                    {
                    // InternalSysMLOC.g:5875:3: (enumLiteral_0= 'snapshot' )
                    // InternalSysMLOC.g:5876:4: enumLiteral_0= 'snapshot'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPortionKindAccess().getSnapshotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPortionKindAccess().getSnapshotEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5883:3: (enumLiteral_1= 'timeslice' )
                    {
                    // InternalSysMLOC.g:5883:3: (enumLiteral_1= 'timeslice' )
                    // InternalSysMLOC.g:5884:4: enumLiteral_1= 'timeslice'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPortionKindAccess().getTimesliceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPortionKindAccess().getTimesliceEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "rulePortionKind"

    // $ANTLR start synpred1_InternalSysMLOC
    public final void synpred1_InternalSysMLOC_fragment() throws RecognitionException {   
        // InternalSysMLOC.g:4337:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )
        // InternalSysMLOC.g:
        {
        if ( (input.LA(1)>=57 && input.LA(1)<=59)||input.LA(1)==68||(input.LA(1)>=70 && input.LA(1)<=76) ) {
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA149 dfa149 = new DFA149(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\4\2\uffff\16\12\3\uffff\2\12\2\uffff";
    static final String dfa_3s = "\1\130\2\uffff\5\130\2\114\1\130\3\114\2\120\1\114\3\uffff\2\130\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\16\uffff\1\4\1\5\1\7\2\uffff\1\6\1\3";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\2\23\1\uffff\1\2\2\uffff\2\21\2\uffff\1\1\1\21\5\uffff\1\21\1\2\2\uffff\4\2\1\10\1\uffff\1\11\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\4\uffff\1\12\1\6\1\7\4\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\4\uffff\1\3\1\4\1\5\5\21",
            "",
            "",
            "\2\21\3\uffff\1\21\1\uffff\1\26\3\uffff\1\21\7\uffff\1\10\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\3\uffff\1\26\1\12\1\24\1\25\4\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\7\uffff\5\21",
            "\2\21\3\uffff\1\21\1\uffff\1\26\3\uffff\1\21\7\uffff\1\10\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\3\uffff\1\26\1\12\1\24\1\25\4\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\7\uffff\5\21",
            "\2\21\3\uffff\1\21\1\uffff\1\26\3\uffff\1\21\7\uffff\1\10\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\3\uffff\1\26\1\12\1\24\1\25\4\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\7\uffff\5\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\1\uffff\1\21\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\5\uffff\1\12\3\uffff\3\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\1\uffff\1\21\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\5\uffff\1\12\3\uffff\3\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\32\uffff\7\21\2\uffff\3\21\1\uffff\7\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\32\uffff\7\21\2\uffff\3\21\1\uffff\7\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\12\uffff\1\13\1\14\1\21\1\15\1\21\1\17\1\16\3\uffff\1\21\16\uffff\7\21\2\uffff\3\21\1\uffff\7\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\32\uffff\7\21\2\uffff\3\21\1\uffff\7\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\32\uffff\7\21\2\uffff\3\21\1\uffff\7\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\5\uffff\1\21\24\uffff\7\21\2\uffff\3\21\1\uffff\7\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\10\uffff\2\21\20\uffff\7\21\2\uffff\3\21\1\uffff\7\21\3\uffff\1\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\5\uffff\1\21\22\uffff\1\21\1\uffff\3\21\3\uffff\1\21\2\uffff\3\21\1\uffff\7\21\3\uffff\1\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\32\uffff\7\21\2\uffff\3\21\1\uffff\7\21",
            "",
            "",
            "",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\5\uffff\1\12\3\uffff\3\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\5\uffff\1\12\3\uffff\3\21\2\uffff\7\21\2\uffff\3\21\1\uffff\7\21\12\uffff\2\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "205:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_AliasElement_4= ruleAliasElement | this_ImportElement_5= ruleImportElement | this_CodeAnnotation_6= ruleCodeAnnotation )";
        }
    }
    static final String dfa_7s = "\27\uffff";
    static final String dfa_8s = "\1\4\1\uffff\16\12\3\uffff\2\12\2\uffff";
    static final String dfa_9s = "\1\130\1\uffff\5\130\2\114\1\130\3\114\2\120\1\114\3\uffff\2\130\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\16\uffff\1\4\1\5\1\6\2\uffff\1\2\1\3";
    static final String dfa_11s = "\27\uffff}>";
    static final String[] dfa_12s = {
            "\2\21\1\uffff\1\1\2\uffff\2\20\3\uffff\1\20\5\uffff\1\20\1\1\2\uffff\4\1\1\7\1\uffff\1\10\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\4\uffff\1\11\1\5\1\6\4\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\4\uffff\1\2\1\3\1\4\5\20",
            "",
            "\2\20\3\uffff\1\20\1\uffff\1\25\3\uffff\1\20\7\uffff\1\7\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\3\uffff\1\25\1\11\1\23\1\24\4\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\7\uffff\5\20",
            "\2\20\3\uffff\1\20\1\uffff\1\25\3\uffff\1\20\7\uffff\1\7\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\3\uffff\1\25\1\11\1\23\1\24\4\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\7\uffff\5\20",
            "\2\20\3\uffff\1\20\1\uffff\1\25\3\uffff\1\20\7\uffff\1\7\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\3\uffff\1\25\1\11\1\23\1\24\4\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\7\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\1\uffff\1\20\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\5\uffff\1\11\3\uffff\3\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\1\uffff\1\20\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\5\uffff\1\11\3\uffff\3\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\32\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\32\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\1\12\1\13\1\20\1\14\1\20\1\16\1\15\3\uffff\1\20\16\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\32\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\32\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\5\uffff\1\20\24\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\10\uffff\2\20\20\uffff\7\20\2\uffff\3\20\1\uffff\7\20\3\uffff\1\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\5\uffff\1\20\22\uffff\1\20\1\uffff\3\20\3\uffff\1\20\2\uffff\3\20\1\uffff\7\20\3\uffff\1\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\32\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "",
            "",
            "",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\5\uffff\1\11\3\uffff\3\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\5\uffff\1\11\3\uffff\3\20\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\2\20",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "286:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_ImportElement_1= ruleImportElement | this_DefinitionElement_2= ruleDefinitionElement | this_UsageElement_3= ruleUsageElement | this_CodeAnnotation_4= ruleCodeAnnotation | this_AliasElement_5= ruleAliasElement )";
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\1\121\4\21\1\12\2\22\1\12\1\uffff\2\22\1\uffff";
    static final String dfa_15s = "\1\123\3\57\1\21\1\13\3\25\1\uffff\2\25\1\uffff";
    static final String dfa_16s = "\11\uffff\1\2\2\uffff\1\1";
    static final String dfa_17s = "\15\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\3",
            "\1\5\35\uffff\1\4",
            "\1\5\35\uffff\1\4",
            "\1\5\35\uffff\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\10\3\11",
            "\1\10\3\11",
            "\1\12\1\13\7\uffff\3\14",
            "",
            "\1\10\3\11",
            "\1\10\3\11",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "464:2: (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport )";
        }
    }
    static final String dfa_19s = "\17\uffff";
    static final String dfa_20s = "\6\35\2\uffff\1\40\6\uffff";
    static final String dfa_21s = "\1\123\3\62\2\60\2\uffff\1\46\6\uffff";
    static final String dfa_22s = "\6\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_23s = "\17\uffff}>";
    static final String[] dfa_24s = {
            "\1\6\1\uffff\1\7\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\11\uffff\1\10\1\4\1\5\36\uffff\1\1\1\2\1\3",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\11\uffff\1\10\1\4\1\5",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\11\uffff\1\10\1\4\1\5",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\11\uffff\1\10\1\4\1\5",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\11\uffff\1\10",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\11\uffff\1\10",
            "",
            "",
            "\1\11\1\12\1\uffff\1\13\1\uffff\1\15\1\14",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "500:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition )";
        }
    }
    static final String dfa_25s = "\4\12\1\uffff\11\12\1\uffff";
    static final String dfa_26s = "\4\130\1\uffff\1\114\10\130\1\uffff";
    static final String dfa_27s = "\4\uffff\1\1\11\uffff\1\2";
    static final String[] dfa_28s = {
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\1\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\1\11\1\12\1\5\1\13\1\14\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\4\uffff\1\1\1\2\1\3\1\6\1\7\1\10\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\2\uffff\7\16\3\uffff\1\16\5\uffff\7\16\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\7\uffff\5\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\2\uffff\7\16\3\uffff\1\16\5\uffff\7\16\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\7\uffff\5\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\2\uffff\7\16\3\uffff\1\16\5\uffff\7\16\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\7\uffff\5\16",
            "",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\16\uffff\7\16\2\uffff\3\16\1\uffff\7\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\1\11\1\12\1\uffff\1\13\1\14\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\1\11\1\12\1\uffff\1\13\1\14\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\1\11\1\12\1\uffff\1\13\1\14\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\3\uffff\1\13\1\14\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\3\uffff\1\13\1\14\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\4\uffff\1\14\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\5\uffff\1\15\2\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\5\uffff\1\16\10\uffff\7\16\2\uffff\3\16\1\uffff\7\16\12\uffff\2\16",
            ""
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_23;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "590:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )";
        }
    }
    static final String dfa_29s = "\22\uffff";
    static final String dfa_30s = "\20\12\2\uffff";
    static final String dfa_31s = "\4\130\1\114\11\130\2\114\2\uffff";
    static final String dfa_32s = "\20\uffff\1\1\1\2";
    static final String dfa_33s = "\22\uffff}>";
    static final String[] dfa_34s = {
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\4\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\16\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\4\uffff\1\13\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\5\uffff\1\14\2\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\5\uffff\1\15\10\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\16\uffff\7\20\2\uffff\3\20\1\uffff\7\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\16\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\16\uffff\7\20\2\uffff\3\20\1\uffff\7\20",
            "",
            ""
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "662:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )";
        }
    }
    static final String dfa_35s = "\26\uffff";
    static final String dfa_36s = "\20\12\6\uffff";
    static final String dfa_37s = "\4\130\1\114\11\130\2\114\6\uffff";
    static final String dfa_38s = "\20\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_39s = "\26\uffff}>";
    static final String[] dfa_40s = {
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\4\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\22\uffff\7\22\2\uffff\3\22\1\uffff\7\22",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\4\uffff\1\13\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\5\uffff\1\14\2\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\11\uffff\1\15\10\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\22\uffff\7\22\2\uffff\3\22\1\uffff\7\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\22\uffff\7\22\2\uffff\3\22\1\uffff\7\22",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\22\uffff\7\22\2\uffff\3\22\1\uffff\7\22",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_35;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "698:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )";
        }
    }
    static final String dfa_41s = "\36\uffff";
    static final String dfa_42s = "\1\12\1\uffff\1\12\1\105\12\12\2\0\2\12\2\0\1\12\2\0\1\12\2\0\1\12\2\0\1\uffff";
    static final String dfa_43s = "\1\120\1\uffff\1\120\1\105\11\120\1\13\2\0\1\120\1\13\2\0\1\13\2\0\1\13\2\0\1\13\2\0\1\uffff";
    static final String dfa_44s = "\1\uffff\1\2\33\uffff\1\1";
    static final String dfa_45s = "\16\uffff\1\7\1\0\2\uffff\1\3\1\11\1\uffff\1\2\1\5\1\uffff\1\10\1\1\1\uffff\1\4\1\6\1\uffff}>";
    static final String[] dfa_46s = {
            "\2\1\3\uffff\1\1\5\uffff\1\1\16\uffff\1\1\2\uffff\2\1\20\uffff\1\2\1\4\1\5\4\1\2\uffff\2\1\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\3\uffff\1\1",
            "",
            "\1\16\1\17\104\uffff\1\15",
            "\1\20",
            "\1\22\1\23\104\uffff\1\21",
            "\1\22\1\23\104\uffff\1\21",
            "\1\22\1\23\104\uffff\1\21",
            "\1\25\1\26\104\uffff\1\24",
            "\1\25\1\26\104\uffff\1\24",
            "\1\30\1\31\104\uffff\1\27",
            "\1\30\1\31\104\uffff\1\27",
            "\1\33\1\34\104\uffff\1\32",
            "\1\33\1\34\104\uffff\1\32",
            "\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\16\1\17\104\uffff\1\15",
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

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "()+ loopback of 4336:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_15 = input.LA(1);

                         
                        int index110_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA110_25 = input.LA(1);

                         
                        int index110_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA110_21 = input.LA(1);

                         
                        int index110_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA110_18 = input.LA(1);

                         
                        int index110_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_18);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA110_27 = input.LA(1);

                         
                        int index110_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_27);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA110_22 = input.LA(1);

                         
                        int index110_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA110_28 = input.LA(1);

                         
                        int index110_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_28);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA110_14 = input.LA(1);

                         
                        int index110_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_14);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA110_24 = input.LA(1);

                         
                        int index110_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_24);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA110_19 = input.LA(1);

                         
                        int index110_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_47s = "\43\uffff";
    static final String dfa_48s = "\1\77\1\6\1\uffff\4\100\1\10\2\100\2\22\1\6\1\12\2\100\1\12\4\100\1\10\2\100\2\22\1\uffff\2\22\1\12\2\100\1\12\2\22";
    static final String dfa_49s = "\1\103\1\117\1\uffff\3\101\1\117\1\11\4\101\1\117\1\120\2\101\1\13\3\100\1\117\1\11\4\100\1\uffff\2\101\1\120\2\100\1\13\2\100";
    static final String dfa_50s = "\2\uffff\1\2\27\uffff\1\1\10\uffff";
    static final String dfa_51s = "\43\uffff}>";
    static final String[] dfa_52s = {
            "\1\1\2\uffff\2\2",
            "\1\5\1\uffff\1\6\1\10\1\12\1\13\7\uffff\1\11\71\uffff\1\3\1\4\1\7",
            "",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14\15\uffff\1\7",
            "\1\16\1\17",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\20\55\uffff\1\15\1\14",
            "\1\20\55\uffff\1\15\1\14",
            "\1\23\1\uffff\1\24\1\26\1\30\1\31\7\uffff\1\27\71\uffff\1\21\1\22\1\25",
            "\2\32\3\uffff\1\32\5\uffff\1\32\16\uffff\1\32\2\uffff\2\32\20\uffff\6\32\3\uffff\2\2\1\32\1\uffff\7\32\3\uffff\1\32",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\33\1\34",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35\16\uffff\1\25",
            "\1\36\1\37",
            "\1\35",
            "\1\35",
            "\1\40\55\uffff\1\35",
            "\1\40\55\uffff\1\35",
            "",
            "\1\20\55\uffff\1\15\1\14",
            "\1\20\55\uffff\1\15\1\14",
            "\2\32\3\uffff\1\32\5\uffff\1\32\16\uffff\1\32\2\uffff\2\32\20\uffff\6\32\3\uffff\2\2\1\32\1\uffff\7\32\3\uffff\1\32",
            "\1\35",
            "\1\35",
            "\1\41\1\42",
            "\1\40\55\uffff\1\35",
            "\1\40\55\uffff\1\35"
    };

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "4497:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) )";
        }
    }
    static final String dfa_53s = "\1\77\1\6\4\100\1\10\2\100\2\22\2\uffff\2\100\1\12\2\22";
    static final String dfa_54s = "\1\77\1\117\3\101\1\117\1\11\4\101\2\uffff\2\101\1\13\2\101";
    static final String dfa_55s = "\13\uffff\1\2\1\1\5\uffff";
    static final String[] dfa_56s = {
            "\1\1",
            "\1\4\1\uffff\1\5\1\7\1\11\1\12\7\uffff\1\10\71\uffff\1\2\1\3\1\6",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\14\1\13\15\uffff\1\6",
            "\1\15\1\16",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\17\55\uffff\1\14\1\13",
            "\1\17\55\uffff\1\14\1\13",
            "",
            "",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\20\1\21",
            "\1\17\55\uffff\1\14\1\13",
            "\1\17\55\uffff\1\14\1\13"
    };
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_33;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "4498:3: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) )";
        }
    }
    static final String dfa_57s = "\23\uffff";
    static final String dfa_58s = "\1\77\1\6\1\uffff\4\100\1\10\2\100\2\22\2\uffff\2\100\1\12\2\22";
    static final String dfa_59s = "\1\103\1\117\1\uffff\3\101\1\117\1\11\4\101\2\uffff\2\101\1\13\2\101";
    static final String dfa_60s = "\2\uffff\1\3\11\uffff\1\1\1\2\5\uffff";
    static final String dfa_61s = "\23\uffff}>";
    static final String[] dfa_62s = {
            "\1\1\2\uffff\2\2",
            "\1\5\1\uffff\1\6\1\10\1\12\1\13\7\uffff\1\11\71\uffff\1\3\1\4\1\7",
            "",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\14\1\15\15\uffff\1\7",
            "\1\16\1\17",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\20\55\uffff\1\14\1\15",
            "\1\20\55\uffff\1\14\1\15",
            "",
            "",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\21\1\22",
            "\1\20\55\uffff\1\14\1\15",
            "\1\20\55\uffff\1\14\1\15"
    };

    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = dfa_57;
            this.eof = dfa_57;
            this.min = dfa_58;
            this.max = dfa_59;
            this.accept = dfa_60;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "4584:4: ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )?";
        }
    }
    static final String dfa_63s = "\14\uffff";
    static final String dfa_64s = "\1\5\1\uffff\2\4\4\uffff\4\4";
    static final String dfa_65s = "\1\10\3\12\2\uffff\6\12";
    static final String dfa_66s = "\1\120\1\13\2\120\2\uffff\2\13\4\120";
    static final String dfa_67s = "\4\uffff\1\1\1\2\6\uffff";
    static final String dfa_68s = "\14\uffff}>";
    static final String[] dfa_69s = {
            "\2\4\1\2\1\3\1\5\2\uffff\1\5\5\uffff\1\5\2\uffff\1\5\13\uffff\1\5\2\uffff\2\5\17\uffff\1\5\26\uffff\1\4\1\1",
            "\1\2\1\3",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\16\uffff\1\4\26\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\16\uffff\1\4\26\uffff\1\7\1\4",
            "",
            "",
            "\1\10\1\11",
            "\1\12\1\13",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\16\uffff\1\4\26\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\16\uffff\1\4\26\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\5\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\16\uffff\1\4\26\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\5\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\16\uffff\1\4\26\uffff\1\7\1\4"
    };

    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[][] dfa_69 = unpackEncodedStringArray(dfa_69s);

    class DFA149 extends DFA {

        public DFA149(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 149;
            this.eot = dfa_63;
            this.eof = dfa_64;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_67;
            this.special = dfa_68;
            this.transition = dfa_69;
        }
        public String getDescription() {
            return "5710:5: (this_ExpressionName_3= ruleExpressionName )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x007F086FBE4140B0L,0x00000000007E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100002800C80L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002800080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100002000C80L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100010000C00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0006000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0E00000000208C00L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFE00000000208C00L,0x0000000000001FDCL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xFE0000009E618C80L,0x0000000000001FDCL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0007000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x007E000020000000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0007000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0006000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFE00000400208C00L,0x0000000000001FDCL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0007000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFE00001000208C00L,0x0000000000001FDCL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x7000001000208000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000208000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8080000000000C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0007002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8E80001000208C00L,0x0000000000011FDCL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0007004000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xFE00018000208C00L,0x0000000000011FDCL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xF000018000208C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000018000208C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000010000208C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000000000C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000500000000C00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000C00L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000000001E410080L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0001000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0036000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0100000001000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0E00000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x8080000000001F00L,0x0000000000018000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0xB080000000001F00L,0x0000000000018000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x8E00000000000C02L,0x0000000000001FDCL});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0E00000000000002L,0x0000000000001FD0L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x8000000000081F40L,0x000000000001E000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x8000000000001F00L,0x0000000000018000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x8000000000001F02L,0x0000000000018000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0100000000000000L});

}