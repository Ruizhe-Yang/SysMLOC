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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_REGULAR_COMMENT", "RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_STRING_VALUE", "RULE_ML_NOTE", "RULE_SL_NOTE", "RULE_WS", "'package'", "'{'", "'}'", "'doc'", "'import'", "';'", "'part'", "'def'", "'::'"
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

                if ( (LA1_0==13) ) {
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


    // $ANTLR start "entryRuleType"
    // InternalSysMLOC.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSysMLOC.g:79:1: ( ruleType EOF )
            // InternalSysMLOC.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSysMLOC.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSysMLOC.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSysMLOC.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalSysMLOC.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSysMLOC.g:94:3: ( rule__Type__Alternatives )
            // InternalSysMLOC.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePackage"
    // InternalSysMLOC.g:103:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:104:1: ( rulePackage EOF )
            // InternalSysMLOC.g:105:1: rulePackage EOF
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
    // InternalSysMLOC.g:112:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:116:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSysMLOC.g:117:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSysMLOC.g:117:2: ( ( rule__Package__Group__0 ) )
            // InternalSysMLOC.g:118:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSysMLOC.g:119:3: ( rule__Package__Group__0 )
            // InternalSysMLOC.g:119:4: rule__Package__Group__0
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


    // $ANTLR start "entryRuleComment"
    // InternalSysMLOC.g:128:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalSysMLOC.g:129:1: ( ruleComment EOF )
            // InternalSysMLOC.g:130:1: ruleComment EOF
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
    // InternalSysMLOC.g:137:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:141:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalSysMLOC.g:142:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalSysMLOC.g:142:2: ( ( rule__Comment__Group__0 ) )
            // InternalSysMLOC.g:143:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalSysMLOC.g:144:3: ( rule__Comment__Group__0 )
            // InternalSysMLOC.g:144:4: rule__Comment__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalSysMLOC.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalSysMLOC.g:154:1: ( ruleImport EOF )
            // InternalSysMLOC.g:155:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSysMLOC.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalSysMLOC.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalSysMLOC.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalSysMLOC.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalSysMLOC.g:169:3: ( rule__Import__Group__0 )
            // InternalSysMLOC.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePartUsage"
    // InternalSysMLOC.g:178:1: entryRulePartUsage : rulePartUsage EOF ;
    public final void entryRulePartUsage() throws RecognitionException {
        try {
            // InternalSysMLOC.g:179:1: ( rulePartUsage EOF )
            // InternalSysMLOC.g:180:1: rulePartUsage EOF
            {
             before(grammarAccess.getPartUsageRule()); 
            pushFollow(FOLLOW_1);
            rulePartUsage();

            state._fsp--;

             after(grammarAccess.getPartUsageRule()); 
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
    // $ANTLR end "entryRulePartUsage"


    // $ANTLR start "rulePartUsage"
    // InternalSysMLOC.g:187:1: rulePartUsage : ( ( rule__PartUsage__Group__0 ) ) ;
    public final void rulePartUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:191:2: ( ( ( rule__PartUsage__Group__0 ) ) )
            // InternalSysMLOC.g:192:2: ( ( rule__PartUsage__Group__0 ) )
            {
            // InternalSysMLOC.g:192:2: ( ( rule__PartUsage__Group__0 ) )
            // InternalSysMLOC.g:193:3: ( rule__PartUsage__Group__0 )
            {
             before(grammarAccess.getPartUsageAccess().getGroup()); 
            // InternalSysMLOC.g:194:3: ( rule__PartUsage__Group__0 )
            // InternalSysMLOC.g:194:4: rule__PartUsage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartUsageAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePartDefinition"
    // InternalSysMLOC.g:203:1: entryRulePartDefinition : rulePartDefinition EOF ;
    public final void entryRulePartDefinition() throws RecognitionException {
        try {
            // InternalSysMLOC.g:204:1: ( rulePartDefinition EOF )
            // InternalSysMLOC.g:205:1: rulePartDefinition EOF
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
    // InternalSysMLOC.g:212:1: rulePartDefinition : ( ( rule__PartDefinition__Group__0 ) ) ;
    public final void rulePartDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:216:2: ( ( ( rule__PartDefinition__Group__0 ) ) )
            // InternalSysMLOC.g:217:2: ( ( rule__PartDefinition__Group__0 ) )
            {
            // InternalSysMLOC.g:217:2: ( ( rule__PartDefinition__Group__0 ) )
            // InternalSysMLOC.g:218:3: ( rule__PartDefinition__Group__0 )
            {
             before(grammarAccess.getPartDefinitionAccess().getGroup()); 
            // InternalSysMLOC.g:219:3: ( rule__PartDefinition__Group__0 )
            // InternalSysMLOC.g:219:4: rule__PartDefinition__Group__0
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


    // $ANTLR start "entryRuleName"
    // InternalSysMLOC.g:228:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:229:1: ( ruleName EOF )
            // InternalSysMLOC.g:230:1: ruleName EOF
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
    // InternalSysMLOC.g:237:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:241:2: ( ( ( rule__Name__Alternatives ) ) )
            // InternalSysMLOC.g:242:2: ( ( rule__Name__Alternatives ) )
            {
            // InternalSysMLOC.g:242:2: ( ( rule__Name__Alternatives ) )
            // InternalSysMLOC.g:243:3: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // InternalSysMLOC.g:244:3: ( rule__Name__Alternatives )
            // InternalSysMLOC.g:244:4: rule__Name__Alternatives
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
    // InternalSysMLOC.g:253:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalSysMLOC.g:254:1: ( ruleQualification EOF )
            // InternalSysMLOC.g:255:1: ruleQualification EOF
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
    // InternalSysMLOC.g:262:1: ruleQualification : ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:266:2: ( ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) ) )
            // InternalSysMLOC.g:267:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            {
            // InternalSysMLOC.g:267:2: ( ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* ) )
            // InternalSysMLOC.g:268:3: ( ( rule__Qualification__Group__0 ) ) ( ( rule__Qualification__Group__0 )* )
            {
            // InternalSysMLOC.g:268:3: ( ( rule__Qualification__Group__0 ) )
            // InternalSysMLOC.g:269:4: ( rule__Qualification__Group__0 )
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalSysMLOC.g:270:4: ( rule__Qualification__Group__0 )
            // InternalSysMLOC.g:270:5: rule__Qualification__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__Qualification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getGroup()); 

            }

            // InternalSysMLOC.g:273:3: ( ( rule__Qualification__Group__0 )* )
            // InternalSysMLOC.g:274:4: ( rule__Qualification__Group__0 )*
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalSysMLOC.g:275:4: ( rule__Qualification__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==21) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==RULE_UNRESTRICTED_NAME) ) {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==21) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalSysMLOC.g:275:5: rule__Qualification__Group__0
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
    // InternalSysMLOC.g:285:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSysMLOC.g:286:1: ( ruleQualifiedName EOF )
            // InternalSysMLOC.g:287:1: ruleQualifiedName EOF
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
    // InternalSysMLOC.g:294:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:298:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSysMLOC.g:299:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSysMLOC.g:299:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSysMLOC.g:300:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSysMLOC.g:301:3: ( rule__QualifiedName__Group__0 )
            // InternalSysMLOC.g:301:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSysMLOC.g:309:1: rule__Type__Alternatives : ( ( rulePackage ) | ( ruleComment ) | ( ruleImport ) | ( rulePartUsage ) | ( rulePartDefinition ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:313:1: ( ( rulePackage ) | ( ruleComment ) | ( ruleImport ) | ( rulePartUsage ) | ( rulePartDefinition ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=RULE_ID && LA3_4<=RULE_UNRESTRICTED_NAME)) ) {
                    alt3=4;
                }
                else if ( (LA3_4==20) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSysMLOC.g:314:2: ( rulePackage )
                    {
                    // InternalSysMLOC.g:314:2: ( rulePackage )
                    // InternalSysMLOC.g:315:3: rulePackage
                    {
                     before(grammarAccess.getTypeAccess().getPackageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPackageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:320:2: ( ruleComment )
                    {
                    // InternalSysMLOC.g:320:2: ( ruleComment )
                    // InternalSysMLOC.g:321:3: ruleComment
                    {
                     before(grammarAccess.getTypeAccess().getCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCommentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSysMLOC.g:326:2: ( ruleImport )
                    {
                    // InternalSysMLOC.g:326:2: ( ruleImport )
                    // InternalSysMLOC.g:327:3: ruleImport
                    {
                     before(grammarAccess.getTypeAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSysMLOC.g:332:2: ( rulePartUsage )
                    {
                    // InternalSysMLOC.g:332:2: ( rulePartUsage )
                    // InternalSysMLOC.g:333:3: rulePartUsage
                    {
                     before(grammarAccess.getTypeAccess().getPartUsageParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePartUsage();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPartUsageParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSysMLOC.g:338:2: ( rulePartDefinition )
                    {
                    // InternalSysMLOC.g:338:2: ( rulePartDefinition )
                    // InternalSysMLOC.g:339:3: rulePartDefinition
                    {
                     before(grammarAccess.getTypeAccess().getPartDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePartDefinition();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPartDefinitionParserRuleCall_4()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Name__Alternatives"
    // InternalSysMLOC.g:348:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:352:1: ( ( RULE_ID ) | ( RULE_UNRESTRICTED_NAME ) )
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
                    // InternalSysMLOC.g:353:2: ( RULE_ID )
                    {
                    // InternalSysMLOC.g:353:2: ( RULE_ID )
                    // InternalSysMLOC.g:354:3: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSysMLOC.g:359:2: ( RULE_UNRESTRICTED_NAME )
                    {
                    // InternalSysMLOC.g:359:2: ( RULE_UNRESTRICTED_NAME )
                    // InternalSysMLOC.g:360:3: RULE_UNRESTRICTED_NAME
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
    // InternalSysMLOC.g:369:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:373:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSysMLOC.g:374:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalSysMLOC.g:381:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:385:1: ( ( 'package' ) )
            // InternalSysMLOC.g:386:1: ( 'package' )
            {
            // InternalSysMLOC.g:386:1: ( 'package' )
            // InternalSysMLOC.g:387:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalSysMLOC.g:396:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:400:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSysMLOC.g:401:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalSysMLOC.g:408:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:412:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalSysMLOC.g:413:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalSysMLOC.g:413:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalSysMLOC.g:414:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalSysMLOC.g:415:2: ( rule__Package__NameAssignment_1 )
            // InternalSysMLOC.g:415:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalSysMLOC.g:423:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:427:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSysMLOC.g:428:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalSysMLOC.g:435:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:439:1: ( ( '{' ) )
            // InternalSysMLOC.g:440:1: ( '{' )
            {
            // InternalSysMLOC.g:440:1: ( '{' )
            // InternalSysMLOC.g:441:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSysMLOC.g:450:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:454:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSysMLOC.g:455:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalSysMLOC.g:462:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:466:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalSysMLOC.g:467:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalSysMLOC.g:467:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalSysMLOC.g:468:2: ( rule__Package__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            // InternalSysMLOC.g:469:2: ( rule__Package__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_UNRESTRICTED_NAME)||LA5_0==13||LA5_0==16||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSysMLOC.g:469:3: rule__Package__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalSysMLOC.g:477:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:481:1: ( rule__Package__Group__4__Impl )
            // InternalSysMLOC.g:482:2: rule__Package__Group__4__Impl
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
    // InternalSysMLOC.g:488:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:492:1: ( ( '}' ) )
            // InternalSysMLOC.g:493:1: ( '}' )
            {
            // InternalSysMLOC.g:493:1: ( '}' )
            // InternalSysMLOC.g:494:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__Comment__Group__0"
    // InternalSysMLOC.g:504:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:508:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalSysMLOC.g:509:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSysMLOC.g:516:1: rule__Comment__Group__0__Impl : ( 'doc' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:520:1: ( ( 'doc' ) )
            // InternalSysMLOC.g:521:1: ( 'doc' )
            {
            // InternalSysMLOC.g:521:1: ( 'doc' )
            // InternalSysMLOC.g:522:2: 'doc'
            {
             before(grammarAccess.getCommentAccess().getDocKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSysMLOC.g:531:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:535:1: ( rule__Comment__Group__1__Impl )
            // InternalSysMLOC.g:536:2: rule__Comment__Group__1__Impl
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
    // InternalSysMLOC.g:542:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__BodyAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:546:1: ( ( ( rule__Comment__BodyAssignment_1 ) ) )
            // InternalSysMLOC.g:547:1: ( ( rule__Comment__BodyAssignment_1 ) )
            {
            // InternalSysMLOC.g:547:1: ( ( rule__Comment__BodyAssignment_1 ) )
            // InternalSysMLOC.g:548:2: ( rule__Comment__BodyAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getBodyAssignment_1()); 
            // InternalSysMLOC.g:549:2: ( rule__Comment__BodyAssignment_1 )
            // InternalSysMLOC.g:549:3: rule__Comment__BodyAssignment_1
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalSysMLOC.g:558:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:562:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSysMLOC.g:563:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalSysMLOC.g:570:1: rule__Import__Group__0__Impl : ( ( rule__Import__VisibilityAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:574:1: ( ( ( rule__Import__VisibilityAssignment_0 ) ) )
            // InternalSysMLOC.g:575:1: ( ( rule__Import__VisibilityAssignment_0 ) )
            {
            // InternalSysMLOC.g:575:1: ( ( rule__Import__VisibilityAssignment_0 ) )
            // InternalSysMLOC.g:576:2: ( rule__Import__VisibilityAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getVisibilityAssignment_0()); 
            // InternalSysMLOC.g:577:2: ( rule__Import__VisibilityAssignment_0 )
            // InternalSysMLOC.g:577:3: rule__Import__VisibilityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Import__VisibilityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalSysMLOC.g:585:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:589:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalSysMLOC.g:590:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalSysMLOC.g:597:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:601:1: ( ( 'import' ) )
            // InternalSysMLOC.g:602:1: ( 'import' )
            {
            // InternalSysMLOC.g:602:1: ( 'import' )
            // InternalSysMLOC.g:603:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalSysMLOC.g:612:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:616:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalSysMLOC.g:617:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalSysMLOC.g:624:1: rule__Import__Group__2__Impl : ( ( rule__Import__NameAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:628:1: ( ( ( rule__Import__NameAssignment_2 ) ) )
            // InternalSysMLOC.g:629:1: ( ( rule__Import__NameAssignment_2 ) )
            {
            // InternalSysMLOC.g:629:1: ( ( rule__Import__NameAssignment_2 ) )
            // InternalSysMLOC.g:630:2: ( rule__Import__NameAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_2()); 
            // InternalSysMLOC.g:631:2: ( rule__Import__NameAssignment_2 )
            // InternalSysMLOC.g:631:3: rule__Import__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalSysMLOC.g:639:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:643:1: ( rule__Import__Group__3__Impl )
            // InternalSysMLOC.g:644:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__3__Impl();

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
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalSysMLOC.g:650:1: rule__Import__Group__3__Impl : ( ';' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:654:1: ( ( ';' ) )
            // InternalSysMLOC.g:655:1: ( ';' )
            {
            // InternalSysMLOC.g:655:1: ( ';' )
            // InternalSysMLOC.g:656:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__PartUsage__Group__0"
    // InternalSysMLOC.g:666:1: rule__PartUsage__Group__0 : rule__PartUsage__Group__0__Impl rule__PartUsage__Group__1 ;
    public final void rule__PartUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:670:1: ( rule__PartUsage__Group__0__Impl rule__PartUsage__Group__1 )
            // InternalSysMLOC.g:671:2: rule__PartUsage__Group__0__Impl rule__PartUsage__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PartUsage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__1();

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
    // $ANTLR end "rule__PartUsage__Group__0"


    // $ANTLR start "rule__PartUsage__Group__0__Impl"
    // InternalSysMLOC.g:678:1: rule__PartUsage__Group__0__Impl : ( 'part' ) ;
    public final void rule__PartUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:682:1: ( ( 'part' ) )
            // InternalSysMLOC.g:683:1: ( 'part' )
            {
            // InternalSysMLOC.g:683:1: ( 'part' )
            // InternalSysMLOC.g:684:2: 'part'
            {
             before(grammarAccess.getPartUsageAccess().getPartKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPartUsageAccess().getPartKeyword_0()); 

            }


            }

        }
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
    // InternalSysMLOC.g:693:1: rule__PartUsage__Group__1 : rule__PartUsage__Group__1__Impl rule__PartUsage__Group__2 ;
    public final void rule__PartUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:697:1: ( rule__PartUsage__Group__1__Impl rule__PartUsage__Group__2 )
            // InternalSysMLOC.g:698:2: rule__PartUsage__Group__1__Impl rule__PartUsage__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PartUsage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__2();

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
    // $ANTLR end "rule__PartUsage__Group__1"


    // $ANTLR start "rule__PartUsage__Group__1__Impl"
    // InternalSysMLOC.g:705:1: rule__PartUsage__Group__1__Impl : ( ( rule__PartUsage__NameAssignment_1 ) ) ;
    public final void rule__PartUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:709:1: ( ( ( rule__PartUsage__NameAssignment_1 ) ) )
            // InternalSysMLOC.g:710:1: ( ( rule__PartUsage__NameAssignment_1 ) )
            {
            // InternalSysMLOC.g:710:1: ( ( rule__PartUsage__NameAssignment_1 ) )
            // InternalSysMLOC.g:711:2: ( rule__PartUsage__NameAssignment_1 )
            {
             before(grammarAccess.getPartUsageAccess().getNameAssignment_1()); 
            // InternalSysMLOC.g:712:2: ( rule__PartUsage__NameAssignment_1 )
            // InternalSysMLOC.g:712:3: rule__PartUsage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PartUsage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartUsageAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalSysMLOC.g:720:1: rule__PartUsage__Group__2 : rule__PartUsage__Group__2__Impl ;
    public final void rule__PartUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:724:1: ( rule__PartUsage__Group__2__Impl )
            // InternalSysMLOC.g:725:2: rule__PartUsage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartUsage__Group__2__Impl();

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
    // $ANTLR end "rule__PartUsage__Group__2"


    // $ANTLR start "rule__PartUsage__Group__2__Impl"
    // InternalSysMLOC.g:731:1: rule__PartUsage__Group__2__Impl : ( ';' ) ;
    public final void rule__PartUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:735:1: ( ( ';' ) )
            // InternalSysMLOC.g:736:1: ( ';' )
            {
            // InternalSysMLOC.g:736:1: ( ';' )
            // InternalSysMLOC.g:737:2: ';'
            {
             before(grammarAccess.getPartUsageAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPartUsageAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PartDefinition__Group__0"
    // InternalSysMLOC.g:747:1: rule__PartDefinition__Group__0 : rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 ;
    public final void rule__PartDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:751:1: ( rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1 )
            // InternalSysMLOC.g:752:2: rule__PartDefinition__Group__0__Impl rule__PartDefinition__Group__1
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
    // InternalSysMLOC.g:759:1: rule__PartDefinition__Group__0__Impl : ( 'part' ) ;
    public final void rule__PartDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:763:1: ( ( 'part' ) )
            // InternalSysMLOC.g:764:1: ( 'part' )
            {
            // InternalSysMLOC.g:764:1: ( 'part' )
            // InternalSysMLOC.g:765:2: 'part'
            {
             before(grammarAccess.getPartDefinitionAccess().getPartKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSysMLOC.g:774:1: rule__PartDefinition__Group__1 : rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 ;
    public final void rule__PartDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:778:1: ( rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2 )
            // InternalSysMLOC.g:779:2: rule__PartDefinition__Group__1__Impl rule__PartDefinition__Group__2
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
    // InternalSysMLOC.g:786:1: rule__PartDefinition__Group__1__Impl : ( 'def' ) ;
    public final void rule__PartDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:790:1: ( ( 'def' ) )
            // InternalSysMLOC.g:791:1: ( 'def' )
            {
            // InternalSysMLOC.g:791:1: ( 'def' )
            // InternalSysMLOC.g:792:2: 'def'
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
    // InternalSysMLOC.g:801:1: rule__PartDefinition__Group__2 : rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 ;
    public final void rule__PartDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:805:1: ( rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3 )
            // InternalSysMLOC.g:806:2: rule__PartDefinition__Group__2__Impl rule__PartDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSysMLOC.g:813:1: rule__PartDefinition__Group__2__Impl : ( ( rule__PartDefinition__NameAssignment_2 ) ) ;
    public final void rule__PartDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:817:1: ( ( ( rule__PartDefinition__NameAssignment_2 ) ) )
            // InternalSysMLOC.g:818:1: ( ( rule__PartDefinition__NameAssignment_2 ) )
            {
            // InternalSysMLOC.g:818:1: ( ( rule__PartDefinition__NameAssignment_2 ) )
            // InternalSysMLOC.g:819:2: ( rule__PartDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPartDefinitionAccess().getNameAssignment_2()); 
            // InternalSysMLOC.g:820:2: ( rule__PartDefinition__NameAssignment_2 )
            // InternalSysMLOC.g:820:3: rule__PartDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSysMLOC.g:828:1: rule__PartDefinition__Group__3 : rule__PartDefinition__Group__3__Impl ;
    public final void rule__PartDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:832:1: ( rule__PartDefinition__Group__3__Impl )
            // InternalSysMLOC.g:833:2: rule__PartDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PartDefinition__Group__3__Impl();

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
    // InternalSysMLOC.g:839:1: rule__PartDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__PartDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:843:1: ( ( ';' ) )
            // InternalSysMLOC.g:844:1: ( ';' )
            {
            // InternalSysMLOC.g:844:1: ( ';' )
            // InternalSysMLOC.g:845:2: ';'
            {
             before(grammarAccess.getPartDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__Qualification__Group__0"
    // InternalSysMLOC.g:855:1: rule__Qualification__Group__0 : rule__Qualification__Group__0__Impl rule__Qualification__Group__1 ;
    public final void rule__Qualification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:859:1: ( rule__Qualification__Group__0__Impl rule__Qualification__Group__1 )
            // InternalSysMLOC.g:860:2: rule__Qualification__Group__0__Impl rule__Qualification__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSysMLOC.g:867:1: rule__Qualification__Group__0__Impl : ( ruleName ) ;
    public final void rule__Qualification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:871:1: ( ( ruleName ) )
            // InternalSysMLOC.g:872:1: ( ruleName )
            {
            // InternalSysMLOC.g:872:1: ( ruleName )
            // InternalSysMLOC.g:873:2: ruleName
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
    // InternalSysMLOC.g:882:1: rule__Qualification__Group__1 : rule__Qualification__Group__1__Impl ;
    public final void rule__Qualification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:886:1: ( rule__Qualification__Group__1__Impl )
            // InternalSysMLOC.g:887:2: rule__Qualification__Group__1__Impl
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
    // InternalSysMLOC.g:893:1: rule__Qualification__Group__1__Impl : ( '::' ) ;
    public final void rule__Qualification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:897:1: ( ( '::' ) )
            // InternalSysMLOC.g:898:1: ( '::' )
            {
            // InternalSysMLOC.g:898:1: ( '::' )
            // InternalSysMLOC.g:899:2: '::'
            {
             before(grammarAccess.getQualificationAccess().getColonColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSysMLOC.g:909:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:913:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSysMLOC.g:914:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalSysMLOC.g:921:1: rule__QualifiedName__Group__0__Impl : ( ( ruleQualification )? ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:925:1: ( ( ( ruleQualification )? ) )
            // InternalSysMLOC.g:926:1: ( ( ruleQualification )? )
            {
            // InternalSysMLOC.g:926:1: ( ( ruleQualification )? )
            // InternalSysMLOC.g:927:2: ( ruleQualification )?
            {
             before(grammarAccess.getQualifiedNameAccess().getQualificationParserRuleCall_0()); 
            // InternalSysMLOC.g:928:2: ( ruleQualification )?
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
                    // InternalSysMLOC.g:928:3: ruleQualification
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
    // InternalSysMLOC.g:936:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:940:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSysMLOC.g:941:2: rule__QualifiedName__Group__1__Impl
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
    // InternalSysMLOC.g:947:1: rule__QualifiedName__Group__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:951:1: ( ( ruleName ) )
            // InternalSysMLOC.g:952:1: ( ruleName )
            {
            // InternalSysMLOC.g:952:1: ( ruleName )
            // InternalSysMLOC.g:953:2: ruleName
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
    // InternalSysMLOC.g:963:1: rule__Namespace__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Namespace__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:967:1: ( ( rulePackage ) )
            // InternalSysMLOC.g:968:2: ( rulePackage )
            {
            // InternalSysMLOC.g:968:2: ( rulePackage )
            // InternalSysMLOC.g:969:3: rulePackage
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


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalSysMLOC.g:978:1: rule__Package__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:982:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:983:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:983:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:984:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__ElementsAssignment_3"
    // InternalSysMLOC.g:993:1: rule__Package__ElementsAssignment_3 : ( ruleType ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:997:1: ( ( ruleType ) )
            // InternalSysMLOC.g:998:2: ( ruleType )
            {
            // InternalSysMLOC.g:998:2: ( ruleType )
            // InternalSysMLOC.g:999:3: ruleType
            {
             before(grammarAccess.getPackageAccess().getElementsTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsTypeParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Comment__BodyAssignment_1"
    // InternalSysMLOC.g:1008:1: rule__Comment__BodyAssignment_1 : ( RULE_REGULAR_COMMENT ) ;
    public final void rule__Comment__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1012:1: ( ( RULE_REGULAR_COMMENT ) )
            // InternalSysMLOC.g:1013:2: ( RULE_REGULAR_COMMENT )
            {
            // InternalSysMLOC.g:1013:2: ( RULE_REGULAR_COMMENT )
            // InternalSysMLOC.g:1014:3: RULE_REGULAR_COMMENT
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


    // $ANTLR start "rule__Import__VisibilityAssignment_0"
    // InternalSysMLOC.g:1023:1: rule__Import__VisibilityAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Import__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1027:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1028:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1028:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1029:3: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getVisibilityQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getVisibilityQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__VisibilityAssignment_0"


    // $ANTLR start "rule__Import__NameAssignment_2"
    // InternalSysMLOC.g:1038:1: rule__Import__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1042:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1043:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1043:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1044:3: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_2"


    // $ANTLR start "rule__PartUsage__NameAssignment_1"
    // InternalSysMLOC.g:1053:1: rule__PartUsage__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PartUsage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1057:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1058:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1058:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1059:3: ruleQualifiedName
            {
             before(grammarAccess.getPartUsageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPartUsageAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartUsage__NameAssignment_1"


    // $ANTLR start "rule__PartDefinition__NameAssignment_2"
    // InternalSysMLOC.g:1068:1: rule__PartDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PartDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSysMLOC.g:1072:1: ( ( ruleQualifiedName ) )
            // InternalSysMLOC.g:1073:2: ( ruleQualifiedName )
            {
            // InternalSysMLOC.g:1073:2: ( ruleQualifiedName )
            // InternalSysMLOC.g:1074:3: ruleQualifiedName
            {
             before(grammarAccess.getPartDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPartDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartDefinition__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000009A030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000092032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}