package dut.control.sysmloc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dut.control.sysmloc.services.SysMLOCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSysMLOCParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_NORMAL_VALUE", "RULE_OPERATOR", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "';'", "'='", "':'", "':>'", "'specializes'", "'subsets'", "'::>'", "'references'", "'=>'", "'crosses'", "':>>'", "'redefines'", "'public'", "'private'", "'protected'", "'package'", "'{'", "'}'", "'import'", "'doc'", "'attribute'", "'def'", "'part'", "'action'", "'['", "']'", "'..'", "'defined'", "'by'", "','", "'::'", "'.'", "':='", "'default'", "'ordered'", "'nonunique'"
    };
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=13;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL_VALUE=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=12;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_REGULAR_COMMENT=8;
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
    public static final int RULE_OPERATOR=7;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_UNRESTRICTED_NAME=5;
    public static final int RULE_NORMAL_VALUE=6;
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

    	public void setGrammarAccess(SysMLOCGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleNamespace"
    // InternalSysMLOC.g:54:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalSysMLOC.g:55:1: ( ruleNamespace EOF )
            // InternalSysMLOC.g:56:1: ruleNamespace EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalSysMLOC.g:63:1: ruleNamespace : ( ( rule__Namespace__PackagesAssignment )* ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:67:2: ( ( ( rule__Namespace__PackagesAssignment )* ) )
            // InternalSysMLOC.g:68:2: ( ( rule__Namespace__PackagesAssignment )* )
            {
            // InternalSysMLOC.g:68:2: ( ( rule__Namespace__PackagesAssignment )* )
            // InternalSysMLOC.g:69:3: ( rule__Namespace__PackagesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getPackagesAssignment()); 
            }
            // InternalSysMLOC.g:70:3: ( rule__Namespace__PackagesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSysMLOC.g:70:4: rule__Namespace__PackagesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Namespace__PackagesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceAccess().getPackagesAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRulePackage"
    // InternalSysMLOC.g:79:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:80:1: ( rulePackage EOF )
            // InternalSysMLOC.g:81:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSysMLOC.g:88:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:92:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSysMLOC.g:93:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSysMLOC.g:93:2: ( ( rule__Package__Group__0 ) )
            // InternalSysMLOC.g:94:3: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // InternalSysMLOC.g:95:3: ( rule__Package__Group__0 )
            // InternalSysMLOC.g:95:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleBaseElement"
    // InternalSysMLOC.g:104:1: entryRuleBaseElement : ruleBaseElement EOF ;
    public final void entryRuleBaseElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:105:1: ( ruleBaseElement EOF )
            // InternalSysMLOC.g:106:1: ruleBaseElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBaseElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseElement"


    // $ANTLR start "ruleBaseElement"
    // InternalSysMLOC.g:113:1: ruleBaseElement : ( ( rule__BaseElement__Alternatives ) ) ;
    public final void ruleBaseElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:117:2: ( ( ( rule__BaseElement__Alternatives ) ) )
            // InternalSysMLOC.g:118:2: ( ( rule__BaseElement__Alternatives ) )
            {
            // InternalSysMLOC.g:118:2: ( ( rule__BaseElement__Alternatives ) )
            // InternalSysMLOC.g:119:3: ( rule__BaseElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseElementAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:120:3: ( rule__BaseElement__Alternatives )
            // InternalSysMLOC.g:120:4: rule__BaseElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseElement"


    // $ANTLR start "entryRuleAnnotatingElement"
    // InternalSysMLOC.g:129:1: entryRuleAnnotatingElement : ruleAnnotatingElement EOF ;
    public final void entryRuleAnnotatingElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:130:1: ( ruleAnnotatingElement EOF )
            // InternalSysMLOC.g:131:1: ruleAnnotatingElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatingElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnnotatingElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatingElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotatingElement"


    // $ANTLR start "ruleAnnotatingElement"
    // InternalSysMLOC.g:138:1: ruleAnnotatingElement : ( ruleComment ) ;
    public final void ruleAnnotatingElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:142:2: ( ( ruleComment ) )
            // InternalSysMLOC.g:143:2: ( ruleComment )
            {
            // InternalSysMLOC.g:143:2: ( ruleComment )
            // InternalSysMLOC.g:144:3: ruleComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotatingElement"


    // $ANTLR start "entryRuleImportElement"
    // InternalSysMLOC.g:154:1: entryRuleImportElement : ruleImportElement EOF ;
    public final void entryRuleImportElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:155:1: ( ruleImportElement EOF )
            // InternalSysMLOC.g:156:1: ruleImportElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportElement"


    // $ANTLR start "ruleImportElement"
    // InternalSysMLOC.g:163:1: ruleImportElement : ( ruleNamespaceImport ) ;
    public final void ruleImportElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:167:2: ( ( ruleNamespaceImport ) )
            // InternalSysMLOC.g:168:2: ( ruleNamespaceImport )
            {
            // InternalSysMLOC.g:168:2: ( ruleNamespaceImport )
            // InternalSysMLOC.g:169:3: ruleNamespaceImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportElementAccess().getNamespaceImportParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportElementAccess().getNamespaceImportParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportElement"


    // $ANTLR start "entryRuleDefinitionElement"
    // InternalSysMLOC.g:179:1: entryRuleDefinitionElement : ruleDefinitionElement EOF ;
    public final void entryRuleDefinitionElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:180:1: ( ruleDefinitionElement EOF )
            // InternalSysMLOC.g:181:1: ruleDefinitionElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefinitionElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinitionElement"


    // $ANTLR start "ruleDefinitionElement"
    // InternalSysMLOC.g:188:1: ruleDefinitionElement : ( ( rule__DefinitionElement__Alternatives ) ) ;
    public final void ruleDefinitionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:192:2: ( ( ( rule__DefinitionElement__Alternatives ) ) )
            // InternalSysMLOC.g:193:2: ( ( rule__DefinitionElement__Alternatives ) )
            {
            // InternalSysMLOC.g:193:2: ( ( rule__DefinitionElement__Alternatives ) )
            // InternalSysMLOC.g:194:3: ( rule__DefinitionElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionElementAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:195:3: ( rule__DefinitionElement__Alternatives )
            // InternalSysMLOC.g:195:4: rule__DefinitionElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinitionElement"


    // $ANTLR start "entryRuleUsageElement"
    // InternalSysMLOC.g:204:1: entryRuleUsageElement : ruleUsageElement EOF ;
    public final void entryRuleUsageElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:205:1: ( ruleUsageElement EOF )
            // InternalSysMLOC.g:206:1: ruleUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUsageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsageElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUsageElement"


    // $ANTLR start "ruleUsageElement"
    // InternalSysMLOC.g:213:1: ruleUsageElement : ( ( rule__UsageElement__Alternatives ) ) ;
    public final void ruleUsageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:217:2: ( ( ( rule__UsageElement__Alternatives ) ) )
            // InternalSysMLOC.g:218:2: ( ( rule__UsageElement__Alternatives ) )
            {
            // InternalSysMLOC.g:218:2: ( ( rule__UsageElement__Alternatives ) )
            // InternalSysMLOC.g:219:3: ( rule__UsageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsageElementAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:220:3: ( rule__UsageElement__Alternatives )
            // InternalSysMLOC.g:220:4: rule__UsageElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UsageElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsageElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsageElement"


    // $ANTLR start "entryRuleNonOccurrenceUsageElement"
    // InternalSysMLOC.g:229:1: entryRuleNonOccurrenceUsageElement : ruleNonOccurrenceUsageElement EOF ;
    public final void entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:230:1: ( ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:231:1: ruleNonOccurrenceUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonOccurrenceUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNonOccurrenceUsageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonOccurrenceUsageElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonOccurrenceUsageElement"


    // $ANTLR start "ruleNonOccurrenceUsageElement"
    // InternalSysMLOC.g:238:1: ruleNonOccurrenceUsageElement : ( ruleAttributeUsage ) ;
    public final void ruleNonOccurrenceUsageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:242:2: ( ( ruleAttributeUsage ) )
            // InternalSysMLOC.g:243:2: ( ruleAttributeUsage )
            {
            // InternalSysMLOC.g:243:2: ( ruleAttributeUsage )
            // InternalSysMLOC.g:244:3: ruleAttributeUsage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonOccurrenceUsageElementAccess().getAttributeUsageParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributeUsage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonOccurrenceUsageElementAccess().getAttributeUsageParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonOccurrenceUsageElement"


    // $ANTLR start "entryRuleOccurrenceUsageElement"
    // InternalSysMLOC.g:254:1: entryRuleOccurrenceUsageElement : ruleOccurrenceUsageElement EOF ;
    public final void entryRuleOccurrenceUsageElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:255:1: ( ruleOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:256:1: ruleOccurrenceUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOccurrenceUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOccurrenceUsageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOccurrenceUsageElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOccurrenceUsageElement"


    // $ANTLR start "ruleOccurrenceUsageElement"
    // InternalSysMLOC.g:263:1: ruleOccurrenceUsageElement : ( ( rule__OccurrenceUsageElement__Alternatives ) ) ;
    public final void ruleOccurrenceUsageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:267:2: ( ( ( rule__OccurrenceUsageElement__Alternatives ) ) )
            // InternalSysMLOC.g:268:2: ( ( rule__OccurrenceUsageElement__Alternatives ) )
            {
            // InternalSysMLOC.g:268:2: ( ( rule__OccurrenceUsageElement__Alternatives ) )
            // InternalSysMLOC.g:269:3: ( rule__OccurrenceUsageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOccurrenceUsageElementAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:270:3: ( rule__OccurrenceUsageElement__Alternatives )
            // InternalSysMLOC.g:270:4: rule__OccurrenceUsageElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OccurrenceUsageElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOccurrenceUsageElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOccurrenceUsageElement"


    // $ANTLR start "entryRuleStructureUsageElement"
    // InternalSysMLOC.g:279:1: entryRuleStructureUsageElement : ruleStructureUsageElement EOF ;
    public final void entryRuleStructureUsageElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:280:1: ( ruleStructureUsageElement EOF )
            // InternalSysMLOC.g:281:1: ruleStructureUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStructureUsageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureUsageElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructureUsageElement"


    // $ANTLR start "ruleStructureUsageElement"
    // InternalSysMLOC.g:288:1: ruleStructureUsageElement : ( rulePartUsage ) ;
    public final void ruleStructureUsageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:292:2: ( ( rulePartUsage ) )
            // InternalSysMLOC.g:293:2: ( rulePartUsage )
            {
            // InternalSysMLOC.g:293:2: ( rulePartUsage )
            // InternalSysMLOC.g:294:3: rulePartUsage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructureUsageElementAccess().getPartUsageParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            rulePartUsage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructureUsageElementAccess().getPartUsageParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructureUsageElement"


    // $ANTLR start "entryRuleBehaviorUsageElement"
    // InternalSysMLOC.g:304:1: entryRuleBehaviorUsageElement : ruleBehaviorUsageElement EOF ;
    public final void entryRuleBehaviorUsageElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:305:1: ( ruleBehaviorUsageElement EOF )
            // InternalSysMLOC.g:306:1: ruleBehaviorUsageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorUsageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBehaviorUsageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorUsageElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviorUsageElement"


    // $ANTLR start "ruleBehaviorUsageElement"
    // InternalSysMLOC.g:313:1: ruleBehaviorUsageElement : ( ruleActionUsage ) ;
    public final void ruleBehaviorUsageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:317:2: ( ( ruleActionUsage ) )
            // InternalSysMLOC.g:318:2: ( ruleActionUsage )
            {
            // InternalSysMLOC.g:318:2: ( ruleActionUsage )
            // InternalSysMLOC.g:319:3: ruleActionUsage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorUsageElementAccess().getActionUsageParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleActionUsage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorUsageElementAccess().getActionUsageParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorUsageElement"


    // $ANTLR start "entryRuleNamespaceImport"
    // InternalSysMLOC.g:329:1: entryRuleNamespaceImport : ruleNamespaceImport EOF ;
    public final void entryRuleNamespaceImport() throws RecognitionException {
        try {
            // InternalSysMLOC.g:330:1: ( ruleNamespaceImport EOF )
            // InternalSysMLOC.g:331:1: ruleNamespaceImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespaceImport"


    // $ANTLR start "ruleNamespaceImport"
    // InternalSysMLOC.g:338:1: ruleNamespaceImport : ( ( rule__NamespaceImport__Group__0 ) ) ;
    public final void ruleNamespaceImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:342:2: ( ( ( rule__NamespaceImport__Group__0 ) ) )
            // InternalSysMLOC.g:343:2: ( ( rule__NamespaceImport__Group__0 ) )
            {
            // InternalSysMLOC.g:343:2: ( ( rule__NamespaceImport__Group__0 ) )
            // InternalSysMLOC.g:344:3: ( rule__NamespaceImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getGroup()); 
            }
            // InternalSysMLOC.g:345:3: ( rule__NamespaceImport__Group__0 )
            // InternalSysMLOC.g:345:4: rule__NamespaceImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespaceImport"


    // $ANTLR start "entryRuleComment"
    // InternalSysMLOC.g:354:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalSysMLOC.g:355:1: ( ruleComment EOF )
            // InternalSysMLOC.g:356:1: ruleComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalSysMLOC.g:363:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:367:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalSysMLOC.g:368:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalSysMLOC.g:368:2: ( ( rule__Comment__Group__0 ) )
            // InternalSysMLOC.g:369:3: ( rule__Comment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getGroup()); 
            }
            // InternalSysMLOC.g:370:3: ( rule__Comment__Group__0 )
            // InternalSysMLOC.g:370:4: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalSysMLOC.g:379:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalSysMLOC.g:380:1: ( ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:381:1: ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalSysMLOC.g:388:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:392:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalSysMLOC.g:393:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalSysMLOC.g:393:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalSysMLOC.g:394:3: ( rule__AttributeDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            }
            // InternalSysMLOC.g:395:3: ( rule__AttributeDefinition__Group__0 )
            // InternalSysMLOC.g:395:4: rule__AttributeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRulePartDefinition"
    // InternalSysMLOC.g:404:1: entryRulePartDefinition : rulePartDefinition EOF ;
    public final void entryRulePartDefinition() throws RecognitionException {
        try {
            // InternalSysMLOC.g:405:1: ( rulePartDefinition EOF )
            // InternalSysMLOC.g:406:1: rulePartDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePartDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartDefinition"


    // $ANTLR start "rulePartDefinition"
    // InternalSysMLOC.g:413:1: rulePartDefinition : ( ( rule__PartDefinition__Group__0 ) ) ;
    public final void rulePartDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:417:2: ( ( ( rule__PartDefinition__Group__0 ) ) )
            // InternalSysMLOC.g:418:2: ( ( rule__PartDefinition__Group__0 ) )
            {
            // InternalSysMLOC.g:418:2: ( ( rule__PartDefinition__Group__0 ) )
            // InternalSysMLOC.g:419:3: ( rule__PartDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getGroup()); 
            }
            // InternalSysMLOC.g:420:3: ( rule__PartDefinition__Group__0 )
            // InternalSysMLOC.g:420:4: rule__PartDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartDefinition"


    // $ANTLR start "entryRuleAttributeUsage"
    // InternalSysMLOC.g:429:1: entryRuleAttributeUsage : ruleAttributeUsage EOF ;
    public final void entryRuleAttributeUsage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:430:1: ( ruleAttributeUsage EOF )
            // InternalSysMLOC.g:431:1: ruleAttributeUsage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributeUsage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeUsage"


    // $ANTLR start "ruleAttributeUsage"
    // InternalSysMLOC.g:438:1: ruleAttributeUsage : ( ( rule__AttributeUsage__Group__0 ) ) ;
    public final void ruleAttributeUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:442:2: ( ( ( rule__AttributeUsage__Group__0 ) ) )
            // InternalSysMLOC.g:443:2: ( ( rule__AttributeUsage__Group__0 ) )
            {
            // InternalSysMLOC.g:443:2: ( ( rule__AttributeUsage__Group__0 ) )
            // InternalSysMLOC.g:444:3: ( rule__AttributeUsage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getGroup()); 
            }
            // InternalSysMLOC.g:445:3: ( rule__AttributeUsage__Group__0 )
            // InternalSysMLOC.g:445:4: rule__AttributeUsage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeUsage"


    // $ANTLR start "entryRuleActionUsage"
    // InternalSysMLOC.g:454:1: entryRuleActionUsage : ruleActionUsage EOF ;
    public final void entryRuleActionUsage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:455:1: ( ruleActionUsage EOF )
            // InternalSysMLOC.g:456:1: ruleActionUsage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleActionUsage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionUsage"


    // $ANTLR start "ruleActionUsage"
    // InternalSysMLOC.g:463:1: ruleActionUsage : ( ( rule__ActionUsage__Group__0 ) ) ;
    public final void ruleActionUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:467:2: ( ( ( rule__ActionUsage__Group__0 ) ) )
            // InternalSysMLOC.g:468:2: ( ( rule__ActionUsage__Group__0 ) )
            {
            // InternalSysMLOC.g:468:2: ( ( rule__ActionUsage__Group__0 ) )
            // InternalSysMLOC.g:469:3: ( rule__ActionUsage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getGroup()); 
            }
            // InternalSysMLOC.g:470:3: ( rule__ActionUsage__Group__0 )
            // InternalSysMLOC.g:470:4: rule__ActionUsage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionUsage"


    // $ANTLR start "entryRulePartUsage"
    // InternalSysMLOC.g:479:1: entryRulePartUsage : rulePartUsage EOF ;
    public final void entryRulePartUsage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:480:1: ( rulePartUsage EOF )
            // InternalSysMLOC.g:481:1: rulePartUsage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePartUsage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePartUsage"


    // $ANTLR start "rulePartUsage"
    // InternalSysMLOC.g:488:1: rulePartUsage : ( ( rule__PartUsage__Group__0 ) ) ;
    public final void rulePartUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:492:2: ( ( ( rule__PartUsage__Group__0 ) ) )
            // InternalSysMLOC.g:493:2: ( ( rule__PartUsage__Group__0 ) )
            {
            // InternalSysMLOC.g:493:2: ( ( rule__PartUsage__Group__0 ) )
            // InternalSysMLOC.g:494:3: ( rule__PartUsage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getGroup()); 
            }
            // InternalSysMLOC.g:495:3: ( rule__PartUsage__Group__0 )
            // InternalSysMLOC.g:495:4: rule__PartUsage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartUsage"


    // $ANTLR start "ruleUsage"
    // InternalSysMLOC.g:505:1: ruleUsage : ( ( rule__Usage__Group__0 ) ) ;
    public final void ruleUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:509:2: ( ( ( rule__Usage__Group__0 ) ) )
            // InternalSysMLOC.g:510:2: ( ( rule__Usage__Group__0 ) )
            {
            // InternalSysMLOC.g:510:2: ( ( rule__Usage__Group__0 ) )
            // InternalSysMLOC.g:511:3: ( rule__Usage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsageAccess().getGroup()); 
            }
            // InternalSysMLOC.g:512:3: ( rule__Usage__Group__0 )
            // InternalSysMLOC.g:512:4: rule__Usage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Usage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsage"


    // $ANTLR start "ruleFeatureValue"
    // InternalSysMLOC.g:522:1: ruleFeatureValue : ( ( rule__FeatureValue__Group__0 ) ) ;
    public final void ruleFeatureValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:526:2: ( ( ( rule__FeatureValue__Group__0 ) ) )
            // InternalSysMLOC.g:527:2: ( ( rule__FeatureValue__Group__0 ) )
            {
            // InternalSysMLOC.g:527:2: ( ( rule__FeatureValue__Group__0 ) )
            // InternalSysMLOC.g:528:3: ( rule__FeatureValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getGroup()); 
            }
            // InternalSysMLOC.g:529:3: ( rule__FeatureValue__Group__0 )
            // InternalSysMLOC.g:529:4: rule__FeatureValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureValue"


    // $ANTLR start "ruleFeatureDeclaration"
    // InternalSysMLOC.g:539:1: ruleFeatureDeclaration : ( ( rule__FeatureDeclaration__Alternatives ) ) ;
    public final void ruleFeatureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:543:2: ( ( ( rule__FeatureDeclaration__Alternatives ) ) )
            // InternalSysMLOC.g:544:2: ( ( rule__FeatureDeclaration__Alternatives ) )
            {
            // InternalSysMLOC.g:544:2: ( ( rule__FeatureDeclaration__Alternatives ) )
            // InternalSysMLOC.g:545:3: ( rule__FeatureDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:546:3: ( rule__FeatureDeclaration__Alternatives )
            // InternalSysMLOC.g:546:4: rule__FeatureDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureDeclaration"


    // $ANTLR start "ruleFeatureSpecializationPart"
    // InternalSysMLOC.g:556:1: ruleFeatureSpecializationPart : ( ( rule__FeatureSpecializationPart__Alternatives ) ) ;
    public final void ruleFeatureSpecializationPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:560:2: ( ( ( rule__FeatureSpecializationPart__Alternatives ) ) )
            // InternalSysMLOC.g:561:2: ( ( rule__FeatureSpecializationPart__Alternatives ) )
            {
            // InternalSysMLOC.g:561:2: ( ( rule__FeatureSpecializationPart__Alternatives ) )
            // InternalSysMLOC.g:562:3: ( rule__FeatureSpecializationPart__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationPartAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:563:3: ( rule__FeatureSpecializationPart__Alternatives )
            // InternalSysMLOC.g:563:4: rule__FeatureSpecializationPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecializationPart__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationPartAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureSpecializationPart"


    // $ANTLR start "ruleMultiplicityPart"
    // InternalSysMLOC.g:573:1: ruleMultiplicityPart : ( ( rule__MultiplicityPart__Alternatives ) ) ;
    public final void ruleMultiplicityPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:577:2: ( ( ( rule__MultiplicityPart__Alternatives ) ) )
            // InternalSysMLOC.g:578:2: ( ( rule__MultiplicityPart__Alternatives ) )
            {
            // InternalSysMLOC.g:578:2: ( ( rule__MultiplicityPart__Alternatives ) )
            // InternalSysMLOC.g:579:3: ( rule__MultiplicityPart__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:580:3: ( rule__MultiplicityPart__Alternatives )
            // InternalSysMLOC.g:580:4: rule__MultiplicityPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicityPart"


    // $ANTLR start "ruleFeatureSpecialization"
    // InternalSysMLOC.g:590:1: ruleFeatureSpecialization : ( ( rule__FeatureSpecialization__Alternatives ) ) ;
    public final void ruleFeatureSpecialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:594:2: ( ( ( rule__FeatureSpecialization__Alternatives ) ) )
            // InternalSysMLOC.g:595:2: ( ( rule__FeatureSpecialization__Alternatives ) )
            {
            // InternalSysMLOC.g:595:2: ( ( rule__FeatureSpecialization__Alternatives ) )
            // InternalSysMLOC.g:596:3: ( rule__FeatureSpecialization__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:597:3: ( rule__FeatureSpecialization__Alternatives )
            // InternalSysMLOC.g:597:4: rule__FeatureSpecialization__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureSpecialization"


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:606:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:607:1: ( ruleName EOF )
            // InternalSysMLOC.g:608:1: ruleName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalSysMLOC.g:615:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:619:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalSysMLOC.g:620:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalSysMLOC.g:620:2: ( ( rule__Name__Alternatives ) )
            // InternalSysMLOC.g:621:3: ( rule__Name__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:622:3: ( rule__Name__Alternatives )
            // InternalSysMLOC.g:622:4: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Name__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSysMLOC.g:631:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:632:1: ( ruleQualifiedName EOF )
            // InternalSysMLOC.g:633:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSysMLOC.g:640:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:644:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSysMLOC.g:645:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSysMLOC.g:645:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSysMLOC.g:646:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalSysMLOC.g:647:3: ( rule__QualifiedName__Group__0 )
            // InternalSysMLOC.g:647:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFeatureChainName"
    // InternalSysMLOC.g:656:1: entryRuleFeatureChainName : ruleFeatureChainName EOF ;
    public final void entryRuleFeatureChainName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:657:1: ( ruleFeatureChainName EOF )
            // InternalSysMLOC.g:658:1: ruleFeatureChainName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureChainNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureChainNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureChainName"


    // $ANTLR start "ruleFeatureChainName"
    // InternalSysMLOC.g:665:1: ruleFeatureChainName : ( ( rule__FeatureChainName__Group__0 ) ) ;
    public final void ruleFeatureChainName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:669:2: ( ( ( rule__FeatureChainName__Group__0 ) ) )
            // InternalSysMLOC.g:670:2: ( ( rule__FeatureChainName__Group__0 ) )
            {
            // InternalSysMLOC.g:670:2: ( ( rule__FeatureChainName__Group__0 ) )
            // InternalSysMLOC.g:671:3: ( rule__FeatureChainName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureChainNameAccess().getGroup()); 
            }
            // InternalSysMLOC.g:672:3: ( rule__FeatureChainName__Group__0 )
            // InternalSysMLOC.g:672:4: rule__FeatureChainName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChainName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureChainNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureChainName"


    // $ANTLR start "entryRuleExpressionName"
    // InternalSysMLOC.g:681:1: entryRuleExpressionName : ruleExpressionName EOF ;
    public final void entryRuleExpressionName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:682:1: ( ruleExpressionName EOF )
            // InternalSysMLOC.g:683:1: ruleExpressionName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionName"


    // $ANTLR start "ruleExpressionName"
    // InternalSysMLOC.g:690:1: ruleExpressionName : ( ( rule__ExpressionName__Alternatives ) ) ;
    public final void ruleExpressionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:694:2: ( ( ( rule__ExpressionName__Alternatives ) ) )
            // InternalSysMLOC.g:695:2: ( ( rule__ExpressionName__Alternatives ) )
            {
            // InternalSysMLOC.g:695:2: ( ( rule__ExpressionName__Alternatives ) )
            // InternalSysMLOC.g:696:3: ( rule__ExpressionName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionNameAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:697:3: ( rule__ExpressionName__Alternatives )
            // InternalSysMLOC.g:697:4: rule__ExpressionName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionNameAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionName"


    // $ANTLR start "entryRuleExpression"
    // InternalSysMLOC.g:706:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSysMLOC.g:707:1: ( ruleExpression EOF )
            // InternalSysMLOC.g:708:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSysMLOC.g:715:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:719:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalSysMLOC.g:720:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalSysMLOC.g:720:2: ( ( rule__Expression__Group__0 ) )
            // InternalSysMLOC.g:721:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalSysMLOC.g:722:3: ( rule__Expression__Group__0 )
            // InternalSysMLOC.g:722:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalSysMLOC.g:731:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:735:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalSysMLOC.g:736:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalSysMLOC.g:736:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalSysMLOC.g:737:3: ( rule__VisibilityIndicator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            }
            // InternalSysMLOC.g:738:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalSysMLOC.g:738:4: rule__VisibilityIndicator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VisibilityIndicator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityIndicator"


    // $ANTLR start "rule__BaseElement__Alternatives"
    // InternalSysMLOC.g:746:1: rule__BaseElement__Alternatives : ( ( rulePackage ) | ( ruleAnnotatingElement ) | ( ruleImportElement ) | ( ruleDefinitionElement ) | ( ruleUsageElement ) );
    public final void rule__BaseElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:750:1: ( ( rulePackage ) | ( ruleAnnotatingElement ) | ( ruleImportElement ) | ( ruleDefinitionElement ) | ( ruleUsageElement ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 27:
            case 28:
            case 29:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                int LA2_4 = input.LA(2);

                if ( ((LA2_4>=RULE_ID && LA2_4<=RULE_UNRESTRICTED_NAME)) ) {
                    alt2=5;
                }
                else if ( (LA2_4==36) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA2_5 = input.LA(2);

                if ( ((LA2_5>=RULE_ID && LA2_5<=RULE_UNRESTRICTED_NAME)||(LA2_5>=15 && LA2_5<=26)||LA2_5==31||LA2_5==39||LA2_5==42||(LA2_5>=47 && LA2_5<=50)) ) {
                    alt2=5;
                }
                else if ( (LA2_5==36) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSysMLOC.g:751:2: ( rulePackage )
                    {
                    // InternalSysMLOC.g:751:2: ( rulePackage )
                    // InternalSysMLOC.g:752:3: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseElementAccess().getPackageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseElementAccess().getPackageParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:757:2: ( ruleAnnotatingElement )
                    {
                    // InternalSysMLOC.g:757:2: ( ruleAnnotatingElement )
                    // InternalSysMLOC.g:758:3: ruleAnnotatingElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseElementAccess().getAnnotatingElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAnnotatingElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseElementAccess().getAnnotatingElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:763:2: ( ruleImportElement )
                    {
                    // InternalSysMLOC.g:763:2: ( ruleImportElement )
                    // InternalSysMLOC.g:764:3: ruleImportElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseElementAccess().getImportElementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleImportElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseElementAccess().getImportElementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:769:2: ( ruleDefinitionElement )
                    {
                    // InternalSysMLOC.g:769:2: ( ruleDefinitionElement )
                    // InternalSysMLOC.g:770:3: ruleDefinitionElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseElementAccess().getDefinitionElementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDefinitionElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseElementAccess().getDefinitionElementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:775:2: ( ruleUsageElement )
                    {
                    // InternalSysMLOC.g:775:2: ( ruleUsageElement )
                    // InternalSysMLOC.g:776:3: ruleUsageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUsageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseElement__Alternatives"


    // $ANTLR start "rule__DefinitionElement__Alternatives"
    // InternalSysMLOC.g:785:1: rule__DefinitionElement__Alternatives : ( ( ruleAttributeDefinition ) | ( rulePartDefinition ) );
    public final void rule__DefinitionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:789:1: ( ( ruleAttributeDefinition ) | ( rulePartDefinition ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==37) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSysMLOC.g:790:2: ( ruleAttributeDefinition )
                    {
                    // InternalSysMLOC.g:790:2: ( ruleAttributeDefinition )
                    // InternalSysMLOC.g:791:3: ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAttributeDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:796:2: ( rulePartDefinition )
                    {
                    // InternalSysMLOC.g:796:2: ( rulePartDefinition )
                    // InternalSysMLOC.g:797:3: rulePartDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePartDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionElement__Alternatives"


    // $ANTLR start "rule__UsageElement__Alternatives"
    // InternalSysMLOC.g:806:1: rule__UsageElement__Alternatives : ( ( ruleNonOccurrenceUsageElement ) | ( ruleOccurrenceUsageElement ) );
    public final void rule__UsageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:810:1: ( ( ruleNonOccurrenceUsageElement ) | ( ruleOccurrenceUsageElement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=37 && LA4_0<=38)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSysMLOC.g:811:2: ( ruleNonOccurrenceUsageElement )
                    {
                    // InternalSysMLOC.g:811:2: ( ruleNonOccurrenceUsageElement )
                    // InternalSysMLOC.g:812:3: ruleNonOccurrenceUsageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUsageElementAccess().getNonOccurrenceUsageElementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNonOccurrenceUsageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUsageElementAccess().getNonOccurrenceUsageElementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:817:2: ( ruleOccurrenceUsageElement )
                    {
                    // InternalSysMLOC.g:817:2: ( ruleOccurrenceUsageElement )
                    // InternalSysMLOC.g:818:3: ruleOccurrenceUsageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUsageElementAccess().getOccurrenceUsageElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOccurrenceUsageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUsageElementAccess().getOccurrenceUsageElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageElement__Alternatives"


    // $ANTLR start "rule__OccurrenceUsageElement__Alternatives"
    // InternalSysMLOC.g:827:1: rule__OccurrenceUsageElement__Alternatives : ( ( ruleStructureUsageElement ) | ( ruleBehaviorUsageElement ) );
    public final void rule__OccurrenceUsageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:831:1: ( ( ruleStructureUsageElement ) | ( ruleBehaviorUsageElement ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSysMLOC.g:832:2: ( ruleStructureUsageElement )
                    {
                    // InternalSysMLOC.g:832:2: ( ruleStructureUsageElement )
                    // InternalSysMLOC.g:833:3: ruleStructureUsageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOccurrenceUsageElementAccess().getStructureUsageElementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStructureUsageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOccurrenceUsageElementAccess().getStructureUsageElementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:838:2: ( ruleBehaviorUsageElement )
                    {
                    // InternalSysMLOC.g:838:2: ( ruleBehaviorUsageElement )
                    // InternalSysMLOC.g:839:3: ruleBehaviorUsageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOccurrenceUsageElementAccess().getBehaviorUsageElementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBehaviorUsageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOccurrenceUsageElementAccess().getBehaviorUsageElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OccurrenceUsageElement__Alternatives"


    // $ANTLR start "rule__AttributeDefinition__Alternatives_3"
    // InternalSysMLOC.g:848:1: rule__AttributeDefinition__Alternatives_3 : ( ( ';' ) | ( ( rule__AttributeDefinition__Group_3_1__0 ) ) );
    public final void rule__AttributeDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:852:1: ( ( ';' ) | ( ( rule__AttributeDefinition__Group_3_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSysMLOC.g:853:2: ( ';' )
                    {
                    // InternalSysMLOC.g:853:2: ( ';' )
                    // InternalSysMLOC.g:854:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:859:2: ( ( rule__AttributeDefinition__Group_3_1__0 ) )
                    {
                    // InternalSysMLOC.g:859:2: ( ( rule__AttributeDefinition__Group_3_1__0 ) )
                    // InternalSysMLOC.g:860:3: ( rule__AttributeDefinition__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeDefinitionAccess().getGroup_3_1()); 
                    }
                    // InternalSysMLOC.g:861:3: ( rule__AttributeDefinition__Group_3_1__0 )
                    // InternalSysMLOC.g:861:4: rule__AttributeDefinition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeDefinitionAccess().getGroup_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Alternatives_3"


    // $ANTLR start "rule__PartDefinition__Alternatives_4"
    // InternalSysMLOC.g:869:1: rule__PartDefinition__Alternatives_4 : ( ( ';' ) | ( ( rule__PartDefinition__Group_4_1__0 ) ) );
    public final void rule__PartDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:873:1: ( ( ';' ) | ( ( rule__PartDefinition__Group_4_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==31) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSysMLOC.g:874:2: ( ';' )
                    {
                    // InternalSysMLOC.g:874:2: ( ';' )
                    // InternalSysMLOC.g:875:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:880:2: ( ( rule__PartDefinition__Group_4_1__0 ) )
                    {
                    // InternalSysMLOC.g:880:2: ( ( rule__PartDefinition__Group_4_1__0 ) )
                    // InternalSysMLOC.g:881:3: ( rule__PartDefinition__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartDefinitionAccess().getGroup_4_1()); 
                    }
                    // InternalSysMLOC.g:882:3: ( rule__PartDefinition__Group_4_1__0 )
                    // InternalSysMLOC.g:882:4: rule__PartDefinition__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartDefinition__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartDefinitionAccess().getGroup_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Alternatives_4"


    // $ANTLR start "rule__AttributeUsage__Alternatives_2"
    // InternalSysMLOC.g:890:1: rule__AttributeUsage__Alternatives_2 : ( ( ';' ) | ( ( rule__AttributeUsage__Group_2_1__0 ) ) );
    public final void rule__AttributeUsage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:894:1: ( ( ';' ) | ( ( rule__AttributeUsage__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:895:2: ( ';' )
                    {
                    // InternalSysMLOC.g:895:2: ( ';' )
                    // InternalSysMLOC.g:896:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:901:2: ( ( rule__AttributeUsage__Group_2_1__0 ) )
                    {
                    // InternalSysMLOC.g:901:2: ( ( rule__AttributeUsage__Group_2_1__0 ) )
                    // InternalSysMLOC.g:902:3: ( rule__AttributeUsage__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeUsageAccess().getGroup_2_1()); 
                    }
                    // InternalSysMLOC.g:903:3: ( rule__AttributeUsage__Group_2_1__0 )
                    // InternalSysMLOC.g:903:4: rule__AttributeUsage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeUsage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeUsageAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Alternatives_2"


    // $ANTLR start "rule__ActionUsage__Alternatives_2"
    // InternalSysMLOC.g:911:1: rule__ActionUsage__Alternatives_2 : ( ( ';' ) | ( ( rule__ActionUsage__Group_2_1__0 ) ) );
    public final void rule__ActionUsage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:915:1: ( ( ';' ) | ( ( rule__ActionUsage__Group_2_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:916:2: ( ';' )
                    {
                    // InternalSysMLOC.g:916:2: ( ';' )
                    // InternalSysMLOC.g:917:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionUsageAccess().getSemicolonKeyword_2_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionUsageAccess().getSemicolonKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:922:2: ( ( rule__ActionUsage__Group_2_1__0 ) )
                    {
                    // InternalSysMLOC.g:922:2: ( ( rule__ActionUsage__Group_2_1__0 ) )
                    // InternalSysMLOC.g:923:3: ( rule__ActionUsage__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionUsageAccess().getGroup_2_1()); 
                    }
                    // InternalSysMLOC.g:924:3: ( rule__ActionUsage__Group_2_1__0 )
                    // InternalSysMLOC.g:924:4: rule__ActionUsage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionUsage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionUsageAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Alternatives_2"


    // $ANTLR start "rule__PartUsage__Alternatives_2"
    // InternalSysMLOC.g:932:1: rule__PartUsage__Alternatives_2 : ( ( ';' ) | ( ( rule__PartUsage__Group_2_1__0 ) ) );
    public final void rule__PartUsage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:936:1: ( ( ';' ) | ( ( rule__PartUsage__Group_2_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSysMLOC.g:937:2: ( ';' )
                    {
                    // InternalSysMLOC.g:937:2: ( ';' )
                    // InternalSysMLOC.g:938:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartUsageAccess().getSemicolonKeyword_2_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartUsageAccess().getSemicolonKeyword_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:943:2: ( ( rule__PartUsage__Group_2_1__0 ) )
                    {
                    // InternalSysMLOC.g:943:2: ( ( rule__PartUsage__Group_2_1__0 ) )
                    // InternalSysMLOC.g:944:3: ( rule__PartUsage__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartUsageAccess().getGroup_2_1()); 
                    }
                    // InternalSysMLOC.g:945:3: ( rule__PartUsage__Group_2_1__0 )
                    // InternalSysMLOC.g:945:4: rule__PartUsage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartUsage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartUsageAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Alternatives_2"


    // $ANTLR start "rule__FeatureValue__Alternatives_0"
    // InternalSysMLOC.g:953:1: rule__FeatureValue__Alternatives_0 : ( ( '=' ) | ( ( rule__FeatureValue__IsInitialAssignment_0_1 ) ) | ( ( rule__FeatureValue__Group_0_2__0 ) ) );
    public final void rule__FeatureValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:957:1: ( ( '=' ) | ( ( rule__FeatureValue__IsInitialAssignment_0_1 ) ) | ( ( rule__FeatureValue__Group_0_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 47:
                {
                alt11=2;
                }
                break;
            case 48:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSysMLOC.g:958:2: ( '=' )
                    {
                    // InternalSysMLOC.g:958:2: ( '=' )
                    // InternalSysMLOC.g:959:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:964:2: ( ( rule__FeatureValue__IsInitialAssignment_0_1 ) )
                    {
                    // InternalSysMLOC.g:964:2: ( ( rule__FeatureValue__IsInitialAssignment_0_1 ) )
                    // InternalSysMLOC.g:965:3: ( rule__FeatureValue__IsInitialAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureValueAccess().getIsInitialAssignment_0_1()); 
                    }
                    // InternalSysMLOC.g:966:3: ( rule__FeatureValue__IsInitialAssignment_0_1 )
                    // InternalSysMLOC.g:966:4: rule__FeatureValue__IsInitialAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureValue__IsInitialAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureValueAccess().getIsInitialAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:970:2: ( ( rule__FeatureValue__Group_0_2__0 ) )
                    {
                    // InternalSysMLOC.g:970:2: ( ( rule__FeatureValue__Group_0_2__0 ) )
                    // InternalSysMLOC.g:971:3: ( rule__FeatureValue__Group_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureValueAccess().getGroup_0_2()); 
                    }
                    // InternalSysMLOC.g:972:3: ( rule__FeatureValue__Group_0_2__0 )
                    // InternalSysMLOC.g:972:4: rule__FeatureValue__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureValue__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureValueAccess().getGroup_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Alternatives_0"


    // $ANTLR start "rule__FeatureValue__Alternatives_0_2_1"
    // InternalSysMLOC.g:980:1: rule__FeatureValue__Alternatives_0_2_1 : ( ( '=' ) | ( ( rule__FeatureValue__IsInitialAssignment_0_2_1_1 ) ) );
    public final void rule__FeatureValue__Alternatives_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:984:1: ( ( '=' ) | ( ( rule__FeatureValue__IsInitialAssignment_0_2_1_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==47) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSysMLOC.g:985:2: ( '=' )
                    {
                    // InternalSysMLOC.g:985:2: ( '=' )
                    // InternalSysMLOC.g:986:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_2_1_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureValueAccess().getEqualsSignKeyword_0_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:991:2: ( ( rule__FeatureValue__IsInitialAssignment_0_2_1_1 ) )
                    {
                    // InternalSysMLOC.g:991:2: ( ( rule__FeatureValue__IsInitialAssignment_0_2_1_1 ) )
                    // InternalSysMLOC.g:992:3: ( rule__FeatureValue__IsInitialAssignment_0_2_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureValueAccess().getIsInitialAssignment_0_2_1_1()); 
                    }
                    // InternalSysMLOC.g:993:3: ( rule__FeatureValue__IsInitialAssignment_0_2_1_1 )
                    // InternalSysMLOC.g:993:4: rule__FeatureValue__IsInitialAssignment_0_2_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureValue__IsInitialAssignment_0_2_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureValueAccess().getIsInitialAssignment_0_2_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Alternatives_0_2_1"


    // $ANTLR start "rule__FeatureDeclaration__Alternatives"
    // InternalSysMLOC.g:1001:1: rule__FeatureDeclaration__Alternatives : ( ( ( rule__FeatureDeclaration__Group_0__0 ) ) | ( ruleFeatureSpecializationPart ) );
    public final void rule__FeatureDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1005:1: ( ( ( rule__FeatureDeclaration__Group_0__0 ) ) | ( ruleFeatureSpecializationPart ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=17 && LA13_0<=26)||LA13_0==39||LA13_0==42||(LA13_0>=49 && LA13_0<=50)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSysMLOC.g:1006:2: ( ( rule__FeatureDeclaration__Group_0__0 ) )
                    {
                    // InternalSysMLOC.g:1006:2: ( ( rule__FeatureDeclaration__Group_0__0 ) )
                    // InternalSysMLOC.g:1007:3: ( rule__FeatureDeclaration__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureDeclarationAccess().getGroup_0()); 
                    }
                    // InternalSysMLOC.g:1008:3: ( rule__FeatureDeclaration__Group_0__0 )
                    // InternalSysMLOC.g:1008:4: rule__FeatureDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureDeclaration__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureDeclarationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1012:2: ( ruleFeatureSpecializationPart )
                    {
                    // InternalSysMLOC.g:1012:2: ( ruleFeatureSpecializationPart )
                    // InternalSysMLOC.g:1013:3: ruleFeatureSpecializationPart
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureDeclarationAccess().getFeatureSpecializationPartParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFeatureSpecializationPart();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureDeclarationAccess().getFeatureSpecializationPartParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Alternatives"


    // $ANTLR start "rule__FeatureSpecializationPart__Alternatives"
    // InternalSysMLOC.g:1022:1: rule__FeatureSpecializationPart__Alternatives : ( ( ( rule__FeatureSpecializationPart__Group_0__0 ) ) | ( ( rule__FeatureSpecializationPart__Group_1__0 ) ) );
    public final void rule__FeatureSpecializationPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1026:1: ( ( ( rule__FeatureSpecializationPart__Group_0__0 ) ) | ( ( rule__FeatureSpecializationPart__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=17 && LA14_0<=26)||LA14_0==42) ) {
                alt14=1;
            }
            else if ( (LA14_0==39||(LA14_0>=49 && LA14_0<=50)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSysMLOC.g:1027:2: ( ( rule__FeatureSpecializationPart__Group_0__0 ) )
                    {
                    // InternalSysMLOC.g:1027:2: ( ( rule__FeatureSpecializationPart__Group_0__0 ) )
                    // InternalSysMLOC.g:1028:3: ( rule__FeatureSpecializationPart__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationPartAccess().getGroup_0()); 
                    }
                    // InternalSysMLOC.g:1029:3: ( rule__FeatureSpecializationPart__Group_0__0 )
                    // InternalSysMLOC.g:1029:4: rule__FeatureSpecializationPart__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecializationPart__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationPartAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1033:2: ( ( rule__FeatureSpecializationPart__Group_1__0 ) )
                    {
                    // InternalSysMLOC.g:1033:2: ( ( rule__FeatureSpecializationPart__Group_1__0 ) )
                    // InternalSysMLOC.g:1034:3: ( rule__FeatureSpecializationPart__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationPartAccess().getGroup_1()); 
                    }
                    // InternalSysMLOC.g:1035:3: ( rule__FeatureSpecializationPart__Group_1__0 )
                    // InternalSysMLOC.g:1035:4: rule__FeatureSpecializationPart__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecializationPart__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationPartAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Alternatives"


    // $ANTLR start "rule__MultiplicityPart__Alternatives"
    // InternalSysMLOC.g:1043:1: rule__MultiplicityPart__Alternatives : ( ( ( rule__MultiplicityPart__Group_0__0 ) ) | ( ( rule__MultiplicityPart__Group_1__0 ) ) );
    public final void rule__MultiplicityPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1047:1: ( ( ( rule__MultiplicityPart__Group_0__0 ) ) | ( ( rule__MultiplicityPart__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_DECIMAL_VALUE) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==41) ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4==RULE_DECIMAL_VALUE) ) {
                            int LA15_6 = input.LA(5);

                            if ( (LA15_6==40) ) {
                                int LA15_5 = input.LA(6);

                                if ( (LA15_5==EOF||(LA15_5>=15 && LA15_5<=26)||LA15_5==31||LA15_5==42||(LA15_5>=47 && LA15_5<=48)) ) {
                                    alt15=1;
                                }
                                else if ( ((LA15_5>=49 && LA15_5<=50)) ) {
                                    alt15=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA15_3==40) ) {
                        int LA15_5 = input.LA(4);

                        if ( (LA15_5==EOF||(LA15_5>=15 && LA15_5<=26)||LA15_5==31||LA15_5==42||(LA15_5>=47 && LA15_5<=48)) ) {
                            alt15=1;
                        }
                        else if ( ((LA15_5>=49 && LA15_5<=50)) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>=49 && LA15_0<=50)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSysMLOC.g:1048:2: ( ( rule__MultiplicityPart__Group_0__0 ) )
                    {
                    // InternalSysMLOC.g:1048:2: ( ( rule__MultiplicityPart__Group_0__0 ) )
                    // InternalSysMLOC.g:1049:3: ( rule__MultiplicityPart__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityPartAccess().getGroup_0()); 
                    }
                    // InternalSysMLOC.g:1050:3: ( rule__MultiplicityPart__Group_0__0 )
                    // InternalSysMLOC.g:1050:4: rule__MultiplicityPart__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityPartAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1054:2: ( ( rule__MultiplicityPart__Group_1__0 ) )
                    {
                    // InternalSysMLOC.g:1054:2: ( ( rule__MultiplicityPart__Group_1__0 ) )
                    // InternalSysMLOC.g:1055:3: ( rule__MultiplicityPart__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityPartAccess().getGroup_1()); 
                    }
                    // InternalSysMLOC.g:1056:3: ( rule__MultiplicityPart__Group_1__0 )
                    // InternalSysMLOC.g:1056:4: rule__MultiplicityPart__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityPartAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Alternatives"


    // $ANTLR start "rule__MultiplicityPart__Alternatives_1_1"
    // InternalSysMLOC.g:1064:1: rule__MultiplicityPart__Alternatives_1_1 : ( ( ( rule__MultiplicityPart__Group_1_1_0__0 ) ) | ( ( rule__MultiplicityPart__Group_1_1_1__0 ) ) );
    public final void rule__MultiplicityPart__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1068:1: ( ( ( rule__MultiplicityPart__Group_1_1_0__0 ) ) | ( ( rule__MultiplicityPart__Group_1_1_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            else if ( (LA16_0==50) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSysMLOC.g:1069:2: ( ( rule__MultiplicityPart__Group_1_1_0__0 ) )
                    {
                    // InternalSysMLOC.g:1069:2: ( ( rule__MultiplicityPart__Group_1_1_0__0 ) )
                    // InternalSysMLOC.g:1070:3: ( rule__MultiplicityPart__Group_1_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityPartAccess().getGroup_1_1_0()); 
                    }
                    // InternalSysMLOC.g:1071:3: ( rule__MultiplicityPart__Group_1_1_0__0 )
                    // InternalSysMLOC.g:1071:4: rule__MultiplicityPart__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__Group_1_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityPartAccess().getGroup_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1075:2: ( ( rule__MultiplicityPart__Group_1_1_1__0 ) )
                    {
                    // InternalSysMLOC.g:1075:2: ( ( rule__MultiplicityPart__Group_1_1_1__0 ) )
                    // InternalSysMLOC.g:1076:3: ( rule__MultiplicityPart__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicityPartAccess().getGroup_1_1_1()); 
                    }
                    // InternalSysMLOC.g:1077:3: ( rule__MultiplicityPart__Group_1_1_1__0 )
                    // InternalSysMLOC.g:1077:4: rule__MultiplicityPart__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicityPartAccess().getGroup_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Alternatives_1_1"


    // $ANTLR start "rule__FeatureSpecialization__Alternatives"
    // InternalSysMLOC.g:1085:1: rule__FeatureSpecialization__Alternatives : ( ( ( rule__FeatureSpecialization__Group_0__0 ) ) | ( ( rule__FeatureSpecialization__Group_1__0 ) ) | ( ( rule__FeatureSpecialization__Group_2__0 ) ) | ( ( rule__FeatureSpecialization__Group_3__0 ) ) | ( ( rule__FeatureSpecialization__Group_4__0 ) ) );
    public final void rule__FeatureSpecialization__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1089:1: ( ( ( rule__FeatureSpecialization__Group_0__0 ) ) | ( ( rule__FeatureSpecialization__Group_1__0 ) ) | ( ( rule__FeatureSpecialization__Group_2__0 ) ) | ( ( rule__FeatureSpecialization__Group_3__0 ) ) | ( ( rule__FeatureSpecialization__Group_4__0 ) ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 17:
            case 42:
                {
                alt17=1;
                }
                break;
            case 18:
            case 19:
            case 20:
                {
                alt17=2;
                }
                break;
            case 21:
            case 22:
                {
                alt17=3;
                }
                break;
            case 23:
            case 24:
                {
                alt17=4;
                }
                break;
            case 25:
            case 26:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSysMLOC.g:1090:2: ( ( rule__FeatureSpecialization__Group_0__0 ) )
                    {
                    // InternalSysMLOC.g:1090:2: ( ( rule__FeatureSpecialization__Group_0__0 ) )
                    // InternalSysMLOC.g:1091:3: ( rule__FeatureSpecialization__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getGroup_0()); 
                    }
                    // InternalSysMLOC.g:1092:3: ( rule__FeatureSpecialization__Group_0__0 )
                    // InternalSysMLOC.g:1092:4: rule__FeatureSpecialization__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecialization__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1096:2: ( ( rule__FeatureSpecialization__Group_1__0 ) )
                    {
                    // InternalSysMLOC.g:1096:2: ( ( rule__FeatureSpecialization__Group_1__0 ) )
                    // InternalSysMLOC.g:1097:3: ( rule__FeatureSpecialization__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getGroup_1()); 
                    }
                    // InternalSysMLOC.g:1098:3: ( rule__FeatureSpecialization__Group_1__0 )
                    // InternalSysMLOC.g:1098:4: rule__FeatureSpecialization__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecialization__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:1102:2: ( ( rule__FeatureSpecialization__Group_2__0 ) )
                    {
                    // InternalSysMLOC.g:1102:2: ( ( rule__FeatureSpecialization__Group_2__0 ) )
                    // InternalSysMLOC.g:1103:3: ( rule__FeatureSpecialization__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getGroup_2()); 
                    }
                    // InternalSysMLOC.g:1104:3: ( rule__FeatureSpecialization__Group_2__0 )
                    // InternalSysMLOC.g:1104:4: rule__FeatureSpecialization__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecialization__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:1108:2: ( ( rule__FeatureSpecialization__Group_3__0 ) )
                    {
                    // InternalSysMLOC.g:1108:2: ( ( rule__FeatureSpecialization__Group_3__0 ) )
                    // InternalSysMLOC.g:1109:3: ( rule__FeatureSpecialization__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getGroup_3()); 
                    }
                    // InternalSysMLOC.g:1110:3: ( rule__FeatureSpecialization__Group_3__0 )
                    // InternalSysMLOC.g:1110:4: rule__FeatureSpecialization__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecialization__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:1114:2: ( ( rule__FeatureSpecialization__Group_4__0 ) )
                    {
                    // InternalSysMLOC.g:1114:2: ( ( rule__FeatureSpecialization__Group_4__0 ) )
                    // InternalSysMLOC.g:1115:3: ( rule__FeatureSpecialization__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getGroup_4()); 
                    }
                    // InternalSysMLOC.g:1116:3: ( rule__FeatureSpecialization__Group_4__0 )
                    // InternalSysMLOC.g:1116:4: rule__FeatureSpecialization__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecialization__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Alternatives"


    // $ANTLR start "rule__FeatureSpecialization__Alternatives_0_0"
    // InternalSysMLOC.g:1124:1: rule__FeatureSpecialization__Alternatives_0_0 : ( ( ':' ) | ( ( rule__FeatureSpecialization__Group_0_0_1__0 ) ) );
    public final void rule__FeatureSpecialization__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1128:1: ( ( ':' ) | ( ( rule__FeatureSpecialization__Group_0_0_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==42) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSysMLOC.g:1129:2: ( ':' )
                    {
                    // InternalSysMLOC.g:1129:2: ( ':' )
                    // InternalSysMLOC.g:1130:3: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getColonKeyword_0_0_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getColonKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1135:2: ( ( rule__FeatureSpecialization__Group_0_0_1__0 ) )
                    {
                    // InternalSysMLOC.g:1135:2: ( ( rule__FeatureSpecialization__Group_0_0_1__0 ) )
                    // InternalSysMLOC.g:1136:3: ( rule__FeatureSpecialization__Group_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getGroup_0_0_1()); 
                    }
                    // InternalSysMLOC.g:1137:3: ( rule__FeatureSpecialization__Group_0_0_1__0 )
                    // InternalSysMLOC.g:1137:4: rule__FeatureSpecialization__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureSpecialization__Group_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getGroup_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Alternatives_0_0"


    // $ANTLR start "rule__FeatureSpecialization__Alternatives_1_0"
    // InternalSysMLOC.g:1145:1: rule__FeatureSpecialization__Alternatives_1_0 : ( ( ':>' ) | ( 'specializes' ) | ( 'subsets' ) );
    public final void rule__FeatureSpecialization__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1149:1: ( ( ':>' ) | ( 'specializes' ) | ( 'subsets' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt19=1;
                }
                break;
            case 19:
                {
                alt19=2;
                }
                break;
            case 20:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSysMLOC.g:1150:2: ( ':>' )
                    {
                    // InternalSysMLOC.g:1150:2: ( ':>' )
                    // InternalSysMLOC.g:1151:3: ':>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignKeyword_1_0_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1156:2: ( 'specializes' )
                    {
                    // InternalSysMLOC.g:1156:2: ( 'specializes' )
                    // InternalSysMLOC.g:1157:3: 'specializes'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getSpecializesKeyword_1_0_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getSpecializesKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:1162:2: ( 'subsets' )
                    {
                    // InternalSysMLOC.g:1162:2: ( 'subsets' )
                    // InternalSysMLOC.g:1163:3: 'subsets'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getSubsetsKeyword_1_0_2()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getSubsetsKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Alternatives_1_0"


    // $ANTLR start "rule__FeatureSpecialization__Alternatives_2_0"
    // InternalSysMLOC.g:1172:1: rule__FeatureSpecialization__Alternatives_2_0 : ( ( '::>' ) | ( 'references' ) );
    public final void rule__FeatureSpecialization__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1176:1: ( ( '::>' ) | ( 'references' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            else if ( (LA20_0==22) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSysMLOC.g:1177:2: ( '::>' )
                    {
                    // InternalSysMLOC.g:1177:2: ( '::>' )
                    // InternalSysMLOC.g:1178:3: '::>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getColonColonGreaterThanSignKeyword_2_0_0()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getColonColonGreaterThanSignKeyword_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1183:2: ( 'references' )
                    {
                    // InternalSysMLOC.g:1183:2: ( 'references' )
                    // InternalSysMLOC.g:1184:3: 'references'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getReferencesKeyword_2_0_1()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getReferencesKeyword_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Alternatives_2_0"


    // $ANTLR start "rule__FeatureSpecialization__Alternatives_3_0"
    // InternalSysMLOC.g:1193:1: rule__FeatureSpecialization__Alternatives_3_0 : ( ( '=>' ) | ( 'crosses' ) );
    public final void rule__FeatureSpecialization__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1197:1: ( ( '=>' ) | ( 'crosses' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==24) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSysMLOC.g:1198:2: ( '=>' )
                    {
                    // InternalSysMLOC.g:1198:2: ( '=>' )
                    // InternalSysMLOC.g:1199:3: '=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1204:2: ( 'crosses' )
                    {
                    // InternalSysMLOC.g:1204:2: ( 'crosses' )
                    // InternalSysMLOC.g:1205:3: 'crosses'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getCrossesKeyword_3_0_1()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getCrossesKeyword_3_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Alternatives_3_0"


    // $ANTLR start "rule__FeatureSpecialization__Alternatives_4_0"
    // InternalSysMLOC.g:1214:1: rule__FeatureSpecialization__Alternatives_4_0 : ( ( ':>>' ) | ( 'redefines' ) );
    public final void rule__FeatureSpecialization__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1218:1: ( ( ':>>' ) | ( 'redefines' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            else if ( (LA22_0==26) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSysMLOC.g:1219:2: ( ':>>' )
                    {
                    // InternalSysMLOC.g:1219:2: ( ':>>' )
                    // InternalSysMLOC.g:1220:3: ':>>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getColonGreaterThanSignGreaterThanSignKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1225:2: ( 'redefines' )
                    {
                    // InternalSysMLOC.g:1225:2: ( 'redefines' )
                    // InternalSysMLOC.g:1226:3: 'redefines'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureSpecializationAccess().getRedefinesKeyword_4_0_1()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureSpecializationAccess().getRedefinesKeyword_4_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Alternatives_4_0"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalSysMLOC.g:1235:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1239:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_UNRESTRICTED_NAME) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSysMLOC.g:1240:2: ( RULE_ID )
                    {
                    // InternalSysMLOC.g:1240:2: ( RULE_ID )
                    // InternalSysMLOC.g:1241:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1246:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalSysMLOC.g:1246:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalSysMLOC.g:1247:3: RULE_UNRESTRICTED_NAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 
                    }
                    match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Alternatives"


    // $ANTLR start "rule__ExpressionName__Alternatives"
    // InternalSysMLOC.g:1256:1: rule__ExpressionName__Alternatives : ( ( ruleFeatureChainName ) | ( RULE_NORMAL_VALUE ) );
    public final void rule__ExpressionName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1260:1: ( ( ruleFeatureChainName ) | ( RULE_NORMAL_VALUE ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_NORMAL_VALUE) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSysMLOC.g:1261:2: ( ruleFeatureChainName )
                    {
                    // InternalSysMLOC.g:1261:2: ( ruleFeatureChainName )
                    // InternalSysMLOC.g:1262:3: ruleFeatureChainName
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionNameAccess().getFeatureChainNameParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFeatureChainName();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionNameAccess().getFeatureChainNameParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1267:2: ( RULE_NORMAL_VALUE )
                    {
                    // InternalSysMLOC.g:1267:2: ( RULE_NORMAL_VALUE )
                    // InternalSysMLOC.g:1268:3: RULE_NORMAL_VALUE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionNameAccess().getNORMAL_VALUETerminalRuleCall_1()); 
                    }
                    match(input,RULE_NORMAL_VALUE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionNameAccess().getNORMAL_VALUETerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionName__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_2"
    // InternalSysMLOC.g:1277:1: rule__Expression__Alternatives_2 : ( ( ( rule__Expression__Group_2_0__0 ) ) | ( ( rule__Expression__Group_2_1__0 ) ) );
    public final void rule__Expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1281:1: ( ( ( rule__Expression__Group_2_0__0 ) ) | ( ( rule__Expression__Group_2_1__0 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_OPERATOR) ) {
                alt25=1;
            }
            else if ( (LA25_0==44) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSysMLOC.g:1282:2: ( ( rule__Expression__Group_2_0__0 ) )
                    {
                    // InternalSysMLOC.g:1282:2: ( ( rule__Expression__Group_2_0__0 ) )
                    // InternalSysMLOC.g:1283:3: ( rule__Expression__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_2_0()); 
                    }
                    // InternalSysMLOC.g:1284:3: ( rule__Expression__Group_2_0__0 )
                    // InternalSysMLOC.g:1284:4: rule__Expression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1288:2: ( ( rule__Expression__Group_2_1__0 ) )
                    {
                    // InternalSysMLOC.g:1288:2: ( ( rule__Expression__Group_2_1__0 ) )
                    // InternalSysMLOC.g:1289:3: ( rule__Expression__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getGroup_2_1()); 
                    }
                    // InternalSysMLOC.g:1290:3: ( rule__Expression__Group_2_1__0 )
                    // InternalSysMLOC.g:1290:4: rule__Expression__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives_2"


    // $ANTLR start "rule__VisibilityIndicator__Alternatives"
    // InternalSysMLOC.g:1298:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1302:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt26=1;
                }
                break;
            case 28:
                {
                alt26=2;
                }
                break;
            case 29:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSysMLOC.g:1303:2: ( ( 'public' ) )
                    {
                    // InternalSysMLOC.g:1303:2: ( ( 'public' ) )
                    // InternalSysMLOC.g:1304:3: ( 'public' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    }
                    // InternalSysMLOC.g:1305:3: ( 'public' )
                    // InternalSysMLOC.g:1305:4: 'public'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:1309:2: ( ( 'private' ) )
                    {
                    // InternalSysMLOC.g:1309:2: ( ( 'private' ) )
                    // InternalSysMLOC.g:1310:3: ( 'private' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    }
                    // InternalSysMLOC.g:1311:3: ( 'private' )
                    // InternalSysMLOC.g:1311:4: 'private'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:1315:2: ( ( 'protected' ) )
                    {
                    // InternalSysMLOC.g:1315:2: ( ( 'protected' ) )
                    // InternalSysMLOC.g:1316:3: ( 'protected' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    }
                    // InternalSysMLOC.g:1317:3: ( 'protected' )
                    // InternalSysMLOC.g:1317:4: 'protected'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibilityIndicator__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // InternalSysMLOC.g:1325:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1329:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSysMLOC.g:1330:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalSysMLOC.g:1337:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1341:1: ( ( 'package' ) )
            // InternalSysMLOC.g:1342:1: ( 'package' )
            {
            // InternalSysMLOC.g:1342:1: ( 'package' )
            // InternalSysMLOC.g:1343:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalSysMLOC.g:1352:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1356:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSysMLOC.g:1357:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalSysMLOC.g:1364:1: rule__Package__Group__1__Impl : ( ( rule__Package__DeclaredNameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1368:1: ( ( ( rule__Package__DeclaredNameAssignment_1 ) ) )
            // InternalSysMLOC.g:1369:1: ( ( rule__Package__DeclaredNameAssignment_1 ) )
            {
            // InternalSysMLOC.g:1369:1: ( ( rule__Package__DeclaredNameAssignment_1 ) )
            // InternalSysMLOC.g:1370:2: ( rule__Package__DeclaredNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getDeclaredNameAssignment_1()); 
            }
            // InternalSysMLOC.g:1371:2: ( rule__Package__DeclaredNameAssignment_1 )
            // InternalSysMLOC.g:1371:3: rule__Package__DeclaredNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__DeclaredNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getDeclaredNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalSysMLOC.g:1379:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1383:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSysMLOC.g:1384:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalSysMLOC.g:1391:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1395:1: ( ( '{' ) )
            // InternalSysMLOC.g:1396:1: ( '{' )
            {
            // InternalSysMLOC.g:1396:1: ( '{' )
            // InternalSysMLOC.g:1397:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalSysMLOC.g:1406:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1410:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSysMLOC.g:1411:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalSysMLOC.g:1418:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1422:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalSysMLOC.g:1423:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalSysMLOC.g:1423:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalSysMLOC.g:1424:2: ( rule__Package__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            }
            // InternalSysMLOC.g:1425:2: ( rule__Package__ElementsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=27 && LA27_0<=30)||(LA27_0>=34 && LA27_0<=35)||(LA27_0>=37 && LA27_0<=38)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSysMLOC.g:1425:3: rule__Package__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Package__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalSysMLOC.g:1433:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1437:1: ( rule__Package__Group__4__Impl )
            // InternalSysMLOC.g:1438:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalSysMLOC.g:1444:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1448:1: ( ( '}' ) )
            // InternalSysMLOC.g:1449:1: ( '}' )
            {
            // InternalSysMLOC.g:1449:1: ( '}' )
            // InternalSysMLOC.g:1450:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__NamespaceImport__Group__0"
    // InternalSysMLOC.g:1460:1: rule__NamespaceImport__Group__0 : rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 ;
    public final void rule__NamespaceImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1464:1: ( rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 )
            // InternalSysMLOC.g:1465:2: rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__NamespaceImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__0"


    // $ANTLR start "rule__NamespaceImport__Group__0__Impl"
    // InternalSysMLOC.g:1472:1: rule__NamespaceImport__Group__0__Impl : ( ( rule__NamespaceImport__VisibilityAssignment_0 ) ) ;
    public final void rule__NamespaceImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1476:1: ( ( ( rule__NamespaceImport__VisibilityAssignment_0 ) ) )
            // InternalSysMLOC.g:1477:1: ( ( rule__NamespaceImport__VisibilityAssignment_0 ) )
            {
            // InternalSysMLOC.g:1477:1: ( ( rule__NamespaceImport__VisibilityAssignment_0 ) )
            // InternalSysMLOC.g:1478:2: ( rule__NamespaceImport__VisibilityAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getVisibilityAssignment_0()); 
            }
            // InternalSysMLOC.g:1479:2: ( rule__NamespaceImport__VisibilityAssignment_0 )
            // InternalSysMLOC.g:1479:3: rule__NamespaceImport__VisibilityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__VisibilityAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getVisibilityAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__0__Impl"


    // $ANTLR start "rule__NamespaceImport__Group__1"
    // InternalSysMLOC.g:1487:1: rule__NamespaceImport__Group__1 : rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2 ;
    public final void rule__NamespaceImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1491:1: ( rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2 )
            // InternalSysMLOC.g:1492:2: rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NamespaceImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__1"


    // $ANTLR start "rule__NamespaceImport__Group__1__Impl"
    // InternalSysMLOC.g:1499:1: rule__NamespaceImport__Group__1__Impl : ( 'import' ) ;
    public final void rule__NamespaceImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1503:1: ( ( 'import' ) )
            // InternalSysMLOC.g:1504:1: ( 'import' )
            {
            // InternalSysMLOC.g:1504:1: ( 'import' )
            // InternalSysMLOC.g:1505:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getImportKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__1__Impl"


    // $ANTLR start "rule__NamespaceImport__Group__2"
    // InternalSysMLOC.g:1514:1: rule__NamespaceImport__Group__2 : rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3 ;
    public final void rule__NamespaceImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1518:1: ( rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3 )
            // InternalSysMLOC.g:1519:2: rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__NamespaceImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__2"


    // $ANTLR start "rule__NamespaceImport__Group__2__Impl"
    // InternalSysMLOC.g:1526:1: rule__NamespaceImport__Group__2__Impl : ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) ) ;
    public final void rule__NamespaceImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1530:1: ( ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:1531:1: ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:1531:1: ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:1532:2: ( rule__NamespaceImport__DeclaredNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getDeclaredNameAssignment_2()); 
            }
            // InternalSysMLOC.g:1533:2: ( rule__NamespaceImport__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:1533:3: rule__NamespaceImport__DeclaredNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__DeclaredNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getDeclaredNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__2__Impl"


    // $ANTLR start "rule__NamespaceImport__Group__3"
    // InternalSysMLOC.g:1541:1: rule__NamespaceImport__Group__3 : rule__NamespaceImport__Group__3__Impl ;
    public final void rule__NamespaceImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1545:1: ( rule__NamespaceImport__Group__3__Impl )
            // InternalSysMLOC.g:1546:2: rule__NamespaceImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__3"


    // $ANTLR start "rule__NamespaceImport__Group__3__Impl"
    // InternalSysMLOC.g:1552:1: rule__NamespaceImport__Group__3__Impl : ( ';' ) ;
    public final void rule__NamespaceImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1556:1: ( ( ';' ) )
            // InternalSysMLOC.g:1557:1: ( ';' )
            {
            // InternalSysMLOC.g:1557:1: ( ';' )
            // InternalSysMLOC.g:1558:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__3__Impl"


    // $ANTLR start "rule__Comment__Group__0"
    // InternalSysMLOC.g:1568:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1572:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalSysMLOC.g:1573:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Comment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // InternalSysMLOC.g:1580:1: rule__Comment__Group__0__Impl : ( 'doc' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1584:1: ( ( 'doc' ) )
            // InternalSysMLOC.g:1585:1: ( 'doc' )
            {
            // InternalSysMLOC.g:1585:1: ( 'doc' )
            // InternalSysMLOC.g:1586:2: 'doc'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getDocKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getDocKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // InternalSysMLOC.g:1595:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1599:1: ( rule__Comment__Group__1__Impl )
            // InternalSysMLOC.g:1600:2: rule__Comment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // InternalSysMLOC.g:1606:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1610:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalSysMLOC.g:1611:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalSysMLOC.g:1611:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalSysMLOC.g:1612:2: ( rule__Comment__BodyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            }
            // InternalSysMLOC.g:1613:2: ( rule__Comment__BodyAssignment_1 )
            // InternalSysMLOC.g:1613:3: rule__Comment__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__BodyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__0"
    // InternalSysMLOC.g:1622:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1626:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalSysMLOC.g:1627:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AttributeDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__0"


    // $ANTLR start "rule__AttributeDefinition__Group__0__Impl"
    // InternalSysMLOC.g:1634:1: rule__AttributeDefinition__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1638:1: ( ( 'attribute' ) )
            // InternalSysMLOC.g:1639:1: ( 'attribute' )
            {
            // InternalSysMLOC.g:1639:1: ( 'attribute' )
            // InternalSysMLOC.g:1640:2: 'attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__1"
    // InternalSysMLOC.g:1649:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1653:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalSysMLOC.g:1654:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AttributeDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__1"


    // $ANTLR start "rule__AttributeDefinition__Group__1__Impl"
    // InternalSysMLOC.g:1661:1: rule__AttributeDefinition__Group__1__Impl : ( 'def' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1665:1: ( ( 'def' ) )
            // InternalSysMLOC.g:1666:1: ( 'def' )
            {
            // InternalSysMLOC.g:1666:1: ( 'def' )
            // InternalSysMLOC.g:1667:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__1__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__2"
    // InternalSysMLOC.g:1676:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1680:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalSysMLOC.g:1681:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AttributeDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__2"


    // $ANTLR start "rule__AttributeDefinition__Group__2__Impl"
    // InternalSysMLOC.g:1688:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1692:1: ( ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:1693:1: ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:1693:1: ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:1694:2: ( rule__AttributeDefinition__DeclaredNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameAssignment_2()); 
            }
            // InternalSysMLOC.g:1695:2: ( rule__AttributeDefinition__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:1695:3: rule__AttributeDefinition__DeclaredNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__DeclaredNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__2__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__3"
    // InternalSysMLOC.g:1703:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1707:1: ( rule__AttributeDefinition__Group__3__Impl )
            // InternalSysMLOC.g:1708:2: rule__AttributeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__3"


    // $ANTLR start "rule__AttributeDefinition__Group__3__Impl"
    // InternalSysMLOC.g:1714:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Alternatives_3 ) ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1718:1: ( ( ( rule__AttributeDefinition__Alternatives_3 ) ) )
            // InternalSysMLOC.g:1719:1: ( ( rule__AttributeDefinition__Alternatives_3 ) )
            {
            // InternalSysMLOC.g:1719:1: ( ( rule__AttributeDefinition__Alternatives_3 ) )
            // InternalSysMLOC.g:1720:2: ( rule__AttributeDefinition__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getAlternatives_3()); 
            }
            // InternalSysMLOC.g:1721:2: ( rule__AttributeDefinition__Alternatives_3 )
            // InternalSysMLOC.g:1721:3: rule__AttributeDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__3__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_3_1__0"
    // InternalSysMLOC.g:1730:1: rule__AttributeDefinition__Group_3_1__0 : rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1 ;
    public final void rule__AttributeDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1734:1: ( rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1 )
            // InternalSysMLOC.g:1735:2: rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributeDefinition__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3_1__0"


    // $ANTLR start "rule__AttributeDefinition__Group_3_1__0__Impl"
    // InternalSysMLOC.g:1742:1: rule__AttributeDefinition__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1746:1: ( ( '{' ) )
            // InternalSysMLOC.g:1747:1: ( '{' )
            {
            // InternalSysMLOC.g:1747:1: ( '{' )
            // InternalSysMLOC.g:1748:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_3_1__1"
    // InternalSysMLOC.g:1757:1: rule__AttributeDefinition__Group_3_1__1 : rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2 ;
    public final void rule__AttributeDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1761:1: ( rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2 )
            // InternalSysMLOC.g:1762:2: rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2
            {
            pushFollow(FOLLOW_6);
            rule__AttributeDefinition__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3_1__1"


    // $ANTLR start "rule__AttributeDefinition__Group_3_1__1__Impl"
    // InternalSysMLOC.g:1769:1: rule__AttributeDefinition__Group_3_1__1__Impl : ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* ) ;
    public final void rule__AttributeDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1773:1: ( ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* ) )
            // InternalSysMLOC.g:1774:1: ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* )
            {
            // InternalSysMLOC.g:1774:1: ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* )
            // InternalSysMLOC.g:1775:2: ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getElementsAssignment_3_1_1()); 
            }
            // InternalSysMLOC.g:1776:2: ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=27 && LA28_0<=30)||(LA28_0>=34 && LA28_0<=35)||(LA28_0>=37 && LA28_0<=38)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSysMLOC.g:1776:3: rule__AttributeDefinition__ElementsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AttributeDefinition__ElementsAssignment_3_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getElementsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_3_1__2"
    // InternalSysMLOC.g:1784:1: rule__AttributeDefinition__Group_3_1__2 : rule__AttributeDefinition__Group_3_1__2__Impl ;
    public final void rule__AttributeDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1788:1: ( rule__AttributeDefinition__Group_3_1__2__Impl )
            // InternalSysMLOC.g:1789:2: rule__AttributeDefinition__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3_1__2"


    // $ANTLR start "rule__AttributeDefinition__Group_3_1__2__Impl"
    // InternalSysMLOC.g:1795:1: rule__AttributeDefinition__Group_3_1__2__Impl : ( '}' ) ;
    public final void rule__AttributeDefinition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1799:1: ( ( '}' ) )
            // InternalSysMLOC.g:1800:1: ( '}' )
            {
            // InternalSysMLOC.g:1800:1: ( '}' )
            // InternalSysMLOC.g:1801:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3_1__2__Impl"


    // $ANTLR start "rule__PartDefinition__Group__0"
    // InternalSysMLOC.g:1811:1: rule__PartDefinition__Group__0 : rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 ;
    public final void rule__PartDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1815:1: ( rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 )
            // InternalSysMLOC.g:1816:2: rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PartDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__0"


    // $ANTLR start "rule__PartDefinition__Group__0__Impl"
    // InternalSysMLOC.g:1823:1: rule__PartDefinition__Group__0__Impl : ( 'part' ) ;
    public final void rule__PartDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1827:1: ( ( 'part' ) )
            // InternalSysMLOC.g:1828:1: ( 'part' )
            {
            // InternalSysMLOC.g:1828:1: ( 'part' )
            // InternalSysMLOC.g:1829:2: 'part'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getPartKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getPartKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__0__Impl"


    // $ANTLR start "rule__PartDefinition__Group__1"
    // InternalSysMLOC.g:1838:1: rule__PartDefinition__Group__1 : rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 ;
    public final void rule__PartDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1842:1: ( rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 )
            // InternalSysMLOC.g:1843:2: rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PartDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__1"


    // $ANTLR start "rule__PartDefinition__Group__1__Impl"
    // InternalSysMLOC.g:1850:1: rule__PartDefinition__Group__1__Impl : ( 'def' ) ;
    public final void rule__PartDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1854:1: ( ( 'def' ) )
            // InternalSysMLOC.g:1855:1: ( 'def' )
            {
            // InternalSysMLOC.g:1855:1: ( 'def' )
            // InternalSysMLOC.g:1856:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getDefKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getDefKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__1__Impl"


    // $ANTLR start "rule__PartDefinition__Group__2"
    // InternalSysMLOC.g:1865:1: rule__PartDefinition__Group__2 : rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 ;
    public final void rule__PartDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1869:1: ( rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 )
            // InternalSysMLOC.g:1870:2: rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PartDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__2"


    // $ANTLR start "rule__PartDefinition__Group__2__Impl"
    // InternalSysMLOC.g:1877:1: rule__PartDefinition__Group__2__Impl : ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) ) ;
    public final void rule__PartDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1881:1: ( ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:1882:1: ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:1882:1: ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:1883:2: ( rule__PartDefinition__DeclaredNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getDeclaredNameAssignment_2()); 
            }
            // InternalSysMLOC.g:1884:2: ( rule__PartDefinition__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:1884:3: rule__PartDefinition__DeclaredNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__DeclaredNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getDeclaredNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__2__Impl"


    // $ANTLR start "rule__PartDefinition__Group__3"
    // InternalSysMLOC.g:1892:1: rule__PartDefinition__Group__3 : rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4 ;
    public final void rule__PartDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1896:1: ( rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4 )
            // InternalSysMLOC.g:1897:2: rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PartDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__3"


    // $ANTLR start "rule__PartDefinition__Group__3__Impl"
    // InternalSysMLOC.g:1904:1: rule__PartDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__PartDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1908:1: ( ( ';' ) )
            // InternalSysMLOC.g:1909:1: ( ';' )
            {
            // InternalSysMLOC.g:1909:1: ( ';' )
            // InternalSysMLOC.g:1910:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__3__Impl"


    // $ANTLR start "rule__PartDefinition__Group__4"
    // InternalSysMLOC.g:1919:1: rule__PartDefinition__Group__4 : rule__PartDefinition__Group__4__Impl ;
    public final void rule__PartDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1923:1: ( rule__PartDefinition__Group__4__Impl )
            // InternalSysMLOC.g:1924:2: rule__PartDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__4"


    // $ANTLR start "rule__PartDefinition__Group__4__Impl"
    // InternalSysMLOC.g:1930:1: rule__PartDefinition__Group__4__Impl : ( ( rule__PartDefinition__Alternatives_4 ) ) ;
    public final void rule__PartDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1934:1: ( ( ( rule__PartDefinition__Alternatives_4 ) ) )
            // InternalSysMLOC.g:1935:1: ( ( rule__PartDefinition__Alternatives_4 ) )
            {
            // InternalSysMLOC.g:1935:1: ( ( rule__PartDefinition__Alternatives_4 ) )
            // InternalSysMLOC.g:1936:2: ( rule__PartDefinition__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getAlternatives_4()); 
            }
            // InternalSysMLOC.g:1937:2: ( rule__PartDefinition__Alternatives_4 )
            // InternalSysMLOC.g:1937:3: rule__PartDefinition__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group__4__Impl"


    // $ANTLR start "rule__PartDefinition__Group_4_1__0"
    // InternalSysMLOC.g:1946:1: rule__PartDefinition__Group_4_1__0 : rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1 ;
    public final void rule__PartDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1950:1: ( rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1 )
            // InternalSysMLOC.g:1951:2: rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_6);
            rule__PartDefinition__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group_4_1__0"


    // $ANTLR start "rule__PartDefinition__Group_4_1__0__Impl"
    // InternalSysMLOC.g:1958:1: rule__PartDefinition__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__PartDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1962:1: ( ( '{' ) )
            // InternalSysMLOC.g:1963:1: ( '{' )
            {
            // InternalSysMLOC.g:1963:1: ( '{' )
            // InternalSysMLOC.g:1964:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__PartDefinition__Group_4_1__1"
    // InternalSysMLOC.g:1973:1: rule__PartDefinition__Group_4_1__1 : rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2 ;
    public final void rule__PartDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1977:1: ( rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2 )
            // InternalSysMLOC.g:1978:2: rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2
            {
            pushFollow(FOLLOW_6);
            rule__PartDefinition__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group_4_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group_4_1__1"


    // $ANTLR start "rule__PartDefinition__Group_4_1__1__Impl"
    // InternalSysMLOC.g:1985:1: rule__PartDefinition__Group_4_1__1__Impl : ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* ) ;
    public final void rule__PartDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1989:1: ( ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* ) )
            // InternalSysMLOC.g:1990:1: ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* )
            {
            // InternalSysMLOC.g:1990:1: ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* )
            // InternalSysMLOC.g:1991:2: ( rule__PartDefinition__ElementsAssignment_4_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getElementsAssignment_4_1_1()); 
            }
            // InternalSysMLOC.g:1992:2: ( rule__PartDefinition__ElementsAssignment_4_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=27 && LA29_0<=30)||(LA29_0>=34 && LA29_0<=35)||(LA29_0>=37 && LA29_0<=38)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSysMLOC.g:1992:3: rule__PartDefinition__ElementsAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PartDefinition__ElementsAssignment_4_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getElementsAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__PartDefinition__Group_4_1__2"
    // InternalSysMLOC.g:2000:1: rule__PartDefinition__Group_4_1__2 : rule__PartDefinition__Group_4_1__2__Impl ;
    public final void rule__PartDefinition__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2004:1: ( rule__PartDefinition__Group_4_1__2__Impl )
            // InternalSysMLOC.g:2005:2: rule__PartDefinition__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group_4_1__2"


    // $ANTLR start "rule__PartDefinition__Group_4_1__2__Impl"
    // InternalSysMLOC.g:2011:1: rule__PartDefinition__Group_4_1__2__Impl : ( '}' ) ;
    public final void rule__PartDefinition__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2015:1: ( ( '}' ) )
            // InternalSysMLOC.g:2016:1: ( '}' )
            {
            // InternalSysMLOC.g:2016:1: ( '}' )
            // InternalSysMLOC.g:2017:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_4_1_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__Group_4_1__2__Impl"


    // $ANTLR start "rule__AttributeUsage__Group__0"
    // InternalSysMLOC.g:2027:1: rule__AttributeUsage__Group__0 : rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1 ;
    public final void rule__AttributeUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2031:1: ( rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1 )
            // InternalSysMLOC.g:2032:2: rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AttributeUsage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group__0"


    // $ANTLR start "rule__AttributeUsage__Group__0__Impl"
    // InternalSysMLOC.g:2039:1: rule__AttributeUsage__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2043:1: ( ( 'attribute' ) )
            // InternalSysMLOC.g:2044:1: ( 'attribute' )
            {
            // InternalSysMLOC.g:2044:1: ( 'attribute' )
            // InternalSysMLOC.g:2045:2: 'attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group__0__Impl"


    // $ANTLR start "rule__AttributeUsage__Group__1"
    // InternalSysMLOC.g:2054:1: rule__AttributeUsage__Group__1 : rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2 ;
    public final void rule__AttributeUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2058:1: ( rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2 )
            // InternalSysMLOC.g:2059:2: rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AttributeUsage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group__1"


    // $ANTLR start "rule__AttributeUsage__Group__1__Impl"
    // InternalSysMLOC.g:2066:1: rule__AttributeUsage__Group__1__Impl : ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) ) ;
    public final void rule__AttributeUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2070:1: ( ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) ) )
            // InternalSysMLOC.g:2071:1: ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) )
            {
            // InternalSysMLOC.g:2071:1: ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) )
            // InternalSysMLOC.g:2072:2: ( rule__AttributeUsage__DeclaredNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getDeclaredNameAssignment_1()); 
            }
            // InternalSysMLOC.g:2073:2: ( rule__AttributeUsage__DeclaredNameAssignment_1 )
            // InternalSysMLOC.g:2073:3: rule__AttributeUsage__DeclaredNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__DeclaredNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getDeclaredNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group__1__Impl"


    // $ANTLR start "rule__AttributeUsage__Group__2"
    // InternalSysMLOC.g:2081:1: rule__AttributeUsage__Group__2 : rule__AttributeUsage__Group__2__Impl ;
    public final void rule__AttributeUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2085:1: ( rule__AttributeUsage__Group__2__Impl )
            // InternalSysMLOC.g:2086:2: rule__AttributeUsage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group__2"


    // $ANTLR start "rule__AttributeUsage__Group__2__Impl"
    // InternalSysMLOC.g:2092:1: rule__AttributeUsage__Group__2__Impl : ( ( rule__AttributeUsage__Alternatives_2 ) ) ;
    public final void rule__AttributeUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2096:1: ( ( ( rule__AttributeUsage__Alternatives_2 ) ) )
            // InternalSysMLOC.g:2097:1: ( ( rule__AttributeUsage__Alternatives_2 ) )
            {
            // InternalSysMLOC.g:2097:1: ( ( rule__AttributeUsage__Alternatives_2 ) )
            // InternalSysMLOC.g:2098:2: ( rule__AttributeUsage__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getAlternatives_2()); 
            }
            // InternalSysMLOC.g:2099:2: ( rule__AttributeUsage__Alternatives_2 )
            // InternalSysMLOC.g:2099:3: rule__AttributeUsage__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group__2__Impl"


    // $ANTLR start "rule__AttributeUsage__Group_2_1__0"
    // InternalSysMLOC.g:2108:1: rule__AttributeUsage__Group_2_1__0 : rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1 ;
    public final void rule__AttributeUsage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2112:1: ( rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1 )
            // InternalSysMLOC.g:2113:2: rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributeUsage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group_2_1__0"


    // $ANTLR start "rule__AttributeUsage__Group_2_1__0__Impl"
    // InternalSysMLOC.g:2120:1: rule__AttributeUsage__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeUsage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2124:1: ( ( '{' ) )
            // InternalSysMLOC.g:2125:1: ( '{' )
            {
            // InternalSysMLOC.g:2125:1: ( '{' )
            // InternalSysMLOC.g:2126:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group_2_1__0__Impl"


    // $ANTLR start "rule__AttributeUsage__Group_2_1__1"
    // InternalSysMLOC.g:2135:1: rule__AttributeUsage__Group_2_1__1 : rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2 ;
    public final void rule__AttributeUsage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2139:1: ( rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2 )
            // InternalSysMLOC.g:2140:2: rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2
            {
            pushFollow(FOLLOW_6);
            rule__AttributeUsage__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group_2_1__1"


    // $ANTLR start "rule__AttributeUsage__Group_2_1__1__Impl"
    // InternalSysMLOC.g:2147:1: rule__AttributeUsage__Group_2_1__1__Impl : ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__AttributeUsage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2151:1: ( ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* ) )
            // InternalSysMLOC.g:2152:1: ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* )
            {
            // InternalSysMLOC.g:2152:1: ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* )
            // InternalSysMLOC.g:2153:2: ( rule__AttributeUsage__ElementsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getElementsAssignment_2_1_1()); 
            }
            // InternalSysMLOC.g:2154:2: ( rule__AttributeUsage__ElementsAssignment_2_1_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=27 && LA30_0<=30)||(LA30_0>=34 && LA30_0<=35)||(LA30_0>=37 && LA30_0<=38)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSysMLOC.g:2154:3: rule__AttributeUsage__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AttributeUsage__ElementsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getElementsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group_2_1__1__Impl"


    // $ANTLR start "rule__AttributeUsage__Group_2_1__2"
    // InternalSysMLOC.g:2162:1: rule__AttributeUsage__Group_2_1__2 : rule__AttributeUsage__Group_2_1__2__Impl ;
    public final void rule__AttributeUsage__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2166:1: ( rule__AttributeUsage__Group_2_1__2__Impl )
            // InternalSysMLOC.g:2167:2: rule__AttributeUsage__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group_2_1__2"


    // $ANTLR start "rule__AttributeUsage__Group_2_1__2__Impl"
    // InternalSysMLOC.g:2173:1: rule__AttributeUsage__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__AttributeUsage__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2177:1: ( ( '}' ) )
            // InternalSysMLOC.g:2178:1: ( '}' )
            {
            // InternalSysMLOC.g:2178:1: ( '}' )
            // InternalSysMLOC.g:2179:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__Group_2_1__2__Impl"


    // $ANTLR start "rule__ActionUsage__Group__0"
    // InternalSysMLOC.g:2189:1: rule__ActionUsage__Group__0 : rule__ActionUsage__Group__0__Impl rule__ActionUsage__Group__1 ;
    public final void rule__ActionUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2193:1: ( rule__ActionUsage__Group__0__Impl rule__ActionUsage__Group__1 )
            // InternalSysMLOC.g:2194:2: rule__ActionUsage__Group__0__Impl rule__ActionUsage__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ActionUsage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group__0"


    // $ANTLR start "rule__ActionUsage__Group__0__Impl"
    // InternalSysMLOC.g:2201:1: rule__ActionUsage__Group__0__Impl : ( 'action' ) ;
    public final void rule__ActionUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2205:1: ( ( 'action' ) )
            // InternalSysMLOC.g:2206:1: ( 'action' )
            {
            // InternalSysMLOC.g:2206:1: ( 'action' )
            // InternalSysMLOC.g:2207:2: 'action'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getActionKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getActionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group__0__Impl"


    // $ANTLR start "rule__ActionUsage__Group__1"
    // InternalSysMLOC.g:2216:1: rule__ActionUsage__Group__1 : rule__ActionUsage__Group__1__Impl rule__ActionUsage__Group__2 ;
    public final void rule__ActionUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2220:1: ( rule__ActionUsage__Group__1__Impl rule__ActionUsage__Group__2 )
            // InternalSysMLOC.g:2221:2: rule__ActionUsage__Group__1__Impl rule__ActionUsage__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ActionUsage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group__1"


    // $ANTLR start "rule__ActionUsage__Group__1__Impl"
    // InternalSysMLOC.g:2228:1: rule__ActionUsage__Group__1__Impl : ( ( rule__ActionUsage__DeclaredNameAssignment_1 ) ) ;
    public final void rule__ActionUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2232:1: ( ( ( rule__ActionUsage__DeclaredNameAssignment_1 ) ) )
            // InternalSysMLOC.g:2233:1: ( ( rule__ActionUsage__DeclaredNameAssignment_1 ) )
            {
            // InternalSysMLOC.g:2233:1: ( ( rule__ActionUsage__DeclaredNameAssignment_1 ) )
            // InternalSysMLOC.g:2234:2: ( rule__ActionUsage__DeclaredNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getDeclaredNameAssignment_1()); 
            }
            // InternalSysMLOC.g:2235:2: ( rule__ActionUsage__DeclaredNameAssignment_1 )
            // InternalSysMLOC.g:2235:3: rule__ActionUsage__DeclaredNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionUsage__DeclaredNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getDeclaredNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group__1__Impl"


    // $ANTLR start "rule__ActionUsage__Group__2"
    // InternalSysMLOC.g:2243:1: rule__ActionUsage__Group__2 : rule__ActionUsage__Group__2__Impl ;
    public final void rule__ActionUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2247:1: ( rule__ActionUsage__Group__2__Impl )
            // InternalSysMLOC.g:2248:2: rule__ActionUsage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group__2"


    // $ANTLR start "rule__ActionUsage__Group__2__Impl"
    // InternalSysMLOC.g:2254:1: rule__ActionUsage__Group__2__Impl : ( ( rule__ActionUsage__Alternatives_2 ) ) ;
    public final void rule__ActionUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2258:1: ( ( ( rule__ActionUsage__Alternatives_2 ) ) )
            // InternalSysMLOC.g:2259:1: ( ( rule__ActionUsage__Alternatives_2 ) )
            {
            // InternalSysMLOC.g:2259:1: ( ( rule__ActionUsage__Alternatives_2 ) )
            // InternalSysMLOC.g:2260:2: ( rule__ActionUsage__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getAlternatives_2()); 
            }
            // InternalSysMLOC.g:2261:2: ( rule__ActionUsage__Alternatives_2 )
            // InternalSysMLOC.g:2261:3: rule__ActionUsage__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group__2__Impl"


    // $ANTLR start "rule__ActionUsage__Group_2_1__0"
    // InternalSysMLOC.g:2270:1: rule__ActionUsage__Group_2_1__0 : rule__ActionUsage__Group_2_1__0__Impl rule__ActionUsage__Group_2_1__1 ;
    public final void rule__ActionUsage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2274:1: ( rule__ActionUsage__Group_2_1__0__Impl rule__ActionUsage__Group_2_1__1 )
            // InternalSysMLOC.g:2275:2: rule__ActionUsage__Group_2_1__0__Impl rule__ActionUsage__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ActionUsage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group_2_1__0"


    // $ANTLR start "rule__ActionUsage__Group_2_1__0__Impl"
    // InternalSysMLOC.g:2282:1: rule__ActionUsage__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__ActionUsage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2286:1: ( ( '{' ) )
            // InternalSysMLOC.g:2287:1: ( '{' )
            {
            // InternalSysMLOC.g:2287:1: ( '{' )
            // InternalSysMLOC.g:2288:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group_2_1__0__Impl"


    // $ANTLR start "rule__ActionUsage__Group_2_1__1"
    // InternalSysMLOC.g:2297:1: rule__ActionUsage__Group_2_1__1 : rule__ActionUsage__Group_2_1__1__Impl rule__ActionUsage__Group_2_1__2 ;
    public final void rule__ActionUsage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2301:1: ( rule__ActionUsage__Group_2_1__1__Impl rule__ActionUsage__Group_2_1__2 )
            // InternalSysMLOC.g:2302:2: rule__ActionUsage__Group_2_1__1__Impl rule__ActionUsage__Group_2_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ActionUsage__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group_2_1__1"


    // $ANTLR start "rule__ActionUsage__Group_2_1__1__Impl"
    // InternalSysMLOC.g:2309:1: rule__ActionUsage__Group_2_1__1__Impl : ( ( rule__ActionUsage__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__ActionUsage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2313:1: ( ( ( rule__ActionUsage__ElementsAssignment_2_1_1 )* ) )
            // InternalSysMLOC.g:2314:1: ( ( rule__ActionUsage__ElementsAssignment_2_1_1 )* )
            {
            // InternalSysMLOC.g:2314:1: ( ( rule__ActionUsage__ElementsAssignment_2_1_1 )* )
            // InternalSysMLOC.g:2315:2: ( rule__ActionUsage__ElementsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getElementsAssignment_2_1_1()); 
            }
            // InternalSysMLOC.g:2316:2: ( rule__ActionUsage__ElementsAssignment_2_1_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=27 && LA31_0<=30)||(LA31_0>=34 && LA31_0<=35)||(LA31_0>=37 && LA31_0<=38)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSysMLOC.g:2316:3: rule__ActionUsage__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ActionUsage__ElementsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getElementsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group_2_1__1__Impl"


    // $ANTLR start "rule__ActionUsage__Group_2_1__2"
    // InternalSysMLOC.g:2324:1: rule__ActionUsage__Group_2_1__2 : rule__ActionUsage__Group_2_1__2__Impl ;
    public final void rule__ActionUsage__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2328:1: ( rule__ActionUsage__Group_2_1__2__Impl )
            // InternalSysMLOC.g:2329:2: rule__ActionUsage__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionUsage__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group_2_1__2"


    // $ANTLR start "rule__ActionUsage__Group_2_1__2__Impl"
    // InternalSysMLOC.g:2335:1: rule__ActionUsage__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__ActionUsage__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2339:1: ( ( '}' ) )
            // InternalSysMLOC.g:2340:1: ( '}' )
            {
            // InternalSysMLOC.g:2340:1: ( '}' )
            // InternalSysMLOC.g:2341:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__Group_2_1__2__Impl"


    // $ANTLR start "rule__PartUsage__Group__0"
    // InternalSysMLOC.g:2351:1: rule__PartUsage__Group__0 : rule__PartUsage__Group__0__Impl rule__PartUsage__Group__1 ;
    public final void rule__PartUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2355:1: ( rule__PartUsage__Group__0__Impl rule__PartUsage__Group__1 )
            // InternalSysMLOC.g:2356:2: rule__PartUsage__Group__0__Impl rule__PartUsage__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PartUsage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group__0"


    // $ANTLR start "rule__PartUsage__Group__0__Impl"
    // InternalSysMLOC.g:2363:1: rule__PartUsage__Group__0__Impl : ( 'part' ) ;
    public final void rule__PartUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2367:1: ( ( 'part' ) )
            // InternalSysMLOC.g:2368:1: ( 'part' )
            {
            // InternalSysMLOC.g:2368:1: ( 'part' )
            // InternalSysMLOC.g:2369:2: 'part'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getPartKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getPartKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group__0__Impl"


    // $ANTLR start "rule__PartUsage__Group__1"
    // InternalSysMLOC.g:2378:1: rule__PartUsage__Group__1 : rule__PartUsage__Group__1__Impl rule__PartUsage__Group__2 ;
    public final void rule__PartUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2382:1: ( rule__PartUsage__Group__1__Impl rule__PartUsage__Group__2 )
            // InternalSysMLOC.g:2383:2: rule__PartUsage__Group__1__Impl rule__PartUsage__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PartUsage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group__1"


    // $ANTLR start "rule__PartUsage__Group__1__Impl"
    // InternalSysMLOC.g:2390:1: rule__PartUsage__Group__1__Impl : ( ruleUsage ) ;
    public final void rule__PartUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2394:1: ( ( ruleUsage ) )
            // InternalSysMLOC.g:2395:1: ( ruleUsage )
            {
            // InternalSysMLOC.g:2395:1: ( ruleUsage )
            // InternalSysMLOC.g:2396:2: ruleUsage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getUsageParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleUsage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getUsageParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group__1__Impl"


    // $ANTLR start "rule__PartUsage__Group__2"
    // InternalSysMLOC.g:2405:1: rule__PartUsage__Group__2 : rule__PartUsage__Group__2__Impl ;
    public final void rule__PartUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2409:1: ( rule__PartUsage__Group__2__Impl )
            // InternalSysMLOC.g:2410:2: rule__PartUsage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group__2"


    // $ANTLR start "rule__PartUsage__Group__2__Impl"
    // InternalSysMLOC.g:2416:1: rule__PartUsage__Group__2__Impl : ( ( rule__PartUsage__Alternatives_2 ) ) ;
    public final void rule__PartUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2420:1: ( ( ( rule__PartUsage__Alternatives_2 ) ) )
            // InternalSysMLOC.g:2421:1: ( ( rule__PartUsage__Alternatives_2 ) )
            {
            // InternalSysMLOC.g:2421:1: ( ( rule__PartUsage__Alternatives_2 ) )
            // InternalSysMLOC.g:2422:2: ( rule__PartUsage__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getAlternatives_2()); 
            }
            // InternalSysMLOC.g:2423:2: ( rule__PartUsage__Alternatives_2 )
            // InternalSysMLOC.g:2423:3: rule__PartUsage__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__PartUsage__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group__2__Impl"


    // $ANTLR start "rule__PartUsage__Group_2_1__0"
    // InternalSysMLOC.g:2432:1: rule__PartUsage__Group_2_1__0 : rule__PartUsage__Group_2_1__0__Impl rule__PartUsage__Group_2_1__1 ;
    public final void rule__PartUsage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2436:1: ( rule__PartUsage__Group_2_1__0__Impl rule__PartUsage__Group_2_1__1 )
            // InternalSysMLOC.g:2437:2: rule__PartUsage__Group_2_1__0__Impl rule__PartUsage__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__PartUsage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group_2_1__0"


    // $ANTLR start "rule__PartUsage__Group_2_1__0__Impl"
    // InternalSysMLOC.g:2444:1: rule__PartUsage__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__PartUsage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2448:1: ( ( '{' ) )
            // InternalSysMLOC.g:2449:1: ( '{' )
            {
            // InternalSysMLOC.g:2449:1: ( '{' )
            // InternalSysMLOC.g:2450:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group_2_1__0__Impl"


    // $ANTLR start "rule__PartUsage__Group_2_1__1"
    // InternalSysMLOC.g:2459:1: rule__PartUsage__Group_2_1__1 : rule__PartUsage__Group_2_1__1__Impl rule__PartUsage__Group_2_1__2 ;
    public final void rule__PartUsage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2463:1: ( rule__PartUsage__Group_2_1__1__Impl rule__PartUsage__Group_2_1__2 )
            // InternalSysMLOC.g:2464:2: rule__PartUsage__Group_2_1__1__Impl rule__PartUsage__Group_2_1__2
            {
            pushFollow(FOLLOW_6);
            rule__PartUsage__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group_2_1__1"


    // $ANTLR start "rule__PartUsage__Group_2_1__1__Impl"
    // InternalSysMLOC.g:2471:1: rule__PartUsage__Group_2_1__1__Impl : ( ( rule__PartUsage__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__PartUsage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2475:1: ( ( ( rule__PartUsage__ElementsAssignment_2_1_1 )* ) )
            // InternalSysMLOC.g:2476:1: ( ( rule__PartUsage__ElementsAssignment_2_1_1 )* )
            {
            // InternalSysMLOC.g:2476:1: ( ( rule__PartUsage__ElementsAssignment_2_1_1 )* )
            // InternalSysMLOC.g:2477:2: ( rule__PartUsage__ElementsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getElementsAssignment_2_1_1()); 
            }
            // InternalSysMLOC.g:2478:2: ( rule__PartUsage__ElementsAssignment_2_1_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=27 && LA32_0<=30)||(LA32_0>=34 && LA32_0<=35)||(LA32_0>=37 && LA32_0<=38)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSysMLOC.g:2478:3: rule__PartUsage__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PartUsage__ElementsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getElementsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group_2_1__1__Impl"


    // $ANTLR start "rule__PartUsage__Group_2_1__2"
    // InternalSysMLOC.g:2486:1: rule__PartUsage__Group_2_1__2 : rule__PartUsage__Group_2_1__2__Impl ;
    public final void rule__PartUsage__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2490:1: ( rule__PartUsage__Group_2_1__2__Impl )
            // InternalSysMLOC.g:2491:2: rule__PartUsage__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group_2_1__2"


    // $ANTLR start "rule__PartUsage__Group_2_1__2__Impl"
    // InternalSysMLOC.g:2497:1: rule__PartUsage__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__PartUsage__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2501:1: ( ( '}' ) )
            // InternalSysMLOC.g:2502:1: ( '}' )
            {
            // InternalSysMLOC.g:2502:1: ( '}' )
            // InternalSysMLOC.g:2503:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__Group_2_1__2__Impl"


    // $ANTLR start "rule__Usage__Group__0"
    // InternalSysMLOC.g:2513:1: rule__Usage__Group__0 : rule__Usage__Group__0__Impl rule__Usage__Group__1 ;
    public final void rule__Usage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2517:1: ( rule__Usage__Group__0__Impl rule__Usage__Group__1 )
            // InternalSysMLOC.g:2518:2: rule__Usage__Group__0__Impl rule__Usage__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Usage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Usage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usage__Group__0"


    // $ANTLR start "rule__Usage__Group__0__Impl"
    // InternalSysMLOC.g:2525:1: rule__Usage__Group__0__Impl : ( ( ruleFeatureDeclaration )? ) ;
    public final void rule__Usage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2529:1: ( ( ( ruleFeatureDeclaration )? ) )
            // InternalSysMLOC.g:2530:1: ( ( ruleFeatureDeclaration )? )
            {
            // InternalSysMLOC.g:2530:1: ( ( ruleFeatureDeclaration )? )
            // InternalSysMLOC.g:2531:2: ( ruleFeatureDeclaration )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsageAccess().getFeatureDeclarationParserRuleCall_0()); 
            }
            // InternalSysMLOC.g:2532:2: ( ruleFeatureDeclaration )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_UNRESTRICTED_NAME)||(LA33_0>=17 && LA33_0<=26)||LA33_0==39||LA33_0==42||(LA33_0>=49 && LA33_0<=50)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSysMLOC.g:2532:3: ruleFeatureDeclaration
                    {
                    pushFollow(FOLLOW_2);
                    ruleFeatureDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsageAccess().getFeatureDeclarationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usage__Group__0__Impl"


    // $ANTLR start "rule__Usage__Group__1"
    // InternalSysMLOC.g:2540:1: rule__Usage__Group__1 : rule__Usage__Group__1__Impl ;
    public final void rule__Usage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2544:1: ( rule__Usage__Group__1__Impl )
            // InternalSysMLOC.g:2545:2: rule__Usage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Usage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usage__Group__1"


    // $ANTLR start "rule__Usage__Group__1__Impl"
    // InternalSysMLOC.g:2551:1: rule__Usage__Group__1__Impl : ( ( ruleFeatureValue )? ) ;
    public final void rule__Usage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2555:1: ( ( ( ruleFeatureValue )? ) )
            // InternalSysMLOC.g:2556:1: ( ( ruleFeatureValue )? )
            {
            // InternalSysMLOC.g:2556:1: ( ( ruleFeatureValue )? )
            // InternalSysMLOC.g:2557:2: ( ruleFeatureValue )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUsageAccess().getFeatureValueParserRuleCall_1()); 
            }
            // InternalSysMLOC.g:2558:2: ( ruleFeatureValue )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16||(LA34_0>=47 && LA34_0<=48)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSysMLOC.g:2558:3: ruleFeatureValue
                    {
                    pushFollow(FOLLOW_2);
                    ruleFeatureValue();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUsageAccess().getFeatureValueParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Usage__Group__1__Impl"


    // $ANTLR start "rule__FeatureValue__Group__0"
    // InternalSysMLOC.g:2567:1: rule__FeatureValue__Group__0 : rule__FeatureValue__Group__0__Impl rule__FeatureValue__Group__1 ;
    public final void rule__FeatureValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2571:1: ( rule__FeatureValue__Group__0__Impl rule__FeatureValue__Group__1 )
            // InternalSysMLOC.g:2572:2: rule__FeatureValue__Group__0__Impl rule__FeatureValue__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FeatureValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group__0"


    // $ANTLR start "rule__FeatureValue__Group__0__Impl"
    // InternalSysMLOC.g:2579:1: rule__FeatureValue__Group__0__Impl : ( ( rule__FeatureValue__Alternatives_0 ) ) ;
    public final void rule__FeatureValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2583:1: ( ( ( rule__FeatureValue__Alternatives_0 ) ) )
            // InternalSysMLOC.g:2584:1: ( ( rule__FeatureValue__Alternatives_0 ) )
            {
            // InternalSysMLOC.g:2584:1: ( ( rule__FeatureValue__Alternatives_0 ) )
            // InternalSysMLOC.g:2585:2: ( rule__FeatureValue__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getAlternatives_0()); 
            }
            // InternalSysMLOC.g:2586:2: ( rule__FeatureValue__Alternatives_0 )
            // InternalSysMLOC.g:2586:3: rule__FeatureValue__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureValue__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group__0__Impl"


    // $ANTLR start "rule__FeatureValue__Group__1"
    // InternalSysMLOC.g:2594:1: rule__FeatureValue__Group__1 : rule__FeatureValue__Group__1__Impl ;
    public final void rule__FeatureValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2598:1: ( rule__FeatureValue__Group__1__Impl )
            // InternalSysMLOC.g:2599:2: rule__FeatureValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group__1"


    // $ANTLR start "rule__FeatureValue__Group__1__Impl"
    // InternalSysMLOC.g:2605:1: rule__FeatureValue__Group__1__Impl : ( ( rule__FeatureValue__OwnedExpressionAssignment_1 ) ) ;
    public final void rule__FeatureValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2609:1: ( ( ( rule__FeatureValue__OwnedExpressionAssignment_1 ) ) )
            // InternalSysMLOC.g:2610:1: ( ( rule__FeatureValue__OwnedExpressionAssignment_1 ) )
            {
            // InternalSysMLOC.g:2610:1: ( ( rule__FeatureValue__OwnedExpressionAssignment_1 ) )
            // InternalSysMLOC.g:2611:2: ( rule__FeatureValue__OwnedExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getOwnedExpressionAssignment_1()); 
            }
            // InternalSysMLOC.g:2612:2: ( rule__FeatureValue__OwnedExpressionAssignment_1 )
            // InternalSysMLOC.g:2612:3: rule__FeatureValue__OwnedExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureValue__OwnedExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getOwnedExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group__1__Impl"


    // $ANTLR start "rule__FeatureValue__Group_0_2__0"
    // InternalSysMLOC.g:2621:1: rule__FeatureValue__Group_0_2__0 : rule__FeatureValue__Group_0_2__0__Impl rule__FeatureValue__Group_0_2__1 ;
    public final void rule__FeatureValue__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2625:1: ( rule__FeatureValue__Group_0_2__0__Impl rule__FeatureValue__Group_0_2__1 )
            // InternalSysMLOC.g:2626:2: rule__FeatureValue__Group_0_2__0__Impl rule__FeatureValue__Group_0_2__1
            {
            pushFollow(FOLLOW_15);
            rule__FeatureValue__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureValue__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group_0_2__0"


    // $ANTLR start "rule__FeatureValue__Group_0_2__0__Impl"
    // InternalSysMLOC.g:2633:1: rule__FeatureValue__Group_0_2__0__Impl : ( ( rule__FeatureValue__IsDefaultAssignment_0_2_0 ) ) ;
    public final void rule__FeatureValue__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2637:1: ( ( ( rule__FeatureValue__IsDefaultAssignment_0_2_0 ) ) )
            // InternalSysMLOC.g:2638:1: ( ( rule__FeatureValue__IsDefaultAssignment_0_2_0 ) )
            {
            // InternalSysMLOC.g:2638:1: ( ( rule__FeatureValue__IsDefaultAssignment_0_2_0 ) )
            // InternalSysMLOC.g:2639:2: ( rule__FeatureValue__IsDefaultAssignment_0_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getIsDefaultAssignment_0_2_0()); 
            }
            // InternalSysMLOC.g:2640:2: ( rule__FeatureValue__IsDefaultAssignment_0_2_0 )
            // InternalSysMLOC.g:2640:3: rule__FeatureValue__IsDefaultAssignment_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureValue__IsDefaultAssignment_0_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getIsDefaultAssignment_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group_0_2__0__Impl"


    // $ANTLR start "rule__FeatureValue__Group_0_2__1"
    // InternalSysMLOC.g:2648:1: rule__FeatureValue__Group_0_2__1 : rule__FeatureValue__Group_0_2__1__Impl ;
    public final void rule__FeatureValue__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2652:1: ( rule__FeatureValue__Group_0_2__1__Impl )
            // InternalSysMLOC.g:2653:2: rule__FeatureValue__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureValue__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group_0_2__1"


    // $ANTLR start "rule__FeatureValue__Group_0_2__1__Impl"
    // InternalSysMLOC.g:2659:1: rule__FeatureValue__Group_0_2__1__Impl : ( ( rule__FeatureValue__Alternatives_0_2_1 )? ) ;
    public final void rule__FeatureValue__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2663:1: ( ( ( rule__FeatureValue__Alternatives_0_2_1 )? ) )
            // InternalSysMLOC.g:2664:1: ( ( rule__FeatureValue__Alternatives_0_2_1 )? )
            {
            // InternalSysMLOC.g:2664:1: ( ( rule__FeatureValue__Alternatives_0_2_1 )? )
            // InternalSysMLOC.g:2665:2: ( rule__FeatureValue__Alternatives_0_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getAlternatives_0_2_1()); 
            }
            // InternalSysMLOC.g:2666:2: ( rule__FeatureValue__Alternatives_0_2_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16||LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSysMLOC.g:2666:3: rule__FeatureValue__Alternatives_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureValue__Alternatives_0_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getAlternatives_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__Group_0_2__1__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group_0__0"
    // InternalSysMLOC.g:2675:1: rule__FeatureDeclaration__Group_0__0 : rule__FeatureDeclaration__Group_0__0__Impl rule__FeatureDeclaration__Group_0__1 ;
    public final void rule__FeatureDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2679:1: ( rule__FeatureDeclaration__Group_0__0__Impl rule__FeatureDeclaration__Group_0__1 )
            // InternalSysMLOC.g:2680:2: rule__FeatureDeclaration__Group_0__0__Impl rule__FeatureDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__FeatureDeclaration__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureDeclaration__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_0__0"


    // $ANTLR start "rule__FeatureDeclaration__Group_0__0__Impl"
    // InternalSysMLOC.g:2687:1: rule__FeatureDeclaration__Group_0__0__Impl : ( ( rule__FeatureDeclaration__DeclaredNameAssignment_0_0 ) ) ;
    public final void rule__FeatureDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2691:1: ( ( ( rule__FeatureDeclaration__DeclaredNameAssignment_0_0 ) ) )
            // InternalSysMLOC.g:2692:1: ( ( rule__FeatureDeclaration__DeclaredNameAssignment_0_0 ) )
            {
            // InternalSysMLOC.g:2692:1: ( ( rule__FeatureDeclaration__DeclaredNameAssignment_0_0 ) )
            // InternalSysMLOC.g:2693:2: ( rule__FeatureDeclaration__DeclaredNameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameAssignment_0_0()); 
            }
            // InternalSysMLOC.g:2694:2: ( rule__FeatureDeclaration__DeclaredNameAssignment_0_0 )
            // InternalSysMLOC.g:2694:3: rule__FeatureDeclaration__DeclaredNameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDeclaration__DeclaredNameAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__FeatureDeclaration__Group_0__1"
    // InternalSysMLOC.g:2702:1: rule__FeatureDeclaration__Group_0__1 : rule__FeatureDeclaration__Group_0__1__Impl ;
    public final void rule__FeatureDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2706:1: ( rule__FeatureDeclaration__Group_0__1__Impl )
            // InternalSysMLOC.g:2707:2: rule__FeatureDeclaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureDeclaration__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_0__1"


    // $ANTLR start "rule__FeatureDeclaration__Group_0__1__Impl"
    // InternalSysMLOC.g:2713:1: rule__FeatureDeclaration__Group_0__1__Impl : ( ( ruleFeatureSpecializationPart )? ) ;
    public final void rule__FeatureDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2717:1: ( ( ( ruleFeatureSpecializationPart )? ) )
            // InternalSysMLOC.g:2718:1: ( ( ruleFeatureSpecializationPart )? )
            {
            // InternalSysMLOC.g:2718:1: ( ( ruleFeatureSpecializationPart )? )
            // InternalSysMLOC.g:2719:2: ( ruleFeatureSpecializationPart )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getFeatureSpecializationPartParserRuleCall_0_1()); 
            }
            // InternalSysMLOC.g:2720:2: ( ruleFeatureSpecializationPart )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=17 && LA36_0<=26)||LA36_0==39||LA36_0==42||(LA36_0>=49 && LA36_0<=50)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSysMLOC.g:2720:3: ruleFeatureSpecializationPart
                    {
                    pushFollow(FOLLOW_2);
                    ruleFeatureSpecializationPart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getFeatureSpecializationPartParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_0__0"
    // InternalSysMLOC.g:2729:1: rule__FeatureSpecializationPart__Group_0__0 : rule__FeatureSpecializationPart__Group_0__0__Impl rule__FeatureSpecializationPart__Group_0__1 ;
    public final void rule__FeatureSpecializationPart__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2733:1: ( rule__FeatureSpecializationPart__Group_0__0__Impl rule__FeatureSpecializationPart__Group_0__1 )
            // InternalSysMLOC.g:2734:2: rule__FeatureSpecializationPart__Group_0__0__Impl rule__FeatureSpecializationPart__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__FeatureSpecializationPart__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecializationPart__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_0__0"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_0__0__Impl"
    // InternalSysMLOC.g:2741:1: rule__FeatureSpecializationPart__Group_0__0__Impl : ( ( ( ruleFeatureSpecialization ) ) ( ( ruleFeatureSpecialization )* ) ) ;
    public final void rule__FeatureSpecializationPart__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2745:1: ( ( ( ( ruleFeatureSpecialization ) ) ( ( ruleFeatureSpecialization )* ) ) )
            // InternalSysMLOC.g:2746:1: ( ( ( ruleFeatureSpecialization ) ) ( ( ruleFeatureSpecialization )* ) )
            {
            // InternalSysMLOC.g:2746:1: ( ( ( ruleFeatureSpecialization ) ) ( ( ruleFeatureSpecialization )* ) )
            // InternalSysMLOC.g:2747:2: ( ( ruleFeatureSpecialization ) ) ( ( ruleFeatureSpecialization )* )
            {
            // InternalSysMLOC.g:2747:2: ( ( ruleFeatureSpecialization ) )
            // InternalSysMLOC.g:2748:3: ( ruleFeatureSpecialization )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0()); 
            }
            // InternalSysMLOC.g:2749:3: ( ruleFeatureSpecialization )
            // InternalSysMLOC.g:2749:4: ruleFeatureSpecialization
            {
            pushFollow(FOLLOW_17);
            ruleFeatureSpecialization();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0()); 
            }

            }

            // InternalSysMLOC.g:2752:2: ( ( ruleFeatureSpecialization )* )
            // InternalSysMLOC.g:2753:3: ( ruleFeatureSpecialization )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0()); 
            }
            // InternalSysMLOC.g:2754:3: ( ruleFeatureSpecialization )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // InternalSysMLOC.g:2754:4: ruleFeatureSpecialization
            	    {
            	    pushFollow(FOLLOW_17);
            	    ruleFeatureSpecialization();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_0__0__Impl"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_0__1"
    // InternalSysMLOC.g:2763:1: rule__FeatureSpecializationPart__Group_0__1 : rule__FeatureSpecializationPart__Group_0__1__Impl rule__FeatureSpecializationPart__Group_0__2 ;
    public final void rule__FeatureSpecializationPart__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2767:1: ( rule__FeatureSpecializationPart__Group_0__1__Impl rule__FeatureSpecializationPart__Group_0__2 )
            // InternalSysMLOC.g:2768:2: rule__FeatureSpecializationPart__Group_0__1__Impl rule__FeatureSpecializationPart__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__FeatureSpecializationPart__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecializationPart__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_0__1"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_0__1__Impl"
    // InternalSysMLOC.g:2775:1: rule__FeatureSpecializationPart__Group_0__1__Impl : ( ( ruleMultiplicityPart )? ) ;
    public final void rule__FeatureSpecializationPart__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2779:1: ( ( ( ruleMultiplicityPart )? ) )
            // InternalSysMLOC.g:2780:1: ( ( ruleMultiplicityPart )? )
            {
            // InternalSysMLOC.g:2780:1: ( ( ruleMultiplicityPart )? )
            // InternalSysMLOC.g:2781:2: ( ruleMultiplicityPart )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_0_1()); 
            }
            // InternalSysMLOC.g:2782:2: ( ruleMultiplicityPart )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39||(LA38_0>=49 && LA38_0<=50)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSysMLOC.g:2782:3: ruleMultiplicityPart
                    {
                    pushFollow(FOLLOW_2);
                    ruleMultiplicityPart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_0__1__Impl"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_0__2"
    // InternalSysMLOC.g:2790:1: rule__FeatureSpecializationPart__Group_0__2 : rule__FeatureSpecializationPart__Group_0__2__Impl ;
    public final void rule__FeatureSpecializationPart__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2794:1: ( rule__FeatureSpecializationPart__Group_0__2__Impl )
            // InternalSysMLOC.g:2795:2: rule__FeatureSpecializationPart__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecializationPart__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_0__2"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_0__2__Impl"
    // InternalSysMLOC.g:2801:1: rule__FeatureSpecializationPart__Group_0__2__Impl : ( ( ruleFeatureSpecialization )* ) ;
    public final void rule__FeatureSpecializationPart__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2805:1: ( ( ( ruleFeatureSpecialization )* ) )
            // InternalSysMLOC.g:2806:1: ( ( ruleFeatureSpecialization )* )
            {
            // InternalSysMLOC.g:2806:1: ( ( ruleFeatureSpecialization )* )
            // InternalSysMLOC.g:2807:2: ( ruleFeatureSpecialization )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_2()); 
            }
            // InternalSysMLOC.g:2808:2: ( ruleFeatureSpecialization )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=17 && LA39_0<=26)||LA39_0==42) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSysMLOC.g:2808:3: ruleFeatureSpecialization
            	    {
            	    pushFollow(FOLLOW_17);
            	    ruleFeatureSpecialization();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_0__2__Impl"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_1__0"
    // InternalSysMLOC.g:2817:1: rule__FeatureSpecializationPart__Group_1__0 : rule__FeatureSpecializationPart__Group_1__0__Impl rule__FeatureSpecializationPart__Group_1__1 ;
    public final void rule__FeatureSpecializationPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2821:1: ( rule__FeatureSpecializationPart__Group_1__0__Impl rule__FeatureSpecializationPart__Group_1__1 )
            // InternalSysMLOC.g:2822:2: rule__FeatureSpecializationPart__Group_1__0__Impl rule__FeatureSpecializationPart__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__FeatureSpecializationPart__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecializationPart__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_1__0"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_1__0__Impl"
    // InternalSysMLOC.g:2829:1: rule__FeatureSpecializationPart__Group_1__0__Impl : ( ruleMultiplicityPart ) ;
    public final void rule__FeatureSpecializationPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2833:1: ( ( ruleMultiplicityPart ) )
            // InternalSysMLOC.g:2834:1: ( ruleMultiplicityPart )
            {
            // InternalSysMLOC.g:2834:1: ( ruleMultiplicityPart )
            // InternalSysMLOC.g:2835:2: ruleMultiplicityPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicityPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationPartAccess().getMultiplicityPartParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_1__1"
    // InternalSysMLOC.g:2844:1: rule__FeatureSpecializationPart__Group_1__1 : rule__FeatureSpecializationPart__Group_1__1__Impl ;
    public final void rule__FeatureSpecializationPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2848:1: ( rule__FeatureSpecializationPart__Group_1__1__Impl )
            // InternalSysMLOC.g:2849:2: rule__FeatureSpecializationPart__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecializationPart__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_1__1"


    // $ANTLR start "rule__FeatureSpecializationPart__Group_1__1__Impl"
    // InternalSysMLOC.g:2855:1: rule__FeatureSpecializationPart__Group_1__1__Impl : ( ( ruleFeatureSpecialization )* ) ;
    public final void rule__FeatureSpecializationPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2859:1: ( ( ( ruleFeatureSpecialization )* ) )
            // InternalSysMLOC.g:2860:1: ( ( ruleFeatureSpecialization )* )
            {
            // InternalSysMLOC.g:2860:1: ( ( ruleFeatureSpecialization )* )
            // InternalSysMLOC.g:2861:2: ( ruleFeatureSpecialization )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_1_1()); 
            }
            // InternalSysMLOC.g:2862:2: ( ruleFeatureSpecialization )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=17 && LA40_0<=26)||LA40_0==42) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSysMLOC.g:2862:3: ruleFeatureSpecialization
            	    {
            	    pushFollow(FOLLOW_17);
            	    ruleFeatureSpecialization();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationPartAccess().getFeatureSpecializationParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecializationPart__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_0__0"
    // InternalSysMLOC.g:2871:1: rule__MultiplicityPart__Group_0__0 : rule__MultiplicityPart__Group_0__0__Impl rule__MultiplicityPart__Group_0__1 ;
    public final void rule__MultiplicityPart__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2875:1: ( rule__MultiplicityPart__Group_0__0__Impl rule__MultiplicityPart__Group_0__1 )
            // InternalSysMLOC.g:2876:2: rule__MultiplicityPart__Group_0__0__Impl rule__MultiplicityPart__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__MultiplicityPart__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__0"


    // $ANTLR start "rule__MultiplicityPart__Group_0__0__Impl"
    // InternalSysMLOC.g:2883:1: rule__MultiplicityPart__Group_0__0__Impl : ( '[' ) ;
    public final void rule__MultiplicityPart__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2887:1: ( ( '[' ) )
            // InternalSysMLOC.g:2888:1: ( '[' )
            {
            // InternalSysMLOC.g:2888:1: ( '[' )
            // InternalSysMLOC.g:2889:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__0__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_0__1"
    // InternalSysMLOC.g:2898:1: rule__MultiplicityPart__Group_0__1 : rule__MultiplicityPart__Group_0__1__Impl rule__MultiplicityPart__Group_0__2 ;
    public final void rule__MultiplicityPart__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2902:1: ( rule__MultiplicityPart__Group_0__1__Impl rule__MultiplicityPart__Group_0__2 )
            // InternalSysMLOC.g:2903:2: rule__MultiplicityPart__Group_0__1__Impl rule__MultiplicityPart__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicityPart__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__1"


    // $ANTLR start "rule__MultiplicityPart__Group_0__1__Impl"
    // InternalSysMLOC.g:2910:1: rule__MultiplicityPart__Group_0__1__Impl : ( ( rule__MultiplicityPart__MultiplicityAssignment_0_1 ) ) ;
    public final void rule__MultiplicityPart__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2914:1: ( ( ( rule__MultiplicityPart__MultiplicityAssignment_0_1 ) ) )
            // InternalSysMLOC.g:2915:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_0_1 ) )
            {
            // InternalSysMLOC.g:2915:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_0_1 ) )
            // InternalSysMLOC.g:2916:2: ( rule__MultiplicityPart__MultiplicityAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_0_1()); 
            }
            // InternalSysMLOC.g:2917:2: ( rule__MultiplicityPart__MultiplicityAssignment_0_1 )
            // InternalSysMLOC.g:2917:3: rule__MultiplicityPart__MultiplicityAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__MultiplicityAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__1__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_0__2"
    // InternalSysMLOC.g:2925:1: rule__MultiplicityPart__Group_0__2 : rule__MultiplicityPart__Group_0__2__Impl rule__MultiplicityPart__Group_0__3 ;
    public final void rule__MultiplicityPart__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2929:1: ( rule__MultiplicityPart__Group_0__2__Impl rule__MultiplicityPart__Group_0__3 )
            // InternalSysMLOC.g:2930:2: rule__MultiplicityPart__Group_0__2__Impl rule__MultiplicityPart__Group_0__3
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicityPart__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__2"


    // $ANTLR start "rule__MultiplicityPart__Group_0__2__Impl"
    // InternalSysMLOC.g:2937:1: rule__MultiplicityPart__Group_0__2__Impl : ( ( rule__MultiplicityPart__Group_0_2__0 )? ) ;
    public final void rule__MultiplicityPart__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2941:1: ( ( ( rule__MultiplicityPart__Group_0_2__0 )? ) )
            // InternalSysMLOC.g:2942:1: ( ( rule__MultiplicityPart__Group_0_2__0 )? )
            {
            // InternalSysMLOC.g:2942:1: ( ( rule__MultiplicityPart__Group_0_2__0 )? )
            // InternalSysMLOC.g:2943:2: ( rule__MultiplicityPart__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getGroup_0_2()); 
            }
            // InternalSysMLOC.g:2944:2: ( rule__MultiplicityPart__Group_0_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSysMLOC.g:2944:3: rule__MultiplicityPart__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__2__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_0__3"
    // InternalSysMLOC.g:2952:1: rule__MultiplicityPart__Group_0__3 : rule__MultiplicityPart__Group_0__3__Impl ;
    public final void rule__MultiplicityPart__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2956:1: ( rule__MultiplicityPart__Group_0__3__Impl )
            // InternalSysMLOC.g:2957:2: rule__MultiplicityPart__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__3"


    // $ANTLR start "rule__MultiplicityPart__Group_0__3__Impl"
    // InternalSysMLOC.g:2963:1: rule__MultiplicityPart__Group_0__3__Impl : ( ']' ) ;
    public final void rule__MultiplicityPart__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2967:1: ( ( ']' ) )
            // InternalSysMLOC.g:2968:1: ( ']' )
            {
            // InternalSysMLOC.g:2968:1: ( ']' )
            // InternalSysMLOC.g:2969:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_0_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0__3__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_0_2__0"
    // InternalSysMLOC.g:2979:1: rule__MultiplicityPart__Group_0_2__0 : rule__MultiplicityPart__Group_0_2__0__Impl rule__MultiplicityPart__Group_0_2__1 ;
    public final void rule__MultiplicityPart__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2983:1: ( rule__MultiplicityPart__Group_0_2__0__Impl rule__MultiplicityPart__Group_0_2__1 )
            // InternalSysMLOC.g:2984:2: rule__MultiplicityPart__Group_0_2__0__Impl rule__MultiplicityPart__Group_0_2__1
            {
            pushFollow(FOLLOW_19);
            rule__MultiplicityPart__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0_2__0"


    // $ANTLR start "rule__MultiplicityPart__Group_0_2__0__Impl"
    // InternalSysMLOC.g:2991:1: rule__MultiplicityPart__Group_0_2__0__Impl : ( '..' ) ;
    public final void rule__MultiplicityPart__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:2995:1: ( ( '..' ) )
            // InternalSysMLOC.g:2996:1: ( '..' )
            {
            // InternalSysMLOC.g:2996:1: ( '..' )
            // InternalSysMLOC.g:2997:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_0_2_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0_2__0__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_0_2__1"
    // InternalSysMLOC.g:3006:1: rule__MultiplicityPart__Group_0_2__1 : rule__MultiplicityPart__Group_0_2__1__Impl ;
    public final void rule__MultiplicityPart__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3010:1: ( rule__MultiplicityPart__Group_0_2__1__Impl )
            // InternalSysMLOC.g:3011:2: rule__MultiplicityPart__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0_2__1"


    // $ANTLR start "rule__MultiplicityPart__Group_0_2__1__Impl"
    // InternalSysMLOC.g:3017:1: rule__MultiplicityPart__Group_0_2__1__Impl : ( ( rule__MultiplicityPart__MultiplicityAssignment_0_2_1 ) ) ;
    public final void rule__MultiplicityPart__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3021:1: ( ( ( rule__MultiplicityPart__MultiplicityAssignment_0_2_1 ) ) )
            // InternalSysMLOC.g:3022:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_0_2_1 ) )
            {
            // InternalSysMLOC.g:3022:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_0_2_1 ) )
            // InternalSysMLOC.g:3023:2: ( rule__MultiplicityPart__MultiplicityAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_0_2_1()); 
            }
            // InternalSysMLOC.g:3024:2: ( rule__MultiplicityPart__MultiplicityAssignment_0_2_1 )
            // InternalSysMLOC.g:3024:3: rule__MultiplicityPart__MultiplicityAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__MultiplicityAssignment_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_0_2__1__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1__0"
    // InternalSysMLOC.g:3033:1: rule__MultiplicityPart__Group_1__0 : rule__MultiplicityPart__Group_1__0__Impl rule__MultiplicityPart__Group_1__1 ;
    public final void rule__MultiplicityPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3037:1: ( rule__MultiplicityPart__Group_1__0__Impl rule__MultiplicityPart__Group_1__1 )
            // InternalSysMLOC.g:3038:2: rule__MultiplicityPart__Group_1__0__Impl rule__MultiplicityPart__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__MultiplicityPart__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1__0"


    // $ANTLR start "rule__MultiplicityPart__Group_1__0__Impl"
    // InternalSysMLOC.g:3045:1: rule__MultiplicityPart__Group_1__0__Impl : ( ( rule__MultiplicityPart__Group_1_0__0 )? ) ;
    public final void rule__MultiplicityPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3049:1: ( ( ( rule__MultiplicityPart__Group_1_0__0 )? ) )
            // InternalSysMLOC.g:3050:1: ( ( rule__MultiplicityPart__Group_1_0__0 )? )
            {
            // InternalSysMLOC.g:3050:1: ( ( rule__MultiplicityPart__Group_1_0__0 )? )
            // InternalSysMLOC.g:3051:2: ( rule__MultiplicityPart__Group_1_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getGroup_1_0()); 
            }
            // InternalSysMLOC.g:3052:2: ( rule__MultiplicityPart__Group_1_0__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSysMLOC.g:3052:3: rule__MultiplicityPart__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1__1"
    // InternalSysMLOC.g:3060:1: rule__MultiplicityPart__Group_1__1 : rule__MultiplicityPart__Group_1__1__Impl ;
    public final void rule__MultiplicityPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3064:1: ( rule__MultiplicityPart__Group_1__1__Impl )
            // InternalSysMLOC.g:3065:2: rule__MultiplicityPart__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1__1"


    // $ANTLR start "rule__MultiplicityPart__Group_1__1__Impl"
    // InternalSysMLOC.g:3071:1: rule__MultiplicityPart__Group_1__1__Impl : ( ( rule__MultiplicityPart__Alternatives_1_1 ) ) ;
    public final void rule__MultiplicityPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3075:1: ( ( ( rule__MultiplicityPart__Alternatives_1_1 ) ) )
            // InternalSysMLOC.g:3076:1: ( ( rule__MultiplicityPart__Alternatives_1_1 ) )
            {
            // InternalSysMLOC.g:3076:1: ( ( rule__MultiplicityPart__Alternatives_1_1 ) )
            // InternalSysMLOC.g:3077:2: ( rule__MultiplicityPart__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getAlternatives_1_1()); 
            }
            // InternalSysMLOC.g:3078:2: ( rule__MultiplicityPart__Alternatives_1_1 )
            // InternalSysMLOC.g:3078:3: rule__MultiplicityPart__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__0"
    // InternalSysMLOC.g:3087:1: rule__MultiplicityPart__Group_1_0__0 : rule__MultiplicityPart__Group_1_0__0__Impl rule__MultiplicityPart__Group_1_0__1 ;
    public final void rule__MultiplicityPart__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3091:1: ( rule__MultiplicityPart__Group_1_0__0__Impl rule__MultiplicityPart__Group_1_0__1 )
            // InternalSysMLOC.g:3092:2: rule__MultiplicityPart__Group_1_0__0__Impl rule__MultiplicityPart__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__MultiplicityPart__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__0"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__0__Impl"
    // InternalSysMLOC.g:3099:1: rule__MultiplicityPart__Group_1_0__0__Impl : ( '[' ) ;
    public final void rule__MultiplicityPart__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3103:1: ( ( '[' ) )
            // InternalSysMLOC.g:3104:1: ( '[' )
            {
            // InternalSysMLOC.g:3104:1: ( '[' )
            // InternalSysMLOC.g:3105:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getLeftSquareBracketKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__1"
    // InternalSysMLOC.g:3114:1: rule__MultiplicityPart__Group_1_0__1 : rule__MultiplicityPart__Group_1_0__1__Impl rule__MultiplicityPart__Group_1_0__2 ;
    public final void rule__MultiplicityPart__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3118:1: ( rule__MultiplicityPart__Group_1_0__1__Impl rule__MultiplicityPart__Group_1_0__2 )
            // InternalSysMLOC.g:3119:2: rule__MultiplicityPart__Group_1_0__1__Impl rule__MultiplicityPart__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicityPart__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__1"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__1__Impl"
    // InternalSysMLOC.g:3126:1: rule__MultiplicityPart__Group_1_0__1__Impl : ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_1 ) ) ;
    public final void rule__MultiplicityPart__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3130:1: ( ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_1 ) ) )
            // InternalSysMLOC.g:3131:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_1 ) )
            {
            // InternalSysMLOC.g:3131:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_1 ) )
            // InternalSysMLOC.g:3132:2: ( rule__MultiplicityPart__MultiplicityAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_1_0_1()); 
            }
            // InternalSysMLOC.g:3133:2: ( rule__MultiplicityPart__MultiplicityAssignment_1_0_1 )
            // InternalSysMLOC.g:3133:3: rule__MultiplicityPart__MultiplicityAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__MultiplicityAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__2"
    // InternalSysMLOC.g:3141:1: rule__MultiplicityPart__Group_1_0__2 : rule__MultiplicityPart__Group_1_0__2__Impl rule__MultiplicityPart__Group_1_0__3 ;
    public final void rule__MultiplicityPart__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3145:1: ( rule__MultiplicityPart__Group_1_0__2__Impl rule__MultiplicityPart__Group_1_0__3 )
            // InternalSysMLOC.g:3146:2: rule__MultiplicityPart__Group_1_0__2__Impl rule__MultiplicityPart__Group_1_0__3
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicityPart__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__2"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__2__Impl"
    // InternalSysMLOC.g:3153:1: rule__MultiplicityPart__Group_1_0__2__Impl : ( ( rule__MultiplicityPart__Group_1_0_2__0 )? ) ;
    public final void rule__MultiplicityPart__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3157:1: ( ( ( rule__MultiplicityPart__Group_1_0_2__0 )? ) )
            // InternalSysMLOC.g:3158:1: ( ( rule__MultiplicityPart__Group_1_0_2__0 )? )
            {
            // InternalSysMLOC.g:3158:1: ( ( rule__MultiplicityPart__Group_1_0_2__0 )? )
            // InternalSysMLOC.g:3159:2: ( rule__MultiplicityPart__Group_1_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getGroup_1_0_2()); 
            }
            // InternalSysMLOC.g:3160:2: ( rule__MultiplicityPart__Group_1_0_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSysMLOC.g:3160:3: rule__MultiplicityPart__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getGroup_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__2__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__3"
    // InternalSysMLOC.g:3168:1: rule__MultiplicityPart__Group_1_0__3 : rule__MultiplicityPart__Group_1_0__3__Impl ;
    public final void rule__MultiplicityPart__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3172:1: ( rule__MultiplicityPart__Group_1_0__3__Impl )
            // InternalSysMLOC.g:3173:2: rule__MultiplicityPart__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__3"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0__3__Impl"
    // InternalSysMLOC.g:3179:1: rule__MultiplicityPart__Group_1_0__3__Impl : ( ']' ) ;
    public final void rule__MultiplicityPart__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3183:1: ( ( ']' ) )
            // InternalSysMLOC.g:3184:1: ( ']' )
            {
            // InternalSysMLOC.g:3184:1: ( ']' )
            // InternalSysMLOC.g:3185:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getRightSquareBracketKeyword_1_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0__3__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0_2__0"
    // InternalSysMLOC.g:3195:1: rule__MultiplicityPart__Group_1_0_2__0 : rule__MultiplicityPart__Group_1_0_2__0__Impl rule__MultiplicityPart__Group_1_0_2__1 ;
    public final void rule__MultiplicityPart__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3199:1: ( rule__MultiplicityPart__Group_1_0_2__0__Impl rule__MultiplicityPart__Group_1_0_2__1 )
            // InternalSysMLOC.g:3200:2: rule__MultiplicityPart__Group_1_0_2__0__Impl rule__MultiplicityPart__Group_1_0_2__1
            {
            pushFollow(FOLLOW_19);
            rule__MultiplicityPart__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0_2__0"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0_2__0__Impl"
    // InternalSysMLOC.g:3207:1: rule__MultiplicityPart__Group_1_0_2__0__Impl : ( '..' ) ;
    public final void rule__MultiplicityPart__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3211:1: ( ( '..' ) )
            // InternalSysMLOC.g:3212:1: ( '..' )
            {
            // InternalSysMLOC.g:3212:1: ( '..' )
            // InternalSysMLOC.g:3213:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_1_0_2_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getFullStopFullStopKeyword_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0_2__1"
    // InternalSysMLOC.g:3222:1: rule__MultiplicityPart__Group_1_0_2__1 : rule__MultiplicityPart__Group_1_0_2__1__Impl ;
    public final void rule__MultiplicityPart__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3226:1: ( rule__MultiplicityPart__Group_1_0_2__1__Impl )
            // InternalSysMLOC.g:3227:2: rule__MultiplicityPart__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0_2__1"


    // $ANTLR start "rule__MultiplicityPart__Group_1_0_2__1__Impl"
    // InternalSysMLOC.g:3233:1: rule__MultiplicityPart__Group_1_0_2__1__Impl : ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1 ) ) ;
    public final void rule__MultiplicityPart__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3237:1: ( ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1 ) ) )
            // InternalSysMLOC.g:3238:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1 ) )
            {
            // InternalSysMLOC.g:3238:1: ( ( rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1 ) )
            // InternalSysMLOC.g:3239:2: ( rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_1_0_2_1()); 
            }
            // InternalSysMLOC.g:3240:2: ( rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1 )
            // InternalSysMLOC.g:3240:3: rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityAssignment_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_0__0"
    // InternalSysMLOC.g:3249:1: rule__MultiplicityPart__Group_1_1_0__0 : rule__MultiplicityPart__Group_1_1_0__0__Impl rule__MultiplicityPart__Group_1_1_0__1 ;
    public final void rule__MultiplicityPart__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3253:1: ( rule__MultiplicityPart__Group_1_1_0__0__Impl rule__MultiplicityPart__Group_1_1_0__1 )
            // InternalSysMLOC.g:3254:2: rule__MultiplicityPart__Group_1_1_0__0__Impl rule__MultiplicityPart__Group_1_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__MultiplicityPart__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_0__0"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_0__0__Impl"
    // InternalSysMLOC.g:3261:1: rule__MultiplicityPart__Group_1_1_0__0__Impl : ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0 ) ) ;
    public final void rule__MultiplicityPart__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3265:1: ( ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0 ) ) )
            // InternalSysMLOC.g:3266:1: ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0 ) )
            {
            // InternalSysMLOC.g:3266:1: ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0 ) )
            // InternalSysMLOC.g:3267:2: ( rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsOrderedAssignment_1_1_0_0()); 
            }
            // InternalSysMLOC.g:3268:2: ( rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0 )
            // InternalSysMLOC.g:3268:3: rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsOrderedAssignment_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_0__1"
    // InternalSysMLOC.g:3276:1: rule__MultiplicityPart__Group_1_1_0__1 : rule__MultiplicityPart__Group_1_1_0__1__Impl ;
    public final void rule__MultiplicityPart__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3280:1: ( rule__MultiplicityPart__Group_1_1_0__1__Impl )
            // InternalSysMLOC.g:3281:2: rule__MultiplicityPart__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_0__1"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_0__1__Impl"
    // InternalSysMLOC.g:3287:1: rule__MultiplicityPart__Group_1_1_0__1__Impl : ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1 )? ) ;
    public final void rule__MultiplicityPart__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3291:1: ( ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1 )? ) )
            // InternalSysMLOC.g:3292:1: ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1 )? )
            {
            // InternalSysMLOC.g:3292:1: ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1 )? )
            // InternalSysMLOC.g:3293:2: ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueAssignment_1_1_0_1()); 
            }
            // InternalSysMLOC.g:3294:2: ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSysMLOC.g:3294:3: rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueAssignment_1_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_1__0"
    // InternalSysMLOC.g:3303:1: rule__MultiplicityPart__Group_1_1_1__0 : rule__MultiplicityPart__Group_1_1_1__0__Impl rule__MultiplicityPart__Group_1_1_1__1 ;
    public final void rule__MultiplicityPart__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3307:1: ( rule__MultiplicityPart__Group_1_1_1__0__Impl rule__MultiplicityPart__Group_1_1_1__1 )
            // InternalSysMLOC.g:3308:2: rule__MultiplicityPart__Group_1_1_1__0__Impl rule__MultiplicityPart__Group_1_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__MultiplicityPart__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_1__0"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_1__0__Impl"
    // InternalSysMLOC.g:3315:1: rule__MultiplicityPart__Group_1_1_1__0__Impl : ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0 ) ) ;
    public final void rule__MultiplicityPart__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3319:1: ( ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0 ) ) )
            // InternalSysMLOC.g:3320:1: ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0 ) )
            {
            // InternalSysMLOC.g:3320:1: ( ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0 ) )
            // InternalSysMLOC.g:3321:2: ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueAssignment_1_1_1_0()); 
            }
            // InternalSysMLOC.g:3322:2: ( rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0 )
            // InternalSysMLOC.g:3322:3: rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueAssignment_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_1__1"
    // InternalSysMLOC.g:3330:1: rule__MultiplicityPart__Group_1_1_1__1 : rule__MultiplicityPart__Group_1_1_1__1__Impl ;
    public final void rule__MultiplicityPart__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3334:1: ( rule__MultiplicityPart__Group_1_1_1__1__Impl )
            // InternalSysMLOC.g:3335:2: rule__MultiplicityPart__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityPart__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_1__1"


    // $ANTLR start "rule__MultiplicityPart__Group_1_1_1__1__Impl"
    // InternalSysMLOC.g:3341:1: rule__MultiplicityPart__Group_1_1_1__1__Impl : ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1 )? ) ;
    public final void rule__MultiplicityPart__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3345:1: ( ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1 )? ) )
            // InternalSysMLOC.g:3346:1: ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1 )? )
            {
            // InternalSysMLOC.g:3346:1: ( ( rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1 )? )
            // InternalSysMLOC.g:3347:2: ( rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsOrderedAssignment_1_1_1_1()); 
            }
            // InternalSysMLOC.g:3348:2: ( rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSysMLOC.g:3348:3: rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsOrderedAssignment_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_0__0"
    // InternalSysMLOC.g:3357:1: rule__FeatureSpecialization__Group_0__0 : rule__FeatureSpecialization__Group_0__0__Impl rule__FeatureSpecialization__Group_0__1 ;
    public final void rule__FeatureSpecialization__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3361:1: ( rule__FeatureSpecialization__Group_0__0__Impl rule__FeatureSpecialization__Group_0__1 )
            // InternalSysMLOC.g:3362:2: rule__FeatureSpecialization__Group_0__0__Impl rule__FeatureSpecialization__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_0__0__Impl"
    // InternalSysMLOC.g:3369:1: rule__FeatureSpecialization__Group_0__0__Impl : ( ( rule__FeatureSpecialization__Alternatives_0_0 ) ) ;
    public final void rule__FeatureSpecialization__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3373:1: ( ( ( rule__FeatureSpecialization__Alternatives_0_0 ) ) )
            // InternalSysMLOC.g:3374:1: ( ( rule__FeatureSpecialization__Alternatives_0_0 ) )
            {
            // InternalSysMLOC.g:3374:1: ( ( rule__FeatureSpecialization__Alternatives_0_0 ) )
            // InternalSysMLOC.g:3375:2: ( rule__FeatureSpecialization__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getAlternatives_0_0()); 
            }
            // InternalSysMLOC.g:3376:2: ( rule__FeatureSpecialization__Alternatives_0_0 )
            // InternalSysMLOC.g:3376:3: rule__FeatureSpecialization__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_0__1"
    // InternalSysMLOC.g:3384:1: rule__FeatureSpecialization__Group_0__1 : rule__FeatureSpecialization__Group_0__1__Impl rule__FeatureSpecialization__Group_0__2 ;
    public final void rule__FeatureSpecialization__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3388:1: ( rule__FeatureSpecialization__Group_0__1__Impl rule__FeatureSpecialization__Group_0__2 )
            // InternalSysMLOC.g:3389:2: rule__FeatureSpecialization__Group_0__1__Impl rule__FeatureSpecialization__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__FeatureSpecialization__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_0__1__Impl"
    // InternalSysMLOC.g:3396:1: rule__FeatureSpecialization__Group_0__1__Impl : ( ( rule__FeatureSpecialization__TypingsAssignment_0_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3400:1: ( ( ( rule__FeatureSpecialization__TypingsAssignment_0_1 ) ) )
            // InternalSysMLOC.g:3401:1: ( ( rule__FeatureSpecialization__TypingsAssignment_0_1 ) )
            {
            // InternalSysMLOC.g:3401:1: ( ( rule__FeatureSpecialization__TypingsAssignment_0_1 ) )
            // InternalSysMLOC.g:3402:2: ( rule__FeatureSpecialization__TypingsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getTypingsAssignment_0_1()); 
            }
            // InternalSysMLOC.g:3403:2: ( rule__FeatureSpecialization__TypingsAssignment_0_1 )
            // InternalSysMLOC.g:3403:3: rule__FeatureSpecialization__TypingsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__TypingsAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getTypingsAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_0__2"
    // InternalSysMLOC.g:3411:1: rule__FeatureSpecialization__Group_0__2 : rule__FeatureSpecialization__Group_0__2__Impl ;
    public final void rule__FeatureSpecialization__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3415:1: ( rule__FeatureSpecialization__Group_0__2__Impl )
            // InternalSysMLOC.g:3416:2: rule__FeatureSpecialization__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0__2"


    // $ANTLR start "rule__FeatureSpecialization__Group_0__2__Impl"
    // InternalSysMLOC.g:3422:1: rule__FeatureSpecialization__Group_0__2__Impl : ( ( rule__FeatureSpecialization__Group_0_2__0 )* ) ;
    public final void rule__FeatureSpecialization__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3426:1: ( ( ( rule__FeatureSpecialization__Group_0_2__0 )* ) )
            // InternalSysMLOC.g:3427:1: ( ( rule__FeatureSpecialization__Group_0_2__0 )* )
            {
            // InternalSysMLOC.g:3427:1: ( ( rule__FeatureSpecialization__Group_0_2__0 )* )
            // InternalSysMLOC.g:3428:2: ( rule__FeatureSpecialization__Group_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getGroup_0_2()); 
            }
            // InternalSysMLOC.g:3429:2: ( rule__FeatureSpecialization__Group_0_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==44) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSysMLOC.g:3429:3: rule__FeatureSpecialization__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FeatureSpecialization__Group_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0__2__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_0_1__0"
    // InternalSysMLOC.g:3438:1: rule__FeatureSpecialization__Group_0_0_1__0 : rule__FeatureSpecialization__Group_0_0_1__0__Impl rule__FeatureSpecialization__Group_0_0_1__1 ;
    public final void rule__FeatureSpecialization__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3442:1: ( rule__FeatureSpecialization__Group_0_0_1__0__Impl rule__FeatureSpecialization__Group_0_0_1__1 )
            // InternalSysMLOC.g:3443:2: rule__FeatureSpecialization__Group_0_0_1__0__Impl rule__FeatureSpecialization__Group_0_0_1__1
            {
            pushFollow(FOLLOW_25);
            rule__FeatureSpecialization__Group_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_0_1__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_0_1__0__Impl"
    // InternalSysMLOC.g:3450:1: rule__FeatureSpecialization__Group_0_0_1__0__Impl : ( 'defined' ) ;
    public final void rule__FeatureSpecialization__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3454:1: ( ( 'defined' ) )
            // InternalSysMLOC.g:3455:1: ( 'defined' )
            {
            // InternalSysMLOC.g:3455:1: ( 'defined' )
            // InternalSysMLOC.g:3456:2: 'defined'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getDefinedKeyword_0_0_1_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getDefinedKeyword_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_0_1__1"
    // InternalSysMLOC.g:3465:1: rule__FeatureSpecialization__Group_0_0_1__1 : rule__FeatureSpecialization__Group_0_0_1__1__Impl ;
    public final void rule__FeatureSpecialization__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3469:1: ( rule__FeatureSpecialization__Group_0_0_1__1__Impl )
            // InternalSysMLOC.g:3470:2: rule__FeatureSpecialization__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_0_1__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_0_1__1__Impl"
    // InternalSysMLOC.g:3476:1: rule__FeatureSpecialization__Group_0_0_1__1__Impl : ( 'by' ) ;
    public final void rule__FeatureSpecialization__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3480:1: ( ( 'by' ) )
            // InternalSysMLOC.g:3481:1: ( 'by' )
            {
            // InternalSysMLOC.g:3481:1: ( 'by' )
            // InternalSysMLOC.g:3482:2: 'by'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getByKeyword_0_0_1_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getByKeyword_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_2__0"
    // InternalSysMLOC.g:3492:1: rule__FeatureSpecialization__Group_0_2__0 : rule__FeatureSpecialization__Group_0_2__0__Impl rule__FeatureSpecialization__Group_0_2__1 ;
    public final void rule__FeatureSpecialization__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3496:1: ( rule__FeatureSpecialization__Group_0_2__0__Impl rule__FeatureSpecialization__Group_0_2__1 )
            // InternalSysMLOC.g:3497:2: rule__FeatureSpecialization__Group_0_2__0__Impl rule__FeatureSpecialization__Group_0_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_2__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_2__0__Impl"
    // InternalSysMLOC.g:3504:1: rule__FeatureSpecialization__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureSpecialization__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3508:1: ( ( ',' ) )
            // InternalSysMLOC.g:3509:1: ( ',' )
            {
            // InternalSysMLOC.g:3509:1: ( ',' )
            // InternalSysMLOC.g:3510:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_0_2_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_2__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_2__1"
    // InternalSysMLOC.g:3519:1: rule__FeatureSpecialization__Group_0_2__1 : rule__FeatureSpecialization__Group_0_2__1__Impl ;
    public final void rule__FeatureSpecialization__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3523:1: ( rule__FeatureSpecialization__Group_0_2__1__Impl )
            // InternalSysMLOC.g:3524:2: rule__FeatureSpecialization__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_2__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_0_2__1__Impl"
    // InternalSysMLOC.g:3530:1: rule__FeatureSpecialization__Group_0_2__1__Impl : ( ( rule__FeatureSpecialization__TypingsAssignment_0_2_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3534:1: ( ( ( rule__FeatureSpecialization__TypingsAssignment_0_2_1 ) ) )
            // InternalSysMLOC.g:3535:1: ( ( rule__FeatureSpecialization__TypingsAssignment_0_2_1 ) )
            {
            // InternalSysMLOC.g:3535:1: ( ( rule__FeatureSpecialization__TypingsAssignment_0_2_1 ) )
            // InternalSysMLOC.g:3536:2: ( rule__FeatureSpecialization__TypingsAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getTypingsAssignment_0_2_1()); 
            }
            // InternalSysMLOC.g:3537:2: ( rule__FeatureSpecialization__TypingsAssignment_0_2_1 )
            // InternalSysMLOC.g:3537:3: rule__FeatureSpecialization__TypingsAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__TypingsAssignment_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getTypingsAssignment_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_0_2__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_1__0"
    // InternalSysMLOC.g:3546:1: rule__FeatureSpecialization__Group_1__0 : rule__FeatureSpecialization__Group_1__0__Impl rule__FeatureSpecialization__Group_1__1 ;
    public final void rule__FeatureSpecialization__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3550:1: ( rule__FeatureSpecialization__Group_1__0__Impl rule__FeatureSpecialization__Group_1__1 )
            // InternalSysMLOC.g:3551:2: rule__FeatureSpecialization__Group_1__0__Impl rule__FeatureSpecialization__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_1__0__Impl"
    // InternalSysMLOC.g:3558:1: rule__FeatureSpecialization__Group_1__0__Impl : ( ( rule__FeatureSpecialization__Alternatives_1_0 ) ) ;
    public final void rule__FeatureSpecialization__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3562:1: ( ( ( rule__FeatureSpecialization__Alternatives_1_0 ) ) )
            // InternalSysMLOC.g:3563:1: ( ( rule__FeatureSpecialization__Alternatives_1_0 ) )
            {
            // InternalSysMLOC.g:3563:1: ( ( rule__FeatureSpecialization__Alternatives_1_0 ) )
            // InternalSysMLOC.g:3564:2: ( rule__FeatureSpecialization__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getAlternatives_1_0()); 
            }
            // InternalSysMLOC.g:3565:2: ( rule__FeatureSpecialization__Alternatives_1_0 )
            // InternalSysMLOC.g:3565:3: rule__FeatureSpecialization__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_1__1"
    // InternalSysMLOC.g:3573:1: rule__FeatureSpecialization__Group_1__1 : rule__FeatureSpecialization__Group_1__1__Impl rule__FeatureSpecialization__Group_1__2 ;
    public final void rule__FeatureSpecialization__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3577:1: ( rule__FeatureSpecialization__Group_1__1__Impl rule__FeatureSpecialization__Group_1__2 )
            // InternalSysMLOC.g:3578:2: rule__FeatureSpecialization__Group_1__1__Impl rule__FeatureSpecialization__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__FeatureSpecialization__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_1__1__Impl"
    // InternalSysMLOC.g:3585:1: rule__FeatureSpecialization__Group_1__1__Impl : ( ( rule__FeatureSpecialization__SubsettingAssignment_1_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3589:1: ( ( ( rule__FeatureSpecialization__SubsettingAssignment_1_1 ) ) )
            // InternalSysMLOC.g:3590:1: ( ( rule__FeatureSpecialization__SubsettingAssignment_1_1 ) )
            {
            // InternalSysMLOC.g:3590:1: ( ( rule__FeatureSpecialization__SubsettingAssignment_1_1 ) )
            // InternalSysMLOC.g:3591:2: ( rule__FeatureSpecialization__SubsettingAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getSubsettingAssignment_1_1()); 
            }
            // InternalSysMLOC.g:3592:2: ( rule__FeatureSpecialization__SubsettingAssignment_1_1 )
            // InternalSysMLOC.g:3592:3: rule__FeatureSpecialization__SubsettingAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__SubsettingAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getSubsettingAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_1__2"
    // InternalSysMLOC.g:3600:1: rule__FeatureSpecialization__Group_1__2 : rule__FeatureSpecialization__Group_1__2__Impl ;
    public final void rule__FeatureSpecialization__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3604:1: ( rule__FeatureSpecialization__Group_1__2__Impl )
            // InternalSysMLOC.g:3605:2: rule__FeatureSpecialization__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1__2"


    // $ANTLR start "rule__FeatureSpecialization__Group_1__2__Impl"
    // InternalSysMLOC.g:3611:1: rule__FeatureSpecialization__Group_1__2__Impl : ( ( rule__FeatureSpecialization__Group_1_2__0 )* ) ;
    public final void rule__FeatureSpecialization__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3615:1: ( ( ( rule__FeatureSpecialization__Group_1_2__0 )* ) )
            // InternalSysMLOC.g:3616:1: ( ( rule__FeatureSpecialization__Group_1_2__0 )* )
            {
            // InternalSysMLOC.g:3616:1: ( ( rule__FeatureSpecialization__Group_1_2__0 )* )
            // InternalSysMLOC.g:3617:2: ( rule__FeatureSpecialization__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getGroup_1_2()); 
            }
            // InternalSysMLOC.g:3618:2: ( rule__FeatureSpecialization__Group_1_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==44) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSysMLOC.g:3618:3: rule__FeatureSpecialization__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FeatureSpecialization__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1__2__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_1_2__0"
    // InternalSysMLOC.g:3627:1: rule__FeatureSpecialization__Group_1_2__0 : rule__FeatureSpecialization__Group_1_2__0__Impl rule__FeatureSpecialization__Group_1_2__1 ;
    public final void rule__FeatureSpecialization__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3631:1: ( rule__FeatureSpecialization__Group_1_2__0__Impl rule__FeatureSpecialization__Group_1_2__1 )
            // InternalSysMLOC.g:3632:2: rule__FeatureSpecialization__Group_1_2__0__Impl rule__FeatureSpecialization__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1_2__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_1_2__0__Impl"
    // InternalSysMLOC.g:3639:1: rule__FeatureSpecialization__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureSpecialization__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3643:1: ( ( ',' ) )
            // InternalSysMLOC.g:3644:1: ( ',' )
            {
            // InternalSysMLOC.g:3644:1: ( ',' )
            // InternalSysMLOC.g:3645:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1_2__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_1_2__1"
    // InternalSysMLOC.g:3654:1: rule__FeatureSpecialization__Group_1_2__1 : rule__FeatureSpecialization__Group_1_2__1__Impl ;
    public final void rule__FeatureSpecialization__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3658:1: ( rule__FeatureSpecialization__Group_1_2__1__Impl )
            // InternalSysMLOC.g:3659:2: rule__FeatureSpecialization__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1_2__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_1_2__1__Impl"
    // InternalSysMLOC.g:3665:1: rule__FeatureSpecialization__Group_1_2__1__Impl : ( ( rule__FeatureSpecialization__SubsettingAssignment_1_2_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3669:1: ( ( ( rule__FeatureSpecialization__SubsettingAssignment_1_2_1 ) ) )
            // InternalSysMLOC.g:3670:1: ( ( rule__FeatureSpecialization__SubsettingAssignment_1_2_1 ) )
            {
            // InternalSysMLOC.g:3670:1: ( ( rule__FeatureSpecialization__SubsettingAssignment_1_2_1 ) )
            // InternalSysMLOC.g:3671:2: ( rule__FeatureSpecialization__SubsettingAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getSubsettingAssignment_1_2_1()); 
            }
            // InternalSysMLOC.g:3672:2: ( rule__FeatureSpecialization__SubsettingAssignment_1_2_1 )
            // InternalSysMLOC.g:3672:3: rule__FeatureSpecialization__SubsettingAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__SubsettingAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getSubsettingAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_1_2__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_2__0"
    // InternalSysMLOC.g:3681:1: rule__FeatureSpecialization__Group_2__0 : rule__FeatureSpecialization__Group_2__0__Impl rule__FeatureSpecialization__Group_2__1 ;
    public final void rule__FeatureSpecialization__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3685:1: ( rule__FeatureSpecialization__Group_2__0__Impl rule__FeatureSpecialization__Group_2__1 )
            // InternalSysMLOC.g:3686:2: rule__FeatureSpecialization__Group_2__0__Impl rule__FeatureSpecialization__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_2__0__Impl"
    // InternalSysMLOC.g:3693:1: rule__FeatureSpecialization__Group_2__0__Impl : ( ( rule__FeatureSpecialization__Alternatives_2_0 ) ) ;
    public final void rule__FeatureSpecialization__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3697:1: ( ( ( rule__FeatureSpecialization__Alternatives_2_0 ) ) )
            // InternalSysMLOC.g:3698:1: ( ( rule__FeatureSpecialization__Alternatives_2_0 ) )
            {
            // InternalSysMLOC.g:3698:1: ( ( rule__FeatureSpecialization__Alternatives_2_0 ) )
            // InternalSysMLOC.g:3699:2: ( rule__FeatureSpecialization__Alternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getAlternatives_2_0()); 
            }
            // InternalSysMLOC.g:3700:2: ( rule__FeatureSpecialization__Alternatives_2_0 )
            // InternalSysMLOC.g:3700:3: rule__FeatureSpecialization__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Alternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_2__1"
    // InternalSysMLOC.g:3708:1: rule__FeatureSpecialization__Group_2__1 : rule__FeatureSpecialization__Group_2__1__Impl rule__FeatureSpecialization__Group_2__2 ;
    public final void rule__FeatureSpecialization__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3712:1: ( rule__FeatureSpecialization__Group_2__1__Impl rule__FeatureSpecialization__Group_2__2 )
            // InternalSysMLOC.g:3713:2: rule__FeatureSpecialization__Group_2__1__Impl rule__FeatureSpecialization__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__FeatureSpecialization__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_2__1__Impl"
    // InternalSysMLOC.g:3720:1: rule__FeatureSpecialization__Group_2__1__Impl : ( ( rule__FeatureSpecialization__ReferencesAssignment_2_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3724:1: ( ( ( rule__FeatureSpecialization__ReferencesAssignment_2_1 ) ) )
            // InternalSysMLOC.g:3725:1: ( ( rule__FeatureSpecialization__ReferencesAssignment_2_1 ) )
            {
            // InternalSysMLOC.g:3725:1: ( ( rule__FeatureSpecialization__ReferencesAssignment_2_1 ) )
            // InternalSysMLOC.g:3726:2: ( rule__FeatureSpecialization__ReferencesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getReferencesAssignment_2_1()); 
            }
            // InternalSysMLOC.g:3727:2: ( rule__FeatureSpecialization__ReferencesAssignment_2_1 )
            // InternalSysMLOC.g:3727:3: rule__FeatureSpecialization__ReferencesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__ReferencesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getReferencesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_2__2"
    // InternalSysMLOC.g:3735:1: rule__FeatureSpecialization__Group_2__2 : rule__FeatureSpecialization__Group_2__2__Impl ;
    public final void rule__FeatureSpecialization__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3739:1: ( rule__FeatureSpecialization__Group_2__2__Impl )
            // InternalSysMLOC.g:3740:2: rule__FeatureSpecialization__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2__2"


    // $ANTLR start "rule__FeatureSpecialization__Group_2__2__Impl"
    // InternalSysMLOC.g:3746:1: rule__FeatureSpecialization__Group_2__2__Impl : ( ( rule__FeatureSpecialization__Group_2_2__0 )* ) ;
    public final void rule__FeatureSpecialization__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3750:1: ( ( ( rule__FeatureSpecialization__Group_2_2__0 )* ) )
            // InternalSysMLOC.g:3751:1: ( ( rule__FeatureSpecialization__Group_2_2__0 )* )
            {
            // InternalSysMLOC.g:3751:1: ( ( rule__FeatureSpecialization__Group_2_2__0 )* )
            // InternalSysMLOC.g:3752:2: ( rule__FeatureSpecialization__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getGroup_2_2()); 
            }
            // InternalSysMLOC.g:3753:2: ( rule__FeatureSpecialization__Group_2_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==44) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSysMLOC.g:3753:3: rule__FeatureSpecialization__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FeatureSpecialization__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2__2__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_2_2__0"
    // InternalSysMLOC.g:3762:1: rule__FeatureSpecialization__Group_2_2__0 : rule__FeatureSpecialization__Group_2_2__0__Impl rule__FeatureSpecialization__Group_2_2__1 ;
    public final void rule__FeatureSpecialization__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3766:1: ( rule__FeatureSpecialization__Group_2_2__0__Impl rule__FeatureSpecialization__Group_2_2__1 )
            // InternalSysMLOC.g:3767:2: rule__FeatureSpecialization__Group_2_2__0__Impl rule__FeatureSpecialization__Group_2_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2_2__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_2_2__0__Impl"
    // InternalSysMLOC.g:3774:1: rule__FeatureSpecialization__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureSpecialization__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3778:1: ( ( ',' ) )
            // InternalSysMLOC.g:3779:1: ( ',' )
            {
            // InternalSysMLOC.g:3779:1: ( ',' )
            // InternalSysMLOC.g:3780:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2_2__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_2_2__1"
    // InternalSysMLOC.g:3789:1: rule__FeatureSpecialization__Group_2_2__1 : rule__FeatureSpecialization__Group_2_2__1__Impl ;
    public final void rule__FeatureSpecialization__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3793:1: ( rule__FeatureSpecialization__Group_2_2__1__Impl )
            // InternalSysMLOC.g:3794:2: rule__FeatureSpecialization__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2_2__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_2_2__1__Impl"
    // InternalSysMLOC.g:3800:1: rule__FeatureSpecialization__Group_2_2__1__Impl : ( ( rule__FeatureSpecialization__ReferencesAssignment_2_2_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3804:1: ( ( ( rule__FeatureSpecialization__ReferencesAssignment_2_2_1 ) ) )
            // InternalSysMLOC.g:3805:1: ( ( rule__FeatureSpecialization__ReferencesAssignment_2_2_1 ) )
            {
            // InternalSysMLOC.g:3805:1: ( ( rule__FeatureSpecialization__ReferencesAssignment_2_2_1 ) )
            // InternalSysMLOC.g:3806:2: ( rule__FeatureSpecialization__ReferencesAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getReferencesAssignment_2_2_1()); 
            }
            // InternalSysMLOC.g:3807:2: ( rule__FeatureSpecialization__ReferencesAssignment_2_2_1 )
            // InternalSysMLOC.g:3807:3: rule__FeatureSpecialization__ReferencesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__ReferencesAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getReferencesAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_2_2__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_3__0"
    // InternalSysMLOC.g:3816:1: rule__FeatureSpecialization__Group_3__0 : rule__FeatureSpecialization__Group_3__0__Impl rule__FeatureSpecialization__Group_3__1 ;
    public final void rule__FeatureSpecialization__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3820:1: ( rule__FeatureSpecialization__Group_3__0__Impl rule__FeatureSpecialization__Group_3__1 )
            // InternalSysMLOC.g:3821:2: rule__FeatureSpecialization__Group_3__0__Impl rule__FeatureSpecialization__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_3__0__Impl"
    // InternalSysMLOC.g:3828:1: rule__FeatureSpecialization__Group_3__0__Impl : ( ( rule__FeatureSpecialization__Alternatives_3_0 ) ) ;
    public final void rule__FeatureSpecialization__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3832:1: ( ( ( rule__FeatureSpecialization__Alternatives_3_0 ) ) )
            // InternalSysMLOC.g:3833:1: ( ( rule__FeatureSpecialization__Alternatives_3_0 ) )
            {
            // InternalSysMLOC.g:3833:1: ( ( rule__FeatureSpecialization__Alternatives_3_0 ) )
            // InternalSysMLOC.g:3834:2: ( rule__FeatureSpecialization__Alternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getAlternatives_3_0()); 
            }
            // InternalSysMLOC.g:3835:2: ( rule__FeatureSpecialization__Alternatives_3_0 )
            // InternalSysMLOC.g:3835:3: rule__FeatureSpecialization__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Alternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getAlternatives_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_3__1"
    // InternalSysMLOC.g:3843:1: rule__FeatureSpecialization__Group_3__1 : rule__FeatureSpecialization__Group_3__1__Impl rule__FeatureSpecialization__Group_3__2 ;
    public final void rule__FeatureSpecialization__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3847:1: ( rule__FeatureSpecialization__Group_3__1__Impl rule__FeatureSpecialization__Group_3__2 )
            // InternalSysMLOC.g:3848:2: rule__FeatureSpecialization__Group_3__1__Impl rule__FeatureSpecialization__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__FeatureSpecialization__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_3__1__Impl"
    // InternalSysMLOC.g:3855:1: rule__FeatureSpecialization__Group_3__1__Impl : ( ( rule__FeatureSpecialization__CrossesAssignment_3_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3859:1: ( ( ( rule__FeatureSpecialization__CrossesAssignment_3_1 ) ) )
            // InternalSysMLOC.g:3860:1: ( ( rule__FeatureSpecialization__CrossesAssignment_3_1 ) )
            {
            // InternalSysMLOC.g:3860:1: ( ( rule__FeatureSpecialization__CrossesAssignment_3_1 ) )
            // InternalSysMLOC.g:3861:2: ( rule__FeatureSpecialization__CrossesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCrossesAssignment_3_1()); 
            }
            // InternalSysMLOC.g:3862:2: ( rule__FeatureSpecialization__CrossesAssignment_3_1 )
            // InternalSysMLOC.g:3862:3: rule__FeatureSpecialization__CrossesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__CrossesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCrossesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_3__2"
    // InternalSysMLOC.g:3870:1: rule__FeatureSpecialization__Group_3__2 : rule__FeatureSpecialization__Group_3__2__Impl ;
    public final void rule__FeatureSpecialization__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3874:1: ( rule__FeatureSpecialization__Group_3__2__Impl )
            // InternalSysMLOC.g:3875:2: rule__FeatureSpecialization__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3__2"


    // $ANTLR start "rule__FeatureSpecialization__Group_3__2__Impl"
    // InternalSysMLOC.g:3881:1: rule__FeatureSpecialization__Group_3__2__Impl : ( ( rule__FeatureSpecialization__Group_3_2__0 )* ) ;
    public final void rule__FeatureSpecialization__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3885:1: ( ( ( rule__FeatureSpecialization__Group_3_2__0 )* ) )
            // InternalSysMLOC.g:3886:1: ( ( rule__FeatureSpecialization__Group_3_2__0 )* )
            {
            // InternalSysMLOC.g:3886:1: ( ( rule__FeatureSpecialization__Group_3_2__0 )* )
            // InternalSysMLOC.g:3887:2: ( rule__FeatureSpecialization__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getGroup_3_2()); 
            }
            // InternalSysMLOC.g:3888:2: ( rule__FeatureSpecialization__Group_3_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==44) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSysMLOC.g:3888:3: rule__FeatureSpecialization__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FeatureSpecialization__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3__2__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_3_2__0"
    // InternalSysMLOC.g:3897:1: rule__FeatureSpecialization__Group_3_2__0 : rule__FeatureSpecialization__Group_3_2__0__Impl rule__FeatureSpecialization__Group_3_2__1 ;
    public final void rule__FeatureSpecialization__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3901:1: ( rule__FeatureSpecialization__Group_3_2__0__Impl rule__FeatureSpecialization__Group_3_2__1 )
            // InternalSysMLOC.g:3902:2: rule__FeatureSpecialization__Group_3_2__0__Impl rule__FeatureSpecialization__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3_2__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_3_2__0__Impl"
    // InternalSysMLOC.g:3909:1: rule__FeatureSpecialization__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureSpecialization__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3913:1: ( ( ',' ) )
            // InternalSysMLOC.g:3914:1: ( ',' )
            {
            // InternalSysMLOC.g:3914:1: ( ',' )
            // InternalSysMLOC.g:3915:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3_2__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_3_2__1"
    // InternalSysMLOC.g:3924:1: rule__FeatureSpecialization__Group_3_2__1 : rule__FeatureSpecialization__Group_3_2__1__Impl ;
    public final void rule__FeatureSpecialization__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3928:1: ( rule__FeatureSpecialization__Group_3_2__1__Impl )
            // InternalSysMLOC.g:3929:2: rule__FeatureSpecialization__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3_2__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_3_2__1__Impl"
    // InternalSysMLOC.g:3935:1: rule__FeatureSpecialization__Group_3_2__1__Impl : ( ( rule__FeatureSpecialization__CrossesAssignment_3_2_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3939:1: ( ( ( rule__FeatureSpecialization__CrossesAssignment_3_2_1 ) ) )
            // InternalSysMLOC.g:3940:1: ( ( rule__FeatureSpecialization__CrossesAssignment_3_2_1 ) )
            {
            // InternalSysMLOC.g:3940:1: ( ( rule__FeatureSpecialization__CrossesAssignment_3_2_1 ) )
            // InternalSysMLOC.g:3941:2: ( rule__FeatureSpecialization__CrossesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCrossesAssignment_3_2_1()); 
            }
            // InternalSysMLOC.g:3942:2: ( rule__FeatureSpecialization__CrossesAssignment_3_2_1 )
            // InternalSysMLOC.g:3942:3: rule__FeatureSpecialization__CrossesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__CrossesAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCrossesAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_3_2__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_4__0"
    // InternalSysMLOC.g:3951:1: rule__FeatureSpecialization__Group_4__0 : rule__FeatureSpecialization__Group_4__0__Impl rule__FeatureSpecialization__Group_4__1 ;
    public final void rule__FeatureSpecialization__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3955:1: ( rule__FeatureSpecialization__Group_4__0__Impl rule__FeatureSpecialization__Group_4__1 )
            // InternalSysMLOC.g:3956:2: rule__FeatureSpecialization__Group_4__0__Impl rule__FeatureSpecialization__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_4__0__Impl"
    // InternalSysMLOC.g:3963:1: rule__FeatureSpecialization__Group_4__0__Impl : ( ( rule__FeatureSpecialization__Alternatives_4_0 ) ) ;
    public final void rule__FeatureSpecialization__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3967:1: ( ( ( rule__FeatureSpecialization__Alternatives_4_0 ) ) )
            // InternalSysMLOC.g:3968:1: ( ( rule__FeatureSpecialization__Alternatives_4_0 ) )
            {
            // InternalSysMLOC.g:3968:1: ( ( rule__FeatureSpecialization__Alternatives_4_0 ) )
            // InternalSysMLOC.g:3969:2: ( rule__FeatureSpecialization__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getAlternatives_4_0()); 
            }
            // InternalSysMLOC.g:3970:2: ( rule__FeatureSpecialization__Alternatives_4_0 )
            // InternalSysMLOC.g:3970:3: rule__FeatureSpecialization__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Alternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_4__1"
    // InternalSysMLOC.g:3978:1: rule__FeatureSpecialization__Group_4__1 : rule__FeatureSpecialization__Group_4__1__Impl rule__FeatureSpecialization__Group_4__2 ;
    public final void rule__FeatureSpecialization__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3982:1: ( rule__FeatureSpecialization__Group_4__1__Impl rule__FeatureSpecialization__Group_4__2 )
            // InternalSysMLOC.g:3983:2: rule__FeatureSpecialization__Group_4__1__Impl rule__FeatureSpecialization__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__FeatureSpecialization__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_4__1__Impl"
    // InternalSysMLOC.g:3990:1: rule__FeatureSpecialization__Group_4__1__Impl : ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:3994:1: ( ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_1 ) ) )
            // InternalSysMLOC.g:3995:1: ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_1 ) )
            {
            // InternalSysMLOC.g:3995:1: ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_1 ) )
            // InternalSysMLOC.g:3996:2: ( rule__FeatureSpecialization__RedefinitionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsAssignment_4_1()); 
            }
            // InternalSysMLOC.g:3997:2: ( rule__FeatureSpecialization__RedefinitionsAssignment_4_1 )
            // InternalSysMLOC.g:3997:3: rule__FeatureSpecialization__RedefinitionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__RedefinitionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4__1__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_4__2"
    // InternalSysMLOC.g:4005:1: rule__FeatureSpecialization__Group_4__2 : rule__FeatureSpecialization__Group_4__2__Impl ;
    public final void rule__FeatureSpecialization__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4009:1: ( rule__FeatureSpecialization__Group_4__2__Impl )
            // InternalSysMLOC.g:4010:2: rule__FeatureSpecialization__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4__2"


    // $ANTLR start "rule__FeatureSpecialization__Group_4__2__Impl"
    // InternalSysMLOC.g:4016:1: rule__FeatureSpecialization__Group_4__2__Impl : ( ( rule__FeatureSpecialization__Group_4_2__0 )* ) ;
    public final void rule__FeatureSpecialization__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4020:1: ( ( ( rule__FeatureSpecialization__Group_4_2__0 )* ) )
            // InternalSysMLOC.g:4021:1: ( ( rule__FeatureSpecialization__Group_4_2__0 )* )
            {
            // InternalSysMLOC.g:4021:1: ( ( rule__FeatureSpecialization__Group_4_2__0 )* )
            // InternalSysMLOC.g:4022:2: ( rule__FeatureSpecialization__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getGroup_4_2()); 
            }
            // InternalSysMLOC.g:4023:2: ( rule__FeatureSpecialization__Group_4_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==44) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSysMLOC.g:4023:3: rule__FeatureSpecialization__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FeatureSpecialization__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4__2__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_4_2__0"
    // InternalSysMLOC.g:4032:1: rule__FeatureSpecialization__Group_4_2__0 : rule__FeatureSpecialization__Group_4_2__0__Impl rule__FeatureSpecialization__Group_4_2__1 ;
    public final void rule__FeatureSpecialization__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4036:1: ( rule__FeatureSpecialization__Group_4_2__0__Impl rule__FeatureSpecialization__Group_4_2__1 )
            // InternalSysMLOC.g:4037:2: rule__FeatureSpecialization__Group_4_2__0__Impl rule__FeatureSpecialization__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureSpecialization__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4_2__0"


    // $ANTLR start "rule__FeatureSpecialization__Group_4_2__0__Impl"
    // InternalSysMLOC.g:4044:1: rule__FeatureSpecialization__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureSpecialization__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4048:1: ( ( ',' ) )
            // InternalSysMLOC.g:4049:1: ( ',' )
            {
            // InternalSysMLOC.g:4049:1: ( ',' )
            // InternalSysMLOC.g:4050:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4_2__0__Impl"


    // $ANTLR start "rule__FeatureSpecialization__Group_4_2__1"
    // InternalSysMLOC.g:4059:1: rule__FeatureSpecialization__Group_4_2__1 : rule__FeatureSpecialization__Group_4_2__1__Impl ;
    public final void rule__FeatureSpecialization__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4063:1: ( rule__FeatureSpecialization__Group_4_2__1__Impl )
            // InternalSysMLOC.g:4064:2: rule__FeatureSpecialization__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4_2__1"


    // $ANTLR start "rule__FeatureSpecialization__Group_4_2__1__Impl"
    // InternalSysMLOC.g:4070:1: rule__FeatureSpecialization__Group_4_2__1__Impl : ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1 ) ) ;
    public final void rule__FeatureSpecialization__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4074:1: ( ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1 ) ) )
            // InternalSysMLOC.g:4075:1: ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1 ) )
            {
            // InternalSysMLOC.g:4075:1: ( ( rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1 ) )
            // InternalSysMLOC.g:4076:2: ( rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsAssignment_4_2_1()); 
            }
            // InternalSysMLOC.g:4077:2: ( rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1 )
            // InternalSysMLOC.g:4077:3: rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__Group_4_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSysMLOC.g:4086:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4090:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSysMLOC.g:4091:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSysMLOC.g:4098:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4102:1: ( ( ruleName ) )
            // InternalSysMLOC.g:4103:1: ( ruleName )
            {
            // InternalSysMLOC.g:4103:1: ( ruleName )
            // InternalSysMLOC.g:4104:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSysMLOC.g:4113:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4117:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSysMLOC.g:4118:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSysMLOC.g:4124:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4128:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSysMLOC.g:4129:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSysMLOC.g:4129:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSysMLOC.g:4130:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalSysMLOC.g:4131:2: ( rule__QualifiedName__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==45) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSysMLOC.g:4131:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSysMLOC.g:4140:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4144:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSysMLOC.g:4145:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSysMLOC.g:4152:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4156:1: ( ( '::' ) )
            // InternalSysMLOC.g:4157:1: ( '::' )
            {
            // InternalSysMLOC.g:4157:1: ( '::' )
            // InternalSysMLOC.g:4158:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSysMLOC.g:4167:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4171:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSysMLOC.g:4172:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSysMLOC.g:4178:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4182:1: ( ( ruleName ) )
            // InternalSysMLOC.g:4183:1: ( ruleName )
            {
            // InternalSysMLOC.g:4183:1: ( ruleName )
            // InternalSysMLOC.g:4184:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__FeatureChainName__Group__0"
    // InternalSysMLOC.g:4194:1: rule__FeatureChainName__Group__0 : rule__FeatureChainName__Group__0__Impl rule__FeatureChainName__Group__1 ;
    public final void rule__FeatureChainName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4198:1: ( rule__FeatureChainName__Group__0__Impl rule__FeatureChainName__Group__1 )
            // InternalSysMLOC.g:4199:2: rule__FeatureChainName__Group__0__Impl rule__FeatureChainName__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__FeatureChainName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureChainName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group__0"


    // $ANTLR start "rule__FeatureChainName__Group__0__Impl"
    // InternalSysMLOC.g:4206:1: rule__FeatureChainName__Group__0__Impl : ( ruleName ) ;
    public final void rule__FeatureChainName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4210:1: ( ( ruleName ) )
            // InternalSysMLOC.g:4211:1: ( ruleName )
            {
            // InternalSysMLOC.g:4211:1: ( ruleName )
            // InternalSysMLOC.g:4212:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group__0__Impl"


    // $ANTLR start "rule__FeatureChainName__Group__1"
    // InternalSysMLOC.g:4221:1: rule__FeatureChainName__Group__1 : rule__FeatureChainName__Group__1__Impl ;
    public final void rule__FeatureChainName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4225:1: ( rule__FeatureChainName__Group__1__Impl )
            // InternalSysMLOC.g:4226:2: rule__FeatureChainName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChainName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group__1"


    // $ANTLR start "rule__FeatureChainName__Group__1__Impl"
    // InternalSysMLOC.g:4232:1: rule__FeatureChainName__Group__1__Impl : ( ( rule__FeatureChainName__Group_1__0 )* ) ;
    public final void rule__FeatureChainName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4236:1: ( ( ( rule__FeatureChainName__Group_1__0 )* ) )
            // InternalSysMLOC.g:4237:1: ( ( rule__FeatureChainName__Group_1__0 )* )
            {
            // InternalSysMLOC.g:4237:1: ( ( rule__FeatureChainName__Group_1__0 )* )
            // InternalSysMLOC.g:4238:2: ( rule__FeatureChainName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureChainNameAccess().getGroup_1()); 
            }
            // InternalSysMLOC.g:4239:2: ( rule__FeatureChainName__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==46) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSysMLOC.g:4239:3: rule__FeatureChainName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__FeatureChainName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureChainNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group__1__Impl"


    // $ANTLR start "rule__FeatureChainName__Group_1__0"
    // InternalSysMLOC.g:4248:1: rule__FeatureChainName__Group_1__0 : rule__FeatureChainName__Group_1__0__Impl rule__FeatureChainName__Group_1__1 ;
    public final void rule__FeatureChainName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4252:1: ( rule__FeatureChainName__Group_1__0__Impl rule__FeatureChainName__Group_1__1 )
            // InternalSysMLOC.g:4253:2: rule__FeatureChainName__Group_1__0__Impl rule__FeatureChainName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FeatureChainName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureChainName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group_1__0"


    // $ANTLR start "rule__FeatureChainName__Group_1__0__Impl"
    // InternalSysMLOC.g:4260:1: rule__FeatureChainName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FeatureChainName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4264:1: ( ( '.' ) )
            // InternalSysMLOC.g:4265:1: ( '.' )
            {
            // InternalSysMLOC.g:4265:1: ( '.' )
            // InternalSysMLOC.g:4266:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureChainNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureChainNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureChainName__Group_1__1"
    // InternalSysMLOC.g:4275:1: rule__FeatureChainName__Group_1__1 : rule__FeatureChainName__Group_1__1__Impl ;
    public final void rule__FeatureChainName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4279:1: ( rule__FeatureChainName__Group_1__1__Impl )
            // InternalSysMLOC.g:4280:2: rule__FeatureChainName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureChainName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group_1__1"


    // $ANTLR start "rule__FeatureChainName__Group_1__1__Impl"
    // InternalSysMLOC.g:4286:1: rule__FeatureChainName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__FeatureChainName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4290:1: ( ( ruleName ) )
            // InternalSysMLOC.g:4291:1: ( ruleName )
            {
            // InternalSysMLOC.g:4291:1: ( ruleName )
            // InternalSysMLOC.g:4292:2: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureChainNameAccess().getNameParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureChainName__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalSysMLOC.g:4302:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4306:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalSysMLOC.g:4307:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalSysMLOC.g:4314:1: rule__Expression__Group__0__Impl : ( ( RULE_OPERATOR )* ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4318:1: ( ( ( RULE_OPERATOR )* ) )
            // InternalSysMLOC.g:4319:1: ( ( RULE_OPERATOR )* )
            {
            // InternalSysMLOC.g:4319:1: ( ( RULE_OPERATOR )* )
            // InternalSysMLOC.g:4320:2: ( RULE_OPERATOR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0()); 
            }
            // InternalSysMLOC.g:4321:2: ( RULE_OPERATOR )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_OPERATOR) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSysMLOC.g:4321:3: RULE_OPERATOR
            	    {
            	    match(input,RULE_OPERATOR,FOLLOW_30); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalSysMLOC.g:4329:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4333:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalSysMLOC.g:4334:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalSysMLOC.g:4341:1: rule__Expression__Group__1__Impl : ( ruleExpressionName ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4345:1: ( ( ruleExpressionName ) )
            // InternalSysMLOC.g:4346:1: ( ruleExpressionName )
            {
            // InternalSysMLOC.g:4346:1: ( ruleExpressionName )
            // InternalSysMLOC.g:4347:2: ruleExpressionName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // InternalSysMLOC.g:4356:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4360:1: ( rule__Expression__Group__2__Impl )
            // InternalSysMLOC.g:4361:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalSysMLOC.g:4367:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__Alternatives_2 )* ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4371:1: ( ( ( rule__Expression__Alternatives_2 )* ) )
            // InternalSysMLOC.g:4372:1: ( ( rule__Expression__Alternatives_2 )* )
            {
            // InternalSysMLOC.g:4372:1: ( ( rule__Expression__Alternatives_2 )* )
            // InternalSysMLOC.g:4373:2: ( rule__Expression__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_2()); 
            }
            // InternalSysMLOC.g:4374:2: ( rule__Expression__Alternatives_2 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_OPERATOR||LA54_0==44) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSysMLOC.g:4374:3: rule__Expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Expression__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group_2_0__0"
    // InternalSysMLOC.g:4383:1: rule__Expression__Group_2_0__0 : rule__Expression__Group_2_0__0__Impl rule__Expression__Group_2_0__1 ;
    public final void rule__Expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4387:1: ( rule__Expression__Group_2_0__0__Impl rule__Expression__Group_2_0__1 )
            // InternalSysMLOC.g:4388:2: rule__Expression__Group_2_0__0__Impl rule__Expression__Group_2_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_0__0"


    // $ANTLR start "rule__Expression__Group_2_0__0__Impl"
    // InternalSysMLOC.g:4395:1: rule__Expression__Group_2_0__0__Impl : ( RULE_OPERATOR ) ;
    public final void rule__Expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4399:1: ( ( RULE_OPERATOR ) )
            // InternalSysMLOC.g:4400:1: ( RULE_OPERATOR )
            {
            // InternalSysMLOC.g:4400:1: ( RULE_OPERATOR )
            // InternalSysMLOC.g:4401:2: RULE_OPERATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_OPERATOR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOPERATORTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_2_0__1"
    // InternalSysMLOC.g:4410:1: rule__Expression__Group_2_0__1 : rule__Expression__Group_2_0__1__Impl ;
    public final void rule__Expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4414:1: ( rule__Expression__Group_2_0__1__Impl )
            // InternalSysMLOC.g:4415:2: rule__Expression__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_0__1"


    // $ANTLR start "rule__Expression__Group_2_0__1__Impl"
    // InternalSysMLOC.g:4421:1: rule__Expression__Group_2_0__1__Impl : ( ( ruleExpressionName )? ) ;
    public final void rule__Expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4425:1: ( ( ( ruleExpressionName )? ) )
            // InternalSysMLOC.g:4426:1: ( ( ruleExpressionName )? )
            {
            // InternalSysMLOC.g:4426:1: ( ( ruleExpressionName )? )
            // InternalSysMLOC.g:4427:2: ( ruleExpressionName )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_2_0_1()); 
            }
            // InternalSysMLOC.g:4428:2: ( ruleExpressionName )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_NORMAL_VALUE)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSysMLOC.g:4428:3: ruleExpressionName
                    {
                    pushFollow(FOLLOW_2);
                    ruleExpressionName();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_2_1__0"
    // InternalSysMLOC.g:4437:1: rule__Expression__Group_2_1__0 : rule__Expression__Group_2_1__0__Impl rule__Expression__Group_2_1__1 ;
    public final void rule__Expression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4441:1: ( rule__Expression__Group_2_1__0__Impl rule__Expression__Group_2_1__1 )
            // InternalSysMLOC.g:4442:2: rule__Expression__Group_2_1__0__Impl rule__Expression__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_1__0"


    // $ANTLR start "rule__Expression__Group_2_1__0__Impl"
    // InternalSysMLOC.g:4449:1: rule__Expression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Expression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4453:1: ( ( ',' ) )
            // InternalSysMLOC.g:4454:1: ( ',' )
            {
            // InternalSysMLOC.g:4454:1: ( ',' )
            // InternalSysMLOC.g:4455:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_2_1__1"
    // InternalSysMLOC.g:4464:1: rule__Expression__Group_2_1__1 : rule__Expression__Group_2_1__1__Impl ;
    public final void rule__Expression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4468:1: ( rule__Expression__Group_2_1__1__Impl )
            // InternalSysMLOC.g:4469:2: rule__Expression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_1__1"


    // $ANTLR start "rule__Expression__Group_2_1__1__Impl"
    // InternalSysMLOC.g:4475:1: rule__Expression__Group_2_1__1__Impl : ( ruleExpressionName ) ;
    public final void rule__Expression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4479:1: ( ( ruleExpressionName ) )
            // InternalSysMLOC.g:4480:1: ( ruleExpressionName )
            {
            // InternalSysMLOC.g:4480:1: ( ruleExpressionName )
            // InternalSysMLOC.g:4481:2: ruleExpressionName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_2_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionNameParserRuleCall_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2_1__1__Impl"


    // $ANTLR start "rule__Namespace__PackagesAssignment"
    // InternalSysMLOC.g:4491:1: rule__Namespace__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Namespace__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4495:1: ( ( rulePackage ) )
            // InternalSysMLOC.g:4496:2: ( rulePackage )
            {
            // InternalSysMLOC.g:4496:2: ( rulePackage )
            // InternalSysMLOC.g:4497:3: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getPackagesPackageParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceAccess().getPackagesPackageParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__PackagesAssignment"


    // $ANTLR start "rule__Package__DeclaredNameAssignment_1"
    // InternalSysMLOC.g:4506:1: rule__Package__DeclaredNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__DeclaredNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4510:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:4511:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:4511:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:4512:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__DeclaredNameAssignment_1"


    // $ANTLR start "rule__Package__ElementsAssignment_3"
    // InternalSysMLOC.g:4521:1: rule__Package__ElementsAssignment_3 : ( ruleBaseElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4525:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:4526:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:4526:2: ( ruleBaseElement )
            // InternalSysMLOC.g:4527:3: ruleBaseElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsBaseElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsBaseElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsAssignment_3"


    // $ANTLR start "rule__NamespaceImport__VisibilityAssignment_0"
    // InternalSysMLOC.g:4536:1: rule__NamespaceImport__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__NamespaceImport__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4540:1: ( ( ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:4541:2: ( ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:4541:2: ( ruleVisibilityIndicator )
            // InternalSysMLOC.g:4542:3: ruleVisibilityIndicator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVisibilityIndicator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__VisibilityAssignment_0"


    // $ANTLR start "rule__NamespaceImport__DeclaredNameAssignment_2"
    // InternalSysMLOC.g:4551:1: rule__NamespaceImport__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NamespaceImport__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4555:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:4556:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:4556:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:4557:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__DeclaredNameAssignment_2"


    // $ANTLR start "rule__Comment__BodyAssignment_1"
    // InternalSysMLOC.g:4566:1: rule__Comment__BodyAssignment_1 : ( RULE_REGULAR_COMMENT ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4570:1: ( ( RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:4571:2: ( RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:4571:2: ( RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:4572:3: RULE_REGULAR_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REGULAR_COMMENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__BodyAssignment_1"


    // $ANTLR start "rule__AttributeDefinition__DeclaredNameAssignment_2"
    // InternalSysMLOC.g:4581:1: rule__AttributeDefinition__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__AttributeDefinition__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4585:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:4586:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:4586:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:4587:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__DeclaredNameAssignment_2"


    // $ANTLR start "rule__AttributeDefinition__ElementsAssignment_3_1_1"
    // InternalSysMLOC.g:4596:1: rule__AttributeDefinition__ElementsAssignment_3_1_1 : ( ruleBaseElement ) ;
    public final void rule__AttributeDefinition__ElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4600:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:4601:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:4601:2: ( ruleBaseElement )
            // InternalSysMLOC.g:4602:3: ruleBaseElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__ElementsAssignment_3_1_1"


    // $ANTLR start "rule__PartDefinition__DeclaredNameAssignment_2"
    // InternalSysMLOC.g:4611:1: rule__PartDefinition__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PartDefinition__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4615:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:4616:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:4616:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:4617:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__DeclaredNameAssignment_2"


    // $ANTLR start "rule__PartDefinition__ElementsAssignment_4_1_1"
    // InternalSysMLOC.g:4626:1: rule__PartDefinition__ElementsAssignment_4_1_1 : ( ruleBaseElement ) ;
    public final void rule__PartDefinition__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4630:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:4631:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:4631:2: ( ruleBaseElement )
            // InternalSysMLOC.g:4632:3: ruleBaseElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartDefinitionAccess().getElementsBaseElementParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartDefinitionAccess().getElementsBaseElementParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__ElementsAssignment_4_1_1"


    // $ANTLR start "rule__AttributeUsage__DeclaredNameAssignment_1"
    // InternalSysMLOC.g:4641:1: rule__AttributeUsage__DeclaredNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributeUsage__DeclaredNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4645:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:4646:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:4646:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:4647:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__DeclaredNameAssignment_1"


    // $ANTLR start "rule__AttributeUsage__ElementsAssignment_2_1_1"
    // InternalSysMLOC.g:4656:1: rule__AttributeUsage__ElementsAssignment_2_1_1 : ( ruleBaseElement ) ;
    public final void rule__AttributeUsage__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4660:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:4661:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:4661:2: ( ruleBaseElement )
            // InternalSysMLOC.g:4662:3: ruleBaseElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeUsage__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__ActionUsage__DeclaredNameAssignment_1"
    // InternalSysMLOC.g:4671:1: rule__ActionUsage__DeclaredNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ActionUsage__DeclaredNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4675:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:4676:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:4676:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:4677:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__DeclaredNameAssignment_1"


    // $ANTLR start "rule__ActionUsage__ElementsAssignment_2_1_1"
    // InternalSysMLOC.g:4686:1: rule__ActionUsage__ElementsAssignment_2_1_1 : ( ruleBaseElement ) ;
    public final void rule__ActionUsage__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4690:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:4691:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:4691:2: ( ruleBaseElement )
            // InternalSysMLOC.g:4692:3: ruleBaseElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionUsage__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__PartUsage__ElementsAssignment_2_1_1"
    // InternalSysMLOC.g:4701:1: rule__PartUsage__ElementsAssignment_2_1_1 : ( ruleBaseElement ) ;
    public final void rule__PartUsage__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4705:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:4706:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:4706:2: ( ruleBaseElement )
            // InternalSysMLOC.g:4707:3: ruleBaseElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__ElementsAssignment_2_1_1"


    // $ANTLR start "rule__FeatureValue__IsInitialAssignment_0_1"
    // InternalSysMLOC.g:4716:1: rule__FeatureValue__IsInitialAssignment_0_1 : ( ( ':=' ) ) ;
    public final void rule__FeatureValue__IsInitialAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4720:1: ( ( ( ':=' ) ) )
            // InternalSysMLOC.g:4721:2: ( ( ':=' ) )
            {
            // InternalSysMLOC.g:4721:2: ( ( ':=' ) )
            // InternalSysMLOC.g:4722:3: ( ':=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_1_0()); 
            }
            // InternalSysMLOC.g:4723:3: ( ':=' )
            // InternalSysMLOC.g:4724:4: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__IsInitialAssignment_0_1"


    // $ANTLR start "rule__FeatureValue__IsDefaultAssignment_0_2_0"
    // InternalSysMLOC.g:4735:1: rule__FeatureValue__IsDefaultAssignment_0_2_0 : ( ( 'default' ) ) ;
    public final void rule__FeatureValue__IsDefaultAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4739:1: ( ( ( 'default' ) ) )
            // InternalSysMLOC.g:4740:2: ( ( 'default' ) )
            {
            // InternalSysMLOC.g:4740:2: ( ( 'default' ) )
            // InternalSysMLOC.g:4741:3: ( 'default' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getIsDefaultDefaultKeyword_0_2_0_0()); 
            }
            // InternalSysMLOC.g:4742:3: ( 'default' )
            // InternalSysMLOC.g:4743:4: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getIsDefaultDefaultKeyword_0_2_0_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getIsDefaultDefaultKeyword_0_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getIsDefaultDefaultKeyword_0_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__IsDefaultAssignment_0_2_0"


    // $ANTLR start "rule__FeatureValue__IsInitialAssignment_0_2_1_1"
    // InternalSysMLOC.g:4754:1: rule__FeatureValue__IsInitialAssignment_0_2_1_1 : ( ( ':=' ) ) ;
    public final void rule__FeatureValue__IsInitialAssignment_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4758:1: ( ( ( ':=' ) ) )
            // InternalSysMLOC.g:4759:2: ( ( ':=' ) )
            {
            // InternalSysMLOC.g:4759:2: ( ( ':=' ) )
            // InternalSysMLOC.g:4760:3: ( ':=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_2_1_1_0()); 
            }
            // InternalSysMLOC.g:4761:3: ( ':=' )
            // InternalSysMLOC.g:4762:4: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_2_1_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_2_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getIsInitialColonEqualsSignKeyword_0_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__IsInitialAssignment_0_2_1_1"


    // $ANTLR start "rule__FeatureValue__OwnedExpressionAssignment_1"
    // InternalSysMLOC.g:4773:1: rule__FeatureValue__OwnedExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__FeatureValue__OwnedExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4777:1: ( ( ruleExpression ) )
            // InternalSysMLOC.g:4778:2: ( ruleExpression )
            {
            // InternalSysMLOC.g:4778:2: ( ruleExpression )
            // InternalSysMLOC.g:4779:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureValueAccess().getOwnedExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureValueAccess().getOwnedExpressionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureValue__OwnedExpressionAssignment_1"


    // $ANTLR start "rule__FeatureDeclaration__DeclaredNameAssignment_0_0"
    // InternalSysMLOC.g:4788:1: rule__FeatureDeclaration__DeclaredNameAssignment_0_0 : ( ruleName ) ;
    public final void rule__FeatureDeclaration__DeclaredNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4792:1: ( ( ruleName ) )
            // InternalSysMLOC.g:4793:2: ( ruleName )
            {
            // InternalSysMLOC.g:4793:2: ( ruleName )
            // InternalSysMLOC.g:4794:3: ruleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureDeclarationAccess().getDeclaredNameNameParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureDeclaration__DeclaredNameAssignment_0_0"


    // $ANTLR start "rule__MultiplicityPart__MultiplicityAssignment_0_1"
    // InternalSysMLOC.g:4803:1: rule__MultiplicityPart__MultiplicityAssignment_0_1 : ( RULE_DECIMAL_VALUE ) ;
    public final void rule__MultiplicityPart__MultiplicityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4807:1: ( ( RULE_DECIMAL_VALUE ) )
            // InternalSysMLOC.g:4808:2: ( RULE_DECIMAL_VALUE )
            {
            // InternalSysMLOC.g:4808:2: ( RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:4809:3: RULE_DECIMAL_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__MultiplicityAssignment_0_1"


    // $ANTLR start "rule__MultiplicityPart__MultiplicityAssignment_0_2_1"
    // InternalSysMLOC.g:4818:1: rule__MultiplicityPart__MultiplicityAssignment_0_2_1 : ( RULE_DECIMAL_VALUE ) ;
    public final void rule__MultiplicityPart__MultiplicityAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4822:1: ( ( RULE_DECIMAL_VALUE ) )
            // InternalSysMLOC.g:4823:2: ( RULE_DECIMAL_VALUE )
            {
            // InternalSysMLOC.g:4823:2: ( RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:4824:3: RULE_DECIMAL_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_0_2_1_0()); 
            }
            match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__MultiplicityAssignment_0_2_1"


    // $ANTLR start "rule__MultiplicityPart__MultiplicityAssignment_1_0_1"
    // InternalSysMLOC.g:4833:1: rule__MultiplicityPart__MultiplicityAssignment_1_0_1 : ( RULE_DECIMAL_VALUE ) ;
    public final void rule__MultiplicityPart__MultiplicityAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4837:1: ( ( RULE_DECIMAL_VALUE ) )
            // InternalSysMLOC.g:4838:2: ( RULE_DECIMAL_VALUE )
            {
            // InternalSysMLOC.g:4838:2: ( RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:4839:3: RULE_DECIMAL_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_1_0_1_0()); 
            }
            match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__MultiplicityAssignment_1_0_1"


    // $ANTLR start "rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1"
    // InternalSysMLOC.g:4848:1: rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1 : ( RULE_DECIMAL_VALUE ) ;
    public final void rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4852:1: ( ( RULE_DECIMAL_VALUE ) )
            // InternalSysMLOC.g:4853:2: ( RULE_DECIMAL_VALUE )
            {
            // InternalSysMLOC.g:4853:2: ( RULE_DECIMAL_VALUE )
            // InternalSysMLOC.g:4854:3: RULE_DECIMAL_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_1_0_2_1_0()); 
            }
            match(input,RULE_DECIMAL_VALUE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getMultiplicityDECIMAL_VALUETerminalRuleCall_1_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__MultiplicityAssignment_1_0_2_1"


    // $ANTLR start "rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0"
    // InternalSysMLOC.g:4863:1: rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0 : ( ( 'ordered' ) ) ;
    public final void rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4867:1: ( ( ( 'ordered' ) ) )
            // InternalSysMLOC.g:4868:2: ( ( 'ordered' ) )
            {
            // InternalSysMLOC.g:4868:2: ( ( 'ordered' ) )
            // InternalSysMLOC.g:4869:3: ( 'ordered' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_0_0_0()); 
            }
            // InternalSysMLOC.g:4870:3: ( 'ordered' )
            // InternalSysMLOC.g:4871:4: 'ordered'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_0_0_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__IsOrderedAssignment_1_1_0_0"


    // $ANTLR start "rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1"
    // InternalSysMLOC.g:4882:1: rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1 : ( ( 'nonunique' ) ) ;
    public final void rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4886:1: ( ( ( 'nonunique' ) ) )
            // InternalSysMLOC.g:4887:2: ( ( 'nonunique' ) )
            {
            // InternalSysMLOC.g:4887:2: ( ( 'nonunique' ) )
            // InternalSysMLOC.g:4888:3: ( 'nonunique' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_0_1_0()); 
            }
            // InternalSysMLOC.g:4889:3: ( 'nonunique' )
            // InternalSysMLOC.g:4890:4: 'nonunique'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_0_1_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__IsNonuniqueAssignment_1_1_0_1"


    // $ANTLR start "rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0"
    // InternalSysMLOC.g:4901:1: rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0 : ( ( 'nonunique' ) ) ;
    public final void rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4905:1: ( ( ( 'nonunique' ) ) )
            // InternalSysMLOC.g:4906:2: ( ( 'nonunique' ) )
            {
            // InternalSysMLOC.g:4906:2: ( ( 'nonunique' ) )
            // InternalSysMLOC.g:4907:3: ( 'nonunique' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_1_0_0()); 
            }
            // InternalSysMLOC.g:4908:3: ( 'nonunique' )
            // InternalSysMLOC.g:4909:4: 'nonunique'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_1_0_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsNonuniqueNonuniqueKeyword_1_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__IsNonuniqueAssignment_1_1_1_0"


    // $ANTLR start "rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1"
    // InternalSysMLOC.g:4920:1: rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1 : ( ( 'ordered' ) ) ;
    public final void rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4924:1: ( ( ( 'ordered' ) ) )
            // InternalSysMLOC.g:4925:2: ( ( 'ordered' ) )
            {
            // InternalSysMLOC.g:4925:2: ( ( 'ordered' ) )
            // InternalSysMLOC.g:4926:3: ( 'ordered' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_1_1_0()); 
            }
            // InternalSysMLOC.g:4927:3: ( 'ordered' )
            // InternalSysMLOC.g:4928:4: 'ordered'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_1_1_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicityPartAccess().getIsOrderedOrderedKeyword_1_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicityPart__IsOrderedAssignment_1_1_1_1"


    // $ANTLR start "rule__FeatureSpecialization__TypingsAssignment_0_1"
    // InternalSysMLOC.g:4939:1: rule__FeatureSpecialization__TypingsAssignment_0_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__TypingsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4943:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:4944:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:4944:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:4945:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__TypingsAssignment_0_1"


    // $ANTLR start "rule__FeatureSpecialization__TypingsAssignment_0_2_1"
    // InternalSysMLOC.g:4954:1: rule__FeatureSpecialization__TypingsAssignment_0_2_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__TypingsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4958:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:4959:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:4959:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:4960:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getTypingsFeatureChainNameParserRuleCall_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__TypingsAssignment_0_2_1"


    // $ANTLR start "rule__FeatureSpecialization__SubsettingAssignment_1_1"
    // InternalSysMLOC.g:4969:1: rule__FeatureSpecialization__SubsettingAssignment_1_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__SubsettingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4973:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:4974:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:4974:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:4975:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__SubsettingAssignment_1_1"


    // $ANTLR start "rule__FeatureSpecialization__SubsettingAssignment_1_2_1"
    // InternalSysMLOC.g:4984:1: rule__FeatureSpecialization__SubsettingAssignment_1_2_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__SubsettingAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:4988:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:4989:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:4989:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:4990:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getSubsettingFeatureChainNameParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__SubsettingAssignment_1_2_1"


    // $ANTLR start "rule__FeatureSpecialization__ReferencesAssignment_2_1"
    // InternalSysMLOC.g:4999:1: rule__FeatureSpecialization__ReferencesAssignment_2_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__ReferencesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:5003:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:5004:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:5004:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:5005:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__ReferencesAssignment_2_1"


    // $ANTLR start "rule__FeatureSpecialization__ReferencesAssignment_2_2_1"
    // InternalSysMLOC.g:5014:1: rule__FeatureSpecialization__ReferencesAssignment_2_2_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__ReferencesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:5018:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:5019:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:5019:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:5020:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getReferencesFeatureChainNameParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__ReferencesAssignment_2_2_1"


    // $ANTLR start "rule__FeatureSpecialization__CrossesAssignment_3_1"
    // InternalSysMLOC.g:5029:1: rule__FeatureSpecialization__CrossesAssignment_3_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__CrossesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:5033:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:5034:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:5034:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:5035:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__CrossesAssignment_3_1"


    // $ANTLR start "rule__FeatureSpecialization__CrossesAssignment_3_2_1"
    // InternalSysMLOC.g:5044:1: rule__FeatureSpecialization__CrossesAssignment_3_2_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__CrossesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:5048:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:5049:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:5049:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:5050:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getCrossesFeatureChainNameParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__CrossesAssignment_3_2_1"


    // $ANTLR start "rule__FeatureSpecialization__RedefinitionsAssignment_4_1"
    // InternalSysMLOC.g:5059:1: rule__FeatureSpecialization__RedefinitionsAssignment_4_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__RedefinitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:5063:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:5064:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:5064:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:5065:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__RedefinitionsAssignment_4_1"


    // $ANTLR start "rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1"
    // InternalSysMLOC.g:5074:1: rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1 : ( ruleFeatureChainName ) ;
    public final void rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:5078:1: ( ( ruleFeatureChainName ) )
            // InternalSysMLOC.g:5079:2: ( ruleFeatureChainName )
            {
            // InternalSysMLOC.g:5079:2: ( ruleFeatureChainName )
            // InternalSysMLOC.g:5080:3: ruleFeatureChainName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureChainName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureSpecializationAccess().getRedefinitionsFeatureChainNameParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSpecialization__RedefinitionsAssignment_4_2_1"

    // $ANTLR start synpred46_InternalSysMLOC
    public final void synpred46_InternalSysMLOC_fragment() throws RecognitionException {   
        // InternalSysMLOC.g:2754:4: ( ruleFeatureSpecialization )
        // InternalSysMLOC.g:2754:4: ruleFeatureSpecialization
        {
        pushFollow(FOLLOW_2);
        ruleFeatureSpecialization();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalSysMLOC

    // Delegated rules

    public final boolean synpred46_InternalSysMLOC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalSysMLOC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\1\30\uffff";
    static final String dfa_3s = "\1\17\1\uffff\1\4\1\53\11\4\2\0\1\4\10\0\1\uffff";
    static final String dfa_4s = "\1\62\1\uffff\1\5\1\53\11\5\2\0\1\5\10\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\26\uffff\1\1";
    static final String dfa_6s = "\15\uffff\1\2\1\6\1\uffff\1\0\1\7\1\4\1\10\1\5\1\1\1\11\1\3\1\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\1\1\7\uffff\1\1\2\uffff\1\3\4\uffff\4\1",
            "",
            "\1\15\1\16",
            "\1\17",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\22\1\23",
            "\1\22\1\23",
            "\1\24\1\25",
            "\1\24\1\25",
            "\1\26\1\27",
            "\1\26\1\27",
            "\1\uffff",
            "\1\uffff",
            "\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2754:3: ( ruleFeatureSpecialization )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_16 = input.LA(1);

                         
                        int index37_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_21 = input.LA(1);

                         
                        int index37_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_13 = input.LA(1);

                         
                        int index37_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_23 = input.LA(1);

                         
                        int index37_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_18 = input.LA(1);

                         
                        int index37_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_18);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_20 = input.LA(1);

                         
                        int index37_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_14 = input.LA(1);

                         
                        int index37_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_17 = input.LA(1);

                         
                        int index37_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_19 = input.LA(1);

                         
                        int index37_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA37_22 = input.LA(1);

                         
                        int index37_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalSysMLOC()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000006D78000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000006C78000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0007848007FF0030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0006048007FE0030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040007FE0002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040007FE0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000082L});

}