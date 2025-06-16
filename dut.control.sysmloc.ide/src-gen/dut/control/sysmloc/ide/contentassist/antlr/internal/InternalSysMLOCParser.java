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

@SuppressWarnings("all")
public class InternalSysMLOCParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "';'", "'public'", "'private'", "'protected'", "'package'", "'{'", "'}'", "'import'", "'doc'", "'attribute'", "'def'", "'part'", "'::'"
    };
    public static final int RULE_REGULAR_COMMENT=6;
    public static final int RULE_SL_NOTE=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_DECIMAL_VALUE=7;
    public static final int RULE_UNRESTRICTED_NAME=5;
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
    // InternalSysMLOC.g:53:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalSysMLOC.g:54:1: ( ruleNamespace EOF )
            // InternalSysMLOC.g:55:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:62:1: ruleNamespace : ( ( rule__Namespace__PackagesAssignment )* ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:66:2: ( ( ( rule__Namespace__PackagesAssignment )* ) )
            // InternalSysMLOC.g:67:2: ( ( rule__Namespace__PackagesAssignment )* )
            {
            // InternalSysMLOC.g:67:2: ( ( rule__Namespace__PackagesAssignment )* )
            // InternalSysMLOC.g:68:3: ( rule__Namespace__PackagesAssignment )*
            {
             before(grammarAccess.getNamespaceAccess().getPackagesAssignment()); 
            // InternalSysMLOC.g:69:3: ( rule__Namespace__PackagesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSysMLOC.g:69:4: rule__Namespace__PackagesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Namespace__PackagesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getPackagesAssignment()); 

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
    // InternalSysMLOC.g:78:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:79:1: ( rulePackage EOF )
            // InternalSysMLOC.g:80:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:87:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:91:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSysMLOC.g:92:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSysMLOC.g:92:2: ( ( rule__Package__Group__0 ) )
            // InternalSysMLOC.g:93:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSysMLOC.g:94:3: ( rule__Package__Group__0 )
            // InternalSysMLOC.g:94:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // InternalSysMLOC.g:103:1: entryRuleBaseElement : ruleBaseElement EOF ;
    public final void entryRuleBaseElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:104:1: ( ruleBaseElement EOF )
            // InternalSysMLOC.g:105:1: ruleBaseElement EOF
            {
             before(grammarAccess.getBaseElementRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseElement();

            state._fsp--;

             after(grammarAccess.getBaseElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:112:1: ruleBaseElement : ( ( rule__BaseElement__Alternatives ) ) ;
    public final void ruleBaseElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:116:2: ( ( ( rule__BaseElement__Alternatives ) ) )
            // InternalSysMLOC.g:117:2: ( ( rule__BaseElement__Alternatives ) )
            {
            // InternalSysMLOC.g:117:2: ( ( rule__BaseElement__Alternatives ) )
            // InternalSysMLOC.g:118:3: ( rule__BaseElement__Alternatives )
            {
             before(grammarAccess.getBaseElementAccess().getAlternatives()); 
            // InternalSysMLOC.g:119:3: ( rule__BaseElement__Alternatives )
            // InternalSysMLOC.g:119:4: rule__BaseElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseElementAccess().getAlternatives()); 

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
    // InternalSysMLOC.g:128:1: entryRuleAnnotatingElement : ruleAnnotatingElement EOF ;
    public final void entryRuleAnnotatingElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:129:1: ( ruleAnnotatingElement EOF )
            // InternalSysMLOC.g:130:1: ruleAnnotatingElement EOF
            {
             before(grammarAccess.getAnnotatingElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotatingElement();

            state._fsp--;

             after(grammarAccess.getAnnotatingElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:137:1: ruleAnnotatingElement : ( ruleComment ) ;
    public final void ruleAnnotatingElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:141:2: ( ( ruleComment ) )
            // InternalSysMLOC.g:142:2: ( ruleComment )
            {
            // InternalSysMLOC.g:142:2: ( ruleComment )
            // InternalSysMLOC.g:143:3: ruleComment
            {
             before(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getAnnotatingElementAccess().getCommentParserRuleCall()); 

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
    // InternalSysMLOC.g:153:1: entryRuleImportElement : ruleImportElement EOF ;
    public final void entryRuleImportElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:154:1: ( ruleImportElement EOF )
            // InternalSysMLOC.g:155:1: ruleImportElement EOF
            {
             before(grammarAccess.getImportElementRule()); 
            pushFollow(FOLLOW_1);
            ruleImportElement();

            state._fsp--;

             after(grammarAccess.getImportElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:162:1: ruleImportElement : ( ruleNamespaceImport ) ;
    public final void ruleImportElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:166:2: ( ( ruleNamespaceImport ) )
            // InternalSysMLOC.g:167:2: ( ruleNamespaceImport )
            {
            // InternalSysMLOC.g:167:2: ( ruleNamespaceImport )
            // InternalSysMLOC.g:168:3: ruleNamespaceImport
            {
             before(grammarAccess.getImportElementAccess().getNamespaceImportParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleNamespaceImport();

            state._fsp--;

             after(grammarAccess.getImportElementAccess().getNamespaceImportParserRuleCall()); 

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
    // InternalSysMLOC.g:178:1: entryRuleDefinitionElement : ruleDefinitionElement EOF ;
    public final void entryRuleDefinitionElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:179:1: ( ruleDefinitionElement EOF )
            // InternalSysMLOC.g:180:1: ruleDefinitionElement EOF
            {
             before(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinitionElement();

            state._fsp--;

             after(grammarAccess.getDefinitionElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:187:1: ruleDefinitionElement : ( ( rule__DefinitionElement__Alternatives ) ) ;
    public final void ruleDefinitionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:191:2: ( ( ( rule__DefinitionElement__Alternatives ) ) )
            // InternalSysMLOC.g:192:2: ( ( rule__DefinitionElement__Alternatives ) )
            {
            // InternalSysMLOC.g:192:2: ( ( rule__DefinitionElement__Alternatives ) )
            // InternalSysMLOC.g:193:3: ( rule__DefinitionElement__Alternatives )
            {
             before(grammarAccess.getDefinitionElementAccess().getAlternatives()); 
            // InternalSysMLOC.g:194:3: ( rule__DefinitionElement__Alternatives )
            // InternalSysMLOC.g:194:4: rule__DefinitionElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionElementAccess().getAlternatives()); 

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
    // InternalSysMLOC.g:203:1: entryRuleUsageElement : ruleUsageElement EOF ;
    public final void entryRuleUsageElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:204:1: ( ruleUsageElement EOF )
            // InternalSysMLOC.g:205:1: ruleUsageElement EOF
            {
             before(grammarAccess.getUsageElementRule()); 
            pushFollow(FOLLOW_1);
            ruleUsageElement();

            state._fsp--;

             after(grammarAccess.getUsageElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:212:1: ruleUsageElement : ( ruleNonOccurrenceUsageElement ) ;
    public final void ruleUsageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:216:2: ( ( ruleNonOccurrenceUsageElement ) )
            // InternalSysMLOC.g:217:2: ( ruleNonOccurrenceUsageElement )
            {
            // InternalSysMLOC.g:217:2: ( ruleNonOccurrenceUsageElement )
            // InternalSysMLOC.g:218:3: ruleNonOccurrenceUsageElement
            {
             before(grammarAccess.getUsageElementAccess().getNonOccurrenceUsageElementParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleNonOccurrenceUsageElement();

            state._fsp--;

             after(grammarAccess.getUsageElementAccess().getNonOccurrenceUsageElementParserRuleCall()); 

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
    // InternalSysMLOC.g:228:1: entryRuleNonOccurrenceUsageElement : ruleNonOccurrenceUsageElement EOF ;
    public final void entryRuleNonOccurrenceUsageElement() throws RecognitionException {
        try {
            // InternalSysMLOC.g:229:1: ( ruleNonOccurrenceUsageElement EOF )
            // InternalSysMLOC.g:230:1: ruleNonOccurrenceUsageElement EOF
            {
             before(grammarAccess.getNonOccurrenceUsageElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNonOccurrenceUsageElement();

            state._fsp--;

             after(grammarAccess.getNonOccurrenceUsageElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:237:1: ruleNonOccurrenceUsageElement : ( ruleAttributeUsage ) ;
    public final void ruleNonOccurrenceUsageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:241:2: ( ( ruleAttributeUsage ) )
            // InternalSysMLOC.g:242:2: ( ruleAttributeUsage )
            {
            // InternalSysMLOC.g:242:2: ( ruleAttributeUsage )
            // InternalSysMLOC.g:243:3: ruleAttributeUsage
            {
             before(grammarAccess.getNonOccurrenceUsageElementAccess().getAttributeUsageParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAttributeUsage();

            state._fsp--;

             after(grammarAccess.getNonOccurrenceUsageElementAccess().getAttributeUsageParserRuleCall()); 

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


    // $ANTLR start "entryRuleNamespaceImport"
    // InternalSysMLOC.g:253:1: entryRuleNamespaceImport : ruleNamespaceImport EOF ;
    public final void entryRuleNamespaceImport() throws RecognitionException {
        try {
            // InternalSysMLOC.g:254:1: ( ruleNamespaceImport EOF )
            // InternalSysMLOC.g:255:1: ruleNamespaceImport EOF
            {
             before(grammarAccess.getNamespaceImportRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespaceImport();

            state._fsp--;

             after(grammarAccess.getNamespaceImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:262:1: ruleNamespaceImport : ( ( rule__NamespaceImport__Group__0 ) ) ;
    public final void ruleNamespaceImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:266:2: ( ( ( rule__NamespaceImport__Group__0 ) ) )
            // InternalSysMLOC.g:267:2: ( ( rule__NamespaceImport__Group__0 ) )
            {
            // InternalSysMLOC.g:267:2: ( ( rule__NamespaceImport__Group__0 ) )
            // InternalSysMLOC.g:268:3: ( rule__NamespaceImport__Group__0 )
            {
             before(grammarAccess.getNamespaceImportAccess().getGroup()); 
            // InternalSysMLOC.g:269:3: ( rule__NamespaceImport__Group__0 )
            // InternalSysMLOC.g:269:4: rule__NamespaceImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceImportAccess().getGroup()); 

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
    // InternalSysMLOC.g:278:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalSysMLOC.g:279:1: ( ruleComment EOF )
            // InternalSysMLOC.g:280:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:287:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:291:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalSysMLOC.g:292:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalSysMLOC.g:292:2: ( ( rule__Comment__Group__0 ) )
            // InternalSysMLOC.g:293:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalSysMLOC.g:294:3: ( rule__Comment__Group__0 )
            // InternalSysMLOC.g:294:4: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getGroup()); 

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
    // InternalSysMLOC.g:303:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalSysMLOC.g:304:1: ( ruleAttributeDefinition EOF )
            // InternalSysMLOC.g:305:1: ruleAttributeDefinition EOF
            {
             before(grammarAccess.getAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:312:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:316:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalSysMLOC.g:317:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalSysMLOC.g:317:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalSysMLOC.g:318:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalSysMLOC.g:319:3: ( rule__AttributeDefinition__Group__0 )
            // InternalSysMLOC.g:319:4: rule__AttributeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getGroup()); 

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
    // InternalSysMLOC.g:328:1: entryRulePartDefinition : rulePartDefinition EOF ;
    public final void entryRulePartDefinition() throws RecognitionException {
        try {
            // InternalSysMLOC.g:329:1: ( rulePartDefinition EOF )
            // InternalSysMLOC.g:330:1: rulePartDefinition EOF
            {
             before(grammarAccess.getPartDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePartDefinition();

            state._fsp--;

             after(grammarAccess.getPartDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:337:1: rulePartDefinition : ( ( rule__PartDefinition__Group__0 ) ) ;
    public final void rulePartDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:341:2: ( ( ( rule__PartDefinition__Group__0 ) ) )
            // InternalSysMLOC.g:342:2: ( ( rule__PartDefinition__Group__0 ) )
            {
            // InternalSysMLOC.g:342:2: ( ( rule__PartDefinition__Group__0 ) )
            // InternalSysMLOC.g:343:3: ( rule__PartDefinition__Group__0 )
            {
             before(grammarAccess.getPartDefinitionAccess().getGroup()); 
            // InternalSysMLOC.g:344:3: ( rule__PartDefinition__Group__0 )
            // InternalSysMLOC.g:344:4: rule__PartDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartDefinitionAccess().getGroup()); 

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
    // InternalSysMLOC.g:353:1: entryRuleAttributeUsage : ruleAttributeUsage EOF ;
    public final void entryRuleAttributeUsage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:354:1: ( ruleAttributeUsage EOF )
            // InternalSysMLOC.g:355:1: ruleAttributeUsage EOF
            {
             before(grammarAccess.getAttributeUsageRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeUsage();

            state._fsp--;

             after(grammarAccess.getAttributeUsageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:362:1: ruleAttributeUsage : ( ( rule__AttributeUsage__Group__0 ) ) ;
    public final void ruleAttributeUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:366:2: ( ( ( rule__AttributeUsage__Group__0 ) ) )
            // InternalSysMLOC.g:367:2: ( ( rule__AttributeUsage__Group__0 ) )
            {
            // InternalSysMLOC.g:367:2: ( ( rule__AttributeUsage__Group__0 ) )
            // InternalSysMLOC.g:368:3: ( rule__AttributeUsage__Group__0 )
            {
             before(grammarAccess.getAttributeUsageAccess().getGroup()); 
            // InternalSysMLOC.g:369:3: ( rule__AttributeUsage__Group__0 )
            // InternalSysMLOC.g:369:4: rule__AttributeUsage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeUsageAccess().getGroup()); 

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


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:378:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:379:1: ( ruleName EOF )
            // InternalSysMLOC.g:380:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:387:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:391:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalSysMLOC.g:392:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalSysMLOC.g:392:2: ( ( rule__Name__Alternatives ) )
            // InternalSysMLOC.g:393:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalSysMLOC.g:394:3: ( rule__Name__Alternatives )
            // InternalSysMLOC.g:394:4: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleQualification"
    // InternalSysMLOC.g:403:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalSysMLOC.g:404:1: ( ruleQualification EOF )
            // InternalSysMLOC.g:405:1: ruleQualification EOF
            {
             before(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getQualificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalSysMLOC.g:412:1: ruleQualification : ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:416:2: ( ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) )
            // InternalSysMLOC.g:417:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            {
            // InternalSysMLOC.g:417:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            // InternalSysMLOC.g:418:3: ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* )
            {
            // InternalSysMLOC.g:418:3: ( ( rule__Qualification__Group__0 ) )
            // InternalSysMLOC.g:419:4: ( rule__Qualification__Group__0 )
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalSysMLOC.g:420:4: ( rule__Qualification__Group__0 )
            // InternalSysMLOC.g:420:5: rule__Qualification__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__Qualification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getGroup()); 

            }

            // InternalSysMLOC.g:423:3: ( ( rule__Qualification__Group__0 )* )
            // InternalSysMLOC.g:424:4: ( rule__Qualification__Group__0 )*
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalSysMLOC.g:425:4: ( rule__Qualification__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==25) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==25) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:425:5: rule__Qualification__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Qualification__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQualificationAccess().getGroup()); 

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
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSysMLOC.g:435:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:436:1: ( ruleQualifiedName EOF )
            // InternalSysMLOC.g:437:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSysMLOC.g:444:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:448:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSysMLOC.g:449:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSysMLOC.g:449:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSysMLOC.g:450:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSysMLOC.g:451:3: ( rule__QualifiedName__Group__0 )
            // InternalSysMLOC.g:451:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalSysMLOC.g:460:1: ruleVisibilityIndicator : ( ( rule__VisibilityIndicator__Alternatives ) ) ;
    public final void ruleVisibilityIndicator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:464:1: ( ( ( rule__VisibilityIndicator__Alternatives ) ) )
            // InternalSysMLOC.g:465:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            {
            // InternalSysMLOC.g:465:2: ( ( rule__VisibilityIndicator__Alternatives ) )
            // InternalSysMLOC.g:466:3: ( rule__VisibilityIndicator__Alternatives )
            {
             before(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 
            // InternalSysMLOC.g:467:3: ( rule__VisibilityIndicator__Alternatives )
            // InternalSysMLOC.g:467:4: rule__VisibilityIndicator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VisibilityIndicator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityIndicatorAccess().getAlternatives()); 

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
    // InternalSysMLOC.g:475:1: rule__BaseElement__Alternatives : ( ( rulePackage ) | ( ruleAnnotatingElement ) | ( ruleImportElement ) | ( ruleDefinitionElement ) | ( ruleUsageElement ) );
    public final void rule__BaseElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:479:1: ( ( rulePackage ) | ( ruleAnnotatingElement ) | ( ruleImportElement ) | ( ruleDefinitionElement ) | ( ruleUsageElement ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)) ) {
                    alt3=5;
                }
                else if ( (LA3_4==23) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 24:
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
                    // InternalSysMLOC.g:480:2: ( rulePackage )
                    {
                    // InternalSysMLOC.g:480:2: ( rulePackage )
                    // InternalSysMLOC.g:481:3: rulePackage
                    {
                     before(grammarAccess.getBaseElementAccess().getPackageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getBaseElementAccess().getPackageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:486:2: ( ruleAnnotatingElement )
                    {
                    // InternalSysMLOC.g:486:2: ( ruleAnnotatingElement )
                    // InternalSysMLOC.g:487:3: ruleAnnotatingElement
                    {
                     before(grammarAccess.getBaseElementAccess().getAnnotatingElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAnnotatingElement();

                    state._fsp--;

                     after(grammarAccess.getBaseElementAccess().getAnnotatingElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:492:2: ( ruleImportElement )
                    {
                    // InternalSysMLOC.g:492:2: ( ruleImportElement )
                    // InternalSysMLOC.g:493:3: ruleImportElement
                    {
                     before(grammarAccess.getBaseElementAccess().getImportElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImportElement();

                    state._fsp--;

                     after(grammarAccess.getBaseElementAccess().getImportElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:498:2: ( ruleDefinitionElement )
                    {
                    // InternalSysMLOC.g:498:2: ( ruleDefinitionElement )
                    // InternalSysMLOC.g:499:3: ruleDefinitionElement
                    {
                     before(grammarAccess.getBaseElementAccess().getDefinitionElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinitionElement();

                    state._fsp--;

                     after(grammarAccess.getBaseElementAccess().getDefinitionElementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:504:2: ( ruleUsageElement )
                    {
                    // InternalSysMLOC.g:504:2: ( ruleUsageElement )
                    // InternalSysMLOC.g:505:3: ruleUsageElement
                    {
                     before(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleUsageElement();

                    state._fsp--;

                     after(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4()); 

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
    // InternalSysMLOC.g:514:1: rule__DefinitionElement__Alternatives : ( ( ruleAttributeDefinition ) | ( rulePartDefinition ) );
    public final void rule__DefinitionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:518:1: ( ( ruleAttributeDefinition ) | ( rulePartDefinition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSysMLOC.g:519:2: ( ruleAttributeDefinition )
                    {
                    // InternalSysMLOC.g:519:2: ( ruleAttributeDefinition )
                    // InternalSysMLOC.g:520:3: ruleAttributeDefinition
                    {
                     before(grammarAccess.getDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionElementAccess().getAttributeDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:525:2: ( rulePartDefinition )
                    {
                    // InternalSysMLOC.g:525:2: ( rulePartDefinition )
                    // InternalSysMLOC.g:526:3: rulePartDefinition
                    {
                     before(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePartDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionElementAccess().getPartDefinitionParserRuleCall_1()); 

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


    // $ANTLR start "rule__AttributeDefinition__Alternatives_3"
    // InternalSysMLOC.g:535:1: rule__AttributeDefinition__Alternatives_3 : ( ( ';' ) | ( ( rule__AttributeDefinition__Group_3_1__0 ) ) );
    public final void rule__AttributeDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:539:1: ( ( ';' ) | ( ( rule__AttributeDefinition__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSysMLOC.g:540:2: ( ';' )
                    {
                    // InternalSysMLOC.g:540:2: ( ';' )
                    // InternalSysMLOC.g:541:3: ';'
                    {
                     before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:546:2: ( ( rule__AttributeDefinition__Group_3_1__0 ) )
                    {
                    // InternalSysMLOC.g:546:2: ( ( rule__AttributeDefinition__Group_3_1__0 ) )
                    // InternalSysMLOC.g:547:3: ( rule__AttributeDefinition__Group_3_1__0 )
                    {
                     before(grammarAccess.getAttributeDefinitionAccess().getGroup_3_1()); 
                    // InternalSysMLOC.g:548:3: ( rule__AttributeDefinition__Group_3_1__0 )
                    // InternalSysMLOC.g:548:4: rule__AttributeDefinition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeDefinitionAccess().getGroup_3_1()); 

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
    // InternalSysMLOC.g:556:1: rule__PartDefinition__Alternatives_4 : ( ( ';' ) | ( ( rule__PartDefinition__Group_4_1__0 ) ) );
    public final void rule__PartDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:560:1: ( ( ';' ) | ( ( rule__PartDefinition__Group_4_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSysMLOC.g:561:2: ( ';' )
                    {
                    // InternalSysMLOC.g:561:2: ( ';' )
                    // InternalSysMLOC.g:562:3: ';'
                    {
                     before(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:567:2: ( ( rule__PartDefinition__Group_4_1__0 ) )
                    {
                    // InternalSysMLOC.g:567:2: ( ( rule__PartDefinition__Group_4_1__0 ) )
                    // InternalSysMLOC.g:568:3: ( rule__PartDefinition__Group_4_1__0 )
                    {
                     before(grammarAccess.getPartDefinitionAccess().getGroup_4_1()); 
                    // InternalSysMLOC.g:569:3: ( rule__PartDefinition__Group_4_1__0 )
                    // InternalSysMLOC.g:569:4: rule__PartDefinition__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PartDefinition__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartDefinitionAccess().getGroup_4_1()); 

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
    // InternalSysMLOC.g:577:1: rule__AttributeUsage__Alternatives_2 : ( ( ';' ) | ( ( rule__AttributeUsage__Group_2_1__0 ) ) );
    public final void rule__AttributeUsage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:581:1: ( ( ';' ) | ( ( rule__AttributeUsage__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSysMLOC.g:582:2: ( ';' )
                    {
                    // InternalSysMLOC.g:582:2: ( ';' )
                    // InternalSysMLOC.g:583:3: ';'
                    {
                     before(grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:588:2: ( ( rule__AttributeUsage__Group_2_1__0 ) )
                    {
                    // InternalSysMLOC.g:588:2: ( ( rule__AttributeUsage__Group_2_1__0 ) )
                    // InternalSysMLOC.g:589:3: ( rule__AttributeUsage__Group_2_1__0 )
                    {
                     before(grammarAccess.getAttributeUsageAccess().getGroup_2_1()); 
                    // InternalSysMLOC.g:590:3: ( rule__AttributeUsage__Group_2_1__0 )
                    // InternalSysMLOC.g:590:4: rule__AttributeUsage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeUsage__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeUsageAccess().getGroup_2_1()); 

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


    // $ANTLR start "rule__Name__Alternatives"
    // InternalSysMLOC.g:598:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:602:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_UNRESTRICTED_NAME) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:603:2: ( RULE_ID )
                    {
                    // InternalSysMLOC.g:603:2: ( RULE_ID )
                    // InternalSysMLOC.g:604:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:609:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalSysMLOC.g:609:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalSysMLOC.g:610:3: RULE_UNRESTRICTED_NAME
                    {
                     before(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 
                    match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1()); 

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


    // $ANTLR start "rule__VisibilityIndicator__Alternatives"
    // InternalSysMLOC.g:619:1: rule__VisibilityIndicator__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__VisibilityIndicator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:623:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:624:2: ( ( 'public' ) )
                    {
                    // InternalSysMLOC.g:624:2: ( ( 'public' ) )
                    // InternalSysMLOC.g:625:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 
                    // InternalSysMLOC.g:626:3: ( 'public' )
                    // InternalSysMLOC.g:626:4: 'public'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:630:2: ( ( 'private' ) )
                    {
                    // InternalSysMLOC.g:630:2: ( ( 'private' ) )
                    // InternalSysMLOC.g:631:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // InternalSysMLOC.g:632:3: ( 'private' )
                    // InternalSysMLOC.g:632:4: 'private'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:636:2: ( ( 'protected' ) )
                    {
                    // InternalSysMLOC.g:636:2: ( ( 'protected' ) )
                    // InternalSysMLOC.g:637:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // InternalSysMLOC.g:638:3: ( 'protected' )
                    // InternalSysMLOC.g:638:4: 'protected'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2()); 

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
    // InternalSysMLOC.g:646:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:650:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSysMLOC.g:651:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:658:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:662:1: ( ( 'package' ) )
            // InternalSysMLOC.g:663:1: ( 'package' )
            {
            // InternalSysMLOC.g:663:1: ( 'package' )
            // InternalSysMLOC.g:664:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

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
    // InternalSysMLOC.g:673:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:677:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSysMLOC.g:678:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:685:1: rule__Package__Group__1__Impl : ( ( rule__Package__DeclaredNameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:689:1: ( ( ( rule__Package__DeclaredNameAssignment_1 ) ) )
            // InternalSysMLOC.g:690:1: ( ( rule__Package__DeclaredNameAssignment_1 ) )
            {
            // InternalSysMLOC.g:690:1: ( ( rule__Package__DeclaredNameAssignment_1 ) )
            // InternalSysMLOC.g:691:2: ( rule__Package__DeclaredNameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getDeclaredNameAssignment_1()); 
            // InternalSysMLOC.g:692:2: ( rule__Package__DeclaredNameAssignment_1 )
            // InternalSysMLOC.g:692:3: rule__Package__DeclaredNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__DeclaredNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getDeclaredNameAssignment_1()); 

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
    // InternalSysMLOC.g:700:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:704:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSysMLOC.g:705:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:712:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:716:1: ( ( '{' ) )
            // InternalSysMLOC.g:717:1: ( '{' )
            {
            // InternalSysMLOC.g:717:1: ( '{' )
            // InternalSysMLOC.g:718:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSysMLOC.g:727:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:731:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSysMLOC.g:732:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:739:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:743:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalSysMLOC.g:744:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalSysMLOC.g:744:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalSysMLOC.g:745:2: ( rule__Package__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            // InternalSysMLOC.g:746:2: ( rule__Package__ElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=14 && LA10_0<=17)||(LA10_0>=21 && LA10_0<=22)||LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSysMLOC.g:746:3: rule__Package__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsAssignment_3()); 

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
    // InternalSysMLOC.g:754:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:758:1: ( rule__Package__Group__4__Impl )
            // InternalSysMLOC.g:759:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:765:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:769:1: ( ( '}' ) )
            // InternalSysMLOC.g:770:1: ( '}' )
            {
            // InternalSysMLOC.g:770:1: ( '}' )
            // InternalSysMLOC.g:771:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 

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
    // InternalSysMLOC.g:781:1: rule__NamespaceImport__Group__0 : rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 ;
    public final void rule__NamespaceImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:785:1: ( rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 )
            // InternalSysMLOC.g:786:2: rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NamespaceImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:793:1: rule__NamespaceImport__Group__0__Impl : ( ( rule__NamespaceImport__VisibilityAssignment_0 ) ) ;
    public final void rule__NamespaceImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:797:1: ( ( ( rule__NamespaceImport__VisibilityAssignment_0 ) ) )
            // InternalSysMLOC.g:798:1: ( ( rule__NamespaceImport__VisibilityAssignment_0 ) )
            {
            // InternalSysMLOC.g:798:1: ( ( rule__NamespaceImport__VisibilityAssignment_0 ) )
            // InternalSysMLOC.g:799:2: ( rule__NamespaceImport__VisibilityAssignment_0 )
            {
             before(grammarAccess.getNamespaceImportAccess().getVisibilityAssignment_0()); 
            // InternalSysMLOC.g:800:2: ( rule__NamespaceImport__VisibilityAssignment_0 )
            // InternalSysMLOC.g:800:3: rule__NamespaceImport__VisibilityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__VisibilityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceImportAccess().getVisibilityAssignment_0()); 

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
    // InternalSysMLOC.g:808:1: rule__NamespaceImport__Group__1 : rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2 ;
    public final void rule__NamespaceImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:812:1: ( rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2 )
            // InternalSysMLOC.g:813:2: rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NamespaceImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:820:1: rule__NamespaceImport__Group__1__Impl : ( 'import' ) ;
    public final void rule__NamespaceImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:824:1: ( ( 'import' ) )
            // InternalSysMLOC.g:825:1: ( 'import' )
            {
            // InternalSysMLOC.g:825:1: ( 'import' )
            // InternalSysMLOC.g:826:2: 'import'
            {
             before(grammarAccess.getNamespaceImportAccess().getImportKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamespaceImportAccess().getImportKeyword_1()); 

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
    // InternalSysMLOC.g:835:1: rule__NamespaceImport__Group__2 : rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3 ;
    public final void rule__NamespaceImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:839:1: ( rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3 )
            // InternalSysMLOC.g:840:2: rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__NamespaceImport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:847:1: rule__NamespaceImport__Group__2__Impl : ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) ) ;
    public final void rule__NamespaceImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:851:1: ( ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:852:1: ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:852:1: ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:853:2: ( rule__NamespaceImport__DeclaredNameAssignment_2 )
            {
             before(grammarAccess.getNamespaceImportAccess().getDeclaredNameAssignment_2()); 
            // InternalSysMLOC.g:854:2: ( rule__NamespaceImport__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:854:3: rule__NamespaceImport__DeclaredNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__DeclaredNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceImportAccess().getDeclaredNameAssignment_2()); 

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
    // InternalSysMLOC.g:862:1: rule__NamespaceImport__Group__3 : rule__NamespaceImport__Group__3__Impl ;
    public final void rule__NamespaceImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:866:1: ( rule__NamespaceImport__Group__3__Impl )
            // InternalSysMLOC.g:867:2: rule__NamespaceImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespaceImport__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:873:1: rule__NamespaceImport__Group__3__Impl : ( ';' ) ;
    public final void rule__NamespaceImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:877:1: ( ( ';' ) )
            // InternalSysMLOC.g:878:1: ( ';' )
            {
            // InternalSysMLOC.g:878:1: ( ';' )
            // InternalSysMLOC.g:879:2: ';'
            {
             before(grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNamespaceImportAccess().getSemicolonKeyword_3()); 

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
    // InternalSysMLOC.g:889:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:893:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalSysMLOC.g:894:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:901:1: rule__Comment__Group__0__Impl : ( 'doc' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:905:1: ( ( 'doc' ) )
            // InternalSysMLOC.g:906:1: ( 'doc' )
            {
            // InternalSysMLOC.g:906:1: ( 'doc' )
            // InternalSysMLOC.g:907:2: 'doc'
            {
             before(grammarAccess.getCommentAccess().getDocKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getDocKeyword_0()); 

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
    // InternalSysMLOC.g:916:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:920:1: ( rule__Comment__Group__1__Impl )
            // InternalSysMLOC.g:921:2: rule__Comment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:927:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:931:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalSysMLOC.g:932:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalSysMLOC.g:932:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalSysMLOC.g:933:2: ( rule__Comment__BodyAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            // InternalSysMLOC.g:934:2: ( rule__Comment__BodyAssignment_1 )
            // InternalSysMLOC.g:934:3: rule__Comment__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getBodyAssignment_1()); 

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
    // InternalSysMLOC.g:943:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:947:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalSysMLOC.g:948:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AttributeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:955:1: rule__AttributeDefinition__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:959:1: ( ( 'attribute' ) )
            // InternalSysMLOC.g:960:1: ( 'attribute' )
            {
            // InternalSysMLOC.g:960:1: ( 'attribute' )
            // InternalSysMLOC.g:961:2: 'attribute'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0()); 

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
    // InternalSysMLOC.g:970:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:974:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalSysMLOC.g:975:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AttributeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:982:1: rule__AttributeDefinition__Group__1__Impl : ( 'def' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:986:1: ( ( 'def' ) )
            // InternalSysMLOC.g:987:1: ( 'def' )
            {
            // InternalSysMLOC.g:987:1: ( 'def' )
            // InternalSysMLOC.g:988:2: 'def'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1()); 

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
    // InternalSysMLOC.g:997:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1001:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalSysMLOC.g:1002:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__AttributeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1009:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1013:1: ( ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:1014:1: ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:1014:1: ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:1015:2: ( rule__AttributeDefinition__DeclaredNameAssignment_2 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameAssignment_2()); 
            // InternalSysMLOC.g:1016:2: ( rule__AttributeDefinition__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:1016:3: rule__AttributeDefinition__DeclaredNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__DeclaredNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameAssignment_2()); 

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
    // InternalSysMLOC.g:1024:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1028:1: ( rule__AttributeDefinition__Group__3__Impl )
            // InternalSysMLOC.g:1029:2: rule__AttributeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1035:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Alternatives_3 ) ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1039:1: ( ( ( rule__AttributeDefinition__Alternatives_3 ) ) )
            // InternalSysMLOC.g:1040:1: ( ( rule__AttributeDefinition__Alternatives_3 ) )
            {
            // InternalSysMLOC.g:1040:1: ( ( rule__AttributeDefinition__Alternatives_3 ) )
            // InternalSysMLOC.g:1041:2: ( rule__AttributeDefinition__Alternatives_3 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getAlternatives_3()); 
            // InternalSysMLOC.g:1042:2: ( rule__AttributeDefinition__Alternatives_3 )
            // InternalSysMLOC.g:1042:3: rule__AttributeDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getAlternatives_3()); 

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
    // InternalSysMLOC.g:1051:1: rule__AttributeDefinition__Group_3_1__0 : rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1 ;
    public final void rule__AttributeDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1055:1: ( rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1 )
            // InternalSysMLOC.g:1056:2: rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__AttributeDefinition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3_1__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1063:1: rule__AttributeDefinition__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1067:1: ( ( '{' ) )
            // InternalSysMLOC.g:1068:1: ( '{' )
            {
            // InternalSysMLOC.g:1068:1: ( '{' )
            // InternalSysMLOC.g:1069:2: '{'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0()); 

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
    // InternalSysMLOC.g:1078:1: rule__AttributeDefinition__Group_3_1__1 : rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2 ;
    public final void rule__AttributeDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1082:1: ( rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2 )
            // InternalSysMLOC.g:1083:2: rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AttributeDefinition__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3_1__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1090:1: rule__AttributeDefinition__Group_3_1__1__Impl : ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* ) ;
    public final void rule__AttributeDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1094:1: ( ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* ) )
            // InternalSysMLOC.g:1095:1: ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* )
            {
            // InternalSysMLOC.g:1095:1: ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* )
            // InternalSysMLOC.g:1096:2: ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )*
            {
             before(grammarAccess.getAttributeDefinitionAccess().getElementsAssignment_3_1_1()); 
            // InternalSysMLOC.g:1097:2: ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=14 && LA11_0<=17)||(LA11_0>=21 && LA11_0<=22)||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSysMLOC.g:1097:3: rule__AttributeDefinition__ElementsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AttributeDefinition__ElementsAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAttributeDefinitionAccess().getElementsAssignment_3_1_1()); 

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
    // InternalSysMLOC.g:1105:1: rule__AttributeDefinition__Group_3_1__2 : rule__AttributeDefinition__Group_3_1__2__Impl ;
    public final void rule__AttributeDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1109:1: ( rule__AttributeDefinition__Group_3_1__2__Impl )
            // InternalSysMLOC.g:1110:2: rule__AttributeDefinition__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1116:1: rule__AttributeDefinition__Group_3_1__2__Impl : ( '}' ) ;
    public final void rule__AttributeDefinition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1120:1: ( ( '}' ) )
            // InternalSysMLOC.g:1121:1: ( '}' )
            {
            // InternalSysMLOC.g:1121:1: ( '}' )
            // InternalSysMLOC.g:1122:2: '}'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2()); 

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
    // InternalSysMLOC.g:1132:1: rule__PartDefinition__Group__0 : rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 ;
    public final void rule__PartDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1136:1: ( rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 )
            // InternalSysMLOC.g:1137:2: rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PartDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1144:1: rule__PartDefinition__Group__0__Impl : ( 'part' ) ;
    public final void rule__PartDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1148:1: ( ( 'part' ) )
            // InternalSysMLOC.g:1149:1: ( 'part' )
            {
            // InternalSysMLOC.g:1149:1: ( 'part' )
            // InternalSysMLOC.g:1150:2: 'part'
            {
             before(grammarAccess.getPartDefinitionAccess().getPartKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPartDefinitionAccess().getPartKeyword_0()); 

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
    // InternalSysMLOC.g:1159:1: rule__PartDefinition__Group__1 : rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 ;
    public final void rule__PartDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1163:1: ( rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 )
            // InternalSysMLOC.g:1164:2: rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PartDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1171:1: rule__PartDefinition__Group__1__Impl : ( 'def' ) ;
    public final void rule__PartDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1175:1: ( ( 'def' ) )
            // InternalSysMLOC.g:1176:1: ( 'def' )
            {
            // InternalSysMLOC.g:1176:1: ( 'def' )
            // InternalSysMLOC.g:1177:2: 'def'
            {
             before(grammarAccess.getPartDefinitionAccess().getDefKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPartDefinitionAccess().getDefKeyword_1()); 

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
    // InternalSysMLOC.g:1186:1: rule__PartDefinition__Group__2 : rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 ;
    public final void rule__PartDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1190:1: ( rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 )
            // InternalSysMLOC.g:1191:2: rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PartDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__3();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1198:1: rule__PartDefinition__Group__2__Impl : ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) ) ;
    public final void rule__PartDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1202:1: ( ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:1203:1: ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:1203:1: ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:1204:2: ( rule__PartDefinition__DeclaredNameAssignment_2 )
            {
             before(grammarAccess.getPartDefinitionAccess().getDeclaredNameAssignment_2()); 
            // InternalSysMLOC.g:1205:2: ( rule__PartDefinition__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:1205:3: rule__PartDefinition__DeclaredNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__DeclaredNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartDefinitionAccess().getDeclaredNameAssignment_2()); 

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
    // InternalSysMLOC.g:1213:1: rule__PartDefinition__Group__3 : rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4 ;
    public final void rule__PartDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1217:1: ( rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4 )
            // InternalSysMLOC.g:1218:2: rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__PartDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__4();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1225:1: rule__PartDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__PartDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1229:1: ( ( ';' ) )
            // InternalSysMLOC.g:1230:1: ( ';' )
            {
            // InternalSysMLOC.g:1230:1: ( ';' )
            // InternalSysMLOC.g:1231:2: ';'
            {
             before(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3()); 

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
    // InternalSysMLOC.g:1240:1: rule__PartDefinition__Group__4 : rule__PartDefinition__Group__4__Impl ;
    public final void rule__PartDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1244:1: ( rule__PartDefinition__Group__4__Impl )
            // InternalSysMLOC.g:1245:2: rule__PartDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1251:1: rule__PartDefinition__Group__4__Impl : ( ( rule__PartDefinition__Alternatives_4 ) ) ;
    public final void rule__PartDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1255:1: ( ( ( rule__PartDefinition__Alternatives_4 ) ) )
            // InternalSysMLOC.g:1256:1: ( ( rule__PartDefinition__Alternatives_4 ) )
            {
            // InternalSysMLOC.g:1256:1: ( ( rule__PartDefinition__Alternatives_4 ) )
            // InternalSysMLOC.g:1257:2: ( rule__PartDefinition__Alternatives_4 )
            {
             before(grammarAccess.getPartDefinitionAccess().getAlternatives_4()); 
            // InternalSysMLOC.g:1258:2: ( rule__PartDefinition__Alternatives_4 )
            // InternalSysMLOC.g:1258:3: rule__PartDefinition__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getPartDefinitionAccess().getAlternatives_4()); 

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
    // InternalSysMLOC.g:1267:1: rule__PartDefinition__Group_4_1__0 : rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1 ;
    public final void rule__PartDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1271:1: ( rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1 )
            // InternalSysMLOC.g:1272:2: rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_7);
            rule__PartDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1279:1: rule__PartDefinition__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__PartDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1283:1: ( ( '{' ) )
            // InternalSysMLOC.g:1284:1: ( '{' )
            {
            // InternalSysMLOC.g:1284:1: ( '{' )
            // InternalSysMLOC.g:1285:2: '{'
            {
             before(grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0()); 

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
    // InternalSysMLOC.g:1294:1: rule__PartDefinition__Group_4_1__1 : rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2 ;
    public final void rule__PartDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1298:1: ( rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2 )
            // InternalSysMLOC.g:1299:2: rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2
            {
            pushFollow(FOLLOW_7);
            rule__PartDefinition__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group_4_1__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1306:1: rule__PartDefinition__Group_4_1__1__Impl : ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* ) ;
    public final void rule__PartDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1310:1: ( ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* ) )
            // InternalSysMLOC.g:1311:1: ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* )
            {
            // InternalSysMLOC.g:1311:1: ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* )
            // InternalSysMLOC.g:1312:2: ( rule__PartDefinition__ElementsAssignment_4_1_1 )*
            {
             before(grammarAccess.getPartDefinitionAccess().getElementsAssignment_4_1_1()); 
            // InternalSysMLOC.g:1313:2: ( rule__PartDefinition__ElementsAssignment_4_1_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=14 && LA12_0<=17)||(LA12_0>=21 && LA12_0<=22)||LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSysMLOC.g:1313:3: rule__PartDefinition__ElementsAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PartDefinition__ElementsAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPartDefinitionAccess().getElementsAssignment_4_1_1()); 

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
    // InternalSysMLOC.g:1321:1: rule__PartDefinition__Group_4_1__2 : rule__PartDefinition__Group_4_1__2__Impl ;
    public final void rule__PartDefinition__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1325:1: ( rule__PartDefinition__Group_4_1__2__Impl )
            // InternalSysMLOC.g:1326:2: rule__PartDefinition__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group_4_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1332:1: rule__PartDefinition__Group_4_1__2__Impl : ( '}' ) ;
    public final void rule__PartDefinition__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1336:1: ( ( '}' ) )
            // InternalSysMLOC.g:1337:1: ( '}' )
            {
            // InternalSysMLOC.g:1337:1: ( '}' )
            // InternalSysMLOC.g:1338:2: '}'
            {
             before(grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_4_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_4_1_2()); 

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
    // InternalSysMLOC.g:1348:1: rule__AttributeUsage__Group__0 : rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1 ;
    public final void rule__AttributeUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1352:1: ( rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1 )
            // InternalSysMLOC.g:1353:2: rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AttributeUsage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1360:1: rule__AttributeUsage__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1364:1: ( ( 'attribute' ) )
            // InternalSysMLOC.g:1365:1: ( 'attribute' )
            {
            // InternalSysMLOC.g:1365:1: ( 'attribute' )
            // InternalSysMLOC.g:1366:2: 'attribute'
            {
             before(grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0()); 

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
    // InternalSysMLOC.g:1375:1: rule__AttributeUsage__Group__1 : rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2 ;
    public final void rule__AttributeUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1379:1: ( rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2 )
            // InternalSysMLOC.g:1380:2: rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AttributeUsage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1387:1: rule__AttributeUsage__Group__1__Impl : ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) ) ;
    public final void rule__AttributeUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1391:1: ( ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) ) )
            // InternalSysMLOC.g:1392:1: ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) )
            {
            // InternalSysMLOC.g:1392:1: ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) )
            // InternalSysMLOC.g:1393:2: ( rule__AttributeUsage__DeclaredNameAssignment_1 )
            {
             before(grammarAccess.getAttributeUsageAccess().getDeclaredNameAssignment_1()); 
            // InternalSysMLOC.g:1394:2: ( rule__AttributeUsage__DeclaredNameAssignment_1 )
            // InternalSysMLOC.g:1394:3: rule__AttributeUsage__DeclaredNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__DeclaredNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeUsageAccess().getDeclaredNameAssignment_1()); 

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
    // InternalSysMLOC.g:1402:1: rule__AttributeUsage__Group__2 : rule__AttributeUsage__Group__2__Impl ;
    public final void rule__AttributeUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1406:1: ( rule__AttributeUsage__Group__2__Impl )
            // InternalSysMLOC.g:1407:2: rule__AttributeUsage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1413:1: rule__AttributeUsage__Group__2__Impl : ( ( rule__AttributeUsage__Alternatives_2 ) ) ;
    public final void rule__AttributeUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1417:1: ( ( ( rule__AttributeUsage__Alternatives_2 ) ) )
            // InternalSysMLOC.g:1418:1: ( ( rule__AttributeUsage__Alternatives_2 ) )
            {
            // InternalSysMLOC.g:1418:1: ( ( rule__AttributeUsage__Alternatives_2 ) )
            // InternalSysMLOC.g:1419:2: ( rule__AttributeUsage__Alternatives_2 )
            {
             before(grammarAccess.getAttributeUsageAccess().getAlternatives_2()); 
            // InternalSysMLOC.g:1420:2: ( rule__AttributeUsage__Alternatives_2 )
            // InternalSysMLOC.g:1420:3: rule__AttributeUsage__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeUsageAccess().getAlternatives_2()); 

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
    // InternalSysMLOC.g:1429:1: rule__AttributeUsage__Group_2_1__0 : rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1 ;
    public final void rule__AttributeUsage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1433:1: ( rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1 )
            // InternalSysMLOC.g:1434:2: rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__AttributeUsage__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group_2_1__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1441:1: rule__AttributeUsage__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeUsage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1445:1: ( ( '{' ) )
            // InternalSysMLOC.g:1446:1: ( '{' )
            {
            // InternalSysMLOC.g:1446:1: ( '{' )
            // InternalSysMLOC.g:1447:2: '{'
            {
             before(grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 

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
    // InternalSysMLOC.g:1456:1: rule__AttributeUsage__Group_2_1__1 : rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2 ;
    public final void rule__AttributeUsage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1460:1: ( rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2 )
            // InternalSysMLOC.g:1461:2: rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AttributeUsage__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group_2_1__2();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1468:1: rule__AttributeUsage__Group_2_1__1__Impl : ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__AttributeUsage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1472:1: ( ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* ) )
            // InternalSysMLOC.g:1473:1: ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* )
            {
            // InternalSysMLOC.g:1473:1: ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* )
            // InternalSysMLOC.g:1474:2: ( rule__AttributeUsage__ElementsAssignment_2_1_1 )*
            {
             before(grammarAccess.getAttributeUsageAccess().getElementsAssignment_2_1_1()); 
            // InternalSysMLOC.g:1475:2: ( rule__AttributeUsage__ElementsAssignment_2_1_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=17)||(LA13_0>=21 && LA13_0<=22)||LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSysMLOC.g:1475:3: rule__AttributeUsage__ElementsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AttributeUsage__ElementsAssignment_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAttributeUsageAccess().getElementsAssignment_2_1_1()); 

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
    // InternalSysMLOC.g:1483:1: rule__AttributeUsage__Group_2_1__2 : rule__AttributeUsage__Group_2_1__2__Impl ;
    public final void rule__AttributeUsage__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1487:1: ( rule__AttributeUsage__Group_2_1__2__Impl )
            // InternalSysMLOC.g:1488:2: rule__AttributeUsage__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeUsage__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1494:1: rule__AttributeUsage__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__AttributeUsage__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1498:1: ( ( '}' ) )
            // InternalSysMLOC.g:1499:1: ( '}' )
            {
            // InternalSysMLOC.g:1499:1: ( '}' )
            // InternalSysMLOC.g:1500:2: '}'
            {
             before(grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 

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


    // $ANTLR start "rule__Qualification__Group__0"
    // InternalSysMLOC.g:1510:1: rule__Qualification__Group__0 : rule__Qualification__Group__0__Impl rule__Qualification__Group__1 ;
    public final void rule__Qualification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1514:1: ( rule__Qualification__Group__0__Impl rule__Qualification__Group__1 )
            // InternalSysMLOC.g:1515:2: rule__Qualification__Group__0__Impl rule__Qualification__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Qualification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualification__Group__0"


    // $ANTLR start "rule__Qualification__Group__0__Impl"
    // InternalSysMLOC.g:1522:1: rule__Qualification__Group__0__Impl : ( ruleName ) ;
    public final void rule__Qualification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1526:1: ( ( ruleName ) )
            // InternalSysMLOC.g:1527:1: ( ruleName )
            {
            // InternalSysMLOC.g:1527:1: ( ruleName )
            // InternalSysMLOC.g:1528:2: ruleName
            {
             before(grammarAccess.getQualificationAccess().getNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualificationAccess().getNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__Qualification__Group__0__Impl"


    // $ANTLR start "rule__Qualification__Group__1"
    // InternalSysMLOC.g:1537:1: rule__Qualification__Group__1 : rule__Qualification__Group__1__Impl ;
    public final void rule__Qualification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1541:1: ( rule__Qualification__Group__1__Impl )
            // InternalSysMLOC.g:1542:2: rule__Qualification__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualification__Group__1"


    // $ANTLR start "rule__Qualification__Group__1__Impl"
    // InternalSysMLOC.g:1548:1: rule__Qualification__Group__1__Impl : ( '::' ) ;
    public final void rule__Qualification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1552:1: ( ( '::' ) )
            // InternalSysMLOC.g:1553:1: ( '::' )
            {
            // InternalSysMLOC.g:1553:1: ( '::' )
            // InternalSysMLOC.g:1554:2: '::'
            {
             before(grammarAccess.getQualificationAccess().getColonColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualificationAccess().getColonColonKeyword_1()); 

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
    // $ANTLR end "rule__Qualification__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSysMLOC.g:1564:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1568:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSysMLOC.g:1569:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1576:1: rule__QualifiedName__Group__0__Impl : ( ( ruleQualification )? ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1580:1: ( ( ( ruleQualification )? ) )
            // InternalSysMLOC.g:1581:1: ( ( ruleQualification )? )
            {
            // InternalSysMLOC.g:1581:1: ( ( ruleQualification )? )
            // InternalSysMLOC.g:1582:2: ( ruleQualification )?
            {
             before(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0()); 
            // InternalSysMLOC.g:1583:2: ( ruleQualification )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==25) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==RULE_UNRESTRICTED_NAME) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==25) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalSysMLOC.g:1583:3: ruleQualification
                    {
                    pushFollow(FOLLOW_2);
                    ruleQualification();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0()); 

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
    // InternalSysMLOC.g:1591:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1595:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSysMLOC.g:1596:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSysMLOC.g:1602:1: rule__QualifiedName__Group__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1606:1: ( ( ruleName ) )
            // InternalSysMLOC.g:1607:1: ( ruleName )
            {
            // InternalSysMLOC.g:1607:1: ( ruleName )
            // InternalSysMLOC.g:1608:2: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1()); 

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


    // $ANTLR start "rule__Namespace__PackagesAssignment"
    // InternalSysMLOC.g:1618:1: rule__Namespace__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Namespace__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1622:1: ( ( rulePackage ) )
            // InternalSysMLOC.g:1623:2: ( rulePackage )
            {
            // InternalSysMLOC.g:1623:2: ( rulePackage )
            // InternalSysMLOC.g:1624:3: rulePackage
            {
             before(grammarAccess.getNamespaceAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getPackagesPackageParserRuleCall_0()); 

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
    // InternalSysMLOC.g:1633:1: rule__Package__DeclaredNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__DeclaredNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1637:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1638:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1638:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1639:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 

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
    // InternalSysMLOC.g:1648:1: rule__Package__ElementsAssignment_3 : ( ruleBaseElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1652:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1653:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1653:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1654:3: ruleBaseElement
            {
             before(grammarAccess.getPackageAccess().getElementsBaseElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsBaseElementParserRuleCall_3_0()); 

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
    // InternalSysMLOC.g:1663:1: rule__NamespaceImport__VisibilityAssignment_0 : ( ruleVisibilityIndicator ) ;
    public final void rule__NamespaceImport__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1667:1: ( ( ruleVisibilityIndicator ) )
            // InternalSysMLOC.g:1668:2: ( ruleVisibilityIndicator )
            {
            // InternalSysMLOC.g:1668:2: ( ruleVisibilityIndicator )
            // InternalSysMLOC.g:1669:3: ruleVisibilityIndicator
            {
             before(grammarAccess.getNamespaceImportAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityIndicator();

            state._fsp--;

             after(grammarAccess.getNamespaceImportAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0()); 

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
    // InternalSysMLOC.g:1678:1: rule__NamespaceImport__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NamespaceImport__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1682:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1683:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1683:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1684:3: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceImportAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNamespaceImportAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 

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
    // InternalSysMLOC.g:1693:1: rule__Comment__BodyAssignment_1 : ( RULE_REGULAR_COMMENT ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1697:1: ( ( RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1698:2: ( RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1698:2: ( RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1699:3: RULE_REGULAR_COMMENT
            {
             before(grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_REGULAR_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getBodyREGULAR_COMMENTTerminalRuleCall_1_0()); 

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
    // InternalSysMLOC.g:1708:1: rule__AttributeDefinition__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__AttributeDefinition__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1712:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1713:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1713:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1714:3: ruleQualifiedName
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 

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
    // InternalSysMLOC.g:1723:1: rule__AttributeDefinition__ElementsAssignment_3_1_1 : ( ruleBaseElement ) ;
    public final void rule__AttributeDefinition__ElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1727:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1728:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1728:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1729:3: ruleBaseElement
            {
             before(grammarAccess.getAttributeDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getElementsBaseElementParserRuleCall_3_1_1_0()); 

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
    // InternalSysMLOC.g:1738:1: rule__PartDefinition__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PartDefinition__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1742:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1743:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1743:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1744:3: ruleQualifiedName
            {
             before(grammarAccess.getPartDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPartDefinitionAccess().getDeclaredNameQualifiedNameParserRuleCall_2_0()); 

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
    // InternalSysMLOC.g:1753:1: rule__PartDefinition__ElementsAssignment_4_1_1 : ( ruleBaseElement ) ;
    public final void rule__PartDefinition__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1757:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1758:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1758:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1759:3: ruleBaseElement
            {
             before(grammarAccess.getPartDefinitionAccess().getElementsBaseElementParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;

             after(grammarAccess.getPartDefinitionAccess().getElementsBaseElementParserRuleCall_4_1_1_0()); 

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
    // InternalSysMLOC.g:1768:1: rule__AttributeUsage__DeclaredNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributeUsage__DeclaredNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1772:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1773:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1773:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1774:3: ruleQualifiedName
            {
             before(grammarAccess.getAttributeUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeUsageAccess().getDeclaredNameQualifiedNameParserRuleCall_1_0()); 

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
    // InternalSysMLOC.g:1783:1: rule__AttributeUsage__ElementsAssignment_2_1_1 : ( ruleBaseElement ) ;
    public final void rule__AttributeUsage__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1787:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1788:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1788:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1789:3: ruleBaseElement
            {
             before(grammarAccess.getAttributeUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;

             after(grammarAccess.getAttributeUsageAccess().getElementsBaseElementParserRuleCall_2_1_1_0()); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000016BC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000163C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});

}