package dut.control.sysmloc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REGULAR_COMMENT", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "';'", "'doc'", "'attribute'", "'def'", "'part'", "'::'"
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
    public static final int RULE_STRING_VALUE=9;
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
    // InternalSysMLOC.g:64:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalSysMLOC.g:64:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalSysMLOC.g:65:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalSysMLOC.g:71:1: ruleNamespace returns [EObject current=null] : ( (lv_packages_0_0= rulePackage ) )* ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:77:2: ( ( (lv_packages_0_0= rulePackage ) )* )
            // InternalSysMLOC.g:78:2: ( (lv_packages_0_0= rulePackage ) )*
            {
            // InternalSysMLOC.g:78:2: ( (lv_packages_0_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSysMLOC.g:79:3: (lv_packages_0_0= rulePackage )
            	    {
            	    // InternalSysMLOC.g:79:3: (lv_packages_0_0= rulePackage )
            	    // InternalSysMLOC.g:80:4: lv_packages_0_0= rulePackage
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
    // InternalSysMLOC.g:100:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSysMLOC.g:100:48: (iv_rulePackage= rulePackage EOF )
            // InternalSysMLOC.g:101:2: iv_rulePackage= rulePackage EOF
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
    // InternalSysMLOC.g:107:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_declaredName_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:113:2: ( (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) )
            // InternalSysMLOC.g:114:2: (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' )
            {
            // InternalSysMLOC.g:114:2: (otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' )
            // InternalSysMLOC.g:115:3: otherlv_0= 'package' ( (lv_declaredName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalSysMLOC.g:119:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:120:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:120:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:121:5: lv_declaredName_1_0= ruleQualifiedName
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
            		
            // InternalSysMLOC.g:142:3: ( (lv_elements_3_0= ruleBaseElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_UNRESTRICTED_NAME)||LA2_0==13||(LA2_0>=18 && LA2_0<=19)||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:143:4: (lv_elements_3_0= ruleBaseElement )
            	    {
            	    // InternalSysMLOC.g:143:4: (lv_elements_3_0= ruleBaseElement )
            	    // InternalSysMLOC.g:144:5: lv_elements_3_0= ruleBaseElement
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
    // InternalSysMLOC.g:169:1: entryRuleBaseElement returns [EObject current=null] : iv_ruleBaseElement= ruleBaseElement EOF ;
    public final EObject entryRuleBaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseElement = null;


        try {
            // InternalSysMLOC.g:169:52: (iv_ruleBaseElement= ruleBaseElement EOF )
            // InternalSysMLOC.g:170:2: iv_ruleBaseElement= ruleBaseElement EOF
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
    // InternalSysMLOC.g:176:1: ruleBaseElement returns [EObject current=null] : (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement | this_TBD_5= ruleTBD ) ;
    public final EObject ruleBaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_AnnotatingElement_1 = null;

        EObject this_ImportElement_2 = null;

        EObject this_DefinitionElement_3 = null;

        EObject this_UsageElement_4 = null;

        EObject this_TBD_5 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:182:2: ( (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement | this_TBD_5= ruleTBD ) )
            // InternalSysMLOC.g:183:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement | this_TBD_5= ruleTBD )
            {
            // InternalSysMLOC.g:183:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement | this_TBD_5= ruleTBD )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSysMLOC.g:184:3: this_Package_0= rulePackage
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
                    // InternalSysMLOC.g:193:3: this_AnnotatingElement_1= ruleAnnotatingElement
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
                    // InternalSysMLOC.g:202:3: this_ImportElement_2= ruleImportElement
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
                    // InternalSysMLOC.g:211:3: this_DefinitionElement_3= ruleDefinitionElement
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
                    // InternalSysMLOC.g:220:3: this_UsageElement_4= ruleUsageElement
                    {

                    			newCompositeNode(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UsageElement_4=ruleUsageElement();

                    state._fsp--;


                    			current = this_UsageElement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:229:3: this_TBD_5= ruleTBD
                    {

                    			newCompositeNode(grammarAccess.getBaseElementAccess().getTBDParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TBD_5=ruleTBD();

                    state._fsp--;


                    			current = this_TBD_5;
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
    // InternalSysMLOC.g:241:1: entryRuleAnnotatingElement returns [EObject current=null] : iv_ruleAnnotatingElement= ruleAnnotatingElement EOF ;
    public final EObject entryRuleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatingElement = null;


        try {
            // InternalSysMLOC.g:241:58: (iv_ruleAnnotatingElement= ruleAnnotatingElement EOF )
            // InternalSysMLOC.g:242:2: iv_ruleAnnotatingElement= ruleAnnotatingElement EOF
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
    // InternalSysMLOC.g:248:1: ruleAnnotatingElement returns [EObject current=null] : this_Comment_0= ruleComment ;
    public final EObject ruleAnnotatingElement() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:254:2: (this_Comment_0= ruleComment )
            // InternalSysMLOC.g:255:2: this_Comment_0= ruleComment
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
    // InternalSysMLOC.g:266:1: entryRuleImportElement returns [EObject current=null] : iv_ruleImportElement= ruleImportElement EOF ;
    public final EObject entryRuleImportElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportElement = null;


        try {
            // InternalSysMLOC.g:266:54: (iv_ruleImportElement= ruleImportElement EOF )
            // InternalSysMLOC.g:267:2: iv_ruleImportElement= ruleImportElement EOF
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
    // InternalSysMLOC.g:273:1: ruleImportElement returns [EObject current=null] : this_NamespaceImport_0= ruleNamespaceImport ;
    public final EObject ruleImportElement() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceImport_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:279:2: (this_NamespaceImport_0= ruleNamespaceImport )
            // InternalSysMLOC.g:280:2: this_NamespaceImport_0= ruleNamespaceImport
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
    // InternalSysMLOC.g:291:1: entryRuleDefinitionElement returns [EObject current=null] : iv_ruleDefinitionElement= ruleDefinitionElement EOF ;
    public final EObject entryRuleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionElement = null;


        try {
            // InternalSysMLOC.g:291:58: (iv_ruleDefinitionElement= ruleDefinitionElement EOF )
            // InternalSysMLOC.g:292:2: iv_ruleDefinitionElement= ruleDefinitionElement EOF
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
    // InternalSysMLOC.g:298:1: ruleDefinitionElement returns [EObject current=null] : (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition ) ;
    public final EObject ruleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeDefinition_0 = null;

        EObject this_PartDefinition_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:304:2: ( (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition ) )
            // InternalSysMLOC.g:305:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition )
            {
            // InternalSysMLOC.g:305:2: (this_AttributeDefinition_0= ruleAttributeDefinition | this_PartDefinition_1= rulePartDefinition )
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
                    // InternalSysMLOC.g:306:3: this_AttributeDefinition_0= ruleAttributeDefinition
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
                    // InternalSysMLOC.g:315:3: this_PartDefinition_1= rulePartDefinition
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
    // InternalSysMLOC.g:327:1: entryRuleUsageElement returns [EObject current=null] : iv_ruleUsageElement= ruleUsageElement EOF ;
    public final EObject entryRuleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageElement = null;


        try {
            // InternalSysMLOC.g:327:53: (iv_ruleUsageElement= ruleUsageElement EOF )
            // InternalSysMLOC.g:328:2: iv_ruleUsageElement= ruleUsageElement EOF
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
    // InternalSysMLOC.g:334:1: ruleUsageElement returns [EObject current=null] : this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement ;
    public final EObject ruleUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_NonOccurrenceUsageElement_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:340:2: (this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement )
            // InternalSysMLOC.g:341:2: this_NonOccurrenceUsageElement_0= ruleNonOccurrenceUsageElement
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
    // InternalSysMLOC.g:352:1: entryRuleNonOccurrenceUsageElement returns [EObject current=null] : iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF ;
    public final EObject entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonOccurrenceUsageElement = null;


        try {
            // InternalSysMLOC.g:352:66: (iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:353:2: iv_ruleNonOccurrenceUsageElement= ruleNonOccurrenceUsageElement EOF
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
    // InternalSysMLOC.g:359:1: ruleNonOccurrenceUsageElement returns [EObject current=null] : this_AttributeUsage_0= ruleAttributeUsage ;
    public final EObject ruleNonOccurrenceUsageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeUsage_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:365:2: (this_AttributeUsage_0= ruleAttributeUsage )
            // InternalSysMLOC.g:366:2: this_AttributeUsage_0= ruleAttributeUsage
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
    // InternalSysMLOC.g:377:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // InternalSysMLOC.g:377:56: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // InternalSysMLOC.g:378:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
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
    // InternalSysMLOC.g:384:1: ruleNamespaceImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleNamespaceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_declaredName_2_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:390:2: ( ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSysMLOC.g:391:2: ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSysMLOC.g:391:2: ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSysMLOC.g:392:3: ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSysMLOC.g:392:3: ( (lv_visibility_0_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:393:4: (lv_visibility_0_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:393:4: (lv_visibility_0_0= ruleQualifiedName )
            // InternalSysMLOC.g:394:5: lv_visibility_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getNamespaceImportAccess().getVisibilityQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_visibility_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceImportRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"dut.control.sysmloc.SysMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNamespaceImportAccess().getImportKeyword_1());
            		
            // InternalSysMLOC.g:415:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:416:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:416:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:417:5: lv_declaredName_2_0= ruleQualifiedName
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
    // InternalSysMLOC.g:442:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSysMLOC.g:442:48: (iv_ruleComment= ruleComment EOF )
            // InternalSysMLOC.g:443:2: iv_ruleComment= ruleComment EOF
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
    // InternalSysMLOC.g:449:1: ruleComment returns [EObject current=null] : (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:455:2: ( (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:456:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:456:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:457:3: otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getDocKeyword_0());
            		
            // InternalSysMLOC.g:461:3: ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:462:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:462:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:463:5: lv_body_1_0= RULE_REGULAR_COMMENT
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
    // InternalSysMLOC.g:483:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalSysMLOC.g:483:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:484:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalSysMLOC.g:490:1: ruleAttributeDefinition returns [EObject current=null] : (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) ;
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
            // InternalSysMLOC.g:496:2: ( (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) ) )
            // InternalSysMLOC.g:497:2: (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            {
            // InternalSysMLOC.g:497:2: (otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) ) )
            // InternalSysMLOC.g:498:3: otherlv_0= 'attribute' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1());
            		
            // InternalSysMLOC.g:506:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:507:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:507:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:508:5: lv_declaredName_2_0= ruleQualifiedName
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

            // InternalSysMLOC.g:525:3: (otherlv_3= ';' | (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' ) )
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
                    // InternalSysMLOC.g:526:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:531:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    {
                    // InternalSysMLOC.g:531:4: (otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}' )
                    // InternalSysMLOC.g:532:5: otherlv_4= '{' ( (lv_elements_5_0= ruleBaseElement ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0());
                    				
                    // InternalSysMLOC.g:536:5: ( (lv_elements_5_0= ruleBaseElement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)||LA5_0==13||(LA5_0>=18 && LA5_0<=19)||LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSysMLOC.g:537:6: (lv_elements_5_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:537:6: (lv_elements_5_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:538:7: lv_elements_5_0= ruleBaseElement
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
    // InternalSysMLOC.g:565:1: entryRulePartDefinition returns [EObject current=null] : iv_rulePartDefinition= rulePartDefinition EOF ;
    public final EObject entryRulePartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDefinition = null;


        try {
            // InternalSysMLOC.g:565:55: (iv_rulePartDefinition= rulePartDefinition EOF )
            // InternalSysMLOC.g:566:2: iv_rulePartDefinition= rulePartDefinition EOF
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
    // InternalSysMLOC.g:572:1: rulePartDefinition returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) ) ;
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
            // InternalSysMLOC.g:578:2: ( (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) ) )
            // InternalSysMLOC.g:579:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) )
            {
            // InternalSysMLOC.g:579:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) ) )
            // InternalSysMLOC.g:580:3: otherlv_0= 'part' otherlv_1= 'def' ( (lv_declaredName_2_0= ruleQualifiedName ) ) otherlv_3= ';' (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPartDefinitionAccess().getPartKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPartDefinitionAccess().getDefKeyword_1());
            		
            // InternalSysMLOC.g:588:3: ( (lv_declaredName_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:589:4: (lv_declaredName_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:589:4: (lv_declaredName_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:590:5: lv_declaredName_2_0= ruleQualifiedName
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
            		
            // InternalSysMLOC.g:611:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' ) )
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
                    // InternalSysMLOC.g:612:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:617:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' )
                    {
                    // InternalSysMLOC.g:617:4: (otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}' )
                    // InternalSysMLOC.g:618:5: otherlv_5= '{' ( (lv_elements_6_0= ruleBaseElement ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0());
                    				
                    // InternalSysMLOC.g:622:5: ( (lv_elements_6_0= ruleBaseElement ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_UNRESTRICTED_NAME)||LA7_0==13||(LA7_0>=18 && LA7_0<=19)||LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSysMLOC.g:623:6: (lv_elements_6_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:623:6: (lv_elements_6_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:624:7: lv_elements_6_0= ruleBaseElement
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
    // InternalSysMLOC.g:651:1: entryRuleAttributeUsage returns [EObject current=null] : iv_ruleAttributeUsage= ruleAttributeUsage EOF ;
    public final EObject entryRuleAttributeUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeUsage = null;


        try {
            // InternalSysMLOC.g:651:55: (iv_ruleAttributeUsage= ruleAttributeUsage EOF )
            // InternalSysMLOC.g:652:2: iv_ruleAttributeUsage= ruleAttributeUsage EOF
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
    // InternalSysMLOC.g:658:1: ruleAttributeUsage returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) ;
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
            // InternalSysMLOC.g:664:2: ( (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) ) )
            // InternalSysMLOC.g:665:2: (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            {
            // InternalSysMLOC.g:665:2: (otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) ) )
            // InternalSysMLOC.g:666:3: otherlv_0= 'attribute' ( (lv_declaredName_1_0= ruleQualifiedName ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0());
            		
            // InternalSysMLOC.g:670:3: ( (lv_declaredName_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:671:4: (lv_declaredName_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:671:4: (lv_declaredName_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:672:5: lv_declaredName_1_0= ruleQualifiedName
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

            // InternalSysMLOC.g:689:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' ) )
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
                    // InternalSysMLOC.g:690:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:695:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    {
                    // InternalSysMLOC.g:695:4: (otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}' )
                    // InternalSysMLOC.g:696:5: otherlv_3= '{' ( (lv_elements_4_0= ruleBaseElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalSysMLOC.g:700:5: ( (lv_elements_4_0= ruleBaseElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_UNRESTRICTED_NAME)||LA9_0==13||(LA9_0>=18 && LA9_0<=19)||LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSysMLOC.g:701:6: (lv_elements_4_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:701:6: (lv_elements_4_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:702:7: lv_elements_4_0= ruleBaseElement
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


    // $ANTLR start "entryRuleTBD"
    // InternalSysMLOC.g:729:1: entryRuleTBD returns [EObject current=null] : iv_ruleTBD= ruleTBD EOF ;
    public final EObject entryRuleTBD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTBD = null;


        try {
            // InternalSysMLOC.g:729:44: (iv_ruleTBD= ruleTBD EOF )
            // InternalSysMLOC.g:730:2: iv_ruleTBD= ruleTBD EOF
            {
             newCompositeNode(grammarAccess.getTBDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTBD=ruleTBD();

            state._fsp--;

             current =iv_ruleTBD; 
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
    // $ANTLR end "entryRuleTBD"


    // $ANTLR start "ruleTBD"
    // InternalSysMLOC.g:736:1: ruleTBD returns [EObject current=null] : ( ( (lv_text_0_0= ruleQualifiedName ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) ) ) ;
    public final EObject ruleTBD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_0_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:742:2: ( ( ( (lv_text_0_0= ruleQualifiedName ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) ) ) )
            // InternalSysMLOC.g:743:2: ( ( (lv_text_0_0= ruleQualifiedName ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) ) )
            {
            // InternalSysMLOC.g:743:2: ( ( (lv_text_0_0= ruleQualifiedName ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) ) )
            // InternalSysMLOC.g:744:3: ( (lv_text_0_0= ruleQualifiedName ) ) (otherlv_1= ';' | (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) )
            {
            // InternalSysMLOC.g:744:3: ( (lv_text_0_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:745:4: (lv_text_0_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:745:4: (lv_text_0_0= ruleQualifiedName )
            // InternalSysMLOC.g:746:5: lv_text_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTBDAccess().getTextQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_text_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTBDRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_0_0,
            						"dut.control.sysmloc.SysMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSysMLOC.g:763:3: (otherlv_1= ';' | (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSysMLOC.g:764:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTBDAccess().getSemicolonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:769:4: (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' )
                    {
                    // InternalSysMLOC.g:769:4: (otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}' )
                    // InternalSysMLOC.g:770:5: otherlv_2= '{' ( (lv_elements_3_0= ruleBaseElement ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getTBDAccess().getLeftCurlyBracketKeyword_1_1_0());
                    				
                    // InternalSysMLOC.g:774:5: ( (lv_elements_3_0= ruleBaseElement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)||LA11_0==13||(LA11_0>=18 && LA11_0<=19)||LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSysMLOC.g:775:6: (lv_elements_3_0= ruleBaseElement )
                    	    {
                    	    // InternalSysMLOC.g:775:6: (lv_elements_3_0= ruleBaseElement )
                    	    // InternalSysMLOC.g:776:7: lv_elements_3_0= ruleBaseElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getTBDAccess().getElementsBaseElementParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_3_0=ruleBaseElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTBDRule());
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getTBDAccess().getRightCurlyBracketKeyword_1_1_2());
                    				

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
    // $ANTLR end "ruleTBD"


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:803:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysMLOC.g:803:44: (iv_ruleName= ruleName EOF )
            // InternalSysMLOC.g:804:2: iv_ruleName= ruleName EOF
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
    // InternalSysMLOC.g:810:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:816:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalSysMLOC.g:817:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalSysMLOC.g:817:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_UNRESTRICTED_NAME) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSysMLOC.g:818:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:826:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalSysMLOC.g:837:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalSysMLOC.g:837:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalSysMLOC.g:838:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalSysMLOC.g:844:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:850:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalSysMLOC.g:851:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalSysMLOC.g:851:2: (this_Name_0= ruleName kw= '::' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==22) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==22) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalSysMLOC.g:852:3: this_Name_0= ruleName kw= '::'
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // InternalSysMLOC.g:871:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysMLOC.g:871:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysMLOC.g:872:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSysMLOC.g:878:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:884:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalSysMLOC.g:885:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalSysMLOC.g:885:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalSysMLOC.g:886:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalSysMLOC.g:886:3: (this_Qualification_0= ruleQualification )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==22) ) {
                    alt15=1;
                }
            }
            else if ( (LA15_0==RULE_UNRESTRICTED_NAME) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==22) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalSysMLOC.g:887:4: this_Qualification_0= ruleQualification
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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\5\2\uffff\2\16\1\5\2\uffff\1\5\2\uffff";
    static final String dfa_3s = "\1\25\2\uffff\2\26\1\24\2\uffff\1\6\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\3\uffff\1\4\1\3\1\uffff\1\6\1\5";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\6\uffff\1\1\4\uffff\1\2\1\5\1\uffff\1\6",
            "",
            "",
            "\1\11\1\uffff\1\7\1\11\4\uffff\1\10",
            "\1\11\1\uffff\1\7\1\11\4\uffff\1\10",
            "\2\12\15\uffff\1\6",
            "",
            "",
            "\1\3\1\4",
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
            return "183:2: (this_Package_0= rulePackage | this_AnnotatingElement_1= ruleAnnotatingElement | this_ImportElement_2= ruleImportElement | this_DefinitionElement_3= ruleDefinitionElement | this_UsageElement_4= ruleUsageElement | this_TBD_5= ruleTBD )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000002CA060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000062L});

}