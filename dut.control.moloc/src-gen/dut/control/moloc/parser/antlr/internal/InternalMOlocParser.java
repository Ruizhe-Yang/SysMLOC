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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_UNSIGNED_NUMBER", "RULE_TRUE_FALSE", "RULE_NON_DIGIT", "RULE_DIGIT", "RULE_Q_IDENT", "RULE_UNSIGNED_INTEGER", "RULE_S_CHAR", "RULE_S_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_Q_CHAR", "'within'", "';'", "'final'", "'encapsulated'", "'partial'", "'expandable'", "'pure'", "'impure'", "'operator'", "'extends'", "'end'", "'='", "'enumeration'", "'('", "':'", "')'", "'der'", "','", "'+'", "'.'", "'annotation'", "'redeclare'", "'each'", "'replaceable'", "'['", "']'", "':='", "'break'", "'constrainedby'", "'public'", "'protected'", "'import'", "'.*'", "'*'", "'{'", "'}'", "'inner'", "'outer'", "'if'", "'external'", "'initial'", "'equation'", "'then'", "'elseif'", "'else'", "'for'", "'loop'", "'connect'", "'when'", "'elsewhen'", "'algorithm'", "'return'", "'while'", "'or'", "'and'", "'not'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'-'", "'.+'", "'.-'", "'/'", "'^'", "'.^'", "'in'", "'function'", "'NULLClassType'", "'class'", "'model'", "'record'", "'block'", "'connector'", "'type'", "'package'", "'NULLDirection'", "'input'", "'output'", "'NULLRelationshipType'", "'flow'", "'stream'", "'NULLParameterType'", "'discrete'", "'parameter'", "'constant'"
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
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalMOlocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMOlocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[348+1];
             
             
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

                if ( ((LA2_0>=20 && LA2_0<=26)||(LA2_0>=87 && LA2_0<=95)) ) {
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
    // InternalMOloc.g:156:1: ruleClass_definition returns [EObject current=null] : ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] otherlv_3= ';' ) ;
    public final EObject ruleClass_definition() throws RecognitionException {
        EObject current = null;
        int ruleClass_definition_StartIndex = input.index();
        Token lv_isfinal_0_0=null;
        Token otherlv_3=null;
        EObject this_class_prefixes_1 = null;

        EObject this_class_specifier_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // InternalMOloc.g:162:2: ( ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] otherlv_3= ';' ) )
            // InternalMOloc.g:163:2: ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] otherlv_3= ';' )
            {
            // InternalMOloc.g:163:2: ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] otherlv_3= ';' )
            // InternalMOloc.g:164:3: ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] otherlv_3= ';'
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

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getClass_definitionRule());
              			}
              			newCompositeNode(grammarAccess.getClass_definitionAccess().getClass_prefixesParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_7);
            this_class_prefixes_1=ruleclass_prefixes(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_prefixes_1;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getClass_definitionRule());
              			}
              			newCompositeNode(grammarAccess.getClass_definitionAccess().getClass_specifierParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_class_specifier_2=ruleclass_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_specifier_2;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getClass_definitionAccess().getSemicolonKeyword_3());
              		
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
    // InternalMOloc.g:215:1: ruleclass_prefixes[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) ) ;
    public final EObject ruleclass_prefixes(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_prefixes_StartIndex = input.index();
        Token lv_isEncapsulated_0_0=null;
        Token lv_isPartial_1_0=null;
        Token lv_isExpandable_2_0=null;
        Token lv_isPure_3_0=null;
        Token lv_isPure_4_0=null;
        Token lv_isOperator_5_0=null;
        Enumerator lv_classType_6_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // InternalMOloc.g:221:2: ( ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) ) )
            // InternalMOloc.g:222:2: ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) )
            {
            // InternalMOloc.g:222:2: ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) )
            // InternalMOloc.g:223:3: ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) )
            {
            // InternalMOloc.g:223:3: ( (lv_isEncapsulated_0_0= 'encapsulated' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMOloc.g:224:4: (lv_isEncapsulated_0_0= 'encapsulated' )
                    {
                    // InternalMOloc.g:224:4: (lv_isEncapsulated_0_0= 'encapsulated' )
                    // InternalMOloc.g:225:5: lv_isEncapsulated_0_0= 'encapsulated'
                    {
                    lv_isEncapsulated_0_0=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isEncapsulated_0_0, grammarAccess.getClass_prefixesAccess().getIsEncapsulatedEncapsulatedKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_prefixesRule());
                      					}
                      					setWithLastConsumed(current, "isEncapsulated", lv_isEncapsulated_0_0 != null, "encapsulated");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:237:3: ( (lv_isPartial_1_0= 'partial' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMOloc.g:238:4: (lv_isPartial_1_0= 'partial' )
                    {
                    // InternalMOloc.g:238:4: (lv_isPartial_1_0= 'partial' )
                    // InternalMOloc.g:239:5: lv_isPartial_1_0= 'partial'
                    {
                    lv_isPartial_1_0=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isPartial_1_0, grammarAccess.getClass_prefixesAccess().getIsPartialPartialKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_prefixesRule());
                      					}
                      					setWithLastConsumed(current, "isPartial", lv_isPartial_1_0 != null, "partial");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:251:3: ( (lv_isExpandable_2_0= 'expandable' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMOloc.g:252:4: (lv_isExpandable_2_0= 'expandable' )
                    {
                    // InternalMOloc.g:252:4: (lv_isExpandable_2_0= 'expandable' )
                    // InternalMOloc.g:253:5: lv_isExpandable_2_0= 'expandable'
                    {
                    lv_isExpandable_2_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isExpandable_2_0, grammarAccess.getClass_prefixesAccess().getIsExpandableExpandableKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_prefixesRule());
                      					}
                      					setWithLastConsumed(current, "isExpandable", lv_isExpandable_2_0 != null, "expandable");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:265:3: ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )?
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
                    // InternalMOloc.g:266:4: ( (lv_isPure_3_0= 'pure' ) )
                    {
                    // InternalMOloc.g:266:4: ( (lv_isPure_3_0= 'pure' ) )
                    // InternalMOloc.g:267:5: (lv_isPure_3_0= 'pure' )
                    {
                    // InternalMOloc.g:267:5: (lv_isPure_3_0= 'pure' )
                    // InternalMOloc.g:268:6: lv_isPure_3_0= 'pure'
                    {
                    lv_isPure_3_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPure_3_0, grammarAccess.getClass_prefixesAccess().getIsPurePureKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClass_prefixesRule());
                      						}
                      						setWithLastConsumed(current, "isPure", lv_isPure_3_0 != null, "pure");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:281:4: ( (lv_isPure_4_0= 'impure' ) )
                    {
                    // InternalMOloc.g:281:4: ( (lv_isPure_4_0= 'impure' ) )
                    // InternalMOloc.g:282:5: (lv_isPure_4_0= 'impure' )
                    {
                    // InternalMOloc.g:282:5: (lv_isPure_4_0= 'impure' )
                    // InternalMOloc.g:283:6: lv_isPure_4_0= 'impure'
                    {
                    lv_isPure_4_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPure_4_0, grammarAccess.getClass_prefixesAccess().getIsPureImpureKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClass_prefixesRule());
                      						}
                      						setWithLastConsumed(current, "isPure", lv_isPure_4_0 != null, "impure");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMOloc.g:296:3: ( (lv_isOperator_5_0= 'operator' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMOloc.g:297:4: (lv_isOperator_5_0= 'operator' )
                    {
                    // InternalMOloc.g:297:4: (lv_isOperator_5_0= 'operator' )
                    // InternalMOloc.g:298:5: lv_isOperator_5_0= 'operator'
                    {
                    lv_isOperator_5_0=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isOperator_5_0, grammarAccess.getClass_prefixesAccess().getIsOperatorOperatorKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClass_prefixesRule());
                      					}
                      					setWithLastConsumed(current, "isOperator", lv_isOperator_5_0 != null, "operator");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:310:3: ( (lv_classType_6_0= ruleClassType ) )
            // InternalMOloc.g:311:4: (lv_classType_6_0= ruleClassType )
            {
            // InternalMOloc.g:311:4: (lv_classType_6_0= ruleClassType )
            // InternalMOloc.g:312:5: lv_classType_6_0= ruleClassType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClass_prefixesAccess().getClassTypeClassTypeEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_classType_6_0=ruleClassType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClass_prefixesRule());
              					}
              					set(
              						current,
              						"classType",
              						lv_classType_6_0,
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

                    if ( (LA9_3==RULE_IDENT||LA9_3==30||LA9_3==37||(LA9_3>=96 && LA9_3<=98)) ) {
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
                else if ( ((LA9_2>=RULE_IDENT && LA9_2<=RULE_STRING)||(LA9_2>=20 && LA9_2<=28)||LA9_2==31||(LA9_2>=37 && LA9_2<=39)||LA9_2==41||(LA9_2>=47 && LA9_2<=49)||(LA9_2>=54 && LA9_2<=55)||(LA9_2>=57 && LA9_2<=59)||LA9_2==68||(LA9_2>=87 && LA9_2<=105)) ) {
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
    // InternalMOloc.g:391:1: rulelong_class_specifier[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' ( (lv_classNameEnd_6_0= RULE_IDENT ) ) ) ;
    public final EObject rulelong_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulelong_class_specifier_StartIndex = input.index();
        Token lv_isExtends_0_0=null;
        Token otherlv_5=null;
        Token lv_classNameEnd_6_0=null;
        EObject this_class_name_1 = null;

        EObject this_class_modification_2 = null;

        EObject this_description_string_3 = null;

        EObject this_composition_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // InternalMOloc.g:397:2: ( ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' ( (lv_classNameEnd_6_0= RULE_IDENT ) ) ) )
            // InternalMOloc.g:398:2: ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' ( (lv_classNameEnd_6_0= RULE_IDENT ) ) )
            {
            // InternalMOloc.g:398:2: ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' ( (lv_classNameEnd_6_0= RULE_IDENT ) ) )
            // InternalMOloc.g:399:3: ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] otherlv_5= 'end' ( (lv_classNameEnd_6_0= RULE_IDENT ) )
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
            // InternalMOloc.g:475:3: ( (lv_classNameEnd_6_0= RULE_IDENT ) )
            // InternalMOloc.g:476:4: (lv_classNameEnd_6_0= RULE_IDENT )
            {
            // InternalMOloc.g:476:4: (lv_classNameEnd_6_0= RULE_IDENT )
            // InternalMOloc.g:477:5: lv_classNameEnd_6_0= RULE_IDENT
            {
            lv_classNameEnd_6_0=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_classNameEnd_6_0, grammarAccess.getLong_class_specifierAccess().getClassNameEndIDENTTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLong_class_specifierRule());
              					}
              					setWithLastConsumed(
              						current,
              						"classNameEnd",
              						lv_classNameEnd_6_0,
              						"dut.control.moloc.MOloc.IDENT");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 7, rulelong_class_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulelong_class_specifier"


    // $ANTLR start "ruleshort_class_specifier"
    // InternalMOloc.g:498:1: ruleshort_class_specifier[EObject in_current] returns [EObject current=in_current] : (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] ) ;
    public final EObject ruleshort_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleshort_class_specifier_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_isEnumeration_6_0=null;
        Token otherlv_7=null;
        Token lv_isColon_9_0=null;
        Token otherlv_10=null;
        EObject this_class_name_0 = null;

        Enumerator lv_direction_2_0 = null;

        EObject this_type_specifier_3 = null;

        EObject this_array_subscripts_4 = null;

        EObject this_class_modification_5 = null;

        EObject this_enum_list_8 = null;

        EObject this_description_11 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // InternalMOloc.g:504:2: ( (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] ) )
            // InternalMOloc.g:505:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] )
            {
            // InternalMOloc.g:505:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] )
            // InternalMOloc.g:506:3: this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current]
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
            // InternalMOloc.g:524:3: ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENT||LA17_0==37||(LA17_0>=96 && LA17_0<=98)) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
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
                    // InternalMOloc.g:525:4: ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? )
                    {
                    // InternalMOloc.g:525:4: ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? )
                    // InternalMOloc.g:526:5: ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )?
                    {
                    // InternalMOloc.g:526:5: ( (lv_direction_2_0= ruleDirection ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=96 && LA12_0<=98)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMOloc.g:527:6: (lv_direction_2_0= ruleDirection )
                            {
                            // InternalMOloc.g:527:6: (lv_direction_2_0= ruleDirection )
                            // InternalMOloc.g:528:7: lv_direction_2_0= ruleDirection
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
                            break;

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
                    // InternalMOloc.g:559:5: (this_array_subscripts_4= rulearray_subscripts[$current] )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==42) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMOloc.g:560:6: this_array_subscripts_4= rulearray_subscripts[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getShort_class_specifierRule());
                              						}
                              						newCompositeNode(grammarAccess.getShort_class_specifierAccess().getArray_subscriptsParserRuleCall_2_0_2());
                              					
                            }
                            pushFollow(FOLLOW_15);
                            this_array_subscripts_4=rulearray_subscripts(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_array_subscripts_4;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    // InternalMOloc.g:575:5: (this_class_modification_5= ruleclass_modification[$current] )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==31) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMOloc.g:576:6: this_class_modification_5= ruleclass_modification[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getShort_class_specifierRule());
                              						}
                              						newCompositeNode(grammarAccess.getShort_class_specifierAccess().getClass_modificationParserRuleCall_2_0_3());
                              					
                            }
                            pushFollow(FOLLOW_15);
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


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:593:4: ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' )
                    {
                    // InternalMOloc.g:593:4: ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' )
                    // InternalMOloc.g:594:5: ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')'
                    {
                    // InternalMOloc.g:594:5: ( (lv_isEnumeration_6_0= 'enumeration' ) )
                    // InternalMOloc.g:595:6: (lv_isEnumeration_6_0= 'enumeration' )
                    {
                    // InternalMOloc.g:595:6: (lv_isEnumeration_6_0= 'enumeration' )
                    // InternalMOloc.g:596:7: lv_isEnumeration_6_0= 'enumeration'
                    {
                    lv_isEnumeration_6_0=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isEnumeration_6_0, grammarAccess.getShort_class_specifierAccess().getIsEnumerationEnumerationKeyword_2_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getShort_class_specifierRule());
                      							}
                      							setWithLastConsumed(current, "isEnumeration", lv_isEnumeration_6_0 != null, "enumeration");
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,31,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getShort_class_specifierAccess().getLeftParenthesisKeyword_2_1_1());
                      				
                    }
                    // InternalMOloc.g:612:5: ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_IDENT||LA16_0==33) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==32) ) {
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
                            // InternalMOloc.g:613:6: (this_enum_list_8= ruleenum_list[$current] )?
                            {
                            // InternalMOloc.g:613:6: (this_enum_list_8= ruleenum_list[$current] )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==RULE_IDENT) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalMOloc.g:614:7: this_enum_list_8= ruleenum_list[$current]
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
                                    this_enum_list_8=ruleenum_list(current);

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current = this_enum_list_8;
                                      							afterParserOrEnumRuleCall();
                                      						
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:630:6: ( (lv_isColon_9_0= ':' ) )
                            {
                            // InternalMOloc.g:630:6: ( (lv_isColon_9_0= ':' ) )
                            // InternalMOloc.g:631:7: (lv_isColon_9_0= ':' )
                            {
                            // InternalMOloc.g:631:7: (lv_isColon_9_0= ':' )
                            // InternalMOloc.g:632:8: lv_isColon_9_0= ':'
                            {
                            lv_isColon_9_0=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isColon_9_0, grammarAccess.getShort_class_specifierAccess().getIsColonColonKeyword_2_1_2_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getShort_class_specifierRule());
                              								}
                              								setWithLastConsumed(current, "isColon", lv_isColon_9_0 != null, ":");
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getShort_class_specifierAccess().getRightParenthesisKeyword_2_1_3());
                      				
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
            this_description_11=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_11;
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
    // InternalMOloc.g:670:1: ruleder_class_specifier[EObject in_current] returns [EObject current=in_current] : (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] ) ;
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
            // InternalMOloc.g:676:2: ( (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] ) )
            // InternalMOloc.g:677:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] )
            {
            // InternalMOloc.g:677:2: (this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] )
            // InternalMOloc.g:678:3: this_class_name_0= ruleclass_name[$current] otherlv_1= '=' ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current]
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
            // InternalMOloc.g:696:3: ( (lv_isDer_2_0= 'der' ) )
            // InternalMOloc.g:697:4: (lv_isDer_2_0= 'der' )
            {
            // InternalMOloc.g:697:4: (lv_isDer_2_0= 'der' )
            // InternalMOloc.g:698:5: lv_isDer_2_0= 'der'
            {
            lv_isDer_2_0=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isDer_2_0, grammarAccess.getDer_class_specifierAccess().getIsDerDerKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDer_class_specifierRule());
              					}
              					setWithLastConsumed(current, "isDer", lv_isDer_2_0 != null, "der");
              				
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
            // InternalMOloc.g:732:3: ( (lv_derName_6_0= RULE_IDENT ) )
            // InternalMOloc.g:733:4: (lv_derName_6_0= RULE_IDENT )
            {
            // InternalMOloc.g:733:4: (lv_derName_6_0= RULE_IDENT )
            // InternalMOloc.g:734:5: lv_derName_6_0= RULE_IDENT
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

            // InternalMOloc.g:750:3: (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMOloc.g:751:4: otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getDer_class_specifierAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalMOloc.g:755:4: ( (lv_derName_8_0= RULE_IDENT ) )
            	    // InternalMOloc.g:756:5: (lv_derName_8_0= RULE_IDENT )
            	    {
            	    // InternalMOloc.g:756:5: (lv_derName_8_0= RULE_IDENT )
            	    // InternalMOloc.g:757:6: lv_derName_8_0= RULE_IDENT
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
            	    break loop18;
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
    // InternalMOloc.g:797:1: ruleclass_name[EObject in_current] returns [EObject current=in_current] : ( (lv_className_0_0= RULE_IDENT ) ) ;
    public final EObject ruleclass_name(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_name_StartIndex = input.index();
        Token lv_className_0_0=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // InternalMOloc.g:803:2: ( ( (lv_className_0_0= RULE_IDENT ) ) )
            // InternalMOloc.g:804:2: ( (lv_className_0_0= RULE_IDENT ) )
            {
            // InternalMOloc.g:804:2: ( (lv_className_0_0= RULE_IDENT ) )
            // InternalMOloc.g:805:3: (lv_className_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:805:3: (lv_className_0_0= RULE_IDENT )
            // InternalMOloc.g:806:4: lv_className_0_0= RULE_IDENT
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
    // InternalMOloc.g:826:1: ruleclass_modification[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) ;
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
            // InternalMOloc.g:832:2: ( (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) )
            // InternalMOloc.g:833:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            {
            // InternalMOloc.g:833:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            // InternalMOloc.g:834:3: otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClass_modificationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMOloc.g:838:3: ( (lv_arguments_1_0= ruleArgument ) )
            // InternalMOloc.g:839:4: (lv_arguments_1_0= ruleArgument )
            {
            // InternalMOloc.g:839:4: (lv_arguments_1_0= ruleArgument )
            // InternalMOloc.g:840:5: lv_arguments_1_0= ruleArgument
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

            // InternalMOloc.g:857:3: (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMOloc.g:858:4: otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getClass_modificationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMOloc.g:862:4: ( (lv_arguments_3_0= ruleArgument ) )
            	    // InternalMOloc.g:863:5: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // InternalMOloc.g:863:5: (lv_arguments_3_0= ruleArgument )
            	    // InternalMOloc.g:864:6: lv_arguments_3_0= ruleArgument
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
            	    break loop19;
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
    // InternalMOloc.g:891:1: ruledescription_string[EObject in_current] returns [EObject current=in_current] : ( (lv_description_0_0= ruleDescriptionString ) )? ;
    public final EObject ruledescription_string(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledescription_string_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_description_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // InternalMOloc.g:897:2: ( ( (lv_description_0_0= ruleDescriptionString ) )? )
            // InternalMOloc.g:898:2: ( (lv_description_0_0= ruleDescriptionString ) )?
            {
            // InternalMOloc.g:898:2: ( (lv_description_0_0= ruleDescriptionString ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMOloc.g:899:3: (lv_description_0_0= ruleDescriptionString )
                    {
                    // InternalMOloc.g:899:3: (lv_description_0_0= ruleDescriptionString )
                    // InternalMOloc.g:900:4: lv_description_0_0= ruleDescriptionString
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
    // InternalMOloc.g:920:1: entryRuleDescriptionString returns [String current=null] : iv_ruleDescriptionString= ruleDescriptionString EOF ;
    public final String entryRuleDescriptionString() throws RecognitionException {
        String current = null;
        int entryRuleDescriptionString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleDescriptionString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // InternalMOloc.g:920:57: (iv_ruleDescriptionString= ruleDescriptionString EOF )
            // InternalMOloc.g:921:2: iv_ruleDescriptionString= ruleDescriptionString EOF
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
    // InternalMOloc.g:927:1: ruleDescriptionString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* ) ;
    public final AntlrDatatypeRuleToken ruleDescriptionString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleDescriptionString_StartIndex = input.index();
        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // InternalMOloc.g:933:2: ( (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* ) )
            // InternalMOloc.g:934:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )
            {
            // InternalMOloc.g:934:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )
            // InternalMOloc.g:935:3: this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )*
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRING_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRING_0, grammarAccess.getDescriptionStringAccess().getSTRINGTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:942:3: (kw= '+' this_STRING_2= RULE_STRING )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMOloc.g:943:4: kw= '+' this_STRING_2= RULE_STRING
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
            	    break loop21;
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
    // InternalMOloc.g:961:1: rulecomposition[EObject in_current] returns [EObject current=in_current] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject rulecomposition(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomposition_StartIndex = input.index();
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // InternalMOloc.g:967:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalMOloc.g:968:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalMOloc.g:968:2: ( (lv_elements_0_0= ruleElement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_IDENT||(LA22_0>=20 && LA22_0<=27)||(LA22_0>=37 && LA22_0<=39)||LA22_0==41||(LA22_0>=47 && LA22_0<=49)||(LA22_0>=54 && LA22_0<=55)||(LA22_0>=57 && LA22_0<=59)||LA22_0==68||(LA22_0>=87 && LA22_0<=105)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMOloc.g:969:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalMOloc.g:969:3: (lv_elements_0_0= ruleElement )
            	    // InternalMOloc.g:970:4: lv_elements_0_0= ruleElement
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
            	    break loop22;
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
    // InternalMOloc.g:991:1: ruletype_specifier[EObject in_current] returns [EObject current=in_current] : ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) ) ;
    public final EObject ruletype_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruletype_specifier_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_typeSpecifier_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // InternalMOloc.g:997:2: ( ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) ) )
            // InternalMOloc.g:998:2: ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) )
            {
            // InternalMOloc.g:998:2: ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) )
            // InternalMOloc.g:999:3: (lv_typeSpecifier_0_0= ruleTypeSpecifier )
            {
            // InternalMOloc.g:999:3: (lv_typeSpecifier_0_0= ruleTypeSpecifier )
            // InternalMOloc.g:1000:4: lv_typeSpecifier_0_0= ruleTypeSpecifier
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
    // InternalMOloc.g:1020:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;
        int entryRuleTypeSpecifier_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // InternalMOloc.g:1020:53: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalMOloc.g:1021:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
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
    // InternalMOloc.g:1027:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTypeSpecifier_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // InternalMOloc.g:1033:2: ( ( (kw= '.' )? this_Name_1= ruleName ) )
            // InternalMOloc.g:1034:2: ( (kw= '.' )? this_Name_1= ruleName )
            {
            // InternalMOloc.g:1034:2: ( (kw= '.' )? this_Name_1= ruleName )
            // InternalMOloc.g:1035:3: (kw= '.' )? this_Name_1= ruleName
            {
            // InternalMOloc.g:1035:3: (kw= '.' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMOloc.g:1036:4: kw= '.'
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
    // InternalMOloc.g:1057:1: ruleenum_list[EObject in_current] returns [EObject current=in_current] : ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* ) ;
    public final EObject ruleenum_list(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleenum_list_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_enumerationLiteral_0_0 = null;

        EObject lv_enumerationLiteral_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // InternalMOloc.g:1063:2: ( ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* ) )
            // InternalMOloc.g:1064:2: ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* )
            {
            // InternalMOloc.g:1064:2: ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* )
            // InternalMOloc.g:1065:3: ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )*
            {
            // InternalMOloc.g:1065:3: ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) )
            // InternalMOloc.g:1066:4: (lv_enumerationLiteral_0_0= ruleEnumerationLiteral )
            {
            // InternalMOloc.g:1066:4: (lv_enumerationLiteral_0_0= ruleEnumerationLiteral )
            // InternalMOloc.g:1067:5: lv_enumerationLiteral_0_0= ruleEnumerationLiteral
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

            // InternalMOloc.g:1084:3: (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMOloc.g:1085:4: otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getEnum_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMOloc.g:1089:4: ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) )
            	    // InternalMOloc.g:1090:5: (lv_enumerationLiteral_2_0= ruleEnumerationLiteral )
            	    {
            	    // InternalMOloc.g:1090:5: (lv_enumerationLiteral_2_0= ruleEnumerationLiteral )
            	    // InternalMOloc.g:1091:6: lv_enumerationLiteral_2_0= ruleEnumerationLiteral
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
            	    break loop24;
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
    // InternalMOloc.g:1113:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleEnumerationLiteral_StartIndex = input.index();
        EObject iv_ruleEnumerationLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // InternalMOloc.g:1113:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalMOloc.g:1114:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalMOloc.g:1120:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;
        int ruleEnumerationLiteral_StartIndex = input.index();
        Token lv_title_0_0=null;
        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // InternalMOloc.g:1126:2: ( ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] ) )
            // InternalMOloc.g:1127:2: ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] )
            {
            // InternalMOloc.g:1127:2: ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] )
            // InternalMOloc.g:1128:3: ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current]
            {
            // InternalMOloc.g:1128:3: ( (lv_title_0_0= RULE_IDENT ) )
            // InternalMOloc.g:1129:4: (lv_title_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:1129:4: (lv_title_0_0= RULE_IDENT )
            // InternalMOloc.g:1130:5: lv_title_0_0= RULE_IDENT
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
    // InternalMOloc.g:1165:1: ruledescription[EObject in_current] returns [EObject current=in_current] : (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? ) ;
    public final EObject ruledescription(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledescription_StartIndex = input.index();
        Token lv_isAnnotation_1_0=null;
        EObject this_description_string_0 = null;

        EObject this_class_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // InternalMOloc.g:1171:2: ( (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? ) )
            // InternalMOloc.g:1172:2: (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? )
            {
            // InternalMOloc.g:1172:2: (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? )
            // InternalMOloc.g:1173:3: this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )?
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
            // InternalMOloc.g:1187:3: ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMOloc.g:1188:4: ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current]
                    {
                    // InternalMOloc.g:1188:4: ( (lv_isAnnotation_1_0= 'annotation' ) )
                    // InternalMOloc.g:1189:5: (lv_isAnnotation_1_0= 'annotation' )
                    {
                    // InternalMOloc.g:1189:5: (lv_isAnnotation_1_0= 'annotation' )
                    // InternalMOloc.g:1190:6: lv_isAnnotation_1_0= 'annotation'
                    {
                    lv_isAnnotation_1_0=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isAnnotation_1_0, grammarAccess.getDescriptionAccess().getIsAnnotationAnnotationKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDescriptionRule());
                      						}
                      						setWithLastConsumed(current, "isAnnotation", lv_isAnnotation_1_0 != null, "annotation");
                      					
                    }

                    }


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
    // InternalMOloc.g:1221:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;
        int entryRuleArgument_StartIndex = input.index();
        EObject iv_ruleArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // InternalMOloc.g:1221:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMOloc.g:1222:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalMOloc.g:1228:1: ruleArgument returns [EObject current=null] : ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;
        int ruleArgument_StartIndex = input.index();
        Token lv_isRedeclare_0_0=null;
        Token lv_isEach_1_0=null;
        Token lv_isfinal_2_0=null;
        Token lv_isReplaceable_3_0=null;
        EObject this_short_class_definition_4 = null;

        EObject this_component_clause1_5 = null;

        EObject this_element_modification_6 = null;

        EObject this_constraining_7 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // InternalMOloc.g:1234:2: ( ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? ) )
            // InternalMOloc.g:1235:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? )
            {
            // InternalMOloc.g:1235:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? )
            // InternalMOloc.g:1236:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )?
            {
            // InternalMOloc.g:1236:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMOloc.g:1237:4: (lv_isRedeclare_0_0= 'redeclare' )
                    {
                    // InternalMOloc.g:1237:4: (lv_isRedeclare_0_0= 'redeclare' )
                    // InternalMOloc.g:1238:5: lv_isRedeclare_0_0= 'redeclare'
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

            // InternalMOloc.g:1250:3: ( (lv_isEach_1_0= 'each' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMOloc.g:1251:4: (lv_isEach_1_0= 'each' )
                    {
                    // InternalMOloc.g:1251:4: (lv_isEach_1_0= 'each' )
                    // InternalMOloc.g:1252:5: lv_isEach_1_0= 'each'
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

            // InternalMOloc.g:1264:3: ( (lv_isfinal_2_0= 'final' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMOloc.g:1265:4: (lv_isfinal_2_0= 'final' )
                    {
                    // InternalMOloc.g:1265:4: (lv_isfinal_2_0= 'final' )
                    // InternalMOloc.g:1266:5: lv_isfinal_2_0= 'final'
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

            // InternalMOloc.g:1278:3: ( (lv_isReplaceable_3_0= 'replaceable' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMOloc.g:1279:4: (lv_isReplaceable_3_0= 'replaceable' )
                    {
                    // InternalMOloc.g:1279:4: (lv_isReplaceable_3_0= 'replaceable' )
                    // InternalMOloc.g:1280:5: lv_isReplaceable_3_0= 'replaceable'
                    {
                    lv_isReplaceable_3_0=(Token)match(input,41,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReplaceable_3_0, grammarAccess.getArgumentAccess().getIsReplaceableReplaceableKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getArgumentRule());
                      					}
                      					setWithLastConsumed(current, "isReplaceable", lv_isReplaceable_3_0 != null, "replaceable");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1292:3: (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalMOloc.g:1293:4: this_short_class_definition_4= ruleshort_class_definition[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getArgumentRule());
                      				}
                      				newCompositeNode(grammarAccess.getArgumentAccess().getShort_class_definitionParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_short_class_definition_4=ruleshort_class_definition(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_short_class_definition_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1308:4: this_component_clause1_5= rulecomponent_clause1[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getArgumentRule());
                      				}
                      				newCompositeNode(grammarAccess.getArgumentAccess().getComponent_clause1ParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_component_clause1_5=rulecomponent_clause1(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_component_clause1_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:1323:4: this_element_modification_6= ruleelement_modification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getArgumentRule());
                      				}
                      				newCompositeNode(grammarAccess.getArgumentAccess().getElement_modificationParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_element_modification_6=ruleelement_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_element_modification_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:1338:3: (this_constraining_7= ruleconstraining[$current] )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMOloc.g:1339:4: this_constraining_7= ruleconstraining[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getArgumentRule());
                      				}
                      				newCompositeNode(grammarAccess.getArgumentAccess().getConstrainingParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_constraining_7=ruleconstraining(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_constraining_7;
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
    // InternalMOloc.g:1359:1: ruleelement_modification[EObject in_current] returns [EObject current=in_current] : ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] ) ;
    public final EObject ruleelement_modification(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleelement_modification_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_elementName_0_0 = null;

        EObject this_modification_1 = null;

        EObject this_description_string_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // InternalMOloc.g:1365:2: ( ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] ) )
            // InternalMOloc.g:1366:2: ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] )
            {
            // InternalMOloc.g:1366:2: ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] )
            // InternalMOloc.g:1367:3: ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current]
            {
            // InternalMOloc.g:1367:3: ( (lv_elementName_0_0= ruleName ) )
            // InternalMOloc.g:1368:4: (lv_elementName_0_0= ruleName )
            {
            // InternalMOloc.g:1368:4: (lv_elementName_0_0= ruleName )
            // InternalMOloc.g:1369:5: lv_elementName_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElement_modificationAccess().getElementNameNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalMOloc.g:1386:3: (this_modification_1= rulemodification[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29||LA32_0==31||LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMOloc.g:1387:4: this_modification_1= rulemodification[$current]
                    {
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

                    }
                    break;

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
    // InternalMOloc.g:1421:1: ruleshort_class_definition[EObject in_current] returns [EObject current=in_current] : (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) ;
    public final EObject ruleshort_class_definition(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleshort_class_definition_StartIndex = input.index();
        EObject this_class_prefixes_0 = null;

        EObject this_short_class_specifier_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // InternalMOloc.g:1427:2: ( (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) )
            // InternalMOloc.g:1428:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            {
            // InternalMOloc.g:1428:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            // InternalMOloc.g:1429:3: this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current]
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
    // InternalMOloc.g:1462:1: rulecomponent_clause1[EObject in_current] returns [EObject current=in_current] : (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) ;
    public final EObject rulecomponent_clause1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_clause1_StartIndex = input.index();
        EObject this_type_prefix_0 = null;

        EObject this_type_specifier_1 = null;

        EObject this_component_declaration1_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // InternalMOloc.g:1468:2: ( (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) )
            // InternalMOloc.g:1469:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            {
            // InternalMOloc.g:1469:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            // InternalMOloc.g:1470:3: this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current]
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
    // InternalMOloc.g:1517:1: ruletype_prefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) ;
    public final EObject ruletype_prefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruletype_prefix_StartIndex = input.index();
        Enumerator lv_relationshipType_0_0 = null;

        Enumerator lv_parameterType_1_0 = null;

        Enumerator lv_directionType_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // InternalMOloc.g:1523:2: ( ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) )
            // InternalMOloc.g:1524:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            {
            // InternalMOloc.g:1524:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            // InternalMOloc.g:1525:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )?
            {
            // InternalMOloc.g:1525:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=99 && LA33_0<=101)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMOloc.g:1526:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    {
                    // InternalMOloc.g:1526:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    // InternalMOloc.g:1527:5: lv_relationshipType_0_0= ruleRelationshipType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getRelationshipTypeRelationshipTypeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
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

            // InternalMOloc.g:1544:3: ( (lv_parameterType_1_0= ruleParameterType ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=102 && LA34_0<=105)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMOloc.g:1545:4: (lv_parameterType_1_0= ruleParameterType )
                    {
                    // InternalMOloc.g:1545:4: (lv_parameterType_1_0= ruleParameterType )
                    // InternalMOloc.g:1546:5: lv_parameterType_1_0= ruleParameterType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getParameterTypeParameterTypeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
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

            // InternalMOloc.g:1563:3: ( (lv_directionType_2_0= ruleDirection ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=96 && LA35_0<=98)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMOloc.g:1564:4: (lv_directionType_2_0= ruleDirection )
                    {
                    // InternalMOloc.g:1564:4: (lv_directionType_2_0= ruleDirection )
                    // InternalMOloc.g:1565:5: lv_directionType_2_0= ruleDirection
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
    // InternalMOloc.g:1587:1: rulecomponent_declaration1[EObject in_current] returns [EObject current=in_current] : (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) ;
    public final EObject rulecomponent_declaration1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_declaration1_StartIndex = input.index();
        EObject this_declaration_0 = null;

        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // InternalMOloc.g:1593:2: ( (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) )
            // InternalMOloc.g:1594:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            {
            // InternalMOloc.g:1594:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            // InternalMOloc.g:1595:3: this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current]
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
    // InternalMOloc.g:1628:1: ruledeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) ;
    public final EObject ruledeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledeclaration_StartIndex = input.index();
        Token lv_declarationName_0_0=null;
        EObject this_array_subscripts_1 = null;

        EObject this_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // InternalMOloc.g:1634:2: ( ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) )
            // InternalMOloc.g:1635:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            {
            // InternalMOloc.g:1635:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            // InternalMOloc.g:1636:3: ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )?
            {
            // InternalMOloc.g:1636:3: ( (lv_declarationName_0_0= RULE_IDENT ) )
            // InternalMOloc.g:1637:4: (lv_declarationName_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:1637:4: (lv_declarationName_0_0= RULE_IDENT )
            // InternalMOloc.g:1638:5: lv_declarationName_0_0= RULE_IDENT
            {
            lv_declarationName_0_0=(Token)match(input,RULE_IDENT,FOLLOW_32); if (state.failed) return current;
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

            // InternalMOloc.g:1654:3: (this_array_subscripts_1= rulearray_subscripts[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMOloc.g:1655:4: this_array_subscripts_1= rulearray_subscripts[$current]
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
                    pushFollow(FOLLOW_33);
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

            // InternalMOloc.g:1670:3: (this_modification_2= rulemodification[$current] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29||LA37_0==31||LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMOloc.g:1671:4: this_modification_2= rulemodification[$current]
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
    // InternalMOloc.g:1691:1: rulearray_subscripts[EObject in_current] returns [EObject current=in_current] : ( (lv_subscripts_0_0= ruleArraySubscripts ) ) ;
    public final EObject rulearray_subscripts(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulearray_subscripts_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_subscripts_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // InternalMOloc.g:1697:2: ( ( (lv_subscripts_0_0= ruleArraySubscripts ) ) )
            // InternalMOloc.g:1698:2: ( (lv_subscripts_0_0= ruleArraySubscripts ) )
            {
            // InternalMOloc.g:1698:2: ( (lv_subscripts_0_0= ruleArraySubscripts ) )
            // InternalMOloc.g:1699:3: (lv_subscripts_0_0= ruleArraySubscripts )
            {
            // InternalMOloc.g:1699:3: (lv_subscripts_0_0= ruleArraySubscripts )
            // InternalMOloc.g:1700:4: lv_subscripts_0_0= ruleArraySubscripts
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getArray_subscriptsAccess().getSubscriptsArraySubscriptsParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_subscripts_0_0=ruleArraySubscripts();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getArray_subscriptsRule());
              				}
              				set(
              					current,
              					"subscripts",
              					lv_subscripts_0_0,
              					"dut.control.moloc.MOloc.ArraySubscripts");
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
            if ( state.backtracking>0 ) { memoize(input, 31, rulearray_subscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulearray_subscripts"


    // $ANTLR start "entryRuleArraySubscripts"
    // InternalMOloc.g:1720:1: entryRuleArraySubscripts returns [String current=null] : iv_ruleArraySubscripts= ruleArraySubscripts EOF ;
    public final String entryRuleArraySubscripts() throws RecognitionException {
        String current = null;
        int entryRuleArraySubscripts_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArraySubscripts = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // InternalMOloc.g:1720:55: (iv_ruleArraySubscripts= ruleArraySubscripts EOF )
            // InternalMOloc.g:1721:2: iv_ruleArraySubscripts= ruleArraySubscripts EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySubscriptsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySubscripts=ruleArraySubscripts();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySubscripts.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, entryRuleArraySubscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySubscripts"


    // $ANTLR start "ruleArraySubscripts"
    // InternalMOloc.g:1727:1: ruleArraySubscripts returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArraySubscripts() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArraySubscripts_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Subscript_1 = null;

        AntlrDatatypeRuleToken this_Subscript_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // InternalMOloc.g:1733:2: ( (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' ) )
            // InternalMOloc.g:1734:2: (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' )
            {
            // InternalMOloc.g:1734:2: (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' )
            // InternalMOloc.g:1735:3: kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']'
            {
            kw=(Token)match(input,42,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArraySubscriptsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_35);
            this_Subscript_1=ruleSubscript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Subscript_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:1750:3: (kw= ',' this_Subscript_3= ruleSubscript )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==35) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMOloc.g:1751:4: kw= ',' this_Subscript_3= ruleSubscript
            	    {
            	    kw=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getArraySubscriptsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_35);
            	    this_Subscript_3=ruleSubscript();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Subscript_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArraySubscriptsAccess().getRightSquareBracketKeyword_3());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 33, ruleArraySubscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArraySubscripts"


    // $ANTLR start "entryRuleSubscript"
    // InternalMOloc.g:1776:1: entryRuleSubscript returns [String current=null] : iv_ruleSubscript= ruleSubscript EOF ;
    public final String entryRuleSubscript() throws RecognitionException {
        String current = null;
        int entryRuleSubscript_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSubscript = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // InternalMOloc.g:1776:49: (iv_ruleSubscript= ruleSubscript EOF )
            // InternalMOloc.g:1777:2: iv_ruleSubscript= ruleSubscript EOF
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
            if ( state.backtracking>0 ) { memoize(input, 34, entryRuleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscript"


    // $ANTLR start "ruleSubscript"
    // InternalMOloc.g:1783:1: ruleSubscript returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' | this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleSubscript() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSubscript_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // InternalMOloc.g:1789:2: ( (kw= ':' | this_Expression_1= ruleExpression ) )
            // InternalMOloc.g:1790:2: (kw= ':' | this_Expression_1= ruleExpression )
            {
            // InternalMOloc.g:1790:2: (kw= ':' | this_Expression_1= ruleExpression )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=RULE_IDENT && LA39_0<=RULE_TRUE_FALSE)||LA39_0==24||LA39_0==28||LA39_0==31||LA39_0==34||(LA39_0>=36 && LA39_0<=37)||LA39_0==42||LA39_0==52||LA39_0==56||LA39_0==58||LA39_0==73||(LA39_0>=80 && LA39_0<=82)) ) {
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
                    // InternalMOloc.g:1791:3: kw= ':'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSubscriptAccess().getColonKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1797:3: this_Expression_1= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 35, ruleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubscript"


    // $ANTLR start "rulemodification"
    // InternalMOloc.g:1812:1: rulemodification[EObject in_current] returns [EObject current=in_current] : ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) ;
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
            // InternalMOloc.g:1818:2: ( ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) )
            // InternalMOloc.g:1819:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            {
            // InternalMOloc.g:1819:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt41=1;
                }
                break;
            case 29:
                {
                alt41=2;
                }
                break;
            case 44:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMOloc.g:1820:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    {
                    // InternalMOloc.g:1820:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    // InternalMOloc.g:1821:4: this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
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
                    pushFollow(FOLLOW_36);
                    this_class_modification_0=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:1835:4: (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==29) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMOloc.g:1836:5: otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) )
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getEqualsSignKeyword_0_1_0());
                              				
                            }
                            // InternalMOloc.g:1840:5: ( (lv_expression_2_0= ruleModification_expression ) )
                            // InternalMOloc.g:1841:6: (lv_expression_2_0= ruleModification_expression )
                            {
                            // InternalMOloc.g:1841:6: (lv_expression_2_0= ruleModification_expression )
                            // InternalMOloc.g:1842:7: lv_expression_2_0= ruleModification_expression
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
                    // InternalMOloc.g:1862:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:1862:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:1863:4: otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getModificationAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:1867:4: ( (lv_expression_4_0= ruleModification_expression ) )
                    // InternalMOloc.g:1868:5: (lv_expression_4_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:1868:5: (lv_expression_4_0= ruleModification_expression )
                    // InternalMOloc.g:1869:6: lv_expression_4_0= ruleModification_expression
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
                    // InternalMOloc.g:1888:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:1888:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:1889:4: otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getModificationAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMOloc.g:1893:4: ( (lv_expression_6_0= ruleModification_expression ) )
                    // InternalMOloc.g:1894:5: (lv_expression_6_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:1894:5: (lv_expression_6_0= ruleModification_expression )
                    // InternalMOloc.g:1895:6: lv_expression_6_0= ruleModification_expression
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
    // InternalMOloc.g:1917:1: entryRuleModification_expression returns [String current=null] : iv_ruleModification_expression= ruleModification_expression EOF ;
    public final String entryRuleModification_expression() throws RecognitionException {
        String current = null;
        int entryRuleModification_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleModification_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // InternalMOloc.g:1917:63: (iv_ruleModification_expression= ruleModification_expression EOF )
            // InternalMOloc.g:1918:2: iv_ruleModification_expression= ruleModification_expression EOF
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
    // InternalMOloc.g:1924:1: ruleModification_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | kw= 'break' ) ;
    public final AntlrDatatypeRuleToken ruleModification_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleModification_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // InternalMOloc.g:1930:2: ( (this_Expression_0= ruleExpression | kw= 'break' ) )
            // InternalMOloc.g:1931:2: (this_Expression_0= ruleExpression | kw= 'break' )
            {
            // InternalMOloc.g:1931:2: (this_Expression_0= ruleExpression | kw= 'break' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_IDENT && LA42_0<=RULE_TRUE_FALSE)||LA42_0==24||LA42_0==28||LA42_0==31||LA42_0==34||(LA42_0>=36 && LA42_0<=37)||LA42_0==42||LA42_0==52||LA42_0==56||LA42_0==58||LA42_0==73||(LA42_0>=80 && LA42_0<=82)) ) {
                alt42=1;
            }
            else if ( (LA42_0==45) ) {
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
                    // InternalMOloc.g:1932:3: this_Expression_0= ruleExpression
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
                    // InternalMOloc.g:1943:3: kw= 'break'
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


    // $ANTLR start "ruleconstraining"
    // InternalMOloc.g:1953:1: ruleconstraining[EObject in_current] returns [EObject current=in_current] : ( (lv_constrain_0_0= ruleConstrainingClause ) ) ;
    public final EObject ruleconstraining(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleconstraining_StartIndex = input.index();
        EObject lv_constrain_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // InternalMOloc.g:1959:2: ( ( (lv_constrain_0_0= ruleConstrainingClause ) ) )
            // InternalMOloc.g:1960:2: ( (lv_constrain_0_0= ruleConstrainingClause ) )
            {
            // InternalMOloc.g:1960:2: ( (lv_constrain_0_0= ruleConstrainingClause ) )
            // InternalMOloc.g:1961:3: (lv_constrain_0_0= ruleConstrainingClause )
            {
            // InternalMOloc.g:1961:3: (lv_constrain_0_0= ruleConstrainingClause )
            // InternalMOloc.g:1962:4: lv_constrain_0_0= ruleConstrainingClause
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConstrainingAccess().getConstrainConstrainingClauseParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_constrain_0_0=ruleConstrainingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConstrainingRule());
              				}
              				set(
              					current,
              					"constrain",
              					lv_constrain_0_0,
              					"dut.control.moloc.MOloc.ConstrainingClause");
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
            if ( state.backtracking>0 ) { memoize(input, 39, ruleconstraining_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleconstraining"


    // $ANTLR start "entryRuleConstrainingClause"
    // InternalMOloc.g:1982:1: entryRuleConstrainingClause returns [EObject current=null] : iv_ruleConstrainingClause= ruleConstrainingClause EOF ;
    public final EObject entryRuleConstrainingClause() throws RecognitionException {
        EObject current = null;
        int entryRuleConstrainingClause_StartIndex = input.index();
        EObject iv_ruleConstrainingClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // InternalMOloc.g:1982:59: (iv_ruleConstrainingClause= ruleConstrainingClause EOF )
            // InternalMOloc.g:1983:2: iv_ruleConstrainingClause= ruleConstrainingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstrainingClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstrainingClause=ruleConstrainingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstrainingClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, entryRuleConstrainingClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConstrainingClause"


    // $ANTLR start "ruleConstrainingClause"
    // InternalMOloc.g:1989:1: ruleConstrainingClause returns [EObject current=null] : (otherlv_0= 'constrainedby' this_type_specifier_1= ruletype_specifier[$current] this_class_modification_2= ruleclass_modification[$current] ) ;
    public final EObject ruleConstrainingClause() throws RecognitionException {
        EObject current = null;
        int ruleConstrainingClause_StartIndex = input.index();
        Token otherlv_0=null;
        EObject this_type_specifier_1 = null;

        EObject this_class_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // InternalMOloc.g:1995:2: ( (otherlv_0= 'constrainedby' this_type_specifier_1= ruletype_specifier[$current] this_class_modification_2= ruleclass_modification[$current] ) )
            // InternalMOloc.g:1996:2: (otherlv_0= 'constrainedby' this_type_specifier_1= ruletype_specifier[$current] this_class_modification_2= ruleclass_modification[$current] )
            {
            // InternalMOloc.g:1996:2: (otherlv_0= 'constrainedby' this_type_specifier_1= ruletype_specifier[$current] this_class_modification_2= ruleclass_modification[$current] )
            // InternalMOloc.g:1997:3: otherlv_0= 'constrainedby' this_type_specifier_1= ruletype_specifier[$current] this_class_modification_2= ruleclass_modification[$current]
            {
            otherlv_0=(Token)match(input,46,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstrainingClauseAccess().getConstrainedbyKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConstrainingClauseRule());
              			}
              			newCompositeNode(grammarAccess.getConstrainingClauseAccess().getType_specifierParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_16);
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
              				current = createModelElement(grammarAccess.getConstrainingClauseRule());
              			}
              			newCompositeNode(grammarAccess.getConstrainingClauseAccess().getClass_modificationParserRuleCall_2());
              		
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, ruleConstrainingClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConstrainingClause"


    // $ANTLR start "entryRuleElement"
    // InternalMOloc.g:2033:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;
        int entryRuleElement_StartIndex = input.index();
        EObject iv_ruleElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // InternalMOloc.g:2033:48: (iv_ruleElement= ruleElement EOF )
            // InternalMOloc.g:2034:2: iv_ruleElement= ruleElement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 42, entryRuleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMOloc.g:2040:1: ruleElement returns [EObject current=null] : (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;
        int ruleElement_StartIndex = input.index();
        EObject this_ImportClause_0 = null;

        EObject this_ExtendsClause_1 = null;

        EObject this_GeneralClause_2 = null;

        EObject this_ExternalElement_3 = null;

        EObject this_AnnotationClause_4 = null;

        EObject this_EquationSection_5 = null;

        EObject this_AlgorithmSection_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // InternalMOloc.g:2046:2: ( (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection ) )
            // InternalMOloc.g:2047:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection )
            {
            // InternalMOloc.g:2047:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection )
            int alt43=7;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalMOloc.g:2048:3: this_ImportClause_0= ruleImportClause
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
                    // InternalMOloc.g:2060:3: this_ExtendsClause_1= ruleExtendsClause
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
                    // InternalMOloc.g:2072:3: this_GeneralClause_2= ruleGeneralClause
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
                    // InternalMOloc.g:2084:3: this_ExternalElement_3= ruleExternalElement
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
                    // InternalMOloc.g:2096:3: this_AnnotationClause_4= ruleAnnotationClause
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
                    // InternalMOloc.g:2108:3: this_EquationSection_5= ruleEquationSection
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
                case 7 :
                    // InternalMOloc.g:2120:3: this_AlgorithmSection_6= ruleAlgorithmSection
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getAlgorithmSectionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AlgorithmSection_6=ruleAlgorithmSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AlgorithmSection_6;
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
            if ( state.backtracking>0 ) { memoize(input, 43, ruleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImportClause"
    // InternalMOloc.g:2135:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;
        int entryRuleImportClause_StartIndex = input.index();
        EObject iv_ruleImportClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // InternalMOloc.g:2135:53: (iv_ruleImportClause= ruleImportClause EOF )
            // InternalMOloc.g:2136:2: iv_ruleImportClause= ruleImportClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 44, entryRuleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleImportClause"


    // $ANTLR start "ruleImportClause"
    // InternalMOloc.g:2142:1: ruleImportClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // InternalMOloc.g:2148:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' ) )
            // InternalMOloc.g:2149:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' )
            {
            // InternalMOloc.g:2149:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';' )
            // InternalMOloc.g:2150:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] otherlv_16= ';'
            {
            // InternalMOloc.g:2150:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMOloc.g:2151:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:2151:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:2152:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,47,FOLLOW_38); if (state.failed) return current;
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

            // InternalMOloc.g:2164:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMOloc.g:2165:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:2165:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:2166:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,48,FOLLOW_39); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,49,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportClauseAccess().getImportKeyword_2());
              		
            }
            // InternalMOloc.g:2182:3: ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_IDENT) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==29) ) {
                    alt49=1;
                }
                else if ( (LA49_1==RULE_STRING||LA49_1==19||(LA49_1>=37 && LA49_1<=38)||LA49_1==50) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalMOloc.g:2183:4: ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) )
                    {
                    // InternalMOloc.g:2183:4: ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) )
                    // InternalMOloc.g:2184:5: ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) )
                    {
                    // InternalMOloc.g:2184:5: ( (lv_selfName_3_0= RULE_IDENT ) )
                    // InternalMOloc.g:2185:6: (lv_selfName_3_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:2185:6: (lv_selfName_3_0= RULE_IDENT )
                    // InternalMOloc.g:2186:7: lv_selfName_3_0= RULE_IDENT
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
                    // InternalMOloc.g:2206:5: ( (lv_importName_5_0= ruleName ) )
                    // InternalMOloc.g:2207:6: (lv_importName_5_0= ruleName )
                    {
                    // InternalMOloc.g:2207:6: (lv_importName_5_0= ruleName )
                    // InternalMOloc.g:2208:7: lv_importName_5_0= ruleName
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
                    // InternalMOloc.g:2227:4: ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? )
                    {
                    // InternalMOloc.g:2227:4: ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? )
                    // InternalMOloc.g:2228:5: ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )?
                    {
                    // InternalMOloc.g:2228:5: ( (lv_importName_6_0= ruleName ) )
                    // InternalMOloc.g:2229:6: (lv_importName_6_0= ruleName )
                    {
                    // InternalMOloc.g:2229:6: (lv_importName_6_0= ruleName )
                    // InternalMOloc.g:2230:7: lv_importName_6_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportClauseAccess().getImportNameNameParserRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalMOloc.g:2247:5: ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )?
                    int alt48=3;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==50) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==37) ) {
                        alt48=2;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMOloc.g:2248:6: ( (lv_isImportAll_7_0= '.*' ) )
                            {
                            // InternalMOloc.g:2248:6: ( (lv_isImportAll_7_0= '.*' ) )
                            // InternalMOloc.g:2249:7: (lv_isImportAll_7_0= '.*' )
                            {
                            // InternalMOloc.g:2249:7: (lv_isImportAll_7_0= '.*' )
                            // InternalMOloc.g:2250:8: lv_isImportAll_7_0= '.*'
                            {
                            lv_isImportAll_7_0=(Token)match(input,50,FOLLOW_15); if (state.failed) return current;
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
                            // InternalMOloc.g:2263:6: (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) )
                            {
                            // InternalMOloc.g:2263:6: (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) )
                            // InternalMOloc.g:2264:7: otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) )
                            {
                            otherlv_8=(Token)match(input,37,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getImportClauseAccess().getFullStopKeyword_3_1_1_1_0());
                              						
                            }
                            // InternalMOloc.g:2268:7: ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==51) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==52) ) {
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
                                    // InternalMOloc.g:2269:8: ( (lv_isImportAll_9_0= '*' ) )
                                    {
                                    // InternalMOloc.g:2269:8: ( (lv_isImportAll_9_0= '*' ) )
                                    // InternalMOloc.g:2270:9: (lv_isImportAll_9_0= '*' )
                                    {
                                    // InternalMOloc.g:2270:9: (lv_isImportAll_9_0= '*' )
                                    // InternalMOloc.g:2271:10: lv_isImportAll_9_0= '*'
                                    {
                                    lv_isImportAll_9_0=(Token)match(input,51,FOLLOW_15); if (state.failed) return current;
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
                                    // InternalMOloc.g:2284:8: (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' )
                                    {
                                    // InternalMOloc.g:2284:8: (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' )
                                    // InternalMOloc.g:2285:9: otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}'
                                    {
                                    otherlv_10=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_10, grammarAccess.getImportClauseAccess().getLeftCurlyBracketKeyword_3_1_1_1_1_1_0());
                                      								
                                    }
                                    // InternalMOloc.g:2289:9: ( (lv_objectName_11_0= RULE_IDENT ) )
                                    // InternalMOloc.g:2290:10: (lv_objectName_11_0= RULE_IDENT )
                                    {
                                    // InternalMOloc.g:2290:10: (lv_objectName_11_0= RULE_IDENT )
                                    // InternalMOloc.g:2291:11: lv_objectName_11_0= RULE_IDENT
                                    {
                                    lv_objectName_11_0=(Token)match(input,RULE_IDENT,FOLLOW_42); if (state.failed) return current;
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

                                    // InternalMOloc.g:2307:9: (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )*
                                    loop46:
                                    do {
                                        int alt46=2;
                                        int LA46_0 = input.LA(1);

                                        if ( (LA46_0==35) ) {
                                            alt46=1;
                                        }


                                        switch (alt46) {
                                    	case 1 :
                                    	    // InternalMOloc.g:2308:10: otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) )
                                    	    {
                                    	    otherlv_12=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      										newLeafNode(otherlv_12, grammarAccess.getImportClauseAccess().getCommaKeyword_3_1_1_1_1_1_2_0());
                                    	      									
                                    	    }
                                    	    // InternalMOloc.g:2312:10: ( (lv_objectName_13_0= RULE_IDENT ) )
                                    	    // InternalMOloc.g:2313:11: (lv_objectName_13_0= RULE_IDENT )
                                    	    {
                                    	    // InternalMOloc.g:2313:11: (lv_objectName_13_0= RULE_IDENT )
                                    	    // InternalMOloc.g:2314:12: lv_objectName_13_0= RULE_IDENT
                                    	    {
                                    	    lv_objectName_13_0=(Token)match(input,RULE_IDENT,FOLLOW_42); if (state.failed) return current;
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
                                    	    break loop46;
                                        }
                                    } while (true);

                                    otherlv_14=(Token)match(input,53,FOLLOW_15); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 45, ruleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleExtendsClause"
    // InternalMOloc.g:2363:1: entryRuleExtendsClause returns [EObject current=null] : iv_ruleExtendsClause= ruleExtendsClause EOF ;
    public final EObject entryRuleExtendsClause() throws RecognitionException {
        EObject current = null;
        int entryRuleExtendsClause_StartIndex = input.index();
        EObject iv_ruleExtendsClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // InternalMOloc.g:2363:54: (iv_ruleExtendsClause= ruleExtendsClause EOF )
            // InternalMOloc.g:2364:2: iv_ruleExtendsClause= ruleExtendsClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 46, entryRuleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsClause"


    // $ANTLR start "ruleExtendsClause"
    // InternalMOloc.g:2370:1: ruleExtendsClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'annotation' this_class_modification_12= ruleclass_modification[$current] )? otherlv_13= ';' ) ;
    public final EObject ruleExtendsClause() throws RecognitionException {
        EObject current = null;
        int ruleExtendsClause_StartIndex = input.index();
        Token lv_isPublic_0_0=null;
        Token lv_isProtected_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_type_specifier_3 = null;

        EObject lv_targuments_5_0 = null;

        EObject lv_breaks_6_0 = null;

        EObject lv_targuments_8_0 = null;

        EObject lv_breaks_9_0 = null;

        EObject this_class_modification_12 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // InternalMOloc.g:2376:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'annotation' this_class_modification_12= ruleclass_modification[$current] )? otherlv_13= ';' ) )
            // InternalMOloc.g:2377:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'annotation' this_class_modification_12= ruleclass_modification[$current] )? otherlv_13= ';' )
            {
            // InternalMOloc.g:2377:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'annotation' this_class_modification_12= ruleclass_modification[$current] )? otherlv_13= ';' )
            // InternalMOloc.g:2378:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'annotation' this_class_modification_12= ruleclass_modification[$current] )? otherlv_13= ';'
            {
            // InternalMOloc.g:2378:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMOloc.g:2379:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:2379:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:2380:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,47,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isPublic_0_0, grammarAccess.getExtendsClauseAccess().getIsPublicPublicKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExtendsClauseRule());
                      					}
                      					setWithLastConsumed(current, "isPublic", lv_isPublic_0_0 != null, "public");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2392:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMOloc.g:2393:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:2393:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:2394:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,48,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isProtected_1_0, grammarAccess.getExtendsClauseAccess().getIsProtectedProtectedKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExtendsClauseRule());
                      					}
                      					setWithLastConsumed(current, "isProtected", lv_isProtected_1_0 != null, "protected");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExtendsClauseAccess().getExtendsKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getExtendsClauseRule());
              			}
              			newCompositeNode(grammarAccess.getExtendsClauseAccess().getType_specifierParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_45);
            this_type_specifier_3=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2424:3: (otherlv_4= '(' ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==31) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMOloc.g:2425:4: otherlv_4= '(' ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExtendsClauseAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalMOloc.g:2429:4: ( ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_IDENT||(LA55_0>=20 && LA55_0<=26)||LA55_0==37||(LA55_0>=39 && LA55_0<=41)||LA55_0==45||(LA55_0>=87 && LA55_0<=105)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalMOloc.g:2430:5: ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )*
                            {
                            // InternalMOloc.g:2430:5: ( ( (lv_targuments_5_0= ruleArgument ) ) | ( (lv_breaks_6_0= ruleBreak ) ) )
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==RULE_IDENT||(LA52_0>=20 && LA52_0<=26)||LA52_0==37||(LA52_0>=39 && LA52_0<=41)||(LA52_0>=87 && LA52_0<=105)) ) {
                                alt52=1;
                            }
                            else if ( (LA52_0==45) ) {
                                alt52=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 0, input);

                                throw nvae;
                            }
                            switch (alt52) {
                                case 1 :
                                    // InternalMOloc.g:2431:6: ( (lv_targuments_5_0= ruleArgument ) )
                                    {
                                    // InternalMOloc.g:2431:6: ( (lv_targuments_5_0= ruleArgument ) )
                                    // InternalMOloc.g:2432:7: (lv_targuments_5_0= ruleArgument )
                                    {
                                    // InternalMOloc.g:2432:7: (lv_targuments_5_0= ruleArgument )
                                    // InternalMOloc.g:2433:8: lv_targuments_5_0= ruleArgument
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExtendsClauseAccess().getTargumentsArgumentParserRuleCall_4_1_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_21);
                                    lv_targuments_5_0=ruleArgument();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                                      								}
                                      								add(
                                      									current,
                                      									"targuments",
                                      									lv_targuments_5_0,
                                      									"dut.control.moloc.MOloc.Argument");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalMOloc.g:2451:6: ( (lv_breaks_6_0= ruleBreak ) )
                                    {
                                    // InternalMOloc.g:2451:6: ( (lv_breaks_6_0= ruleBreak ) )
                                    // InternalMOloc.g:2452:7: (lv_breaks_6_0= ruleBreak )
                                    {
                                    // InternalMOloc.g:2452:7: (lv_breaks_6_0= ruleBreak )
                                    // InternalMOloc.g:2453:8: lv_breaks_6_0= ruleBreak
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_4_1_0_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_21);
                                    lv_breaks_6_0=ruleBreak();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                                      								}
                                      								add(
                                      									current,
                                      									"breaks",
                                      									lv_breaks_6_0,
                                      									"dut.control.moloc.MOloc.Break");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalMOloc.g:2471:5: (otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==35) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalMOloc.g:2472:6: otherlv_7= ',' ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) )
                            	    {
                            	    otherlv_7=(Token)match(input,35,FOLLOW_47); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_7, grammarAccess.getExtendsClauseAccess().getCommaKeyword_4_1_1_0());
                            	      					
                            	    }
                            	    // InternalMOloc.g:2476:6: ( ( (lv_targuments_8_0= ruleArgument ) ) | ( (lv_breaks_9_0= ruleBreak ) ) )
                            	    int alt53=2;
                            	    int LA53_0 = input.LA(1);

                            	    if ( (LA53_0==RULE_IDENT||(LA53_0>=20 && LA53_0<=26)||LA53_0==37||(LA53_0>=39 && LA53_0<=41)||(LA53_0>=87 && LA53_0<=105)) ) {
                            	        alt53=1;
                            	    }
                            	    else if ( (LA53_0==45) ) {
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
                            	            // InternalMOloc.g:2477:7: ( (lv_targuments_8_0= ruleArgument ) )
                            	            {
                            	            // InternalMOloc.g:2477:7: ( (lv_targuments_8_0= ruleArgument ) )
                            	            // InternalMOloc.g:2478:8: (lv_targuments_8_0= ruleArgument )
                            	            {
                            	            // InternalMOloc.g:2478:8: (lv_targuments_8_0= ruleArgument )
                            	            // InternalMOloc.g:2479:9: lv_targuments_8_0= ruleArgument
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              									newCompositeNode(grammarAccess.getExtendsClauseAccess().getTargumentsArgumentParserRuleCall_4_1_1_1_0_0());
                            	              								
                            	            }
                            	            pushFollow(FOLLOW_21);
                            	            lv_targuments_8_0=ruleArgument();

                            	            state._fsp--;
                            	            if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              									if (current==null) {
                            	              										current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                            	              									}
                            	              									add(
                            	              										current,
                            	              										"targuments",
                            	              										lv_targuments_8_0,
                            	              										"dut.control.moloc.MOloc.Argument");
                            	              									afterParserOrEnumRuleCall();
                            	              								
                            	            }

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalMOloc.g:2497:7: ( (lv_breaks_9_0= ruleBreak ) )
                            	            {
                            	            // InternalMOloc.g:2497:7: ( (lv_breaks_9_0= ruleBreak ) )
                            	            // InternalMOloc.g:2498:8: (lv_breaks_9_0= ruleBreak )
                            	            {
                            	            // InternalMOloc.g:2498:8: (lv_breaks_9_0= ruleBreak )
                            	            // InternalMOloc.g:2499:9: lv_breaks_9_0= ruleBreak
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              									newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_4_1_1_1_1_0());
                            	              								
                            	            }
                            	            pushFollow(FOLLOW_21);
                            	            lv_breaks_9_0=ruleBreak();

                            	            state._fsp--;
                            	            if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              									if (current==null) {
                            	              										current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                            	              									}
                            	              									add(
                            	              										current,
                            	              										"breaks",
                            	              										lv_breaks_9_0,
                            	              										"dut.control.moloc.MOloc.Break");
                            	              									afterParserOrEnumRuleCall();
                            	              								
                            	            }

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExtendsClauseAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:2524:3: (otherlv_11= 'annotation' this_class_modification_12= ruleclass_modification[$current] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==38) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMOloc.g:2525:4: otherlv_11= 'annotation' this_class_modification_12= ruleclass_modification[$current]
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getExtendsClauseAccess().getAnnotationKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getExtendsClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getExtendsClauseAccess().getClass_modificationParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_class_modification_12=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_12;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getExtendsClauseAccess().getSemicolonKeyword_6());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 47, ruleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendsClause"


    // $ANTLR start "entryRuleBreak"
    // InternalMOloc.g:2552:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;
        int entryRuleBreak_StartIndex = input.index();
        EObject iv_ruleBreak = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // InternalMOloc.g:2552:46: (iv_ruleBreak= ruleBreak EOF )
            // InternalMOloc.g:2553:2: iv_ruleBreak= ruleBreak EOF
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
            if ( state.backtracking>0 ) { memoize(input, 48, entryRuleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalMOloc.g:2559:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;
        int ruleBreak_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_breakObject_2_0=null;
        EObject lv_connectObject_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // InternalMOloc.g:2565:2: ( (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) ) )
            // InternalMOloc.g:2566:2: (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) )
            {
            // InternalMOloc.g:2566:2: (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) )
            // InternalMOloc.g:2567:3: otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
              		
            }
            // InternalMOloc.g:2571:3: ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_IDENT) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalMOloc.g:2572:4: ( (lv_connectObject_1_0= ruleConnectEquation ) )
                    {
                    // InternalMOloc.g:2572:4: ( (lv_connectObject_1_0= ruleConnectEquation ) )
                    // InternalMOloc.g:2573:5: (lv_connectObject_1_0= ruleConnectEquation )
                    {
                    // InternalMOloc.g:2573:5: (lv_connectObject_1_0= ruleConnectEquation )
                    // InternalMOloc.g:2574:6: lv_connectObject_1_0= ruleConnectEquation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBreakAccess().getConnectObjectConnectEquationParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_connectObject_1_0=ruleConnectEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBreakRule());
                      						}
                      						set(
                      							current,
                      							"connectObject",
                      							lv_connectObject_1_0,
                      							"dut.control.moloc.MOloc.ConnectEquation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:2592:4: ( (lv_breakObject_2_0= RULE_IDENT ) )
                    {
                    // InternalMOloc.g:2592:4: ( (lv_breakObject_2_0= RULE_IDENT ) )
                    // InternalMOloc.g:2593:5: (lv_breakObject_2_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:2593:5: (lv_breakObject_2_0= RULE_IDENT )
                    // InternalMOloc.g:2594:6: lv_breakObject_2_0= RULE_IDENT
                    {
                    lv_breakObject_2_0=(Token)match(input,RULE_IDENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_breakObject_2_0, grammarAccess.getBreakAccess().getBreakObjectIDENTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBreakRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"breakObject",
                      							lv_breakObject_2_0,
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
            if ( state.backtracking>0 ) { memoize(input, 49, ruleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleGeneralClause"
    // InternalMOloc.g:2615:1: entryRuleGeneralClause returns [EObject current=null] : iv_ruleGeneralClause= ruleGeneralClause EOF ;
    public final EObject entryRuleGeneralClause() throws RecognitionException {
        EObject current = null;
        int entryRuleGeneralClause_StartIndex = input.index();
        EObject iv_ruleGeneralClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // InternalMOloc.g:2615:54: (iv_ruleGeneralClause= ruleGeneralClause EOF )
            // InternalMOloc.g:2616:2: iv_ruleGeneralClause= ruleGeneralClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 50, entryRuleGeneralClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralClause"


    // $ANTLR start "ruleGeneralClause"
    // InternalMOloc.g:2622:1: ruleGeneralClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] )? otherlv_16= ';' ) ;
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
        Token otherlv_13=null;
        Token otherlv_16=null;
        EObject this_class_prefixes_7 = null;

        EObject this_class_specifier_8 = null;

        EObject this_type_prefix_9 = null;

        EObject this_type_specifier_10 = null;

        EObject this_array_subscripts_11 = null;

        EObject lv_component_list_12_0 = null;

        EObject lv_component_list_14_0 = null;

        EObject this_constraining_15 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // InternalMOloc.g:2628:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] )? otherlv_16= ';' ) )
            // InternalMOloc.g:2629:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] )? otherlv_16= ';' )
            {
            // InternalMOloc.g:2629:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] )? otherlv_16= ';' )
            // InternalMOloc.g:2630:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] )? otherlv_16= ';'
            {
            // InternalMOloc.g:2630:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMOloc.g:2631:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:2631:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:2632:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,47,FOLLOW_14); if (state.failed) return current;
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

            // InternalMOloc.g:2644:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==48) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMOloc.g:2645:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:2645:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:2646:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,48,FOLLOW_14); if (state.failed) return current;
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

            // InternalMOloc.g:2658:3: ( (lv_isRedeclare_2_0= 'redeclare' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMOloc.g:2659:4: (lv_isRedeclare_2_0= 'redeclare' )
                    {
                    // InternalMOloc.g:2659:4: (lv_isRedeclare_2_0= 'redeclare' )
                    // InternalMOloc.g:2660:5: lv_isRedeclare_2_0= 'redeclare'
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

            // InternalMOloc.g:2672:3: ( (lv_isfinal_3_0= 'final' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==20) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMOloc.g:2673:4: (lv_isfinal_3_0= 'final' )
                    {
                    // InternalMOloc.g:2673:4: (lv_isfinal_3_0= 'final' )
                    // InternalMOloc.g:2674:5: lv_isfinal_3_0= 'final'
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

            // InternalMOloc.g:2686:3: ( (lv_isInner_4_0= 'inner' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==54) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMOloc.g:2687:4: (lv_isInner_4_0= 'inner' )
                    {
                    // InternalMOloc.g:2687:4: (lv_isInner_4_0= 'inner' )
                    // InternalMOloc.g:2688:5: lv_isInner_4_0= 'inner'
                    {
                    lv_isInner_4_0=(Token)match(input,54,FOLLOW_14); if (state.failed) return current;
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

            // InternalMOloc.g:2700:3: ( (lv_isOuter_5_0= 'outer' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==55) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMOloc.g:2701:4: (lv_isOuter_5_0= 'outer' )
                    {
                    // InternalMOloc.g:2701:4: (lv_isOuter_5_0= 'outer' )
                    // InternalMOloc.g:2702:5: lv_isOuter_5_0= 'outer'
                    {
                    lv_isOuter_5_0=(Token)match(input,55,FOLLOW_14); if (state.failed) return current;
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

            // InternalMOloc.g:2714:3: ( (lv_isReplaceable_6_0= 'replaceable' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==41) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMOloc.g:2715:4: (lv_isReplaceable_6_0= 'replaceable' )
                    {
                    // InternalMOloc.g:2715:4: (lv_isReplaceable_6_0= 'replaceable' )
                    // InternalMOloc.g:2716:5: lv_isReplaceable_6_0= 'replaceable'
                    {
                    lv_isReplaceable_6_0=(Token)match(input,41,FOLLOW_14); if (state.failed) return current;
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

            // InternalMOloc.g:2728:3: ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=21 && LA68_0<=26)||(LA68_0>=87 && LA68_0<=95)) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_IDENT||LA68_0==37||(LA68_0>=96 && LA68_0<=105)) ) {
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
                    // InternalMOloc.g:2729:4: (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] )
                    {
                    // InternalMOloc.g:2729:4: (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] )
                    // InternalMOloc.g:2730:5: this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current]
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getGeneralClauseAccess().getClass_prefixesParserRuleCall_7_0_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    this_class_prefixes_7=ruleclass_prefixes(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_class_prefixes_7;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getGeneralClauseAccess().getClass_specifierParserRuleCall_7_0_1());
                      				
                    }
                    pushFollow(FOLLOW_50);
                    this_class_specifier_8=ruleclass_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_class_specifier_8;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:2760:4: (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* )
                    {
                    // InternalMOloc.g:2760:4: (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* )
                    // InternalMOloc.g:2761:5: this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getGeneralClauseAccess().getType_prefixParserRuleCall_7_1_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    this_type_prefix_9=ruletype_prefix(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_type_prefix_9;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getGeneralClauseAccess().getType_specifierParserRuleCall_7_1_1());
                      				
                    }
                    pushFollow(FOLLOW_51);
                    this_type_specifier_10=ruletype_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_type_specifier_10;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMOloc.g:2789:5: (this_array_subscripts_11= rulearray_subscripts[$current] )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==42) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalMOloc.g:2790:6: this_array_subscripts_11= rulearray_subscripts[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getGeneralClauseRule());
                              						}
                              						newCompositeNode(grammarAccess.getGeneralClauseAccess().getArray_subscriptsParserRuleCall_7_1_2());
                              					
                            }
                            pushFollow(FOLLOW_51);
                            this_array_subscripts_11=rulearray_subscripts(current);

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_array_subscripts_11;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    // InternalMOloc.g:2805:5: ( (lv_component_list_12_0= ruleComponent_declaration ) )
                    // InternalMOloc.g:2806:6: (lv_component_list_12_0= ruleComponent_declaration )
                    {
                    // InternalMOloc.g:2806:6: (lv_component_list_12_0= ruleComponent_declaration )
                    // InternalMOloc.g:2807:7: lv_component_list_12_0= ruleComponent_declaration
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getGeneralClauseAccess().getComponent_listComponent_declarationParserRuleCall_7_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_52);
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

                    // InternalMOloc.g:2824:5: (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==35) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalMOloc.g:2825:6: otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) )
                    	    {
                    	    otherlv_13=(Token)match(input,35,FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_13, grammarAccess.getGeneralClauseAccess().getCommaKeyword_7_1_4_0());
                    	      					
                    	    }
                    	    // InternalMOloc.g:2829:6: ( (lv_component_list_14_0= ruleComponent_declaration ) )
                    	    // InternalMOloc.g:2830:7: (lv_component_list_14_0= ruleComponent_declaration )
                    	    {
                    	    // InternalMOloc.g:2830:7: (lv_component_list_14_0= ruleComponent_declaration )
                    	    // InternalMOloc.g:2831:8: lv_component_list_14_0= ruleComponent_declaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getGeneralClauseAccess().getComponent_listComponent_declarationParserRuleCall_7_1_4_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_component_list_14_0=ruleComponent_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getGeneralClauseRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"component_list",
                    	      									lv_component_list_14_0,
                    	      									"dut.control.moloc.MOloc.Component_declaration");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalMOloc.g:2851:3: (this_constraining_15= ruleconstraining[$current] )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==46) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMOloc.g:2852:4: this_constraining_15= ruleconstraining[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getGeneralClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getGeneralClauseAccess().getConstrainingParserRuleCall_8());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_constraining_15=ruleconstraining(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_constraining_15;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGeneralClauseAccess().getSemicolonKeyword_9());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 51, ruleGeneralClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleGeneralClause"


    // $ANTLR start "entryRuleComponent_declaration"
    // InternalMOloc.g:2875:1: entryRuleComponent_declaration returns [EObject current=null] : iv_ruleComponent_declaration= ruleComponent_declaration EOF ;
    public final EObject entryRuleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int entryRuleComponent_declaration_StartIndex = input.index();
        EObject iv_ruleComponent_declaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // InternalMOloc.g:2875:62: (iv_ruleComponent_declaration= ruleComponent_declaration EOF )
            // InternalMOloc.g:2876:2: iv_ruleComponent_declaration= ruleComponent_declaration EOF
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
            if ( state.backtracking>0 ) { memoize(input, 52, entryRuleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_declaration"


    // $ANTLR start "ruleComponent_declaration"
    // InternalMOloc.g:2882:1: ruleComponent_declaration returns [EObject current=null] : (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) ;
    public final EObject ruleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int ruleComponent_declaration_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_declaration_0 = null;

        AntlrDatatypeRuleToken lv_condition_attribute_2_0 = null;

        EObject this_description_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // InternalMOloc.g:2888:2: ( (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) )
            // InternalMOloc.g:2889:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            {
            // InternalMOloc.g:2889:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            // InternalMOloc.g:2890:3: this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current]
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
            pushFollow(FOLLOW_53);
            this_declaration_0=ruledeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_declaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2904:3: (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==56) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMOloc.g:2905:4: otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getComponent_declarationAccess().getIfKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:2909:4: ( (lv_condition_attribute_2_0= ruleExpression ) )
                    // InternalMOloc.g:2910:5: (lv_condition_attribute_2_0= ruleExpression )
                    {
                    // InternalMOloc.g:2910:5: (lv_condition_attribute_2_0= ruleExpression )
                    // InternalMOloc.g:2911:6: lv_condition_attribute_2_0= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 53, ruleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_declaration"


    // $ANTLR start "entryRuleExternalElement"
    // InternalMOloc.g:2947:1: entryRuleExternalElement returns [EObject current=null] : iv_ruleExternalElement= ruleExternalElement EOF ;
    public final EObject entryRuleExternalElement() throws RecognitionException {
        EObject current = null;
        int entryRuleExternalElement_StartIndex = input.index();
        EObject iv_ruleExternalElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // InternalMOloc.g:2947:56: (iv_ruleExternalElement= ruleExternalElement EOF )
            // InternalMOloc.g:2948:2: iv_ruleExternalElement= ruleExternalElement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 54, entryRuleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalElement"


    // $ANTLR start "ruleExternalElement"
    // InternalMOloc.g:2954:1: ruleExternalElement returns [EObject current=null] : ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' ) ;
    public final EObject ruleExternalElement() throws RecognitionException {
        EObject current = null;
        int ruleExternalElement_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_language_specification_2_0=null;
        Token otherlv_4=null;
        Token lv_refValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_isAnnotation_9_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ref_3_0 = null;

        AntlrDatatypeRuleToken lv_expressionList_7_0 = null;

        EObject this_class_modification_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // InternalMOloc.g:2960:2: ( ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' ) )
            // InternalMOloc.g:2961:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' )
            {
            // InternalMOloc.g:2961:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' )
            // InternalMOloc.g:2962:3: () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';'
            {
            // InternalMOloc.g:2962:3: ()
            // InternalMOloc.g:2963:4: 
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

            otherlv_1=(Token)match(input,57,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExternalElementAccess().getExternalKeyword_1());
              		
            }
            // InternalMOloc.g:2976:3: ( (lv_language_specification_2_0= RULE_STRING ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_STRING) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMOloc.g:2977:4: (lv_language_specification_2_0= RULE_STRING )
                    {
                    // InternalMOloc.g:2977:4: (lv_language_specification_2_0= RULE_STRING )
                    // InternalMOloc.g:2978:5: lv_language_specification_2_0= RULE_STRING
                    {
                    lv_language_specification_2_0=(Token)match(input,RULE_STRING,FOLLOW_55); if (state.failed) return current;
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

            // InternalMOloc.g:2994:3: ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_IDENT||LA74_0==37) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMOloc.g:2995:4: ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')'
                    {
                    // InternalMOloc.g:2995:4: ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==37) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==RULE_IDENT) ) {
                        int LA72_2 = input.LA(2);

                        if ( (LA72_2==29||LA72_2==37||LA72_2==42) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalMOloc.g:2996:5: ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '='
                            {
                            // InternalMOloc.g:2996:5: ( (lv_ref_3_0= ruleComponent_reference ) )
                            // InternalMOloc.g:2997:6: (lv_ref_3_0= ruleComponent_reference )
                            {
                            // InternalMOloc.g:2997:6: (lv_ref_3_0= ruleComponent_reference )
                            // InternalMOloc.g:2998:7: lv_ref_3_0= ruleComponent_reference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExternalElementAccess().getRefComponent_referenceParserRuleCall_3_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
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

                            otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getExternalElementAccess().getEqualsSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMOloc.g:3020:4: ( (lv_refValue_5_0= RULE_IDENT ) )
                    // InternalMOloc.g:3021:5: (lv_refValue_5_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:3021:5: (lv_refValue_5_0= RULE_IDENT )
                    // InternalMOloc.g:3022:6: lv_refValue_5_0= RULE_IDENT
                    {
                    lv_refValue_5_0=(Token)match(input,RULE_IDENT,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_refValue_5_0, grammarAccess.getExternalElementAccess().getRefValueIDENTTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExternalElementRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"refValue",
                      							lv_refValue_5_0,
                      							"dut.control.moloc.MOloc.IDENT");
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExternalElementAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalMOloc.g:3042:4: ( (lv_expressionList_7_0= ruleExpressionList ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=RULE_IDENT && LA73_0<=RULE_TRUE_FALSE)||LA73_0==24||LA73_0==28||LA73_0==31||LA73_0==34||(LA73_0>=36 && LA73_0<=37)||LA73_0==42||LA73_0==52||LA73_0==56||LA73_0==58||LA73_0==73||(LA73_0>=80 && LA73_0<=82)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalMOloc.g:3043:5: (lv_expressionList_7_0= ruleExpressionList )
                            {
                            // InternalMOloc.g:3043:5: (lv_expressionList_7_0= ruleExpressionList )
                            // InternalMOloc.g:3044:6: lv_expressionList_7_0= ruleExpressionList
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getExternalElementAccess().getExpressionListExpressionListParserRuleCall_3_3_0());
                              					
                            }
                            pushFollow(FOLLOW_18);
                            lv_expressionList_7_0=ruleExpressionList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getExternalElementRule());
                              						}
                              						set(
                              							current,
                              							"expressionList",
                              							lv_expressionList_7_0,
                              							"dut.control.moloc.MOloc.ExpressionList");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExternalElementAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:3066:3: ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==38) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMOloc.g:3067:4: ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current]
                    {
                    // InternalMOloc.g:3067:4: ( (lv_isAnnotation_9_0= 'annotation' ) )
                    // InternalMOloc.g:3068:5: (lv_isAnnotation_9_0= 'annotation' )
                    {
                    // InternalMOloc.g:3068:5: (lv_isAnnotation_9_0= 'annotation' )
                    // InternalMOloc.g:3069:6: lv_isAnnotation_9_0= 'annotation'
                    {
                    lv_isAnnotation_9_0=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isAnnotation_9_0, grammarAccess.getExternalElementAccess().getIsAnnotationAnnotationKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExternalElementRule());
                      						}
                      						setWithLastConsumed(current, "isAnnotation", lv_isAnnotation_9_0 != null, "annotation");
                      					
                    }

                    }


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

              			newLeafNode(otherlv_11, grammarAccess.getExternalElementAccess().getSemicolonKeyword_5());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 55, ruleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExternalElement"


    // $ANTLR start "entryRuleAnnotationClause"
    // InternalMOloc.g:3104:1: entryRuleAnnotationClause returns [EObject current=null] : iv_ruleAnnotationClause= ruleAnnotationClause EOF ;
    public final EObject entryRuleAnnotationClause() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotationClause_StartIndex = input.index();
        EObject iv_ruleAnnotationClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // InternalMOloc.g:3104:57: (iv_ruleAnnotationClause= ruleAnnotationClause EOF )
            // InternalMOloc.g:3105:2: iv_ruleAnnotationClause= ruleAnnotationClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 56, entryRuleAnnotationClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationClause"


    // $ANTLR start "ruleAnnotationClause"
    // InternalMOloc.g:3111:1: ruleAnnotationClause returns [EObject current=null] : (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' ) ;
    public final EObject ruleAnnotationClause() throws RecognitionException {
        EObject current = null;
        int ruleAnnotationClause_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_class_modification_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // InternalMOloc.g:3117:2: ( (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' ) )
            // InternalMOloc.g:3118:2: (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' )
            {
            // InternalMOloc.g:3118:2: (otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';' )
            // InternalMOloc.g:3119:3: otherlv_0= 'annotation' this_class_modification_1= ruleclass_modification[$current] otherlv_2= ';'
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
            if ( state.backtracking>0 ) { memoize(input, 57, ruleAnnotationClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationClause"


    // $ANTLR start "entryRuleEquationSection"
    // InternalMOloc.g:3145:1: entryRuleEquationSection returns [EObject current=null] : iv_ruleEquationSection= ruleEquationSection EOF ;
    public final EObject entryRuleEquationSection() throws RecognitionException {
        EObject current = null;
        int entryRuleEquationSection_StartIndex = input.index();
        EObject iv_ruleEquationSection = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // InternalMOloc.g:3145:56: (iv_ruleEquationSection= ruleEquationSection EOF )
            // InternalMOloc.g:3146:2: iv_ruleEquationSection= ruleEquationSection EOF
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
            if ( state.backtracking>0 ) { memoize(input, 58, entryRuleEquationSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEquationSection"


    // $ANTLR start "ruleEquationSection"
    // InternalMOloc.g:3152:1: ruleEquationSection returns [EObject current=null] : ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* ) ;
    public final EObject ruleEquationSection() throws RecognitionException {
        EObject current = null;
        int ruleEquationSection_StartIndex = input.index();
        Token lv_isInitial_1_0=null;
        Token otherlv_2=null;
        EObject lv_equations_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // InternalMOloc.g:3158:2: ( ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* ) )
            // InternalMOloc.g:3159:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* )
            {
            // InternalMOloc.g:3159:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* )
            // InternalMOloc.g:3160:3: () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )*
            {
            // InternalMOloc.g:3160:3: ()
            // InternalMOloc.g:3161:4: 
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

            // InternalMOloc.g:3170:3: ( (lv_isInitial_1_0= 'initial' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==58) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMOloc.g:3171:4: (lv_isInitial_1_0= 'initial' )
                    {
                    // InternalMOloc.g:3171:4: (lv_isInitial_1_0= 'initial' )
                    // InternalMOloc.g:3172:5: lv_isInitial_1_0= 'initial'
                    {
                    lv_isInitial_1_0=(Token)match(input,58,FOLLOW_57); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,59,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEquationSectionAccess().getEquationKeyword_2());
              		
            }
            // InternalMOloc.g:3188:3: ( (lv_equations_3_0= ruleEquation ) )*
            loop77:
            do {
                int alt77=2;
                alt77 = dfa77.predict(input);
                switch (alt77) {
            	case 1 :
            	    // InternalMOloc.g:3189:4: (lv_equations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3189:4: (lv_equations_3_0= ruleEquation )
            	    // InternalMOloc.g:3190:5: lv_equations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEquationSectionAccess().getEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    break loop77;
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
            if ( state.backtracking>0 ) { memoize(input, 59, ruleEquationSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEquationSection"


    // $ANTLR start "entryRuleEquation"
    // InternalMOloc.g:3211:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleEquation_StartIndex = input.index();
        EObject iv_ruleEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // InternalMOloc.g:3211:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalMOloc.g:3212:2: iv_ruleEquation= ruleEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 60, entryRuleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalMOloc.g:3218:1: ruleEquation returns [EObject current=null] : (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // InternalMOloc.g:3224:2: ( (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation ) )
            // InternalMOloc.g:3225:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )
            {
            // InternalMOloc.g:3225:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )
            int alt78=6;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalMOloc.g:3226:3: this_SimpleEquation_0= ruleSimpleEquation
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
                    // InternalMOloc.g:3238:3: this_IfEquation_1= ruleIfEquation
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
                    // InternalMOloc.g:3250:3: this_ForEquation_2= ruleForEquation
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
                    // InternalMOloc.g:3262:3: this_ConnectEquation_3= ruleConnectEquation
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
                    // InternalMOloc.g:3274:3: this_WhenEquation_4= ruleWhenEquation
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
                    // InternalMOloc.g:3286:3: this_FunctionEquation_5= ruleFunctionEquation
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
            if ( state.backtracking>0 ) { memoize(input, 61, ruleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleSimpleEquation"
    // InternalMOloc.g:3301:1: entryRuleSimpleEquation returns [EObject current=null] : iv_ruleSimpleEquation= ruleSimpleEquation EOF ;
    public final EObject entryRuleSimpleEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleSimpleEquation_StartIndex = input.index();
        EObject iv_ruleSimpleEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // InternalMOloc.g:3301:55: (iv_ruleSimpleEquation= ruleSimpleEquation EOF )
            // InternalMOloc.g:3302:2: iv_ruleSimpleEquation= ruleSimpleEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 62, entryRuleSimpleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleEquation"


    // $ANTLR start "ruleSimpleEquation"
    // InternalMOloc.g:3308:1: ruleSimpleEquation returns [EObject current=null] : ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // InternalMOloc.g:3314:2: ( ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' ) )
            // InternalMOloc.g:3315:2: ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' )
            {
            // InternalMOloc.g:3315:2: ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' )
            // InternalMOloc.g:3316:3: ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';'
            {
            // InternalMOloc.g:3316:3: ( (lv_left_0_0= ruleSimple_expression ) )
            // InternalMOloc.g:3317:4: (lv_left_0_0= ruleSimple_expression )
            {
            // InternalMOloc.g:3317:4: (lv_left_0_0= ruleSimple_expression )
            // InternalMOloc.g:3318:5: lv_left_0_0= ruleSimple_expression
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

            otherlv_1=(Token)match(input,29,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimpleEquationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMOloc.g:3339:3: ( (lv_right_2_0= ruleExpression ) )
            // InternalMOloc.g:3340:4: (lv_right_2_0= ruleExpression )
            {
            // InternalMOloc.g:3340:4: (lv_right_2_0= ruleExpression )
            // InternalMOloc.g:3341:5: lv_right_2_0= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 63, ruleSimpleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSimpleEquation"


    // $ANTLR start "entryRuleIfEquation"
    // InternalMOloc.g:3380:1: entryRuleIfEquation returns [EObject current=null] : iv_ruleIfEquation= ruleIfEquation EOF ;
    public final EObject entryRuleIfEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleIfEquation_StartIndex = input.index();
        EObject iv_ruleIfEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // InternalMOloc.g:3380:51: (iv_ruleIfEquation= ruleIfEquation EOF )
            // InternalMOloc.g:3381:2: iv_ruleIfEquation= ruleIfEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 64, entryRuleIfEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfEquation"


    // $ANTLR start "ruleIfEquation"
    // InternalMOloc.g:3387:1: ruleIfEquation returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) ;
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

        EObject lv_ifEquations_3_0 = null;

        AntlrDatatypeRuleToken lv_elseCondition_5_0 = null;

        EObject lv_elseifEquations_7_0 = null;

        EObject lv_elseEquations_9_0 = null;

        EObject this_description_12 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // InternalMOloc.g:3393:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) )
            // InternalMOloc.g:3394:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            {
            // InternalMOloc.g:3394:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            // InternalMOloc.g:3395:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfEquationAccess().getIfKeyword_0());
              		
            }
            // InternalMOloc.g:3399:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:3400:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:3400:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:3401:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfEquationAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            otherlv_2=(Token)match(input,60,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfEquationAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:3422:3: ( (lv_ifEquations_3_0= ruleEquation ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==28) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==29||LA79_2==32||LA79_2==36||(LA79_2>=50 && LA79_2<=51)||(LA79_2>=71 && LA79_2<=72)||(LA79_2>=74 && LA79_2<=85)) ) {
                        alt79=1;
                    }


                }
                else if ( ((LA79_0>=RULE_IDENT && LA79_0<=RULE_TRUE_FALSE)||LA79_0==24||LA79_0==31||LA79_0==34||(LA79_0>=36 && LA79_0<=37)||LA79_0==42||LA79_0==52||LA79_0==56||LA79_0==58||LA79_0==63||(LA79_0>=65 && LA79_0<=66)||LA79_0==73||(LA79_0>=80 && LA79_0<=82)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMOloc.g:3423:4: (lv_ifEquations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3423:4: (lv_ifEquations_3_0= ruleEquation )
            	    // InternalMOloc.g:3424:5: lv_ifEquations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfEquationAccess().getIfEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_ifEquations_3_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfEquationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ifEquations",
            	      						lv_ifEquations_3_0,
            	      						"dut.control.moloc.MOloc.Equation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalMOloc.g:3441:3: (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==61) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalMOloc.g:3442:4: otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )*
            	    {
            	    otherlv_4=(Token)match(input,61,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getIfEquationAccess().getElseifKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:3446:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:3447:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:3447:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:3448:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfEquationAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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

            	    otherlv_6=(Token)match(input,60,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getIfEquationAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:3469:4: ( (lv_elseifEquations_7_0= ruleEquation ) )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==28) ) {
            	            int LA80_2 = input.LA(2);

            	            if ( (LA80_2==29||LA80_2==32||LA80_2==36||(LA80_2>=50 && LA80_2<=51)||(LA80_2>=71 && LA80_2<=72)||(LA80_2>=74 && LA80_2<=85)) ) {
            	                alt80=1;
            	            }


            	        }
            	        else if ( ((LA80_0>=RULE_IDENT && LA80_0<=RULE_TRUE_FALSE)||LA80_0==24||LA80_0==31||LA80_0==34||(LA80_0>=36 && LA80_0<=37)||LA80_0==42||LA80_0==52||LA80_0==56||LA80_0==58||LA80_0==63||(LA80_0>=65 && LA80_0<=66)||LA80_0==73||(LA80_0>=80 && LA80_0<=82)) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalMOloc.g:3470:5: (lv_elseifEquations_7_0= ruleEquation )
            	    	    {
            	    	    // InternalMOloc.g:3470:5: (lv_elseifEquations_7_0= ruleEquation )
            	    	    // InternalMOloc.g:3471:6: lv_elseifEquations_7_0= ruleEquation
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getIfEquationAccess().getElseifEquationsEquationParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_60);
            	    	    lv_elseifEquations_7_0=ruleEquation();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getIfEquationRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"elseifEquations",
            	    	      							lv_elseifEquations_7_0,
            	    	      							"dut.control.moloc.MOloc.Equation");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // InternalMOloc.g:3489:3: (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==62) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMOloc.g:3490:4: otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )*
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfEquationAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalMOloc.g:3494:4: ( (lv_elseEquations_9_0= ruleEquation ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==28) ) {
                            int LA82_1 = input.LA(2);

                            if ( (LA82_1==29||LA82_1==32||LA82_1==36||(LA82_1>=50 && LA82_1<=51)||(LA82_1>=71 && LA82_1<=72)||(LA82_1>=74 && LA82_1<=85)) ) {
                                alt82=1;
                            }


                        }
                        else if ( ((LA82_0>=RULE_IDENT && LA82_0<=RULE_TRUE_FALSE)||LA82_0==24||LA82_0==31||LA82_0==34||(LA82_0>=36 && LA82_0<=37)||LA82_0==42||LA82_0==52||LA82_0==56||LA82_0==58||LA82_0==63||(LA82_0>=65 && LA82_0<=66)||LA82_0==73||(LA82_0>=80 && LA82_0<=82)) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalMOloc.g:3495:5: (lv_elseEquations_9_0= ruleEquation )
                    	    {
                    	    // InternalMOloc.g:3495:5: (lv_elseEquations_9_0= ruleEquation )
                    	    // InternalMOloc.g:3496:6: lv_elseEquations_9_0= ruleEquation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfEquationAccess().getElseEquationsEquationParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_elseEquations_9_0=ruleEquation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfEquationRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"elseEquations",
                    	      							lv_elseEquations_9_0,
                    	      							"dut.control.moloc.MOloc.Equation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_62); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 65, ruleIfEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfEquation"


    // $ANTLR start "entryRuleForEquation"
    // InternalMOloc.g:3544:1: entryRuleForEquation returns [EObject current=null] : iv_ruleForEquation= ruleForEquation EOF ;
    public final EObject entryRuleForEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleForEquation_StartIndex = input.index();
        EObject iv_ruleForEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // InternalMOloc.g:3544:52: (iv_ruleForEquation= ruleForEquation EOF )
            // InternalMOloc.g:3545:2: iv_ruleForEquation= ruleForEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 66, entryRuleForEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForEquation"


    // $ANTLR start "ruleForEquation"
    // InternalMOloc.g:3551:1: ruleForEquation returns [EObject current=null] : (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
    public final EObject ruleForEquation() throws RecognitionException {
        EObject current = null;
        int ruleForEquation_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_forIndices_1_0 = null;

        EObject lv_forEquations_3_0 = null;

        EObject this_description_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // InternalMOloc.g:3557:2: ( (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:3558:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:3558:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:3559:3: otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForEquationAccess().getForKeyword_0());
              		
            }
            // InternalMOloc.g:3563:3: ( (lv_forIndices_1_0= ruleForIndices ) )
            // InternalMOloc.g:3564:4: (lv_forIndices_1_0= ruleForIndices )
            {
            // InternalMOloc.g:3564:4: (lv_forIndices_1_0= ruleForIndices )
            // InternalMOloc.g:3565:5: lv_forIndices_1_0= ruleForIndices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForEquationAccess().getForIndicesForIndicesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            otherlv_2=(Token)match(input,64,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForEquationAccess().getLoopKeyword_2());
              		
            }
            // InternalMOloc.g:3586:3: ( (lv_forEquations_3_0= ruleEquation ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==28) ) {
                    int LA84_1 = input.LA(2);

                    if ( (LA84_1==29||LA84_1==32||LA84_1==36||(LA84_1>=50 && LA84_1<=51)||(LA84_1>=71 && LA84_1<=72)||(LA84_1>=74 && LA84_1<=85)) ) {
                        alt84=1;
                    }


                }
                else if ( ((LA84_0>=RULE_IDENT && LA84_0<=RULE_TRUE_FALSE)||LA84_0==24||LA84_0==31||LA84_0==34||(LA84_0>=36 && LA84_0<=37)||LA84_0==42||LA84_0==52||LA84_0==56||LA84_0==58||LA84_0==63||(LA84_0>=65 && LA84_0<=66)||LA84_0==73||(LA84_0>=80 && LA84_0<=82)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalMOloc.g:3587:4: (lv_forEquations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3587:4: (lv_forEquations_3_0= ruleEquation )
            	    // InternalMOloc.g:3588:5: lv_forEquations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForEquationAccess().getForEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_forEquations_3_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForEquationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"forEquations",
            	      						lv_forEquations_3_0,
            	      						"dut.control.moloc.MOloc.Equation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_64); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 67, ruleForEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForEquation"


    // $ANTLR start "entryRuleConnectEquation"
    // InternalMOloc.g:3635:1: entryRuleConnectEquation returns [EObject current=null] : iv_ruleConnectEquation= ruleConnectEquation EOF ;
    public final EObject entryRuleConnectEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleConnectEquation_StartIndex = input.index();
        EObject iv_ruleConnectEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // InternalMOloc.g:3635:56: (iv_ruleConnectEquation= ruleConnectEquation EOF )
            // InternalMOloc.g:3636:2: iv_ruleConnectEquation= ruleConnectEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 68, entryRuleConnectEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectEquation"


    // $ANTLR start "ruleConnectEquation"
    // InternalMOloc.g:3642:1: ruleConnectEquation returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // InternalMOloc.g:3648:2: ( (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:3649:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:3649:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:3650:3: otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectEquationAccess().getConnectKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectEquationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMOloc.g:3658:3: ( (lv_left_2_0= ruleComponent_reference ) )
            // InternalMOloc.g:3659:4: (lv_left_2_0= ruleComponent_reference )
            {
            // InternalMOloc.g:3659:4: (lv_left_2_0= ruleComponent_reference )
            // InternalMOloc.g:3660:5: lv_left_2_0= ruleComponent_reference
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

            otherlv_3=(Token)match(input,35,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConnectEquationAccess().getCommaKeyword_3());
              		
            }
            // InternalMOloc.g:3681:3: ( (lv_right_4_0= ruleComponent_reference ) )
            // InternalMOloc.g:3682:4: (lv_right_4_0= ruleComponent_reference )
            {
            // InternalMOloc.g:3682:4: (lv_right_4_0= ruleComponent_reference )
            // InternalMOloc.g:3683:5: lv_right_4_0= ruleComponent_reference
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
            if ( state.backtracking>0 ) { memoize(input, 69, ruleConnectEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConnectEquation"


    // $ANTLR start "entryRuleWhenEquation"
    // InternalMOloc.g:3726:1: entryRuleWhenEquation returns [EObject current=null] : iv_ruleWhenEquation= ruleWhenEquation EOF ;
    public final EObject entryRuleWhenEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleWhenEquation_StartIndex = input.index();
        EObject iv_ruleWhenEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // InternalMOloc.g:3726:53: (iv_ruleWhenEquation= ruleWhenEquation EOF )
            // InternalMOloc.g:3727:2: iv_ruleWhenEquation= ruleWhenEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 70, entryRuleWhenEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenEquation"


    // $ANTLR start "ruleWhenEquation"
    // InternalMOloc.g:3733:1: ruleWhenEquation returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) ;
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

        EObject lv_whenEquations_3_0 = null;

        AntlrDatatypeRuleToken lv_elseCondition_5_0 = null;

        EObject lv_elsewhenEquations_7_0 = null;

        EObject this_description_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // InternalMOloc.g:3739:2: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) )
            // InternalMOloc.g:3740:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            {
            // InternalMOloc.g:3740:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            // InternalMOloc.g:3741:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhenEquationAccess().getWhenKeyword_0());
              		
            }
            // InternalMOloc.g:3745:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:3746:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:3746:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:3747:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhenEquationAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            otherlv_2=(Token)match(input,60,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhenEquationAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:3768:3: ( (lv_whenEquations_3_0= ruleEquation ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==28) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==29||LA85_2==32||LA85_2==36||(LA85_2>=50 && LA85_2<=51)||(LA85_2>=71 && LA85_2<=72)||(LA85_2>=74 && LA85_2<=85)) ) {
                        alt85=1;
                    }


                }
                else if ( ((LA85_0>=RULE_IDENT && LA85_0<=RULE_TRUE_FALSE)||LA85_0==24||LA85_0==31||LA85_0==34||(LA85_0>=36 && LA85_0<=37)||LA85_0==42||LA85_0==52||LA85_0==56||LA85_0==58||LA85_0==63||(LA85_0>=65 && LA85_0<=66)||LA85_0==73||(LA85_0>=80 && LA85_0<=82)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalMOloc.g:3769:4: (lv_whenEquations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:3769:4: (lv_whenEquations_3_0= ruleEquation )
            	    // InternalMOloc.g:3770:5: lv_whenEquations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhenEquationAccess().getWhenEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_66);
            	    lv_whenEquations_3_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"whenEquations",
            	      						lv_whenEquations_3_0,
            	      						"dut.control.moloc.MOloc.Equation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // InternalMOloc.g:3787:3: (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==67) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalMOloc.g:3788:4: otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )*
            	    {
            	    otherlv_4=(Token)match(input,67,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getWhenEquationAccess().getElsewhenKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:3792:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:3793:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:3793:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:3794:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhenEquationAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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

            	    otherlv_6=(Token)match(input,60,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getWhenEquationAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:3815:4: ( (lv_elsewhenEquations_7_0= ruleEquation ) )*
            	    loop86:
            	    do {
            	        int alt86=2;
            	        int LA86_0 = input.LA(1);

            	        if ( (LA86_0==28) ) {
            	            int LA86_1 = input.LA(2);

            	            if ( (LA86_1==29||LA86_1==32||LA86_1==36||(LA86_1>=50 && LA86_1<=51)||(LA86_1>=71 && LA86_1<=72)||(LA86_1>=74 && LA86_1<=85)) ) {
            	                alt86=1;
            	            }


            	        }
            	        else if ( ((LA86_0>=RULE_IDENT && LA86_0<=RULE_TRUE_FALSE)||LA86_0==24||LA86_0==31||LA86_0==34||(LA86_0>=36 && LA86_0<=37)||LA86_0==42||LA86_0==52||LA86_0==56||LA86_0==58||LA86_0==63||(LA86_0>=65 && LA86_0<=66)||LA86_0==73||(LA86_0>=80 && LA86_0<=82)) ) {
            	            alt86=1;
            	        }


            	        switch (alt86) {
            	    	case 1 :
            	    	    // InternalMOloc.g:3816:5: (lv_elsewhenEquations_7_0= ruleEquation )
            	    	    {
            	    	    // InternalMOloc.g:3816:5: (lv_elsewhenEquations_7_0= ruleEquation )
            	    	    // InternalMOloc.g:3817:6: lv_elsewhenEquations_7_0= ruleEquation
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getWhenEquationAccess().getElsewhenEquationsEquationParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_66);
            	    	    lv_elsewhenEquations_7_0=ruleEquation();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getWhenEquationRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"elsewhenEquations",
            	    	      							lv_elsewhenEquations_7_0,
            	    	      							"dut.control.moloc.MOloc.Equation");
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
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_67); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 71, ruleWhenEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhenEquation"


    // $ANTLR start "entryRuleFunctionEquation"
    // InternalMOloc.g:3865:1: entryRuleFunctionEquation returns [EObject current=null] : iv_ruleFunctionEquation= ruleFunctionEquation EOF ;
    public final EObject entryRuleFunctionEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionEquation_StartIndex = input.index();
        EObject iv_ruleFunctionEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // InternalMOloc.g:3865:57: (iv_ruleFunctionEquation= ruleFunctionEquation EOF )
            // InternalMOloc.g:3866:2: iv_ruleFunctionEquation= ruleFunctionEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 72, entryRuleFunctionEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionEquation"


    // $ANTLR start "ruleFunctionEquation"
    // InternalMOloc.g:3872:1: ruleFunctionEquation returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' ) ;
    public final EObject ruleFunctionEquation() throws RecognitionException {
        EObject current = null;
        int ruleFunctionEquation_StartIndex = input.index();
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_component_0_0 = null;

        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject this_description_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // InternalMOloc.g:3878:2: ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' ) )
            // InternalMOloc.g:3879:2: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' )
            {
            // InternalMOloc.g:3879:2: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' )
            // InternalMOloc.g:3880:3: ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';'
            {
            // InternalMOloc.g:3880:3: ( (lv_component_0_0= ruleComponent_reference ) )
            // InternalMOloc.g:3881:4: (lv_component_0_0= ruleComponent_reference )
            {
            // InternalMOloc.g:3881:4: (lv_component_0_0= ruleComponent_reference )
            // InternalMOloc.g:3882:5: lv_component_0_0= ruleComponent_reference
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

            // InternalMOloc.g:3899:3: ( (lv_function_1_0= ruleFunctionCallArgs ) )
            // InternalMOloc.g:3900:4: (lv_function_1_0= ruleFunctionCallArgs )
            {
            // InternalMOloc.g:3900:4: (lv_function_1_0= ruleFunctionCallArgs )
            // InternalMOloc.g:3901:5: lv_function_1_0= ruleFunctionCallArgs
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
            if ( state.backtracking>0 ) { memoize(input, 73, ruleFunctionEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionEquation"


    // $ANTLR start "entryRuleAlgorithmSection"
    // InternalMOloc.g:3940:1: entryRuleAlgorithmSection returns [EObject current=null] : iv_ruleAlgorithmSection= ruleAlgorithmSection EOF ;
    public final EObject entryRuleAlgorithmSection() throws RecognitionException {
        EObject current = null;
        int entryRuleAlgorithmSection_StartIndex = input.index();
        EObject iv_ruleAlgorithmSection = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // InternalMOloc.g:3940:57: (iv_ruleAlgorithmSection= ruleAlgorithmSection EOF )
            // InternalMOloc.g:3941:2: iv_ruleAlgorithmSection= ruleAlgorithmSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlgorithmSectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithmSection=ruleAlgorithmSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlgorithmSection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, entryRuleAlgorithmSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithmSection"


    // $ANTLR start "ruleAlgorithmSection"
    // InternalMOloc.g:3947:1: ruleAlgorithmSection returns [EObject current=null] : ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleAlgorithmSection() throws RecognitionException {
        EObject current = null;
        int ruleAlgorithmSection_StartIndex = input.index();
        Token lv_isInitial_1_0=null;
        Token otherlv_2=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // InternalMOloc.g:3953:2: ( ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalMOloc.g:3954:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalMOloc.g:3954:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalMOloc.g:3955:3: () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )*
            {
            // InternalMOloc.g:3955:3: ()
            // InternalMOloc.g:3956:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAlgorithmSectionAccess().getAlgorithmSectionAction_0(),
              					current);
              			
            }

            }

            // InternalMOloc.g:3965:3: ( (lv_isInitial_1_0= 'initial' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==58) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMOloc.g:3966:4: (lv_isInitial_1_0= 'initial' )
                    {
                    // InternalMOloc.g:3966:4: (lv_isInitial_1_0= 'initial' )
                    // InternalMOloc.g:3967:5: lv_isInitial_1_0= 'initial'
                    {
                    lv_isInitial_1_0=(Token)match(input,58,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isInitial_1_0, grammarAccess.getAlgorithmSectionAccess().getIsInitialInitialKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAlgorithmSectionRule());
                      					}
                      					setWithLastConsumed(current, "isInitial", lv_isInitial_1_0 != null, "initial");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,68,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAlgorithmSectionAccess().getAlgorithmKeyword_2());
              		
            }
            // InternalMOloc.g:3983:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop89:
            do {
                int alt89=2;
                alt89 = dfa89.predict(input);
                switch (alt89) {
            	case 1 :
            	    // InternalMOloc.g:3984:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:3984:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMOloc.g:3985:5: lv_statements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAlgorithmSectionAccess().getStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_69);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAlgorithmSectionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_3_0,
            	      						"dut.control.moloc.MOloc.Statement");
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, ruleAlgorithmSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithmSection"


    // $ANTLR start "entryRuleStatement"
    // InternalMOloc.g:4006:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleStatement_StartIndex = input.index();
        EObject iv_ruleStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // InternalMOloc.g:4006:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMOloc.g:4007:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, entryRuleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMOloc.g:4013:1: ruleStatement returns [EObject current=null] : (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;
        int ruleStatement_StartIndex = input.index();
        EObject this_FunctionStatement_0 = null;

        EObject this_BreakStatement_1 = null;

        EObject this_ReturnStatement_2 = null;

        EObject this_IfStatement_3 = null;

        EObject this_ForStatement_4 = null;

        EObject this_WhenStatement_5 = null;

        EObject this_WhileStatement_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // InternalMOloc.g:4019:2: ( (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement ) )
            // InternalMOloc.g:4020:2: (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement )
            {
            // InternalMOloc.g:4020:2: (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement )
            int alt90=7;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case 31:
            case 37:
                {
                alt90=1;
                }
                break;
            case 45:
                {
                alt90=2;
                }
                break;
            case 69:
                {
                alt90=3;
                }
                break;
            case 56:
                {
                alt90=4;
                }
                break;
            case 63:
                {
                alt90=5;
                }
                break;
            case 66:
                {
                alt90=6;
                }
                break;
            case 70:
                {
                alt90=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalMOloc.g:4021:3: this_FunctionStatement_0= ruleFunctionStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getFunctionStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionStatement_0=ruleFunctionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionStatement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:4033:3: this_BreakStatement_1= ruleBreakStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BreakStatement_1=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BreakStatement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:4045:3: this_ReturnStatement_2= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnStatement_2=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReturnStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:4057:3: this_IfStatement_3= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_3=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMOloc.g:4069:3: this_ForStatement_4= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_4=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMOloc.g:4081:3: this_WhenStatement_5= ruleWhenStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhenStatementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhenStatement_5=ruleWhenStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhenStatement_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMOloc.g:4093:3: this_WhileStatement_6= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_6=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_6;
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
            if ( state.backtracking>0 ) { memoize(input, 77, ruleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleFunctionStatement"
    // InternalMOloc.g:4108:1: entryRuleFunctionStatement returns [EObject current=null] : iv_ruleFunctionStatement= ruleFunctionStatement EOF ;
    public final EObject entryRuleFunctionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionStatement_StartIndex = input.index();
        EObject iv_ruleFunctionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // InternalMOloc.g:4108:58: (iv_ruleFunctionStatement= ruleFunctionStatement EOF )
            // InternalMOloc.g:4109:2: iv_ruleFunctionStatement= ruleFunctionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionStatement=ruleFunctionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, entryRuleFunctionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionStatement"


    // $ANTLR start "ruleFunctionStatement"
    // InternalMOloc.g:4115:1: ruleFunctionStatement returns [EObject current=null] : ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' ) ;
    public final EObject ruleFunctionStatement() throws RecognitionException {
        EObject current = null;
        int ruleFunctionStatement_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_component_0_0 = null;

        AntlrDatatypeRuleToken lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_function_3_0 = null;

        AntlrDatatypeRuleToken lv_output_5_0 = null;

        AntlrDatatypeRuleToken lv_component_8_0 = null;

        AntlrDatatypeRuleToken lv_function_9_0 = null;

        EObject this_description_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // InternalMOloc.g:4121:2: ( ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' ) )
            // InternalMOloc.g:4122:2: ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' )
            {
            // InternalMOloc.g:4122:2: ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' )
            // InternalMOloc.g:4123:3: ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';'
            {
            // InternalMOloc.g:4123:3: ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_IDENT||LA92_0==37) ) {
                alt92=1;
            }
            else if ( (LA92_0==31) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalMOloc.g:4124:4: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) )
                    {
                    // InternalMOloc.g:4124:4: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) )
                    // InternalMOloc.g:4125:5: ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) )
                    {
                    // InternalMOloc.g:4125:5: ( (lv_component_0_0= ruleComponent_reference ) )
                    // InternalMOloc.g:4126:6: (lv_component_0_0= ruleComponent_reference )
                    {
                    // InternalMOloc.g:4126:6: (lv_component_0_0= ruleComponent_reference )
                    // InternalMOloc.g:4127:7: lv_component_0_0= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getComponentComponent_referenceParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_70);
                    lv_component_0_0=ruleComponent_reference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
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

                    // InternalMOloc.g:4144:5: ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) )
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==44) ) {
                        alt91=1;
                    }
                    else if ( (LA91_0==31) ) {
                        alt91=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalMOloc.g:4145:6: (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) )
                            {
                            // InternalMOloc.g:4145:6: (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) )
                            // InternalMOloc.g:4146:7: otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,44,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_1, grammarAccess.getFunctionStatementAccess().getColonEqualsSignKeyword_0_0_1_0_0());
                              						
                            }
                            // InternalMOloc.g:4150:7: ( (lv_expression_2_0= ruleExpression ) )
                            // InternalMOloc.g:4151:8: (lv_expression_2_0= ruleExpression )
                            {
                            // InternalMOloc.g:4151:8: (lv_expression_2_0= ruleExpression )
                            // InternalMOloc.g:4152:9: lv_expression_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getFunctionStatementAccess().getExpressionExpressionParserRuleCall_0_0_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_15);
                            lv_expression_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
                              									}
                              									set(
                              										current,
                              										"expression",
                              										lv_expression_2_0,
                              										"dut.control.moloc.MOloc.Expression");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:4171:6: ( (lv_function_3_0= ruleFunctionCallArgs ) )
                            {
                            // InternalMOloc.g:4171:6: ( (lv_function_3_0= ruleFunctionCallArgs ) )
                            // InternalMOloc.g:4172:7: (lv_function_3_0= ruleFunctionCallArgs )
                            {
                            // InternalMOloc.g:4172:7: (lv_function_3_0= ruleFunctionCallArgs )
                            // InternalMOloc.g:4173:8: lv_function_3_0= ruleFunctionCallArgs
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getFunctionStatementAccess().getFunctionFunctionCallArgsParserRuleCall_0_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_15);
                            lv_function_3_0=ruleFunctionCallArgs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
                              								}
                              								set(
                              									current,
                              									"function",
                              									lv_function_3_0,
                              									"dut.control.moloc.MOloc.FunctionCallArgs");
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
                    // InternalMOloc.g:4193:4: (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) )
                    {
                    // InternalMOloc.g:4193:4: (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) )
                    // InternalMOloc.g:4194:5: otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getFunctionStatementAccess().getLeftParenthesisKeyword_0_1_0());
                      				
                    }
                    // InternalMOloc.g:4198:5: ( (lv_output_5_0= ruleOutputExpressionList ) )
                    // InternalMOloc.g:4199:6: (lv_output_5_0= ruleOutputExpressionList )
                    {
                    // InternalMOloc.g:4199:6: (lv_output_5_0= ruleOutputExpressionList )
                    // InternalMOloc.g:4200:7: lv_output_5_0= ruleOutputExpressionList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getOutputOutputExpressionListParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_18);
                    lv_output_5_0=ruleOutputExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
                      							}
                      							set(
                      								current,
                      								"output",
                      								lv_output_5_0,
                      								"dut.control.moloc.MOloc.OutputExpressionList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFunctionStatementAccess().getRightParenthesisKeyword_0_1_2());
                      				
                    }
                    otherlv_7=(Token)match(input,44,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getFunctionStatementAccess().getColonEqualsSignKeyword_0_1_3());
                      				
                    }
                    // InternalMOloc.g:4225:5: ( (lv_component_8_0= ruleComponent_reference ) )
                    // InternalMOloc.g:4226:6: (lv_component_8_0= ruleComponent_reference )
                    {
                    // InternalMOloc.g:4226:6: (lv_component_8_0= ruleComponent_reference )
                    // InternalMOloc.g:4227:7: lv_component_8_0= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getComponentComponent_referenceParserRuleCall_0_1_4_0());
                      						
                    }
                    pushFollow(FOLLOW_16);
                    lv_component_8_0=ruleComponent_reference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
                      							}
                      							set(
                      								current,
                      								"component",
                      								lv_component_8_0,
                      								"dut.control.moloc.MOloc.Component_reference");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMOloc.g:4244:5: ( (lv_function_9_0= ruleFunctionCallArgs ) )
                    // InternalMOloc.g:4245:6: (lv_function_9_0= ruleFunctionCallArgs )
                    {
                    // InternalMOloc.g:4245:6: (lv_function_9_0= ruleFunctionCallArgs )
                    // InternalMOloc.g:4246:7: lv_function_9_0= ruleFunctionCallArgs
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getFunctionFunctionCallArgsParserRuleCall_0_1_5_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
                    lv_function_9_0=ruleFunctionCallArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
                      							}
                      							set(
                      								current,
                      								"function",
                      								lv_function_9_0,
                      								"dut.control.moloc.MOloc.FunctionCallArgs");
                      							afterParserOrEnumRuleCall();
                      						
                    }

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
              				current = createModelElement(grammarAccess.getFunctionStatementRule());
              			}
              			newCompositeNode(grammarAccess.getFunctionStatementAccess().getDescriptionParserRuleCall_1());
              		
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

              			newLeafNode(otherlv_11, grammarAccess.getFunctionStatementAccess().getSemicolonKeyword_2());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 79, ruleFunctionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalMOloc.g:4287:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleBreakStatement_StartIndex = input.index();
        EObject iv_ruleBreakStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // InternalMOloc.g:4287:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalMOloc.g:4288:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, entryRuleBreakStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalMOloc.g:4294:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;
        int ruleBreakStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // InternalMOloc.g:4300:2: ( (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' ) )
            // InternalMOloc.g:4301:2: (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' )
            {
            // InternalMOloc.g:4301:2: (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' )
            // InternalMOloc.g:4302:3: otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakStatementAccess().getBreakKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getBreakStatementRule());
              			}
              			newCompositeNode(grammarAccess.getBreakStatementAccess().getDescriptionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_1=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_2());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 81, ruleBreakStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalMOloc.g:4328:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleReturnStatement_StartIndex = input.index();
        EObject iv_ruleReturnStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // InternalMOloc.g:4328:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalMOloc.g:4329:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, entryRuleReturnStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalMOloc.g:4335:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;
        int ruleReturnStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // InternalMOloc.g:4341:2: ( (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' ) )
            // InternalMOloc.g:4342:2: (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' )
            {
            // InternalMOloc.g:4342:2: (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' )
            // InternalMOloc.g:4343:3: otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getReturnStatementRule());
              			}
              			newCompositeNode(grammarAccess.getReturnStatementAccess().getDescriptionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_1=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_2());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 83, ruleReturnStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMOloc.g:4369:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleIfStatement_StartIndex = input.index();
        EObject iv_ruleIfStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // InternalMOloc.g:4369:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMOloc.g:4370:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, entryRuleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMOloc.g:4376:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;
        int ruleIfStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_condition_1_0 = null;

        EObject lv_ifStatements_3_0 = null;

        AntlrDatatypeRuleToken lv_elseCondition_5_0 = null;

        EObject lv_elseifStatements_7_0 = null;

        EObject lv_elseStatements_9_0 = null;

        EObject this_description_12 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // InternalMOloc.g:4382:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) )
            // InternalMOloc.g:4383:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            {
            // InternalMOloc.g:4383:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            // InternalMOloc.g:4384:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            // InternalMOloc.g:4388:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:4389:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:4389:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:4390:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
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

            otherlv_2=(Token)match(input,60,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:4411:3: ( (lv_ifStatements_3_0= ruleStatement ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==RULE_IDENT||LA93_0==31||LA93_0==37||LA93_0==45||LA93_0==56||LA93_0==63||LA93_0==66||(LA93_0>=69 && LA93_0<=70)) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalMOloc.g:4412:4: (lv_ifStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:4412:4: (lv_ifStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:4413:5: lv_ifStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getIfStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_73);
            	    lv_ifStatements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ifStatements",
            	      						lv_ifStatements_3_0,
            	      						"dut.control.moloc.MOloc.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            // InternalMOloc.g:4430:3: (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==61) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalMOloc.g:4431:4: otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )*
            	    {
            	    otherlv_4=(Token)match(input,61,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getElseifKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:4435:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:4436:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:4436:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:4437:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_elseCondition_5_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
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

            	    otherlv_6=(Token)match(input,60,FOLLOW_73); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:4458:4: ( (lv_elseifStatements_7_0= ruleStatement ) )*
            	    loop94:
            	    do {
            	        int alt94=2;
            	        int LA94_0 = input.LA(1);

            	        if ( (LA94_0==RULE_IDENT||LA94_0==31||LA94_0==37||LA94_0==45||LA94_0==56||LA94_0==63||LA94_0==66||(LA94_0>=69 && LA94_0<=70)) ) {
            	            alt94=1;
            	        }


            	        switch (alt94) {
            	    	case 1 :
            	    	    // InternalMOloc.g:4459:5: (lv_elseifStatements_7_0= ruleStatement )
            	    	    {
            	    	    // InternalMOloc.g:4459:5: (lv_elseifStatements_7_0= ruleStatement )
            	    	    // InternalMOloc.g:4460:6: lv_elseifStatements_7_0= ruleStatement
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseifStatementsStatementParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_73);
            	    	    lv_elseifStatements_7_0=ruleStatement();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"elseifStatements",
            	    	      							lv_elseifStatements_7_0,
            	    	      							"dut.control.moloc.MOloc.Statement");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop94;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            // InternalMOloc.g:4478:3: (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==62) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalMOloc.g:4479:4: otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )*
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalMOloc.g:4483:4: ( (lv_elseStatements_9_0= ruleStatement ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==RULE_IDENT||LA96_0==31||LA96_0==37||LA96_0==45||LA96_0==56||LA96_0==63||LA96_0==66||(LA96_0>=69 && LA96_0<=70)) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalMOloc.g:4484:5: (lv_elseStatements_9_0= ruleStatement )
                    	    {
                    	    // InternalMOloc.g:4484:5: (lv_elseStatements_9_0= ruleStatement )
                    	    // InternalMOloc.g:4485:6: lv_elseStatements_9_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_74);
                    	    lv_elseStatements_9_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"elseStatements",
                    	      							lv_elseStatements_9_0,
                    	      							"dut.control.moloc.MOloc.Statement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getEndKeyword_6());
              		
            }
            otherlv_11=(Token)match(input,56,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getIfStatementAccess().getIfKeyword_7());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getIfStatementRule());
              			}
              			newCompositeNode(grammarAccess.getIfStatementAccess().getDescriptionParserRuleCall_8());
              		
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

              			newLeafNode(otherlv_13, grammarAccess.getIfStatementAccess().getSemicolonKeyword_9());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 85, ruleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalMOloc.g:4533:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleForStatement_StartIndex = input.index();
        EObject iv_ruleForStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // InternalMOloc.g:4533:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMOloc.g:4534:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, entryRuleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMOloc.g:4540:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;
        int ruleForStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_forIndices_1_0 = null;

        EObject lv_forStatements_3_0 = null;

        EObject this_description_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // InternalMOloc.g:4546:2: ( (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:4547:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:4547:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:4548:3: otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            // InternalMOloc.g:4552:3: ( (lv_forIndices_1_0= ruleForIndices ) )
            // InternalMOloc.g:4553:4: (lv_forIndices_1_0= ruleForIndices )
            {
            // InternalMOloc.g:4553:4: (lv_forIndices_1_0= ruleForIndices )
            // InternalMOloc.g:4554:5: lv_forIndices_1_0= ruleForIndices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getForIndicesForIndicesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_63);
            lv_forIndices_1_0=ruleForIndices();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
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

            otherlv_2=(Token)match(input,64,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLoopKeyword_2());
              		
            }
            // InternalMOloc.g:4575:3: ( (lv_forStatements_3_0= ruleStatement ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_IDENT||LA98_0==31||LA98_0==37||LA98_0==45||LA98_0==56||LA98_0==63||LA98_0==66||(LA98_0>=69 && LA98_0<=70)) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalMOloc.g:4576:4: (lv_forStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:4576:4: (lv_forStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:4577:5: lv_forStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForStatementAccess().getForStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_74);
            	    lv_forStatements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"forStatements",
            	      						lv_forStatements_3_0,
            	      						"dut.control.moloc.MOloc.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getEndKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,63,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getForKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getForStatementRule());
              			}
              			newCompositeNode(grammarAccess.getForStatementAccess().getDescriptionParserRuleCall_6());
              		
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

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getSemicolonKeyword_7());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 87, ruleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleWhenStatement"
    // InternalMOloc.g:4624:1: entryRuleWhenStatement returns [EObject current=null] : iv_ruleWhenStatement= ruleWhenStatement EOF ;
    public final EObject entryRuleWhenStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleWhenStatement_StartIndex = input.index();
        EObject iv_ruleWhenStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // InternalMOloc.g:4624:54: (iv_ruleWhenStatement= ruleWhenStatement EOF )
            // InternalMOloc.g:4625:2: iv_ruleWhenStatement= ruleWhenStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhenStatement=ruleWhenStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhenStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, entryRuleWhenStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenStatement"


    // $ANTLR start "ruleWhenStatement"
    // InternalMOloc.g:4631:1: ruleWhenStatement returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) ;
    public final EObject ruleWhenStatement() throws RecognitionException {
        EObject current = null;
        int ruleWhenStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_condition_1_0 = null;

        EObject lv_whenStatements_3_0 = null;

        AntlrDatatypeRuleToken lv_elseCondition_5_0 = null;

        EObject lv_whenStatements_7_0 = null;

        EObject this_description_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // InternalMOloc.g:4637:2: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) )
            // InternalMOloc.g:4638:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            {
            // InternalMOloc.g:4638:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            // InternalMOloc.g:4639:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhenStatementAccess().getWhenKeyword_0());
              		
            }
            // InternalMOloc.g:4643:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:4644:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:4644:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:4645:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhenStatementAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhenStatementRule());
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

            otherlv_2=(Token)match(input,60,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhenStatementAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:4666:3: ( (lv_whenStatements_3_0= ruleStatement ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==RULE_IDENT||LA99_0==31||LA99_0==37||LA99_0==45||LA99_0==56||LA99_0==63||LA99_0==66||(LA99_0>=69 && LA99_0<=70)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalMOloc.g:4667:4: (lv_whenStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:4667:4: (lv_whenStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:4668:5: lv_whenStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhenStatementAccess().getWhenStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_75);
            	    lv_whenStatements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhenStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"whenStatements",
            	      						lv_whenStatements_3_0,
            	      						"dut.control.moloc.MOloc.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // InternalMOloc.g:4685:3: (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==67) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalMOloc.g:4686:4: otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )*
            	    {
            	    otherlv_4=(Token)match(input,67,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getWhenStatementAccess().getElsewhenKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:4690:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:4691:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:4691:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:4692:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhenStatementAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_elseCondition_5_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWhenStatementRule());
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

            	    otherlv_6=(Token)match(input,60,FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getWhenStatementAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:4713:4: ( (lv_whenStatements_7_0= ruleStatement ) )*
            	    loop100:
            	    do {
            	        int alt100=2;
            	        int LA100_0 = input.LA(1);

            	        if ( (LA100_0==RULE_IDENT||LA100_0==31||LA100_0==37||LA100_0==45||LA100_0==56||LA100_0==63||LA100_0==66||(LA100_0>=69 && LA100_0<=70)) ) {
            	            alt100=1;
            	        }


            	        switch (alt100) {
            	    	case 1 :
            	    	    // InternalMOloc.g:4714:5: (lv_whenStatements_7_0= ruleStatement )
            	    	    {
            	    	    // InternalMOloc.g:4714:5: (lv_whenStatements_7_0= ruleStatement )
            	    	    // InternalMOloc.g:4715:6: lv_whenStatements_7_0= ruleStatement
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getWhenStatementAccess().getWhenStatementsStatementParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_75);
            	    	    lv_whenStatements_7_0=ruleStatement();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getWhenStatementRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"whenStatements",
            	    	      							lv_whenStatements_7_0,
            	    	      							"dut.control.moloc.MOloc.Statement");
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
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getWhenStatementAccess().getEndKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,66,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getWhenStatementAccess().getWhenKeyword_6());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getWhenStatementRule());
              			}
              			newCompositeNode(grammarAccess.getWhenStatementAccess().getDescriptionParserRuleCall_7());
              		
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

              			newLeafNode(otherlv_11, grammarAccess.getWhenStatementAccess().getSemicolonKeyword_8());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 89, ruleWhenStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhenStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalMOloc.g:4763:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleWhileStatement_StartIndex = input.index();
        EObject iv_ruleWhileStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // InternalMOloc.g:4763:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalMOloc.g:4764:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, entryRuleWhileStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalMOloc.g:4770:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;
        int ruleWhileStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_condition_1_0 = null;

        EObject lv_whileStatements_3_0 = null;

        EObject this_description_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // InternalMOloc.g:4776:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:4777:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:4777:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:4778:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            // InternalMOloc.g:4782:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:4783:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:4783:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:4784:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_63);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
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

            otherlv_2=(Token)match(input,64,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLoopKeyword_2());
              		
            }
            // InternalMOloc.g:4805:3: ( (lv_whileStatements_3_0= ruleStatement ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==RULE_IDENT||LA102_0==31||LA102_0==37||LA102_0==45||LA102_0==56||LA102_0==63||LA102_0==66||(LA102_0>=69 && LA102_0<=70)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalMOloc.g:4806:4: (lv_whileStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:4806:4: (lv_whileStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:4807:5: lv_whileStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_74);
            	    lv_whileStatements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"whileStatements",
            	      						lv_whileStatements_3_0,
            	      						"dut.control.moloc.MOloc.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getEndKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,70,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getWhileKeyword_5());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getWhileStatementRule());
              			}
              			newCompositeNode(grammarAccess.getWhileStatementAccess().getDescriptionParserRuleCall_6());
              		
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

              			newLeafNode(otherlv_7, grammarAccess.getWhileStatementAccess().getSemicolonKeyword_7());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 91, ruleWhileStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMOloc.g:4854:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;
        int entryRuleExpression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // InternalMOloc.g:4854:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMOloc.g:4855:2: iv_ruleExpression= ruleExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 92, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMOloc.g:4861:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // InternalMOloc.g:4867:2: ( (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) )
            // InternalMOloc.g:4868:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            {
            // InternalMOloc.g:4868:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=RULE_IDENT && LA104_0<=RULE_TRUE_FALSE)||LA104_0==24||LA104_0==28||LA104_0==31||LA104_0==34||(LA104_0>=36 && LA104_0<=37)||LA104_0==42||LA104_0==52||LA104_0==58||LA104_0==73||(LA104_0>=80 && LA104_0<=82)) ) {
                alt104=1;
            }
            else if ( (LA104_0==56) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalMOloc.g:4869:3: this_Simple_expression_0= ruleSimple_expression
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
                    // InternalMOloc.g:4880:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    {
                    // InternalMOloc.g:4880:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    // InternalMOloc.g:4881:4: kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression
                    {
                    kw=(Token)match(input,56,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getIfKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_59);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,60,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_77);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:4911:4: (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==61) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalMOloc.g:4912:5: kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression
                    	    {
                    	    kw=(Token)match(input,61,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getExpressionAccess().getElseifKeyword_1_4_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_4_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_59);
                    	    this_Expression_6=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_Expression_6);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    kw=(Token)match(input,60,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_4_2());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_4_3());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_77);
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
                    	    break loop103;
                        }
                    } while (true);

                    kw=(Token)match(input,62,FOLLOW_34); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 93, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSimple_expression"
    // InternalMOloc.g:4963:1: entryRuleSimple_expression returns [String current=null] : iv_ruleSimple_expression= ruleSimple_expression EOF ;
    public final String entryRuleSimple_expression() throws RecognitionException {
        String current = null;
        int entryRuleSimple_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSimple_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // InternalMOloc.g:4963:57: (iv_ruleSimple_expression= ruleSimple_expression EOF )
            // InternalMOloc.g:4964:2: iv_ruleSimple_expression= ruleSimple_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 94, entryRuleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSimple_expression"


    // $ANTLR start "ruleSimple_expression"
    // InternalMOloc.g:4970:1: ruleSimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? ) ;
    public final AntlrDatatypeRuleToken ruleSimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSimple_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_expression_0 = null;

        AntlrDatatypeRuleToken this_Logical_expression_2 = null;

        AntlrDatatypeRuleToken this_Logical_expression_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // InternalMOloc.g:4976:2: ( (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? ) )
            // InternalMOloc.g:4977:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? )
            {
            // InternalMOloc.g:4977:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? )
            // InternalMOloc.g:4978:3: this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_78);
            this_Logical_expression_0=ruleLogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4988:3: (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==32) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalMOloc.g:4989:4: kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )?
                    {
                    kw=(Token)match(input,32,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_78);
                    this_Logical_expression_2=ruleLogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Logical_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:5004:4: (kw= ':' this_Logical_expression_4= ruleLogical_expression )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==32) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalMOloc.g:5005:5: kw= ':' this_Logical_expression_4= ruleLogical_expression
                            {
                            kw=(Token)match(input,32,FOLLOW_79); if (state.failed) return current;
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
                            break;

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
            if ( state.backtracking>0 ) { memoize(input, 95, ruleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSimple_expression"


    // $ANTLR start "entryRuleLogical_expression"
    // InternalMOloc.g:5026:1: entryRuleLogical_expression returns [String current=null] : iv_ruleLogical_expression= ruleLogical_expression EOF ;
    public final String entryRuleLogical_expression() throws RecognitionException {
        String current = null;
        int entryRuleLogical_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // InternalMOloc.g:5026:58: (iv_ruleLogical_expression= ruleLogical_expression EOF )
            // InternalMOloc.g:5027:2: iv_ruleLogical_expression= ruleLogical_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 96, entryRuleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_expression"


    // $ANTLR start "ruleLogical_expression"
    // InternalMOloc.g:5033:1: ruleLogical_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_term_0 = null;

        AntlrDatatypeRuleToken this_Logical_term_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // InternalMOloc.g:5039:2: ( (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) )
            // InternalMOloc.g:5040:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            {
            // InternalMOloc.g:5040:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            // InternalMOloc.g:5041:3: this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_80);
            this_Logical_term_0=ruleLogical_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_term_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5051:3: (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==71) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalMOloc.g:5052:4: kw= 'or' this_Logical_term_2= ruleLogical_term
            	    {
            	    kw=(Token)match(input,71,FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_expressionAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_80);
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
            	    break loop107;
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
            if ( state.backtracking>0 ) { memoize(input, 97, ruleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_expression"


    // $ANTLR start "entryRuleLogical_term"
    // InternalMOloc.g:5072:1: entryRuleLogical_term returns [String current=null] : iv_ruleLogical_term= ruleLogical_term EOF ;
    public final String entryRuleLogical_term() throws RecognitionException {
        String current = null;
        int entryRuleLogical_term_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_term = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // InternalMOloc.g:5072:52: (iv_ruleLogical_term= ruleLogical_term EOF )
            // InternalMOloc.g:5073:2: iv_ruleLogical_term= ruleLogical_term EOF
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
            if ( state.backtracking>0 ) { memoize(input, 98, entryRuleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_term"


    // $ANTLR start "ruleLogical_term"
    // InternalMOloc.g:5079:1: ruleLogical_term returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_term() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_term_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_factor_0 = null;

        AntlrDatatypeRuleToken this_Logical_factor_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // InternalMOloc.g:5085:2: ( (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) )
            // InternalMOloc.g:5086:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            {
            // InternalMOloc.g:5086:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            // InternalMOloc.g:5087:3: this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_81);
            this_Logical_factor_0=ruleLogical_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5097:3: (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==72) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalMOloc.g:5098:4: kw= 'and' this_Logical_factor_2= ruleLogical_factor
            	    {
            	    kw=(Token)match(input,72,FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_termAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_81);
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
            	    break loop108;
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
            if ( state.backtracking>0 ) { memoize(input, 99, ruleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_term"


    // $ANTLR start "entryRuleLogical_factor"
    // InternalMOloc.g:5118:1: entryRuleLogical_factor returns [String current=null] : iv_ruleLogical_factor= ruleLogical_factor EOF ;
    public final String entryRuleLogical_factor() throws RecognitionException {
        String current = null;
        int entryRuleLogical_factor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_factor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // InternalMOloc.g:5118:54: (iv_ruleLogical_factor= ruleLogical_factor EOF )
            // InternalMOloc.g:5119:2: iv_ruleLogical_factor= ruleLogical_factor EOF
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
            if ( state.backtracking>0 ) { memoize(input, 100, entryRuleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_factor"


    // $ANTLR start "ruleLogical_factor"
    // InternalMOloc.g:5125:1: ruleLogical_factor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' )? this_Relation_1= ruleRelation ) ;
    public final AntlrDatatypeRuleToken ruleLogical_factor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_factor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Relation_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // InternalMOloc.g:5131:2: ( ( (kw= 'not' )? this_Relation_1= ruleRelation ) )
            // InternalMOloc.g:5132:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            {
            // InternalMOloc.g:5132:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            // InternalMOloc.g:5133:3: (kw= 'not' )? this_Relation_1= ruleRelation
            {
            // InternalMOloc.g:5133:3: (kw= 'not' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==73) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalMOloc.g:5134:4: kw= 'not'
                    {
                    kw=(Token)match(input,73,FOLLOW_79); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 101, ruleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_factor"


    // $ANTLR start "entryRuleRelation"
    // InternalMOloc.g:5154:1: entryRuleRelation returns [String current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final String entryRuleRelation() throws RecognitionException {
        String current = null;
        int entryRuleRelation_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleRelation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // InternalMOloc.g:5154:48: (iv_ruleRelation= ruleRelation EOF )
            // InternalMOloc.g:5155:2: iv_ruleRelation= ruleRelation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 102, entryRuleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMOloc.g:5161:1: ruleRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleRelation_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Arithmetic_expression_0 = null;

        AntlrDatatypeRuleToken this_Arithmetic_expression_7 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // InternalMOloc.g:5167:2: ( (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) )
            // InternalMOloc.g:5168:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            {
            // InternalMOloc.g:5168:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            // InternalMOloc.g:5169:3: this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationAccess().getArithmetic_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_82);
            this_Arithmetic_expression_0=ruleArithmetic_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Arithmetic_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5179:3: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=74 && LA111_0<=79)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalMOloc.g:5180:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression
                    {
                    // InternalMOloc.g:5180:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
                    int alt110=6;
                    switch ( input.LA(1) ) {
                    case 74:
                        {
                        alt110=1;
                        }
                        break;
                    case 75:
                        {
                        alt110=2;
                        }
                        break;
                    case 76:
                        {
                        alt110=3;
                        }
                        break;
                    case 77:
                        {
                        alt110=4;
                        }
                        break;
                    case 78:
                        {
                        alt110=5;
                        }
                        break;
                    case 79:
                        {
                        alt110=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }

                    switch (alt110) {
                        case 1 :
                            // InternalMOloc.g:5181:5: kw= '<'
                            {
                            kw=(Token)match(input,74,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:5187:5: kw= '<='
                            {
                            kw=(Token)match(input,75,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMOloc.g:5193:5: kw= '>'
                            {
                            kw=(Token)match(input,76,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalMOloc.g:5199:5: kw= '>='
                            {
                            kw=(Token)match(input,77,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalMOloc.g:5205:5: kw= '=='
                            {
                            kw=(Token)match(input,78,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalMOloc.g:5211:5: kw= '<>'
                            {
                            kw=(Token)match(input,79,FOLLOW_79); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 103, ruleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleArithmetic_expression"
    // InternalMOloc.g:5232:1: entryRuleArithmetic_expression returns [String current=null] : iv_ruleArithmetic_expression= ruleArithmetic_expression EOF ;
    public final String entryRuleArithmetic_expression() throws RecognitionException {
        String current = null;
        int entryRuleArithmetic_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArithmetic_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // InternalMOloc.g:5232:61: (iv_ruleArithmetic_expression= ruleArithmetic_expression EOF )
            // InternalMOloc.g:5233:2: iv_ruleArithmetic_expression= ruleArithmetic_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 104, entryRuleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmetic_expression"


    // $ANTLR start "ruleArithmetic_expression"
    // InternalMOloc.g:5239:1: ruleArithmetic_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) ;
    public final AntlrDatatypeRuleToken ruleArithmetic_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArithmetic_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Term_4 = null;

        AntlrDatatypeRuleToken this_Term_9 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // InternalMOloc.g:5245:2: ( ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) )
            // InternalMOloc.g:5246:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            {
            // InternalMOloc.g:5246:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            // InternalMOloc.g:5247:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            {
            // InternalMOloc.g:5247:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )?
            int alt112=5;
            switch ( input.LA(1) ) {
                case 36:
                    {
                    alt112=1;
                    }
                    break;
                case 80:
                    {
                    alt112=2;
                    }
                    break;
                case 81:
                    {
                    alt112=3;
                    }
                    break;
                case 82:
                    {
                    alt112=4;
                    }
                    break;
            }

            switch (alt112) {
                case 1 :
                    // InternalMOloc.g:5248:4: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5254:4: kw= '-'
                    {
                    kw=(Token)match(input,80,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:5260:4: kw= '.+'
                    {
                    kw=(Token)match(input,81,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:5266:4: kw= '.-'
                    {
                    kw=(Token)match(input,82,FOLLOW_79); if (state.failed) return current;
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
            pushFollow(FOLLOW_83);
            this_Term_4=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Term_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5282:3: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==36||(LA114_0>=80 && LA114_0<=82)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalMOloc.g:5283:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm
            	    {
            	    // InternalMOloc.g:5283:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            	    int alt113=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt113=1;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt113=2;
            	        }
            	        break;
            	    case 81:
            	        {
            	        alt113=3;
            	        }
            	        break;
            	    case 82:
            	        {
            	        alt113=4;
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
            	            // InternalMOloc.g:5284:5: kw= '+'
            	            {
            	            kw=(Token)match(input,36,FOLLOW_79); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_2_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:5290:5: kw= '-'
            	            {
            	            kw=(Token)match(input,80,FOLLOW_79); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_2_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:5296:5: kw= '.+'
            	            {
            	            kw=(Token)match(input,81,FOLLOW_79); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_2_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:5302:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,82,FOLLOW_79); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_83);
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
            	    break loop114;
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
            if ( state.backtracking>0 ) { memoize(input, 105, ruleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithmetic_expression"


    // $ANTLR start "entryRuleTerm"
    // InternalMOloc.g:5323:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;
        int entryRuleTerm_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // InternalMOloc.g:5323:44: (iv_ruleTerm= ruleTerm EOF )
            // InternalMOloc.g:5324:2: iv_ruleTerm= ruleTerm EOF
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
            if ( state.backtracking>0 ) { memoize(input, 106, entryRuleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMOloc.g:5330:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTerm_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_0 = null;

        AntlrDatatypeRuleToken this_Factor_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // InternalMOloc.g:5336:2: ( (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) )
            // InternalMOloc.g:5337:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            {
            // InternalMOloc.g:5337:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            // InternalMOloc.g:5338:3: this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_84);
            this_Factor_0=ruleFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5348:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            loop116:
            do {
                int alt116=2;
                alt116 = dfa116.predict(input);
                switch (alt116) {
            	case 1 :
            	    // InternalMOloc.g:5349:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
            	    {
            	    // InternalMOloc.g:5349:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
            	    int alt115=4;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt115=1;
            	        }
            	        break;
            	    case 83:
            	        {
            	        alt115=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt115=3;
            	        }
            	        break;
            	    case 82:
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
            	            // InternalMOloc.g:5350:5: kw= '*'
            	            {
            	            kw=(Token)match(input,51,FOLLOW_79); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:5356:5: kw= '/'
            	            {
            	            kw=(Token)match(input,83,FOLLOW_79); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:5362:5: kw= '.*'
            	            {
            	            kw=(Token)match(input,50,FOLLOW_79); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getFullStopAsteriskKeyword_1_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:5368:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,82,FOLLOW_79); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_84);
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
            	    break loop116;
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
            if ( state.backtracking>0 ) { memoize(input, 107, ruleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMOloc.g:5389:1: entryRuleFactor returns [String current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final String entryRuleFactor() throws RecognitionException {
        String current = null;
        int entryRuleFactor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFactor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // InternalMOloc.g:5389:46: (iv_ruleFactor= ruleFactor EOF )
            // InternalMOloc.g:5390:2: iv_ruleFactor= ruleFactor EOF
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
            if ( state.backtracking>0 ) { memoize(input, 108, entryRuleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMOloc.g:5396:1: ruleFactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) ;
    public final AntlrDatatypeRuleToken ruleFactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFactor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Primary_0 = null;

        AntlrDatatypeRuleToken this_Primary_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // InternalMOloc.g:5402:2: ( (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) )
            // InternalMOloc.g:5403:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            {
            // InternalMOloc.g:5403:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            // InternalMOloc.g:5404:3: this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_85);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Primary_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5414:3: ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=84 && LA118_0<=85)) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalMOloc.g:5415:4: (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary
                    {
                    // InternalMOloc.g:5415:4: (kw= '^' | kw= '.^' )
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==84) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==85) ) {
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
                            // InternalMOloc.g:5416:5: kw= '^'
                            {
                            kw=(Token)match(input,84,FOLLOW_79); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFactorAccess().getCircumflexAccentKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:5422:5: kw= '.^'
                            {
                            kw=(Token)match(input,85,FOLLOW_79); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 109, ruleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMOloc.g:5443:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;
        int entryRulePrimary_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // InternalMOloc.g:5443:47: (iv_rulePrimary= rulePrimary EOF )
            // InternalMOloc.g:5444:2: iv_rulePrimary= rulePrimary EOF
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
            if ( state.backtracking>0 ) { memoize(input, 110, entryRulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMOloc.g:5450:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' ) ;
    public final AntlrDatatypeRuleToken rulePrimary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int rulePrimary_StartIndex = input.index();
        Token this_UNSIGNED_NUMBER_0=null;
        Token this_STRING_1=null;
        Token this_TRUE_FALSE_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Component_reference_3 = null;

        AntlrDatatypeRuleToken this_FunctionCallArgs_7 = null;

        AntlrDatatypeRuleToken this_ResultReference_8 = null;

        AntlrDatatypeRuleToken this_OutputExpressionList_10 = null;

        AntlrDatatypeRuleToken this_ExpressionList_13 = null;

        AntlrDatatypeRuleToken this_ExpressionList_15 = null;

        AntlrDatatypeRuleToken this_ArrayArguments_18 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // InternalMOloc.g:5456:2: ( (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' ) )
            // InternalMOloc.g:5457:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' )
            {
            // InternalMOloc.g:5457:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' )
            int alt121=9;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // InternalMOloc.g:5458:3: this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER
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
                    // InternalMOloc.g:5466:3: this_STRING_1= RULE_STRING
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
                    // InternalMOloc.g:5474:3: this_TRUE_FALSE_2= RULE_TRUE_FALSE
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
                    // InternalMOloc.g:5482:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
                    {
                    // InternalMOloc.g:5482:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
                    // InternalMOloc.g:5483:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs
                    {
                    // InternalMOloc.g:5483:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' )
                    int alt119=4;
                    switch ( input.LA(1) ) {
                    case RULE_IDENT:
                    case 37:
                        {
                        alt119=1;
                        }
                        break;
                    case 34:
                        {
                        alt119=2;
                        }
                        break;
                    case 58:
                        {
                        alt119=3;
                        }
                        break;
                    case 24:
                        {
                        alt119=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 0, input);

                        throw nvae;
                    }

                    switch (alt119) {
                        case 1 :
                            // InternalMOloc.g:5484:5: this_Component_reference_3= ruleComponent_reference
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
                            // InternalMOloc.g:5495:5: kw= 'der'
                            {
                            kw=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryAccess().getDerKeyword_3_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMOloc.g:5501:5: kw= 'initial'
                            {
                            kw=(Token)match(input,58,FOLLOW_16); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryAccess().getInitialKeyword_3_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalMOloc.g:5507:5: kw= 'pure'
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
                    // InternalMOloc.g:5525:3: this_ResultReference_8= ruleResultReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getResultReferenceParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ResultReference_8=ruleResultReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ResultReference_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMOloc.g:5536:3: (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' )
                    {
                    // InternalMOloc.g:5536:3: (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' )
                    // InternalMOloc.g:5537:4: kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')'
                    {
                    kw=(Token)match(input,31,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getOutputExpressionListParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_OutputExpressionList_10=ruleOutputExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OutputExpressionList_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMOloc.g:5559:3: (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' )
                    {
                    // InternalMOloc.g:5559:3: (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' )
                    // InternalMOloc.g:5560:4: kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']'
                    {
                    kw=(Token)match(input,42,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionListParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_86);
                    this_ExpressionList_13=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionList_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:5575:4: (kw= ';' this_ExpressionList_15= ruleExpressionList )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==19) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalMOloc.g:5576:5: kw= ';' this_ExpressionList_15= ruleExpressionList
                    	    {
                    	    kw=(Token)match(input,19,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getPrimaryAccess().getSemicolonKeyword_6_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionListParserRuleCall_6_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_86);
                    	    this_ExpressionList_15=ruleExpressionList();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ExpressionList_15);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);

                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMOloc.g:5599:3: (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' )
                    {
                    // InternalMOloc.g:5599:3: (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' )
                    // InternalMOloc.g:5600:4: kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}'
                    {
                    kw=(Token)match(input,52,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getArrayArgumentsParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_87);
                    this_ArrayArguments_18=ruleArrayArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayArguments_18);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightCurlyBracketKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMOloc.g:5622:3: kw= 'end'
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
            if ( state.backtracking>0 ) { memoize(input, 111, rulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleOutputExpressionList"
    // InternalMOloc.g:5631:1: entryRuleOutputExpressionList returns [String current=null] : iv_ruleOutputExpressionList= ruleOutputExpressionList EOF ;
    public final String entryRuleOutputExpressionList() throws RecognitionException {
        String current = null;
        int entryRuleOutputExpressionList_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOutputExpressionList = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // InternalMOloc.g:5631:60: (iv_ruleOutputExpressionList= ruleOutputExpressionList EOF )
            // InternalMOloc.g:5632:2: iv_ruleOutputExpressionList= ruleOutputExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputExpressionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutputExpressionList=ruleOutputExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputExpressionList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, entryRuleOutputExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputExpressionList"


    // $ANTLR start "ruleOutputExpressionList"
    // InternalMOloc.g:5638:1: ruleOutputExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* ) ;
    public final AntlrDatatypeRuleToken ruleOutputExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOutputExpressionList_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // InternalMOloc.g:5644:2: ( ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* ) )
            // InternalMOloc.g:5645:2: ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* )
            {
            // InternalMOloc.g:5645:2: ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* )
            // InternalMOloc.g:5646:3: (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )*
            {
            // InternalMOloc.g:5646:3: (this_Expression_0= ruleExpression )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=RULE_IDENT && LA122_0<=RULE_TRUE_FALSE)||LA122_0==24||LA122_0==28||LA122_0==31||LA122_0==34||(LA122_0>=36 && LA122_0<=37)||LA122_0==42||LA122_0==52||LA122_0==56||LA122_0==58||LA122_0==73||(LA122_0>=80 && LA122_0<=82)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalMOloc.g:5647:4: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExpressionParserRuleCall_0());
                      			
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

                    }
                    break;

            }

            // InternalMOloc.g:5658:3: (kw= ',' (this_Expression_2= ruleExpression )? )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==35) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalMOloc.g:5659:4: kw= ',' (this_Expression_2= ruleExpression )?
            	    {
            	    kw=(Token)match(input,35,FOLLOW_88); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOutputExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMOloc.g:5664:4: (this_Expression_2= ruleExpression )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( ((LA123_0>=RULE_IDENT && LA123_0<=RULE_TRUE_FALSE)||LA123_0==24||LA123_0==28||LA123_0==31||LA123_0==34||(LA123_0>=36 && LA123_0<=37)||LA123_0==42||LA123_0==52||LA123_0==56||LA123_0==58||LA123_0==73||(LA123_0>=80 && LA123_0<=82)) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // InternalMOloc.g:5665:5: this_Expression_2= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExpressionParserRuleCall_1_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_26);
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
            	    break;

            	default :
            	    break loop124;
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
            if ( state.backtracking>0 ) { memoize(input, 113, ruleOutputExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOutputExpressionList"


    // $ANTLR start "entryRuleExpressionList"
    // InternalMOloc.g:5681:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;
        int entryRuleExpressionList_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // InternalMOloc.g:5681:54: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMOloc.g:5682:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, entryRuleExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalMOloc.g:5688:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExpressionList_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // InternalMOloc.g:5694:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalMOloc.g:5695:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalMOloc.g:5695:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalMOloc.g:5696:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());
              		
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
            // InternalMOloc.g:5706:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==35) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalMOloc.g:5707:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop125;
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
            if ( state.backtracking>0 ) { memoize(input, 115, ruleExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleArrayArguments"
    // InternalMOloc.g:5727:1: entryRuleArrayArguments returns [String current=null] : iv_ruleArrayArguments= ruleArrayArguments EOF ;
    public final String entryRuleArrayArguments() throws RecognitionException {
        String current = null;
        int entryRuleArrayArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // InternalMOloc.g:5727:54: (iv_ruleArrayArguments= ruleArrayArguments EOF )
            // InternalMOloc.g:5728:2: iv_ruleArrayArguments= ruleArrayArguments EOF
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
            if ( state.backtracking>0 ) { memoize(input, 116, entryRuleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArguments"


    // $ANTLR start "ruleArrayArguments"
    // InternalMOloc.g:5734:1: ruleArrayArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_ForIndices_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // InternalMOloc.g:5740:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) )
            // InternalMOloc.g:5741:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            {
            // InternalMOloc.g:5741:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            // InternalMOloc.g:5742:3: this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayArgumentsAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_89);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5752:3: ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            int alt126=3;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==35) ) {
                alt126=1;
            }
            else if ( (LA126_0==63) ) {
                alt126=2;
            }
            switch (alt126) {
                case 1 :
                    // InternalMOloc.g:5753:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    {
                    // InternalMOloc.g:5753:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    // InternalMOloc.g:5754:5: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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
                    // InternalMOloc.g:5771:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    {
                    // InternalMOloc.g:5771:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    // InternalMOloc.g:5772:5: kw= 'for' this_ForIndices_4= ruleForIndices
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
            if ( state.backtracking>0 ) { memoize(input, 117, ruleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArguments"


    // $ANTLR start "entryRuleArrayArgumentsNonFirst"
    // InternalMOloc.g:5793:1: entryRuleArrayArgumentsNonFirst returns [String current=null] : iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF ;
    public final String entryRuleArrayArgumentsNonFirst() throws RecognitionException {
        String current = null;
        int entryRuleArrayArgumentsNonFirst_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArgumentsNonFirst = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // InternalMOloc.g:5793:62: (iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF )
            // InternalMOloc.g:5794:2: iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF
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
            if ( state.backtracking>0 ) { memoize(input, 118, entryRuleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArgumentsNonFirst"


    // $ANTLR start "ruleArrayArgumentsNonFirst"
    // InternalMOloc.g:5800:1: ruleArrayArgumentsNonFirst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArgumentsNonFirst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArgumentsNonFirst_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // InternalMOloc.g:5806:2: ( (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) )
            // InternalMOloc.g:5807:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            {
            // InternalMOloc.g:5807:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            // InternalMOloc.g:5808:3: this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
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
            // InternalMOloc.g:5818:3: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==35) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalMOloc.g:5819:4: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 119, ruleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArgumentsNonFirst"


    // $ANTLR start "entryRuleForIndices"
    // InternalMOloc.g:5839:1: entryRuleForIndices returns [String current=null] : iv_ruleForIndices= ruleForIndices EOF ;
    public final String entryRuleForIndices() throws RecognitionException {
        String current = null;
        int entryRuleForIndices_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndices = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // InternalMOloc.g:5839:50: (iv_ruleForIndices= ruleForIndices EOF )
            // InternalMOloc.g:5840:2: iv_ruleForIndices= ruleForIndices EOF
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
            if ( state.backtracking>0 ) { memoize(input, 120, entryRuleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndices"


    // $ANTLR start "ruleForIndices"
    // InternalMOloc.g:5846:1: ruleForIndices returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) ;
    public final AntlrDatatypeRuleToken ruleForIndices() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndices_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ForIndex_0 = null;

        AntlrDatatypeRuleToken this_ForIndex_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // InternalMOloc.g:5852:2: ( (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) )
            // InternalMOloc.g:5853:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            {
            // InternalMOloc.g:5853:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            // InternalMOloc.g:5854:3: this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )*
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
            // InternalMOloc.g:5864:3: (kw= ',' this_ForIndex_2= ruleForIndex )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==35) ) {
                    int LA128_2 = input.LA(2);

                    if ( (LA128_2==RULE_IDENT) ) {
                        int LA128_3 = input.LA(3);

                        if ( (synpred168_InternalMOloc()) ) {
                            alt128=1;
                        }


                    }


                }


                switch (alt128) {
            	case 1 :
            	    // InternalMOloc.g:5865:4: kw= ',' this_ForIndex_2= ruleForIndex
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
            	    break loop128;
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
            if ( state.backtracking>0 ) { memoize(input, 121, ruleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndices"


    // $ANTLR start "entryRuleForIndex"
    // InternalMOloc.g:5885:1: entryRuleForIndex returns [String current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final String entryRuleForIndex() throws RecognitionException {
        String current = null;
        int entryRuleForIndex_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndex = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // InternalMOloc.g:5885:48: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalMOloc.g:5886:2: iv_ruleForIndex= ruleForIndex EOF
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
            if ( state.backtracking>0 ) { memoize(input, 122, entryRuleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndex"


    // $ANTLR start "ruleForIndex"
    // InternalMOloc.g:5892:1: ruleForIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleForIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndex_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // InternalMOloc.g:5898:2: ( (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) )
            // InternalMOloc.g:5899:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            {
            // InternalMOloc.g:5899:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            // InternalMOloc.g:5900:3: this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )?
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getForIndexAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:5907:3: (kw= 'in' this_Expression_2= ruleExpression )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==86) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalMOloc.g:5908:4: kw= 'in' this_Expression_2= ruleExpression
                    {
                    kw=(Token)match(input,86,FOLLOW_34); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 123, ruleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndex"


    // $ANTLR start "entryRuleComponent_reference"
    // InternalMOloc.g:5928:1: entryRuleComponent_reference returns [String current=null] : iv_ruleComponent_reference= ruleComponent_reference EOF ;
    public final String entryRuleComponent_reference() throws RecognitionException {
        String current = null;
        int entryRuleComponent_reference_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleComponent_reference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return current; }
            // InternalMOloc.g:5928:59: (iv_ruleComponent_reference= ruleComponent_reference EOF )
            // InternalMOloc.g:5929:2: iv_ruleComponent_reference= ruleComponent_reference EOF
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
            if ( state.backtracking>0 ) { memoize(input, 124, entryRuleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_reference"


    // $ANTLR start "ruleComponent_reference"
    // InternalMOloc.g:5935:1: ruleComponent_reference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* ) ;
    public final AntlrDatatypeRuleToken ruleComponent_reference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleComponent_reference_StartIndex = input.index();
        Token kw=null;
        Token this_IDENT_1=null;
        Token this_IDENT_4=null;
        AntlrDatatypeRuleToken this_ArraySubscripts_2 = null;

        AntlrDatatypeRuleToken this_ArraySubscripts_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return current; }
            // InternalMOloc.g:5941:2: ( ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* ) )
            // InternalMOloc.g:5942:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* )
            {
            // InternalMOloc.g:5942:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* )
            // InternalMOloc.g:5943:3: (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )*
            {
            // InternalMOloc.g:5943:3: (kw= '.' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==37) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalMOloc.g:5944:4: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_1, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_1());
              		
            }
            // InternalMOloc.g:5957:3: (this_ArraySubscripts_2= ruleArraySubscripts )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==42) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalMOloc.g:5958:4: this_ArraySubscripts_2= ruleArraySubscripts
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponent_referenceAccess().getArraySubscriptsParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_92);
                    this_ArraySubscripts_2=ruleArraySubscripts();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArraySubscripts_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:5969:3: (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==37) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // InternalMOloc.g:5970:4: kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )?
            	    {
            	    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_3_0());
            	      			
            	    }
            	    this_IDENT_4=(Token)match(input,RULE_IDENT,FOLLOW_91); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_4, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_3_1());
            	      			
            	    }
            	    // InternalMOloc.g:5982:4: (this_ArraySubscripts_5= ruleArraySubscripts )?
            	    int alt132=2;
            	    int LA132_0 = input.LA(1);

            	    if ( (LA132_0==42) ) {
            	        alt132=1;
            	    }
            	    switch (alt132) {
            	        case 1 :
            	            // InternalMOloc.g:5983:5: this_ArraySubscripts_5= ruleArraySubscripts
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getComponent_referenceAccess().getArraySubscriptsParserRuleCall_3_2());
            	              				
            	            }
            	            pushFollow(FOLLOW_92);
            	            this_ArraySubscripts_5=ruleArraySubscripts();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ArraySubscripts_5);
            	              				
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
            	    break loop133;
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
            if ( state.backtracking>0 ) { memoize(input, 125, ruleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_reference"


    // $ANTLR start "entryRuleResultReference"
    // InternalMOloc.g:5999:1: entryRuleResultReference returns [String current=null] : iv_ruleResultReference= ruleResultReference EOF ;
    public final String entryRuleResultReference() throws RecognitionException {
        String current = null;
        int entryRuleResultReference_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleResultReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return current; }
            // InternalMOloc.g:5999:55: (iv_ruleResultReference= ruleResultReference EOF )
            // InternalMOloc.g:6000:2: iv_ruleResultReference= ruleResultReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResultReference=ruleResultReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultReference.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, entryRuleResultReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleResultReference"


    // $ANTLR start "ruleResultReference"
    // InternalMOloc.g:6006:1: ruleResultReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleResultReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleResultReference_StartIndex = input.index();
        Token kw=null;
        Token this_UNSIGNED_NUMBER_5=null;
        AntlrDatatypeRuleToken this_Component_reference_0 = null;

        AntlrDatatypeRuleToken this_Component_reference_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return current; }
            // InternalMOloc.g:6012:2: ( (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) ) )
            // InternalMOloc.g:6013:2: (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) )
            {
            // InternalMOloc.g:6013:2: (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_IDENT||LA135_0==37) ) {
                alt135=1;
            }
            else if ( (LA135_0==34) ) {
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
                    // InternalMOloc.g:6014:3: this_Component_reference_0= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultReferenceAccess().getComponent_referenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Component_reference_0=ruleComponent_reference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Component_reference_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:6025:3: (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' )
                    {
                    // InternalMOloc.g:6025:3: (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' )
                    // InternalMOloc.g:6026:4: kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')'
                    {
                    kw=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getResultReferenceAccess().getDerKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,31,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getResultReferenceAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getResultReferenceAccess().getComponent_referenceParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_Component_reference_3=ruleComponent_reference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Component_reference_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:6046:4: (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==35) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // InternalMOloc.g:6047:5: kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER
                            {
                            kw=(Token)match(input,35,FOLLOW_93); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getResultReferenceAccess().getCommaKeyword_1_3_0());
                              				
                            }
                            this_UNSIGNED_NUMBER_5=(Token)match(input,RULE_UNSIGNED_NUMBER,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_UNSIGNED_NUMBER_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_UNSIGNED_NUMBER_5, grammarAccess.getResultReferenceAccess().getUNSIGNED_NUMBERTerminalRuleCall_1_3_1());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getResultReferenceAccess().getRightParenthesisKeyword_1_4());
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 127, ruleResultReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleResultReference"


    // $ANTLR start "entryRuleFunctionCallArgs"
    // InternalMOloc.g:6070:1: entryRuleFunctionCallArgs returns [String current=null] : iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF ;
    public final String entryRuleFunctionCallArgs() throws RecognitionException {
        String current = null;
        int entryRuleFunctionCallArgs_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionCallArgs = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return current; }
            // InternalMOloc.g:6070:56: (iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF )
            // InternalMOloc.g:6071:2: iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF
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
            if ( state.backtracking>0 ) { memoize(input, 128, entryRuleFunctionCallArgs_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallArgs"


    // $ANTLR start "ruleFunctionCallArgs"
    // InternalMOloc.g:6077:1: ruleFunctionCallArgs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionCallArgs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionCallArgs_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return current; }
            // InternalMOloc.g:6083:2: ( (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' ) )
            // InternalMOloc.g:6084:2: (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' )
            {
            // InternalMOloc.g:6084:2: (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' )
            // InternalMOloc.g:6085:3: kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')'
            {
            kw=(Token)match(input,31,FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionCallArgsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMOloc.g:6090:3: (this_FunctionArguments_1= ruleFunctionArguments )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=RULE_IDENT && LA136_0<=RULE_TRUE_FALSE)||LA136_0==24||LA136_0==28||LA136_0==31||LA136_0==34||(LA136_0>=36 && LA136_0<=37)||LA136_0==42||LA136_0==52||LA136_0==56||LA136_0==58||LA136_0==73||(LA136_0>=80 && LA136_0<=82)||LA136_0==87) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalMOloc.g:6091:4: this_FunctionArguments_1= ruleFunctionArguments
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
            if ( state.backtracking>0 ) { memoize(input, 129, ruleFunctionCallArgs_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallArgs"


    // $ANTLR start "entryRuleFunctionArguments"
    // InternalMOloc.g:6111:1: entryRuleFunctionArguments returns [String current=null] : iv_ruleFunctionArguments= ruleFunctionArguments EOF ;
    public final String entryRuleFunctionArguments() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return current; }
            // InternalMOloc.g:6111:57: (iv_ruleFunctionArguments= ruleFunctionArguments EOF )
            // InternalMOloc.g:6112:2: iv_ruleFunctionArguments= ruleFunctionArguments EOF
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
            if ( state.backtracking>0 ) { memoize(input, 130, entryRuleFunctionArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArguments"


    // $ANTLR start "ruleFunctionArguments"
    // InternalMOloc.g:6118:1: ruleFunctionArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return current; }
            // InternalMOloc.g:6124:2: ( ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments ) )
            // InternalMOloc.g:6125:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments )
            {
            // InternalMOloc.g:6125:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments )
            int alt139=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UNSIGNED_NUMBER:
            case RULE_TRUE_FALSE:
            case 24:
            case 28:
            case 31:
            case 34:
            case 36:
            case 37:
            case 42:
            case 52:
            case 56:
            case 58:
            case 73:
            case 80:
            case 81:
            case 82:
                {
                alt139=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA139_2 = input.LA(2);

                if ( (LA139_2==EOF||(LA139_2>=31 && LA139_2<=33)||(LA139_2>=35 && LA139_2<=37)||LA139_2==42||(LA139_2>=50 && LA139_2<=51)||LA139_2==63||(LA139_2>=71 && LA139_2<=72)||(LA139_2>=74 && LA139_2<=85)) ) {
                    alt139=1;
                }
                else if ( (LA139_2==29) ) {
                    alt139=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 139, 2, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                alt139=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // InternalMOloc.g:6126:3: (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
                    {
                    // InternalMOloc.g:6126:3: (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
                    // InternalMOloc.g:6127:4: this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_89);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:6137:4: ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
                    int alt137=3;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==35) ) {
                        int LA137_1 = input.LA(2);

                        if ( (synpred177_InternalMOloc()) ) {
                            alt137=1;
                        }
                    }
                    else if ( (LA137_0==63) ) {
                        alt137=2;
                    }
                    switch (alt137) {
                        case 1 :
                            // InternalMOloc.g:6138:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
                            {
                            // InternalMOloc.g:6138:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
                            // InternalMOloc.g:6139:6: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return current;
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
                            // InternalMOloc.g:6156:5: (kw= 'for' this_ForIndices_4= ruleForIndices )
                            {
                            // InternalMOloc.g:6156:5: (kw= 'for' this_ForIndices_4= ruleForIndices )
                            // InternalMOloc.g:6157:6: kw= 'for' this_ForIndices_4= ruleForIndices
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
                    // InternalMOloc.g:6176:3: (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? )
                    {
                    // InternalMOloc.g:6176:3: (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? )
                    // InternalMOloc.g:6177:4: this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )?
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
                    // InternalMOloc.g:6187:4: (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==35) ) {
                        int LA138_1 = input.LA(2);

                        if ( (synpred180_InternalMOloc()) ) {
                            alt138=1;
                        }
                    }
                    switch (alt138) {
                        case 1 :
                            // InternalMOloc.g:6188:5: kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return current;
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
                    // InternalMOloc.g:6206:3: this_NamedArguments_8= ruleNamedArguments
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
            if ( state.backtracking>0 ) { memoize(input, 131, ruleFunctionArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArguments"


    // $ANTLR start "entryRuleFunctionArgumentsNonFirst"
    // InternalMOloc.g:6220:1: entryRuleFunctionArgumentsNonFirst returns [String current=null] : iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF ;
    public final String entryRuleFunctionArgumentsNonFirst() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArgumentsNonFirst_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArgumentsNonFirst = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return current; }
            // InternalMOloc.g:6220:65: (iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF )
            // InternalMOloc.g:6221:2: iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF
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
            if ( state.backtracking>0 ) { memoize(input, 132, entryRuleFunctionArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArgumentsNonFirst"


    // $ANTLR start "ruleFunctionArgumentsNonFirst"
    // InternalMOloc.g:6227:1: ruleFunctionArgumentsNonFirst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments ) ;
    public final AntlrDatatypeRuleToken ruleFunctionArgumentsNonFirst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionArgumentsNonFirst_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_0 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_NamedArguments_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return current; }
            // InternalMOloc.g:6233:2: ( ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments ) )
            // InternalMOloc.g:6234:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )
            {
            // InternalMOloc.g:6234:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )
            int alt141=2;
            alt141 = dfa141.predict(input);
            switch (alt141) {
                case 1 :
                    // InternalMOloc.g:6235:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
                    {
                    // InternalMOloc.g:6235:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
                    // InternalMOloc.g:6236:4: this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
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
                    // InternalMOloc.g:6246:4: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==35) ) {
                        int LA140_1 = input.LA(2);

                        if ( (synpred182_InternalMOloc()) ) {
                            alt140=1;
                        }
                    }
                    switch (alt140) {
                        case 1 :
                            // InternalMOloc.g:6247:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return current;
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
                    // InternalMOloc.g:6265:3: this_NamedArguments_3= ruleNamedArguments
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
            if ( state.backtracking>0 ) { memoize(input, 133, ruleFunctionArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArgumentsNonFirst"


    // $ANTLR start "entryRuleFunctionPartialApplication"
    // InternalMOloc.g:6279:1: entryRuleFunctionPartialApplication returns [String current=null] : iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF ;
    public final String entryRuleFunctionPartialApplication() throws RecognitionException {
        String current = null;
        int entryRuleFunctionPartialApplication_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionPartialApplication = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return current; }
            // InternalMOloc.g:6279:66: (iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF )
            // InternalMOloc.g:6280:2: iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF
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
            if ( state.backtracking>0 ) { memoize(input, 134, entryRuleFunctionPartialApplication_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionPartialApplication"


    // $ANTLR start "ruleFunctionPartialApplication"
    // InternalMOloc.g:6286:1: ruleFunctionPartialApplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionPartialApplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionPartialApplication_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_NamedArguments_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return current; }
            // InternalMOloc.g:6292:2: ( (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' ) )
            // InternalMOloc.g:6293:2: (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' )
            {
            // InternalMOloc.g:6293:2: (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' )
            // InternalMOloc.g:6294:3: kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')'
            {
            kw=(Token)match(input,87,FOLLOW_14); if (state.failed) return current;
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
            kw=(Token)match(input,31,FOLLOW_95); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 135, ruleFunctionPartialApplication_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionPartialApplication"


    // $ANTLR start "entryRuleNamedArguments"
    // InternalMOloc.g:6333:1: entryRuleNamedArguments returns [String current=null] : iv_ruleNamedArguments= ruleNamedArguments EOF ;
    public final String entryRuleNamedArguments() throws RecognitionException {
        String current = null;
        int entryRuleNamedArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleNamedArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return current; }
            // InternalMOloc.g:6333:54: (iv_ruleNamedArguments= ruleNamedArguments EOF )
            // InternalMOloc.g:6334:2: iv_ruleNamedArguments= ruleNamedArguments EOF
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
            if ( state.backtracking>0 ) { memoize(input, 136, entryRuleNamedArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArguments"


    // $ANTLR start "ruleNamedArguments"
    // InternalMOloc.g:6340:1: ruleNamedArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? ) ;
    public final AntlrDatatypeRuleToken ruleNamedArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleNamedArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_NamedArgument_0 = null;

        AntlrDatatypeRuleToken this_NamedArguments_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return current; }
            // InternalMOloc.g:6346:2: ( (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? ) )
            // InternalMOloc.g:6347:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? )
            {
            // InternalMOloc.g:6347:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? )
            // InternalMOloc.g:6348:3: this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNamedArgumentsAccess().getNamedArgumentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_NamedArgument_0=ruleNamedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NamedArgument_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:6358:3: (kw= ',' this_NamedArguments_2= ruleNamedArguments )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==35) ) {
                int LA142_1 = input.LA(2);

                if ( (synpred184_InternalMOloc()) ) {
                    alt142=1;
                }
            }
            switch (alt142) {
                case 1 :
                    // InternalMOloc.g:6359:4: kw= ',' this_NamedArguments_2= ruleNamedArguments
                    {
                    kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNamedArgumentsAccess().getCommaKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNamedArgumentsAccess().getNamedArgumentsParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_NamedArguments_2=ruleNamedArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_NamedArguments_2);
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 137, ruleNamedArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamedArguments"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalMOloc.g:6379:1: entryRuleNamedArgument returns [String current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final String entryRuleNamedArgument() throws RecognitionException {
        String current = null;
        int entryRuleNamedArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleNamedArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return current; }
            // InternalMOloc.g:6379:53: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalMOloc.g:6380:2: iv_ruleNamedArgument= ruleNamedArgument EOF
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
            if ( state.backtracking>0 ) { memoize(input, 138, entryRuleNamedArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalMOloc.g:6386:1: ruleNamedArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument ) ;
    public final AntlrDatatypeRuleToken ruleNamedArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleNamedArgument_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgument_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return current; }
            // InternalMOloc.g:6392:2: ( (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument ) )
            // InternalMOloc.g:6393:2: (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument )
            {
            // InternalMOloc.g:6393:2: (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument )
            // InternalMOloc.g:6394:3: this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getNamedArgumentAccess().getIDENTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,29,FOLLOW_95); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 139, ruleNamedArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleFunctionArgument"
    // InternalMOloc.g:6420:1: entryRuleFunctionArgument returns [String current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final String entryRuleFunctionArgument() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return current; }
            // InternalMOloc.g:6420:56: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalMOloc.g:6421:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
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
            if ( state.backtracking>0 ) { memoize(input, 140, entryRuleFunctionArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // InternalMOloc.g:6427:1: ruleFunctionArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication ) ;
    public final AntlrDatatypeRuleToken ruleFunctionArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_FunctionPartialApplication_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return current; }
            // InternalMOloc.g:6433:2: ( (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication ) )
            // InternalMOloc.g:6434:2: (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication )
            {
            // InternalMOloc.g:6434:2: (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( ((LA143_0>=RULE_IDENT && LA143_0<=RULE_TRUE_FALSE)||LA143_0==24||LA143_0==28||LA143_0==31||LA143_0==34||(LA143_0>=36 && LA143_0<=37)||LA143_0==42||LA143_0==52||LA143_0==56||LA143_0==58||LA143_0==73||(LA143_0>=80 && LA143_0<=82)) ) {
                alt143=1;
            }
            else if ( (LA143_0==87) ) {
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
                    // InternalMOloc.g:6435:3: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall_0());
                      		
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
                    // InternalMOloc.g:6446:3: this_FunctionPartialApplication_1= ruleFunctionPartialApplication
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFunctionArgumentAccess().getFunctionPartialApplicationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionPartialApplication_1=ruleFunctionPartialApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FunctionPartialApplication_1);
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 141, ruleFunctionArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleName"
    // InternalMOloc.g:6460:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;
        int entryRuleName_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return current; }
            // InternalMOloc.g:6460:44: (iv_ruleName= ruleName EOF )
            // InternalMOloc.g:6461:2: iv_ruleName= ruleName EOF
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
            if ( state.backtracking>0 ) { memoize(input, 142, entryRuleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMOloc.g:6467:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleName_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        Token this_IDENT_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return current; }
            // InternalMOloc.g:6473:2: ( (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) )
            // InternalMOloc.g:6474:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            {
            // InternalMOloc.g:6474:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            // InternalMOloc.g:6475:3: this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )*
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:6482:3: (kw= '.' this_IDENT_2= RULE_IDENT )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==37) ) {
                    int LA144_2 = input.LA(2);

                    if ( (LA144_2==RULE_IDENT) ) {
                        alt144=1;
                    }


                }


                switch (alt144) {
            	case 1 :
            	    // InternalMOloc.g:6483:4: kw= '.' this_IDENT_2= RULE_IDENT
            	    {
            	    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_92); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_2, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_1_1());
            	      			
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
            if ( state.backtracking>0 ) { memoize(input, 143, ruleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleClassType"
    // InternalMOloc.g:6500:1: ruleClassType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return current; }
            // InternalMOloc.g:6506:2: ( ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) )
            // InternalMOloc.g:6507:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            {
            // InternalMOloc.g:6507:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            int alt145=9;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt145=1;
                }
                break;
            case 89:
                {
                alt145=2;
                }
                break;
            case 90:
                {
                alt145=3;
                }
                break;
            case 91:
                {
                alt145=4;
                }
                break;
            case 92:
                {
                alt145=5;
                }
                break;
            case 93:
                {
                alt145=6;
                }
                break;
            case 94:
                {
                alt145=7;
                }
                break;
            case 95:
                {
                alt145=8;
                }
                break;
            case 87:
                {
                alt145=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // InternalMOloc.g:6508:3: (enumLiteral_0= 'NULLClassType' )
                    {
                    // InternalMOloc.g:6508:3: (enumLiteral_0= 'NULLClassType' )
                    // InternalMOloc.g:6509:4: enumLiteral_0= 'NULLClassType'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getClassTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:6516:3: (enumLiteral_1= 'class' )
                    {
                    // InternalMOloc.g:6516:3: (enumLiteral_1= 'class' )
                    // InternalMOloc.g:6517:4: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getClassTypeAccess().getClassEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:6524:3: (enumLiteral_2= 'model' )
                    {
                    // InternalMOloc.g:6524:3: (enumLiteral_2= 'model' )
                    // InternalMOloc.g:6525:4: enumLiteral_2= 'model'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getModelEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getClassTypeAccess().getModelEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMOloc.g:6532:3: (enumLiteral_3= 'record' )
                    {
                    // InternalMOloc.g:6532:3: (enumLiteral_3= 'record' )
                    // InternalMOloc.g:6533:4: enumLiteral_3= 'record'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getRecordEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getClassTypeAccess().getRecordEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMOloc.g:6540:3: (enumLiteral_4= 'block' )
                    {
                    // InternalMOloc.g:6540:3: (enumLiteral_4= 'block' )
                    // InternalMOloc.g:6541:4: enumLiteral_4= 'block'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getBlockEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getClassTypeAccess().getBlockEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMOloc.g:6548:3: (enumLiteral_5= 'connector' )
                    {
                    // InternalMOloc.g:6548:3: (enumLiteral_5= 'connector' )
                    // InternalMOloc.g:6549:4: enumLiteral_5= 'connector'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getConnectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getClassTypeAccess().getConnectorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMOloc.g:6556:3: (enumLiteral_6= 'type' )
                    {
                    // InternalMOloc.g:6556:3: (enumLiteral_6= 'type' )
                    // InternalMOloc.g:6557:4: enumLiteral_6= 'type'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getClassTypeAccess().getTypeEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMOloc.g:6564:3: (enumLiteral_7= 'package' )
                    {
                    // InternalMOloc.g:6564:3: (enumLiteral_7= 'package' )
                    // InternalMOloc.g:6565:4: enumLiteral_7= 'package'
                    {
                    enumLiteral_7=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getPackageEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getClassTypeAccess().getPackageEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMOloc.g:6572:3: (enumLiteral_8= 'function' )
                    {
                    // InternalMOloc.g:6572:3: (enumLiteral_8= 'function' )
                    // InternalMOloc.g:6573:4: enumLiteral_8= 'function'
                    {
                    enumLiteral_8=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 144, ruleClassType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "ruleDirection"
    // InternalMOloc.g:6583:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;
        int ruleDirection_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return current; }
            // InternalMOloc.g:6589:2: ( ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) )
            // InternalMOloc.g:6590:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            {
            // InternalMOloc.g:6590:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            int alt146=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt146=1;
                }
                break;
            case 97:
                {
                alt146=2;
                }
                break;
            case 98:
                {
                alt146=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }

            switch (alt146) {
                case 1 :
                    // InternalMOloc.g:6591:3: (enumLiteral_0= 'NULLDirection' )
                    {
                    // InternalMOloc.g:6591:3: (enumLiteral_0= 'NULLDirection' )
                    // InternalMOloc.g:6592:4: enumLiteral_0= 'NULLDirection'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:6599:3: (enumLiteral_1= 'input' )
                    {
                    // InternalMOloc.g:6599:3: (enumLiteral_1= 'input' )
                    // InternalMOloc.g:6600:4: enumLiteral_1= 'input'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:6607:3: (enumLiteral_2= 'output' )
                    {
                    // InternalMOloc.g:6607:3: (enumLiteral_2= 'output' )
                    // InternalMOloc.g:6608:4: enumLiteral_2= 'output'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 145, ruleDirection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleRelationshipType"
    // InternalMOloc.g:6618:1: ruleRelationshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) ;
    public final Enumerator ruleRelationshipType() throws RecognitionException {
        Enumerator current = null;
        int ruleRelationshipType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return current; }
            // InternalMOloc.g:6624:2: ( ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) )
            // InternalMOloc.g:6625:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            {
            // InternalMOloc.g:6625:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            int alt147=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt147=1;
                }
                break;
            case 100:
                {
                alt147=2;
                }
                break;
            case 101:
                {
                alt147=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // InternalMOloc.g:6626:3: (enumLiteral_0= 'NULLRelationshipType' )
                    {
                    // InternalMOloc.g:6626:3: (enumLiteral_0= 'NULLRelationshipType' )
                    // InternalMOloc.g:6627:4: enumLiteral_0= 'NULLRelationshipType'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:6634:3: (enumLiteral_1= 'flow' )
                    {
                    // InternalMOloc.g:6634:3: (enumLiteral_1= 'flow' )
                    // InternalMOloc.g:6635:4: enumLiteral_1= 'flow'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:6642:3: (enumLiteral_2= 'stream' )
                    {
                    // InternalMOloc.g:6642:3: (enumLiteral_2= 'stream' )
                    // InternalMOloc.g:6643:4: enumLiteral_2= 'stream'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 146, ruleRelationshipType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "ruleParameterType"
    // InternalMOloc.g:6653:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;
        int ruleParameterType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return current; }
            // InternalMOloc.g:6659:2: ( ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) )
            // InternalMOloc.g:6660:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            {
            // InternalMOloc.g:6660:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            int alt148=4;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt148=1;
                }
                break;
            case 103:
                {
                alt148=2;
                }
                break;
            case 104:
                {
                alt148=3;
                }
                break;
            case 105:
                {
                alt148=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }

            switch (alt148) {
                case 1 :
                    // InternalMOloc.g:6661:3: (enumLiteral_0= 'NULLParameterType' )
                    {
                    // InternalMOloc.g:6661:3: (enumLiteral_0= 'NULLParameterType' )
                    // InternalMOloc.g:6662:4: enumLiteral_0= 'NULLParameterType'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:6669:3: (enumLiteral_1= 'discrete' )
                    {
                    // InternalMOloc.g:6669:3: (enumLiteral_1= 'discrete' )
                    // InternalMOloc.g:6670:4: enumLiteral_1= 'discrete'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:6677:3: (enumLiteral_2= 'parameter' )
                    {
                    // InternalMOloc.g:6677:3: (enumLiteral_2= 'parameter' )
                    // InternalMOloc.g:6678:4: enumLiteral_2= 'parameter'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMOloc.g:6685:3: (enumLiteral_3= 'constant' )
                    {
                    // InternalMOloc.g:6685:3: (enumLiteral_3= 'constant' )
                    // InternalMOloc.g:6686:4: enumLiteral_3= 'constant'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 147, ruleParameterType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"

    // $ANTLR start synpred87_InternalMOloc
    public final void synpred87_InternalMOloc_fragment() throws RecognitionException {   
        EObject lv_equations_3_0 = null;


        // InternalMOloc.g:3189:4: ( (lv_equations_3_0= ruleEquation ) )
        // InternalMOloc.g:3189:4: (lv_equations_3_0= ruleEquation )
        {
        // InternalMOloc.g:3189:4: (lv_equations_3_0= ruleEquation )
        // InternalMOloc.g:3190:5: lv_equations_3_0= ruleEquation
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
    // $ANTLR end synpred87_InternalMOloc

    // $ANTLR start synpred88_InternalMOloc
    public final void synpred88_InternalMOloc_fragment() throws RecognitionException {   
        EObject this_SimpleEquation_0 = null;


        // InternalMOloc.g:3226:3: (this_SimpleEquation_0= ruleSimpleEquation )
        // InternalMOloc.g:3226:3: this_SimpleEquation_0= ruleSimpleEquation
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
    // $ANTLR end synpred88_InternalMOloc

    // $ANTLR start synpred103_InternalMOloc
    public final void synpred103_InternalMOloc_fragment() throws RecognitionException {   
        EObject lv_statements_3_0 = null;


        // InternalMOloc.g:3984:4: ( (lv_statements_3_0= ruleStatement ) )
        // InternalMOloc.g:3984:4: (lv_statements_3_0= ruleStatement )
        {
        // InternalMOloc.g:3984:4: (lv_statements_3_0= ruleStatement )
        // InternalMOloc.g:3985:5: lv_statements_3_0= ruleStatement
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getAlgorithmSectionAccess().getStatementsStatementParserRuleCall_3_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_statements_3_0=ruleStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred103_InternalMOloc

    // $ANTLR start synpred146_InternalMOloc
    public final void synpred146_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_5 = null;


        // InternalMOloc.g:5349:4: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )
        // InternalMOloc.g:5349:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
        {
        // InternalMOloc.g:5349:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
        int alt176=4;
        switch ( input.LA(1) ) {
        case 51:
            {
            alt176=1;
            }
            break;
        case 83:
            {
            alt176=2;
            }
            break;
        case 50:
            {
            alt176=3;
            }
            break;
        case 82:
            {
            alt176=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 176, 0, input);

            throw nvae;
        }

        switch (alt176) {
            case 1 :
                // InternalMOloc.g:5350:5: kw= '*'
                {
                kw=(Token)match(input,51,FOLLOW_79); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMOloc.g:5356:5: kw= '/'
                {
                kw=(Token)match(input,83,FOLLOW_79); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMOloc.g:5362:5: kw= '.*'
                {
                kw=(Token)match(input,50,FOLLOW_79); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMOloc.g:5368:5: kw= '.-'
                {
                kw=(Token)match(input,82,FOLLOW_79); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_Factor_5=ruleFactor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred146_InternalMOloc

    // $ANTLR start synpred155_InternalMOloc
    public final void synpred155_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Component_reference_3 = null;

        AntlrDatatypeRuleToken this_FunctionCallArgs_7 = null;


        // InternalMOloc.g:5482:3: ( ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) )
        // InternalMOloc.g:5482:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
        {
        // InternalMOloc.g:5482:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
        // InternalMOloc.g:5483:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs
        {
        // InternalMOloc.g:5483:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' )
        int alt178=4;
        switch ( input.LA(1) ) {
        case RULE_IDENT:
        case 37:
            {
            alt178=1;
            }
            break;
        case 34:
            {
            alt178=2;
            }
            break;
        case 58:
            {
            alt178=3;
            }
            break;
        case 24:
            {
            alt178=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 178, 0, input);

            throw nvae;
        }

        switch (alt178) {
            case 1 :
                // InternalMOloc.g:5484:5: this_Component_reference_3= ruleComponent_reference
                {
                pushFollow(FOLLOW_16);
                this_Component_reference_3=ruleComponent_reference();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMOloc.g:5495:5: kw= 'der'
                {
                kw=(Token)match(input,34,FOLLOW_16); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMOloc.g:5501:5: kw= 'initial'
                {
                kw=(Token)match(input,58,FOLLOW_16); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMOloc.g:5507:5: kw= 'pure'
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
    // $ANTLR end synpred155_InternalMOloc

    // $ANTLR start synpred156_InternalMOloc
    public final void synpred156_InternalMOloc_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ResultReference_8 = null;


        // InternalMOloc.g:5525:3: (this_ResultReference_8= ruleResultReference )
        // InternalMOloc.g:5525:3: this_ResultReference_8= ruleResultReference
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getPrimaryAccess().getResultReferenceParserRuleCall_4());
          		
        }
        pushFollow(FOLLOW_2);
        this_ResultReference_8=ruleResultReference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred156_InternalMOloc

    // $ANTLR start synpred168_InternalMOloc
    public final void synpred168_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_ForIndex_2 = null;


        // InternalMOloc.g:5865:4: (kw= ',' this_ForIndex_2= ruleForIndex )
        // InternalMOloc.g:5865:4: kw= ',' this_ForIndex_2= ruleForIndex
        {
        kw=(Token)match(input,35,FOLLOW_3); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_ForIndex_2=ruleForIndex();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_InternalMOloc

    // $ANTLR start synpred177_InternalMOloc
    public final void synpred177_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:6138:5: ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) )
        // InternalMOloc.g:6138:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        {
        // InternalMOloc.g:6138:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:6139:6: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred177_InternalMOloc

    // $ANTLR start synpred180_InternalMOloc
    public final void synpred180_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_7 = null;


        // InternalMOloc.g:6188:5: (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:6188:5: kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_7=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_InternalMOloc

    // $ANTLR start synpred182_InternalMOloc
    public final void synpred182_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:6247:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:6247:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_InternalMOloc

    // $ANTLR start synpred183_InternalMOloc
    public final void synpred183_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_0 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:6235:3: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) )
        // InternalMOloc.g:6235:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
        {
        // InternalMOloc.g:6235:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
        // InternalMOloc.g:6236:4: this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstAccess().getFunctionArgumentsParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_26);
        this_FunctionArguments_0=ruleFunctionArguments();

        state._fsp--;
        if (state.failed) return ;
        // InternalMOloc.g:6246:4: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
        int alt184=2;
        int LA184_0 = input.LA(1);

        if ( (LA184_0==35) ) {
            alt184=1;
        }
        switch (alt184) {
            case 1 :
                // InternalMOloc.g:6247:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                {
                kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return ;
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
    // $ANTLR end synpred183_InternalMOloc

    // $ANTLR start synpred184_InternalMOloc
    public final void synpred184_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_NamedArguments_2 = null;


        // InternalMOloc.g:6359:4: (kw= ',' this_NamedArguments_2= ruleNamedArguments )
        // InternalMOloc.g:6359:4: kw= ',' this_NamedArguments_2= ruleNamedArguments
        {
        kw=(Token)match(input,35,FOLLOW_95); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_NamedArguments_2=ruleNamedArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_InternalMOloc

    // Delegated rules

    public final boolean synpred177_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred177_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred155_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred155_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred182_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred183_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred180_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred184_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred184_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA141 dfa141 = new DFA141(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\3\uffff\1\5\2\uffff\1\5";
    static final String dfa_3s = "\1\4\2\uffff\2\4\1\uffff\1\4";
    static final String dfa_4s = "\1\151\2\uffff\1\56\1\4\1\uffff\1\56";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\20\uffff\6\1\12\uffff\1\2\61\uffff\11\1\12\2",
            "",
            "",
            "\1\2\1\5\27\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\4\6\uffff\1\5\1\uffff\1\5",
            "\1\6",
            "",
            "\1\2\1\5\27\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\4\6\uffff\1\5\1\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1292:3: (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] )";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\3\4\5\uffff\1\73\2\uffff";
    static final String dfa_10s = "\3\151\5\uffff\1\104\2\uffff";
    static final String dfa_11s = "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\1\7";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\5\17\uffff\7\5\1\4\11\uffff\1\5\1\7\1\5\1\uffff\1\5\5\uffff\1\1\1\2\1\3\4\uffff\2\5\1\uffff\1\6\1\10\1\11\10\uffff\1\12\22\uffff\23\5",
            "\1\5\17\uffff\7\5\1\4\11\uffff\1\5\1\uffff\1\5\1\uffff\1\5\6\uffff\1\2\1\3\4\uffff\2\5\37\uffff\23\5",
            "\1\5\17\uffff\7\5\1\4\11\uffff\1\5\1\uffff\1\5\1\uffff\1\5\7\uffff\1\3\4\uffff\2\5\37\uffff\23\5",
            "",
            "",
            "",
            "",
            "",
            "\1\11\10\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2047:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection )";
        }
    }
    static final String dfa_14s = "\74\uffff";
    static final String dfa_15s = "\1\2\73\uffff";
    static final String dfa_16s = "\1\4\1\0\14\uffff\1\0\25\uffff\2\0\2\uffff\1\0\23\uffff";
    static final String dfa_17s = "\1\151\1\0\14\uffff\1\0\25\uffff\2\0\2\uffff\1\0\23\uffff";
    static final String dfa_18s = "\2\uffff\1\2\51\uffff\1\1\17\uffff";
    static final String dfa_19s = "\1\uffff\1\0\14\uffff\1\1\25\uffff\1\2\1\3\2\uffff\1\4\23\uffff}>";
    static final String[] dfa_20s = {
            "\1\45\3\54\14\uffff\4\2\1\16\3\2\1\1\2\uffff\1\54\2\uffff\1\54\1\uffff\1\54\1\44\2\2\1\uffff\1\2\1\54\4\uffff\3\2\2\uffff\1\54\1\uffff\2\2\1\54\1\2\1\50\1\2\3\uffff\1\54\1\uffff\2\54\1\uffff\1\2\4\uffff\1\54\6\uffff\3\54\4\uffff\23\2",
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

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 3188:3: ( (lv_equations_3_0= ruleEquation ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_36 = input.LA(1);

                         
                        int index77_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_36);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_37 = input.LA(1);

                         
                        int index77_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_37);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_40 = input.LA(1);

                         
                        int index77_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_40);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\27\uffff";
    static final String dfa_22s = "\1\4\10\uffff\2\0\14\uffff";
    static final String dfa_23s = "\1\122\10\uffff\2\0\14\uffff";
    static final String dfa_24s = "\1\uffff\1\1\20\uffff\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_25s = "\11\uffff\1\0\1\1\14\uffff}>";
    static final String[] dfa_26s = {
            "\1\12\3\1\20\uffff\1\1\3\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\11\4\uffff\1\1\11\uffff\1\1\3\uffff\1\22\1\uffff\1\1\4\uffff\1\23\1\uffff\1\24\1\25\6\uffff\1\1\6\uffff\3\1",
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

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "3225:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_9 = input.LA(1);

                         
                        int index78_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index78_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_10 = input.LA(1);

                         
                        int index78_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index78_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\63\uffff";
    static final String dfa_28s = "\1\1\62\uffff";
    static final String dfa_29s = "\1\4\43\uffff\2\0\15\uffff";
    static final String dfa_30s = "\1\151\43\uffff\2\0\15\uffff";
    static final String dfa_31s = "\1\uffff\1\2\52\uffff\1\1\6\uffff";
    static final String dfa_32s = "\44\uffff\1\0\1\1\15\uffff}>";
    static final String[] dfa_33s = {
            "\1\45\17\uffff\11\1\2\uffff\1\54\5\uffff\1\44\2\1\1\uffff\1\1\3\uffff\1\54\1\uffff\3\1\4\uffff\2\1\1\54\3\1\3\uffff\1\54\2\uffff\1\54\1\uffff\1\1\2\54\20\uffff\23\1",
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
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 3983:3: ( (lv_statements_3_0= ruleStatement ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_36 = input.LA(1);

                         
                        int index89_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA89_37 = input.LA(1);

                         
                        int index89_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_37);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\41\uffff";
    static final String dfa_35s = "\1\1\40\uffff";
    static final String dfa_36s = "\1\5\3\uffff\1\0\34\uffff";
    static final String dfa_37s = "\1\123\3\uffff\1\0\34\uffff";
    static final String dfa_38s = "\1\uffff\1\2\34\uffff\1\1\2\uffff";
    static final String dfa_39s = "\4\uffff\1\0\34\uffff}>";
    static final String[] dfa_40s = {
            "\1\1\15\uffff\1\1\11\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1\1\4\uffff\1\1\2\uffff\1\1\3\uffff\2\36\1\uffff\1\1\2\uffff\1\1\3\uffff\5\1\6\uffff\2\1\1\uffff\10\1\1\4\1\36",
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
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 5348:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_4 = input.LA(1);

                         
                        int index116_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_InternalMOloc()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index116_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\16\uffff";
    static final String dfa_42s = "\1\4\3\uffff\3\0\7\uffff";
    static final String dfa_43s = "\1\72\3\uffff\3\0\7\uffff";
    static final String dfa_44s = "\1\uffff\1\1\1\2\1\3\3\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\5";
    static final String dfa_45s = "\4\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] dfa_46s = {
            "\1\5\1\2\1\1\1\3\20\uffff\1\7\3\uffff\1\14\2\uffff\1\11\2\uffff\1\6\2\uffff\1\4\4\uffff\1\12\11\uffff\1\13\5\uffff\1\7",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "5457:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA121_4 = input.LA(1);

                         
                        int index121_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred155_InternalMOloc()) ) {s = 7;}

                        else if ( (synpred156_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index121_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA121_5 = input.LA(1);

                         
                        int index121_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred155_InternalMOloc()) ) {s = 7;}

                        else if ( (synpred156_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index121_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA121_6 = input.LA(1);

                         
                        int index121_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred155_InternalMOloc()) ) {s = 7;}

                        else if ( (synpred156_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index121_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 121, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_47s = "\25\uffff";
    static final String dfa_48s = "\1\4\11\uffff\1\0\12\uffff";
    static final String dfa_49s = "\1\127\11\uffff\1\0\12\uffff";
    static final String dfa_50s = "\1\uffff\1\1\22\uffff\1\2";
    static final String dfa_51s = "\12\uffff\1\0\12\uffff}>";
    static final String[] dfa_52s = {
            "\1\12\3\1\20\uffff\1\1\3\uffff\1\1\2\uffff\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\11\uffff\1\1\3\uffff\1\1\1\uffff\1\1\16\uffff\1\1\6\uffff\3\1\4\uffff\1\1",
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

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA141 extends DFA {

        public DFA141(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 141;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "6234:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA141_10 = input.LA(1);

                         
                        int index141_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index141_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 141, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007F00002L,0x00000000FF800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007F00000L,0x00000000FF800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0EC382E09FF00030L,0x000003FFFF800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0EC382E01FF00030L,0x000003FFFF800010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0EC382E01FF00010L,0x000003FFFF800010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00C182A047F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00C182A007F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000044080000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00C183A007F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0EC382E00FF00012L,0x000003FFFF800010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001000A0000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x000003C700000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000002L,0x0000000700000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001400A0000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001000A0000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x05100435910000F0L,0x0000000000070200L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x05102435910000F0L,0x0000000000070200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004046080000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004080080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00C1A3A207F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00C1A3A007F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400800080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100044080000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000006000080030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000006000080010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x05100437910000F0L,0x0000000000070200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x85100434910000F2L,0x0000000000070206L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xE5100434910000F0L,0x0000000000070206L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x85100434910000F0L,0x0000000000070206L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x85100434910000F0L,0x000000000007020EL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8100202080000012L,0x0000000000000064L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0510043F910000F0L,0x0000000000070200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0xE100202090000010L,0x0000000000000064L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x8100202090000010L,0x0000000000000064L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x8100202090000010L,0x000000000000006CL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x04100434910000F0L,0x0000000000070200L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FC00L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000001000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x000C000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0510043D910000F2L,0x0000000000070200L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x8000000800000002L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x05100437910000F0L,0x0000000000870200L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x05100435910000F0L,0x0000000000870200L});

}