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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_NOTE", "RULE_ML_NOTE", "RULE_STRING_VALUE", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_OPERATOR", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "'::'", "'*'", "'**'", "';'", "'comment'", "'about'", "','", "'locale'", "'doc'", "'rep'", "'language'", "'attribute'", "'def'", "'enum'", "'item'", "'part'", "'port'", "'connection'", "'connect'", "'interface'", "'flow'", "'of'", "'from'", "'to'", "'action'", "'alias'", "'<'", "'>'", "'for'", "'['", "'..'", "']'", "'::>'", "'references'", "'all'", "'individual'", "'abstract'", "'variation'", "'end'", "'readonly'", "'derived'", "'ref'", "'('", "')'", "':'", "':>'", "'specializes'", "'='", "':='", "'default'", "'ordered'", "'nonunique'", "'defined'", "'by'", "'subsets'", "'=>'", "'crosses'", "':>>'", "'redefines'", "'true'", "'false'", "'.'", "'~'", "'public'", "'private'", "'protected'", "'in'", "'out'", "'inout'", "'snapshot'", "'timeslice'"
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

                if ( ((LA3_0>=RULE_SL_NOTE && LA3_0<=RULE_ML_NOTE)||LA3_0==RULE_REGULAR_COMMENT||(LA3_0>=RULE_ID && LA3_0<=RULE_UNRESTRICTED_NAME)||(LA3_0>=14 && LA3_0<=15)||(LA3_0>=21 && LA3_0<=22)||(LA3_0>=25 && LA3_0<=29)||(LA3_0>=31 && LA3_0<=38)||(LA3_0>=42 && LA3_0<=43)||LA3_0==47||(LA3_0>=50 && LA3_0<=51)||(LA3_0>=53 && LA3_0<=59)||(LA3_0>=62 && LA3_0<=70)||(LA3_0>=72 && LA3_0<=76)||(LA3_0>=81 && LA3_0<=88)) ) {
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


    // $ANTLR start "entryRuleInterBodyElement"
    // InternalSysMLOC.g:369:1: entryRuleInterBodyElement returns [EObject current=null] : iv_ruleInterBodyElement= ruleInterBodyElement EOF ;
    public final EObject entryRuleInterBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterBodyElement = null;


        try {
            // InternalSysMLOC.g:369:57: (iv_ruleInterBodyElement= ruleInterBodyElement EOF )
            // InternalSysMLOC.g:370:2: iv_ruleInterBodyElement= ruleInterBodyElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterBodyElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterBodyElement=ruleInterBodyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterBodyElement; 
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
    // $ANTLR end "entryRuleInterBodyElement"


    // $ANTLR start "ruleInterBodyElement"
    // InternalSysMLOC.g:376:1: ruleInterBodyElement returns [EObject current=null] : this_UsageBodyElement_0= ruleUsageBodyElement ;
    public final EObject ruleInterBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_UsageBodyElement_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:382:2: (this_UsageBodyElement_0= ruleUsageBodyElement )
            // InternalSysMLOC.g:383:2: this_UsageBodyElement_0= ruleUsageBodyElement
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInterBodyElementAccess().getUsageBodyElementParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_UsageBodyElement_0=ruleUsageBodyElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_UsageBodyElement_0;
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
    // $ANTLR end "ruleInterBodyElement"


    // $ANTLR start "entryRuleEnumerationBodyElement"
    // InternalSysMLOC.g:394:1: entryRuleEnumerationBodyElement returns [EObject current=null] : iv_ruleEnumerationBodyElement= ruleEnumerationBodyElement EOF ;
    public final EObject entryRuleEnumerationBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationBodyElement = null;


        try {
            // InternalSysMLOC.g:394:63: (iv_ruleEnumerationBodyElement= ruleEnumerationBodyElement EOF )
            // InternalSysMLOC.g:395:2: iv_ruleEnumerationBodyElement= ruleEnumerationBodyElement EOF
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
    // InternalSysMLOC.g:401:1: ruleEnumerationBodyElement returns [EObject current=null] : (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement ) ;
    public final EObject ruleEnumerationBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotatingElement_0 = null;

        EObject this_EnumerationElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:407:2: ( (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement ) )
            // InternalSysMLOC.g:408:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement )
            {
            // InternalSysMLOC.g:408:2: (this_AnnotatingElement_0= ruleAnnotatingElement | this_EnumerationElement_1= ruleEnumerationElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_REGULAR_COMMENT||LA6_0==22||(LA6_0>=25 && LA6_0<=28)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_UNRESTRICTED_NAME)||LA6_0==15||LA6_0==21||LA6_0==31||LA6_0==47||(LA6_0>=50 && LA6_0<=51)||(LA6_0>=62 && LA6_0<=70)||(LA6_0>=72 && LA6_0<=76)) ) {
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
                    // InternalSysMLOC.g:409:3: this_AnnotatingElement_0= ruleAnnotatingElement
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
                    // InternalSysMLOC.g:418:3: this_EnumerationElement_1= ruleEnumerationElement
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
    // InternalSysMLOC.g:430:1: entryRuleAnnotatingElement returns [EObject current=null] : iv_ruleAnnotatingElement= ruleAnnotatingElement EOF ;
    public final EObject entryRuleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatingElement = null;


        try {
            // InternalSysMLOC.g:430:58: (iv_ruleAnnotatingElement= ruleAnnotatingElement EOF )
            // InternalSysMLOC.g:431:2: iv_ruleAnnotatingElement= ruleAnnotatingElement EOF
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
    // InternalSysMLOC.g:437:1: ruleAnnotatingElement returns [EObject current=null] : (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation ) ;
    public final EObject ruleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;

        EObject this_Documentation_1 = null;

        EObject this_TextualRepresentation_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:443:2: ( (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation ) )
            // InternalSysMLOC.g:444:2: (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation )
            {
            // InternalSysMLOC.g:444:2: (this_Comment_0= ruleComment | this_Documentation_1= ruleDocumentation | this_TextualRepresentation_2= ruleTextualRepresentation )
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
                    // InternalSysMLOC.g:445:3: this_Comment_0= ruleComment
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
                    // InternalSysMLOC.g:454:3: this_Documentation_1= ruleDocumentation
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
                    // InternalSysMLOC.g:463:3: this_TextualRepresentation_2= ruleTextualRepresentation
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
    // InternalSysMLOC.g:475:1: entryRuleImportElement returns [EObject current=null] : iv_ruleImportElement= ruleImportElement EOF ;
    public final EObject entryRuleImportElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportElement = null;


        try {
            // InternalSysMLOC.g:475:54: (iv_ruleImportElement= ruleImportElement EOF )
            // InternalSysMLOC.g:476:2: iv_ruleImportElement= ruleImportElement EOF
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
    // InternalSysMLOC.g:482:1: ruleImportElement returns [EObject current=null] : (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport ) ;
    public final EObject ruleImportElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceImport_0 = null;

        EObject this_MembershipImport_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:488:2: ( (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport ) )
            // InternalSysMLOC.g:489:2: (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport )
            {
            // InternalSysMLOC.g:489:2: (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:490:3: this_NamespaceImport_0= ruleNamespaceImport
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
                    // InternalSysMLOC.g:499:3: this_MembershipImport_1= ruleMembershipImport
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
    // InternalSysMLOC.g:511:1: entryRuleDefinitionElement returns [EObject current=null] : iv_ruleDefinitionElement= ruleDefinitionElement EOF ;
    public final EObject entryRuleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionElement = null;


        try {
            // InternalSysMLOC.g:511:58: (iv_ruleDefinitionElement= ruleDefinitionElement EOF )
            // InternalSysMLOC.g:512:2: iv_ruleDefinitionElement= ruleDefinitionElement EOF
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
    // InternalSysMLOC.g:518:1: ruleDefinitionElement returns [EObject current=null] : (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition ) ;
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
            // InternalSysMLOC.g:524:2: ( (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition ) )
            // InternalSysMLOC.g:525:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition )
            {
            // InternalSysMLOC.g:525:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:526:3: this_AttributeDefinition_0= ruleAttributeDefinition
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
                    // InternalSysMLOC.g:535:3: this_EnumerationDefinition_1= ruleEnumerationDefinition
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
                    // InternalSysMLOC.g:544:3: this_ItemDefinition_2= ruleItemDefinition
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
                    // InternalSysMLOC.g:553:3: this_PartDefinition_3= rulePartDefinition
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
                    // InternalSysMLOC.g:562:3: this_ConnectionDefinition_4= ruleConnectionDefinition
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
                    // InternalSysMLOC.g:571:3: this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition
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
                    // InternalSysMLOC.g:580:3: this_InterfaceDefinition_6= ruleInterfaceDefinition
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
                    // InternalSysMLOC.g:589:3: this_PortDefinition_7= rulePortDefinition
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
    // InternalSysMLOC.g:601:1: entryRuleUsageElement returns [EObject current=null] : iv_ruleUsageElement= ruleUsageElement EOF ;
    public final EObject entryRuleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageElement = null;


        try {
            // InternalSysMLOC.g:601:53: (iv_ruleUsageElement= ruleUsageElement EOF )
            // InternalSysMLOC.g:602:2: iv_ruleUsageElement= ruleUsageElement EOF
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
    // InternalSysMLOC.g:608:1: ruleUsageElement returns [EObject current=null] : (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) ;
    public final EObject ruleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_NonOccurrenceUsageElement_0 = null;

        EObject this_OccurrenceUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:614:2: ( (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement ) )
            // InternalSysMLOC.g:615:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            {
            // InternalSysMLOC.g:615:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSysMLOC.g:616:3: this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement
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
                    // InternalSysMLOC.g:625:3: this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement
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
    // InternalSysMLOC.g:637:1: entryRuleNonOccurrenceUsageElement returns [EObject current=null] : iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF ;
    public final EObject entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:637:66: (iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:638:2: iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF
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
    // InternalSysMLOC.g:644:1: ruleNonOccurrenceUsageElement returns [EObject current=null] : (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage ) ;
    public final EObject ruleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeUsage_0 = null;

        EObject this_EnumerationUsage_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:650:2: ( (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage ) )
            // InternalSysMLOC.g:651:2: (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage )
            {
            // InternalSysMLOC.g:651:2: (this_AttributeUsage_0= ruleAttributeUsage | this_EnumerationUsage_1= ruleEnumerationUsage )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29||(LA11_0>=81 && LA11_0<=83)) ) {
                alt11=1;
            }
            else if ( (LA11_0==31||(LA11_0>=54 && LA11_0<=59)||(LA11_0>=84 && LA11_0<=86)) ) {
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
                    // InternalSysMLOC.g:652:3: this_AttributeUsage_0= ruleAttributeUsage
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
                    // InternalSysMLOC.g:661:3: this_EnumerationUsage_1= ruleEnumerationUsage
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
    // InternalSysMLOC.g:673:1: entryRuleOccurrenceUsageElement returns [EObject current=null] : iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF ;
    public final EObject entryRuleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:673:63: (iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:674:2: iv_ruleOccurrenceUsageElement= ruleOccurrenceUsageElement EOF
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
    // InternalSysMLOC.g:680:1: ruleOccurrenceUsageElement returns [EObject current=null] : (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) ;
    public final EObject ruleOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_StructureUsageElement_0 = null;

        EObject this_BehaviorUsageElement_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:686:2: ( (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement ) )
            // InternalSysMLOC.g:687:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            {
            // InternalSysMLOC.g:687:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSysMLOC.g:688:3: this_StructureUsageElement_0= ruleStructureUsageElement
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
                    // InternalSysMLOC.g:697:3: this_BehaviorUsageElement_1= ruleBehaviorUsageElement
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
    // InternalSysMLOC.g:709:1: entryRuleStructureUsageElement returns [EObject current=null] : iv_ruleStructureUsageElement= ruleStructureUsageElement EOF ;
    public final EObject entryRuleStructureUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureUsageElement = null;


        try {
            // InternalSysMLOC.g:709:62: (iv_ruleStructureUsageElement= ruleStructureUsageElement EOF )
            // InternalSysMLOC.g:710:2: iv_ruleStructureUsageElement= ruleStructureUsageElement EOF
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
    // InternalSysMLOC.g:716:1: ruleStructureUsageElement returns [EObject current=null] : (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage ) ;
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
            // InternalSysMLOC.g:722:2: ( (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage ) )
            // InternalSysMLOC.g:723:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )
            {
            // InternalSysMLOC.g:723:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )
            int alt13=6;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSysMLOC.g:724:3: this_ItemUsage_0= ruleItemUsage
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
                    // InternalSysMLOC.g:733:3: this_PartUsage_1= rulePartUsage
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
                    // InternalSysMLOC.g:742:3: this_PortUsage_2= rulePortUsage
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
                    // InternalSysMLOC.g:751:3: this_ConnectionUsage_3= ruleConnectionUsage
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
                    // InternalSysMLOC.g:760:3: this_InterfaceUsage_4= ruleInterfaceUsage
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
                    // InternalSysMLOC.g:769:3: this_FlowConnectionUsage_5= ruleFlowConnectionUsage
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
    // InternalSysMLOC.g:781:1: entryRuleBehaviorUsageElement returns [EObject current=null] : iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF ;
    public final EObject entryRuleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorUsageElement = null;


        try {
            // InternalSysMLOC.g:781:61: (iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF )
            // InternalSysMLOC.g:782:2: iv_ruleBehaviorUsageElement= ruleBehaviorUsageElement EOF
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
    // InternalSysMLOC.g:788:1: ruleBehaviorUsageElement returns [EObject current=null] : this_ActionUsage_0= ruleActionUsage ;
    public final EObject ruleBehaviorUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_ActionUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:794:2: (this_ActionUsage_0= ruleActionUsage )
            // InternalSysMLOC.g:795:2: this_ActionUsage_0= ruleActionUsage
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
    // InternalSysMLOC.g:806:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalSysMLOC.g:806:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalSysMLOC.g:807:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalSysMLOC.g:813:1: ruleEnumerationElement returns [EObject current=null] : this_EnumeratedValue_0= ruleEnumeratedValue ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumeratedValue_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:819:2: (this_EnumeratedValue_0= ruleEnumeratedValue )
            // InternalSysMLOC.g:820:2: this_EnumeratedValue_0= ruleEnumeratedValue
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
    // InternalSysMLOC.g:831:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // InternalSysMLOC.g:831:56: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // InternalSysMLOC.g:832:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
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
    // InternalSysMLOC.g:838:1: ruleNamespaceImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' ) ;
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
            // InternalSysMLOC.g:844:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' ) )
            // InternalSysMLOC.g:845:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' )
            {
            // InternalSysMLOC.g:845:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';' )
            // InternalSysMLOC.g:846:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) otherlv_4= '::' (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )? otherlv_7= ';'
            {
            // InternalSysMLOC.g:846:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:847:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:847:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalSysMLOC.g:848:5: lv_visibility_0_0= ruleVisibilityIndicator
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

            // InternalSysMLOC.g:865:3: (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSysMLOC.g:866:4: this_isImportAllFragment_1= ruleisImportAllFragment[$current]
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
            // InternalSysMLOC.g:882:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:883:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:883:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalSysMLOC.g:884:5: lv_declaredName_3_0= ruleQualifiedName
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
            // InternalSysMLOC.g:905:3: (otherlv_5= '*' | ( (lv_isRecursive_6_0= '**' ) ) )?
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
                    // InternalSysMLOC.g:906:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNamespaceImportAccess().getAsteriskKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:911:4: ( (lv_isRecursive_6_0= '**' ) )
                    {
                    // InternalSysMLOC.g:911:4: ( (lv_isRecursive_6_0= '**' ) )
                    // InternalSysMLOC.g:912:5: (lv_isRecursive_6_0= '**' )
                    {
                    // InternalSysMLOC.g:912:5: (lv_isRecursive_6_0= '**' )
                    // InternalSysMLOC.g:913:6: lv_isRecursive_6_0= '**'
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
    // InternalSysMLOC.g:934:1: entryRuleMembershipImport returns [EObject current=null] : iv_ruleMembershipImport= ruleMembershipImport EOF ;
    public final EObject entryRuleMembershipImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipImport = null;


        try {
            // InternalSysMLOC.g:934:57: (iv_ruleMembershipImport= ruleMembershipImport EOF )
            // InternalSysMLOC.g:935:2: iv_ruleMembershipImport= ruleMembershipImport EOF
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
    // InternalSysMLOC.g:941:1: ruleMembershipImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' ) ;
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
            // InternalSysMLOC.g:947:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' ) )
            // InternalSysMLOC.g:948:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' )
            {
            // InternalSysMLOC.g:948:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';' )
            // InternalSysMLOC.g:949:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )? otherlv_2= 'import' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )? otherlv_6= ';'
            {
            // InternalSysMLOC.g:949:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:950:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:950:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalSysMLOC.g:951:5: lv_visibility_0_0= ruleVisibilityIndicator
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

            // InternalSysMLOC.g:968:3: (this_isImportAllFragment_1= ruleisImportAllFragment[$current] )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSysMLOC.g:969:4: this_isImportAllFragment_1= ruleisImportAllFragment[$current]
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
            // InternalSysMLOC.g:985:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:986:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:986:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalSysMLOC.g:987:5: lv_declaredName_3_0= ruleQualifiedName
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

            // InternalSysMLOC.g:1004:3: (otherlv_4= '*' | ( (lv_isRecursive_5_0= '**' ) ) )?
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
                    // InternalSysMLOC.g:1005:4: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMembershipImportAccess().getAsteriskKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1010:4: ( (lv_isRecursive_5_0= '**' ) )
                    {
                    // InternalSysMLOC.g:1010:4: ( (lv_isRecursive_5_0= '**' ) )
                    // InternalSysMLOC.g:1011:5: (lv_isRecursive_5_0= '**' )
                    {
                    // InternalSysMLOC.g:1011:5: (lv_isRecursive_5_0= '**' )
                    // InternalSysMLOC.g:1012:6: lv_isRecursive_5_0= '**'
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
    // InternalSysMLOC.g:1033:1: entryRuleCodeAnnotation returns [EObject current=null] : iv_ruleCodeAnnotation= ruleCodeAnnotation EOF ;
    public final EObject entryRuleCodeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeAnnotation = null;


        try {
            // InternalSysMLOC.g:1033:55: (iv_ruleCodeAnnotation= ruleCodeAnnotation EOF )
            // InternalSysMLOC.g:1034:2: iv_ruleCodeAnnotation= ruleCodeAnnotation EOF
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
    // InternalSysMLOC.g:1040:1: ruleCodeAnnotation returns [EObject current=null] : ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) ) ;
    public final EObject ruleCodeAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:1046:2: ( ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) ) )
            // InternalSysMLOC.g:1047:2: ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) )
            {
            // InternalSysMLOC.g:1047:2: ( ( (lv_body_0_0= RULE_SL_NOTE ) ) | ( (lv_body_1_0= RULE_ML_NOTE ) ) )
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
                    // InternalSysMLOC.g:1048:3: ( (lv_body_0_0= RULE_SL_NOTE ) )
                    {
                    // InternalSysMLOC.g:1048:3: ( (lv_body_0_0= RULE_SL_NOTE ) )
                    // InternalSysMLOC.g:1049:4: (lv_body_0_0= RULE_SL_NOTE )
                    {
                    // InternalSysMLOC.g:1049:4: (lv_body_0_0= RULE_SL_NOTE )
                    // InternalSysMLOC.g:1050:5: lv_body_0_0= RULE_SL_NOTE
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
                    // InternalSysMLOC.g:1067:3: ( (lv_body_1_0= RULE_ML_NOTE ) )
                    {
                    // InternalSysMLOC.g:1067:3: ( (lv_body_1_0= RULE_ML_NOTE ) )
                    // InternalSysMLOC.g:1068:4: (lv_body_1_0= RULE_ML_NOTE )
                    {
                    // InternalSysMLOC.g:1068:4: (lv_body_1_0= RULE_ML_NOTE )
                    // InternalSysMLOC.g:1069:5: lv_body_1_0= RULE_ML_NOTE
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
    // InternalSysMLOC.g:1089:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSysMLOC.g:1089:48: (iv_ruleComment= ruleComment EOF )
            // InternalSysMLOC.g:1090:2: iv_ruleComment= ruleComment EOF
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
    // InternalSysMLOC.g:1096:1: ruleComment returns [EObject current=null] : ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) ) ;
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
            // InternalSysMLOC.g:1102:2: ( ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:1103:2: ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:1103:2: ( (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:1104:3: (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )? (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )? ( (lv_body_8_0= RULE_REGULAR_COMMENT ) )
            {
            // InternalSysMLOC.g:1104:3: (otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSysMLOC.g:1105:4: otherlv_0= 'comment' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )?
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:1109:4: (this_Identification_1= ruleIdentification[$current] )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)||LA19_0==44) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSysMLOC.g:1110:5: this_Identification_1= ruleIdentification[$current]
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

                    // InternalSysMLOC.g:1122:4: (otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==23) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSysMLOC.g:1123:5: otherlv_2= 'about' ( (lv_annotatedElement_3_0= ruleQualifiedName ) ) (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )*
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getAboutKeyword_0_2_0());
                              				
                            }
                            // InternalSysMLOC.g:1127:5: ( (lv_annotatedElement_3_0= ruleQualifiedName ) )
                            // InternalSysMLOC.g:1128:6: (lv_annotatedElement_3_0= ruleQualifiedName )
                            {
                            // InternalSysMLOC.g:1128:6: (lv_annotatedElement_3_0= ruleQualifiedName )
                            // InternalSysMLOC.g:1129:7: lv_annotatedElement_3_0= ruleQualifiedName
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

                            // InternalSysMLOC.g:1146:5: (otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==24) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalSysMLOC.g:1147:6: otherlv_4= ',' ( (lv_annotatedElement_5_0= ruleQualifiedName ) )
                            	    {
                            	    otherlv_4=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getCommaKeyword_0_2_2_0());
                            	      					
                            	    }
                            	    // InternalSysMLOC.g:1151:6: ( (lv_annotatedElement_5_0= ruleQualifiedName ) )
                            	    // InternalSysMLOC.g:1152:7: (lv_annotatedElement_5_0= ruleQualifiedName )
                            	    {
                            	    // InternalSysMLOC.g:1152:7: (lv_annotatedElement_5_0= ruleQualifiedName )
                            	    // InternalSysMLOC.g:1153:8: lv_annotatedElement_5_0= ruleQualifiedName
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

            // InternalSysMLOC.g:1173:3: (otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSysMLOC.g:1174:4: otherlv_6= 'locale' ( (lv_locale_7_0= RULE_STRING_VALUE ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCommentAccess().getLocaleKeyword_1_0());
                      			
                    }
                    // InternalSysMLOC.g:1178:4: ( (lv_locale_7_0= RULE_STRING_VALUE ) )
                    // InternalSysMLOC.g:1179:5: (lv_locale_7_0= RULE_STRING_VALUE )
                    {
                    // InternalSysMLOC.g:1179:5: (lv_locale_7_0= RULE_STRING_VALUE )
                    // InternalSysMLOC.g:1180:6: lv_locale_7_0= RULE_STRING_VALUE
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

            // InternalSysMLOC.g:1197:3: ( (lv_body_8_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1198:4: (lv_body_8_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1198:4: (lv_body_8_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1199:5: lv_body_8_0= RULE_REGULAR_COMMENT
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
    // InternalSysMLOC.g:1219:1: entryRuleDocumentation returns [EObject current=null] : iv_ruleDocumentation= ruleDocumentation EOF ;
    public final EObject entryRuleDocumentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentation = null;


        try {
            // InternalSysMLOC.g:1219:54: (iv_ruleDocumentation= ruleDocumentation EOF )
            // InternalSysMLOC.g:1220:2: iv_ruleDocumentation= ruleDocumentation EOF
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
    // InternalSysMLOC.g:1226:1: ruleDocumentation returns [EObject current=null] : (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleDocumentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_locale_3_0=null;
        Token lv_body_4_0=null;
        EObject this_Identification_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1232:2: ( (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:1233:2: (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:1233:2: (otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:1234:3: otherlv_0= 'doc' (this_Identification_1= ruleIdentification[$current] )? (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )? ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDocumentationAccess().getDocKeyword_0());
              		
            }
            // InternalSysMLOC.g:1238:3: (this_Identification_1= ruleIdentification[$current] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_UNRESTRICTED_NAME)||LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSysMLOC.g:1239:4: this_Identification_1= ruleIdentification[$current]
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

            // InternalSysMLOC.g:1251:3: (otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSysMLOC.g:1252:4: otherlv_2= 'locale' ( (lv_locale_3_0= RULE_STRING_VALUE ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDocumentationAccess().getLocaleKeyword_2_0());
                      			
                    }
                    // InternalSysMLOC.g:1256:4: ( (lv_locale_3_0= RULE_STRING_VALUE ) )
                    // InternalSysMLOC.g:1257:5: (lv_locale_3_0= RULE_STRING_VALUE )
                    {
                    // InternalSysMLOC.g:1257:5: (lv_locale_3_0= RULE_STRING_VALUE )
                    // InternalSysMLOC.g:1258:6: lv_locale_3_0= RULE_STRING_VALUE
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

            // InternalSysMLOC.g:1275:3: ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1276:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1276:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1277:5: lv_body_4_0= RULE_REGULAR_COMMENT
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
    // InternalSysMLOC.g:1297:1: entryRuleTextualRepresentation returns [EObject current=null] : iv_ruleTextualRepresentation= ruleTextualRepresentation EOF ;
    public final EObject entryRuleTextualRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualRepresentation = null;


        try {
            // InternalSysMLOC.g:1297:62: (iv_ruleTextualRepresentation= ruleTextualRepresentation EOF )
            // InternalSysMLOC.g:1298:2: iv_ruleTextualRepresentation= ruleTextualRepresentation EOF
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
    // InternalSysMLOC.g:1304:1: ruleTextualRepresentation returns [EObject current=null] : ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleTextualRepresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_language_3_0=null;
        Token lv_body_4_0=null;
        EObject this_Identification_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:1310:2: ( ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:1311:2: ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:1311:2: ( (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:1312:3: (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )? otherlv_2= 'language' ( (lv_language_3_0= RULE_STRING_VALUE ) ) ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            {
            // InternalSysMLOC.g:1312:3: (otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSysMLOC.g:1313:4: otherlv_0= 'rep' (this_Identification_1= ruleIdentification[$current] )?
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTextualRepresentationAccess().getRepKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:1317:4: (this_Identification_1= ruleIdentification[$current] )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_UNRESTRICTED_NAME)||LA26_0==44) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSysMLOC.g:1318:5: this_Identification_1= ruleIdentification[$current]
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
            // InternalSysMLOC.g:1335:3: ( (lv_language_3_0= RULE_STRING_VALUE ) )
            // InternalSysMLOC.g:1336:4: (lv_language_3_0= RULE_STRING_VALUE )
            {
            // InternalSysMLOC.g:1336:4: (lv_language_3_0= RULE_STRING_VALUE )
            // InternalSysMLOC.g:1337:5: lv_language_3_0= RULE_STRING_VALUE
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

            // InternalSysMLOC.g:1353:3: ( (lv_body_4_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1354:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1354:4: (lv_body_4_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1355:5: lv_body_4_0= RULE_REGULAR_COMMENT
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
    // InternalSysMLOC.g:1375:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSysMLOC.g:1375:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:1376:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalSysMLOC.g:1382:1: ruleAttributeDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1388:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:1389:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:1389:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:1390:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'attribute' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
            // InternalSysMLOC.g:1431:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
                    // InternalSysMLOC.g:1432:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1437:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:1437:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:1438:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1442:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_SL_NOTE && LA28_0<=RULE_ML_NOTE)||LA28_0==RULE_REGULAR_COMMENT||(LA28_0>=RULE_ID && LA28_0<=RULE_UNRESTRICTED_NAME)||LA28_0==15||(LA28_0>=21 && LA28_0<=22)||(LA28_0>=25 && LA28_0<=29)||(LA28_0>=31 && LA28_0<=38)||(LA28_0>=42 && LA28_0<=43)||LA28_0==47||(LA28_0>=50 && LA28_0<=51)||(LA28_0>=53 && LA28_0<=59)||(LA28_0>=62 && LA28_0<=70)||(LA28_0>=72 && LA28_0<=76)||(LA28_0>=81 && LA28_0<=88)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1443:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1443:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:1444:7: lv_elements_7_0= ruleDefinitionBodyElement
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
    // InternalSysMLOC.g:1471:1: entryRuleAttributeUsage returns [EObject current=null] : iv_ruleAttributeUsage= ruleAttributeUsage EOF ;
    public final EObject entryRuleAttributeUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeUsage = null;


        try {
            // InternalSysMLOC.g:1471:55: (iv_ruleAttributeUsage= ruleAttributeUsage EOF )
            // InternalSysMLOC.g:1472:2: iv_ruleAttributeUsage= ruleAttributeUsage EOF
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
    // InternalSysMLOC.g:1478:1: ruleAttributeUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1484:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1485:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1485:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1486:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'attribute' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
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
            // InternalSysMLOC.g:1512:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
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
                    // InternalSysMLOC.g:1513:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1518:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1518:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1519:5: otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1523:5: ( (lv_elements_5_0= ruleUsageBodyElement ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_SL_NOTE && LA30_0<=RULE_ML_NOTE)||LA30_0==RULE_REGULAR_COMMENT||(LA30_0>=RULE_ID && LA30_0<=RULE_UNRESTRICTED_NAME)||LA30_0==15||(LA30_0>=21 && LA30_0<=22)||(LA30_0>=25 && LA30_0<=29)||(LA30_0>=31 && LA30_0<=38)||(LA30_0>=42 && LA30_0<=43)||LA30_0==47||(LA30_0>=50 && LA30_0<=51)||(LA30_0>=53 && LA30_0<=59)||(LA30_0>=62 && LA30_0<=70)||(LA30_0>=72 && LA30_0<=76)||(LA30_0>=81 && LA30_0<=88)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1524:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1524:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1525:7: lv_elements_5_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:1552:1: entryRuleEnumerationDefinition returns [EObject current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final EObject entryRuleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDefinition = null;


        try {
            // InternalSysMLOC.g:1552:62: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // InternalSysMLOC.g:1553:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
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
    // InternalSysMLOC.g:1559:1: ruleEnumerationDefinition returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1565:2: ( (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1566:2: (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1566:2: (otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1567:3: otherlv_0= 'enum' otherlv_1= 'def' this_DefinitionDeclaration_2= ruleDefinitionDeclaration[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) )
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
            // InternalSysMLOC.g:1586:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' ) )
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
                    // InternalSysMLOC.g:1587:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEnumerationDefinitionAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1592:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1592:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1593:5: otherlv_4= '{' ( (lv_elements_5_0= ruleEnumerationBodyElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1597:5: ( (lv_elements_5_0= ruleEnumerationBodyElement ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_REGULAR_COMMENT||(LA32_0>=RULE_ID && LA32_0<=RULE_UNRESTRICTED_NAME)||LA32_0==15||(LA32_0>=21 && LA32_0<=22)||(LA32_0>=25 && LA32_0<=28)||LA32_0==31||LA32_0==47||(LA32_0>=50 && LA32_0<=51)||(LA32_0>=62 && LA32_0<=70)||(LA32_0>=72 && LA32_0<=76)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1598:6: (lv_elements_5_0= ruleEnumerationBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1598:6: (lv_elements_5_0= ruleEnumerationBodyElement )
                    	    // InternalSysMLOC.g:1599:7: lv_elements_5_0= ruleEnumerationBodyElement
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
    // InternalSysMLOC.g:1626:1: entryRuleEnumeratedValue returns [EObject current=null] : iv_ruleEnumeratedValue= ruleEnumeratedValue EOF ;
    public final EObject entryRuleEnumeratedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeratedValue = null;


        try {
            // InternalSysMLOC.g:1626:56: (iv_ruleEnumeratedValue= ruleEnumeratedValue EOF )
            // InternalSysMLOC.g:1627:2: iv_ruleEnumeratedValue= ruleEnumeratedValue EOF
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
    // InternalSysMLOC.g:1633:1: ruleEnumeratedValue returns [EObject current=null] : ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1639:2: ( ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:1640:2: ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:1640:2: ( (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:1641:3: (otherlv_0= 'enum' )? this_Usage_1= ruleUsage[$current] (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) )
            {
            // InternalSysMLOC.g:1641:3: (otherlv_0= 'enum' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSysMLOC.g:1642:4: otherlv_0= 'enum'
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
            // InternalSysMLOC.g:1658:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' ) )
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
                    // InternalSysMLOC.g:1659:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEnumeratedValueAccess().getSemicolonKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1664:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:1664:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:1665:5: otherlv_3= '{' ( (lv_elements_4_0= ruleUsageBodyElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getEnumeratedValueAccess().getLeftCurlyBracketKeyword_2_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1669:5: ( (lv_elements_4_0= ruleUsageBodyElement ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=RULE_SL_NOTE && LA35_0<=RULE_ML_NOTE)||LA35_0==RULE_REGULAR_COMMENT||(LA35_0>=RULE_ID && LA35_0<=RULE_UNRESTRICTED_NAME)||LA35_0==15||(LA35_0>=21 && LA35_0<=22)||(LA35_0>=25 && LA35_0<=29)||(LA35_0>=31 && LA35_0<=38)||(LA35_0>=42 && LA35_0<=43)||LA35_0==47||(LA35_0>=50 && LA35_0<=51)||(LA35_0>=53 && LA35_0<=59)||(LA35_0>=62 && LA35_0<=70)||(LA35_0>=72 && LA35_0<=76)||(LA35_0>=81 && LA35_0<=88)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1670:6: (lv_elements_4_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1670:6: (lv_elements_4_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1671:7: lv_elements_4_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:1698:1: entryRuleEnumerationUsage returns [EObject current=null] : iv_ruleEnumerationUsage= ruleEnumerationUsage EOF ;
    public final EObject entryRuleEnumerationUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationUsage = null;


        try {
            // InternalSysMLOC.g:1698:57: (iv_ruleEnumerationUsage= ruleEnumerationUsage EOF )
            // InternalSysMLOC.g:1699:2: iv_ruleEnumerationUsage= ruleEnumerationUsage EOF
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
    // InternalSysMLOC.g:1705:1: ruleEnumerationUsage returns [EObject current=null] : (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1711:2: ( (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:1712:2: (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:1712:2: (this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:1713:3: this_UsagePrefix_0= ruleUsagePrefix[$current] otherlv_1= 'enum' this_Usage_2= ruleUsage[$current] (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
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
            // InternalSysMLOC.g:1739:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' ) )
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
                    // InternalSysMLOC.g:1740:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEnumerationUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1745:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:1745:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:1746:5: otherlv_4= '{' ( (lv_elements_5_0= ruleUsageBodyElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getEnumerationUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1750:5: ( (lv_elements_5_0= ruleUsageBodyElement ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=RULE_SL_NOTE && LA37_0<=RULE_ML_NOTE)||LA37_0==RULE_REGULAR_COMMENT||(LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)||LA37_0==15||(LA37_0>=21 && LA37_0<=22)||(LA37_0>=25 && LA37_0<=29)||(LA37_0>=31 && LA37_0<=38)||(LA37_0>=42 && LA37_0<=43)||LA37_0==47||(LA37_0>=50 && LA37_0<=51)||(LA37_0>=53 && LA37_0<=59)||(LA37_0>=62 && LA37_0<=70)||(LA37_0>=72 && LA37_0<=76)||(LA37_0>=81 && LA37_0<=88)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1751:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1751:6: (lv_elements_5_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1752:7: lv_elements_5_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:1779:1: entryRuleItemDefinition returns [EObject current=null] : iv_ruleItemDefinition= ruleItemDefinition EOF ;
    public final EObject entryRuleItemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDefinition = null;


        try {
            // InternalSysMLOC.g:1779:55: (iv_ruleItemDefinition= ruleItemDefinition EOF )
            // InternalSysMLOC.g:1780:2: iv_ruleItemDefinition= ruleItemDefinition EOF
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
    // InternalSysMLOC.g:1786:1: ruleItemDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1792:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:1793:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:1793:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:1794:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'item' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
            // InternalSysMLOC.g:1835:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
                    // InternalSysMLOC.g:1836:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getItemDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1841:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:1841:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:1842:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getItemDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1846:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=RULE_SL_NOTE && LA39_0<=RULE_ML_NOTE)||LA39_0==RULE_REGULAR_COMMENT||(LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)||LA39_0==15||(LA39_0>=21 && LA39_0<=22)||(LA39_0>=25 && LA39_0<=29)||(LA39_0>=31 && LA39_0<=38)||(LA39_0>=42 && LA39_0<=43)||LA39_0==47||(LA39_0>=50 && LA39_0<=51)||(LA39_0>=53 && LA39_0<=59)||(LA39_0>=62 && LA39_0<=70)||(LA39_0>=72 && LA39_0<=76)||(LA39_0>=81 && LA39_0<=88)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1847:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1847:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:1848:7: lv_elements_7_0= ruleDefinitionBodyElement
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
    // InternalSysMLOC.g:1875:1: entryRuleItemUsage returns [EObject current=null] : iv_ruleItemUsage= ruleItemUsage EOF ;
    public final EObject entryRuleItemUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemUsage = null;


        try {
            // InternalSysMLOC.g:1875:50: (iv_ruleItemUsage= ruleItemUsage EOF )
            // InternalSysMLOC.g:1876:2: iv_ruleItemUsage= ruleItemUsage EOF
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
    // InternalSysMLOC.g:1882:1: ruleItemUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1888:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:1889:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:1889:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:1890:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'item' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
            // InternalSysMLOC.g:1927:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
                    // InternalSysMLOC.g:1928:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getItemUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1933:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:1933:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:1934:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getItemUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:1938:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_SL_NOTE && LA41_0<=RULE_ML_NOTE)||LA41_0==RULE_REGULAR_COMMENT||(LA41_0>=RULE_ID && LA41_0<=RULE_UNRESTRICTED_NAME)||LA41_0==15||(LA41_0>=21 && LA41_0<=22)||(LA41_0>=25 && LA41_0<=29)||(LA41_0>=31 && LA41_0<=38)||(LA41_0>=42 && LA41_0<=43)||LA41_0==47||(LA41_0>=50 && LA41_0<=51)||(LA41_0>=53 && LA41_0<=59)||(LA41_0>=62 && LA41_0<=70)||(LA41_0>=72 && LA41_0<=76)||(LA41_0>=81 && LA41_0<=88)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalSysMLOC.g:1939:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:1939:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:1940:7: lv_elements_6_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:1967:1: entryRulePartDefinition returns [EObject current=null] : iv_rulePartDefinition= rulePartDefinition EOF ;
    public final EObject entryRulePartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDefinition = null;


        try {
            // InternalSysMLOC.g:1967:55: (iv_rulePartDefinition= rulePartDefinition EOF )
            // InternalSysMLOC.g:1968:2: iv_rulePartDefinition= rulePartDefinition EOF
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
    // InternalSysMLOC.g:1974:1: rulePartDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalSysMLOC.g:1980:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:1981:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:1981:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:1982:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'part' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
            // InternalSysMLOC.g:2023:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
                    // InternalSysMLOC.g:2024:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2029:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2029:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2030:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2034:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_SL_NOTE && LA43_0<=RULE_ML_NOTE)||LA43_0==RULE_REGULAR_COMMENT||(LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)||LA43_0==15||(LA43_0>=21 && LA43_0<=22)||(LA43_0>=25 && LA43_0<=29)||(LA43_0>=31 && LA43_0<=38)||(LA43_0>=42 && LA43_0<=43)||LA43_0==47||(LA43_0>=50 && LA43_0<=51)||(LA43_0>=53 && LA43_0<=59)||(LA43_0>=62 && LA43_0<=70)||(LA43_0>=72 && LA43_0<=76)||(LA43_0>=81 && LA43_0<=88)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2035:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2035:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2036:7: lv_elements_7_0= ruleDefinitionBodyElement
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
    // InternalSysMLOC.g:2063:1: entryRulePartUsage returns [EObject current=null] : iv_rulePartUsage= rulePartUsage EOF ;
    public final EObject entryRulePartUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartUsage = null;


        try {
            // InternalSysMLOC.g:2063:50: (iv_rulePartUsage= rulePartUsage EOF )
            // InternalSysMLOC.g:2064:2: iv_rulePartUsage= rulePartUsage EOF
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
    // InternalSysMLOC.g:2070:1: rulePartUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2076:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:2077:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:2077:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:2078:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'part' this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
            // InternalSysMLOC.g:2115:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
                    // InternalSysMLOC.g:2116:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPartUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2121:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:2121:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:2122:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPartUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2126:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=RULE_SL_NOTE && LA45_0<=RULE_ML_NOTE)||LA45_0==RULE_REGULAR_COMMENT||(LA45_0>=RULE_ID && LA45_0<=RULE_UNRESTRICTED_NAME)||LA45_0==15||(LA45_0>=21 && LA45_0<=22)||(LA45_0>=25 && LA45_0<=29)||(LA45_0>=31 && LA45_0<=38)||(LA45_0>=42 && LA45_0<=43)||LA45_0==47||(LA45_0>=50 && LA45_0<=51)||(LA45_0>=53 && LA45_0<=59)||(LA45_0>=62 && LA45_0<=70)||(LA45_0>=72 && LA45_0<=76)||(LA45_0>=81 && LA45_0<=88)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2127:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2127:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:2128:7: lv_elements_6_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:2155:1: entryRulePortDefinition returns [EObject current=null] : iv_rulePortDefinition= rulePortDefinition EOF ;
    public final EObject entryRulePortDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortDefinition = null;


        try {
            // InternalSysMLOC.g:2155:55: (iv_rulePortDefinition= rulePortDefinition EOF )
            // InternalSysMLOC.g:2156:2: iv_rulePortDefinition= rulePortDefinition EOF
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
    // InternalSysMLOC.g:2162:1: rulePortDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2168:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2169:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2169:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2170:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_DefinitionPrefix_1= ruleDefinitionPrefix[$current] otherlv_2= 'port' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
            // InternalSysMLOC.g:2211:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
                    // InternalSysMLOC.g:2212:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPortDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2217:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2217:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2218:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getPortDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2222:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0>=RULE_SL_NOTE && LA47_0<=RULE_ML_NOTE)||LA47_0==RULE_REGULAR_COMMENT||(LA47_0>=RULE_ID && LA47_0<=RULE_UNRESTRICTED_NAME)||LA47_0==15||(LA47_0>=21 && LA47_0<=22)||(LA47_0>=25 && LA47_0<=29)||(LA47_0>=31 && LA47_0<=38)||(LA47_0>=42 && LA47_0<=43)||LA47_0==47||(LA47_0>=50 && LA47_0<=51)||(LA47_0>=53 && LA47_0<=59)||(LA47_0>=62 && LA47_0<=70)||(LA47_0>=72 && LA47_0<=76)||(LA47_0>=81 && LA47_0<=88)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2223:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2223:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2224:7: lv_elements_7_0= ruleDefinitionBodyElement
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
    // InternalSysMLOC.g:2251:1: entryRulePortUsage returns [EObject current=null] : iv_rulePortUsage= rulePortUsage EOF ;
    public final EObject entryRulePortUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortUsage = null;


        try {
            // InternalSysMLOC.g:2251:50: (iv_rulePortUsage= rulePortUsage EOF )
            // InternalSysMLOC.g:2252:2: iv_rulePortUsage= rulePortUsage EOF
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
    // InternalSysMLOC.g:2258:1: rulePortUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2264:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:2265:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:2265:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:2266:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] (otherlv_2= 'port' )? this_Usage_3= ruleUsage[$current] (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
            // InternalSysMLOC.g:2288:3: (otherlv_2= 'port' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSysMLOC.g:2289:4: otherlv_2= 'port'
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
            // InternalSysMLOC.g:2305:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
                    // InternalSysMLOC.g:2306:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPortUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2311:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:2311:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:2312:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getPortUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2316:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=RULE_SL_NOTE && LA50_0<=RULE_ML_NOTE)||LA50_0==RULE_REGULAR_COMMENT||(LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)||LA50_0==15||(LA50_0>=21 && LA50_0<=22)||(LA50_0>=25 && LA50_0<=29)||(LA50_0>=31 && LA50_0<=38)||(LA50_0>=42 && LA50_0<=43)||LA50_0==47||(LA50_0>=50 && LA50_0<=51)||(LA50_0>=53 && LA50_0<=59)||(LA50_0>=62 && LA50_0<=70)||(LA50_0>=72 && LA50_0<=76)||(LA50_0>=81 && LA50_0<=88)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2317:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2317:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:2318:7: lv_elements_6_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:2345:1: entryRuleConnectionDefinition returns [EObject current=null] : iv_ruleConnectionDefinition= ruleConnectionDefinition EOF ;
    public final EObject entryRuleConnectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDefinition = null;


        try {
            // InternalSysMLOC.g:2345:61: (iv_ruleConnectionDefinition= ruleConnectionDefinition EOF )
            // InternalSysMLOC.g:2346:2: iv_ruleConnectionDefinition= ruleConnectionDefinition EOF
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
    // InternalSysMLOC.g:2352:1: ruleConnectionDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2358:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2359:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2359:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2360:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'connection' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
            // InternalSysMLOC.g:2401:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
                    // InternalSysMLOC.g:2402:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConnectionDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2407:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2407:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2408:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getConnectionDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2412:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_SL_NOTE && LA52_0<=RULE_ML_NOTE)||LA52_0==RULE_REGULAR_COMMENT||(LA52_0>=RULE_ID && LA52_0<=RULE_UNRESTRICTED_NAME)||LA52_0==15||(LA52_0>=21 && LA52_0<=22)||(LA52_0>=25 && LA52_0<=29)||(LA52_0>=31 && LA52_0<=38)||(LA52_0>=42 && LA52_0<=43)||LA52_0==47||(LA52_0>=50 && LA52_0<=51)||(LA52_0>=53 && LA52_0<=59)||(LA52_0>=62 && LA52_0<=70)||(LA52_0>=72 && LA52_0<=76)||(LA52_0>=81 && LA52_0<=88)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2413:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2413:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2414:7: lv_elements_7_0= ruleDefinitionBodyElement
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
    // InternalSysMLOC.g:2441:1: entryRuleConnectionUsage returns [EObject current=null] : iv_ruleConnectionUsage= ruleConnectionUsage EOF ;
    public final EObject entryRuleConnectionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionUsage = null;


        try {
            // InternalSysMLOC.g:2441:56: (iv_ruleConnectionUsage= ruleConnectionUsage EOF )
            // InternalSysMLOC.g:2442:2: iv_ruleConnectionUsage= ruleConnectionUsage EOF
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
    // InternalSysMLOC.g:2448:1: ruleConnectionUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2454:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) ) )
            // InternalSysMLOC.g:2455:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) )
            {
            // InternalSysMLOC.g:2455:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) ) )
            // InternalSysMLOC.g:2456:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) ) (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) )
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
            // InternalSysMLOC.g:2478:3: ( (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? ) | (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] ) )
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
                    // InternalSysMLOC.g:2479:4: (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? )
                    {
                    // InternalSysMLOC.g:2479:4: (otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )? )
                    // InternalSysMLOC.g:2480:5: otherlv_2= 'connection' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )?
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getConnectionUsageAccess().getConnectionKeyword_2_0_0());
                      				
                    }
                    // InternalSysMLOC.g:2484:5: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_UNRESTRICTED_NAME)||LA54_0==47||(LA54_0>=50 && LA54_0<=51)||(LA54_0>=62 && LA54_0<=64)||(LA54_0>=68 && LA54_0<=70)||(LA54_0>=72 && LA54_0<=76)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalSysMLOC.g:2485:6: this_UsageDeclaration_3= ruleUsageDeclaration[$current]
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

                    // InternalSysMLOC.g:2497:5: (this_FeatureValue_4= ruleFeatureValue[$current] )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=65 && LA55_0<=67)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSysMLOC.g:2498:6: this_FeatureValue_4= ruleFeatureValue[$current]
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

                    // InternalSysMLOC.g:2510:5: (otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current] )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==36) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalSysMLOC.g:2511:6: otherlv_5= 'connect' this_ConnectorPart_6= ruleConnectorPart[$current]
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
                    // InternalSysMLOC.g:2529:4: (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] )
                    {
                    // InternalSysMLOC.g:2529:4: (otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current] )
                    // InternalSysMLOC.g:2530:5: otherlv_7= 'connect' this_ConnectorPart_8= ruleConnectorPart[$current]
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

            // InternalSysMLOC.g:2547:3: (otherlv_9= ';' | (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' ) )
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
                    // InternalSysMLOC.g:2548:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConnectionUsageAccess().getSemicolonKeyword_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2553:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' )
                    {
                    // InternalSysMLOC.g:2553:4: (otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}' )
                    // InternalSysMLOC.g:2554:5: otherlv_10= '{' ( (lv_elements_11_0= ruleUsageBodyElement ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getConnectionUsageAccess().getLeftCurlyBracketKeyword_3_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2558:5: ( (lv_elements_11_0= ruleUsageBodyElement ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=RULE_SL_NOTE && LA58_0<=RULE_ML_NOTE)||LA58_0==RULE_REGULAR_COMMENT||(LA58_0>=RULE_ID && LA58_0<=RULE_UNRESTRICTED_NAME)||LA58_0==15||(LA58_0>=21 && LA58_0<=22)||(LA58_0>=25 && LA58_0<=29)||(LA58_0>=31 && LA58_0<=38)||(LA58_0>=42 && LA58_0<=43)||LA58_0==47||(LA58_0>=50 && LA58_0<=51)||(LA58_0>=53 && LA58_0<=59)||(LA58_0>=62 && LA58_0<=70)||(LA58_0>=72 && LA58_0<=76)||(LA58_0>=81 && LA58_0<=88)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2559:6: (lv_elements_11_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2559:6: (lv_elements_11_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:2560:7: lv_elements_11_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:2587:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // InternalSysMLOC.g:2587:60: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // InternalSysMLOC.g:2588:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
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
    // InternalSysMLOC.g:2594:1: ruleInterfaceDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2600:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2601:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2601:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2602:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'interface' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
            // InternalSysMLOC.g:2643:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
                    // InternalSysMLOC.g:2644:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getInterfaceDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2649:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2649:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2650:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2654:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_SL_NOTE && LA60_0<=RULE_ML_NOTE)||LA60_0==RULE_REGULAR_COMMENT||(LA60_0>=RULE_ID && LA60_0<=RULE_UNRESTRICTED_NAME)||LA60_0==15||(LA60_0>=21 && LA60_0<=22)||(LA60_0>=25 && LA60_0<=29)||(LA60_0>=31 && LA60_0<=38)||(LA60_0>=42 && LA60_0<=43)||LA60_0==47||(LA60_0>=50 && LA60_0<=51)||(LA60_0>=53 && LA60_0<=59)||(LA60_0>=62 && LA60_0<=70)||(LA60_0>=72 && LA60_0<=76)||(LA60_0>=81 && LA60_0<=88)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2655:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2655:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2656:7: lv_elements_7_0= ruleDefinitionBodyElement
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
    // InternalSysMLOC.g:2683:1: entryRuleInterfaceUsage returns [EObject current=null] : iv_ruleInterfaceUsage= ruleInterfaceUsage EOF ;
    public final EObject entryRuleInterfaceUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceUsage = null;


        try {
            // InternalSysMLOC.g:2683:55: (iv_ruleInterfaceUsage= ruleInterfaceUsage EOF )
            // InternalSysMLOC.g:2684:2: iv_ruleInterfaceUsage= ruleInterfaceUsage EOF
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
    // InternalSysMLOC.g:2690:1: ruleInterfaceUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | this_ConnectorPart_6= ruleConnectorPart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' ) ) ) ;
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

        EObject this_ConnectorPart_5 = null;

        EObject this_ConnectorPart_6 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:2696:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | this_ConnectorPart_6= ruleConnectorPart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' ) ) ) )
            // InternalSysMLOC.g:2697:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | this_ConnectorPart_6= ruleConnectorPart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' ) ) )
            {
            // InternalSysMLOC.g:2697:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | this_ConnectorPart_6= ruleConnectorPart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' ) ) )
            // InternalSysMLOC.g:2698:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'interface' ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | this_ConnectorPart_6= ruleConnectorPart[$current] ) (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' ) )
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
            // InternalSysMLOC.g:2724:3: ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | this_ConnectorPart_6= ruleConnectorPart[$current] )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalSysMLOC.g:2725:4: ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? )
                    {
                    // InternalSysMLOC.g:2725:4: ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? )
                    // InternalSysMLOC.g:2726:5: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )?
                    {
                    // InternalSysMLOC.g:2726:5: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_UNRESTRICTED_NAME)||LA62_0==47||(LA62_0>=50 && LA62_0<=51)||(LA62_0>=62 && LA62_0<=64)||(LA62_0>=68 && LA62_0<=70)||(LA62_0>=72 && LA62_0<=76)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalSysMLOC.g:2727:6: this_UsageDeclaration_3= ruleUsageDeclaration[$current]
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

                    // InternalSysMLOC.g:2739:5: (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==36) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalSysMLOC.g:2740:6: otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current]
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getInterfaceUsageAccess().getConnectKeyword_3_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getInterfaceUsageRule());
                              						}
                              						newCompositeNode(grammarAccess.getInterfaceUsageAccess().getConnectorPartParserRuleCall_3_0_1_1());
                              					
                            }
                            pushFollow(FOLLOW_25);
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
                    // InternalSysMLOC.g:2758:4: this_ConnectorPart_6= ruleConnectorPart[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getInterfaceUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getInterfaceUsageAccess().getConnectorPartParserRuleCall_3_1());
                      			
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

            // InternalSysMLOC.g:2770:3: (otherlv_7= ';' | (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' ) )
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
                    // InternalSysMLOC.g:2771:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getInterfaceUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2776:4: (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' )
                    {
                    // InternalSysMLOC.g:2776:4: (otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}' )
                    // InternalSysMLOC.g:2777:5: otherlv_8= '{' ( (lv_elements_9_0= ruleInterBodyElement ) )* otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getInterfaceUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2781:5: ( (lv_elements_9_0= ruleInterBodyElement ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=RULE_SL_NOTE && LA65_0<=RULE_ML_NOTE)||LA65_0==RULE_REGULAR_COMMENT||(LA65_0>=RULE_ID && LA65_0<=RULE_UNRESTRICTED_NAME)||LA65_0==15||(LA65_0>=21 && LA65_0<=22)||(LA65_0>=25 && LA65_0<=29)||(LA65_0>=31 && LA65_0<=38)||(LA65_0>=42 && LA65_0<=43)||LA65_0==47||(LA65_0>=50 && LA65_0<=51)||(LA65_0>=53 && LA65_0<=59)||(LA65_0>=62 && LA65_0<=70)||(LA65_0>=72 && LA65_0<=76)||(LA65_0>=81 && LA65_0<=88)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2782:6: (lv_elements_9_0= ruleInterBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2782:6: (lv_elements_9_0= ruleInterBodyElement )
                    	    // InternalSysMLOC.g:2783:7: lv_elements_9_0= ruleInterBodyElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfaceUsageAccess().getElementsInterBodyElementParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_9_0=ruleInterBodyElement();

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
                    	      								"dut.control.sysmloc.SysMLOC.InterBodyElement");
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
    // InternalSysMLOC.g:2810:1: entryRuleFlowConnectionDefinition returns [EObject current=null] : iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF ;
    public final EObject entryRuleFlowConnectionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowConnectionDefinition = null;


        try {
            // InternalSysMLOC.g:2810:65: (iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF )
            // InternalSysMLOC.g:2811:2: iv_ruleFlowConnectionDefinition= ruleFlowConnectionDefinition EOF
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
    // InternalSysMLOC.g:2817:1: ruleFlowConnectionDefinition returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2823:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) ) )
            // InternalSysMLOC.g:2824:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            {
            // InternalSysMLOC.g:2824:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) ) )
            // InternalSysMLOC.g:2825:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceDefinitionPrefix_1= ruleOccurrenceDefinitionPrefix[$current] otherlv_2= 'flow' otherlv_3= 'def' this_DefinitionDeclaration_4= ruleDefinitionDeclaration[$current] (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
            // InternalSysMLOC.g:2866:3: (otherlv_5= ';' | (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' ) )
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
                    // InternalSysMLOC.g:2867:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFlowConnectionDefinitionAccess().getSemicolonKeyword_5_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:2872:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    {
                    // InternalSysMLOC.g:2872:4: (otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}' )
                    // InternalSysMLOC.g:2873:5: otherlv_6= '{' ( (lv_elements_7_0= ruleDefinitionBodyElement ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFlowConnectionDefinitionAccess().getLeftCurlyBracketKeyword_5_1_0());
                      				
                    }
                    // InternalSysMLOC.g:2877:5: ( (lv_elements_7_0= ruleDefinitionBodyElement ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( ((LA67_0>=RULE_SL_NOTE && LA67_0<=RULE_ML_NOTE)||LA67_0==RULE_REGULAR_COMMENT||(LA67_0>=RULE_ID && LA67_0<=RULE_UNRESTRICTED_NAME)||LA67_0==15||(LA67_0>=21 && LA67_0<=22)||(LA67_0>=25 && LA67_0<=29)||(LA67_0>=31 && LA67_0<=38)||(LA67_0>=42 && LA67_0<=43)||LA67_0==47||(LA67_0>=50 && LA67_0<=51)||(LA67_0>=53 && LA67_0<=59)||(LA67_0>=62 && LA67_0<=70)||(LA67_0>=72 && LA67_0<=76)||(LA67_0>=81 && LA67_0<=88)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalSysMLOC.g:2878:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:2878:6: (lv_elements_7_0= ruleDefinitionBodyElement )
                    	    // InternalSysMLOC.g:2879:7: lv_elements_7_0= ruleDefinitionBodyElement
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
    // InternalSysMLOC.g:2906:1: entryRuleFlowConnectionUsage returns [EObject current=null] : iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF ;
    public final EObject entryRuleFlowConnectionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowConnectionUsage = null;


        try {
            // InternalSysMLOC.g:2906:60: (iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF )
            // InternalSysMLOC.g:2907:2: iv_ruleFlowConnectionUsage= ruleFlowConnectionUsage EOF
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
    // InternalSysMLOC.g:2913:1: ruleFlowConnectionUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) ) ;
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
            // InternalSysMLOC.g:2919:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) ) )
            // InternalSysMLOC.g:2920:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) )
            {
            // InternalSysMLOC.g:2920:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) ) )
            // InternalSysMLOC.g:2921:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'flow' (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (this_FeatureValue_4= ruleFeatureValue[$current] )? (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )? ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )? (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) )
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
            // InternalSysMLOC.g:2947:3: (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )?
            int alt69=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA69_1 = input.LA(2);

                    if ( ((LA69_1>=RULE_ID && LA69_1<=RULE_UNRESTRICTED_NAME)||LA69_1==15||LA69_1==21||(LA69_1>=39 && LA69_1<=40)||LA69_1==47||(LA69_1>=50 && LA69_1<=51)||(LA69_1>=62 && LA69_1<=70)||(LA69_1>=72 && LA69_1<=76)||LA69_1==80) ) {
                        alt69=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA69_2 = input.LA(2);

                    if ( ((LA69_2>=RULE_ID && LA69_2<=RULE_UNRESTRICTED_NAME)||LA69_2==15||LA69_2==21||(LA69_2>=39 && LA69_2<=40)||LA69_2==47||(LA69_2>=50 && LA69_2<=51)||(LA69_2>=62 && LA69_2<=70)||(LA69_2>=72 && LA69_2<=76)||LA69_2==80) ) {
                        alt69=1;
                    }
                    }
                    break;
                case 47:
                case 50:
                case 51:
                case 62:
                case 63:
                case 64:
                case 68:
                case 69:
                case 70:
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
                    // InternalSysMLOC.g:2948:4: this_UsageDeclaration_3= ruleUsageDeclaration[$current]
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

            // InternalSysMLOC.g:2960:3: (this_FeatureValue_4= ruleFeatureValue[$current] )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=65 && LA70_0<=67)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSysMLOC.g:2961:4: this_FeatureValue_4= ruleFeatureValue[$current]
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

            // InternalSysMLOC.g:2973:3: (otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==39) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSysMLOC.g:2974:4: otherlv_5= 'of' ( (lv_ItemFeature_6_0= ruleName ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFlowConnectionUsageAccess().getOfKeyword_5_0());
                      			
                    }
                    // InternalSysMLOC.g:2978:4: ( (lv_ItemFeature_6_0= ruleName ) )
                    // InternalSysMLOC.g:2979:5: (lv_ItemFeature_6_0= ruleName )
                    {
                    // InternalSysMLOC.g:2979:5: (lv_ItemFeature_6_0= ruleName )
                    // InternalSysMLOC.g:2980:6: lv_ItemFeature_6_0= ruleName
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

            // InternalSysMLOC.g:2998:3: ( (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_UNRESTRICTED_NAME)||LA73_0==40||LA73_0==80) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSysMLOC.g:2999:4: (otherlv_7= 'from' )? ( (lv_FlowEnd_8_0= ruleFeatureChainName ) ) otherlv_9= 'to' ( (lv_FlowEnd_10_0= ruleFeatureChainName ) )
                    {
                    // InternalSysMLOC.g:2999:4: (otherlv_7= 'from' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==40) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalSysMLOC.g:3000:5: otherlv_7= 'from'
                            {
                            otherlv_7=(Token)match(input,40,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getFlowConnectionUsageAccess().getFromKeyword_6_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:3005:4: ( (lv_FlowEnd_8_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3006:5: (lv_FlowEnd_8_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3006:5: (lv_FlowEnd_8_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3007:6: lv_FlowEnd_8_0= ruleFeatureChainName
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
                    // InternalSysMLOC.g:3028:4: ( (lv_FlowEnd_10_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:3029:5: (lv_FlowEnd_10_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:3029:5: (lv_FlowEnd_10_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:3030:6: lv_FlowEnd_10_0= ruleFeatureChainName
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

            // InternalSysMLOC.g:3048:3: (otherlv_11= ';' | (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' ) )
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
                    // InternalSysMLOC.g:3049:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFlowConnectionUsageAccess().getSemicolonKeyword_7_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3054:4: (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' )
                    {
                    // InternalSysMLOC.g:3054:4: (otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}' )
                    // InternalSysMLOC.g:3055:5: otherlv_12= '{' ( (lv_elements_13_0= ruleUsageBodyElement ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getFlowConnectionUsageAccess().getLeftCurlyBracketKeyword_7_1_0());
                      				
                    }
                    // InternalSysMLOC.g:3059:5: ( (lv_elements_13_0= ruleUsageBodyElement ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=RULE_SL_NOTE && LA74_0<=RULE_ML_NOTE)||LA74_0==RULE_REGULAR_COMMENT||(LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)||LA74_0==15||(LA74_0>=21 && LA74_0<=22)||(LA74_0>=25 && LA74_0<=29)||(LA74_0>=31 && LA74_0<=38)||(LA74_0>=42 && LA74_0<=43)||LA74_0==47||(LA74_0>=50 && LA74_0<=51)||(LA74_0>=53 && LA74_0<=59)||(LA74_0>=62 && LA74_0<=70)||(LA74_0>=72 && LA74_0<=76)||(LA74_0>=81 && LA74_0<=88)) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3060:6: (lv_elements_13_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:3060:6: (lv_elements_13_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:3061:7: lv_elements_13_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:3088:1: entryRuleActionUsage returns [EObject current=null] : iv_ruleActionUsage= ruleActionUsage EOF ;
    public final EObject entryRuleActionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionUsage = null;


        try {
            // InternalSysMLOC.g:3088:52: (iv_ruleActionUsage= ruleActionUsage EOF )
            // InternalSysMLOC.g:3089:2: iv_ruleActionUsage= ruleActionUsage EOF
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
    // InternalSysMLOC.g:3095:1: ruleActionUsage returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) ;
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
            // InternalSysMLOC.g:3101:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:3102:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:3102:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:3103:3: this_MemberPrefix_0= ruleMemberPrefix[$current] this_OccurrenceUsagePrefix_1= ruleOccurrenceUsagePrefix[$current] otherlv_2= 'action' ( (lv_declaredName_3_0= ruleQualifiedName ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
            // InternalSysMLOC.g:3129:3: ( (lv_declaredName_3_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:3130:4: (lv_declaredName_3_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:3130:4: (lv_declaredName_3_0= ruleQualifiedName )
            // InternalSysMLOC.g:3131:5: lv_declaredName_3_0= ruleQualifiedName
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

            // InternalSysMLOC.g:3148:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' ) )
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
                    // InternalSysMLOC.g:3149:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getActionUsageAccess().getSemicolonKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3154:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:3154:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:3155:5: otherlv_5= '{' ( (lv_elements_6_0= ruleUsageBodyElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getActionUsageAccess().getLeftCurlyBracketKeyword_4_1_0());
                      				
                    }
                    // InternalSysMLOC.g:3159:5: ( (lv_elements_6_0= ruleUsageBodyElement ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( ((LA76_0>=RULE_SL_NOTE && LA76_0<=RULE_ML_NOTE)||LA76_0==RULE_REGULAR_COMMENT||(LA76_0>=RULE_ID && LA76_0<=RULE_UNRESTRICTED_NAME)||LA76_0==15||(LA76_0>=21 && LA76_0<=22)||(LA76_0>=25 && LA76_0<=29)||(LA76_0>=31 && LA76_0<=38)||(LA76_0>=42 && LA76_0<=43)||LA76_0==47||(LA76_0>=50 && LA76_0<=51)||(LA76_0>=53 && LA76_0<=59)||(LA76_0>=62 && LA76_0<=70)||(LA76_0>=72 && LA76_0<=76)||(LA76_0>=81 && LA76_0<=88)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3160:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    {
                    	    // InternalSysMLOC.g:3160:6: (lv_elements_6_0= ruleUsageBodyElement )
                    	    // InternalSysMLOC.g:3161:7: lv_elements_6_0= ruleUsageBodyElement
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
    // InternalSysMLOC.g:3188:1: entryRuleAliasElement returns [EObject current=null] : iv_ruleAliasElement= ruleAliasElement EOF ;
    public final EObject entryRuleAliasElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasElement = null;


        try {
            // InternalSysMLOC.g:3188:53: (iv_ruleAliasElement= ruleAliasElement EOF )
            // InternalSysMLOC.g:3189:2: iv_ruleAliasElement= ruleAliasElement EOF
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
    // InternalSysMLOC.g:3195:1: ruleAliasElement returns [EObject current=null] : (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) ) ;
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
            // InternalSysMLOC.g:3201:2: ( (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) ) )
            // InternalSysMLOC.g:3202:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) )
            {
            // InternalSysMLOC.g:3202:2: (this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) ) )
            // InternalSysMLOC.g:3203:3: this_MemberPrefix_0= ruleMemberPrefix[$current] otherlv_1= 'alias' (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )? ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'for' ( (lv_memberElement_7_0= ruleQualifiedName ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) )
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
            // InternalSysMLOC.g:3218:3: (otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==44) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSysMLOC.g:3219:4: otherlv_2= '<' ( (lv_memberShortName_3_0= ruleName ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAliasElementAccess().getLessThanSignKeyword_2_0());
                      			
                    }
                    // InternalSysMLOC.g:3223:4: ( (lv_memberShortName_3_0= ruleName ) )
                    // InternalSysMLOC.g:3224:5: (lv_memberShortName_3_0= ruleName )
                    {
                    // InternalSysMLOC.g:3224:5: (lv_memberShortName_3_0= ruleName )
                    // InternalSysMLOC.g:3225:6: lv_memberShortName_3_0= ruleName
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

            // InternalSysMLOC.g:3247:3: ( (lv_memberName_5_0= ruleName ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSysMLOC.g:3248:4: (lv_memberName_5_0= ruleName )
                    {
                    // InternalSysMLOC.g:3248:4: (lv_memberName_5_0= ruleName )
                    // InternalSysMLOC.g:3249:5: lv_memberName_5_0= ruleName
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
            // InternalSysMLOC.g:3270:3: ( (lv_memberElement_7_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:3271:4: (lv_memberElement_7_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:3271:4: (lv_memberElement_7_0= ruleQualifiedName )
            // InternalSysMLOC.g:3272:5: lv_memberElement_7_0= ruleQualifiedName
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

            // InternalSysMLOC.g:3289:3: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' ) )
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
                    // InternalSysMLOC.g:3290:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getAliasElementAccess().getSemicolonKeyword_6_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:3295:4: (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' )
                    {
                    // InternalSysMLOC.g:3295:4: (otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}' )
                    // InternalSysMLOC.g:3296:5: otherlv_9= '{' ( (lv_elements_10_0= ruleAnnotatingElement ) )* otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getAliasElementAccess().getLeftCurlyBracketKeyword_6_1_0());
                      				
                    }
                    // InternalSysMLOC.g:3300:5: ( (lv_elements_10_0= ruleAnnotatingElement ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==RULE_REGULAR_COMMENT||LA80_0==22||(LA80_0>=25 && LA80_0<=28)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSysMLOC.g:3301:6: (lv_elements_10_0= ruleAnnotatingElement )
                    	    {
                    	    // InternalSysMLOC.g:3301:6: (lv_elements_10_0= ruleAnnotatingElement )
                    	    // InternalSysMLOC.g:3302:7: lv_elements_10_0= ruleAnnotatingElement
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


    // $ANTLR start "entryRuleConnectorEnd"
    // InternalSysMLOC.g:3329:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalSysMLOC.g:3329:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalSysMLOC.g:3330:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectorEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectorEnd=ruleConnectorEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectorEnd; 
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
    // InternalSysMLOC.g:3336:1: ruleConnectorEnd returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= '..' ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) ) otherlv_4= ']' )? ( ( (lv_delcaredName_5_0= ruleName ) ) (otherlv_6= '::>' | otherlv_7= 'references' ) )? ( (lv_refElement_8_0= ruleFeatureChainName ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_Multiplicity_1_0 = null;

        AntlrDatatypeRuleToken lv_Multiplicity_3_0 = null;

        AntlrDatatypeRuleToken lv_delcaredName_5_0 = null;

        AntlrDatatypeRuleToken lv_refElement_8_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3342:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= '..' ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) ) otherlv_4= ']' )? ( ( (lv_delcaredName_5_0= ruleName ) ) (otherlv_6= '::>' | otherlv_7= 'references' ) )? ( (lv_refElement_8_0= ruleFeatureChainName ) ) ) )
            // InternalSysMLOC.g:3343:2: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= '..' ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) ) otherlv_4= ']' )? ( ( (lv_delcaredName_5_0= ruleName ) ) (otherlv_6= '::>' | otherlv_7= 'references' ) )? ( (lv_refElement_8_0= ruleFeatureChainName ) ) )
            {
            // InternalSysMLOC.g:3343:2: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= '..' ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) ) otherlv_4= ']' )? ( ( (lv_delcaredName_5_0= ruleName ) ) (otherlv_6= '::>' | otherlv_7= 'references' ) )? ( (lv_refElement_8_0= ruleFeatureChainName ) ) )
            // InternalSysMLOC.g:3344:3: (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= '..' ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) ) otherlv_4= ']' )? ( ( (lv_delcaredName_5_0= ruleName ) ) (otherlv_6= '::>' | otherlv_7= 'references' ) )? ( (lv_refElement_8_0= ruleFeatureChainName ) )
            {
            // InternalSysMLOC.g:3344:3: (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= '..' ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) ) otherlv_4= ']' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==47) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSysMLOC.g:3345:4: otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= '..' ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) ) otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConnectorEndAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:3349:4: ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) )
                    // InternalSysMLOC.g:3350:5: (lv_Multiplicity_1_0= ruleMultiplicityExpression )
                    {
                    // InternalSysMLOC.g:3350:5: (lv_Multiplicity_1_0= ruleMultiplicityExpression )
                    // InternalSysMLOC.g:3351:6: lv_Multiplicity_1_0= ruleMultiplicityExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_63);
                    lv_Multiplicity_1_0=ruleMultiplicityExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorEndRule());
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

                    otherlv_2=(Token)match(input,48,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConnectorEndAccess().getFullStopFullStopKeyword_0_2());
                      			
                    }
                    // InternalSysMLOC.g:3372:4: ( (lv_Multiplicity_3_0= ruleMultiplicityExpression ) )
                    // InternalSysMLOC.g:3373:5: (lv_Multiplicity_3_0= ruleMultiplicityExpression )
                    {
                    // InternalSysMLOC.g:3373:5: (lv_Multiplicity_3_0= ruleMultiplicityExpression )
                    // InternalSysMLOC.g:3374:6: lv_Multiplicity_3_0= ruleMultiplicityExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_Multiplicity_3_0=ruleMultiplicityExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorEndRule());
                      						}
                      						add(
                      							current,
                      							"Multiplicity",
                      							lv_Multiplicity_3_0,
                      							"dut.control.sysmloc.SysMLOC.MultiplicityExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,49,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConnectorEndAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }
                    break;

            }

            // InternalSysMLOC.g:3396:3: ( ( (lv_delcaredName_5_0= ruleName ) ) (otherlv_6= '::>' | otherlv_7= 'references' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                int LA84_1 = input.LA(2);

                if ( ((LA84_1>=50 && LA84_1<=51)) ) {
                    alt84=1;
                }
            }
            else if ( (LA84_0==RULE_UNRESTRICTED_NAME) ) {
                int LA84_2 = input.LA(2);

                if ( ((LA84_2>=50 && LA84_2<=51)) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // InternalSysMLOC.g:3397:4: ( (lv_delcaredName_5_0= ruleName ) ) (otherlv_6= '::>' | otherlv_7= 'references' )
                    {
                    // InternalSysMLOC.g:3397:4: ( (lv_delcaredName_5_0= ruleName ) )
                    // InternalSysMLOC.g:3398:5: (lv_delcaredName_5_0= ruleName )
                    {
                    // InternalSysMLOC.g:3398:5: (lv_delcaredName_5_0= ruleName )
                    // InternalSysMLOC.g:3399:6: lv_delcaredName_5_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorEndAccess().getDelcaredNameNameParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_65);
                    lv_delcaredName_5_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConnectorEndRule());
                      						}
                      						set(
                      							current,
                      							"delcaredName",
                      							lv_delcaredName_5_0,
                      							"dut.control.sysmloc.SysMLOC.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSysMLOC.g:3416:4: (otherlv_6= '::>' | otherlv_7= 'references' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==50) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==51) ) {
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
                            // InternalSysMLOC.g:3417:5: otherlv_6= '::>'
                            {
                            otherlv_6=(Token)match(input,50,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getColonColonGreaterThanSignKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:3422:5: otherlv_7= 'references'
                            {
                            otherlv_7=(Token)match(input,51,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getConnectorEndAccess().getReferencesKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSysMLOC.g:3428:3: ( (lv_refElement_8_0= ruleFeatureChainName ) )
            // InternalSysMLOC.g:3429:4: (lv_refElement_8_0= ruleFeatureChainName )
            {
            // InternalSysMLOC.g:3429:4: (lv_refElement_8_0= ruleFeatureChainName )
            // InternalSysMLOC.g:3430:5: lv_refElement_8_0= ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectorEndAccess().getRefElementFeatureChainNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_refElement_8_0=ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectorEndRule());
              					}
              					set(
              						current,
              						"refElement",
              						lv_refElement_8_0,
              						"dut.control.sysmloc.SysMLOC.FeatureChainName");
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
    // $ANTLR end "ruleConnectorEnd"


    // $ANTLR start "ruleisImportAllFragment"
    // InternalSysMLOC.g:3452:1: ruleisImportAllFragment[EObject in_current] returns [EObject current=in_current] : ( (lv_isImportAll_0_0= 'all' ) ) ;
    public final EObject ruleisImportAllFragment(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isImportAll_0_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3458:2: ( ( (lv_isImportAll_0_0= 'all' ) ) )
            // InternalSysMLOC.g:3459:2: ( (lv_isImportAll_0_0= 'all' ) )
            {
            // InternalSysMLOC.g:3459:2: ( (lv_isImportAll_0_0= 'all' ) )
            // InternalSysMLOC.g:3460:3: (lv_isImportAll_0_0= 'all' )
            {
            // InternalSysMLOC.g:3460:3: (lv_isImportAll_0_0= 'all' )
            // InternalSysMLOC.g:3461:4: lv_isImportAll_0_0= 'all'
            {
            lv_isImportAll_0_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3477:1: ruleMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ;
    public final EObject ruleMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3483:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? )
            // InternalSysMLOC.g:3484:2: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            {
            // InternalSysMLOC.g:3484:2: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=81 && LA85_0<=83)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSysMLOC.g:3485:3: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalSysMLOC.g:3485:3: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalSysMLOC.g:3486:4: lv_visibility_0_0= ruleVisibilityIndicator
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
    // InternalSysMLOC.g:3507:1: ruleDefinitionPrefix[EObject in_current] returns [EObject current=in_current] : (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ;
    public final EObject ruleDefinitionPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_BasicDefinitionPrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3513:2: ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? )
            // InternalSysMLOC.g:3514:2: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )?
            {
            // InternalSysMLOC.g:3514:2: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=54 && LA86_0<=55)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSysMLOC.g:3515:3: this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current]
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
    // InternalSysMLOC.g:3531:1: ruleOccurrenceDefinitionPrefix[EObject in_current] returns [EObject current=in_current] : ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? ) ;
    public final EObject ruleOccurrenceDefinitionPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isIndividual_1_0=null;
        EObject this_BasicDefinitionPrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3537:2: ( ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? ) )
            // InternalSysMLOC.g:3538:2: ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? )
            {
            // InternalSysMLOC.g:3538:2: ( (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )? )
            // InternalSysMLOC.g:3539:3: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )? ( (lv_isIndividual_1_0= 'individual' ) )?
            {
            // InternalSysMLOC.g:3539:3: (this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current] )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=54 && LA87_0<=55)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSysMLOC.g:3540:4: this_BasicDefinitionPrefix_0= ruleBasicDefinitionPrefix[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getOccurrenceDefinitionPrefixRule());
                      				}
                      				newCompositeNode(grammarAccess.getOccurrenceDefinitionPrefixAccess().getBasicDefinitionPrefixParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_66);
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

            // InternalSysMLOC.g:3552:3: ( (lv_isIndividual_1_0= 'individual' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==53) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSysMLOC.g:3553:4: (lv_isIndividual_1_0= 'individual' )
                    {
                    // InternalSysMLOC.g:3553:4: (lv_isIndividual_1_0= 'individual' )
                    // InternalSysMLOC.g:3554:5: lv_isIndividual_1_0= 'individual'
                    {
                    lv_isIndividual_1_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3571:1: ruleBasicDefinitionPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) ) ;
    public final EObject ruleBasicDefinitionPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token lv_isVariation_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3577:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) ) )
            // InternalSysMLOC.g:3578:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) )
            {
            // InternalSysMLOC.g:3578:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isVariation_1_0= 'variation' ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==54) ) {
                alt89=1;
            }
            else if ( (LA89_0==55) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalSysMLOC.g:3579:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    {
                    // InternalSysMLOC.g:3579:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    // InternalSysMLOC.g:3580:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalSysMLOC.g:3580:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalSysMLOC.g:3581:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSysMLOC.g:3594:3: ( (lv_isVariation_1_0= 'variation' ) )
                    {
                    // InternalSysMLOC.g:3594:3: ( (lv_isVariation_1_0= 'variation' ) )
                    // InternalSysMLOC.g:3595:4: (lv_isVariation_1_0= 'variation' )
                    {
                    // InternalSysMLOC.g:3595:4: (lv_isVariation_1_0= 'variation' )
                    // InternalSysMLOC.g:3596:5: lv_isVariation_1_0= 'variation'
                    {
                    lv_isVariation_1_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3613:1: ruleUsagePrefix[EObject in_current] returns [EObject current=in_current] : this_UnextendedUsagePrefix_0= ruleUnextendedUsagePrefix[$current] ;
    public final EObject ruleUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_UnextendedUsagePrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3619:2: (this_UnextendedUsagePrefix_0= ruleUnextendedUsagePrefix[$current] )
            // InternalSysMLOC.g:3620:2: this_UnextendedUsagePrefix_0= ruleUnextendedUsagePrefix[$current]
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
    // InternalSysMLOC.g:3635:1: ruleUnextendedUsagePrefix[EObject in_current] returns [EObject current=in_current] : (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ) ;
    public final EObject ruleUnextendedUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_EndUsagePrefix_0 = null;

        EObject this_BasicUsagePrefix_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3641:2: ( (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ) )
            // InternalSysMLOC.g:3642:2: (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] )
            {
            // InternalSysMLOC.g:3642:2: (this_EndUsagePrefix_0= ruleEndUsagePrefix[$current] | this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==56) ) {
                alt90=1;
            }
            else if ( ((LA90_0>=RULE_ID && LA90_0<=RULE_UNRESTRICTED_NAME)||LA90_0==15||LA90_0==21||(LA90_0>=31 && LA90_0<=38)||LA90_0==42||LA90_0==47||(LA90_0>=50 && LA90_0<=51)||(LA90_0>=53 && LA90_0<=55)||(LA90_0>=57 && LA90_0<=59)||(LA90_0>=62 && LA90_0<=70)||(LA90_0>=72 && LA90_0<=76)||(LA90_0>=84 && LA90_0<=88)) ) {
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
                    // InternalSysMLOC.g:3643:3: this_EndUsagePrefix_0= ruleEndUsagePrefix[$current]
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
                    // InternalSysMLOC.g:3655:3: this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current]
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
    // InternalSysMLOC.g:3671:1: ruleEndUsagePrefix[EObject in_current] returns [EObject current=in_current] : ( (lv_isEnd_0_0= 'end' ) ) ;
    public final EObject ruleEndUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isEnd_0_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:3677:2: ( ( (lv_isEnd_0_0= 'end' ) ) )
            // InternalSysMLOC.g:3678:2: ( (lv_isEnd_0_0= 'end' ) )
            {
            // InternalSysMLOC.g:3678:2: ( (lv_isEnd_0_0= 'end' ) )
            // InternalSysMLOC.g:3679:3: (lv_isEnd_0_0= 'end' )
            {
            // InternalSysMLOC.g:3679:3: (lv_isEnd_0_0= 'end' )
            // InternalSysMLOC.g:3680:4: lv_isEnd_0_0= 'end'
            {
            lv_isEnd_0_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3696:1: ruleOccurrenceUsagePrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) ) ;
    public final EObject ruleOccurrenceUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isEnd_0_0=null;
        Token lv_isIndividual_2_0=null;
        EObject this_BasicUsagePrefix_1 = null;

        Enumerator lv_portionKind_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3702:2: ( ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) ) )
            // InternalSysMLOC.g:3703:2: ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) )
            {
            // InternalSysMLOC.g:3703:2: ( ( (lv_isEnd_0_0= 'end' ) ) | (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==56) ) {
                alt93=1;
            }
            else if ( ((LA93_0>=RULE_ID && LA93_0<=RULE_UNRESTRICTED_NAME)||LA93_0==15||LA93_0==21||(LA93_0>=31 && LA93_0<=38)||LA93_0==42||LA93_0==47||(LA93_0>=50 && LA93_0<=51)||(LA93_0>=53 && LA93_0<=55)||(LA93_0>=57 && LA93_0<=59)||(LA93_0>=62 && LA93_0<=70)||(LA93_0>=72 && LA93_0<=76)||(LA93_0>=84 && LA93_0<=88)) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalSysMLOC.g:3704:3: ( (lv_isEnd_0_0= 'end' ) )
                    {
                    // InternalSysMLOC.g:3704:3: ( (lv_isEnd_0_0= 'end' ) )
                    // InternalSysMLOC.g:3705:4: (lv_isEnd_0_0= 'end' )
                    {
                    // InternalSysMLOC.g:3705:4: (lv_isEnd_0_0= 'end' )
                    // InternalSysMLOC.g:3706:5: lv_isEnd_0_0= 'end'
                    {
                    lv_isEnd_0_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSysMLOC.g:3719:3: (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? )
                    {
                    // InternalSysMLOC.g:3719:3: (this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )? )
                    // InternalSysMLOC.g:3720:4: this_BasicUsagePrefix_1= ruleBasicUsagePrefix[$current] ( (lv_isIndividual_2_0= 'individual' ) )? ( (lv_portionKind_3_0= rulePortionKind ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getOccurrenceUsagePrefixRule());
                      				}
                      				newCompositeNode(grammarAccess.getOccurrenceUsagePrefixAccess().getBasicUsagePrefixParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_67);
                    this_BasicUsagePrefix_1=ruleBasicUsagePrefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BasicUsagePrefix_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:3731:4: ( (lv_isIndividual_2_0= 'individual' ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==53) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalSysMLOC.g:3732:5: (lv_isIndividual_2_0= 'individual' )
                            {
                            // InternalSysMLOC.g:3732:5: (lv_isIndividual_2_0= 'individual' )
                            // InternalSysMLOC.g:3733:6: lv_isIndividual_2_0= 'individual'
                            {
                            lv_isIndividual_2_0=(Token)match(input,53,FOLLOW_68); if (state.failed) return current;
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

                    // InternalSysMLOC.g:3745:4: ( (lv_portionKind_3_0= rulePortionKind ) )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( ((LA92_0>=87 && LA92_0<=88)) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalSysMLOC.g:3746:5: (lv_portionKind_3_0= rulePortionKind )
                            {
                            // InternalSysMLOC.g:3746:5: (lv_portionKind_3_0= rulePortionKind )
                            // InternalSysMLOC.g:3747:6: lv_portionKind_3_0= rulePortionKind
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
    // InternalSysMLOC.g:3770:1: ruleRefPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? ) ;
    public final EObject ruleRefPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_1_0=null;
        Token lv_isVariation_2_0=null;
        Token lv_isReadOnly_3_0=null;
        Token lv_isDerived_4_0=null;
        Enumerator lv_direction_0_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3776:2: ( ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? ) )
            // InternalSysMLOC.g:3777:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? )
            {
            // InternalSysMLOC.g:3777:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )? )
            // InternalSysMLOC.g:3778:3: ( (lv_direction_0_0= ruleFeatureDirection ) )? ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )? ( (lv_isReadOnly_3_0= 'readonly' ) )? ( (lv_isDerived_4_0= 'derived' ) )?
            {
            // InternalSysMLOC.g:3778:3: ( (lv_direction_0_0= ruleFeatureDirection ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=84 && LA94_0<=86)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSysMLOC.g:3779:4: (lv_direction_0_0= ruleFeatureDirection )
                    {
                    // InternalSysMLOC.g:3779:4: (lv_direction_0_0= ruleFeatureDirection )
                    // InternalSysMLOC.g:3780:5: lv_direction_0_0= ruleFeatureDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRefPrefixAccess().getDirectionFeatureDirectionEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_69);
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

            // InternalSysMLOC.g:3797:3: ( ( (lv_isAbstract_1_0= 'abstract' ) ) | ( (lv_isVariation_2_0= 'variation' ) ) )?
            int alt95=3;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==54) ) {
                alt95=1;
            }
            else if ( (LA95_0==55) ) {
                alt95=2;
            }
            switch (alt95) {
                case 1 :
                    // InternalSysMLOC.g:3798:4: ( (lv_isAbstract_1_0= 'abstract' ) )
                    {
                    // InternalSysMLOC.g:3798:4: ( (lv_isAbstract_1_0= 'abstract' ) )
                    // InternalSysMLOC.g:3799:5: (lv_isAbstract_1_0= 'abstract' )
                    {
                    // InternalSysMLOC.g:3799:5: (lv_isAbstract_1_0= 'abstract' )
                    // InternalSysMLOC.g:3800:6: lv_isAbstract_1_0= 'abstract'
                    {
                    lv_isAbstract_1_0=(Token)match(input,54,FOLLOW_70); if (state.failed) return current;
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
                    // InternalSysMLOC.g:3813:4: ( (lv_isVariation_2_0= 'variation' ) )
                    {
                    // InternalSysMLOC.g:3813:4: ( (lv_isVariation_2_0= 'variation' ) )
                    // InternalSysMLOC.g:3814:5: (lv_isVariation_2_0= 'variation' )
                    {
                    // InternalSysMLOC.g:3814:5: (lv_isVariation_2_0= 'variation' )
                    // InternalSysMLOC.g:3815:6: lv_isVariation_2_0= 'variation'
                    {
                    lv_isVariation_2_0=(Token)match(input,55,FOLLOW_70); if (state.failed) return current;
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

            // InternalSysMLOC.g:3828:3: ( (lv_isReadOnly_3_0= 'readonly' ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==57) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalSysMLOC.g:3829:4: (lv_isReadOnly_3_0= 'readonly' )
                    {
                    // InternalSysMLOC.g:3829:4: (lv_isReadOnly_3_0= 'readonly' )
                    // InternalSysMLOC.g:3830:5: lv_isReadOnly_3_0= 'readonly'
                    {
                    lv_isReadOnly_3_0=(Token)match(input,57,FOLLOW_71); if (state.failed) return current;
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

            // InternalSysMLOC.g:3842:3: ( (lv_isDerived_4_0= 'derived' ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==58) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSysMLOC.g:3843:4: (lv_isDerived_4_0= 'derived' )
                    {
                    // InternalSysMLOC.g:3843:4: (lv_isDerived_4_0= 'derived' )
                    // InternalSysMLOC.g:3844:5: lv_isDerived_4_0= 'derived'
                    {
                    lv_isDerived_4_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3861:1: ruleBasicUsagePrefix[EObject in_current] returns [EObject current=in_current] : (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? ) ;
    public final EObject ruleBasicUsagePrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isReference_1_0=null;
        EObject this_RefPrefix_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3867:2: ( (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? ) )
            // InternalSysMLOC.g:3868:2: (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? )
            {
            // InternalSysMLOC.g:3868:2: (this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )? )
            // InternalSysMLOC.g:3869:3: this_RefPrefix_0= ruleRefPrefix[$current] ( (lv_isReference_1_0= 'ref' ) )?
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getBasicUsagePrefixRule());
              			}
              			newCompositeNode(grammarAccess.getBasicUsagePrefixAccess().getRefPrefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_72);
            this_RefPrefix_0=ruleRefPrefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefPrefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:3880:3: ( (lv_isReference_1_0= 'ref' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==59) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSysMLOC.g:3881:4: (lv_isReference_1_0= 'ref' )
                    {
                    // InternalSysMLOC.g:3881:4: (lv_isReference_1_0= 'ref' )
                    // InternalSysMLOC.g:3882:5: lv_isReference_1_0= 'ref'
                    {
                    lv_isReference_1_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:3899:1: ruleConnectorPart[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) ) ;
    public final EObject ruleConnectorPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_connectorPart_0_0 = null;

        EObject lv_connectorPart_2_0 = null;

        EObject lv_connectorPart_4_0 = null;

        EObject lv_connectorPart_6_0 = null;

        EObject lv_connectorPart_8_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:3905:2: ( ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) ) )
            // InternalSysMLOC.g:3906:2: ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) )
            {
            // InternalSysMLOC.g:3906:2: ( ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) ) | (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_ID && LA100_0<=RULE_UNRESTRICTED_NAME)||LA100_0==47||LA100_0==80) ) {
                alt100=1;
            }
            else if ( (LA100_0==60) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalSysMLOC.g:3907:3: ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) )
                    {
                    // InternalSysMLOC.g:3907:3: ( ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) ) )
                    // InternalSysMLOC.g:3908:4: ( (lv_connectorPart_0_0= ruleConnectorEnd ) ) otherlv_1= 'to' ( (lv_connectorPart_2_0= ruleConnectorEnd ) )
                    {
                    // InternalSysMLOC.g:3908:4: ( (lv_connectorPart_0_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3909:5: (lv_connectorPart_0_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3909:5: (lv_connectorPart_0_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3910:6: lv_connectorPart_0_0= ruleConnectorEnd
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
                    // InternalSysMLOC.g:3931:4: ( (lv_connectorPart_2_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3932:5: (lv_connectorPart_2_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3932:5: (lv_connectorPart_2_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3933:6: lv_connectorPart_2_0= ruleConnectorEnd
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
                    // InternalSysMLOC.g:3952:3: (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
                    {
                    // InternalSysMLOC.g:3952:3: (otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
                    // InternalSysMLOC.g:3953:4: otherlv_3= '(' ( (lv_connectorPart_4_0= ruleConnectorEnd ) ) otherlv_5= ',' ( (lv_connectorPart_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')'
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConnectorPartAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalSysMLOC.g:3957:4: ( (lv_connectorPart_4_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3958:5: (lv_connectorPart_4_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3958:5: (lv_connectorPart_4_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3959:6: lv_connectorPart_4_0= ruleConnectorEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_73);
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
                    // InternalSysMLOC.g:3980:4: ( (lv_connectorPart_6_0= ruleConnectorEnd ) )
                    // InternalSysMLOC.g:3981:5: (lv_connectorPart_6_0= ruleConnectorEnd )
                    {
                    // InternalSysMLOC.g:3981:5: (lv_connectorPart_6_0= ruleConnectorEnd )
                    // InternalSysMLOC.g:3982:6: lv_connectorPart_6_0= ruleConnectorEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
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

                    // InternalSysMLOC.g:3999:4: (otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==24) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4000:5: otherlv_7= ',' ( (lv_connectorPart_8_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getConnectorPartAccess().getCommaKeyword_1_4_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4004:5: ( (lv_connectorPart_8_0= ruleConnectorEnd ) )
                    	    // InternalSysMLOC.g:4005:6: (lv_connectorPart_8_0= ruleConnectorEnd )
                    	    {
                    	    // InternalSysMLOC.g:4005:6: (lv_connectorPart_8_0= ruleConnectorEnd )
                    	    // InternalSysMLOC.g:4006:7: lv_connectorPart_8_0= ruleConnectorEnd
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConnectorPartAccess().getConnectorPartConnectorEndParserRuleCall_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_74);
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
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDefinitionDeclaration"
    // InternalSysMLOC.g:4034:1: ruleDefinitionDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? ) ;
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
            // InternalSysMLOC.g:4040:2: ( ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? ) )
            // InternalSysMLOC.g:4041:2: ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? )
            {
            // InternalSysMLOC.g:4041:2: ( ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )? )
            // InternalSysMLOC.g:4042:3: ( (lv_declaredName_0_0= ruleName ) )? ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )?
            {
            // InternalSysMLOC.g:4042:3: ( (lv_declaredName_0_0= ruleName ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=RULE_ID && LA101_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSysMLOC.g:4043:4: (lv_declaredName_0_0= ruleName )
                    {
                    // InternalSysMLOC.g:4043:4: (lv_declaredName_0_0= ruleName )
                    // InternalSysMLOC.g:4044:5: lv_declaredName_0_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_75);
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

            // InternalSysMLOC.g:4061:3: ( (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=62 && LA104_0<=64)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalSysMLOC.g:4062:4: (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' ) ( (lv_superclassifiers_4_0= ruleFeatureChainName ) ) (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4062:4: (otherlv_1= ':' | otherlv_2= ':>' | otherlv_3= 'specializes' )
                    int alt102=3;
                    switch ( input.LA(1) ) {
                    case 62:
                        {
                        alt102=1;
                        }
                        break;
                    case 63:
                        {
                        alt102=2;
                        }
                        break;
                    case 64:
                        {
                        alt102=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }

                    switch (alt102) {
                        case 1 :
                            // InternalSysMLOC.g:4063:5: otherlv_1= ':'
                            {
                            otherlv_1=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getDefinitionDeclarationAccess().getColonKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4068:5: otherlv_2= ':>'
                            {
                            otherlv_2=(Token)match(input,63,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getDefinitionDeclarationAccess().getColonGreaterThanSignKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSysMLOC.g:4073:5: otherlv_3= 'specializes'
                            {
                            otherlv_3=(Token)match(input,64,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getDefinitionDeclarationAccess().getSpecializesKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4078:4: ( (lv_superclassifiers_4_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4079:5: (lv_superclassifiers_4_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4079:5: (lv_superclassifiers_4_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4080:6: lv_superclassifiers_4_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getSuperclassifiersFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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

                    // InternalSysMLOC.g:4097:4: (otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==24) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4098:5: otherlv_5= ',' ( (lv_superclassifiers_6_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDefinitionDeclarationAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4102:5: ( (lv_superclassifiers_6_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4103:6: (lv_superclassifiers_6_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4103:6: (lv_superclassifiers_6_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4104:7: lv_superclassifiers_6_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getSuperclassifiersFeatureChainNameParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop103;
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
    // InternalSysMLOC.g:4128:1: ruleUsage[EObject in_current] returns [EObject current=in_current] : ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? ) ;
    public final EObject ruleUsage(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_UsageDeclaration_0 = null;

        EObject this_FeatureValue_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4134:2: ( ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? ) )
            // InternalSysMLOC.g:4135:2: ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            {
            // InternalSysMLOC.g:4135:2: ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )? )
            // InternalSysMLOC.g:4136:3: (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_FeatureValue_1= ruleFeatureValue[$current] )?
            {
            // InternalSysMLOC.g:4136:3: (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=RULE_ID && LA105_0<=RULE_UNRESTRICTED_NAME)||LA105_0==47||(LA105_0>=50 && LA105_0<=51)||(LA105_0>=62 && LA105_0<=64)||(LA105_0>=68 && LA105_0<=70)||(LA105_0>=72 && LA105_0<=76)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSysMLOC.g:4137:4: this_UsageDeclaration_0= ruleUsageDeclaration[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getUsageRule());
                      				}
                      				newCompositeNode(grammarAccess.getUsageAccess().getUsageDeclarationParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_77);
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

            // InternalSysMLOC.g:4149:3: (this_FeatureValue_1= ruleFeatureValue[$current] )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=65 && LA106_0<=67)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalSysMLOC.g:4150:4: this_FeatureValue_1= ruleFeatureValue[$current]
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
    // InternalSysMLOC.g:4167:1: ruleUsageDeclaration[EObject in_current] returns [EObject current=in_current] : this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] ;
    public final EObject ruleUsageDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureDeclaration_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4173:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] )
            // InternalSysMLOC.g:4174:2: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current]
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
    // InternalSysMLOC.g:4189:1: ruleFeatureValue[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) ) ;
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
            // InternalSysMLOC.g:4195:2: ( ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) ) )
            // InternalSysMLOC.g:4196:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) )
            {
            // InternalSysMLOC.g:4196:2: ( (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) ) )
            // InternalSysMLOC.g:4197:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) ) ( (lv_valuePart_5_0= ruleExpression ) )
            {
            // InternalSysMLOC.g:4197:3: (otherlv_0= '=' | ( (lv_isInitial_1_0= ':=' ) ) | ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? ) )
            int alt108=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt108=1;
                }
                break;
            case 66:
                {
                alt108=2;
                }
                break;
            case 67:
                {
                alt108=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalSysMLOC.g:4198:4: otherlv_0= '='
                    {
                    otherlv_0=(Token)match(input,65,FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4203:4: ( (lv_isInitial_1_0= ':=' ) )
                    {
                    // InternalSysMLOC.g:4203:4: ( (lv_isInitial_1_0= ':=' ) )
                    // InternalSysMLOC.g:4204:5: (lv_isInitial_1_0= ':=' )
                    {
                    // InternalSysMLOC.g:4204:5: (lv_isInitial_1_0= ':=' )
                    // InternalSysMLOC.g:4205:6: lv_isInitial_1_0= ':='
                    {
                    lv_isInitial_1_0=(Token)match(input,66,FOLLOW_78); if (state.failed) return current;
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
                    // InternalSysMLOC.g:4218:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    {
                    // InternalSysMLOC.g:4218:4: ( ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )? )
                    // InternalSysMLOC.g:4219:5: ( (lv_isDefault_2_0= 'default' ) ) (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    {
                    // InternalSysMLOC.g:4219:5: ( (lv_isDefault_2_0= 'default' ) )
                    // InternalSysMLOC.g:4220:6: (lv_isDefault_2_0= 'default' )
                    {
                    // InternalSysMLOC.g:4220:6: (lv_isDefault_2_0= 'default' )
                    // InternalSysMLOC.g:4221:7: lv_isDefault_2_0= 'default'
                    {
                    lv_isDefault_2_0=(Token)match(input,67,FOLLOW_79); if (state.failed) return current;
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

                    // InternalSysMLOC.g:4233:5: (otherlv_3= '=' | ( (lv_isInitial_4_0= ':=' ) ) )?
                    int alt107=3;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==65) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==66) ) {
                        alt107=2;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalSysMLOC.g:4234:6: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,65,FOLLOW_78); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_2_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4239:6: ( (lv_isInitial_4_0= ':=' ) )
                            {
                            // InternalSysMLOC.g:4239:6: ( (lv_isInitial_4_0= ':=' ) )
                            // InternalSysMLOC.g:4240:7: (lv_isInitial_4_0= ':=' )
                            {
                            // InternalSysMLOC.g:4240:7: (lv_isInitial_4_0= ':=' )
                            // InternalSysMLOC.g:4241:8: lv_isInitial_4_0= ':='
                            {
                            lv_isInitial_4_0=(Token)match(input,66,FOLLOW_78); if (state.failed) return current;
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

            // InternalSysMLOC.g:4256:3: ( (lv_valuePart_5_0= ruleExpression ) )
            // InternalSysMLOC.g:4257:4: (lv_valuePart_5_0= ruleExpression )
            {
            // InternalSysMLOC.g:4257:4: (lv_valuePart_5_0= ruleExpression )
            // InternalSysMLOC.g:4258:5: lv_valuePart_5_0= ruleExpression
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
    // InternalSysMLOC.g:4280:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_declaredName_0_0 = null;

        EObject this_FeatureSpecializationPart_1 = null;

        EObject this_FeatureSpecializationPart_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4286:2: ( ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] ) )
            // InternalSysMLOC.g:4287:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            {
            // InternalSysMLOC.g:4287:2: ( ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? ) | this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current] )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=RULE_ID && LA110_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt110=1;
            }
            else if ( (LA110_0==47||(LA110_0>=50 && LA110_0<=51)||(LA110_0>=62 && LA110_0<=64)||(LA110_0>=68 && LA110_0<=70)||(LA110_0>=72 && LA110_0<=76)) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalSysMLOC.g:4288:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    {
                    // InternalSysMLOC.g:4288:3: ( ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )? )
                    // InternalSysMLOC.g:4289:4: ( (lv_declaredName_0_0= ruleName ) ) (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    {
                    // InternalSysMLOC.g:4289:4: ( (lv_declaredName_0_0= ruleName ) )
                    // InternalSysMLOC.g:4290:5: (lv_declaredName_0_0= ruleName )
                    {
                    // InternalSysMLOC.g:4290:5: (lv_declaredName_0_0= ruleName )
                    // InternalSysMLOC.g:4291:6: lv_declaredName_0_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_80);
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

                    // InternalSysMLOC.g:4308:4: (this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current] )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==47||(LA109_0>=50 && LA109_0<=51)||(LA109_0>=62 && LA109_0<=64)||(LA109_0>=68 && LA109_0<=70)||(LA109_0>=72 && LA109_0<=76)) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalSysMLOC.g:4309:5: this_FeatureSpecializationPart_1= ruleFeatureSpecializationPart[$current]
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
                    // InternalSysMLOC.g:4323:3: this_FeatureSpecializationPart_2= ruleFeatureSpecializationPart[$current]
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
    // InternalSysMLOC.g:4339:1: ruleFeatureSpecializationPart[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) ;
    public final EObject ruleFeatureSpecializationPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FeatureSpecialization_0 = null;

        EObject this_MultiplicityPart_1 = null;

        EObject this_FeatureSpecialization_2 = null;

        EObject this_MultiplicityPart_3 = null;

        EObject this_FeatureSpecialization_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4345:2: ( ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) ) )
            // InternalSysMLOC.g:4346:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            {
            // InternalSysMLOC.g:4346:2: ( ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* ) | (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=50 && LA115_0<=51)||(LA115_0>=62 && LA115_0<=64)||LA115_0==70||(LA115_0>=72 && LA115_0<=76)) ) {
                alt115=1;
            }
            else if ( (LA115_0==47||(LA115_0>=68 && LA115_0<=69)) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalSysMLOC.g:4347:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:4347:3: ( ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:4348:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+ (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )? (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    {
                    // InternalSysMLOC.g:4348:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+
                    int cnt111=0;
                    loop111:
                    do {
                        int alt111=2;
                        alt111 = dfa111.predict(input);
                        switch (alt111) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4349:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_80);
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
                    	    if ( cnt111 >= 1 ) break loop111;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(111, input);
                                throw eee;
                        }
                        cnt111++;
                    } while (true);

                    // InternalSysMLOC.g:4362:4: (this_MultiplicityPart_1= ruleMultiplicityPart[$current] )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==47||(LA112_0>=68 && LA112_0<=69)) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalSysMLOC.g:4363:5: this_MultiplicityPart_1= ruleMultiplicityPart[$current]
                            {
                            if ( state.backtracking==0 ) {

                              					if (current==null) {
                              						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                              					}
                              					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_81);
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

                    // InternalSysMLOC.g:4375:4: (this_FeatureSpecialization_2= ruleFeatureSpecialization[$current] )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( ((LA113_0>=50 && LA113_0<=51)||(LA113_0>=62 && LA113_0<=64)||LA113_0==70||(LA113_0>=72 && LA113_0<=76)) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4376:5: this_FeatureSpecialization_2= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_81);
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
                    	    break loop113;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4390:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    {
                    // InternalSysMLOC.g:4390:3: (this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )* )
                    // InternalSysMLOC.g:4391:4: this_MultiplicityPart_3= ruleMultiplicityPart[$current] (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    {
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                      				}
                      				newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_81);
                    this_MultiplicityPart_3=ruleMultiplicityPart(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityPart_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSysMLOC.g:4402:4: (this_FeatureSpecialization_4= ruleFeatureSpecialization[$current] )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( ((LA114_0>=50 && LA114_0<=51)||(LA114_0>=62 && LA114_0<=64)||LA114_0==70||(LA114_0>=72 && LA114_0<=76)) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4403:5: this_FeatureSpecialization_4= ruleFeatureSpecialization[$current]
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getFeatureSpecializationPartRule());
                    	      					}
                    	      					newCompositeNode(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_81);
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
                    	    break loop114;
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
    // InternalSysMLOC.g:4421:1: ruleIdentification[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) ) ;
    public final EObject ruleIdentification(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_declaredShortName_1_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_3_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_4_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:4427:2: ( ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) ) )
            // InternalSysMLOC.g:4428:2: ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) )
            {
            // InternalSysMLOC.g:4428:2: ( (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? ) | ( (lv_declaredName_4_0= ruleName ) ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==44) ) {
                alt117=1;
            }
            else if ( ((LA117_0>=RULE_ID && LA117_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalSysMLOC.g:4429:3: (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? )
                    {
                    // InternalSysMLOC.g:4429:3: (otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )? )
                    // InternalSysMLOC.g:4430:4: otherlv_0= '<' ( (lv_declaredShortName_1_0= ruleName ) ) otherlv_2= '>' ( (lv_declaredName_3_0= ruleName ) )?
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getIdentificationAccess().getLessThanSignKeyword_0_0());
                      			
                    }
                    // InternalSysMLOC.g:4434:4: ( (lv_declaredShortName_1_0= ruleName ) )
                    // InternalSysMLOC.g:4435:5: (lv_declaredShortName_1_0= ruleName )
                    {
                    // InternalSysMLOC.g:4435:5: (lv_declaredShortName_1_0= ruleName )
                    // InternalSysMLOC.g:4436:6: lv_declaredShortName_1_0= ruleName
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

                    otherlv_2=(Token)match(input,45,FOLLOW_82); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getIdentificationAccess().getGreaterThanSignKeyword_0_2());
                      			
                    }
                    // InternalSysMLOC.g:4457:4: ( (lv_declaredName_3_0= ruleName ) )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( ((LA116_0>=RULE_ID && LA116_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalSysMLOC.g:4458:5: (lv_declaredName_3_0= ruleName )
                            {
                            // InternalSysMLOC.g:4458:5: (lv_declaredName_3_0= ruleName )
                            // InternalSysMLOC.g:4459:6: lv_declaredName_3_0= ruleName
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
                    // InternalSysMLOC.g:4478:3: ( (lv_declaredName_4_0= ruleName ) )
                    {
                    // InternalSysMLOC.g:4478:3: ( (lv_declaredName_4_0= ruleName ) )
                    // InternalSysMLOC.g:4479:4: (lv_declaredName_4_0= ruleName )
                    {
                    // InternalSysMLOC.g:4479:4: (lv_declaredName_4_0= ruleName )
                    // InternalSysMLOC.g:4480:5: lv_declaredName_4_0= ruleName
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
    // InternalSysMLOC.g:4502:1: ruleMultiplicityPart[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) ) ;
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
            // InternalSysMLOC.g:4508:2: ( ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) ) )
            // InternalSysMLOC.g:4509:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) )
            {
            // InternalSysMLOC.g:4509:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) )
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // InternalSysMLOC.g:4510:3: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalSysMLOC.g:4510:3: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) )
                    int alt118=2;
                    alt118 = dfa118.predict(input);
                    switch (alt118) {
                        case 1 :
                            // InternalSysMLOC.g:4511:4: (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' )
                            {
                            // InternalSysMLOC.g:4511:4: (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' )
                            // InternalSysMLOC.g:4512:5: otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']'
                            {
                            otherlv_0=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_0_0());
                              				
                            }
                            // InternalSysMLOC.g:4516:5: ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4517:6: (lv_Multiplicity_1_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4517:6: (lv_Multiplicity_1_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4518:7: lv_Multiplicity_1_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_64);
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

                            otherlv_2=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_0_0_2());
                              				
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4541:4: (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' )
                            {
                            // InternalSysMLOC.g:4541:4: (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' )
                            // InternalSysMLOC.g:4542:5: otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']'
                            {
                            otherlv_3=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_1_0());
                              				
                            }
                            // InternalSysMLOC.g:4546:5: ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4547:6: (lv_Multiplicity_4_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4547:6: (lv_Multiplicity_4_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4548:7: lv_Multiplicity_4_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_63);
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

                            otherlv_5=(Token)match(input,48,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_0_1_2());
                              				
                            }
                            // InternalSysMLOC.g:4569:5: ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4570:6: (lv_Multiplicity_6_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4570:6: (lv_Multiplicity_6_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4571:7: lv_Multiplicity_6_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_0_1_3_0());
                              						
                            }
                            pushFollow(FOLLOW_64);
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

                            otherlv_7=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
                    // InternalSysMLOC.g:4595:3: ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) )
                    {
                    // InternalSysMLOC.g:4595:3: ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) )
                    // InternalSysMLOC.g:4596:4: ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) )
                    {
                    // InternalSysMLOC.g:4596:4: ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )?
                    int alt119=3;
                    alt119 = dfa119.predict(input);
                    switch (alt119) {
                        case 1 :
                            // InternalSysMLOC.g:4597:5: (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' )
                            {
                            // InternalSysMLOC.g:4597:5: (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' )
                            // InternalSysMLOC.g:4598:6: otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']'
                            {
                            otherlv_8=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_0_0());
                              					
                            }
                            // InternalSysMLOC.g:4602:6: ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4603:7: (lv_Multiplicity_9_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4603:7: (lv_Multiplicity_9_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4604:8: lv_Multiplicity_9_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_1_0_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_64);
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

                            otherlv_10=(Token)match(input,49,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4627:5: (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' )
                            {
                            // InternalSysMLOC.g:4627:5: (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' )
                            // InternalSysMLOC.g:4628:6: otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']'
                            {
                            otherlv_11=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_11, grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_1_0());
                              					
                            }
                            // InternalSysMLOC.g:4632:6: ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4633:7: (lv_Multiplicity_12_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4633:7: (lv_Multiplicity_12_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4634:8: lv_Multiplicity_12_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_1_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_63);
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

                            otherlv_13=(Token)match(input,48,FOLLOW_62); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_13, grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_1_0_1_2());
                              					
                            }
                            // InternalSysMLOC.g:4655:6: ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) )
                            // InternalSysMLOC.g:4656:7: (lv_Multiplicity_14_0= ruleMultiplicityExpression )
                            {
                            // InternalSysMLOC.g:4656:7: (lv_Multiplicity_14_0= ruleMultiplicityExpression )
                            // InternalSysMLOC.g:4657:8: lv_Multiplicity_14_0= ruleMultiplicityExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMultiplicityPartAccess().getMultiplicityMultiplicityExpressionParserRuleCall_1_0_1_3_0());
                              							
                            }
                            pushFollow(FOLLOW_64);
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

                            otherlv_15=(Token)match(input,49,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_1_4());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSysMLOC.g:4680:4: ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) )
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==68) ) {
                        alt122=1;
                    }
                    else if ( (LA122_0==69) ) {
                        alt122=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }
                    switch (alt122) {
                        case 1 :
                            // InternalSysMLOC.g:4681:5: ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? )
                            {
                            // InternalSysMLOC.g:4681:5: ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? )
                            // InternalSysMLOC.g:4682:6: ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )?
                            {
                            // InternalSysMLOC.g:4682:6: ( (lv_isOrdered_16_0= 'ordered' ) )
                            // InternalSysMLOC.g:4683:7: (lv_isOrdered_16_0= 'ordered' )
                            {
                            // InternalSysMLOC.g:4683:7: (lv_isOrdered_16_0= 'ordered' )
                            // InternalSysMLOC.g:4684:8: lv_isOrdered_16_0= 'ordered'
                            {
                            lv_isOrdered_16_0=(Token)match(input,68,FOLLOW_84); if (state.failed) return current;
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

                            // InternalSysMLOC.g:4696:6: ( (lv_isNonunique_17_0= 'nonunique' ) )?
                            int alt120=2;
                            int LA120_0 = input.LA(1);

                            if ( (LA120_0==69) ) {
                                alt120=1;
                            }
                            switch (alt120) {
                                case 1 :
                                    // InternalSysMLOC.g:4697:7: (lv_isNonunique_17_0= 'nonunique' )
                                    {
                                    // InternalSysMLOC.g:4697:7: (lv_isNonunique_17_0= 'nonunique' )
                                    // InternalSysMLOC.g:4698:8: lv_isNonunique_17_0= 'nonunique'
                                    {
                                    lv_isNonunique_17_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
                            // InternalSysMLOC.g:4712:5: ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? )
                            {
                            // InternalSysMLOC.g:4712:5: ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? )
                            // InternalSysMLOC.g:4713:6: ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )?
                            {
                            // InternalSysMLOC.g:4713:6: ( (lv_isNonunique_18_0= 'nonunique' ) )
                            // InternalSysMLOC.g:4714:7: (lv_isNonunique_18_0= 'nonunique' )
                            {
                            // InternalSysMLOC.g:4714:7: (lv_isNonunique_18_0= 'nonunique' )
                            // InternalSysMLOC.g:4715:8: lv_isNonunique_18_0= 'nonunique'
                            {
                            lv_isNonunique_18_0=(Token)match(input,69,FOLLOW_85); if (state.failed) return current;
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

                            // InternalSysMLOC.g:4727:6: ( (lv_isOrdered_19_0= 'ordered' ) )?
                            int alt121=2;
                            int LA121_0 = input.LA(1);

                            if ( (LA121_0==68) ) {
                                alt121=1;
                            }
                            switch (alt121) {
                                case 1 :
                                    // InternalSysMLOC.g:4728:7: (lv_isOrdered_19_0= 'ordered' )
                                    {
                                    // InternalSysMLOC.g:4728:7: (lv_isOrdered_19_0= 'ordered' )
                                    // InternalSysMLOC.g:4729:8: lv_isOrdered_19_0= 'ordered'
                                    {
                                    lv_isOrdered_19_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:4749:1: ruleFeatureSpecialization[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) ;
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
            // InternalSysMLOC.g:4755:2: ( ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) ) )
            // InternalSysMLOC.g:4756:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            {
            // InternalSysMLOC.g:4756:2: ( ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* ) | ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* ) )
            int alt134=5;
            switch ( input.LA(1) ) {
            case 62:
            case 70:
                {
                alt134=1;
                }
                break;
            case 63:
            case 64:
            case 72:
                {
                alt134=2;
                }
                break;
            case 50:
            case 51:
                {
                alt134=3;
                }
                break;
            case 73:
            case 74:
                {
                alt134=4;
                }
                break;
            case 75:
            case 76:
                {
                alt134=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // InternalSysMLOC.g:4757:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4757:3: ( (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4758:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) ) ( (lv_typings_3_0= ruleFeatureChainName ) ) (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4758:4: (otherlv_0= ':' | (otherlv_1= 'defined' otherlv_2= 'by' ) )
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==62) ) {
                        alt124=1;
                    }
                    else if ( (LA124_0==70) ) {
                        alt124=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;
                    }
                    switch (alt124) {
                        case 1 :
                            // InternalSysMLOC.g:4759:5: otherlv_0= ':'
                            {
                            otherlv_0=(Token)match(input,62,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getFeatureSpecializationAccess().getColonKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4764:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            {
                            // InternalSysMLOC.g:4764:5: (otherlv_1= 'defined' otherlv_2= 'by' )
                            // InternalSysMLOC.g:4765:6: otherlv_1= 'defined' otherlv_2= 'by'
                            {
                            otherlv_1=(Token)match(input,70,FOLLOW_86); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getFeatureSpecializationAccess().getDefinedKeyword_0_0_1_0());
                              					
                            }
                            otherlv_2=(Token)match(input,71,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getFeatureSpecializationAccess().getByKeyword_0_0_1_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalSysMLOC.g:4775:4: ( (lv_typings_3_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4776:5: (lv_typings_3_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4776:5: (lv_typings_3_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4777:6: lv_typings_3_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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

                    // InternalSysMLOC.g:4794:4: (otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==24) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4795:5: otherlv_4= ',' ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_0_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4799:5: ( (lv_typings_5_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4800:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4800:6: (lv_typings_5_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4801:7: lv_typings_5_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop125;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:4821:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4821:3: ( (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4822:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' ) ( (lv_subsetting_9_0= ruleFeatureChainName ) ) (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4822:4: (otherlv_6= ':>' | otherlv_7= 'specializes' | otherlv_8= 'subsets' )
                    int alt126=3;
                    switch ( input.LA(1) ) {
                    case 63:
                        {
                        alt126=1;
                        }
                        break;
                    case 64:
                        {
                        alt126=2;
                        }
                        break;
                    case 72:
                        {
                        alt126=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }

                    switch (alt126) {
                        case 1 :
                            // InternalSysMLOC.g:4823:5: otherlv_6= ':>'
                            {
                            otherlv_6=(Token)match(input,63,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4828:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,64,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getFeatureSpecializationAccess().getSpecializesKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalSysMLOC.g:4833:5: otherlv_8= 'subsets'
                            {
                            otherlv_8=(Token)match(input,72,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getFeatureSpecializationAccess().getSubsetsKeyword_1_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4838:4: ( (lv_subsetting_9_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4839:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4839:5: (lv_subsetting_9_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4840:6: lv_subsetting_9_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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

                    // InternalSysMLOC.g:4857:4: (otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==24) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4858:5: otherlv_10= ',' ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4862:5: ( (lv_subsetting_11_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4863:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4863:6: (lv_subsetting_11_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4864:7: lv_subsetting_11_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop127;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:4884:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4884:3: ( (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4885:4: (otherlv_12= '::>' | otherlv_13= 'references' ) ( (lv_references_14_0= ruleFeatureChainName ) ) (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4885:4: (otherlv_12= '::>' | otherlv_13= 'references' )
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==50) ) {
                        alt128=1;
                    }
                    else if ( (LA128_0==51) ) {
                        alt128=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 128, 0, input);

                        throw nvae;
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalSysMLOC.g:4886:5: otherlv_12= '::>'
                            {
                            otherlv_12=(Token)match(input,50,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getFeatureSpecializationAccess().getColonColonGreaterThanSignKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4891:5: otherlv_13= 'references'
                            {
                            otherlv_13=(Token)match(input,51,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getFeatureSpecializationAccess().getReferencesKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4896:4: ( (lv_references_14_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4897:5: (lv_references_14_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4897:5: (lv_references_14_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4898:6: lv_references_14_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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

                    // InternalSysMLOC.g:4915:4: (otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==24) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4916:5: otherlv_15= ',' ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_15=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_15, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4920:5: ( (lv_references_16_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4921:6: (lv_references_16_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4921:6: (lv_references_16_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4922:7: lv_references_16_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop129;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:4942:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:4942:3: ( (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:4943:4: (otherlv_17= '=>' | otherlv_18= 'crosses' ) ( (lv_crosses_19_0= ruleFeatureChainName ) ) (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:4943:4: (otherlv_17= '=>' | otherlv_18= 'crosses' )
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==73) ) {
                        alt130=1;
                    }
                    else if ( (LA130_0==74) ) {
                        alt130=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }
                    switch (alt130) {
                        case 1 :
                            // InternalSysMLOC.g:4944:5: otherlv_17= '=>'
                            {
                            otherlv_17=(Token)match(input,73,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getFeatureSpecializationAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:4949:5: otherlv_18= 'crosses'
                            {
                            otherlv_18=(Token)match(input,74,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getFeatureSpecializationAccess().getCrossesKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:4954:4: ( (lv_crosses_19_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:4955:5: (lv_crosses_19_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:4955:5: (lv_crosses_19_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:4956:6: lv_crosses_19_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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

                    // InternalSysMLOC.g:4973:4: (otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==24) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalSysMLOC.g:4974:5: otherlv_20= ',' ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_20=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_20, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:4978:5: ( (lv_crosses_21_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:4979:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:4979:6: (lv_crosses_21_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:4980:7: lv_crosses_21_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop131;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:5000:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    {
                    // InternalSysMLOC.g:5000:3: ( (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )* )
                    // InternalSysMLOC.g:5001:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' ) ( (lv_redefinitions_24_0= ruleFeatureChainName ) ) (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    {
                    // InternalSysMLOC.g:5001:4: (otherlv_22= ':>>' | otherlv_23= 'redefines' )
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==75) ) {
                        alt132=1;
                    }
                    else if ( (LA132_0==76) ) {
                        alt132=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 0, input);

                        throw nvae;
                    }
                    switch (alt132) {
                        case 1 :
                            // InternalSysMLOC.g:5002:5: otherlv_22= ':>>'
                            {
                            otherlv_22=(Token)match(input,75,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_22, grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalSysMLOC.g:5007:5: otherlv_23= 'redefines'
                            {
                            otherlv_23=(Token)match(input,76,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_23, grammarAccess.getFeatureSpecializationAccess().getRedefinesKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalSysMLOC.g:5012:4: ( (lv_redefinitions_24_0= ruleFeatureChainName ) )
                    // InternalSysMLOC.g:5013:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:5013:5: (lv_redefinitions_24_0= ruleFeatureChainName )
                    // InternalSysMLOC.g:5014:6: lv_redefinitions_24_0= ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_76);
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

                    // InternalSysMLOC.g:5031:4: (otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==24) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalSysMLOC.g:5032:5: otherlv_25= ',' ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    {
                    	    otherlv_25=(Token)match(input,24,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_25, grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:5036:5: ( (lv_redefinitions_26_0= ruleFeatureChainName ) )
                    	    // InternalSysMLOC.g:5037:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    {
                    	    // InternalSysMLOC.g:5037:6: (lv_redefinitions_26_0= ruleFeatureChainName )
                    	    // InternalSysMLOC.g:5038:7: lv_redefinitions_26_0= ruleFeatureChainName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop133;
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


    // $ANTLR start "entryRuleMultiplicityExpression"
    // InternalSysMLOC.g:5061:1: entryRuleMultiplicityExpression returns [String current=null] : iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF ;
    public final String entryRuleMultiplicityExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityExpression = null;


        try {
            // InternalSysMLOC.g:5061:62: (iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF )
            // InternalSysMLOC.g:5062:2: iv_ruleMultiplicityExpression= ruleMultiplicityExpression EOF
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
    // InternalSysMLOC.g:5068:1: ruleMultiplicityExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralExpression_0 = null;

        AntlrDatatypeRuleToken this_FeatureReferenceExpression_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5074:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression ) )
            // InternalSysMLOC.g:5075:2: (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            {
            // InternalSysMLOC.g:5075:2: (this_LiteralExpression_0= ruleLiteralExpression | this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_STRING_VALUE||(LA135_0>=RULE_DECIMAL_VALUE && LA135_0<=RULE_EXP_VALUE)||LA135_0==19||(LA135_0>=77 && LA135_0<=79)) ) {
                alt135=1;
            }
            else if ( ((LA135_0>=RULE_ID && LA135_0<=RULE_UNRESTRICTED_NAME)) ) {
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
                    // InternalSysMLOC.g:5076:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalSysMLOC.g:5087:3: this_FeatureReferenceExpression_1= ruleFeatureReferenceExpression
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
    // InternalSysMLOC.g:5101:1: entryRuleLiteralExpression returns [String current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final String entryRuleLiteralExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralExpression = null;


        try {
            // InternalSysMLOC.g:5101:57: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalSysMLOC.g:5102:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalSysMLOC.g:5108:1: ruleLiteralExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) ;
    public final AntlrDatatypeRuleToken ruleLiteralExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralBoolean_0 = null;

        AntlrDatatypeRuleToken this_LiteralString_1 = null;

        AntlrDatatypeRuleToken this_LiteralInteger_2 = null;

        AntlrDatatypeRuleToken this_LiteralReal_3 = null;

        AntlrDatatypeRuleToken this_LiteralInfinity_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5114:2: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity ) )
            // InternalSysMLOC.g:5115:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            {
            // InternalSysMLOC.g:5115:2: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralString_1= ruleLiteralString | this_LiteralInteger_2= ruleLiteralInteger | this_LiteralReal_3= ruleLiteralReal | this_LiteralInfinity_4= ruleLiteralInfinity )
            int alt136=5;
            switch ( input.LA(1) ) {
            case 77:
            case 78:
                {
                alt136=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt136=2;
                }
                break;
            case RULE_DECIMAL_VALUE:
                {
                int LA136_3 = input.LA(2);

                if ( (LA136_3==EOF||(LA136_3>=48 && LA136_3<=49)) ) {
                    alt136=3;
                }
                else if ( (LA136_3==79) ) {
                    alt136=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 136, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 79:
                {
                alt136=4;
                }
                break;
            case 19:
                {
                alt136=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // InternalSysMLOC.g:5116:3: this_LiteralBoolean_0= ruleLiteralBoolean
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
                    // InternalSysMLOC.g:5127:3: this_LiteralString_1= ruleLiteralString
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
                    // InternalSysMLOC.g:5138:3: this_LiteralInteger_2= ruleLiteralInteger
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
                    // InternalSysMLOC.g:5149:3: this_LiteralReal_3= ruleLiteralReal
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
                    // InternalSysMLOC.g:5160:3: this_LiteralInfinity_4= ruleLiteralInfinity
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
    // InternalSysMLOC.g:5174:1: entryRuleLiteralBoolean returns [String current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final String entryRuleLiteralBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralBoolean = null;


        try {
            // InternalSysMLOC.g:5174:54: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalSysMLOC.g:5175:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
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
    // InternalSysMLOC.g:5181:1: ruleLiteralBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BooleanValue_0= ruleBooleanValue ;
    public final AntlrDatatypeRuleToken ruleLiteralBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BooleanValue_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5187:2: (this_BooleanValue_0= ruleBooleanValue )
            // InternalSysMLOC.g:5188:2: this_BooleanValue_0= ruleBooleanValue
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
    // InternalSysMLOC.g:5201:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // InternalSysMLOC.g:5201:52: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalSysMLOC.g:5202:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalSysMLOC.g:5208:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5214:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSysMLOC.g:5215:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSysMLOC.g:5215:2: (kw= 'true' | kw= 'false' )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==77) ) {
                alt137=1;
            }
            else if ( (LA137_0==78) ) {
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
                    // InternalSysMLOC.g:5216:3: kw= 'true'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5222:3: kw= 'false'
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
    // InternalSysMLOC.g:5231:1: entryRuleLiteralString returns [String current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final String entryRuleLiteralString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralString = null;


        try {
            // InternalSysMLOC.g:5231:53: (iv_ruleLiteralString= ruleLiteralString EOF )
            // InternalSysMLOC.g:5232:2: iv_ruleLiteralString= ruleLiteralString EOF
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
    // InternalSysMLOC.g:5238:1: ruleLiteralString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_VALUE_0= RULE_STRING_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_VALUE_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5244:2: (this_STRING_VALUE_0= RULE_STRING_VALUE )
            // InternalSysMLOC.g:5245:2: this_STRING_VALUE_0= RULE_STRING_VALUE
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
    // InternalSysMLOC.g:5255:1: entryRuleLiteralInteger returns [String current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final String entryRuleLiteralInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInteger = null;


        try {
            // InternalSysMLOC.g:5255:54: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalSysMLOC.g:5256:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
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
    // InternalSysMLOC.g:5262:1: ruleLiteralInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE ;
    public final AntlrDatatypeRuleToken ruleLiteralInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5268:2: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:5269:2: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
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
    // InternalSysMLOC.g:5279:1: entryRuleLiteralReal returns [String current=null] : iv_ruleLiteralReal= ruleLiteralReal EOF ;
    public final String entryRuleLiteralReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralReal = null;


        try {
            // InternalSysMLOC.g:5279:51: (iv_ruleLiteralReal= ruleLiteralReal EOF )
            // InternalSysMLOC.g:5280:2: iv_ruleLiteralReal= ruleLiteralReal EOF
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
    // InternalSysMLOC.g:5286:1: ruleLiteralReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_RealValue_0= ruleRealValue ;
    public final AntlrDatatypeRuleToken ruleLiteralReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_RealValue_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5292:2: (this_RealValue_0= ruleRealValue )
            // InternalSysMLOC.g:5293:2: this_RealValue_0= ruleRealValue
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
    // InternalSysMLOC.g:5306:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalSysMLOC.g:5306:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalSysMLOC.g:5307:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalSysMLOC.g:5313:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_VALUE_0=null;
        Token kw=null;
        Token this_DECIMAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5319:2: ( ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalSysMLOC.g:5320:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalSysMLOC.g:5320:2: ( ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==RULE_DECIMAL_VALUE||LA140_0==79) ) {
                alt140=1;
            }
            else if ( (LA140_0==RULE_EXP_VALUE) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // InternalSysMLOC.g:5321:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalSysMLOC.g:5321:3: ( (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalSysMLOC.g:5322:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )? kw= '.' (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalSysMLOC.g:5322:4: (this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==RULE_DECIMAL_VALUE) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // InternalSysMLOC.g:5323:5: this_DECIMAL_VALUE_0= RULE_DECIMAL_VALUE
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
                    // InternalSysMLOC.g:5336:4: (this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==RULE_DECIMAL_VALUE) ) {
                        alt139=1;
                    }
                    else if ( (LA139_0==RULE_EXP_VALUE) ) {
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
                            // InternalSysMLOC.g:5337:5: this_DECIMAL_VALUE_2= RULE_DECIMAL_VALUE
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
                            // InternalSysMLOC.g:5345:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalSysMLOC.g:5355:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalSysMLOC.g:5366:1: entryRuleLiteralInfinity returns [String current=null] : iv_ruleLiteralInfinity= ruleLiteralInfinity EOF ;
    public final String entryRuleLiteralInfinity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralInfinity = null;


        try {
            // InternalSysMLOC.g:5366:55: (iv_ruleLiteralInfinity= ruleLiteralInfinity EOF )
            // InternalSysMLOC.g:5367:2: iv_ruleLiteralInfinity= ruleLiteralInfinity EOF
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
    // InternalSysMLOC.g:5373:1: ruleLiteralInfinity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleLiteralInfinity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5379:2: (kw= '*' )
            // InternalSysMLOC.g:5380:2: kw= '*'
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
    // InternalSysMLOC.g:5388:1: entryRuleFeatureReferenceExpression returns [String current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final String entryRuleFeatureReferenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalSysMLOC.g:5388:66: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalSysMLOC.g:5389:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
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
    // InternalSysMLOC.g:5395:1: ruleFeatureReferenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleFeatureReferenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5401:2: (this_QualifiedName_0= ruleQualifiedName )
            // InternalSysMLOC.g:5402:2: this_QualifiedName_0= ruleQualifiedName
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
    // InternalSysMLOC.g:5415:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysMLOC.g:5415:44: (iv_ruleName= ruleName EOF )
            // InternalSysMLOC.g:5416:2: iv_ruleName= ruleName EOF
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
    // InternalSysMLOC.g:5422:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5428:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalSysMLOC.g:5429:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalSysMLOC.g:5429:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==RULE_ID) ) {
                alt141=1;
            }
            else if ( (LA141_0==RULE_UNRESTRICTED_NAME) ) {
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
                    // InternalSysMLOC.g:5430:3: this_ID_0= RULE_ID
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
                    // InternalSysMLOC.g:5438:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalSysMLOC.g:5449:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysMLOC.g:5449:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysMLOC.g:5450:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSysMLOC.g:5456:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5462:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) )
            // InternalSysMLOC.g:5463:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            {
            // InternalSysMLOC.g:5463:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            // InternalSysMLOC.g:5464:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )*
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
            // InternalSysMLOC.g:5474:3: (kw= '::' this_Name_2= ruleName )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==18) ) {
                    int LA142_2 = input.LA(2);

                    if ( ((LA142_2>=RULE_ID && LA142_2<=RULE_UNRESTRICTED_NAME)) ) {
                        alt142=1;
                    }


                }


                switch (alt142) {
            	case 1 :
            	    // InternalSysMLOC.g:5475:4: kw= '::' this_Name_2= ruleName
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
            	    break loop142;
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
    // InternalSysMLOC.g:5495:1: entryRuleFeatureChainName returns [String current=null] : iv_ruleFeatureChainName= ruleFeatureChainName EOF ;
    public final String entryRuleFeatureChainName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureChainName = null;


        try {
            // InternalSysMLOC.g:5495:56: (iv_ruleFeatureChainName= ruleFeatureChainName EOF )
            // InternalSysMLOC.g:5496:2: iv_ruleFeatureChainName= ruleFeatureChainName EOF
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
    // InternalSysMLOC.g:5502:1: ruleFeatureChainName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFeatureChainName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_Name_3 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5508:2: ( ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* ) )
            // InternalSysMLOC.g:5509:2: ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            {
            // InternalSysMLOC.g:5509:2: ( (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )* )
            // InternalSysMLOC.g:5510:3: (kw= '~' )? this_QualifiedName_1= ruleQualifiedName (kw= '.' this_Name_3= ruleName )*
            {
            // InternalSysMLOC.g:5510:3: (kw= '~' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==80) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalSysMLOC.g:5511:4: kw= '~'
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
            // InternalSysMLOC.g:5527:3: (kw= '.' this_Name_3= ruleName )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==79) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalSysMLOC.g:5528:4: kw= '.' this_Name_3= ruleName
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
    // $ANTLR end "ruleFeatureChainName"


    // $ANTLR start "entryRuleExpressionName"
    // InternalSysMLOC.g:5548:1: entryRuleExpressionName returns [String current=null] : iv_ruleExpressionName= ruleExpressionName EOF ;
    public final String entryRuleExpressionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionName = null;


        try {
            // InternalSysMLOC.g:5548:54: (iv_ruleExpressionName= ruleExpressionName EOF )
            // InternalSysMLOC.g:5549:2: iv_ruleExpressionName= ruleExpressionName EOF
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
    // InternalSysMLOC.g:5555:1: ruleExpressionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue ) ;
    public final AntlrDatatypeRuleToken ruleExpressionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FeatureChainName_0 = null;

        AntlrDatatypeRuleToken this_RealValue_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5561:2: ( (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue ) )
            // InternalSysMLOC.g:5562:2: (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue )
            {
            // InternalSysMLOC.g:5562:2: (this_FeatureChainName_0= ruleFeatureChainName | this_RealValue_1= ruleRealValue )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=RULE_ID && LA145_0<=RULE_UNRESTRICTED_NAME)||LA145_0==80) ) {
                alt145=1;
            }
            else if ( ((LA145_0>=RULE_DECIMAL_VALUE && LA145_0<=RULE_EXP_VALUE)||LA145_0==79) ) {
                alt145=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // InternalSysMLOC.g:5563:3: this_FeatureChainName_0= ruleFeatureChainName
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
                    // InternalSysMLOC.g:5574:3: this_RealValue_1= ruleRealValue
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
    // InternalSysMLOC.g:5588:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalSysMLOC.g:5588:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalSysMLOC.g:5589:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSysMLOC.g:5595:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) ) ;
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
            // InternalSysMLOC.g:5601:2: ( ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) ) )
            // InternalSysMLOC.g:5602:2: ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) )
            {
            // InternalSysMLOC.g:5602:2: ( ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* ) | (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' ) )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=RULE_DECIMAL_VALUE && LA149_0<=RULE_OPERATOR)||(LA149_0>=79 && LA149_0<=80)) ) {
                alt149=1;
            }
            else if ( (LA149_0==60) ) {
                alt149=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // InternalSysMLOC.g:5603:3: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* )
                    {
                    // InternalSysMLOC.g:5603:3: ( (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )* )
                    // InternalSysMLOC.g:5604:4: (this_OPERATOR_0= RULE_OPERATOR )* this_ExpressionName_1= ruleExpressionName (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )*
                    {
                    // InternalSysMLOC.g:5604:4: (this_OPERATOR_0= RULE_OPERATOR )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==RULE_OPERATOR) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // InternalSysMLOC.g:5605:5: this_OPERATOR_0= RULE_OPERATOR
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
                    	    break loop146;
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
                    // InternalSysMLOC.g:5623:4: (this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )? )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==RULE_OPERATOR) ) {
                            alt148=1;
                        }


                        switch (alt148) {
                    	case 1 :
                    	    // InternalSysMLOC.g:5624:5: this_OPERATOR_2= RULE_OPERATOR (this_ExpressionName_3= ruleExpressionName )?
                    	    {
                    	    this_OPERATOR_2=(Token)match(input,RULE_OPERATOR,FOLLOW_93); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_OPERATOR_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OPERATOR_2, grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0_2_0());
                    	      				
                    	    }
                    	    // InternalSysMLOC.g:5631:5: (this_ExpressionName_3= ruleExpressionName )?
                    	    int alt147=2;
                    	    alt147 = dfa147.predict(input);
                    	    switch (alt147) {
                    	        case 1 :
                    	            // InternalSysMLOC.g:5632:6: this_ExpressionName_3= ruleExpressionName
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
                    	    break loop148;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:5646:3: (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
                    {
                    // InternalSysMLOC.g:5646:3: (kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')' )
                    // InternalSysMLOC.g:5647:4: kw= '(' this_SequenceExpression_5= ruleSequenceExpression kw= ')'
                    {
                    kw=(Token)match(input,60,FOLLOW_78); if (state.failed) return current;
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
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalSysMLOC.g:5672:1: entryRuleSequenceExpression returns [String current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final String entryRuleSequenceExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSequenceExpression = null;


        try {
            // InternalSysMLOC.g:5672:58: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // InternalSysMLOC.g:5673:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
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
    // InternalSysMLOC.g:5679:1: ruleSequenceExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleSequenceExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:5685:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalSysMLOC.g:5686:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalSysMLOC.g:5686:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalSysMLOC.g:5687:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSequenceExpressionAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_76);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSysMLOC.g:5697:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==24) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // InternalSysMLOC.g:5698:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,24,FOLLOW_78); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSequenceExpressionAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSequenceExpressionAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_76);
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
            	    break loop150;
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
    // InternalSysMLOC.g:5718:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5724:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalSysMLOC.g:5725:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalSysMLOC.g:5725:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt151=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt151=1;
                }
                break;
            case 82:
                {
                alt151=2;
                }
                break;
            case 83:
                {
                alt151=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // InternalSysMLOC.g:5726:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSysMLOC.g:5726:3: (enumLiteral_0= 'public' )
                    // InternalSysMLOC.g:5727:4: enumLiteral_0= 'public'
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
                    // InternalSysMLOC.g:5734:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSysMLOC.g:5734:3: (enumLiteral_1= 'private' )
                    // InternalSysMLOC.g:5735:4: enumLiteral_1= 'private'
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
                    // InternalSysMLOC.g:5742:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalSysMLOC.g:5742:3: (enumLiteral_2= 'protected' )
                    // InternalSysMLOC.g:5743:4: enumLiteral_2= 'protected'
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
    // InternalSysMLOC.g:5753:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5759:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalSysMLOC.g:5760:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalSysMLOC.g:5760:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt152=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt152=1;
                }
                break;
            case 85:
                {
                alt152=2;
                }
                break;
            case 86:
                {
                alt152=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalSysMLOC.g:5761:3: (enumLiteral_0= 'in' )
                    {
                    // InternalSysMLOC.g:5761:3: (enumLiteral_0= 'in' )
                    // InternalSysMLOC.g:5762:4: enumLiteral_0= 'in'
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
                    // InternalSysMLOC.g:5769:3: (enumLiteral_1= 'out' )
                    {
                    // InternalSysMLOC.g:5769:3: (enumLiteral_1= 'out' )
                    // InternalSysMLOC.g:5770:4: enumLiteral_1= 'out'
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
                    // InternalSysMLOC.g:5777:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalSysMLOC.g:5777:3: (enumLiteral_2= 'inout' )
                    // InternalSysMLOC.g:5778:4: enumLiteral_2= 'inout'
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
    // InternalSysMLOC.g:5788:1: rulePortionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) ) ;
    public final Enumerator rulePortionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:5794:2: ( ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) ) )
            // InternalSysMLOC.g:5795:2: ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) )
            {
            // InternalSysMLOC.g:5795:2: ( (enumLiteral_0= 'snapshot' ) | (enumLiteral_1= 'timeslice' ) )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==87) ) {
                alt153=1;
            }
            else if ( (LA153_0==88) ) {
                alt153=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // InternalSysMLOC.g:5796:3: (enumLiteral_0= 'snapshot' )
                    {
                    // InternalSysMLOC.g:5796:3: (enumLiteral_0= 'snapshot' )
                    // InternalSysMLOC.g:5797:4: enumLiteral_0= 'snapshot'
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
                    // InternalSysMLOC.g:5804:3: (enumLiteral_1= 'timeslice' )
                    {
                    // InternalSysMLOC.g:5804:3: (enumLiteral_1= 'timeslice' )
                    // InternalSysMLOC.g:5805:4: enumLiteral_1= 'timeslice'
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
        // InternalSysMLOC.g:4349:5: ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )
        // InternalSysMLOC.g:
        {
        if ( (input.LA(1)>=50 && input.LA(1)<=51)||(input.LA(1)>=62 && input.LA(1)<=64)||input.LA(1)==70||(input.LA(1)>=72 && input.LA(1)<=76) ) {
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
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA147 dfa147 = new DFA147(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\4\2\uffff\16\12\3\uffff\2\12\2\uffff";
    static final String dfa_3s = "\1\130\2\uffff\5\130\2\114\1\130\3\114\2\120\1\114\3\uffff\2\130\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\16\uffff\1\4\1\5\1\7\2\uffff\1\6\1\3";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\2\23\1\uffff\1\2\2\uffff\2\21\2\uffff\1\1\1\21\5\uffff\1\21\1\2\2\uffff\4\2\1\10\1\uffff\1\11\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\3\uffff\1\21\2\uffff\2\21\1\uffff\1\12\1\6\1\7\4\21\2\uffff\11\21\1\uffff\5\21\4\uffff\1\3\1\4\1\5\5\21",
            "",
            "",
            "\2\21\3\uffff\1\21\1\uffff\1\26\3\uffff\1\21\7\uffff\1\10\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\3\uffff\1\21\2\uffff\2\21\1\26\1\12\1\24\1\25\4\21\2\uffff\11\21\1\uffff\5\21\7\uffff\5\21",
            "\2\21\3\uffff\1\21\1\uffff\1\26\3\uffff\1\21\7\uffff\1\10\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\3\uffff\1\21\2\uffff\2\21\1\26\1\12\1\24\1\25\4\21\2\uffff\11\21\1\uffff\5\21\7\uffff\5\21",
            "\2\21\3\uffff\1\21\1\uffff\1\26\3\uffff\1\21\7\uffff\1\10\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\1\22\3\uffff\1\21\2\uffff\2\21\1\26\1\12\1\24\1\25\4\21\2\uffff\11\21\1\uffff\5\21\7\uffff\5\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\1\uffff\1\21\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\4\uffff\1\21\2\uffff\2\21\1\uffff\1\12\3\uffff\3\21\2\uffff\11\21\1\uffff\5\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\1\uffff\1\21\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\4\uffff\1\21\2\uffff\2\21\1\uffff\1\12\3\uffff\3\21\2\uffff\11\21\1\uffff\5\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\20\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\20\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\12\uffff\1\13\1\14\1\21\1\15\1\21\1\17\1\16\3\uffff\1\21\4\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\20\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\20\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\5\uffff\1\21\12\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\10\uffff\2\21\6\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21\3\uffff\1\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\5\uffff\1\21\12\uffff\1\21\2\uffff\2\21\10\uffff\1\21\1\uffff\3\21\3\uffff\3\21\1\uffff\5\21\3\uffff\1\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\10\uffff\1\27\20\uffff\1\21\2\uffff\2\21\12\uffff\11\21\1\uffff\5\21",
            "",
            "",
            "",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\4\uffff\1\21\2\uffff\2\21\1\uffff\1\12\3\uffff\3\21\2\uffff\11\21\1\uffff\5\21\12\uffff\2\21",
            "\2\21\3\uffff\1\21\5\uffff\1\21\7\uffff\1\27\2\uffff\1\13\1\14\1\20\1\15\1\21\1\17\1\16\3\uffff\1\21\4\uffff\1\21\2\uffff\2\21\1\uffff\1\12\3\uffff\3\21\2\uffff\11\21\1\uffff\5\21\12\uffff\2\21",
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
            "\2\21\1\uffff\1\1\2\uffff\2\20\3\uffff\1\20\5\uffff\1\20\1\1\2\uffff\4\1\1\7\1\uffff\1\10\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\3\uffff\1\20\2\uffff\2\20\1\uffff\1\11\1\5\1\6\4\20\2\uffff\11\20\1\uffff\5\20\4\uffff\1\2\1\3\1\4\5\20",
            "",
            "\2\20\3\uffff\1\20\1\uffff\1\25\3\uffff\1\20\7\uffff\1\7\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\3\uffff\1\20\2\uffff\2\20\1\25\1\11\1\23\1\24\4\20\2\uffff\11\20\1\uffff\5\20\7\uffff\5\20",
            "\2\20\3\uffff\1\20\1\uffff\1\25\3\uffff\1\20\7\uffff\1\7\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\3\uffff\1\20\2\uffff\2\20\1\25\1\11\1\23\1\24\4\20\2\uffff\11\20\1\uffff\5\20\7\uffff\5\20",
            "\2\20\3\uffff\1\20\1\uffff\1\25\3\uffff\1\20\7\uffff\1\7\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\1\22\3\uffff\1\20\2\uffff\2\20\1\25\1\11\1\23\1\24\4\20\2\uffff\11\20\1\uffff\5\20\7\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\1\uffff\1\20\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\4\uffff\1\20\2\uffff\2\20\1\uffff\1\11\3\uffff\3\20\2\uffff\11\20\1\uffff\5\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\1\uffff\1\20\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\4\uffff\1\20\2\uffff\2\20\1\uffff\1\11\3\uffff\3\20\2\uffff\11\20\1\uffff\5\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\20\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\20\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\1\12\1\13\1\20\1\14\1\20\1\16\1\15\3\uffff\1\20\4\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\20\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\20\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\5\uffff\1\20\12\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\10\uffff\2\20\6\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20\3\uffff\1\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\5\uffff\1\20\12\uffff\1\20\2\uffff\2\20\10\uffff\1\20\1\uffff\3\20\3\uffff\3\20\1\uffff\5\20\3\uffff\1\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\10\uffff\1\26\20\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "",
            "",
            "",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\4\uffff\1\20\2\uffff\2\20\1\uffff\1\11\3\uffff\3\20\2\uffff\11\20\1\uffff\5\20\12\uffff\2\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\7\uffff\1\26\2\uffff\1\12\1\13\1\17\1\14\1\20\1\16\1\15\3\uffff\1\20\4\uffff\1\20\2\uffff\2\20\1\uffff\1\11\3\uffff\3\20\2\uffff\11\20\1\uffff\5\20\12\uffff\2\20",
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
    static final String dfa_14s = "\1\121\4\21\1\12\2\22\1\12\2\uffff\2\22";
    static final String dfa_15s = "\1\123\3\64\1\21\1\13\3\25\2\uffff\2\25";
    static final String dfa_16s = "\11\uffff\1\2\1\1\2\uffff";
    static final String dfa_17s = "\15\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\3",
            "\1\5\42\uffff\1\4",
            "\1\5\42\uffff\1\4",
            "\1\5\42\uffff\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\10\3\11",
            "\1\10\3\11",
            "\1\13\1\14\7\uffff\3\12",
            "",
            "",
            "\1\10\3\11",
            "\1\10\3\11"
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
            return "489:2: (this_NamespaceImport_0= ruleNamespaceImport | this_MembershipImport_1= ruleMembershipImport )";
        }
    }
    static final String dfa_19s = "\17\uffff";
    static final String dfa_20s = "\6\35\2\uffff\1\40\6\uffff";
    static final String dfa_21s = "\1\123\3\67\2\65\2\uffff\1\46\6\uffff";
    static final String dfa_22s = "\6\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_23s = "\17\uffff}>";
    static final String[] dfa_24s = {
            "\1\6\1\uffff\1\7\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\16\uffff\1\10\1\4\1\5\31\uffff\1\1\1\2\1\3",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\16\uffff\1\10\1\4\1\5",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\16\uffff\1\10\1\4\1\5",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\16\uffff\1\10\1\4\1\5",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\16\uffff\1\10",
            "\1\6\2\uffff\1\11\1\12\1\16\1\13\1\uffff\1\15\1\14\16\uffff\1\10",
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
            return "525:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition | this_ItemDefinition_2= ruleItemDefinition | this_PartDefinition_3= rulePartDefinition | this_ConnectionDefinition_4= ruleConnectionDefinition | this_FlowConnectionDefinition_5= ruleFlowConnectionDefinition | this_InterfaceDefinition_6= ruleInterfaceDefinition | this_PortDefinition_7= rulePortDefinition )";
        }
    }
    static final String dfa_25s = "\4\12\1\uffff\11\12\1\uffff";
    static final String dfa_26s = "\4\130\1\uffff\1\114\10\130\1\uffff";
    static final String dfa_27s = "\4\uffff\1\1\11\uffff\1\2";
    static final String[] dfa_28s = {
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\1\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\1\11\1\12\1\5\1\13\1\14\1\15\2\uffff\11\16\1\uffff\5\16\4\uffff\1\1\1\2\1\3\1\6\1\7\1\10\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\2\uffff\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\7\16\2\uffff\11\16\1\uffff\5\16\7\uffff\5\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\2\uffff\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\7\16\2\uffff\11\16\1\uffff\5\16\7\uffff\5\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\7\uffff\1\4\2\uffff\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\7\16\2\uffff\11\16\1\uffff\5\16\7\uffff\5\16",
            "",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\12\uffff\11\16\1\uffff\5\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\1\11\1\12\1\uffff\1\13\1\14\1\15\2\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\1\11\1\12\1\uffff\1\13\1\14\1\15\2\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\1\11\1\12\1\uffff\1\13\1\14\1\15\2\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\3\uffff\1\13\1\14\1\15\2\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\3\uffff\1\13\1\14\1\15\2\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\4\uffff\1\14\1\15\2\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\5\uffff\1\15\2\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
            "\2\16\3\uffff\1\16\5\uffff\1\16\11\uffff\1\4\7\16\3\uffff\1\16\4\uffff\1\16\2\uffff\2\16\1\uffff\1\16\10\uffff\11\16\1\uffff\5\16\12\uffff\2\16",
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
            return "615:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement | this_OccurrenceUsageElement_1= ruleOccurrenceUsageElement )";
        }
    }
    static final String dfa_29s = "\22\uffff";
    static final String dfa_30s = "\20\12\2\uffff";
    static final String dfa_31s = "\4\130\1\114\11\130\2\114\2\uffff";
    static final String dfa_32s = "\20\uffff\1\1\1\2";
    static final String dfa_33s = "\22\uffff}>";
    static final String[] dfa_34s = {
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\4\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\4\uffff\1\13\1\14\2\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\5\uffff\1\14\2\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\1\uffff\1\15\10\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20\12\uffff\1\16\1\17",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
            "\2\20\3\uffff\1\20\5\uffff\1\20\12\uffff\7\20\3\uffff\1\21\4\uffff\1\20\2\uffff\2\20\12\uffff\11\20\1\uffff\5\20",
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
            return "687:2: (this_StructureUsageElement_0= ruleStructureUsageElement | this_BehaviorUsageElement_1= ruleBehaviorUsageElement )";
        }
    }
    static final String dfa_35s = "\26\uffff";
    static final String dfa_36s = "\20\12\6\uffff";
    static final String dfa_37s = "\4\130\1\114\11\130\2\114\6\uffff";
    static final String dfa_38s = "\20\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_39s = "\26\uffff}>";
    static final String[] dfa_40s = {
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\4\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\1\10\1\11\1\4\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\7\uffff\1\5\1\6\1\7\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\12\uffff\11\22\1\uffff\5\22",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\1\10\1\11\1\uffff\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\3\uffff\1\12\1\13\1\14\2\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\4\uffff\1\13\1\14\2\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\5\uffff\1\14\2\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\1\uffff\1\15\10\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\12\uffff\11\22\1\uffff\5\22\12\uffff\1\16\1\17",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\12\uffff\11\22\1\uffff\5\22",
            "\2\22\3\uffff\1\22\5\uffff\1\22\12\uffff\1\20\1\21\1\22\2\23\1\24\1\25\10\uffff\1\22\2\uffff\2\22\12\uffff\11\22\1\uffff\5\22",
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
            return "723:2: (this_ItemUsage_0= ruleItemUsage | this_PartUsage_1= rulePartUsage | this_PortUsage_2= rulePortUsage | this_ConnectionUsage_3= ruleConnectionUsage | this_InterfaceUsage_4= ruleInterfaceUsage | this_FlowConnectionUsage_5= ruleFlowConnectionUsage )";
        }
    }
    static final String dfa_41s = "\57\uffff";
    static final String dfa_42s = "\1\12\2\17\1\uffff\1\6\1\uffff\2\12\4\60\1\10\2\60\2\22\1\12\2\17\1\6\2\60\3\12\4\61\1\10\2\61\4\22\4\17\1\12\2\61\1\12\2\22";
    static final String dfa_43s = "\1\120\2\117\1\uffff\1\117\1\uffff\2\120\3\61\1\117\1\11\4\61\1\13\3\117\2\61\3\13\3\61\1\117\1\11\6\61\4\117\1\120\2\61\1\13\2\61";
    static final String dfa_44s = "\3\uffff\1\1\1\uffff\1\2\51\uffff";
    static final String dfa_45s = "\57\uffff}>";
    static final String[] dfa_46s = {
            "\1\1\1\2\3\uffff\1\3\5\uffff\1\3\16\uffff\1\3\12\uffff\1\4\2\uffff\2\3\10\uffff\1\5\1\uffff\3\3\3\uffff\3\3\1\uffff\5\3\3\uffff\1\5",
            "\1\3\2\uffff\1\5\2\uffff\1\3\16\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\1\6\1\7\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\5",
            "\1\3\2\uffff\1\5\2\uffff\1\3\16\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\1\6\1\7\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\5",
            "",
            "\1\12\1\uffff\1\13\1\15\1\17\1\20\7\uffff\1\16\71\uffff\1\10\1\11\1\14",
            "",
            "\1\22\1\23\104\uffff\1\21",
            "\1\22\1\23\104\uffff\1\21",
            "\1\24\1\3",
            "\1\24\1\3",
            "\1\24\1\3",
            "\1\24\1\3\35\uffff\1\14",
            "\1\25\1\26",
            "\1\24\1\3",
            "\1\24\1\3",
            "\1\27\35\uffff\1\24\1\3",
            "\1\27\35\uffff\1\24\1\3",
            "\1\22\1\23",
            "\1\3\2\uffff\1\30\2\uffff\1\3\2\uffff\1\3\13\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\2\3\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\31",
            "\1\3\2\uffff\1\30\2\uffff\1\3\2\uffff\1\3\13\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\2\3\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\31",
            "\1\34\1\uffff\1\35\1\37\1\41\1\42\7\uffff\1\40\71\uffff\1\32\1\33\1\36",
            "\1\24\1\3",
            "\1\24\1\3",
            "\1\43\1\44",
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51\35\uffff\1\36",
            "\1\52\1\53",
            "\1\51",
            "\1\51",
            "\1\54\36\uffff\1\51",
            "\1\54\36\uffff\1\51",
            "\1\27\35\uffff\1\24\1\3",
            "\1\27\35\uffff\1\24\1\3",
            "\1\3\2\uffff\1\30\2\uffff\1\3\2\uffff\1\3\13\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\2\3\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\31",
            "\1\3\2\uffff\1\30\2\uffff\1\3\2\uffff\1\3\13\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\2\3\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\31",
            "\1\3\5\uffff\1\3\2\uffff\1\3\13\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\2\3\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\31",
            "\1\3\5\uffff\1\3\2\uffff\1\3\13\uffff\1\3\4\uffff\1\5\5\uffff\1\3\2\uffff\2\3\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\2\uffff\1\31",
            "\2\5\3\uffff\1\3\5\uffff\1\3\16\uffff\1\3\15\uffff\2\3\12\uffff\3\3\3\uffff\3\3\1\uffff\5\3\3\uffff\1\5",
            "\1\51",
            "\1\51",
            "\1\55\1\56",
            "\1\54\36\uffff\1\51",
            "\1\54\36\uffff\1\51"
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "2724:3: ( ( (this_UsageDeclaration_3= ruleUsageDeclaration[$current] )? (otherlv_4= 'connect' this_ConnectorPart_5= ruleConnectorPart[$current] )? ) | this_ConnectorPart_6= ruleConnectorPart[$current] )";
        }
    }
    static final String dfa_47s = "\36\uffff";
    static final String dfa_48s = "\1\12\1\uffff\1\12\1\107\12\12\2\0\2\12\2\0\1\12\2\0\1\12\2\0\1\12\2\0\1\uffff";
    static final String dfa_49s = "\1\120\1\uffff\1\120\1\107\11\120\1\13\2\0\1\120\1\13\2\0\1\13\2\0\1\13\2\0\1\13\2\0\1\uffff";
    static final String dfa_50s = "\1\uffff\1\2\33\uffff\1\1";
    static final String dfa_51s = "\16\uffff\1\1\1\5\2\uffff\1\11\1\2\1\uffff\1\6\1\10\1\uffff\1\0\1\4\1\uffff\1\7\1\3\1\uffff}>";
    static final String[] dfa_52s = {
            "\2\1\3\uffff\1\1\5\uffff\1\1\16\uffff\1\1\2\uffff\2\1\6\uffff\1\1\2\uffff\1\7\1\10\12\uffff\1\2\1\4\1\5\5\1\1\3\1\uffff\1\6\1\11\1\12\1\13\1\14\3\uffff\1\1",
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

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "()+ loopback of 4348:4: ( ( ':' | 'defined' | ':>' | 'specializes' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_24 = input.LA(1);

                         
                        int index111_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA111_14 = input.LA(1);

                         
                        int index111_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA111_19 = input.LA(1);

                         
                        int index111_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA111_28 = input.LA(1);

                         
                        int index111_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_28);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA111_25 = input.LA(1);

                         
                        int index111_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_25);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA111_15 = input.LA(1);

                         
                        int index111_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA111_21 = input.LA(1);

                         
                        int index111_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_21);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA111_27 = input.LA(1);

                         
                        int index111_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_27);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA111_22 = input.LA(1);

                         
                        int index111_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_22);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA111_18 = input.LA(1);

                         
                        int index111_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysMLOC()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index111_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_53s = "\43\uffff";
    static final String dfa_54s = "\1\57\1\6\1\uffff\4\60\1\10\2\60\2\22\1\12\1\6\2\60\1\12\1\uffff\4\61\1\10\2\61\4\22\1\12\2\61\1\12\2\22";
    static final String dfa_55s = "\1\105\1\117\1\uffff\3\61\1\117\1\11\4\61\1\120\1\117\2\61\1\13\1\uffff\3\61\1\117\1\11\6\61\1\120\2\61\1\13\2\61";
    static final String dfa_56s = "\2\uffff\1\2\16\uffff\1\1\21\uffff";
    static final String dfa_57s = "\43\uffff}>";
    static final String[] dfa_58s = {
            "\1\1\24\uffff\2\2",
            "\1\5\1\uffff\1\6\1\10\1\12\1\13\7\uffff\1\11\71\uffff\1\3\1\4\1\7",
            "",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14\35\uffff\1\7",
            "\1\16\1\17",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\20\35\uffff\1\15\1\14",
            "\1\20\35\uffff\1\15\1\14",
            "\2\21\3\uffff\1\21\5\uffff\1\21\16\uffff\1\21\2\uffff\2\21\11\uffff\2\21\12\uffff\6\21\2\2\1\21\1\uffff\5\21\3\uffff\1\21",
            "\1\24\1\uffff\1\25\1\27\1\31\1\32\7\uffff\1\30\71\uffff\1\22\1\23\1\26",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\33\1\34",
            "",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35\35\uffff\1\26",
            "\1\36\1\37",
            "\1\35",
            "\1\35",
            "\1\40\36\uffff\1\35",
            "\1\40\36\uffff\1\35",
            "\1\20\35\uffff\1\15\1\14",
            "\1\20\35\uffff\1\15\1\14",
            "\2\21\3\uffff\1\21\5\uffff\1\21\16\uffff\1\21\2\uffff\2\21\11\uffff\2\21\12\uffff\6\21\2\2\1\21\1\uffff\5\21\3\uffff\1\21",
            "\1\35",
            "\1\35",
            "\1\41\1\42",
            "\1\40\36\uffff\1\35",
            "\1\40\36\uffff\1\35"
    };

    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = dfa_53;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "4509:2: ( ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) ) | ( ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )? ( ( ( (lv_isOrdered_16_0= 'ordered' ) ) ( (lv_isNonunique_17_0= 'nonunique' ) )? ) | ( ( (lv_isNonunique_18_0= 'nonunique' ) ) ( (lv_isOrdered_19_0= 'ordered' ) )? ) ) ) )";
        }
    }
    static final String dfa_59s = "\1\57\1\6\4\60\1\10\2\60\2\22\2\uffff\2\60\1\12\2\22";
    static final String dfa_60s = "\1\57\1\117\3\61\1\117\1\11\4\61\2\uffff\2\61\1\13\2\61";
    static final String dfa_61s = "\13\uffff\1\1\1\2\5\uffff";
    static final String[] dfa_62s = {
            "\1\1",
            "\1\4\1\uffff\1\5\1\7\1\11\1\12\7\uffff\1\10\71\uffff\1\2\1\3\1\6",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\14\1\13\35\uffff\1\6",
            "\1\15\1\16",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\17\35\uffff\1\14\1\13",
            "\1\17\35\uffff\1\14\1\13",
            "",
            "",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\20\1\21",
            "\1\17\35\uffff\1\14\1\13",
            "\1\17\35\uffff\1\14\1\13"
    };
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_33;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "4510:3: ( (otherlv_0= '[' ( (lv_Multiplicity_1_0= ruleMultiplicityExpression ) ) otherlv_2= ']' ) | (otherlv_3= '[' ( (lv_Multiplicity_4_0= ruleMultiplicityExpression ) ) otherlv_5= '..' ( (lv_Multiplicity_6_0= ruleMultiplicityExpression ) ) otherlv_7= ']' ) )";
        }
    }
    static final String dfa_63s = "\23\uffff";
    static final String dfa_64s = "\1\57\1\6\1\uffff\4\60\1\10\2\60\2\22\2\uffff\2\60\1\12\2\22";
    static final String dfa_65s = "\1\105\1\117\1\uffff\3\61\1\117\1\11\4\61\2\uffff\2\61\1\13\2\61";
    static final String dfa_66s = "\2\uffff\1\3\11\uffff\1\1\1\2\5\uffff";
    static final String dfa_67s = "\23\uffff}>";
    static final String[] dfa_68s = {
            "\1\1\24\uffff\2\2",
            "\1\5\1\uffff\1\6\1\10\1\12\1\13\7\uffff\1\11\71\uffff\1\3\1\4\1\7",
            "",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14\35\uffff\1\7",
            "\1\16\1\17",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\20\35\uffff\1\15\1\14",
            "\1\20\35\uffff\1\15\1\14",
            "",
            "",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\21\1\22",
            "\1\20\35\uffff\1\15\1\14",
            "\1\20\35\uffff\1\15\1\14"
    };

    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[][] dfa_68 = unpackEncodedStringArray(dfa_68s);

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = dfa_63;
            this.eof = dfa_63;
            this.min = dfa_64;
            this.max = dfa_65;
            this.accept = dfa_66;
            this.special = dfa_67;
            this.transition = dfa_68;
        }
        public String getDescription() {
            return "4596:4: ( (otherlv_8= '[' ( (lv_Multiplicity_9_0= ruleMultiplicityExpression ) ) otherlv_10= ']' ) | (otherlv_11= '[' ( (lv_Multiplicity_12_0= ruleMultiplicityExpression ) ) otherlv_13= '..' ( (lv_Multiplicity_14_0= ruleMultiplicityExpression ) ) otherlv_15= ']' ) )?";
        }
    }
    static final String dfa_69s = "\14\uffff";
    static final String dfa_70s = "\1\5\1\uffff\2\4\4\uffff\4\4";
    static final String dfa_71s = "\1\10\3\12\2\uffff\6\12";
    static final String dfa_72s = "\1\120\1\13\2\120\2\uffff\2\13\4\120";
    static final String dfa_73s = "\4\uffff\1\1\1\2\6\uffff";
    static final String dfa_74s = "\14\uffff}>";
    static final String[] dfa_75s = {
            "\2\4\1\2\1\3\1\5\2\uffff\1\5\5\uffff\1\5\2\uffff\1\5\13\uffff\1\5\2\uffff\2\5\24\uffff\1\5\21\uffff\1\4\1\1",
            "\1\2\1\3",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\23\uffff\1\4\21\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\23\uffff\1\4\21\uffff\1\7\1\4",
            "",
            "",
            "\1\10\1\11",
            "\1\12\1\13",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\23\uffff\1\4\21\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\2\uffff\1\6\2\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\23\uffff\1\4\21\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\5\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\23\uffff\1\4\21\uffff\1\7\1\4",
            "\3\4\2\uffff\1\4\5\uffff\1\4\2\uffff\1\4\13\uffff\1\4\2\uffff\2\4\1\5\23\uffff\1\4\21\uffff\1\7\1\4"
    };

    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[][] dfa_75 = unpackEncodedStringArray(dfa_75s);

    class DFA147 extends DFA {

        public DFA147(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 147;
            this.eot = dfa_69;
            this.eof = dfa_70;
            this.min = dfa_71;
            this.max = dfa_72;
            this.accept = dfa_73;
            this.special = dfa_74;
            this.transition = dfa_75;
        }
        public String getDescription() {
            return "5631:5: (this_ExpressionName_3= ruleExpressionName )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0FE0086FBE4140B0L,0x00000000007E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0010000000020000L});
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00C0000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xC000000000208C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xC00C800000208C00L,0x0000000000001F7FL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xC00C80009E618C80L,0x0000000000001F7FL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00E0000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0FC0000020000000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00E0000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00C0000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC00C800400208C00L,0x0000000000001F7FL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00E0000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC00C801000208C00L,0x0000000000001F7FL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000208000L,0x000000000000000EL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000208000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000800000000C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00E0002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xD00C801000208C00L,0x0000000000011F71L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00E0004000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xC00C818000208C00L,0x0000000000011F7FL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000818000208C00L,0x000000000001000EL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000818000208C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000810000208C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800000000C00L,0x0000000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000500000000C00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000C00L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000000001E410080L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000080F40L,0x000000000000E000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0020000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x06C0000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x2000000001000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x1000800000001F00L,0x0000000000018000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x1000800000001F00L,0x0000000000018006L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0xC00C800000000C02L,0x0000000000001F71L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0xC00C000000000002L,0x0000000000001F41L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000800000001F00L,0x0000000000018000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000800000001F02L,0x0000000000018000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x2000000000000000L});

}