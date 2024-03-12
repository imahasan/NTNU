package no.ntnu.tdt4250.group13.scheduling_requirements.xtext.ide.contentassist.antlr.internal;

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
import no.ntnu.tdt4250.group13.scheduling_requirements.xtext.services.SrDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSrDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LECTURE'", "'EXERCISE'", "'LAB'", "'SUPERVISION'", "'University'", "'{'", "'year'", "'campus'", "'}'", "'course'", "'teachers'", "','", "'Campus'", "'buildings'", "'Course'", "'code'", "'coordinator'", "'schedulingrequirements'", "'Teacher'", "'-'", "'Building'", "'rooms'", "'Room'", "'mazemapLink'", "'SchedulingRequirements'", "'sender'", "'weeks'", "'Week'", "'weekNumber'", "'slotRequirements'", "'SlotRequirement'", "'activityType'", "'duration'", "'expectedStudents'", "'requiredPersonal'", "'('", "')'", "'requiredRoom'", "'requiredSameDaySlots'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSrDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSrDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSrDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSrDsl.g"; }


    	private SrDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SrDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUniversity"
    // InternalSrDsl.g:53:1: entryRuleUniversity : ruleUniversity EOF ;
    public final void entryRuleUniversity() throws RecognitionException {
        try {
            // InternalSrDsl.g:54:1: ( ruleUniversity EOF )
            // InternalSrDsl.g:55:1: ruleUniversity EOF
            {
             before(grammarAccess.getUniversityRule()); 
            pushFollow(FOLLOW_1);
            ruleUniversity();

            state._fsp--;

             after(grammarAccess.getUniversityRule()); 
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
    // $ANTLR end "entryRuleUniversity"


    // $ANTLR start "ruleUniversity"
    // InternalSrDsl.g:62:1: ruleUniversity : ( ( rule__University__Group__0 ) ) ;
    public final void ruleUniversity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:66:2: ( ( ( rule__University__Group__0 ) ) )
            // InternalSrDsl.g:67:2: ( ( rule__University__Group__0 ) )
            {
            // InternalSrDsl.g:67:2: ( ( rule__University__Group__0 ) )
            // InternalSrDsl.g:68:3: ( rule__University__Group__0 )
            {
             before(grammarAccess.getUniversityAccess().getGroup()); 
            // InternalSrDsl.g:69:3: ( rule__University__Group__0 )
            // InternalSrDsl.g:69:4: rule__University__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__University__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniversity"


    // $ANTLR start "entryRuleEString"
    // InternalSrDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSrDsl.g:79:1: ( ruleEString EOF )
            // InternalSrDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSrDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSrDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSrDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSrDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSrDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalSrDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCampus"
    // InternalSrDsl.g:103:1: entryRuleCampus : ruleCampus EOF ;
    public final void entryRuleCampus() throws RecognitionException {
        try {
            // InternalSrDsl.g:104:1: ( ruleCampus EOF )
            // InternalSrDsl.g:105:1: ruleCampus EOF
            {
             before(grammarAccess.getCampusRule()); 
            pushFollow(FOLLOW_1);
            ruleCampus();

            state._fsp--;

             after(grammarAccess.getCampusRule()); 
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
    // $ANTLR end "entryRuleCampus"


    // $ANTLR start "ruleCampus"
    // InternalSrDsl.g:112:1: ruleCampus : ( ( rule__Campus__Group__0 ) ) ;
    public final void ruleCampus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:116:2: ( ( ( rule__Campus__Group__0 ) ) )
            // InternalSrDsl.g:117:2: ( ( rule__Campus__Group__0 ) )
            {
            // InternalSrDsl.g:117:2: ( ( rule__Campus__Group__0 ) )
            // InternalSrDsl.g:118:3: ( rule__Campus__Group__0 )
            {
             before(grammarAccess.getCampusAccess().getGroup()); 
            // InternalSrDsl.g:119:3: ( rule__Campus__Group__0 )
            // InternalSrDsl.g:119:4: rule__Campus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Campus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCampusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCampus"


    // $ANTLR start "entryRuleCourse"
    // InternalSrDsl.g:128:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // InternalSrDsl.g:129:1: ( ruleCourse EOF )
            // InternalSrDsl.g:130:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalSrDsl.g:137:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:141:2: ( ( ( rule__Course__Group__0 ) ) )
            // InternalSrDsl.g:142:2: ( ( rule__Course__Group__0 ) )
            {
            // InternalSrDsl.g:142:2: ( ( rule__Course__Group__0 ) )
            // InternalSrDsl.g:143:3: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // InternalSrDsl.g:144:3: ( rule__Course__Group__0 )
            // InternalSrDsl.g:144:4: rule__Course__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleTeacher"
    // InternalSrDsl.g:153:1: entryRuleTeacher : ruleTeacher EOF ;
    public final void entryRuleTeacher() throws RecognitionException {
        try {
            // InternalSrDsl.g:154:1: ( ruleTeacher EOF )
            // InternalSrDsl.g:155:1: ruleTeacher EOF
            {
             before(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getTeacherRule()); 
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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalSrDsl.g:162:1: ruleTeacher : ( ( rule__Teacher__Group__0 ) ) ;
    public final void ruleTeacher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:166:2: ( ( ( rule__Teacher__Group__0 ) ) )
            // InternalSrDsl.g:167:2: ( ( rule__Teacher__Group__0 ) )
            {
            // InternalSrDsl.g:167:2: ( ( rule__Teacher__Group__0 ) )
            // InternalSrDsl.g:168:3: ( rule__Teacher__Group__0 )
            {
             before(grammarAccess.getTeacherAccess().getGroup()); 
            // InternalSrDsl.g:169:3: ( rule__Teacher__Group__0 )
            // InternalSrDsl.g:169:4: rule__Teacher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleEInt"
    // InternalSrDsl.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSrDsl.g:179:1: ( ruleEInt EOF )
            // InternalSrDsl.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSrDsl.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSrDsl.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSrDsl.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalSrDsl.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSrDsl.g:194:3: ( rule__EInt__Group__0 )
            // InternalSrDsl.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleBuilding"
    // InternalSrDsl.g:203:1: entryRuleBuilding : ruleBuilding EOF ;
    public final void entryRuleBuilding() throws RecognitionException {
        try {
            // InternalSrDsl.g:204:1: ( ruleBuilding EOF )
            // InternalSrDsl.g:205:1: ruleBuilding EOF
            {
             before(grammarAccess.getBuildingRule()); 
            pushFollow(FOLLOW_1);
            ruleBuilding();

            state._fsp--;

             after(grammarAccess.getBuildingRule()); 
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
    // $ANTLR end "entryRuleBuilding"


    // $ANTLR start "ruleBuilding"
    // InternalSrDsl.g:212:1: ruleBuilding : ( ( rule__Building__Group__0 ) ) ;
    public final void ruleBuilding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:216:2: ( ( ( rule__Building__Group__0 ) ) )
            // InternalSrDsl.g:217:2: ( ( rule__Building__Group__0 ) )
            {
            // InternalSrDsl.g:217:2: ( ( rule__Building__Group__0 ) )
            // InternalSrDsl.g:218:3: ( rule__Building__Group__0 )
            {
             before(grammarAccess.getBuildingAccess().getGroup()); 
            // InternalSrDsl.g:219:3: ( rule__Building__Group__0 )
            // InternalSrDsl.g:219:4: rule__Building__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Building__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuildingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuilding"


    // $ANTLR start "entryRuleRoom"
    // InternalSrDsl.g:228:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalSrDsl.g:229:1: ( ruleRoom EOF )
            // InternalSrDsl.g:230:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalSrDsl.g:237:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:241:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalSrDsl.g:242:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalSrDsl.g:242:2: ( ( rule__Room__Group__0 ) )
            // InternalSrDsl.g:243:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalSrDsl.g:244:3: ( rule__Room__Group__0 )
            // InternalSrDsl.g:244:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleschedulingRequirements"
    // InternalSrDsl.g:253:1: entryRuleschedulingRequirements : ruleschedulingRequirements EOF ;
    public final void entryRuleschedulingRequirements() throws RecognitionException {
        try {
            // InternalSrDsl.g:254:1: ( ruleschedulingRequirements EOF )
            // InternalSrDsl.g:255:1: ruleschedulingRequirements EOF
            {
             before(grammarAccess.getSchedulingRequirementsRule()); 
            pushFollow(FOLLOW_1);
            ruleschedulingRequirements();

            state._fsp--;

             after(grammarAccess.getSchedulingRequirementsRule()); 
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
    // $ANTLR end "entryRuleschedulingRequirements"


    // $ANTLR start "ruleschedulingRequirements"
    // InternalSrDsl.g:262:1: ruleschedulingRequirements : ( ( rule__SchedulingRequirements__Group__0 ) ) ;
    public final void ruleschedulingRequirements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:266:2: ( ( ( rule__SchedulingRequirements__Group__0 ) ) )
            // InternalSrDsl.g:267:2: ( ( rule__SchedulingRequirements__Group__0 ) )
            {
            // InternalSrDsl.g:267:2: ( ( rule__SchedulingRequirements__Group__0 ) )
            // InternalSrDsl.g:268:3: ( rule__SchedulingRequirements__Group__0 )
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getGroup()); 
            // InternalSrDsl.g:269:3: ( rule__SchedulingRequirements__Group__0 )
            // InternalSrDsl.g:269:4: rule__SchedulingRequirements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchedulingRequirementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleschedulingRequirements"


    // $ANTLR start "entryRuleWeek"
    // InternalSrDsl.g:278:1: entryRuleWeek : ruleWeek EOF ;
    public final void entryRuleWeek() throws RecognitionException {
        try {
            // InternalSrDsl.g:279:1: ( ruleWeek EOF )
            // InternalSrDsl.g:280:1: ruleWeek EOF
            {
             before(grammarAccess.getWeekRule()); 
            pushFollow(FOLLOW_1);
            ruleWeek();

            state._fsp--;

             after(grammarAccess.getWeekRule()); 
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
    // $ANTLR end "entryRuleWeek"


    // $ANTLR start "ruleWeek"
    // InternalSrDsl.g:287:1: ruleWeek : ( ( rule__Week__Group__0 ) ) ;
    public final void ruleWeek() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:291:2: ( ( ( rule__Week__Group__0 ) ) )
            // InternalSrDsl.g:292:2: ( ( rule__Week__Group__0 ) )
            {
            // InternalSrDsl.g:292:2: ( ( rule__Week__Group__0 ) )
            // InternalSrDsl.g:293:3: ( rule__Week__Group__0 )
            {
             before(grammarAccess.getWeekAccess().getGroup()); 
            // InternalSrDsl.g:294:3: ( rule__Week__Group__0 )
            // InternalSrDsl.g:294:4: rule__Week__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Week__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWeekAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeek"


    // $ANTLR start "entryRuleSlotRequirement"
    // InternalSrDsl.g:303:1: entryRuleSlotRequirement : ruleSlotRequirement EOF ;
    public final void entryRuleSlotRequirement() throws RecognitionException {
        try {
            // InternalSrDsl.g:304:1: ( ruleSlotRequirement EOF )
            // InternalSrDsl.g:305:1: ruleSlotRequirement EOF
            {
             before(grammarAccess.getSlotRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleSlotRequirement();

            state._fsp--;

             after(grammarAccess.getSlotRequirementRule()); 
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
    // $ANTLR end "entryRuleSlotRequirement"


    // $ANTLR start "ruleSlotRequirement"
    // InternalSrDsl.g:312:1: ruleSlotRequirement : ( ( rule__SlotRequirement__Group__0 ) ) ;
    public final void ruleSlotRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:316:2: ( ( ( rule__SlotRequirement__Group__0 ) ) )
            // InternalSrDsl.g:317:2: ( ( rule__SlotRequirement__Group__0 ) )
            {
            // InternalSrDsl.g:317:2: ( ( rule__SlotRequirement__Group__0 ) )
            // InternalSrDsl.g:318:3: ( rule__SlotRequirement__Group__0 )
            {
             before(grammarAccess.getSlotRequirementAccess().getGroup()); 
            // InternalSrDsl.g:319:3: ( rule__SlotRequirement__Group__0 )
            // InternalSrDsl.g:319:4: rule__SlotRequirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlotRequirement"


    // $ANTLR start "ruleActivityType"
    // InternalSrDsl.g:328:1: ruleActivityType : ( ( rule__ActivityType__Alternatives ) ) ;
    public final void ruleActivityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:332:1: ( ( ( rule__ActivityType__Alternatives ) ) )
            // InternalSrDsl.g:333:2: ( ( rule__ActivityType__Alternatives ) )
            {
            // InternalSrDsl.g:333:2: ( ( rule__ActivityType__Alternatives ) )
            // InternalSrDsl.g:334:3: ( rule__ActivityType__Alternatives )
            {
             before(grammarAccess.getActivityTypeAccess().getAlternatives()); 
            // InternalSrDsl.g:335:3: ( rule__ActivityType__Alternatives )
            // InternalSrDsl.g:335:4: rule__ActivityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActivityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSrDsl.g:343:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:347:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSrDsl.g:348:2: ( RULE_STRING )
                    {
                    // InternalSrDsl.g:348:2: ( RULE_STRING )
                    // InternalSrDsl.g:349:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSrDsl.g:354:2: ( RULE_ID )
                    {
                    // InternalSrDsl.g:354:2: ( RULE_ID )
                    // InternalSrDsl.g:355:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ActivityType__Alternatives"
    // InternalSrDsl.g:364:1: rule__ActivityType__Alternatives : ( ( ( 'LECTURE' ) ) | ( ( 'EXERCISE' ) ) | ( ( 'LAB' ) ) | ( ( 'SUPERVISION' ) ) );
    public final void rule__ActivityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:368:1: ( ( ( 'LECTURE' ) ) | ( ( 'EXERCISE' ) ) | ( ( 'LAB' ) ) | ( ( 'SUPERVISION' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSrDsl.g:369:2: ( ( 'LECTURE' ) )
                    {
                    // InternalSrDsl.g:369:2: ( ( 'LECTURE' ) )
                    // InternalSrDsl.g:370:3: ( 'LECTURE' )
                    {
                     before(grammarAccess.getActivityTypeAccess().getLECTUREEnumLiteralDeclaration_0()); 
                    // InternalSrDsl.g:371:3: ( 'LECTURE' )
                    // InternalSrDsl.g:371:4: 'LECTURE'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityTypeAccess().getLECTUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSrDsl.g:375:2: ( ( 'EXERCISE' ) )
                    {
                    // InternalSrDsl.g:375:2: ( ( 'EXERCISE' ) )
                    // InternalSrDsl.g:376:3: ( 'EXERCISE' )
                    {
                     before(grammarAccess.getActivityTypeAccess().getEXERCISEEnumLiteralDeclaration_1()); 
                    // InternalSrDsl.g:377:3: ( 'EXERCISE' )
                    // InternalSrDsl.g:377:4: 'EXERCISE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityTypeAccess().getEXERCISEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSrDsl.g:381:2: ( ( 'LAB' ) )
                    {
                    // InternalSrDsl.g:381:2: ( ( 'LAB' ) )
                    // InternalSrDsl.g:382:3: ( 'LAB' )
                    {
                     before(grammarAccess.getActivityTypeAccess().getLABEnumLiteralDeclaration_2()); 
                    // InternalSrDsl.g:383:3: ( 'LAB' )
                    // InternalSrDsl.g:383:4: 'LAB'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityTypeAccess().getLABEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSrDsl.g:387:2: ( ( 'SUPERVISION' ) )
                    {
                    // InternalSrDsl.g:387:2: ( ( 'SUPERVISION' ) )
                    // InternalSrDsl.g:388:3: ( 'SUPERVISION' )
                    {
                     before(grammarAccess.getActivityTypeAccess().getSUPERVISIONEnumLiteralDeclaration_3()); 
                    // InternalSrDsl.g:389:3: ( 'SUPERVISION' )
                    // InternalSrDsl.g:389:4: 'SUPERVISION'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActivityTypeAccess().getSUPERVISIONEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ActivityType__Alternatives"


    // $ANTLR start "rule__University__Group__0"
    // InternalSrDsl.g:397:1: rule__University__Group__0 : rule__University__Group__0__Impl rule__University__Group__1 ;
    public final void rule__University__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:401:1: ( rule__University__Group__0__Impl rule__University__Group__1 )
            // InternalSrDsl.g:402:2: rule__University__Group__0__Impl rule__University__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__University__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__1();

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
    // $ANTLR end "rule__University__Group__0"


    // $ANTLR start "rule__University__Group__0__Impl"
    // InternalSrDsl.g:409:1: rule__University__Group__0__Impl : ( 'University' ) ;
    public final void rule__University__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:413:1: ( ( 'University' ) )
            // InternalSrDsl.g:414:1: ( 'University' )
            {
            // InternalSrDsl.g:414:1: ( 'University' )
            // InternalSrDsl.g:415:2: 'University'
            {
             before(grammarAccess.getUniversityAccess().getUniversityKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getUniversityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__0__Impl"


    // $ANTLR start "rule__University__Group__1"
    // InternalSrDsl.g:424:1: rule__University__Group__1 : rule__University__Group__1__Impl rule__University__Group__2 ;
    public final void rule__University__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:428:1: ( rule__University__Group__1__Impl rule__University__Group__2 )
            // InternalSrDsl.g:429:2: rule__University__Group__1__Impl rule__University__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__University__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__2();

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
    // $ANTLR end "rule__University__Group__1"


    // $ANTLR start "rule__University__Group__1__Impl"
    // InternalSrDsl.g:436:1: rule__University__Group__1__Impl : ( ( rule__University__NameAssignment_1 ) ) ;
    public final void rule__University__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:440:1: ( ( ( rule__University__NameAssignment_1 ) ) )
            // InternalSrDsl.g:441:1: ( ( rule__University__NameAssignment_1 ) )
            {
            // InternalSrDsl.g:441:1: ( ( rule__University__NameAssignment_1 ) )
            // InternalSrDsl.g:442:2: ( rule__University__NameAssignment_1 )
            {
             before(grammarAccess.getUniversityAccess().getNameAssignment_1()); 
            // InternalSrDsl.g:443:2: ( rule__University__NameAssignment_1 )
            // InternalSrDsl.g:443:3: rule__University__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__University__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__1__Impl"


    // $ANTLR start "rule__University__Group__2"
    // InternalSrDsl.g:451:1: rule__University__Group__2 : rule__University__Group__2__Impl rule__University__Group__3 ;
    public final void rule__University__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:455:1: ( rule__University__Group__2__Impl rule__University__Group__3 )
            // InternalSrDsl.g:456:2: rule__University__Group__2__Impl rule__University__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__University__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__3();

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
    // $ANTLR end "rule__University__Group__2"


    // $ANTLR start "rule__University__Group__2__Impl"
    // InternalSrDsl.g:463:1: rule__University__Group__2__Impl : ( '{' ) ;
    public final void rule__University__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:467:1: ( ( '{' ) )
            // InternalSrDsl.g:468:1: ( '{' )
            {
            // InternalSrDsl.g:468:1: ( '{' )
            // InternalSrDsl.g:469:2: '{'
            {
             before(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__2__Impl"


    // $ANTLR start "rule__University__Group__3"
    // InternalSrDsl.g:478:1: rule__University__Group__3 : rule__University__Group__3__Impl rule__University__Group__4 ;
    public final void rule__University__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:482:1: ( rule__University__Group__3__Impl rule__University__Group__4 )
            // InternalSrDsl.g:483:2: rule__University__Group__3__Impl rule__University__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__University__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__4();

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
    // $ANTLR end "rule__University__Group__3"


    // $ANTLR start "rule__University__Group__3__Impl"
    // InternalSrDsl.g:490:1: rule__University__Group__3__Impl : ( 'year' ) ;
    public final void rule__University__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:494:1: ( ( 'year' ) )
            // InternalSrDsl.g:495:1: ( 'year' )
            {
            // InternalSrDsl.g:495:1: ( 'year' )
            // InternalSrDsl.g:496:2: 'year'
            {
             before(grammarAccess.getUniversityAccess().getYearKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getYearKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__3__Impl"


    // $ANTLR start "rule__University__Group__4"
    // InternalSrDsl.g:505:1: rule__University__Group__4 : rule__University__Group__4__Impl rule__University__Group__5 ;
    public final void rule__University__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:509:1: ( rule__University__Group__4__Impl rule__University__Group__5 )
            // InternalSrDsl.g:510:2: rule__University__Group__4__Impl rule__University__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__University__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__5();

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
    // $ANTLR end "rule__University__Group__4"


    // $ANTLR start "rule__University__Group__4__Impl"
    // InternalSrDsl.g:517:1: rule__University__Group__4__Impl : ( ( rule__University__YearAssignment_4 ) ) ;
    public final void rule__University__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:521:1: ( ( ( rule__University__YearAssignment_4 ) ) )
            // InternalSrDsl.g:522:1: ( ( rule__University__YearAssignment_4 ) )
            {
            // InternalSrDsl.g:522:1: ( ( rule__University__YearAssignment_4 ) )
            // InternalSrDsl.g:523:2: ( rule__University__YearAssignment_4 )
            {
             before(grammarAccess.getUniversityAccess().getYearAssignment_4()); 
            // InternalSrDsl.g:524:2: ( rule__University__YearAssignment_4 )
            // InternalSrDsl.g:524:3: rule__University__YearAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__University__YearAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getYearAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__4__Impl"


    // $ANTLR start "rule__University__Group__5"
    // InternalSrDsl.g:532:1: rule__University__Group__5 : rule__University__Group__5__Impl rule__University__Group__6 ;
    public final void rule__University__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:536:1: ( rule__University__Group__5__Impl rule__University__Group__6 )
            // InternalSrDsl.g:537:2: rule__University__Group__5__Impl rule__University__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__University__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__6();

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
    // $ANTLR end "rule__University__Group__5"


    // $ANTLR start "rule__University__Group__5__Impl"
    // InternalSrDsl.g:544:1: rule__University__Group__5__Impl : ( 'campus' ) ;
    public final void rule__University__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:548:1: ( ( 'campus' ) )
            // InternalSrDsl.g:549:1: ( 'campus' )
            {
            // InternalSrDsl.g:549:1: ( 'campus' )
            // InternalSrDsl.g:550:2: 'campus'
            {
             before(grammarAccess.getUniversityAccess().getCampusKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCampusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__5__Impl"


    // $ANTLR start "rule__University__Group__6"
    // InternalSrDsl.g:559:1: rule__University__Group__6 : rule__University__Group__6__Impl rule__University__Group__7 ;
    public final void rule__University__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:563:1: ( rule__University__Group__6__Impl rule__University__Group__7 )
            // InternalSrDsl.g:564:2: rule__University__Group__6__Impl rule__University__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__University__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__7();

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
    // $ANTLR end "rule__University__Group__6"


    // $ANTLR start "rule__University__Group__6__Impl"
    // InternalSrDsl.g:571:1: rule__University__Group__6__Impl : ( '{' ) ;
    public final void rule__University__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:575:1: ( ( '{' ) )
            // InternalSrDsl.g:576:1: ( '{' )
            {
            // InternalSrDsl.g:576:1: ( '{' )
            // InternalSrDsl.g:577:2: '{'
            {
             before(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__6__Impl"


    // $ANTLR start "rule__University__Group__7"
    // InternalSrDsl.g:586:1: rule__University__Group__7 : rule__University__Group__7__Impl rule__University__Group__8 ;
    public final void rule__University__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:590:1: ( rule__University__Group__7__Impl rule__University__Group__8 )
            // InternalSrDsl.g:591:2: rule__University__Group__7__Impl rule__University__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__University__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__8();

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
    // $ANTLR end "rule__University__Group__7"


    // $ANTLR start "rule__University__Group__7__Impl"
    // InternalSrDsl.g:598:1: rule__University__Group__7__Impl : ( ( rule__University__CampiAssignment_7 ) ) ;
    public final void rule__University__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:602:1: ( ( ( rule__University__CampiAssignment_7 ) ) )
            // InternalSrDsl.g:603:1: ( ( rule__University__CampiAssignment_7 ) )
            {
            // InternalSrDsl.g:603:1: ( ( rule__University__CampiAssignment_7 ) )
            // InternalSrDsl.g:604:2: ( rule__University__CampiAssignment_7 )
            {
             before(grammarAccess.getUniversityAccess().getCampiAssignment_7()); 
            // InternalSrDsl.g:605:2: ( rule__University__CampiAssignment_7 )
            // InternalSrDsl.g:605:3: rule__University__CampiAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__University__CampiAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getCampiAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__7__Impl"


    // $ANTLR start "rule__University__Group__8"
    // InternalSrDsl.g:613:1: rule__University__Group__8 : rule__University__Group__8__Impl rule__University__Group__9 ;
    public final void rule__University__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:617:1: ( rule__University__Group__8__Impl rule__University__Group__9 )
            // InternalSrDsl.g:618:2: rule__University__Group__8__Impl rule__University__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__University__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__9();

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
    // $ANTLR end "rule__University__Group__8"


    // $ANTLR start "rule__University__Group__8__Impl"
    // InternalSrDsl.g:625:1: rule__University__Group__8__Impl : ( ( rule__University__Group_8__0 )* ) ;
    public final void rule__University__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:629:1: ( ( ( rule__University__Group_8__0 )* ) )
            // InternalSrDsl.g:630:1: ( ( rule__University__Group_8__0 )* )
            {
            // InternalSrDsl.g:630:1: ( ( rule__University__Group_8__0 )* )
            // InternalSrDsl.g:631:2: ( rule__University__Group_8__0 )*
            {
             before(grammarAccess.getUniversityAccess().getGroup_8()); 
            // InternalSrDsl.g:632:2: ( rule__University__Group_8__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSrDsl.g:632:3: rule__University__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__University__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getUniversityAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__8__Impl"


    // $ANTLR start "rule__University__Group__9"
    // InternalSrDsl.g:640:1: rule__University__Group__9 : rule__University__Group__9__Impl rule__University__Group__10 ;
    public final void rule__University__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:644:1: ( rule__University__Group__9__Impl rule__University__Group__10 )
            // InternalSrDsl.g:645:2: rule__University__Group__9__Impl rule__University__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__University__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__10();

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
    // $ANTLR end "rule__University__Group__9"


    // $ANTLR start "rule__University__Group__9__Impl"
    // InternalSrDsl.g:652:1: rule__University__Group__9__Impl : ( '}' ) ;
    public final void rule__University__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:656:1: ( ( '}' ) )
            // InternalSrDsl.g:657:1: ( '}' )
            {
            // InternalSrDsl.g:657:1: ( '}' )
            // InternalSrDsl.g:658:2: '}'
            {
             before(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__9__Impl"


    // $ANTLR start "rule__University__Group__10"
    // InternalSrDsl.g:667:1: rule__University__Group__10 : rule__University__Group__10__Impl rule__University__Group__11 ;
    public final void rule__University__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:671:1: ( rule__University__Group__10__Impl rule__University__Group__11 )
            // InternalSrDsl.g:672:2: rule__University__Group__10__Impl rule__University__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__University__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__11();

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
    // $ANTLR end "rule__University__Group__10"


    // $ANTLR start "rule__University__Group__10__Impl"
    // InternalSrDsl.g:679:1: rule__University__Group__10__Impl : ( 'course' ) ;
    public final void rule__University__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:683:1: ( ( 'course' ) )
            // InternalSrDsl.g:684:1: ( 'course' )
            {
            // InternalSrDsl.g:684:1: ( 'course' )
            // InternalSrDsl.g:685:2: 'course'
            {
             before(grammarAccess.getUniversityAccess().getCourseKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCourseKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__10__Impl"


    // $ANTLR start "rule__University__Group__11"
    // InternalSrDsl.g:694:1: rule__University__Group__11 : rule__University__Group__11__Impl rule__University__Group__12 ;
    public final void rule__University__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:698:1: ( rule__University__Group__11__Impl rule__University__Group__12 )
            // InternalSrDsl.g:699:2: rule__University__Group__11__Impl rule__University__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__University__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__12();

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
    // $ANTLR end "rule__University__Group__11"


    // $ANTLR start "rule__University__Group__11__Impl"
    // InternalSrDsl.g:706:1: rule__University__Group__11__Impl : ( ( rule__University__CourseAssignment_11 ) ) ;
    public final void rule__University__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:710:1: ( ( ( rule__University__CourseAssignment_11 ) ) )
            // InternalSrDsl.g:711:1: ( ( rule__University__CourseAssignment_11 ) )
            {
            // InternalSrDsl.g:711:1: ( ( rule__University__CourseAssignment_11 ) )
            // InternalSrDsl.g:712:2: ( rule__University__CourseAssignment_11 )
            {
             before(grammarAccess.getUniversityAccess().getCourseAssignment_11()); 
            // InternalSrDsl.g:713:2: ( rule__University__CourseAssignment_11 )
            // InternalSrDsl.g:713:3: rule__University__CourseAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__University__CourseAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getCourseAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__11__Impl"


    // $ANTLR start "rule__University__Group__12"
    // InternalSrDsl.g:721:1: rule__University__Group__12 : rule__University__Group__12__Impl rule__University__Group__13 ;
    public final void rule__University__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:725:1: ( rule__University__Group__12__Impl rule__University__Group__13 )
            // InternalSrDsl.g:726:2: rule__University__Group__12__Impl rule__University__Group__13
            {
            pushFollow(FOLLOW_4);
            rule__University__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__13();

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
    // $ANTLR end "rule__University__Group__12"


    // $ANTLR start "rule__University__Group__12__Impl"
    // InternalSrDsl.g:733:1: rule__University__Group__12__Impl : ( 'teachers' ) ;
    public final void rule__University__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:737:1: ( ( 'teachers' ) )
            // InternalSrDsl.g:738:1: ( 'teachers' )
            {
            // InternalSrDsl.g:738:1: ( 'teachers' )
            // InternalSrDsl.g:739:2: 'teachers'
            {
             before(grammarAccess.getUniversityAccess().getTeachersKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getTeachersKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__12__Impl"


    // $ANTLR start "rule__University__Group__13"
    // InternalSrDsl.g:748:1: rule__University__Group__13 : rule__University__Group__13__Impl rule__University__Group__14 ;
    public final void rule__University__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:752:1: ( rule__University__Group__13__Impl rule__University__Group__14 )
            // InternalSrDsl.g:753:2: rule__University__Group__13__Impl rule__University__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__University__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__14();

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
    // $ANTLR end "rule__University__Group__13"


    // $ANTLR start "rule__University__Group__13__Impl"
    // InternalSrDsl.g:760:1: rule__University__Group__13__Impl : ( '{' ) ;
    public final void rule__University__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:764:1: ( ( '{' ) )
            // InternalSrDsl.g:765:1: ( '{' )
            {
            // InternalSrDsl.g:765:1: ( '{' )
            // InternalSrDsl.g:766:2: '{'
            {
             before(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__13__Impl"


    // $ANTLR start "rule__University__Group__14"
    // InternalSrDsl.g:775:1: rule__University__Group__14 : rule__University__Group__14__Impl rule__University__Group__15 ;
    public final void rule__University__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:779:1: ( rule__University__Group__14__Impl rule__University__Group__15 )
            // InternalSrDsl.g:780:2: rule__University__Group__14__Impl rule__University__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__University__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__15();

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
    // $ANTLR end "rule__University__Group__14"


    // $ANTLR start "rule__University__Group__14__Impl"
    // InternalSrDsl.g:787:1: rule__University__Group__14__Impl : ( ( rule__University__TeachersAssignment_14 ) ) ;
    public final void rule__University__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:791:1: ( ( ( rule__University__TeachersAssignment_14 ) ) )
            // InternalSrDsl.g:792:1: ( ( rule__University__TeachersAssignment_14 ) )
            {
            // InternalSrDsl.g:792:1: ( ( rule__University__TeachersAssignment_14 ) )
            // InternalSrDsl.g:793:2: ( rule__University__TeachersAssignment_14 )
            {
             before(grammarAccess.getUniversityAccess().getTeachersAssignment_14()); 
            // InternalSrDsl.g:794:2: ( rule__University__TeachersAssignment_14 )
            // InternalSrDsl.g:794:3: rule__University__TeachersAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__University__TeachersAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getTeachersAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__14__Impl"


    // $ANTLR start "rule__University__Group__15"
    // InternalSrDsl.g:802:1: rule__University__Group__15 : rule__University__Group__15__Impl rule__University__Group__16 ;
    public final void rule__University__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:806:1: ( rule__University__Group__15__Impl rule__University__Group__16 )
            // InternalSrDsl.g:807:2: rule__University__Group__15__Impl rule__University__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__University__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__16();

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
    // $ANTLR end "rule__University__Group__15"


    // $ANTLR start "rule__University__Group__15__Impl"
    // InternalSrDsl.g:814:1: rule__University__Group__15__Impl : ( ( rule__University__Group_15__0 )* ) ;
    public final void rule__University__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:818:1: ( ( ( rule__University__Group_15__0 )* ) )
            // InternalSrDsl.g:819:1: ( ( rule__University__Group_15__0 )* )
            {
            // InternalSrDsl.g:819:1: ( ( rule__University__Group_15__0 )* )
            // InternalSrDsl.g:820:2: ( rule__University__Group_15__0 )*
            {
             before(grammarAccess.getUniversityAccess().getGroup_15()); 
            // InternalSrDsl.g:821:2: ( rule__University__Group_15__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSrDsl.g:821:3: rule__University__Group_15__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__University__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getUniversityAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__15__Impl"


    // $ANTLR start "rule__University__Group__16"
    // InternalSrDsl.g:829:1: rule__University__Group__16 : rule__University__Group__16__Impl rule__University__Group__17 ;
    public final void rule__University__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:833:1: ( rule__University__Group__16__Impl rule__University__Group__17 )
            // InternalSrDsl.g:834:2: rule__University__Group__16__Impl rule__University__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__University__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group__17();

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
    // $ANTLR end "rule__University__Group__16"


    // $ANTLR start "rule__University__Group__16__Impl"
    // InternalSrDsl.g:841:1: rule__University__Group__16__Impl : ( '}' ) ;
    public final void rule__University__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:845:1: ( ( '}' ) )
            // InternalSrDsl.g:846:1: ( '}' )
            {
            // InternalSrDsl.g:846:1: ( '}' )
            // InternalSrDsl.g:847:2: '}'
            {
             before(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_16()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__16__Impl"


    // $ANTLR start "rule__University__Group__17"
    // InternalSrDsl.g:856:1: rule__University__Group__17 : rule__University__Group__17__Impl ;
    public final void rule__University__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:860:1: ( rule__University__Group__17__Impl )
            // InternalSrDsl.g:861:2: rule__University__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group__17__Impl();

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
    // $ANTLR end "rule__University__Group__17"


    // $ANTLR start "rule__University__Group__17__Impl"
    // InternalSrDsl.g:867:1: rule__University__Group__17__Impl : ( '}' ) ;
    public final void rule__University__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:871:1: ( ( '}' ) )
            // InternalSrDsl.g:872:1: ( '}' )
            {
            // InternalSrDsl.g:872:1: ( '}' )
            // InternalSrDsl.g:873:2: '}'
            {
             before(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group__17__Impl"


    // $ANTLR start "rule__University__Group_8__0"
    // InternalSrDsl.g:883:1: rule__University__Group_8__0 : rule__University__Group_8__0__Impl rule__University__Group_8__1 ;
    public final void rule__University__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:887:1: ( rule__University__Group_8__0__Impl rule__University__Group_8__1 )
            // InternalSrDsl.g:888:2: rule__University__Group_8__0__Impl rule__University__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__University__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_8__1();

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
    // $ANTLR end "rule__University__Group_8__0"


    // $ANTLR start "rule__University__Group_8__0__Impl"
    // InternalSrDsl.g:895:1: rule__University__Group_8__0__Impl : ( ',' ) ;
    public final void rule__University__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:899:1: ( ( ',' ) )
            // InternalSrDsl.g:900:1: ( ',' )
            {
            // InternalSrDsl.g:900:1: ( ',' )
            // InternalSrDsl.g:901:2: ','
            {
             before(grammarAccess.getUniversityAccess().getCommaKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_8__0__Impl"


    // $ANTLR start "rule__University__Group_8__1"
    // InternalSrDsl.g:910:1: rule__University__Group_8__1 : rule__University__Group_8__1__Impl ;
    public final void rule__University__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:914:1: ( rule__University__Group_8__1__Impl )
            // InternalSrDsl.g:915:2: rule__University__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group_8__1__Impl();

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
    // $ANTLR end "rule__University__Group_8__1"


    // $ANTLR start "rule__University__Group_8__1__Impl"
    // InternalSrDsl.g:921:1: rule__University__Group_8__1__Impl : ( ( rule__University__CampiAssignment_8_1 ) ) ;
    public final void rule__University__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:925:1: ( ( ( rule__University__CampiAssignment_8_1 ) ) )
            // InternalSrDsl.g:926:1: ( ( rule__University__CampiAssignment_8_1 ) )
            {
            // InternalSrDsl.g:926:1: ( ( rule__University__CampiAssignment_8_1 ) )
            // InternalSrDsl.g:927:2: ( rule__University__CampiAssignment_8_1 )
            {
             before(grammarAccess.getUniversityAccess().getCampiAssignment_8_1()); 
            // InternalSrDsl.g:928:2: ( rule__University__CampiAssignment_8_1 )
            // InternalSrDsl.g:928:3: rule__University__CampiAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__University__CampiAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getCampiAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_8__1__Impl"


    // $ANTLR start "rule__University__Group_15__0"
    // InternalSrDsl.g:937:1: rule__University__Group_15__0 : rule__University__Group_15__0__Impl rule__University__Group_15__1 ;
    public final void rule__University__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:941:1: ( rule__University__Group_15__0__Impl rule__University__Group_15__1 )
            // InternalSrDsl.g:942:2: rule__University__Group_15__0__Impl rule__University__Group_15__1
            {
            pushFollow(FOLLOW_14);
            rule__University__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__University__Group_15__1();

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
    // $ANTLR end "rule__University__Group_15__0"


    // $ANTLR start "rule__University__Group_15__0__Impl"
    // InternalSrDsl.g:949:1: rule__University__Group_15__0__Impl : ( ',' ) ;
    public final void rule__University__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:953:1: ( ( ',' ) )
            // InternalSrDsl.g:954:1: ( ',' )
            {
            // InternalSrDsl.g:954:1: ( ',' )
            // InternalSrDsl.g:955:2: ','
            {
             before(grammarAccess.getUniversityAccess().getCommaKeyword_15_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUniversityAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_15__0__Impl"


    // $ANTLR start "rule__University__Group_15__1"
    // InternalSrDsl.g:964:1: rule__University__Group_15__1 : rule__University__Group_15__1__Impl ;
    public final void rule__University__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:968:1: ( rule__University__Group_15__1__Impl )
            // InternalSrDsl.g:969:2: rule__University__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__University__Group_15__1__Impl();

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
    // $ANTLR end "rule__University__Group_15__1"


    // $ANTLR start "rule__University__Group_15__1__Impl"
    // InternalSrDsl.g:975:1: rule__University__Group_15__1__Impl : ( ( rule__University__TeachersAssignment_15_1 ) ) ;
    public final void rule__University__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:979:1: ( ( ( rule__University__TeachersAssignment_15_1 ) ) )
            // InternalSrDsl.g:980:1: ( ( rule__University__TeachersAssignment_15_1 ) )
            {
            // InternalSrDsl.g:980:1: ( ( rule__University__TeachersAssignment_15_1 ) )
            // InternalSrDsl.g:981:2: ( rule__University__TeachersAssignment_15_1 )
            {
             before(grammarAccess.getUniversityAccess().getTeachersAssignment_15_1()); 
            // InternalSrDsl.g:982:2: ( rule__University__TeachersAssignment_15_1 )
            // InternalSrDsl.g:982:3: rule__University__TeachersAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__University__TeachersAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversityAccess().getTeachersAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__Group_15__1__Impl"


    // $ANTLR start "rule__Campus__Group__0"
    // InternalSrDsl.g:991:1: rule__Campus__Group__0 : rule__Campus__Group__0__Impl rule__Campus__Group__1 ;
    public final void rule__Campus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:995:1: ( rule__Campus__Group__0__Impl rule__Campus__Group__1 )
            // InternalSrDsl.g:996:2: rule__Campus__Group__0__Impl rule__Campus__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Campus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__1();

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
    // $ANTLR end "rule__Campus__Group__0"


    // $ANTLR start "rule__Campus__Group__0__Impl"
    // InternalSrDsl.g:1003:1: rule__Campus__Group__0__Impl : ( 'Campus' ) ;
    public final void rule__Campus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1007:1: ( ( 'Campus' ) )
            // InternalSrDsl.g:1008:1: ( 'Campus' )
            {
            // InternalSrDsl.g:1008:1: ( 'Campus' )
            // InternalSrDsl.g:1009:2: 'Campus'
            {
             before(grammarAccess.getCampusAccess().getCampusKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCampusAccess().getCampusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__0__Impl"


    // $ANTLR start "rule__Campus__Group__1"
    // InternalSrDsl.g:1018:1: rule__Campus__Group__1 : rule__Campus__Group__1__Impl rule__Campus__Group__2 ;
    public final void rule__Campus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1022:1: ( rule__Campus__Group__1__Impl rule__Campus__Group__2 )
            // InternalSrDsl.g:1023:2: rule__Campus__Group__1__Impl rule__Campus__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Campus__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__2();

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
    // $ANTLR end "rule__Campus__Group__1"


    // $ANTLR start "rule__Campus__Group__1__Impl"
    // InternalSrDsl.g:1030:1: rule__Campus__Group__1__Impl : ( ( rule__Campus__NameAssignment_1 ) ) ;
    public final void rule__Campus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1034:1: ( ( ( rule__Campus__NameAssignment_1 ) ) )
            // InternalSrDsl.g:1035:1: ( ( rule__Campus__NameAssignment_1 ) )
            {
            // InternalSrDsl.g:1035:1: ( ( rule__Campus__NameAssignment_1 ) )
            // InternalSrDsl.g:1036:2: ( rule__Campus__NameAssignment_1 )
            {
             before(grammarAccess.getCampusAccess().getNameAssignment_1()); 
            // InternalSrDsl.g:1037:2: ( rule__Campus__NameAssignment_1 )
            // InternalSrDsl.g:1037:3: rule__Campus__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Campus__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCampusAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__1__Impl"


    // $ANTLR start "rule__Campus__Group__2"
    // InternalSrDsl.g:1045:1: rule__Campus__Group__2 : rule__Campus__Group__2__Impl rule__Campus__Group__3 ;
    public final void rule__Campus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1049:1: ( rule__Campus__Group__2__Impl rule__Campus__Group__3 )
            // InternalSrDsl.g:1050:2: rule__Campus__Group__2__Impl rule__Campus__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Campus__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__3();

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
    // $ANTLR end "rule__Campus__Group__2"


    // $ANTLR start "rule__Campus__Group__2__Impl"
    // InternalSrDsl.g:1057:1: rule__Campus__Group__2__Impl : ( '{' ) ;
    public final void rule__Campus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1061:1: ( ( '{' ) )
            // InternalSrDsl.g:1062:1: ( '{' )
            {
            // InternalSrDsl.g:1062:1: ( '{' )
            // InternalSrDsl.g:1063:2: '{'
            {
             before(grammarAccess.getCampusAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCampusAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__2__Impl"


    // $ANTLR start "rule__Campus__Group__3"
    // InternalSrDsl.g:1072:1: rule__Campus__Group__3 : rule__Campus__Group__3__Impl rule__Campus__Group__4 ;
    public final void rule__Campus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1076:1: ( rule__Campus__Group__3__Impl rule__Campus__Group__4 )
            // InternalSrDsl.g:1077:2: rule__Campus__Group__3__Impl rule__Campus__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Campus__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__4();

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
    // $ANTLR end "rule__Campus__Group__3"


    // $ANTLR start "rule__Campus__Group__3__Impl"
    // InternalSrDsl.g:1084:1: rule__Campus__Group__3__Impl : ( 'buildings' ) ;
    public final void rule__Campus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1088:1: ( ( 'buildings' ) )
            // InternalSrDsl.g:1089:1: ( 'buildings' )
            {
            // InternalSrDsl.g:1089:1: ( 'buildings' )
            // InternalSrDsl.g:1090:2: 'buildings'
            {
             before(grammarAccess.getCampusAccess().getBuildingsKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCampusAccess().getBuildingsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__3__Impl"


    // $ANTLR start "rule__Campus__Group__4"
    // InternalSrDsl.g:1099:1: rule__Campus__Group__4 : rule__Campus__Group__4__Impl rule__Campus__Group__5 ;
    public final void rule__Campus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1103:1: ( rule__Campus__Group__4__Impl rule__Campus__Group__5 )
            // InternalSrDsl.g:1104:2: rule__Campus__Group__4__Impl rule__Campus__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Campus__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__5();

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
    // $ANTLR end "rule__Campus__Group__4"


    // $ANTLR start "rule__Campus__Group__4__Impl"
    // InternalSrDsl.g:1111:1: rule__Campus__Group__4__Impl : ( '{' ) ;
    public final void rule__Campus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1115:1: ( ( '{' ) )
            // InternalSrDsl.g:1116:1: ( '{' )
            {
            // InternalSrDsl.g:1116:1: ( '{' )
            // InternalSrDsl.g:1117:2: '{'
            {
             before(grammarAccess.getCampusAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCampusAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__4__Impl"


    // $ANTLR start "rule__Campus__Group__5"
    // InternalSrDsl.g:1126:1: rule__Campus__Group__5 : rule__Campus__Group__5__Impl rule__Campus__Group__6 ;
    public final void rule__Campus__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1130:1: ( rule__Campus__Group__5__Impl rule__Campus__Group__6 )
            // InternalSrDsl.g:1131:2: rule__Campus__Group__5__Impl rule__Campus__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Campus__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__6();

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
    // $ANTLR end "rule__Campus__Group__5"


    // $ANTLR start "rule__Campus__Group__5__Impl"
    // InternalSrDsl.g:1138:1: rule__Campus__Group__5__Impl : ( ( rule__Campus__BuildingsAssignment_5 ) ) ;
    public final void rule__Campus__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1142:1: ( ( ( rule__Campus__BuildingsAssignment_5 ) ) )
            // InternalSrDsl.g:1143:1: ( ( rule__Campus__BuildingsAssignment_5 ) )
            {
            // InternalSrDsl.g:1143:1: ( ( rule__Campus__BuildingsAssignment_5 ) )
            // InternalSrDsl.g:1144:2: ( rule__Campus__BuildingsAssignment_5 )
            {
             before(grammarAccess.getCampusAccess().getBuildingsAssignment_5()); 
            // InternalSrDsl.g:1145:2: ( rule__Campus__BuildingsAssignment_5 )
            // InternalSrDsl.g:1145:3: rule__Campus__BuildingsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Campus__BuildingsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCampusAccess().getBuildingsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__5__Impl"


    // $ANTLR start "rule__Campus__Group__6"
    // InternalSrDsl.g:1153:1: rule__Campus__Group__6 : rule__Campus__Group__6__Impl rule__Campus__Group__7 ;
    public final void rule__Campus__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1157:1: ( rule__Campus__Group__6__Impl rule__Campus__Group__7 )
            // InternalSrDsl.g:1158:2: rule__Campus__Group__6__Impl rule__Campus__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Campus__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__7();

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
    // $ANTLR end "rule__Campus__Group__6"


    // $ANTLR start "rule__Campus__Group__6__Impl"
    // InternalSrDsl.g:1165:1: rule__Campus__Group__6__Impl : ( ( rule__Campus__Group_6__0 )* ) ;
    public final void rule__Campus__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1169:1: ( ( ( rule__Campus__Group_6__0 )* ) )
            // InternalSrDsl.g:1170:1: ( ( rule__Campus__Group_6__0 )* )
            {
            // InternalSrDsl.g:1170:1: ( ( rule__Campus__Group_6__0 )* )
            // InternalSrDsl.g:1171:2: ( rule__Campus__Group_6__0 )*
            {
             before(grammarAccess.getCampusAccess().getGroup_6()); 
            // InternalSrDsl.g:1172:2: ( rule__Campus__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSrDsl.g:1172:3: rule__Campus__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Campus__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCampusAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__6__Impl"


    // $ANTLR start "rule__Campus__Group__7"
    // InternalSrDsl.g:1180:1: rule__Campus__Group__7 : rule__Campus__Group__7__Impl rule__Campus__Group__8 ;
    public final void rule__Campus__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1184:1: ( rule__Campus__Group__7__Impl rule__Campus__Group__8 )
            // InternalSrDsl.g:1185:2: rule__Campus__Group__7__Impl rule__Campus__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Campus__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group__8();

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
    // $ANTLR end "rule__Campus__Group__7"


    // $ANTLR start "rule__Campus__Group__7__Impl"
    // InternalSrDsl.g:1192:1: rule__Campus__Group__7__Impl : ( '}' ) ;
    public final void rule__Campus__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1196:1: ( ( '}' ) )
            // InternalSrDsl.g:1197:1: ( '}' )
            {
            // InternalSrDsl.g:1197:1: ( '}' )
            // InternalSrDsl.g:1198:2: '}'
            {
             before(grammarAccess.getCampusAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCampusAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__7__Impl"


    // $ANTLR start "rule__Campus__Group__8"
    // InternalSrDsl.g:1207:1: rule__Campus__Group__8 : rule__Campus__Group__8__Impl ;
    public final void rule__Campus__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1211:1: ( rule__Campus__Group__8__Impl )
            // InternalSrDsl.g:1212:2: rule__Campus__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Campus__Group__8__Impl();

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
    // $ANTLR end "rule__Campus__Group__8"


    // $ANTLR start "rule__Campus__Group__8__Impl"
    // InternalSrDsl.g:1218:1: rule__Campus__Group__8__Impl : ( '}' ) ;
    public final void rule__Campus__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1222:1: ( ( '}' ) )
            // InternalSrDsl.g:1223:1: ( '}' )
            {
            // InternalSrDsl.g:1223:1: ( '}' )
            // InternalSrDsl.g:1224:2: '}'
            {
             before(grammarAccess.getCampusAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCampusAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group__8__Impl"


    // $ANTLR start "rule__Campus__Group_6__0"
    // InternalSrDsl.g:1234:1: rule__Campus__Group_6__0 : rule__Campus__Group_6__0__Impl rule__Campus__Group_6__1 ;
    public final void rule__Campus__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1238:1: ( rule__Campus__Group_6__0__Impl rule__Campus__Group_6__1 )
            // InternalSrDsl.g:1239:2: rule__Campus__Group_6__0__Impl rule__Campus__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__Campus__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campus__Group_6__1();

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
    // $ANTLR end "rule__Campus__Group_6__0"


    // $ANTLR start "rule__Campus__Group_6__0__Impl"
    // InternalSrDsl.g:1246:1: rule__Campus__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Campus__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1250:1: ( ( ',' ) )
            // InternalSrDsl.g:1251:1: ( ',' )
            {
            // InternalSrDsl.g:1251:1: ( ',' )
            // InternalSrDsl.g:1252:2: ','
            {
             before(grammarAccess.getCampusAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCampusAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group_6__0__Impl"


    // $ANTLR start "rule__Campus__Group_6__1"
    // InternalSrDsl.g:1261:1: rule__Campus__Group_6__1 : rule__Campus__Group_6__1__Impl ;
    public final void rule__Campus__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1265:1: ( rule__Campus__Group_6__1__Impl )
            // InternalSrDsl.g:1266:2: rule__Campus__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Campus__Group_6__1__Impl();

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
    // $ANTLR end "rule__Campus__Group_6__1"


    // $ANTLR start "rule__Campus__Group_6__1__Impl"
    // InternalSrDsl.g:1272:1: rule__Campus__Group_6__1__Impl : ( ( rule__Campus__BuildingsAssignment_6_1 ) ) ;
    public final void rule__Campus__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1276:1: ( ( ( rule__Campus__BuildingsAssignment_6_1 ) ) )
            // InternalSrDsl.g:1277:1: ( ( rule__Campus__BuildingsAssignment_6_1 ) )
            {
            // InternalSrDsl.g:1277:1: ( ( rule__Campus__BuildingsAssignment_6_1 ) )
            // InternalSrDsl.g:1278:2: ( rule__Campus__BuildingsAssignment_6_1 )
            {
             before(grammarAccess.getCampusAccess().getBuildingsAssignment_6_1()); 
            // InternalSrDsl.g:1279:2: ( rule__Campus__BuildingsAssignment_6_1 )
            // InternalSrDsl.g:1279:3: rule__Campus__BuildingsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Campus__BuildingsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCampusAccess().getBuildingsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__Group_6__1__Impl"


    // $ANTLR start "rule__Course__Group__0"
    // InternalSrDsl.g:1288:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1292:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalSrDsl.g:1293:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__1();

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
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // InternalSrDsl.g:1300:1: rule__Course__Group__0__Impl : ( 'Course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1304:1: ( ( 'Course' ) )
            // InternalSrDsl.g:1305:1: ( 'Course' )
            {
            // InternalSrDsl.g:1305:1: ( 'Course' )
            // InternalSrDsl.g:1306:2: 'Course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // InternalSrDsl.g:1315:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1319:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalSrDsl.g:1320:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__2();

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
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // InternalSrDsl.g:1327:1: rule__Course__Group__1__Impl : ( ( rule__Course__NameAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1331:1: ( ( ( rule__Course__NameAssignment_1 ) ) )
            // InternalSrDsl.g:1332:1: ( ( rule__Course__NameAssignment_1 ) )
            {
            // InternalSrDsl.g:1332:1: ( ( rule__Course__NameAssignment_1 ) )
            // InternalSrDsl.g:1333:2: ( rule__Course__NameAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_1()); 
            // InternalSrDsl.g:1334:2: ( rule__Course__NameAssignment_1 )
            // InternalSrDsl.g:1334:3: rule__Course__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // InternalSrDsl.g:1342:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1346:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalSrDsl.g:1347:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__3();

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
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // InternalSrDsl.g:1354:1: rule__Course__Group__2__Impl : ( '{' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1358:1: ( ( '{' ) )
            // InternalSrDsl.g:1359:1: ( '{' )
            {
            // InternalSrDsl.g:1359:1: ( '{' )
            // InternalSrDsl.g:1360:2: '{'
            {
             before(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // InternalSrDsl.g:1369:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1373:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalSrDsl.g:1374:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__4();

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
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // InternalSrDsl.g:1381:1: rule__Course__Group__3__Impl : ( 'code' ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1385:1: ( ( 'code' ) )
            // InternalSrDsl.g:1386:1: ( 'code' )
            {
            // InternalSrDsl.g:1386:1: ( 'code' )
            // InternalSrDsl.g:1387:2: 'code'
            {
             before(grammarAccess.getCourseAccess().getCodeKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCodeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // InternalSrDsl.g:1396:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1400:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalSrDsl.g:1401:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__5();

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
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // InternalSrDsl.g:1408:1: rule__Course__Group__4__Impl : ( ( rule__Course__CodeAssignment_4 ) ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1412:1: ( ( ( rule__Course__CodeAssignment_4 ) ) )
            // InternalSrDsl.g:1413:1: ( ( rule__Course__CodeAssignment_4 ) )
            {
            // InternalSrDsl.g:1413:1: ( ( rule__Course__CodeAssignment_4 ) )
            // InternalSrDsl.g:1414:2: ( rule__Course__CodeAssignment_4 )
            {
             before(grammarAccess.getCourseAccess().getCodeAssignment_4()); 
            // InternalSrDsl.g:1415:2: ( rule__Course__CodeAssignment_4 )
            // InternalSrDsl.g:1415:3: rule__Course__CodeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Course__CodeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCodeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // InternalSrDsl.g:1423:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1427:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalSrDsl.g:1428:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__6();

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
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // InternalSrDsl.g:1435:1: rule__Course__Group__5__Impl : ( 'coordinator' ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1439:1: ( ( 'coordinator' ) )
            // InternalSrDsl.g:1440:1: ( 'coordinator' )
            {
            // InternalSrDsl.g:1440:1: ( 'coordinator' )
            // InternalSrDsl.g:1441:2: 'coordinator'
            {
             before(grammarAccess.getCourseAccess().getCoordinatorKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCoordinatorKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // InternalSrDsl.g:1450:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1454:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // InternalSrDsl.g:1455:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Course__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__7();

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
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // InternalSrDsl.g:1462:1: rule__Course__Group__6__Impl : ( ( rule__Course__CoordinatorAssignment_6 ) ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1466:1: ( ( ( rule__Course__CoordinatorAssignment_6 ) ) )
            // InternalSrDsl.g:1467:1: ( ( rule__Course__CoordinatorAssignment_6 ) )
            {
            // InternalSrDsl.g:1467:1: ( ( rule__Course__CoordinatorAssignment_6 ) )
            // InternalSrDsl.g:1468:2: ( rule__Course__CoordinatorAssignment_6 )
            {
             before(grammarAccess.getCourseAccess().getCoordinatorAssignment_6()); 
            // InternalSrDsl.g:1469:2: ( rule__Course__CoordinatorAssignment_6 )
            // InternalSrDsl.g:1469:3: rule__Course__CoordinatorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Course__CoordinatorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getCoordinatorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group__7"
    // InternalSrDsl.g:1477:1: rule__Course__Group__7 : rule__Course__Group__7__Impl rule__Course__Group__8 ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1481:1: ( rule__Course__Group__7__Impl rule__Course__Group__8 )
            // InternalSrDsl.g:1482:2: rule__Course__Group__7__Impl rule__Course__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Course__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__8();

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
    // $ANTLR end "rule__Course__Group__7"


    // $ANTLR start "rule__Course__Group__7__Impl"
    // InternalSrDsl.g:1489:1: rule__Course__Group__7__Impl : ( 'schedulingrequirements' ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1493:1: ( ( 'schedulingrequirements' ) )
            // InternalSrDsl.g:1494:1: ( 'schedulingrequirements' )
            {
            // InternalSrDsl.g:1494:1: ( 'schedulingrequirements' )
            // InternalSrDsl.g:1495:2: 'schedulingrequirements'
            {
             before(grammarAccess.getCourseAccess().getSchedulingrequirementsKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getSchedulingrequirementsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__7__Impl"


    // $ANTLR start "rule__Course__Group__8"
    // InternalSrDsl.g:1504:1: rule__Course__Group__8 : rule__Course__Group__8__Impl rule__Course__Group__9 ;
    public final void rule__Course__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1508:1: ( rule__Course__Group__8__Impl rule__Course__Group__9 )
            // InternalSrDsl.g:1509:2: rule__Course__Group__8__Impl rule__Course__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Course__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__9();

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
    // $ANTLR end "rule__Course__Group__8"


    // $ANTLR start "rule__Course__Group__8__Impl"
    // InternalSrDsl.g:1516:1: rule__Course__Group__8__Impl : ( ( rule__Course__SchedulingrequirementsAssignment_8 ) ) ;
    public final void rule__Course__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1520:1: ( ( ( rule__Course__SchedulingrequirementsAssignment_8 ) ) )
            // InternalSrDsl.g:1521:1: ( ( rule__Course__SchedulingrequirementsAssignment_8 ) )
            {
            // InternalSrDsl.g:1521:1: ( ( rule__Course__SchedulingrequirementsAssignment_8 ) )
            // InternalSrDsl.g:1522:2: ( rule__Course__SchedulingrequirementsAssignment_8 )
            {
             before(grammarAccess.getCourseAccess().getSchedulingrequirementsAssignment_8()); 
            // InternalSrDsl.g:1523:2: ( rule__Course__SchedulingrequirementsAssignment_8 )
            // InternalSrDsl.g:1523:3: rule__Course__SchedulingrequirementsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Course__SchedulingrequirementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getSchedulingrequirementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__8__Impl"


    // $ANTLR start "rule__Course__Group__9"
    // InternalSrDsl.g:1531:1: rule__Course__Group__9 : rule__Course__Group__9__Impl ;
    public final void rule__Course__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1535:1: ( rule__Course__Group__9__Impl )
            // InternalSrDsl.g:1536:2: rule__Course__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__9__Impl();

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
    // $ANTLR end "rule__Course__Group__9"


    // $ANTLR start "rule__Course__Group__9__Impl"
    // InternalSrDsl.g:1542:1: rule__Course__Group__9__Impl : ( '}' ) ;
    public final void rule__Course__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1546:1: ( ( '}' ) )
            // InternalSrDsl.g:1547:1: ( '}' )
            {
            // InternalSrDsl.g:1547:1: ( '}' )
            // InternalSrDsl.g:1548:2: '}'
            {
             before(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__9__Impl"


    // $ANTLR start "rule__Teacher__Group__0"
    // InternalSrDsl.g:1558:1: rule__Teacher__Group__0 : rule__Teacher__Group__0__Impl rule__Teacher__Group__1 ;
    public final void rule__Teacher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1562:1: ( rule__Teacher__Group__0__Impl rule__Teacher__Group__1 )
            // InternalSrDsl.g:1563:2: rule__Teacher__Group__0__Impl rule__Teacher__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Teacher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teacher__Group__1();

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
    // $ANTLR end "rule__Teacher__Group__0"


    // $ANTLR start "rule__Teacher__Group__0__Impl"
    // InternalSrDsl.g:1570:1: rule__Teacher__Group__0__Impl : ( 'Teacher' ) ;
    public final void rule__Teacher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1574:1: ( ( 'Teacher' ) )
            // InternalSrDsl.g:1575:1: ( 'Teacher' )
            {
            // InternalSrDsl.g:1575:1: ( 'Teacher' )
            // InternalSrDsl.g:1576:2: 'Teacher'
            {
             before(grammarAccess.getTeacherAccess().getTeacherKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTeacherAccess().getTeacherKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__0__Impl"


    // $ANTLR start "rule__Teacher__Group__1"
    // InternalSrDsl.g:1585:1: rule__Teacher__Group__1 : rule__Teacher__Group__1__Impl ;
    public final void rule__Teacher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1589:1: ( rule__Teacher__Group__1__Impl )
            // InternalSrDsl.g:1590:2: rule__Teacher__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__Group__1__Impl();

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
    // $ANTLR end "rule__Teacher__Group__1"


    // $ANTLR start "rule__Teacher__Group__1__Impl"
    // InternalSrDsl.g:1596:1: rule__Teacher__Group__1__Impl : ( ( rule__Teacher__NameAssignment_1 ) ) ;
    public final void rule__Teacher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1600:1: ( ( ( rule__Teacher__NameAssignment_1 ) ) )
            // InternalSrDsl.g:1601:1: ( ( rule__Teacher__NameAssignment_1 ) )
            {
            // InternalSrDsl.g:1601:1: ( ( rule__Teacher__NameAssignment_1 ) )
            // InternalSrDsl.g:1602:2: ( rule__Teacher__NameAssignment_1 )
            {
             before(grammarAccess.getTeacherAccess().getNameAssignment_1()); 
            // InternalSrDsl.g:1603:2: ( rule__Teacher__NameAssignment_1 )
            // InternalSrDsl.g:1603:3: rule__Teacher__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Teacher__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeacherAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSrDsl.g:1612:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1616:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSrDsl.g:1617:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSrDsl.g:1624:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1628:1: ( ( ( '-' )? ) )
            // InternalSrDsl.g:1629:1: ( ( '-' )? )
            {
            // InternalSrDsl.g:1629:1: ( ( '-' )? )
            // InternalSrDsl.g:1630:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSrDsl.g:1631:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSrDsl.g:1631:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSrDsl.g:1639:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1643:1: ( rule__EInt__Group__1__Impl )
            // InternalSrDsl.g:1644:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSrDsl.g:1650:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1654:1: ( ( RULE_INT ) )
            // InternalSrDsl.g:1655:1: ( RULE_INT )
            {
            // InternalSrDsl.g:1655:1: ( RULE_INT )
            // InternalSrDsl.g:1656:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Building__Group__0"
    // InternalSrDsl.g:1666:1: rule__Building__Group__0 : rule__Building__Group__0__Impl rule__Building__Group__1 ;
    public final void rule__Building__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1670:1: ( rule__Building__Group__0__Impl rule__Building__Group__1 )
            // InternalSrDsl.g:1671:2: rule__Building__Group__0__Impl rule__Building__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Building__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__1();

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
    // $ANTLR end "rule__Building__Group__0"


    // $ANTLR start "rule__Building__Group__0__Impl"
    // InternalSrDsl.g:1678:1: rule__Building__Group__0__Impl : ( 'Building' ) ;
    public final void rule__Building__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1682:1: ( ( 'Building' ) )
            // InternalSrDsl.g:1683:1: ( 'Building' )
            {
            // InternalSrDsl.g:1683:1: ( 'Building' )
            // InternalSrDsl.g:1684:2: 'Building'
            {
             before(grammarAccess.getBuildingAccess().getBuildingKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBuildingAccess().getBuildingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__0__Impl"


    // $ANTLR start "rule__Building__Group__1"
    // InternalSrDsl.g:1693:1: rule__Building__Group__1 : rule__Building__Group__1__Impl rule__Building__Group__2 ;
    public final void rule__Building__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1697:1: ( rule__Building__Group__1__Impl rule__Building__Group__2 )
            // InternalSrDsl.g:1698:2: rule__Building__Group__1__Impl rule__Building__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Building__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__2();

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
    // $ANTLR end "rule__Building__Group__1"


    // $ANTLR start "rule__Building__Group__1__Impl"
    // InternalSrDsl.g:1705:1: rule__Building__Group__1__Impl : ( ( rule__Building__NameAssignment_1 ) ) ;
    public final void rule__Building__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1709:1: ( ( ( rule__Building__NameAssignment_1 ) ) )
            // InternalSrDsl.g:1710:1: ( ( rule__Building__NameAssignment_1 ) )
            {
            // InternalSrDsl.g:1710:1: ( ( rule__Building__NameAssignment_1 ) )
            // InternalSrDsl.g:1711:2: ( rule__Building__NameAssignment_1 )
            {
             before(grammarAccess.getBuildingAccess().getNameAssignment_1()); 
            // InternalSrDsl.g:1712:2: ( rule__Building__NameAssignment_1 )
            // InternalSrDsl.g:1712:3: rule__Building__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Building__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__1__Impl"


    // $ANTLR start "rule__Building__Group__2"
    // InternalSrDsl.g:1720:1: rule__Building__Group__2 : rule__Building__Group__2__Impl rule__Building__Group__3 ;
    public final void rule__Building__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1724:1: ( rule__Building__Group__2__Impl rule__Building__Group__3 )
            // InternalSrDsl.g:1725:2: rule__Building__Group__2__Impl rule__Building__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Building__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__3();

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
    // $ANTLR end "rule__Building__Group__2"


    // $ANTLR start "rule__Building__Group__2__Impl"
    // InternalSrDsl.g:1732:1: rule__Building__Group__2__Impl : ( '{' ) ;
    public final void rule__Building__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1736:1: ( ( '{' ) )
            // InternalSrDsl.g:1737:1: ( '{' )
            {
            // InternalSrDsl.g:1737:1: ( '{' )
            // InternalSrDsl.g:1738:2: '{'
            {
             before(grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__2__Impl"


    // $ANTLR start "rule__Building__Group__3"
    // InternalSrDsl.g:1747:1: rule__Building__Group__3 : rule__Building__Group__3__Impl rule__Building__Group__4 ;
    public final void rule__Building__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1751:1: ( rule__Building__Group__3__Impl rule__Building__Group__4 )
            // InternalSrDsl.g:1752:2: rule__Building__Group__3__Impl rule__Building__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Building__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__4();

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
    // $ANTLR end "rule__Building__Group__3"


    // $ANTLR start "rule__Building__Group__3__Impl"
    // InternalSrDsl.g:1759:1: rule__Building__Group__3__Impl : ( 'rooms' ) ;
    public final void rule__Building__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1763:1: ( ( 'rooms' ) )
            // InternalSrDsl.g:1764:1: ( 'rooms' )
            {
            // InternalSrDsl.g:1764:1: ( 'rooms' )
            // InternalSrDsl.g:1765:2: 'rooms'
            {
             before(grammarAccess.getBuildingAccess().getRoomsKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBuildingAccess().getRoomsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__3__Impl"


    // $ANTLR start "rule__Building__Group__4"
    // InternalSrDsl.g:1774:1: rule__Building__Group__4 : rule__Building__Group__4__Impl rule__Building__Group__5 ;
    public final void rule__Building__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1778:1: ( rule__Building__Group__4__Impl rule__Building__Group__5 )
            // InternalSrDsl.g:1779:2: rule__Building__Group__4__Impl rule__Building__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Building__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__5();

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
    // $ANTLR end "rule__Building__Group__4"


    // $ANTLR start "rule__Building__Group__4__Impl"
    // InternalSrDsl.g:1786:1: rule__Building__Group__4__Impl : ( '{' ) ;
    public final void rule__Building__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1790:1: ( ( '{' ) )
            // InternalSrDsl.g:1791:1: ( '{' )
            {
            // InternalSrDsl.g:1791:1: ( '{' )
            // InternalSrDsl.g:1792:2: '{'
            {
             before(grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__4__Impl"


    // $ANTLR start "rule__Building__Group__5"
    // InternalSrDsl.g:1801:1: rule__Building__Group__5 : rule__Building__Group__5__Impl rule__Building__Group__6 ;
    public final void rule__Building__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1805:1: ( rule__Building__Group__5__Impl rule__Building__Group__6 )
            // InternalSrDsl.g:1806:2: rule__Building__Group__5__Impl rule__Building__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Building__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__6();

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
    // $ANTLR end "rule__Building__Group__5"


    // $ANTLR start "rule__Building__Group__5__Impl"
    // InternalSrDsl.g:1813:1: rule__Building__Group__5__Impl : ( ( rule__Building__RoomsAssignment_5 ) ) ;
    public final void rule__Building__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1817:1: ( ( ( rule__Building__RoomsAssignment_5 ) ) )
            // InternalSrDsl.g:1818:1: ( ( rule__Building__RoomsAssignment_5 ) )
            {
            // InternalSrDsl.g:1818:1: ( ( rule__Building__RoomsAssignment_5 ) )
            // InternalSrDsl.g:1819:2: ( rule__Building__RoomsAssignment_5 )
            {
             before(grammarAccess.getBuildingAccess().getRoomsAssignment_5()); 
            // InternalSrDsl.g:1820:2: ( rule__Building__RoomsAssignment_5 )
            // InternalSrDsl.g:1820:3: rule__Building__RoomsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Building__RoomsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBuildingAccess().getRoomsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__5__Impl"


    // $ANTLR start "rule__Building__Group__6"
    // InternalSrDsl.g:1828:1: rule__Building__Group__6 : rule__Building__Group__6__Impl rule__Building__Group__7 ;
    public final void rule__Building__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1832:1: ( rule__Building__Group__6__Impl rule__Building__Group__7 )
            // InternalSrDsl.g:1833:2: rule__Building__Group__6__Impl rule__Building__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Building__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__7();

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
    // $ANTLR end "rule__Building__Group__6"


    // $ANTLR start "rule__Building__Group__6__Impl"
    // InternalSrDsl.g:1840:1: rule__Building__Group__6__Impl : ( ( rule__Building__Group_6__0 )* ) ;
    public final void rule__Building__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1844:1: ( ( ( rule__Building__Group_6__0 )* ) )
            // InternalSrDsl.g:1845:1: ( ( rule__Building__Group_6__0 )* )
            {
            // InternalSrDsl.g:1845:1: ( ( rule__Building__Group_6__0 )* )
            // InternalSrDsl.g:1846:2: ( rule__Building__Group_6__0 )*
            {
             before(grammarAccess.getBuildingAccess().getGroup_6()); 
            // InternalSrDsl.g:1847:2: ( rule__Building__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSrDsl.g:1847:3: rule__Building__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Building__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBuildingAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__6__Impl"


    // $ANTLR start "rule__Building__Group__7"
    // InternalSrDsl.g:1855:1: rule__Building__Group__7 : rule__Building__Group__7__Impl rule__Building__Group__8 ;
    public final void rule__Building__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1859:1: ( rule__Building__Group__7__Impl rule__Building__Group__8 )
            // InternalSrDsl.g:1860:2: rule__Building__Group__7__Impl rule__Building__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Building__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group__8();

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
    // $ANTLR end "rule__Building__Group__7"


    // $ANTLR start "rule__Building__Group__7__Impl"
    // InternalSrDsl.g:1867:1: rule__Building__Group__7__Impl : ( '}' ) ;
    public final void rule__Building__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1871:1: ( ( '}' ) )
            // InternalSrDsl.g:1872:1: ( '}' )
            {
            // InternalSrDsl.g:1872:1: ( '}' )
            // InternalSrDsl.g:1873:2: '}'
            {
             before(grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__7__Impl"


    // $ANTLR start "rule__Building__Group__8"
    // InternalSrDsl.g:1882:1: rule__Building__Group__8 : rule__Building__Group__8__Impl ;
    public final void rule__Building__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1886:1: ( rule__Building__Group__8__Impl )
            // InternalSrDsl.g:1887:2: rule__Building__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Building__Group__8__Impl();

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
    // $ANTLR end "rule__Building__Group__8"


    // $ANTLR start "rule__Building__Group__8__Impl"
    // InternalSrDsl.g:1893:1: rule__Building__Group__8__Impl : ( '}' ) ;
    public final void rule__Building__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1897:1: ( ( '}' ) )
            // InternalSrDsl.g:1898:1: ( '}' )
            {
            // InternalSrDsl.g:1898:1: ( '}' )
            // InternalSrDsl.g:1899:2: '}'
            {
             before(grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group__8__Impl"


    // $ANTLR start "rule__Building__Group_6__0"
    // InternalSrDsl.g:1909:1: rule__Building__Group_6__0 : rule__Building__Group_6__0__Impl rule__Building__Group_6__1 ;
    public final void rule__Building__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1913:1: ( rule__Building__Group_6__0__Impl rule__Building__Group_6__1 )
            // InternalSrDsl.g:1914:2: rule__Building__Group_6__0__Impl rule__Building__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Building__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Building__Group_6__1();

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
    // $ANTLR end "rule__Building__Group_6__0"


    // $ANTLR start "rule__Building__Group_6__0__Impl"
    // InternalSrDsl.g:1921:1: rule__Building__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Building__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1925:1: ( ( ',' ) )
            // InternalSrDsl.g:1926:1: ( ',' )
            {
            // InternalSrDsl.g:1926:1: ( ',' )
            // InternalSrDsl.g:1927:2: ','
            {
             before(grammarAccess.getBuildingAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBuildingAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group_6__0__Impl"


    // $ANTLR start "rule__Building__Group_6__1"
    // InternalSrDsl.g:1936:1: rule__Building__Group_6__1 : rule__Building__Group_6__1__Impl ;
    public final void rule__Building__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1940:1: ( rule__Building__Group_6__1__Impl )
            // InternalSrDsl.g:1941:2: rule__Building__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Building__Group_6__1__Impl();

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
    // $ANTLR end "rule__Building__Group_6__1"


    // $ANTLR start "rule__Building__Group_6__1__Impl"
    // InternalSrDsl.g:1947:1: rule__Building__Group_6__1__Impl : ( ( rule__Building__RoomsAssignment_6_1 ) ) ;
    public final void rule__Building__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1951:1: ( ( ( rule__Building__RoomsAssignment_6_1 ) ) )
            // InternalSrDsl.g:1952:1: ( ( rule__Building__RoomsAssignment_6_1 ) )
            {
            // InternalSrDsl.g:1952:1: ( ( rule__Building__RoomsAssignment_6_1 ) )
            // InternalSrDsl.g:1953:2: ( rule__Building__RoomsAssignment_6_1 )
            {
             before(grammarAccess.getBuildingAccess().getRoomsAssignment_6_1()); 
            // InternalSrDsl.g:1954:2: ( rule__Building__RoomsAssignment_6_1 )
            // InternalSrDsl.g:1954:3: rule__Building__RoomsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Building__RoomsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildingAccess().getRoomsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Group_6__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalSrDsl.g:1963:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1967:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalSrDsl.g:1968:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

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
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalSrDsl.g:1975:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1979:1: ( ( 'Room' ) )
            // InternalSrDsl.g:1980:1: ( 'Room' )
            {
            // InternalSrDsl.g:1980:1: ( 'Room' )
            // InternalSrDsl.g:1981:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalSrDsl.g:1990:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:1994:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalSrDsl.g:1995:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

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
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalSrDsl.g:2002:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2006:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalSrDsl.g:2007:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalSrDsl.g:2007:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalSrDsl.g:2008:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalSrDsl.g:2009:2: ( rule__Room__NameAssignment_1 )
            // InternalSrDsl.g:2009:3: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalSrDsl.g:2017:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2021:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalSrDsl.g:2022:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

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
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalSrDsl.g:2029:1: rule__Room__Group__2__Impl : ( '{' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2033:1: ( ( '{' ) )
            // InternalSrDsl.g:2034:1: ( '{' )
            {
            // InternalSrDsl.g:2034:1: ( '{' )
            // InternalSrDsl.g:2035:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalSrDsl.g:2044:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2048:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalSrDsl.g:2049:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

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
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalSrDsl.g:2056:1: rule__Room__Group__3__Impl : ( 'mazemapLink' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2060:1: ( ( 'mazemapLink' ) )
            // InternalSrDsl.g:2061:1: ( 'mazemapLink' )
            {
            // InternalSrDsl.g:2061:1: ( 'mazemapLink' )
            // InternalSrDsl.g:2062:2: 'mazemapLink'
            {
             before(grammarAccess.getRoomAccess().getMazemapLinkKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getMazemapLinkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalSrDsl.g:2071:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2075:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalSrDsl.g:2076:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

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
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalSrDsl.g:2083:1: rule__Room__Group__4__Impl : ( ( rule__Room__MazemapLinkAssignment_4 ) ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2087:1: ( ( ( rule__Room__MazemapLinkAssignment_4 ) ) )
            // InternalSrDsl.g:2088:1: ( ( rule__Room__MazemapLinkAssignment_4 ) )
            {
            // InternalSrDsl.g:2088:1: ( ( rule__Room__MazemapLinkAssignment_4 ) )
            // InternalSrDsl.g:2089:2: ( rule__Room__MazemapLinkAssignment_4 )
            {
             before(grammarAccess.getRoomAccess().getMazemapLinkAssignment_4()); 
            // InternalSrDsl.g:2090:2: ( rule__Room__MazemapLinkAssignment_4 )
            // InternalSrDsl.g:2090:3: rule__Room__MazemapLinkAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Room__MazemapLinkAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getMazemapLinkAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalSrDsl.g:2098:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2102:1: ( rule__Room__Group__5__Impl )
            // InternalSrDsl.g:2103:2: rule__Room__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__5__Impl();

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
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalSrDsl.g:2109:1: rule__Room__Group__5__Impl : ( '}' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2113:1: ( ( '}' ) )
            // InternalSrDsl.g:2114:1: ( '}' )
            {
            // InternalSrDsl.g:2114:1: ( '}' )
            // InternalSrDsl.g:2115:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__0"
    // InternalSrDsl.g:2125:1: rule__SchedulingRequirements__Group__0 : rule__SchedulingRequirements__Group__0__Impl rule__SchedulingRequirements__Group__1 ;
    public final void rule__SchedulingRequirements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2129:1: ( rule__SchedulingRequirements__Group__0__Impl rule__SchedulingRequirements__Group__1 )
            // InternalSrDsl.g:2130:2: rule__SchedulingRequirements__Group__0__Impl rule__SchedulingRequirements__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SchedulingRequirements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__1();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__0"


    // $ANTLR start "rule__SchedulingRequirements__Group__0__Impl"
    // InternalSrDsl.g:2137:1: rule__SchedulingRequirements__Group__0__Impl : ( 'SchedulingRequirements' ) ;
    public final void rule__SchedulingRequirements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2141:1: ( ( 'SchedulingRequirements' ) )
            // InternalSrDsl.g:2142:1: ( 'SchedulingRequirements' )
            {
            // InternalSrDsl.g:2142:1: ( 'SchedulingRequirements' )
            // InternalSrDsl.g:2143:2: 'SchedulingRequirements'
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getSchedulingRequirementsKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getSchedulingRequirementsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__0__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__1"
    // InternalSrDsl.g:2152:1: rule__SchedulingRequirements__Group__1 : rule__SchedulingRequirements__Group__1__Impl rule__SchedulingRequirements__Group__2 ;
    public final void rule__SchedulingRequirements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2156:1: ( rule__SchedulingRequirements__Group__1__Impl rule__SchedulingRequirements__Group__2 )
            // InternalSrDsl.g:2157:2: rule__SchedulingRequirements__Group__1__Impl rule__SchedulingRequirements__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__SchedulingRequirements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__2();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__1"


    // $ANTLR start "rule__SchedulingRequirements__Group__1__Impl"
    // InternalSrDsl.g:2164:1: rule__SchedulingRequirements__Group__1__Impl : ( '{' ) ;
    public final void rule__SchedulingRequirements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2168:1: ( ( '{' ) )
            // InternalSrDsl.g:2169:1: ( '{' )
            {
            // InternalSrDsl.g:2169:1: ( '{' )
            // InternalSrDsl.g:2170:2: '{'
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__1__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__2"
    // InternalSrDsl.g:2179:1: rule__SchedulingRequirements__Group__2 : rule__SchedulingRequirements__Group__2__Impl rule__SchedulingRequirements__Group__3 ;
    public final void rule__SchedulingRequirements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2183:1: ( rule__SchedulingRequirements__Group__2__Impl rule__SchedulingRequirements__Group__3 )
            // InternalSrDsl.g:2184:2: rule__SchedulingRequirements__Group__2__Impl rule__SchedulingRequirements__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SchedulingRequirements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__3();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__2"


    // $ANTLR start "rule__SchedulingRequirements__Group__2__Impl"
    // InternalSrDsl.g:2191:1: rule__SchedulingRequirements__Group__2__Impl : ( 'sender' ) ;
    public final void rule__SchedulingRequirements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2195:1: ( ( 'sender' ) )
            // InternalSrDsl.g:2196:1: ( 'sender' )
            {
            // InternalSrDsl.g:2196:1: ( 'sender' )
            // InternalSrDsl.g:2197:2: 'sender'
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getSenderKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getSenderKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__2__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__3"
    // InternalSrDsl.g:2206:1: rule__SchedulingRequirements__Group__3 : rule__SchedulingRequirements__Group__3__Impl rule__SchedulingRequirements__Group__4 ;
    public final void rule__SchedulingRequirements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2210:1: ( rule__SchedulingRequirements__Group__3__Impl rule__SchedulingRequirements__Group__4 )
            // InternalSrDsl.g:2211:2: rule__SchedulingRequirements__Group__3__Impl rule__SchedulingRequirements__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__SchedulingRequirements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__4();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__3"


    // $ANTLR start "rule__SchedulingRequirements__Group__3__Impl"
    // InternalSrDsl.g:2218:1: rule__SchedulingRequirements__Group__3__Impl : ( ( rule__SchedulingRequirements__SenderAssignment_3 ) ) ;
    public final void rule__SchedulingRequirements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2222:1: ( ( ( rule__SchedulingRequirements__SenderAssignment_3 ) ) )
            // InternalSrDsl.g:2223:1: ( ( rule__SchedulingRequirements__SenderAssignment_3 ) )
            {
            // InternalSrDsl.g:2223:1: ( ( rule__SchedulingRequirements__SenderAssignment_3 ) )
            // InternalSrDsl.g:2224:2: ( rule__SchedulingRequirements__SenderAssignment_3 )
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getSenderAssignment_3()); 
            // InternalSrDsl.g:2225:2: ( rule__SchedulingRequirements__SenderAssignment_3 )
            // InternalSrDsl.g:2225:3: rule__SchedulingRequirements__SenderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__SenderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSchedulingRequirementsAccess().getSenderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__3__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__4"
    // InternalSrDsl.g:2233:1: rule__SchedulingRequirements__Group__4 : rule__SchedulingRequirements__Group__4__Impl rule__SchedulingRequirements__Group__5 ;
    public final void rule__SchedulingRequirements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2237:1: ( rule__SchedulingRequirements__Group__4__Impl rule__SchedulingRequirements__Group__5 )
            // InternalSrDsl.g:2238:2: rule__SchedulingRequirements__Group__4__Impl rule__SchedulingRequirements__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__SchedulingRequirements__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__5();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__4"


    // $ANTLR start "rule__SchedulingRequirements__Group__4__Impl"
    // InternalSrDsl.g:2245:1: rule__SchedulingRequirements__Group__4__Impl : ( 'weeks' ) ;
    public final void rule__SchedulingRequirements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2249:1: ( ( 'weeks' ) )
            // InternalSrDsl.g:2250:1: ( 'weeks' )
            {
            // InternalSrDsl.g:2250:1: ( 'weeks' )
            // InternalSrDsl.g:2251:2: 'weeks'
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getWeeksKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getWeeksKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__4__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__5"
    // InternalSrDsl.g:2260:1: rule__SchedulingRequirements__Group__5 : rule__SchedulingRequirements__Group__5__Impl rule__SchedulingRequirements__Group__6 ;
    public final void rule__SchedulingRequirements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2264:1: ( rule__SchedulingRequirements__Group__5__Impl rule__SchedulingRequirements__Group__6 )
            // InternalSrDsl.g:2265:2: rule__SchedulingRequirements__Group__5__Impl rule__SchedulingRequirements__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__SchedulingRequirements__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__6();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__5"


    // $ANTLR start "rule__SchedulingRequirements__Group__5__Impl"
    // InternalSrDsl.g:2272:1: rule__SchedulingRequirements__Group__5__Impl : ( '{' ) ;
    public final void rule__SchedulingRequirements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2276:1: ( ( '{' ) )
            // InternalSrDsl.g:2277:1: ( '{' )
            {
            // InternalSrDsl.g:2277:1: ( '{' )
            // InternalSrDsl.g:2278:2: '{'
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__5__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__6"
    // InternalSrDsl.g:2287:1: rule__SchedulingRequirements__Group__6 : rule__SchedulingRequirements__Group__6__Impl rule__SchedulingRequirements__Group__7 ;
    public final void rule__SchedulingRequirements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2291:1: ( rule__SchedulingRequirements__Group__6__Impl rule__SchedulingRequirements__Group__7 )
            // InternalSrDsl.g:2292:2: rule__SchedulingRequirements__Group__6__Impl rule__SchedulingRequirements__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__SchedulingRequirements__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__7();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__6"


    // $ANTLR start "rule__SchedulingRequirements__Group__6__Impl"
    // InternalSrDsl.g:2299:1: rule__SchedulingRequirements__Group__6__Impl : ( ( rule__SchedulingRequirements__WeeksAssignment_6 ) ) ;
    public final void rule__SchedulingRequirements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2303:1: ( ( ( rule__SchedulingRequirements__WeeksAssignment_6 ) ) )
            // InternalSrDsl.g:2304:1: ( ( rule__SchedulingRequirements__WeeksAssignment_6 ) )
            {
            // InternalSrDsl.g:2304:1: ( ( rule__SchedulingRequirements__WeeksAssignment_6 ) )
            // InternalSrDsl.g:2305:2: ( rule__SchedulingRequirements__WeeksAssignment_6 )
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getWeeksAssignment_6()); 
            // InternalSrDsl.g:2306:2: ( rule__SchedulingRequirements__WeeksAssignment_6 )
            // InternalSrDsl.g:2306:3: rule__SchedulingRequirements__WeeksAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__WeeksAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSchedulingRequirementsAccess().getWeeksAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__6__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__7"
    // InternalSrDsl.g:2314:1: rule__SchedulingRequirements__Group__7 : rule__SchedulingRequirements__Group__7__Impl rule__SchedulingRequirements__Group__8 ;
    public final void rule__SchedulingRequirements__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2318:1: ( rule__SchedulingRequirements__Group__7__Impl rule__SchedulingRequirements__Group__8 )
            // InternalSrDsl.g:2319:2: rule__SchedulingRequirements__Group__7__Impl rule__SchedulingRequirements__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__SchedulingRequirements__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__8();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__7"


    // $ANTLR start "rule__SchedulingRequirements__Group__7__Impl"
    // InternalSrDsl.g:2326:1: rule__SchedulingRequirements__Group__7__Impl : ( ( rule__SchedulingRequirements__Group_7__0 )* ) ;
    public final void rule__SchedulingRequirements__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2330:1: ( ( ( rule__SchedulingRequirements__Group_7__0 )* ) )
            // InternalSrDsl.g:2331:1: ( ( rule__SchedulingRequirements__Group_7__0 )* )
            {
            // InternalSrDsl.g:2331:1: ( ( rule__SchedulingRequirements__Group_7__0 )* )
            // InternalSrDsl.g:2332:2: ( rule__SchedulingRequirements__Group_7__0 )*
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getGroup_7()); 
            // InternalSrDsl.g:2333:2: ( rule__SchedulingRequirements__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSrDsl.g:2333:3: rule__SchedulingRequirements__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SchedulingRequirements__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSchedulingRequirementsAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__7__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__8"
    // InternalSrDsl.g:2341:1: rule__SchedulingRequirements__Group__8 : rule__SchedulingRequirements__Group__8__Impl rule__SchedulingRequirements__Group__9 ;
    public final void rule__SchedulingRequirements__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2345:1: ( rule__SchedulingRequirements__Group__8__Impl rule__SchedulingRequirements__Group__9 )
            // InternalSrDsl.g:2346:2: rule__SchedulingRequirements__Group__8__Impl rule__SchedulingRequirements__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__SchedulingRequirements__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__9();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__8"


    // $ANTLR start "rule__SchedulingRequirements__Group__8__Impl"
    // InternalSrDsl.g:2353:1: rule__SchedulingRequirements__Group__8__Impl : ( '}' ) ;
    public final void rule__SchedulingRequirements__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2357:1: ( ( '}' ) )
            // InternalSrDsl.g:2358:1: ( '}' )
            {
            // InternalSrDsl.g:2358:1: ( '}' )
            // InternalSrDsl.g:2359:2: '}'
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__8__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group__9"
    // InternalSrDsl.g:2368:1: rule__SchedulingRequirements__Group__9 : rule__SchedulingRequirements__Group__9__Impl ;
    public final void rule__SchedulingRequirements__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2372:1: ( rule__SchedulingRequirements__Group__9__Impl )
            // InternalSrDsl.g:2373:2: rule__SchedulingRequirements__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group__9__Impl();

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
    // $ANTLR end "rule__SchedulingRequirements__Group__9"


    // $ANTLR start "rule__SchedulingRequirements__Group__9__Impl"
    // InternalSrDsl.g:2379:1: rule__SchedulingRequirements__Group__9__Impl : ( '}' ) ;
    public final void rule__SchedulingRequirements__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2383:1: ( ( '}' ) )
            // InternalSrDsl.g:2384:1: ( '}' )
            {
            // InternalSrDsl.g:2384:1: ( '}' )
            // InternalSrDsl.g:2385:2: '}'
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group__9__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group_7__0"
    // InternalSrDsl.g:2395:1: rule__SchedulingRequirements__Group_7__0 : rule__SchedulingRequirements__Group_7__0__Impl rule__SchedulingRequirements__Group_7__1 ;
    public final void rule__SchedulingRequirements__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2399:1: ( rule__SchedulingRequirements__Group_7__0__Impl rule__SchedulingRequirements__Group_7__1 )
            // InternalSrDsl.g:2400:2: rule__SchedulingRequirements__Group_7__0__Impl rule__SchedulingRequirements__Group_7__1
            {
            pushFollow(FOLLOW_27);
            rule__SchedulingRequirements__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group_7__1();

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
    // $ANTLR end "rule__SchedulingRequirements__Group_7__0"


    // $ANTLR start "rule__SchedulingRequirements__Group_7__0__Impl"
    // InternalSrDsl.g:2407:1: rule__SchedulingRequirements__Group_7__0__Impl : ( ',' ) ;
    public final void rule__SchedulingRequirements__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2411:1: ( ( ',' ) )
            // InternalSrDsl.g:2412:1: ( ',' )
            {
            // InternalSrDsl.g:2412:1: ( ',' )
            // InternalSrDsl.g:2413:2: ','
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSchedulingRequirementsAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group_7__0__Impl"


    // $ANTLR start "rule__SchedulingRequirements__Group_7__1"
    // InternalSrDsl.g:2422:1: rule__SchedulingRequirements__Group_7__1 : rule__SchedulingRequirements__Group_7__1__Impl ;
    public final void rule__SchedulingRequirements__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2426:1: ( rule__SchedulingRequirements__Group_7__1__Impl )
            // InternalSrDsl.g:2427:2: rule__SchedulingRequirements__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__Group_7__1__Impl();

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
    // $ANTLR end "rule__SchedulingRequirements__Group_7__1"


    // $ANTLR start "rule__SchedulingRequirements__Group_7__1__Impl"
    // InternalSrDsl.g:2433:1: rule__SchedulingRequirements__Group_7__1__Impl : ( ( rule__SchedulingRequirements__WeeksAssignment_7_1 ) ) ;
    public final void rule__SchedulingRequirements__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2437:1: ( ( ( rule__SchedulingRequirements__WeeksAssignment_7_1 ) ) )
            // InternalSrDsl.g:2438:1: ( ( rule__SchedulingRequirements__WeeksAssignment_7_1 ) )
            {
            // InternalSrDsl.g:2438:1: ( ( rule__SchedulingRequirements__WeeksAssignment_7_1 ) )
            // InternalSrDsl.g:2439:2: ( rule__SchedulingRequirements__WeeksAssignment_7_1 )
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getWeeksAssignment_7_1()); 
            // InternalSrDsl.g:2440:2: ( rule__SchedulingRequirements__WeeksAssignment_7_1 )
            // InternalSrDsl.g:2440:3: rule__SchedulingRequirements__WeeksAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__SchedulingRequirements__WeeksAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSchedulingRequirementsAccess().getWeeksAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__Group_7__1__Impl"


    // $ANTLR start "rule__Week__Group__0"
    // InternalSrDsl.g:2449:1: rule__Week__Group__0 : rule__Week__Group__0__Impl rule__Week__Group__1 ;
    public final void rule__Week__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2453:1: ( rule__Week__Group__0__Impl rule__Week__Group__1 )
            // InternalSrDsl.g:2454:2: rule__Week__Group__0__Impl rule__Week__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Week__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__1();

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
    // $ANTLR end "rule__Week__Group__0"


    // $ANTLR start "rule__Week__Group__0__Impl"
    // InternalSrDsl.g:2461:1: rule__Week__Group__0__Impl : ( 'Week' ) ;
    public final void rule__Week__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2465:1: ( ( 'Week' ) )
            // InternalSrDsl.g:2466:1: ( 'Week' )
            {
            // InternalSrDsl.g:2466:1: ( 'Week' )
            // InternalSrDsl.g:2467:2: 'Week'
            {
             before(grammarAccess.getWeekAccess().getWeekKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getWeekKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__0__Impl"


    // $ANTLR start "rule__Week__Group__1"
    // InternalSrDsl.g:2476:1: rule__Week__Group__1 : rule__Week__Group__1__Impl rule__Week__Group__2 ;
    public final void rule__Week__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2480:1: ( rule__Week__Group__1__Impl rule__Week__Group__2 )
            // InternalSrDsl.g:2481:2: rule__Week__Group__1__Impl rule__Week__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Week__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__2();

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
    // $ANTLR end "rule__Week__Group__1"


    // $ANTLR start "rule__Week__Group__1__Impl"
    // InternalSrDsl.g:2488:1: rule__Week__Group__1__Impl : ( '{' ) ;
    public final void rule__Week__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2492:1: ( ( '{' ) )
            // InternalSrDsl.g:2493:1: ( '{' )
            {
            // InternalSrDsl.g:2493:1: ( '{' )
            // InternalSrDsl.g:2494:2: '{'
            {
             before(grammarAccess.getWeekAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__1__Impl"


    // $ANTLR start "rule__Week__Group__2"
    // InternalSrDsl.g:2503:1: rule__Week__Group__2 : rule__Week__Group__2__Impl rule__Week__Group__3 ;
    public final void rule__Week__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2507:1: ( rule__Week__Group__2__Impl rule__Week__Group__3 )
            // InternalSrDsl.g:2508:2: rule__Week__Group__2__Impl rule__Week__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Week__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__3();

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
    // $ANTLR end "rule__Week__Group__2"


    // $ANTLR start "rule__Week__Group__2__Impl"
    // InternalSrDsl.g:2515:1: rule__Week__Group__2__Impl : ( 'weekNumber' ) ;
    public final void rule__Week__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2519:1: ( ( 'weekNumber' ) )
            // InternalSrDsl.g:2520:1: ( 'weekNumber' )
            {
            // InternalSrDsl.g:2520:1: ( 'weekNumber' )
            // InternalSrDsl.g:2521:2: 'weekNumber'
            {
             before(grammarAccess.getWeekAccess().getWeekNumberKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getWeekNumberKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__2__Impl"


    // $ANTLR start "rule__Week__Group__3"
    // InternalSrDsl.g:2530:1: rule__Week__Group__3 : rule__Week__Group__3__Impl rule__Week__Group__4 ;
    public final void rule__Week__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2534:1: ( rule__Week__Group__3__Impl rule__Week__Group__4 )
            // InternalSrDsl.g:2535:2: rule__Week__Group__3__Impl rule__Week__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Week__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__4();

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
    // $ANTLR end "rule__Week__Group__3"


    // $ANTLR start "rule__Week__Group__3__Impl"
    // InternalSrDsl.g:2542:1: rule__Week__Group__3__Impl : ( ( rule__Week__WeekNumberAssignment_3 ) ) ;
    public final void rule__Week__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2546:1: ( ( ( rule__Week__WeekNumberAssignment_3 ) ) )
            // InternalSrDsl.g:2547:1: ( ( rule__Week__WeekNumberAssignment_3 ) )
            {
            // InternalSrDsl.g:2547:1: ( ( rule__Week__WeekNumberAssignment_3 ) )
            // InternalSrDsl.g:2548:2: ( rule__Week__WeekNumberAssignment_3 )
            {
             before(grammarAccess.getWeekAccess().getWeekNumberAssignment_3()); 
            // InternalSrDsl.g:2549:2: ( rule__Week__WeekNumberAssignment_3 )
            // InternalSrDsl.g:2549:3: rule__Week__WeekNumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Week__WeekNumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWeekAccess().getWeekNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__3__Impl"


    // $ANTLR start "rule__Week__Group__4"
    // InternalSrDsl.g:2557:1: rule__Week__Group__4 : rule__Week__Group__4__Impl rule__Week__Group__5 ;
    public final void rule__Week__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2561:1: ( rule__Week__Group__4__Impl rule__Week__Group__5 )
            // InternalSrDsl.g:2562:2: rule__Week__Group__4__Impl rule__Week__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Week__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__5();

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
    // $ANTLR end "rule__Week__Group__4"


    // $ANTLR start "rule__Week__Group__4__Impl"
    // InternalSrDsl.g:2569:1: rule__Week__Group__4__Impl : ( 'slotRequirements' ) ;
    public final void rule__Week__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2573:1: ( ( 'slotRequirements' ) )
            // InternalSrDsl.g:2574:1: ( 'slotRequirements' )
            {
            // InternalSrDsl.g:2574:1: ( 'slotRequirements' )
            // InternalSrDsl.g:2575:2: 'slotRequirements'
            {
             before(grammarAccess.getWeekAccess().getSlotRequirementsKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getSlotRequirementsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__4__Impl"


    // $ANTLR start "rule__Week__Group__5"
    // InternalSrDsl.g:2584:1: rule__Week__Group__5 : rule__Week__Group__5__Impl rule__Week__Group__6 ;
    public final void rule__Week__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2588:1: ( rule__Week__Group__5__Impl rule__Week__Group__6 )
            // InternalSrDsl.g:2589:2: rule__Week__Group__5__Impl rule__Week__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Week__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__6();

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
    // $ANTLR end "rule__Week__Group__5"


    // $ANTLR start "rule__Week__Group__5__Impl"
    // InternalSrDsl.g:2596:1: rule__Week__Group__5__Impl : ( '{' ) ;
    public final void rule__Week__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2600:1: ( ( '{' ) )
            // InternalSrDsl.g:2601:1: ( '{' )
            {
            // InternalSrDsl.g:2601:1: ( '{' )
            // InternalSrDsl.g:2602:2: '{'
            {
             before(grammarAccess.getWeekAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__5__Impl"


    // $ANTLR start "rule__Week__Group__6"
    // InternalSrDsl.g:2611:1: rule__Week__Group__6 : rule__Week__Group__6__Impl rule__Week__Group__7 ;
    public final void rule__Week__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2615:1: ( rule__Week__Group__6__Impl rule__Week__Group__7 )
            // InternalSrDsl.g:2616:2: rule__Week__Group__6__Impl rule__Week__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Week__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__7();

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
    // $ANTLR end "rule__Week__Group__6"


    // $ANTLR start "rule__Week__Group__6__Impl"
    // InternalSrDsl.g:2623:1: rule__Week__Group__6__Impl : ( ( rule__Week__SlotRequirementsAssignment_6 ) ) ;
    public final void rule__Week__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2627:1: ( ( ( rule__Week__SlotRequirementsAssignment_6 ) ) )
            // InternalSrDsl.g:2628:1: ( ( rule__Week__SlotRequirementsAssignment_6 ) )
            {
            // InternalSrDsl.g:2628:1: ( ( rule__Week__SlotRequirementsAssignment_6 ) )
            // InternalSrDsl.g:2629:2: ( rule__Week__SlotRequirementsAssignment_6 )
            {
             before(grammarAccess.getWeekAccess().getSlotRequirementsAssignment_6()); 
            // InternalSrDsl.g:2630:2: ( rule__Week__SlotRequirementsAssignment_6 )
            // InternalSrDsl.g:2630:3: rule__Week__SlotRequirementsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Week__SlotRequirementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWeekAccess().getSlotRequirementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__6__Impl"


    // $ANTLR start "rule__Week__Group__7"
    // InternalSrDsl.g:2638:1: rule__Week__Group__7 : rule__Week__Group__7__Impl rule__Week__Group__8 ;
    public final void rule__Week__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2642:1: ( rule__Week__Group__7__Impl rule__Week__Group__8 )
            // InternalSrDsl.g:2643:2: rule__Week__Group__7__Impl rule__Week__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Week__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__8();

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
    // $ANTLR end "rule__Week__Group__7"


    // $ANTLR start "rule__Week__Group__7__Impl"
    // InternalSrDsl.g:2650:1: rule__Week__Group__7__Impl : ( ( rule__Week__Group_7__0 )* ) ;
    public final void rule__Week__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2654:1: ( ( ( rule__Week__Group_7__0 )* ) )
            // InternalSrDsl.g:2655:1: ( ( rule__Week__Group_7__0 )* )
            {
            // InternalSrDsl.g:2655:1: ( ( rule__Week__Group_7__0 )* )
            // InternalSrDsl.g:2656:2: ( rule__Week__Group_7__0 )*
            {
             before(grammarAccess.getWeekAccess().getGroup_7()); 
            // InternalSrDsl.g:2657:2: ( rule__Week__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSrDsl.g:2657:3: rule__Week__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Week__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWeekAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__7__Impl"


    // $ANTLR start "rule__Week__Group__8"
    // InternalSrDsl.g:2665:1: rule__Week__Group__8 : rule__Week__Group__8__Impl rule__Week__Group__9 ;
    public final void rule__Week__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2669:1: ( rule__Week__Group__8__Impl rule__Week__Group__9 )
            // InternalSrDsl.g:2670:2: rule__Week__Group__8__Impl rule__Week__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Week__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group__9();

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
    // $ANTLR end "rule__Week__Group__8"


    // $ANTLR start "rule__Week__Group__8__Impl"
    // InternalSrDsl.g:2677:1: rule__Week__Group__8__Impl : ( '}' ) ;
    public final void rule__Week__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2681:1: ( ( '}' ) )
            // InternalSrDsl.g:2682:1: ( '}' )
            {
            // InternalSrDsl.g:2682:1: ( '}' )
            // InternalSrDsl.g:2683:2: '}'
            {
             before(grammarAccess.getWeekAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__8__Impl"


    // $ANTLR start "rule__Week__Group__9"
    // InternalSrDsl.g:2692:1: rule__Week__Group__9 : rule__Week__Group__9__Impl ;
    public final void rule__Week__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2696:1: ( rule__Week__Group__9__Impl )
            // InternalSrDsl.g:2697:2: rule__Week__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Week__Group__9__Impl();

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
    // $ANTLR end "rule__Week__Group__9"


    // $ANTLR start "rule__Week__Group__9__Impl"
    // InternalSrDsl.g:2703:1: rule__Week__Group__9__Impl : ( '}' ) ;
    public final void rule__Week__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2707:1: ( ( '}' ) )
            // InternalSrDsl.g:2708:1: ( '}' )
            {
            // InternalSrDsl.g:2708:1: ( '}' )
            // InternalSrDsl.g:2709:2: '}'
            {
             before(grammarAccess.getWeekAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group__9__Impl"


    // $ANTLR start "rule__Week__Group_7__0"
    // InternalSrDsl.g:2719:1: rule__Week__Group_7__0 : rule__Week__Group_7__0__Impl rule__Week__Group_7__1 ;
    public final void rule__Week__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2723:1: ( rule__Week__Group_7__0__Impl rule__Week__Group_7__1 )
            // InternalSrDsl.g:2724:2: rule__Week__Group_7__0__Impl rule__Week__Group_7__1
            {
            pushFollow(FOLLOW_30);
            rule__Week__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Week__Group_7__1();

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
    // $ANTLR end "rule__Week__Group_7__0"


    // $ANTLR start "rule__Week__Group_7__0__Impl"
    // InternalSrDsl.g:2731:1: rule__Week__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Week__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2735:1: ( ( ',' ) )
            // InternalSrDsl.g:2736:1: ( ',' )
            {
            // InternalSrDsl.g:2736:1: ( ',' )
            // InternalSrDsl.g:2737:2: ','
            {
             before(grammarAccess.getWeekAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWeekAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group_7__0__Impl"


    // $ANTLR start "rule__Week__Group_7__1"
    // InternalSrDsl.g:2746:1: rule__Week__Group_7__1 : rule__Week__Group_7__1__Impl ;
    public final void rule__Week__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2750:1: ( rule__Week__Group_7__1__Impl )
            // InternalSrDsl.g:2751:2: rule__Week__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Week__Group_7__1__Impl();

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
    // $ANTLR end "rule__Week__Group_7__1"


    // $ANTLR start "rule__Week__Group_7__1__Impl"
    // InternalSrDsl.g:2757:1: rule__Week__Group_7__1__Impl : ( ( rule__Week__SlotRequirementsAssignment_7_1 ) ) ;
    public final void rule__Week__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2761:1: ( ( ( rule__Week__SlotRequirementsAssignment_7_1 ) ) )
            // InternalSrDsl.g:2762:1: ( ( rule__Week__SlotRequirementsAssignment_7_1 ) )
            {
            // InternalSrDsl.g:2762:1: ( ( rule__Week__SlotRequirementsAssignment_7_1 ) )
            // InternalSrDsl.g:2763:2: ( rule__Week__SlotRequirementsAssignment_7_1 )
            {
             before(grammarAccess.getWeekAccess().getSlotRequirementsAssignment_7_1()); 
            // InternalSrDsl.g:2764:2: ( rule__Week__SlotRequirementsAssignment_7_1 )
            // InternalSrDsl.g:2764:3: rule__Week__SlotRequirementsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Week__SlotRequirementsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getWeekAccess().getSlotRequirementsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__Group_7__1__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__0"
    // InternalSrDsl.g:2773:1: rule__SlotRequirement__Group__0 : rule__SlotRequirement__Group__0__Impl rule__SlotRequirement__Group__1 ;
    public final void rule__SlotRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2777:1: ( rule__SlotRequirement__Group__0__Impl rule__SlotRequirement__Group__1 )
            // InternalSrDsl.g:2778:2: rule__SlotRequirement__Group__0__Impl rule__SlotRequirement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SlotRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__1();

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
    // $ANTLR end "rule__SlotRequirement__Group__0"


    // $ANTLR start "rule__SlotRequirement__Group__0__Impl"
    // InternalSrDsl.g:2785:1: rule__SlotRequirement__Group__0__Impl : ( 'SlotRequirement' ) ;
    public final void rule__SlotRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2789:1: ( ( 'SlotRequirement' ) )
            // InternalSrDsl.g:2790:1: ( 'SlotRequirement' )
            {
            // InternalSrDsl.g:2790:1: ( 'SlotRequirement' )
            // InternalSrDsl.g:2791:2: 'SlotRequirement'
            {
             before(grammarAccess.getSlotRequirementAccess().getSlotRequirementKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getSlotRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__0__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__1"
    // InternalSrDsl.g:2800:1: rule__SlotRequirement__Group__1 : rule__SlotRequirement__Group__1__Impl rule__SlotRequirement__Group__2 ;
    public final void rule__SlotRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2804:1: ( rule__SlotRequirement__Group__1__Impl rule__SlotRequirement__Group__2 )
            // InternalSrDsl.g:2805:2: rule__SlotRequirement__Group__1__Impl rule__SlotRequirement__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__SlotRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__2();

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
    // $ANTLR end "rule__SlotRequirement__Group__1"


    // $ANTLR start "rule__SlotRequirement__Group__1__Impl"
    // InternalSrDsl.g:2812:1: rule__SlotRequirement__Group__1__Impl : ( '{' ) ;
    public final void rule__SlotRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2816:1: ( ( '{' ) )
            // InternalSrDsl.g:2817:1: ( '{' )
            {
            // InternalSrDsl.g:2817:1: ( '{' )
            // InternalSrDsl.g:2818:2: '{'
            {
             before(grammarAccess.getSlotRequirementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__1__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__2"
    // InternalSrDsl.g:2827:1: rule__SlotRequirement__Group__2 : rule__SlotRequirement__Group__2__Impl rule__SlotRequirement__Group__3 ;
    public final void rule__SlotRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2831:1: ( rule__SlotRequirement__Group__2__Impl rule__SlotRequirement__Group__3 )
            // InternalSrDsl.g:2832:2: rule__SlotRequirement__Group__2__Impl rule__SlotRequirement__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__SlotRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__3();

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
    // $ANTLR end "rule__SlotRequirement__Group__2"


    // $ANTLR start "rule__SlotRequirement__Group__2__Impl"
    // InternalSrDsl.g:2839:1: rule__SlotRequirement__Group__2__Impl : ( 'activityType' ) ;
    public final void rule__SlotRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2843:1: ( ( 'activityType' ) )
            // InternalSrDsl.g:2844:1: ( 'activityType' )
            {
            // InternalSrDsl.g:2844:1: ( 'activityType' )
            // InternalSrDsl.g:2845:2: 'activityType'
            {
             before(grammarAccess.getSlotRequirementAccess().getActivityTypeKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getActivityTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__2__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__3"
    // InternalSrDsl.g:2854:1: rule__SlotRequirement__Group__3 : rule__SlotRequirement__Group__3__Impl rule__SlotRequirement__Group__4 ;
    public final void rule__SlotRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2858:1: ( rule__SlotRequirement__Group__3__Impl rule__SlotRequirement__Group__4 )
            // InternalSrDsl.g:2859:2: rule__SlotRequirement__Group__3__Impl rule__SlotRequirement__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__SlotRequirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__4();

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
    // $ANTLR end "rule__SlotRequirement__Group__3"


    // $ANTLR start "rule__SlotRequirement__Group__3__Impl"
    // InternalSrDsl.g:2866:1: rule__SlotRequirement__Group__3__Impl : ( ( rule__SlotRequirement__ActivityTypeAssignment_3 ) ) ;
    public final void rule__SlotRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2870:1: ( ( ( rule__SlotRequirement__ActivityTypeAssignment_3 ) ) )
            // InternalSrDsl.g:2871:1: ( ( rule__SlotRequirement__ActivityTypeAssignment_3 ) )
            {
            // InternalSrDsl.g:2871:1: ( ( rule__SlotRequirement__ActivityTypeAssignment_3 ) )
            // InternalSrDsl.g:2872:2: ( rule__SlotRequirement__ActivityTypeAssignment_3 )
            {
             before(grammarAccess.getSlotRequirementAccess().getActivityTypeAssignment_3()); 
            // InternalSrDsl.g:2873:2: ( rule__SlotRequirement__ActivityTypeAssignment_3 )
            // InternalSrDsl.g:2873:3: rule__SlotRequirement__ActivityTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__ActivityTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getActivityTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__3__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__4"
    // InternalSrDsl.g:2881:1: rule__SlotRequirement__Group__4 : rule__SlotRequirement__Group__4__Impl rule__SlotRequirement__Group__5 ;
    public final void rule__SlotRequirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2885:1: ( rule__SlotRequirement__Group__4__Impl rule__SlotRequirement__Group__5 )
            // InternalSrDsl.g:2886:2: rule__SlotRequirement__Group__4__Impl rule__SlotRequirement__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SlotRequirement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__5();

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
    // $ANTLR end "rule__SlotRequirement__Group__4"


    // $ANTLR start "rule__SlotRequirement__Group__4__Impl"
    // InternalSrDsl.g:2893:1: rule__SlotRequirement__Group__4__Impl : ( 'duration' ) ;
    public final void rule__SlotRequirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2897:1: ( ( 'duration' ) )
            // InternalSrDsl.g:2898:1: ( 'duration' )
            {
            // InternalSrDsl.g:2898:1: ( 'duration' )
            // InternalSrDsl.g:2899:2: 'duration'
            {
             before(grammarAccess.getSlotRequirementAccess().getDurationKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getDurationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__4__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__5"
    // InternalSrDsl.g:2908:1: rule__SlotRequirement__Group__5 : rule__SlotRequirement__Group__5__Impl rule__SlotRequirement__Group__6 ;
    public final void rule__SlotRequirement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2912:1: ( rule__SlotRequirement__Group__5__Impl rule__SlotRequirement__Group__6 )
            // InternalSrDsl.g:2913:2: rule__SlotRequirement__Group__5__Impl rule__SlotRequirement__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__SlotRequirement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__6();

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
    // $ANTLR end "rule__SlotRequirement__Group__5"


    // $ANTLR start "rule__SlotRequirement__Group__5__Impl"
    // InternalSrDsl.g:2920:1: rule__SlotRequirement__Group__5__Impl : ( ( rule__SlotRequirement__DurationAssignment_5 ) ) ;
    public final void rule__SlotRequirement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2924:1: ( ( ( rule__SlotRequirement__DurationAssignment_5 ) ) )
            // InternalSrDsl.g:2925:1: ( ( rule__SlotRequirement__DurationAssignment_5 ) )
            {
            // InternalSrDsl.g:2925:1: ( ( rule__SlotRequirement__DurationAssignment_5 ) )
            // InternalSrDsl.g:2926:2: ( rule__SlotRequirement__DurationAssignment_5 )
            {
             before(grammarAccess.getSlotRequirementAccess().getDurationAssignment_5()); 
            // InternalSrDsl.g:2927:2: ( rule__SlotRequirement__DurationAssignment_5 )
            // InternalSrDsl.g:2927:3: rule__SlotRequirement__DurationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__DurationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getDurationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__5__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__6"
    // InternalSrDsl.g:2935:1: rule__SlotRequirement__Group__6 : rule__SlotRequirement__Group__6__Impl rule__SlotRequirement__Group__7 ;
    public final void rule__SlotRequirement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2939:1: ( rule__SlotRequirement__Group__6__Impl rule__SlotRequirement__Group__7 )
            // InternalSrDsl.g:2940:2: rule__SlotRequirement__Group__6__Impl rule__SlotRequirement__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SlotRequirement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__7();

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
    // $ANTLR end "rule__SlotRequirement__Group__6"


    // $ANTLR start "rule__SlotRequirement__Group__6__Impl"
    // InternalSrDsl.g:2947:1: rule__SlotRequirement__Group__6__Impl : ( 'expectedStudents' ) ;
    public final void rule__SlotRequirement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2951:1: ( ( 'expectedStudents' ) )
            // InternalSrDsl.g:2952:1: ( 'expectedStudents' )
            {
            // InternalSrDsl.g:2952:1: ( 'expectedStudents' )
            // InternalSrDsl.g:2953:2: 'expectedStudents'
            {
             before(grammarAccess.getSlotRequirementAccess().getExpectedStudentsKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getExpectedStudentsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__6__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__7"
    // InternalSrDsl.g:2962:1: rule__SlotRequirement__Group__7 : rule__SlotRequirement__Group__7__Impl rule__SlotRequirement__Group__8 ;
    public final void rule__SlotRequirement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2966:1: ( rule__SlotRequirement__Group__7__Impl rule__SlotRequirement__Group__8 )
            // InternalSrDsl.g:2967:2: rule__SlotRequirement__Group__7__Impl rule__SlotRequirement__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__SlotRequirement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__8();

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
    // $ANTLR end "rule__SlotRequirement__Group__7"


    // $ANTLR start "rule__SlotRequirement__Group__7__Impl"
    // InternalSrDsl.g:2974:1: rule__SlotRequirement__Group__7__Impl : ( ( rule__SlotRequirement__ExpectedStudentsAssignment_7 ) ) ;
    public final void rule__SlotRequirement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2978:1: ( ( ( rule__SlotRequirement__ExpectedStudentsAssignment_7 ) ) )
            // InternalSrDsl.g:2979:1: ( ( rule__SlotRequirement__ExpectedStudentsAssignment_7 ) )
            {
            // InternalSrDsl.g:2979:1: ( ( rule__SlotRequirement__ExpectedStudentsAssignment_7 ) )
            // InternalSrDsl.g:2980:2: ( rule__SlotRequirement__ExpectedStudentsAssignment_7 )
            {
             before(grammarAccess.getSlotRequirementAccess().getExpectedStudentsAssignment_7()); 
            // InternalSrDsl.g:2981:2: ( rule__SlotRequirement__ExpectedStudentsAssignment_7 )
            // InternalSrDsl.g:2981:3: rule__SlotRequirement__ExpectedStudentsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__ExpectedStudentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getExpectedStudentsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__7__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__8"
    // InternalSrDsl.g:2989:1: rule__SlotRequirement__Group__8 : rule__SlotRequirement__Group__8__Impl rule__SlotRequirement__Group__9 ;
    public final void rule__SlotRequirement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:2993:1: ( rule__SlotRequirement__Group__8__Impl rule__SlotRequirement__Group__9 )
            // InternalSrDsl.g:2994:2: rule__SlotRequirement__Group__8__Impl rule__SlotRequirement__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__SlotRequirement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__9();

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
    // $ANTLR end "rule__SlotRequirement__Group__8"


    // $ANTLR start "rule__SlotRequirement__Group__8__Impl"
    // InternalSrDsl.g:3001:1: rule__SlotRequirement__Group__8__Impl : ( ( rule__SlotRequirement__Group_8__0 )? ) ;
    public final void rule__SlotRequirement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3005:1: ( ( ( rule__SlotRequirement__Group_8__0 )? ) )
            // InternalSrDsl.g:3006:1: ( ( rule__SlotRequirement__Group_8__0 )? )
            {
            // InternalSrDsl.g:3006:1: ( ( rule__SlotRequirement__Group_8__0 )? )
            // InternalSrDsl.g:3007:2: ( rule__SlotRequirement__Group_8__0 )?
            {
             before(grammarAccess.getSlotRequirementAccess().getGroup_8()); 
            // InternalSrDsl.g:3008:2: ( rule__SlotRequirement__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSrDsl.g:3008:3: rule__SlotRequirement__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SlotRequirement__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlotRequirementAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__8__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__9"
    // InternalSrDsl.g:3016:1: rule__SlotRequirement__Group__9 : rule__SlotRequirement__Group__9__Impl rule__SlotRequirement__Group__10 ;
    public final void rule__SlotRequirement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3020:1: ( rule__SlotRequirement__Group__9__Impl rule__SlotRequirement__Group__10 )
            // InternalSrDsl.g:3021:2: rule__SlotRequirement__Group__9__Impl rule__SlotRequirement__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__SlotRequirement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__10();

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
    // $ANTLR end "rule__SlotRequirement__Group__9"


    // $ANTLR start "rule__SlotRequirement__Group__9__Impl"
    // InternalSrDsl.g:3028:1: rule__SlotRequirement__Group__9__Impl : ( ( rule__SlotRequirement__Group_9__0 )? ) ;
    public final void rule__SlotRequirement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3032:1: ( ( ( rule__SlotRequirement__Group_9__0 )? ) )
            // InternalSrDsl.g:3033:1: ( ( rule__SlotRequirement__Group_9__0 )? )
            {
            // InternalSrDsl.g:3033:1: ( ( rule__SlotRequirement__Group_9__0 )? )
            // InternalSrDsl.g:3034:2: ( rule__SlotRequirement__Group_9__0 )?
            {
             before(grammarAccess.getSlotRequirementAccess().getGroup_9()); 
            // InternalSrDsl.g:3035:2: ( rule__SlotRequirement__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==48) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSrDsl.g:3035:3: rule__SlotRequirement__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SlotRequirement__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlotRequirementAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__9__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__10"
    // InternalSrDsl.g:3043:1: rule__SlotRequirement__Group__10 : rule__SlotRequirement__Group__10__Impl rule__SlotRequirement__Group__11 ;
    public final void rule__SlotRequirement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3047:1: ( rule__SlotRequirement__Group__10__Impl rule__SlotRequirement__Group__11 )
            // InternalSrDsl.g:3048:2: rule__SlotRequirement__Group__10__Impl rule__SlotRequirement__Group__11
            {
            pushFollow(FOLLOW_35);
            rule__SlotRequirement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__11();

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
    // $ANTLR end "rule__SlotRequirement__Group__10"


    // $ANTLR start "rule__SlotRequirement__Group__10__Impl"
    // InternalSrDsl.g:3055:1: rule__SlotRequirement__Group__10__Impl : ( ( rule__SlotRequirement__Group_10__0 )? ) ;
    public final void rule__SlotRequirement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3059:1: ( ( ( rule__SlotRequirement__Group_10__0 )? ) )
            // InternalSrDsl.g:3060:1: ( ( rule__SlotRequirement__Group_10__0 )? )
            {
            // InternalSrDsl.g:3060:1: ( ( rule__SlotRequirement__Group_10__0 )? )
            // InternalSrDsl.g:3061:2: ( rule__SlotRequirement__Group_10__0 )?
            {
             before(grammarAccess.getSlotRequirementAccess().getGroup_10()); 
            // InternalSrDsl.g:3062:2: ( rule__SlotRequirement__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSrDsl.g:3062:3: rule__SlotRequirement__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SlotRequirement__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlotRequirementAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__10__Impl"


    // $ANTLR start "rule__SlotRequirement__Group__11"
    // InternalSrDsl.g:3070:1: rule__SlotRequirement__Group__11 : rule__SlotRequirement__Group__11__Impl ;
    public final void rule__SlotRequirement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3074:1: ( rule__SlotRequirement__Group__11__Impl )
            // InternalSrDsl.g:3075:2: rule__SlotRequirement__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group__11__Impl();

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
    // $ANTLR end "rule__SlotRequirement__Group__11"


    // $ANTLR start "rule__SlotRequirement__Group__11__Impl"
    // InternalSrDsl.g:3081:1: rule__SlotRequirement__Group__11__Impl : ( '}' ) ;
    public final void rule__SlotRequirement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3085:1: ( ( '}' ) )
            // InternalSrDsl.g:3086:1: ( '}' )
            {
            // InternalSrDsl.g:3086:1: ( '}' )
            // InternalSrDsl.g:3087:2: '}'
            {
             before(grammarAccess.getSlotRequirementAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group__11__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_8__0"
    // InternalSrDsl.g:3097:1: rule__SlotRequirement__Group_8__0 : rule__SlotRequirement__Group_8__0__Impl rule__SlotRequirement__Group_8__1 ;
    public final void rule__SlotRequirement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3101:1: ( rule__SlotRequirement__Group_8__0__Impl rule__SlotRequirement__Group_8__1 )
            // InternalSrDsl.g:3102:2: rule__SlotRequirement__Group_8__0__Impl rule__SlotRequirement__Group_8__1
            {
            pushFollow(FOLLOW_36);
            rule__SlotRequirement__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_8__1();

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
    // $ANTLR end "rule__SlotRequirement__Group_8__0"


    // $ANTLR start "rule__SlotRequirement__Group_8__0__Impl"
    // InternalSrDsl.g:3109:1: rule__SlotRequirement__Group_8__0__Impl : ( 'requiredPersonal' ) ;
    public final void rule__SlotRequirement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3113:1: ( ( 'requiredPersonal' ) )
            // InternalSrDsl.g:3114:1: ( 'requiredPersonal' )
            {
            // InternalSrDsl.g:3114:1: ( 'requiredPersonal' )
            // InternalSrDsl.g:3115:2: 'requiredPersonal'
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredPersonalKeyword_8_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getRequiredPersonalKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_8__0__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_8__1"
    // InternalSrDsl.g:3124:1: rule__SlotRequirement__Group_8__1 : rule__SlotRequirement__Group_8__1__Impl rule__SlotRequirement__Group_8__2 ;
    public final void rule__SlotRequirement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3128:1: ( rule__SlotRequirement__Group_8__1__Impl rule__SlotRequirement__Group_8__2 )
            // InternalSrDsl.g:3129:2: rule__SlotRequirement__Group_8__1__Impl rule__SlotRequirement__Group_8__2
            {
            pushFollow(FOLLOW_3);
            rule__SlotRequirement__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_8__2();

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
    // $ANTLR end "rule__SlotRequirement__Group_8__1"


    // $ANTLR start "rule__SlotRequirement__Group_8__1__Impl"
    // InternalSrDsl.g:3136:1: rule__SlotRequirement__Group_8__1__Impl : ( '(' ) ;
    public final void rule__SlotRequirement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3140:1: ( ( '(' ) )
            // InternalSrDsl.g:3141:1: ( '(' )
            {
            // InternalSrDsl.g:3141:1: ( '(' )
            // InternalSrDsl.g:3142:2: '('
            {
             before(grammarAccess.getSlotRequirementAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_8__1__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_8__2"
    // InternalSrDsl.g:3151:1: rule__SlotRequirement__Group_8__2 : rule__SlotRequirement__Group_8__2__Impl rule__SlotRequirement__Group_8__3 ;
    public final void rule__SlotRequirement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3155:1: ( rule__SlotRequirement__Group_8__2__Impl rule__SlotRequirement__Group_8__3 )
            // InternalSrDsl.g:3156:2: rule__SlotRequirement__Group_8__2__Impl rule__SlotRequirement__Group_8__3
            {
            pushFollow(FOLLOW_37);
            rule__SlotRequirement__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_8__3();

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
    // $ANTLR end "rule__SlotRequirement__Group_8__2"


    // $ANTLR start "rule__SlotRequirement__Group_8__2__Impl"
    // InternalSrDsl.g:3163:1: rule__SlotRequirement__Group_8__2__Impl : ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_2 ) ) ;
    public final void rule__SlotRequirement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3167:1: ( ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_2 ) ) )
            // InternalSrDsl.g:3168:1: ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_2 ) )
            {
            // InternalSrDsl.g:3168:1: ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_2 ) )
            // InternalSrDsl.g:3169:2: ( rule__SlotRequirement__RequiredPersonalAssignment_8_2 )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredPersonalAssignment_8_2()); 
            // InternalSrDsl.g:3170:2: ( rule__SlotRequirement__RequiredPersonalAssignment_8_2 )
            // InternalSrDsl.g:3170:3: rule__SlotRequirement__RequiredPersonalAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__RequiredPersonalAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredPersonalAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_8__2__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_8__3"
    // InternalSrDsl.g:3178:1: rule__SlotRequirement__Group_8__3 : rule__SlotRequirement__Group_8__3__Impl rule__SlotRequirement__Group_8__4 ;
    public final void rule__SlotRequirement__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3182:1: ( rule__SlotRequirement__Group_8__3__Impl rule__SlotRequirement__Group_8__4 )
            // InternalSrDsl.g:3183:2: rule__SlotRequirement__Group_8__3__Impl rule__SlotRequirement__Group_8__4
            {
            pushFollow(FOLLOW_37);
            rule__SlotRequirement__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_8__4();

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
    // $ANTLR end "rule__SlotRequirement__Group_8__3"


    // $ANTLR start "rule__SlotRequirement__Group_8__3__Impl"
    // InternalSrDsl.g:3190:1: rule__SlotRequirement__Group_8__3__Impl : ( ( rule__SlotRequirement__Group_8_3__0 )* ) ;
    public final void rule__SlotRequirement__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3194:1: ( ( ( rule__SlotRequirement__Group_8_3__0 )* ) )
            // InternalSrDsl.g:3195:1: ( ( rule__SlotRequirement__Group_8_3__0 )* )
            {
            // InternalSrDsl.g:3195:1: ( ( rule__SlotRequirement__Group_8_3__0 )* )
            // InternalSrDsl.g:3196:2: ( rule__SlotRequirement__Group_8_3__0 )*
            {
             before(grammarAccess.getSlotRequirementAccess().getGroup_8_3()); 
            // InternalSrDsl.g:3197:2: ( rule__SlotRequirement__Group_8_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSrDsl.g:3197:3: rule__SlotRequirement__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SlotRequirement__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSlotRequirementAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_8__3__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_8__4"
    // InternalSrDsl.g:3205:1: rule__SlotRequirement__Group_8__4 : rule__SlotRequirement__Group_8__4__Impl ;
    public final void rule__SlotRequirement__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3209:1: ( rule__SlotRequirement__Group_8__4__Impl )
            // InternalSrDsl.g:3210:2: rule__SlotRequirement__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_8__4__Impl();

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
    // $ANTLR end "rule__SlotRequirement__Group_8__4"


    // $ANTLR start "rule__SlotRequirement__Group_8__4__Impl"
    // InternalSrDsl.g:3216:1: rule__SlotRequirement__Group_8__4__Impl : ( ')' ) ;
    public final void rule__SlotRequirement__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3220:1: ( ( ')' ) )
            // InternalSrDsl.g:3221:1: ( ')' )
            {
            // InternalSrDsl.g:3221:1: ( ')' )
            // InternalSrDsl.g:3222:2: ')'
            {
             before(grammarAccess.getSlotRequirementAccess().getRightParenthesisKeyword_8_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_8__4__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_8_3__0"
    // InternalSrDsl.g:3232:1: rule__SlotRequirement__Group_8_3__0 : rule__SlotRequirement__Group_8_3__0__Impl rule__SlotRequirement__Group_8_3__1 ;
    public final void rule__SlotRequirement__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3236:1: ( rule__SlotRequirement__Group_8_3__0__Impl rule__SlotRequirement__Group_8_3__1 )
            // InternalSrDsl.g:3237:2: rule__SlotRequirement__Group_8_3__0__Impl rule__SlotRequirement__Group_8_3__1
            {
            pushFollow(FOLLOW_3);
            rule__SlotRequirement__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_8_3__1();

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
    // $ANTLR end "rule__SlotRequirement__Group_8_3__0"


    // $ANTLR start "rule__SlotRequirement__Group_8_3__0__Impl"
    // InternalSrDsl.g:3244:1: rule__SlotRequirement__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__SlotRequirement__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3248:1: ( ( ',' ) )
            // InternalSrDsl.g:3249:1: ( ',' )
            {
            // InternalSrDsl.g:3249:1: ( ',' )
            // InternalSrDsl.g:3250:2: ','
            {
             before(grammarAccess.getSlotRequirementAccess().getCommaKeyword_8_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_8_3__0__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_8_3__1"
    // InternalSrDsl.g:3259:1: rule__SlotRequirement__Group_8_3__1 : rule__SlotRequirement__Group_8_3__1__Impl ;
    public final void rule__SlotRequirement__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3263:1: ( rule__SlotRequirement__Group_8_3__1__Impl )
            // InternalSrDsl.g:3264:2: rule__SlotRequirement__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__SlotRequirement__Group_8_3__1"


    // $ANTLR start "rule__SlotRequirement__Group_8_3__1__Impl"
    // InternalSrDsl.g:3270:1: rule__SlotRequirement__Group_8_3__1__Impl : ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_3_1 ) ) ;
    public final void rule__SlotRequirement__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3274:1: ( ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_3_1 ) ) )
            // InternalSrDsl.g:3275:1: ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_3_1 ) )
            {
            // InternalSrDsl.g:3275:1: ( ( rule__SlotRequirement__RequiredPersonalAssignment_8_3_1 ) )
            // InternalSrDsl.g:3276:2: ( rule__SlotRequirement__RequiredPersonalAssignment_8_3_1 )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredPersonalAssignment_8_3_1()); 
            // InternalSrDsl.g:3277:2: ( rule__SlotRequirement__RequiredPersonalAssignment_8_3_1 )
            // InternalSrDsl.g:3277:3: rule__SlotRequirement__RequiredPersonalAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__RequiredPersonalAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredPersonalAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_8_3__1__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_9__0"
    // InternalSrDsl.g:3286:1: rule__SlotRequirement__Group_9__0 : rule__SlotRequirement__Group_9__0__Impl rule__SlotRequirement__Group_9__1 ;
    public final void rule__SlotRequirement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3290:1: ( rule__SlotRequirement__Group_9__0__Impl rule__SlotRequirement__Group_9__1 )
            // InternalSrDsl.g:3291:2: rule__SlotRequirement__Group_9__0__Impl rule__SlotRequirement__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__SlotRequirement__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_9__1();

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
    // $ANTLR end "rule__SlotRequirement__Group_9__0"


    // $ANTLR start "rule__SlotRequirement__Group_9__0__Impl"
    // InternalSrDsl.g:3298:1: rule__SlotRequirement__Group_9__0__Impl : ( 'requiredRoom' ) ;
    public final void rule__SlotRequirement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3302:1: ( ( 'requiredRoom' ) )
            // InternalSrDsl.g:3303:1: ( 'requiredRoom' )
            {
            // InternalSrDsl.g:3303:1: ( 'requiredRoom' )
            // InternalSrDsl.g:3304:2: 'requiredRoom'
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredRoomKeyword_9_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getRequiredRoomKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_9__0__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_9__1"
    // InternalSrDsl.g:3313:1: rule__SlotRequirement__Group_9__1 : rule__SlotRequirement__Group_9__1__Impl ;
    public final void rule__SlotRequirement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3317:1: ( rule__SlotRequirement__Group_9__1__Impl )
            // InternalSrDsl.g:3318:2: rule__SlotRequirement__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_9__1__Impl();

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
    // $ANTLR end "rule__SlotRequirement__Group_9__1"


    // $ANTLR start "rule__SlotRequirement__Group_9__1__Impl"
    // InternalSrDsl.g:3324:1: rule__SlotRequirement__Group_9__1__Impl : ( ( rule__SlotRequirement__RequiredRoomAssignment_9_1 ) ) ;
    public final void rule__SlotRequirement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3328:1: ( ( ( rule__SlotRequirement__RequiredRoomAssignment_9_1 ) ) )
            // InternalSrDsl.g:3329:1: ( ( rule__SlotRequirement__RequiredRoomAssignment_9_1 ) )
            {
            // InternalSrDsl.g:3329:1: ( ( rule__SlotRequirement__RequiredRoomAssignment_9_1 ) )
            // InternalSrDsl.g:3330:2: ( rule__SlotRequirement__RequiredRoomAssignment_9_1 )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredRoomAssignment_9_1()); 
            // InternalSrDsl.g:3331:2: ( rule__SlotRequirement__RequiredRoomAssignment_9_1 )
            // InternalSrDsl.g:3331:3: rule__SlotRequirement__RequiredRoomAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__RequiredRoomAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredRoomAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_9__1__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_10__0"
    // InternalSrDsl.g:3340:1: rule__SlotRequirement__Group_10__0 : rule__SlotRequirement__Group_10__0__Impl rule__SlotRequirement__Group_10__1 ;
    public final void rule__SlotRequirement__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3344:1: ( rule__SlotRequirement__Group_10__0__Impl rule__SlotRequirement__Group_10__1 )
            // InternalSrDsl.g:3345:2: rule__SlotRequirement__Group_10__0__Impl rule__SlotRequirement__Group_10__1
            {
            pushFollow(FOLLOW_36);
            rule__SlotRequirement__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_10__1();

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
    // $ANTLR end "rule__SlotRequirement__Group_10__0"


    // $ANTLR start "rule__SlotRequirement__Group_10__0__Impl"
    // InternalSrDsl.g:3352:1: rule__SlotRequirement__Group_10__0__Impl : ( 'requiredSameDaySlots' ) ;
    public final void rule__SlotRequirement__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3356:1: ( ( 'requiredSameDaySlots' ) )
            // InternalSrDsl.g:3357:1: ( 'requiredSameDaySlots' )
            {
            // InternalSrDsl.g:3357:1: ( 'requiredSameDaySlots' )
            // InternalSrDsl.g:3358:2: 'requiredSameDaySlots'
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsKeyword_10_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_10__0__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_10__1"
    // InternalSrDsl.g:3367:1: rule__SlotRequirement__Group_10__1 : rule__SlotRequirement__Group_10__1__Impl rule__SlotRequirement__Group_10__2 ;
    public final void rule__SlotRequirement__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3371:1: ( rule__SlotRequirement__Group_10__1__Impl rule__SlotRequirement__Group_10__2 )
            // InternalSrDsl.g:3372:2: rule__SlotRequirement__Group_10__1__Impl rule__SlotRequirement__Group_10__2
            {
            pushFollow(FOLLOW_3);
            rule__SlotRequirement__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_10__2();

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
    // $ANTLR end "rule__SlotRequirement__Group_10__1"


    // $ANTLR start "rule__SlotRequirement__Group_10__1__Impl"
    // InternalSrDsl.g:3379:1: rule__SlotRequirement__Group_10__1__Impl : ( '(' ) ;
    public final void rule__SlotRequirement__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3383:1: ( ( '(' ) )
            // InternalSrDsl.g:3384:1: ( '(' )
            {
            // InternalSrDsl.g:3384:1: ( '(' )
            // InternalSrDsl.g:3385:2: '('
            {
             before(grammarAccess.getSlotRequirementAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_10__1__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_10__2"
    // InternalSrDsl.g:3394:1: rule__SlotRequirement__Group_10__2 : rule__SlotRequirement__Group_10__2__Impl rule__SlotRequirement__Group_10__3 ;
    public final void rule__SlotRequirement__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3398:1: ( rule__SlotRequirement__Group_10__2__Impl rule__SlotRequirement__Group_10__3 )
            // InternalSrDsl.g:3399:2: rule__SlotRequirement__Group_10__2__Impl rule__SlotRequirement__Group_10__3
            {
            pushFollow(FOLLOW_37);
            rule__SlotRequirement__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_10__3();

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
    // $ANTLR end "rule__SlotRequirement__Group_10__2"


    // $ANTLR start "rule__SlotRequirement__Group_10__2__Impl"
    // InternalSrDsl.g:3406:1: rule__SlotRequirement__Group_10__2__Impl : ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2 ) ) ;
    public final void rule__SlotRequirement__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3410:1: ( ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2 ) ) )
            // InternalSrDsl.g:3411:1: ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2 ) )
            {
            // InternalSrDsl.g:3411:1: ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2 ) )
            // InternalSrDsl.g:3412:2: ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2 )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsAssignment_10_2()); 
            // InternalSrDsl.g:3413:2: ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2 )
            // InternalSrDsl.g:3413:3: rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_10__2__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_10__3"
    // InternalSrDsl.g:3421:1: rule__SlotRequirement__Group_10__3 : rule__SlotRequirement__Group_10__3__Impl rule__SlotRequirement__Group_10__4 ;
    public final void rule__SlotRequirement__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3425:1: ( rule__SlotRequirement__Group_10__3__Impl rule__SlotRequirement__Group_10__4 )
            // InternalSrDsl.g:3426:2: rule__SlotRequirement__Group_10__3__Impl rule__SlotRequirement__Group_10__4
            {
            pushFollow(FOLLOW_37);
            rule__SlotRequirement__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_10__4();

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
    // $ANTLR end "rule__SlotRequirement__Group_10__3"


    // $ANTLR start "rule__SlotRequirement__Group_10__3__Impl"
    // InternalSrDsl.g:3433:1: rule__SlotRequirement__Group_10__3__Impl : ( ( rule__SlotRequirement__Group_10_3__0 )* ) ;
    public final void rule__SlotRequirement__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3437:1: ( ( ( rule__SlotRequirement__Group_10_3__0 )* ) )
            // InternalSrDsl.g:3438:1: ( ( rule__SlotRequirement__Group_10_3__0 )* )
            {
            // InternalSrDsl.g:3438:1: ( ( rule__SlotRequirement__Group_10_3__0 )* )
            // InternalSrDsl.g:3439:2: ( rule__SlotRequirement__Group_10_3__0 )*
            {
             before(grammarAccess.getSlotRequirementAccess().getGroup_10_3()); 
            // InternalSrDsl.g:3440:2: ( rule__SlotRequirement__Group_10_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSrDsl.g:3440:3: rule__SlotRequirement__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SlotRequirement__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSlotRequirementAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_10__3__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_10__4"
    // InternalSrDsl.g:3448:1: rule__SlotRequirement__Group_10__4 : rule__SlotRequirement__Group_10__4__Impl ;
    public final void rule__SlotRequirement__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3452:1: ( rule__SlotRequirement__Group_10__4__Impl )
            // InternalSrDsl.g:3453:2: rule__SlotRequirement__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_10__4__Impl();

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
    // $ANTLR end "rule__SlotRequirement__Group_10__4"


    // $ANTLR start "rule__SlotRequirement__Group_10__4__Impl"
    // InternalSrDsl.g:3459:1: rule__SlotRequirement__Group_10__4__Impl : ( ')' ) ;
    public final void rule__SlotRequirement__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3463:1: ( ( ')' ) )
            // InternalSrDsl.g:3464:1: ( ')' )
            {
            // InternalSrDsl.g:3464:1: ( ')' )
            // InternalSrDsl.g:3465:2: ')'
            {
             before(grammarAccess.getSlotRequirementAccess().getRightParenthesisKeyword_10_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_10__4__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_10_3__0"
    // InternalSrDsl.g:3475:1: rule__SlotRequirement__Group_10_3__0 : rule__SlotRequirement__Group_10_3__0__Impl rule__SlotRequirement__Group_10_3__1 ;
    public final void rule__SlotRequirement__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3479:1: ( rule__SlotRequirement__Group_10_3__0__Impl rule__SlotRequirement__Group_10_3__1 )
            // InternalSrDsl.g:3480:2: rule__SlotRequirement__Group_10_3__0__Impl rule__SlotRequirement__Group_10_3__1
            {
            pushFollow(FOLLOW_3);
            rule__SlotRequirement__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_10_3__1();

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
    // $ANTLR end "rule__SlotRequirement__Group_10_3__0"


    // $ANTLR start "rule__SlotRequirement__Group_10_3__0__Impl"
    // InternalSrDsl.g:3487:1: rule__SlotRequirement__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__SlotRequirement__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3491:1: ( ( ',' ) )
            // InternalSrDsl.g:3492:1: ( ',' )
            {
            // InternalSrDsl.g:3492:1: ( ',' )
            // InternalSrDsl.g:3493:2: ','
            {
             before(grammarAccess.getSlotRequirementAccess().getCommaKeyword_10_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSlotRequirementAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_10_3__0__Impl"


    // $ANTLR start "rule__SlotRequirement__Group_10_3__1"
    // InternalSrDsl.g:3502:1: rule__SlotRequirement__Group_10_3__1 : rule__SlotRequirement__Group_10_3__1__Impl ;
    public final void rule__SlotRequirement__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3506:1: ( rule__SlotRequirement__Group_10_3__1__Impl )
            // InternalSrDsl.g:3507:2: rule__SlotRequirement__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__SlotRequirement__Group_10_3__1"


    // $ANTLR start "rule__SlotRequirement__Group_10_3__1__Impl"
    // InternalSrDsl.g:3513:1: rule__SlotRequirement__Group_10_3__1__Impl : ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1 ) ) ;
    public final void rule__SlotRequirement__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3517:1: ( ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1 ) ) )
            // InternalSrDsl.g:3518:1: ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1 ) )
            {
            // InternalSrDsl.g:3518:1: ( ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1 ) )
            // InternalSrDsl.g:3519:2: ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1 )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsAssignment_10_3_1()); 
            // InternalSrDsl.g:3520:2: ( rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1 )
            // InternalSrDsl.g:3520:3: rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__Group_10_3__1__Impl"


    // $ANTLR start "rule__University__NameAssignment_1"
    // InternalSrDsl.g:3529:1: rule__University__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__University__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3533:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3534:2: ( ruleEString )
            {
            // InternalSrDsl.g:3534:2: ( ruleEString )
            // InternalSrDsl.g:3535:3: ruleEString
            {
             before(grammarAccess.getUniversityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__NameAssignment_1"


    // $ANTLR start "rule__University__YearAssignment_4"
    // InternalSrDsl.g:3544:1: rule__University__YearAssignment_4 : ( ruleEInt ) ;
    public final void rule__University__YearAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3548:1: ( ( ruleEInt ) )
            // InternalSrDsl.g:3549:2: ( ruleEInt )
            {
            // InternalSrDsl.g:3549:2: ( ruleEInt )
            // InternalSrDsl.g:3550:3: ruleEInt
            {
             before(grammarAccess.getUniversityAccess().getYearEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getYearEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__YearAssignment_4"


    // $ANTLR start "rule__University__CampiAssignment_7"
    // InternalSrDsl.g:3559:1: rule__University__CampiAssignment_7 : ( ruleCampus ) ;
    public final void rule__University__CampiAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3563:1: ( ( ruleCampus ) )
            // InternalSrDsl.g:3564:2: ( ruleCampus )
            {
            // InternalSrDsl.g:3564:2: ( ruleCampus )
            // InternalSrDsl.g:3565:3: ruleCampus
            {
             before(grammarAccess.getUniversityAccess().getCampiCampusParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCampus();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getCampiCampusParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__CampiAssignment_7"


    // $ANTLR start "rule__University__CampiAssignment_8_1"
    // InternalSrDsl.g:3574:1: rule__University__CampiAssignment_8_1 : ( ruleCampus ) ;
    public final void rule__University__CampiAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3578:1: ( ( ruleCampus ) )
            // InternalSrDsl.g:3579:2: ( ruleCampus )
            {
            // InternalSrDsl.g:3579:2: ( ruleCampus )
            // InternalSrDsl.g:3580:3: ruleCampus
            {
             before(grammarAccess.getUniversityAccess().getCampiCampusParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCampus();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getCampiCampusParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__CampiAssignment_8_1"


    // $ANTLR start "rule__University__CourseAssignment_11"
    // InternalSrDsl.g:3589:1: rule__University__CourseAssignment_11 : ( ruleCourse ) ;
    public final void rule__University__CourseAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3593:1: ( ( ruleCourse ) )
            // InternalSrDsl.g:3594:2: ( ruleCourse )
            {
            // InternalSrDsl.g:3594:2: ( ruleCourse )
            // InternalSrDsl.g:3595:3: ruleCourse
            {
             before(grammarAccess.getUniversityAccess().getCourseCourseParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getCourseCourseParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__CourseAssignment_11"


    // $ANTLR start "rule__University__TeachersAssignment_14"
    // InternalSrDsl.g:3604:1: rule__University__TeachersAssignment_14 : ( ruleTeacher ) ;
    public final void rule__University__TeachersAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3608:1: ( ( ruleTeacher ) )
            // InternalSrDsl.g:3609:2: ( ruleTeacher )
            {
            // InternalSrDsl.g:3609:2: ( ruleTeacher )
            // InternalSrDsl.g:3610:3: ruleTeacher
            {
             before(grammarAccess.getUniversityAccess().getTeachersTeacherParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getTeachersTeacherParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__TeachersAssignment_14"


    // $ANTLR start "rule__University__TeachersAssignment_15_1"
    // InternalSrDsl.g:3619:1: rule__University__TeachersAssignment_15_1 : ( ruleTeacher ) ;
    public final void rule__University__TeachersAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3623:1: ( ( ruleTeacher ) )
            // InternalSrDsl.g:3624:2: ( ruleTeacher )
            {
            // InternalSrDsl.g:3624:2: ( ruleTeacher )
            // InternalSrDsl.g:3625:3: ruleTeacher
            {
             before(grammarAccess.getUniversityAccess().getTeachersTeacherParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeacher();

            state._fsp--;

             after(grammarAccess.getUniversityAccess().getTeachersTeacherParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__University__TeachersAssignment_15_1"


    // $ANTLR start "rule__Campus__NameAssignment_1"
    // InternalSrDsl.g:3634:1: rule__Campus__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Campus__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3638:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3639:2: ( ruleEString )
            {
            // InternalSrDsl.g:3639:2: ( ruleEString )
            // InternalSrDsl.g:3640:3: ruleEString
            {
             before(grammarAccess.getCampusAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCampusAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__NameAssignment_1"


    // $ANTLR start "rule__Campus__BuildingsAssignment_5"
    // InternalSrDsl.g:3649:1: rule__Campus__BuildingsAssignment_5 : ( ruleBuilding ) ;
    public final void rule__Campus__BuildingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3653:1: ( ( ruleBuilding ) )
            // InternalSrDsl.g:3654:2: ( ruleBuilding )
            {
            // InternalSrDsl.g:3654:2: ( ruleBuilding )
            // InternalSrDsl.g:3655:3: ruleBuilding
            {
             before(grammarAccess.getCampusAccess().getBuildingsBuildingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBuilding();

            state._fsp--;

             after(grammarAccess.getCampusAccess().getBuildingsBuildingParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__BuildingsAssignment_5"


    // $ANTLR start "rule__Campus__BuildingsAssignment_6_1"
    // InternalSrDsl.g:3664:1: rule__Campus__BuildingsAssignment_6_1 : ( ruleBuilding ) ;
    public final void rule__Campus__BuildingsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3668:1: ( ( ruleBuilding ) )
            // InternalSrDsl.g:3669:2: ( ruleBuilding )
            {
            // InternalSrDsl.g:3669:2: ( ruleBuilding )
            // InternalSrDsl.g:3670:3: ruleBuilding
            {
             before(grammarAccess.getCampusAccess().getBuildingsBuildingParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBuilding();

            state._fsp--;

             after(grammarAccess.getCampusAccess().getBuildingsBuildingParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campus__BuildingsAssignment_6_1"


    // $ANTLR start "rule__Course__NameAssignment_1"
    // InternalSrDsl.g:3679:1: rule__Course__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Course__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3683:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3684:2: ( ruleEString )
            {
            // InternalSrDsl.g:3684:2: ( ruleEString )
            // InternalSrDsl.g:3685:3: ruleEString
            {
             before(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__NameAssignment_1"


    // $ANTLR start "rule__Course__CodeAssignment_4"
    // InternalSrDsl.g:3694:1: rule__Course__CodeAssignment_4 : ( ruleEString ) ;
    public final void rule__Course__CodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3698:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3699:2: ( ruleEString )
            {
            // InternalSrDsl.g:3699:2: ( ruleEString )
            // InternalSrDsl.g:3700:3: ruleEString
            {
             before(grammarAccess.getCourseAccess().getCodeEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getCodeEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CodeAssignment_4"


    // $ANTLR start "rule__Course__CoordinatorAssignment_6"
    // InternalSrDsl.g:3709:1: rule__Course__CoordinatorAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Course__CoordinatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3713:1: ( ( ( ruleEString ) ) )
            // InternalSrDsl.g:3714:2: ( ( ruleEString ) )
            {
            // InternalSrDsl.g:3714:2: ( ( ruleEString ) )
            // InternalSrDsl.g:3715:3: ( ruleEString )
            {
             before(grammarAccess.getCourseAccess().getCoordinatorTeacherCrossReference_6_0()); 
            // InternalSrDsl.g:3716:3: ( ruleEString )
            // InternalSrDsl.g:3717:4: ruleEString
            {
             before(grammarAccess.getCourseAccess().getCoordinatorTeacherEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getCoordinatorTeacherEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getCoordinatorTeacherCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__CoordinatorAssignment_6"


    // $ANTLR start "rule__Course__SchedulingrequirementsAssignment_8"
    // InternalSrDsl.g:3728:1: rule__Course__SchedulingrequirementsAssignment_8 : ( ruleschedulingRequirements ) ;
    public final void rule__Course__SchedulingrequirementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3732:1: ( ( ruleschedulingRequirements ) )
            // InternalSrDsl.g:3733:2: ( ruleschedulingRequirements )
            {
            // InternalSrDsl.g:3733:2: ( ruleschedulingRequirements )
            // InternalSrDsl.g:3734:3: ruleschedulingRequirements
            {
             before(grammarAccess.getCourseAccess().getSchedulingrequirementsSchedulingRequirementsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleschedulingRequirements();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getSchedulingrequirementsSchedulingRequirementsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__SchedulingrequirementsAssignment_8"


    // $ANTLR start "rule__Teacher__NameAssignment_1"
    // InternalSrDsl.g:3743:1: rule__Teacher__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Teacher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3747:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3748:2: ( ruleEString )
            {
            // InternalSrDsl.g:3748:2: ( ruleEString )
            // InternalSrDsl.g:3749:3: ruleEString
            {
             before(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Teacher__NameAssignment_1"


    // $ANTLR start "rule__Building__NameAssignment_1"
    // InternalSrDsl.g:3758:1: rule__Building__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Building__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3762:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3763:2: ( ruleEString )
            {
            // InternalSrDsl.g:3763:2: ( ruleEString )
            // InternalSrDsl.g:3764:3: ruleEString
            {
             before(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__NameAssignment_1"


    // $ANTLR start "rule__Building__RoomsAssignment_5"
    // InternalSrDsl.g:3773:1: rule__Building__RoomsAssignment_5 : ( ruleRoom ) ;
    public final void rule__Building__RoomsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3777:1: ( ( ruleRoom ) )
            // InternalSrDsl.g:3778:2: ( ruleRoom )
            {
            // InternalSrDsl.g:3778:2: ( ruleRoom )
            // InternalSrDsl.g:3779:3: ruleRoom
            {
             before(grammarAccess.getBuildingAccess().getRoomsRoomParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getBuildingAccess().getRoomsRoomParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__RoomsAssignment_5"


    // $ANTLR start "rule__Building__RoomsAssignment_6_1"
    // InternalSrDsl.g:3788:1: rule__Building__RoomsAssignment_6_1 : ( ruleRoom ) ;
    public final void rule__Building__RoomsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3792:1: ( ( ruleRoom ) )
            // InternalSrDsl.g:3793:2: ( ruleRoom )
            {
            // InternalSrDsl.g:3793:2: ( ruleRoom )
            // InternalSrDsl.g:3794:3: ruleRoom
            {
             before(grammarAccess.getBuildingAccess().getRoomsRoomParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getBuildingAccess().getRoomsRoomParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__RoomsAssignment_6_1"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalSrDsl.g:3803:1: rule__Room__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3807:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3808:2: ( ruleEString )
            {
            // InternalSrDsl.g:3808:2: ( ruleEString )
            // InternalSrDsl.g:3809:3: ruleEString
            {
             before(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Room__MazemapLinkAssignment_4"
    // InternalSrDsl.g:3818:1: rule__Room__MazemapLinkAssignment_4 : ( ruleEString ) ;
    public final void rule__Room__MazemapLinkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3822:1: ( ( ruleEString ) )
            // InternalSrDsl.g:3823:2: ( ruleEString )
            {
            // InternalSrDsl.g:3823:2: ( ruleEString )
            // InternalSrDsl.g:3824:3: ruleEString
            {
             before(grammarAccess.getRoomAccess().getMazemapLinkEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getMazemapLinkEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__MazemapLinkAssignment_4"


    // $ANTLR start "rule__SchedulingRequirements__SenderAssignment_3"
    // InternalSrDsl.g:3833:1: rule__SchedulingRequirements__SenderAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__SchedulingRequirements__SenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3837:1: ( ( ( ruleEString ) ) )
            // InternalSrDsl.g:3838:2: ( ( ruleEString ) )
            {
            // InternalSrDsl.g:3838:2: ( ( ruleEString ) )
            // InternalSrDsl.g:3839:3: ( ruleEString )
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getSenderTeacherCrossReference_3_0()); 
            // InternalSrDsl.g:3840:3: ( ruleEString )
            // InternalSrDsl.g:3841:4: ruleEString
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getSenderTeacherEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchedulingRequirementsAccess().getSenderTeacherEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSchedulingRequirementsAccess().getSenderTeacherCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__SenderAssignment_3"


    // $ANTLR start "rule__SchedulingRequirements__WeeksAssignment_6"
    // InternalSrDsl.g:3852:1: rule__SchedulingRequirements__WeeksAssignment_6 : ( ruleWeek ) ;
    public final void rule__SchedulingRequirements__WeeksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3856:1: ( ( ruleWeek ) )
            // InternalSrDsl.g:3857:2: ( ruleWeek )
            {
            // InternalSrDsl.g:3857:2: ( ruleWeek )
            // InternalSrDsl.g:3858:3: ruleWeek
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getWeeksWeekParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleWeek();

            state._fsp--;

             after(grammarAccess.getSchedulingRequirementsAccess().getWeeksWeekParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__WeeksAssignment_6"


    // $ANTLR start "rule__SchedulingRequirements__WeeksAssignment_7_1"
    // InternalSrDsl.g:3867:1: rule__SchedulingRequirements__WeeksAssignment_7_1 : ( ruleWeek ) ;
    public final void rule__SchedulingRequirements__WeeksAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3871:1: ( ( ruleWeek ) )
            // InternalSrDsl.g:3872:2: ( ruleWeek )
            {
            // InternalSrDsl.g:3872:2: ( ruleWeek )
            // InternalSrDsl.g:3873:3: ruleWeek
            {
             before(grammarAccess.getSchedulingRequirementsAccess().getWeeksWeekParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWeek();

            state._fsp--;

             after(grammarAccess.getSchedulingRequirementsAccess().getWeeksWeekParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchedulingRequirements__WeeksAssignment_7_1"


    // $ANTLR start "rule__Week__WeekNumberAssignment_3"
    // InternalSrDsl.g:3882:1: rule__Week__WeekNumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__Week__WeekNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3886:1: ( ( ruleEInt ) )
            // InternalSrDsl.g:3887:2: ( ruleEInt )
            {
            // InternalSrDsl.g:3887:2: ( ruleEInt )
            // InternalSrDsl.g:3888:3: ruleEInt
            {
             before(grammarAccess.getWeekAccess().getWeekNumberEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWeekAccess().getWeekNumberEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__WeekNumberAssignment_3"


    // $ANTLR start "rule__Week__SlotRequirementsAssignment_6"
    // InternalSrDsl.g:3897:1: rule__Week__SlotRequirementsAssignment_6 : ( ruleSlotRequirement ) ;
    public final void rule__Week__SlotRequirementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3901:1: ( ( ruleSlotRequirement ) )
            // InternalSrDsl.g:3902:2: ( ruleSlotRequirement )
            {
            // InternalSrDsl.g:3902:2: ( ruleSlotRequirement )
            // InternalSrDsl.g:3903:3: ruleSlotRequirement
            {
             before(grammarAccess.getWeekAccess().getSlotRequirementsSlotRequirementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSlotRequirement();

            state._fsp--;

             after(grammarAccess.getWeekAccess().getSlotRequirementsSlotRequirementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__SlotRequirementsAssignment_6"


    // $ANTLR start "rule__Week__SlotRequirementsAssignment_7_1"
    // InternalSrDsl.g:3912:1: rule__Week__SlotRequirementsAssignment_7_1 : ( ruleSlotRequirement ) ;
    public final void rule__Week__SlotRequirementsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3916:1: ( ( ruleSlotRequirement ) )
            // InternalSrDsl.g:3917:2: ( ruleSlotRequirement )
            {
            // InternalSrDsl.g:3917:2: ( ruleSlotRequirement )
            // InternalSrDsl.g:3918:3: ruleSlotRequirement
            {
             before(grammarAccess.getWeekAccess().getSlotRequirementsSlotRequirementParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSlotRequirement();

            state._fsp--;

             after(grammarAccess.getWeekAccess().getSlotRequirementsSlotRequirementParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Week__SlotRequirementsAssignment_7_1"


    // $ANTLR start "rule__SlotRequirement__ActivityTypeAssignment_3"
    // InternalSrDsl.g:3927:1: rule__SlotRequirement__ActivityTypeAssignment_3 : ( ruleActivityType ) ;
    public final void rule__SlotRequirement__ActivityTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3931:1: ( ( ruleActivityType ) )
            // InternalSrDsl.g:3932:2: ( ruleActivityType )
            {
            // InternalSrDsl.g:3932:2: ( ruleActivityType )
            // InternalSrDsl.g:3933:3: ruleActivityType
            {
             before(grammarAccess.getSlotRequirementAccess().getActivityTypeActivityTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityType();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getActivityTypeActivityTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__ActivityTypeAssignment_3"


    // $ANTLR start "rule__SlotRequirement__DurationAssignment_5"
    // InternalSrDsl.g:3942:1: rule__SlotRequirement__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__SlotRequirement__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3946:1: ( ( ruleEInt ) )
            // InternalSrDsl.g:3947:2: ( ruleEInt )
            {
            // InternalSrDsl.g:3947:2: ( ruleEInt )
            // InternalSrDsl.g:3948:3: ruleEInt
            {
             before(grammarAccess.getSlotRequirementAccess().getDurationEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getDurationEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__DurationAssignment_5"


    // $ANTLR start "rule__SlotRequirement__ExpectedStudentsAssignment_7"
    // InternalSrDsl.g:3957:1: rule__SlotRequirement__ExpectedStudentsAssignment_7 : ( ruleEInt ) ;
    public final void rule__SlotRequirement__ExpectedStudentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3961:1: ( ( ruleEInt ) )
            // InternalSrDsl.g:3962:2: ( ruleEInt )
            {
            // InternalSrDsl.g:3962:2: ( ruleEInt )
            // InternalSrDsl.g:3963:3: ruleEInt
            {
             before(grammarAccess.getSlotRequirementAccess().getExpectedStudentsEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getExpectedStudentsEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__ExpectedStudentsAssignment_7"


    // $ANTLR start "rule__SlotRequirement__RequiredPersonalAssignment_8_2"
    // InternalSrDsl.g:3972:1: rule__SlotRequirement__RequiredPersonalAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__SlotRequirement__RequiredPersonalAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3976:1: ( ( ( ruleEString ) ) )
            // InternalSrDsl.g:3977:2: ( ( ruleEString ) )
            {
            // InternalSrDsl.g:3977:2: ( ( ruleEString ) )
            // InternalSrDsl.g:3978:3: ( ruleEString )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherCrossReference_8_2_0()); 
            // InternalSrDsl.g:3979:3: ( ruleEString )
            // InternalSrDsl.g:3980:4: ruleEString
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__RequiredPersonalAssignment_8_2"


    // $ANTLR start "rule__SlotRequirement__RequiredPersonalAssignment_8_3_1"
    // InternalSrDsl.g:3991:1: rule__SlotRequirement__RequiredPersonalAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SlotRequirement__RequiredPersonalAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:3995:1: ( ( ( ruleEString ) ) )
            // InternalSrDsl.g:3996:2: ( ( ruleEString ) )
            {
            // InternalSrDsl.g:3996:2: ( ( ruleEString ) )
            // InternalSrDsl.g:3997:3: ( ruleEString )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherCrossReference_8_3_1_0()); 
            // InternalSrDsl.g:3998:3: ( ruleEString )
            // InternalSrDsl.g:3999:4: ruleEString
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__RequiredPersonalAssignment_8_3_1"


    // $ANTLR start "rule__SlotRequirement__RequiredRoomAssignment_9_1"
    // InternalSrDsl.g:4010:1: rule__SlotRequirement__RequiredRoomAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__SlotRequirement__RequiredRoomAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:4014:1: ( ( ( ruleEString ) ) )
            // InternalSrDsl.g:4015:2: ( ( ruleEString ) )
            {
            // InternalSrDsl.g:4015:2: ( ( ruleEString ) )
            // InternalSrDsl.g:4016:3: ( ruleEString )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredRoomRoomCrossReference_9_1_0()); 
            // InternalSrDsl.g:4017:3: ( ruleEString )
            // InternalSrDsl.g:4018:4: ruleEString
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredRoomRoomEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getRequiredRoomRoomEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredRoomRoomCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__RequiredRoomAssignment_9_1"


    // $ANTLR start "rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2"
    // InternalSrDsl.g:4029:1: rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:4033:1: ( ( ( ruleEString ) ) )
            // InternalSrDsl.g:4034:2: ( ( ruleEString ) )
            {
            // InternalSrDsl.g:4034:2: ( ( ruleEString ) )
            // InternalSrDsl.g:4035:3: ( ruleEString )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementCrossReference_10_2_0()); 
            // InternalSrDsl.g:4036:3: ( ruleEString )
            // InternalSrDsl.g:4037:4: ruleEString
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2"


    // $ANTLR start "rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1"
    // InternalSrDsl.g:4048:1: rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSrDsl.g:4052:1: ( ( ( ruleEString ) ) )
            // InternalSrDsl.g:4053:2: ( ( ruleEString ) )
            {
            // InternalSrDsl.g:4053:2: ( ( ruleEString ) )
            // InternalSrDsl.g:4054:3: ( ruleEString )
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementCrossReference_10_3_1_0()); 
            // InternalSrDsl.g:4055:3: ( ruleEString )
            // InternalSrDsl.g:4056:4: ruleEString
            {
             before(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003200000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000400000L});

}