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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_STRING", "RULE_UNSIGNED_NUMBER", "RULE_TRUE_FALSE", "RULE_NON_DIGIT", "RULE_DIGIT", "RULE_Q_IDENT", "RULE_UNSIGNED_INTEGER", "RULE_S_CHAR", "RULE_S_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_Q_CHAR", "'within'", "';'", "'final'", "'redeclare'", "'each'", "'replaceable'", "'initial'", "'equation'", "'algorithm'", "'public'", "'protected'", "'import'", "'='", "'.*'", "'.'", "'*'", "'{'", "','", "'}'", "'extends'", "'('", "')'", "'inner'", "'outer'", "'annotation'", "'if'", "'external'", "'then'", "'elseif'", "'else'", "'end'", "'for'", "'loop'", "'connect'", "'when'", "'elsewhen'", "':='", "'break'", "'return'", "'while'", "'encapsulated'", "'partial'", "'expandable'", "'pure'", "'impure'", "'operator'", "'enumeration'", "':'", "'der'", "'constrainedby'", "'+'", "'['", "']'", "'or'", "'and'", "'not'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'-'", "'.+'", "'.-'", "'/'", "'^'", "'.^'", "'in'", "'function'", "'NULLClassType'", "'class'", "'model'", "'record'", "'block'", "'connector'", "'type'", "'package'", "'NULLRelationshipType'", "'flow'", "'stream'", "'NULLParameterType'", "'discrete'", "'parameter'", "'constant'", "'NULLDirection'", "'input'", "'output'"
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
            this.state.ruleMemo = new HashMap[365+1];
             
             
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
    // InternalMOloc.g:79:1: ruleStored_definition returns [EObject current=null] : ( ( (lv_within_0_0= ruleWithin ) )? ( (lv_classes_1_0= ruleClass_definition ) )* ) ;
    public final EObject ruleStored_definition() throws RecognitionException {
        EObject current = null;
        int ruleStored_definition_StartIndex = input.index();
        EObject lv_within_0_0 = null;

        EObject lv_classes_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // InternalMOloc.g:85:2: ( ( ( (lv_within_0_0= ruleWithin ) )? ( (lv_classes_1_0= ruleClass_definition ) )* ) )
            // InternalMOloc.g:86:2: ( ( (lv_within_0_0= ruleWithin ) )? ( (lv_classes_1_0= ruleClass_definition ) )* )
            {
            // InternalMOloc.g:86:2: ( ( (lv_within_0_0= ruleWithin ) )? ( (lv_classes_1_0= ruleClass_definition ) )* )
            // InternalMOloc.g:87:3: ( (lv_within_0_0= ruleWithin ) )? ( (lv_classes_1_0= ruleClass_definition ) )*
            {
            // InternalMOloc.g:87:3: ( (lv_within_0_0= ruleWithin ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMOloc.g:88:4: (lv_within_0_0= ruleWithin )
                    {
                    // InternalMOloc.g:88:4: (lv_within_0_0= ruleWithin )
                    // InternalMOloc.g:89:5: lv_within_0_0= ruleWithin
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStored_definitionAccess().getWithinWithinParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_within_0_0=ruleWithin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStored_definitionRule());
                      					}
                      					set(
                      						current,
                      						"within",
                      						lv_within_0_0,
                      						"dut.control.moloc.MOloc.Within");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:106:3: ( (lv_classes_1_0= ruleClass_definition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||(LA2_0>=58 && LA2_0<=63)||(LA2_0>=87 && LA2_0<=95)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMOloc.g:107:4: (lv_classes_1_0= ruleClass_definition )
            	    {
            	    // InternalMOloc.g:107:4: (lv_classes_1_0= ruleClass_definition )
            	    // InternalMOloc.g:108:5: lv_classes_1_0= ruleClass_definition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStored_definitionAccess().getClassesClass_definitionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_classes_1_0=ruleClass_definition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStored_definitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_1_0,
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


    // $ANTLR start "entryRuleWithin"
    // InternalMOloc.g:129:1: entryRuleWithin returns [EObject current=null] : iv_ruleWithin= ruleWithin EOF ;
    public final EObject entryRuleWithin() throws RecognitionException {
        EObject current = null;
        int entryRuleWithin_StartIndex = input.index();
        EObject iv_ruleWithin = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // InternalMOloc.g:129:47: (iv_ruleWithin= ruleWithin EOF )
            // InternalMOloc.g:130:2: iv_ruleWithin= ruleWithin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWithinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWithin=ruleWithin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWithin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleWithin_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWithin"


    // $ANTLR start "ruleWithin"
    // InternalMOloc.g:136:1: ruleWithin returns [EObject current=null] : (otherlv_0= 'within' ( (lv_withName_1_0= ruleName ) ) otherlv_2= ';' ) ;
    public final EObject ruleWithin() throws RecognitionException {
        EObject current = null;
        int ruleWithin_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_withName_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // InternalMOloc.g:142:2: ( (otherlv_0= 'within' ( (lv_withName_1_0= ruleName ) ) otherlv_2= ';' ) )
            // InternalMOloc.g:143:2: (otherlv_0= 'within' ( (lv_withName_1_0= ruleName ) ) otherlv_2= ';' )
            {
            // InternalMOloc.g:143:2: (otherlv_0= 'within' ( (lv_withName_1_0= ruleName ) ) otherlv_2= ';' )
            // InternalMOloc.g:144:3: otherlv_0= 'within' ( (lv_withName_1_0= ruleName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWithinAccess().getWithinKeyword_0());
              		
            }
            // InternalMOloc.g:148:3: ( (lv_withName_1_0= ruleName ) )
            // InternalMOloc.g:149:4: (lv_withName_1_0= ruleName )
            {
            // InternalMOloc.g:149:4: (lv_withName_1_0= ruleName )
            // InternalMOloc.g:150:5: lv_withName_1_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWithinAccess().getWithNameNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_withName_1_0=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWithinRule());
              					}
              					set(
              						current,
              						"withName",
              						lv_withName_1_0,
              						"dut.control.moloc.MOloc.Name");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWithinAccess().getSemicolonKeyword_2());
              		
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleWithin_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWithin"


    // $ANTLR start "entryRuleClass_definition"
    // InternalMOloc.g:175:1: entryRuleClass_definition returns [EObject current=null] : iv_ruleClass_definition= ruleClass_definition EOF ;
    public final EObject entryRuleClass_definition() throws RecognitionException {
        EObject current = null;
        int entryRuleClass_definition_StartIndex = input.index();
        EObject iv_ruleClass_definition = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // InternalMOloc.g:175:57: (iv_ruleClass_definition= ruleClass_definition EOF )
            // InternalMOloc.g:176:2: iv_ruleClass_definition= ruleClass_definition EOF
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
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleClass_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleClass_definition"


    // $ANTLR start "ruleClass_definition"
    // InternalMOloc.g:182:1: ruleClass_definition returns [EObject current=null] : ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] ( (lv_isOver_3_0= ';' ) ) ) ;
    public final EObject ruleClass_definition() throws RecognitionException {
        EObject current = null;
        int ruleClass_definition_StartIndex = input.index();
        Token lv_isfinal_0_0=null;
        Token lv_isOver_3_0=null;
        EObject this_class_prefixes_1 = null;

        EObject this_class_specifier_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // InternalMOloc.g:188:2: ( ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] ( (lv_isOver_3_0= ';' ) ) ) )
            // InternalMOloc.g:189:2: ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] ( (lv_isOver_3_0= ';' ) ) )
            {
            // InternalMOloc.g:189:2: ( ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] ( (lv_isOver_3_0= ';' ) ) )
            // InternalMOloc.g:190:3: ( (lv_isfinal_0_0= 'final' ) )? this_class_prefixes_1= ruleclass_prefixes[$current] this_class_specifier_2= ruleclass_specifier[$current] ( (lv_isOver_3_0= ';' ) )
            {
            // InternalMOloc.g:190:3: ( (lv_isfinal_0_0= 'final' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMOloc.g:191:4: (lv_isfinal_0_0= 'final' )
                    {
                    // InternalMOloc.g:191:4: (lv_isfinal_0_0= 'final' )
                    // InternalMOloc.g:192:5: lv_isfinal_0_0= 'final'
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
            pushFollow(FOLLOW_5);
            this_class_specifier_2=ruleclass_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_specifier_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:232:3: ( (lv_isOver_3_0= ';' ) )
            // InternalMOloc.g:233:4: (lv_isOver_3_0= ';' )
            {
            // InternalMOloc.g:233:4: (lv_isOver_3_0= ';' )
            // InternalMOloc.g:234:5: lv_isOver_3_0= ';'
            {
            lv_isOver_3_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isOver_3_0, grammarAccess.getClass_definitionAccess().getIsOverSemicolonKeyword_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClass_definitionRule());
              					}
              					setWithLastConsumed(current, "isOver", lv_isOver_3_0 != null, ";");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleClass_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClass_definition"


    // $ANTLR start "entryRuleConstrainingClause"
    // InternalMOloc.g:250:1: entryRuleConstrainingClause returns [EObject current=null] : iv_ruleConstrainingClause= ruleConstrainingClause EOF ;
    public final EObject entryRuleConstrainingClause() throws RecognitionException {
        EObject current = null;
        int entryRuleConstrainingClause_StartIndex = input.index();
        EObject iv_ruleConstrainingClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // InternalMOloc.g:250:59: (iv_ruleConstrainingClause= ruleConstrainingClause EOF )
            // InternalMOloc.g:251:2: iv_ruleConstrainingClause= ruleConstrainingClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleConstrainingClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConstrainingClause"


    // $ANTLR start "ruleConstrainingClause"
    // InternalMOloc.g:257:1: ruleConstrainingClause returns [EObject current=null] : (this_type_specifier_0= ruletype_specifier[$current] (this_class_modification_1= ruleclass_modification[$current] )? ) ;
    public final EObject ruleConstrainingClause() throws RecognitionException {
        EObject current = null;
        int ruleConstrainingClause_StartIndex = input.index();
        EObject this_type_specifier_0 = null;

        EObject this_class_modification_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // InternalMOloc.g:263:2: ( (this_type_specifier_0= ruletype_specifier[$current] (this_class_modification_1= ruleclass_modification[$current] )? ) )
            // InternalMOloc.g:264:2: (this_type_specifier_0= ruletype_specifier[$current] (this_class_modification_1= ruleclass_modification[$current] )? )
            {
            // InternalMOloc.g:264:2: (this_type_specifier_0= ruletype_specifier[$current] (this_class_modification_1= ruleclass_modification[$current] )? )
            // InternalMOloc.g:265:3: this_type_specifier_0= ruletype_specifier[$current] (this_class_modification_1= ruleclass_modification[$current] )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getConstrainingClauseRule());
              			}
              			newCompositeNode(grammarAccess.getConstrainingClauseAccess().getType_specifierParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_type_specifier_0=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:279:3: (this_class_modification_1= ruleclass_modification[$current] )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMOloc.g:280:4: this_class_modification_1= ruleclass_modification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getConstrainingClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getConstrainingClauseAccess().getClass_modificationParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_class_modification_1=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_1;
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleConstrainingClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConstrainingClause"


    // $ANTLR start "entryRuleModificationElement"
    // InternalMOloc.g:299:1: entryRuleModificationElement returns [EObject current=null] : iv_ruleModificationElement= ruleModificationElement EOF ;
    public final EObject entryRuleModificationElement() throws RecognitionException {
        EObject current = null;
        int entryRuleModificationElement_StartIndex = input.index();
        EObject iv_ruleModificationElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // InternalMOloc.g:299:60: (iv_ruleModificationElement= ruleModificationElement EOF )
            // InternalMOloc.g:300:2: iv_ruleModificationElement= ruleModificationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModificationElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModificationElement=ruleModificationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModificationElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRuleModificationElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModificationElement"


    // $ANTLR start "ruleModificationElement"
    // InternalMOloc.g:306:1: ruleModificationElement returns [EObject current=null] : ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? ) ;
    public final EObject ruleModificationElement() throws RecognitionException {
        EObject current = null;
        int ruleModificationElement_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // InternalMOloc.g:312:2: ( ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? ) )
            // InternalMOloc.g:313:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? )
            {
            // InternalMOloc.g:313:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? )
            // InternalMOloc.g:314:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )?
            {
            // InternalMOloc.g:314:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMOloc.g:315:4: (lv_isRedeclare_0_0= 'redeclare' )
                    {
                    // InternalMOloc.g:315:4: (lv_isRedeclare_0_0= 'redeclare' )
                    // InternalMOloc.g:316:5: lv_isRedeclare_0_0= 'redeclare'
                    {
                    lv_isRedeclare_0_0=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isRedeclare_0_0, grammarAccess.getModificationElementAccess().getIsRedeclareRedeclareKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isRedeclare", lv_isRedeclare_0_0 != null, "redeclare");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:328:3: ( (lv_isEach_1_0= 'each' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMOloc.g:329:4: (lv_isEach_1_0= 'each' )
                    {
                    // InternalMOloc.g:329:4: (lv_isEach_1_0= 'each' )
                    // InternalMOloc.g:330:5: lv_isEach_1_0= 'each'
                    {
                    lv_isEach_1_0=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isEach_1_0, grammarAccess.getModificationElementAccess().getIsEachEachKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isEach", lv_isEach_1_0 != null, "each");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:342:3: ( (lv_isfinal_2_0= 'final' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMOloc.g:343:4: (lv_isfinal_2_0= 'final' )
                    {
                    // InternalMOloc.g:343:4: (lv_isfinal_2_0= 'final' )
                    // InternalMOloc.g:344:5: lv_isfinal_2_0= 'final'
                    {
                    lv_isfinal_2_0=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isfinal_2_0, grammarAccess.getModificationElementAccess().getIsfinalFinalKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isfinal", lv_isfinal_2_0 != null, "final");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:356:3: ( (lv_isReplaceable_3_0= 'replaceable' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMOloc.g:357:4: (lv_isReplaceable_3_0= 'replaceable' )
                    {
                    // InternalMOloc.g:357:4: (lv_isReplaceable_3_0= 'replaceable' )
                    // InternalMOloc.g:358:5: lv_isReplaceable_3_0= 'replaceable'
                    {
                    lv_isReplaceable_3_0=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReplaceable_3_0, grammarAccess.getModificationElementAccess().getIsReplaceableReplaceableKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isReplaceable", lv_isReplaceable_3_0 != null, "replaceable");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:370:3: (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMOloc.g:371:4: this_short_class_definition_4= ruleshort_class_definition[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getModificationElementAccess().getShort_class_definitionParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_10);
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
                    // InternalMOloc.g:386:4: this_component_clause1_5= rulecomponent_clause1[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getModificationElementAccess().getComponent_clause1ParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
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
                    // InternalMOloc.g:401:4: this_element_modification_6= ruleelement_modification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getModificationElementAccess().getElement_modificationParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_10);
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

            // InternalMOloc.g:416:3: (this_constraining_7= ruleconstraining[$current] )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==67) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMOloc.g:417:4: this_constraining_7= ruleconstraining[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getModificationElementAccess().getConstrainingParserRuleCall_5());
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 10, ruleModificationElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModificationElement"


    // $ANTLR start "entryRuleAnnotationModificationElement"
    // InternalMOloc.g:436:1: entryRuleAnnotationModificationElement returns [EObject current=null] : iv_ruleAnnotationModificationElement= ruleAnnotationModificationElement EOF ;
    public final EObject entryRuleAnnotationModificationElement() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotationModificationElement_StartIndex = input.index();
        EObject iv_ruleAnnotationModificationElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // InternalMOloc.g:436:70: (iv_ruleAnnotationModificationElement= ruleAnnotationModificationElement EOF )
            // InternalMOloc.g:437:2: iv_ruleAnnotationModificationElement= ruleAnnotationModificationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationModificationElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationModificationElement=ruleAnnotationModificationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationModificationElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleAnnotationModificationElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationModificationElement"


    // $ANTLR start "ruleAnnotationModificationElement"
    // InternalMOloc.g:443:1: ruleAnnotationModificationElement returns [EObject current=null] : ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? ) ;
    public final EObject ruleAnnotationModificationElement() throws RecognitionException {
        EObject current = null;
        int ruleAnnotationModificationElement_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // InternalMOloc.g:449:2: ( ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? ) )
            // InternalMOloc.g:450:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? )
            {
            // InternalMOloc.g:450:2: ( ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )? )
            // InternalMOloc.g:451:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )? ( (lv_isEach_1_0= 'each' ) )? ( (lv_isfinal_2_0= 'final' ) )? ( (lv_isReplaceable_3_0= 'replaceable' ) )? (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] ) (this_constraining_7= ruleconstraining[$current] )?
            {
            // InternalMOloc.g:451:3: ( (lv_isRedeclare_0_0= 'redeclare' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMOloc.g:452:4: (lv_isRedeclare_0_0= 'redeclare' )
                    {
                    // InternalMOloc.g:452:4: (lv_isRedeclare_0_0= 'redeclare' )
                    // InternalMOloc.g:453:5: lv_isRedeclare_0_0= 'redeclare'
                    {
                    lv_isRedeclare_0_0=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isRedeclare_0_0, grammarAccess.getAnnotationModificationElementAccess().getIsRedeclareRedeclareKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isRedeclare", lv_isRedeclare_0_0 != null, "redeclare");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:465:3: ( (lv_isEach_1_0= 'each' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMOloc.g:466:4: (lv_isEach_1_0= 'each' )
                    {
                    // InternalMOloc.g:466:4: (lv_isEach_1_0= 'each' )
                    // InternalMOloc.g:467:5: lv_isEach_1_0= 'each'
                    {
                    lv_isEach_1_0=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isEach_1_0, grammarAccess.getAnnotationModificationElementAccess().getIsEachEachKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isEach", lv_isEach_1_0 != null, "each");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:479:3: ( (lv_isfinal_2_0= 'final' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMOloc.g:480:4: (lv_isfinal_2_0= 'final' )
                    {
                    // InternalMOloc.g:480:4: (lv_isfinal_2_0= 'final' )
                    // InternalMOloc.g:481:5: lv_isfinal_2_0= 'final'
                    {
                    lv_isfinal_2_0=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isfinal_2_0, grammarAccess.getAnnotationModificationElementAccess().getIsfinalFinalKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isfinal", lv_isfinal_2_0 != null, "final");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:493:3: ( (lv_isReplaceable_3_0= 'replaceable' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMOloc.g:494:4: (lv_isReplaceable_3_0= 'replaceable' )
                    {
                    // InternalMOloc.g:494:4: (lv_isReplaceable_3_0= 'replaceable' )
                    // InternalMOloc.g:495:5: lv_isReplaceable_3_0= 'replaceable'
                    {
                    lv_isReplaceable_3_0=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReplaceable_3_0, grammarAccess.getAnnotationModificationElementAccess().getIsReplaceableReplaceableKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      					}
                      					setWithLastConsumed(current, "isReplaceable", lv_isReplaceable_3_0 != null, "replaceable");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:507:3: (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMOloc.g:508:4: this_short_class_definition_4= ruleshort_class_definition[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getAnnotationModificationElementAccess().getShort_class_definitionParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_10);
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
                    // InternalMOloc.g:523:4: this_component_clause1_5= rulecomponent_clause1[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getAnnotationModificationElementAccess().getComponent_clause1ParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
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
                    // InternalMOloc.g:538:4: this_element_modification_6= ruleelement_modification[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getAnnotationModificationElementAccess().getElement_modificationParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_10);
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

            // InternalMOloc.g:553:3: (this_constraining_7= ruleconstraining[$current] )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==67) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMOloc.g:554:4: this_constraining_7= ruleconstraining[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getAnnotationModificationElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getAnnotationModificationElementAccess().getConstrainingParserRuleCall_5());
                      			
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleAnnotationModificationElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationModificationElement"


    // $ANTLR start "entryRuleElement"
    // InternalMOloc.g:573:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;
        int entryRuleElement_StartIndex = input.index();
        EObject iv_ruleElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // InternalMOloc.g:573:48: (iv_ruleElement= ruleElement EOF )
            // InternalMOloc.g:574:2: iv_ruleElement= ruleElement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMOloc.g:580:1: ruleElement returns [EObject current=null] : (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_ComponentClause_2= ruleComponentClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;
        int ruleElement_StartIndex = input.index();
        EObject this_ImportClause_0 = null;

        EObject this_ExtendsClause_1 = null;

        EObject this_ComponentClause_2 = null;

        EObject this_ExternalElement_3 = null;

        EObject this_AnnotationClause_4 = null;

        EObject this_EquationSection_5 = null;

        EObject this_AlgorithmSection_6 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // InternalMOloc.g:586:2: ( (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_ComponentClause_2= ruleComponentClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection ) )
            // InternalMOloc.g:587:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_ComponentClause_2= ruleComponentClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection )
            {
            // InternalMOloc.g:587:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_ComponentClause_2= ruleComponentClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection )
            int alt17=7;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMOloc.g:588:3: this_ImportClause_0= ruleImportClause
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
                    // InternalMOloc.g:600:3: this_ExtendsClause_1= ruleExtendsClause
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
                    // InternalMOloc.g:612:3: this_ComponentClause_2= ruleComponentClause
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getComponentClauseParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ComponentClause_2=ruleComponentClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ComponentClause_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:624:3: this_ExternalElement_3= ruleExternalElement
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
                    // InternalMOloc.g:636:3: this_AnnotationClause_4= ruleAnnotationClause
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
                    // InternalMOloc.g:648:3: this_EquationSection_5= ruleEquationSection
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
                    // InternalMOloc.g:660:3: this_AlgorithmSection_6= ruleAlgorithmSection
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEquationSection"
    // InternalMOloc.g:675:1: entryRuleEquationSection returns [EObject current=null] : iv_ruleEquationSection= ruleEquationSection EOF ;
    public final EObject entryRuleEquationSection() throws RecognitionException {
        EObject current = null;
        int entryRuleEquationSection_StartIndex = input.index();
        EObject iv_ruleEquationSection = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // InternalMOloc.g:675:56: (iv_ruleEquationSection= ruleEquationSection EOF )
            // InternalMOloc.g:676:2: iv_ruleEquationSection= ruleEquationSection EOF
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
            if ( state.backtracking>0 ) { memoize(input, 15, entryRuleEquationSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEquationSection"


    // $ANTLR start "ruleEquationSection"
    // InternalMOloc.g:682:1: ruleEquationSection returns [EObject current=null] : ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* ) ;
    public final EObject ruleEquationSection() throws RecognitionException {
        EObject current = null;
        int ruleEquationSection_StartIndex = input.index();
        Token lv_isInitial_1_0=null;
        Token otherlv_2=null;
        EObject lv_equations_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // InternalMOloc.g:688:2: ( ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* ) )
            // InternalMOloc.g:689:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* )
            {
            // InternalMOloc.g:689:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )* )
            // InternalMOloc.g:690:3: () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'equation' ( (lv_equations_3_0= ruleEquation ) )*
            {
            // InternalMOloc.g:690:3: ()
            // InternalMOloc.g:691:4: 
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

            // InternalMOloc.g:700:3: ( (lv_isInitial_1_0= 'initial' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMOloc.g:701:4: (lv_isInitial_1_0= 'initial' )
                    {
                    // InternalMOloc.g:701:4: (lv_isInitial_1_0= 'initial' )
                    // InternalMOloc.g:702:5: lv_isInitial_1_0= 'initial'
                    {
                    lv_isInitial_1_0=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEquationSectionAccess().getEquationKeyword_2());
              		
            }
            // InternalMOloc.g:718:3: ( (lv_equations_3_0= ruleEquation ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalMOloc.g:719:4: (lv_equations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:719:4: (lv_equations_3_0= ruleEquation )
            	    // InternalMOloc.g:720:5: lv_equations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEquationSectionAccess().getEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    break loop19;
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
            if ( state.backtracking>0 ) { memoize(input, 16, ruleEquationSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEquationSection"


    // $ANTLR start "entryRuleEquation"
    // InternalMOloc.g:741:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleEquation_StartIndex = input.index();
        EObject iv_ruleEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // InternalMOloc.g:741:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalMOloc.g:742:2: iv_ruleEquation= ruleEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 17, entryRuleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalMOloc.g:748:1: ruleEquation returns [EObject current=null] : (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // InternalMOloc.g:754:2: ( (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation ) )
            // InternalMOloc.g:755:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )
            {
            // InternalMOloc.g:755:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )
            int alt20=6;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalMOloc.g:756:3: this_SimpleEquation_0= ruleSimpleEquation
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
                    // InternalMOloc.g:768:3: this_IfEquation_1= ruleIfEquation
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
                    // InternalMOloc.g:780:3: this_ForEquation_2= ruleForEquation
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
                    // InternalMOloc.g:792:3: this_ConnectEquation_3= ruleConnectEquation
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
                    // InternalMOloc.g:804:3: this_WhenEquation_4= ruleWhenEquation
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
                    // InternalMOloc.g:816:3: this_FunctionEquation_5= ruleFunctionEquation
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
            if ( state.backtracking>0 ) { memoize(input, 18, ruleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleAlgorithmSection"
    // InternalMOloc.g:831:1: entryRuleAlgorithmSection returns [EObject current=null] : iv_ruleAlgorithmSection= ruleAlgorithmSection EOF ;
    public final EObject entryRuleAlgorithmSection() throws RecognitionException {
        EObject current = null;
        int entryRuleAlgorithmSection_StartIndex = input.index();
        EObject iv_ruleAlgorithmSection = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // InternalMOloc.g:831:57: (iv_ruleAlgorithmSection= ruleAlgorithmSection EOF )
            // InternalMOloc.g:832:2: iv_ruleAlgorithmSection= ruleAlgorithmSection EOF
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
            if ( state.backtracking>0 ) { memoize(input, 19, entryRuleAlgorithmSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithmSection"


    // $ANTLR start "ruleAlgorithmSection"
    // InternalMOloc.g:838:1: ruleAlgorithmSection returns [EObject current=null] : ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* ) ;
    public final EObject ruleAlgorithmSection() throws RecognitionException {
        EObject current = null;
        int ruleAlgorithmSection_StartIndex = input.index();
        Token lv_isInitial_1_0=null;
        Token otherlv_2=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // InternalMOloc.g:844:2: ( ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* ) )
            // InternalMOloc.g:845:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* )
            {
            // InternalMOloc.g:845:2: ( () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )* )
            // InternalMOloc.g:846:3: () ( (lv_isInitial_1_0= 'initial' ) )? otherlv_2= 'algorithm' ( (lv_statements_3_0= ruleStatement ) )*
            {
            // InternalMOloc.g:846:3: ()
            // InternalMOloc.g:847:4: 
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

            // InternalMOloc.g:856:3: ( (lv_isInitial_1_0= 'initial' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMOloc.g:857:4: (lv_isInitial_1_0= 'initial' )
                    {
                    // InternalMOloc.g:857:4: (lv_isInitial_1_0= 'initial' )
                    // InternalMOloc.g:858:5: lv_isInitial_1_0= 'initial'
                    {
                    lv_isInitial_1_0=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,26,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAlgorithmSectionAccess().getAlgorithmKeyword_2());
              		
            }
            // InternalMOloc.g:874:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalMOloc.g:875:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:875:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMOloc.g:876:5: lv_statements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAlgorithmSectionAccess().getStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop22;
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
            if ( state.backtracking>0 ) { memoize(input, 20, ruleAlgorithmSection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithmSection"


    // $ANTLR start "entryRuleStatement"
    // InternalMOloc.g:897:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleStatement_StartIndex = input.index();
        EObject iv_ruleStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // InternalMOloc.g:897:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMOloc.g:898:2: iv_ruleStatement= ruleStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMOloc.g:904:1: ruleStatement returns [EObject current=null] : (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // InternalMOloc.g:910:2: ( (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement ) )
            // InternalMOloc.g:911:2: (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement )
            {
            // InternalMOloc.g:911:2: (this_FunctionStatement_0= ruleFunctionStatement | this_BreakStatement_1= ruleBreakStatement | this_ReturnStatement_2= ruleReturnStatement | this_IfStatement_3= ruleIfStatement | this_ForStatement_4= ruleForStatement | this_WhenStatement_5= ruleWhenStatement | this_WhileStatement_6= ruleWhileStatement )
            int alt23=7;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case 32:
            case 38:
                {
                alt23=1;
                }
                break;
            case 55:
                {
                alt23=2;
                }
                break;
            case 56:
                {
                alt23=3;
                }
                break;
            case 43:
                {
                alt23=4;
                }
                break;
            case 49:
                {
                alt23=5;
                }
                break;
            case 52:
                {
                alt23=6;
                }
                break;
            case 57:
                {
                alt23=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMOloc.g:912:3: this_FunctionStatement_0= ruleFunctionStatement
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
                    // InternalMOloc.g:924:3: this_BreakStatement_1= ruleBreakStatement
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
                    // InternalMOloc.g:936:3: this_ReturnStatement_2= ruleReturnStatement
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
                    // InternalMOloc.g:948:3: this_IfStatement_3= ruleIfStatement
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
                    // InternalMOloc.g:960:3: this_ForStatement_4= ruleForStatement
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
                    // InternalMOloc.g:972:3: this_WhenStatement_5= ruleWhenStatement
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
                    // InternalMOloc.g:984:3: this_WhileStatement_6= ruleWhileStatement
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruleStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleImportClause"
    // InternalMOloc.g:999:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;
        int entryRuleImportClause_StartIndex = input.index();
        EObject iv_ruleImportClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // InternalMOloc.g:999:53: (iv_ruleImportClause= ruleImportClause EOF )
            // InternalMOloc.g:1000:2: iv_ruleImportClause= ruleImportClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleImportClause"


    // $ANTLR start "ruleImportClause"
    // InternalMOloc.g:1006:1: ruleImportClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] ( (lv_isOver_16_0= ';' ) ) ) ;
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
        Token lv_isOver_16_0=null;
        AntlrDatatypeRuleToken lv_importName_5_0 = null;

        AntlrDatatypeRuleToken lv_importName_6_0 = null;

        EObject this_description_15 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // InternalMOloc.g:1012:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] ( (lv_isOver_16_0= ';' ) ) ) )
            // InternalMOloc.g:1013:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] ( (lv_isOver_16_0= ';' ) ) )
            {
            // InternalMOloc.g:1013:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] ( (lv_isOver_16_0= ';' ) ) )
            // InternalMOloc.g:1014:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'import' ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) ) this_description_15= ruledescription[$current] ( (lv_isOver_16_0= ';' ) )
            {
            // InternalMOloc.g:1014:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMOloc.g:1015:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:1015:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:1016:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
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

            // InternalMOloc.g:1028:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMOloc.g:1029:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:1029:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:1030:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportClauseAccess().getImportKeyword_2());
              		
            }
            // InternalMOloc.g:1046:3: ( ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) ) | ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_IDENT) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_STRING||LA29_1==19||(LA29_1>=31 && LA29_1<=32)||LA29_1==42) ) {
                    alt29=2;
                }
                else if ( (LA29_1==30) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMOloc.g:1047:4: ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) )
                    {
                    // InternalMOloc.g:1047:4: ( ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) ) )
                    // InternalMOloc.g:1048:5: ( (lv_selfName_3_0= RULE_IDENT ) ) otherlv_4= '=' ( (lv_importName_5_0= ruleName ) )
                    {
                    // InternalMOloc.g:1048:5: ( (lv_selfName_3_0= RULE_IDENT ) )
                    // InternalMOloc.g:1049:6: (lv_selfName_3_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:1049:6: (lv_selfName_3_0= RULE_IDENT )
                    // InternalMOloc.g:1050:7: lv_selfName_3_0= RULE_IDENT
                    {
                    lv_selfName_3_0=(Token)match(input,RULE_IDENT,FOLLOW_17); if (state.failed) return current;
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

                    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getImportClauseAccess().getEqualsSignKeyword_3_0_1());
                      				
                    }
                    // InternalMOloc.g:1070:5: ( (lv_importName_5_0= ruleName ) )
                    // InternalMOloc.g:1071:6: (lv_importName_5_0= ruleName )
                    {
                    // InternalMOloc.g:1071:6: (lv_importName_5_0= ruleName )
                    // InternalMOloc.g:1072:7: lv_importName_5_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportClauseAccess().getImportNameNameParserRuleCall_3_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_18);
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
                    // InternalMOloc.g:1091:4: ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? )
                    {
                    // InternalMOloc.g:1091:4: ( ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )? )
                    // InternalMOloc.g:1092:5: ( (lv_importName_6_0= ruleName ) ) ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )?
                    {
                    // InternalMOloc.g:1092:5: ( (lv_importName_6_0= ruleName ) )
                    // InternalMOloc.g:1093:6: (lv_importName_6_0= ruleName )
                    {
                    // InternalMOloc.g:1093:6: (lv_importName_6_0= ruleName )
                    // InternalMOloc.g:1094:7: lv_importName_6_0= ruleName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImportClauseAccess().getImportNameNameParserRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_19);
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

                    // InternalMOloc.g:1111:5: ( ( (lv_isImportAll_7_0= '.*' ) ) | (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) ) )?
                    int alt28=3;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==31) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==32) ) {
                        alt28=2;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalMOloc.g:1112:6: ( (lv_isImportAll_7_0= '.*' ) )
                            {
                            // InternalMOloc.g:1112:6: ( (lv_isImportAll_7_0= '.*' ) )
                            // InternalMOloc.g:1113:7: (lv_isImportAll_7_0= '.*' )
                            {
                            // InternalMOloc.g:1113:7: (lv_isImportAll_7_0= '.*' )
                            // InternalMOloc.g:1114:8: lv_isImportAll_7_0= '.*'
                            {
                            lv_isImportAll_7_0=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
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
                            // InternalMOloc.g:1127:6: (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) )
                            {
                            // InternalMOloc.g:1127:6: (otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) ) )
                            // InternalMOloc.g:1128:7: otherlv_8= '.' ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) )
                            {
                            otherlv_8=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getImportClauseAccess().getFullStopKeyword_3_1_1_1_0());
                              						
                            }
                            // InternalMOloc.g:1132:7: ( ( (lv_isImportAll_9_0= '*' ) ) | (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' ) )
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==33) ) {
                                alt27=1;
                            }
                            else if ( (LA27_0==34) ) {
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
                                    // InternalMOloc.g:1133:8: ( (lv_isImportAll_9_0= '*' ) )
                                    {
                                    // InternalMOloc.g:1133:8: ( (lv_isImportAll_9_0= '*' ) )
                                    // InternalMOloc.g:1134:9: (lv_isImportAll_9_0= '*' )
                                    {
                                    // InternalMOloc.g:1134:9: (lv_isImportAll_9_0= '*' )
                                    // InternalMOloc.g:1135:10: lv_isImportAll_9_0= '*'
                                    {
                                    lv_isImportAll_9_0=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
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
                                    // InternalMOloc.g:1148:8: (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' )
                                    {
                                    // InternalMOloc.g:1148:8: (otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}' )
                                    // InternalMOloc.g:1149:9: otherlv_10= '{' ( (lv_objectName_11_0= RULE_IDENT ) ) (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )* otherlv_14= '}'
                                    {
                                    otherlv_10=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(otherlv_10, grammarAccess.getImportClauseAccess().getLeftCurlyBracketKeyword_3_1_1_1_1_1_0());
                                      								
                                    }
                                    // InternalMOloc.g:1153:9: ( (lv_objectName_11_0= RULE_IDENT ) )
                                    // InternalMOloc.g:1154:10: (lv_objectName_11_0= RULE_IDENT )
                                    {
                                    // InternalMOloc.g:1154:10: (lv_objectName_11_0= RULE_IDENT )
                                    // InternalMOloc.g:1155:11: lv_objectName_11_0= RULE_IDENT
                                    {
                                    lv_objectName_11_0=(Token)match(input,RULE_IDENT,FOLLOW_21); if (state.failed) return current;
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

                                    // InternalMOloc.g:1171:9: (otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) ) )*
                                    loop26:
                                    do {
                                        int alt26=2;
                                        int LA26_0 = input.LA(1);

                                        if ( (LA26_0==35) ) {
                                            alt26=1;
                                        }


                                        switch (alt26) {
                                    	case 1 :
                                    	    // InternalMOloc.g:1172:10: otherlv_12= ',' ( (lv_objectName_13_0= RULE_IDENT ) )
                                    	    {
                                    	    otherlv_12=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      										newLeafNode(otherlv_12, grammarAccess.getImportClauseAccess().getCommaKeyword_3_1_1_1_1_1_2_0());
                                    	      									
                                    	    }
                                    	    // InternalMOloc.g:1176:10: ( (lv_objectName_13_0= RULE_IDENT ) )
                                    	    // InternalMOloc.g:1177:11: (lv_objectName_13_0= RULE_IDENT )
                                    	    {
                                    	    // InternalMOloc.g:1177:11: (lv_objectName_13_0= RULE_IDENT )
                                    	    // InternalMOloc.g:1178:12: lv_objectName_13_0= RULE_IDENT
                                    	    {
                                    	    lv_objectName_13_0=(Token)match(input,RULE_IDENT,FOLLOW_21); if (state.failed) return current;
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
                                    	    break loop26;
                                        }
                                    } while (true);

                                    otherlv_14=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
            this_description_15=ruledescription(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_15;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:1219:3: ( (lv_isOver_16_0= ';' ) )
            // InternalMOloc.g:1220:4: (lv_isOver_16_0= ';' )
            {
            // InternalMOloc.g:1220:4: (lv_isOver_16_0= ';' )
            // InternalMOloc.g:1221:5: lv_isOver_16_0= ';'
            {
            lv_isOver_16_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isOver_16_0, grammarAccess.getImportClauseAccess().getIsOverSemicolonKeyword_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportClauseRule());
              					}
              					setWithLastConsumed(current, "isOver", lv_isOver_16_0 != null, ";");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleImportClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleExtendsClause"
    // InternalMOloc.g:1237:1: entryRuleExtendsClause returns [EObject current=null] : iv_ruleExtendsClause= ruleExtendsClause EOF ;
    public final EObject entryRuleExtendsClause() throws RecognitionException {
        EObject current = null;
        int entryRuleExtendsClause_StartIndex = input.index();
        EObject iv_ruleExtendsClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // InternalMOloc.g:1237:54: (iv_ruleExtendsClause= ruleExtendsClause EOF )
            // InternalMOloc.g:1238:2: iv_ruleExtendsClause= ruleExtendsClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsClause"


    // $ANTLR start "ruleExtendsClause"
    // InternalMOloc.g:1244:1: ruleExtendsClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (this_annotation_modification_part_11= ruleannotation_modification_part[$current] )? ( (lv_isOver_12_0= ';' ) ) ) ;
    public final EObject ruleExtendsClause() throws RecognitionException {
        EObject current = null;
        int ruleExtendsClause_StartIndex = input.index();
        Token lv_isPublic_0_0=null;
        Token lv_isProtected_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token lv_isOver_12_0=null;
        EObject this_type_specifier_3 = null;

        EObject lv_extendsModifications_5_0 = null;

        EObject lv_breaks_6_0 = null;

        EObject lv_extendsModifications_8_0 = null;

        EObject lv_breaks_9_0 = null;

        EObject this_annotation_modification_part_11 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // InternalMOloc.g:1250:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (this_annotation_modification_part_11= ruleannotation_modification_part[$current] )? ( (lv_isOver_12_0= ';' ) ) ) )
            // InternalMOloc.g:1251:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (this_annotation_modification_part_11= ruleannotation_modification_part[$current] )? ( (lv_isOver_12_0= ';' ) ) )
            {
            // InternalMOloc.g:1251:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (this_annotation_modification_part_11= ruleannotation_modification_part[$current] )? ( (lv_isOver_12_0= ';' ) ) )
            // InternalMOloc.g:1252:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? otherlv_2= 'extends' this_type_specifier_3= ruletype_specifier[$current] (otherlv_4= '(' ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )? (this_annotation_modification_part_11= ruleannotation_modification_part[$current] )? ( (lv_isOver_12_0= ';' ) )
            {
            // InternalMOloc.g:1252:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMOloc.g:1253:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:1253:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:1254:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,27,FOLLOW_22); if (state.failed) return current;
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

            // InternalMOloc.g:1266:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMOloc.g:1267:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:1267:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:1268:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,28,FOLLOW_23); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,37,FOLLOW_24); if (state.failed) return current;
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
            pushFollow(FOLLOW_25);
            this_type_specifier_3=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:1298:3: (otherlv_4= '(' ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMOloc.g:1299:4: otherlv_4= '(' ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExtendsClauseAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalMOloc.g:1303:4: ( ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_IDENT||(LA35_0>=20 && LA35_0<=23)||LA35_0==32||LA35_0==55||(LA35_0>=58 && LA35_0<=63)||(LA35_0>=87 && LA35_0<=105)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMOloc.g:1304:5: ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) ) (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )*
                            {
                            // InternalMOloc.g:1304:5: ( ( (lv_extendsModifications_5_0= ruleModificationElement ) ) | ( (lv_breaks_6_0= ruleBreak ) ) )
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==RULE_IDENT||(LA32_0>=20 && LA32_0<=23)||LA32_0==32||(LA32_0>=58 && LA32_0<=63)||(LA32_0>=87 && LA32_0<=105)) ) {
                                alt32=1;
                            }
                            else if ( (LA32_0==55) ) {
                                alt32=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 0, input);

                                throw nvae;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalMOloc.g:1305:6: ( (lv_extendsModifications_5_0= ruleModificationElement ) )
                                    {
                                    // InternalMOloc.g:1305:6: ( (lv_extendsModifications_5_0= ruleModificationElement ) )
                                    // InternalMOloc.g:1306:7: (lv_extendsModifications_5_0= ruleModificationElement )
                                    {
                                    // InternalMOloc.g:1306:7: (lv_extendsModifications_5_0= ruleModificationElement )
                                    // InternalMOloc.g:1307:8: lv_extendsModifications_5_0= ruleModificationElement
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExtendsClauseAccess().getExtendsModificationsModificationElementParserRuleCall_4_1_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_27);
                                    lv_extendsModifications_5_0=ruleModificationElement();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                                      								}
                                      								add(
                                      									current,
                                      									"extendsModifications",
                                      									lv_extendsModifications_5_0,
                                      									"dut.control.moloc.MOloc.ModificationElement");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalMOloc.g:1325:6: ( (lv_breaks_6_0= ruleBreak ) )
                                    {
                                    // InternalMOloc.g:1325:6: ( (lv_breaks_6_0= ruleBreak ) )
                                    // InternalMOloc.g:1326:7: (lv_breaks_6_0= ruleBreak )
                                    {
                                    // InternalMOloc.g:1326:7: (lv_breaks_6_0= ruleBreak )
                                    // InternalMOloc.g:1327:8: lv_breaks_6_0= ruleBreak
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_4_1_0_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_27);
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

                            // InternalMOloc.g:1345:5: (otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==35) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalMOloc.g:1346:6: otherlv_7= ',' ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) )
                            	    {
                            	    otherlv_7=(Token)match(input,35,FOLLOW_28); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_7, grammarAccess.getExtendsClauseAccess().getCommaKeyword_4_1_1_0());
                            	      					
                            	    }
                            	    // InternalMOloc.g:1350:6: ( ( (lv_extendsModifications_8_0= ruleModificationElement ) ) | ( (lv_breaks_9_0= ruleBreak ) ) )
                            	    int alt33=2;
                            	    int LA33_0 = input.LA(1);

                            	    if ( (LA33_0==RULE_IDENT||(LA33_0>=20 && LA33_0<=23)||LA33_0==32||(LA33_0>=58 && LA33_0<=63)||(LA33_0>=87 && LA33_0<=105)) ) {
                            	        alt33=1;
                            	    }
                            	    else if ( (LA33_0==55) ) {
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
                            	            // InternalMOloc.g:1351:7: ( (lv_extendsModifications_8_0= ruleModificationElement ) )
                            	            {
                            	            // InternalMOloc.g:1351:7: ( (lv_extendsModifications_8_0= ruleModificationElement ) )
                            	            // InternalMOloc.g:1352:8: (lv_extendsModifications_8_0= ruleModificationElement )
                            	            {
                            	            // InternalMOloc.g:1352:8: (lv_extendsModifications_8_0= ruleModificationElement )
                            	            // InternalMOloc.g:1353:9: lv_extendsModifications_8_0= ruleModificationElement
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              									newCompositeNode(grammarAccess.getExtendsClauseAccess().getExtendsModificationsModificationElementParserRuleCall_4_1_1_1_0_0());
                            	              								
                            	            }
                            	            pushFollow(FOLLOW_27);
                            	            lv_extendsModifications_8_0=ruleModificationElement();

                            	            state._fsp--;
                            	            if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              									if (current==null) {
                            	              										current = createModelElementForParent(grammarAccess.getExtendsClauseRule());
                            	              									}
                            	              									add(
                            	              										current,
                            	              										"extendsModifications",
                            	              										lv_extendsModifications_8_0,
                            	              										"dut.control.moloc.MOloc.ModificationElement");
                            	              									afterParserOrEnumRuleCall();
                            	              								
                            	            }

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalMOloc.g:1371:7: ( (lv_breaks_9_0= ruleBreak ) )
                            	            {
                            	            // InternalMOloc.g:1371:7: ( (lv_breaks_9_0= ruleBreak ) )
                            	            // InternalMOloc.g:1372:8: (lv_breaks_9_0= ruleBreak )
                            	            {
                            	            // InternalMOloc.g:1372:8: (lv_breaks_9_0= ruleBreak )
                            	            // InternalMOloc.g:1373:9: lv_breaks_9_0= ruleBreak
                            	            {
                            	            if ( state.backtracking==0 ) {

                            	              									newCompositeNode(grammarAccess.getExtendsClauseAccess().getBreaksBreakParserRuleCall_4_1_1_1_1_0());
                            	              								
                            	            }
                            	            pushFollow(FOLLOW_27);
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
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,39,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExtendsClauseAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:1398:3: (this_annotation_modification_part_11= ruleannotation_modification_part[$current] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMOloc.g:1399:4: this_annotation_modification_part_11= ruleannotation_modification_part[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getExtendsClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getExtendsClauseAccess().getAnnotation_modification_partParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_annotation_modification_part_11=ruleannotation_modification_part(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_annotation_modification_part_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:1414:3: ( (lv_isOver_12_0= ';' ) )
            // InternalMOloc.g:1415:4: (lv_isOver_12_0= ';' )
            {
            // InternalMOloc.g:1415:4: (lv_isOver_12_0= ';' )
            // InternalMOloc.g:1416:5: lv_isOver_12_0= ';'
            {
            lv_isOver_12_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isOver_12_0, grammarAccess.getExtendsClauseAccess().getIsOverSemicolonKeyword_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExtendsClauseRule());
              					}
              					setWithLastConsumed(current, "isOver", lv_isOver_12_0 != null, ";");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleExtendsClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExtendsClause"


    // $ANTLR start "entryRuleComponentClause"
    // InternalMOloc.g:1432:1: entryRuleComponentClause returns [EObject current=null] : iv_ruleComponentClause= ruleComponentClause EOF ;
    public final EObject entryRuleComponentClause() throws RecognitionException {
        EObject current = null;
        int entryRuleComponentClause_StartIndex = input.index();
        EObject iv_ruleComponentClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // InternalMOloc.g:1432:56: (iv_ruleComponentClause= ruleComponentClause EOF )
            // InternalMOloc.g:1433:2: iv_ruleComponentClause= ruleComponentClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentClause=ruleComponentClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleComponentClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClause"


    // $ANTLR start "ruleComponentClause"
    // InternalMOloc.g:1439:1: ruleComponentClause returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] ( (lv_description1_16_0= ruleDescriptionString ) )? ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )? )? ( (lv_isOver_23_0= ';' ) ) ) ;
    public final EObject ruleComponentClause() throws RecognitionException {
        EObject current = null;
        int ruleComponentClause_StartIndex = input.index();
        Token lv_isPublic_0_0=null;
        Token lv_isProtected_1_0=null;
        Token lv_isRedeclare_2_0=null;
        Token lv_isfinal_3_0=null;
        Token lv_isInner_4_0=null;
        Token lv_isOuter_5_0=null;
        Token lv_isReplaceable_6_0=null;
        Token otherlv_13=null;
        Token lv_isAnnotation1_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_isAnnotationOver1_22_0=null;
        Token lv_isOver_23_0=null;
        EObject this_class_prefixes_7 = null;

        EObject this_class_specifier_8 = null;

        EObject this_type_prefix_9 = null;

        EObject this_type_specifier_10 = null;

        EObject this_array_subscripts_11 = null;

        EObject lv_component_list_12_0 = null;

        EObject lv_component_list_14_0 = null;

        EObject this_constraining_15 = null;

        AntlrDatatypeRuleToken lv_description1_16_0 = null;

        EObject lv_annotations1_19_0 = null;

        EObject lv_annotations1_21_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // InternalMOloc.g:1445:2: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] ( (lv_description1_16_0= ruleDescriptionString ) )? ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )? )? ( (lv_isOver_23_0= ';' ) ) ) )
            // InternalMOloc.g:1446:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] ( (lv_description1_16_0= ruleDescriptionString ) )? ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )? )? ( (lv_isOver_23_0= ';' ) ) )
            {
            // InternalMOloc.g:1446:2: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] ( (lv_description1_16_0= ruleDescriptionString ) )? ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )? )? ( (lv_isOver_23_0= ';' ) ) )
            // InternalMOloc.g:1447:3: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_isProtected_1_0= 'protected' ) )? ( (lv_isRedeclare_2_0= 'redeclare' ) )? ( (lv_isfinal_3_0= 'final' ) )? ( (lv_isInner_4_0= 'inner' ) )? ( (lv_isOuter_5_0= 'outer' ) )? ( (lv_isReplaceable_6_0= 'replaceable' ) )? ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) ) (this_constraining_15= ruleconstraining[$current] ( (lv_description1_16_0= ruleDescriptionString ) )? ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )? )? ( (lv_isOver_23_0= ';' ) )
            {
            // InternalMOloc.g:1447:3: ( (lv_isPublic_0_0= 'public' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMOloc.g:1448:4: (lv_isPublic_0_0= 'public' )
                    {
                    // InternalMOloc.g:1448:4: (lv_isPublic_0_0= 'public' )
                    // InternalMOloc.g:1449:5: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,27,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isPublic_0_0, grammarAccess.getComponentClauseAccess().getIsPublicPublicKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					setWithLastConsumed(current, "isPublic", lv_isPublic_0_0 != null, "public");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1461:3: ( (lv_isProtected_1_0= 'protected' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMOloc.g:1462:4: (lv_isProtected_1_0= 'protected' )
                    {
                    // InternalMOloc.g:1462:4: (lv_isProtected_1_0= 'protected' )
                    // InternalMOloc.g:1463:5: lv_isProtected_1_0= 'protected'
                    {
                    lv_isProtected_1_0=(Token)match(input,28,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isProtected_1_0, grammarAccess.getComponentClauseAccess().getIsProtectedProtectedKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					setWithLastConsumed(current, "isProtected", lv_isProtected_1_0 != null, "protected");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1475:3: ( (lv_isRedeclare_2_0= 'redeclare' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMOloc.g:1476:4: (lv_isRedeclare_2_0= 'redeclare' )
                    {
                    // InternalMOloc.g:1476:4: (lv_isRedeclare_2_0= 'redeclare' )
                    // InternalMOloc.g:1477:5: lv_isRedeclare_2_0= 'redeclare'
                    {
                    lv_isRedeclare_2_0=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isRedeclare_2_0, grammarAccess.getComponentClauseAccess().getIsRedeclareRedeclareKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					setWithLastConsumed(current, "isRedeclare", lv_isRedeclare_2_0 != null, "redeclare");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1489:3: ( (lv_isfinal_3_0= 'final' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMOloc.g:1490:4: (lv_isfinal_3_0= 'final' )
                    {
                    // InternalMOloc.g:1490:4: (lv_isfinal_3_0= 'final' )
                    // InternalMOloc.g:1491:5: lv_isfinal_3_0= 'final'
                    {
                    lv_isfinal_3_0=(Token)match(input,20,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isfinal_3_0, grammarAccess.getComponentClauseAccess().getIsfinalFinalKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					setWithLastConsumed(current, "isfinal", lv_isfinal_3_0 != null, "final");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1503:3: ( (lv_isInner_4_0= 'inner' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMOloc.g:1504:4: (lv_isInner_4_0= 'inner' )
                    {
                    // InternalMOloc.g:1504:4: (lv_isInner_4_0= 'inner' )
                    // InternalMOloc.g:1505:5: lv_isInner_4_0= 'inner'
                    {
                    lv_isInner_4_0=(Token)match(input,40,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isInner_4_0, grammarAccess.getComponentClauseAccess().getIsInnerInnerKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					setWithLastConsumed(current, "isInner", lv_isInner_4_0 != null, "inner");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1517:3: ( (lv_isOuter_5_0= 'outer' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMOloc.g:1518:4: (lv_isOuter_5_0= 'outer' )
                    {
                    // InternalMOloc.g:1518:4: (lv_isOuter_5_0= 'outer' )
                    // InternalMOloc.g:1519:5: lv_isOuter_5_0= 'outer'
                    {
                    lv_isOuter_5_0=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isOuter_5_0, grammarAccess.getComponentClauseAccess().getIsOuterOuterKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					setWithLastConsumed(current, "isOuter", lv_isOuter_5_0 != null, "outer");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1531:3: ( (lv_isReplaceable_6_0= 'replaceable' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMOloc.g:1532:4: (lv_isReplaceable_6_0= 'replaceable' )
                    {
                    // InternalMOloc.g:1532:4: (lv_isReplaceable_6_0= 'replaceable' )
                    // InternalMOloc.g:1533:5: lv_isReplaceable_6_0= 'replaceable'
                    {
                    lv_isReplaceable_6_0=(Token)match(input,23,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isReplaceable_6_0, grammarAccess.getComponentClauseAccess().getIsReplaceableReplaceableKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					setWithLastConsumed(current, "isReplaceable", lv_isReplaceable_6_0 != null, "replaceable");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1545:3: ( (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] ) | (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=58 && LA47_0<=63)||(LA47_0>=87 && LA47_0<=95)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_IDENT||LA47_0==32||(LA47_0>=96 && LA47_0<=105)) ) {
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
                    // InternalMOloc.g:1546:4: (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] )
                    {
                    // InternalMOloc.g:1546:4: (this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current] )
                    // InternalMOloc.g:1547:5: this_class_prefixes_7= ruleclass_prefixes[$current] this_class_specifier_8= ruleclass_specifier[$current]
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getComponentClauseAccess().getClass_prefixesParserRuleCall_7_0_0());
                      				
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
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getComponentClauseAccess().getClass_specifierParserRuleCall_7_0_1());
                      				
                    }
                    pushFollow(FOLLOW_36);
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
                    // InternalMOloc.g:1577:4: (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* )
                    {
                    // InternalMOloc.g:1577:4: (this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )* )
                    // InternalMOloc.g:1578:5: this_type_prefix_9= ruletype_prefix[$current] this_type_specifier_10= ruletype_specifier[$current] (this_array_subscripts_11= rulearray_subscripts[$current] )? ( (lv_component_list_12_0= ruleComponent_declaration ) ) (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getComponentClauseAccess().getType_prefixParserRuleCall_7_1_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
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
                      						current = createModelElement(grammarAccess.getComponentClauseRule());
                      					}
                      					newCompositeNode(grammarAccess.getComponentClauseAccess().getType_specifierParserRuleCall_7_1_1());
                      				
                    }
                    pushFollow(FOLLOW_37);
                    this_type_specifier_10=ruletype_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_type_specifier_10;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMOloc.g:1606:5: (this_array_subscripts_11= rulearray_subscripts[$current] )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==69) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMOloc.g:1607:6: this_array_subscripts_11= rulearray_subscripts[$current]
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getComponentClauseRule());
                              						}
                              						newCompositeNode(grammarAccess.getComponentClauseAccess().getArray_subscriptsParserRuleCall_7_1_2());
                              					
                            }
                            pushFollow(FOLLOW_37);
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

                    // InternalMOloc.g:1622:5: ( (lv_component_list_12_0= ruleComponent_declaration ) )
                    // InternalMOloc.g:1623:6: (lv_component_list_12_0= ruleComponent_declaration )
                    {
                    // InternalMOloc.g:1623:6: (lv_component_list_12_0= ruleComponent_declaration )
                    // InternalMOloc.g:1624:7: lv_component_list_12_0= ruleComponent_declaration
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getComponentClauseAccess().getComponent_listComponent_declarationParserRuleCall_7_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_38);
                    lv_component_list_12_0=ruleComponent_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getComponentClauseRule());
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

                    // InternalMOloc.g:1641:5: (otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==35) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalMOloc.g:1642:6: otherlv_13= ',' ( (lv_component_list_14_0= ruleComponent_declaration ) )
                    	    {
                    	    otherlv_13=(Token)match(input,35,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_13, grammarAccess.getComponentClauseAccess().getCommaKeyword_7_1_4_0());
                    	      					
                    	    }
                    	    // InternalMOloc.g:1646:6: ( (lv_component_list_14_0= ruleComponent_declaration ) )
                    	    // InternalMOloc.g:1647:7: (lv_component_list_14_0= ruleComponent_declaration )
                    	    {
                    	    // InternalMOloc.g:1647:7: (lv_component_list_14_0= ruleComponent_declaration )
                    	    // InternalMOloc.g:1648:8: lv_component_list_14_0= ruleComponent_declaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getComponentClauseAccess().getComponent_listComponent_declarationParserRuleCall_7_1_4_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    lv_component_list_14_0=ruleComponent_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getComponentClauseRule());
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
                    	    break loop46;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalMOloc.g:1668:3: (this_constraining_15= ruleconstraining[$current] ( (lv_description1_16_0= ruleDescriptionString ) )? ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==67) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMOloc.g:1669:4: this_constraining_15= ruleconstraining[$current] ( (lv_description1_16_0= ruleDescriptionString ) )? ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getComponentClauseRule());
                      				}
                      				newCompositeNode(grammarAccess.getComponentClauseAccess().getConstrainingParserRuleCall_8_0());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_constraining_15=ruleconstraining(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_constraining_15;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:1683:4: ( (lv_description1_16_0= ruleDescriptionString ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_STRING) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMOloc.g:1684:5: (lv_description1_16_0= ruleDescriptionString )
                            {
                            // InternalMOloc.g:1684:5: (lv_description1_16_0= ruleDescriptionString )
                            // InternalMOloc.g:1685:6: lv_description1_16_0= ruleDescriptionString
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getComponentClauseAccess().getDescription1DescriptionStringParserRuleCall_8_1_0());
                              					
                            }
                            pushFollow(FOLLOW_29);
                            lv_description1_16_0=ruleDescriptionString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getComponentClauseRule());
                              						}
                              						set(
                              							current,
                              							"description1",
                              							lv_description1_16_0,
                              							"dut.control.moloc.MOloc.DescriptionString");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalMOloc.g:1702:4: ( ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==42) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalMOloc.g:1703:5: ( (lv_isAnnotation1_17_0= 'annotation' ) ) otherlv_18= '(' ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) ) (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver1_22_0= ')' ) )
                            {
                            // InternalMOloc.g:1703:5: ( (lv_isAnnotation1_17_0= 'annotation' ) )
                            // InternalMOloc.g:1704:6: (lv_isAnnotation1_17_0= 'annotation' )
                            {
                            // InternalMOloc.g:1704:6: (lv_isAnnotation1_17_0= 'annotation' )
                            // InternalMOloc.g:1705:7: lv_isAnnotation1_17_0= 'annotation'
                            {
                            lv_isAnnotation1_17_0=(Token)match(input,42,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_isAnnotation1_17_0, grammarAccess.getComponentClauseAccess().getIsAnnotation1AnnotationKeyword_8_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getComponentClauseRule());
                              							}
                              							setWithLastConsumed(current, "isAnnotation1", lv_isAnnotation1_17_0 != null, "annotation");
                              						
                            }

                            }


                            }

                            otherlv_18=(Token)match(input,38,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getComponentClauseAccess().getLeftParenthesisKeyword_8_2_1());
                              				
                            }
                            // InternalMOloc.g:1721:5: ( (lv_annotations1_19_0= ruleAnnotationModificationElement ) )
                            // InternalMOloc.g:1722:6: (lv_annotations1_19_0= ruleAnnotationModificationElement )
                            {
                            // InternalMOloc.g:1722:6: (lv_annotations1_19_0= ruleAnnotationModificationElement )
                            // InternalMOloc.g:1723:7: lv_annotations1_19_0= ruleAnnotationModificationElement
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getComponentClauseAccess().getAnnotations1AnnotationModificationElementParserRuleCall_8_2_2_0());
                              						
                            }
                            pushFollow(FOLLOW_27);
                            lv_annotations1_19_0=ruleAnnotationModificationElement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getComponentClauseRule());
                              							}
                              							add(
                              								current,
                              								"annotations1",
                              								lv_annotations1_19_0,
                              								"dut.control.moloc.MOloc.AnnotationModificationElement");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMOloc.g:1740:5: (otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==35) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // InternalMOloc.g:1741:6: otherlv_20= ',' ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) )
                            	    {
                            	    otherlv_20=(Token)match(input,35,FOLLOW_41); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_20, grammarAccess.getComponentClauseAccess().getCommaKeyword_8_2_3_0());
                            	      					
                            	    }
                            	    // InternalMOloc.g:1745:6: ( (lv_annotations1_21_0= ruleAnnotationModificationElement ) )
                            	    // InternalMOloc.g:1746:7: (lv_annotations1_21_0= ruleAnnotationModificationElement )
                            	    {
                            	    // InternalMOloc.g:1746:7: (lv_annotations1_21_0= ruleAnnotationModificationElement )
                            	    // InternalMOloc.g:1747:8: lv_annotations1_21_0= ruleAnnotationModificationElement
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getComponentClauseAccess().getAnnotations1AnnotationModificationElementParserRuleCall_8_2_3_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_27);
                            	    lv_annotations1_21_0=ruleAnnotationModificationElement();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getComponentClauseRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"annotations1",
                            	      									lv_annotations1_21_0,
                            	      									"dut.control.moloc.MOloc.AnnotationModificationElement");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);

                            // InternalMOloc.g:1765:5: ( (lv_isAnnotationOver1_22_0= ')' ) )
                            // InternalMOloc.g:1766:6: (lv_isAnnotationOver1_22_0= ')' )
                            {
                            // InternalMOloc.g:1766:6: (lv_isAnnotationOver1_22_0= ')' )
                            // InternalMOloc.g:1767:7: lv_isAnnotationOver1_22_0= ')'
                            {
                            lv_isAnnotationOver1_22_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_isAnnotationOver1_22_0, grammarAccess.getComponentClauseAccess().getIsAnnotationOver1RightParenthesisKeyword_8_2_4_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getComponentClauseRule());
                              							}
                              							setWithLastConsumed(current, "isAnnotationOver1", lv_isAnnotationOver1_22_0 != null, ")");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMOloc.g:1781:3: ( (lv_isOver_23_0= ';' ) )
            // InternalMOloc.g:1782:4: (lv_isOver_23_0= ';' )
            {
            // InternalMOloc.g:1782:4: (lv_isOver_23_0= ';' )
            // InternalMOloc.g:1783:5: lv_isOver_23_0= ';'
            {
            lv_isOver_23_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isOver_23_0, grammarAccess.getComponentClauseAccess().getIsOverSemicolonKeyword_9_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentClauseRule());
              					}
              					setWithLastConsumed(current, "isOver", lv_isOver_23_0 != null, ";");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleComponentClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponentClause"


    // $ANTLR start "entryRuleComponent_declaration"
    // InternalMOloc.g:1799:1: entryRuleComponent_declaration returns [EObject current=null] : iv_ruleComponent_declaration= ruleComponent_declaration EOF ;
    public final EObject entryRuleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int entryRuleComponent_declaration_StartIndex = input.index();
        EObject iv_ruleComponent_declaration = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // InternalMOloc.g:1799:62: (iv_ruleComponent_declaration= ruleComponent_declaration EOF )
            // InternalMOloc.g:1800:2: iv_ruleComponent_declaration= ruleComponent_declaration EOF
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
            if ( state.backtracking>0 ) { memoize(input, 29, entryRuleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_declaration"


    // $ANTLR start "ruleComponent_declaration"
    // InternalMOloc.g:1806:1: ruleComponent_declaration returns [EObject current=null] : (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) ;
    public final EObject ruleComponent_declaration() throws RecognitionException {
        EObject current = null;
        int ruleComponent_declaration_StartIndex = input.index();
        Token otherlv_1=null;
        EObject this_declaration_0 = null;

        AntlrDatatypeRuleToken lv_condition_attribute_2_0 = null;

        EObject this_description_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // InternalMOloc.g:1812:2: ( (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] ) )
            // InternalMOloc.g:1813:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            {
            // InternalMOloc.g:1813:2: (this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current] )
            // InternalMOloc.g:1814:3: this_declaration_0= ruledeclaration[$current] (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )? this_description_3= ruledescription[$current]
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
            pushFollow(FOLLOW_42);
            this_declaration_0=ruledeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_declaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:1828:3: (otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMOloc.g:1829:4: otherlv_1= 'if' ( (lv_condition_attribute_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getComponent_declarationAccess().getIfKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:1833:4: ( (lv_condition_attribute_2_0= ruleExpression ) )
                    // InternalMOloc.g:1834:5: (lv_condition_attribute_2_0= ruleExpression )
                    {
                    // InternalMOloc.g:1834:5: (lv_condition_attribute_2_0= ruleExpression )
                    // InternalMOloc.g:1835:6: lv_condition_attribute_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComponent_declarationAccess().getCondition_attributeExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
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
            if ( state.backtracking>0 ) { memoize(input, 30, ruleComponent_declaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_declaration"


    // $ANTLR start "entryRuleExternalElement"
    // InternalMOloc.g:1871:1: entryRuleExternalElement returns [EObject current=null] : iv_ruleExternalElement= ruleExternalElement EOF ;
    public final EObject entryRuleExternalElement() throws RecognitionException {
        EObject current = null;
        int entryRuleExternalElement_StartIndex = input.index();
        EObject iv_ruleExternalElement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // InternalMOloc.g:1871:56: (iv_ruleExternalElement= ruleExternalElement EOF )
            // InternalMOloc.g:1872:2: iv_ruleExternalElement= ruleExternalElement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalElement"


    // $ANTLR start "ruleExternalElement"
    // InternalMOloc.g:1878:1: ruleExternalElement returns [EObject current=null] : ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? (this_annotation_modification_part_9= ruleannotation_modification_part[$current] )? ( (lv_isOver_10_0= ';' ) ) ) ;
    public final EObject ruleExternalElement() throws RecognitionException {
        EObject current = null;
        int ruleExternalElement_StartIndex = input.index();
        Token otherlv_1=null;
        Token lv_language_specification_2_0=null;
        Token otherlv_4=null;
        Token lv_refValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_isOver_10_0=null;
        AntlrDatatypeRuleToken lv_ref_3_0 = null;

        AntlrDatatypeRuleToken lv_expressionList_7_0 = null;

        EObject this_annotation_modification_part_9 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // InternalMOloc.g:1884:2: ( ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? (this_annotation_modification_part_9= ruleannotation_modification_part[$current] )? ( (lv_isOver_10_0= ';' ) ) ) )
            // InternalMOloc.g:1885:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? (this_annotation_modification_part_9= ruleannotation_modification_part[$current] )? ( (lv_isOver_10_0= ';' ) ) )
            {
            // InternalMOloc.g:1885:2: ( () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? (this_annotation_modification_part_9= ruleannotation_modification_part[$current] )? ( (lv_isOver_10_0= ';' ) ) )
            // InternalMOloc.g:1886:3: () otherlv_1= 'external' ( (lv_language_specification_2_0= RULE_STRING ) )? ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )? (this_annotation_modification_part_9= ruleannotation_modification_part[$current] )? ( (lv_isOver_10_0= ';' ) )
            {
            // InternalMOloc.g:1886:3: ()
            // InternalMOloc.g:1887:4: 
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

            otherlv_1=(Token)match(input,44,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExternalElementAccess().getExternalKeyword_1());
              		
            }
            // InternalMOloc.g:1900:3: ( (lv_language_specification_2_0= RULE_STRING ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMOloc.g:1901:4: (lv_language_specification_2_0= RULE_STRING )
                    {
                    // InternalMOloc.g:1901:4: (lv_language_specification_2_0= RULE_STRING )
                    // InternalMOloc.g:1902:5: lv_language_specification_2_0= RULE_STRING
                    {
                    lv_language_specification_2_0=(Token)match(input,RULE_STRING,FOLLOW_45); if (state.failed) return current;
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

            // InternalMOloc.g:1918:3: ( ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_IDENT||LA56_0==32) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMOloc.g:1919:4: ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )? ( (lv_refValue_5_0= RULE_IDENT ) ) otherlv_6= '(' ( (lv_expressionList_7_0= ruleExpressionList ) )? otherlv_8= ')'
                    {
                    // InternalMOloc.g:1919:4: ( ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '=' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==32) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==RULE_IDENT) ) {
                        int LA54_2 = input.LA(2);

                        if ( (LA54_2==30||LA54_2==32||LA54_2==69) ) {
                            alt54=1;
                        }
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalMOloc.g:1920:5: ( (lv_ref_3_0= ruleComponent_reference ) ) otherlv_4= '='
                            {
                            // InternalMOloc.g:1920:5: ( (lv_ref_3_0= ruleComponent_reference ) )
                            // InternalMOloc.g:1921:6: (lv_ref_3_0= ruleComponent_reference )
                            {
                            // InternalMOloc.g:1921:6: (lv_ref_3_0= ruleComponent_reference )
                            // InternalMOloc.g:1922:7: lv_ref_3_0= ruleComponent_reference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExternalElementAccess().getRefComponent_referenceParserRuleCall_3_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
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

                            otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getExternalElementAccess().getEqualsSignKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMOloc.g:1944:4: ( (lv_refValue_5_0= RULE_IDENT ) )
                    // InternalMOloc.g:1945:5: (lv_refValue_5_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:1945:5: (lv_refValue_5_0= RULE_IDENT )
                    // InternalMOloc.g:1946:6: lv_refValue_5_0= RULE_IDENT
                    {
                    lv_refValue_5_0=(Token)match(input,RULE_IDENT,FOLLOW_40); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,38,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExternalElementAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalMOloc.g:1966:4: ( (lv_expressionList_7_0= ruleExpressionList ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=RULE_IDENT && LA55_0<=RULE_TRUE_FALSE)||LA55_0==24||LA55_0==32||LA55_0==34||LA55_0==38||LA55_0==43||LA55_0==48||LA55_0==61||LA55_0==66||(LA55_0>=68 && LA55_0<=69)||LA55_0==73||(LA55_0>=80 && LA55_0<=82)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalMOloc.g:1967:5: (lv_expressionList_7_0= ruleExpressionList )
                            {
                            // InternalMOloc.g:1967:5: (lv_expressionList_7_0= ruleExpressionList )
                            // InternalMOloc.g:1968:6: lv_expressionList_7_0= ruleExpressionList
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getExternalElementAccess().getExpressionListExpressionListParserRuleCall_3_3_0());
                              					
                            }
                            pushFollow(FOLLOW_47);
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

                    otherlv_8=(Token)match(input,39,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExternalElementAccess().getRightParenthesisKeyword_3_4());
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:1990:3: (this_annotation_modification_part_9= ruleannotation_modification_part[$current] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==42) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMOloc.g:1991:4: this_annotation_modification_part_9= ruleannotation_modification_part[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getExternalElementRule());
                      				}
                      				newCompositeNode(grammarAccess.getExternalElementAccess().getAnnotation_modification_partParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_annotation_modification_part_9=ruleannotation_modification_part(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_annotation_modification_part_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMOloc.g:2006:3: ( (lv_isOver_10_0= ';' ) )
            // InternalMOloc.g:2007:4: (lv_isOver_10_0= ';' )
            {
            // InternalMOloc.g:2007:4: (lv_isOver_10_0= ';' )
            // InternalMOloc.g:2008:5: lv_isOver_10_0= ';'
            {
            lv_isOver_10_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isOver_10_0, grammarAccess.getExternalElementAccess().getIsOverSemicolonKeyword_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExternalElementRule());
              					}
              					setWithLastConsumed(current, "isOver", lv_isOver_10_0 != null, ";");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleExternalElement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExternalElement"


    // $ANTLR start "entryRuleAnnotationClause"
    // InternalMOloc.g:2024:1: entryRuleAnnotationClause returns [EObject current=null] : iv_ruleAnnotationClause= ruleAnnotationClause EOF ;
    public final EObject entryRuleAnnotationClause() throws RecognitionException {
        EObject current = null;
        int entryRuleAnnotationClause_StartIndex = input.index();
        EObject iv_ruleAnnotationClause = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // InternalMOloc.g:2024:57: (iv_ruleAnnotationClause= ruleAnnotationClause EOF )
            // InternalMOloc.g:2025:2: iv_ruleAnnotationClause= ruleAnnotationClause EOF
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
            if ( state.backtracking>0 ) { memoize(input, 33, entryRuleAnnotationClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationClause"


    // $ANTLR start "ruleAnnotationClause"
    // InternalMOloc.g:2031:1: ruleAnnotationClause returns [EObject current=null] : (this_annotation_modification_part_0= ruleannotation_modification_part[$current] ( (lv_isOver_1_0= ';' ) ) ) ;
    public final EObject ruleAnnotationClause() throws RecognitionException {
        EObject current = null;
        int ruleAnnotationClause_StartIndex = input.index();
        Token lv_isOver_1_0=null;
        EObject this_annotation_modification_part_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // InternalMOloc.g:2037:2: ( (this_annotation_modification_part_0= ruleannotation_modification_part[$current] ( (lv_isOver_1_0= ';' ) ) ) )
            // InternalMOloc.g:2038:2: (this_annotation_modification_part_0= ruleannotation_modification_part[$current] ( (lv_isOver_1_0= ';' ) ) )
            {
            // InternalMOloc.g:2038:2: (this_annotation_modification_part_0= ruleannotation_modification_part[$current] ( (lv_isOver_1_0= ';' ) ) )
            // InternalMOloc.g:2039:3: this_annotation_modification_part_0= ruleannotation_modification_part[$current] ( (lv_isOver_1_0= ';' ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getAnnotationClauseRule());
              			}
              			newCompositeNode(grammarAccess.getAnnotationClauseAccess().getAnnotation_modification_partParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            this_annotation_modification_part_0=ruleannotation_modification_part(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_annotation_modification_part_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:2053:3: ( (lv_isOver_1_0= ';' ) )
            // InternalMOloc.g:2054:4: (lv_isOver_1_0= ';' )
            {
            // InternalMOloc.g:2054:4: (lv_isOver_1_0= ';' )
            // InternalMOloc.g:2055:5: lv_isOver_1_0= ';'
            {
            lv_isOver_1_0=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isOver_1_0, grammarAccess.getAnnotationClauseAccess().getIsOverSemicolonKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnotationClauseRule());
              					}
              					setWithLastConsumed(current, "isOver", lv_isOver_1_0 != null, ";");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 34, ruleAnnotationClause_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationClause"


    // $ANTLR start "entryRuleSimpleEquation"
    // InternalMOloc.g:2071:1: entryRuleSimpleEquation returns [EObject current=null] : iv_ruleSimpleEquation= ruleSimpleEquation EOF ;
    public final EObject entryRuleSimpleEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleSimpleEquation_StartIndex = input.index();
        EObject iv_ruleSimpleEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // InternalMOloc.g:2071:55: (iv_ruleSimpleEquation= ruleSimpleEquation EOF )
            // InternalMOloc.g:2072:2: iv_ruleSimpleEquation= ruleSimpleEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleSimpleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleEquation"


    // $ANTLR start "ruleSimpleEquation"
    // InternalMOloc.g:2078:1: ruleSimpleEquation returns [EObject current=null] : ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // InternalMOloc.g:2084:2: ( ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' ) )
            // InternalMOloc.g:2085:2: ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' )
            {
            // InternalMOloc.g:2085:2: ( ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';' )
            // InternalMOloc.g:2086:3: ( (lv_left_0_0= ruleSimple_expression ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExpression ) ) this_description_3= ruledescription[$current] otherlv_4= ';'
            {
            // InternalMOloc.g:2086:3: ( (lv_left_0_0= ruleSimple_expression ) )
            // InternalMOloc.g:2087:4: (lv_left_0_0= ruleSimple_expression )
            {
            // InternalMOloc.g:2087:4: (lv_left_0_0= ruleSimple_expression )
            // InternalMOloc.g:2088:5: lv_left_0_0= ruleSimple_expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleEquationAccess().getLeftSimple_expressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_1=(Token)match(input,30,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSimpleEquationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMOloc.g:2109:3: ( (lv_right_2_0= ruleExpression ) )
            // InternalMOloc.g:2110:4: (lv_right_2_0= ruleExpression )
            {
            // InternalMOloc.g:2110:4: (lv_right_2_0= ruleExpression )
            // InternalMOloc.g:2111:5: lv_right_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleEquationAccess().getRightExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleSimpleEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSimpleEquation"


    // $ANTLR start "entryRuleIfEquation"
    // InternalMOloc.g:2150:1: entryRuleIfEquation returns [EObject current=null] : iv_ruleIfEquation= ruleIfEquation EOF ;
    public final EObject entryRuleIfEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleIfEquation_StartIndex = input.index();
        EObject iv_ruleIfEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // InternalMOloc.g:2150:51: (iv_ruleIfEquation= ruleIfEquation EOF )
            // InternalMOloc.g:2151:2: iv_ruleIfEquation= ruleIfEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleIfEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfEquation"


    // $ANTLR start "ruleIfEquation"
    // InternalMOloc.g:2157:1: ruleIfEquation returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // InternalMOloc.g:2163:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) )
            // InternalMOloc.g:2164:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            {
            // InternalMOloc.g:2164:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            // InternalMOloc.g:2165:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifEquations_3_0= ruleEquation ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )* (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfEquationAccess().getIfKeyword_0());
              		
            }
            // InternalMOloc.g:2169:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:2170:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:2170:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:2171:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfEquationAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            otherlv_2=(Token)match(input,45,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfEquationAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:2192:3: ( (lv_ifEquations_3_0= ruleEquation ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==48) ) {
                    int LA58_2 = input.LA(2);

                    if ( ((LA58_2>=30 && LA58_2<=31)||LA58_2==33||LA58_2==65||LA58_2==68||(LA58_2>=71 && LA58_2<=72)||(LA58_2>=74 && LA58_2<=85)) ) {
                        alt58=1;
                    }


                }
                else if ( ((LA58_0>=RULE_IDENT && LA58_0<=RULE_TRUE_FALSE)||LA58_0==24||LA58_0==32||LA58_0==34||LA58_0==38||LA58_0==43||LA58_0==49||(LA58_0>=51 && LA58_0<=52)||LA58_0==61||LA58_0==66||(LA58_0>=68 && LA58_0<=69)||LA58_0==73||(LA58_0>=80 && LA58_0<=82)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMOloc.g:2193:4: (lv_ifEquations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:2193:4: (lv_ifEquations_3_0= ruleEquation )
            	    // InternalMOloc.g:2194:5: lv_ifEquations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfEquationAccess().getIfEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_49);
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
            	    break loop58;
                }
            } while (true);

            // InternalMOloc.g:2211:3: (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )* )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==46) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMOloc.g:2212:4: otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifEquations_7_0= ruleEquation ) )*
            	    {
            	    otherlv_4=(Token)match(input,46,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getIfEquationAccess().getElseifKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:2216:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:2217:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:2217:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:2218:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfEquationAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    otherlv_6=(Token)match(input,45,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getIfEquationAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:2239:4: ( (lv_elseifEquations_7_0= ruleEquation ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==48) ) {
            	            int LA59_2 = input.LA(2);

            	            if ( ((LA59_2>=30 && LA59_2<=31)||LA59_2==33||LA59_2==65||LA59_2==68||(LA59_2>=71 && LA59_2<=72)||(LA59_2>=74 && LA59_2<=85)) ) {
            	                alt59=1;
            	            }


            	        }
            	        else if ( ((LA59_0>=RULE_IDENT && LA59_0<=RULE_TRUE_FALSE)||LA59_0==24||LA59_0==32||LA59_0==34||LA59_0==38||LA59_0==43||LA59_0==49||(LA59_0>=51 && LA59_0<=52)||LA59_0==61||LA59_0==66||(LA59_0>=68 && LA59_0<=69)||LA59_0==73||(LA59_0>=80 && LA59_0<=82)) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalMOloc.g:2240:5: (lv_elseifEquations_7_0= ruleEquation )
            	    	    {
            	    	    // InternalMOloc.g:2240:5: (lv_elseifEquations_7_0= ruleEquation )
            	    	    // InternalMOloc.g:2241:6: lv_elseifEquations_7_0= ruleEquation
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getIfEquationAccess().getElseifEquationsEquationParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_49);
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
            	    	    break loop59;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // InternalMOloc.g:2259:3: (otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==47) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMOloc.g:2260:4: otherlv_8= 'else' ( (lv_elseEquations_9_0= ruleEquation ) )*
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfEquationAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalMOloc.g:2264:4: ( (lv_elseEquations_9_0= ruleEquation ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==48) ) {
                            int LA61_1 = input.LA(2);

                            if ( ((LA61_1>=30 && LA61_1<=31)||LA61_1==33||LA61_1==65||LA61_1==68||(LA61_1>=71 && LA61_1<=72)||(LA61_1>=74 && LA61_1<=85)) ) {
                                alt61=1;
                            }


                        }
                        else if ( ((LA61_0>=RULE_IDENT && LA61_0<=RULE_TRUE_FALSE)||LA61_0==24||LA61_0==32||LA61_0==34||LA61_0==38||LA61_0==43||LA61_0==49||(LA61_0>=51 && LA61_0<=52)||LA61_0==61||LA61_0==66||(LA61_0>=68 && LA61_0<=69)||LA61_0==73||(LA61_0>=80 && LA61_0<=82)) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalMOloc.g:2265:5: (lv_elseEquations_9_0= ruleEquation )
                    	    {
                    	    // InternalMOloc.g:2265:5: (lv_elseEquations_9_0= ruleEquation )
                    	    // InternalMOloc.g:2266:6: lv_elseEquations_9_0= ruleEquation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfEquationAccess().getElseEquationsEquationParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_50);
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
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getIfEquationAccess().getEndKeyword_6());
              		
            }
            otherlv_11=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleIfEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfEquation"


    // $ANTLR start "entryRuleForEquation"
    // InternalMOloc.g:2314:1: entryRuleForEquation returns [EObject current=null] : iv_ruleForEquation= ruleForEquation EOF ;
    public final EObject entryRuleForEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleForEquation_StartIndex = input.index();
        EObject iv_ruleForEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // InternalMOloc.g:2314:52: (iv_ruleForEquation= ruleForEquation EOF )
            // InternalMOloc.g:2315:2: iv_ruleForEquation= ruleForEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleForEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForEquation"


    // $ANTLR start "ruleForEquation"
    // InternalMOloc.g:2321:1: ruleForEquation returns [EObject current=null] : (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // InternalMOloc.g:2327:2: ( (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:2328:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:2328:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:2329:3: otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forEquations_3_0= ruleEquation ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForEquationAccess().getForKeyword_0());
              		
            }
            // InternalMOloc.g:2333:3: ( (lv_forIndices_1_0= ruleForIndices ) )
            // InternalMOloc.g:2334:4: (lv_forIndices_1_0= ruleForIndices )
            {
            // InternalMOloc.g:2334:4: (lv_forIndices_1_0= ruleForIndices )
            // InternalMOloc.g:2335:5: lv_forIndices_1_0= ruleForIndices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForEquationAccess().getForIndicesForIndicesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            otherlv_2=(Token)match(input,50,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForEquationAccess().getLoopKeyword_2());
              		
            }
            // InternalMOloc.g:2356:3: ( (lv_forEquations_3_0= ruleEquation ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==48) ) {
                    int LA63_1 = input.LA(2);

                    if ( ((LA63_1>=30 && LA63_1<=31)||LA63_1==33||LA63_1==65||LA63_1==68||(LA63_1>=71 && LA63_1<=72)||(LA63_1>=74 && LA63_1<=85)) ) {
                        alt63=1;
                    }


                }
                else if ( ((LA63_0>=RULE_IDENT && LA63_0<=RULE_TRUE_FALSE)||LA63_0==24||LA63_0==32||LA63_0==34||LA63_0==38||LA63_0==43||LA63_0==49||(LA63_0>=51 && LA63_0<=52)||LA63_0==61||LA63_0==66||(LA63_0>=68 && LA63_0<=69)||LA63_0==73||(LA63_0>=80 && LA63_0<=82)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMOloc.g:2357:4: (lv_forEquations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:2357:4: (lv_forEquations_3_0= ruleEquation )
            	    // InternalMOloc.g:2358:5: lv_forEquations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForEquationAccess().getForEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_50);
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
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForEquationAccess().getEndKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,49,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleForEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForEquation"


    // $ANTLR start "entryRuleConnectEquation"
    // InternalMOloc.g:2405:1: entryRuleConnectEquation returns [EObject current=null] : iv_ruleConnectEquation= ruleConnectEquation EOF ;
    public final EObject entryRuleConnectEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleConnectEquation_StartIndex = input.index();
        EObject iv_ruleConnectEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // InternalMOloc.g:2405:56: (iv_ruleConnectEquation= ruleConnectEquation EOF )
            // InternalMOloc.g:2406:2: iv_ruleConnectEquation= ruleConnectEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleConnectEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectEquation"


    // $ANTLR start "ruleConnectEquation"
    // InternalMOloc.g:2412:1: ruleConnectEquation returns [EObject current=null] : (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // InternalMOloc.g:2418:2: ( (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:2419:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:2419:2: (otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:2420:3: otherlv_0= 'connect' otherlv_1= '(' ( (lv_left_2_0= ruleComponent_reference ) ) otherlv_3= ',' ( (lv_right_4_0= ruleComponent_reference ) ) otherlv_5= ')' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConnectEquationAccess().getConnectKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,38,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectEquationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMOloc.g:2428:3: ( (lv_left_2_0= ruleComponent_reference ) )
            // InternalMOloc.g:2429:4: (lv_left_2_0= ruleComponent_reference )
            {
            // InternalMOloc.g:2429:4: (lv_left_2_0= ruleComponent_reference )
            // InternalMOloc.g:2430:5: lv_left_2_0= ruleComponent_reference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectEquationAccess().getLeftComponent_referenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_55);
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

            otherlv_3=(Token)match(input,35,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConnectEquationAccess().getCommaKeyword_3());
              		
            }
            // InternalMOloc.g:2451:3: ( (lv_right_4_0= ruleComponent_reference ) )
            // InternalMOloc.g:2452:4: (lv_right_4_0= ruleComponent_reference )
            {
            // InternalMOloc.g:2452:4: (lv_right_4_0= ruleComponent_reference )
            // InternalMOloc.g:2453:5: lv_right_4_0= ruleComponent_reference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectEquationAccess().getRightComponent_referenceParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_47);
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

            otherlv_5=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleConnectEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleConnectEquation"


    // $ANTLR start "entryRuleWhenEquation"
    // InternalMOloc.g:2496:1: entryRuleWhenEquation returns [EObject current=null] : iv_ruleWhenEquation= ruleWhenEquation EOF ;
    public final EObject entryRuleWhenEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleWhenEquation_StartIndex = input.index();
        EObject iv_ruleWhenEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // InternalMOloc.g:2496:53: (iv_ruleWhenEquation= ruleWhenEquation EOF )
            // InternalMOloc.g:2497:2: iv_ruleWhenEquation= ruleWhenEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleWhenEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenEquation"


    // $ANTLR start "ruleWhenEquation"
    // InternalMOloc.g:2503:1: ruleWhenEquation returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // InternalMOloc.g:2509:2: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) )
            // InternalMOloc.g:2510:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            {
            // InternalMOloc.g:2510:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            // InternalMOloc.g:2511:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenEquations_3_0= ruleEquation ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhenEquationAccess().getWhenKeyword_0());
              		
            }
            // InternalMOloc.g:2515:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:2516:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:2516:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:2517:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhenEquationAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            otherlv_2=(Token)match(input,45,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhenEquationAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:2538:3: ( (lv_whenEquations_3_0= ruleEquation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==48) ) {
                    int LA64_2 = input.LA(2);

                    if ( ((LA64_2>=30 && LA64_2<=31)||LA64_2==33||LA64_2==65||LA64_2==68||(LA64_2>=71 && LA64_2<=72)||(LA64_2>=74 && LA64_2<=85)) ) {
                        alt64=1;
                    }


                }
                else if ( ((LA64_0>=RULE_IDENT && LA64_0<=RULE_TRUE_FALSE)||LA64_0==24||LA64_0==32||LA64_0==34||LA64_0==38||LA64_0==43||LA64_0==49||(LA64_0>=51 && LA64_0<=52)||LA64_0==61||LA64_0==66||(LA64_0>=68 && LA64_0<=69)||LA64_0==73||(LA64_0>=80 && LA64_0<=82)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalMOloc.g:2539:4: (lv_whenEquations_3_0= ruleEquation )
            	    {
            	    // InternalMOloc.g:2539:4: (lv_whenEquations_3_0= ruleEquation )
            	    // InternalMOloc.g:2540:5: lv_whenEquations_3_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhenEquationAccess().getWhenEquationsEquationParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_56);
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
            	    break loop64;
                }
            } while (true);

            // InternalMOloc.g:2557:3: (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )* )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==53) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalMOloc.g:2558:4: otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elsewhenEquations_7_0= ruleEquation ) )*
            	    {
            	    otherlv_4=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getWhenEquationAccess().getElsewhenKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:2562:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:2563:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:2563:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:2564:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhenEquationAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    otherlv_6=(Token)match(input,45,FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getWhenEquationAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:2585:4: ( (lv_elsewhenEquations_7_0= ruleEquation ) )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==48) ) {
            	            int LA65_1 = input.LA(2);

            	            if ( ((LA65_1>=30 && LA65_1<=31)||LA65_1==33||LA65_1==65||LA65_1==68||(LA65_1>=71 && LA65_1<=72)||(LA65_1>=74 && LA65_1<=85)) ) {
            	                alt65=1;
            	            }


            	        }
            	        else if ( ((LA65_0>=RULE_IDENT && LA65_0<=RULE_TRUE_FALSE)||LA65_0==24||LA65_0==32||LA65_0==34||LA65_0==38||LA65_0==43||LA65_0==49||(LA65_0>=51 && LA65_0<=52)||LA65_0==61||LA65_0==66||(LA65_0>=68 && LA65_0<=69)||LA65_0==73||(LA65_0>=80 && LA65_0<=82)) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalMOloc.g:2586:5: (lv_elsewhenEquations_7_0= ruleEquation )
            	    	    {
            	    	    // InternalMOloc.g:2586:5: (lv_elsewhenEquations_7_0= ruleEquation )
            	    	    // InternalMOloc.g:2587:6: lv_elsewhenEquations_7_0= ruleEquation
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getWhenEquationAccess().getElsewhenEquationsEquationParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_56);
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
            	    	    break loop65;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_8=(Token)match(input,48,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getWhenEquationAccess().getEndKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,52,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleWhenEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhenEquation"


    // $ANTLR start "entryRuleFunctionEquation"
    // InternalMOloc.g:2635:1: entryRuleFunctionEquation returns [EObject current=null] : iv_ruleFunctionEquation= ruleFunctionEquation EOF ;
    public final EObject entryRuleFunctionEquation() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionEquation_StartIndex = input.index();
        EObject iv_ruleFunctionEquation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // InternalMOloc.g:2635:57: (iv_ruleFunctionEquation= ruleFunctionEquation EOF )
            // InternalMOloc.g:2636:2: iv_ruleFunctionEquation= ruleFunctionEquation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleFunctionEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionEquation"


    // $ANTLR start "ruleFunctionEquation"
    // InternalMOloc.g:2642:1: ruleFunctionEquation returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' ) ;
    public final EObject ruleFunctionEquation() throws RecognitionException {
        EObject current = null;
        int ruleFunctionEquation_StartIndex = input.index();
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_component_0_0 = null;

        AntlrDatatypeRuleToken lv_function_1_0 = null;

        EObject this_description_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // InternalMOloc.g:2648:2: ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' ) )
            // InternalMOloc.g:2649:2: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' )
            {
            // InternalMOloc.g:2649:2: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';' )
            // InternalMOloc.g:2650:3: ( (lv_component_0_0= ruleComponent_reference ) ) ( (lv_function_1_0= ruleFunctionCallArgs ) ) this_description_2= ruledescription[$current] otherlv_3= ';'
            {
            // InternalMOloc.g:2650:3: ( (lv_component_0_0= ruleComponent_reference ) )
            // InternalMOloc.g:2651:4: (lv_component_0_0= ruleComponent_reference )
            {
            // InternalMOloc.g:2651:4: (lv_component_0_0= ruleComponent_reference )
            // InternalMOloc.g:2652:5: lv_component_0_0= ruleComponent_reference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionEquationAccess().getComponentComponent_referenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalMOloc.g:2669:3: ( (lv_function_1_0= ruleFunctionCallArgs ) )
            // InternalMOloc.g:2670:4: (lv_function_1_0= ruleFunctionCallArgs )
            {
            // InternalMOloc.g:2670:4: (lv_function_1_0= ruleFunctionCallArgs )
            // InternalMOloc.g:2671:5: lv_function_1_0= ruleFunctionCallArgs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionEquationAccess().getFunctionFunctionCallArgsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleFunctionEquation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionEquation"


    // $ANTLR start "entryRuleFunctionStatement"
    // InternalMOloc.g:2710:1: entryRuleFunctionStatement returns [EObject current=null] : iv_ruleFunctionStatement= ruleFunctionStatement EOF ;
    public final EObject entryRuleFunctionStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleFunctionStatement_StartIndex = input.index();
        EObject iv_ruleFunctionStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // InternalMOloc.g:2710:58: (iv_ruleFunctionStatement= ruleFunctionStatement EOF )
            // InternalMOloc.g:2711:2: iv_ruleFunctionStatement= ruleFunctionStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleFunctionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionStatement"


    // $ANTLR start "ruleFunctionStatement"
    // InternalMOloc.g:2717:1: ruleFunctionStatement returns [EObject current=null] : ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // InternalMOloc.g:2723:2: ( ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' ) )
            // InternalMOloc.g:2724:2: ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' )
            {
            // InternalMOloc.g:2724:2: ( ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';' )
            // InternalMOloc.g:2725:3: ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) ) this_description_10= ruledescription[$current] otherlv_11= ';'
            {
            // InternalMOloc.g:2725:3: ( ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) ) | (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_IDENT||LA68_0==32) ) {
                alt68=1;
            }
            else if ( (LA68_0==38) ) {
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
                    // InternalMOloc.g:2726:4: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) )
                    {
                    // InternalMOloc.g:2726:4: ( ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) ) )
                    // InternalMOloc.g:2727:5: ( (lv_component_0_0= ruleComponent_reference ) ) ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) )
                    {
                    // InternalMOloc.g:2727:5: ( (lv_component_0_0= ruleComponent_reference ) )
                    // InternalMOloc.g:2728:6: (lv_component_0_0= ruleComponent_reference )
                    {
                    // InternalMOloc.g:2728:6: (lv_component_0_0= ruleComponent_reference )
                    // InternalMOloc.g:2729:7: lv_component_0_0= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getComponentComponent_referenceParserRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
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

                    // InternalMOloc.g:2746:5: ( (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_function_3_0= ruleFunctionCallArgs ) ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==54) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==38) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalMOloc.g:2747:6: (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) )
                            {
                            // InternalMOloc.g:2747:6: (otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) ) )
                            // InternalMOloc.g:2748:7: otherlv_1= ':=' ( (lv_expression_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,54,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_1, grammarAccess.getFunctionStatementAccess().getColonEqualsSignKeyword_0_0_1_0_0());
                              						
                            }
                            // InternalMOloc.g:2752:7: ( (lv_expression_2_0= ruleExpression ) )
                            // InternalMOloc.g:2753:8: (lv_expression_2_0= ruleExpression )
                            {
                            // InternalMOloc.g:2753:8: (lv_expression_2_0= ruleExpression )
                            // InternalMOloc.g:2754:9: lv_expression_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getFunctionStatementAccess().getExpressionExpressionParserRuleCall_0_0_1_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_18);
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
                            // InternalMOloc.g:2773:6: ( (lv_function_3_0= ruleFunctionCallArgs ) )
                            {
                            // InternalMOloc.g:2773:6: ( (lv_function_3_0= ruleFunctionCallArgs ) )
                            // InternalMOloc.g:2774:7: (lv_function_3_0= ruleFunctionCallArgs )
                            {
                            // InternalMOloc.g:2774:7: (lv_function_3_0= ruleFunctionCallArgs )
                            // InternalMOloc.g:2775:8: lv_function_3_0= ruleFunctionCallArgs
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getFunctionStatementAccess().getFunctionFunctionCallArgsParserRuleCall_0_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_18);
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
                    // InternalMOloc.g:2795:4: (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) )
                    {
                    // InternalMOloc.g:2795:4: (otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) ) )
                    // InternalMOloc.g:2796:5: otherlv_4= '(' ( (lv_output_5_0= ruleOutputExpressionList ) ) otherlv_6= ')' otherlv_7= ':=' ( (lv_component_8_0= ruleComponent_reference ) ) ( (lv_function_9_0= ruleFunctionCallArgs ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getFunctionStatementAccess().getLeftParenthesisKeyword_0_1_0());
                      				
                    }
                    // InternalMOloc.g:2800:5: ( (lv_output_5_0= ruleOutputExpressionList ) )
                    // InternalMOloc.g:2801:6: (lv_output_5_0= ruleOutputExpressionList )
                    {
                    // InternalMOloc.g:2801:6: (lv_output_5_0= ruleOutputExpressionList )
                    // InternalMOloc.g:2802:7: lv_output_5_0= ruleOutputExpressionList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getOutputOutputExpressionListParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_47);
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

                    otherlv_6=(Token)match(input,39,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFunctionStatementAccess().getRightParenthesisKeyword_0_1_2());
                      				
                    }
                    otherlv_7=(Token)match(input,54,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getFunctionStatementAccess().getColonEqualsSignKeyword_0_1_3());
                      				
                    }
                    // InternalMOloc.g:2827:5: ( (lv_component_8_0= ruleComponent_reference ) )
                    // InternalMOloc.g:2828:6: (lv_component_8_0= ruleComponent_reference )
                    {
                    // InternalMOloc.g:2828:6: (lv_component_8_0= ruleComponent_reference )
                    // InternalMOloc.g:2829:7: lv_component_8_0= ruleComponent_reference
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getComponentComponent_referenceParserRuleCall_0_1_4_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalMOloc.g:2846:5: ( (lv_function_9_0= ruleFunctionCallArgs ) )
                    // InternalMOloc.g:2847:6: (lv_function_9_0= ruleFunctionCallArgs )
                    {
                    // InternalMOloc.g:2847:6: (lv_function_9_0= ruleFunctionCallArgs )
                    // InternalMOloc.g:2848:7: lv_function_9_0= ruleFunctionCallArgs
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionStatementAccess().getFunctionFunctionCallArgsParserRuleCall_0_1_5_0());
                      						
                    }
                    pushFollow(FOLLOW_18);
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleFunctionStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalMOloc.g:2889:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleBreakStatement_StartIndex = input.index();
        EObject iv_ruleBreakStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // InternalMOloc.g:2889:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalMOloc.g:2890:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleBreakStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalMOloc.g:2896:1: ruleBreakStatement returns [EObject current=null] : (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;
        int ruleBreakStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // InternalMOloc.g:2902:2: ( (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' ) )
            // InternalMOloc.g:2903:2: (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' )
            {
            // InternalMOloc.g:2903:2: (otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';' )
            // InternalMOloc.g:2904:3: otherlv_0= 'break' this_description_1= ruledescription[$current] otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleBreakStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalMOloc.g:2930:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleReturnStatement_StartIndex = input.index();
        EObject iv_ruleReturnStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // InternalMOloc.g:2930:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalMOloc.g:2931:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleReturnStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalMOloc.g:2937:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;
        int ruleReturnStatement_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // InternalMOloc.g:2943:2: ( (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' ) )
            // InternalMOloc.g:2944:2: (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' )
            {
            // InternalMOloc.g:2944:2: (otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';' )
            // InternalMOloc.g:2945:3: otherlv_0= 'return' this_description_1= ruledescription[$current] otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleReturnStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMOloc.g:2971:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleIfStatement_StartIndex = input.index();
        EObject iv_ruleIfStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // InternalMOloc.g:2971:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMOloc.g:2972:2: iv_ruleIfStatement= ruleIfStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMOloc.g:2978:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // InternalMOloc.g:2984:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' ) )
            // InternalMOloc.g:2985:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            {
            // InternalMOloc.g:2985:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';' )
            // InternalMOloc.g:2986:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifStatements_3_0= ruleStatement ) )* (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )* (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )? otherlv_10= 'end' otherlv_11= 'if' this_description_12= ruledescription[$current] otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            // InternalMOloc.g:2990:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:2991:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:2991:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:2992:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            otherlv_2=(Token)match(input,45,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:3013:3: ( (lv_ifStatements_3_0= ruleStatement ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_IDENT||LA69_0==32||LA69_0==38||LA69_0==43||LA69_0==49||LA69_0==52||(LA69_0>=55 && LA69_0<=57)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalMOloc.g:3014:4: (lv_ifStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:3014:4: (lv_ifStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:3015:5: lv_ifStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getIfStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_61);
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
            	    break loop69;
                }
            } while (true);

            // InternalMOloc.g:3032:3: (otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )* )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==46) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalMOloc.g:3033:4: otherlv_4= 'elseif' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_elseifStatements_7_0= ruleStatement ) )*
            	    {
            	    otherlv_4=(Token)match(input,46,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getElseifKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:3037:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:3038:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:3038:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:3039:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    otherlv_6=(Token)match(input,45,FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:3060:4: ( (lv_elseifStatements_7_0= ruleStatement ) )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==RULE_IDENT||LA70_0==32||LA70_0==38||LA70_0==43||LA70_0==49||LA70_0==52||(LA70_0>=55 && LA70_0<=57)) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // InternalMOloc.g:3061:5: (lv_elseifStatements_7_0= ruleStatement )
            	    	    {
            	    	    // InternalMOloc.g:3061:5: (lv_elseifStatements_7_0= ruleStatement )
            	    	    // InternalMOloc.g:3062:6: lv_elseifStatements_7_0= ruleStatement
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseifStatementsStatementParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_61);
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
            	    	    break loop70;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            // InternalMOloc.g:3080:3: (otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==47) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMOloc.g:3081:4: otherlv_8= 'else' ( (lv_elseStatements_9_0= ruleStatement ) )*
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalMOloc.g:3085:4: ( (lv_elseStatements_9_0= ruleStatement ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==RULE_IDENT||LA72_0==32||LA72_0==38||LA72_0==43||LA72_0==49||LA72_0==52||(LA72_0>=55 && LA72_0<=57)) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalMOloc.g:3086:5: (lv_elseStatements_9_0= ruleStatement )
                    	    {
                    	    // InternalMOloc.g:3086:5: (lv_elseStatements_9_0= ruleStatement )
                    	    // InternalMOloc.g:3087:6: lv_elseStatements_9_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementsStatementParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_62);
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
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,48,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getEndKeyword_6());
              		
            }
            otherlv_11=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleIfStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalMOloc.g:3135:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleForStatement_StartIndex = input.index();
        EObject iv_ruleForStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // InternalMOloc.g:3135:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMOloc.g:3136:2: iv_ruleForStatement= ruleForStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMOloc.g:3142:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // InternalMOloc.g:3148:2: ( (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:3149:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:3149:2: (otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:3150:3: otherlv_0= 'for' ( (lv_forIndices_1_0= ruleForIndices ) ) otherlv_2= 'loop' ( (lv_forStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'for' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            // InternalMOloc.g:3154:3: ( (lv_forIndices_1_0= ruleForIndices ) )
            // InternalMOloc.g:3155:4: (lv_forIndices_1_0= ruleForIndices )
            {
            // InternalMOloc.g:3155:4: (lv_forIndices_1_0= ruleForIndices )
            // InternalMOloc.g:3156:5: lv_forIndices_1_0= ruleForIndices
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getForIndicesForIndicesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            otherlv_2=(Token)match(input,50,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLoopKeyword_2());
              		
            }
            // InternalMOloc.g:3177:3: ( (lv_forStatements_3_0= ruleStatement ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_IDENT||LA74_0==32||LA74_0==38||LA74_0==43||LA74_0==49||LA74_0==52||(LA74_0>=55 && LA74_0<=57)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalMOloc.g:3178:4: (lv_forStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:3178:4: (lv_forStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:3179:5: lv_forStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForStatementAccess().getForStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_62);
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
            	    break loop74;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getEndKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,49,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleForStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleWhenStatement"
    // InternalMOloc.g:3226:1: entryRuleWhenStatement returns [EObject current=null] : iv_ruleWhenStatement= ruleWhenStatement EOF ;
    public final EObject entryRuleWhenStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleWhenStatement_StartIndex = input.index();
        EObject iv_ruleWhenStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // InternalMOloc.g:3226:54: (iv_ruleWhenStatement= ruleWhenStatement EOF )
            // InternalMOloc.g:3227:2: iv_ruleWhenStatement= ruleWhenStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleWhenStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenStatement"


    // $ANTLR start "ruleWhenStatement"
    // InternalMOloc.g:3233:1: ruleWhenStatement returns [EObject current=null] : (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // InternalMOloc.g:3239:2: ( (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' ) )
            // InternalMOloc.g:3240:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            {
            // InternalMOloc.g:3240:2: (otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';' )
            // InternalMOloc.g:3241:3: otherlv_0= 'when' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_whenStatements_3_0= ruleStatement ) )* (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )* otherlv_8= 'end' otherlv_9= 'when' this_description_10= ruledescription[$current] otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhenStatementAccess().getWhenKeyword_0());
              		
            }
            // InternalMOloc.g:3245:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:3246:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:3246:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:3247:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhenStatementAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            otherlv_2=(Token)match(input,45,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhenStatementAccess().getThenKeyword_2());
              		
            }
            // InternalMOloc.g:3268:3: ( (lv_whenStatements_3_0= ruleStatement ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_IDENT||LA75_0==32||LA75_0==38||LA75_0==43||LA75_0==49||LA75_0==52||(LA75_0>=55 && LA75_0<=57)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalMOloc.g:3269:4: (lv_whenStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:3269:4: (lv_whenStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:3270:5: lv_whenStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhenStatementAccess().getWhenStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break loop75;
                }
            } while (true);

            // InternalMOloc.g:3287:3: (otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )* )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==53) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalMOloc.g:3288:4: otherlv_4= 'elsewhen' ( (lv_elseCondition_5_0= ruleExpression ) ) otherlv_6= 'then' ( (lv_whenStatements_7_0= ruleStatement ) )*
            	    {
            	    otherlv_4=(Token)match(input,53,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getWhenStatementAccess().getElsewhenKeyword_4_0());
            	      			
            	    }
            	    // InternalMOloc.g:3292:4: ( (lv_elseCondition_5_0= ruleExpression ) )
            	    // InternalMOloc.g:3293:5: (lv_elseCondition_5_0= ruleExpression )
            	    {
            	    // InternalMOloc.g:3293:5: (lv_elseCondition_5_0= ruleExpression )
            	    // InternalMOloc.g:3294:6: lv_elseCondition_5_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWhenStatementAccess().getElseConditionExpressionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
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

            	    otherlv_6=(Token)match(input,45,FOLLOW_63); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getWhenStatementAccess().getThenKeyword_4_2());
            	      			
            	    }
            	    // InternalMOloc.g:3315:4: ( (lv_whenStatements_7_0= ruleStatement ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==RULE_IDENT||LA76_0==32||LA76_0==38||LA76_0==43||LA76_0==49||LA76_0==52||(LA76_0>=55 && LA76_0<=57)) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalMOloc.g:3316:5: (lv_whenStatements_7_0= ruleStatement )
            	    	    {
            	    	    // InternalMOloc.g:3316:5: (lv_whenStatements_7_0= ruleStatement )
            	    	    // InternalMOloc.g:3317:6: lv_whenStatements_7_0= ruleStatement
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getWhenStatementAccess().getWhenStatementsStatementParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_63);
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
            	    	    break loop76;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_8=(Token)match(input,48,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getWhenStatementAccess().getEndKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,52,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleWhenStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhenStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalMOloc.g:3365:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;
        int entryRuleWhileStatement_StartIndex = input.index();
        EObject iv_ruleWhileStatement = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // InternalMOloc.g:3365:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalMOloc.g:3366:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleWhileStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalMOloc.g:3372:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // InternalMOloc.g:3378:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' ) )
            // InternalMOloc.g:3379:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' )
            {
            // InternalMOloc.g:3379:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';' )
            // InternalMOloc.g:3380:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'loop' ( (lv_whileStatements_3_0= ruleStatement ) )* otherlv_4= 'end' otherlv_5= 'while' this_description_6= ruledescription[$current] otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            // InternalMOloc.g:3384:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalMOloc.g:3385:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalMOloc.g:3385:4: (lv_condition_1_0= ruleExpression )
            // InternalMOloc.g:3386:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            otherlv_2=(Token)match(input,50,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLoopKeyword_2());
              		
            }
            // InternalMOloc.g:3407:3: ( (lv_whileStatements_3_0= ruleStatement ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_IDENT||LA78_0==32||LA78_0==38||LA78_0==43||LA78_0==49||LA78_0==52||(LA78_0>=55 && LA78_0<=57)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalMOloc.g:3408:4: (lv_whileStatements_3_0= ruleStatement )
            	    {
            	    // InternalMOloc.g:3408:4: (lv_whileStatements_3_0= ruleStatement )
            	    // InternalMOloc.g:3409:5: lv_whileStatements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_62);
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
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getEndKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,57,FOLLOW_18); if (state.failed) return current;
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
            pushFollow(FOLLOW_5);
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleWhileStatement_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalMOloc.g:3456:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleEnumerationLiteral_StartIndex = input.index();
        EObject iv_ruleEnumerationLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // InternalMOloc.g:3456:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalMOloc.g:3457:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleEnumerationLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalMOloc.g:3463:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;
        int ruleEnumerationLiteral_StartIndex = input.index();
        Token lv_title_0_0=null;
        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // InternalMOloc.g:3469:2: ( ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] ) )
            // InternalMOloc.g:3470:2: ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] )
            {
            // InternalMOloc.g:3470:2: ( ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current] )
            // InternalMOloc.g:3471:3: ( (lv_title_0_0= RULE_IDENT ) ) this_description_1= ruledescription[$current]
            {
            // InternalMOloc.g:3471:3: ( (lv_title_0_0= RULE_IDENT ) )
            // InternalMOloc.g:3472:4: (lv_title_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:3472:4: (lv_title_0_0= RULE_IDENT )
            // InternalMOloc.g:3473:5: lv_title_0_0= RULE_IDENT
            {
            lv_title_0_0=(Token)match(input,RULE_IDENT,FOLLOW_18); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleEnumerationLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleBreak"
    // InternalMOloc.g:3507:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;
        int entryRuleBreak_StartIndex = input.index();
        EObject iv_ruleBreak = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // InternalMOloc.g:3507:46: (iv_ruleBreak= ruleBreak EOF )
            // InternalMOloc.g:3508:2: iv_ruleBreak= ruleBreak EOF
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
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalMOloc.g:3514:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;
        int ruleBreak_StartIndex = input.index();
        Token otherlv_0=null;
        Token lv_breakObject_2_0=null;
        EObject lv_connectObject_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // InternalMOloc.g:3520:2: ( (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) ) )
            // InternalMOloc.g:3521:2: (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) )
            {
            // InternalMOloc.g:3521:2: (otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) ) )
            // InternalMOloc.g:3522:3: otherlv_0= 'break' ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
              		
            }
            // InternalMOloc.g:3526:3: ( ( (lv_connectObject_1_0= ruleConnectEquation ) ) | ( (lv_breakObject_2_0= RULE_IDENT ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==51) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_IDENT) ) {
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
                    // InternalMOloc.g:3527:4: ( (lv_connectObject_1_0= ruleConnectEquation ) )
                    {
                    // InternalMOloc.g:3527:4: ( (lv_connectObject_1_0= ruleConnectEquation ) )
                    // InternalMOloc.g:3528:5: (lv_connectObject_1_0= ruleConnectEquation )
                    {
                    // InternalMOloc.g:3528:5: (lv_connectObject_1_0= ruleConnectEquation )
                    // InternalMOloc.g:3529:6: lv_connectObject_1_0= ruleConnectEquation
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
                    // InternalMOloc.g:3547:4: ( (lv_breakObject_2_0= RULE_IDENT ) )
                    {
                    // InternalMOloc.g:3547:4: ( (lv_breakObject_2_0= RULE_IDENT ) )
                    // InternalMOloc.g:3548:5: (lv_breakObject_2_0= RULE_IDENT )
                    {
                    // InternalMOloc.g:3548:5: (lv_breakObject_2_0= RULE_IDENT )
                    // InternalMOloc.g:3549:6: lv_breakObject_2_0= RULE_IDENT
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleBreak_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "ruleclass_prefixes"
    // InternalMOloc.g:3571:1: ruleclass_prefixes[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // InternalMOloc.g:3577:2: ( ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) ) )
            // InternalMOloc.g:3578:2: ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) )
            {
            // InternalMOloc.g:3578:2: ( ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) ) )
            // InternalMOloc.g:3579:3: ( (lv_isEncapsulated_0_0= 'encapsulated' ) )? ( (lv_isPartial_1_0= 'partial' ) )? ( (lv_isExpandable_2_0= 'expandable' ) )? ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )? ( (lv_isOperator_5_0= 'operator' ) )? ( (lv_classType_6_0= ruleClassType ) )
            {
            // InternalMOloc.g:3579:3: ( (lv_isEncapsulated_0_0= 'encapsulated' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==58) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMOloc.g:3580:4: (lv_isEncapsulated_0_0= 'encapsulated' )
                    {
                    // InternalMOloc.g:3580:4: (lv_isEncapsulated_0_0= 'encapsulated' )
                    // InternalMOloc.g:3581:5: lv_isEncapsulated_0_0= 'encapsulated'
                    {
                    lv_isEncapsulated_0_0=(Token)match(input,58,FOLLOW_6); if (state.failed) return current;
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

            // InternalMOloc.g:3593:3: ( (lv_isPartial_1_0= 'partial' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==59) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMOloc.g:3594:4: (lv_isPartial_1_0= 'partial' )
                    {
                    // InternalMOloc.g:3594:4: (lv_isPartial_1_0= 'partial' )
                    // InternalMOloc.g:3595:5: lv_isPartial_1_0= 'partial'
                    {
                    lv_isPartial_1_0=(Token)match(input,59,FOLLOW_6); if (state.failed) return current;
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

            // InternalMOloc.g:3607:3: ( (lv_isExpandable_2_0= 'expandable' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==60) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMOloc.g:3608:4: (lv_isExpandable_2_0= 'expandable' )
                    {
                    // InternalMOloc.g:3608:4: (lv_isExpandable_2_0= 'expandable' )
                    // InternalMOloc.g:3609:5: lv_isExpandable_2_0= 'expandable'
                    {
                    lv_isExpandable_2_0=(Token)match(input,60,FOLLOW_6); if (state.failed) return current;
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

            // InternalMOloc.g:3621:3: ( ( (lv_isPure_3_0= 'pure' ) ) | ( (lv_isPure_4_0= 'impure' ) ) )?
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==61) ) {
                alt83=1;
            }
            else if ( (LA83_0==62) ) {
                alt83=2;
            }
            switch (alt83) {
                case 1 :
                    // InternalMOloc.g:3622:4: ( (lv_isPure_3_0= 'pure' ) )
                    {
                    // InternalMOloc.g:3622:4: ( (lv_isPure_3_0= 'pure' ) )
                    // InternalMOloc.g:3623:5: (lv_isPure_3_0= 'pure' )
                    {
                    // InternalMOloc.g:3623:5: (lv_isPure_3_0= 'pure' )
                    // InternalMOloc.g:3624:6: lv_isPure_3_0= 'pure'
                    {
                    lv_isPure_3_0=(Token)match(input,61,FOLLOW_6); if (state.failed) return current;
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
                    // InternalMOloc.g:3637:4: ( (lv_isPure_4_0= 'impure' ) )
                    {
                    // InternalMOloc.g:3637:4: ( (lv_isPure_4_0= 'impure' ) )
                    // InternalMOloc.g:3638:5: (lv_isPure_4_0= 'impure' )
                    {
                    // InternalMOloc.g:3638:5: (lv_isPure_4_0= 'impure' )
                    // InternalMOloc.g:3639:6: lv_isPure_4_0= 'impure'
                    {
                    lv_isPure_4_0=(Token)match(input,62,FOLLOW_6); if (state.failed) return current;
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

            // InternalMOloc.g:3652:3: ( (lv_isOperator_5_0= 'operator' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==63) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMOloc.g:3653:4: (lv_isOperator_5_0= 'operator' )
                    {
                    // InternalMOloc.g:3653:4: (lv_isOperator_5_0= 'operator' )
                    // InternalMOloc.g:3654:5: lv_isOperator_5_0= 'operator'
                    {
                    lv_isOperator_5_0=(Token)match(input,63,FOLLOW_6); if (state.failed) return current;
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

            // InternalMOloc.g:3666:3: ( (lv_classType_6_0= ruleClassType ) )
            // InternalMOloc.g:3667:4: (lv_classType_6_0= ruleClassType )
            {
            // InternalMOloc.g:3667:4: (lv_classType_6_0= ruleClassType )
            // InternalMOloc.g:3668:5: lv_classType_6_0= ruleClassType
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
            if ( state.backtracking>0 ) { memoize(input, 65, ruleclass_prefixes_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_prefixes"


    // $ANTLR start "ruleclass_specifier"
    // InternalMOloc.g:3690:1: ruleclass_specifier[EObject in_current] returns [EObject current=in_current] : (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] ) ;
    public final EObject ruleclass_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_specifier_StartIndex = input.index();
        EObject this_long_class_specifier_0 = null;

        EObject this_short_class_specifier_1 = null;

        EObject this_der_class_specifier_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // InternalMOloc.g:3696:2: ( (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] ) )
            // InternalMOloc.g:3697:2: (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] )
            {
            // InternalMOloc.g:3697:2: (this_long_class_specifier_0= rulelong_class_specifier[$current] | this_short_class_specifier_1= ruleshort_class_specifier[$current] | this_der_class_specifier_2= ruleder_class_specifier[$current] )
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==37) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_IDENT) ) {
                int LA85_2 = input.LA(2);

                if ( ((LA85_2>=RULE_IDENT && LA85_2<=RULE_STRING)||(LA85_2>=20 && LA85_2<=21)||(LA85_2>=23 && LA85_2<=29)||LA85_2==32||(LA85_2>=37 && LA85_2<=38)||(LA85_2>=40 && LA85_2<=42)||LA85_2==44||LA85_2==48||(LA85_2>=58 && LA85_2<=63)||(LA85_2>=87 && LA85_2<=105)) ) {
                    alt85=1;
                }
                else if ( (LA85_2==30) ) {
                    int LA85_3 = input.LA(3);

                    if ( (LA85_3==RULE_IDENT||LA85_3==32||LA85_3==64||(LA85_3>=103 && LA85_3<=105)) ) {
                        alt85=2;
                    }
                    else if ( (LA85_3==66) ) {
                        alt85=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalMOloc.g:3698:3: this_long_class_specifier_0= rulelong_class_specifier[$current]
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
                    // InternalMOloc.g:3713:3: this_short_class_specifier_1= ruleshort_class_specifier[$current]
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
                    // InternalMOloc.g:3728:3: this_der_class_specifier_2= ruleder_class_specifier[$current]
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleclass_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_specifier"


    // $ANTLR start "rulelong_class_specifier"
    // InternalMOloc.g:3747:1: rulelong_class_specifier[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] ( (lv_isLongClassSpecifier_5_0= 'end' ) ) ( (lv_classNameEnd_6_0= RULE_IDENT ) ) ) ;
    public final EObject rulelong_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulelong_class_specifier_StartIndex = input.index();
        Token lv_isExtends_0_0=null;
        Token lv_isLongClassSpecifier_5_0=null;
        Token lv_classNameEnd_6_0=null;
        EObject this_class_name_1 = null;

        EObject this_class_modification_2 = null;

        EObject this_description_string_3 = null;

        EObject this_composition_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // InternalMOloc.g:3753:2: ( ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] ( (lv_isLongClassSpecifier_5_0= 'end' ) ) ( (lv_classNameEnd_6_0= RULE_IDENT ) ) ) )
            // InternalMOloc.g:3754:2: ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] ( (lv_isLongClassSpecifier_5_0= 'end' ) ) ( (lv_classNameEnd_6_0= RULE_IDENT ) ) )
            {
            // InternalMOloc.g:3754:2: ( ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] ( (lv_isLongClassSpecifier_5_0= 'end' ) ) ( (lv_classNameEnd_6_0= RULE_IDENT ) ) )
            // InternalMOloc.g:3755:3: ( (lv_isExtends_0_0= 'extends' ) )? this_class_name_1= ruleclass_name[$current] (this_class_modification_2= ruleclass_modification[$current] )? this_description_string_3= ruledescription_string[$current] this_composition_4= rulecomposition[$current] ( (lv_isLongClassSpecifier_5_0= 'end' ) ) ( (lv_classNameEnd_6_0= RULE_IDENT ) )
            {
            // InternalMOloc.g:3755:3: ( (lv_isExtends_0_0= 'extends' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==37) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMOloc.g:3756:4: (lv_isExtends_0_0= 'extends' )
                    {
                    // InternalMOloc.g:3756:4: (lv_isExtends_0_0= 'extends' )
                    // InternalMOloc.g:3757:5: lv_isExtends_0_0= 'extends'
                    {
                    lv_isExtends_0_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
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
            pushFollow(FOLLOW_66);
            this_class_name_1=ruleclass_name(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_name_1;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3783:3: (this_class_modification_2= ruleclass_modification[$current] )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==38) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalMOloc.g:3784:4: this_class_modification_2= ruleclass_modification[$current]
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
                    pushFollow(FOLLOW_67);
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
            pushFollow(FOLLOW_68);
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
            pushFollow(FOLLOW_69);
            this_composition_4=rulecomposition(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_composition_4;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3827:3: ( (lv_isLongClassSpecifier_5_0= 'end' ) )
            // InternalMOloc.g:3828:4: (lv_isLongClassSpecifier_5_0= 'end' )
            {
            // InternalMOloc.g:3828:4: (lv_isLongClassSpecifier_5_0= 'end' )
            // InternalMOloc.g:3829:5: lv_isLongClassSpecifier_5_0= 'end'
            {
            lv_isLongClassSpecifier_5_0=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isLongClassSpecifier_5_0, grammarAccess.getLong_class_specifierAccess().getIsLongClassSpecifierEndKeyword_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLong_class_specifierRule());
              					}
              					setWithLastConsumed(current, "isLongClassSpecifier", lv_isLongClassSpecifier_5_0 != null, "end");
              				
            }

            }


            }

            // InternalMOloc.g:3841:3: ( (lv_classNameEnd_6_0= RULE_IDENT ) )
            // InternalMOloc.g:3842:4: (lv_classNameEnd_6_0= RULE_IDENT )
            {
            // InternalMOloc.g:3842:4: (lv_classNameEnd_6_0= RULE_IDENT )
            // InternalMOloc.g:3843:5: lv_classNameEnd_6_0= RULE_IDENT
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
            if ( state.backtracking>0 ) { memoize(input, 67, rulelong_class_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulelong_class_specifier"


    // $ANTLR start "ruleshort_class_specifier"
    // InternalMOloc.g:3864:1: ruleshort_class_specifier[EObject in_current] returns [EObject current=in_current] : (this_class_name_0= ruleclass_name[$current] ( (lv_isShortClassSpecifier_1_0= '=' ) ) ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] ) ;
    public final EObject ruleshort_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleshort_class_specifier_StartIndex = input.index();
        Token lv_isShortClassSpecifier_1_0=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // InternalMOloc.g:3870:2: ( (this_class_name_0= ruleclass_name[$current] ( (lv_isShortClassSpecifier_1_0= '=' ) ) ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] ) )
            // InternalMOloc.g:3871:2: (this_class_name_0= ruleclass_name[$current] ( (lv_isShortClassSpecifier_1_0= '=' ) ) ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] )
            {
            // InternalMOloc.g:3871:2: (this_class_name_0= ruleclass_name[$current] ( (lv_isShortClassSpecifier_1_0= '=' ) ) ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current] )
            // InternalMOloc.g:3872:3: this_class_name_0= ruleclass_name[$current] ( (lv_isShortClassSpecifier_1_0= '=' ) ) ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) ) this_description_11= ruledescription[$current]
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
            pushFollow(FOLLOW_17);
            this_class_name_0=ruleclass_name(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_name_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:3886:3: ( (lv_isShortClassSpecifier_1_0= '=' ) )
            // InternalMOloc.g:3887:4: (lv_isShortClassSpecifier_1_0= '=' )
            {
            // InternalMOloc.g:3887:4: (lv_isShortClassSpecifier_1_0= '=' )
            // InternalMOloc.g:3888:5: lv_isShortClassSpecifier_1_0= '='
            {
            lv_isShortClassSpecifier_1_0=(Token)match(input,30,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isShortClassSpecifier_1_0, grammarAccess.getShort_class_specifierAccess().getIsShortClassSpecifierEqualsSignKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getShort_class_specifierRule());
              					}
              					setWithLastConsumed(current, "isShortClassSpecifier", lv_isShortClassSpecifier_1_0 != null, "=");
              				
            }

            }


            }

            // InternalMOloc.g:3900:3: ( ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? ) | ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_IDENT||LA93_0==32||(LA93_0>=103 && LA93_0<=105)) ) {
                alt93=1;
            }
            else if ( (LA93_0==64) ) {
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
                    // InternalMOloc.g:3901:4: ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? )
                    {
                    // InternalMOloc.g:3901:4: ( ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )? )
                    // InternalMOloc.g:3902:5: ( (lv_direction_2_0= ruleDirection ) )? this_type_specifier_3= ruletype_specifier[$current] (this_array_subscripts_4= rulearray_subscripts[$current] )? (this_class_modification_5= ruleclass_modification[$current] )?
                    {
                    // InternalMOloc.g:3902:5: ( (lv_direction_2_0= ruleDirection ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( ((LA88_0>=103 && LA88_0<=105)) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalMOloc.g:3903:6: (lv_direction_2_0= ruleDirection )
                            {
                            // InternalMOloc.g:3903:6: (lv_direction_2_0= ruleDirection )
                            // InternalMOloc.g:3904:7: lv_direction_2_0= ruleDirection
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShort_class_specifierAccess().getDirectionDirectionEnumRuleCall_2_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_24);
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
                    pushFollow(FOLLOW_71);
                    this_type_specifier_3=ruletype_specifier(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_type_specifier_3;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMOloc.g:3935:5: (this_array_subscripts_4= rulearray_subscripts[$current] )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==69) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalMOloc.g:3936:6: this_array_subscripts_4= rulearray_subscripts[$current]
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
                            pushFollow(FOLLOW_72);
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

                    // InternalMOloc.g:3951:5: (this_class_modification_5= ruleclass_modification[$current] )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==38) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalMOloc.g:3952:6: this_class_modification_5= ruleclass_modification[$current]
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
                            pushFollow(FOLLOW_18);
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
                    // InternalMOloc.g:3969:4: ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' )
                    {
                    // InternalMOloc.g:3969:4: ( ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')' )
                    // InternalMOloc.g:3970:5: ( (lv_isEnumeration_6_0= 'enumeration' ) ) otherlv_7= '(' ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) ) otherlv_10= ')'
                    {
                    // InternalMOloc.g:3970:5: ( (lv_isEnumeration_6_0= 'enumeration' ) )
                    // InternalMOloc.g:3971:6: (lv_isEnumeration_6_0= 'enumeration' )
                    {
                    // InternalMOloc.g:3971:6: (lv_isEnumeration_6_0= 'enumeration' )
                    // InternalMOloc.g:3972:7: lv_isEnumeration_6_0= 'enumeration'
                    {
                    lv_isEnumeration_6_0=(Token)match(input,64,FOLLOW_40); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,38,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getShort_class_specifierAccess().getLeftParenthesisKeyword_2_1_1());
                      				
                    }
                    // InternalMOloc.g:3988:5: ( (this_enum_list_8= ruleenum_list[$current] )? | ( (lv_isColon_9_0= ':' ) ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==RULE_IDENT||LA92_0==39) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==65) ) {
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
                            // InternalMOloc.g:3989:6: (this_enum_list_8= ruleenum_list[$current] )?
                            {
                            // InternalMOloc.g:3989:6: (this_enum_list_8= ruleenum_list[$current] )?
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==RULE_IDENT) ) {
                                alt91=1;
                            }
                            switch (alt91) {
                                case 1 :
                                    // InternalMOloc.g:3990:7: this_enum_list_8= ruleenum_list[$current]
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
                                    pushFollow(FOLLOW_47);
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
                            // InternalMOloc.g:4006:6: ( (lv_isColon_9_0= ':' ) )
                            {
                            // InternalMOloc.g:4006:6: ( (lv_isColon_9_0= ':' ) )
                            // InternalMOloc.g:4007:7: (lv_isColon_9_0= ':' )
                            {
                            // InternalMOloc.g:4007:7: (lv_isColon_9_0= ':' )
                            // InternalMOloc.g:4008:8: lv_isColon_9_0= ':'
                            {
                            lv_isColon_9_0=(Token)match(input,65,FOLLOW_47); if (state.failed) return current;
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

                    otherlv_10=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleshort_class_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleshort_class_specifier"


    // $ANTLR start "ruleder_class_specifier"
    // InternalMOloc.g:4046:1: ruleder_class_specifier[EObject in_current] returns [EObject current=in_current] : (this_class_name_0= ruleclass_name[$current] ( (lv_isDerClassSpecifier_1_0= '=' ) ) ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] ) ;
    public final EObject ruleder_class_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleder_class_specifier_StartIndex = input.index();
        Token lv_isDerClassSpecifier_1_0=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // InternalMOloc.g:4052:2: ( (this_class_name_0= ruleclass_name[$current] ( (lv_isDerClassSpecifier_1_0= '=' ) ) ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] ) )
            // InternalMOloc.g:4053:2: (this_class_name_0= ruleclass_name[$current] ( (lv_isDerClassSpecifier_1_0= '=' ) ) ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] )
            {
            // InternalMOloc.g:4053:2: (this_class_name_0= ruleclass_name[$current] ( (lv_isDerClassSpecifier_1_0= '=' ) ) ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current] )
            // InternalMOloc.g:4054:3: this_class_name_0= ruleclass_name[$current] ( (lv_isDerClassSpecifier_1_0= '=' ) ) ( (lv_isDer_2_0= 'der' ) ) otherlv_3= '(' this_type_specifier_4= ruletype_specifier[$current] otherlv_5= ',' ( (lv_derName_6_0= RULE_IDENT ) ) (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )* otherlv_9= ')' this_description_10= ruledescription[$current]
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
            pushFollow(FOLLOW_17);
            this_class_name_0=ruleclass_name(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_class_name_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4068:3: ( (lv_isDerClassSpecifier_1_0= '=' ) )
            // InternalMOloc.g:4069:4: (lv_isDerClassSpecifier_1_0= '=' )
            {
            // InternalMOloc.g:4069:4: (lv_isDerClassSpecifier_1_0= '=' )
            // InternalMOloc.g:4070:5: lv_isDerClassSpecifier_1_0= '='
            {
            lv_isDerClassSpecifier_1_0=(Token)match(input,30,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isDerClassSpecifier_1_0, grammarAccess.getDer_class_specifierAccess().getIsDerClassSpecifierEqualsSignKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDer_class_specifierRule());
              					}
              					setWithLastConsumed(current, "isDerClassSpecifier", lv_isDerClassSpecifier_1_0 != null, "=");
              				
            }

            }


            }

            // InternalMOloc.g:4082:3: ( (lv_isDer_2_0= 'der' ) )
            // InternalMOloc.g:4083:4: (lv_isDer_2_0= 'der' )
            {
            // InternalMOloc.g:4083:4: (lv_isDer_2_0= 'der' )
            // InternalMOloc.g:4084:5: lv_isDer_2_0= 'der'
            {
            lv_isDer_2_0=(Token)match(input,66,FOLLOW_40); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,38,FOLLOW_24); if (state.failed) return current;
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
            pushFollow(FOLLOW_55);
            this_type_specifier_4=ruletype_specifier(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_type_specifier_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDer_class_specifierAccess().getCommaKeyword_5());
              		
            }
            // InternalMOloc.g:4118:3: ( (lv_derName_6_0= RULE_IDENT ) )
            // InternalMOloc.g:4119:4: (lv_derName_6_0= RULE_IDENT )
            {
            // InternalMOloc.g:4119:4: (lv_derName_6_0= RULE_IDENT )
            // InternalMOloc.g:4120:5: lv_derName_6_0= RULE_IDENT
            {
            lv_derName_6_0=(Token)match(input,RULE_IDENT,FOLLOW_27); if (state.failed) return current;
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

            // InternalMOloc.g:4136:3: (otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==35) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalMOloc.g:4137:4: otherlv_7= ',' ( (lv_derName_8_0= RULE_IDENT ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getDer_class_specifierAccess().getCommaKeyword_7_0());
            	      			
            	    }
            	    // InternalMOloc.g:4141:4: ( (lv_derName_8_0= RULE_IDENT ) )
            	    // InternalMOloc.g:4142:5: (lv_derName_8_0= RULE_IDENT )
            	    {
            	    // InternalMOloc.g:4142:5: (lv_derName_8_0= RULE_IDENT )
            	    // InternalMOloc.g:4143:6: lv_derName_8_0= RULE_IDENT
            	    {
            	    lv_derName_8_0=(Token)match(input,RULE_IDENT,FOLLOW_27); if (state.failed) return current;
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
            	    break loop94;
                }
            } while (true);

            otherlv_9=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 69, ruleder_class_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleder_class_specifier"


    // $ANTLR start "ruleclass_name"
    // InternalMOloc.g:4183:1: ruleclass_name[EObject in_current] returns [EObject current=in_current] : ( (lv_className_0_0= RULE_IDENT ) ) ;
    public final EObject ruleclass_name(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_name_StartIndex = input.index();
        Token lv_className_0_0=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // InternalMOloc.g:4189:2: ( ( (lv_className_0_0= RULE_IDENT ) ) )
            // InternalMOloc.g:4190:2: ( (lv_className_0_0= RULE_IDENT ) )
            {
            // InternalMOloc.g:4190:2: ( (lv_className_0_0= RULE_IDENT ) )
            // InternalMOloc.g:4191:3: (lv_className_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:4191:3: (lv_className_0_0= RULE_IDENT )
            // InternalMOloc.g:4192:4: lv_className_0_0= RULE_IDENT
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleclass_name_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_name"


    // $ANTLR start "ruleclass_modification"
    // InternalMOloc.g:4212:1: ruleclass_modification[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( (lv_modifications_1_0= ruleModificationElement ) ) (otherlv_2= ',' ( (lv_modifications_3_0= ruleModificationElement ) ) )* ( (lv_isModificationOver_4_0= ')' ) ) ) ;
    public final EObject ruleclass_modification(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleclass_modification_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_isModificationOver_4_0=null;
        EObject lv_modifications_1_0 = null;

        EObject lv_modifications_3_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // InternalMOloc.g:4218:2: ( (otherlv_0= '(' ( (lv_modifications_1_0= ruleModificationElement ) ) (otherlv_2= ',' ( (lv_modifications_3_0= ruleModificationElement ) ) )* ( (lv_isModificationOver_4_0= ')' ) ) ) )
            // InternalMOloc.g:4219:2: (otherlv_0= '(' ( (lv_modifications_1_0= ruleModificationElement ) ) (otherlv_2= ',' ( (lv_modifications_3_0= ruleModificationElement ) ) )* ( (lv_isModificationOver_4_0= ')' ) ) )
            {
            // InternalMOloc.g:4219:2: (otherlv_0= '(' ( (lv_modifications_1_0= ruleModificationElement ) ) (otherlv_2= ',' ( (lv_modifications_3_0= ruleModificationElement ) ) )* ( (lv_isModificationOver_4_0= ')' ) ) )
            // InternalMOloc.g:4220:3: otherlv_0= '(' ( (lv_modifications_1_0= ruleModificationElement ) ) (otherlv_2= ',' ( (lv_modifications_3_0= ruleModificationElement ) ) )* ( (lv_isModificationOver_4_0= ')' ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClass_modificationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMOloc.g:4224:3: ( (lv_modifications_1_0= ruleModificationElement ) )
            // InternalMOloc.g:4225:4: (lv_modifications_1_0= ruleModificationElement )
            {
            // InternalMOloc.g:4225:4: (lv_modifications_1_0= ruleModificationElement )
            // InternalMOloc.g:4226:5: lv_modifications_1_0= ruleModificationElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClass_modificationAccess().getModificationsModificationElementParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_modifications_1_0=ruleModificationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClass_modificationRule());
              					}
              					add(
              						current,
              						"modifications",
              						lv_modifications_1_0,
              						"dut.control.moloc.MOloc.ModificationElement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:4243:3: (otherlv_2= ',' ( (lv_modifications_3_0= ruleModificationElement ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==35) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalMOloc.g:4244:4: otherlv_2= ',' ( (lv_modifications_3_0= ruleModificationElement ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getClass_modificationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalMOloc.g:4248:4: ( (lv_modifications_3_0= ruleModificationElement ) )
            	    // InternalMOloc.g:4249:5: (lv_modifications_3_0= ruleModificationElement )
            	    {
            	    // InternalMOloc.g:4249:5: (lv_modifications_3_0= ruleModificationElement )
            	    // InternalMOloc.g:4250:6: lv_modifications_3_0= ruleModificationElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClass_modificationAccess().getModificationsModificationElementParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_modifications_3_0=ruleModificationElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClass_modificationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"modifications",
            	      							lv_modifications_3_0,
            	      							"dut.control.moloc.MOloc.ModificationElement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            // InternalMOloc.g:4268:3: ( (lv_isModificationOver_4_0= ')' ) )
            // InternalMOloc.g:4269:4: (lv_isModificationOver_4_0= ')' )
            {
            // InternalMOloc.g:4269:4: (lv_isModificationOver_4_0= ')' )
            // InternalMOloc.g:4270:5: lv_isModificationOver_4_0= ')'
            {
            lv_isModificationOver_4_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isModificationOver_4_0, grammarAccess.getClass_modificationAccess().getIsModificationOverRightParenthesisKeyword_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClass_modificationRule());
              					}
              					setWithLastConsumed(current, "isModificationOver", lv_isModificationOver_4_0 != null, ")");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 71, ruleclass_modification_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleclass_modification"


    // $ANTLR start "ruleannotation_modification_part"
    // InternalMOloc.g:4287:1: ruleannotation_modification_part[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAnnotation_0_0= 'annotation' ) ) otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotationModificationElement ) ) (otherlv_3= ',' ( (lv_annotations_4_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver_5_0= ')' ) ) ) ;
    public final EObject ruleannotation_modification_part(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleannotation_modification_part_StartIndex = input.index();
        Token lv_isAnnotation_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isAnnotationOver_5_0=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // InternalMOloc.g:4293:2: ( ( ( (lv_isAnnotation_0_0= 'annotation' ) ) otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotationModificationElement ) ) (otherlv_3= ',' ( (lv_annotations_4_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver_5_0= ')' ) ) ) )
            // InternalMOloc.g:4294:2: ( ( (lv_isAnnotation_0_0= 'annotation' ) ) otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotationModificationElement ) ) (otherlv_3= ',' ( (lv_annotations_4_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver_5_0= ')' ) ) )
            {
            // InternalMOloc.g:4294:2: ( ( (lv_isAnnotation_0_0= 'annotation' ) ) otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotationModificationElement ) ) (otherlv_3= ',' ( (lv_annotations_4_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver_5_0= ')' ) ) )
            // InternalMOloc.g:4295:3: ( (lv_isAnnotation_0_0= 'annotation' ) ) otherlv_1= '(' ( (lv_annotations_2_0= ruleAnnotationModificationElement ) ) (otherlv_3= ',' ( (lv_annotations_4_0= ruleAnnotationModificationElement ) ) )* ( (lv_isAnnotationOver_5_0= ')' ) )
            {
            // InternalMOloc.g:4295:3: ( (lv_isAnnotation_0_0= 'annotation' ) )
            // InternalMOloc.g:4296:4: (lv_isAnnotation_0_0= 'annotation' )
            {
            // InternalMOloc.g:4296:4: (lv_isAnnotation_0_0= 'annotation' )
            // InternalMOloc.g:4297:5: lv_isAnnotation_0_0= 'annotation'
            {
            lv_isAnnotation_0_0=(Token)match(input,42,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isAnnotation_0_0, grammarAccess.getAnnotation_modification_partAccess().getIsAnnotationAnnotationKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnotation_modification_partRule());
              					}
              					setWithLastConsumed(current, "isAnnotation", lv_isAnnotation_0_0 != null, "annotation");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAnnotation_modification_partAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMOloc.g:4313:3: ( (lv_annotations_2_0= ruleAnnotationModificationElement ) )
            // InternalMOloc.g:4314:4: (lv_annotations_2_0= ruleAnnotationModificationElement )
            {
            // InternalMOloc.g:4314:4: (lv_annotations_2_0= ruleAnnotationModificationElement )
            // InternalMOloc.g:4315:5: lv_annotations_2_0= ruleAnnotationModificationElement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnnotation_modification_partAccess().getAnnotationsAnnotationModificationElementParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_annotations_2_0=ruleAnnotationModificationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnnotation_modification_partRule());
              					}
              					add(
              						current,
              						"annotations",
              						lv_annotations_2_0,
              						"dut.control.moloc.MOloc.AnnotationModificationElement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMOloc.g:4332:3: (otherlv_3= ',' ( (lv_annotations_4_0= ruleAnnotationModificationElement ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==35) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalMOloc.g:4333:4: otherlv_3= ',' ( (lv_annotations_4_0= ruleAnnotationModificationElement ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getAnnotation_modification_partAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalMOloc.g:4337:4: ( (lv_annotations_4_0= ruleAnnotationModificationElement ) )
            	    // InternalMOloc.g:4338:5: (lv_annotations_4_0= ruleAnnotationModificationElement )
            	    {
            	    // InternalMOloc.g:4338:5: (lv_annotations_4_0= ruleAnnotationModificationElement )
            	    // InternalMOloc.g:4339:6: lv_annotations_4_0= ruleAnnotationModificationElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAnnotation_modification_partAccess().getAnnotationsAnnotationModificationElementParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_annotations_4_0=ruleAnnotationModificationElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAnnotation_modification_partRule());
            	      						}
            	      						add(
            	      							current,
            	      							"annotations",
            	      							lv_annotations_4_0,
            	      							"dut.control.moloc.MOloc.AnnotationModificationElement");
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

            // InternalMOloc.g:4357:3: ( (lv_isAnnotationOver_5_0= ')' ) )
            // InternalMOloc.g:4358:4: (lv_isAnnotationOver_5_0= ')' )
            {
            // InternalMOloc.g:4358:4: (lv_isAnnotationOver_5_0= ')' )
            // InternalMOloc.g:4359:5: lv_isAnnotationOver_5_0= ')'
            {
            lv_isAnnotationOver_5_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isAnnotationOver_5_0, grammarAccess.getAnnotation_modification_partAccess().getIsAnnotationOverRightParenthesisKeyword_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnotation_modification_partRule());
              					}
              					setWithLastConsumed(current, "isAnnotationOver", lv_isAnnotationOver_5_0 != null, ")");
              				
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleannotation_modification_part_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleannotation_modification_part"


    // $ANTLR start "ruledescription_string"
    // InternalMOloc.g:4376:1: ruledescription_string[EObject in_current] returns [EObject current=in_current] : ( (lv_description_0_0= ruleDescriptionString ) )? ;
    public final EObject ruledescription_string(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledescription_string_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_description_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // InternalMOloc.g:4382:2: ( ( (lv_description_0_0= ruleDescriptionString ) )? )
            // InternalMOloc.g:4383:2: ( (lv_description_0_0= ruleDescriptionString ) )?
            {
            // InternalMOloc.g:4383:2: ( (lv_description_0_0= ruleDescriptionString ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_STRING) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalMOloc.g:4384:3: (lv_description_0_0= ruleDescriptionString )
                    {
                    // InternalMOloc.g:4384:3: (lv_description_0_0= ruleDescriptionString )
                    // InternalMOloc.g:4385:4: lv_description_0_0= ruleDescriptionString
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
            if ( state.backtracking>0 ) { memoize(input, 73, ruledescription_string_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledescription_string"


    // $ANTLR start "rulecomposition"
    // InternalMOloc.g:4406:1: rulecomposition[EObject in_current] returns [EObject current=in_current] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject rulecomposition(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomposition_StartIndex = input.index();
        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // InternalMOloc.g:4412:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalMOloc.g:4413:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalMOloc.g:4413:2: ( (lv_elements_0_0= ruleElement ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_IDENT||(LA98_0>=20 && LA98_0<=21)||(LA98_0>=23 && LA98_0<=29)||LA98_0==32||LA98_0==37||(LA98_0>=40 && LA98_0<=42)||LA98_0==44||(LA98_0>=58 && LA98_0<=63)||(LA98_0>=87 && LA98_0<=105)) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalMOloc.g:4414:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalMOloc.g:4414:3: (lv_elements_0_0= ruleElement )
            	    // InternalMOloc.g:4415:4: lv_elements_0_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCompositionAccess().getElementsElementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_75);
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
            	    break loop98;
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
            if ( state.backtracking>0 ) { memoize(input, 74, rulecomposition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomposition"


    // $ANTLR start "ruletype_specifier"
    // InternalMOloc.g:4436:1: ruletype_specifier[EObject in_current] returns [EObject current=in_current] : ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) ) ;
    public final EObject ruletype_specifier(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruletype_specifier_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_typeSpecifier_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // InternalMOloc.g:4442:2: ( ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) ) )
            // InternalMOloc.g:4443:2: ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) )
            {
            // InternalMOloc.g:4443:2: ( (lv_typeSpecifier_0_0= ruleTypeSpecifier ) )
            // InternalMOloc.g:4444:3: (lv_typeSpecifier_0_0= ruleTypeSpecifier )
            {
            // InternalMOloc.g:4444:3: (lv_typeSpecifier_0_0= ruleTypeSpecifier )
            // InternalMOloc.g:4445:4: lv_typeSpecifier_0_0= ruleTypeSpecifier
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
            if ( state.backtracking>0 ) { memoize(input, 75, ruletype_specifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruletype_specifier"


    // $ANTLR start "ruleenum_list"
    // InternalMOloc.g:4466:1: ruleenum_list[EObject in_current] returns [EObject current=in_current] : ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* ) ;
    public final EObject ruleenum_list(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleenum_list_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_enumerationLiteral_0_0 = null;

        EObject lv_enumerationLiteral_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // InternalMOloc.g:4472:2: ( ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* ) )
            // InternalMOloc.g:4473:2: ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* )
            {
            // InternalMOloc.g:4473:2: ( ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )* )
            // InternalMOloc.g:4474:3: ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) ) (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )*
            {
            // InternalMOloc.g:4474:3: ( (lv_enumerationLiteral_0_0= ruleEnumerationLiteral ) )
            // InternalMOloc.g:4475:4: (lv_enumerationLiteral_0_0= ruleEnumerationLiteral )
            {
            // InternalMOloc.g:4475:4: (lv_enumerationLiteral_0_0= ruleEnumerationLiteral )
            // InternalMOloc.g:4476:5: lv_enumerationLiteral_0_0= ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnum_listAccess().getEnumerationLiteralEnumerationLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalMOloc.g:4493:3: (otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==35) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalMOloc.g:4494:4: otherlv_1= ',' ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getEnum_listAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMOloc.g:4498:4: ( (lv_enumerationLiteral_2_0= ruleEnumerationLiteral ) )
            	    // InternalMOloc.g:4499:5: (lv_enumerationLiteral_2_0= ruleEnumerationLiteral )
            	    {
            	    // InternalMOloc.g:4499:5: (lv_enumerationLiteral_2_0= ruleEnumerationLiteral )
            	    // InternalMOloc.g:4500:6: lv_enumerationLiteral_2_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnum_listAccess().getEnumerationLiteralEnumerationLiteralParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_76);
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleenum_list_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleenum_list"


    // $ANTLR start "ruledescription"
    // InternalMOloc.g:4523:1: ruledescription[EObject in_current] returns [EObject current=in_current] : (this_description_string_0= ruledescription_string[$current] (this_annotation_modification_part_1= ruleannotation_modification_part[$current] )? ) ;
    public final EObject ruledescription(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledescription_StartIndex = input.index();
        EObject this_description_string_0 = null;

        EObject this_annotation_modification_part_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // InternalMOloc.g:4529:2: ( (this_description_string_0= ruledescription_string[$current] (this_annotation_modification_part_1= ruleannotation_modification_part[$current] )? ) )
            // InternalMOloc.g:4530:2: (this_description_string_0= ruledescription_string[$current] (this_annotation_modification_part_1= ruleannotation_modification_part[$current] )? )
            {
            // InternalMOloc.g:4530:2: (this_description_string_0= ruledescription_string[$current] (this_annotation_modification_part_1= ruleannotation_modification_part[$current] )? )
            // InternalMOloc.g:4531:3: this_description_string_0= ruledescription_string[$current] (this_annotation_modification_part_1= ruleannotation_modification_part[$current] )?
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
            pushFollow(FOLLOW_77);
            this_description_string_0=ruledescription_string(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_description_string_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:4545:3: (this_annotation_modification_part_1= ruleannotation_modification_part[$current] )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==42) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalMOloc.g:4546:4: this_annotation_modification_part_1= ruleannotation_modification_part[$current]
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getDescriptionRule());
                      				}
                      				newCompositeNode(grammarAccess.getDescriptionAccess().getAnnotation_modification_partParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_annotation_modification_part_1=ruleannotation_modification_part(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_annotation_modification_part_1;
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
            if ( state.backtracking>0 ) { memoize(input, 77, ruledescription_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledescription"


    // $ANTLR start "ruleelement_modification"
    // InternalMOloc.g:4566:1: ruleelement_modification[EObject in_current] returns [EObject current=in_current] : ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] ) ;
    public final EObject ruleelement_modification(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleelement_modification_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_elementName_0_0 = null;

        EObject this_modification_1 = null;

        EObject this_description_string_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // InternalMOloc.g:4572:2: ( ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] ) )
            // InternalMOloc.g:4573:2: ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] )
            {
            // InternalMOloc.g:4573:2: ( ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current] )
            // InternalMOloc.g:4574:3: ( (lv_elementName_0_0= ruleName ) ) (this_modification_1= rulemodification[$current] )? this_description_string_2= ruledescription_string[$current]
            {
            // InternalMOloc.g:4574:3: ( (lv_elementName_0_0= ruleName ) )
            // InternalMOloc.g:4575:4: (lv_elementName_0_0= ruleName )
            {
            // InternalMOloc.g:4575:4: (lv_elementName_0_0= ruleName )
            // InternalMOloc.g:4576:5: lv_elementName_0_0= ruleName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElement_modificationAccess().getElementNameNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_78);
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

            // InternalMOloc.g:4593:3: (this_modification_1= rulemodification[$current] )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==30||LA101_0==38||LA101_0==54) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalMOloc.g:4594:4: this_modification_1= rulemodification[$current]
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
                    pushFollow(FOLLOW_79);
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
            if ( state.backtracking>0 ) { memoize(input, 78, ruleelement_modification_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleelement_modification"


    // $ANTLR start "ruleshort_class_definition"
    // InternalMOloc.g:4628:1: ruleshort_class_definition[EObject in_current] returns [EObject current=in_current] : (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) ;
    public final EObject ruleshort_class_definition(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleshort_class_definition_StartIndex = input.index();
        EObject this_class_prefixes_0 = null;

        EObject this_short_class_specifier_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // InternalMOloc.g:4634:2: ( (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] ) )
            // InternalMOloc.g:4635:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            {
            // InternalMOloc.g:4635:2: (this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current] )
            // InternalMOloc.g:4636:3: this_class_prefixes_0= ruleclass_prefixes[$current] this_short_class_specifier_1= ruleshort_class_specifier[$current]
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
            if ( state.backtracking>0 ) { memoize(input, 79, ruleshort_class_definition_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleshort_class_definition"


    // $ANTLR start "rulecomponent_clause1"
    // InternalMOloc.g:4669:1: rulecomponent_clause1[EObject in_current] returns [EObject current=in_current] : (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) ;
    public final EObject rulecomponent_clause1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_clause1_StartIndex = input.index();
        EObject this_type_prefix_0 = null;

        EObject this_type_specifier_1 = null;

        EObject this_component_declaration1_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // InternalMOloc.g:4675:2: ( (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] ) )
            // InternalMOloc.g:4676:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            {
            // InternalMOloc.g:4676:2: (this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current] )
            // InternalMOloc.g:4677:3: this_type_prefix_0= ruletype_prefix[$current] this_type_specifier_1= ruletype_specifier[$current] this_component_declaration1_2= rulecomponent_declaration1[$current]
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
            pushFollow(FOLLOW_24);
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
            pushFollow(FOLLOW_37);
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
            if ( state.backtracking>0 ) { memoize(input, 80, rulecomponent_clause1_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomponent_clause1"


    // $ANTLR start "ruletype_prefix"
    // InternalMOloc.g:4724:1: ruletype_prefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) ;
    public final EObject ruletype_prefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruletype_prefix_StartIndex = input.index();
        Enumerator lv_relationshipType_0_0 = null;

        Enumerator lv_parameterType_1_0 = null;

        Enumerator lv_directionType_2_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // InternalMOloc.g:4730:2: ( ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? ) )
            // InternalMOloc.g:4731:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            {
            // InternalMOloc.g:4731:2: ( ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )? )
            // InternalMOloc.g:4732:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )? ( (lv_parameterType_1_0= ruleParameterType ) )? ( (lv_directionType_2_0= ruleDirection ) )?
            {
            // InternalMOloc.g:4732:3: ( (lv_relationshipType_0_0= ruleRelationshipType ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=96 && LA102_0<=98)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalMOloc.g:4733:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    {
                    // InternalMOloc.g:4733:4: (lv_relationshipType_0_0= ruleRelationshipType )
                    // InternalMOloc.g:4734:5: lv_relationshipType_0_0= ruleRelationshipType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getRelationshipTypeRelationshipTypeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_80);
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

            // InternalMOloc.g:4751:3: ( (lv_parameterType_1_0= ruleParameterType ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=99 && LA103_0<=102)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalMOloc.g:4752:4: (lv_parameterType_1_0= ruleParameterType )
                    {
                    // InternalMOloc.g:4752:4: (lv_parameterType_1_0= ruleParameterType )
                    // InternalMOloc.g:4753:5: lv_parameterType_1_0= ruleParameterType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getType_prefixAccess().getParameterTypeParameterTypeEnumRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_81);
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

            // InternalMOloc.g:4770:3: ( (lv_directionType_2_0= ruleDirection ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=103 && LA104_0<=105)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalMOloc.g:4771:4: (lv_directionType_2_0= ruleDirection )
                    {
                    // InternalMOloc.g:4771:4: (lv_directionType_2_0= ruleDirection )
                    // InternalMOloc.g:4772:5: lv_directionType_2_0= ruleDirection
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
            if ( state.backtracking>0 ) { memoize(input, 81, ruletype_prefix_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruletype_prefix"


    // $ANTLR start "rulecomponent_declaration1"
    // InternalMOloc.g:4794:1: rulecomponent_declaration1[EObject in_current] returns [EObject current=in_current] : (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) ;
    public final EObject rulecomponent_declaration1(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulecomponent_declaration1_StartIndex = input.index();
        EObject this_declaration_0 = null;

        EObject this_description_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // InternalMOloc.g:4800:2: ( (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] ) )
            // InternalMOloc.g:4801:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            {
            // InternalMOloc.g:4801:2: (this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current] )
            // InternalMOloc.g:4802:3: this_declaration_0= ruledeclaration[$current] this_description_1= ruledescription[$current]
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
            pushFollow(FOLLOW_18);
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
            if ( state.backtracking>0 ) { memoize(input, 82, rulecomponent_declaration1_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulecomponent_declaration1"


    // $ANTLR start "ruledeclaration"
    // InternalMOloc.g:4835:1: ruledeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) ;
    public final EObject ruledeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruledeclaration_StartIndex = input.index();
        Token lv_declarationName_0_0=null;
        EObject this_array_subscripts_1 = null;

        EObject this_modification_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // InternalMOloc.g:4841:2: ( ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? ) )
            // InternalMOloc.g:4842:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            {
            // InternalMOloc.g:4842:2: ( ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )? )
            // InternalMOloc.g:4843:3: ( (lv_declarationName_0_0= RULE_IDENT ) ) (this_array_subscripts_1= rulearray_subscripts[$current] )? (this_modification_2= rulemodification[$current] )?
            {
            // InternalMOloc.g:4843:3: ( (lv_declarationName_0_0= RULE_IDENT ) )
            // InternalMOloc.g:4844:4: (lv_declarationName_0_0= RULE_IDENT )
            {
            // InternalMOloc.g:4844:4: (lv_declarationName_0_0= RULE_IDENT )
            // InternalMOloc.g:4845:5: lv_declarationName_0_0= RULE_IDENT
            {
            lv_declarationName_0_0=(Token)match(input,RULE_IDENT,FOLLOW_82); if (state.failed) return current;
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

            // InternalMOloc.g:4861:3: (this_array_subscripts_1= rulearray_subscripts[$current] )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==69) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalMOloc.g:4862:4: this_array_subscripts_1= rulearray_subscripts[$current]
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
                    pushFollow(FOLLOW_83);
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

            // InternalMOloc.g:4877:3: (this_modification_2= rulemodification[$current] )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==30||LA106_0==38||LA106_0==54) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalMOloc.g:4878:4: this_modification_2= rulemodification[$current]
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
            if ( state.backtracking>0 ) { memoize(input, 83, ruledeclaration_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruledeclaration"


    // $ANTLR start "rulearray_subscripts"
    // InternalMOloc.g:4898:1: rulearray_subscripts[EObject in_current] returns [EObject current=in_current] : ( (lv_subscripts_0_0= ruleArraySubscripts ) ) ;
    public final EObject rulearray_subscripts(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int rulearray_subscripts_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_subscripts_0_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // InternalMOloc.g:4904:2: ( ( (lv_subscripts_0_0= ruleArraySubscripts ) ) )
            // InternalMOloc.g:4905:2: ( (lv_subscripts_0_0= ruleArraySubscripts ) )
            {
            // InternalMOloc.g:4905:2: ( (lv_subscripts_0_0= ruleArraySubscripts ) )
            // InternalMOloc.g:4906:3: (lv_subscripts_0_0= ruleArraySubscripts )
            {
            // InternalMOloc.g:4906:3: (lv_subscripts_0_0= ruleArraySubscripts )
            // InternalMOloc.g:4907:4: lv_subscripts_0_0= ruleArraySubscripts
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
            if ( state.backtracking>0 ) { memoize(input, 84, rulearray_subscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulearray_subscripts"


    // $ANTLR start "rulemodification"
    // InternalMOloc.g:4928:1: rulemodification[EObject in_current] returns [EObject current=in_current] : ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // InternalMOloc.g:4934:2: ( ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) ) )
            // InternalMOloc.g:4935:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            {
            // InternalMOloc.g:4935:2: ( (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? ) | (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) ) )
            int alt108=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt108=1;
                }
                break;
            case 30:
                {
                alt108=2;
                }
                break;
            case 54:
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
                    // InternalMOloc.g:4936:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    {
                    // InternalMOloc.g:4936:3: (this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )? )
                    // InternalMOloc.g:4937:4: this_class_modification_0= ruleclass_modification[$current] (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
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
                    pushFollow(FOLLOW_84);
                    this_class_modification_0=ruleclass_modification(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_class_modification_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:4951:4: (otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) ) )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==30) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalMOloc.g:4952:5: otherlv_1= '=' ( (lv_expression_2_0= ruleModification_expression ) )
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_85); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getEqualsSignKeyword_0_1_0());
                              				
                            }
                            // InternalMOloc.g:4956:5: ( (lv_expression_2_0= ruleModification_expression ) )
                            // InternalMOloc.g:4957:6: (lv_expression_2_0= ruleModification_expression )
                            {
                            // InternalMOloc.g:4957:6: (lv_expression_2_0= ruleModification_expression )
                            // InternalMOloc.g:4958:7: lv_expression_2_0= ruleModification_expression
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
                    // InternalMOloc.g:4978:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:4978:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:4979:4: otherlv_3= '=' ( (lv_expression_4_0= ruleModification_expression ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getModificationAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    // InternalMOloc.g:4983:4: ( (lv_expression_4_0= ruleModification_expression ) )
                    // InternalMOloc.g:4984:5: (lv_expression_4_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:4984:5: (lv_expression_4_0= ruleModification_expression )
                    // InternalMOloc.g:4985:6: lv_expression_4_0= ruleModification_expression
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
                    // InternalMOloc.g:5004:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    {
                    // InternalMOloc.g:5004:3: (otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) ) )
                    // InternalMOloc.g:5005:4: otherlv_5= ':=' ( (lv_expression_6_0= ruleModification_expression ) )
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getModificationAccess().getColonEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalMOloc.g:5009:4: ( (lv_expression_6_0= ruleModification_expression ) )
                    // InternalMOloc.g:5010:5: (lv_expression_6_0= ruleModification_expression )
                    {
                    // InternalMOloc.g:5010:5: (lv_expression_6_0= ruleModification_expression )
                    // InternalMOloc.g:5011:6: lv_expression_6_0= ruleModification_expression
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
            if ( state.backtracking>0 ) { memoize(input, 85, rulemodification_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulemodification"


    // $ANTLR start "ruleconstraining"
    // InternalMOloc.g:5034:1: ruleconstraining[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isConstrainedby_0_0= 'constrainedby' ) ) ( (lv_constrain_1_0= ruleConstrainingClause ) ) ) ;
    public final EObject ruleconstraining(EObject in_current) throws RecognitionException {
        EObject current = in_current;
        int ruleconstraining_StartIndex = input.index();
        Token lv_isConstrainedby_0_0=null;
        EObject lv_constrain_1_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // InternalMOloc.g:5040:2: ( ( ( (lv_isConstrainedby_0_0= 'constrainedby' ) ) ( (lv_constrain_1_0= ruleConstrainingClause ) ) ) )
            // InternalMOloc.g:5041:2: ( ( (lv_isConstrainedby_0_0= 'constrainedby' ) ) ( (lv_constrain_1_0= ruleConstrainingClause ) ) )
            {
            // InternalMOloc.g:5041:2: ( ( (lv_isConstrainedby_0_0= 'constrainedby' ) ) ( (lv_constrain_1_0= ruleConstrainingClause ) ) )
            // InternalMOloc.g:5042:3: ( (lv_isConstrainedby_0_0= 'constrainedby' ) ) ( (lv_constrain_1_0= ruleConstrainingClause ) )
            {
            // InternalMOloc.g:5042:3: ( (lv_isConstrainedby_0_0= 'constrainedby' ) )
            // InternalMOloc.g:5043:4: (lv_isConstrainedby_0_0= 'constrainedby' )
            {
            // InternalMOloc.g:5043:4: (lv_isConstrainedby_0_0= 'constrainedby' )
            // InternalMOloc.g:5044:5: lv_isConstrainedby_0_0= 'constrainedby'
            {
            lv_isConstrainedby_0_0=(Token)match(input,67,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_isConstrainedby_0_0, grammarAccess.getConstrainingAccess().getIsConstrainedbyConstrainedbyKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstrainingRule());
              					}
              					setWithLastConsumed(current, "isConstrainedby", lv_isConstrainedby_0_0 != null, "constrainedby");
              				
            }

            }


            }

            // InternalMOloc.g:5056:3: ( (lv_constrain_1_0= ruleConstrainingClause ) )
            // InternalMOloc.g:5057:4: (lv_constrain_1_0= ruleConstrainingClause )
            {
            // InternalMOloc.g:5057:4: (lv_constrain_1_0= ruleConstrainingClause )
            // InternalMOloc.g:5058:5: lv_constrain_1_0= ruleConstrainingClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstrainingAccess().getConstrainConstrainingClauseParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constrain_1_0=ruleConstrainingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstrainingRule());
              					}
              					set(
              						current,
              						"constrain",
              						lv_constrain_1_0,
              						"dut.control.moloc.MOloc.ConstrainingClause");
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleconstraining_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleconstraining"


    // $ANTLR start "entryRuleDescriptionString"
    // InternalMOloc.g:5079:1: entryRuleDescriptionString returns [String current=null] : iv_ruleDescriptionString= ruleDescriptionString EOF ;
    public final String entryRuleDescriptionString() throws RecognitionException {
        String current = null;
        int entryRuleDescriptionString_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleDescriptionString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // InternalMOloc.g:5079:57: (iv_ruleDescriptionString= ruleDescriptionString EOF )
            // InternalMOloc.g:5080:2: iv_ruleDescriptionString= ruleDescriptionString EOF
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
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleDescriptionString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionString"


    // $ANTLR start "ruleDescriptionString"
    // InternalMOloc.g:5086:1: ruleDescriptionString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* ) ;
    public final AntlrDatatypeRuleToken ruleDescriptionString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleDescriptionString_StartIndex = input.index();
        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // InternalMOloc.g:5092:2: ( (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* ) )
            // InternalMOloc.g:5093:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )
            {
            // InternalMOloc.g:5093:2: (this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )* )
            // InternalMOloc.g:5094:3: this_STRING_0= RULE_STRING (kw= '+' this_STRING_2= RULE_STRING )*
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRING_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRING_0, grammarAccess.getDescriptionStringAccess().getSTRINGTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:5101:3: (kw= '+' this_STRING_2= RULE_STRING )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==68) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalMOloc.g:5102:4: kw= '+' this_STRING_2= RULE_STRING
            	    {
            	    kw=(Token)match(input,68,FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDescriptionStringAccess().getPlusSignKeyword_1_0());
            	      			
            	    }
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_86); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_STRING_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_STRING_2, grammarAccess.getDescriptionStringAccess().getSTRINGTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleDescriptionString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionString"


    // $ANTLR start "entryRuleTypeSpecifier"
    // InternalMOloc.g:5119:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;
        int entryRuleTypeSpecifier_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // InternalMOloc.g:5119:53: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // InternalMOloc.g:5120:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
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
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleTypeSpecifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // InternalMOloc.g:5126:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_Name_1= ruleName ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTypeSpecifier_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Name_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // InternalMOloc.g:5132:2: ( ( (kw= '.' )? this_Name_1= ruleName ) )
            // InternalMOloc.g:5133:2: ( (kw= '.' )? this_Name_1= ruleName )
            {
            // InternalMOloc.g:5133:2: ( (kw= '.' )? this_Name_1= ruleName )
            // InternalMOloc.g:5134:3: (kw= '.' )? this_Name_1= ruleName
            {
            // InternalMOloc.g:5134:3: (kw= '.' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==32) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalMOloc.g:5135:4: kw= '.'
                    {
                    kw=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleTypeSpecifier_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleArraySubscripts"
    // InternalMOloc.g:5155:1: entryRuleArraySubscripts returns [String current=null] : iv_ruleArraySubscripts= ruleArraySubscripts EOF ;
    public final String entryRuleArraySubscripts() throws RecognitionException {
        String current = null;
        int entryRuleArraySubscripts_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArraySubscripts = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // InternalMOloc.g:5155:55: (iv_ruleArraySubscripts= ruleArraySubscripts EOF )
            // InternalMOloc.g:5156:2: iv_ruleArraySubscripts= ruleArraySubscripts EOF
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
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleArraySubscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySubscripts"


    // $ANTLR start "ruleArraySubscripts"
    // InternalMOloc.g:5162:1: ruleArraySubscripts returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArraySubscripts() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArraySubscripts_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Subscript_1 = null;

        AntlrDatatypeRuleToken this_Subscript_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // InternalMOloc.g:5168:2: ( (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' ) )
            // InternalMOloc.g:5169:2: (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' )
            {
            // InternalMOloc.g:5169:2: (kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']' )
            // InternalMOloc.g:5170:3: kw= '[' this_Subscript_1= ruleSubscript (kw= ',' this_Subscript_3= ruleSubscript )* kw= ']'
            {
            kw=(Token)match(input,69,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArraySubscriptsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_88);
            this_Subscript_1=ruleSubscript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Subscript_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5185:3: (kw= ',' this_Subscript_3= ruleSubscript )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==35) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalMOloc.g:5186:4: kw= ',' this_Subscript_3= ruleSubscript
            	    {
            	    kw=(Token)match(input,35,FOLLOW_87); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getArraySubscriptsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getArraySubscriptsAccess().getSubscriptParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_88);
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
            	    break loop111;
                }
            } while (true);

            kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleArraySubscripts_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArraySubscripts"


    // $ANTLR start "entryRuleSubscript"
    // InternalMOloc.g:5211:1: entryRuleSubscript returns [String current=null] : iv_ruleSubscript= ruleSubscript EOF ;
    public final String entryRuleSubscript() throws RecognitionException {
        String current = null;
        int entryRuleSubscript_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSubscript = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // InternalMOloc.g:5211:49: (iv_ruleSubscript= ruleSubscript EOF )
            // InternalMOloc.g:5212:2: iv_ruleSubscript= ruleSubscript EOF
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
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscript"


    // $ANTLR start "ruleSubscript"
    // InternalMOloc.g:5218:1: ruleSubscript returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' | this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleSubscript() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSubscript_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // InternalMOloc.g:5224:2: ( (kw= ':' | this_Expression_1= ruleExpression ) )
            // InternalMOloc.g:5225:2: (kw= ':' | this_Expression_1= ruleExpression )
            {
            // InternalMOloc.g:5225:2: (kw= ':' | this_Expression_1= ruleExpression )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==65) ) {
                alt112=1;
            }
            else if ( ((LA112_0>=RULE_IDENT && LA112_0<=RULE_TRUE_FALSE)||LA112_0==24||LA112_0==32||LA112_0==34||LA112_0==38||LA112_0==43||LA112_0==48||LA112_0==61||LA112_0==66||(LA112_0>=68 && LA112_0<=69)||LA112_0==73||(LA112_0>=80 && LA112_0<=82)) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalMOloc.g:5226:3: kw= ':'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSubscriptAccess().getColonKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5232:3: this_Expression_1= ruleExpression
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleSubscript_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSubscript"


    // $ANTLR start "entryRuleModification_expression"
    // InternalMOloc.g:5246:1: entryRuleModification_expression returns [String current=null] : iv_ruleModification_expression= ruleModification_expression EOF ;
    public final String entryRuleModification_expression() throws RecognitionException {
        String current = null;
        int entryRuleModification_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleModification_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // InternalMOloc.g:5246:63: (iv_ruleModification_expression= ruleModification_expression EOF )
            // InternalMOloc.g:5247:2: iv_ruleModification_expression= ruleModification_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleModification_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleModification_expression"


    // $ANTLR start "ruleModification_expression"
    // InternalMOloc.g:5253:1: ruleModification_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | kw= 'break' ) ;
    public final AntlrDatatypeRuleToken ruleModification_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleModification_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // InternalMOloc.g:5259:2: ( (this_Expression_0= ruleExpression | kw= 'break' ) )
            // InternalMOloc.g:5260:2: (this_Expression_0= ruleExpression | kw= 'break' )
            {
            // InternalMOloc.g:5260:2: (this_Expression_0= ruleExpression | kw= 'break' )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_IDENT && LA113_0<=RULE_TRUE_FALSE)||LA113_0==24||LA113_0==32||LA113_0==34||LA113_0==38||LA113_0==43||LA113_0==48||LA113_0==61||LA113_0==66||(LA113_0>=68 && LA113_0<=69)||LA113_0==73||(LA113_0>=80 && LA113_0<=82)) ) {
                alt113=1;
            }
            else if ( (LA113_0==55) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalMOloc.g:5261:3: this_Expression_0= ruleExpression
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
                    // InternalMOloc.g:5272:3: kw= 'break'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleModification_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleModification_expression"


    // $ANTLR start "entryRuleExpression"
    // InternalMOloc.g:5281:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;
        int entryRuleExpression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // InternalMOloc.g:5281:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMOloc.g:5282:2: iv_ruleExpression= ruleExpression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMOloc.g:5288:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // InternalMOloc.g:5294:2: ( (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) ) )
            // InternalMOloc.g:5295:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            {
            // InternalMOloc.g:5295:2: (this_Simple_expression_0= ruleSimple_expression | (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=RULE_IDENT && LA115_0<=RULE_TRUE_FALSE)||LA115_0==24||LA115_0==32||LA115_0==34||LA115_0==38||LA115_0==48||LA115_0==61||LA115_0==66||(LA115_0>=68 && LA115_0<=69)||LA115_0==73||(LA115_0>=80 && LA115_0<=82)) ) {
                alt115=1;
            }
            else if ( (LA115_0==43) ) {
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
                    // InternalMOloc.g:5296:3: this_Simple_expression_0= ruleSimple_expression
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
                    // InternalMOloc.g:5307:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    {
                    // InternalMOloc.g:5307:3: (kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression )
                    // InternalMOloc.g:5308:4: kw= 'if' this_Expression_2= ruleExpression kw= 'then' this_Expression_4= ruleExpression (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )* kw= 'else' this_Expression_10= ruleExpression
                    {
                    kw=(Token)match(input,43,FOLLOW_43); if (state.failed) return current;
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
                    kw=(Token)match(input,45,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_89);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:5338:4: (kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==46) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalMOloc.g:5339:5: kw= 'elseif' this_Expression_6= ruleExpression kw= 'then' this_Expression_8= ruleExpression
                    	    {
                    	    kw=(Token)match(input,46,FOLLOW_43); if (state.failed) return current;
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
                    	    kw=(Token)match(input,45,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getExpressionAccess().getThenKeyword_1_4_2());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_1_4_3());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_89);
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
                    	    break loop114;
                        }
                    } while (true);

                    kw=(Token)match(input,47,FOLLOW_43); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleExpression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSimple_expression"
    // InternalMOloc.g:5390:1: entryRuleSimple_expression returns [String current=null] : iv_ruleSimple_expression= ruleSimple_expression EOF ;
    public final String entryRuleSimple_expression() throws RecognitionException {
        String current = null;
        int entryRuleSimple_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleSimple_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // InternalMOloc.g:5390:57: (iv_ruleSimple_expression= ruleSimple_expression EOF )
            // InternalMOloc.g:5391:2: iv_ruleSimple_expression= ruleSimple_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleSimple_expression"


    // $ANTLR start "ruleSimple_expression"
    // InternalMOloc.g:5397:1: ruleSimple_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? ) ;
    public final AntlrDatatypeRuleToken ruleSimple_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleSimple_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_expression_0 = null;

        AntlrDatatypeRuleToken this_Logical_expression_2 = null;

        AntlrDatatypeRuleToken this_Logical_expression_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // InternalMOloc.g:5403:2: ( (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? ) )
            // InternalMOloc.g:5404:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? )
            {
            // InternalMOloc.g:5404:2: (this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )? )
            // InternalMOloc.g:5405:3: this_Logical_expression_0= ruleLogical_expression (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_90);
            this_Logical_expression_0=ruleLogical_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5415:3: (kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )? )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==65) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalMOloc.g:5416:4: kw= ':' this_Logical_expression_2= ruleLogical_expression (kw= ':' this_Logical_expression_4= ruleLogical_expression )?
                    {
                    kw=(Token)match(input,65,FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimple_expressionAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimple_expressionAccess().getLogical_expressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_90);
                    this_Logical_expression_2=ruleLogical_expression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Logical_expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:5431:4: (kw= ':' this_Logical_expression_4= ruleLogical_expression )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==65) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalMOloc.g:5432:5: kw= ':' this_Logical_expression_4= ruleLogical_expression
                            {
                            kw=(Token)match(input,65,FOLLOW_91); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleSimple_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleSimple_expression"


    // $ANTLR start "entryRuleLogical_expression"
    // InternalMOloc.g:5453:1: entryRuleLogical_expression returns [String current=null] : iv_ruleLogical_expression= ruleLogical_expression EOF ;
    public final String entryRuleLogical_expression() throws RecognitionException {
        String current = null;
        int entryRuleLogical_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // InternalMOloc.g:5453:58: (iv_ruleLogical_expression= ruleLogical_expression EOF )
            // InternalMOloc.g:5454:2: iv_ruleLogical_expression= ruleLogical_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_expression"


    // $ANTLR start "ruleLogical_expression"
    // InternalMOloc.g:5460:1: ruleLogical_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_term_0 = null;

        AntlrDatatypeRuleToken this_Logical_term_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // InternalMOloc.g:5466:2: ( (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* ) )
            // InternalMOloc.g:5467:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            {
            // InternalMOloc.g:5467:2: (this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )* )
            // InternalMOloc.g:5468:3: this_Logical_term_0= ruleLogical_term (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_92);
            this_Logical_term_0=ruleLogical_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_term_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5478:3: (kw= 'or' this_Logical_term_2= ruleLogical_term )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==71) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalMOloc.g:5479:4: kw= 'or' this_Logical_term_2= ruleLogical_term
            	    {
            	    kw=(Token)match(input,71,FOLLOW_91); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_expressionAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_expressionAccess().getLogical_termParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_92);
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
            	    break loop118;
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleLogical_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_expression"


    // $ANTLR start "entryRuleLogical_term"
    // InternalMOloc.g:5499:1: entryRuleLogical_term returns [String current=null] : iv_ruleLogical_term= ruleLogical_term EOF ;
    public final String entryRuleLogical_term() throws RecognitionException {
        String current = null;
        int entryRuleLogical_term_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_term = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // InternalMOloc.g:5499:52: (iv_ruleLogical_term= ruleLogical_term EOF )
            // InternalMOloc.g:5500:2: iv_ruleLogical_term= ruleLogical_term EOF
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
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_term"


    // $ANTLR start "ruleLogical_term"
    // InternalMOloc.g:5506:1: ruleLogical_term returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) ;
    public final AntlrDatatypeRuleToken ruleLogical_term() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_term_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_factor_0 = null;

        AntlrDatatypeRuleToken this_Logical_factor_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // InternalMOloc.g:5512:2: ( (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* ) )
            // InternalMOloc.g:5513:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            {
            // InternalMOloc.g:5513:2: (this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )* )
            // InternalMOloc.g:5514:3: this_Logical_factor_0= ruleLogical_factor (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_93);
            this_Logical_factor_0=ruleLogical_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Logical_factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5524:3: (kw= 'and' this_Logical_factor_2= ruleLogical_factor )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==72) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalMOloc.g:5525:4: kw= 'and' this_Logical_factor_2= ruleLogical_factor
            	    {
            	    kw=(Token)match(input,72,FOLLOW_91); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getLogical_termAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogical_termAccess().getLogical_factorParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_93);
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
            	    break loop119;
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleLogical_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_term"


    // $ANTLR start "entryRuleLogical_factor"
    // InternalMOloc.g:5545:1: entryRuleLogical_factor returns [String current=null] : iv_ruleLogical_factor= ruleLogical_factor EOF ;
    public final String entryRuleLogical_factor() throws RecognitionException {
        String current = null;
        int entryRuleLogical_factor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleLogical_factor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return current; }
            // InternalMOloc.g:5545:54: (iv_ruleLogical_factor= ruleLogical_factor EOF )
            // InternalMOloc.g:5546:2: iv_ruleLogical_factor= ruleLogical_factor EOF
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
            if ( state.backtracking>0 ) { memoize(input, 105, entryRuleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical_factor"


    // $ANTLR start "ruleLogical_factor"
    // InternalMOloc.g:5552:1: ruleLogical_factor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' )? this_Relation_1= ruleRelation ) ;
    public final AntlrDatatypeRuleToken ruleLogical_factor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleLogical_factor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Relation_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return current; }
            // InternalMOloc.g:5558:2: ( ( (kw= 'not' )? this_Relation_1= ruleRelation ) )
            // InternalMOloc.g:5559:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            {
            // InternalMOloc.g:5559:2: ( (kw= 'not' )? this_Relation_1= ruleRelation )
            // InternalMOloc.g:5560:3: (kw= 'not' )? this_Relation_1= ruleRelation
            {
            // InternalMOloc.g:5560:3: (kw= 'not' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==73) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalMOloc.g:5561:4: kw= 'not'
                    {
                    kw=(Token)match(input,73,FOLLOW_91); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 106, ruleLogical_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLogical_factor"


    // $ANTLR start "entryRuleRelation"
    // InternalMOloc.g:5581:1: entryRuleRelation returns [String current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final String entryRuleRelation() throws RecognitionException {
        String current = null;
        int entryRuleRelation_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleRelation = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return current; }
            // InternalMOloc.g:5581:48: (iv_ruleRelation= ruleRelation EOF )
            // InternalMOloc.g:5582:2: iv_ruleRelation= ruleRelation EOF
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
            if ( state.backtracking>0 ) { memoize(input, 107, entryRuleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMOloc.g:5588:1: ruleRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) ;
    public final AntlrDatatypeRuleToken ruleRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleRelation_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Arithmetic_expression_0 = null;

        AntlrDatatypeRuleToken this_Arithmetic_expression_7 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return current; }
            // InternalMOloc.g:5594:2: ( (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? ) )
            // InternalMOloc.g:5595:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            {
            // InternalMOloc.g:5595:2: (this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )? )
            // InternalMOloc.g:5596:3: this_Arithmetic_expression_0= ruleArithmetic_expression ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationAccess().getArithmetic_expressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_94);
            this_Arithmetic_expression_0=ruleArithmetic_expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Arithmetic_expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5606:3: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=74 && LA122_0<=79)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalMOloc.g:5607:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' ) this_Arithmetic_expression_7= ruleArithmetic_expression
                    {
                    // InternalMOloc.g:5607:4: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '<>' )
                    int alt121=6;
                    switch ( input.LA(1) ) {
                    case 74:
                        {
                        alt121=1;
                        }
                        break;
                    case 75:
                        {
                        alt121=2;
                        }
                        break;
                    case 76:
                        {
                        alt121=3;
                        }
                        break;
                    case 77:
                        {
                        alt121=4;
                        }
                        break;
                    case 78:
                        {
                        alt121=5;
                        }
                        break;
                    case 79:
                        {
                        alt121=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        throw nvae;
                    }

                    switch (alt121) {
                        case 1 :
                            // InternalMOloc.g:5608:5: kw= '<'
                            {
                            kw=(Token)match(input,74,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:5614:5: kw= '<='
                            {
                            kw=(Token)match(input,75,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMOloc.g:5620:5: kw= '>'
                            {
                            kw=(Token)match(input,76,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalMOloc.g:5626:5: kw= '>='
                            {
                            kw=(Token)match(input,77,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_3());
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalMOloc.g:5632:5: kw= '=='
                            {
                            kw=(Token)match(input,78,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_4());
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalMOloc.g:5638:5: kw= '<>'
                            {
                            kw=(Token)match(input,79,FOLLOW_91); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 108, ruleRelation_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleArithmetic_expression"
    // InternalMOloc.g:5659:1: entryRuleArithmetic_expression returns [String current=null] : iv_ruleArithmetic_expression= ruleArithmetic_expression EOF ;
    public final String entryRuleArithmetic_expression() throws RecognitionException {
        String current = null;
        int entryRuleArithmetic_expression_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArithmetic_expression = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return current; }
            // InternalMOloc.g:5659:61: (iv_ruleArithmetic_expression= ruleArithmetic_expression EOF )
            // InternalMOloc.g:5660:2: iv_ruleArithmetic_expression= ruleArithmetic_expression EOF
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
            if ( state.backtracking>0 ) { memoize(input, 109, entryRuleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmetic_expression"


    // $ANTLR start "ruleArithmetic_expression"
    // InternalMOloc.g:5666:1: ruleArithmetic_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) ;
    public final AntlrDatatypeRuleToken ruleArithmetic_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArithmetic_expression_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Term_4 = null;

        AntlrDatatypeRuleToken this_Term_9 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return current; }
            // InternalMOloc.g:5672:2: ( ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* ) )
            // InternalMOloc.g:5673:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            {
            // InternalMOloc.g:5673:2: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )* )
            // InternalMOloc.g:5674:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )? this_Term_4= ruleTerm ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            {
            // InternalMOloc.g:5674:3: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )?
            int alt123=5;
            switch ( input.LA(1) ) {
                case 68:
                    {
                    alt123=1;
                    }
                    break;
                case 80:
                    {
                    alt123=2;
                    }
                    break;
                case 81:
                    {
                    alt123=3;
                    }
                    break;
                case 82:
                    {
                    alt123=4;
                    }
                    break;
            }

            switch (alt123) {
                case 1 :
                    // InternalMOloc.g:5675:4: kw= '+'
                    {
                    kw=(Token)match(input,68,FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMOloc.g:5681:4: kw= '-'
                    {
                    kw=(Token)match(input,80,FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMOloc.g:5687:4: kw= '.+'
                    {
                    kw=(Token)match(input,81,FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalMOloc.g:5693:4: kw= '.-'
                    {
                    kw=(Token)match(input,82,FOLLOW_91); if (state.failed) return current;
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
            pushFollow(FOLLOW_95);
            this_Term_4=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Term_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5709:3: ( (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==68||(LA125_0>=80 && LA125_0<=82)) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalMOloc.g:5710:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' ) this_Term_9= ruleTerm
            	    {
            	    // InternalMOloc.g:5710:4: (kw= '+' | kw= '-' | kw= '.+' | kw= '.-' )
            	    int alt124=4;
            	    switch ( input.LA(1) ) {
            	    case 68:
            	        {
            	        alt124=1;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt124=2;
            	        }
            	        break;
            	    case 81:
            	        {
            	        alt124=3;
            	        }
            	        break;
            	    case 82:
            	        {
            	        alt124=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 124, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt124) {
            	        case 1 :
            	            // InternalMOloc.g:5711:5: kw= '+'
            	            {
            	            kw=(Token)match(input,68,FOLLOW_91); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getPlusSignKeyword_2_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:5717:5: kw= '-'
            	            {
            	            kw=(Token)match(input,80,FOLLOW_91); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getHyphenMinusKeyword_2_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:5723:5: kw= '.+'
            	            {
            	            kw=(Token)match(input,81,FOLLOW_91); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getArithmetic_expressionAccess().getFullStopPlusSignKeyword_2_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:5729:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,82,FOLLOW_91); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_95);
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
            if ( state.backtracking>0 ) { memoize(input, 110, ruleArithmetic_expression_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithmetic_expression"


    // $ANTLR start "entryRuleTerm"
    // InternalMOloc.g:5750:1: entryRuleTerm returns [String current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final String entryRuleTerm() throws RecognitionException {
        String current = null;
        int entryRuleTerm_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTerm = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return current; }
            // InternalMOloc.g:5750:44: (iv_ruleTerm= ruleTerm EOF )
            // InternalMOloc.g:5751:2: iv_ruleTerm= ruleTerm EOF
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
            if ( state.backtracking>0 ) { memoize(input, 111, entryRuleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMOloc.g:5757:1: ruleTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) ;
    public final AntlrDatatypeRuleToken ruleTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTerm_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_0 = null;

        AntlrDatatypeRuleToken this_Factor_5 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return current; }
            // InternalMOloc.g:5763:2: ( (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* ) )
            // InternalMOloc.g:5764:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            {
            // InternalMOloc.g:5764:2: (this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )* )
            // InternalMOloc.g:5765:3: this_Factor_0= ruleFactor ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_96);
            this_Factor_0=ruleFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Factor_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5775:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*
            loop127:
            do {
                int alt127=2;
                alt127 = dfa127.predict(input);
                switch (alt127) {
            	case 1 :
            	    // InternalMOloc.g:5776:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
            	    {
            	    // InternalMOloc.g:5776:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
            	    int alt126=4;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt126=1;
            	        }
            	        break;
            	    case 83:
            	        {
            	        alt126=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt126=3;
            	        }
            	        break;
            	    case 82:
            	        {
            	        alt126=4;
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
            	            // InternalMOloc.g:5777:5: kw= '*'
            	            {
            	            kw=(Token)match(input,33,FOLLOW_91); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMOloc.g:5783:5: kw= '/'
            	            {
            	            kw=(Token)match(input,83,FOLLOW_91); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMOloc.g:5789:5: kw= '.*'
            	            {
            	            kw=(Token)match(input,31,FOLLOW_91); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getTermAccess().getFullStopAsteriskKeyword_1_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMOloc.g:5795:5: kw= '.-'
            	            {
            	            kw=(Token)match(input,82,FOLLOW_91); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_96);
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
            	    break loop127;
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
            if ( state.backtracking>0 ) { memoize(input, 112, ruleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMOloc.g:5816:1: entryRuleFactor returns [String current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final String entryRuleFactor() throws RecognitionException {
        String current = null;
        int entryRuleFactor_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFactor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return current; }
            // InternalMOloc.g:5816:46: (iv_ruleFactor= ruleFactor EOF )
            // InternalMOloc.g:5817:2: iv_ruleFactor= ruleFactor EOF
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
            if ( state.backtracking>0 ) { memoize(input, 113, entryRuleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMOloc.g:5823:1: ruleFactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) ;
    public final AntlrDatatypeRuleToken ruleFactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFactor_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Primary_0 = null;

        AntlrDatatypeRuleToken this_Primary_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return current; }
            // InternalMOloc.g:5829:2: ( (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? ) )
            // InternalMOloc.g:5830:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            {
            // InternalMOloc.g:5830:2: (this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )? )
            // InternalMOloc.g:5831:3: this_Primary_0= rulePrimary ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_97);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Primary_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:5841:3: ( (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=84 && LA129_0<=85)) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalMOloc.g:5842:4: (kw= '^' | kw= '.^' ) this_Primary_3= rulePrimary
                    {
                    // InternalMOloc.g:5842:4: (kw= '^' | kw= '.^' )
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==84) ) {
                        alt128=1;
                    }
                    else if ( (LA128_0==85) ) {
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
                            // InternalMOloc.g:5843:5: kw= '^'
                            {
                            kw=(Token)match(input,84,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getFactorAccess().getCircumflexAccentKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMOloc.g:5849:5: kw= '.^'
                            {
                            kw=(Token)match(input,85,FOLLOW_91); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 114, ruleFactor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMOloc.g:5870:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;
        int entryRulePrimary_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return current; }
            // InternalMOloc.g:5870:47: (iv_rulePrimary= rulePrimary EOF )
            // InternalMOloc.g:5871:2: iv_rulePrimary= rulePrimary EOF
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
            if ( state.backtracking>0 ) { memoize(input, 115, entryRulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMOloc.g:5877:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return current; }
            // InternalMOloc.g:5883:2: ( (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' ) )
            // InternalMOloc.g:5884:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' )
            {
            // InternalMOloc.g:5884:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' )
            int alt132=9;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // InternalMOloc.g:5885:3: this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER
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
                    // InternalMOloc.g:5893:3: this_STRING_1= RULE_STRING
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
                    // InternalMOloc.g:5901:3: this_TRUE_FALSE_2= RULE_TRUE_FALSE
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
                    // InternalMOloc.g:5909:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
                    {
                    // InternalMOloc.g:5909:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
                    // InternalMOloc.g:5910:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs
                    {
                    // InternalMOloc.g:5910:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' )
                    int alt130=4;
                    switch ( input.LA(1) ) {
                    case RULE_IDENT:
                    case 32:
                        {
                        alt130=1;
                        }
                        break;
                    case 66:
                        {
                        alt130=2;
                        }
                        break;
                    case 24:
                        {
                        alt130=3;
                        }
                        break;
                    case 61:
                        {
                        alt130=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }

                    switch (alt130) {
                        case 1 :
                            // InternalMOloc.g:5911:5: this_Component_reference_3= ruleComponent_reference
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getPrimaryAccess().getComponent_referenceParserRuleCall_3_0_0());
                              				
                            }
                            pushFollow(FOLLOW_40);
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
                            // InternalMOloc.g:5922:5: kw= 'der'
                            {
                            kw=(Token)match(input,66,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryAccess().getDerKeyword_3_0_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMOloc.g:5928:5: kw= 'initial'
                            {
                            kw=(Token)match(input,24,FOLLOW_40); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryAccess().getInitialKeyword_3_0_2());
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalMOloc.g:5934:5: kw= 'pure'
                            {
                            kw=(Token)match(input,61,FOLLOW_40); if (state.failed) return current;
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
                    // InternalMOloc.g:5952:3: this_ResultReference_8= ruleResultReference
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
                    // InternalMOloc.g:5963:3: (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' )
                    {
                    // InternalMOloc.g:5963:3: (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' )
                    // InternalMOloc.g:5964:4: kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')'
                    {
                    kw=(Token)match(input,38,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getOutputExpressionListParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_OutputExpressionList_10=ruleOutputExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OutputExpressionList_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMOloc.g:5986:3: (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' )
                    {
                    // InternalMOloc.g:5986:3: (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' )
                    // InternalMOloc.g:5987:4: kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']'
                    {
                    kw=(Token)match(input,69,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionListParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_98);
                    this_ExpressionList_13=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionList_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:6002:4: (kw= ';' this_ExpressionList_15= ruleExpressionList )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==19) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalMOloc.g:6003:5: kw= ';' this_ExpressionList_15= ruleExpressionList
                    	    {
                    	    kw=(Token)match(input,19,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getPrimaryAccess().getSemicolonKeyword_6_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionListParserRuleCall_6_2_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_98);
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
                    	    break loop131;
                        }
                    } while (true);

                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightSquareBracketKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMOloc.g:6026:3: (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' )
                    {
                    // InternalMOloc.g:6026:3: (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' )
                    // InternalMOloc.g:6027:4: kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}'
                    {
                    kw=(Token)match(input,34,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getLeftCurlyBracketKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getArrayArgumentsParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_99);
                    this_ArrayArguments_18=ruleArrayArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayArguments_18);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryAccess().getRightCurlyBracketKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMOloc.g:6049:3: kw= 'end'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 116, rulePrimary_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleOutputExpressionList"
    // InternalMOloc.g:6058:1: entryRuleOutputExpressionList returns [String current=null] : iv_ruleOutputExpressionList= ruleOutputExpressionList EOF ;
    public final String entryRuleOutputExpressionList() throws RecognitionException {
        String current = null;
        int entryRuleOutputExpressionList_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleOutputExpressionList = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return current; }
            // InternalMOloc.g:6058:60: (iv_ruleOutputExpressionList= ruleOutputExpressionList EOF )
            // InternalMOloc.g:6059:2: iv_ruleOutputExpressionList= ruleOutputExpressionList EOF
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
            if ( state.backtracking>0 ) { memoize(input, 117, entryRuleOutputExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputExpressionList"


    // $ANTLR start "ruleOutputExpressionList"
    // InternalMOloc.g:6065:1: ruleOutputExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* ) ;
    public final AntlrDatatypeRuleToken ruleOutputExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleOutputExpressionList_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return current; }
            // InternalMOloc.g:6071:2: ( ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* ) )
            // InternalMOloc.g:6072:2: ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* )
            {
            // InternalMOloc.g:6072:2: ( (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )* )
            // InternalMOloc.g:6073:3: (this_Expression_0= ruleExpression )? (kw= ',' (this_Expression_2= ruleExpression )? )*
            {
            // InternalMOloc.g:6073:3: (this_Expression_0= ruleExpression )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=RULE_IDENT && LA133_0<=RULE_TRUE_FALSE)||LA133_0==24||LA133_0==32||LA133_0==34||LA133_0==38||LA133_0==43||LA133_0==48||LA133_0==61||LA133_0==66||(LA133_0>=68 && LA133_0<=69)||LA133_0==73||(LA133_0>=80 && LA133_0<=82)) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalMOloc.g:6074:4: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExpressionParserRuleCall_0());
                      			
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

                    }
                    break;

            }

            // InternalMOloc.g:6085:3: (kw= ',' (this_Expression_2= ruleExpression )? )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==35) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalMOloc.g:6086:4: kw= ',' (this_Expression_2= ruleExpression )?
            	    {
            	    kw=(Token)match(input,35,FOLLOW_100); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getOutputExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMOloc.g:6091:4: (this_Expression_2= ruleExpression )?
            	    int alt134=2;
            	    int LA134_0 = input.LA(1);

            	    if ( ((LA134_0>=RULE_IDENT && LA134_0<=RULE_TRUE_FALSE)||LA134_0==24||LA134_0==32||LA134_0==34||LA134_0==38||LA134_0==43||LA134_0==48||LA134_0==61||LA134_0==66||(LA134_0>=68 && LA134_0<=69)||LA134_0==73||(LA134_0>=80 && LA134_0<=82)) ) {
            	        alt134=1;
            	    }
            	    switch (alt134) {
            	        case 1 :
            	            // InternalMOloc.g:6092:5: this_Expression_2= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getOutputExpressionListAccess().getExpressionParserRuleCall_1_1());
            	              				
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
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
            if ( state.backtracking>0 ) { memoize(input, 118, ruleOutputExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleOutputExpressionList"


    // $ANTLR start "entryRuleExpressionList"
    // InternalMOloc.g:6108:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;
        int entryRuleExpressionList_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return current; }
            // InternalMOloc.g:6108:54: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMOloc.g:6109:2: iv_ruleExpressionList= ruleExpressionList EOF
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
            if ( state.backtracking>0 ) { memoize(input, 119, entryRuleExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalMOloc.g:6115:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleExpressionList_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return current; }
            // InternalMOloc.g:6121:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalMOloc.g:6122:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalMOloc.g:6122:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalMOloc.g:6123:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());
              		
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
            // InternalMOloc.g:6133:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==35) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // InternalMOloc.g:6134:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,35,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1());
            	      			
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
            	    break loop136;
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
            if ( state.backtracking>0 ) { memoize(input, 120, ruleExpressionList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleArrayArguments"
    // InternalMOloc.g:6154:1: entryRuleArrayArguments returns [String current=null] : iv_ruleArrayArguments= ruleArrayArguments EOF ;
    public final String entryRuleArrayArguments() throws RecognitionException {
        String current = null;
        int entryRuleArrayArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return current; }
            // InternalMOloc.g:6154:54: (iv_ruleArrayArguments= ruleArrayArguments EOF )
            // InternalMOloc.g:6155:2: iv_ruleArrayArguments= ruleArrayArguments EOF
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
            if ( state.backtracking>0 ) { memoize(input, 121, entryRuleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArguments"


    // $ANTLR start "ruleArrayArguments"
    // InternalMOloc.g:6161:1: ruleArrayArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_ForIndices_4 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return current; }
            // InternalMOloc.g:6167:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) )
            // InternalMOloc.g:6168:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            {
            // InternalMOloc.g:6168:2: (this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
            // InternalMOloc.g:6169:3: this_Expression_0= ruleExpression ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayArgumentsAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_101);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:6179:3: ( (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
            int alt137=3;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==35) ) {
                alt137=1;
            }
            else if ( (LA137_0==49) ) {
                alt137=2;
            }
            switch (alt137) {
                case 1 :
                    // InternalMOloc.g:6180:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    {
                    // InternalMOloc.g:6180:4: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )
                    // InternalMOloc.g:6181:5: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_43); if (state.failed) return current;
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
                    // InternalMOloc.g:6198:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    {
                    // InternalMOloc.g:6198:4: (kw= 'for' this_ForIndices_4= ruleForIndices )
                    // InternalMOloc.g:6199:5: kw= 'for' this_ForIndices_4= ruleForIndices
                    {
                    kw=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 122, ruleArrayArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArguments"


    // $ANTLR start "entryRuleArrayArgumentsNonFirst"
    // InternalMOloc.g:6220:1: entryRuleArrayArgumentsNonFirst returns [String current=null] : iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF ;
    public final String entryRuleArrayArgumentsNonFirst() throws RecognitionException {
        String current = null;
        int entryRuleArrayArgumentsNonFirst_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleArrayArgumentsNonFirst = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return current; }
            // InternalMOloc.g:6220:62: (iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF )
            // InternalMOloc.g:6221:2: iv_ruleArrayArgumentsNonFirst= ruleArrayArgumentsNonFirst EOF
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
            if ( state.backtracking>0 ) { memoize(input, 123, entryRuleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayArgumentsNonFirst"


    // $ANTLR start "ruleArrayArgumentsNonFirst"
    // InternalMOloc.g:6227:1: ruleArrayArgumentsNonFirst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) ;
    public final AntlrDatatypeRuleToken ruleArrayArgumentsNonFirst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleArrayArgumentsNonFirst_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ArrayArgumentsNonFirst_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return current; }
            // InternalMOloc.g:6233:2: ( (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? ) )
            // InternalMOloc.g:6234:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            {
            // InternalMOloc.g:6234:2: (this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )? )
            // InternalMOloc.g:6235:3: this_Expression_0= ruleExpression (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayArgumentsNonFirstAccess().getExpressionParserRuleCall_0());
              		
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
            // InternalMOloc.g:6245:3: (kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==35) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalMOloc.g:6246:4: kw= ',' this_ArrayArgumentsNonFirst_2= ruleArrayArgumentsNonFirst
                    {
                    kw=(Token)match(input,35,FOLLOW_43); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 124, ruleArrayArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArrayArgumentsNonFirst"


    // $ANTLR start "entryRuleForIndices"
    // InternalMOloc.g:6266:1: entryRuleForIndices returns [String current=null] : iv_ruleForIndices= ruleForIndices EOF ;
    public final String entryRuleForIndices() throws RecognitionException {
        String current = null;
        int entryRuleForIndices_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndices = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return current; }
            // InternalMOloc.g:6266:50: (iv_ruleForIndices= ruleForIndices EOF )
            // InternalMOloc.g:6267:2: iv_ruleForIndices= ruleForIndices EOF
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
            if ( state.backtracking>0 ) { memoize(input, 125, entryRuleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndices"


    // $ANTLR start "ruleForIndices"
    // InternalMOloc.g:6273:1: ruleForIndices returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) ;
    public final AntlrDatatypeRuleToken ruleForIndices() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndices_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_ForIndex_0 = null;

        AntlrDatatypeRuleToken this_ForIndex_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return current; }
            // InternalMOloc.g:6279:2: ( (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* ) )
            // InternalMOloc.g:6280:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            {
            // InternalMOloc.g:6280:2: (this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )* )
            // InternalMOloc.g:6281:3: this_ForIndex_0= ruleForIndex (kw= ',' this_ForIndex_2= ruleForIndex )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForIndicesAccess().getForIndexParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_76);
            this_ForIndex_0=ruleForIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ForIndex_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:6291:3: (kw= ',' this_ForIndex_2= ruleForIndex )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==35) ) {
                    int LA139_2 = input.LA(2);

                    if ( (LA139_2==RULE_IDENT) ) {
                        int LA139_3 = input.LA(3);

                        if ( (synpred180_InternalMOloc()) ) {
                            alt139=1;
                        }


                    }


                }


                switch (alt139) {
            	case 1 :
            	    // InternalMOloc.g:6292:4: kw= ',' this_ForIndex_2= ruleForIndex
            	    {
            	    kw=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getForIndicesAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getForIndicesAccess().getForIndexParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_76);
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
            	    break loop139;
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
            if ( state.backtracking>0 ) { memoize(input, 126, ruleForIndices_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndices"


    // $ANTLR start "entryRuleForIndex"
    // InternalMOloc.g:6312:1: entryRuleForIndex returns [String current=null] : iv_ruleForIndex= ruleForIndex EOF ;
    public final String entryRuleForIndex() throws RecognitionException {
        String current = null;
        int entryRuleForIndex_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleForIndex = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return current; }
            // InternalMOloc.g:6312:48: (iv_ruleForIndex= ruleForIndex EOF )
            // InternalMOloc.g:6313:2: iv_ruleForIndex= ruleForIndex EOF
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
            if ( state.backtracking>0 ) { memoize(input, 127, entryRuleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleForIndex"


    // $ANTLR start "ruleForIndex"
    // InternalMOloc.g:6319:1: ruleForIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleForIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleForIndex_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return current; }
            // InternalMOloc.g:6325:2: ( (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? ) )
            // InternalMOloc.g:6326:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            {
            // InternalMOloc.g:6326:2: (this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )? )
            // InternalMOloc.g:6327:3: this_IDENT_0= RULE_IDENT (kw= 'in' this_Expression_2= ruleExpression )?
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getForIndexAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:6334:3: (kw= 'in' this_Expression_2= ruleExpression )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==86) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalMOloc.g:6335:4: kw= 'in' this_Expression_2= ruleExpression
                    {
                    kw=(Token)match(input,86,FOLLOW_43); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 128, ruleForIndex_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleForIndex"


    // $ANTLR start "entryRuleComponent_reference"
    // InternalMOloc.g:6355:1: entryRuleComponent_reference returns [String current=null] : iv_ruleComponent_reference= ruleComponent_reference EOF ;
    public final String entryRuleComponent_reference() throws RecognitionException {
        String current = null;
        int entryRuleComponent_reference_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleComponent_reference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return current; }
            // InternalMOloc.g:6355:59: (iv_ruleComponent_reference= ruleComponent_reference EOF )
            // InternalMOloc.g:6356:2: iv_ruleComponent_reference= ruleComponent_reference EOF
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
            if ( state.backtracking>0 ) { memoize(input, 129, entryRuleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_reference"


    // $ANTLR start "ruleComponent_reference"
    // InternalMOloc.g:6362:1: ruleComponent_reference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return current; }
            // InternalMOloc.g:6368:2: ( ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* ) )
            // InternalMOloc.g:6369:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* )
            {
            // InternalMOloc.g:6369:2: ( (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )* )
            // InternalMOloc.g:6370:3: (kw= '.' )? this_IDENT_1= RULE_IDENT (this_ArraySubscripts_2= ruleArraySubscripts )? (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )*
            {
            // InternalMOloc.g:6370:3: (kw= '.' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==32) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalMOloc.g:6371:4: kw= '.'
                    {
                    kw=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_1, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_1());
              		
            }
            // InternalMOloc.g:6384:3: (this_ArraySubscripts_2= ruleArraySubscripts )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==69) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalMOloc.g:6385:4: this_ArraySubscripts_2= ruleArraySubscripts
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getComponent_referenceAccess().getArraySubscriptsParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_104);
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

            // InternalMOloc.g:6396:3: (kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )? )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==32) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalMOloc.g:6397:4: kw= '.' this_IDENT_4= RULE_IDENT (this_ArraySubscripts_5= ruleArraySubscripts )?
            	    {
            	    kw=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getComponent_referenceAccess().getFullStopKeyword_3_0());
            	      			
            	    }
            	    this_IDENT_4=(Token)match(input,RULE_IDENT,FOLLOW_103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_4, grammarAccess.getComponent_referenceAccess().getIDENTTerminalRuleCall_3_1());
            	      			
            	    }
            	    // InternalMOloc.g:6409:4: (this_ArraySubscripts_5= ruleArraySubscripts )?
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==69) ) {
            	        alt143=1;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // InternalMOloc.g:6410:5: this_ArraySubscripts_5= ruleArraySubscripts
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getComponent_referenceAccess().getArraySubscriptsParserRuleCall_3_2());
            	              				
            	            }
            	            pushFollow(FOLLOW_104);
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
            if ( state.backtracking>0 ) { memoize(input, 130, ruleComponent_reference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleComponent_reference"


    // $ANTLR start "entryRuleResultReference"
    // InternalMOloc.g:6426:1: entryRuleResultReference returns [String current=null] : iv_ruleResultReference= ruleResultReference EOF ;
    public final String entryRuleResultReference() throws RecognitionException {
        String current = null;
        int entryRuleResultReference_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleResultReference = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return current; }
            // InternalMOloc.g:6426:55: (iv_ruleResultReference= ruleResultReference EOF )
            // InternalMOloc.g:6427:2: iv_ruleResultReference= ruleResultReference EOF
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
            if ( state.backtracking>0 ) { memoize(input, 131, entryRuleResultReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleResultReference"


    // $ANTLR start "ruleResultReference"
    // InternalMOloc.g:6433:1: ruleResultReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleResultReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleResultReference_StartIndex = input.index();
        Token kw=null;
        Token this_UNSIGNED_NUMBER_5=null;
        AntlrDatatypeRuleToken this_Component_reference_0 = null;

        AntlrDatatypeRuleToken this_Component_reference_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return current; }
            // InternalMOloc.g:6439:2: ( (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) ) )
            // InternalMOloc.g:6440:2: (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) )
            {
            // InternalMOloc.g:6440:2: (this_Component_reference_0= ruleComponent_reference | (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' ) )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_IDENT||LA146_0==32) ) {
                alt146=1;
            }
            else if ( (LA146_0==66) ) {
                alt146=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalMOloc.g:6441:3: this_Component_reference_0= ruleComponent_reference
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
                    // InternalMOloc.g:6452:3: (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' )
                    {
                    // InternalMOloc.g:6452:3: (kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')' )
                    // InternalMOloc.g:6453:4: kw= 'der' kw= '(' this_Component_reference_3= ruleComponent_reference (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )? kw= ')'
                    {
                    kw=(Token)match(input,66,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getResultReferenceAccess().getDerKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,38,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getResultReferenceAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getResultReferenceAccess().getComponent_referenceParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_Component_reference_3=ruleComponent_reference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Component_reference_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:6473:4: (kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==35) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // InternalMOloc.g:6474:5: kw= ',' this_UNSIGNED_NUMBER_5= RULE_UNSIGNED_NUMBER
                            {
                            kw=(Token)match(input,35,FOLLOW_105); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getResultReferenceAccess().getCommaKeyword_1_3_0());
                              				
                            }
                            this_UNSIGNED_NUMBER_5=(Token)match(input,RULE_UNSIGNED_NUMBER,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_UNSIGNED_NUMBER_5);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_UNSIGNED_NUMBER_5, grammarAccess.getResultReferenceAccess().getUNSIGNED_NUMBERTerminalRuleCall_1_3_1());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 132, ruleResultReference_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleResultReference"


    // $ANTLR start "entryRuleFunctionCallArgs"
    // InternalMOloc.g:6497:1: entryRuleFunctionCallArgs returns [String current=null] : iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF ;
    public final String entryRuleFunctionCallArgs() throws RecognitionException {
        String current = null;
        int entryRuleFunctionCallArgs_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionCallArgs = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return current; }
            // InternalMOloc.g:6497:56: (iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF )
            // InternalMOloc.g:6498:2: iv_ruleFunctionCallArgs= ruleFunctionCallArgs EOF
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
            if ( state.backtracking>0 ) { memoize(input, 133, entryRuleFunctionCallArgs_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallArgs"


    // $ANTLR start "ruleFunctionCallArgs"
    // InternalMOloc.g:6504:1: ruleFunctionCallArgs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionCallArgs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionCallArgs_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return current; }
            // InternalMOloc.g:6510:2: ( (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' ) )
            // InternalMOloc.g:6511:2: (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' )
            {
            // InternalMOloc.g:6511:2: (kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')' )
            // InternalMOloc.g:6512:3: kw= '(' (this_FunctionArguments_1= ruleFunctionArguments )? kw= ')'
            {
            kw=(Token)match(input,38,FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionCallArgsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMOloc.g:6517:3: (this_FunctionArguments_1= ruleFunctionArguments )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( ((LA147_0>=RULE_IDENT && LA147_0<=RULE_TRUE_FALSE)||LA147_0==24||LA147_0==32||LA147_0==34||LA147_0==38||LA147_0==43||LA147_0==48||LA147_0==61||LA147_0==66||(LA147_0>=68 && LA147_0<=69)||LA147_0==73||(LA147_0>=80 && LA147_0<=82)||LA147_0==87) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalMOloc.g:6518:4: this_FunctionArguments_1= ruleFunctionArguments
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionCallArgsAccess().getFunctionArgumentsParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
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

            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 134, ruleFunctionCallArgs_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallArgs"


    // $ANTLR start "entryRuleFunctionArguments"
    // InternalMOloc.g:6538:1: entryRuleFunctionArguments returns [String current=null] : iv_ruleFunctionArguments= ruleFunctionArguments EOF ;
    public final String entryRuleFunctionArguments() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return current; }
            // InternalMOloc.g:6538:57: (iv_ruleFunctionArguments= ruleFunctionArguments EOF )
            // InternalMOloc.g:6539:2: iv_ruleFunctionArguments= ruleFunctionArguments EOF
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
            if ( state.backtracking>0 ) { memoize(input, 135, entryRuleFunctionArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArguments"


    // $ANTLR start "ruleFunctionArguments"
    // InternalMOloc.g:6545:1: ruleFunctionArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return current; }
            // InternalMOloc.g:6551:2: ( ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments ) )
            // InternalMOloc.g:6552:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments )
            {
            // InternalMOloc.g:6552:2: ( (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? ) | (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_8= ruleNamedArguments )
            int alt150=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UNSIGNED_NUMBER:
            case RULE_TRUE_FALSE:
            case 24:
            case 32:
            case 34:
            case 38:
            case 43:
            case 48:
            case 61:
            case 66:
            case 68:
            case 69:
            case 73:
            case 80:
            case 81:
            case 82:
                {
                alt150=1;
                }
                break;
            case RULE_IDENT:
                {
                int LA150_2 = input.LA(2);

                if ( (LA150_2==30) ) {
                    alt150=3;
                }
                else if ( (LA150_2==EOF||(LA150_2>=31 && LA150_2<=33)||LA150_2==35||(LA150_2>=38 && LA150_2<=39)||LA150_2==49||LA150_2==65||(LA150_2>=68 && LA150_2<=69)||(LA150_2>=71 && LA150_2<=72)||(LA150_2>=74 && LA150_2<=85)) ) {
                    alt150=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 150, 2, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                alt150=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // InternalMOloc.g:6553:3: (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
                    {
                    // InternalMOloc.g:6553:3: (this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )? )
                    // InternalMOloc.g:6554:4: this_Expression_0= ruleExpression ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_101);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:6564:4: ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) | (kw= 'for' this_ForIndices_4= ruleForIndices ) )?
                    int alt148=3;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==35) ) {
                        int LA148_1 = input.LA(2);

                        if ( (synpred189_InternalMOloc()) ) {
                            alt148=1;
                        }
                    }
                    else if ( (LA148_0==49) ) {
                        alt148=2;
                    }
                    switch (alt148) {
                        case 1 :
                            // InternalMOloc.g:6565:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
                            {
                            // InternalMOloc.g:6565:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
                            // InternalMOloc.g:6566:6: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return current;
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
                            // InternalMOloc.g:6583:5: (kw= 'for' this_ForIndices_4= ruleForIndices )
                            {
                            // InternalMOloc.g:6583:5: (kw= 'for' this_ForIndices_4= ruleForIndices )
                            // InternalMOloc.g:6584:6: kw= 'for' this_ForIndices_4= ruleForIndices
                            {
                            kw=(Token)match(input,49,FOLLOW_4); if (state.failed) return current;
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
                    // InternalMOloc.g:6603:3: (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? )
                    {
                    // InternalMOloc.g:6603:3: (this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )? )
                    // InternalMOloc.g:6604:4: this_FunctionPartialApplication_5= ruleFunctionPartialApplication (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getFunctionPartialApplicationParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_76);
                    this_FunctionPartialApplication_5=ruleFunctionPartialApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionPartialApplication_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:6614:4: (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==35) ) {
                        int LA149_1 = input.LA(2);

                        if ( (synpred192_InternalMOloc()) ) {
                            alt149=1;
                        }
                    }
                    switch (alt149) {
                        case 1 :
                            // InternalMOloc.g:6615:5: kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return current;
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
                    // InternalMOloc.g:6633:3: this_NamedArguments_8= ruleNamedArguments
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
            if ( state.backtracking>0 ) { memoize(input, 136, ruleFunctionArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArguments"


    // $ANTLR start "entryRuleFunctionArgumentsNonFirst"
    // InternalMOloc.g:6647:1: entryRuleFunctionArgumentsNonFirst returns [String current=null] : iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF ;
    public final String entryRuleFunctionArgumentsNonFirst() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArgumentsNonFirst_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArgumentsNonFirst = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return current; }
            // InternalMOloc.g:6647:65: (iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF )
            // InternalMOloc.g:6648:2: iv_ruleFunctionArgumentsNonFirst= ruleFunctionArgumentsNonFirst EOF
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
            if ( state.backtracking>0 ) { memoize(input, 137, entryRuleFunctionArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArgumentsNonFirst"


    // $ANTLR start "ruleFunctionArgumentsNonFirst"
    // InternalMOloc.g:6654:1: ruleFunctionArgumentsNonFirst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments ) ;
    public final AntlrDatatypeRuleToken ruleFunctionArgumentsNonFirst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionArgumentsNonFirst_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_0 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;

        AntlrDatatypeRuleToken this_NamedArguments_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return current; }
            // InternalMOloc.g:6660:2: ( ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments ) )
            // InternalMOloc.g:6661:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )
            {
            // InternalMOloc.g:6661:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )
            int alt152=2;
            alt152 = dfa152.predict(input);
            switch (alt152) {
                case 1 :
                    // InternalMOloc.g:6662:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
                    {
                    // InternalMOloc.g:6662:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
                    // InternalMOloc.g:6663:4: this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstAccess().getFunctionArgumentsParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_76);
                    this_FunctionArguments_0=ruleFunctionArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionArguments_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMOloc.g:6673:4: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==35) ) {
                        int LA151_1 = input.LA(2);

                        if ( (synpred194_InternalMOloc()) ) {
                            alt151=1;
                        }
                    }
                    switch (alt151) {
                        case 1 :
                            // InternalMOloc.g:6674:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                            {
                            kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return current;
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
                    // InternalMOloc.g:6692:3: this_NamedArguments_3= ruleNamedArguments
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
            if ( state.backtracking>0 ) { memoize(input, 138, ruleFunctionArgumentsNonFirst_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArgumentsNonFirst"


    // $ANTLR start "entryRuleFunctionPartialApplication"
    // InternalMOloc.g:6706:1: entryRuleFunctionPartialApplication returns [String current=null] : iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF ;
    public final String entryRuleFunctionPartialApplication() throws RecognitionException {
        String current = null;
        int entryRuleFunctionPartialApplication_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionPartialApplication = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return current; }
            // InternalMOloc.g:6706:66: (iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF )
            // InternalMOloc.g:6707:2: iv_ruleFunctionPartialApplication= ruleFunctionPartialApplication EOF
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
            if ( state.backtracking>0 ) { memoize(input, 139, entryRuleFunctionPartialApplication_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionPartialApplication"


    // $ANTLR start "ruleFunctionPartialApplication"
    // InternalMOloc.g:6713:1: ruleFunctionPartialApplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionPartialApplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionPartialApplication_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_NamedArguments_3 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return current; }
            // InternalMOloc.g:6719:2: ( (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' ) )
            // InternalMOloc.g:6720:2: (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' )
            {
            // InternalMOloc.g:6720:2: (kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')' )
            // InternalMOloc.g:6721:3: kw= 'function' this_TypeSpecifier_1= ruleTypeSpecifier kw= '(' this_NamedArguments_3= ruleNamedArguments kw= ')'
            {
            kw=(Token)match(input,87,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionPartialApplicationAccess().getFunctionKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionPartialApplicationAccess().getTypeSpecifierParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_40);
            this_TypeSpecifier_1=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeSpecifier_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,38,FOLLOW_107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionPartialApplicationAccess().getLeftParenthesisKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionPartialApplicationAccess().getNamedArgumentsParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_47);
            this_NamedArguments_3=ruleNamedArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NamedArguments_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 140, ruleFunctionPartialApplication_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionPartialApplication"


    // $ANTLR start "entryRuleNamedArguments"
    // InternalMOloc.g:6760:1: entryRuleNamedArguments returns [String current=null] : iv_ruleNamedArguments= ruleNamedArguments EOF ;
    public final String entryRuleNamedArguments() throws RecognitionException {
        String current = null;
        int entryRuleNamedArguments_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleNamedArguments = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return current; }
            // InternalMOloc.g:6760:54: (iv_ruleNamedArguments= ruleNamedArguments EOF )
            // InternalMOloc.g:6761:2: iv_ruleNamedArguments= ruleNamedArguments EOF
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
            if ( state.backtracking>0 ) { memoize(input, 141, entryRuleNamedArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArguments"


    // $ANTLR start "ruleNamedArguments"
    // InternalMOloc.g:6767:1: ruleNamedArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? ) ;
    public final AntlrDatatypeRuleToken ruleNamedArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleNamedArguments_StartIndex = input.index();
        Token kw=null;
        AntlrDatatypeRuleToken this_NamedArgument_0 = null;

        AntlrDatatypeRuleToken this_NamedArguments_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return current; }
            // InternalMOloc.g:6773:2: ( (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? ) )
            // InternalMOloc.g:6774:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? )
            {
            // InternalMOloc.g:6774:2: (this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )? )
            // InternalMOloc.g:6775:3: this_NamedArgument_0= ruleNamedArgument (kw= ',' this_NamedArguments_2= ruleNamedArguments )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNamedArgumentsAccess().getNamedArgumentParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_76);
            this_NamedArgument_0=ruleNamedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NamedArgument_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMOloc.g:6785:3: (kw= ',' this_NamedArguments_2= ruleNamedArguments )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==35) ) {
                int LA153_1 = input.LA(2);

                if ( (synpred196_InternalMOloc()) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // InternalMOloc.g:6786:4: kw= ',' this_NamedArguments_2= ruleNamedArguments
                    {
                    kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 142, ruleNamedArguments_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamedArguments"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalMOloc.g:6806:1: entryRuleNamedArgument returns [String current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final String entryRuleNamedArgument() throws RecognitionException {
        String current = null;
        int entryRuleNamedArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleNamedArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return current; }
            // InternalMOloc.g:6806:53: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalMOloc.g:6807:2: iv_ruleNamedArgument= ruleNamedArgument EOF
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
            if ( state.backtracking>0 ) { memoize(input, 143, entryRuleNamedArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalMOloc.g:6813:1: ruleNamedArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument ) ;
    public final AntlrDatatypeRuleToken ruleNamedArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleNamedArgument_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgument_2 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return current; }
            // InternalMOloc.g:6819:2: ( (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument ) )
            // InternalMOloc.g:6820:2: (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument )
            {
            // InternalMOloc.g:6820:2: (this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument )
            // InternalMOloc.g:6821:3: this_IDENT_0= RULE_IDENT kw= '=' this_FunctionArgument_2= ruleFunctionArgument
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getNamedArgumentAccess().getIDENTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,30,FOLLOW_107); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 144, ruleNamedArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleFunctionArgument"
    // InternalMOloc.g:6847:1: entryRuleFunctionArgument returns [String current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final String entryRuleFunctionArgument() throws RecognitionException {
        String current = null;
        int entryRuleFunctionArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleFunctionArgument = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return current; }
            // InternalMOloc.g:6847:56: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // InternalMOloc.g:6848:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
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
            if ( state.backtracking>0 ) { memoize(input, 145, entryRuleFunctionArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // InternalMOloc.g:6854:1: ruleFunctionArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication ) ;
    public final AntlrDatatypeRuleToken ruleFunctionArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleFunctionArgument_StartIndex = input.index();
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_FunctionPartialApplication_1 = null;



        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return current; }
            // InternalMOloc.g:6860:2: ( (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication ) )
            // InternalMOloc.g:6861:2: (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication )
            {
            // InternalMOloc.g:6861:2: (this_Expression_0= ruleExpression | this_FunctionPartialApplication_1= ruleFunctionPartialApplication )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( ((LA154_0>=RULE_IDENT && LA154_0<=RULE_TRUE_FALSE)||LA154_0==24||LA154_0==32||LA154_0==34||LA154_0==38||LA154_0==43||LA154_0==48||LA154_0==61||LA154_0==66||(LA154_0>=68 && LA154_0<=69)||LA154_0==73||(LA154_0>=80 && LA154_0<=82)) ) {
                alt154=1;
            }
            else if ( (LA154_0==87) ) {
                alt154=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // InternalMOloc.g:6862:3: this_Expression_0= ruleExpression
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
                    // InternalMOloc.g:6873:3: this_FunctionPartialApplication_1= ruleFunctionPartialApplication
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
            if ( state.backtracking>0 ) { memoize(input, 146, ruleFunctionArgument_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "entryRuleName"
    // InternalMOloc.g:6887:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;
        int entryRuleName_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return current; }
            // InternalMOloc.g:6887:44: (iv_ruleName= ruleName EOF )
            // InternalMOloc.g:6888:2: iv_ruleName= ruleName EOF
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
            if ( state.backtracking>0 ) { memoize(input, 147, entryRuleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMOloc.g:6894:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleName_StartIndex = input.index();
        Token this_IDENT_0=null;
        Token kw=null;
        Token this_IDENT_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return current; }
            // InternalMOloc.g:6900:2: ( (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* ) )
            // InternalMOloc.g:6901:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            {
            // InternalMOloc.g:6901:2: (this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )* )
            // InternalMOloc.g:6902:3: this_IDENT_0= RULE_IDENT (kw= '.' this_IDENT_2= RULE_IDENT )*
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENT_0, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_0());
              		
            }
            // InternalMOloc.g:6909:3: (kw= '.' this_IDENT_2= RULE_IDENT )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==32) ) {
                    int LA155_2 = input.LA(2);

                    if ( (LA155_2==RULE_IDENT) ) {
                        alt155=1;
                    }


                }


                switch (alt155) {
            	case 1 :
            	    // InternalMOloc.g:6910:4: kw= '.' this_IDENT_2= RULE_IDENT
            	    {
            	    kw=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_104); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENT_2, grammarAccess.getNameAccess().getIDENTTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop155;
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
            if ( state.backtracking>0 ) { memoize(input, 148, ruleName_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleClassType"
    // InternalMOloc.g:6927:1: ruleClassType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return current; }
            // InternalMOloc.g:6933:2: ( ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) ) )
            // InternalMOloc.g:6934:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            {
            // InternalMOloc.g:6934:2: ( (enumLiteral_0= 'NULLClassType' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'model' ) | (enumLiteral_3= 'record' ) | (enumLiteral_4= 'block' ) | (enumLiteral_5= 'connector' ) | (enumLiteral_6= 'type' ) | (enumLiteral_7= 'package' ) | (enumLiteral_8= 'function' ) )
            int alt156=9;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt156=1;
                }
                break;
            case 89:
                {
                alt156=2;
                }
                break;
            case 90:
                {
                alt156=3;
                }
                break;
            case 91:
                {
                alt156=4;
                }
                break;
            case 92:
                {
                alt156=5;
                }
                break;
            case 93:
                {
                alt156=6;
                }
                break;
            case 94:
                {
                alt156=7;
                }
                break;
            case 95:
                {
                alt156=8;
                }
                break;
            case 87:
                {
                alt156=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalMOloc.g:6935:3: (enumLiteral_0= 'NULLClassType' )
                    {
                    // InternalMOloc.g:6935:3: (enumLiteral_0= 'NULLClassType' )
                    // InternalMOloc.g:6936:4: enumLiteral_0= 'NULLClassType'
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
                    // InternalMOloc.g:6943:3: (enumLiteral_1= 'class' )
                    {
                    // InternalMOloc.g:6943:3: (enumLiteral_1= 'class' )
                    // InternalMOloc.g:6944:4: enumLiteral_1= 'class'
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
                    // InternalMOloc.g:6951:3: (enumLiteral_2= 'model' )
                    {
                    // InternalMOloc.g:6951:3: (enumLiteral_2= 'model' )
                    // InternalMOloc.g:6952:4: enumLiteral_2= 'model'
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
                    // InternalMOloc.g:6959:3: (enumLiteral_3= 'record' )
                    {
                    // InternalMOloc.g:6959:3: (enumLiteral_3= 'record' )
                    // InternalMOloc.g:6960:4: enumLiteral_3= 'record'
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
                    // InternalMOloc.g:6967:3: (enumLiteral_4= 'block' )
                    {
                    // InternalMOloc.g:6967:3: (enumLiteral_4= 'block' )
                    // InternalMOloc.g:6968:4: enumLiteral_4= 'block'
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
                    // InternalMOloc.g:6975:3: (enumLiteral_5= 'connector' )
                    {
                    // InternalMOloc.g:6975:3: (enumLiteral_5= 'connector' )
                    // InternalMOloc.g:6976:4: enumLiteral_5= 'connector'
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
                    // InternalMOloc.g:6983:3: (enumLiteral_6= 'type' )
                    {
                    // InternalMOloc.g:6983:3: (enumLiteral_6= 'type' )
                    // InternalMOloc.g:6984:4: enumLiteral_6= 'type'
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
                    // InternalMOloc.g:6991:3: (enumLiteral_7= 'package' )
                    {
                    // InternalMOloc.g:6991:3: (enumLiteral_7= 'package' )
                    // InternalMOloc.g:6992:4: enumLiteral_7= 'package'
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
                    // InternalMOloc.g:6999:3: (enumLiteral_8= 'function' )
                    {
                    // InternalMOloc.g:6999:3: (enumLiteral_8= 'function' )
                    // InternalMOloc.g:7000:4: enumLiteral_8= 'function'
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
            if ( state.backtracking>0 ) { memoize(input, 149, ruleClassType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "ruleRelationshipType"
    // InternalMOloc.g:7010:1: ruleRelationshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) ;
    public final Enumerator ruleRelationshipType() throws RecognitionException {
        Enumerator current = null;
        int ruleRelationshipType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return current; }
            // InternalMOloc.g:7016:2: ( ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) ) )
            // InternalMOloc.g:7017:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            {
            // InternalMOloc.g:7017:2: ( (enumLiteral_0= 'NULLRelationshipType' ) | (enumLiteral_1= 'flow' ) | (enumLiteral_2= 'stream' ) )
            int alt157=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt157=1;
                }
                break;
            case 97:
                {
                alt157=2;
                }
                break;
            case 98:
                {
                alt157=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // InternalMOloc.g:7018:3: (enumLiteral_0= 'NULLRelationshipType' )
                    {
                    // InternalMOloc.g:7018:3: (enumLiteral_0= 'NULLRelationshipType' )
                    // InternalMOloc.g:7019:4: enumLiteral_0= 'NULLRelationshipType'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:7026:3: (enumLiteral_1= 'flow' )
                    {
                    // InternalMOloc.g:7026:3: (enumLiteral_1= 'flow' )
                    // InternalMOloc.g:7027:4: enumLiteral_1= 'flow'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeAccess().getFlowEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:7034:3: (enumLiteral_2= 'stream' )
                    {
                    // InternalMOloc.g:7034:3: (enumLiteral_2= 'stream' )
                    // InternalMOloc.g:7035:4: enumLiteral_2= 'stream'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 150, ruleRelationshipType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "ruleParameterType"
    // InternalMOloc.g:7045:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;
        int ruleParameterType_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return current; }
            // InternalMOloc.g:7051:2: ( ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) ) )
            // InternalMOloc.g:7052:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            {
            // InternalMOloc.g:7052:2: ( (enumLiteral_0= 'NULLParameterType' ) | (enumLiteral_1= 'discrete' ) | (enumLiteral_2= 'parameter' ) | (enumLiteral_3= 'constant' ) )
            int alt158=4;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt158=1;
                }
                break;
            case 100:
                {
                alt158=2;
                }
                break;
            case 101:
                {
                alt158=3;
                }
                break;
            case 102:
                {
                alt158=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // InternalMOloc.g:7053:3: (enumLiteral_0= 'NULLParameterType' )
                    {
                    // InternalMOloc.g:7053:3: (enumLiteral_0= 'NULLParameterType' )
                    // InternalMOloc.g:7054:4: enumLiteral_0= 'NULLParameterType'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:7061:3: (enumLiteral_1= 'discrete' )
                    {
                    // InternalMOloc.g:7061:3: (enumLiteral_1= 'discrete' )
                    // InternalMOloc.g:7062:4: enumLiteral_1= 'discrete'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getDiscreteEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:7069:3: (enumLiteral_2= 'parameter' )
                    {
                    // InternalMOloc.g:7069:3: (enumLiteral_2= 'parameter' )
                    // InternalMOloc.g:7070:4: enumLiteral_2= 'parameter'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getParameterEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMOloc.g:7077:3: (enumLiteral_3= 'constant' )
                    {
                    // InternalMOloc.g:7077:3: (enumLiteral_3= 'constant' )
                    // InternalMOloc.g:7078:4: enumLiteral_3= 'constant'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 151, ruleParameterType_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "ruleDirection"
    // InternalMOloc.g:7088:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;
        int ruleDirection_StartIndex = input.index();
        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return current; }
            // InternalMOloc.g:7094:2: ( ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) ) )
            // InternalMOloc.g:7095:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            {
            // InternalMOloc.g:7095:2: ( (enumLiteral_0= 'NULLDirection' ) | (enumLiteral_1= 'input' ) | (enumLiteral_2= 'output' ) )
            int alt159=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt159=1;
                }
                break;
            case 104:
                {
                alt159=2;
                }
                break;
            case 105:
                {
                alt159=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // InternalMOloc.g:7096:3: (enumLiteral_0= 'NULLDirection' )
                    {
                    // InternalMOloc.g:7096:3: (enumLiteral_0= 'NULLDirection' )
                    // InternalMOloc.g:7097:4: enumLiteral_0= 'NULLDirection'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNullEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMOloc.g:7104:3: (enumLiteral_1= 'input' )
                    {
                    // InternalMOloc.g:7104:3: (enumLiteral_1= 'input' )
                    // InternalMOloc.g:7105:4: enumLiteral_1= 'input'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getInputEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMOloc.g:7112:3: (enumLiteral_2= 'output' )
                    {
                    // InternalMOloc.g:7112:3: (enumLiteral_2= 'output' )
                    // InternalMOloc.g:7113:4: enumLiteral_2= 'output'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 152, ruleDirection_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // $ANTLR start synpred26_InternalMOloc
    public final void synpred26_InternalMOloc_fragment() throws RecognitionException {   
        EObject lv_equations_3_0 = null;


        // InternalMOloc.g:719:4: ( (lv_equations_3_0= ruleEquation ) )
        // InternalMOloc.g:719:4: (lv_equations_3_0= ruleEquation )
        {
        // InternalMOloc.g:719:4: (lv_equations_3_0= ruleEquation )
        // InternalMOloc.g:720:5: lv_equations_3_0= ruleEquation
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
    // $ANTLR end synpred26_InternalMOloc

    // $ANTLR start synpred27_InternalMOloc
    public final void synpred27_InternalMOloc_fragment() throws RecognitionException {   
        EObject this_SimpleEquation_0 = null;


        // InternalMOloc.g:756:3: (this_SimpleEquation_0= ruleSimpleEquation )
        // InternalMOloc.g:756:3: this_SimpleEquation_0= ruleSimpleEquation
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
    // $ANTLR end synpred27_InternalMOloc

    // $ANTLR start synpred33_InternalMOloc
    public final void synpred33_InternalMOloc_fragment() throws RecognitionException {   
        EObject lv_statements_3_0 = null;


        // InternalMOloc.g:875:4: ( (lv_statements_3_0= ruleStatement ) )
        // InternalMOloc.g:875:4: (lv_statements_3_0= ruleStatement )
        {
        // InternalMOloc.g:875:4: (lv_statements_3_0= ruleStatement )
        // InternalMOloc.g:876:5: lv_statements_3_0= ruleStatement
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
    // $ANTLR end synpred33_InternalMOloc

    // $ANTLR start synpred158_InternalMOloc
    public final void synpred158_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Factor_5 = null;


        // InternalMOloc.g:5776:4: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )
        // InternalMOloc.g:5776:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor
        {
        // InternalMOloc.g:5776:4: (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' )
        int alt191=4;
        switch ( input.LA(1) ) {
        case 33:
            {
            alt191=1;
            }
            break;
        case 83:
            {
            alt191=2;
            }
            break;
        case 31:
            {
            alt191=3;
            }
            break;
        case 82:
            {
            alt191=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 191, 0, input);

            throw nvae;
        }

        switch (alt191) {
            case 1 :
                // InternalMOloc.g:5777:5: kw= '*'
                {
                kw=(Token)match(input,33,FOLLOW_91); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMOloc.g:5783:5: kw= '/'
                {
                kw=(Token)match(input,83,FOLLOW_91); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMOloc.g:5789:5: kw= '.*'
                {
                kw=(Token)match(input,31,FOLLOW_91); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMOloc.g:5795:5: kw= '.-'
                {
                kw=(Token)match(input,82,FOLLOW_91); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_2);
        this_Factor_5=ruleFactor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_InternalMOloc

    // $ANTLR start synpred167_InternalMOloc
    public final void synpred167_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_Component_reference_3 = null;

        AntlrDatatypeRuleToken this_FunctionCallArgs_7 = null;


        // InternalMOloc.g:5909:3: ( ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) )
        // InternalMOloc.g:5909:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
        {
        // InternalMOloc.g:5909:3: ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs )
        // InternalMOloc.g:5910:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs
        {
        // InternalMOloc.g:5910:4: (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' )
        int alt193=4;
        switch ( input.LA(1) ) {
        case RULE_IDENT:
        case 32:
            {
            alt193=1;
            }
            break;
        case 66:
            {
            alt193=2;
            }
            break;
        case 24:
            {
            alt193=3;
            }
            break;
        case 61:
            {
            alt193=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 193, 0, input);

            throw nvae;
        }

        switch (alt193) {
            case 1 :
                // InternalMOloc.g:5911:5: this_Component_reference_3= ruleComponent_reference
                {
                pushFollow(FOLLOW_40);
                this_Component_reference_3=ruleComponent_reference();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalMOloc.g:5922:5: kw= 'der'
                {
                kw=(Token)match(input,66,FOLLOW_40); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMOloc.g:5928:5: kw= 'initial'
                {
                kw=(Token)match(input,24,FOLLOW_40); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalMOloc.g:5934:5: kw= 'pure'
                {
                kw=(Token)match(input,61,FOLLOW_40); if (state.failed) return ;

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
    // $ANTLR end synpred167_InternalMOloc

    // $ANTLR start synpred168_InternalMOloc
    public final void synpred168_InternalMOloc_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ResultReference_8 = null;


        // InternalMOloc.g:5952:3: (this_ResultReference_8= ruleResultReference )
        // InternalMOloc.g:5952:3: this_ResultReference_8= ruleResultReference
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
    // $ANTLR end synpred168_InternalMOloc

    // $ANTLR start synpred180_InternalMOloc
    public final void synpred180_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_ForIndex_2 = null;


        // InternalMOloc.g:6292:4: (kw= ',' this_ForIndex_2= ruleForIndex )
        // InternalMOloc.g:6292:4: kw= ',' this_ForIndex_2= ruleForIndex
        {
        kw=(Token)match(input,35,FOLLOW_4); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_ForIndex_2=ruleForIndex();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_InternalMOloc

    // $ANTLR start synpred189_InternalMOloc
    public final void synpred189_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:6565:5: ( (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst ) )
        // InternalMOloc.g:6565:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        {
        // InternalMOloc.g:6565:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:6566:6: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred189_InternalMOloc

    // $ANTLR start synpred192_InternalMOloc
    public final void synpred192_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_7 = null;


        // InternalMOloc.g:6615:5: (kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:6615:5: kw= ',' this_FunctionArgumentsNonFirst_7= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_7=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred192_InternalMOloc

    // $ANTLR start synpred194_InternalMOloc
    public final void synpred194_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:6674:5: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )
        // InternalMOloc.g:6674:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
        {
        kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_FunctionArgumentsNonFirst_2=ruleFunctionArgumentsNonFirst();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred194_InternalMOloc

    // $ANTLR start synpred195_InternalMOloc
    public final void synpred195_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionArguments_0 = null;

        AntlrDatatypeRuleToken this_FunctionArgumentsNonFirst_2 = null;


        // InternalMOloc.g:6662:3: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) )
        // InternalMOloc.g:6662:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
        {
        // InternalMOloc.g:6662:3: (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? )
        // InternalMOloc.g:6663:4: this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFunctionArgumentsNonFirstAccess().getFunctionArgumentsParserRuleCall_0_0());
          			
        }
        pushFollow(FOLLOW_76);
        this_FunctionArguments_0=ruleFunctionArguments();

        state._fsp--;
        if (state.failed) return ;
        // InternalMOloc.g:6673:4: (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )?
        int alt199=2;
        int LA199_0 = input.LA(1);

        if ( (LA199_0==35) ) {
            alt199=1;
        }
        switch (alt199) {
            case 1 :
                // InternalMOloc.g:6674:5: kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst
                {
                kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return ;
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
    // $ANTLR end synpred195_InternalMOloc

    // $ANTLR start synpred196_InternalMOloc
    public final void synpred196_InternalMOloc_fragment() throws RecognitionException {   
        Token kw=null;
        AntlrDatatypeRuleToken this_NamedArguments_2 = null;


        // InternalMOloc.g:6786:4: (kw= ',' this_NamedArguments_2= ruleNamedArguments )
        // InternalMOloc.g:6786:4: kw= ',' this_NamedArguments_2= ruleNamedArguments
        {
        kw=(Token)match(input,35,FOLLOW_107); if (state.failed) return ;
        pushFollow(FOLLOW_2);
        this_NamedArguments_2=ruleNamedArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred196_InternalMOloc

    // Delegated rules

    public final boolean synpred195_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred195_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred167_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred167_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred196_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred196_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred192_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred192_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred189_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred189_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalMOloc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalMOloc_fragment(); // can never throw exception
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
    public final boolean synpred194_InternalMOloc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_InternalMOloc_fragment(); // can never throw exception
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA127 dfa127 = new DFA127(this);
    protected DFA132 dfa132 = new DFA132(this);
    protected DFA152 dfa152 = new DFA152(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\3\uffff\1\5\2\uffff\1\5";
    static final String dfa_3s = "\1\4\2\uffff\2\4\1\uffff\1\4";
    static final String dfa_4s = "\1\151\2\uffff\1\103\1\4\1\uffff\1\103";
    static final String dfa_5s = "\1\uffff\1\1\1\2\2\uffff\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\33\uffff\1\2\31\uffff\6\1\27\uffff\11\1\12\2",
            "",
            "",
            "\1\2\1\5\30\uffff\1\5\1\uffff\1\4\2\uffff\1\5\2\uffff\2\5\16\uffff\1\5\14\uffff\1\5",
            "\1\6",
            "",
            "\1\2\1\5\30\uffff\1\5\1\uffff\1\4\2\uffff\1\5\2\uffff\2\5\16\uffff\1\5\14\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "370:3: (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] )";
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "507:3: (this_short_class_definition_4= ruleshort_class_definition[$current] | this_component_clause1_5= rulecomponent_clause1[$current] | this_element_modification_6= ruleelement_modification[$current] )";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\3\4\5\uffff\1\31\2\uffff";
    static final String dfa_10s = "\3\151\5\uffff\1\32\2\uffff";
    static final String dfa_11s = "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\1\7";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\5\17\uffff\2\5\1\uffff\1\5\1\10\1\11\1\12\1\1\1\2\1\3\2\uffff\1\5\4\uffff\1\4\2\uffff\2\5\1\7\1\uffff\1\6\15\uffff\6\5\27\uffff\23\5",
            "\1\5\17\uffff\2\5\1\uffff\1\5\4\uffff\1\2\1\3\2\uffff\1\5\4\uffff\1\4\2\uffff\2\5\20\uffff\6\5\27\uffff\23\5",
            "\1\5\17\uffff\2\5\1\uffff\1\5\5\uffff\1\3\2\uffff\1\5\4\uffff\1\4\2\uffff\2\5\20\uffff\6\5\27\uffff\23\5",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\12",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "587:2: (this_ImportClause_0= ruleImportClause | this_ExtendsClause_1= ruleExtendsClause | this_ComponentClause_2= ruleComponentClause | this_ExternalElement_3= ruleExternalElement | this_AnnotationClause_4= ruleAnnotationClause | this_EquationSection_5= ruleEquationSection | this_AlgorithmSection_6= ruleAlgorithmSection )";
        }
    }
    static final String dfa_14s = "\74\uffff";
    static final String dfa_15s = "\1\1\73\uffff";
    static final String dfa_16s = "\1\4\1\uffff\1\0\14\uffff\1\0\25\uffff\2\0\2\uffff\1\0\22\uffff";
    static final String dfa_17s = "\1\151\1\uffff\1\0\14\uffff\1\0\25\uffff\2\0\2\uffff\1\0\22\uffff";
    static final String dfa_18s = "\1\uffff\1\2\52\uffff\1\1\17\uffff";
    static final String dfa_19s = "\2\uffff\1\0\14\uffff\1\1\25\uffff\1\2\1\3\2\uffff\1\4\22\uffff}>";
    static final String[] dfa_20s = {
            "\1\46\3\54\14\uffff\2\1\1\uffff\1\1\1\51\5\1\2\uffff\1\45\1\uffff\1\54\2\uffff\1\1\1\54\1\uffff\3\1\1\54\1\1\3\uffff\1\2\1\54\1\uffff\2\54\5\uffff\3\1\1\17\2\1\2\uffff\1\54\1\uffff\2\54\3\uffff\1\54\6\uffff\3\54\4\uffff\23\1",
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
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 718:3: ( (lv_equations_3_0= ruleEquation ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_15 = input.LA(1);

                         
                        int index19_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_37 = input.LA(1);

                         
                        int index19_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_37);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_38 = input.LA(1);

                         
                        int index19_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_38);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_41 = input.LA(1);

                         
                        int index19_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_41);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
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
            "\1\12\3\1\20\uffff\1\1\7\uffff\1\11\1\uffff\1\1\3\uffff\1\1\4\uffff\1\22\4\uffff\1\1\1\23\1\uffff\1\24\1\25\10\uffff\1\1\4\uffff\1\1\1\uffff\2\1\3\uffff\1\1\6\uffff\3\1",
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "755:2: (this_SimpleEquation_0= ruleSimpleEquation | this_IfEquation_1= ruleIfEquation | this_ForEquation_2= ruleForEquation | this_ConnectEquation_3= ruleConnectEquation | this_WhenEquation_4= ruleWhenEquation | this_FunctionEquation_5= ruleFunctionEquation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_10 = input.LA(1);

                         
                        int index20_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index20_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\63\uffff";
    static final String dfa_28s = "\1\1\62\uffff";
    static final String dfa_29s = "\1\4\44\uffff\2\0\14\uffff";
    static final String dfa_30s = "\1\151\44\uffff\2\0\14\uffff";
    static final String dfa_31s = "\1\uffff\1\2\52\uffff\1\1\6\uffff";
    static final String dfa_32s = "\45\uffff\1\0\1\1\14\uffff}>";
    static final String[] dfa_33s = {
            "\1\46\17\uffff\2\1\1\uffff\7\1\2\uffff\1\45\4\uffff\1\1\1\54\1\uffff\3\1\1\54\1\1\3\uffff\1\1\1\54\2\uffff\1\54\2\uffff\3\54\6\1\27\uffff\23\1",
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

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 874:3: ( (lv_statements_3_0= ruleStatement ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_37 = input.LA(1);

                         
                        int index22_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_37);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_38 = input.LA(1);

                         
                        int index22_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMOloc()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_38);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
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
            "\1\1\15\uffff\1\1\12\uffff\1\1\1\36\1\uffff\1\36\1\uffff\2\1\2\uffff\1\1\2\uffff\2\1\1\uffff\3\1\1\uffff\2\1\16\uffff\1\1\1\uffff\2\1\1\uffff\3\1\1\uffff\10\1\1\4\1\36",
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

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 5775:3: ( (kw= '*' | kw= '/' | kw= '.*' | kw= '.-' ) this_Factor_5= ruleFactor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA127_4 = input.LA(1);

                         
                        int index127_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred158_InternalMOloc()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index127_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 127, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\16\uffff";
    static final String dfa_42s = "\1\4\3\uffff\3\0\7\uffff";
    static final String dfa_43s = "\1\105\3\uffff\3\0\7\uffff";
    static final String dfa_44s = "\1\uffff\1\1\1\2\1\3\3\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\5";
    static final String dfa_45s = "\4\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] dfa_46s = {
            "\1\5\1\2\1\1\1\3\20\uffff\1\7\7\uffff\1\4\1\uffff\1\13\3\uffff\1\11\11\uffff\1\14\14\uffff\1\7\4\uffff\1\6\2\uffff\1\12",
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

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "5884:2: (this_UNSIGNED_NUMBER_0= RULE_UNSIGNED_NUMBER | this_STRING_1= RULE_STRING | this_TRUE_FALSE_2= RULE_TRUE_FALSE | ( (this_Component_reference_3= ruleComponent_reference | kw= 'der' | kw= 'initial' | kw= 'pure' ) this_FunctionCallArgs_7= ruleFunctionCallArgs ) | this_ResultReference_8= ruleResultReference | (kw= '(' this_OutputExpressionList_10= ruleOutputExpressionList kw= ')' ) | (kw= '[' this_ExpressionList_13= ruleExpressionList (kw= ';' this_ExpressionList_15= ruleExpressionList )* kw= ']' ) | (kw= '{' this_ArrayArguments_18= ruleArrayArguments kw= '}' ) | kw= 'end' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA132_4 = input.LA(1);

                         
                        int index132_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred167_InternalMOloc()) ) {s = 7;}

                        else if ( (synpred168_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index132_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA132_5 = input.LA(1);

                         
                        int index132_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred167_InternalMOloc()) ) {s = 7;}

                        else if ( (synpred168_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index132_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA132_6 = input.LA(1);

                         
                        int index132_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred167_InternalMOloc()) ) {s = 7;}

                        else if ( (synpred168_InternalMOloc()) ) {s = 13;}

                         
                        input.seek(index132_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 132, _s, input);
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
            "\1\12\3\1\20\uffff\1\1\7\uffff\1\1\1\uffff\1\1\3\uffff\1\1\4\uffff\1\1\4\uffff\1\1\14\uffff\1\1\4\uffff\1\1\1\uffff\2\1\3\uffff\1\1\6\uffff\3\1\4\uffff\1\1",
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

    class DFA152 extends DFA {

        public DFA152(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 152;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "6661:2: ( (this_FunctionArguments_0= ruleFunctionArguments (kw= ',' this_FunctionArgumentsNonFirst_2= ruleFunctionArgumentsNonFirst )? ) | this_NamedArguments_3= ruleNamedArguments )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA152_10 = input.LA(1);

                         
                        int index152_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred195_InternalMOloc()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index152_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 152, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFC00000000100002L,0x00000000FF800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xFC00000000100000L,0x00000000FF800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xFC00000100D00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x201B0845010000F2L,0x0000000000070234L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0392084100000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040180000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000010L,0x000003FF00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000044000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFC80008100F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xFC80000100F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFC00030110B00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFC00030100B00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xFC00030100900010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xFC00020100900010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFC00000100900010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xFC00000100100010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000080020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xFC00000100F00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x20010845010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040100080030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040100080010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x200108C5010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x201BC845010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x201B0845010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x203B0845010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0040004000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x200108CD010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0393C84100000010L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0393084100000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x03B3084100000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xFC0117613FB00030L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xFC0117213FB00030L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0xFC0117213FB00010L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000100000010L,0x000003FF00000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000044000000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000044000000020L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000008000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0xFC0017213FB00012L,0x000003FFFF800000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0040004040000020L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x000003F800000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0040004040000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0040004040000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x20810845010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x20010845010000F0L,0x0000000000070236L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x20010045010000F0L,0x0000000000070234L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FC00L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070010L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000280000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x2001084D010000F2L,0x0000000000070234L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0002000800000002L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000100000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x200108C5010000F0L,0x0000000000870234L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x20010845010000F0L,0x0000000000870234L});

}