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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_UNSIGNED_NUMBER", "RULE_TRUE_FALSE", "RULE_NON_DIGIT", "RULE_DIGIT", "RULE_Q_IDENT", "RULE_UNSIGNED_INTEGER", "RULE_S_CHAR", "RULE_S_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_Q_CHAR", "'within'", "';'", "'final'", "'encapsulated'", "'partial'", "'expandable'", "'pure'", "'impure'", "'operator'", "'extends'", "'end'", "'='", "'enumeration'", "'('", "':'", "')'", "'def'", "','", "'+'", "'.'", "'annotation'", "'redeclare'", "'each'", "'['", "']'", "'Unfinished2'", "':='", "'break'", "'import'", "'.*'", "'*'", "'{'", "'}'", "'inner'", "'outer'", "'replaceable'", "'if'", "'external'", "'nullElement'", "'then'", "'elseif'", "'else'", "'or'", "'and'", "'not'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'-'", "'.+'", "'.-'", "'/'", "'^'", "'.^'", "'for'", "'in'", "'NULLClassType'", "'class'", "'model'", "'record'", "'block'", "'connector'", "'type'", "'package'", "'function'", "'NULLDirection'", "'input'", "'output'", "'NULLRelationshipType'", "'flow'", "'stream'", "'NULLParameterType'", "'discrete'", "'parameter'", "'constant'"
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
    public static final int T__92=92;
    public static final int RULE_UNSIGNED_INTEGER=11;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_Q_CHAR=17;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__95=95;
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
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMOlocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMOlocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[215+1];
             
             
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

                if ( ((LA2_0>=20 && LA2_0<=26)||(LA2_0>=77 && LA2_0<=85)) ) {
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

                    if ( ((LA9_3>=30 && LA9_3<=31)||(LA9_3>=86 && LA9_3<=88)) ) {
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
                else if ( ((LA9_2>=RULE_IDENT && LA9_2<=RULE_STRING)||LA9_2==20||(LA9_2>=27 && LA9_2<=28)||LA9_2==31||LA9_2==37||LA9_2==39||LA9_2==46||(LA9_2>=51 && LA9_2<=53)||LA9_2==55||(LA9_2>=86 && LA9_2<=95)) ) {
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

            if ( ((LA16_0>=86 && LA16_0<=88)) ) {
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

                if ( (LA21_0==RULE_IDENT||LA21_0==20||LA21_0==27||LA21_0==37||LA21_0==39||LA21_0==46||(LA21_0>=51 && LA21_0<=53)||LA21_0==55||(LA21_0>=86 && LA21_0<=95)) ) {
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
    // InternalMOloc.g:1135:1: ruledescription[EObject in_current] returns [EObject current=in_current] : (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? ) ;
    public final EObject ruledescription(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledescription_StartIndex = input.index();
        Token lv_isAnnotation_1_0=null;
        EObject this_description_string_0 = null;

        EObject this_class_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // InternalMOloc.g:1141:2: ( (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? ) )
            // InternalMOloc.g:1142:2: (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? )
            {
            // InternalMOloc.g:1142:2: (this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )? )
            // InternalMOloc.g:1143:3: this_description_string_0= ruledescription_string[$current] ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )?
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
            // InternalMOloc.g:1157:3: ( ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMOloc.g:1158:4: ( (lv_isAnnotation_1_0= 'annotation' ) ) this_class_modification_2= ruleclass_modification[$current]
                    {
                    // InternalMOloc.g:1158:4: ( (lv_isAnnotation_1_0= 'annotation' ) )
                    // InternalMOloc.g:1159:5: (lv_isAnnotation_1_0= 'annotation' )
                    {
                    // InternalMOloc.g:1159:5: (lv_isAnnotation_1_0= 'annotation' )
                    // InternalMOloc.g:1160:6: lv_isAnnotation_1_0= 'annotation'
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
    // InternalMOloc.g:1191:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;
        int entryRuleArgument_StartIndex = input.index();
        EObject iv_ruleArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // InternalMOloc.g:1191:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMOloc.g:1192:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalMOloc.g:1198:1: ruleArgument returns [EObject current=null] : ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? this_short_class_definition_3= ruleshort_class_definition[$current] ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;
        int ruleArgument_StartIndex = input.index();
        Token lv_isRedeclare_0_0=null;
        Token lv_isEach_1_0=null;
        Token lv_isfinal_2_0=null;
        EObject this_short_class_definition_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // InternalMOloc.g:1204:2: ( ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? this_short_class_definition_3= ruleshort_class_definition[$current] ) )
            // InternalMOloc.g:1205:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? this_short_class_definition_3= ruleshort_class_definition[$current] )
            {
            // InternalMOloc.g:1205:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? this_short_class_definition_3= ruleshort_class_definition[$current] )
            // InternalMOloc.g:1206:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? this_short_class_definition_3= ruleshort_class_definition[$current]
            {
            // InternalMOloc.g:1206:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMOloc.g:1207:4: (lv_isRedeclare_0_0= 'redeclare' )
                    {
                    // InternalMOloc.g:1207:4: (lv_isRedeclare_0_0= 'redeclare' )
                    // InternalMOloc.g:1208:5: lv_isRedeclare_0_0= 'redeclare'
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

            // InternalMOloc.g:1220:3: ( (lv_isEach_1_0= 'each' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMOloc.g:1221:4: (lv_isEach_1_0= 'each' )
                    {
                    // InternalMOloc.g:1221:4: (lv_isEach_1_0= 'each' )
                    // InternalMOloc.g:1222:5: lv_isEach_1_0= 'each'
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

            // InternalMOloc.g:1234:3: ( (lv_isfinal_2_0= 'final' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMOloc.g:1235:4: (lv_isfinal_2_0= 'final' )
                    {
                    // InternalMOloc.g:1235:4: (lv_isfinal_2_0= 'final' )
                    // InternalMOloc.g:1236:5: lv_isfinal_2_0= 'final'
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

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getArgumentRule());
              			}
              			newCompositeNode(grammarAccess.getArgumentAccess().getShort_class_definitionParserRuleCall_3());
              		
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


            }

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


    // $ANTLR start "ruleshort_class_definition"
    // InternalMOloc.g:1267:1: ruleshort_class_definition[EObject in_current] returns [EObject current=in_current] : (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) ;
    public final EObject ruleshort_class_definition(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleshort_class_definition_StartIndex = input.index();
        EObject this_class_prefixes_0 = null;

        EObject this_short_class_specifier_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // InternalMOloc.g:1273:2: ( (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) )
            // InternalMOloc.g:1274:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            {
            // InternalMOloc.g:1274:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            // InternalMOloc.g:1275:3: this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current]
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
            if ( state.backtracking>0 ) { memoize(input, 25, ruleshort_class_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleshort_class_definition"


    // $ANTLR start "rulecomponent_clause1"
    // InternalMOloc.g:1308:1: rulecomponent_clause1[EObject in_current] returns [EObject current=in_current] : (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) ;
    public final EObject rulecomponent_clause1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_clause1_StartIndex = input.index();
        EObject this_type_prefix_0 = null;

        EObject this_type_specifier_1 = null;

        EObject this_component_declaration1_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // InternalMOloc.g:1314:2: ( (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) )
            // InternalMOloc.g:1315:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            {
            // InternalMOloc.g:1315:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            // InternalMOloc.g:1316:3: this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current]
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
            if ( state.backtracking>0 ) { memoize(input, 26, rulecomponent_clause1_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomponent_clause1"


    // $ANTLR start "ruletype_prefix"
    // InternalMOloc.g:1363:1: ruletype_prefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) ;
    public final EObject ruletype_prefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruletype_prefix_StartIndex = input.index();
        Enumerator lv_relationshipType_0_0 = null;

        Enumerator lv_parameterType_1_0 = null;

        Enumerator lv_directionType_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // InternalMOloc.g:1369:2: ( ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) )
            // InternalMOloc.g:1370:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            {
            // InternalMOloc.g:1370:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            // InternalMOloc.g:1371:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )?
            {
            // InternalMOloc.g:1371:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=89 && LA28_0<=91)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMOloc.g:1372:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    {
                    // InternalMOloc.g:1372:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    // InternalMOloc.g:1373:5: lv_relationshipType_0_0= ruleRelationshipType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getRelationshipTypeRelationshipTypeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
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

            // InternalMOloc.g:1390:3: ( (lv_parameterType_1_0= ruleParameterType ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=92 && LA29_0<=95)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMOloc.g:1391:4: (lv_parameterType_1_0= ruleParameterType )
                    {
                    // InternalMOloc.g:1391:4: (lv_parameterType_1_0= ruleParameterType )
                    // InternalMOloc.g:1392:5: lv_parameterType_1_0= ruleParameterType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getParameterTypeParameterTypeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
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

            // InternalMOloc.g:1409:3: ( (lv_directionType_2_0= ruleDirection ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=86 && LA30_0<=88)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMOloc.g:1410:4: (lv_directionType_2_0= ruleDirection )
                    {
                    // InternalMOloc.g:1410:4: (lv_directionType_2_0= ruleDirection )
                    // InternalMOloc.g:1411:5: lv_directionType_2_0= ruleDirection
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
            if ( state.backtracking>0 ) { memoize(input, 27, ruletype_prefix_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruletype_prefix"


    // $ANTLR start "rulecomponent_declaration1"
    // InternalMOloc.g:1433:1: rulecomponent_declaration1[EObject in_current] returns [EObject current=in_current] : (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) ;
    public final EObject rulecomponent_declaration1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_declaration1_StartIndex = input.index();
        EObject this_declaration_0 = null;

        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // InternalMOloc.g:1439:2: ( (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) )
            // InternalMOloc.g:1440:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            {
            // InternalMOloc.g:1440:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            // InternalMOloc.g:1441:3: this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current]
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
            if ( state.backtracking>0 ) { memoize(input, 28, rulecomponent_declaration1_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomponent_declaration1"


    // $ANTLR start "ruledeclaration"
    // InternalMOloc.g:1474:1: ruledeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) ;
    public final EObject ruledeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledeclaration_StartIndex = input.index();
        Token lv_declarationName_0_0=null;
        EObject this_array_subscripts_1 = null;

        EObject this_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // InternalMOloc.g:1480:2: ( ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) )
            // InternalMOloc.g:1481:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            {
            // InternalMOloc.g:1481:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            // InternalMOloc.g:1482:3: ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )?
            {
            // InternalMOloc.g:1482:3: ( (lv_declarationName_0_0= RULE_IDENT ) )
            // InternalMOloc.g:1483:4: (lv_declarationName_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:1483:4: (lv_declarationName_0_0= RULE_IDENT )
            // InternalMOloc.g:1484:5: lv_declarationName_0_0= RULE_IDENT
            {
            lv_declarationName_0_0=(Token)match(input,RULE_IDENT,FOLLOW_30); if (state.failed) return current;
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

            // InternalMOloc.g:1500:3: (this_array_subscripts_1= rulearray_subscripts[$current] )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMOloc.g:1501:4: this_array_subscripts_1= rulearray_subscripts[$current]
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
                    pushFollow(FOLLOW_31);
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

            // InternalMOloc.g:1516:3: (this_modification_2= rulemodification[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29||LA32_0==31||LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMOloc.g:1517:4: this_modification_2= rulemodification[$current]
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
            if ( state.backtracking>0 ) { memoize(input, 29, ruledeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "rulearray_subscripts"
    // InternalMOloc.g:1537:1: rulearray_subscripts[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // InternalMOloc.g:1543:2: ( (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' ) )
            // InternalMOloc.g:1544:2: (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            {
            // InternalMOloc.g:1544:2: (otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']' )
            // InternalMOloc.g:1545:3: otherlv_0= '[' ( (lv_subscript_1_0= ruleSubscript ) ) (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArray_subscriptsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMOloc.g:1549:3: ( (lv_subscript_1_0= ruleSubscript ) )
            // InternalMOloc.g:1550:4: (lv_subscript_1_0= ruleSubscript )
            {
            // InternalMOloc.g:1550:4: (lv_subscript_1_0= ruleSubscript )
            // InternalMOloc.g:1551:5: lv_subscript_1_0= ruleSubscript
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArray_subscriptsAccess().getSubscriptSubscriptParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            // InternalMOloc.g:1568:3: (otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==35) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMOloc.g:1569:4: otherlv_2= ',' ( (lv_subscript_3_0= ruleSubscript ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getArray_subscriptsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMOloc.g:1573:4: ( (lv_subscript_3_0= ruleSubscript ) )
            	    // InternalMOloc.g:1574:5: (lv_subscript_3_0= ruleSubscript )
            	    {
            	    // InternalMOloc.g:1574:5: (lv_subscript_3_0= ruleSubscript )
            	    // InternalMOloc.g:1575:6: lv_subscript_3_0= ruleSubscript
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArray_subscriptsAccess().getSubscriptSubscriptParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop33;
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
            if ( state.backtracking>0 ) { memoize(input, 30, rulearray_subscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulearray_subscripts"


    // $ANTLR start "entryRuleSubscript"
    // InternalMOloc.g:1601:1: entryRuleSubscript returns [String current=null] : iv_ruleSubscript= ruleSubscript EOF ;
    public final String entryRuleSubscript() throws RecognitionException {
        String current = null;
        int entryRuleSubscript_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSubscript = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // InternalMOloc.g:1601:49: (iv_ruleSubscript= ruleSubscript EOF )
            // InternalMOloc.g:1602:2: iv_ruleSubscript= ruleSubscript EOF
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
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscript"


    // $ANTLR start "ruleSubscript"
    // InternalMOloc.g:1608:1: ruleSubscript returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' | this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleSubscript() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSubscript_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // InternalMOloc.g:1614:2: ( (kw= ':' | this_Expression_1= ruleExpression ) )
            // InternalMOloc.g:1615:2: (kw= ':' | this_Expression_1= ruleExpression )
            {
            // InternalMOloc.g:1615:2: (kw= ':' | this_Expression_1= ruleExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=RULE_IDENT && LA34_0<=RULE_TRUE_FALSE)||LA34_0==28||LA34_0==31||(LA34_0>=36 && LA34_0<=37)||LA34_0==41||LA34_0==49||LA34_0==54||LA34_0==62||(LA34_0>=69 && LA34_0<=71)) ) {
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
                    // InternalMOloc.g:1616:3: kw= ':'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSubscriptAccess().getColonKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1622:3: this_Expression_1= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubscript"


    // $ANTLR start "entryRuleUnfinished2"
    // InternalMOloc.g:1636:1: entryRuleUnfinished2 returns [EObject current=null] : iv_ruleUnfinished2= ruleUnfinished2 EOF ;
    public final EObject entryRuleUnfinished2() throws RecognitionException {
        EObject current = null;
        int entryRuleUnfinished2_StartIndex = input.index();
        EObject iv_ruleUnfinished2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // InternalMOloc.g:1636:52: (iv_ruleUnfinished2= ruleUnfinished2 EOF )
            // InternalMOloc.g:1637:2: iv_ruleUnfinished2= ruleUnfinished2 EOF
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
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleUnfinished2_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleUnfinished2"


    // $ANTLR start "ruleUnfinished2"
    // InternalMOloc.g:1643:1: ruleUnfinished2 returns [EObject current=null] : (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) ) ;
    public final EObject ruleUnfinished2() throws RecognitionException {
        EObject current = null;
        int ruleUnfinished2_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_aa_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // InternalMOloc.g:1649:2: ( (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) ) )
            // InternalMOloc.g:1650:2: (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) )
            {
            // InternalMOloc.g:1650:2: (otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) ) )
            // InternalMOloc.g:1651:3: otherlv_0= 'Unfinished2' ( (lv_aa_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnfinished2Access().getUnfinished2Keyword_0());
              		
            }
            // InternalMOloc.g:1655:3: ( (lv_aa_1_0= ruleName ) )
            // InternalMOloc.g:1656:4: (lv_aa_1_0= ruleName )
            {
            // InternalMOloc.g:1656:4: (lv_aa_1_0= ruleName )
            // InternalMOloc.g:1657:5: lv_aa_1_0= ruleName
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleUnfinished2_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleUnfinished2"


    // $ANTLR start "rulemodification"
    // InternalMOloc.g:1679:1: rulemodification[EObject in_current] returns [EObject current=in_current] : ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // InternalMOloc.g:1685:2: ( ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) )
            // InternalMOloc.g:1686:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            {
            // InternalMOloc.g:1686:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt36=1;
                }
                break;
            case 29:
                {
                alt36=2;
                }
                break;
            case 44:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalMOloc.g:1687:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    {
                    // InternalMOloc.g:1687:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    // InternalMOloc.g:1688:4: this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
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
                    pushFollow(FOLLOW_34);
                    this_class_modification_0=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:1702:4: (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==29) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMOloc.g:1703:5: otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) )
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getEqualsSignKeyword_0_1_0());
                              				
                            }
                            // InternalMOloc.g:1707:5: ( (lv_expression_2_0= ruleModification_expression ) )
                            // InternalMOloc.g:1708:6: (lv_expression_2_0= ruleModification_expression )
                            {
                            // InternalMOloc.g:1708:6: (lv_expression_2_0= ruleModification_expression )
                            // InternalMOloc.g:1709:7: lv_expression_2_0= ruleModification_expression
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
                    // InternalMOloc.g:1729:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:1729:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:1730:4: otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getModificationAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:1734:4: ( (lv_expression_4_0= ruleModification_expression ) )
                    // InternalMOloc.g:1735:5: (lv_expression_4_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:1735:5: (lv_expression_4_0= ruleModification_expression )
                    // InternalMOloc.g:1736:6: lv_expression_4_0= ruleModification_expression
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
                    // InternalMOloc.g:1755:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:1755:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:1756:4: otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getModificationAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMOloc.g:1760:4: ( (lv_expression_6_0= ruleModification_expression ) )
                    // InternalMOloc.g:1761:5: (lv_expression_6_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:1761:5: (lv_expression_6_0= ruleModification_expression )
                    // InternalMOloc.g:1762:6: lv_expression_6_0= ruleModification_expression
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
            if ( state.backtracking>0 ) { memoize(input, 35, rulemodification_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulemodification"


    // $ANTLR start "entryRuleModification_expression"
    // InternalMOloc.g:1784:1: entryRuleModification_expression returns [String current=null] : iv_ruleModification_expression= ruleModification_expression EOF ;
    public final String entryRuleModification_expression() throws RecognitionException {
        String current = null;
        int entryRuleModification_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleModification_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // InternalMOloc.g:1784:63: (iv_ruleModification_expression= ruleModification_expression EOF )
            // InternalMOloc.g:1785:2: iv_ruleModification_expression= ruleModification_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 36, entryRuleModification_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModification_expression"


    // $ANTLR start "ruleModification_expression"
    // InternalMOloc.g:1791:1: ruleModification_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | kw= 'break' ) ;
    public final AntlrDatatypeRuleToken ruleModification_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleModification_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // InternalMOloc.g:1797:2: ( (this_Expression_0= ruleExpression | kw= 'break' ) )
            // InternalMOloc.g:1798:2: (this_Expression_0= ruleExpression | kw= 'break' )
            {
            // InternalMOloc.g:1798:2: (this_Expression_0= ruleExpression | kw= 'break' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_IDENT && LA37_0<=RULE_TRUE_FALSE)||LA37_0==28||LA37_0==31||(LA37_0>=36 && LA37_0<=37)||LA37_0==41||LA37_0==49||LA37_0==54||LA37_0==62||(LA37_0>=69 && LA37_0<=71)) ) {
                alt37=1;
            }
            else if ( (LA37_0==45) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMOloc.g:1799:3: this_Expression_0= ruleExpression
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
                    // InternalMOloc.g:1810:3: kw= 'break'
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
            if ( state.backtracking>0 ) { memoize(input, 37, ruleModification_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModification_expression"


    // $ANTLR start "ruleconstraining_clause"
    // InternalMOloc.g:1820:1: ruleconstraining_clause[EObject in_current] returns [EObject current=in_current] : ( (lv_elements2_0_0= ruleUnfinished2 ) ) ;
    public final EObject ruleconstraining_clause(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleconstraining_clause_StartIndex = input.index();
        EObject lv_elements2_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // InternalMOloc.g:1826:2: ( ( (lv_elements2_0_0= ruleUnfinished2 ) ) )
            // InternalMOloc.g:1827:2: ( (lv_elements2_0_0= ruleUnfinished2 ) )
            {
            // InternalMOloc.g:1827:2: ( (lv_elements2_0_0= ruleUnfinished2 ) )
            // InternalMOloc.g:1828:3: (lv_elements2_0_0= ruleUnfinished2 )
            {
            // InternalMOloc.g:1828:3: (lv_elements2_0_0= ruleUnfinished2 )
            // InternalMOloc.g:1829:4: lv_elements2_0_0= ruleUnfinished2
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleconstraining_clause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleconstraining_clause"


    // $ANTLR start "entryRuleElement"
    // InternalMOloc.g:1849:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;
        int entryRuleElement_StartIndex = input.index();
        EObject iv_ruleElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // InternalMOloc.g:1849:48: (iv_ruleElement= ruleElement EOF )
            // InternalMOloc.g:1850:2: iv_ruleElement= ruleElement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMOloc.g:1856:1: ruleElement returns [EObject current=null] : (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;
        int ruleElement_StartIndex = input.index();
        EObject this_ImportClause_0 = null;

        EObject this_ExtendsClause_1 = null;

        EObject this_GeneralClause_2 = null;

        EObject this_ExternalElement_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // InternalMOloc.g:1862:2: ( (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement ) )
            // InternalMOloc.g:1863:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement )
            {
            // InternalMOloc.g:1863:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_GeneralClause_2= ruleGeneralClause | this_ExternalElement_3= ruleExternalElement )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt38=1;
                }
                break;
            case 27:
                {
                alt38=2;
                }
                break;
            case RULE_IDENT:
            case 20:
            case 37:
            case 39:
            case 51:
            case 52:
            case 53:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt38=3;
                }
                break;
            case 55:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMOloc.g:1864:3: this_ImportClause_0= ruleImportClause
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
                    // InternalMOloc.g:1876:3: this_ExtendsClause_1= ruleExtendsClause
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
                    // InternalMOloc.g:1888:3: this_GeneralClause_2= ruleGeneralClause
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
                    // InternalMOloc.g:1900:3: this_ExternalElement_3= ruleExternalElement
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, ruleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImportClause"
    // InternalMOloc.g:1915:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;
        int entryRuleImportClause_StartIndex = input.index();
        EObject iv_ruleImportClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // InternalMOloc.g:1915:53: (iv_ruleImportClause= ruleImportClause EOF )
            // InternalMOloc.g:1916:2: iv_ruleImportClause= ruleImportClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleImportClause"


    // $ANTLR start "ruleImportClause"
    // InternalMOloc.g:1922:1: ruleImportClause returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) ) | ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) ) ) this_description_13= ruledescription[$current] otherlv_14= ';' ) ;
    public final EObject ruleImportClause() throws RecognitionException {
        EObject current = null;
        int ruleImportClause_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_selfName_1_0=null;
        Token otherlv_2=null;
        Token lv_isImportAll_5_0=null;
        Token otherlv_6=null;
        Token lv_isImportAll_7_0=null;
        Token otherlv_8=null;
        Token lv_objectName_9_0=null;
        Token otherlv_10=null;
        Token lv_objectName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_importName_3_0 = null;

        AntlrDatatypeRuleToken lv_importName_4_0 = null;

        EObject this_description_13 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // InternalMOloc.g:1928:2: ( (otherlv_0= 'import' ( ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) ) | ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) ) ) this_description_13= ruledescription[$current] otherlv_14= ';' ) )
            // InternalMOloc.g:1929:2: (otherlv_0= 'import' ( ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) ) | ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) ) ) this_description_13= ruledescription[$current] otherlv_14= ';' )
            {
            // InternalMOloc.g:1929:2: (otherlv_0= 'import' ( ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) ) | ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) ) ) this_description_13= ruledescription[$current] otherlv_14= ';' )
            // InternalMOloc.g:1930:3: otherlv_0= 'import' ( ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) ) | ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) ) ) this_description_13= ruledescription[$current] otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportClauseAccess().getImportKeyword_0());
              		
            }
            // InternalMOloc.g:1934:3: ( ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) ) | ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_IDENT) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==37||LA42_1==47) ) {
                    alt42=2;
                }
                else if ( (LA42_1==29) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMOloc.g:1935:4: ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) )
                    {
                    // InternalMOloc.g:1935:4: ( ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) ) )
                    // InternalMOloc.g:1936:5: ( (lv_selfName_1_0= RULE_IDENT ) ) otherlv_2= '=' ( (lv_importName_3_0= ruleName ) )
                    {
                    // InternalMOloc.g:1936:5: ( (lv_selfName_1_0= RULE_IDENT ) )
                    // InternalMOloc.g:1937:6: (lv_selfName_1_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:1937:6: (lv_selfName_1_0= RULE_IDENT )
                    // InternalMOloc.g:1938:7: lv_selfName_1_0= RULE_IDENT
                    {
                    lv_selfName_1_0=(Token)match(input,RULE_IDENT,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_selfName_1_0, grammarAccess.getImportClauseAccess().getSelfNameIDENTTerminalRuleCall_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getImportClauseRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"selfName",
                      								lv_selfName_1_0,
                      								"dut.control.moloc.MOloc.IDENT");
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getImportClauseAccess().getEqualsSignKeyword_1_0_1());
                      				
                    }
                    // InternalMOloc.g:1958:5: ( (lv_importName_3_0= ruleName ) )
                    // InternalMOloc.g:1959:6: (lv_importName_3_0= ruleName )
                    {
                    // InternalMOloc.g:1959:6: (lv_importName_3_0= ruleName )
                    // InternalMOloc.g:1960:7: lv_importName_3_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportClauseAccess().getImportNameNameParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_15);
                    lv_importName_3_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getImportClauseRule());
                      							}
                      							set(
                      								current,
                      								"importName",
                      								lv_importName_3_0,
                      								"dut.control.moloc.MOloc.Name");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:1979:4: ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) )
                    {
                    // InternalMOloc.g:1979:4: ( ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) ) )
                    // InternalMOloc.g:1980:5: ( (lv_importName_4_0= ruleName ) ) ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) )
                    {
                    // InternalMOloc.g:1980:5: ( (lv_importName_4_0= ruleName ) )
                    // InternalMOloc.g:1981:6: (lv_importName_4_0= ruleName )
                    {
                    // InternalMOloc.g:1981:6: (lv_importName_4_0= ruleName )
                    // InternalMOloc.g:1982:7: lv_importName_4_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportClauseAccess().getImportNameNameParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_36);
                    lv_importName_4_0=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getImportClauseRule());
                      							}
                      							set(
                      								current,
                      								"importName",
                      								lv_importName_4_0,
                      								"dut.control.moloc.MOloc.Name");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMOloc.g:1999:5: ( ( (lv_isImportAll_5_0= '.*' ) ) | (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==47) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==37) ) {
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
                            // InternalMOloc.g:2000:6: ( (lv_isImportAll_5_0= '.*' ) )
                            {
                            // InternalMOloc.g:2000:6: ( (lv_isImportAll_5_0= '.*' ) )
                            // InternalMOloc.g:2001:7: (lv_isImportAll_5_0= '.*' )
                            {
                            // InternalMOloc.g:2001:7: (lv_isImportAll_5_0= '.*' )
                            // InternalMOloc.g:2002:8: lv_isImportAll_5_0= '.*'
                            {
                            lv_isImportAll_5_0=(Token)match(input,47,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_isImportAll_5_0, grammarAccess.getImportClauseAccess().getIsImportAllFullStopAsteriskKeyword_1_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getImportClauseRule());
                              								}
                              								setWithLastConsumed(current, "isImportAll", lv_isImportAll_5_0 != null, ".*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:2015:6: (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) )
                            {
                            // InternalMOloc.g:2015:6: (otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) ) )
                            // InternalMOloc.g:2016:7: otherlv_6= '.' ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) )
                            {
                            otherlv_6=(Token)match(input,37,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_6, grammarAccess.getImportClauseAccess().getFullStopKeyword_1_1_1_1_0());
                              						
                            }
                            // InternalMOloc.g:2020:7: ( ( (lv_isImportAll_7_0= '*' ) ) | (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' ) )
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==48) ) {
                                alt40=1;
                            }
                            else if ( (LA40_0==49) ) {
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
                                    // InternalMOloc.g:2021:8: ( (lv_isImportAll_7_0= '*' ) )
                                    {
                                    // InternalMOloc.g:2021:8: ( (lv_isImportAll_7_0= '*' ) )
                                    // InternalMOloc.g:2022:9: (lv_isImportAll_7_0= '*' )
                                    {
                                    // InternalMOloc.g:2022:9: (lv_isImportAll_7_0= '*' )
                                    // InternalMOloc.g:2023:10: lv_isImportAll_7_0= '*'
                                    {
                                    lv_isImportAll_7_0=(Token)match(input,48,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      										newLeafNode(lv_isImportAll_7_0, grammarAccess.getImportClauseAccess().getIsImportAllAsteriskKeyword_1_1_1_1_1_0_0());
                                      									
                                    }
                                    if ( state.backtracking==0 ) {

                                      										if (current==null) {
                                      											current = createModelElement(grammarAccess.getImportClauseRule());
                                      										}
                                      										setWithLastConsumed(current, "isImportAll", lv_isImportAll_7_0 != null, "*");
                                      									
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalMOloc.g:2036:8: (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' )
                                    {
                                    // InternalMOloc.g:2036:8: (otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}' )
                                    // InternalMOloc.g:2037:9: otherlv_8= '{' ( (lv_objectName_9_0= RULE_IDENT ) ) (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )* otherlv_12= '}'
                                    {
                                    otherlv_8=(Token)match(input,49,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_8, grammarAccess.getImportClauseAccess().getLeftCurlyBracketKeyword_1_1_1_1_1_1_0());
                                      								
                                    }
                                    // InternalMOloc.g:2041:9: ( (lv_objectName_9_0= RULE_IDENT ) )
                                    // InternalMOloc.g:2042:10: (lv_objectName_9_0= RULE_IDENT )
                                    {
                                    // InternalMOloc.g:2042:10: (lv_objectName_9_0= RULE_IDENT )
                                    // InternalMOloc.g:2043:11: lv_objectName_9_0= RULE_IDENT
                                    {
                                    lv_objectName_9_0=(Token)match(input,RULE_IDENT,FOLLOW_38); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      											newLeafNode(lv_objectName_9_0, grammarAccess.getImportClauseAccess().getObjectNameIDENTTerminalRuleCall_1_1_1_1_1_1_1_0());
                                      										
                                    }
                                    if ( state.backtracking==0 ) {

                                      											if (current==null) {
                                      												current = createModelElement(grammarAccess.getImportClauseRule());
                                      											}
                                      											addWithLastConsumed(
                                      												current,
                                      												"objectName",
                                      												lv_objectName_9_0,
                                      												"dut.control.moloc.MOloc.IDENT");
                                      										
                                    }

                                    }


                                    }

                                    // InternalMOloc.g:2059:9: (otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) ) )*
                                    loop39:
                                    do {
                                        int alt39=2;
                                        int LA39_0 = input.LA(1);

                                        if ( (LA39_0==35) ) {
                                            alt39=1;
                                        }


                                        switch (alt39) {
                                    	case 1 :
                                    	    // InternalMOloc.g:2060:10: otherlv_10= ',' ( (lv_objectName_11_0= RULE_IDENT ) )
                                    	    {
                                    	    otherlv_10=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      										newLeafNode(otherlv_10, grammarAccess.getImportClauseAccess().getCommaKeyword_1_1_1_1_1_1_2_0());
                                    	      									
                                    	    }
                                    	    // InternalMOloc.g:2064:10: ( (lv_objectName_11_0= RULE_IDENT ) )
                                    	    // InternalMOloc.g:2065:11: (lv_objectName_11_0= RULE_IDENT )
                                    	    {
                                    	    // InternalMOloc.g:2065:11: (lv_objectName_11_0= RULE_IDENT )
                                    	    // InternalMOloc.g:2066:12: lv_objectName_11_0= RULE_IDENT
                                    	    {
                                    	    lv_objectName_11_0=(Token)match(input,RULE_IDENT,FOLLOW_38); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      												newLeafNode(lv_objectName_11_0, grammarAccess.getImportClauseAccess().getObjectNameIDENTTerminalRuleCall_1_1_1_1_1_1_2_1_0());
                                    	      											
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


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop39;
                                        }
                                    } while (true);

                                    otherlv_12=(Token)match(input,50,FOLLOW_15); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_12, grammarAccess.getImportClauseAccess().getRightCurlyBracketKeyword_1_1_1_1_1_1_3());
                                      								
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
              			newCompositeNode(grammarAccess.getImportClauseAccess().getDescriptionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_4);
            this_description_13=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_13;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_14=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getImportClauseAccess().getSemicolonKeyword_3());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleExtendsClause"
    // InternalMOloc.g:2115:1: entryRuleExtendsClause returns [EObject current=null] : iv_ruleExtendsClause= ruleExtendsClause EOF ;
    public final EObject entryRuleExtendsClause() throws RecognitionException {
        EObject current = null;
        int entryRuleExtendsClause_StartIndex = input.index();
        EObject iv_ruleExtendsClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // InternalMOloc.g:2115:54: (iv_ruleExtendsClause= ruleExtendsClause EOF )
            // InternalMOloc.g:2116:2: iv_ruleExtendsClause= ruleExtendsClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsClause"


    // $ANTLR start "ruleExtendsClause"
    // InternalMOloc.g:2122:1: ruleExtendsClause returns [EObject current=null] : (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )* otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' ) ;
    public final EObject ruleExtendsClause() throws RecognitionException {
        EObject current = null;
        int ruleExtendsClause_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token lv_isAnnotation_9_0=null;
        Token otherlv_11=null;
        EObject this_type_specifier_1 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_breaks_4_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_breaks_7_0 = null;

        EObject this_class_modification_10 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // InternalMOloc.g:2128:2: ( (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )* otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' ) )
            // InternalMOloc.g:2129:2: (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )* otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' )
            {
            // InternalMOloc.g:2129:2: (otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )* otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';' )
            // InternalMOloc.g:2130:3: otherlv_0= 'extends' this_type_specifier_1= ruletype_specifier[$current] (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )* otherlv_8= ')' )? ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )? otherlv_11= ';'
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
            pushFollow(FOLLOW_39);
            this_type_specifier_1=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2148:3: (otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )* otherlv_8= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==31) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMOloc.g:2149:4: otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) ) (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )* otherlv_8= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExtendsClauseAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalMOloc.g:2153:4: ( ( (lv_arguments_3_0= ruleArgument ) ) | ( (lv_breaks_4_0= ruleBreak ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==20||(LA43_0>=22 && LA43_0<=26)||(LA43_0>=39 && LA43_0<=40)||(LA43_0>=77 && LA43_0<=85)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==45) ) {
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
                            // InternalMOloc.g:2154:5: ( (lv_arguments_3_0= ruleArgument ) )
                            {
                            // InternalMOloc.g:2154:5: ( (lv_arguments_3_0= ruleArgument ) )
                            // InternalMOloc.g:2155:6: (lv_arguments_3_0= ruleArgument )
                            {
                            // InternalMOloc.g:2155:6: (lv_arguments_3_0= ruleArgument )
                            // InternalMOloc.g:2156:7: lv_arguments_3_0= ruleArgument
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExtendsClauseAccess().getArgumentsArgumentParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
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
                            // InternalMOloc.g:2174:5: ( (lv_breaks_4_0= ruleBreak ) )
                            {
                            // InternalMOloc.g:2174:5: ( (lv_breaks_4_0= ruleBreak ) )
                            // InternalMOloc.g:2175:6: (lv_breaks_4_0= ruleBreak )
                            {
                            // InternalMOloc.g:2175:6: (lv_breaks_4_0= ruleBreak )
                            // InternalMOloc.g:2176:7: lv_breaks_4_0= ruleBreak
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
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

                    // InternalMOloc.g:2194:4: (otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==35) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMOloc.g:2195:5: otherlv_5= ',' ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getExtendsClauseAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalMOloc.g:2199:5: ( ( (lv_arguments_6_0= ruleArgument ) ) | ( (lv_breaks_7_0= ruleBreak ) ) )
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( (LA44_0==20||(LA44_0>=22 && LA44_0<=26)||(LA44_0>=39 && LA44_0<=40)||(LA44_0>=77 && LA44_0<=85)) ) {
                    	        alt44=1;
                    	    }
                    	    else if ( (LA44_0==45) ) {
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
                    	            // InternalMOloc.g:2200:6: ( (lv_arguments_6_0= ruleArgument ) )
                    	            {
                    	            // InternalMOloc.g:2200:6: ( (lv_arguments_6_0= ruleArgument ) )
                    	            // InternalMOloc.g:2201:7: (lv_arguments_6_0= ruleArgument )
                    	            {
                    	            // InternalMOloc.g:2201:7: (lv_arguments_6_0= ruleArgument )
                    	            // InternalMOloc.g:2202:8: lv_arguments_6_0= ruleArgument
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getExtendsClauseAccess().getArgumentsArgumentParserRuleCall_2_2_1_0_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_21);
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
                    	            // InternalMOloc.g:2220:6: ( (lv_breaks_7_0= ruleBreak ) )
                    	            {
                    	            // InternalMOloc.g:2220:6: ( (lv_breaks_7_0= ruleBreak ) )
                    	            // InternalMOloc.g:2221:7: (lv_breaks_7_0= ruleBreak )
                    	            {
                    	            // InternalMOloc.g:2221:7: (lv_breaks_7_0= ruleBreak )
                    	            // InternalMOloc.g:2222:8: lv_breaks_7_0= ruleBreak
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_2_2_1_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_21);
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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,33,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExtendsClauseAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:2246:3: ( ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMOloc.g:2247:4: ( (lv_isAnnotation_9_0= 'annotation' ) ) this_class_modification_10= ruleclass_modification[$current]
                    {
                    // InternalMOloc.g:2247:4: ( (lv_isAnnotation_9_0= 'annotation' ) )
                    // InternalMOloc.g:2248:5: (lv_isAnnotation_9_0= 'annotation' )
                    {
                    // InternalMOloc.g:2248:5: (lv_isAnnotation_9_0= 'annotation' )
                    // InternalMOloc.g:2249:6: lv_isAnnotation_9_0= 'annotation'
                    {
                    lv_isAnnotation_9_0=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isAnnotation_9_0, grammarAccess.getExtendsClauseAccess().getIsAnnotationAnnotationKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExtendsClauseRule());
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendsClause"


    // $ANTLR start "entryRuleBreak"
    // InternalMOloc.g:2284:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;
        int entryRuleBreak_StartIndex = input.index();
        EObject iv_ruleBreak = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // InternalMOloc.g:2284:46: (iv_ruleBreak= ruleBreak EOF )
            // InternalMOloc.g:2285:2: iv_ruleBreak= ruleBreak EOF
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
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalMOloc.g:2291:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;
        int ruleBreak_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_breakName_2_0=null;
        EObject lv_connect_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // InternalMOloc.g:2297:2: ( (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) ) )
            // InternalMOloc.g:2298:2: (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) )
            {
            // InternalMOloc.g:2298:2: (otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) ) )
            // InternalMOloc.g:2299:3: otherlv_0= 'break' ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
              		
            }
            // InternalMOloc.g:2303:3: ( ( (lv_connect_1_0= ruleNULLElement ) ) | ( (lv_breakName_2_0= RULE_IDENT ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_IDENT) ) {
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
                    // InternalMOloc.g:2304:4: ( (lv_connect_1_0= ruleNULLElement ) )
                    {
                    // InternalMOloc.g:2304:4: ( (lv_connect_1_0= ruleNULLElement ) )
                    // InternalMOloc.g:2305:5: (lv_connect_1_0= ruleNULLElement )
                    {
                    // InternalMOloc.g:2305:5: (lv_connect_1_0= ruleNULLElement )
                    // InternalMOloc.g:2306:6: lv_connect_1_0= ruleNULLElement
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
                    // InternalMOloc.g:2324:4: ( (lv_breakName_2_0= RULE_IDENT ) )
                    {
                    // InternalMOloc.g:2324:4: ( (lv_breakName_2_0= RULE_IDENT ) )
                    // InternalMOloc.g:2325:5: (lv_breakName_2_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:2325:5: (lv_breakName_2_0= RULE_IDENT )
                    // InternalMOloc.g:2326:6: lv_breakName_2_0= RULE_IDENT
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleGeneralClause"
    // InternalMOloc.g:2347:1: entryRuleGeneralClause returns [EObject current=null] : iv_ruleGeneralClause= ruleGeneralClause EOF ;
    public final EObject entryRuleGeneralClause() throws RecognitionException {
        EObject current = null;
        int entryRuleGeneralClause_StartIndex = input.index();
        EObject iv_ruleGeneralClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // InternalMOloc.g:2347:54: (iv_ruleGeneralClause= ruleGeneralClause EOF )
            // InternalMOloc.g:2348:2: iv_ruleGeneralClause= ruleGeneralClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleGeneralClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralClause"


    // $ANTLR start "ruleGeneralClause"
    // InternalMOloc.g:2354:1: ruleGeneralClause returns [EObject current=null] : ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isfinal_1_0= 'final' ) )? ( (lv_isInner_2_0= 'inner' ) )? ( (lv_isOuter_3_0= 'outer' ) )? ( (lv_isReplaceable_4_0= 'replaceable' ) )? this_type_prefix_5= ruletype_prefix[$current] this_type_specifier_6= ruletype_specifier[$current] (this_array_subscripts_7= rulearray_subscripts[$current] )? ( (lv_component_list_8_0= ruleComponent_declaration ) ) (otherlv_9= ',' ( (lv_component_list_10_0= ruleComponent_declaration ) ) )* otherlv_11= ';' ) ;
    public final EObject ruleGeneralClause() throws RecognitionException {
        EObject current = null;
        int ruleGeneralClause_StartIndex = input.index();
        Token lv_isRedeclare_0_0=null;
        Token lv_isfinal_1_0=null;
        Token lv_isInner_2_0=null;
        Token lv_isOuter_3_0=null;
        Token lv_isReplaceable_4_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_type_prefix_5 = null;

        EObject this_type_specifier_6 = null;

        EObject this_array_subscripts_7 = null;

        EObject lv_component_list_8_0 = null;

        EObject lv_component_list_10_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // InternalMOloc.g:2360:2: ( ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isfinal_1_0= 'final' ) )? ( (lv_isInner_2_0= 'inner' ) )? ( (lv_isOuter_3_0= 'outer' ) )? ( (lv_isReplaceable_4_0= 'replaceable' ) )? this_type_prefix_5= ruletype_prefix[$current] this_type_specifier_6= ruletype_specifier[$current] (this_array_subscripts_7= rulearray_subscripts[$current] )? ( (lv_component_list_8_0= ruleComponent_declaration ) ) (otherlv_9= ',' ( (lv_component_list_10_0= ruleComponent_declaration ) ) )* otherlv_11= ';' ) )
            // InternalMOloc.g:2361:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isfinal_1_0= 'final' ) )? ( (lv_isInner_2_0= 'inner' ) )? ( (lv_isOuter_3_0= 'outer' ) )? ( (lv_isReplaceable_4_0= 'replaceable' ) )? this_type_prefix_5= ruletype_prefix[$current] this_type_specifier_6= ruletype_specifier[$current] (this_array_subscripts_7= rulearray_subscripts[$current] )? ( (lv_component_list_8_0= ruleComponent_declaration ) ) (otherlv_9= ',' ( (lv_component_list_10_0= ruleComponent_declaration ) ) )* otherlv_11= ';' )
            {
            // InternalMOloc.g:2361:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isfinal_1_0= 'final' ) )? ( (lv_isInner_2_0= 'inner' ) )? ( (lv_isOuter_3_0= 'outer' ) )? ( (lv_isReplaceable_4_0= 'replaceable' ) )? this_type_prefix_5= ruletype_prefix[$current] this_type_specifier_6= ruletype_specifier[$current] (this_array_subscripts_7= rulearray_subscripts[$current] )? ( (lv_component_list_8_0= ruleComponent_declaration ) ) (otherlv_9= ',' ( (lv_component_list_10_0= ruleComponent_declaration ) ) )* otherlv_11= ';' )
            // InternalMOloc.g:2362:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isfinal_1_0= 'final' ) )? ( (lv_isInner_2_0= 'inner' ) )? ( (lv_isOuter_3_0= 'outer' ) )? ( (lv_isReplaceable_4_0= 'replaceable' ) )? this_type_prefix_5= ruletype_prefix[$current] this_type_specifier_6= ruletype_specifier[$current] (this_array_subscripts_7= rulearray_subscripts[$current] )? ( (lv_component_list_8_0= ruleComponent_declaration ) ) (otherlv_9= ',' ( (lv_component_list_10_0= ruleComponent_declaration ) ) )* otherlv_11= ';'
            {
            // InternalMOloc.g:2362:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMOloc.g:2363:4: (lv_isRedeclare_0_0= 'redeclare' )
                    {
                    // InternalMOloc.g:2363:4: (lv_isRedeclare_0_0= 'redeclare' )
                    // InternalMOloc.g:2364:5: lv_isRedeclare_0_0= 'redeclare'
                    {
                    lv_isRedeclare_0_0=(Token)match(input,39,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isRedeclare_0_0, grammarAccess.getGeneralClauseAccess().getIsRedeclareRedeclareKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isRedeclare", lv_isRedeclare_0_0 != null, "redeclare");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2376:3: ( (lv_isfinal_1_0= 'final' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==20) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMOloc.g:2377:4: (lv_isfinal_1_0= 'final' )
                    {
                    // InternalMOloc.g:2377:4: (lv_isfinal_1_0= 'final' )
                    // InternalMOloc.g:2378:5: lv_isfinal_1_0= 'final'
                    {
                    lv_isfinal_1_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isfinal_1_0, grammarAccess.getGeneralClauseAccess().getIsfinalFinalKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isfinal", lv_isfinal_1_0 != null, "final");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2390:3: ( (lv_isInner_2_0= 'inner' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMOloc.g:2391:4: (lv_isInner_2_0= 'inner' )
                    {
                    // InternalMOloc.g:2391:4: (lv_isInner_2_0= 'inner' )
                    // InternalMOloc.g:2392:5: lv_isInner_2_0= 'inner'
                    {
                    lv_isInner_2_0=(Token)match(input,51,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isInner_2_0, grammarAccess.getGeneralClauseAccess().getIsInnerInnerKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isInner", lv_isInner_2_0 != null, "inner");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2404:3: ( (lv_isOuter_3_0= 'outer' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMOloc.g:2405:4: (lv_isOuter_3_0= 'outer' )
                    {
                    // InternalMOloc.g:2405:4: (lv_isOuter_3_0= 'outer' )
                    // InternalMOloc.g:2406:5: lv_isOuter_3_0= 'outer'
                    {
                    lv_isOuter_3_0=(Token)match(input,52,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isOuter_3_0, grammarAccess.getGeneralClauseAccess().getIsOuterOuterKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isOuter", lv_isOuter_3_0 != null, "outer");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:2418:3: ( (lv_isReplaceable_4_0= 'replaceable' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMOloc.g:2419:4: (lv_isReplaceable_4_0= 'replaceable' )
                    {
                    // InternalMOloc.g:2419:4: (lv_isReplaceable_4_0= 'replaceable' )
                    // InternalMOloc.g:2420:5: lv_isReplaceable_4_0= 'replaceable'
                    {
                    lv_isReplaceable_4_0=(Token)match(input,53,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReplaceable_4_0, grammarAccess.getGeneralClauseAccess().getIsReplaceableReplaceableKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralClauseRule());
                      					}
                      					setWithLastConsumed(current, "isReplaceable", lv_isReplaceable_4_0 != null, "replaceable");
                      				
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
              			newCompositeNode(grammarAccess.getGeneralClauseAccess().getType_prefixParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_14);
            this_type_prefix_5=ruletype_prefix(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_prefix_5;
              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getGeneralClauseRule());
              			}
              			newCompositeNode(grammarAccess.getGeneralClauseAccess().getType_specifierParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_43);
            this_type_specifier_6=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_6;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2460:3: (this_array_subscripts_7= rulearray_subscripts[$current] )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMOloc.g:2461:4: this_array_subscripts_7= rulearray_subscripts[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getGeneralClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getGeneralClauseAccess().getArray_subscriptsParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_43);
                    this_array_subscripts_7=rulearray_subscripts(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_array_subscripts_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:2476:3: ( (lv_component_list_8_0= ruleComponent_declaration ) )
            // InternalMOloc.g:2477:4: (lv_component_list_8_0= ruleComponent_declaration )
            {
            // InternalMOloc.g:2477:4: (lv_component_list_8_0= ruleComponent_declaration )
            // InternalMOloc.g:2478:5: lv_component_list_8_0= ruleComponent_declaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGeneralClauseAccess().getComponent_listComponent_declarationParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_component_list_8_0=ruleComponent_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGeneralClauseRule());
              					}
              					add(
              						current,
              						"component_list",
              						lv_component_list_8_0,
              						"dut.control.moloc.MOloc.Component_declaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:2495:3: (otherlv_9= ',' ( (lv_component_list_10_0= ruleComponent_declaration ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==35) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMOloc.g:2496:4: otherlv_9= ',' ( (lv_component_list_10_0= ruleComponent_declaration ) )
            	    {
            	    otherlv_9=(Token)match(input,35,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getGeneralClauseAccess().getCommaKeyword_9_0());
            	      			
            	    }
            	    // InternalMOloc.g:2500:4: ( (lv_component_list_10_0= ruleComponent_declaration ) )
            	    // InternalMOloc.g:2501:5: (lv_component_list_10_0= ruleComponent_declaration )
            	    {
            	    // InternalMOloc.g:2501:5: (lv_component_list_10_0= ruleComponent_declaration )
            	    // InternalMOloc.g:2502:6: lv_component_list_10_0= ruleComponent_declaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGeneralClauseAccess().getComponent_listComponent_declarationParserRuleCall_9_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGeneralClauseAccess().getSemicolonKeyword_10());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleGeneralClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleGeneralClause"


    // $ANTLR start "entryRuleComponent_declaration"
    // InternalMOloc.g:2528:1: entryRuleComponent_declaration returns [EObject current=null] : iv_ruleComponent_declaration= ruleComponent_declaration EOF ;
    public final EObject entryRuleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int entryRuleComponent_declaration_StartIndex = input.index();
        EObject iv_ruleComponent_declaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // InternalMOloc.g:2528:62: (iv_ruleComponent_declaration= ruleComponent_declaration EOF )
            // InternalMOloc.g:2529:2: iv_ruleComponent_declaration= ruleComponent_declaration EOF
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
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_declaration"


    // $ANTLR start "ruleComponent_declaration"
    // InternalMOloc.g:2535:1: ruleComponent_declaration returns [EObject current=null] : (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) ;
    public final EObject ruleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int ruleComponent_declaration_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_declaration_0 = null;

        AntlrDatatypeRuleToken lv_condition_attribute_2_0 = null;

        EObject this_description_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // InternalMOloc.g:2541:2: ( (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) )
            // InternalMOloc.g:2542:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            {
            // InternalMOloc.g:2542:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            // InternalMOloc.g:2543:3: this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current]
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
            pushFollow(FOLLOW_45);
            this_declaration_0=ruledeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_declaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2557:3: (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMOloc.g:2558:4: otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getComponent_declarationAccess().getIfKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:2562:4: ( (lv_condition_attribute_2_0= ruleExpression ) )
                    // InternalMOloc.g:2563:5: (lv_condition_attribute_2_0= ruleExpression )
                    {
                    // InternalMOloc.g:2563:5: (lv_condition_attribute_2_0= ruleExpression )
                    // InternalMOloc.g:2564:6: lv_condition_attribute_2_0= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_declaration"


    // $ANTLR start "entryRuleExternalElement"
    // InternalMOloc.g:2600:1: entryRuleExternalElement returns [EObject current=null] : iv_ruleExternalElement= ruleExternalElement EOF ;
    public final EObject entryRuleExternalElement() throws RecognitionException {
        EObject current = null;
        int entryRuleExternalElement_StartIndex = input.index();
        EObject iv_ruleExternalElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // InternalMOloc.g:2600:56: (iv_ruleExternalElement= ruleExternalElement EOF )
            // InternalMOloc.g:2601:2: iv_ruleExternalElement= ruleExternalElement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalElement"


    // $ANTLR start "ruleExternalElement"
    // InternalMOloc.g:2607:1: ruleExternalElement returns [EObject current=null] : ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? ( ( (lv_isAnnotation_4_0= 'annotation' ) ) this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' ) ;
    public final EObject ruleExternalElement() throws RecognitionException {
        EObject current = null;
        int ruleExternalElement_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_language_specification_2_0=null;
        Token lv_isAnnotation_4_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ref_3_0 = null;

        EObject this_class_modification_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // InternalMOloc.g:2613:2: ( ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? ( ( (lv_isAnnotation_4_0= 'annotation' ) ) this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' ) )
            // InternalMOloc.g:2614:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? ( ( (lv_isAnnotation_4_0= 'annotation' ) ) this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' )
            {
            // InternalMOloc.g:2614:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? ( ( (lv_isAnnotation_4_0= 'annotation' ) ) this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';' )
            // InternalMOloc.g:2615:3: () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( (lv_ref_3_0= ruleComponent_reference ) )? ( ( (lv_isAnnotation_4_0= 'annotation' ) ) this_class_modification_5= ruleclass_modification[$current] )? otherlv_6= ';'
            {
            // InternalMOloc.g:2615:3: ()
            // InternalMOloc.g:2616:4: 
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

            otherlv_1=(Token)match(input,55,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExternalElementAccess().getExternalKeyword_1());
              		
            }
            // InternalMOloc.g:2629:3: ( (lv_language_specification_2_0= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMOloc.g:2630:4: (lv_language_specification_2_0= RULE_STRING )
                    {
                    // InternalMOloc.g:2630:4: (lv_language_specification_2_0= RULE_STRING )
                    // InternalMOloc.g:2631:5: lv_language_specification_2_0= RULE_STRING
                    {
                    lv_language_specification_2_0=(Token)match(input,RULE_STRING,FOLLOW_47); if (state.failed) return current;
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

            // InternalMOloc.g:2647:3: ( (lv_ref_3_0= ruleComponent_reference ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_IDENT||LA58_0==37) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMOloc.g:2648:4: (lv_ref_3_0= ruleComponent_reference )
                    {
                    // InternalMOloc.g:2648:4: (lv_ref_3_0= ruleComponent_reference )
                    // InternalMOloc.g:2649:5: lv_ref_3_0= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExternalElementAccess().getRefComponent_referenceParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
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

            // InternalMOloc.g:2666:3: ( ( (lv_isAnnotation_4_0= 'annotation' ) ) this_class_modification_5= ruleclass_modification[$current] )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==38) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMOloc.g:2667:4: ( (lv_isAnnotation_4_0= 'annotation' ) ) this_class_modification_5= ruleclass_modification[$current]
                    {
                    // InternalMOloc.g:2667:4: ( (lv_isAnnotation_4_0= 'annotation' ) )
                    // InternalMOloc.g:2668:5: (lv_isAnnotation_4_0= 'annotation' )
                    {
                    // InternalMOloc.g:2668:5: (lv_isAnnotation_4_0= 'annotation' )
                    // InternalMOloc.g:2669:6: lv_isAnnotation_4_0= 'annotation'
                    {
                    lv_isAnnotation_4_0=(Token)match(input,38,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isAnnotation_4_0, grammarAccess.getExternalElementAccess().getIsAnnotationAnnotationKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExternalElementRule());
                      						}
                      						setWithLastConsumed(current, "isAnnotation", lv_isAnnotation_4_0 != null, "annotation");
                      					
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExternalElement"


    // $ANTLR start "entryRuleNULLElement"
    // InternalMOloc.g:2704:1: entryRuleNULLElement returns [EObject current=null] : iv_ruleNULLElement= ruleNULLElement EOF ;
    public final EObject entryRuleNULLElement() throws RecognitionException {
        EObject current = null;
        int entryRuleNULLElement_StartIndex = input.index();
        EObject iv_ruleNULLElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // InternalMOloc.g:2704:52: (iv_ruleNULLElement= ruleNULLElement EOF )
            // InternalMOloc.g:2705:2: iv_ruleNULLElement= ruleNULLElement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleNULLElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNULLElement"


    // $ANTLR start "ruleNULLElement"
    // InternalMOloc.g:2711:1: ruleNULLElement returns [EObject current=null] : (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) ) ;
    public final EObject ruleNULLElement() throws RecognitionException {
        EObject current = null;
        int ruleNULLElement_StartIndex = input.index();
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nullname_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // InternalMOloc.g:2717:2: ( (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) ) )
            // InternalMOloc.g:2718:2: (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) )
            {
            // InternalMOloc.g:2718:2: (otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) ) )
            // InternalMOloc.g:2719:3: otherlv_0= 'nullElement' ( (lv_nullname_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNULLElementAccess().getNullElementKeyword_0());
              		
            }
            // InternalMOloc.g:2723:3: ( (lv_nullname_1_0= ruleName ) )
            // InternalMOloc.g:2724:4: (lv_nullname_1_0= ruleName )
            {
            // InternalMOloc.g:2724:4: (lv_nullname_1_0= ruleName )
            // InternalMOloc.g:2725:5: lv_nullname_1_0= ruleName
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleNULLElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNULLElement"


    // $ANTLR start "entryRuleExpression"
    // InternalMOloc.g:2746:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;
        int entryRuleExpression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // InternalMOloc.g:2746:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMOloc.g:2747:2: iv_ruleExpression= ruleExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMOloc.g:2753:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // InternalMOloc.g:2759:2: ( (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) )
            // InternalMOloc.g:2760:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            {
            // InternalMOloc.g:2760:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_IDENT && LA61_0<=RULE_TRUE_FALSE)||LA61_0==28||LA61_0==31||(LA61_0>=36 && LA61_0<=37)||LA61_0==41||LA61_0==49||LA61_0==62||(LA61_0>=69 && LA61_0<=71)) ) {
                alt61=1;
            }
            else if ( (LA61_0==54) ) {
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
                    // InternalMOloc.g:2761:3: this_Simple_expression_0= ruleSimple_expression
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
                    // InternalMOloc.g:2772:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    {
                    // InternalMOloc.g:2772:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    // InternalMOloc.g:2773:4: kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression
                    {
                    kw=(Token)match(input,54,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getIfKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,57,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_49);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:2803:4: (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==58) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalMOloc.g:2804:5: kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression
                    	    {
                    	    kw=(Token)match(input,58,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getExpressionAccess().getElseifKeyword_1_4_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_4_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_48);
                    	    this_Expression_6=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_Expression_6);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }
                    	    kw=(Token)match(input,57,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_4_2());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_4_3());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_49);
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
                    	    break loop60;
                        }
                    } while (true);

                    kw=(Token)match(input,59,FOLLOW_32); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSimple_expression"
    // InternalMOloc.g:2855:1: entryRuleSimple_expression returns [String current=null] : iv_ruleSimple_expression= ruleSimple_expression EOF ;
    public final String entryRuleSimple_expression() throws RecognitionException {
        String current = null;
        int entryRuleSimple_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSimple_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // InternalMOloc.g:2855:57: (iv_ruleSimple_expression= ruleSimple_expression EOF )
            // InternalMOloc.g:2856:2: iv_ruleSimple_expression= ruleSimple_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSimple_expression"


    // $ANTLR start "ruleSimple_expression"
    // InternalMOloc.g:2862:1: ruleSimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? ) ;
    public final AntlrDatatypeRuleToken ruleSimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSimple_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_expression_0 = null;

        AntlrDatatypeRuleToken this_Logical_expression_2 = null;

        AntlrDatatypeRuleToken this_Logical_expression_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // InternalMOloc.g:2868:2: ( (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? ) )
            // InternalMOloc.g:2869:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? )
            {
            // InternalMOloc.g:2869:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )? )
            // InternalMOloc.g:2870:3: this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_Logical_expression_0=ruleLogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2880:3: (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==32) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMOloc.g:2881:4: kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )
                    {
                    kw=(Token)match(input,32,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_52);
                    this_Logical_expression_2=ruleLogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Logical_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:2896:4: (kw= ':' this_Logical_expression_4= ruleLogical_expression )
                    // InternalMOloc.g:2897:5: kw= ':' this_Logical_expression_4= ruleLogical_expression
                    {
                    kw=(Token)match(input,32,FOLLOW_51); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSimple_expression"


    // $ANTLR start "entryRuleLogical_expression"
    // InternalMOloc.g:2918:1: entryRuleLogical_expression returns [String current=null] : iv_ruleLogical_expression= ruleLogical_expression EOF ;
    public final String entryRuleLogical_expression() throws RecognitionException {
        String current = null;
        int entryRuleLogical_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // InternalMOloc.g:2918:58: (iv_ruleLogical_expression= ruleLogical_expression EOF )
            // InternalMOloc.g:2919:2: iv_ruleLogical_expression= ruleLogical_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_expression"


    // $ANTLR start "ruleLogical_expression"
    // InternalMOloc.g:2925:1: ruleLogical_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_term_0 = null;

        AntlrDatatypeRuleToken this_Logical_term_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // InternalMOloc.g:2931:2: ( (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) )
            // InternalMOloc.g:2932:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            {
            // InternalMOloc.g:2932:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            // InternalMOloc.g:2933:3: this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_Logical_term_0=ruleLogical_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_term_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2943:3: (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==60) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMOloc.g:2944:4: kw= 'or' this_Logical_term_2= ruleLogical_term
            	    {
            	    kw=(Token)match(input,60,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_expressionAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_53);
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
            	    break loop63;
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_expression"


    // $ANTLR start "entryRuleLogical_term"
    // InternalMOloc.g:2964:1: entryRuleLogical_term returns [String current=null] : iv_ruleLogical_term= ruleLogical_term EOF ;
    public final String entryRuleLogical_term() throws RecognitionException {
        String current = null;
        int entryRuleLogical_term_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_term = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // InternalMOloc.g:2964:52: (iv_ruleLogical_term= ruleLogical_term EOF )
            // InternalMOloc.g:2965:2: iv_ruleLogical_term= ruleLogical_term EOF
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
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_term"


    // $ANTLR start "ruleLogical_term"
    // InternalMOloc.g:2971:1: ruleLogical_term returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_term() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_term_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_factor_0 = null;

        AntlrDatatypeRuleToken this_Logical_factor_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // InternalMOloc.g:2977:2: ( (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) )
            // InternalMOloc.g:2978:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            {
            // InternalMOloc.g:2978:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            // InternalMOloc.g:2979:3: this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_Logical_factor_0=ruleLogical_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2989:3: (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==61) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalMOloc.g:2990:4: kw= 'and' this_Logical_factor_2= ruleLogical_factor
            	    {
            	    kw=(Token)match(input,61,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_termAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_54);
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
            	    break loop64;
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_term"


    // $ANTLR start "entryRuleLogical_factor"
    // InternalMOloc.g:3010:1: entryRuleLogical_factor returns [String current=null] : iv_ruleLogical_factor= ruleLogical_factor EOF ;
    public final String entryRuleLogical_factor() throws RecognitionException {
        String current = null;
        int entryRuleLogical_factor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_factor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // InternalMOloc.g:3010:54: (iv_ruleLogical_factor= ruleLogical_factor EOF )
            // InternalMOloc.g:3011:2: iv_ruleLogical_factor= ruleLogical_factor EOF
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
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_factor"


    // $ANTLR start "ruleLogical_factor"
    // InternalMOloc.g:3017:1: ruleLogical_factor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' )? this_Relation_1= ruleRelation ) ;
    public final AntlrDatatypeRuleToken ruleLogical_factor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_factor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Relation_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // InternalMOloc.g:3023:2: ( ( (kw= 'not' )? this_Relation_1= ruleRelation ) )
            // InternalMOloc.g:3024:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            {
            // InternalMOloc.g:3024:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            // InternalMOloc.g:3025:3: (kw= 'not' )? this_Relation_1= ruleRelation
            {
            // InternalMOloc.g:3025:3: (kw= 'not' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMOloc.g:3026:4: kw= 'not'
                    {
                    kw=(Token)match(input,62,FOLLOW_51); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_factor"


    // $ANTLR start "entryRuleRelation"
    // InternalMOloc.g:3046:1: entryRuleRelation returns [String current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final String entryRuleRelation() throws RecognitionException {
        String current = null;
        int entryRuleRelation_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleRelation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // InternalMOloc.g:3046:48: (iv_ruleRelation= ruleRelation EOF )
            // InternalMOloc.g:3047:2: iv_ruleRelation= ruleRelation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMOloc.g:3053:1: ruleRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleRelation_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Arithmetic_expression_0 = null;

        AntlrDatatypeRuleToken this_Arithmetic_expression_7 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // InternalMOloc.g:3059:2: ( (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) )
            // InternalMOloc.g:3060:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            {
            // InternalMOloc.g:3060:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            // InternalMOloc.g:3061:3: this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationAccess().getArithmetic_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_Arithmetic_expression_0=ruleArithmetic_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Arithmetic_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3071:3: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=63 && LA67_0<=68)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMOloc.g:3072:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression
                    {
                    // InternalMOloc.g:3072:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
                    int alt66=6;
                    switch ( input.LA(1) ) {
                    case 63:
                        {
                        alt66=1;
                        }
                        break;
                    case 64:
                        {
                        alt66=2;
                        }
                        break;
                    case 65:
                        {
                        alt66=3;
                        }
                        break;
                    case 66:
                        {
                        alt66=4;
                        }
                        break;
                    case 67:
                        {
                        alt66=5;
                        }
                        break;
                    case 68:
                        {
                        alt66=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // InternalMOloc.g:3073:5: kw= '<'
                            {
                            kw=(Token)match(input,63,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:3079:5: kw= '<='
                            {
                            kw=(Token)match(input,64,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMOloc.g:3085:5: kw= '>'
                            {
                            kw=(Token)match(input,65,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalMOloc.g:3091:5: kw= '>='
                            {
                            kw=(Token)match(input,66,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalMOloc.g:3097:5: kw= '=='
                            {
                            kw=(Token)match(input,67,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalMOloc.g:3103:5: kw= '<>'
                            {
                            kw=(Token)match(input,68,FOLLOW_51); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleArithmetic_expression"
    // InternalMOloc.g:3124:1: entryRuleArithmetic_expression returns [String current=null] : iv_ruleArithmetic_expression= ruleArithmetic_expression EOF ;
    public final String entryRuleArithmetic_expression() throws RecognitionException {
        String current = null;
        int entryRuleArithmetic_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArithmetic_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // InternalMOloc.g:3124:61: (iv_ruleArithmetic_expression= ruleArithmetic_expression EOF )
            // InternalMOloc.g:3125:2: iv_ruleArithmetic_expression= ruleArithmetic_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmetic_expression"


    // $ANTLR start "ruleArithmetic_expression"
    // InternalMOloc.g:3131:1: ruleArithmetic_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) ;
    public final AntlrDatatypeRuleToken ruleArithmetic_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArithmetic_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Term_4 = null;

        AntlrDatatypeRuleToken this_Term_9 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // InternalMOloc.g:3137:2: ( ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) )
            // InternalMOloc.g:3138:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            {
            // InternalMOloc.g:3138:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            // InternalMOloc.g:3139:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            {
            // InternalMOloc.g:3139:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )?
            int alt68=5;
            switch ( input.LA(1) ) {
                case 36:
                    {
                    alt68=1;
                    }
                    break;
                case 69:
                    {
                    alt68=2;
                    }
                    break;
                case 70:
                    {
                    alt68=3;
                    }
                    break;
                case 71:
                    {
                    alt68=4;
                    }
                    break;
            }

            switch (alt68) {
                case 1 :
                    // InternalMOloc.g:3140:4: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:3146:4: kw= '-'
                    {
                    kw=(Token)match(input,69,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:3152:4: kw= '.+'
                    {
                    kw=(Token)match(input,70,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:3158:4: kw= '.-'
                    {
                    kw=(Token)match(input,71,FOLLOW_51); if (state.failed) return current;
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
            pushFollow(FOLLOW_56);
            this_Term_4=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Term_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3174:3: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==36||(LA70_0>=69 && LA70_0<=71)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalMOloc.g:3175:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm
            	    {
            	    // InternalMOloc.g:3175:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            	    int alt69=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt69=1;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt69=2;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt69=3;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt69=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 69, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt69) {
            	        case 1 :
            	            // InternalMOloc.g:3176:5: kw= '+'
            	            {
            	            kw=(Token)match(input,36,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_2_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:3182:5: kw= '-'
            	            {
            	            kw=(Token)match(input,69,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_2_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:3188:5: kw= '.+'
            	            {
            	            kw=(Token)match(input,70,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_2_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:3194:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,71,FOLLOW_51); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_56);
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
            	    break loop70;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithmetic_expression"


    // $ANTLR start "entryRuleTerm"
    // InternalMOloc.g:3215:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;
        int entryRuleTerm_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // InternalMOloc.g:3215:44: (iv_ruleTerm= ruleTerm EOF )
            // InternalMOloc.g:3216:2: iv_ruleTerm= ruleTerm EOF
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
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMOloc.g:3222:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTerm_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_0 = null;

        AntlrDatatypeRuleToken this_Factor_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // InternalMOloc.g:3228:2: ( (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) )
            // InternalMOloc.g:3229:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            {
            // InternalMOloc.g:3229:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            // InternalMOloc.g:3230:3: this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_Factor_0=ruleFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3240:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            loop72:
            do {
                int alt72=2;
                alt72 = dfa72.predict(input);
                switch (alt72) {
            	case 1 :
            	    // InternalMOloc.g:3241:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
            	    {
            	    // InternalMOloc.g:3241:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
            	    int alt71=4;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt71=1;
            	        }
            	        break;
            	    case 72:
            	        {
            	        alt71=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt71=3;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt71=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt71) {
            	        case 1 :
            	            // InternalMOloc.g:3242:5: kw= '*'
            	            {
            	            kw=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:3248:5: kw= '/'
            	            {
            	            kw=(Token)match(input,72,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:3254:5: kw= '.*'
            	            {
            	            kw=(Token)match(input,47,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getFullStopAsteriskKeyword_1_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:3260:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,71,FOLLOW_51); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_57);
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
            	    break loop72;
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMOloc.g:3281:1: entryRuleFactor returns [String current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final String entryRuleFactor() throws RecognitionException {
        String current = null;
        int entryRuleFactor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFactor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // InternalMOloc.g:3281:46: (iv_ruleFactor= ruleFactor EOF )
            // InternalMOloc.g:3282:2: iv_ruleFactor= ruleFactor EOF
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
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMOloc.g:3288:1: ruleFactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) ;
    public final AntlrDatatypeRuleToken ruleFactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFactor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Primary_0 = null;

        AntlrDatatypeRuleToken this_Primary_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // InternalMOloc.g:3294:2: ( (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) )
            // InternalMOloc.g:3295:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            {
            // InternalMOloc.g:3295:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            // InternalMOloc.g:3296:3: this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Primary_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3306:3: ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=73 && LA74_0<=74)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMOloc.g:3307:4: (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary
                    {
                    // InternalMOloc.g:3307:4: (kw= '^' | kw= '.^' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==73) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==74) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalMOloc.g:3308:5: kw= '^'
                            {
                            kw=(Token)match(input,73,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFactorAccess().getCircumflexAccentKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:3314:5: kw= '.^'
                            {
                            kw=(Token)match(input,74,FOLLOW_51); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMOloc.g:3335:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;
        int entryRulePrimary_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // InternalMOloc.g:3335:47: (iv_rulePrimary= rulePrimary EOF )
            // InternalMOloc.g:3336:2: iv_rulePrimary= rulePrimary EOF
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
            if ( state.backtracking>0 ) { memoize(input, 73, entryRulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMOloc.g:3342:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | this_Component_reference_3= ruleComponent_reference | (kw= '(' (this_Expression_5= ruleExpression )? (kw= ',' this_Expression_7= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_10= ruleExpression (kw= ',' this_Expression_12= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_15= ruleArrayArguments kw= '}' ) | kw= 'end' ) ;
    public final AntlrDatatypeRuleToken rulePrimary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int rulePrimary_StartIndex = input.index();
        Token this_UNSIGNED_NUMBER_0=null;
        Token this_STRING_1=null;
        Token this_TRUE_FALSE_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Component_reference_3 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;

        AntlrDatatypeRuleToken this_Expression_7 = null;

        AntlrDatatypeRuleToken this_Expression_10 = null;

        AntlrDatatypeRuleToken this_Expression_12 = null;

        AntlrDatatypeRuleToken this_ArrayArguments_15 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // InternalMOloc.g:3348:2: ( (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | this_Component_reference_3= ruleComponent_reference | (kw= '(' (this_Expression_5= ruleExpression )? (kw= ',' this_Expression_7= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_10= ruleExpression (kw= ',' this_Expression_12= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_15= ruleArrayArguments kw= '}' ) | kw= 'end' ) )
            // InternalMOloc.g:3349:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | this_Component_reference_3= ruleComponent_reference | (kw= '(' (this_Expression_5= ruleExpression )? (kw= ',' this_Expression_7= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_10= ruleExpression (kw= ',' this_Expression_12= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_15= ruleArrayArguments kw= '}' ) | kw= 'end' )
            {
            // InternalMOloc.g:3349:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | this_Component_reference_3= ruleComponent_reference | (kw= '(' (this_Expression_5= ruleExpression )? (kw= ',' this_Expression_7= ruleExpression ) kw= ')' ) | (kw= '[' this_Expression_10= ruleExpression (kw= ',' this_Expression_12= ruleExpression ) kw= ']' ) | (kw= '{' this_ArrayArguments_15= ruleArrayArguments kw= '}' ) | kw= 'end' )
            int alt76=8;
            switch ( input.LA(1) ) {
            case RULE_UNSIGNED_NUMBER:
                {
                alt76=1;
                }
                break;
            case RULE_STRING:
                {
                alt76=2;
                }
                break;
            case RULE_TRUE_FALSE:
                {
                alt76=3;
                }
                break;
            case RULE_IDENT:
            case 37:
                {
                alt76=4;
                }
                break;
            case 31:
                {
                alt76=5;
                }
                break;
            case 41:
                {
                alt76=6;
                }
                break;
            case 49:
                {
                alt76=7;
                }
                break;
            case 28:
                {
                alt76=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalMOloc.g:3350:3: this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER
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
                    // InternalMOloc.g:3358:3: this_STRING_1= RULE_STRING
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
                    // InternalMOloc.g:3366:3: this_TRUE_FALSE_2= RULE_TRUE_FALSE
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
                    // InternalMOloc.g:3374:3: this_Component_reference_3= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getComponent_referenceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
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
                case 5 :
                    // InternalMOloc.g:3385:3: (kw= '(' (this_Expression_5= ruleExpression )? (kw= ',' this_Expression_7= ruleExpression ) kw= ')' )
                    {
                    // InternalMOloc.g:3385:3: (kw= '(' (this_Expression_5= ruleExpression )? (kw= ',' this_Expression_7= ruleExpression ) kw= ')' )
                    // InternalMOloc.g:3386:4: kw= '(' (this_Expression_5= ruleExpression )? (kw= ',' this_Expression_7= ruleExpression ) kw= ')'
                    {
                    kw=(Token)match(input,31,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalMOloc.g:3391:4: (this_Expression_5= ruleExpression )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( ((LA75_0>=RULE_IDENT && LA75_0<=RULE_TRUE_FALSE)||LA75_0==28||LA75_0==31||(LA75_0>=36 && LA75_0<=37)||LA75_0==41||LA75_0==49||LA75_0==54||LA75_0==62||(LA75_0>=69 && LA75_0<=71)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalMOloc.g:3392:5: this_Expression_5= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_4_1());
                              				
                            }
                            pushFollow(FOLLOW_20);
                            this_Expression_5=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Expression_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    // InternalMOloc.g:3403:4: (kw= ',' this_Expression_7= ruleExpression )
                    // InternalMOloc.g:3404:5: kw= ',' this_Expression_7= ruleExpression
                    {
                    kw=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getPrimaryAccess().getCommaKeyword_4_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_4_2_1());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    this_Expression_7=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_7);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMOloc.g:3427:3: (kw= '[' this_Expression_10= ruleExpression (kw= ',' this_Expression_12= ruleExpression ) kw= ']' )
                    {
                    // InternalMOloc.g:3427:3: (kw= '[' this_Expression_10= ruleExpression (kw= ',' this_Expression_12= ruleExpression ) kw= ']' )
                    // InternalMOloc.g:3428:4: kw= '[' this_Expression_10= ruleExpression (kw= ',' this_Expression_12= ruleExpression ) kw= ']'
                    {
                    kw=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_5_0());
                      			
                    }
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
                    // InternalMOloc.g:3443:4: (kw= ',' this_Expression_12= ruleExpression )
                    // InternalMOloc.g:3444:5: kw= ',' this_Expression_12= ruleExpression
                    {
                    kw=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getPrimaryAccess().getCommaKeyword_5_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_5_2_1());
                      				
                    }
                    pushFollow(FOLLOW_60);
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

                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMOloc.g:3467:3: (kw= '{' this_ArrayArguments_15= ruleArrayArguments kw= '}' )
                    {
                    // InternalMOloc.g:3467:3: (kw= '{' this_ArrayArguments_15= ruleArrayArguments kw= '}' )
                    // InternalMOloc.g:3468:4: kw= '{' this_ArrayArguments_15= ruleArrayArguments kw= '}'
                    {
                    kw=(Token)match(input,49,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftCurlyBracketKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getArrayArgumentsParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_61);
                    this_ArrayArguments_15=ruleArrayArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayArguments_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightCurlyBracketKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMOloc.g:3490:3: kw= 'end'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryAccess().getEndKeyword_7());
                      		
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
            if ( state.backtracking>0 ) { memoize(input, 74, rulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleArrayArguments"
    // InternalMOloc.g:3499:1: entryRuleArrayArguments returns [String current=null] : iv_ruleArrayArguments= ruleArrayArguments EOF ;
    public final String entryRuleArrayArguments() throws RecognitionException {
        String current = null;
        int entryRuleArrayArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // InternalMOloc.g:3499:54: (iv_ruleArrayArguments= ruleArrayArguments EOF )
            // InternalMOloc.g:3500:2: iv_ruleArrayArguments= ruleArrayArguments EOF
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
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArguments"


    // $ANTLR start "ruleArrayArguments"
    // InternalMOloc.g:3506:1: ruleArrayArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_ForIndices_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // InternalMOloc.g:3512:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) )
            // InternalMOloc.g:3513:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            {
            // InternalMOloc.g:3513:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            // InternalMOloc.g:3514:3: this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayArgumentsAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3524:3: ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==35) ) {
                alt77=1;
            }
            else if ( (LA77_0==75) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // InternalMOloc.g:3525:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    {
                    // InternalMOloc.g:3525:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    // InternalMOloc.g:3526:5: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
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
                    // InternalMOloc.g:3543:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    {
                    // InternalMOloc.g:3543:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    // InternalMOloc.g:3544:5: kw= 'for' this_ForIndices_4= ruleForIndices
                    {
                    kw=(Token)match(input,75,FOLLOW_3); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArguments"


    // $ANTLR start "entryRuleArrayArgumentsNonFirst"
    // InternalMOloc.g:3565:1: entryRuleArrayArgumentsNonFirst returns [String current=null] : iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF ;
    public final String entryRuleArrayArgumentsNonFirst() throws RecognitionException {
        String current = null;
        int entryRuleArrayArgumentsNonFirst_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArgumentsNonFirst = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // InternalMOloc.g:3565:62: (iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF )
            // InternalMOloc.g:3566:2: iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF
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
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArgumentsNonFirst"


    // $ANTLR start "ruleArrayArgumentsNonFirst"
    // InternalMOloc.g:3572:1: ruleArrayArgumentsNonFirst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArgumentsNonFirst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArgumentsNonFirst_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // InternalMOloc.g:3578:2: ( (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) )
            // InternalMOloc.g:3579:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            {
            // InternalMOloc.g:3579:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            // InternalMOloc.g:3580:3: this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
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
            // InternalMOloc.g:3590:3: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==35) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMOloc.g:3591:4: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArgumentsNonFirst"


    // $ANTLR start "entryRuleForIndices"
    // InternalMOloc.g:3611:1: entryRuleForIndices returns [String current=null] : iv_ruleForIndices= ruleForIndices EOF ;
    public final String entryRuleForIndices() throws RecognitionException {
        String current = null;
        int entryRuleForIndices_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndices = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // InternalMOloc.g:3611:50: (iv_ruleForIndices= ruleForIndices EOF )
            // InternalMOloc.g:3612:2: iv_ruleForIndices= ruleForIndices EOF
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
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndices"


    // $ANTLR start "ruleForIndices"
    // InternalMOloc.g:3618:1: ruleForIndices returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) ;
    public final AntlrDatatypeRuleToken ruleForIndices() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndices_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ForIndex_0 = null;

        AntlrDatatypeRuleToken this_ForIndex_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // InternalMOloc.g:3624:2: ( (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) )
            // InternalMOloc.g:3625:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            {
            // InternalMOloc.g:3625:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            // InternalMOloc.g:3626:3: this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )*
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
            // InternalMOloc.g:3636:3: (kw= ',' this_ForIndex_2= ruleForIndex )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==35) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMOloc.g:3637:4: kw= ',' this_ForIndex_2= ruleForIndex
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndices"


    // $ANTLR start "entryRuleForIndex"
    // InternalMOloc.g:3657:1: entryRuleForIndex returns [String current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final String entryRuleForIndex() throws RecognitionException {
        String current = null;
        int entryRuleForIndex_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndex = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // InternalMOloc.g:3657:48: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalMOloc.g:3658:2: iv_ruleForIndex= ruleForIndex EOF
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
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndex"


    // $ANTLR start "ruleForIndex"
    // InternalMOloc.g:3664:1: ruleForIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleForIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndex_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // InternalMOloc.g:3670:2: ( (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) )
            // InternalMOloc.g:3671:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            {
            // InternalMOloc.g:3671:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            // InternalMOloc.g:3672:3: this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )?
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getForIndexAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:3679:3: (kw= 'in' this_Expression_2= ruleExpression )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==76) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMOloc.g:3680:4: kw= 'in' this_Expression_2= ruleExpression
                    {
                    kw=(Token)match(input,76,FOLLOW_32); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndex"


    // $ANTLR start "entryRuleComponent_reference"
    // InternalMOloc.g:3700:1: entryRuleComponent_reference returns [String current=null] : iv_ruleComponent_reference= ruleComponent_reference EOF ;
    public final String entryRuleComponent_reference() throws RecognitionException {
        String current = null;
        int entryRuleComponent_reference_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleComponent_reference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // InternalMOloc.g:3700:59: (iv_ruleComponent_reference= ruleComponent_reference EOF )
            // InternalMOloc.g:3701:2: iv_ruleComponent_reference= ruleComponent_reference EOF
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
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_reference"


    // $ANTLR start "ruleComponent_reference"
    // InternalMOloc.g:3707:1: ruleComponent_reference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // InternalMOloc.g:3713:2: ( ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* ) )
            // InternalMOloc.g:3714:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* )
            {
            // InternalMOloc.g:3714:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )* )
            // InternalMOloc.g:3715:3: (kw= '.' )? this_IDENT_1= RULE_IDENT (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )? (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )*
            {
            // InternalMOloc.g:3715:3: (kw= '.' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==37) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMOloc.g:3716:4: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_1, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_1());
              		
            }
            // InternalMOloc.g:3729:3: (kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==41) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMOloc.g:3730:4: kw= '[' this_Subscript_3= ruleSubscript (kw= ',' this_Subscript_5= ruleSubscript )* kw= ']'
                    {
                    kw=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_33);
                    this_Subscript_3=ruleSubscript();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Subscript_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:3745:4: (kw= ',' this_Subscript_5= ruleSubscript )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==35) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalMOloc.g:3746:5: kw= ',' this_Subscript_5= ruleSubscript
                    	    {
                    	    kw=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_2_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop82;
                        }
                    } while (true);

                    kw=(Token)match(input,42,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:3768:3: (kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )? )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==37) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalMOloc.g:3769:4: kw= '.' this_IDENT_8= RULE_IDENT (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )?
            	    {
            	    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_3_0());
            	      			
            	    }
            	    this_IDENT_8=(Token)match(input,RULE_IDENT,FOLLOW_64); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_8);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_8, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_3_1());
            	      			
            	    }
            	    // InternalMOloc.g:3781:4: (kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']' )?
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==41) ) {
            	        alt85=1;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // InternalMOloc.g:3782:5: kw= '[' this_Subscript_10= ruleSubscript (kw= ',' this_Subscript_12= ruleSubscript )* kw= ']'
            	            {
            	            kw=(Token)match(input,41,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getLeftSquareBracketKeyword_3_2_0());
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_3_2_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_33);
            	            this_Subscript_10=ruleSubscript();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_Subscript_10);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }
            	            // InternalMOloc.g:3797:5: (kw= ',' this_Subscript_12= ruleSubscript )*
            	            loop84:
            	            do {
            	                int alt84=2;
            	                int LA84_0 = input.LA(1);

            	                if ( (LA84_0==35) ) {
            	                    alt84=1;
            	                }


            	                switch (alt84) {
            	            	case 1 :
            	            	    // InternalMOloc.g:3798:6: kw= ',' this_Subscript_12= ruleSubscript
            	            	    {
            	            	    kw=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      						current.merge(kw);
            	            	      						newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getCommaKeyword_3_2_2_0());
            	            	      					
            	            	    }
            	            	    if ( state.backtracking==0 ) {

            	            	      						newCompositeNode(grammarAccess.getComponent_referenceAccess().getSubscriptParserRuleCall_3_2_2_1());
            	            	      					
            	            	    }
            	            	    pushFollow(FOLLOW_33);
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
            	            	    break loop84;
            	                }
            	            } while (true);

            	            kw=(Token)match(input,42,FOLLOW_65); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_reference"


    // $ANTLR start "entryRuleName"
    // InternalMOloc.g:3825:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;
        int entryRuleName_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // InternalMOloc.g:3825:44: (iv_ruleName= ruleName EOF )
            // InternalMOloc.g:3826:2: iv_ruleName= ruleName EOF
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
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMOloc.g:3832:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleName_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        Token this_IDENT_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // InternalMOloc.g:3838:2: ( (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) )
            // InternalMOloc.g:3839:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            {
            // InternalMOloc.g:3839:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            // InternalMOloc.g:3840:3: this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )*
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:3847:3: (kw= '.' this_IDENT_2= RULE_IDENT )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==37) ) {
                    int LA87_2 = input.LA(2);

                    if ( (LA87_2==RULE_IDENT) ) {
                        alt87=1;
                    }


                }


                switch (alt87) {
            	case 1 :
            	    // InternalMOloc.g:3848:4: kw= '.' this_IDENT_2= RULE_IDENT
            	    {
            	    kw=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_2, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop87;
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleClassType"
    // InternalMOloc.g:3865:1: ruleClassType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // InternalMOloc.g:3871:2: ( ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) )
            // InternalMOloc.g:3872:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            {
            // InternalMOloc.g:3872:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            int alt88=9;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt88=1;
                }
                break;
            case 78:
                {
                alt88=2;
                }
                break;
            case 79:
                {
                alt88=3;
                }
                break;
            case 80:
                {
                alt88=4;
                }
                break;
            case 81:
                {
                alt88=5;
                }
                break;
            case 82:
                {
                alt88=6;
                }
                break;
            case 83:
                {
                alt88=7;
                }
                break;
            case 84:
                {
                alt88=8;
                }
                break;
            case 85:
                {
                alt88=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalMOloc.g:3873:3: (enumLiteral_0= 'NULLClassType' )
                    {
                    // InternalMOloc.g:3873:3: (enumLiteral_0= 'NULLClassType' )
                    // InternalMOloc.g:3874:4: enumLiteral_0= 'NULLClassType'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getClassTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:3881:3: (enumLiteral_1= 'class' )
                    {
                    // InternalMOloc.g:3881:3: (enumLiteral_1= 'class' )
                    // InternalMOloc.g:3882:4: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getClassTypeAccess().getClassEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:3889:3: (enumLiteral_2= 'model' )
                    {
                    // InternalMOloc.g:3889:3: (enumLiteral_2= 'model' )
                    // InternalMOloc.g:3890:4: enumLiteral_2= 'model'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getModelEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getClassTypeAccess().getModelEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMOloc.g:3897:3: (enumLiteral_3= 'record' )
                    {
                    // InternalMOloc.g:3897:3: (enumLiteral_3= 'record' )
                    // InternalMOloc.g:3898:4: enumLiteral_3= 'record'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getRecordEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getClassTypeAccess().getRecordEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMOloc.g:3905:3: (enumLiteral_4= 'block' )
                    {
                    // InternalMOloc.g:3905:3: (enumLiteral_4= 'block' )
                    // InternalMOloc.g:3906:4: enumLiteral_4= 'block'
                    {
                    enumLiteral_4=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getBlockEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getClassTypeAccess().getBlockEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMOloc.g:3913:3: (enumLiteral_5= 'connector' )
                    {
                    // InternalMOloc.g:3913:3: (enumLiteral_5= 'connector' )
                    // InternalMOloc.g:3914:4: enumLiteral_5= 'connector'
                    {
                    enumLiteral_5=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getConnectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getClassTypeAccess().getConnectorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMOloc.g:3921:3: (enumLiteral_6= 'type' )
                    {
                    // InternalMOloc.g:3921:3: (enumLiteral_6= 'type' )
                    // InternalMOloc.g:3922:4: enumLiteral_6= 'type'
                    {
                    enumLiteral_6=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getClassTypeAccess().getTypeEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMOloc.g:3929:3: (enumLiteral_7= 'package' )
                    {
                    // InternalMOloc.g:3929:3: (enumLiteral_7= 'package' )
                    // InternalMOloc.g:3930:4: enumLiteral_7= 'package'
                    {
                    enumLiteral_7=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getClassTypeAccess().getPackageEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getClassTypeAccess().getPackageEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMOloc.g:3937:3: (enumLiteral_8= 'function' )
                    {
                    // InternalMOloc.g:3937:3: (enumLiteral_8= 'function' )
                    // InternalMOloc.g:3938:4: enumLiteral_8= 'function'
                    {
                    enumLiteral_8=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 87, ruleClassType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "ruleDirection"
    // InternalMOloc.g:3948:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;
        int ruleDirection_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // InternalMOloc.g:3954:2: ( ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) )
            // InternalMOloc.g:3955:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            {
            // InternalMOloc.g:3955:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt89=1;
                }
                break;
            case 87:
                {
                alt89=2;
                }
                break;
            case 88:
                {
                alt89=3;
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
                    // InternalMOloc.g:3956:3: (enumLiteral_0= 'NULLDirection' )
                    {
                    // InternalMOloc.g:3956:3: (enumLiteral_0= 'NULLDirection' )
                    // InternalMOloc.g:3957:4: enumLiteral_0= 'NULLDirection'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:3964:3: (enumLiteral_1= 'input' )
                    {
                    // InternalMOloc.g:3964:3: (enumLiteral_1= 'input' )
                    // InternalMOloc.g:3965:4: enumLiteral_1= 'input'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:3972:3: (enumLiteral_2= 'output' )
                    {
                    // InternalMOloc.g:3972:3: (enumLiteral_2= 'output' )
                    // InternalMOloc.g:3973:4: enumLiteral_2= 'output'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleDirection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleRelationshipType"
    // InternalMOloc.g:3983:1: ruleRelationshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) ;
    public final Enumerator ruleRelationshipType() throws RecognitionException {
        Enumerator current = null;
        int ruleRelationshipType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // InternalMOloc.g:3989:2: ( ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) )
            // InternalMOloc.g:3990:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            {
            // InternalMOloc.g:3990:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt90=1;
                }
                break;
            case 90:
                {
                alt90=2;
                }
                break;
            case 91:
                {
                alt90=3;
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
                    // InternalMOloc.g:3991:3: (enumLiteral_0= 'NULLRelationshipType' )
                    {
                    // InternalMOloc.g:3991:3: (enumLiteral_0= 'NULLRelationshipType' )
                    // InternalMOloc.g:3992:4: enumLiteral_0= 'NULLRelationshipType'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:3999:3: (enumLiteral_1= 'flow' )
                    {
                    // InternalMOloc.g:3999:3: (enumLiteral_1= 'flow' )
                    // InternalMOloc.g:4000:4: enumLiteral_1= 'flow'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:4007:3: (enumLiteral_2= 'stream' )
                    {
                    // InternalMOloc.g:4007:3: (enumLiteral_2= 'stream' )
                    // InternalMOloc.g:4008:4: enumLiteral_2= 'stream'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 89, ruleRelationshipType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "ruleParameterType"
    // InternalMOloc.g:4018:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;
        int ruleParameterType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // InternalMOloc.g:4024:2: ( ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) )
            // InternalMOloc.g:4025:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            {
            // InternalMOloc.g:4025:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt91=1;
                }
                break;
            case 93:
                {
                alt91=2;
                }
                break;
            case 94:
                {
                alt91=3;
                }
                break;
            case 95:
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
                    // InternalMOloc.g:4026:3: (enumLiteral_0= 'NULLParameterType' )
                    {
                    // InternalMOloc.g:4026:3: (enumLiteral_0= 'NULLParameterType' )
                    // InternalMOloc.g:4027:4: enumLiteral_0= 'NULLParameterType'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:4034:3: (enumLiteral_1= 'discrete' )
                    {
                    // InternalMOloc.g:4034:3: (enumLiteral_1= 'discrete' )
                    // InternalMOloc.g:4035:4: enumLiteral_1= 'discrete'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:4042:3: (enumLiteral_2= 'parameter' )
                    {
                    // InternalMOloc.g:4042:3: (enumLiteral_2= 'parameter' )
                    // InternalMOloc.g:4043:4: enumLiteral_2= 'parameter'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMOloc.g:4050:3: (enumLiteral_3= 'constant' )
                    {
                    // InternalMOloc.g:4050:3: (enumLiteral_3= 'constant' )
                    // InternalMOloc.g:4051:4: enumLiteral_3= 'constant'
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleParameterType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"

    // $ANTLR start synpred88_InternalMOloc
    public final void synpred88_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_5 = null;


        // InternalMOloc.g:3241:4: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )
        // InternalMOloc.g:3241:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
        {
        // InternalMOloc.g:3241:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
        int alt101=4;
        switch ( input.LA(1) ) {
        case 48:
            {
            alt101=1;
            }
            break;
        case 72:
            {
            alt101=2;
            }
            break;
        case 47:
            {
            alt101=3;
            }
            break;
        case 71:
            {
            alt101=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 101, 0, input);

            throw nvae;
        }

        switch (alt101) {
            case 1 :
                // InternalMOloc.g:3242:5: kw= '*'
                {
                kw=(Token)match(input,48,FOLLOW_51); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMOloc.g:3248:5: kw= '/'
                {
                kw=(Token)match(input,72,FOLLOW_51); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMOloc.g:3254:5: kw= '.*'
                {
                kw=(Token)match(input,47,FOLLOW_51); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMOloc.g:3260:5: kw= '.-'
                {
                kw=(Token)match(input,71,FOLLOW_51); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_Factor_5=ruleFactor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalMOloc

    // Delegated rules

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


    protected DFA72 dfa72 = new DFA72(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\1\1\35\uffff";
    static final String dfa_3s = "\1\5\3\uffff\1\0\31\uffff";
    static final String dfa_4s = "\1\113\3\uffff\1\0\31\uffff";
    static final String dfa_5s = "\1\uffff\1\2\31\uffff\1\1\2\uffff";
    static final String dfa_6s = "\4\uffff\1\0\31\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\15\uffff\1\1\14\uffff\2\1\1\uffff\2\1\1\uffff\1\1\3\uffff\1\1\4\uffff\2\33\1\uffff\1\1\3\uffff\1\1\2\uffff\5\1\1\uffff\10\1\1\4\1\33\2\uffff\1\1",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3240:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalMOloc()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007F00002L,0x00000000003FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007F00000L,0x00000000003FE000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00B840A098100030L,0x00000000FFC00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00B840A018100030L,0x00000000FFC00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00B840A018100010L,0x00000000FFC00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x003800A000100010L,0x00000000FFC00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004080000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018007F00000L,0x00000000003FE000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00B840A008100012L,0x00000000FFC00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000002L,0x00000000F1C00000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001200A0000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001000A0000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x40420231900000F0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x40422231900000F0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000802000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004080080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000218007F00000L,0x00000000003FE000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040004080000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000080030L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000006000080010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x40020230900000F0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000001000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001800000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x40420239900000F0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000022000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000002000000002L});

}