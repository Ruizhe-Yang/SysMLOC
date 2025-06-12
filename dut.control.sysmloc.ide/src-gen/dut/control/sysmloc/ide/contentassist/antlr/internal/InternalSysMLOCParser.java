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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "';'", "'package'", "'{'", "'}'", "'import'", "'doc'", "'attribute'", "'def'", "'part'", "'::'"
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

                if ( (LA1_0==14) ) {
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


    // $ANTLR start "entryRuleTBD"
    // InternalSysMLOC.g:378:1: entryRuleTBD : ruleTBD EOF ;
    public final void entryRuleTBD() throws RecognitionException {
        try {
            // InternalSysMLOC.g:379:1: ( ruleTBD EOF )
            // InternalSysMLOC.g:380:1: ruleTBD EOF
            {
             before(grammarAccess.getTBDRule()); 
            pushFollow(FOLLOW_1);
            ruleTBD();

            state._fsp--;

             after(grammarAccess.getTBDRule()); 
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
    // $ANTLR end "entryRuleTBD"


    // $ANTLR start "ruleTBD"
    // InternalSysMLOC.g:387:1: ruleTBD : ( ( rule__TBD__Group__0 ) ) ;
    public final void ruleTBD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:391:2: ( ( ( rule__TBD__Group__0 ) ) )
            // InternalSysMLOC.g:392:2: ( ( rule__TBD__Group__0 ) )
            {
            // InternalSysMLOC.g:392:2: ( ( rule__TBD__Group__0 ) )
            // InternalSysMLOC.g:393:3: ( rule__TBD__Group__0 )
            {
             before(grammarAccess.getTBDAccess().getGroup()); 
            // InternalSysMLOC.g:394:3: ( rule__TBD__Group__0 )
            // InternalSysMLOC.g:394:4: rule__TBD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TBD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTBDAccess().getGroup()); 

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
    // $ANTLR end "ruleTBD"


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:403:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:404:1: ( ruleName EOF )
            // InternalSysMLOC.g:405:1: ruleName EOF
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
    // InternalSysMLOC.g:412:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:416:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalSysMLOC.g:417:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalSysMLOC.g:417:2: ( ( rule__Name__Alternatives ) )
            // InternalSysMLOC.g:418:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalSysMLOC.g:419:3: ( rule__Name__Alternatives )
            // InternalSysMLOC.g:419:4: rule__Name__Alternatives
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
    // InternalSysMLOC.g:428:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalSysMLOC.g:429:1: ( ruleQualification EOF )
            // InternalSysMLOC.g:430:1: ruleQualification EOF
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
    // InternalSysMLOC.g:437:1: ruleQualification : ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:441:2: ( ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) )
            // InternalSysMLOC.g:442:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            {
            // InternalSysMLOC.g:442:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            // InternalSysMLOC.g:443:3: ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* )
            {
            // InternalSysMLOC.g:443:3: ( ( rule__Qualification__Group__0 ) )
            // InternalSysMLOC.g:444:4: ( rule__Qualification__Group__0 )
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalSysMLOC.g:445:4: ( rule__Qualification__Group__0 )
            // InternalSysMLOC.g:445:5: rule__Qualification__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__Qualification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getGroup()); 

            }

            // InternalSysMLOC.g:448:3: ( ( rule__Qualification__Group__0 )* )
            // InternalSysMLOC.g:449:4: ( rule__Qualification__Group__0 )*
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalSysMLOC.g:450:4: ( rule__Qualification__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==22) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==22) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:450:5: rule__Qualification__Group__0
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
    // InternalSysMLOC.g:460:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:461:1: ( ruleQualifiedName EOF )
            // InternalSysMLOC.g:462:1: ruleQualifiedName EOF
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
    // InternalSysMLOC.g:469:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:473:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSysMLOC.g:474:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSysMLOC.g:474:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSysMLOC.g:475:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSysMLOC.g:476:3: ( rule__QualifiedName__Group__0 )
            // InternalSysMLOC.g:476:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__BaseElement__Alternatives"
    // InternalSysMLOC.g:484:1: rule__BaseElement__Alternatives : ( ( rulePackage ) | ( ruleAnnotatingElement ) | ( ruleImportElement ) | ( ruleDefinitionElement ) | ( ruleUsageElement ) | ( ruleTBD ) );
    public final void rule__BaseElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:488:1: ( ( rulePackage ) | ( ruleAnnotatingElement ) | ( ruleImportElement ) | ( ruleDefinitionElement ) | ( ruleUsageElement ) | ( ruleTBD ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSysMLOC.g:489:2: ( rulePackage )
                    {
                    // InternalSysMLOC.g:489:2: ( rulePackage )
                    // InternalSysMLOC.g:490:3: rulePackage
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
                    // InternalSysMLOC.g:495:2: ( ruleAnnotatingElement )
                    {
                    // InternalSysMLOC.g:495:2: ( ruleAnnotatingElement )
                    // InternalSysMLOC.g:496:3: ruleAnnotatingElement
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
                    // InternalSysMLOC.g:501:2: ( ruleImportElement )
                    {
                    // InternalSysMLOC.g:501:2: ( ruleImportElement )
                    // InternalSysMLOC.g:502:3: ruleImportElement
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
                    // InternalSysMLOC.g:507:2: ( ruleDefinitionElement )
                    {
                    // InternalSysMLOC.g:507:2: ( ruleDefinitionElement )
                    // InternalSysMLOC.g:508:3: ruleDefinitionElement
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
                    // InternalSysMLOC.g:513:2: ( ruleUsageElement )
                    {
                    // InternalSysMLOC.g:513:2: ( ruleUsageElement )
                    // InternalSysMLOC.g:514:3: ruleUsageElement
                    {
                     before(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleUsageElement();

                    state._fsp--;

                     after(grammarAccess.getBaseElementAccess().getUsageElementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSysMLOC.g:519:2: ( ruleTBD )
                    {
                    // InternalSysMLOC.g:519:2: ( ruleTBD )
                    // InternalSysMLOC.g:520:3: ruleTBD
                    {
                     before(grammarAccess.getBaseElementAccess().getTBDParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTBD();

                    state._fsp--;

                     after(grammarAccess.getBaseElementAccess().getTBDParserRuleCall_5()); 

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
    // InternalSysMLOC.g:529:1: rule__DefinitionElement__Alternatives : ( ( ruleAttributeDefinition ) | ( rulePartDefinition ) );
    public final void rule__DefinitionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:533:1: ( ( ruleAttributeDefinition ) | ( rulePartDefinition ) )
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
                    // InternalSysMLOC.g:534:2: ( ruleAttributeDefinition )
                    {
                    // InternalSysMLOC.g:534:2: ( ruleAttributeDefinition )
                    // InternalSysMLOC.g:535:3: ruleAttributeDefinition
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
                    // InternalSysMLOC.g:540:2: ( rulePartDefinition )
                    {
                    // InternalSysMLOC.g:540:2: ( rulePartDefinition )
                    // InternalSysMLOC.g:541:3: rulePartDefinition
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
    // InternalSysMLOC.g:550:1: rule__AttributeDefinition__Alternatives_3 : ( ( ';' ) | ( ( rule__AttributeDefinition__Group_3_1__0 ) ) );
    public final void rule__AttributeDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:554:1: ( ( ';' ) | ( ( rule__AttributeDefinition__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSysMLOC.g:555:2: ( ';' )
                    {
                    // InternalSysMLOC.g:555:2: ( ';' )
                    // InternalSysMLOC.g:556:3: ';'
                    {
                     before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:561:2: ( ( rule__AttributeDefinition__Group_3_1__0 ) )
                    {
                    // InternalSysMLOC.g:561:2: ( ( rule__AttributeDefinition__Group_3_1__0 ) )
                    // InternalSysMLOC.g:562:3: ( rule__AttributeDefinition__Group_3_1__0 )
                    {
                     before(grammarAccess.getAttributeDefinitionAccess().getGroup_3_1()); 
                    // InternalSysMLOC.g:563:3: ( rule__AttributeDefinition__Group_3_1__0 )
                    // InternalSysMLOC.g:563:4: rule__AttributeDefinition__Group_3_1__0
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
    // InternalSysMLOC.g:571:1: rule__PartDefinition__Alternatives_4 : ( ( ';' ) | ( ( rule__PartDefinition__Group_4_1__0 ) ) );
    public final void rule__PartDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:575:1: ( ( ';' ) | ( ( rule__PartDefinition__Group_4_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSysMLOC.g:576:2: ( ';' )
                    {
                    // InternalSysMLOC.g:576:2: ( ';' )
                    // InternalSysMLOC.g:577:3: ';'
                    {
                     before(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:582:2: ( ( rule__PartDefinition__Group_4_1__0 ) )
                    {
                    // InternalSysMLOC.g:582:2: ( ( rule__PartDefinition__Group_4_1__0 ) )
                    // InternalSysMLOC.g:583:3: ( rule__PartDefinition__Group_4_1__0 )
                    {
                     before(grammarAccess.getPartDefinitionAccess().getGroup_4_1()); 
                    // InternalSysMLOC.g:584:3: ( rule__PartDefinition__Group_4_1__0 )
                    // InternalSysMLOC.g:584:4: rule__PartDefinition__Group_4_1__0
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
    // InternalSysMLOC.g:592:1: rule__AttributeUsage__Alternatives_2 : ( ( ';' ) | ( ( rule__AttributeUsage__Group_2_1__0 ) ) );
    public final void rule__AttributeUsage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:596:1: ( ( ';' ) | ( ( rule__AttributeUsage__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSysMLOC.g:597:2: ( ';' )
                    {
                    // InternalSysMLOC.g:597:2: ( ';' )
                    // InternalSysMLOC.g:598:3: ';'
                    {
                     before(grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeUsageAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:603:2: ( ( rule__AttributeUsage__Group_2_1__0 ) )
                    {
                    // InternalSysMLOC.g:603:2: ( ( rule__AttributeUsage__Group_2_1__0 ) )
                    // InternalSysMLOC.g:604:3: ( rule__AttributeUsage__Group_2_1__0 )
                    {
                     before(grammarAccess.getAttributeUsageAccess().getGroup_2_1()); 
                    // InternalSysMLOC.g:605:3: ( rule__AttributeUsage__Group_2_1__0 )
                    // InternalSysMLOC.g:605:4: rule__AttributeUsage__Group_2_1__0
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


    // $ANTLR start "rule__TBD__Alternatives_1"
    // InternalSysMLOC.g:613:1: rule__TBD__Alternatives_1 : ( ( ';' ) | ( ( rule__TBD__Group_1_1__0 ) ) );
    public final void rule__TBD__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:617:1: ( ( ';' ) | ( ( rule__TBD__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSysMLOC.g:618:2: ( ';' )
                    {
                    // InternalSysMLOC.g:618:2: ( ';' )
                    // InternalSysMLOC.g:619:3: ';'
                    {
                     before(grammarAccess.getTBDAccess().getSemicolonKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTBDAccess().getSemicolonKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:624:2: ( ( rule__TBD__Group_1_1__0 ) )
                    {
                    // InternalSysMLOC.g:624:2: ( ( rule__TBD__Group_1_1__0 ) )
                    // InternalSysMLOC.g:625:3: ( rule__TBD__Group_1_1__0 )
                    {
                     before(grammarAccess.getTBDAccess().getGroup_1_1()); 
                    // InternalSysMLOC.g:626:3: ( rule__TBD__Group_1_1__0 )
                    // InternalSysMLOC.g:626:4: rule__TBD__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TBD__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTBDAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__TBD__Alternatives_1"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalSysMLOC.g:634:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:638:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_UNRESTRICTED_NAME) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSysMLOC.g:639:2: ( RULE_ID )
                    {
                    // InternalSysMLOC.g:639:2: ( RULE_ID )
                    // InternalSysMLOC.g:640:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:645:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalSysMLOC.g:645:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalSysMLOC.g:646:3: RULE_UNRESTRICTED_NAME
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


    // $ANTLR start "rule__Package__Group__0"
    // InternalSysMLOC.g:655:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:659:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSysMLOC.g:660:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalSysMLOC.g:667:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:671:1: ( ( 'package' ) )
            // InternalSysMLOC.g:672:1: ( 'package' )
            {
            // InternalSysMLOC.g:672:1: ( 'package' )
            // InternalSysMLOC.g:673:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSysMLOC.g:682:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:686:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSysMLOC.g:687:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalSysMLOC.g:694:1: rule__Package__Group__1__Impl : ( ( rule__Package__DeclaredNameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:698:1: ( ( ( rule__Package__DeclaredNameAssignment_1 ) ) )
            // InternalSysMLOC.g:699:1: ( ( rule__Package__DeclaredNameAssignment_1 ) )
            {
            // InternalSysMLOC.g:699:1: ( ( rule__Package__DeclaredNameAssignment_1 ) )
            // InternalSysMLOC.g:700:2: ( rule__Package__DeclaredNameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getDeclaredNameAssignment_1()); 
            // InternalSysMLOC.g:701:2: ( rule__Package__DeclaredNameAssignment_1 )
            // InternalSysMLOC.g:701:3: rule__Package__DeclaredNameAssignment_1
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
    // InternalSysMLOC.g:709:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:713:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSysMLOC.g:714:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalSysMLOC.g:721:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:725:1: ( ( '{' ) )
            // InternalSysMLOC.g:726:1: ( '{' )
            {
            // InternalSysMLOC.g:726:1: ( '{' )
            // InternalSysMLOC.g:727:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSysMLOC.g:736:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:740:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSysMLOC.g:741:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalSysMLOC.g:748:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:752:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalSysMLOC.g:753:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalSysMLOC.g:753:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalSysMLOC.g:754:2: ( rule__Package__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            // InternalSysMLOC.g:755:2: ( rule__Package__ElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_UNRESTRICTED_NAME)||LA10_0==14||(LA10_0>=18 && LA10_0<=19)||LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSysMLOC.g:755:3: rule__Package__ElementsAssignment_3
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
    // InternalSysMLOC.g:763:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:767:1: ( rule__Package__Group__4__Impl )
            // InternalSysMLOC.g:768:2: rule__Package__Group__4__Impl
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
    // InternalSysMLOC.g:774:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:778:1: ( ( '}' ) )
            // InternalSysMLOC.g:779:1: ( '}' )
            {
            // InternalSysMLOC.g:779:1: ( '}' )
            // InternalSysMLOC.g:780:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSysMLOC.g:790:1: rule__NamespaceImport__Group__0 : rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 ;
    public final void rule__NamespaceImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:794:1: ( rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 )
            // InternalSysMLOC.g:795:2: rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1
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
    // InternalSysMLOC.g:802:1: rule__NamespaceImport__Group__0__Impl : ( ( rule__NamespaceImport__VisibilityAssignment_0 ) ) ;
    public final void rule__NamespaceImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:806:1: ( ( ( rule__NamespaceImport__VisibilityAssignment_0 ) ) )
            // InternalSysMLOC.g:807:1: ( ( rule__NamespaceImport__VisibilityAssignment_0 ) )
            {
            // InternalSysMLOC.g:807:1: ( ( rule__NamespaceImport__VisibilityAssignment_0 ) )
            // InternalSysMLOC.g:808:2: ( rule__NamespaceImport__VisibilityAssignment_0 )
            {
             before(grammarAccess.getNamespaceImportAccess().getVisibilityAssignment_0()); 
            // InternalSysMLOC.g:809:2: ( rule__NamespaceImport__VisibilityAssignment_0 )
            // InternalSysMLOC.g:809:3: rule__NamespaceImport__VisibilityAssignment_0
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
    // InternalSysMLOC.g:817:1: rule__NamespaceImport__Group__1 : rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2 ;
    public final void rule__NamespaceImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:821:1: ( rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2 )
            // InternalSysMLOC.g:822:2: rule__NamespaceImport__Group__1__Impl rule__NamespaceImport__Group__2
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
    // InternalSysMLOC.g:829:1: rule__NamespaceImport__Group__1__Impl : ( 'import' ) ;
    public final void rule__NamespaceImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:833:1: ( ( 'import' ) )
            // InternalSysMLOC.g:834:1: ( 'import' )
            {
            // InternalSysMLOC.g:834:1: ( 'import' )
            // InternalSysMLOC.g:835:2: 'import'
            {
             before(grammarAccess.getNamespaceImportAccess().getImportKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSysMLOC.g:844:1: rule__NamespaceImport__Group__2 : rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3 ;
    public final void rule__NamespaceImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:848:1: ( rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3 )
            // InternalSysMLOC.g:849:2: rule__NamespaceImport__Group__2__Impl rule__NamespaceImport__Group__3
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
    // InternalSysMLOC.g:856:1: rule__NamespaceImport__Group__2__Impl : ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) ) ;
    public final void rule__NamespaceImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:860:1: ( ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:861:1: ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:861:1: ( ( rule__NamespaceImport__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:862:2: ( rule__NamespaceImport__DeclaredNameAssignment_2 )
            {
             before(grammarAccess.getNamespaceImportAccess().getDeclaredNameAssignment_2()); 
            // InternalSysMLOC.g:863:2: ( rule__NamespaceImport__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:863:3: rule__NamespaceImport__DeclaredNameAssignment_2
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
    // InternalSysMLOC.g:871:1: rule__NamespaceImport__Group__3 : rule__NamespaceImport__Group__3__Impl ;
    public final void rule__NamespaceImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:875:1: ( rule__NamespaceImport__Group__3__Impl )
            // InternalSysMLOC.g:876:2: rule__NamespaceImport__Group__3__Impl
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
    // InternalSysMLOC.g:882:1: rule__NamespaceImport__Group__3__Impl : ( ';' ) ;
    public final void rule__NamespaceImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:886:1: ( ( ';' ) )
            // InternalSysMLOC.g:887:1: ( ';' )
            {
            // InternalSysMLOC.g:887:1: ( ';' )
            // InternalSysMLOC.g:888:2: ';'
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
    // InternalSysMLOC.g:898:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:902:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalSysMLOC.g:903:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
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
    // InternalSysMLOC.g:910:1: rule__Comment__Group__0__Impl : ( 'doc' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:914:1: ( ( 'doc' ) )
            // InternalSysMLOC.g:915:1: ( 'doc' )
            {
            // InternalSysMLOC.g:915:1: ( 'doc' )
            // InternalSysMLOC.g:916:2: 'doc'
            {
             before(grammarAccess.getCommentAccess().getDocKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSysMLOC.g:925:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:929:1: ( rule__Comment__Group__1__Impl )
            // InternalSysMLOC.g:930:2: rule__Comment__Group__1__Impl
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
    // InternalSysMLOC.g:936:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:940:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalSysMLOC.g:941:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalSysMLOC.g:941:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalSysMLOC.g:942:2: ( rule__Comment__BodyAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            // InternalSysMLOC.g:943:2: ( rule__Comment__BodyAssignment_1 )
            // InternalSysMLOC.g:943:3: rule__Comment__BodyAssignment_1
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
    // InternalSysMLOC.g:952:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:956:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalSysMLOC.g:957:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
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
    // InternalSysMLOC.g:964:1: rule__AttributeDefinition__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:968:1: ( ( 'attribute' ) )
            // InternalSysMLOC.g:969:1: ( 'attribute' )
            {
            // InternalSysMLOC.g:969:1: ( 'attribute' )
            // InternalSysMLOC.g:970:2: 'attribute'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSysMLOC.g:979:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:983:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalSysMLOC.g:984:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
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
    // InternalSysMLOC.g:991:1: rule__AttributeDefinition__Group__1__Impl : ( 'def' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:995:1: ( ( 'def' ) )
            // InternalSysMLOC.g:996:1: ( 'def' )
            {
            // InternalSysMLOC.g:996:1: ( 'def' )
            // InternalSysMLOC.g:997:2: 'def'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSysMLOC.g:1006:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1010:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalSysMLOC.g:1011:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
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
    // InternalSysMLOC.g:1018:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1022:1: ( ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:1023:1: ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:1023:1: ( ( rule__AttributeDefinition__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:1024:2: ( rule__AttributeDefinition__DeclaredNameAssignment_2 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDeclaredNameAssignment_2()); 
            // InternalSysMLOC.g:1025:2: ( rule__AttributeDefinition__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:1025:3: rule__AttributeDefinition__DeclaredNameAssignment_2
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
    // InternalSysMLOC.g:1033:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1037:1: ( rule__AttributeDefinition__Group__3__Impl )
            // InternalSysMLOC.g:1038:2: rule__AttributeDefinition__Group__3__Impl
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
    // InternalSysMLOC.g:1044:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Alternatives_3 ) ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1048:1: ( ( ( rule__AttributeDefinition__Alternatives_3 ) ) )
            // InternalSysMLOC.g:1049:1: ( ( rule__AttributeDefinition__Alternatives_3 ) )
            {
            // InternalSysMLOC.g:1049:1: ( ( rule__AttributeDefinition__Alternatives_3 ) )
            // InternalSysMLOC.g:1050:2: ( rule__AttributeDefinition__Alternatives_3 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getAlternatives_3()); 
            // InternalSysMLOC.g:1051:2: ( rule__AttributeDefinition__Alternatives_3 )
            // InternalSysMLOC.g:1051:3: rule__AttributeDefinition__Alternatives_3
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
    // InternalSysMLOC.g:1060:1: rule__AttributeDefinition__Group_3_1__0 : rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1 ;
    public final void rule__AttributeDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1064:1: ( rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1 )
            // InternalSysMLOC.g:1065:2: rule__AttributeDefinition__Group_3_1__0__Impl rule__AttributeDefinition__Group_3_1__1
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
    // InternalSysMLOC.g:1072:1: rule__AttributeDefinition__Group_3_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1076:1: ( ( '{' ) )
            // InternalSysMLOC.g:1077:1: ( '{' )
            {
            // InternalSysMLOC.g:1077:1: ( '{' )
            // InternalSysMLOC.g:1078:2: '{'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getLeftCurlyBracketKeyword_3_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSysMLOC.g:1087:1: rule__AttributeDefinition__Group_3_1__1 : rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2 ;
    public final void rule__AttributeDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1091:1: ( rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2 )
            // InternalSysMLOC.g:1092:2: rule__AttributeDefinition__Group_3_1__1__Impl rule__AttributeDefinition__Group_3_1__2
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
    // InternalSysMLOC.g:1099:1: rule__AttributeDefinition__Group_3_1__1__Impl : ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* ) ;
    public final void rule__AttributeDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1103:1: ( ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* ) )
            // InternalSysMLOC.g:1104:1: ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* )
            {
            // InternalSysMLOC.g:1104:1: ( ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )* )
            // InternalSysMLOC.g:1105:2: ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )*
            {
             before(grammarAccess.getAttributeDefinitionAccess().getElementsAssignment_3_1_1()); 
            // InternalSysMLOC.g:1106:2: ( rule__AttributeDefinition__ElementsAssignment_3_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)||LA11_0==14||(LA11_0>=18 && LA11_0<=19)||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSysMLOC.g:1106:3: rule__AttributeDefinition__ElementsAssignment_3_1_1
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
    // InternalSysMLOC.g:1114:1: rule__AttributeDefinition__Group_3_1__2 : rule__AttributeDefinition__Group_3_1__2__Impl ;
    public final void rule__AttributeDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1118:1: ( rule__AttributeDefinition__Group_3_1__2__Impl )
            // InternalSysMLOC.g:1119:2: rule__AttributeDefinition__Group_3_1__2__Impl
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
    // InternalSysMLOC.g:1125:1: rule__AttributeDefinition__Group_3_1__2__Impl : ( '}' ) ;
    public final void rule__AttributeDefinition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1129:1: ( ( '}' ) )
            // InternalSysMLOC.g:1130:1: ( '}' )
            {
            // InternalSysMLOC.g:1130:1: ( '}' )
            // InternalSysMLOC.g:1131:2: '}'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getRightCurlyBracketKeyword_3_1_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSysMLOC.g:1141:1: rule__PartDefinition__Group__0 : rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 ;
    public final void rule__PartDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1145:1: ( rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 )
            // InternalSysMLOC.g:1146:2: rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1
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
    // InternalSysMLOC.g:1153:1: rule__PartDefinition__Group__0__Impl : ( 'part' ) ;
    public final void rule__PartDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1157:1: ( ( 'part' ) )
            // InternalSysMLOC.g:1158:1: ( 'part' )
            {
            // InternalSysMLOC.g:1158:1: ( 'part' )
            // InternalSysMLOC.g:1159:2: 'part'
            {
             before(grammarAccess.getPartDefinitionAccess().getPartKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSysMLOC.g:1168:1: rule__PartDefinition__Group__1 : rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 ;
    public final void rule__PartDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1172:1: ( rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 )
            // InternalSysMLOC.g:1173:2: rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2
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
    // InternalSysMLOC.g:1180:1: rule__PartDefinition__Group__1__Impl : ( 'def' ) ;
    public final void rule__PartDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1184:1: ( ( 'def' ) )
            // InternalSysMLOC.g:1185:1: ( 'def' )
            {
            // InternalSysMLOC.g:1185:1: ( 'def' )
            // InternalSysMLOC.g:1186:2: 'def'
            {
             before(grammarAccess.getPartDefinitionAccess().getDefKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSysMLOC.g:1195:1: rule__PartDefinition__Group__2 : rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 ;
    public final void rule__PartDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1199:1: ( rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 )
            // InternalSysMLOC.g:1200:2: rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3
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
    // InternalSysMLOC.g:1207:1: rule__PartDefinition__Group__2__Impl : ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) ) ;
    public final void rule__PartDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1211:1: ( ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) ) )
            // InternalSysMLOC.g:1212:1: ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) )
            {
            // InternalSysMLOC.g:1212:1: ( ( rule__PartDefinition__DeclaredNameAssignment_2 ) )
            // InternalSysMLOC.g:1213:2: ( rule__PartDefinition__DeclaredNameAssignment_2 )
            {
             before(grammarAccess.getPartDefinitionAccess().getDeclaredNameAssignment_2()); 
            // InternalSysMLOC.g:1214:2: ( rule__PartDefinition__DeclaredNameAssignment_2 )
            // InternalSysMLOC.g:1214:3: rule__PartDefinition__DeclaredNameAssignment_2
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
    // InternalSysMLOC.g:1222:1: rule__PartDefinition__Group__3 : rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4 ;
    public final void rule__PartDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1226:1: ( rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4 )
            // InternalSysMLOC.g:1227:2: rule__PartDefinition__Group__3__Impl rule__PartDefinition__Group__4
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
    // InternalSysMLOC.g:1234:1: rule__PartDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__PartDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1238:1: ( ( ';' ) )
            // InternalSysMLOC.g:1239:1: ( ';' )
            {
            // InternalSysMLOC.g:1239:1: ( ';' )
            // InternalSysMLOC.g:1240:2: ';'
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
    // InternalSysMLOC.g:1249:1: rule__PartDefinition__Group__4 : rule__PartDefinition__Group__4__Impl ;
    public final void rule__PartDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1253:1: ( rule__PartDefinition__Group__4__Impl )
            // InternalSysMLOC.g:1254:2: rule__PartDefinition__Group__4__Impl
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
    // InternalSysMLOC.g:1260:1: rule__PartDefinition__Group__4__Impl : ( ( rule__PartDefinition__Alternatives_4 ) ) ;
    public final void rule__PartDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1264:1: ( ( ( rule__PartDefinition__Alternatives_4 ) ) )
            // InternalSysMLOC.g:1265:1: ( ( rule__PartDefinition__Alternatives_4 ) )
            {
            // InternalSysMLOC.g:1265:1: ( ( rule__PartDefinition__Alternatives_4 ) )
            // InternalSysMLOC.g:1266:2: ( rule__PartDefinition__Alternatives_4 )
            {
             before(grammarAccess.getPartDefinitionAccess().getAlternatives_4()); 
            // InternalSysMLOC.g:1267:2: ( rule__PartDefinition__Alternatives_4 )
            // InternalSysMLOC.g:1267:3: rule__PartDefinition__Alternatives_4
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
    // InternalSysMLOC.g:1276:1: rule__PartDefinition__Group_4_1__0 : rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1 ;
    public final void rule__PartDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1280:1: ( rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1 )
            // InternalSysMLOC.g:1281:2: rule__PartDefinition__Group_4_1__0__Impl rule__PartDefinition__Group_4_1__1
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
    // InternalSysMLOC.g:1288:1: rule__PartDefinition__Group_4_1__0__Impl : ( '{' ) ;
    public final void rule__PartDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1292:1: ( ( '{' ) )
            // InternalSysMLOC.g:1293:1: ( '{' )
            {
            // InternalSysMLOC.g:1293:1: ( '{' )
            // InternalSysMLOC.g:1294:2: '{'
            {
             before(grammarAccess.getPartDefinitionAccess().getLeftCurlyBracketKeyword_4_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSysMLOC.g:1303:1: rule__PartDefinition__Group_4_1__1 : rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2 ;
    public final void rule__PartDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1307:1: ( rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2 )
            // InternalSysMLOC.g:1308:2: rule__PartDefinition__Group_4_1__1__Impl rule__PartDefinition__Group_4_1__2
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
    // InternalSysMLOC.g:1315:1: rule__PartDefinition__Group_4_1__1__Impl : ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* ) ;
    public final void rule__PartDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1319:1: ( ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* ) )
            // InternalSysMLOC.g:1320:1: ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* )
            {
            // InternalSysMLOC.g:1320:1: ( ( rule__PartDefinition__ElementsAssignment_4_1_1 )* )
            // InternalSysMLOC.g:1321:2: ( rule__PartDefinition__ElementsAssignment_4_1_1 )*
            {
             before(grammarAccess.getPartDefinitionAccess().getElementsAssignment_4_1_1()); 
            // InternalSysMLOC.g:1322:2: ( rule__PartDefinition__ElementsAssignment_4_1_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_UNRESTRICTED_NAME)||LA12_0==14||(LA12_0>=18 && LA12_0<=19)||LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSysMLOC.g:1322:3: rule__PartDefinition__ElementsAssignment_4_1_1
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
    // InternalSysMLOC.g:1330:1: rule__PartDefinition__Group_4_1__2 : rule__PartDefinition__Group_4_1__2__Impl ;
    public final void rule__PartDefinition__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1334:1: ( rule__PartDefinition__Group_4_1__2__Impl )
            // InternalSysMLOC.g:1335:2: rule__PartDefinition__Group_4_1__2__Impl
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
    // InternalSysMLOC.g:1341:1: rule__PartDefinition__Group_4_1__2__Impl : ( '}' ) ;
    public final void rule__PartDefinition__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1345:1: ( ( '}' ) )
            // InternalSysMLOC.g:1346:1: ( '}' )
            {
            // InternalSysMLOC.g:1346:1: ( '}' )
            // InternalSysMLOC.g:1347:2: '}'
            {
             before(grammarAccess.getPartDefinitionAccess().getRightCurlyBracketKeyword_4_1_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSysMLOC.g:1357:1: rule__AttributeUsage__Group__0 : rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1 ;
    public final void rule__AttributeUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1361:1: ( rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1 )
            // InternalSysMLOC.g:1362:2: rule__AttributeUsage__Group__0__Impl rule__AttributeUsage__Group__1
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
    // InternalSysMLOC.g:1369:1: rule__AttributeUsage__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1373:1: ( ( 'attribute' ) )
            // InternalSysMLOC.g:1374:1: ( 'attribute' )
            {
            // InternalSysMLOC.g:1374:1: ( 'attribute' )
            // InternalSysMLOC.g:1375:2: 'attribute'
            {
             before(grammarAccess.getAttributeUsageAccess().getAttributeKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSysMLOC.g:1384:1: rule__AttributeUsage__Group__1 : rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2 ;
    public final void rule__AttributeUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1388:1: ( rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2 )
            // InternalSysMLOC.g:1389:2: rule__AttributeUsage__Group__1__Impl rule__AttributeUsage__Group__2
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
    // InternalSysMLOC.g:1396:1: rule__AttributeUsage__Group__1__Impl : ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) ) ;
    public final void rule__AttributeUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1400:1: ( ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) ) )
            // InternalSysMLOC.g:1401:1: ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) )
            {
            // InternalSysMLOC.g:1401:1: ( ( rule__AttributeUsage__DeclaredNameAssignment_1 ) )
            // InternalSysMLOC.g:1402:2: ( rule__AttributeUsage__DeclaredNameAssignment_1 )
            {
             before(grammarAccess.getAttributeUsageAccess().getDeclaredNameAssignment_1()); 
            // InternalSysMLOC.g:1403:2: ( rule__AttributeUsage__DeclaredNameAssignment_1 )
            // InternalSysMLOC.g:1403:3: rule__AttributeUsage__DeclaredNameAssignment_1
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
    // InternalSysMLOC.g:1411:1: rule__AttributeUsage__Group__2 : rule__AttributeUsage__Group__2__Impl ;
    public final void rule__AttributeUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1415:1: ( rule__AttributeUsage__Group__2__Impl )
            // InternalSysMLOC.g:1416:2: rule__AttributeUsage__Group__2__Impl
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
    // InternalSysMLOC.g:1422:1: rule__AttributeUsage__Group__2__Impl : ( ( rule__AttributeUsage__Alternatives_2 ) ) ;
    public final void rule__AttributeUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1426:1: ( ( ( rule__AttributeUsage__Alternatives_2 ) ) )
            // InternalSysMLOC.g:1427:1: ( ( rule__AttributeUsage__Alternatives_2 ) )
            {
            // InternalSysMLOC.g:1427:1: ( ( rule__AttributeUsage__Alternatives_2 ) )
            // InternalSysMLOC.g:1428:2: ( rule__AttributeUsage__Alternatives_2 )
            {
             before(grammarAccess.getAttributeUsageAccess().getAlternatives_2()); 
            // InternalSysMLOC.g:1429:2: ( rule__AttributeUsage__Alternatives_2 )
            // InternalSysMLOC.g:1429:3: rule__AttributeUsage__Alternatives_2
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
    // InternalSysMLOC.g:1438:1: rule__AttributeUsage__Group_2_1__0 : rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1 ;
    public final void rule__AttributeUsage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1442:1: ( rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1 )
            // InternalSysMLOC.g:1443:2: rule__AttributeUsage__Group_2_1__0__Impl rule__AttributeUsage__Group_2_1__1
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
    // InternalSysMLOC.g:1450:1: rule__AttributeUsage__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__AttributeUsage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1454:1: ( ( '{' ) )
            // InternalSysMLOC.g:1455:1: ( '{' )
            {
            // InternalSysMLOC.g:1455:1: ( '{' )
            // InternalSysMLOC.g:1456:2: '{'
            {
             before(grammarAccess.getAttributeUsageAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSysMLOC.g:1465:1: rule__AttributeUsage__Group_2_1__1 : rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2 ;
    public final void rule__AttributeUsage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1469:1: ( rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2 )
            // InternalSysMLOC.g:1470:2: rule__AttributeUsage__Group_2_1__1__Impl rule__AttributeUsage__Group_2_1__2
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
    // InternalSysMLOC.g:1477:1: rule__AttributeUsage__Group_2_1__1__Impl : ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* ) ;
    public final void rule__AttributeUsage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1481:1: ( ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* ) )
            // InternalSysMLOC.g:1482:1: ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* )
            {
            // InternalSysMLOC.g:1482:1: ( ( rule__AttributeUsage__ElementsAssignment_2_1_1 )* )
            // InternalSysMLOC.g:1483:2: ( rule__AttributeUsage__ElementsAssignment_2_1_1 )*
            {
             before(grammarAccess.getAttributeUsageAccess().getElementsAssignment_2_1_1()); 
            // InternalSysMLOC.g:1484:2: ( rule__AttributeUsage__ElementsAssignment_2_1_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_UNRESTRICTED_NAME)||LA13_0==14||(LA13_0>=18 && LA13_0<=19)||LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSysMLOC.g:1484:3: rule__AttributeUsage__ElementsAssignment_2_1_1
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
    // InternalSysMLOC.g:1492:1: rule__AttributeUsage__Group_2_1__2 : rule__AttributeUsage__Group_2_1__2__Impl ;
    public final void rule__AttributeUsage__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1496:1: ( rule__AttributeUsage__Group_2_1__2__Impl )
            // InternalSysMLOC.g:1497:2: rule__AttributeUsage__Group_2_1__2__Impl
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
    // InternalSysMLOC.g:1503:1: rule__AttributeUsage__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__AttributeUsage__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1507:1: ( ( '}' ) )
            // InternalSysMLOC.g:1508:1: ( '}' )
            {
            // InternalSysMLOC.g:1508:1: ( '}' )
            // InternalSysMLOC.g:1509:2: '}'
            {
             before(grammarAccess.getAttributeUsageAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__TBD__Group__0"
    // InternalSysMLOC.g:1519:1: rule__TBD__Group__0 : rule__TBD__Group__0__Impl rule__TBD__Group__1 ;
    public final void rule__TBD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1523:1: ( rule__TBD__Group__0__Impl rule__TBD__Group__1 )
            // InternalSysMLOC.g:1524:2: rule__TBD__Group__0__Impl rule__TBD__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__TBD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TBD__Group__1();

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
    // $ANTLR end "rule__TBD__Group__0"


    // $ANTLR start "rule__TBD__Group__0__Impl"
    // InternalSysMLOC.g:1531:1: rule__TBD__Group__0__Impl : ( ( rule__TBD__TextAssignment_0 ) ) ;
    public final void rule__TBD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1535:1: ( ( ( rule__TBD__TextAssignment_0 ) ) )
            // InternalSysMLOC.g:1536:1: ( ( rule__TBD__TextAssignment_0 ) )
            {
            // InternalSysMLOC.g:1536:1: ( ( rule__TBD__TextAssignment_0 ) )
            // InternalSysMLOC.g:1537:2: ( rule__TBD__TextAssignment_0 )
            {
             before(grammarAccess.getTBDAccess().getTextAssignment_0()); 
            // InternalSysMLOC.g:1538:2: ( rule__TBD__TextAssignment_0 )
            // InternalSysMLOC.g:1538:3: rule__TBD__TextAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TBD__TextAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTBDAccess().getTextAssignment_0()); 

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
    // $ANTLR end "rule__TBD__Group__0__Impl"


    // $ANTLR start "rule__TBD__Group__1"
    // InternalSysMLOC.g:1546:1: rule__TBD__Group__1 : rule__TBD__Group__1__Impl ;
    public final void rule__TBD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1550:1: ( rule__TBD__Group__1__Impl )
            // InternalSysMLOC.g:1551:2: rule__TBD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TBD__Group__1__Impl();

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
    // $ANTLR end "rule__TBD__Group__1"


    // $ANTLR start "rule__TBD__Group__1__Impl"
    // InternalSysMLOC.g:1557:1: rule__TBD__Group__1__Impl : ( ( rule__TBD__Alternatives_1 ) ) ;
    public final void rule__TBD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1561:1: ( ( ( rule__TBD__Alternatives_1 ) ) )
            // InternalSysMLOC.g:1562:1: ( ( rule__TBD__Alternatives_1 ) )
            {
            // InternalSysMLOC.g:1562:1: ( ( rule__TBD__Alternatives_1 ) )
            // InternalSysMLOC.g:1563:2: ( rule__TBD__Alternatives_1 )
            {
             before(grammarAccess.getTBDAccess().getAlternatives_1()); 
            // InternalSysMLOC.g:1564:2: ( rule__TBD__Alternatives_1 )
            // InternalSysMLOC.g:1564:3: rule__TBD__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__TBD__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTBDAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TBD__Group__1__Impl"


    // $ANTLR start "rule__TBD__Group_1_1__0"
    // InternalSysMLOC.g:1573:1: rule__TBD__Group_1_1__0 : rule__TBD__Group_1_1__0__Impl rule__TBD__Group_1_1__1 ;
    public final void rule__TBD__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1577:1: ( rule__TBD__Group_1_1__0__Impl rule__TBD__Group_1_1__1 )
            // InternalSysMLOC.g:1578:2: rule__TBD__Group_1_1__0__Impl rule__TBD__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__TBD__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TBD__Group_1_1__1();

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
    // $ANTLR end "rule__TBD__Group_1_1__0"


    // $ANTLR start "rule__TBD__Group_1_1__0__Impl"
    // InternalSysMLOC.g:1585:1: rule__TBD__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__TBD__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1589:1: ( ( '{' ) )
            // InternalSysMLOC.g:1590:1: ( '{' )
            {
            // InternalSysMLOC.g:1590:1: ( '{' )
            // InternalSysMLOC.g:1591:2: '{'
            {
             before(grammarAccess.getTBDAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTBDAccess().getLeftCurlyBracketKeyword_1_1_0()); 

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
    // $ANTLR end "rule__TBD__Group_1_1__0__Impl"


    // $ANTLR start "rule__TBD__Group_1_1__1"
    // InternalSysMLOC.g:1600:1: rule__TBD__Group_1_1__1 : rule__TBD__Group_1_1__1__Impl rule__TBD__Group_1_1__2 ;
    public final void rule__TBD__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1604:1: ( rule__TBD__Group_1_1__1__Impl rule__TBD__Group_1_1__2 )
            // InternalSysMLOC.g:1605:2: rule__TBD__Group_1_1__1__Impl rule__TBD__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__TBD__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TBD__Group_1_1__2();

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
    // $ANTLR end "rule__TBD__Group_1_1__1"


    // $ANTLR start "rule__TBD__Group_1_1__1__Impl"
    // InternalSysMLOC.g:1612:1: rule__TBD__Group_1_1__1__Impl : ( ( rule__TBD__ElementsAssignment_1_1_1 )* ) ;
    public final void rule__TBD__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1616:1: ( ( ( rule__TBD__ElementsAssignment_1_1_1 )* ) )
            // InternalSysMLOC.g:1617:1: ( ( rule__TBD__ElementsAssignment_1_1_1 )* )
            {
            // InternalSysMLOC.g:1617:1: ( ( rule__TBD__ElementsAssignment_1_1_1 )* )
            // InternalSysMLOC.g:1618:2: ( rule__TBD__ElementsAssignment_1_1_1 )*
            {
             before(grammarAccess.getTBDAccess().getElementsAssignment_1_1_1()); 
            // InternalSysMLOC.g:1619:2: ( rule__TBD__ElementsAssignment_1_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)||LA14_0==14||(LA14_0>=18 && LA14_0<=19)||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSysMLOC.g:1619:3: rule__TBD__ElementsAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TBD__ElementsAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTBDAccess().getElementsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__TBD__Group_1_1__1__Impl"


    // $ANTLR start "rule__TBD__Group_1_1__2"
    // InternalSysMLOC.g:1627:1: rule__TBD__Group_1_1__2 : rule__TBD__Group_1_1__2__Impl ;
    public final void rule__TBD__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1631:1: ( rule__TBD__Group_1_1__2__Impl )
            // InternalSysMLOC.g:1632:2: rule__TBD__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TBD__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__TBD__Group_1_1__2"


    // $ANTLR start "rule__TBD__Group_1_1__2__Impl"
    // InternalSysMLOC.g:1638:1: rule__TBD__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__TBD__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1642:1: ( ( '}' ) )
            // InternalSysMLOC.g:1643:1: ( '}' )
            {
            // InternalSysMLOC.g:1643:1: ( '}' )
            // InternalSysMLOC.g:1644:2: '}'
            {
             before(grammarAccess.getTBDAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTBDAccess().getRightCurlyBracketKeyword_1_1_2()); 

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
    // $ANTLR end "rule__TBD__Group_1_1__2__Impl"


    // $ANTLR start "rule__Qualification__Group__0"
    // InternalSysMLOC.g:1654:1: rule__Qualification__Group__0 : rule__Qualification__Group__0__Impl rule__Qualification__Group__1 ;
    public final void rule__Qualification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1658:1: ( rule__Qualification__Group__0__Impl rule__Qualification__Group__1 )
            // InternalSysMLOC.g:1659:2: rule__Qualification__Group__0__Impl rule__Qualification__Group__1
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
    // InternalSysMLOC.g:1666:1: rule__Qualification__Group__0__Impl : ( ruleName ) ;
    public final void rule__Qualification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1670:1: ( ( ruleName ) )
            // InternalSysMLOC.g:1671:1: ( ruleName )
            {
            // InternalSysMLOC.g:1671:1: ( ruleName )
            // InternalSysMLOC.g:1672:2: ruleName
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
    // InternalSysMLOC.g:1681:1: rule__Qualification__Group__1 : rule__Qualification__Group__1__Impl ;
    public final void rule__Qualification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1685:1: ( rule__Qualification__Group__1__Impl )
            // InternalSysMLOC.g:1686:2: rule__Qualification__Group__1__Impl
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
    // InternalSysMLOC.g:1692:1: rule__Qualification__Group__1__Impl : ( '::' ) ;
    public final void rule__Qualification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1696:1: ( ( '::' ) )
            // InternalSysMLOC.g:1697:1: ( '::' )
            {
            // InternalSysMLOC.g:1697:1: ( '::' )
            // InternalSysMLOC.g:1698:2: '::'
            {
             before(grammarAccess.getQualificationAccess().getColonColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSysMLOC.g:1708:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1712:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSysMLOC.g:1713:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalSysMLOC.g:1720:1: rule__QualifiedName__Group__0__Impl : ( ( ruleQualification )? ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1724:1: ( ( ( ruleQualification )? ) )
            // InternalSysMLOC.g:1725:1: ( ( ruleQualification )? )
            {
            // InternalSysMLOC.g:1725:1: ( ( ruleQualification )? )
            // InternalSysMLOC.g:1726:2: ( ruleQualification )?
            {
             before(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0()); 
            // InternalSysMLOC.g:1727:2: ( ruleQualification )?
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
                    // InternalSysMLOC.g:1727:3: ruleQualification
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
    // InternalSysMLOC.g:1735:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1739:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSysMLOC.g:1740:2: rule__QualifiedName__Group__1__Impl
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
    // InternalSysMLOC.g:1746:1: rule__QualifiedName__Group__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1750:1: ( ( ruleName ) )
            // InternalSysMLOC.g:1751:1: ( ruleName )
            {
            // InternalSysMLOC.g:1751:1: ( ruleName )
            // InternalSysMLOC.g:1752:2: ruleName
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
    // InternalSysMLOC.g:1762:1: rule__Namespace__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Namespace__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1766:1: ( ( rulePackage ) )
            // InternalSysMLOC.g:1767:2: ( rulePackage )
            {
            // InternalSysMLOC.g:1767:2: ( rulePackage )
            // InternalSysMLOC.g:1768:3: rulePackage
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
    // InternalSysMLOC.g:1777:1: rule__Package__DeclaredNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__DeclaredNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1781:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1782:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1782:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1783:3: ruleQualifiedName
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
    // InternalSysMLOC.g:1792:1: rule__Package__ElementsAssignment_3 : ( ruleBaseElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1796:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1797:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1797:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1798:3: ruleBaseElement
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
    // InternalSysMLOC.g:1807:1: rule__NamespaceImport__VisibilityAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__NamespaceImport__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1811:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1812:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1812:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1813:3: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceImportAccess().getVisibilityQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNamespaceImportAccess().getVisibilityQualifiedNameParserRuleCall_0_0()); 

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
    // InternalSysMLOC.g:1822:1: rule__NamespaceImport__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NamespaceImport__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1826:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1827:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1827:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1828:3: ruleQualifiedName
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
    // InternalSysMLOC.g:1837:1: rule__Comment__BodyAssignment_1 : ( RULE_REGULAR_COMMENT ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1841:1: ( ( RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1842:2: ( RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1842:2: ( RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1843:3: RULE_REGULAR_COMMENT
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
    // InternalSysMLOC.g:1852:1: rule__AttributeDefinition__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__AttributeDefinition__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1856:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1857:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1857:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1858:3: ruleQualifiedName
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
    // InternalSysMLOC.g:1867:1: rule__AttributeDefinition__ElementsAssignment_3_1_1 : ( ruleBaseElement ) ;
    public final void rule__AttributeDefinition__ElementsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1871:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1872:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1872:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1873:3: ruleBaseElement
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
    // InternalSysMLOC.g:1882:1: rule__PartDefinition__DeclaredNameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PartDefinition__DeclaredNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1886:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1887:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1887:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1888:3: ruleQualifiedName
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
    // InternalSysMLOC.g:1897:1: rule__PartDefinition__ElementsAssignment_4_1_1 : ( ruleBaseElement ) ;
    public final void rule__PartDefinition__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1901:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1902:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1902:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1903:3: ruleBaseElement
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
    // InternalSysMLOC.g:1912:1: rule__AttributeUsage__DeclaredNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributeUsage__DeclaredNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1916:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1917:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1917:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1918:3: ruleQualifiedName
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
    // InternalSysMLOC.g:1927:1: rule__AttributeUsage__ElementsAssignment_2_1_1 : ( ruleBaseElement ) ;
    public final void rule__AttributeUsage__ElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1931:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1932:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1932:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1933:3: ruleBaseElement
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


    // $ANTLR start "rule__TBD__TextAssignment_0"
    // InternalSysMLOC.g:1942:1: rule__TBD__TextAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__TBD__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1946:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1947:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1947:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1948:3: ruleQualifiedName
            {
             before(grammarAccess.getTBDAccess().getTextQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTBDAccess().getTextQualifiedNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TBD__TextAssignment_0"


    // $ANTLR start "rule__TBD__ElementsAssignment_1_1_1"
    // InternalSysMLOC.g:1957:1: rule__TBD__ElementsAssignment_1_1_1 : ( ruleBaseElement ) ;
    public final void rule__TBD__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1961:1: ( ( ruleBaseElement ) )
            // InternalSysMLOC.g:1962:2: ( ruleBaseElement )
            {
            // InternalSysMLOC.g:1962:2: ( ruleBaseElement )
            // InternalSysMLOC.g:1963:3: ruleBaseElement
            {
             before(grammarAccess.getTBDAccess().getElementsBaseElementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseElement();

            state._fsp--;

             after(grammarAccess.getTBDAccess().getElementsBaseElementParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__TBD__ElementsAssignment_1_1_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\2\uffff\2\15\1\4\2\uffff\1\4\2\uffff\2\15\1\4";
    static final String dfa_3s = "\1\25\2\uffff\2\26\1\24\2\uffff\1\5\2\uffff\2\26\1\5";
    static final String dfa_4s = "\1\uffff\1\1\1\2\3\uffff\1\4\1\3\1\uffff\1\6\1\5\3\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\10\uffff\1\1\3\uffff\1\2\1\5\1\uffff\1\6",
            "",
            "",
            "\1\11\1\uffff\1\11\1\uffff\1\7\4\uffff\1\10",
            "\1\11\1\uffff\1\11\1\uffff\1\7\4\uffff\1\10",
            "\2\12\16\uffff\1\6",
            "",
            "",
            "\1\13\1\14",
            "",
            "",
            "\1\11\1\uffff\1\11\1\uffff\1\7\4\uffff\1\15",
            "\1\11\1\uffff\1\11\1\uffff\1\7\4\uffff\1\15",
            "\1\13\1\14"
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
            return "484:1: rule__BaseElement__Alternatives : ( ( rulePackage ) | ( ruleAnnotatingElement ) | ( ruleImportElement ) | ( ruleDefinitionElement ) | ( ruleUsageElement ) | ( ruleTBD ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000002D4030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000002C4032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}