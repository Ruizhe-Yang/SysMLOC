package dut.control.moloc.parser.antlr.internal;

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
import dut.control.moloc.services.MOlocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMOlocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_UNSIGNED_NUMBER", "RULE_TRUE_FALSE", "RULE_NON_DIGIT", "RULE_DIGIT", "RULE_Q_IDENT", "RULE_UNSIGNED_INTEGER", "RULE_S_CHAR", "RULE_S_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_Q_CHAR", "'within'", "';'", "'final'", "'encapsulated'", "'partial'", "'expandable'", "'pure'", "'impure'", "'operator'", "'extends'", "'end'", "'='", "'enumeration'", "'('", "':'", "')'", "'def'", "','", "'+'", "'.'", "'annotation'", "'redeclare'", "'each'", "'['", "']'", "'Unfinished2'", "':='", "'break'", "'public'", "'protected'", "'import'", "'.*'", "'*'", "'{'", "'}'", "'inner'", "'outer'", "'replaceable'", "'if'", "'external'", "'initial'", "'equation'", "'then'", "'elseif'", "'else'", "'for'", "'loop'", "'connect'", "'when'", "'elsewhen'", "'nullElement'", "'or'", "'and'", "'not'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'-'", "'.+'", "'.-'", "'/'", "'^'", "'.^'", "'der'", "'in'", "'function'", "'NULLClassType'", "'class'", "'model'", "'record'", "'block'", "'connector'", "'type'", "'package'", "'NULLDirection'", "'input'", "'output'", "'NULLRelationshipType'", "'flow'", "'stream'", "'NULLParameterType'", "'discrete'", "'parameter'", "'constant'"
    };
    public static final int T__50=50;
    public static final int RULE_UNSIGNED_NUMBER=6;
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
    public static final int RULE_DIGIT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int RULE_S_ESCAPE=13;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_TRUE_FALSE=7;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_S_CHAR=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int RULE_UNSIGNED_INTEGER=11;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_Q_CHAR=17;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_Q_IDENT=10;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int RULE_NON_DIGIT=8;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=16;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMOlocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMOlocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[285+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalMOlocParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMOloc.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private MOlocGrammarAccess grammarAccess;

        public InternalMOlocParser(TokenStream input, MOlocGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Stored_definition";
       	}

       	@Override
       	protected MOlocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStored_definition"
    // InternalMOloc.g:72:1: entryRuleStored_definition returns [EObject current=null] : iv_ruleStored_definition= ruleStored_definition EOF ;
    public final EObject entryRuleStored_definition() throws RecognitionException {
        EObject current = null;
        int entryRuleStored_definition_StartIndex = input.index();
        EObject iv_ruleStored_definition = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // InternalMOloc.g:72:58: (iv_ruleStored_definition= ruleStored_definition EOF )
            // InternalMOloc.g:73:2: iv_ruleStored_definition= ruleStored_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStored_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStored_definition=ruleStored_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStored_definition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleStored_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStored_definition"


    // $ANTLR start "ruleStored_definition"
    // InternalMOloc.g:79:1: ruleStored_definition returns [EObject current=null] : ( ( ( (lv_isWithin_0_0= 'within' ) ) ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass_definition ) )* ) ;
    public final EObject ruleStored_definition() throws RecognitionException {
        EObject current = null;
        int ruleStored_definition_StartIndex = input.index();
        Token lv_isWithin_0_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_within_1_0 = null;

        EObject lv_classes_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // InternalMOloc.g:85:2: ( ( ( ( (lv_isWithin_0_0= 'within' ) ) ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass_definition ) )* ) )
            // InternalMOloc.g:86:2: ( ( ( (lv_isWithin_0_0= 'within' ) ) ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass_definition ) )* )
            {
            // InternalMOloc.g:86:2: ( ( ( (lv_isWithin_0_0= 'within' ) ) ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass_definition ) )* )
            // InternalMOloc.g:87:3: ( ( (lv_isWithin_0_0= 'within' ) ) ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )? ( (lv_classes_3_0= ruleClass_definition ) )*
            {
            // InternalMOloc.g:87:3: ( ( (lv_isWithin_0_0= 'within' ) ) ( (lv_within_1_0= ruleName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMOloc.g:88:4: ( (lv_isWithin_0_0= 'within' ) ) ( (lv_within_1_0= ruleName ) ) otherlv_2= ';'
                    {
                    // InternalMOloc.g:88:4: ( (lv_isWithin_0_0= 'within' ) )
                    // InternalMOloc.g:89:5: (lv_isWithin_0_0= 'within' )
                    {
                    // InternalMOloc.g:89:5: (lv_isWithin_0_0= 'within' )
                    // InternalMOloc.g:90:6: lv_isWithin_0_0= 'within'
                    {
                    lv_isWithin_0_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isWithin_0_0, grammarAccess.getStored_definitionAccess().getIsWithinWithinKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStored_definitionRule());
                      						}
                      						setWithLastConsumed(current, "isWithin", lv_isWithin_0_0 != null, "within");
                      					
                    }

                    }


                    }

                    // InternalMOloc.g:102:4: ( (lv_within_1_0= ruleName ) )
                    // InternalMOloc.g:103:5: (lv_within_1_0= ruleName )
                    {
                    // InternalMOloc.g:103:5: (lv_within_1_0= ruleName )
                    // InternalMOloc.g:104:6: lv_within_1_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStored_definitionAccess().getWithinNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_within_1_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStored_definitionRule());
                      						}
                      						set(
                      							current,
                      							"within",
                      							lv_within_1_0,
                      							"dut.control.moloc.MOloc.Name");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStored_definitionAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:126:3: ( (lv_classes_3_0= ruleClass_definition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=20 && LA2_0<=26)||(LA2_0>=86 && LA2_0<=94)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMOloc.g:127:4: (lv_classes_3_0= ruleClass_definition )
            	    {
            	    // InternalMOloc.g:127:4: (lv_classes_3_0= ruleClass_definition )
            	    // InternalMOloc.g:128:5: lv_classes_3_0= ruleClass_definition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStored_definitionAccess().getClassesClass_definitionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_classes_3_0=ruleClass_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStored_definitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_3_0,
            	      						"dut.control.moloc.MOloc.Class_definition");
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
            if ( state.backtracking>0 ) { memoize(input, 2, ruleStored_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStored_definition"


    // $ANTLR start "entryRuleClass_definition"
    // InternalMOloc.g:149:1: entryRuleClass_definition returns [EObject current=null] : iv_ruleClass_definition= ruleClass_definition EOF ;
    public final EObject entryRuleClass_definition() throws RecognitionException {
        EObject current = null;
        int entryRuleClass_definition_StartIndex = input.index();
        EObject iv_ruleClass_definition = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // InternalMOloc.g:149:57: (iv_ruleClass_definition= ruleClass_definition EOF )
            // InternalMOloc.g:150:2: iv_ruleClass_definition= ruleClass_definition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClass_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass_definition=ruleClass_definition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass_definition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleClass_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleClass_definition"


    // $ANTLR start "ruleClass_definition"
    // InternalMOloc.g:156:1: ruleClass_definition returns [EObject current=null] : ( ( (lv_isfinal_0_0= 'final' ) )? ( (lv_isEncapsulated_1_0= 'encapsulated' ) )? this_class_prefixes_2= ruleclass_prefixes[$current] this_class_specifier_3= ruleclass_specifier[$current] otherlv_4= ';' ) ;
    public final EObject ruleClass_definition() throws RecognitionException {
        EObject current = null;
        int ruleClass_definition_StartIndex = input.index();
        Token lv_isfinal_0_0=null;
        Token lv_isEncapsulated_1_0=null;
        Token otherlv_4=null;
        EObject this_class_prefixes_2 = null;

        EObject this_class_specifier_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // InternalMOloc.g:162:2: ( ( ( (lv_isfinal_0_0= 'final' ) )? ( (lv_isEncapsulated_1_0= 'encapsulated' ) )? this_class_prefixes_2= ruleclass_prefixes[$current] this_class_specifier_3= ruleclass_specifier[$current] otherlv_4= ';' ) )
            // InternalMOloc.g:163:2: ( ( (lv_isfinal_0_0= 'final' ) )? ( (lv_isEncapsulated_1_0= 'encapsulated' ) )? this_class_prefixes_2= ruleclass_prefixes[$current] this_class_specifier_3= ruleclass_specifier[$current] otherlv_4= ';' )
            {
            // InternalMOloc.g:163:2: ( ( (lv_isfinal_0_0= 'final' ) )? ( (lv_isEncapsulated_1_0= 'encapsulated' ) )? this_class_prefixes_2= ruleclass_prefixes[$current] this_class_specifier_3= ruleclass_specifier[$current] otherlv_4= ';' )
            // InternalMOloc.g:164:3: ( (lv_isfinal_0_0= 'final' ) )? ( (lv_isEncapsulated_1_0= 'encapsulated' ) )? this_class_prefixes_2= ruleclass_prefixes[$current] this_class_specifier_3= ruleclass_specifier[$current] otherlv_4= ';'
            {
            // InternalMOloc.g:164:3: ( (lv_isfinal_0_0= 'final' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMOloc.g:165:4: (lv_isfinal_0_0= 'final' )
                    {
                    // InternalMOloc.g:165:4: (lv_isfinal_0_0= 'final' )
                    // InternalMOloc.g:166:5: lv_isfinal_0_0= 'final'
                    {
                    lv_isfinal_0_0=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isfinal_0_0, grammarAccess.getClass_definitionAccess().getIsfinalFinalKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_definitionRule());
                      					}
                      					setWithLastConsumed(current, "isfinal", lv_isfinal_0_0 != null, "final");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:178:3: ( (lv_isEncapsulated_1_0= 'encapsulated' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMOloc.g:179:4: (lv_isEncapsulated_1_0= 'encapsulated' )
                    {
                    // InternalMOloc.g:179:4: (lv_isEncapsulated_1_0= 'encapsulated' )
                    // InternalMOloc.g:180:5: lv_isEncapsulated_1_0= 'encapsulated'
                    {
                    lv_isEncapsulated_1_0=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isEncapsulated_1_0, grammarAccess.getClass_definitionAccess().getIsEncapsulatedEncapsulatedKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_definitionRule());
                      					}
                      					setWithLastConsumed(current, "isEncapsulated", lv_isEncapsulated_1_0 != null, "encapsulated");
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getClass_definitionRule());
              			}
              			newCompositeNode(grammarAccess.getClass_definitionAccess().getClass_prefixesParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_7);
            this_class_prefixes_2=ruleclass_prefixes(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_prefixes_2;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getClass_definitionRule());
              			}
              			newCompositeNode(grammarAccess.getClass_definitionAccess().getClass_specifierParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_class_specifier_3=ruleclass_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_specifier_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getClass_definitionAccess().getSemicolonKeyword_4());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleClass_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClass_definition"


    // $ANTLR start "ruleclass_prefixes"
    // InternalMOloc.g:229:1: ruleclass_prefixes[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isPartial_0_0= 'partial' ) )? ( (lv_isExpandable_1_0= 'expandable' ) )? ( ( (lv_isPure_2_0= 'pure' ) ) | ( (lv_isPure_3_0= 'impure' ) ) )? ( (lv_isOperator_4_0= 'operator' ) )? ( (lv_classType_5_0= ruleClassType ) ) ) ;
    public final EObject ruleclass_prefixes(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_prefixes_StartIndex = input.index();
        Token lv_isPartial_0_0=null;
        Token lv_isExpandable_1_0=null;
        Token lv_isPure_2_0=null;
        Token lv_isPure_3_0=null;
        Token lv_isOperator_4_0=null;
        Enumerator lv_classType_5_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // InternalMOloc.g:235:2: ( ( ( (lv_isPartial_0_0= 'partial' ) )? ( (lv_isExpandable_1_0= 'expandable' ) )? ( ( (lv_isPure_2_0= 'pure' ) ) | ( (lv_isPure_3_0= 'impure' ) ) )? ( (lv_isOperator_4_0= 'operator' ) )? ( (lv_classType_5_0= ruleClassType ) ) ) )
            // InternalMOloc.g:236:2: ( ( (lv_isPartial_0_0= 'partial' ) )? ( (lv_isExpandable_1_0= 'expandable' ) )? ( ( (lv_isPure_2_0= 'pure' ) ) | ( (lv_isPure_3_0= 'impure' ) ) )? ( (lv_isOperator_4_0= 'operator' ) )? ( (lv_classType_5_0= ruleClassType ) ) )
            {
            // InternalMOloc.g:236:2: ( ( (lv_isPartial_0_0= 'partial' ) )? ( (lv_isExpandable_1_0= 'expandable' ) )? ( ( (lv_isPure_2_0= 'pure' ) ) | ( (lv_isPure_3_0= 'impure' ) ) )? ( (lv_isOperator_4_0= 'operator' ) )? ( (lv_classType_5_0= ruleClassType ) ) )
            // InternalMOloc.g:237:3: ( (lv_isPartial_0_0= 'partial' ) )? ( (lv_isExpandable_1_0= 'expandable' ) )? ( ( (lv_isPure_2_0= 'pure' ) ) | ( (lv_isPure_3_0= 'impure' ) ) )? ( (lv_isOperator_4_0= 'operator' ) )? ( (lv_classType_5_0= ruleClassType ) )
            {
            // InternalMOloc.g:237:3: ( (lv_isPartial_0_0= 'partial' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMOloc.g:238:4: (lv_isPartial_0_0= 'partial' )
                    {
                    // InternalMOloc.g:238:4: (lv_isPartial_0_0= 'partial' )
                    // InternalMOloc.g:239:5: lv_isPartial_0_0= 'partial'
                    {
                    lv_isPartial_0_0=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isPartial_0_0, grammarAccess.getClass_prefixesAccess().getIsPartialPartialKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_prefixesRule());
                      					}
                      					setWithLastConsumed(current, "isPartial", lv_isPartial_0_0 != null, "partial");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:251:3: ( (lv_isExpandable_1_0= 'expandable' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMOloc.g:252:4: (lv_isExpandable_1_0= 'expandable' )
                    {
                    // InternalMOloc.g:252:4: (lv_isExpandable_1_0= 'expandable' )
                    // InternalMOloc.g:253:5: lv_isExpandable_1_0= 'expandable'
                    {
                    lv_isExpandable_1_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isExpandable_1_0, grammarAccess.getClass_prefixesAccess().getIsExpandableExpandableKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_prefixesRule());
                      					}
                      					setWithLastConsumed(current, "isExpandable", lv_isExpandable_1_0 != null, "expandable");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:265:3: ( ( (lv_isPure_2_0= 'pure' ) ) | ( (lv_isPure_3_0= 'impure' ) ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalMOloc.g:266:4: ( (lv_isPure_2_0= 'pure' ) )
                    {
                    // InternalMOloc.g:266:4: ( (lv_isPure_2_0= 'pure' ) )
                    // InternalMOloc.g:267:5: (lv_isPure_2_0= 'pure' )
                    {
                    // InternalMOloc.g:267:5: (lv_isPure_2_0= 'pure' )
                    // InternalMOloc.g:268:6: lv_isPure_2_0= 'pure'
                    {
                    lv_isPure_2_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPure_2_0, grammarAccess.getClass_prefixesAccess().getIsPurePureKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClass_prefixesRule());
                      						}
                      						setWithLastConsumed(current, "isPure", lv_isPure_2_0 != null, "pure");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:281:4: ( (lv_isPure_3_0= 'impure' ) )
                    {
                    // InternalMOloc.g:281:4: ( (lv_isPure_3_0= 'impure' ) )
                    // InternalMOloc.g:282:5: (lv_isPure_3_0= 'impure' )
                    {
                    // InternalMOloc.g:282:5: (lv_isPure_3_0= 'impure' )
                    // InternalMOloc.g:283:6: lv_isPure_3_0= 'impure'
                    {
                    lv_isPure_3_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPure_3_0, grammarAccess.getClass_prefixesAccess().getIsPureImpureKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClass_prefixesRule());
                      						}
                      						setWithLastConsumed(current, "isPure", lv_isPure_3_0 != null, "impure");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMOloc.g:296:3: ( (lv_isOperator_4_0= 'operator' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMOloc.g:297:4: (lv_isOperator_4_0= 'operator' )
                    {
                    // InternalMOloc.g:297:4: (lv_isOperator_4_0= 'operator' )
                    // InternalMOloc.g:298:5: lv_isOperator_4_0= 'operator'
                    {
                    lv_isOperator_4_0=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isOperator_4_0, grammarAccess.getClass_prefixesAccess().getIsOperatorOperatorKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_prefixesRule());
                      					}
                      					setWithLastConsumed(current, "isOperator", lv_isOperator_4_0 != null, "operator");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:310:3: ( (lv_classType_5_0= ruleClassType ) )
            // InternalMOloc.g:311:4: (lv_classType_5_0= ruleClassType )
            {
            // InternalMOloc.g:311:4: (lv_classType_5_0= ruleClassType )
            // InternalMOloc.g:312:5: lv_classType_5_0= ruleClassType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClass_prefixesAccess().getClassTypeClassTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_classType_5_0=ruleClassType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClass_prefixesRule());
              					}
              					set(
              						current,
              						"classType",
              						lv_classType_5_0,
              						"dut.control.moloc.MOloc.ClassType");
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
            if ( state.backtracking>0 ) { memoize(input, 5, ruleclass_prefixes_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_prefixes"


    // $ANTLR start "ruleclass_specifier"
    // InternalMOloc.g:334:1: ruleclass_specifier[EObject in_current] returns [EObject current=in_current] : (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] ) ;
    public final EObject ruleclass_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_specifier_StartIndex = input.index();
        EObject this_long_class_specifier_0 = null;

        EObject this_short_class_specifier_1 = null;

        EObject this_der_class_specifier_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // InternalMOloc.g:340:2: ( (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] ) )
            // InternalMOloc.g:341:2: (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] )
            {
            // InternalMOloc.g:341:2: (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_IDENT) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==29) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>=30 && LA9_3<=31)||(LA9_3>=95 && LA9_3<=97)) ) {
                        alt9=2;
                    }
                    else if ( (LA9_3==34) ) {
                        alt9=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA9_2>=RULE_IDENT && LA9_2<=RULE_STRING)||LA9_2==20||(LA9_2>=27 && LA9_2<=28)||LA9_2==31||(LA9_2>=37 && LA9_2<=39)||(LA9_2>=46 && LA9_2<=48)||(LA9_2>=53 && LA9_2<=55)||(LA9_2>=57 && LA9_2<=59)||(LA9_2>=95 && LA9_2<=104)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMOloc.g:342:3: this_long_class_specifier_0= rulelong_class_specifier[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getClass_specifierRule());
                      			}
                      			newCompositeNode(grammarAccess.getClass_specifierAccess().getLong_class_specifierParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_long_class_specifier_0=rulelong_class_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_long_class_specifier_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:357:3: this_short_class_specifier_1= ruleshort_class_specifier[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getClass_specifierRule());
                      			}
                      			newCompositeNode(grammarAccess.getClass_specifierAccess().getShort_class_specifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_short_class_specifier_1=ruleshort_class_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_short_class_specifier_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:372:3: this_der_class_specifier_2= ruleder_class_specifier[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getClass_specifierRule());
                      			}
                      			newCompositeNode(grammarAccess.getClass_specifierAccess().getDer_class_specifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_der_class_specifier_2=ruleder_class_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_der_class_specifier_2;
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleclass_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_specifier"


    // $ANTLR start "rulelong_class_specifier"
    // InternalMOloc.g:391:1: rulelong_class_specifier[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' this_IDENT_6= RULE_IDENT ) ;
    public final EObject rulelong_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulelong_class_specifier_StartIndex = input.index();
        Token lv_isExtends_0_0=null;
        Token otherlv_5=null;
        Token this_IDENT_6=null;
        EObject this_class_name_1 = null;

        EObject this_class_modification_2 = null;

        EObject this_description_string_3 = null;

        EObject this_composition_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // InternalMOloc.g:397:2: ( ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' this_IDENT_6= RULE_IDENT ) )
            // InternalMOloc.g:398:2: ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' this_IDENT_6= RULE_IDENT )
            {
            // InternalMOloc.g:398:2: ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' this_IDENT_6= RULE_IDENT )
            // InternalMOloc.g:399:3: ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' this_IDENT_6= RULE_IDENT
            {
            // InternalMOloc.g:399:3: ( (lv_isExtends_0_0= 'extends' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMOloc.g:400:4: (lv_isExtends_0_0= 'extends' )
                    {
                    // InternalMOloc.g:400:4: (lv_isExtends_0_0= 'extends' )
                    // InternalMOloc.g:401:5: lv_isExtends_0_0= 'extends'
                    {
                    lv_isExtends_0_0=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isExtends_0_0, grammarAccess.getLong_class_specifierAccess().getIsExtendsExtendsKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLong_class_specifierRule());
                      					}
                      					setWithLastConsumed(current, "isExtends", lv_isExtends_0_0 != null, "extends");
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getLong_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getLong_class_specifierAccess().getClass_nameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_8);
            this_class_name_1=ruleclass_name(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_name_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:427:3: (this_class_modification_2= ruleclass_modification[$current] )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMOloc.g:428:4: this_class_modification_2= ruleclass_modification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getLong_class_specifierRule());
                      				}
                      				newCompositeNode(grammarAccess.getLong_class_specifierAccess().getClass_modificationParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_class_modification_2=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getLong_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getLong_class_specifierAccess().getDescription_stringParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_10);
            this_description_string_3=ruledescription_string(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_string_3;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getLong_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getLong_class_specifierAccess().getCompositionParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_11);
            this_composition_4=rulecomposition(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_composition_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLong_class_specifierAccess().getEndKeyword_5());
              		
            }
            this_IDENT_6=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_6, grammarAccess.getLong_class_specifierAccess().getIDENTTerminalRuleCall_6());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 7, rulelong_class_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulelong_class_specifier"


    // $ANTLR start "ruleshort_class_specifier"
    // InternalMOloc.g:484:1: ruleshort_class_specifier[EObject in_current] returns [EObject current=in_current] : (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' ) ) this_description_10= ruledescription[$current] ) ;
    public final EObject ruleshort_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleshort_class_specifier_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_isEnumeration_5_0=null;
        Token otherlv_6=null;
        Token lv_isColon_8_0=null;
        Token otherlv_9=null;
        EObject this_class_name_0 = null;

        Enumerator lv_direction_2_0 = null;

        EObject this_type_specifier_3 = null;

        EObject this_class_modification_4 = null;

        EObject this_enum_list_7 = null;

        EObject this_description_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // InternalMOloc.g:490:2: ( (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' ) ) this_description_10= ruledescription[$current] ) )
            // InternalMOloc.g:491:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' ) ) this_description_10= ruledescription[$current] )
            {
            // InternalMOloc.g:491:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' ) ) this_description_10= ruledescription[$current] )
            // InternalMOloc.g:492:3: this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' ) ) this_description_10= ruledescription[$current]
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getShort_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getShort_class_specifierAccess().getClass_nameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_class_name_0=ruleclass_name(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_name_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShort_class_specifierAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMOloc.g:510:3: ( ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=95 && LA16_0<=97)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=30 && LA16_0<=31)) ) {
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
                    // InternalMOloc.g:511:4: ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? )
                    {
                    // InternalMOloc.g:511:4: ( ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )? )
                    // InternalMOloc.g:512:5: ( (lv_direction_2_0= ruleDirection ) ) this_type_specifier_3= ruletype_specifier[$current] (this_class_modification_4= ruleclass_modification[$current] )?
                    {
                    // InternalMOloc.g:512:5: ( (lv_direction_2_0= ruleDirection ) )
                    // InternalMOloc.g:513:6: (lv_direction_2_0= ruleDirection )
                    {
                    // InternalMOloc.g:513:6: (lv_direction_2_0= ruleDirection )
                    // InternalMOloc.g:514:7: lv_direction_2_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShort_class_specifierAccess().getDirectionDirectionEnumRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_14);
                    lv_direction_2_0=ruleDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShort_class_specifierRule());
                      							}
                      							set(
                      								current,
                      								"direction",
                      								lv_direction_2_0,
                      								"dut.control.moloc.MOloc.Direction");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getShort_class_specifierRule());
                      					}
                      					newCompositeNode(grammarAccess.getShort_class_specifierAccess().getType_specifierParserRuleCall_2_0_1());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    this_type_specifier_3=ruletype_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_type_specifier_3;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMOloc.g:545:5: (this_class_modification_4= ruleclass_modification[$current] )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMOloc.g:546:6: this_class_modification_4= ruleclass_modification[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getShort_class_specifierRule());
                              						}
                              						newCompositeNode(grammarAccess.getShort_class_specifierAccess().getClass_modificationParserRuleCall_2_0_2());
                              					
                            }
                            pushFollow(FOLLOW_15);
                            this_class_modification_4=ruleclass_modification(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_class_modification_4;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:563:4: ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' )
                    {
                    // InternalMOloc.g:563:4: ( ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')' )
                    // InternalMOloc.g:564:5: ( (lv_isEnumeration_5_0= 'enumeration' ) )? otherlv_6= '(' ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) ) otherlv_9= ')'
                    {
                    // InternalMOloc.g:564:5: ( (lv_isEnumeration_5_0= 'enumeration' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMOloc.g:565:6: (lv_isEnumeration_5_0= 'enumeration' )
                            {
                            // InternalMOloc.g:565:6: (lv_isEnumeration_5_0= 'enumeration' )
                            // InternalMOloc.g:566:7: lv_isEnumeration_5_0= 'enumeration'
                            {
                            lv_isEnumeration_5_0=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_isEnumeration_5_0, grammarAccess.getShort_class_specifierAccess().getIsEnumerationEnumerationKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getShort_class_specifierRule());
                              							}
                              							setWithLastConsumed(current, "isEnumeration", lv_isEnumeration_5_0 != null, "enumeration");
                              						
                            }

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getShort_class_specifierAccess().getLeftParenthesisKeyword_2_1_1());
                      				
                    }
                    // InternalMOloc.g:582:5: ( (this_enum_list_7= ruleenum_list[$current] )? | ( (lv_isColon_8_0= ':' ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_IDENT||LA15_0==33) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==32) ) {
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
                            // InternalMOloc.g:583:6: (this_enum_list_7= ruleenum_list[$current] )?
                            {
                            // InternalMOloc.g:583:6: (this_enum_list_7= ruleenum_list[$current] )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==RULE_IDENT) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalMOloc.g:584:7: this_enum_list_7= ruleenum_list[$current]
                                    {
                                    if ( state.backtracking==0 ) {

                                      							/* */
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getShort_class_specifierRule());
                                      							}
                                      							newCompositeNode(grammarAccess.getShort_class_specifierAccess().getEnum_listParserRuleCall_2_1_2_0());
                                      						
                                    }
                                    pushFollow(FOLLOW_18);
                                    this_enum_list_7=ruleenum_list(current);

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current = this_enum_list_7;
                                      							afterParserOrEnumRuleCall();
                                      						
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:600:6: ( (lv_isColon_8_0= ':' ) )
                            {
                            // InternalMOloc.g:600:6: ( (lv_isColon_8_0= ':' ) )
                            // InternalMOloc.g:601:7: (lv_isColon_8_0= ':' )
                            {
                            // InternalMOloc.g:601:7: (lv_isColon_8_0= ':' )
                            // InternalMOloc.g:602:8: lv_isColon_8_0= ':'
                            {
                            lv_isColon_8_0=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isColon_8_0, grammarAccess.getShort_class_specifierAccess().getIsColonColonKeyword_2_1_2_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getShort_class_specifierRule());
                              								}
                              								setWithLastConsumed(current, "isColon", lv_isColon_8_0 != null, ":");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getShort_class_specifierAccess().getRightParenthesisKeyword_2_1_3());
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getShort_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getShort_class_specifierAccess().getDescriptionParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_description_10=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_10;
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleshort_class_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleshort_class_specifier"


    // $ANTLR start "ruleder_class_specifier"
    // InternalMOloc.g:640:1: ruleder_class_specifier[EObject in_current] returns [EObject current=in_current] : (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'def' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] ) ;
    public final EObject ruleder_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleder_class_specifier_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_isDer_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_derName_6_0=null;
        Token otherlv_7=null;
        Token lv_derName_8_0=null;
        Token otherlv_9=null;
        EObject this_class_name_0 = null;

        EObject this_type_specifier_4 = null;

        EObject this_description_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // InternalMOloc.g:646:2: ( (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'def' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] ) )
            // InternalMOloc.g:647:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'def' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] )
            {
            // InternalMOloc.g:647:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'def' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] )
            // InternalMOloc.g:648:3: this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'def' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current]
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDer_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getDer_class_specifierAccess().getClass_nameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_class_name_0=ruleclass_name(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_name_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDer_class_specifierAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMOloc.g:666:3: ( (lv_isDer_2_0= 'def' ) )
            // InternalMOloc.g:667:4: (lv_isDer_2_0= 'def' )
            {
            // InternalMOloc.g:667:4: (lv_isDer_2_0= 'def' )
            // InternalMOloc.g:668:5: lv_isDer_2_0= 'def'
            {
            lv_isDer_2_0=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isDer_2_0, grammarAccess.getDer_class_specifierAccess().getIsDerDefKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDer_class_specifierRule());
              					}
              					setWithLastConsumed(current, "isDer", lv_isDer_2_0 != null, "def");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDer_class_specifierAccess().getLeftParenthesisKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDer_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getDer_class_specifierAccess().getType_specifierParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_20);
            this_type_specifier_4=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDer_class_specifierAccess().getCommaKeyword_5());
              		
            }
            // InternalMOloc.g:702:3: ( (lv_derName_6_0= RULE_IDENT ) )
            // InternalMOloc.g:703:4: (lv_derName_6_0= RULE_IDENT )
            {
            // InternalMOloc.g:703:4: (lv_derName_6_0= RULE_IDENT )
            // InternalMOloc.g:704:5: lv_derName_6_0= RULE_IDENT
            {
            lv_derName_6_0=(Token)match(input,RULE_IDENT,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_derName_6_0, grammarAccess.getDer_class_specifierAccess().getDerNameIDENTTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDer_class_specifierRule());
              					}
              					addWithLastConsumed(
              						current,
              						"derName",
              						lv_derName_6_0,
              						"dut.control.moloc.MOloc.IDENT");
              				
            }

            }


            }

            // InternalMOloc.g:720:3: (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMOloc.g:721:4: otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getDer_class_specifierAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalMOloc.g:725:4: ( (lv_derName_8_0= RULE_IDENT ) )
            	    // InternalMOloc.g:726:5: (lv_derName_8_0= RULE_IDENT )
            	    {
            	    // InternalMOloc.g:726:5: (lv_derName_8_0= RULE_IDENT )
            	    // InternalMOloc.g:727:6: lv_derName_8_0= RULE_IDENT
            	    {
            	    lv_derName_8_0=(Token)match(input,RULE_IDENT,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_derName_8_0, grammarAccess.getDer_class_specifierAccess().getDerNameIDENTTerminalRuleCall_7_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDer_class_specifierRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"derName",
            	      							lv_derName_8_0,
            	      							"dut.control.moloc.MOloc.IDENT");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDer_class_specifierAccess().getRightParenthesisKeyword_8());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDer_class_specifierRule());
              			}
              			newCompositeNode(grammarAccess.getDer_class_specifierAccess().getDescriptionParserRuleCall_9());
              		
            }
            pushFollow(FOLLOW_2);
            this_description_10=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_10;
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
            if ( state.backtracking>0 ) { memoize(input, 9, ruleder_class_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleder_class_specifier"


    // $ANTLR start "ruleclass_name"
    // InternalMOloc.g:767:1: ruleclass_name[EObject in_current] returns [EObject current=in_current] : ( (lv_className_0_0= RULE_IDENT ) ) ;
    public final EObject ruleclass_name(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_name_StartIndex = input.index();
        Token lv_className_0_0=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // InternalMOloc.g:773:2: ( ( (lv_className_0_0= RULE_IDENT ) ) )
            // InternalMOloc.g:774:2: ( (lv_className_0_0= RULE_IDENT ) )
            {
            // InternalMOloc.g:774:2: ( (lv_className_0_0= RULE_IDENT ) )
            // InternalMOloc.g:775:3: (lv_className_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:775:3: (lv_className_0_0= RULE_IDENT )
            // InternalMOloc.g:776:4: lv_className_0_0= RULE_IDENT
            {
            lv_className_0_0=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_className_0_0, grammarAccess.getClass_nameAccess().getClassNameIDENTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getClass_nameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"className",
              					lv_className_0_0,
              					"dut.control.moloc.MOloc.IDENT");
              			
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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleclass_name_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_name"


    // $ANTLR start "ruleclass_modification"
    // InternalMOloc.g:796:1: ruleclass_modification[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleclass_modification(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_modification_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // InternalMOloc.g:802:2: ( (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) )
            // InternalMOloc.g:803:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            {
            // InternalMOloc.g:803:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            // InternalMOloc.g:804:3: otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClass_modificationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMOloc.g:808:3: ( (lv_arguments_1_0= ruleArgument ) )
            // InternalMOloc.g:809:4: (lv_arguments_1_0= ruleArgument )
            {
            // InternalMOloc.g:809:4: (lv_arguments_1_0= ruleArgument )
            // InternalMOloc.g:810:5: lv_arguments_1_0= ruleArgument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClass_modificationAccess().getArgumentsArgumentParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_arguments_1_0=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClass_modificationRule());
              					}
              					add(
              						current,
              						"arguments",
              						lv_arguments_1_0,
              						"dut.control.moloc.MOloc.Argument");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:827:3: (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMOloc.g:828:4: otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getClass_modificationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMOloc.g:832:4: ( (lv_arguments_3_0= ruleArgument ) )
            	    // InternalMOloc.g:833:5: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // InternalMOloc.g:833:5: (lv_arguments_3_0= ruleArgument )
            	    // InternalMOloc.g:834:6: lv_arguments_3_0= ruleArgument
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClass_modificationAccess().getArgumentsArgumentParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_arguments_3_0=ruleArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClass_modificationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"arguments",
            	      							lv_arguments_3_0,
            	      							"dut.control.moloc.MOloc.Argument");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getClass_modificationAccess().getRightParenthesisKeyword_3());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 11, ruleclass_modification_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_modification"


    // $ANTLR start "ruledescription_string"
    // InternalMOloc.g:861:1: ruledescription_string[EObject in_current] returns [EObject current=in_current] : ( (lv_description_0_0= ruleDescriptionString ) )? ;
    public final EObject ruledescription_string(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledescription_string_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_description_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // InternalMOloc.g:867:2: ( ( (lv_description_0_0= ruleDescriptionString ) )? )
            // InternalMOloc.g:868:2: ( (lv_description_0_0= ruleDescriptionString ) )?
            {
            // InternalMOloc.g:868:2: ( (lv_description_0_0= ruleDescriptionString ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMOloc.g:869:3: (lv_description_0_0= ruleDescriptionString )
                    {
                    // InternalMOloc.g:869:3: (lv_description_0_0= ruleDescriptionString )
                    // InternalMOloc.g:870:4: lv_description_0_0= ruleDescriptionString
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDescription_stringAccess().getDescriptionDescriptionStringParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_0_0=ruleDescriptionString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElementForParent(grammarAccess.getDescription_stringRule());
                      				}
                      				set(
                      					current,
                      					"description",
                      					lv_description_0_0,
                      					"dut.control.moloc.MOloc.DescriptionString");
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruledescription_string_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledescription_string"


    // $ANTLR start "entryRuleDescriptionString"
    // InternalMOloc.g:890:1: entryRuleDescriptionString returns [String current=null] : iv_ruleDescriptionString= ruleDescriptionString EOF ;
    public final String entryRuleDescriptionString() throws RecognitionException {
        String current = null;
        int entryRuleDescriptionString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleDescriptionString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // InternalMOloc.g:890:57: (iv_ruleDescriptionString= ruleDescriptionString EOF )
            // InternalMOloc.g:891:2: iv_ruleDescriptionString= ruleDescriptionString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescriptionStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionString=ruleDescriptionString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescriptionString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleDescriptionString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionString"


    // $ANTLR start "ruleDescriptionString"
    // InternalMOloc.g:897:1: ruleDescriptionString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* ) ;
    public final AntlrDatatypeRuleToken ruleDescriptionString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleDescriptionString_StartIndex = input.index();
        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // InternalMOloc.g:903:2: ( (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* ) )
            // InternalMOloc.g:904:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )
            {
            // InternalMOloc.g:904:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )
            // InternalMOloc.g:905:3: this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )*
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRING_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRING_0, grammarAccess.getDescriptionStringAccess().getSTRINGTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:912:3: (kw= '+' this_STRING_2= RULE_STRING )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMOloc.g:913:4: kw= '+' this_STRING_2= RULE_STRING
            	    {
            	    kw=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDescriptionStringAccess().getPlusSignKeyword_1_0());
            	      			
            	    }
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_STRING_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_STRING_2, grammarAccess.getDescriptionStringAccess().getSTRINGTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleDescriptionString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionString"


    // $ANTLR start "rulecomposition"
    // InternalMOloc.g:931:1: rulecomposition[EObject in_current] returns [EObject current=in_current] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject rulecomposition(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomposition_StartIndex = input.index();
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // InternalMOloc.g:937:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalMOloc.g:938:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalMOloc.g:938:2: ( (lv_elements_0_0= ruleElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_IDENT||LA21_0==20||LA21_0==27||(LA21_0>=37 && LA21_0<=39)||(LA21_0>=46 && LA21_0<=48)||(LA21_0>=53 && LA21_0<=55)||(LA21_0>=57 && LA21_0<=59)||(LA21_0>=95 && LA21_0<=104)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMOloc.g:939:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalMOloc.g:939:3: (lv_elements_0_0= ruleElement )
            	    // InternalMOloc.g:940:4: lv_elements_0_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCompositionAccess().getElementsElementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getCompositionRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"dut.control.moloc.MOloc.Element");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
            if ( state.backtracking>0 ) { memoize(input, 15, rulecomposition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomposition"


    // $ANTLR start "ruletype_specifier"
    // InternalMOloc.g:961:1: ruletype_specifier[EObject in_current] returns [EObject current=in_current] : ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) ) ;
    public final EObject ruletype_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruletype_specifier_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_typeSpecifier_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // InternalMOloc.g:967:2: ( ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) ) )
            // InternalMOloc.g:968:2: ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) )
            {
            // InternalMOloc.g:968:2: ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) )
            // InternalMOloc.g:969:3: (lv_typeSpecifier_0_0= ruleTypeSpecifier )
            {
            // InternalMOloc.g:969:3: (lv_typeSpecifier_0_0= ruleTypeSpecifier )
            // InternalMOloc.g:970:4: lv_typeSpecifier_0_0= ruleTypeSpecifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getType_specifierAccess().getTypeSpecifierTypeSpecifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_typeSpecifier_0_0=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getType_specifierRule());
              				}
              				set(
              					current,
              					"typeSpecifier",
              					lv_typeSpecifier_0_0,
              					"dut.control.moloc.MOloc.TypeSpecifier");
              				afterParserOrEnumRuleCall();
              			
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruletype_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruletype_specifier"


    // $ANTLR start "entryRuleTypeSpecifier"
    // InternalMOloc.g:990:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;
        int entryRuleTypeSpecifier_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // InternalMOloc.g:990:53: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalMOloc.g:991:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleTypeSpecifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // InternalMOloc.g:997:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTypeSpecifier_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // InternalMOloc.g:1003:2: ( ( (kw= '.' )? this_Name_1= ruleName ) )
            // InternalMOloc.g:1004:2: ( (kw= '.' )? this_Name_1= ruleName )
            {
            // InternalMOloc.g:1004:2: ( (kw= '.' )? this_Name_1= ruleName )
            // InternalMOloc.g:1005:3: (kw= '.' )? this_Name_1= ruleName
            {
            // InternalMOloc.g:1005:3: (kw= '.' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMOloc.g:1006:4: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeSpecifierAccess().getFullStopKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeSpecifierAccess().getNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Name_1=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Name_1);
              		
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleTypeSpecifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "ruleenum_list"
    // InternalMOloc.g:1027:1: ruleenum_list[EObject in_current] returns [EObject current=in_current] : ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* ) ;
    public final EObject ruleenum_list(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleenum_list_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_enumerationLiteral_0_0 = null;

        EObject lv_enumerationLiteral_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // InternalMOloc.g:1033:2: ( ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* ) )
            // InternalMOloc.g:1034:2: ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* )
            {
            // InternalMOloc.g:1034:2: ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* )
            // InternalMOloc.g:1035:3: ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )*
            {
            // InternalMOloc.g:1035:3: ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) )
            // InternalMOloc.g:1036:4: (lv_enumerationLiteral_0_0= ruleEnumerationLiteral )
            {
            // InternalMOloc.g:1036:4: (lv_enumerationLiteral_0_0= ruleEnumerationLiteral )
            // InternalMOloc.g:1037:5: lv_enumerationLiteral_0_0= ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnum_listAccess().getEnumerationLiteralEnumerationLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_enumerationLiteral_0_0=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnum_listRule());
              					}
              					add(
              						current,
              						"enumerationLiteral",
              						lv_enumerationLiteral_0_0,
              						"dut.control.moloc.MOloc.EnumerationLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:1054:3: (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMOloc.g:1055:4: otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getEnum_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMOloc.g:1059:4: ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) )
            	    // InternalMOloc.g:1060:5: (lv_enumerationLiteral_2_0= ruleEnumerationLiteral )
            	    {
            	    // InternalMOloc.g:1060:5: (lv_enumerationLiteral_2_0= ruleEnumerationLiteral )
            	    // InternalMOloc.g:1061:6: lv_enumerationLiteral_2_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnum_listAccess().getEnumerationLiteralEnumerationLiteralParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_enumerationLiteral_2_0=ruleEnumerationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnum_listRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enumerationLiteral",
            	      							lv_enumerationLiteral_2_0,
            	      							"dut.control.moloc.MOloc.EnumerationLiteral");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
            if ( state.backtracking>0 ) { memoize(input, 19, ruleenum_list_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleenum_list"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalMOloc.g:1083:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleEnumerationLiteral_StartIndex = input.index();
        EObject iv_ruleEnumerationLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // InternalMOloc.g:1083:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalMOloc.g:1084:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, entryRuleEnumerationLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalMOloc.g:1090:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;
        int ruleEnumerationLiteral_StartIndex = input.index();
        Token lv_title_0_0=null;
        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // InternalMOloc.g:1096:2: ( ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] ) )
            // InternalMOloc.g:1097:2: ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] )
            {
            // InternalMOloc.g:1097:2: ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] )
            // InternalMOloc.g:1098:3: ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current]
            {
            // InternalMOloc.g:1098:3: ( (lv_title_0_0= RULE_IDENT ) )
            // InternalMOloc.g:1099:4: (lv_title_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:1099:4: (lv_title_0_0= RULE_IDENT )
            // InternalMOloc.g:1100:5: lv_title_0_0= RULE_IDENT
            {
            lv_title_0_0=(Token)match(input,RULE_IDENT,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_title_0_0, grammarAccess.getEnumerationLiteralAccess().getTitleIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"title",
              						lv_title_0_0,
              						"dut.control.moloc.MOloc.IDENT");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEnumerationLiteralRule());
              			}
              			newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getDescriptionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_description_1=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_1;
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
            if ( state.backtracking>0 ) { memoize(input, 21, ruleEnumerationLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "ruledescription"
    // InternalMOloc.g:1135:1: ruledescription[EObject in_current] returns [EObject current=in_current] : (this_description_string_0= ruledescription_string[$current] (otherlv_1= 'annotation' this_class_modification_2= ruleclass_modification[$current] )? ) ;
    public final EObject ruledescription(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledescription_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_description_string_0 = null;

        EObject this_class_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // InternalMOloc.g:1141:2: ( (this_description_string_0= ruledescription_string[$current] (otherlv_1= 'annotation' this_class_modification_2= ruleclass_modification[$current] )? ) )
            // InternalMOloc.g:1142:2: (this_description_string_0= ruledescription_string[$current] (otherlv_1= 'annotation' this_class_modification_2= ruleclass_modification[$current] )? )
            {
            // InternalMOloc.g:1142:2: (this_description_string_0= ruledescription_string[$current] (otherlv_1= 'annotation' this_class_modification_2= ruleclass_modification[$current] )? )
            // InternalMOloc.g:1143:3: this_description_string_0= ruledescription_string[$current] (otherlv_1= 'annotation' this_class_modification_2= ruleclass_modification[$current] )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDescriptionRule());
              			}
              			newCompositeNode(grammarAccess.getDescriptionAccess().getDescription_stringParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_description_string_0=ruledescription_string(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_string_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:1157:3: (otherlv_1= 'annotation' this_class_modification_2= ruleclass_modification[$current] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMOloc.g:1158:4: otherlv_1= 'annotation' this_class_modification_2= ruleclass_modification[$current]
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getAnnotationKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDescriptionRule());
                      				}
                      				newCompositeNode(grammarAccess.getDescriptionAccess().getClass_modificationParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_class_modification_2=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_2;
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruledescription_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledescription"


    // $ANTLR start "entryRuleArgument"
    // InternalMOloc.g:1181:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;
        int entryRuleArgument_StartIndex = input.index();
        EObject iv_ruleArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // InternalMOloc.g:1181:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMOloc.g:1182:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalMOloc.g:1188:1: ruleArgument returns [EObject current=null] : ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? (this_short_class_definition_3= ruleshort_class_definition[$current] | this_element_modification_4= ruleelement_modification[$current] ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;
        int ruleArgument_StartIndex = input.index();
        Token lv_isRedeclare_0_0=null;
        Token lv_isEach_1_0=null;
        Token lv_isfinal_2_0=null;
        EObject this_short_class_definition_3 = null;

        EObject this_element_modification_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // InternalMOloc.g:1194:2: ( ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? (this_short_class_definition_3= ruleshort_class_definition[$current] | this_element_modification_4= ruleelement_modification[$current] ) ) )
            // InternalMOloc.g:1195:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? (this_short_class_definition_3= ruleshort_class_definition[$current] | this_element_modification_4= ruleelement_modification[$current] ) )
            {
            // InternalMOloc.g:1195:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? (this_short_class_definition_3= ruleshort_class_definition[$current] | this_element_modification_4= ruleelement_modification[$current] ) )
            // InternalMOloc.g:1196:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? (this_short_class_definition_3= ruleshort_class_definition[$current] | this_element_modification_4= ruleelement_modification[$current] )
            {
            // InternalMOloc.g:1196:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMOloc.g:1197:4: (lv_isRedeclare_0_0= 'redeclare' )
                    {
                    // InternalMOloc.g:1197:4: (lv_isRedeclare_0_0= 'redeclare' )
                    // InternalMOloc.g:1198:5: lv_isRedeclare_0_0= 'redeclare'
                    {
                    lv_isRedeclare_0_0=(Token)match(input,39,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isRedeclare_0_0, grammarAccess.getArgumentAccess().getIsRedeclareRedeclareKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getArgumentRule());
                      					}
                      					setWithLastConsumed(current, "isRedeclare", lv_isRedeclare_0_0 != null, "redeclare");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1210:3: ( (lv_isEach_1_0= 'each' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMOloc.g:1211:4: (lv_isEach_1_0= 'each' )
                    {
                    // InternalMOloc.g:1211:4: (lv_isEach_1_0= 'each' )
                    // InternalMOloc.g:1212:5: lv_isEach_1_0= 'each'
                    {
                    lv_isEach_1_0=(Token)match(input,40,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isEach_1_0, grammarAccess.getArgumentAccess().getIsEachEachKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getArgumentRule());
                      					}
                      					setWithLastConsumed(current, "isEach", lv_isEach_1_0 != null, "each");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1224:3: ( (lv_isfinal_2_0= 'final' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMOloc.g:1225:4: (lv_isfinal_2_0= 'final' )
                    {
                    // InternalMOloc.g:1225:4: (lv_isfinal_2_0= 'final' )
                    // InternalMOloc.g:1226:5: lv_isfinal_2_0= 'final'
                    {
                    lv_isfinal_2_0=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isfinal_2_0, grammarAccess.getArgumentAccess().getIsfinalFinalKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getArgumentRule());
                      					}
                      					setWithLastConsumed(current, "isfinal", lv_isfinal_2_0 != null, "final");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1238:3: (this_short_class_definition_3= ruleshort_class_definition[$current] | this_element_modification_4= ruleelement_modification[$current] )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=22 && LA28_0<=26)||(LA28_0>=86 && LA28_0<=94)) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_IDENT) ) {
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
                    // InternalMOloc.g:1239:4: this_short_class_definition_3= ruleshort_class_definition[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getArgumentRule());
                      				}
                      				newCompositeNode(grammarAccess.getArgumentAccess().getShort_class_definitionParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_short_class_definition_3=ruleshort_class_definition(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_short_class_definition_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1254:4: this_element_modification_4= ruleelement_modification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getArgumentRule());
                      				}
                      				newCompositeNode(grammarAccess.getArgumentAccess().getElement_modificationParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_element_modification_4=ruleelement_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_element_modification_4;
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "ruleelement_modification"
    // InternalMOloc.g:1274:1: ruleelement_modification[EObject in_current] returns [EObject current=in_current] : ( ( (lv_elementName_0_0= ruleName ) ) this_modification_1= rulemodification[$current] this_description_string_2= ruledescription_string[$current] ) ;
    public final EObject ruleelement_modification(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleelement_modification_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_elementName_0_0 = null;

        EObject this_modification_1 = null;

        EObject this_description_string_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // InternalMOloc.g:1280:2: ( ( ( (lv_elementName_0_0= ruleName ) ) this_modification_1= rulemodification[$current] this_description_string_2= ruledescription_string[$current] ) )
            // InternalMOloc.g:1281:2: ( ( (lv_elementName_0_0= ruleName ) ) this_modification_1= rulemodification[$current] this_description_string_2= ruledescription_string[$current] )
            {
            // InternalMOloc.g:1281:2: ( ( (lv_elementName_0_0= ruleName ) ) this_modification_1= rulemodification[$current] this_description_string_2= ruledescription_string[$current] )
            // InternalMOloc.g:1282:3: ( (lv_elementName_0_0= ruleName ) ) this_modification_1= rulemodification[$current] this_description_string_2= ruledescription_string[$current]
            {
            // InternalMOloc.g:1282:3: ( (lv_elementName_0_0= ruleName ) )
            // InternalMOloc.g:1283:4: (lv_elementName_0_0= ruleName )
            {
            // InternalMOloc.g:1283:4: (lv_elementName_0_0= ruleName )
            // InternalMOloc.g:1284:5: lv_elementName_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElement_modificationAccess().getElementNameNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_elementName_0_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElement_modificationRule());
              					}
              					set(
              						current,
              						"elementName",
              						lv_elementName_0_0,
              						"dut.control.moloc.MOloc.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getElement_modificationRule());
              			}
              			newCompositeNode(grammarAccess.getElement_modificationAccess().getModificationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_24);
            this_modification_1=rulemodification(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_modification_1;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getElement_modificationRule());
              			}
              			newCompositeNode(grammarAccess.getElement_modificationAccess().getDescription_stringParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_description_string_2=ruledescription_string(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_string_2;
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
            if ( state.backtracking>0 ) { memoize(input, 25, ruleelement_modification_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleelement_modification"


    // $ANTLR start "ruleshort_class_definition"
    // InternalMOloc.g:1334:1: ruleshort_class_definition[EObject in_current] returns [EObject current=in_current] : (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) ;
    public final EObject ruleshort_class_definition(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleshort_class_definition_StartIndex = input.index();
        EObject this_class_prefixes_0 = null;

        EObject this_short_class_specifier_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // InternalMOloc.g:1340:2: ( (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) )
            // InternalMOloc.g:1341:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            {
            // InternalMOloc.g:1341:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            // InternalMOloc.g:1342:3: this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current]
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getShort_class_definitionRule());
              			}
              			newCompositeNode(grammarAccess.getShort_class_definitionAccess().getClass_prefixesParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_class_prefixes_0=ruleclass_prefixes(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_prefixes_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getShort_class_definitionRule());
              			}
              			newCompositeNode(grammarAccess.getShort_class_definitionAccess().getShort_class_specifierParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_short_class_specifier_1=ruleshort_class_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_short_class_specifier_1;
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleshort_class_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleshort_class_definition"


    // $ANTLR start "rulecomponent_clause1"
    // InternalMOloc.g:1375:1: rulecomponent_clause1[EObject in_current] returns [EObject current=in_current] : (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) ;
    public final EObject rulecomponent_clause1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_clause1_StartIndex = input.index();
        EObject this_type_prefix_0 = null;

        EObject this_type_specifier_1 = null;

        EObject this_component_declaration1_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // InternalMOloc.g:1381:2: ( (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) )
            // InternalMOloc.g:1382:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            {
            // InternalMOloc.g:1382:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            // InternalMOloc.g:1383:3: this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current]
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponent_clause1Rule());
              			}
              			newCompositeNode(grammarAccess.getComponent_clause1Access().getType_prefixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_type_prefix_0=ruletype_prefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_prefix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponent_clause1Rule());
              			}
              			newCompositeNode(grammarAccess.getComponent_clause1Access().getType_specifierParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_3);
            this_type_specifier_1=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_1;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponent_clause1Rule());
              			}
              			newCompositeNode(grammarAccess.getComponent_clause1Access().getComponent_declaration1ParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_component_declaration1_2=rulecomponent_declaration1(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_component_declaration1_2;
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
            if ( state.backtracking>0 ) { memoize(input, 27, rulecomponent_clause1_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomponent_clause1"


    // $ANTLR start "ruletype_prefix"
    // InternalMOloc.g:1430:1: ruletype_prefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) ;
    public final EObject ruletype_prefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruletype_prefix_StartIndex = input.index();
        Enumerator lv_relationshipType_0_0 = null;

        Enumerator lv_parameterType_1_0 = null;

        Enumerator lv_directionType_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // InternalMOloc.g:1436:2: ( ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) )
            // InternalMOloc.g:1437:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            {
            // InternalMOloc.g:1437:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            // InternalMOloc.g:1438:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )?
            {
            // InternalMOloc.g:1438:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=98 && LA29_0<=100)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMOloc.g:1439:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    {
                    // InternalMOloc.g:1439:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    // InternalMOloc.g:1440:5: lv_relationshipType_0_0= ruleRelationshipType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getRelationshipTypeRelationshipTypeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
                    lv_relationshipType_0_0=ruleRelationshipType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getType_prefixRule());
                      					}
                      					set(
                      						current,
                      						"relationshipType",
                      						lv_relationshipType_0_0,
                      						"dut.control.moloc.MOloc.RelationshipType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1457:3: ( (lv_parameterType_1_0= ruleParameterType ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=101 && LA30_0<=104)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMOloc.g:1458:4: (lv_parameterType_1_0= ruleParameterType )
                    {
                    // InternalMOloc.g:1458:4: (lv_parameterType_1_0= ruleParameterType )
                    // InternalMOloc.g:1459:5: lv_parameterType_1_0= ruleParameterType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getParameterTypeParameterTypeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
                    lv_parameterType_1_0=ruleParameterType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getType_prefixRule());
                      					}
                      					set(
                      						current,
                      						"parameterType",
                      						lv_parameterType_1_0,
                      						"dut.control.moloc.MOloc.ParameterType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1476:3: ( (lv_directionType_2_0= ruleDirection ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=95 && LA31_0<=97)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMOloc.g:1477:4: (lv_directionType_2_0= ruleDirection )
                    {
                    // InternalMOloc.g:1477:4: (lv_directionType_2_0= ruleDirection )
                    // InternalMOloc.g:1478:5: lv_directionType_2_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getDirectionTypeDirectionEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_directionType_2_0=ruleDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getType_prefixRule());
                      					}
                      					set(
                      						current,
                      						"directionType",
                      						lv_directionType_2_0,
                      						"dut.control.moloc.MOloc.Direction");
                      					afterParserOrEnumRuleCall();
                      				
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruletype_prefix_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruletype_prefix"


    // $ANTLR start "rulecomponent_declaration1"
    // InternalMOloc.g:1500:1: rulecomponent_declaration1[EObject in_current] returns [EObject current=in_current] : (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) ;
    public final EObject rulecomponent_declaration1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_declaration1_StartIndex = input.index();
        EObject this_declaration_0 = null;

        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // InternalMOloc.g:1506:2: ( (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) )
            // InternalMOloc.g:1507:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            {
            // InternalMOloc.g:1507:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            // InternalMOloc.g:1508:3: this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current]
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponent_declaration1Rule());
              			}
              			newCompositeNode(grammarAccess.getComponent_declaration1Access().getDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_declaration_0=ruledeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_declaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponent_declaration1Rule());
              			}
              			newCompositeNode(grammarAccess.getComponent_declaration1Access().getDescriptionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_description_1=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_1;
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
            if ( state.backtracking>0 ) { memoize(input, 29, rulecomponent_declaration1_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomponent_declaration1"


    // $ANTLR start "ruledeclaration"
    // InternalMOloc.g:1541:1: ruledeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) ;
    public final EObject ruledeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledeclaration_StartIndex = input.index();
        Token lv_declarationName_0_0=null;
        EObject this_array_subscripts_1 = null;

        EObject this_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // InternalMOloc.g:1547:2: ( ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) )
            // InternalMOloc.g:1548:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            {
            // InternalMOloc.g:1548:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            // InternalMOloc.g:1549:3: ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )?
            {
            // InternalMOloc.g:1549:3: ( (lv_declarationName_0_0= RULE_IDENT ) )
            // InternalMOloc.g:1550:4: (lv_declarationName_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:1550:4: (lv_declarationName_0_0= RULE_IDENT )
            // InternalMOloc.g:1551:5: lv_declarationName_0_0= RULE_IDENT
            {
            lv_declarationName_0_0=(Token)match(input,RULE_IDENT,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_declarationName_0_0, grammarAccess.getDeclarationAccess().getDeclarationNameIDENTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"declarationName",
              						lv_declarationName_0_0,
              						"dut.control.moloc.MOloc.IDENT");
              				
            }

            }


            }

            // InternalMOloc.g:1567:3: (this_array_subscripts_1= rulearray_subscripts[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMOloc.g:1568:4: this_array_subscripts_1= rulearray_subscripts[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDeclarationRule());
                      				}
                      				newCompositeNode(grammarAccess.getDeclarationAccess().getArray_subscriptsParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_array_subscripts_1=rulearray_subscripts(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_array_subscripts_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:1583:3: (this_modification_2= rulemodification[$current] )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29||LA33_0==31||LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMOloc.g:1584:4: this_modification_2= rulemodification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDeclarationRule());
                      				}
                      				newCompositeNode(grammarAccess.getDeclarationAccess().getModificationParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_modification_2=rulemodification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_modification_2;
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruledeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "rulearray_subscripts"
    // InternalMOloc.g:1604:1: rulearray_subscripts[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) ;
    public final EObject rulearray_subscripts(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulearray_subscripts_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_subscript_1_0 = null;

        AntlrDatatypeRuleToken lv_subscript_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // InternalMOloc.g:1610:2: ( (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) )
            // InternalMOloc.g:1611:2: (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            {
            // InternalMOloc.g:1611:2: (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            // InternalMOloc.g:1612:3: otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArray_subscriptsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMOloc.g:1616:3: ( (lv_subscript_1_0= ruleSubscript ) )
            // InternalMOloc.g:1617:4: (lv_subscript_1_0= ruleSubscript )
            {
            // InternalMOloc.g:1617:4: (lv_subscript_1_0= ruleSubscript )
            // InternalMOloc.g:1618:5: lv_subscript_1_0= ruleSubscript
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArray_subscriptsAccess().getSubscriptSubscriptParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_subscript_1_0=ruleSubscript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArray_subscriptsRule());
              					}
              					add(
              						current,
              						"subscript",
              						lv_subscript_1_0,
              						"dut.control.moloc.MOloc.Subscript");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:1635:3: (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMOloc.g:1636:4: otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getArray_subscriptsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMOloc.g:1640:4: ( (lv_subscript_3_0= ruleSubscript ) )
            	    // InternalMOloc.g:1641:5: (lv_subscript_3_0= ruleSubscript )
            	    {
            	    // InternalMOloc.g:1641:5: (lv_subscript_3_0= ruleSubscript )
            	    // InternalMOloc.g:1642:6: lv_subscript_3_0= ruleSubscript
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArray_subscriptsAccess().getSubscriptSubscriptParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_subscript_3_0=ruleSubscript();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArray_subscriptsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"subscript",
            	      							lv_subscript_3_0,
            	      							"dut.control.moloc.MOloc.Subscript");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArray_subscriptsAccess().getRightSquareBracketKeyword_3());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 31, rulearray_subscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulearray_subscripts"


    // $ANTLR start "entryRuleSubscript"
    // InternalMOloc.g:1668:1: entryRuleSubscript returns [String current=null] : iv_ruleSubscript= ruleSubscript EOF ;
    public final String entryRuleSubscript() throws RecognitionException {
        String current = null;
        int entryRuleSubscript_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSubscript = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // InternalMOloc.g:1668:49: (iv_ruleSubscript= ruleSubscript EOF )
            // InternalMOloc.g:1669:2: iv_ruleSubscript= ruleSubscript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubscriptRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubscript=ruleSubscript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubscript.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, entryRuleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscript"


    // $ANTLR start "ruleSubscript"
    // InternalMOloc.g:1675:1: ruleSubscript returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' | this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleSubscript() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSubscript_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // InternalMOloc.g:1681:2: ( (kw= ':' | this_Expression_1= ruleExpression ) )
            // InternalMOloc.g:1682:2: (kw= ':' | this_Expression_1= ruleExpression )
            {
            // InternalMOloc.g:1682:2: (kw= ':' | this_Expression_1= ruleExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_IDENT && LA35_0<=RULE_TRUE_FALSE)||LA35_0==24||LA35_0==28||LA35_0==31||(LA35_0>=36 && LA35_0<=37)||LA35_0==41||LA35_0==51||LA35_0==56||LA35_0==58||LA35_0==71||(LA35_0>=78 && LA35_0<=80)||LA35_0==84) ) {
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
                    // InternalMOloc.g:1683:3: kw= ':'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSubscriptAccess().getColonKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1689:3: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubscriptAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Expression_1);
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 33, ruleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubscript"


    // $ANTLR start "entryRuleUnfinished2"
    // InternalMOloc.g:1703:1: entryRuleUnfinished2 returns [EObject current=null] : iv_ruleUnfinished2= ruleUnfinished2 EOF ;
    public final EObject entryRuleUnfinished2() throws RecognitionException {
        EObject current = null;
        int entryRuleUnfinished2_StartIndex = input.index();
        EObject iv_ruleUnfinished2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // InternalMOloc.g:1703:52: (iv_ruleUnfinished2= ruleUnfinished2 EOF )
            // InternalMOloc.g:1704:2: iv_ruleUnfinished2= ruleUnfinished2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnfinished2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnfinished2=ruleUnfinished2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnfinished2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, entryRuleUnfinished2_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleUnfinished2"


    // $ANTLR start "ruleUnfinished2"
    // InternalMOloc.g:1710:1: ruleUnfinished2 returns [EObject current=null] : (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) ) ;
    public final EObject ruleUnfinished2() throws RecognitionException {
        EObject current = null;
        int ruleUnfinished2_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_aa_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // InternalMOloc.g:1716:2: ( (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) ) )
            // InternalMOloc.g:1717:2: (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) )
            {
            // InternalMOloc.g:1717:2: (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) )
            // InternalMOloc.g:1718:3: otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnfinished2Access().getUnfinished2Keyword_0());
              		
            }
            // InternalMOloc.g:1722:3: ( (lv_aa_1_0= ruleName ) )
            // InternalMOloc.g:1723:4: (lv_aa_1_0= ruleName )
            {
            // InternalMOloc.g:1723:4: (lv_aa_1_0= ruleName )
            // InternalMOloc.g:1724:5: lv_aa_1_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnfinished2Access().getAaNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_aa_1_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUnfinished2Rule());
              					}
              					set(
              						current,
              						"aa",
              						lv_aa_1_0,
              						"dut.control.moloc.MOloc.Name");
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
            if ( state.backtracking>0 ) { memoize(input, 35, ruleUnfinished2_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleUnfinished2"


    // $ANTLR start "rulemodification"
    // InternalMOloc.g:1746:1: rulemodification[EObject in_current] returns [EObject current=in_current] : ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) ;
    public final EObject rulemodification(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulemodification_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_class_modification_0 = null;

        AntlrDatatypeRuleToken lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_expression_4_0 = null;

        AntlrDatatypeRuleToken lv_expression_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // InternalMOloc.g:1752:2: ( ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) )
            // InternalMOloc.g:1753:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            {
            // InternalMOloc.g:1753:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt37=1;
                }
                break;
            case 29:
                {
                alt37=2;
                }
                break;
            case 44:
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
                    // InternalMOloc.g:1754:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    {
                    // InternalMOloc.g:1754:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    // InternalMOloc.g:1755:4: this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getModificationRule());
                      				}
                      				newCompositeNode(grammarAccess.getModificationAccess().getClass_modificationParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_class_modification_0=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:1769:4: (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==29) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMOloc.g:1770:5: otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) )
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getEqualsSignKeyword_0_1_0());
                              				
                            }
                            // InternalMOloc.g:1774:5: ( (lv_expression_2_0= ruleModification_expression ) )
                            // InternalMOloc.g:1775:6: (lv_expression_2_0= ruleModification_expression )
                            {
                            // InternalMOloc.g:1775:6: (lv_expression_2_0= ruleModification_expression )
                            // InternalMOloc.g:1776:7: lv_expression_2_0= ruleModification_expression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getModificationAccess().getExpressionModification_expressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_2_0=ruleModification_expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getModificationRule());
                              							}
                              							set(
                              								current,
                              								"expression",
                              								lv_expression_2_0,
                              								"dut.control.moloc.MOloc.Modification_expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1796:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:1796:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:1797:4: otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getModificationAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:1801:4: ( (lv_expression_4_0= ruleModification_expression ) )
                    // InternalMOloc.g:1802:5: (lv_expression_4_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:1802:5: (lv_expression_4_0= ruleModification_expression )
                    // InternalMOloc.g:1803:6: lv_expression_4_0= ruleModification_expression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModificationAccess().getExpressionModification_expressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_4_0=ruleModification_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModificationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_4_0,
                      							"dut.control.moloc.MOloc.Modification_expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:1822:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:1822:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:1823:4: otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getModificationAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMOloc.g:1827:4: ( (lv_expression_6_0= ruleModification_expression ) )
                    // InternalMOloc.g:1828:5: (lv_expression_6_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:1828:5: (lv_expression_6_0= ruleModification_expression )
                    // InternalMOloc.g:1829:6: lv_expression_6_0= ruleModification_expression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModificationAccess().getExpressionModification_expressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleModification_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModificationRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_6_0,
                      							"dut.control.moloc.MOloc.Modification_expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
            if ( state.backtracking>0 ) { memoize(input, 36, rulemodification_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulemodification"


    // $ANTLR start "entryRuleModification_expression"
    // InternalMOloc.g:1851:1: entryRuleModification_expression returns [String current=null] : iv_ruleModification_expression= ruleModification_expression EOF ;
    public final String entryRuleModification_expression() throws RecognitionException {
        String current = null;
        int entryRuleModification_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleModification_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // InternalMOloc.g:1851:63: (iv_ruleModification_expression= ruleModification_expression EOF )
            // InternalMOloc.g:1852:2: iv_ruleModification_expression= ruleModification_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModification_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModification_expression=ruleModification_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModification_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleModification_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModification_expression"


    // $ANTLR start "ruleModification_expression"
    // InternalMOloc.g:1858:1: ruleModification_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | kw= 'break' ) ;
    public final AntlrDatatypeRuleToken ruleModification_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleModification_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // InternalMOloc.g:1864:2: ( (this_Expression_0= ruleExpression | kw= 'break' ) )
            // InternalMOloc.g:1865:2: (this_Expression_0= ruleExpression | kw= 'break' )
            {
            // InternalMOloc.g:1865:2: (this_Expression_0= ruleExpression | kw= 'break' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_IDENT && LA38_0<=RULE_TRUE_FALSE)||LA38_0==24||LA38_0==28||LA38_0==31||(LA38_0>=36 && LA38_0<=37)||LA38_0==41||LA38_0==51||LA38_0==56||LA38_0==58||LA38_0==71||(LA38_0>=78 && LA38_0<=80)||LA38_0==84) ) {
                alt38=1;
            }
            else if ( (LA38_0==45) ) {
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
                    // InternalMOloc.g:1866:3: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getModification_expressionAccess().getExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1877:3: kw= 'break'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getModification_expressionAccess().getBreakKeyword_1());
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleModification_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModification_expression"


    // $ANTLR start "ruleconstraining_clause"
    // InternalMOloc.g:1887:1: ruleconstraining_clause[EObject in_current] returns [EObject current=in_current] : ( (lv_elements2_0_0= ruleUnfinished2 ) ) ;
    public final EObject ruleconstraining_clause(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleconstraining_clause_StartIndex = input.index();
        EObject lv_elements2_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // InternalMOloc.g:1893:2: ( ( (lv_elements2_0_0= ruleUnfinished2 ) ) )
            // InternalMOloc.g:1894:2: ( (lv_elements2_0_0= ruleUnfinished2 ) )
            {
            // InternalMOloc.g:1894:2: ( (lv_elements2_0_0= ruleUnfinished2 ) )
            // InternalMOloc.g:1895:3: (lv_elements2_0_0= ruleUnfinished2 )
            {
            // InternalMOloc.g:1895:3: (lv_elements2_0_0= ruleUnfinished2 )
            // InternalMOloc.g:1896:4: lv_elements2_0_0= ruleUnfinished2
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConstraining_clauseAccess().getElements2Unfinished2ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_elements2_0_0=ruleUnfinished2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConstraining_clauseRule());
              				}
              				add(
              					current,
              					"elements2",
              					lv_elements2_0_0,
              					"dut.control.moloc.MOloc.Unfinished2");
              				afterParserOrEnumRuleCall();
              			
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
            if ( state.backtracking>0 ) { memoize(input, 39, ruleconstraining_clause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleconstraining_clause"


    // $ANTLR start "entryRuleElement"
    // InternalMOloc.g:1916:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;
        int entryRuleElement_StartIndex = input.index();
        EObject iv_ruleElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // InternalMOloc.g:1916:48: (iv_ruleElement= ruleElement EOF )
            // InternalMOloc.g:1917:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, entryRuleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMOloc.g:1923:1: ruleElement returns [EObject current=null] : (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;
        int ruleElement_StartIndex = input.index();
        EObject this_ImportClause_0 = null;

        EObject this_ExtendsClause_1 = null;

        EObject this_GeneralClause_2 = null;

        EObject this_ExternalElement_3 = null;

        EObject this_AnnotationClause_4 = null;

        EObject this_EquationSection_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // InternalMOloc.g:1929:2: ( (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection ) )
            // InternalMOloc.g:1930:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection )
            {
            // InternalMOloc.g:1930:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                switch ( input.LA(2) ) {
                case 47:
                    {
                    int LA39_2 = input.LA(3);

                    if ( (LA39_2==48) ) {
                        alt39=1;
                    }
                    else if ( (LA39_2==RULE_IDENT||LA39_2==20||LA39_2==37||LA39_2==39||(LA39_2>=53 && LA39_2<=55)||(LA39_2>=95 && LA39_2<=104)) ) {
                        alt39=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    alt39=1;
                    }
                    break;
                case RULE_IDENT:
                case 20:
                case 37:
                case 39:
                case 53:
                case 54:
                case 55:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                    {
                    alt39=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }

                }
                break;
            case 47:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==48) ) {
                    alt39=1;
                }
                else if ( (LA39_2==RULE_IDENT||LA39_2==20||LA39_2==37||LA39_2==39||(LA39_2>=53 && LA39_2<=55)||(LA39_2>=95 && LA39_2<=104)) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt39=1;
                }
                break;
            case 27:
                {
                alt39=2;
                }
                break;
            case RULE_IDENT:
            case 20:
            case 37:
            case 39:
            case 53:
            case 54:
            case 55:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                {
                alt39=3;
                }
                break;
            case 57:
                {
                alt39=4;
                }
                break;
            case 38:
                {
                alt39=5;
                }
                break;
            case 58:
            case 59:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMOloc.g:1931:3: this_ImportClause_0= ruleImportClause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getImportClauseParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportClause_0=ruleImportClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ImportClause_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1943:3: this_ExtendsClause_1= ruleExtendsClause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getExtendsClauseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExtendsClause_1=ruleExtendsClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExtendsClause_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:1955:3: this_GeneralClause_2= ruleGeneralClause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getGeneralClauseParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GeneralClause_2=ruleGeneralClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GeneralClause_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:1967:3: this_ExternalElement_3= ruleExternalElement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getExternalElementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternalElement_3=ruleExternalElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternalElement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMOloc.g:1979:3: this_AnnotationClause_4= ruleAnnotationClause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getAnnotationClauseParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AnnotationClause_4=ruleAnnotationClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnnotationClause_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMOloc.g:1991:3: this_EquationSection_5= ruleEquationSection
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getEquationSectionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EquationSection_5=ruleEquationSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EquationSection_5;
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
            if ( state.backtracking>0 ) { memoize(input, 41, ruleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImportClause"
    // InternalMOloc.g:2006:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;
        int entryRuleImportClause_StartIndex = input.index();
        EObject iv_ruleImportClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // InternalMOloc.g:2006:53: (iv_ruleImportClause= ruleImportClause EOF )
            // InternalMOloc.g:2007:2: iv_ruleImportClause= ruleImportClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportClause=ruleImportClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, entryRuleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleImportClause"


    // $ANTLR start "ruleImportClause"
    // InternalMOloc.g:2013:1: ruleImportClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' ) ;
    public final EObject ruleImportClause() throws RecognitionException {
        EObject current = null;
        int ruleImportClause_StartIndex = input.index();
        Token lv_isPublic_0_0=null;
        Token lv_isProtected_1_0=null;
        Token otherlv_2=null;
        Token lv_selfName_3_0=null;
        Token otherlv_4=null;
        Token lv_isImportAll_7_0=null;
        Token otherlv_8=null;
        Token lv_isImportAll_9_0=null;
        Token otherlv_10=null;
        Token lv_objectName_11_0=null;
        Token otherlv_12=null;
        Token lv_objectName_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_importName_5_0 = null;

        AntlrDatatypeRuleToken lv_importName_6_0 = null;

        EObject this_description_15 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // InternalMOloc.g:2019:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' ) )
            // InternalMOloc.g:2020:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' )
            {
            // InternalMOloc.g:2020:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' )
            // InternalMOloc.g:2021:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';'
            {
            // InternalMOloc.g:2021:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMOloc.g:2022:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:2022:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:2023:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isPublic_0_0, grammarAccess.getImportClauseAccess().getIsPublicPublicKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getImportClauseRule());
                      					}
                      					setWithLastConsumed(current, "isPublic", lv_isPublic_0_0 != null, "public");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2035:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMOloc.g:2036:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:2036:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:2037:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,47,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isProtected_1_0, grammarAccess.getImportClauseAccess().getIsProtectedProtectedKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getImportClauseRule());
                      					}
                      					setWithLastConsumed(current, "isProtected", lv_isProtected_1_0 != null, "protected");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportClauseAccess().getImportKeyword_2());
              		
            }
            // InternalMOloc.g:2053:3: ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_IDENT) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_STRING||LA45_1==19||(LA45_1>=37 && LA45_1<=38)||LA45_1==49) ) {
                    alt45=2;
                }
                else if ( (LA45_1==29) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMOloc.g:2054:4: ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) )
                    {
                    // InternalMOloc.g:2054:4: ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) )
                    // InternalMOloc.g:2055:5: ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) )
                    {
                    // InternalMOloc.g:2055:5: ( (lv_selfName_3_0= RULE_IDENT ) )
                    // InternalMOloc.g:2056:6: (lv_selfName_3_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:2056:6: (lv_selfName_3_0= RULE_IDENT )
                    // InternalMOloc.g:2057:7: lv_selfName_3_0= RULE_IDENT
                    {
                    lv_selfName_3_0=(Token)match(input,RULE_IDENT,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_selfName_3_0, grammarAccess.getImportClauseAccess().getSelfNameIDENTTerminalRuleCall_3_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getImportClauseRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"selfName",
                      								lv_selfName_3_0,
                      								"dut.control.moloc.MOloc.IDENT");
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getImportClauseAccess().getEqualsSignKeyword_3_0_1());
                      				
                    }
                    // InternalMOloc.g:2077:5: ( (lv_importName_5_0= ruleName ) )
                    // InternalMOloc.g:2078:6: (lv_importName_5_0= ruleName )
                    {
                    // InternalMOloc.g:2078:6: (lv_importName_5_0= ruleName )
                    // InternalMOloc.g:2079:7: lv_importName_5_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportClauseAccess().getImportNameNameParserRuleCall_3_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
                    lv_importName_5_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getImportClauseRule());
                      							}
                      							set(
                      								current,
                      								"importName",
                      								lv_importName_5_0,
                      								"dut.control.moloc.MOloc.Name");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:2098:4: ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? )
                    {
                    // InternalMOloc.g:2098:4: ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? )
                    // InternalMOloc.g:2099:5: ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )?
                    {
                    // InternalMOloc.g:2099:5: ( (lv_importName_6_0= ruleName ) )
                    // InternalMOloc.g:2100:6: (lv_importName_6_0= ruleName )
                    {
                    // InternalMOloc.g:2100:6: (lv_importName_6_0= ruleName )
                    // InternalMOloc.g:2101:7: lv_importName_6_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportClauseAccess().getImportNameNameParserRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_39);
                    lv_importName_6_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getImportClauseRule());
                      							}
                      							set(
                      								current,
                      								"importName",
                      								lv_importName_6_0,
                      								"dut.control.moloc.MOloc.Name");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMOloc.g:2118:5: ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )?
                    int alt44=3;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==49) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==37) ) {
                        alt44=2;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalMOloc.g:2119:6: ( (lv_isImportAll_7_0= '.*' ) )
                            {
                            // InternalMOloc.g:2119:6: ( (lv_isImportAll_7_0= '.*' ) )
                            // InternalMOloc.g:2120:7: (lv_isImportAll_7_0= '.*' )
                            {
                            // InternalMOloc.g:2120:7: (lv_isImportAll_7_0= '.*' )
                            // InternalMOloc.g:2121:8: lv_isImportAll_7_0= '.*'
                            {
                            lv_isImportAll_7_0=(Token)match(input,49,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isImportAll_7_0, grammarAccess.getImportClauseAccess().getIsImportAllFullStopAsteriskKeyword_3_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getImportClauseRule());
                              								}
                              								setWithLastConsumed(current, "isImportAll", lv_isImportAll_7_0 != null, ".*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:2134:6: (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) )
                            {
                            // InternalMOloc.g:2134:6: (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) )
                            // InternalMOloc.g:2135:7: otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) )
                            {
                            otherlv_8=(Token)match(input,37,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getImportClauseAccess().getFullStopKeyword_3_1_1_1_0());
                              						
                            }
                            // InternalMOloc.g:2139:7: ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) )
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==50) ) {
                                alt43=1;
                            }
                            else if ( (LA43_0==51) ) {
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
                                    // InternalMOloc.g:2140:8: ( (lv_isImportAll_9_0= '*' ) )
                                    {
                                    // InternalMOloc.g:2140:8: ( (lv_isImportAll_9_0= '*' ) )
                                    // InternalMOloc.g:2141:9: (lv_isImportAll_9_0= '*' )
                                    {
                                    // InternalMOloc.g:2141:9: (lv_isImportAll_9_0= '*' )
                                    // InternalMOloc.g:2142:10: lv_isImportAll_9_0= '*'
                                    {
                                    lv_isImportAll_9_0=(Token)match(input,50,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      										newLeafNode(lv_isImportAll_9_0, grammarAccess.getImportClauseAccess().getIsImportAllAsteriskKeyword_3_1_1_1_1_0_0());
                                      									
                                    }
                                    if ( state.backtracking==0 ) {

                                      										if (current==null) {
                                      											current = createModelElement(grammarAccess.getImportClauseRule());
                                      										}
                                      										setWithLastConsumed(current, "isImportAll", lv_isImportAll_9_0 != null, "*");
                                      									
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalMOloc.g:2155:8: (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' )
                                    {
                                    // InternalMOloc.g:2155:8: (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' )
                                    // InternalMOloc.g:2156:9: otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}'
                                    {
                                    otherlv_10=(Token)match(input,51,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_10, grammarAccess.getImportClauseAccess().getLeftCurlyBracketKeyword_3_1_1_1_1_1_0());
                                      								
                                    }
                                    // InternalMOloc.g:2160:9: ( (lv_objectName_11_0= RULE_IDENT ) )
                                    // InternalMOloc.g:2161:10: (lv_objectName_11_0= RULE_IDENT )
                                    {
                                    // InternalMOloc.g:2161:10: (lv_objectName_11_0= RULE_IDENT )
                                    // InternalMOloc.g:2162:11: lv_objectName_11_0= RULE_IDENT
                                    {
                                    lv_objectName_11_0=(Token)match(input,RULE_IDENT,FOLLOW_41); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      											newLeafNode(lv_objectName_11_0, grammarAccess.getImportClauseAccess().getObjectNameIDENTTerminalRuleCall_3_1_1_1_1_1_1_0());
                                      										
                                    }
                                    if ( state.backtracking==0 ) {

                                      											if (current==null) {
                                      												current = createModelElement(grammarAccess.getImportClauseRule());
                                      											}
                                      											addWithLastConsumed(
                                      												current,
                                      												"objectName",
                                      												lv_objectName_11_0,
                                      												"dut.control.moloc.MOloc.IDENT");
                                      										
                                    }

                                    }


                                    }

                                    // InternalMOloc.g:2178:9: (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )*
                                    loop42:
                                    do {
                                        int alt42=2;
                                        int LA42_0 = input.LA(1);

                                        if ( (LA42_0==35) ) {
                                            alt42=1;
                                        }


                                        switch (alt42) {
                                    	case 1 :
                                    	    // InternalMOloc.g:2179:10: otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) )
                                    	    {
                                    	    otherlv_12=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      										newLeafNode(otherlv_12, grammarAccess.getImportClauseAccess().getCommaKeyword_3_1_1_1_1_1_2_0());
                                    	      									
                                    	    }
                                    	    // InternalMOloc.g:2183:10: ( (lv_objectName_13_0= RULE_IDENT ) )
                                    	    // InternalMOloc.g:2184:11: (lv_objectName_13_0= RULE_IDENT )
                                    	    {
                                    	    // InternalMOloc.g:2184:11: (lv_objectName_13_0= RULE_IDENT )
                                    	    // InternalMOloc.g:2185:12: lv_objectName_13_0= RULE_IDENT
                                    	    {
                                    	    lv_objectName_13_0=(Token)match(input,RULE_IDENT,FOLLOW_41); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      												newLeafNode(lv_objectName_13_0, grammarAccess.getImportClauseAccess().getObjectNameIDENTTerminalRuleCall_3_1_1_1_1_1_2_1_0());
                                    	      											
                                    	    }
                                    	    if ( state.backtracking==0 ) {

                                    	      												if (current==null) {
                                    	      													current = createModelElement(grammarAccess.getImportClauseRule());
                                    	      												}
                                    	      												addWithLastConsumed(
                                    	      													current,
                                    	      													"objectName",
                                    	      													lv_objectName_13_0,
                                    	      													"dut.control.moloc.MOloc.IDENT");
                                    	      											
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop42;
                                        }
                                    } while (true);

                                    otherlv_14=(Token)match(input,52,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_14, grammarAccess.getImportClauseAccess().getRightCurlyBracketKeyword_3_1_1_1_1_1_3());
                                      								
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

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getImportClauseRule());
              			}
              			newCompositeNode(grammarAccess.getImportClauseAccess().getDescriptionParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_15=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_15;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_16=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getImportClauseAccess().getSemicolonKeyword_5());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 43, ruleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleExtendsClause"
    // InternalMOloc.g:2234:1: entryRuleExtendsClause returns [EObject current=null] : iv_ruleExtendsClause= ruleExtendsClause EOF ;
    public final EObject entryRuleExtendsClause() throws RecognitionException {
        EObject current = null;
        int entryRuleExtendsClause_StartIndex = input.index();
        EObject iv_ruleExtendsClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // InternalMOloc.g:2234:54: (iv_ruleExtendsClause= ruleExtendsClause EOF )
            // InternalMOloc.g:2235:2: iv_ruleExtendsClause= ruleExtendsClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendsClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtendsClause=ruleExtendsClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendsClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, entryRuleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsClause"


    // $ANTLR start "ruleExtendsClause"
    // InternalMOloc.g:2241:1: ruleExtendsClause returns [EObject current=null] : (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )? otherlv_8= ')' )? (otherlv_9= 'annotation' this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' ) ;
    public final EObject ruleExtendsClause() throws RecognitionException {
        EObject current = null;
        int ruleExtendsClause_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_type_specifier_1 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_breaks_4_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_breaks_7_0 = null;

        EObject this_class_modification_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // InternalMOloc.g:2247:2: ( (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )? otherlv_8= ')' )? (otherlv_9= 'annotation' this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' ) )
            // InternalMOloc.g:2248:2: (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )? otherlv_8= ')' )? (otherlv_9= 'annotation' this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' )
            {
            // InternalMOloc.g:2248:2: (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )? otherlv_8= ')' )? (otherlv_9= 'annotation' this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' )
            // InternalMOloc.g:2249:3: otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )? otherlv_8= ')' )? (otherlv_9= 'annotation' this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExtendsClauseAccess().getExtendsKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getExtendsClauseRule());
              			}
              			newCompositeNode(grammarAccess.getExtendsClauseAccess().getType_specifierParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_42);
            this_type_specifier_1=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2267:3: (otherlv_2= '(' ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )? otherlv_8= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMOloc.g:2268:4: otherlv_2= '(' ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )? otherlv_8= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExtendsClauseAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalMOloc.g:2272:4: ( ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_IDENT||LA48_0==20||(LA48_0>=22 && LA48_0<=26)||(LA48_0>=39 && LA48_0<=40)||LA48_0==45||(LA48_0>=86 && LA48_0<=94)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMOloc.g:2273:5: ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* )
                            {
                            // InternalMOloc.g:2273:5: ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) )
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==RULE_IDENT||LA46_0==20||(LA46_0>=22 && LA46_0<=26)||(LA46_0>=39 && LA46_0<=40)||(LA46_0>=86 && LA46_0<=94)) ) {
                                alt46=1;
                            }
                            else if ( (LA46_0==45) ) {
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
                                    // InternalMOloc.g:2274:6: ( (lv_arguments_3_0= ruleArgument ) )
                                    {
                                    // InternalMOloc.g:2274:6: ( (lv_arguments_3_0= ruleArgument ) )
                                    // InternalMOloc.g:2275:7: (lv_arguments_3_0= ruleArgument )
                                    {
                                    // InternalMOloc.g:2275:7: (lv_arguments_3_0= ruleArgument )
                                    // InternalMOloc.g:2276:8: lv_arguments_3_0= ruleArgument
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExtendsClauseAccess().getArgumentsArgumentParserRuleCall_2_1_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_20);
                                    lv_arguments_3_0=ruleArgument();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                                      								}
                                      								add(
                                      									current,
                                      									"arguments",
                                      									lv_arguments_3_0,
                                      									"dut.control.moloc.MOloc.Argument");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalMOloc.g:2294:6: ( (lv_breaks_4_0= ruleBreak ) )
                                    {
                                    // InternalMOloc.g:2294:6: ( (lv_breaks_4_0= ruleBreak ) )
                                    // InternalMOloc.g:2295:7: (lv_breaks_4_0= ruleBreak )
                                    {
                                    // InternalMOloc.g:2295:7: (lv_breaks_4_0= ruleBreak )
                                    // InternalMOloc.g:2296:8: lv_breaks_4_0= ruleBreak
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_2_1_0_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_20);
                                    lv_breaks_4_0=ruleBreak();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                                      								}
                                      								add(
                                      									current,
                                      									"breaks",
                                      									lv_breaks_4_0,
                                      									"dut.control.moloc.MOloc.Break");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalMOloc.g:2314:5: (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )* )
                            // InternalMOloc.g:2315:6: otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )*
                            {
                            otherlv_5=(Token)match(input,35,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getExtendsClauseAccess().getCommaKeyword_2_1_1_0());
                              					
                            }
                            // InternalMOloc.g:2319:6: ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )*
                            loop47:
                            do {
                                int alt47=3;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==RULE_IDENT||LA47_0==20||(LA47_0>=22 && LA47_0<=26)||(LA47_0>=39 && LA47_0<=40)||(LA47_0>=86 && LA47_0<=94)) ) {
                                    alt47=1;
                                }
                                else if ( (LA47_0==45) ) {
                                    alt47=2;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalMOloc.g:2320:7: ( (lv_arguments_6_0= ruleArgument ) )
                            	    {
                            	    // InternalMOloc.g:2320:7: ( (lv_arguments_6_0= ruleArgument ) )
                            	    // InternalMOloc.g:2321:8: (lv_arguments_6_0= ruleArgument )
                            	    {
                            	    // InternalMOloc.g:2321:8: (lv_arguments_6_0= ruleArgument )
                            	    // InternalMOloc.g:2322:9: lv_arguments_6_0= ruleArgument
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getExtendsClauseAccess().getArgumentsArgumentParserRuleCall_2_1_1_1_0_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_43);
                            	    lv_arguments_6_0=ruleArgument();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"arguments",
                            	      										lv_arguments_6_0,
                            	      										"dut.control.moloc.MOloc.Argument");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalMOloc.g:2340:7: ( (lv_breaks_7_0= ruleBreak ) )
                            	    {
                            	    // InternalMOloc.g:2340:7: ( (lv_breaks_7_0= ruleBreak ) )
                            	    // InternalMOloc.g:2341:8: (lv_breaks_7_0= ruleBreak )
                            	    {
                            	    // InternalMOloc.g:2341:8: (lv_breaks_7_0= ruleBreak )
                            	    // InternalMOloc.g:2342:9: lv_breaks_7_0= ruleBreak
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_2_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_43);
                            	    lv_breaks_7_0=ruleBreak();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"breaks",
                            	      										lv_breaks_7_0,
                            	      										"dut.control.moloc.MOloc.Break");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExtendsClauseAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:2367:3: (otherlv_9= 'annotation' this_class_modification_10= ruleclass_modification[$current] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMOloc.g:2368:4: otherlv_9= 'annotation' this_class_modification_10= ruleclass_modification[$current]
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getExtendsClauseAccess().getAnnotationKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getExtendsClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getExtendsClauseAccess().getClass_modificationParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_class_modification_10=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_10;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getExtendsClauseAccess().getSemicolonKeyword_4());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 45, ruleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendsClause"


    // $ANTLR start "entryRuleBreak"
    // InternalMOloc.g:2395:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;
        int entryRuleBreak_StartIndex = input.index();
        EObject iv_ruleBreak = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // InternalMOloc.g:2395:46: (iv_ruleBreak= ruleBreak EOF )
            // InternalMOloc.g:2396:2: iv_ruleBreak= ruleBreak EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreak=ruleBreak();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreak; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, entryRuleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalMOloc.g:2402:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;
        int ruleBreak_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_breakName_2_0=null;
        EObject lv_connect_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // InternalMOloc.g:2408:2: ( (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) ) )
            // InternalMOloc.g:2409:2: (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) )
            {
            // InternalMOloc.g:2409:2: (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) )
            // InternalMOloc.g:2410:3: otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
              		
            }
            // InternalMOloc.g:2414:3: ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==68) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_IDENT) ) {
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
                    // InternalMOloc.g:2415:4: ( (lv_connect_1_0= ruleNULLElement ) )
                    {
                    // InternalMOloc.g:2415:4: ( (lv_connect_1_0= ruleNULLElement ) )
                    // InternalMOloc.g:2416:5: (lv_connect_1_0= ruleNULLElement )
                    {
                    // InternalMOloc.g:2416:5: (lv_connect_1_0= ruleNULLElement )
                    // InternalMOloc.g:2417:6: lv_connect_1_0= ruleNULLElement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBreakAccess().getConnectNULLElementParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_connect_1_0=ruleNULLElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBreakRule());
                      						}
                      						set(
                      							current,
                      							"connect",
                      							lv_connect_1_0,
                      							"dut.control.moloc.MOloc.NULLElement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:2435:4: ( (lv_breakName_2_0= RULE_IDENT ) )
                    {
                    // InternalMOloc.g:2435:4: ( (lv_breakName_2_0= RULE_IDENT ) )
                    // InternalMOloc.g:2436:5: (lv_breakName_2_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:2436:5: (lv_breakName_2_0= RULE_IDENT )
                    // InternalMOloc.g:2437:6: lv_breakName_2_0= RULE_IDENT
                    {
                    lv_breakName_2_0=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_breakName_2_0, grammarAccess.getBreakAccess().getBreakNameIDENTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBreakRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"breakName",
                      							lv_breakName_2_0,
                      							"dut.control.moloc.MOloc.IDENT");
                      					
                    }

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
            if ( state.backtracking>0 ) { memoize(input, 47, ruleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleGeneralClause"
    // InternalMOloc.g:2458:1: entryRuleGeneralClause returns [EObject current=null] : iv_ruleGeneralClause= ruleGeneralClause EOF ;
    public final EObject entryRuleGeneralClause() throws RecognitionException {
        EObject current = null;
        int entryRuleGeneralClause_StartIndex = input.index();
        EObject iv_ruleGeneralClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // InternalMOloc.g:2458:54: (iv_ruleGeneralClause= ruleGeneralClause EOF )
            // InternalMOloc.g:2459:2: iv_ruleGeneralClause= ruleGeneralClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGeneralClause=ruleGeneralClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, entryRuleGeneralClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralClause"


    // $ANTLR start "ruleGeneralClause"
    // InternalMOloc.g:2465:1: ruleGeneralClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? this_type_prefix_7= ruletype_prefix[$current] this_type_specifier_8= ruletype_specifier[$current] (this_array_subscripts_9= rulearray_subscripts[$current] )? ( (lv_component_list_10_0= ruleComponent_declaration ) ) (otherlv_11= ',' ( (lv_component_list_12_0= ruleComponent_declaration ) ) )* otherlv_13= ';' ) ;
    public final EObject ruleGeneralClause() throws RecognitionException {
        EObject current = null;
        int ruleGeneralClause_StartIndex = input.index();
        Token lv_isPublic_0_0=null;
        Token lv_isProtected_1_0=null;
        Token lv_isRedeclare_2_0=null;
        Token lv_isfinal_3_0=null;
        Token lv_isInner_4_0=null;
        Token lv_isOuter_5_0=null;
        Token lv_isReplaceable_6_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_type_prefix_7 = null;

        EObject this_type_specifier_8 = null;

        EObject this_array_subscripts_9 = null;

        EObject lv_component_list_10_0 = null;

        EObject lv_component_list_12_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // InternalMOloc.g:2471:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? this_type_prefix_7= ruletype_prefix[$current] this_type_specifier_8= ruletype_specifier[$current] (this_array_subscripts_9= rulearray_subscripts[$current] )? ( (lv_component_list_10_0= ruleComponent_declaration ) ) (otherlv_11= ',' ( (lv_component_list_12_0= ruleComponent_declaration ) ) )* otherlv_13= ';' ) )
            // InternalMOloc.g:2472:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? this_type_prefix_7= ruletype_prefix[$current] this_type_specifier_8= ruletype_specifier[$current] (this_array_subscripts_9= rulearray_subscripts[$current] )? ( (lv_component_list_10_0= ruleComponent_declaration ) ) (otherlv_11= ',' ( (lv_component_list_12_0= ruleComponent_declaration ) ) )* otherlv_13= ';' )
            {
            // InternalMOloc.g:2472:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? this_type_prefix_7= ruletype_prefix[$current] this_type_specifier_8= ruletype_specifier[$current] (this_array_subscripts_9= rulearray_subscripts[$current] )? ( (lv_component_list_10_0= ruleComponent_declaration ) ) (otherlv_11= ',' ( (lv_component_list_12_0= ruleComponent_declaration ) ) )* otherlv_13= ';' )
            // InternalMOloc.g:2473:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? this_type_prefix_7= ruletype_prefix[$current] this_type_specifier_8= ruletype_specifier[$current] (this_array_subscripts_9= rulearray_subscripts[$current] )? ( (lv_component_list_10_0= ruleComponent_declaration ) ) (otherlv_11= ',' ( (lv_component_list_12_0= ruleComponent_declaration ) ) )* otherlv_13= ';'
            {
            // InternalMOloc.g:2473:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMOloc.g:2474:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:2474:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:2475:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,46,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isPublic_0_0, grammarAccess.getGeneralClauseAccess().getIsPublicPublicKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isPublic", lv_isPublic_0_0 != null, "public");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2487:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMOloc.g:2488:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:2488:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:2489:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,47,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isProtected_1_0, grammarAccess.getGeneralClauseAccess().getIsProtectedProtectedKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isProtected", lv_isProtected_1_0 != null, "protected");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2501:3: ( (lv_isRedeclare_2_0= 'redeclare' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==39) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMOloc.g:2502:4: (lv_isRedeclare_2_0= 'redeclare' )
                    {
                    // InternalMOloc.g:2502:4: (lv_isRedeclare_2_0= 'redeclare' )
                    // InternalMOloc.g:2503:5: lv_isRedeclare_2_0= 'redeclare'
                    {
                    lv_isRedeclare_2_0=(Token)match(input,39,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isRedeclare_2_0, grammarAccess.getGeneralClauseAccess().getIsRedeclareRedeclareKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isRedeclare", lv_isRedeclare_2_0 != null, "redeclare");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2515:3: ( (lv_isfinal_3_0= 'final' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMOloc.g:2516:4: (lv_isfinal_3_0= 'final' )
                    {
                    // InternalMOloc.g:2516:4: (lv_isfinal_3_0= 'final' )
                    // InternalMOloc.g:2517:5: lv_isfinal_3_0= 'final'
                    {
                    lv_isfinal_3_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isfinal_3_0, grammarAccess.getGeneralClauseAccess().getIsfinalFinalKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isfinal", lv_isfinal_3_0 != null, "final");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2529:3: ( (lv_isInner_4_0= 'inner' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==53) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMOloc.g:2530:4: (lv_isInner_4_0= 'inner' )
                    {
                    // InternalMOloc.g:2530:4: (lv_isInner_4_0= 'inner' )
                    // InternalMOloc.g:2531:5: lv_isInner_4_0= 'inner'
                    {
                    lv_isInner_4_0=(Token)match(input,53,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isInner_4_0, grammarAccess.getGeneralClauseAccess().getIsInnerInnerKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isInner", lv_isInner_4_0 != null, "inner");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2543:3: ( (lv_isOuter_5_0= 'outer' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMOloc.g:2544:4: (lv_isOuter_5_0= 'outer' )
                    {
                    // InternalMOloc.g:2544:4: (lv_isOuter_5_0= 'outer' )
                    // InternalMOloc.g:2545:5: lv_isOuter_5_0= 'outer'
                    {
                    lv_isOuter_5_0=(Token)match(input,54,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isOuter_5_0, grammarAccess.getGeneralClauseAccess().getIsOuterOuterKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isOuter", lv_isOuter_5_0 != null, "outer");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2557:3: ( (lv_isReplaceable_6_0= 'replaceable' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMOloc.g:2558:4: (lv_isReplaceable_6_0= 'replaceable' )
                    {
                    // InternalMOloc.g:2558:4: (lv_isReplaceable_6_0= 'replaceable' )
                    // InternalMOloc.g:2559:5: lv_isReplaceable_6_0= 'replaceable'
                    {
                    lv_isReplaceable_6_0=(Token)match(input,55,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReplaceable_6_0, grammarAccess.getGeneralClauseAccess().getIsReplaceableReplaceableKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isReplaceable", lv_isReplaceable_6_0 != null, "replaceable");
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getGeneralClauseRule());
              			}
              			newCompositeNode(grammarAccess.getGeneralClauseAccess().getType_prefixParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_14);
            this_type_prefix_7=ruletype_prefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_prefix_7;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getGeneralClauseRule());
              			}
              			newCompositeNode(grammarAccess.getGeneralClauseAccess().getType_specifierParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_46);
            this_type_specifier_8=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_8;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2599:3: (this_array_subscripts_9= rulearray_subscripts[$current] )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==41) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMOloc.g:2600:4: this_array_subscripts_9= rulearray_subscripts[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getGeneralClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getGeneralClauseAccess().getArray_subscriptsParserRuleCall_9());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_array_subscripts_9=rulearray_subscripts(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_array_subscripts_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:2615:3: ( (lv_component_list_10_0= ruleComponent_declaration ) )
            // InternalMOloc.g:2616:4: (lv_component_list_10_0= ruleComponent_declaration )
            {
            // InternalMOloc.g:2616:4: (lv_component_list_10_0= ruleComponent_declaration )
            // InternalMOloc.g:2617:5: lv_component_list_10_0= ruleComponent_declaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGeneralClauseAccess().getComponent_listComponent_declarationParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_component_list_10_0=ruleComponent_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGeneralClauseRule());
              					}
              					add(
              						current,
              						"component_list",
              						lv_component_list_10_0,
              						"dut.control.moloc.MOloc.Component_declaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:2634:3: (otherlv_11= ',' ( (lv_component_list_12_0= ruleComponent_declaration ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==35) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMOloc.g:2635:4: otherlv_11= ',' ( (lv_component_list_12_0= ruleComponent_declaration ) )
            	    {
            	    otherlv_11=(Token)match(input,35,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getGeneralClauseAccess().getCommaKeyword_11_0());
            	      			
            	    }
            	    // InternalMOloc.g:2639:4: ( (lv_component_list_12_0= ruleComponent_declaration ) )
            	    // InternalMOloc.g:2640:5: (lv_component_list_12_0= ruleComponent_declaration )
            	    {
            	    // InternalMOloc.g:2640:5: (lv_component_list_12_0= ruleComponent_declaration )
            	    // InternalMOloc.g:2641:6: lv_component_list_12_0= ruleComponent_declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGeneralClauseAccess().getComponent_listComponent_declarationParserRuleCall_11_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_component_list_12_0=ruleComponent_declaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGeneralClauseRule());
            	      						}
            	      						add(
            	      							current,
            	      							"component_list",
            	      							lv_component_list_12_0,
            	      							"dut.control.moloc.MOloc.Component_declaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGeneralClauseAccess().getSemicolonKeyword_12());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 49, ruleGeneralClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleGeneralClause"


    // $ANTLR start "entryRuleComponent_declaration"
    // InternalMOloc.g:2667:1: entryRuleComponent_declaration returns [EObject current=null] : iv_ruleComponent_declaration= ruleComponent_declaration EOF ;
    public final EObject entryRuleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int entryRuleComponent_declaration_StartIndex = input.index();
        EObject iv_ruleComponent_declaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // InternalMOloc.g:2667:62: (iv_ruleComponent_declaration= ruleComponent_declaration EOF )
            // InternalMOloc.g:2668:2: iv_ruleComponent_declaration= ruleComponent_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponent_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent_declaration=ruleComponent_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent_declaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, entryRuleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_declaration"


    // $ANTLR start "ruleComponent_declaration"
    // InternalMOloc.g:2674:1: ruleComponent_declaration returns [EObject current=null] : (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) ;
    public final EObject ruleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int ruleComponent_declaration_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_declaration_0 = null;

        AntlrDatatypeRuleToken lv_condition_attribute_2_0 = null;

        EObject this_description_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // InternalMOloc.g:2680:2: ( (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) )
            // InternalMOloc.g:2681:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            {
            // InternalMOloc.g:2681:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            // InternalMOloc.g:2682:3: this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current]
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponent_declarationRule());
              			}
              			newCompositeNode(grammarAccess.getComponent_declarationAccess().getDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_declaration_0=ruledeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_declaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2696:3: (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==56) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMOloc.g:2697:4: otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getComponent_declarationAccess().getIfKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:2701:4: ( (lv_condition_attribute_2_0= ruleExpression ) )
                    // InternalMOloc.g:2702:5: (lv_condition_attribute_2_0= ruleExpression )
                    {
                    // InternalMOloc.g:2702:5: (lv_condition_attribute_2_0= ruleExpression )
                    // InternalMOloc.g:2703:6: lv_condition_attribute_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponent_declarationAccess().getCondition_attributeExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_condition_attribute_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComponent_declarationRule());
                      						}
                      						set(
                      							current,
                      							"condition_attribute",
                      							lv_condition_attribute_2_0,
                      							"dut.control.moloc.MOloc.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getComponent_declarationRule());
              			}
              			newCompositeNode(grammarAccess.getComponent_declarationAccess().getDescriptionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_description_3=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_3;
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
            if ( state.backtracking>0 ) { memoize(input, 51, ruleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_declaration"


    // $ANTLR start "entryRuleExternalElement"
    // InternalMOloc.g:2739:1: entryRuleExternalElement returns [EObject current=null] : iv_ruleExternalElement= ruleExternalElement EOF ;
    public final EObject entryRuleExternalElement() throws RecognitionException {
        EObject current = null;
        int entryRuleExternalElement_StartIndex = input.index();
        EObject iv_ruleExternalElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // InternalMOloc.g:2739:56: (iv_ruleExternalElement= ruleExternalElement EOF )
            // InternalMOloc.g:2740:2: iv_ruleExternalElement= ruleExternalElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalElement=ruleExternalElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, entryRuleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalElement"


    // $ANTLR start "ruleExternalElement"
    // InternalMOloc.g:2746:1: ruleExternalElement returns [EObject current=null] : ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? (otherlv_4= 'annotation' this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' ) ;
    public final EObject ruleExternalElement() throws RecognitionException {
        EObject current = null;
        int ruleExternalElement_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_language_specification_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ref_3_0 = null;

        EObject this_class_modification_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // InternalMOloc.g:2752:2: ( ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? (otherlv_4= 'annotation' this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' ) )
            // InternalMOloc.g:2753:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? (otherlv_4= 'annotation' this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' )
            {
            // InternalMOloc.g:2753:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? (otherlv_4= 'annotation' this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' )
            // InternalMOloc.g:2754:3: () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? (otherlv_4= 'annotation' this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';'
            {
            // InternalMOloc.g:2754:3: ()
            // InternalMOloc.g:2755:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExternalElementAccess().getExternalElementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExternalElementAccess().getExternalKeyword_1());
              		
            }
            // InternalMOloc.g:2768:3: ( (lv_language_specification_2_0= RULE_STRING ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMOloc.g:2769:4: (lv_language_specification_2_0= RULE_STRING )
                    {
                    // InternalMOloc.g:2769:4: (lv_language_specification_2_0= RULE_STRING )
                    // InternalMOloc.g:2770:5: lv_language_specification_2_0= RULE_STRING
                    {
                    lv_language_specification_2_0=(Token)match(input,RULE_STRING,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_language_specification_2_0, grammarAccess.getExternalElementAccess().getLanguage_specificationSTRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExternalElementRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"language_specification",
                      						lv_language_specification_2_0,
                      						"dut.control.moloc.MOloc.STRING");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2786:3: ( (lv_ref_3_0= ruleComponent_reference ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_IDENT||LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMOloc.g:2787:4: (lv_ref_3_0= ruleComponent_reference )
                    {
                    // InternalMOloc.g:2787:4: (lv_ref_3_0= ruleComponent_reference )
                    // InternalMOloc.g:2788:5: lv_ref_3_0= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExternalElementAccess().getRefComponent_referenceParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
                    lv_ref_3_0=ruleComponent_reference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExternalElementRule());
                      					}
                      					set(
                      						current,
                      						"ref",
                      						lv_ref_3_0,
                      						"dut.control.moloc.MOloc.Component_reference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2805:3: (otherlv_4= 'annotation' this_class_modification_5= ruleclass_modification[$current] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==38) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMOloc.g:2806:4: otherlv_4= 'annotation' this_class_modification_5= ruleclass_modification[$current]
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExternalElementAccess().getAnnotationKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getExternalElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getExternalElementAccess().getClass_modificationParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_class_modification_5=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getExternalElementAccess().getSemicolonKeyword_5());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 53, ruleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExternalElement"


    // $ANTLR start "entryRuleAnnotationClause"
    // InternalMOloc.g:2833:1: entryRuleAnnotationClause returns [EObject current=null] : iv_ruleAnnotationClause= ruleAnnotationClause EOF ;
    public final EObject entryRuleAnnotationClause() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotationClause_StartIndex = input.index();
        EObject iv_ruleAnnotationClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // InternalMOloc.g:2833:57: (iv_ruleAnnotationClause= ruleAnnotationClause EOF )
            // InternalMOloc.g:2834:2: iv_ruleAnnotationClause= ruleAnnotationClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationClause=ruleAnnotationClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, entryRuleAnnotationClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationClause"


    // $ANTLR start "ruleAnnotationClause"
    // InternalMOloc.g:2840:1: ruleAnnotationClause returns [EObject current=null] : (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' ) ;
    public final EObject ruleAnnotationClause() throws RecognitionException {
        EObject current = null;
        int ruleAnnotationClause_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_class_modification_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // InternalMOloc.g:2846:2: ( (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' ) )
            // InternalMOloc.g:2847:2: (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' )
            {
            // InternalMOloc.g:2847:2: (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' )
            // InternalMOloc.g:2848:3: otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnnotationClauseAccess().getAnnotationKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAnnotationClauseRule());
              			}
              			newCompositeNode(grammarAccess.getAnnotationClauseAccess().getClass_modificationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            this_class_modification_1=ruleclass_modification(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_modification_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAnnotationClauseAccess().getSemicolonKeyword_2());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 55, ruleAnnotationClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationClause"


    // $ANTLR start "entryRuleEquationSection"
    // InternalMOloc.g:2874:1: entryRuleEquationSection returns [EObject current=null] : iv_ruleEquationSection= ruleEquationSection EOF ;
    public final EObject entryRuleEquationSection() throws RecognitionException {
        EObject current = null;
        int entryRuleEquationSection_StartIndex = input.index();
        EObject iv_ruleEquationSection = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // InternalMOloc.g:2874:56: (iv_ruleEquationSection= ruleEquationSection EOF )
            // InternalMOloc.g:2875:2: iv_ruleEquationSection= ruleEquationSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationSectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquationSection=ruleEquationSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquationSection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, entryRuleEquationSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEquationSection"


    // $ANTLR start "ruleEquationSection"
    // InternalMOloc.g:2881:1: ruleEquationSection returns [EObject current=null] : ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* ) ;
    public final EObject ruleEquationSection() throws RecognitionException {
        EObject current = null;
        int ruleEquationSection_StartIndex = input.index();
        Token lv_isInitial_1_0=null;
        Token otherlv_2=null;
        EObject lv_equations_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // InternalMOloc.g:2887:2: ( ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* ) )
            // InternalMOloc.g:2888:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* )
            {
            // InternalMOloc.g:2888:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* )
            // InternalMOloc.g:2889:3: () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )*
            {
            // InternalMOloc.g:2889:3: ()
            // InternalMOloc.g:2890:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEquationSectionAccess().getEquationSectionAction_0(),
              					current);
              			
            }

            }

            // InternalMOloc.g:2899:3: ( (lv_isInitial_1_0= 'initial' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==58) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMOloc.g:2900:4: (lv_isInitial_1_0= 'initial' )
                    {
                    // InternalMOloc.g:2900:4: (lv_isInitial_1_0= 'initial' )
                    // InternalMOloc.g:2901:5: lv_isInitial_1_0= 'initial'
                    {
                    lv_isInitial_1_0=(Token)match(input,58,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isInitial_1_0, grammarAccess.getEquationSectionAccess().getIsInitialInitialKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEquationSectionRule());
                      					}
                      					setWithLastConsumed(current, "isInitial", lv_isInitial_1_0 != null, "initial");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,59,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEquationSectionAccess().getEquationKeyword_2());
              		
            }
            // InternalMOloc.g:2917:3: ( (lv_equations_3_0= ruleEquation ) )*
            loop66:
            do {
                int alt66=2;
                alt66 = dfa66.predict(input);
                switch (alt66) {
            	case 1 :
            	    // InternalMOloc.g:2918:4: (lv_equations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:2918:4: (lv_equations_3_0= ruleEquation )
            	    // InternalMOloc.g:2919:5: lv_equations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEquationSectionAccess().getEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_equations_3_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEquationSectionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"equations",
            	      						lv_equations_3_0,
            	      						"dut.control.moloc.MOloc.Equation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
            if ( state.backtracking>0 ) { memoize(input, 57, ruleEquationSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEquationSection"


    // $ANTLR start "entryRuleEquation"
    // InternalMOloc.g:2940:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleEquation_StartIndex = input.index();
        EObject iv_ruleEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // InternalMOloc.g:2940:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalMOloc.g:2941:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, entryRuleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalMOloc.g:2947:1: ruleEquation returns [EObject current=null] : (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;
        int ruleEquation_StartIndex = input.index();
        EObject this_SimpleEquation_0 = null;

        EObject this_IfEquation_1 = null;

        EObject this_ForEquation_2 = null;

        EObject this_ConnectEquation_3 = null;

        EObject this_WhenEquation_4 = null;

        EObject this_FunctionEquation_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // InternalMOloc.g:2953:2: ( (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation ) )
            // InternalMOloc.g:2954:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )
            {
            // InternalMOloc.g:2954:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )
            int alt67=6;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // InternalMOloc.g:2955:3: this_SimpleEquation_0= ruleSimpleEquation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEquationAccess().getSimpleEquationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleEquation_0=ruleSimpleEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleEquation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:2967:3: this_IfEquation_1= ruleIfEquation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEquationAccess().getIfEquationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfEquation_1=ruleIfEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfEquation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:2979:3: this_ForEquation_2= ruleForEquation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEquationAccess().getForEquationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForEquation_2=ruleForEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForEquation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:2991:3: this_ConnectEquation_3= ruleConnectEquation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEquationAccess().getConnectEquationParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConnectEquation_3=ruleConnectEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConnectEquation_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMOloc.g:3003:3: this_WhenEquation_4= ruleWhenEquation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEquationAccess().getWhenEquationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhenEquation_4=ruleWhenEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhenEquation_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMOloc.g:3015:3: this_FunctionEquation_5= ruleFunctionEquation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEquationAccess().getFunctionEquationParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionEquation_5=ruleFunctionEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionEquation_5;
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
            if ( state.backtracking>0 ) { memoize(input, 59, ruleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleSimpleEquation"
    // InternalMOloc.g:3030:1: entryRuleSimpleEquation returns [EObject current=null] : iv_ruleSimpleEquation= ruleSimpleEquation EOF ;
    public final EObject entryRuleSimpleEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleSimpleEquation_StartIndex = input.index();
        EObject iv_ruleSimpleEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // InternalMOloc.g:3030:55: (iv_ruleSimpleEquation= ruleSimpleEquation EOF )
            // InternalMOloc.g:3031:2: iv_ruleSimpleEquation= ruleSimpleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleEquation=ruleSimpleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, entryRuleSimpleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleEquation"


    // $ANTLR start "ruleSimpleEquation"
    // InternalMOloc.g:3037:1: ruleSimpleEquation returns [EObject current=null] : ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' ) ;
    public final EObject ruleSimpleEquation() throws RecognitionException {
        EObject current = null;
        int ruleSimpleEquation_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_right_2_0 = null;

        EObject this_description_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // InternalMOloc.g:3043:2: ( ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' ) )
            // InternalMOloc.g:3044:2: ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' )
            {
            // InternalMOloc.g:3044:2: ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' )
            // InternalMOloc.g:3045:3: ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';'
            {
            // InternalMOloc.g:3045:3: ( (lv_left_0_0= ruleSimple_expression ) )
            // InternalMOloc.g:3046:4: (lv_left_0_0= ruleSimple_expression )
            {
            // InternalMOloc.g:3046:4: (lv_left_0_0= ruleSimple_expression )
            // InternalMOloc.g:3047:5: lv_left_0_0= ruleSimple_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleEquationAccess().getLeftSimple_expressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_left_0_0=ruleSimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimpleEquationRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_0_0,
              						"dut.control.moloc.MOloc.Simple_expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimpleEquationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMOloc.g:3068:3: ( (lv_right_2_0= ruleExpression ) )
            // InternalMOloc.g:3069:4: (lv_right_2_0= ruleExpression )
            {
            // InternalMOloc.g:3069:4: (lv_right_2_0= ruleExpression )
            // InternalMOloc.g:3070:5: lv_right_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleEquationAccess().getRightExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_right_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimpleEquationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"dut.control.moloc.MOloc.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSimpleEquationRule());
              			}
              			newCompositeNode(grammarAccess.getSimpleEquationAccess().getDescriptionParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_3=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_3;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSimpleEquationAccess().getSemicolonKeyword_4());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 61, ruleSimpleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSimpleEquation"


    // $ANTLR start "entryRuleIfEquation"
    // InternalMOloc.g:3109:1: entryRuleIfEquation returns [EObject current=null] : iv_ruleIfEquation= ruleIfEquation EOF ;
    public final EObject entryRuleIfEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleIfEquation_StartIndex = input.index();
        EObject iv_ruleIfEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // InternalMOloc.g:3109:51: (iv_ruleIfEquation= ruleIfEquation EOF )
            // InternalMOloc.g:3110:2: iv_ruleIfEquation= ruleIfEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfEquation=ruleIfEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, entryRuleIfEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfEquation"


    // $ANTLR start "ruleIfEquation"
    // InternalMOloc.g:3116:1: ruleIfEquation returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* ) (otherlv_8= 'else' ( (lv_equations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) ;
    public final EObject ruleIfEquation() throws RecognitionException {
        EObject current = null;
        int ruleIfEquation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_condition_1_0 = null;

        EObject lv_equations_3_0 = null;

        AntlrDatatypeRuleToken lv_elseCondition_5_0 = null;

        EObject lv_equations_7_0 = null;

        EObject lv_equations_9_0 = null;

        EObject this_description_12 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // InternalMOloc.g:3122:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* ) (otherlv_8= 'else' ( (lv_equations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) )
            // InternalMOloc.g:3123:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* ) (otherlv_8= 'else' ( (lv_equations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            {
            // InternalMOloc.g:3123:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* ) (otherlv_8= 'else' ( (lv_equations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            // InternalMOloc.g:3124:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* ) (otherlv_8= 'else' ( (lv_equations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfEquationAccess().getIfKeyword_0());
              		
            }
            // InternalMOloc.g:3128:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:3129:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:3129:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:3130:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfEquationAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfEquationRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"dut.control.moloc.MOloc.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfEquationAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:3151:3: ( (lv_equations_3_0= ruleEquation ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=RULE_IDENT && LA68_0<=RULE_TRUE_FALSE)||LA68_0==24||LA68_0==28||LA68_0==31||(LA68_0>=36 && LA68_0<=37)||LA68_0==41||LA68_0==51||LA68_0==56||LA68_0==58||LA68_0==63||(LA68_0>=65 && LA68_0<=66)||LA68_0==71||(LA68_0>=78 && LA68_0<=80)||LA68_0==84) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalMOloc.g:3152:4: (lv_equations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3152:4: (lv_equations_3_0= ruleEquation )
            	    // InternalMOloc.g:3153:5: lv_equations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfEquationAccess().getEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_equations_3_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfEquationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"equations",
            	      						lv_equations_3_0,
            	      						"dut.control.moloc.MOloc.Equation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // InternalMOloc.g:3170:3: (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* )
            // InternalMOloc.g:3171:4: otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )*
            {
            otherlv_4=(Token)match(input,61,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getIfEquationAccess().getElseifKeyword_4_0());
              			
            }
            // InternalMOloc.g:3175:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            // InternalMOloc.g:3176:5: (lv_elseCondition_5_0= ruleExpression )
            {
            // InternalMOloc.g:3176:5: (lv_elseCondition_5_0= ruleExpression )
            // InternalMOloc.g:3177:6: lv_elseCondition_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getIfEquationAccess().getElseConditionExpressionParserRuleCall_4_1_0());
              					
            }
            pushFollow(FOLLOW_53);
            lv_elseCondition_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getIfEquationRule());
              						}
              						add(
              							current,
              							"elseCondition",
              							lv_elseCondition_5_0,
              							"dut.control.moloc.MOloc.Expression");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_6=(Token)match(input,60,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getIfEquationAccess().getThenKeyword_4_2());
              			
            }
            // InternalMOloc.g:3198:4: ( (lv_equations_7_0= ruleEquation ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==28) ) {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==29||LA69_2==32||LA69_2==36||(LA69_2>=49 && LA69_2<=50)||(LA69_2>=69 && LA69_2<=70)||(LA69_2>=72 && LA69_2<=83)) ) {
                        alt69=1;
                    }


                }
                else if ( ((LA69_0>=RULE_IDENT && LA69_0<=RULE_TRUE_FALSE)||LA69_0==24||LA69_0==31||(LA69_0>=36 && LA69_0<=37)||LA69_0==41||LA69_0==51||LA69_0==56||LA69_0==58||LA69_0==63||(LA69_0>=65 && LA69_0<=66)||LA69_0==71||(LA69_0>=78 && LA69_0<=80)||LA69_0==84) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalMOloc.g:3199:5: (lv_equations_7_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3199:5: (lv_equations_7_0= ruleEquation )
            	    // InternalMOloc.g:3200:6: lv_equations_7_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfEquationAccess().getEquationsEquationParserRuleCall_4_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_equations_7_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfEquationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"equations",
            	      							lv_equations_7_0,
            	      							"dut.control.moloc.MOloc.Equation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

            // InternalMOloc.g:3218:3: (otherlv_8= 'else' ( (lv_equations_9_0= ruleEquation ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==62) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMOloc.g:3219:4: otherlv_8= 'else' ( (lv_equations_9_0= ruleEquation ) )*
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfEquationAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalMOloc.g:3223:4: ( (lv_equations_9_0= ruleEquation ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==28) ) {
                            int LA70_1 = input.LA(2);

                            if ( (LA70_1==29||LA70_1==32||LA70_1==36||(LA70_1>=49 && LA70_1<=50)||(LA70_1>=69 && LA70_1<=70)||(LA70_1>=72 && LA70_1<=83)) ) {
                                alt70=1;
                            }


                        }
                        else if ( ((LA70_0>=RULE_IDENT && LA70_0<=RULE_TRUE_FALSE)||LA70_0==24||LA70_0==31||(LA70_0>=36 && LA70_0<=37)||LA70_0==41||LA70_0==51||LA70_0==56||LA70_0==58||LA70_0==63||(LA70_0>=65 && LA70_0<=66)||LA70_0==71||(LA70_0>=78 && LA70_0<=80)||LA70_0==84) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalMOloc.g:3224:5: (lv_equations_9_0= ruleEquation )
                    	    {
                    	    // InternalMOloc.g:3224:5: (lv_equations_9_0= ruleEquation )
                    	    // InternalMOloc.g:3225:6: lv_equations_9_0= ruleEquation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfEquationAccess().getEquationsEquationParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_56);
                    	    lv_equations_9_0=ruleEquation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfEquationRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"equations",
                    	      							lv_equations_9_0,
                    	      							"dut.control.moloc.MOloc.Equation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getIfEquationAccess().getEndKeyword_6());
              		
            }
            otherlv_11=(Token)match(input,56,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getIfEquationAccess().getIfKeyword_7());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getIfEquationRule());
              			}
              			newCompositeNode(grammarAccess.getIfEquationAccess().getDescriptionParserRuleCall_8());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_12=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_12;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_13=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getIfEquationAccess().getSemicolonKeyword_9());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 63, ruleIfEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfEquation"


    // $ANTLR start "entryRuleForEquation"
    // InternalMOloc.g:3273:1: entryRuleForEquation returns [EObject current=null] : iv_ruleForEquation= ruleForEquation EOF ;
    public final EObject entryRuleForEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleForEquation_StartIndex = input.index();
        EObject iv_ruleForEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // InternalMOloc.g:3273:52: (iv_ruleForEquation= ruleForEquation EOF )
            // InternalMOloc.g:3274:2: iv_ruleForEquation= ruleForEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForEquation=ruleForEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, entryRuleForEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForEquation"


    // $ANTLR start "ruleForEquation"
    // InternalMOloc.g:3280:1: ruleForEquation returns [EObject current=null] : (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_equations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
    public final EObject ruleForEquation() throws RecognitionException {
        EObject current = null;
        int ruleForEquation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_forIndices_1_0 = null;

        EObject lv_equations_3_0 = null;

        EObject this_description_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // InternalMOloc.g:3286:2: ( (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_equations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:3287:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_equations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:3287:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_equations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:3288:3: otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_equations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForEquationAccess().getForKeyword_0());
              		
            }
            // InternalMOloc.g:3292:3: ( (lv_forIndices_1_0= ruleForIndices ) )
            // InternalMOloc.g:3293:4: (lv_forIndices_1_0= ruleForIndices )
            {
            // InternalMOloc.g:3293:4: (lv_forIndices_1_0= ruleForIndices )
            // InternalMOloc.g:3294:5: lv_forIndices_1_0= ruleForIndices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForEquationAccess().getForIndicesForIndicesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_forIndices_1_0=ruleForIndices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForEquationRule());
              					}
              					set(
              						current,
              						"forIndices",
              						lv_forIndices_1_0,
              						"dut.control.moloc.MOloc.ForIndices");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForEquationAccess().getLoopKeyword_2());
              		
            }
            // InternalMOloc.g:3315:3: ( (lv_equations_3_0= ruleEquation ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==28) ) {
                    int LA72_1 = input.LA(2);

                    if ( (LA72_1==29||LA72_1==32||LA72_1==36||(LA72_1>=49 && LA72_1<=50)||(LA72_1>=69 && LA72_1<=70)||(LA72_1>=72 && LA72_1<=83)) ) {
                        alt72=1;
                    }


                }
                else if ( ((LA72_0>=RULE_IDENT && LA72_0<=RULE_TRUE_FALSE)||LA72_0==24||LA72_0==31||(LA72_0>=36 && LA72_0<=37)||LA72_0==41||LA72_0==51||LA72_0==56||LA72_0==58||LA72_0==63||(LA72_0>=65 && LA72_0<=66)||LA72_0==71||(LA72_0>=78 && LA72_0<=80)||LA72_0==84) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalMOloc.g:3316:4: (lv_equations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3316:4: (lv_equations_3_0= ruleEquation )
            	    // InternalMOloc.g:3317:5: lv_equations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForEquationAccess().getEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_equations_3_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForEquationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"equations",
            	      						lv_equations_3_0,
            	      						"dut.control.moloc.MOloc.Equation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForEquationAccess().getEndKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,63,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForEquationAccess().getForKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getForEquationRule());
              			}
              			newCompositeNode(grammarAccess.getForEquationAccess().getDescriptionParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_6=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForEquationAccess().getSemicolonKeyword_7());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 65, ruleForEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForEquation"


    // $ANTLR start "entryRuleConnectEquation"
    // InternalMOloc.g:3364:1: entryRuleConnectEquation returns [EObject current=null] : iv_ruleConnectEquation= ruleConnectEquation EOF ;
    public final EObject entryRuleConnectEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleConnectEquation_StartIndex = input.index();
        EObject iv_ruleConnectEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // InternalMOloc.g:3364:56: (iv_ruleConnectEquation= ruleConnectEquation EOF )
            // InternalMOloc.g:3365:2: iv_ruleConnectEquation= ruleConnectEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnectEquation=ruleConnectEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnectEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, entryRuleConnectEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectEquation"


    // $ANTLR start "ruleConnectEquation"
    // InternalMOloc.g:3371:1: ruleConnectEquation returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
    public final EObject ruleConnectEquation() throws RecognitionException {
        EObject current = null;
        int ruleConnectEquation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_left_2_0 = null;

        AntlrDatatypeRuleToken lv_right_4_0 = null;

        EObject this_description_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // InternalMOloc.g:3377:2: ( (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:3378:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:3378:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:3379:3: otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectEquationAccess().getConnectKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectEquationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMOloc.g:3387:3: ( (lv_left_2_0= ruleComponent_reference ) )
            // InternalMOloc.g:3388:4: (lv_left_2_0= ruleComponent_reference )
            {
            // InternalMOloc.g:3388:4: (lv_left_2_0= ruleComponent_reference )
            // InternalMOloc.g:3389:5: lv_left_2_0= ruleComponent_reference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectEquationAccess().getLeftComponent_referenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_left_2_0=ruleComponent_reference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectEquationRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_2_0,
              						"dut.control.moloc.MOloc.Component_reference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConnectEquationAccess().getCommaKeyword_3());
              		
            }
            // InternalMOloc.g:3410:3: ( (lv_right_4_0= ruleComponent_reference ) )
            // InternalMOloc.g:3411:4: (lv_right_4_0= ruleComponent_reference )
            {
            // InternalMOloc.g:3411:4: (lv_right_4_0= ruleComponent_reference )
            // InternalMOloc.g:3412:5: lv_right_4_0= ruleComponent_reference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectEquationAccess().getRightComponent_referenceParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_right_4_0=ruleComponent_reference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConnectEquationRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_4_0,
              						"dut.control.moloc.MOloc.Component_reference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConnectEquationAccess().getRightParenthesisKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConnectEquationRule());
              			}
              			newCompositeNode(grammarAccess.getConnectEquationAccess().getDescriptionParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_6=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConnectEquationAccess().getSemicolonKeyword_7());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 67, ruleConnectEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConnectEquation"


    // $ANTLR start "entryRuleWhenEquation"
    // InternalMOloc.g:3455:1: entryRuleWhenEquation returns [EObject current=null] : iv_ruleWhenEquation= ruleWhenEquation EOF ;
    public final EObject entryRuleWhenEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleWhenEquation_StartIndex = input.index();
        EObject iv_ruleWhenEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // InternalMOloc.g:3455:53: (iv_ruleWhenEquation= ruleWhenEquation EOF )
            // InternalMOloc.g:3456:2: iv_ruleWhenEquation= ruleWhenEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhenEquation=ruleWhenEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhenEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, entryRuleWhenEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenEquation"


    // $ANTLR start "ruleWhenEquation"
    // InternalMOloc.g:3462:1: ruleWhenEquation returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* )? otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) ;
    public final EObject ruleWhenEquation() throws RecognitionException {
        EObject current = null;
        int ruleWhenEquation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_condition_1_0 = null;

        EObject lv_equations_3_0 = null;

        AntlrDatatypeRuleToken lv_elseCondition_5_0 = null;

        EObject lv_equations_7_0 = null;

        EObject this_description_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // InternalMOloc.g:3468:2: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* )? otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) )
            // InternalMOloc.g:3469:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* )? otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            {
            // InternalMOloc.g:3469:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* )? otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            // InternalMOloc.g:3470:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_equations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* )? otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhenEquationAccess().getWhenKeyword_0());
              		
            }
            // InternalMOloc.g:3474:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:3475:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:3475:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:3476:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhenEquationAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhenEquationRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"dut.control.moloc.MOloc.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhenEquationAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:3497:3: ( (lv_equations_3_0= ruleEquation ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==28) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==29||LA73_2==32||LA73_2==36||(LA73_2>=49 && LA73_2<=50)||(LA73_2>=69 && LA73_2<=70)||(LA73_2>=72 && LA73_2<=83)) ) {
                        alt73=1;
                    }


                }
                else if ( ((LA73_0>=RULE_IDENT && LA73_0<=RULE_TRUE_FALSE)||LA73_0==24||LA73_0==31||(LA73_0>=36 && LA73_0<=37)||LA73_0==41||LA73_0==51||LA73_0==56||LA73_0==58||LA73_0==63||(LA73_0>=65 && LA73_0<=66)||LA73_0==71||(LA73_0>=78 && LA73_0<=80)||LA73_0==84) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalMOloc.g:3498:4: (lv_equations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3498:4: (lv_equations_3_0= ruleEquation )
            	    // InternalMOloc.g:3499:5: lv_equations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhenEquationAccess().getEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_equations_3_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"equations",
            	      						lv_equations_3_0,
            	      						"dut.control.moloc.MOloc.Equation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalMOloc.g:3516:3: (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==67) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMOloc.g:3517:4: otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_equations_7_0= ruleEquation ) )*
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getWhenEquationAccess().getElsewhenKeyword_4_0());
                      			
                    }
                    // InternalMOloc.g:3521:4: ( (lv_elseCondition_5_0= ruleExpression ) )
                    // InternalMOloc.g:3522:5: (lv_elseCondition_5_0= ruleExpression )
                    {
                    // InternalMOloc.g:3522:5: (lv_elseCondition_5_0= ruleExpression )
                    // InternalMOloc.g:3523:6: lv_elseCondition_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWhenEquationAccess().getElseConditionExpressionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_53);
                    lv_elseCondition_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWhenEquationRule());
                      						}
                      						add(
                      							current,
                      							"elseCondition",
                      							lv_elseCondition_5_0,
                      							"dut.control.moloc.MOloc.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,60,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getWhenEquationAccess().getThenKeyword_4_2());
                      			
                    }
                    // InternalMOloc.g:3544:4: ( (lv_equations_7_0= ruleEquation ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==28) ) {
                            int LA74_1 = input.LA(2);

                            if ( (LA74_1==29||LA74_1==32||LA74_1==36||(LA74_1>=49 && LA74_1<=50)||(LA74_1>=69 && LA74_1<=70)||(LA74_1>=72 && LA74_1<=83)) ) {
                                alt74=1;
                            }


                        }
                        else if ( ((LA74_0>=RULE_IDENT && LA74_0<=RULE_TRUE_FALSE)||LA74_0==24||LA74_0==31||(LA74_0>=36 && LA74_0<=37)||LA74_0==41||LA74_0==51||LA74_0==56||LA74_0==58||LA74_0==63||(LA74_0>=65 && LA74_0<=66)||LA74_0==71||(LA74_0>=78 && LA74_0<=80)||LA74_0==84) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalMOloc.g:3545:5: (lv_equations_7_0= ruleEquation )
                    	    {
                    	    // InternalMOloc.g:3545:5: (lv_equations_7_0= ruleEquation )
                    	    // InternalMOloc.g:3546:6: lv_equations_7_0= ruleEquation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getWhenEquationAccess().getEquationsEquationParserRuleCall_4_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_56);
                    	    lv_equations_7_0=ruleEquation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getWhenEquationRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"equations",
                    	      							lv_equations_7_0,
                    	      							"dut.control.moloc.MOloc.Equation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getWhenEquationAccess().getEndKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,66,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getWhenEquationAccess().getWhenKeyword_6());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getWhenEquationRule());
              			}
              			newCompositeNode(grammarAccess.getWhenEquationAccess().getDescriptionParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_10=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_10;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getWhenEquationAccess().getSemicolonKeyword_8());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 69, ruleWhenEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhenEquation"


    // $ANTLR start "entryRuleFunctionEquation"
    // InternalMOloc.g:3594:1: entryRuleFunctionEquation returns [EObject current=null] : iv_ruleFunctionEquation= ruleFunctionEquation EOF ;
    public final EObject entryRuleFunctionEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionEquation_StartIndex = input.index();
        EObject iv_ruleFunctionEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // InternalMOloc.g:3594:57: (iv_ruleFunctionEquation= ruleFunctionEquation EOF )
            // InternalMOloc.g:3595:2: iv_ruleFunctionEquation= ruleFunctionEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionEquationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionEquation=ruleFunctionEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionEquation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, entryRuleFunctionEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionEquation"


    // $ANTLR start "ruleFunctionEquation"
    // InternalMOloc.g:3601:1: ruleFunctionEquation returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' ) ;
    public final EObject ruleFunctionEquation() throws RecognitionException {
        EObject current = null;
        int ruleFunctionEquation_StartIndex = input.index();
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_component_0_0 = null;

        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject this_description_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // InternalMOloc.g:3607:2: ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' ) )
            // InternalMOloc.g:3608:2: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' )
            {
            // InternalMOloc.g:3608:2: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' )
            // InternalMOloc.g:3609:3: ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';'
            {
            // InternalMOloc.g:3609:3: ( (lv_component_0_0= ruleComponent_reference ) )
            // InternalMOloc.g:3610:4: (lv_component_0_0= ruleComponent_reference )
            {
            // InternalMOloc.g:3610:4: (lv_component_0_0= ruleComponent_reference )
            // InternalMOloc.g:3611:5: lv_component_0_0= ruleComponent_reference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionEquationAccess().getComponentComponent_referenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_component_0_0=ruleComponent_reference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionEquationRule());
              					}
              					set(
              						current,
              						"component",
              						lv_component_0_0,
              						"dut.control.moloc.MOloc.Component_reference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:3628:3: ( (lv_function_1_0= ruleFunctionCallArgs ) )
            // InternalMOloc.g:3629:4: (lv_function_1_0= ruleFunctionCallArgs )
            {
            // InternalMOloc.g:3629:4: (lv_function_1_0= ruleFunctionCallArgs )
            // InternalMOloc.g:3630:5: lv_function_1_0= ruleFunctionCallArgs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionEquationAccess().getFunctionFunctionCallArgsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_function_1_0=ruleFunctionCallArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionEquationRule());
              					}
              					set(
              						current,
              						"function",
              						lv_function_1_0,
              						"dut.control.moloc.MOloc.FunctionCallArgs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getFunctionEquationRule());
              			}
              			newCompositeNode(grammarAccess.getFunctionEquationAccess().getDescriptionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_2=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_2;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionEquationAccess().getSemicolonKeyword_3());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 71, ruleFunctionEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionEquation"


    // $ANTLR start "entryRuleNULLElement"
    // InternalMOloc.g:3669:1: entryRuleNULLElement returns [EObject current=null] : iv_ruleNULLElement= ruleNULLElement EOF ;
    public final EObject entryRuleNULLElement() throws RecognitionException {
        EObject current = null;
        int entryRuleNULLElement_StartIndex = input.index();
        EObject iv_ruleNULLElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // InternalMOloc.g:3669:52: (iv_ruleNULLElement= ruleNULLElement EOF )
            // InternalMOloc.g:3670:2: iv_ruleNULLElement= ruleNULLElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNULLElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNULLElement=ruleNULLElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNULLElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, entryRuleNULLElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNULLElement"


    // $ANTLR start "ruleNULLElement"
    // InternalMOloc.g:3676:1: ruleNULLElement returns [EObject current=null] : (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) ) ;
    public final EObject ruleNULLElement() throws RecognitionException {
        EObject current = null;
        int ruleNULLElement_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nullname_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // InternalMOloc.g:3682:2: ( (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) ) )
            // InternalMOloc.g:3683:2: (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) )
            {
            // InternalMOloc.g:3683:2: (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) )
            // InternalMOloc.g:3684:3: otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNULLElementAccess().getNullElementKeyword_0());
              		
            }
            // InternalMOloc.g:3688:3: ( (lv_nullname_1_0= ruleName ) )
            // InternalMOloc.g:3689:4: (lv_nullname_1_0= ruleName )
            {
            // InternalMOloc.g:3689:4: (lv_nullname_1_0= ruleName )
            // InternalMOloc.g:3690:5: lv_nullname_1_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNULLElementAccess().getNullnameNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_nullname_1_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNULLElementRule());
              					}
              					set(
              						current,
              						"nullname",
              						lv_nullname_1_0,
              						"dut.control.moloc.MOloc.Name");
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
            if ( state.backtracking>0 ) { memoize(input, 73, ruleNULLElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNULLElement"


    // $ANTLR start "entryRuleExpression"
    // InternalMOloc.g:3711:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;
        int entryRuleExpression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // InternalMOloc.g:3711:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMOloc.g:3712:2: iv_ruleExpression= ruleExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 74, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMOloc.g:3718:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExpression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Simple_expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;

        AntlrDatatypeRuleToken this_Expression_4 = null;

        AntlrDatatypeRuleToken this_Expression_6 = null;

        AntlrDatatypeRuleToken this_Expression_8 = null;

        AntlrDatatypeRuleToken this_Expression_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // InternalMOloc.g:3724:2: ( (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) )
            // InternalMOloc.g:3725:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            {
            // InternalMOloc.g:3725:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_IDENT && LA77_0<=RULE_TRUE_FALSE)||LA77_0==24||LA77_0==28||LA77_0==31||(LA77_0>=36 && LA77_0<=37)||LA77_0==41||LA77_0==51||LA77_0==58||LA77_0==71||(LA77_0>=78 && LA77_0<=80)||LA77_0==84) ) {
                alt77=1;
            }
            else if ( (LA77_0==56) ) {
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
                    // InternalMOloc.g:3726:3: this_Simple_expression_0= ruleSimple_expression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getSimple_expressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Simple_expression_0=ruleSimple_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Simple_expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:3737:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    {
                    // InternalMOloc.g:3737:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    // InternalMOloc.g:3738:4: kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression
                    {
                    kw=(Token)match(input,56,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getIfKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,60,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_63);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:3768:4: (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==61) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalMOloc.g:3769:5: kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression
                    	    {
                    	    kw=(Token)match(input,61,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getExpressionAccess().getElseifKeyword_1_4_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_4_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_53);
                    	    this_Expression_6=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_Expression_6);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    kw=(Token)match(input,60,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_4_2());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_4_3());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_63);
                    	    this_Expression_8=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_Expression_8);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    kw=(Token)match(input,62,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getElseKeyword_1_5());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_10=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

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
            if ( state.backtracking>0 ) { memoize(input, 75, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSimple_expression"
    // InternalMOloc.g:3820:1: entryRuleSimple_expression returns [String current=null] : iv_ruleSimple_expression= ruleSimple_expression EOF ;
    public final String entryRuleSimple_expression() throws RecognitionException {
        String current = null;
        int entryRuleSimple_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSimple_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // InternalMOloc.g:3820:57: (iv_ruleSimple_expression= ruleSimple_expression EOF )
            // InternalMOloc.g:3821:2: iv_ruleSimple_expression= ruleSimple_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimple_expression=ruleSimple_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimple_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, entryRuleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSimple_expression"


    // $ANTLR start "ruleSimple_expression"
    // InternalMOloc.g:3827:1: ruleSimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? ) ;
    public final AntlrDatatypeRuleToken ruleSimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSimple_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_expression_0 = null;

        AntlrDatatypeRuleToken this_Logical_expression_2 = null;

        AntlrDatatypeRuleToken this_Logical_expression_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // InternalMOloc.g:3833:2: ( (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? ) )
            // InternalMOloc.g:3834:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? )
            {
            // InternalMOloc.g:3834:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? )
            // InternalMOloc.g:3835:3: this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_64);
            this_Logical_expression_0=ruleLogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3845:3: (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==32) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMOloc.g:3846:4: kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )
                    {
                    kw=(Token)match(input,32,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_66);
                    this_Logical_expression_2=ruleLogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Logical_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:3861:4: (kw= ':' this_Logical_expression_4= ruleLogical_expression )
                    // InternalMOloc.g:3862:5: kw= ':' this_Logical_expression_4= ruleLogical_expression
                    {
                    kw=(Token)match(input,32,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getColonKeyword_1_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_1_2_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_Logical_expression_4=ruleLogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Logical_expression_4);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
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
            if ( state.backtracking>0 ) { memoize(input, 77, ruleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSimple_expression"


    // $ANTLR start "entryRuleLogical_expression"
    // InternalMOloc.g:3883:1: entryRuleLogical_expression returns [String current=null] : iv_ruleLogical_expression= ruleLogical_expression EOF ;
    public final String entryRuleLogical_expression() throws RecognitionException {
        String current = null;
        int entryRuleLogical_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // InternalMOloc.g:3883:58: (iv_ruleLogical_expression= ruleLogical_expression EOF )
            // InternalMOloc.g:3884:2: iv_ruleLogical_expression= ruleLogical_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogical_expression=ruleLogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, entryRuleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_expression"


    // $ANTLR start "ruleLogical_expression"
    // InternalMOloc.g:3890:1: ruleLogical_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_term_0 = null;

        AntlrDatatypeRuleToken this_Logical_term_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // InternalMOloc.g:3896:2: ( (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) )
            // InternalMOloc.g:3897:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            {
            // InternalMOloc.g:3897:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            // InternalMOloc.g:3898:3: this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_Logical_term_0=ruleLogical_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_term_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3908:3: (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==69) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMOloc.g:3909:4: kw= 'or' this_Logical_term_2= ruleLogical_term
            	    {
            	    kw=(Token)match(input,69,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_expressionAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_67);
            	    this_Logical_term_2=ruleLogical_term();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Logical_term_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
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
            if ( state.backtracking>0 ) { memoize(input, 79, ruleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_expression"


    // $ANTLR start "entryRuleLogical_term"
    // InternalMOloc.g:3929:1: entryRuleLogical_term returns [String current=null] : iv_ruleLogical_term= ruleLogical_term EOF ;
    public final String entryRuleLogical_term() throws RecognitionException {
        String current = null;
        int entryRuleLogical_term_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_term = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // InternalMOloc.g:3929:52: (iv_ruleLogical_term= ruleLogical_term EOF )
            // InternalMOloc.g:3930:2: iv_ruleLogical_term= ruleLogical_term EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_termRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogical_term=ruleLogical_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_term.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, entryRuleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_term"


    // $ANTLR start "ruleLogical_term"
    // InternalMOloc.g:3936:1: ruleLogical_term returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_term() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_term_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_factor_0 = null;

        AntlrDatatypeRuleToken this_Logical_factor_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // InternalMOloc.g:3942:2: ( (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) )
            // InternalMOloc.g:3943:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            {
            // InternalMOloc.g:3943:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            // InternalMOloc.g:3944:3: this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_Logical_factor_0=ruleLogical_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3954:3: (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==70) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalMOloc.g:3955:4: kw= 'and' this_Logical_factor_2= ruleLogical_factor
            	    {
            	    kw=(Token)match(input,70,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_termAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_68);
            	    this_Logical_factor_2=ruleLogical_factor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Logical_factor_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
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
            if ( state.backtracking>0 ) { memoize(input, 81, ruleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_term"


    // $ANTLR start "entryRuleLogical_factor"
    // InternalMOloc.g:3975:1: entryRuleLogical_factor returns [String current=null] : iv_ruleLogical_factor= ruleLogical_factor EOF ;
    public final String entryRuleLogical_factor() throws RecognitionException {
        String current = null;
        int entryRuleLogical_factor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_factor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // InternalMOloc.g:3975:54: (iv_ruleLogical_factor= ruleLogical_factor EOF )
            // InternalMOloc.g:3976:2: iv_ruleLogical_factor= ruleLogical_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_factorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogical_factor=ruleLogical_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_factor.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, entryRuleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_factor"


    // $ANTLR start "ruleLogical_factor"
    // InternalMOloc.g:3982:1: ruleLogical_factor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' )? this_Relation_1= ruleRelation ) ;
    public final AntlrDatatypeRuleToken ruleLogical_factor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_factor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Relation_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // InternalMOloc.g:3988:2: ( ( (kw= 'not' )? this_Relation_1= ruleRelation ) )
            // InternalMOloc.g:3989:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            {
            // InternalMOloc.g:3989:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            // InternalMOloc.g:3990:3: (kw= 'not' )? this_Relation_1= ruleRelation
            {
            // InternalMOloc.g:3990:3: (kw= 'not' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==71) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMOloc.g:3991:4: kw= 'not'
                    {
                    kw=(Token)match(input,71,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLogical_factorAccess().getNotKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_factorAccess().getRelationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Relation_1=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Relation_1);
              		
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
            if ( state.backtracking>0 ) { memoize(input, 83, ruleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_factor"


    // $ANTLR start "entryRuleRelation"
    // InternalMOloc.g:4011:1: entryRuleRelation returns [String current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final String entryRuleRelation() throws RecognitionException {
        String current = null;
        int entryRuleRelation_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleRelation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // InternalMOloc.g:4011:48: (iv_ruleRelation= ruleRelation EOF )
            // InternalMOloc.g:4012:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, entryRuleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMOloc.g:4018:1: ruleRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleRelation_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Arithmetic_expression_0 = null;

        AntlrDatatypeRuleToken this_Arithmetic_expression_7 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // InternalMOloc.g:4024:2: ( (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) )
            // InternalMOloc.g:4025:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            {
            // InternalMOloc.g:4025:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            // InternalMOloc.g:4026:3: this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationAccess().getArithmetic_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_69);
            this_Arithmetic_expression_0=ruleArithmetic_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Arithmetic_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4036:3: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=72 && LA83_0<=77)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMOloc.g:4037:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression
                    {
                    // InternalMOloc.g:4037:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
                    int alt82=6;
                    switch ( input.LA(1) ) {
                    case 72:
                        {
                        alt82=1;
                        }
                        break;
                    case 73:
                        {
                        alt82=2;
                        }
                        break;
                    case 74:
                        {
                        alt82=3;
                        }
                        break;
                    case 75:
                        {
                        alt82=4;
                        }
                        break;
                    case 76:
                        {
                        alt82=5;
                        }
                        break;
                    case 77:
                        {
                        alt82=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }

                    switch (alt82) {
                        case 1 :
                            // InternalMOloc.g:4038:5: kw= '<'
                            {
                            kw=(Token)match(input,72,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:4044:5: kw= '<='
                            {
                            kw=(Token)match(input,73,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMOloc.g:4050:5: kw= '>'
                            {
                            kw=(Token)match(input,74,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalMOloc.g:4056:5: kw= '>='
                            {
                            kw=(Token)match(input,75,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalMOloc.g:4062:5: kw= '=='
                            {
                            kw=(Token)match(input,76,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalMOloc.g:4068:5: kw= '<>'
                            {
                            kw=(Token)match(input,77,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignGreaterThanSignKeyword_1_0_5());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRelationAccess().getArithmetic_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Arithmetic_expression_7=ruleArithmetic_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Arithmetic_expression_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

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
            if ( state.backtracking>0 ) { memoize(input, 85, ruleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleArithmetic_expression"
    // InternalMOloc.g:4089:1: entryRuleArithmetic_expression returns [String current=null] : iv_ruleArithmetic_expression= ruleArithmetic_expression EOF ;
    public final String entryRuleArithmetic_expression() throws RecognitionException {
        String current = null;
        int entryRuleArithmetic_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArithmetic_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // InternalMOloc.g:4089:61: (iv_ruleArithmetic_expression= ruleArithmetic_expression EOF )
            // InternalMOloc.g:4090:2: iv_ruleArithmetic_expression= ruleArithmetic_expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmetic_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmetic_expression=ruleArithmetic_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmetic_expression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, entryRuleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmetic_expression"


    // $ANTLR start "ruleArithmetic_expression"
    // InternalMOloc.g:4096:1: ruleArithmetic_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) ;
    public final AntlrDatatypeRuleToken ruleArithmetic_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArithmetic_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Term_4 = null;

        AntlrDatatypeRuleToken this_Term_9 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // InternalMOloc.g:4102:2: ( ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) )
            // InternalMOloc.g:4103:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            {
            // InternalMOloc.g:4103:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            // InternalMOloc.g:4104:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            {
            // InternalMOloc.g:4104:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )?
            int alt84=5;
            switch ( input.LA(1) ) {
                case 36:
                    {
                    alt84=1;
                    }
                    break;
                case 78:
                    {
                    alt84=2;
                    }
                    break;
                case 79:
                    {
                    alt84=3;
                    }
                    break;
                case 80:
                    {
                    alt84=4;
                    }
                    break;
            }

            switch (alt84) {
                case 1 :
                    // InternalMOloc.g:4105:4: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:4111:4: kw= '-'
                    {
                    kw=(Token)match(input,78,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:4117:4: kw= '.+'
                    {
                    kw=(Token)match(input,79,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:4123:4: kw= '.-'
                    {
                    kw=(Token)match(input,80,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopHyphenMinusKeyword_0_3());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithmetic_expressionAccess().getTermParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_70);
            this_Term_4=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Term_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4139:3: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==36||(LA86_0>=78 && LA86_0<=80)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalMOloc.g:4140:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm
            	    {
            	    // InternalMOloc.g:4140:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            	    int alt85=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt85=1;
            	        }
            	        break;
            	    case 78:
            	        {
            	        alt85=2;
            	        }
            	        break;
            	    case 79:
            	        {
            	        alt85=3;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt85=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 85, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt85) {
            	        case 1 :
            	            // InternalMOloc.g:4141:5: kw= '+'
            	            {
            	            kw=(Token)match(input,36,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_2_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:4147:5: kw= '-'
            	            {
            	            kw=(Token)match(input,78,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_2_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:4153:5: kw= '.+'
            	            {
            	            kw=(Token)match(input,79,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_2_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:4159:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,80,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopHyphenMinusKeyword_2_0_3());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getArithmetic_expressionAccess().getTermParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_70);
            	    this_Term_9=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Term_9);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
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
            if ( state.backtracking>0 ) { memoize(input, 87, ruleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithmetic_expression"


    // $ANTLR start "entryRuleTerm"
    // InternalMOloc.g:4180:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;
        int entryRuleTerm_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // InternalMOloc.g:4180:44: (iv_ruleTerm= ruleTerm EOF )
            // InternalMOloc.g:4181:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, entryRuleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMOloc.g:4187:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTerm_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_0 = null;

        AntlrDatatypeRuleToken this_Factor_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // InternalMOloc.g:4193:2: ( (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) )
            // InternalMOloc.g:4194:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            {
            // InternalMOloc.g:4194:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            // InternalMOloc.g:4195:3: this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_71);
            this_Factor_0=ruleFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4205:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            loop88:
            do {
                int alt88=2;
                alt88 = dfa88.predict(input);
                switch (alt88) {
            	case 1 :
            	    // InternalMOloc.g:4206:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
            	    {
            	    // InternalMOloc.g:4206:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
            	    int alt87=4;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt87=1;
            	        }
            	        break;
            	    case 81:
            	        {
            	        alt87=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt87=3;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt87=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 87, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt87) {
            	        case 1 :
            	            // InternalMOloc.g:4207:5: kw= '*'
            	            {
            	            kw=(Token)match(input,50,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:4213:5: kw= '/'
            	            {
            	            kw=(Token)match(input,81,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:4219:5: kw= '.*'
            	            {
            	            kw=(Token)match(input,49,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getFullStopAsteriskKeyword_1_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:4225:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,80,FOLLOW_65); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getFullStopHyphenMinusKeyword_1_0_3());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_71);
            	    this_Factor_5=ruleFactor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Factor_5);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop88;
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
            if ( state.backtracking>0 ) { memoize(input, 89, ruleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMOloc.g:4246:1: entryRuleFactor returns [String current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final String entryRuleFactor() throws RecognitionException {
        String current = null;
        int entryRuleFactor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFactor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // InternalMOloc.g:4246:46: (iv_ruleFactor= ruleFactor EOF )
            // InternalMOloc.g:4247:2: iv_ruleFactor= ruleFactor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactor.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, entryRuleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMOloc.g:4253:1: ruleFactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) ;
    public final AntlrDatatypeRuleToken ruleFactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFactor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Primary_0 = null;

        AntlrDatatypeRuleToken this_Primary_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // InternalMOloc.g:4259:2: ( (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) )
            // InternalMOloc.g:4260:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            {
            // InternalMOloc.g:4260:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            // InternalMOloc.g:4261:3: this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_72);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Primary_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4271:3: ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=82 && LA90_0<=83)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMOloc.g:4272:4: (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary
                    {
                    // InternalMOloc.g:4272:4: (kw= '^' | kw= '.^' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==82) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==83) ) {
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
                            // InternalMOloc.g:4273:5: kw= '^'
                            {
                            kw=(Token)match(input,82,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFactorAccess().getCircumflexAccentKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:4279:5: kw= '.^'
                            {
                            kw=(Token)match(input,83,FOLLOW_65); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFactorAccess().getFullStopCircumflexAccentKeyword_1_0_1());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Primary_3=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Primary_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

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
            if ( state.backtracking>0 ) { memoize(input, 91, ruleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMOloc.g:4300:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;
        int entryRulePrimary_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // InternalMOloc.g:4300:47: (iv_rulePrimary= rulePrimary EOF )
            // InternalMOloc.g:4301:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, entryRulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMOloc.g:4307:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_Component_reference_8= ruleComponent_reference | (kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}' ) | kw= 'end' ) ;
    public final AntlrDatatypeRuleToken rulePrimary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int rulePrimary_StartIndex = input.index();
        Token this_UNSIGNED_NUMBER_0=null;
        Token this_STRING_1=null;
        Token this_TRUE_FALSE_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Component_reference_3 = null;

        AntlrDatatypeRuleToken this_FunctionCallArgs_7 = null;

        AntlrDatatypeRuleToken this_Component_reference_8 = null;

        AntlrDatatypeRuleToken this_Expression_10 = null;

        AntlrDatatypeRuleToken this_Expression_12 = null;

        AntlrDatatypeRuleToken this_Expression_15 = null;

        AntlrDatatypeRuleToken this_Expression_17 = null;

        AntlrDatatypeRuleToken this_ArrayArguments_20 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // InternalMOloc.g:4313:2: ( (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_Component_reference_8= ruleComponent_reference | (kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}' ) | kw= 'end' ) )
            // InternalMOloc.g:4314:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_Component_reference_8= ruleComponent_reference | (kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}' ) | kw= 'end' )
            {
            // InternalMOloc.g:4314:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_Component_reference_8= ruleComponent_reference | (kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}' ) | kw= 'end' )
            int alt93=9;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalMOloc.g:4315:3: this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER
                    {
                    this_UNSIGNED_NUMBER_0=(Token)match(input,RULE_UNSIGNED_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UNSIGNED_NUMBER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_UNSIGNED_NUMBER_0, grammarAccess.getPrimaryAccess().getUNSIGNED_NUMBERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:4323:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_1, grammarAccess.getPrimaryAccess().getSTRINGTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:4331:3: this_TRUE_FALSE_2= RULE_TRUE_FALSE
                    {
                    this_TRUE_FALSE_2=(Token)match(input,RULE_TRUE_FALSE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TRUE_FALSE_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TRUE_FALSE_2, grammarAccess.getPrimaryAccess().getTRUE_FALSETerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:4339:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
                    {
                    // InternalMOloc.g:4339:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
                    // InternalMOloc.g:4340:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs
                    {
                    // InternalMOloc.g:4340:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' )
                    int alt91=4;
                    switch ( input.LA(1) ) {
                    case RULE_IDENT:
                    case 37:
                        {
                        alt91=1;
                        }
                        break;
                    case 84:
                        {
                        alt91=2;
                        }
                        break;
                    case 58:
                        {
                        alt91=3;
                        }
                        break;
                    case 24:
                        {
                        alt91=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }

                    switch (alt91) {
                        case 1 :
                            // InternalMOloc.g:4341:5: this_Component_reference_3= ruleComponent_reference
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getPrimaryAccess().getComponent_referenceParserRuleCall_3_0_0());
                              				
                            }
                            pushFollow(FOLLOW_16);
                            this_Component_reference_3=ruleComponent_reference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Component_reference_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:4352:5: kw= 'der'
                            {
                            kw=(Token)match(input,84,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryAccess().getDerKeyword_3_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMOloc.g:4358:5: kw= 'initial'
                            {
                            kw=(Token)match(input,58,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryAccess().getInitialKeyword_3_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalMOloc.g:4364:5: kw= 'pure'
                            {
                            kw=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryAccess().getPureKeyword_3_0_3());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionCallArgsParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCallArgs_7=ruleFunctionCallArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionCallArgs_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMOloc.g:4382:3: this_Component_reference_8= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getComponent_referenceParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Component_reference_8=ruleComponent_reference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Component_reference_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMOloc.g:4393:3: (kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')' )
                    {
                    // InternalMOloc.g:4393:3: (kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')' )
                    // InternalMOloc.g:4394:4: kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')'
                    {
                    kw=(Token)match(input,31,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    // InternalMOloc.g:4399:4: (this_Expression_10= ruleExpression )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( ((LA92_0>=RULE_IDENT && LA92_0<=RULE_TRUE_FALSE)||LA92_0==24||LA92_0==28||LA92_0==31||(LA92_0>=36 && LA92_0<=37)||LA92_0==41||LA92_0==51||LA92_0==56||LA92_0==58||LA92_0==71||(LA92_0>=78 && LA92_0<=80)||LA92_0==84) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalMOloc.g:4400:5: this_Expression_10= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_5_1());
                              				
                            }
                            pushFollow(FOLLOW_20);
                            this_Expression_10=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Expression_10);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    // InternalMOloc.g:4411:4: (kw= ',' this_Expression_12= ruleExpression )
                    // InternalMOloc.g:4412:5: kw= ',' this_Expression_12= ruleExpression
                    {
                    kw=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getPrimaryAccess().getCommaKeyword_5_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_5_2_1());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    this_Expression_12=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_12);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMOloc.g:4435:3: (kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']' )
                    {
                    // InternalMOloc.g:4435:3: (kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']' )
                    // InternalMOloc.g:4436:4: kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']'
                    {
                    kw=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_20);
                    this_Expression_15=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:4451:4: (kw= ',' this_Expression_17= ruleExpression )
                    // InternalMOloc.g:4452:5: kw= ',' this_Expression_17= ruleExpression
                    {
                    kw=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getPrimaryAccess().getCommaKeyword_6_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_6_2_1());
                      				
                    }
                    pushFollow(FOLLOW_74);
                    this_Expression_17=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_17);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMOloc.g:4475:3: (kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}' )
                    {
                    // InternalMOloc.g:4475:3: (kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}' )
                    // InternalMOloc.g:4476:4: kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}'
                    {
                    kw=(Token)match(input,51,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getArrayArgumentsParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_75);
                    this_ArrayArguments_20=ruleArrayArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayArguments_20);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightCurlyBracketKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMOloc.g:4498:3: kw= 'end'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryAccess().getEndKeyword_8());
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 93, rulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleArrayArguments"
    // InternalMOloc.g:4507:1: entryRuleArrayArguments returns [String current=null] : iv_ruleArrayArguments= ruleArrayArguments EOF ;
    public final String entryRuleArrayArguments() throws RecognitionException {
        String current = null;
        int entryRuleArrayArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // InternalMOloc.g:4507:54: (iv_ruleArrayArguments= ruleArrayArguments EOF )
            // InternalMOloc.g:4508:2: iv_ruleArrayArguments= ruleArrayArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayArguments=ruleArrayArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayArguments.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, entryRuleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArguments"


    // $ANTLR start "ruleArrayArguments"
    // InternalMOloc.g:4514:1: ruleArrayArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_ForIndices_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // InternalMOloc.g:4520:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) )
            // InternalMOloc.g:4521:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            {
            // InternalMOloc.g:4521:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            // InternalMOloc.g:4522:3: this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayArgumentsAccess().getExpressionParserRuleCall_0());
              		
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
            // InternalMOloc.g:4532:3: ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==35) ) {
                alt94=1;
            }
            else if ( (LA94_0==63) ) {
                alt94=2;
            }
            switch (alt94) {
                case 1 :
                    // InternalMOloc.g:4533:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    {
                    // InternalMOloc.g:4533:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    // InternalMOloc.g:4534:5: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getArrayArgumentsAccess().getCommaKeyword_1_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayArgumentsAccess().getArrayArgumentsNonFirstParserRuleCall_1_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayArgumentsNonFirst_2=ruleArrayArgumentsNonFirst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ArrayArgumentsNonFirst_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:4551:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    {
                    // InternalMOloc.g:4551:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    // InternalMOloc.g:4552:5: kw= 'for' this_ForIndices_4= ruleForIndices
                    {
                    kw=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getArrayArgumentsAccess().getForKeyword_1_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayArgumentsAccess().getForIndicesParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_ForIndices_4=ruleForIndices();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ForIndices_4);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
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
            if ( state.backtracking>0 ) { memoize(input, 95, ruleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArguments"


    // $ANTLR start "entryRuleArrayArgumentsNonFirst"
    // InternalMOloc.g:4573:1: entryRuleArrayArgumentsNonFirst returns [String current=null] : iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF ;
    public final String entryRuleArrayArgumentsNonFirst() throws RecognitionException {
        String current = null;
        int entryRuleArrayArgumentsNonFirst_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArgumentsNonFirst = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // InternalMOloc.g:4573:62: (iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF )
            // InternalMOloc.g:4574:2: iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayArgumentsNonFirstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayArgumentsNonFirst=ruleArrayArgumentsNonFirst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayArgumentsNonFirst.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, entryRuleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArgumentsNonFirst"


    // $ANTLR start "ruleArrayArgumentsNonFirst"
    // InternalMOloc.g:4580:1: ruleArrayArgumentsNonFirst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArgumentsNonFirst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArgumentsNonFirst_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // InternalMOloc.g:4586:2: ( (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) )
            // InternalMOloc.g:4587:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            {
            // InternalMOloc.g:4587:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            // InternalMOloc.g:4588:3: this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayArgumentsNonFirstAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4598:3: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==35) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalMOloc.g:4599:4: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArrayArgumentsNonFirstAccess().getCommaKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getArrayArgumentsNonFirstAccess().getArrayArgumentsNonFirstParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayArgumentsNonFirst_2=ruleArrayArgumentsNonFirst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayArgumentsNonFirst_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

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
            if ( state.backtracking>0 ) { memoize(input, 97, ruleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArgumentsNonFirst"


    // $ANTLR start "entryRuleForIndices"
    // InternalMOloc.g:4619:1: entryRuleForIndices returns [String current=null] : iv_ruleForIndices= ruleForIndices EOF ;
    public final String entryRuleForIndices() throws RecognitionException {
        String current = null;
        int entryRuleForIndices_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndices = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // InternalMOloc.g:4619:50: (iv_ruleForIndices= ruleForIndices EOF )
            // InternalMOloc.g:4620:2: iv_ruleForIndices= ruleForIndices EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForIndicesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForIndices=ruleForIndices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIndices.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, entryRuleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndices"


    // $ANTLR start "ruleForIndices"
    // InternalMOloc.g:4626:1: ruleForIndices returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) ;
    public final AntlrDatatypeRuleToken ruleForIndices() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndices_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ForIndex_0 = null;

        AntlrDatatypeRuleToken this_ForIndex_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // InternalMOloc.g:4632:2: ( (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) )
            // InternalMOloc.g:4633:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            {
            // InternalMOloc.g:4633:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            // InternalMOloc.g:4634:3: this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForIndicesAccess().getForIndexParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_ForIndex_0=ruleForIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ForIndex_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4644:3: (kw= ',' this_ForIndex_2= ruleForIndex )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==35) ) {
                    int LA96_2 = input.LA(2);

                    if ( (LA96_2==RULE_IDENT) ) {
                        int LA96_3 = input.LA(3);

                        if ( (synpred130_InternalMOloc()) ) {
                            alt96=1;
                        }


                    }


                }


                switch (alt96) {
            	case 1 :
            	    // InternalMOloc.g:4645:4: kw= ',' this_ForIndex_2= ruleForIndex
            	    {
            	    kw=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getForIndicesAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getForIndicesAccess().getForIndexParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_26);
            	    this_ForIndex_2=ruleForIndex();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ForIndex_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop96;
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
            if ( state.backtracking>0 ) { memoize(input, 99, ruleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndices"


    // $ANTLR start "entryRuleForIndex"
    // InternalMOloc.g:4665:1: entryRuleForIndex returns [String current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final String entryRuleForIndex() throws RecognitionException {
        String current = null;
        int entryRuleForIndex_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndex = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // InternalMOloc.g:4665:48: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalMOloc.g:4666:2: iv_ruleForIndex= ruleForIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForIndex=ruleForIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIndex.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, entryRuleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndex"


    // $ANTLR start "ruleForIndex"
    // InternalMOloc.g:4672:1: ruleForIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleForIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndex_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // InternalMOloc.g:4678:2: ( (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) )
            // InternalMOloc.g:4679:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            {
            // InternalMOloc.g:4679:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            // InternalMOloc.g:4680:3: this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )?
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getForIndexAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:4687:3: (kw= 'in' this_Expression_2= ruleExpression )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==85) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalMOloc.g:4688:4: kw= 'in' this_Expression_2= ruleExpression
                    {
                    kw=(Token)match(input,85,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForIndexAccess().getInKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForIndexAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
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
            if ( state.backtracking>0 ) { memoize(input, 101, ruleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndex"


    // $ANTLR start "entryRuleComponent_reference"
    // InternalMOloc.g:4708:1: entryRuleComponent_reference returns [String current=null] : iv_ruleComponent_reference= ruleComponent_reference EOF ;
    public final String entryRuleComponent_reference() throws RecognitionException {
        String current = null;
        int entryRuleComponent_reference_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleComponent_reference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // InternalMOloc.g:4708:59: (iv_ruleComponent_reference= ruleComponent_reference EOF )
            // InternalMOloc.g:4709:2: iv_ruleComponent_reference= ruleComponent_reference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponent_referenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent_reference=ruleComponent_reference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent_reference.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, entryRuleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_reference"


    // $ANTLR start "ruleComponent_reference"
    // InternalMOloc.g:4715:1: ruleComponent_reference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleComponent_reference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleComponent_reference_StartIndex = input.index();
        Token kw=null;
        Token this_IDENT_1=null;
        Token this_IDENT_8=null;
        AntlrDatatypeRuleToken this_Subscript_3 = null;

        AntlrDatatypeRuleToken this_Subscript_5 = null;

        AntlrDatatypeRuleToken this_Subscript_10 = null;

        AntlrDatatypeRuleToken this_Subscript_12 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // InternalMOloc.g:4721:2: ( ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* ) )
            // InternalMOloc.g:4722:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* )
            {
            // InternalMOloc.g:4722:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* )
            // InternalMOloc.g:4723:3: (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )*
            {
            // InternalMOloc.g:4723:3: (kw= '.' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==37) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalMOloc.g:4724:4: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_1, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_1());
              		
            }
            // InternalMOloc.g:4737:3: (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==41) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalMOloc.g:4738:4: kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']'
                    {
                    kw=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_34);
                    this_Subscript_3=ruleSubscript();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Subscript_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:4753:4: (kw= ',' this_Subscript_5= ruleSubscript )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==35) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalMOloc.g:4754:5: kw= ',' this_Subscript_5= ruleSubscript
                    	    {
                    	    kw=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_2_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_34);
                    	    this_Subscript_5=ruleSubscript();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_Subscript_5);
                    	      				
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

                    kw=(Token)match(input,42,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:4776:3: (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==37) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalMOloc.g:4777:4: kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )?
            	    {
            	    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_3_0());
            	      			
            	    }
            	    this_IDENT_8=(Token)match(input,RULE_IDENT,FOLLOW_78); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_8);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_8, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_3_1());
            	      			
            	    }
            	    // InternalMOloc.g:4789:4: (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==41) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // InternalMOloc.g:4790:5: kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']'
            	            {
            	            kw=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getLeftSquareBracketKeyword_3_2_0());
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_3_2_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_34);
            	            this_Subscript_10=ruleSubscript();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_Subscript_10);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }
            	            // InternalMOloc.g:4805:5: (kw= ',' this_Subscript_12= ruleSubscript )*
            	            loop101:
            	            do {
            	                int alt101=2;
            	                int LA101_0 = input.LA(1);

            	                if ( (LA101_0==35) ) {
            	                    alt101=1;
            	                }


            	                switch (alt101) {
            	            	case 1 :
            	            	    // InternalMOloc.g:4806:6: kw= ',' this_Subscript_12= ruleSubscript
            	            	    {
            	            	    kw=(Token)match(input,35,FOLLOW_33); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      						current.merge(kw);
            	            	      						newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getCommaKeyword_3_2_2_0());
            	            	      					
            	            	    }
            	            	    if ( state.backtracking==0 ) {

            	            	      						newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_3_2_2_1());
            	            	      					
            	            	    }
            	            	    pushFollow(FOLLOW_34);
            	            	    this_Subscript_12=ruleSubscript();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      						current.merge(this_Subscript_12);
            	            	      					
            	            	    }
            	            	    if ( state.backtracking==0 ) {

            	            	      						afterParserOrEnumRuleCall();
            	            	      					
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop101;
            	                }
            	            } while (true);

            	            kw=(Token)match(input,42,FOLLOW_79); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getRightSquareBracketKeyword_3_2_3());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
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
            if ( state.backtracking>0 ) { memoize(input, 103, ruleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_reference"


    // $ANTLR start "entryRuleFunctionCallArgs"
    // InternalMOloc.g:4833:1: entryRuleFunctionCallArgs returns [String current=null] : iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF ;
    public final String entryRuleFunctionCallArgs() throws RecognitionException {
        String current = null;
        int entryRuleFunctionCallArgs_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionCallArgs = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // InternalMOloc.g:4833:56: (iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF )
            // InternalMOloc.g:4834:2: iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCallArgs=ruleFunctionCallArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallArgs.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, entryRuleFunctionCallArgs_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallArgs"


    // $ANTLR start "ruleFunctionCallArgs"
    // InternalMOloc.g:4840:1: ruleFunctionCallArgs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionCallArgs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionCallArgs_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // InternalMOloc.g:4846:2: ( (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' ) )
            // InternalMOloc.g:4847:2: (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' )
            {
            // InternalMOloc.g:4847:2: (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' )
            // InternalMOloc.g:4848:3: kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')'
            {
            kw=(Token)match(input,31,FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionCallArgsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMOloc.g:4853:3: (this_FunctionArguments_1= ruleFunctionArguments )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=RULE_IDENT && LA104_0<=RULE_TRUE_FALSE)||LA104_0==24||LA104_0==28||LA104_0==31||(LA104_0>=36 && LA104_0<=37)||LA104_0==41||LA104_0==51||LA104_0==56||LA104_0==58||LA104_0==71||(LA104_0>=78 && LA104_0<=80)||LA104_0==84||LA104_0==86) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalMOloc.g:4854:4: this_FunctionArguments_1= ruleFunctionArguments
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionCallArgsAccess().getFunctionArgumentsParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_FunctionArguments_1=ruleFunctionArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionArguments_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionCallArgsAccess().getRightParenthesisKeyword_2());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 105, ruleFunctionCallArgs_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallArgs"


    // $ANTLR start "entryRuleFunctionArguments"
    // InternalMOloc.g:4874:1: entryRuleFunctionArguments returns [String current=null] : iv_ruleFunctionArguments= ruleFunctionArguments EOF ;
    public final String entryRuleFunctionArguments() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // InternalMOloc.g:4874:57: (iv_ruleFunctionArguments= ruleFunctionArguments EOF )
            // InternalMOloc.g:4875:2: iv_ruleFunctionArguments= ruleFunctionArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionArguments=ruleFunctionArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArguments.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, entryRuleFunctionArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArguments"


    // $ANTLR start "ruleFunctionArguments"
    // InternalMOloc.g:4881:1: ruleFunctionArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments ) ;
    public final AntlrDatatypeRuleToken ruleFunctionArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_ForIndices_4 = null;

        AntlrDatatypeRuleToken this_FunctionPartialApplication_5 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_7 = null;

        AntlrDatatypeRuleToken this_NamedArguments_8 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // InternalMOloc.g:4887:2: ( ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments ) )
            // InternalMOloc.g:4888:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments )
            {
            // InternalMOloc.g:4888:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments )
            int alt107=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UNSIGNED_NUMBER:
            case RULE_TRUE_FALSE:
            case 24:
            case 28:
            case 31:
            case 36:
            case 37:
            case 41:
            case 51:
            case 56:
            case 58:
            case 71:
            case 78:
            case 79:
            case 80:
            case 84:
                {
                alt107=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA107_2 = input.LA(2);

                if ( (LA107_2==29) ) {
                    alt107=3;
                }
                else if ( (LA107_2==EOF||(LA107_2>=31 && LA107_2<=33)||(LA107_2>=35 && LA107_2<=37)||LA107_2==41||(LA107_2>=49 && LA107_2<=50)||LA107_2==63||(LA107_2>=69 && LA107_2<=70)||(LA107_2>=72 && LA107_2<=83)) ) {
                    alt107=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 2, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                alt107=2;
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
                    // InternalMOloc.g:4889:3: (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
                    {
                    // InternalMOloc.g:4889:3: (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
                    // InternalMOloc.g:4890:4: this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getExpressionParserRuleCall_0_0());
                      			
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
                    // InternalMOloc.g:4900:4: ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
                    int alt105=3;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==35) ) {
                        int LA105_1 = input.LA(2);

                        if ( (synpred139_InternalMOloc()) ) {
                            alt105=1;
                        }
                    }
                    else if ( (LA105_0==63) ) {
                        alt105=2;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalMOloc.g:4901:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
                            {
                            // InternalMOloc.g:4901:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
                            // InternalMOloc.g:4902:6: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getFunctionArgumentsAccess().getCommaKeyword_0_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getFunctionArgumentsNonFirstParserRuleCall_0_1_0_1());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_FunctionArgumentsNonFirst_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:4919:5: (kw= 'for' this_ForIndices_4= ruleForIndices )
                            {
                            // InternalMOloc.g:4919:5: (kw= 'for' this_ForIndices_4= ruleForIndices )
                            // InternalMOloc.g:4920:6: kw= 'for' this_ForIndices_4= ruleForIndices
                            {
                            kw=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getFunctionArgumentsAccess().getForKeyword_0_1_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getForIndicesParserRuleCall_0_1_1_1());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            this_ForIndices_4=ruleForIndices();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_ForIndices_4);
                              					
                            }
                            if ( state.backtracking==0 ) {

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
                    // InternalMOloc.g:4939:3: (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? )
                    {
                    // InternalMOloc.g:4939:3: (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? )
                    // InternalMOloc.g:4940:4: this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getFunctionPartialApplicationParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_FunctionPartialApplication_5=ruleFunctionPartialApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionPartialApplication_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:4950:4: (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==35) ) {
                        int LA106_1 = input.LA(2);

                        if ( (synpred142_InternalMOloc()) ) {
                            alt106=1;
                        }
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalMOloc.g:4951:5: kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFunctionArgumentsAccess().getCommaKeyword_1_1_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getFunctionArgumentsNonFirstParserRuleCall_1_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_FunctionArgumentsNonFirst_7=ruleFunctionArgumentsNonFirst();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_FunctionArgumentsNonFirst_7);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:4969:3: this_NamedArguments_8= ruleNamedArguments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getNamedArgumentsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NamedArguments_8=ruleNamedArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NamedArguments_8);
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 107, ruleFunctionArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArguments"


    // $ANTLR start "entryRuleFunctionArgumentsNonFirst"
    // InternalMOloc.g:4983:1: entryRuleFunctionArgumentsNonFirst returns [String current=null] : iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF ;
    public final String entryRuleFunctionArgumentsNonFirst() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArgumentsNonFirst_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArgumentsNonFirst = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // InternalMOloc.g:4983:65: (iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF )
            // InternalMOloc.g:4984:2: iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionArgumentsNonFirst=ruleFunctionArgumentsNonFirst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArgumentsNonFirst.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, entryRuleFunctionArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArgumentsNonFirst"


    // $ANTLR start "ruleFunctionArgumentsNonFirst"
    // InternalMOloc.g:4990:1: ruleFunctionArgumentsNonFirst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments ) ;
    public final AntlrDatatypeRuleToken ruleFunctionArgumentsNonFirst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionArgumentsNonFirst_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_0 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_NamedArguments_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // InternalMOloc.g:4996:2: ( ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments ) )
            // InternalMOloc.g:4997:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )
            {
            // InternalMOloc.g:4997:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )
            int alt109=2;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // InternalMOloc.g:4998:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
                    {
                    // InternalMOloc.g:4998:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
                    // InternalMOloc.g:4999:4: this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstAccess().getFunctionArgumentsParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_FunctionArguments_0=ruleFunctionArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionArguments_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:5009:4: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==35) ) {
                        int LA108_1 = input.LA(2);

                        if ( (synpred144_InternalMOloc()) ) {
                            alt108=1;
                        }
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalMOloc.g:5010:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFunctionArgumentsNonFirstAccess().getCommaKeyword_0_1_0());
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstAccess().getFunctionArgumentsNonFirstParserRuleCall_0_1_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_FunctionArgumentsNonFirst_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5028:3: this_NamedArguments_3= ruleNamedArguments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstAccess().getNamedArgumentsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NamedArguments_3=ruleNamedArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NamedArguments_3);
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 109, ruleFunctionArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArgumentsNonFirst"


    // $ANTLR start "entryRuleFunctionPartialApplication"
    // InternalMOloc.g:5042:1: entryRuleFunctionPartialApplication returns [String current=null] : iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF ;
    public final String entryRuleFunctionPartialApplication() throws RecognitionException {
        String current = null;
        int entryRuleFunctionPartialApplication_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionPartialApplication = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // InternalMOloc.g:5042:66: (iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF )
            // InternalMOloc.g:5043:2: iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionPartialApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionPartialApplication=ruleFunctionPartialApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionPartialApplication.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, entryRuleFunctionPartialApplication_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionPartialApplication"


    // $ANTLR start "ruleFunctionPartialApplication"
    // InternalMOloc.g:5049:1: ruleFunctionPartialApplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionPartialApplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionPartialApplication_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_NamedArguments_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // InternalMOloc.g:5055:2: ( (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' ) )
            // InternalMOloc.g:5056:2: (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' )
            {
            // InternalMOloc.g:5056:2: (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' )
            // InternalMOloc.g:5057:3: kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')'
            {
            kw=(Token)match(input,86,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionPartialApplicationAccess().getFunctionKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionPartialApplicationAccess().getTypeSpecifierParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_16);
            this_TypeSpecifier_1=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeSpecifier_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,31,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionPartialApplicationAccess().getLeftParenthesisKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionPartialApplicationAccess().getNamedArgumentsParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_18);
            this_NamedArguments_3=ruleNamedArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NamedArguments_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionPartialApplicationAccess().getRightParenthesisKeyword_4());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 111, ruleFunctionPartialApplication_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionPartialApplication"


    // $ANTLR start "entryRuleNamedArguments"
    // InternalMOloc.g:5096:1: entryRuleNamedArguments returns [String current=null] : iv_ruleNamedArguments= ruleNamedArguments EOF ;
    public final String entryRuleNamedArguments() throws RecognitionException {
        String current = null;
        int entryRuleNamedArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleNamedArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // InternalMOloc.g:5096:54: (iv_ruleNamedArguments= ruleNamedArguments EOF )
            // InternalMOloc.g:5097:2: iv_ruleNamedArguments= ruleNamedArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedArguments=ruleNamedArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedArguments.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, entryRuleNamedArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArguments"


    // $ANTLR start "ruleNamedArguments"
    // InternalMOloc.g:5103:1: ruleNamedArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument ) ) ;
    public final AntlrDatatypeRuleToken ruleNamedArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleNamedArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_NamedArgument_0 = null;

        AntlrDatatypeRuleToken this_NamedArgument_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // InternalMOloc.g:5109:2: ( (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument ) ) )
            // InternalMOloc.g:5110:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument ) )
            {
            // InternalMOloc.g:5110:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument ) )
            // InternalMOloc.g:5111:3: this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArgument_2= ruleNamedArgument )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNamedArgumentsAccess().getNamedArgumentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_NamedArgument_0=ruleNamedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NamedArgument_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5121:3: (kw= ',' this_NamedArgument_2= ruleNamedArgument )
            // InternalMOloc.g:5122:4: kw= ',' this_NamedArgument_2= ruleNamedArgument
            {
            kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getNamedArgumentsAccess().getCommaKeyword_1_0());
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNamedArgumentsAccess().getNamedArgumentParserRuleCall_1_1());
              			
            }
            pushFollow(FOLLOW_2);
            this_NamedArgument_2=ruleNamedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_NamedArgument_2);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
            if ( state.backtracking>0 ) { memoize(input, 113, ruleNamedArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamedArguments"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalMOloc.g:5142:1: entryRuleNamedArgument returns [String current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final String entryRuleNamedArgument() throws RecognitionException {
        String current = null;
        int entryRuleNamedArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleNamedArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // InternalMOloc.g:5142:53: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalMOloc.g:5143:2: iv_ruleNamedArgument= ruleNamedArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedArgument=ruleNamedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedArgument.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, entryRuleNamedArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalMOloc.g:5149:1: ruleNamedArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument ) ;
    public final AntlrDatatypeRuleToken ruleNamedArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleNamedArgument_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgument_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // InternalMOloc.g:5155:2: ( (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument ) )
            // InternalMOloc.g:5156:2: (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument )
            {
            // InternalMOloc.g:5156:2: (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument )
            // InternalMOloc.g:5157:3: this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getNamedArgumentAccess().getIDENTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,29,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNamedArgumentAccess().getFunctionArgumentParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_FunctionArgument_2=ruleFunctionArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FunctionArgument_2);
              		
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
            if ( state.backtracking>0 ) { memoize(input, 115, ruleNamedArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleFunctionArgument"
    // InternalMOloc.g:5183:1: entryRuleFunctionArgument returns [String current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final String entryRuleFunctionArgument() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // InternalMOloc.g:5183:56: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalMOloc.g:5184:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionArgument=ruleFunctionArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArgument.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, entryRuleFunctionArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // InternalMOloc.g:5190:1: ruleFunctionArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FunctionPartialApplication_0= ruleFunctionPartialApplication | this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleFunctionArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken this_FunctionPartialApplication_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // InternalMOloc.g:5196:2: ( (this_FunctionPartialApplication_0= ruleFunctionPartialApplication | this_Expression_1= ruleExpression ) )
            // InternalMOloc.g:5197:2: (this_FunctionPartialApplication_0= ruleFunctionPartialApplication | this_Expression_1= ruleExpression )
            {
            // InternalMOloc.g:5197:2: (this_FunctionPartialApplication_0= ruleFunctionPartialApplication | this_Expression_1= ruleExpression )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==86) ) {
                alt110=1;
            }
            else if ( ((LA110_0>=RULE_IDENT && LA110_0<=RULE_TRUE_FALSE)||LA110_0==24||LA110_0==28||LA110_0==31||(LA110_0>=36 && LA110_0<=37)||LA110_0==41||LA110_0==51||LA110_0==56||LA110_0==58||LA110_0==71||(LA110_0>=78 && LA110_0<=80)||LA110_0==84) ) {
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
                    // InternalMOloc.g:5198:3: this_FunctionPartialApplication_0= ruleFunctionPartialApplication
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionArgumentAccess().getFunctionPartialApplicationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionPartialApplication_0=ruleFunctionPartialApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FunctionPartialApplication_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5209:3: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Expression_1);
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 117, ruleFunctionArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleName"
    // InternalMOloc.g:5223:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;
        int entryRuleName_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // InternalMOloc.g:5223:44: (iv_ruleName= ruleName EOF )
            // InternalMOloc.g:5224:2: iv_ruleName= ruleName EOF
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
            if ( state.backtracking>0 ) { memoize(input, 118, entryRuleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMOloc.g:5230:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleName_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        Token this_IDENT_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // InternalMOloc.g:5236:2: ( (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) )
            // InternalMOloc.g:5237:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            {
            // InternalMOloc.g:5237:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            // InternalMOloc.g:5238:3: this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )*
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:5245:3: (kw= '.' this_IDENT_2= RULE_IDENT )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==37) ) {
                    int LA111_2 = input.LA(2);

                    if ( (LA111_2==RULE_IDENT) ) {
                        alt111=1;
                    }


                }


                switch (alt111) {
            	case 1 :
            	    // InternalMOloc.g:5246:4: kw= '.' this_IDENT_2= RULE_IDENT
            	    {
            	    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_2, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop111;
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
            if ( state.backtracking>0 ) { memoize(input, 119, ruleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleClassType"
    // InternalMOloc.g:5263:1: ruleClassType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) ;
    public final Enumerator ruleClassType() throws RecognitionException {
        Enumerator current = null;
        int ruleClassType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // InternalMOloc.g:5269:2: ( ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) )
            // InternalMOloc.g:5270:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            {
            // InternalMOloc.g:5270:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            int alt112=9;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt112=1;
                }
                break;
            case 88:
                {
                alt112=2;
                }
                break;
            case 89:
                {
                alt112=3;
                }
                break;
            case 90:
                {
                alt112=4;
                }
                break;
            case 91:
                {
                alt112=5;
                }
                break;
            case 92:
                {
                alt112=6;
                }
                break;
            case 93:
                {
                alt112=7;
                }
                break;
            case 94:
                {
                alt112=8;
                }
                break;
            case 86:
                {
                alt112=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalMOloc.g:5271:3: (enumLiteral_0= 'NULLClassType' )
                    {
                    // InternalMOloc.g:5271:3: (enumLiteral_0= 'NULLClassType' )
                    // InternalMOloc.g:5272:4: enumLiteral_0= 'NULLClassType'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getClassTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5279:3: (enumLiteral_1= 'class' )
                    {
                    // InternalMOloc.g:5279:3: (enumLiteral_1= 'class' )
                    // InternalMOloc.g:5280:4: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getClassTypeAccess().getClassEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:5287:3: (enumLiteral_2= 'model' )
                    {
                    // InternalMOloc.g:5287:3: (enumLiteral_2= 'model' )
                    // InternalMOloc.g:5288:4: enumLiteral_2= 'model'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getModelEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getClassTypeAccess().getModelEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMOloc.g:5295:3: (enumLiteral_3= 'record' )
                    {
                    // InternalMOloc.g:5295:3: (enumLiteral_3= 'record' )
                    // InternalMOloc.g:5296:4: enumLiteral_3= 'record'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getRecordEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getClassTypeAccess().getRecordEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMOloc.g:5303:3: (enumLiteral_4= 'block' )
                    {
                    // InternalMOloc.g:5303:3: (enumLiteral_4= 'block' )
                    // InternalMOloc.g:5304:4: enumLiteral_4= 'block'
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getBlockEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getClassTypeAccess().getBlockEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMOloc.g:5311:3: (enumLiteral_5= 'connector' )
                    {
                    // InternalMOloc.g:5311:3: (enumLiteral_5= 'connector' )
                    // InternalMOloc.g:5312:4: enumLiteral_5= 'connector'
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getConnectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getClassTypeAccess().getConnectorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMOloc.g:5319:3: (enumLiteral_6= 'type' )
                    {
                    // InternalMOloc.g:5319:3: (enumLiteral_6= 'type' )
                    // InternalMOloc.g:5320:4: enumLiteral_6= 'type'
                    {
                    enumLiteral_6=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getClassTypeAccess().getTypeEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMOloc.g:5327:3: (enumLiteral_7= 'package' )
                    {
                    // InternalMOloc.g:5327:3: (enumLiteral_7= 'package' )
                    // InternalMOloc.g:5328:4: enumLiteral_7= 'package'
                    {
                    enumLiteral_7=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getPackageEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getClassTypeAccess().getPackageEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMOloc.g:5335:3: (enumLiteral_8= 'function' )
                    {
                    // InternalMOloc.g:5335:3: (enumLiteral_8= 'function' )
                    // InternalMOloc.g:5336:4: enumLiteral_8= 'function'
                    {
                    enumLiteral_8=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getFunctionEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getClassTypeAccess().getFunctionEnumLiteralDeclaration_8());
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 120, ruleClassType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "ruleDirection"
    // InternalMOloc.g:5346:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;
        int ruleDirection_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // InternalMOloc.g:5352:2: ( ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) )
            // InternalMOloc.g:5353:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            {
            // InternalMOloc.g:5353:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt113=1;
                }
                break;
            case 96:
                {
                alt113=2;
                }
                break;
            case 97:
                {
                alt113=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalMOloc.g:5354:3: (enumLiteral_0= 'NULLDirection' )
                    {
                    // InternalMOloc.g:5354:3: (enumLiteral_0= 'NULLDirection' )
                    // InternalMOloc.g:5355:4: enumLiteral_0= 'NULLDirection'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5362:3: (enumLiteral_1= 'input' )
                    {
                    // InternalMOloc.g:5362:3: (enumLiteral_1= 'input' )
                    // InternalMOloc.g:5363:4: enumLiteral_1= 'input'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:5370:3: (enumLiteral_2= 'output' )
                    {
                    // InternalMOloc.g:5370:3: (enumLiteral_2= 'output' )
                    // InternalMOloc.g:5371:4: enumLiteral_2= 'output'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getOutputEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getOutputEnumLiteralDeclaration_2());
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 121, ruleDirection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleRelationshipType"
    // InternalMOloc.g:5381:1: ruleRelationshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) ;
    public final Enumerator ruleRelationshipType() throws RecognitionException {
        Enumerator current = null;
        int ruleRelationshipType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // InternalMOloc.g:5387:2: ( ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) )
            // InternalMOloc.g:5388:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            {
            // InternalMOloc.g:5388:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            int alt114=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt114=1;
                }
                break;
            case 99:
                {
                alt114=2;
                }
                break;
            case 100:
                {
                alt114=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalMOloc.g:5389:3: (enumLiteral_0= 'NULLRelationshipType' )
                    {
                    // InternalMOloc.g:5389:3: (enumLiteral_0= 'NULLRelationshipType' )
                    // InternalMOloc.g:5390:4: enumLiteral_0= 'NULLRelationshipType'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5397:3: (enumLiteral_1= 'flow' )
                    {
                    // InternalMOloc.g:5397:3: (enumLiteral_1= 'flow' )
                    // InternalMOloc.g:5398:4: enumLiteral_1= 'flow'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:5405:3: (enumLiteral_2= 'stream' )
                    {
                    // InternalMOloc.g:5405:3: (enumLiteral_2= 'stream' )
                    // InternalMOloc.g:5406:4: enumLiteral_2= 'stream'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getStreamEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getRelationshipTypeAccess().getStreamEnumLiteralDeclaration_2());
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 122, ruleRelationshipType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "ruleParameterType"
    // InternalMOloc.g:5416:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;
        int ruleParameterType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // InternalMOloc.g:5422:2: ( ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) )
            // InternalMOloc.g:5423:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            {
            // InternalMOloc.g:5423:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            int alt115=4;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt115=1;
                }
                break;
            case 102:
                {
                alt115=2;
                }
                break;
            case 103:
                {
                alt115=3;
                }
                break;
            case 104:
                {
                alt115=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalMOloc.g:5424:3: (enumLiteral_0= 'NULLParameterType' )
                    {
                    // InternalMOloc.g:5424:3: (enumLiteral_0= 'NULLParameterType' )
                    // InternalMOloc.g:5425:4: enumLiteral_0= 'NULLParameterType'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5432:3: (enumLiteral_1= 'discrete' )
                    {
                    // InternalMOloc.g:5432:3: (enumLiteral_1= 'discrete' )
                    // InternalMOloc.g:5433:4: enumLiteral_1= 'discrete'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:5440:3: (enumLiteral_2= 'parameter' )
                    {
                    // InternalMOloc.g:5440:3: (enumLiteral_2= 'parameter' )
                    // InternalMOloc.g:5441:4: enumLiteral_2= 'parameter'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMOloc.g:5448:3: (enumLiteral_3= 'constant' )
                    {
                    // InternalMOloc.g:5448:3: (enumLiteral_3= 'constant' )
                    // InternalMOloc.g:5449:4: enumLiteral_3= 'constant'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getConstantEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getParameterTypeAccess().getConstantEnumLiteralDeclaration_3());
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 123, ruleParameterType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"

    // $ANTLR start synpred75_InternalMOloc
    public final void synpred75_InternalMOloc_fragment() throws RecognitionException {   
        EObject lv_equations_3_0 = null;


        // InternalMOloc.g:2918:4: ( (lv_equations_3_0= ruleEquation ) )
        // InternalMOloc.g:2918:4: (lv_equations_3_0= ruleEquation )
        {
        // InternalMOloc.g:2918:4: (lv_equations_3_0= ruleEquation )
        // InternalMOloc.g:2919:5: lv_equations_3_0= ruleEquation
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEquationSectionAccess().getEquationsEquationParserRuleCall_3_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_equations_3_0=ruleEquation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred75_InternalMOloc

    // $ANTLR start synpred76_InternalMOloc
    public final void synpred76_InternalMOloc_fragment() throws RecognitionException {   
        EObject this_SimpleEquation_0 = null;


        // InternalMOloc.g:2955:3: (this_SimpleEquation_0= ruleSimpleEquation )
        // InternalMOloc.g:2955:3: this_SimpleEquation_0= ruleSimpleEquation
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_SimpleEquation_0=ruleSimpleEquation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_InternalMOloc

    // $ANTLR start synpred112_InternalMOloc
    public final void synpred112_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_5 = null;


        // InternalMOloc.g:4206:4: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )
        // InternalMOloc.g:4206:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
        {
        // InternalMOloc.g:4206:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
        int alt130=4;
        switch ( input.LA(1) ) {
        case 50:
            {
            alt130=1;
            }
            break;
        case 81:
            {
            alt130=2;
            }
            break;
        case 49:
            {
            alt130=3;
            }
            break;
        case 80:
            {
            alt130=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 130, 0, input);

            throw nvae;
        }

        switch (alt130) {
            case 1 :
                // InternalMOloc.g:4207:5: kw= '*'
                {
                kw=(Token)match(input,50,FOLLOW_65); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMOloc.g:4213:5: kw= '/'
                {
                kw=(Token)match(input,81,FOLLOW_65); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMOloc.g:4219:5: kw= '.*'
                {
                kw=(Token)match(input,49,FOLLOW_65); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMOloc.g:4225:5: kw= '.-'
                {
                kw=(Token)match(input,80,FOLLOW_65); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_Factor_5=ruleFactor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_InternalMOloc

    // $ANTLR start synpred121_InternalMOloc
    public final void synpred121_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Component_reference_3 = null;

        AntlrDatatypeRuleToken this_FunctionCallArgs_7 = null;


        // InternalMOloc.g:4339:3: ( ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) )
        // InternalMOloc.g:4339:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
        {
        // InternalMOloc.g:4339:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
        // InternalMOloc.g:4340:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs
        {
        // InternalMOloc.g:4340:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' )
        int alt132=4;
        switch ( input.LA(1) ) {
        case RULE_IDENT:
        case 37:
            {
            alt132=1;
            }
            break;
        case 84:
            {
            alt132=2;
            }
            break;
        case 58:
            {
            alt132=3;
            }
            break;
        case 24:
            {
            alt132=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 132, 0, input);

            throw nvae;
        }

        switch (alt132) {
            case 1 :
                // InternalMOloc.g:4341:5: this_Component_reference_3= ruleComponent_reference
                {
                pushFollow(FOLLOW_16);
                this_Component_reference_3=ruleComponent_reference();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMOloc.g:4352:5: kw= 'der'
                {
                kw=(Token)match(input,84,FOLLOW_16); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMOloc.g:4358:5: kw= 'initial'
                {
                kw=(Token)match(input,58,FOLLOW_16); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMOloc.g:4364:5: kw= 'pure'
                {
                kw=(Token)match(input,24,FOLLOW_16); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_FunctionCallArgs_7=ruleFunctionCallArgs();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred121_InternalMOloc

    // $ANTLR start synpred122_InternalMOloc
    public final void synpred122_InternalMOloc_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_Component_reference_8 = null;


        // InternalMOloc.g:4382:3: (this_Component_reference_8= ruleComponent_reference )
        // InternalMOloc.g:4382:3: this_Component_reference_8= ruleComponent_reference
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryAccess().getComponent_referenceParserRuleCall_4());
          		
        }
        pushFollow(FOLLOW_2);
        this_Component_reference_8=ruleComponent_reference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_InternalMOloc

    // $ANTLR start synpred130_InternalMOloc
    public final void synpred130_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_ForIndex_2 = null;


        // InternalMOloc.g:4645:4: (kw= ',' this_ForIndex_2= ruleForIndex )
        // InternalMOloc.g:4645:4: kw= ',' this_ForIndex_2= ruleForIndex
        {
        kw=(Token)match(input,35,FOLLOW_3); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_ForIndex_2=ruleForIndex();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_InternalMOloc

    // $ANTLR start synpred139_InternalMOloc
    public final void synpred139_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:4901:5: ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) )
        // InternalMOloc.g:4901:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        {
        // InternalMOloc.g:4901:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:4902:6: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred139_InternalMOloc

    // $ANTLR start synpred142_InternalMOloc
    public final void synpred142_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_7 = null;


        // InternalMOloc.g:4951:5: (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:4951:5: kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_7=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_InternalMOloc

    // $ANTLR start synpred144_InternalMOloc
    public final void synpred144_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:5010:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:5010:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred144_InternalMOloc

    // $ANTLR start synpred145_InternalMOloc
    public final void synpred145_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_0 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:4998:3: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) )
        // InternalMOloc.g:4998:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
        {
        // InternalMOloc.g:4998:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
        // InternalMOloc.g:4999:4: this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstAccess().getFunctionArgumentsParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_26);
        this_FunctionArguments_0=ruleFunctionArguments();

        state._fsp--;
        if (state.failed) return ;
        // InternalMOloc.g:5009:4: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
        int alt140=2;
        int LA140_0 = input.LA(1);

        if ( (LA140_0==35) ) {
            alt140=1;
        }
        switch (alt140) {
            case 1 :
                // InternalMOloc.g:5010:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                {
                kw=(Token)match(input,35,FOLLOW_81); if (state.failed) return ;
                pushFollow(FOLLOW_2);
                this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred145_InternalMOloc

    // Delegated rules

    public final boolean synpred76_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred145_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred145_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred144_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String dfa_1s = "\55\uffff";
    static final String dfa_2s = "\1\2\54\uffff";
    static final String dfa_3s = "\1\4\1\0\23\uffff\2\0\2\uffff\1\0\23\uffff";
    static final String dfa_4s = "\1\150\1\0\23\uffff\2\0\2\uffff\1\0\23\uffff";
    static final String dfa_5s = "\2\uffff\1\2\31\uffff\1\1\20\uffff";
    static final String dfa_6s = "\1\uffff\1\0\23\uffff\1\1\1\2\2\uffff\1\3\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\26\3\34\14\uffff\1\2\3\uffff\1\34\2\uffff\1\2\1\1\2\uffff\1\34\4\uffff\1\34\1\25\2\2\1\uffff\1\34\4\uffff\3\2\2\uffff\1\34\1\uffff\3\2\1\34\1\2\1\31\1\2\3\uffff\1\34\1\uffff\2\34\4\uffff\1\34\6\uffff\3\34\3\uffff\1\34\12\uffff\12\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
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

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2917:3: ( (lv_equations_3_0= ruleEquation ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMOloc()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_21 = input.LA(1);

                         
                        int index66_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMOloc()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_22 = input.LA(1);

                         
                        int index66_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMOloc()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_25 = input.LA(1);

                         
                        int index66_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalMOloc()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\27\uffff";
    static final String dfa_9s = "\1\4\10\uffff\2\0\14\uffff";
    static final String dfa_10s = "\1\124\10\uffff\2\0\14\uffff";
    static final String dfa_11s = "\1\uffff\1\1\20\uffff\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_12s = "\11\uffff\1\0\1\1\14\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\3\1\20\uffff\1\1\3\uffff\1\1\2\uffff\1\1\4\uffff\1\1\1\11\3\uffff\1\1\11\uffff\1\1\4\uffff\1\22\1\uffff\1\1\4\uffff\1\23\1\uffff\1\24\1\25\4\uffff\1\1\6\uffff\3\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2954:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index67_10);
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
    static final String dfa_14s = "\63\uffff";
    static final String dfa_15s = "\1\1\62\uffff";
    static final String dfa_16s = "\1\4\3\uffff\1\0\56\uffff";
    static final String dfa_17s = "\1\136\3\uffff\1\0\56\uffff";
    static final String dfa_18s = "\1\uffff\1\2\56\uffff\1\1\2\uffff";
    static final String dfa_19s = "\4\uffff\1\0\56\uffff}>";
    static final String[] dfa_20s = {
            "\2\1\15\uffff\2\1\1\uffff\5\1\2\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\3\1\1\uffff\1\1\2\uffff\1\1\3\uffff\2\60\1\uffff\1\1\3\uffff\1\1\3\uffff\5\1\4\uffff\2\1\1\uffff\10\1\1\4\1\60\4\uffff\11\1",
            "",
            "",
            "",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 4205:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_4 = input.LA(1);

                         
                        int index88_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_InternalMOloc()) ) {s = 48;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index88_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\16\uffff";
    static final String dfa_22s = "\1\4\3\uffff\2\0\10\uffff";
    static final String dfa_23s = "\1\124\3\uffff\2\0\10\uffff";
    static final String dfa_24s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\2\uffff\1\6\1\7\1\10\1\11\1\5";
    static final String dfa_25s = "\4\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_26s = {
            "\1\5\1\2\1\1\1\3\20\uffff\1\6\3\uffff\1\14\2\uffff\1\11\5\uffff\1\4\3\uffff\1\12\11\uffff\1\13\6\uffff\1\6\31\uffff\1\6",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "4314:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_Component_reference_8= ruleComponent_reference | (kw= '(' (this_Expression_10= ruleExpression )? (kw= ',' this_Expression_12= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_15= ruleExpression (kw= ',' this_Expression_17= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_20= ruleArrayArguments kw= '}' ) | kw= 'end' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMOloc()) ) {s = 6;}

                        else if ( (synpred122_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalMOloc()) ) {s = 6;}

                        else if ( (synpred122_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\25\uffff";
    static final String dfa_28s = "\1\4\11\uffff\1\0\12\uffff";
    static final String dfa_29s = "\1\126\11\uffff\1\0\12\uffff";
    static final String dfa_30s = "\1\uffff\1\1\22\uffff\1\2";
    static final String dfa_31s = "\12\uffff\1\0\12\uffff}>";
    static final String[] dfa_32s = {
            "\1\12\3\1\20\uffff\1\1\3\uffff\1\1\2\uffff\1\1\4\uffff\2\1\3\uffff\1\1\11\uffff\1\1\4\uffff\1\1\1\uffff\1\1\14\uffff\1\1\6\uffff\3\1\3\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "4997:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_10 = input.LA(1);

                         
                        int index109_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred145_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index109_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007F00002L,0x000000007FC00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007F00000L,0x000000007FC00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0EE1C0E098100030L,0x000001FF80000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0EE1C0E018100030L,0x000001FF80000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0EE1C0E018100010L,0x000001FF80000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00E0C0A000100010L,0x000001FF80000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004080000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018007F00010L,0x000000007FC00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0EE1C0E008100012L,0x000001FF80000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001000A0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x000001E380000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001200A0000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001000A0000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x05080231910000F0L,0x000000000011C080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x05082231910000F0L,0x000000000011C080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002006080000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004080080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000218207F00010L,0x000000007FC00000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100004080000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000006000080030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000006000080010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x85080230910000F2L,0x000000000011C086L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xA5080230910000F0L,0x000000000011C086L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xC5080230910000F0L,0x000000000011C086L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x85080230910000F0L,0x000000000011C086L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x85080230910000F0L,0x000000000011C08EL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x04080230910000F0L,0x000000000011C080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000001000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0006000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x05080239910000F0L,0x000000000011C080L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x8000000800000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000022000000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x05080233910000F0L,0x000000000051C080L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x05080231910000F0L,0x000000000051C080L});

}