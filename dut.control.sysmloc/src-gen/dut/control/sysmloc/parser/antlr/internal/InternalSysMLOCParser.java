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

@SuppressWarnings("all")
public class InternalSysMLOCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REGULAR_COMMENT", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "';'", "'doc'", "'attribute'", "'def'", "'part'", "'::'", "'public'", "'private'", "'protected'"
    };
    public static final int RULE_REGULAR_COMMENT=4;
    public static final int RULE_SL_NOTE=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_DECIMAL_VALUE=7;
    public static final int RULE_UNRESTRICTED_NAME=6;
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

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSysMLOC.g:80:3: (lv_packages_0_0= rulePackage )
            	    {
            	    // InternalSysMLOC.g:80:3: (lv_packages_0_0= rulePackage )
            	    // InternalSysMLOC.g:81:4: lv_packages_0_0= rulePackage
            	    {

            	    				newCompositeNode(grammarAccess.getNamespaceAccess().getPackagesPackageParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_packages_0_0=rulePackage();

            	    state._fsp--;


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


    // $ANTLR start "entryRulePackage"
    // InternalSysMLOC.g:101:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSysMLOC.g:101:48: (iv_rulePackage= rulePackage EOF )
            // InternalSysMLOC.g:102:2: iv_rulePackage= rulePackage EOF
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
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalSysMLOC.g:120:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:121:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:121:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:122:5: lv_declaredName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_declaredName_1_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSysMLOC.g:143:3: ( (lv_elements_3_0= ruleBaseElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||(LA2_0>=18 && LA2_0<=19)||LA2_0==21||(LA2_0>=23 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:144:4: (lv_elements_3_0= ruleBaseElement )
            	    {
            	    // InternalSysMLOC.g:144:4: (lv_elements_3_0= ruleBaseElement )
            	    // InternalSysMLOC.g:145:5: lv_elements_3_0= ruleBaseElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsBaseElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleBaseElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleBaseElement"
    // InternalSysMLOC.g:170:1: entryRuleBaseElement returns [EObject current=null] : iv_ruleBaseElement= ruleBaseElement EOF ;
    public final EObject entryRuleBaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseElement = null;


        try {
            // InternalSysMLOC.g:170:52: (iv_ruleBaseElement= ruleBaseElement EOF )
            // InternalSysMLOC.g:171:2: iv_ruleBaseElement= ruleBaseElement EOF
            {
             newCompositeNode(grammarAccess.getBaseElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseElement=ruleBaseElement();

            state._fsp--;

             current =iv_ruleBaseElement; 
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
            case 13:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==20) ) {
                    alt3=4;
                }
                else if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSysMLOC.g:185:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getBaseElementAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:194:3: this_AnnotatingElement_1= ruleAnnotatingElement
                    {

                    			newCompositeNode(grammarAccess.getBaseElementAccess().getAnnotatingElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotatingElement_1=ruleAnnotatingElement();

                    state._fsp--;


                    			current = this_AnnotatingElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:203:3: this_ImportElement_2= ruleImportElement
                    {

                    			newCompositeNode(grammarAccess.getBaseElementAccess().getImportElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImportElement_2=ruleImportElement();

                    state._fsp--;


                    			current = this_ImportElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:212:3: this_DefinitionElement_3= ruleDefinitionElement
                    {

                    			newCompositeNode(grammarAccess.getBaseElementAccess().getDefinitionElementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinitionElement_3=ruleDefinitionElement();

                    state._fsp--;


                    			current = this_DefinitionElement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:221:3: this_UsageElement_4= ruleUsageElement
                    {

                    			newCompositeNode(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UsageElement_4=ruleUsageElement();

                    state._fsp--;


                    			current = this_UsageElement_4;
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
    // InternalSysMLOC.g:240:1: ruleAnnotatingElement returns [EObject current=null] : this_Comment_0= ruleComment ;
    public final EObject ruleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:246:2: (this_Comment_0= ruleComment )
            // InternalSysMLOC.g:247:2: this_Comment_0= ruleComment
            {

            		newCompositeNode(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Comment_0=ruleComment();

            state._fsp--;


            		current = this_Comment_0;
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
    // InternalSysMLOC.g:265:1: ruleImportElement returns [EObject current=null] : this_NamespaceImport_0= ruleNamespaceImport ;
    public final EObject ruleImportElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceImport_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:271:2: (this_NamespaceImport_0= ruleNamespaceImport )
            // InternalSysMLOC.g:272:2: this_NamespaceImport_0= ruleNamespaceImport
            {

            		newCompositeNode(grammarAccess.getImportElementAccess().getNamespaceImportParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_NamespaceImport_0=ruleNamespaceImport();

            state._fsp--;


            		current = this_NamespaceImport_0;
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
             newCompositeNode(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionElement=ruleDefinitionElement();

            state._fsp--;

             current =iv_ruleDefinitionElement; 
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

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSysMLOC.g:298:3: this_AttributeDefinition_0= ruleAttributeDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeDefinition_0=ruleAttributeDefinition();

                    state._fsp--;


                    			current = this_AttributeDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:307:3: this_PartDefinition_1= rulePartDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartDefinition_1=rulePartDefinition();

                    state._fsp--;


                    			current = this_PartDefinition_1;
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
             newCompositeNode(grammarAccess.getUsageElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsageElement=ruleUsageElement();

            state._fsp--;

             current =iv_ruleUsageElement; 
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
    // $ANTLR end "entryRuleUsageElement"


    // $ANTLR start "ruleUsageElement"
    // InternalSysMLOC.g:326:1: ruleUsageElement returns [EObject current=null] : this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement ;
    public final EObject ruleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_NonOccurrenceUsageElement_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:332:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement )
            // InternalSysMLOC.g:333:2: this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement
            {

            		newCompositeNode(grammarAccess.getUsageElementAccess().getNonOccurrenceUsageElementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_NonOccurrenceUsageElement_0=ruleNonOccurrenceUsageElement();

            state._fsp--;


            		current = this_NonOccurrenceUsageElement_0;
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
    // $ANTLR end "ruleUsageElement"


    // $ANTLR start "entryRuleNonOccurrenceUsageElement"
    // InternalSysMLOC.g:344:1: entryRuleNonOccurrenceUsageElement returns [EObject current=null] : iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF ;
    public final EObject entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:344:66: (iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:345:2: iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF
            {
             newCompositeNode(grammarAccess.getNonOccurrenceUsageElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonOccurrenceUsageElement=ruleNonOccurrenceUsageElement();

            state._fsp--;

             current =iv_ruleNonOccurrenceUsageElement; 
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
    // $ANTLR end "entryRuleNonOccurrenceUsageElement"


    // $ANTLR start "ruleNonOccurrenceUsageElement"
    // InternalSysMLOC.g:351:1: ruleNonOccurrenceUsageElement returns [EObject current=null] : this_AttributeUsage_0= ruleAttributeUsage ;
    public final EObject ruleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:357:2: (this_AttributeUsage_0= ruleAttributeUsage )
            // InternalSysMLOC.g:358:2: this_AttributeUsage_0= ruleAttributeUsage
            {

            		newCompositeNode(grammarAccess.getNonOccurrenceUsageElementAccess().getAttributeUsageParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AttributeUsage_0=ruleAttributeUsage();

            state._fsp--;


            		current = this_AttributeUsage_0;
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
    // $ANTLR end "ruleNonOccurrenceUsageElement"


    // $ANTLR start "entryRuleNamespaceImport"
    // InternalSysMLOC.g:369:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // InternalSysMLOC.g:369:56: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // InternalSysMLOC.g:370:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
            {
             newCompositeNode(grammarAccess.getNamespaceImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespaceImport=ruleNamespaceImport();

            state._fsp--;

             current =iv_ruleNamespaceImport; 
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
    // $ANTLR end "entryRuleNamespaceImport"


    // $ANTLR start "ruleNamespaceImport"
    // InternalSysMLOC.g:376:1: ruleNamespaceImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleNamespaceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_2_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:382:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSysMLOC.g:383:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSysMLOC.g:383:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSysMLOC.g:384:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSysMLOC.g:384:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:385:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:385:4: (lv_visibility_0_0= ruleVisibilityIndicator )
            // InternalSysMLOC.g:386:5: lv_visibility_0_0= ruleVisibilityIndicator
            {

            					newCompositeNode(grammarAccess.getNamespaceImportAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_visibility_0_0=ruleVisibilityIndicator();

            state._fsp--;


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

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNamespaceImportAccess().getImportKeyword_1());
            		
            // InternalSysMLOC.g:407:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:408:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:408:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:409:5: lv_declaredName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getNamespaceImportAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_declaredName_2_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleNamespaceImport"


    // $ANTLR start "entryRuleComment"
    // InternalSysMLOC.g:434:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSysMLOC.g:434:48: (iv_ruleComment= ruleComment EOF )
            // InternalSysMLOC.g:435:2: iv_ruleComment= ruleComment EOF
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
    // InternalSysMLOC.g:441:1: ruleComment returns [EObject current=null] : (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:447:2: ( (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:448:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:448:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:449:3: otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getDocKeyword_0());
            		
            // InternalSysMLOC.g:453:3: ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:454:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:454:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:455:5: lv_body_1_0= RULE_REGULAR_COMMENT
            {
            lv_body_1_0=(Token)match(input,RULE_REGULAR_COMMENT,FOLLOW_2); 

            					newLeafNode(lv_body_1_0, grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_1_0());
            				

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


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalSysMLOC.g:475:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSysMLOC.g:475:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:476:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
             newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;

             current =iv_ruleAttributeDefinition; 
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
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalSysMLOC.g:482:1: ruleAttributeDefinition returns [EObject current=null] : (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
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
            // InternalSysMLOC.g:488:2: ( (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:489:2: (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:489:2: (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:490:3: otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1());
            		
            // InternalSysMLOC.g:498:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:499:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:499:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:500:5: lv_declaredName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_declaredName_2_0=ruleQualifiedName();

            state._fsp--;


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

            // InternalSysMLOC.g:517:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSysMLOC.g:518:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:523:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:523:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:524:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalSysMLOC.g:528:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13||(LA5_0>=18 && LA5_0<=19)||LA5_0==21||(LA5_0>=23 && LA5_0<=25)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSysMLOC.g:529:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:529:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:530:7: lv_elements_5_0= ruleBaseElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_5_0=ruleBaseElement();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2());
                    				

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
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRulePartDefinition"
    // InternalSysMLOC.g:557:1: entryRulePartDefinition returns [EObject current=null] : iv_rulePartDefinition= rulePartDefinition EOF ;
    public final EObject entryRulePartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDefinition = null;


        try {
            // InternalSysMLOC.g:557:55: (iv_rulePartDefinition= rulePartDefinition EOF )
            // InternalSysMLOC.g:558:2: iv_rulePartDefinition= rulePartDefinition EOF
            {
             newCompositeNode(grammarAccess.getPartDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartDefinition=rulePartDefinition();

            state._fsp--;

             current =iv_rulePartDefinition; 
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
    // $ANTLR end "entryRulePartDefinition"


    // $ANTLR start "rulePartDefinition"
    // InternalSysMLOC.g:564:1: rulePartDefinition returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) ) ;
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
            // InternalSysMLOC.g:570:2: ( (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:571:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:571:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:572:3: otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPartDefinitionAccess().getPartKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPartDefinitionAccess().getDefKeyword_1());
            		
            // InternalSysMLOC.g:580:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:581:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:581:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:582:5: lv_declaredName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPartDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_declaredName_2_0=ruleQualifiedName();

            state._fsp--;


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

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3());
            		
            // InternalSysMLOC.g:603:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:604:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:609:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:609:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:610:5: otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalSysMLOC.g:614:5: ( (lv_elements_6_0= ruleBaseElement ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13||(LA7_0>=18 && LA7_0<=19)||LA7_0==21||(LA7_0>=23 && LA7_0<=25)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSysMLOC.g:615:6: (lv_elements_6_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:615:6: (lv_elements_6_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:616:7: lv_elements_6_0= ruleBaseElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getPartDefinitionAccess().getElementsBaseElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_6_0=ruleBaseElement();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_4_1_2());
                    				

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
    // $ANTLR end "rulePartDefinition"


    // $ANTLR start "entryRuleAttributeUsage"
    // InternalSysMLOC.g:643:1: entryRuleAttributeUsage returns [EObject current=null] : iv_ruleAttributeUsage= ruleAttributeUsage EOF ;
    public final EObject entryRuleAttributeUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeUsage = null;


        try {
            // InternalSysMLOC.g:643:55: (iv_ruleAttributeUsage= ruleAttributeUsage EOF )
            // InternalSysMLOC.g:644:2: iv_ruleAttributeUsage= ruleAttributeUsage EOF
            {
             newCompositeNode(grammarAccess.getAttributeUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeUsage=ruleAttributeUsage();

            state._fsp--;

             current =iv_ruleAttributeUsage; 
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
    // $ANTLR end "entryRuleAttributeUsage"


    // $ANTLR start "ruleAttributeUsage"
    // InternalSysMLOC.g:650:1: ruleAttributeUsage returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) ;
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
            // InternalSysMLOC.g:656:2: ( (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:657:2: (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:657:2: (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:658:3: otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0());
            		
            // InternalSysMLOC.g:662:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:663:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:663:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:664:5: lv_declaredName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAttributeUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_declaredName_1_0=ruleQualifiedName();

            state._fsp--;


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

            // InternalSysMLOC.g:681:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSysMLOC.g:682:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:687:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:687:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:688:5: otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalSysMLOC.g:692:5: ( (lv_elements_4_0= ruleBaseElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13||(LA9_0>=18 && LA9_0<=19)||LA9_0==21||(LA9_0>=23 && LA9_0<=25)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSysMLOC.g:693:6: (lv_elements_4_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:693:6: (lv_elements_4_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:694:7: lv_elements_4_0= ruleBaseElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_4_0=ruleBaseElement();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_2_1_2());
                    				

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
    // $ANTLR end "ruleAttributeUsage"


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:721:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysMLOC.g:721:44: (iv_ruleName= ruleName EOF )
            // InternalSysMLOC.g:722:2: iv_ruleName= ruleName EOF
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
    // InternalSysMLOC.g:728:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:734:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalSysMLOC.g:735:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalSysMLOC.g:735:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_UNRESTRICTED_NAME) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSysMLOC.g:736:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:744:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalSysMLOC.g:755:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalSysMLOC.g:755:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalSysMLOC.g:756:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalSysMLOC.g:762:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:768:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalSysMLOC.g:769:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalSysMLOC.g:769:2: (this_Name_0= ruleName kw= '::' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==22) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==22) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalSysMLOC.g:770:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_12);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,22,FOLLOW_13); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

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
    // InternalSysMLOC.g:789:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysMLOC.g:789:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysMLOC.g:790:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSysMLOC.g:796:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:802:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalSysMLOC.g:803:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalSysMLOC.g:803:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalSysMLOC.g:804:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalSysMLOC.g:804:3: (this_Qualification_0= ruleQualification )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==22) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==RULE_UNRESTRICTED_NAME) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==22) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalSysMLOC.g:805:4: this_Qualification_0= ruleQualification
                    {

                    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_4);
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


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalSysMLOC.g:830:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:836:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalSysMLOC.g:837:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalSysMLOC.g:837:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSysMLOC.g:838:3: (enumLiteral_0= 'public' )
                    {
                    // InternalSysMLOC.g:838:3: (enumLiteral_0= 'public' )
                    // InternalSysMLOC.g:839:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:846:3: (enumLiteral_1= 'private' )
                    {
                    // InternalSysMLOC.g:846:3: (enumLiteral_1= 'private' )
                    // InternalSysMLOC.g:847:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:854:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalSysMLOC.g:854:3: (enumLiteral_2= 'protected' )
                    // InternalSysMLOC.g:855:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003ACA000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000062L});

}