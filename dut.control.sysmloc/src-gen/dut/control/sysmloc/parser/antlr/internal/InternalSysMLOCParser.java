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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REGULAR_COMMENT", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'package'", "'{'", "'}'", "'doc'", "'import'", "';'", "'part'", "'def'", "'::'"
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


    // $ANTLR start "entryRuleType"
    // InternalSysMLOC.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSysMLOC.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalSysMLOC.g:101:2: iv_ruleType= ruleType EOF
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
    // InternalSysMLOC.g:107:1: ruleType returns [EObject current=null] : (this_Package_0= rulePackage | this_Comment_1= ruleComment | this_Import_2= ruleImport | this_PartUsage_3= rulePartUsage | this_PartDefinition_4= rulePartDefinition ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Comment_1 = null;

        EObject this_Import_2 = null;

        EObject this_PartUsage_3 = null;

        EObject this_PartDefinition_4 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:113:2: ( (this_Package_0= rulePackage | this_Comment_1= ruleComment | this_Import_2= ruleImport | this_PartUsage_3= rulePartUsage | this_PartDefinition_4= rulePartDefinition ) )
            // InternalSysMLOC.g:114:2: (this_Package_0= rulePackage | this_Comment_1= ruleComment | this_Import_2= ruleImport | this_PartUsage_3= rulePartUsage | this_PartDefinition_4= rulePartDefinition )
            {
            // InternalSysMLOC.g:114:2: (this_Package_0= rulePackage | this_Comment_1= ruleComment | this_Import_2= ruleImport | this_PartUsage_3= rulePartUsage | this_PartDefinition_4= rulePartDefinition )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==20) ) {
                    alt2=5;
                }
                else if ( ((LA2_4>=RULE_ID && LA2_4<=RULE_UNRESTRICTED_NAME)) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSysMLOC.g:115:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:124:3: this_Comment_1= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_1=ruleComment();

                    state._fsp--;


                    			current = this_Comment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:133:3: this_Import_2= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getImportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_2=ruleImport();

                    state._fsp--;


                    			current = this_Import_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:142:3: this_PartUsage_3= rulePartUsage
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPartUsageParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartUsage_3=rulePartUsage();

                    state._fsp--;


                    			current = this_PartUsage_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:151:3: this_PartDefinition_4= rulePartDefinition
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPartDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartDefinition_4=rulePartDefinition();

                    state._fsp--;


                    			current = this_PartDefinition_4;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePackage"
    // InternalSysMLOC.g:163:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSysMLOC.g:163:48: (iv_rulePackage= rulePackage EOF )
            // InternalSysMLOC.g:164:2: iv_rulePackage= rulePackage EOF
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
    // InternalSysMLOC.g:170:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleType ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:176:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleType ) )* otherlv_4= '}' ) )
            // InternalSysMLOC.g:177:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleType ) )* otherlv_4= '}' )
            {
            // InternalSysMLOC.g:177:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleType ) )* otherlv_4= '}' )
            // InternalSysMLOC.g:178:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleType ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalSysMLOC.g:182:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:183:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:183:4: (lv_name_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:184:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"dut.control.sysmloc.SysMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSysMLOC.g:205:3: ( (lv_elements_3_0= ruleType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_UNRESTRICTED_NAME)||LA3_0==13||LA3_0==16||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSysMLOC.g:206:4: (lv_elements_3_0= ruleType )
            	    {
            	    // InternalSysMLOC.g:206:4: (lv_elements_3_0= ruleType )
            	    // InternalSysMLOC.g:207:5: lv_elements_3_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"dut.control.sysmloc.SysMLOC.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleComment"
    // InternalSysMLOC.g:232:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalSysMLOC.g:232:48: (iv_ruleComment= ruleComment EOF )
            // InternalSysMLOC.g:233:2: iv_ruleComment= ruleComment EOF
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
    // InternalSysMLOC.g:239:1: ruleComment returns [EObject current=null] : (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:245:2: ( (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) ) )
            // InternalSysMLOC.g:246:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            {
            // InternalSysMLOC.g:246:2: (otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) ) )
            // InternalSysMLOC.g:247:3: otherlv_0= 'doc' ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getDocKeyword_0());
            		
            // InternalSysMLOC.g:251:3: ( (lv_body_1_0= RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:252:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:252:4: (lv_body_1_0= RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:253:5: lv_body_1_0= RULE_REGULAR_COMMENT
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


    // $ANTLR start "entryRuleImport"
    // InternalSysMLOC.g:273:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSysMLOC.g:273:47: (iv_ruleImport= ruleImport EOF )
            // InternalSysMLOC.g:274:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSysMLOC.g:280:1: ruleImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:286:2: ( ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSysMLOC.g:287:2: ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSysMLOC.g:287:2: ( ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSysMLOC.g:288:3: ( (lv_visibility_0_0= ruleQualifiedName ) ) otherlv_1= 'import' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';'
            {
            // InternalSysMLOC.g:288:3: ( (lv_visibility_0_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:289:4: (lv_visibility_0_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:289:4: (lv_visibility_0_0= ruleQualifiedName )
            // InternalSysMLOC.g:290:5: lv_visibility_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getVisibilityQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_visibility_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"dut.control.sysmloc.SysMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
            		
            // InternalSysMLOC.g:311:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:312:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:312:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:313:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dut.control.sysmloc.SysMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePartUsage"
    // InternalSysMLOC.g:338:1: entryRulePartUsage returns [EObject current=null] : iv_rulePartUsage= rulePartUsage EOF ;
    public final EObject entryRulePartUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartUsage = null;


        try {
            // InternalSysMLOC.g:338:50: (iv_rulePartUsage= rulePartUsage EOF )
            // InternalSysMLOC.g:339:2: iv_rulePartUsage= rulePartUsage EOF
            {
             newCompositeNode(grammarAccess.getPartUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartUsage=rulePartUsage();

            state._fsp--;

             current =iv_rulePartUsage; 
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
    // $ANTLR end "entryRulePartUsage"


    // $ANTLR start "rulePartUsage"
    // InternalSysMLOC.g:345:1: rulePartUsage returns [EObject current=null] : (otherlv_0= 'part' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject rulePartUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:351:2: ( (otherlv_0= 'part' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // InternalSysMLOC.g:352:2: (otherlv_0= 'part' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // InternalSysMLOC.g:352:2: (otherlv_0= 'part' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // InternalSysMLOC.g:353:3: otherlv_0= 'part' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPartUsageAccess().getPartKeyword_0());
            		
            // InternalSysMLOC.g:357:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:358:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:358:4: (lv_name_1_0= ruleQualifiedName )
            // InternalSysMLOC.g:359:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPartUsageAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartUsageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"dut.control.sysmloc.SysMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPartUsageAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePartUsage"


    // $ANTLR start "entryRulePartDefinition"
    // InternalSysMLOC.g:384:1: entryRulePartDefinition returns [EObject current=null] : iv_rulePartDefinition= rulePartDefinition EOF ;
    public final EObject entryRulePartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartDefinition = null;


        try {
            // InternalSysMLOC.g:384:55: (iv_rulePartDefinition= rulePartDefinition EOF )
            // InternalSysMLOC.g:385:2: iv_rulePartDefinition= rulePartDefinition EOF
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
    // InternalSysMLOC.g:391:1: rulePartDefinition returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'def' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject rulePartDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:397:2: ( (otherlv_0= 'part' otherlv_1= 'def' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' ) )
            // InternalSysMLOC.g:398:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // InternalSysMLOC.g:398:2: (otherlv_0= 'part' otherlv_1= 'def' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )
            // InternalSysMLOC.g:399:3: otherlv_0= 'part' otherlv_1= 'def' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPartDefinitionAccess().getPartKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPartDefinitionAccess().getDefKeyword_1());
            		
            // InternalSysMLOC.g:407:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSysMLOC.g:408:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSysMLOC.g:408:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSysMLOC.g:409:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPartDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"dut.control.sysmloc.SysMLOC.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:434:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalSysMLOC.g:434:44: (iv_ruleName= ruleName EOF )
            // InternalSysMLOC.g:435:2: iv_ruleName= ruleName EOF
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
    // InternalSysMLOC.g:441:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalSysMLOC.g:447:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalSysMLOC.g:448:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalSysMLOC.g:448:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_UNRESTRICTED_NAME) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSysMLOC.g:449:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:457:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalSysMLOC.g:468:1: entryRuleQualification returns [String current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final String entryRuleQualification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualification = null;


        try {
            // InternalSysMLOC.g:468:53: (iv_ruleQualification= ruleQualification EOF )
            // InternalSysMLOC.g:469:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalSysMLOC.g:475:1: ruleQualification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleQualification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:481:2: ( (this_Name_0= ruleName kw= '::' )+ )
            // InternalSysMLOC.g:482:2: (this_Name_0= ruleName kw= '::' )+
            {
            // InternalSysMLOC.g:482:2: (this_Name_0= ruleName kw= '::' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==21) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA5_3 = input.LA(2);

                    if ( (LA5_3==21) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalSysMLOC.g:483:3: this_Name_0= ruleName kw= '::'
            	    {

            	    			newCompositeNode(grammarAccess.getQualificationAccess().getNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_11);
            	    this_Name_0=ruleName();

            	    state._fsp--;


            	    			current.merge(this_Name_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,21,FOLLOW_12); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualificationAccess().getColonColonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalSysMLOC.g:502:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSysMLOC.g:502:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSysMLOC.g:503:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSysMLOC.g:509:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Qualification_0 = null;

        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            // InternalSysMLOC.g:515:2: ( ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName ) )
            // InternalSysMLOC.g:516:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            {
            // InternalSysMLOC.g:516:2: ( (this_Qualification_0= ruleQualification )? this_Name_1= ruleName )
            // InternalSysMLOC.g:517:3: (this_Qualification_0= ruleQualification )? this_Name_1= ruleName
            {
            // InternalSysMLOC.g:517:3: (this_Qualification_0= ruleQualification )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==21) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==RULE_UNRESTRICTED_NAME) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==21) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalSysMLOC.g:518:4: this_Qualification_0= ruleQualification
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000009A060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000062L});

}