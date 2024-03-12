package no.ntnu.tdt4250.group13.scheduling_requirements.xtext.parser.antlr.internal;

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
import no.ntnu.tdt4250.group13.scheduling_requirements.xtext.services.SrDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSrDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'University'", "'{'", "'year'", "'campus'", "','", "'}'", "'course'", "'teachers'", "'Campus'", "'buildings'", "'Course'", "'code'", "'coordinator'", "'schedulingrequirements'", "'Teacher'", "'-'", "'Building'", "'rooms'", "'Room'", "'mazemapLink'", "'SchedulingRequirements'", "'sender'", "'weeks'", "'Week'", "'weekNumber'", "'slotRequirements'", "'SlotRequirement'", "'activityType'", "'duration'", "'expectedStudents'", "'requiredPersonal'", "'('", "')'", "'requiredRoom'", "'requiredSameDaySlots'", "'LECTURE'", "'EXERCISE'", "'LAB'", "'SUPERVISION'"
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

        public InternalSrDslParser(TokenStream input, SrDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "University";
       	}

       	@Override
       	protected SrDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUniversity"
    // InternalSrDsl.g:65:1: entryRuleUniversity returns [EObject current=null] : iv_ruleUniversity= ruleUniversity EOF ;
    public final EObject entryRuleUniversity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversity = null;


        try {
            // InternalSrDsl.g:65:51: (iv_ruleUniversity= ruleUniversity EOF )
            // InternalSrDsl.g:66:2: iv_ruleUniversity= ruleUniversity EOF
            {
             newCompositeNode(grammarAccess.getUniversityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversity=ruleUniversity();

            state._fsp--;

             current =iv_ruleUniversity; 
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
    // $ANTLR end "entryRuleUniversity"


    // $ANTLR start "ruleUniversity"
    // InternalSrDsl.g:72:1: ruleUniversity returns [EObject current=null] : (otherlv_0= 'University' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'year' ( (lv_year_4_0= ruleEInt ) ) otherlv_5= 'campus' otherlv_6= '{' ( (lv_campi_7_0= ruleCampus ) ) (otherlv_8= ',' ( (lv_campi_9_0= ruleCampus ) ) )* otherlv_10= '}' otherlv_11= 'course' ( (lv_course_12_0= ruleCourse ) ) otherlv_13= 'teachers' otherlv_14= '{' ( (lv_teachers_15_0= ruleTeacher ) ) (otherlv_16= ',' ( (lv_teachers_17_0= ruleTeacher ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleUniversity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_year_4_0 = null;

        EObject lv_campi_7_0 = null;

        EObject lv_campi_9_0 = null;

        EObject lv_course_12_0 = null;

        EObject lv_teachers_15_0 = null;

        EObject lv_teachers_17_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:78:2: ( (otherlv_0= 'University' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'year' ( (lv_year_4_0= ruleEInt ) ) otherlv_5= 'campus' otherlv_6= '{' ( (lv_campi_7_0= ruleCampus ) ) (otherlv_8= ',' ( (lv_campi_9_0= ruleCampus ) ) )* otherlv_10= '}' otherlv_11= 'course' ( (lv_course_12_0= ruleCourse ) ) otherlv_13= 'teachers' otherlv_14= '{' ( (lv_teachers_15_0= ruleTeacher ) ) (otherlv_16= ',' ( (lv_teachers_17_0= ruleTeacher ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalSrDsl.g:79:2: (otherlv_0= 'University' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'year' ( (lv_year_4_0= ruleEInt ) ) otherlv_5= 'campus' otherlv_6= '{' ( (lv_campi_7_0= ruleCampus ) ) (otherlv_8= ',' ( (lv_campi_9_0= ruleCampus ) ) )* otherlv_10= '}' otherlv_11= 'course' ( (lv_course_12_0= ruleCourse ) ) otherlv_13= 'teachers' otherlv_14= '{' ( (lv_teachers_15_0= ruleTeacher ) ) (otherlv_16= ',' ( (lv_teachers_17_0= ruleTeacher ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalSrDsl.g:79:2: (otherlv_0= 'University' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'year' ( (lv_year_4_0= ruleEInt ) ) otherlv_5= 'campus' otherlv_6= '{' ( (lv_campi_7_0= ruleCampus ) ) (otherlv_8= ',' ( (lv_campi_9_0= ruleCampus ) ) )* otherlv_10= '}' otherlv_11= 'course' ( (lv_course_12_0= ruleCourse ) ) otherlv_13= 'teachers' otherlv_14= '{' ( (lv_teachers_15_0= ruleTeacher ) ) (otherlv_16= ',' ( (lv_teachers_17_0= ruleTeacher ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalSrDsl.g:80:3: otherlv_0= 'University' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'year' ( (lv_year_4_0= ruleEInt ) ) otherlv_5= 'campus' otherlv_6= '{' ( (lv_campi_7_0= ruleCampus ) ) (otherlv_8= ',' ( (lv_campi_9_0= ruleCampus ) ) )* otherlv_10= '}' otherlv_11= 'course' ( (lv_course_12_0= ruleCourse ) ) otherlv_13= 'teachers' otherlv_14= '{' ( (lv_teachers_15_0= ruleTeacher ) ) (otherlv_16= ',' ( (lv_teachers_17_0= ruleTeacher ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniversityAccess().getUniversityKeyword_0());
            		
            // InternalSrDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSrDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalSrDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalSrDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUniversityAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getUniversityAccess().getYearKeyword_3());
            		
            // InternalSrDsl.g:111:3: ( (lv_year_4_0= ruleEInt ) )
            // InternalSrDsl.g:112:4: (lv_year_4_0= ruleEInt )
            {
            // InternalSrDsl.g:112:4: (lv_year_4_0= ruleEInt )
            // InternalSrDsl.g:113:5: lv_year_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUniversityAccess().getYearEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_year_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversityRule());
            					}
            					set(
            						current,
            						"year",
            						lv_year_4_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getUniversityAccess().getCampusKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSrDsl.g:138:3: ( (lv_campi_7_0= ruleCampus ) )
            // InternalSrDsl.g:139:4: (lv_campi_7_0= ruleCampus )
            {
            // InternalSrDsl.g:139:4: (lv_campi_7_0= ruleCampus )
            // InternalSrDsl.g:140:5: lv_campi_7_0= ruleCampus
            {

            					newCompositeNode(grammarAccess.getUniversityAccess().getCampiCampusParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_campi_7_0=ruleCampus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversityRule());
            					}
            					add(
            						current,
            						"campi",
            						lv_campi_7_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Campus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSrDsl.g:157:3: (otherlv_8= ',' ( (lv_campi_9_0= ruleCampus ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSrDsl.g:158:4: otherlv_8= ',' ( (lv_campi_9_0= ruleCampus ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getUniversityAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSrDsl.g:162:4: ( (lv_campi_9_0= ruleCampus ) )
            	    // InternalSrDsl.g:163:5: (lv_campi_9_0= ruleCampus )
            	    {
            	    // InternalSrDsl.g:163:5: (lv_campi_9_0= ruleCampus )
            	    // InternalSrDsl.g:164:6: lv_campi_9_0= ruleCampus
            	    {

            	    						newCompositeNode(grammarAccess.getUniversityAccess().getCampiCampusParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_campi_9_0=ruleCampus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUniversityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"campi",
            	    							lv_campi_9_0,
            	    							"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Campus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getUniversityAccess().getCourseKeyword_10());
            		
            // InternalSrDsl.g:190:3: ( (lv_course_12_0= ruleCourse ) )
            // InternalSrDsl.g:191:4: (lv_course_12_0= ruleCourse )
            {
            // InternalSrDsl.g:191:4: (lv_course_12_0= ruleCourse )
            // InternalSrDsl.g:192:5: lv_course_12_0= ruleCourse
            {

            					newCompositeNode(grammarAccess.getUniversityAccess().getCourseCourseParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_course_12_0=ruleCourse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversityRule());
            					}
            					set(
            						current,
            						"course",
            						lv_course_12_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Course");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getUniversityAccess().getTeachersKeyword_12());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getUniversityAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalSrDsl.g:217:3: ( (lv_teachers_15_0= ruleTeacher ) )
            // InternalSrDsl.g:218:4: (lv_teachers_15_0= ruleTeacher )
            {
            // InternalSrDsl.g:218:4: (lv_teachers_15_0= ruleTeacher )
            // InternalSrDsl.g:219:5: lv_teachers_15_0= ruleTeacher
            {

            					newCompositeNode(grammarAccess.getUniversityAccess().getTeachersTeacherParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_teachers_15_0=ruleTeacher();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversityRule());
            					}
            					add(
            						current,
            						"teachers",
            						lv_teachers_15_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Teacher");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSrDsl.g:236:3: (otherlv_16= ',' ( (lv_teachers_17_0= ruleTeacher ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSrDsl.g:237:4: otherlv_16= ',' ( (lv_teachers_17_0= ruleTeacher ) )
            	    {
            	    otherlv_16=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_16, grammarAccess.getUniversityAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalSrDsl.g:241:4: ( (lv_teachers_17_0= ruleTeacher ) )
            	    // InternalSrDsl.g:242:5: (lv_teachers_17_0= ruleTeacher )
            	    {
            	    // InternalSrDsl.g:242:5: (lv_teachers_17_0= ruleTeacher )
            	    // InternalSrDsl.g:243:6: lv_teachers_17_0= ruleTeacher
            	    {

            	    						newCompositeNode(grammarAccess.getUniversityAccess().getTeachersTeacherParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_teachers_17_0=ruleTeacher();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUniversityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"teachers",
            	    							lv_teachers_17_0,
            	    							"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Teacher");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_18=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_18, grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getUniversityAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleUniversity"


    // $ANTLR start "entryRuleEString"
    // InternalSrDsl.g:273:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSrDsl.g:273:47: (iv_ruleEString= ruleEString EOF )
            // InternalSrDsl.g:274:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSrDsl.g:280:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSrDsl.g:286:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSrDsl.g:287:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSrDsl.g:287:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSrDsl.g:288:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSrDsl.g:296:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCampus"
    // InternalSrDsl.g:307:1: entryRuleCampus returns [EObject current=null] : iv_ruleCampus= ruleCampus EOF ;
    public final EObject entryRuleCampus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampus = null;


        try {
            // InternalSrDsl.g:307:47: (iv_ruleCampus= ruleCampus EOF )
            // InternalSrDsl.g:308:2: iv_ruleCampus= ruleCampus EOF
            {
             newCompositeNode(grammarAccess.getCampusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCampus=ruleCampus();

            state._fsp--;

             current =iv_ruleCampus; 
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
    // $ANTLR end "entryRuleCampus"


    // $ANTLR start "ruleCampus"
    // InternalSrDsl.g:314:1: ruleCampus returns [EObject current=null] : (otherlv_0= 'Campus' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'buildings' otherlv_4= '{' ( (lv_buildings_5_0= ruleBuilding ) ) (otherlv_6= ',' ( (lv_buildings_7_0= ruleBuilding ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleCampus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_buildings_5_0 = null;

        EObject lv_buildings_7_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:320:2: ( (otherlv_0= 'Campus' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'buildings' otherlv_4= '{' ( (lv_buildings_5_0= ruleBuilding ) ) (otherlv_6= ',' ( (lv_buildings_7_0= ruleBuilding ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSrDsl.g:321:2: (otherlv_0= 'Campus' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'buildings' otherlv_4= '{' ( (lv_buildings_5_0= ruleBuilding ) ) (otherlv_6= ',' ( (lv_buildings_7_0= ruleBuilding ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSrDsl.g:321:2: (otherlv_0= 'Campus' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'buildings' otherlv_4= '{' ( (lv_buildings_5_0= ruleBuilding ) ) (otherlv_6= ',' ( (lv_buildings_7_0= ruleBuilding ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSrDsl.g:322:3: otherlv_0= 'Campus' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'buildings' otherlv_4= '{' ( (lv_buildings_5_0= ruleBuilding ) ) (otherlv_6= ',' ( (lv_buildings_7_0= ruleBuilding ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCampusAccess().getCampusKeyword_0());
            		
            // InternalSrDsl.g:326:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSrDsl.g:327:4: (lv_name_1_0= ruleEString )
            {
            // InternalSrDsl.g:327:4: (lv_name_1_0= ruleEString )
            // InternalSrDsl.g:328:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCampusAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCampusRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCampusAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCampusAccess().getBuildingsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getCampusAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSrDsl.g:357:3: ( (lv_buildings_5_0= ruleBuilding ) )
            // InternalSrDsl.g:358:4: (lv_buildings_5_0= ruleBuilding )
            {
            // InternalSrDsl.g:358:4: (lv_buildings_5_0= ruleBuilding )
            // InternalSrDsl.g:359:5: lv_buildings_5_0= ruleBuilding
            {

            					newCompositeNode(grammarAccess.getCampusAccess().getBuildingsBuildingParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_buildings_5_0=ruleBuilding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCampusRule());
            					}
            					add(
            						current,
            						"buildings",
            						lv_buildings_5_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Building");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSrDsl.g:376:3: (otherlv_6= ',' ( (lv_buildings_7_0= ruleBuilding ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSrDsl.g:377:4: otherlv_6= ',' ( (lv_buildings_7_0= ruleBuilding ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_16); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCampusAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSrDsl.g:381:4: ( (lv_buildings_7_0= ruleBuilding ) )
            	    // InternalSrDsl.g:382:5: (lv_buildings_7_0= ruleBuilding )
            	    {
            	    // InternalSrDsl.g:382:5: (lv_buildings_7_0= ruleBuilding )
            	    // InternalSrDsl.g:383:6: lv_buildings_7_0= ruleBuilding
            	    {

            	    						newCompositeNode(grammarAccess.getCampusAccess().getBuildingsBuildingParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_buildings_7_0=ruleBuilding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCampusRule());
            	    						}
            	    						add(
            	    							current,
            	    							"buildings",
            	    							lv_buildings_7_0,
            	    							"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Building");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getCampusAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCampusAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCampus"


    // $ANTLR start "entryRuleCourse"
    // InternalSrDsl.g:413:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalSrDsl.g:413:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalSrDsl.g:414:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalSrDsl.g:420:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) otherlv_5= 'coordinator' ( ( ruleEString ) ) otherlv_7= 'schedulingrequirements' ( (lv_schedulingrequirements_8_0= ruleschedulingRequirements ) ) otherlv_9= '}' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_code_4_0 = null;

        EObject lv_schedulingrequirements_8_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:426:2: ( (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) otherlv_5= 'coordinator' ( ( ruleEString ) ) otherlv_7= 'schedulingrequirements' ( (lv_schedulingrequirements_8_0= ruleschedulingRequirements ) ) otherlv_9= '}' ) )
            // InternalSrDsl.g:427:2: (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) otherlv_5= 'coordinator' ( ( ruleEString ) ) otherlv_7= 'schedulingrequirements' ( (lv_schedulingrequirements_8_0= ruleschedulingRequirements ) ) otherlv_9= '}' )
            {
            // InternalSrDsl.g:427:2: (otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) otherlv_5= 'coordinator' ( ( ruleEString ) ) otherlv_7= 'schedulingrequirements' ( (lv_schedulingrequirements_8_0= ruleschedulingRequirements ) ) otherlv_9= '}' )
            // InternalSrDsl.g:428:3: otherlv_0= 'Course' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) otherlv_5= 'coordinator' ( ( ruleEString ) ) otherlv_7= 'schedulingrequirements' ( (lv_schedulingrequirements_8_0= ruleschedulingRequirements ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
            		
            // InternalSrDsl.g:432:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSrDsl.g:433:4: (lv_name_1_0= ruleEString )
            {
            // InternalSrDsl.g:433:4: (lv_name_1_0= ruleEString )
            // InternalSrDsl.g:434:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getCodeKeyword_3());
            		
            // InternalSrDsl.g:459:3: ( (lv_code_4_0= ruleEString ) )
            // InternalSrDsl.g:460:4: (lv_code_4_0= ruleEString )
            {
            // InternalSrDsl.g:460:4: (lv_code_4_0= ruleEString )
            // InternalSrDsl.g:461:5: lv_code_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getCodeEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_code_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_4_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getCoordinatorKeyword_5());
            		
            // InternalSrDsl.g:482:3: ( ( ruleEString ) )
            // InternalSrDsl.g:483:4: ( ruleEString )
            {
            // InternalSrDsl.g:483:4: ( ruleEString )
            // InternalSrDsl.g:484:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCourseAccess().getCoordinatorTeacherCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getCourseAccess().getSchedulingrequirementsKeyword_7());
            		
            // InternalSrDsl.g:502:3: ( (lv_schedulingrequirements_8_0= ruleschedulingRequirements ) )
            // InternalSrDsl.g:503:4: (lv_schedulingrequirements_8_0= ruleschedulingRequirements )
            {
            // InternalSrDsl.g:503:4: (lv_schedulingrequirements_8_0= ruleschedulingRequirements )
            // InternalSrDsl.g:504:5: lv_schedulingrequirements_8_0= ruleschedulingRequirements
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getSchedulingrequirementsSchedulingRequirementsParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_schedulingrequirements_8_0=ruleschedulingRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"schedulingrequirements",
            						lv_schedulingrequirements_8_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.schedulingRequirements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCourseAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleTeacher"
    // InternalSrDsl.g:529:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalSrDsl.g:529:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalSrDsl.g:530:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalSrDsl.g:536:1: ruleTeacher returns [EObject current=null] : (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:542:2: ( (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSrDsl.g:543:2: (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSrDsl.g:543:2: (otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) ) )
            // InternalSrDsl.g:544:3: otherlv_0= 'Teacher' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeacherAccess().getTeacherKeyword_0());
            		
            // InternalSrDsl.g:548:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSrDsl.g:549:4: (lv_name_1_0= ruleEString )
            {
            // InternalSrDsl.g:549:4: (lv_name_1_0= ruleEString )
            // InternalSrDsl.g:550:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeacherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleTeacher"


    // $ANTLR start "entryRuleEInt"
    // InternalSrDsl.g:571:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSrDsl.g:571:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSrDsl.g:572:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSrDsl.g:578:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSrDsl.g:584:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSrDsl.g:585:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSrDsl.g:585:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSrDsl.g:586:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSrDsl.g:586:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSrDsl.g:587:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleBuilding"
    // InternalSrDsl.g:604:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // InternalSrDsl.g:604:49: (iv_ruleBuilding= ruleBuilding EOF )
            // InternalSrDsl.g:605:2: iv_ruleBuilding= ruleBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuilding=ruleBuilding();

            state._fsp--;

             current =iv_ruleBuilding; 
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
    // $ANTLR end "entryRuleBuilding"


    // $ANTLR start "ruleBuilding"
    // InternalSrDsl.g:611:1: ruleBuilding returns [EObject current=null] : (otherlv_0= 'Building' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleBuilding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rooms_5_0 = null;

        EObject lv_rooms_7_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:617:2: ( (otherlv_0= 'Building' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSrDsl.g:618:2: (otherlv_0= 'Building' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSrDsl.g:618:2: (otherlv_0= 'Building' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSrDsl.g:619:3: otherlv_0= 'Building' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rooms' otherlv_4= '{' ( (lv_rooms_5_0= ruleRoom ) ) (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildingAccess().getBuildingKeyword_0());
            		
            // InternalSrDsl.g:623:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSrDsl.g:624:4: (lv_name_1_0= ruleEString )
            {
            // InternalSrDsl.g:624:4: (lv_name_1_0= ruleEString )
            // InternalSrDsl.g:625:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBuildingAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getBuildingAccess().getRoomsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getBuildingAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSrDsl.g:654:3: ( (lv_rooms_5_0= ruleRoom ) )
            // InternalSrDsl.g:655:4: (lv_rooms_5_0= ruleRoom )
            {
            // InternalSrDsl.g:655:4: (lv_rooms_5_0= ruleRoom )
            // InternalSrDsl.g:656:5: lv_rooms_5_0= ruleRoom
            {

            					newCompositeNode(grammarAccess.getBuildingAccess().getRoomsRoomParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_rooms_5_0=ruleRoom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildingRule());
            					}
            					add(
            						current,
            						"rooms",
            						lv_rooms_5_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Room");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSrDsl.g:673:3: (otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSrDsl.g:674:4: otherlv_6= ',' ( (lv_rooms_7_0= ruleRoom ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_23); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBuildingAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSrDsl.g:678:4: ( (lv_rooms_7_0= ruleRoom ) )
            	    // InternalSrDsl.g:679:5: (lv_rooms_7_0= ruleRoom )
            	    {
            	    // InternalSrDsl.g:679:5: (lv_rooms_7_0= ruleRoom )
            	    // InternalSrDsl.g:680:6: lv_rooms_7_0= ruleRoom
            	    {

            	    						newCompositeNode(grammarAccess.getBuildingAccess().getRoomsRoomParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_rooms_7_0=ruleRoom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBuildingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rooms",
            	    							lv_rooms_7_0,
            	    							"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Room");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBuildingAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBuilding"


    // $ANTLR start "entryRuleRoom"
    // InternalSrDsl.g:710:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalSrDsl.g:710:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalSrDsl.g:711:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalSrDsl.g:717:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mazemapLink' ( (lv_mazemapLink_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_mazemapLink_4_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:723:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mazemapLink' ( (lv_mazemapLink_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // InternalSrDsl.g:724:2: (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mazemapLink' ( (lv_mazemapLink_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSrDsl.g:724:2: (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mazemapLink' ( (lv_mazemapLink_4_0= ruleEString ) ) otherlv_5= '}' )
            // InternalSrDsl.g:725:3: otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mazemapLink' ( (lv_mazemapLink_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalSrDsl.g:729:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSrDsl.g:730:4: (lv_name_1_0= ruleEString )
            {
            // InternalSrDsl.g:730:4: (lv_name_1_0= ruleEString )
            // InternalSrDsl.g:731:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getMazemapLinkKeyword_3());
            		
            // InternalSrDsl.g:756:3: ( (lv_mazemapLink_4_0= ruleEString ) )
            // InternalSrDsl.g:757:4: (lv_mazemapLink_4_0= ruleEString )
            {
            // InternalSrDsl.g:757:4: (lv_mazemapLink_4_0= ruleEString )
            // InternalSrDsl.g:758:5: lv_mazemapLink_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getMazemapLinkEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_mazemapLink_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"mazemapLink",
            						lv_mazemapLink_4_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleschedulingRequirements"
    // InternalSrDsl.g:783:1: entryRuleschedulingRequirements returns [EObject current=null] : iv_ruleschedulingRequirements= ruleschedulingRequirements EOF ;
    public final EObject entryRuleschedulingRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleschedulingRequirements = null;


        try {
            // InternalSrDsl.g:783:63: (iv_ruleschedulingRequirements= ruleschedulingRequirements EOF )
            // InternalSrDsl.g:784:2: iv_ruleschedulingRequirements= ruleschedulingRequirements EOF
            {
             newCompositeNode(grammarAccess.getSchedulingRequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleschedulingRequirements=ruleschedulingRequirements();

            state._fsp--;

             current =iv_ruleschedulingRequirements; 
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
    // $ANTLR end "entryRuleschedulingRequirements"


    // $ANTLR start "ruleschedulingRequirements"
    // InternalSrDsl.g:790:1: ruleschedulingRequirements returns [EObject current=null] : (otherlv_0= 'SchedulingRequirements' otherlv_1= '{' otherlv_2= 'sender' ( ( ruleEString ) ) otherlv_4= 'weeks' otherlv_5= '{' ( (lv_weeks_6_0= ruleWeek ) ) (otherlv_7= ',' ( (lv_weeks_8_0= ruleWeek ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleschedulingRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_weeks_6_0 = null;

        EObject lv_weeks_8_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:796:2: ( (otherlv_0= 'SchedulingRequirements' otherlv_1= '{' otherlv_2= 'sender' ( ( ruleEString ) ) otherlv_4= 'weeks' otherlv_5= '{' ( (lv_weeks_6_0= ruleWeek ) ) (otherlv_7= ',' ( (lv_weeks_8_0= ruleWeek ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalSrDsl.g:797:2: (otherlv_0= 'SchedulingRequirements' otherlv_1= '{' otherlv_2= 'sender' ( ( ruleEString ) ) otherlv_4= 'weeks' otherlv_5= '{' ( (lv_weeks_6_0= ruleWeek ) ) (otherlv_7= ',' ( (lv_weeks_8_0= ruleWeek ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalSrDsl.g:797:2: (otherlv_0= 'SchedulingRequirements' otherlv_1= '{' otherlv_2= 'sender' ( ( ruleEString ) ) otherlv_4= 'weeks' otherlv_5= '{' ( (lv_weeks_6_0= ruleWeek ) ) (otherlv_7= ',' ( (lv_weeks_8_0= ruleWeek ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalSrDsl.g:798:3: otherlv_0= 'SchedulingRequirements' otherlv_1= '{' otherlv_2= 'sender' ( ( ruleEString ) ) otherlv_4= 'weeks' otherlv_5= '{' ( (lv_weeks_6_0= ruleWeek ) ) (otherlv_7= ',' ( (lv_weeks_8_0= ruleWeek ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchedulingRequirementsAccess().getSchedulingRequirementsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getSchedulingRequirementsAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSchedulingRequirementsAccess().getSenderKeyword_2());
            		
            // InternalSrDsl.g:810:3: ( ( ruleEString ) )
            // InternalSrDsl.g:811:4: ( ruleEString )
            {
            // InternalSrDsl.g:811:4: ( ruleEString )
            // InternalSrDsl.g:812:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchedulingRequirementsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSchedulingRequirementsAccess().getSenderTeacherCrossReference_3_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSchedulingRequirementsAccess().getWeeksKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getSchedulingRequirementsAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSrDsl.g:834:3: ( (lv_weeks_6_0= ruleWeek ) )
            // InternalSrDsl.g:835:4: (lv_weeks_6_0= ruleWeek )
            {
            // InternalSrDsl.g:835:4: (lv_weeks_6_0= ruleWeek )
            // InternalSrDsl.g:836:5: lv_weeks_6_0= ruleWeek
            {

            					newCompositeNode(grammarAccess.getSchedulingRequirementsAccess().getWeeksWeekParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_weeks_6_0=ruleWeek();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchedulingRequirementsRule());
            					}
            					add(
            						current,
            						"weeks",
            						lv_weeks_6_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Week");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSrDsl.g:853:3: (otherlv_7= ',' ( (lv_weeks_8_0= ruleWeek ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSrDsl.g:854:4: otherlv_7= ',' ( (lv_weeks_8_0= ruleWeek ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_27); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSchedulingRequirementsAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSrDsl.g:858:4: ( (lv_weeks_8_0= ruleWeek ) )
            	    // InternalSrDsl.g:859:5: (lv_weeks_8_0= ruleWeek )
            	    {
            	    // InternalSrDsl.g:859:5: (lv_weeks_8_0= ruleWeek )
            	    // InternalSrDsl.g:860:6: lv_weeks_8_0= ruleWeek
            	    {

            	    						newCompositeNode(grammarAccess.getSchedulingRequirementsAccess().getWeeksWeekParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_weeks_8_0=ruleWeek();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSchedulingRequirementsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"weeks",
            	    							lv_weeks_8_0,
            	    							"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.Week");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getSchedulingRequirementsAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSchedulingRequirementsAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleschedulingRequirements"


    // $ANTLR start "entryRuleWeek"
    // InternalSrDsl.g:890:1: entryRuleWeek returns [EObject current=null] : iv_ruleWeek= ruleWeek EOF ;
    public final EObject entryRuleWeek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeek = null;


        try {
            // InternalSrDsl.g:890:45: (iv_ruleWeek= ruleWeek EOF )
            // InternalSrDsl.g:891:2: iv_ruleWeek= ruleWeek EOF
            {
             newCompositeNode(grammarAccess.getWeekRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeek=ruleWeek();

            state._fsp--;

             current =iv_ruleWeek; 
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
    // $ANTLR end "entryRuleWeek"


    // $ANTLR start "ruleWeek"
    // InternalSrDsl.g:897:1: ruleWeek returns [EObject current=null] : (otherlv_0= 'Week' otherlv_1= '{' otherlv_2= 'weekNumber' ( (lv_weekNumber_3_0= ruleEInt ) ) otherlv_4= 'slotRequirements' otherlv_5= '{' ( (lv_slotRequirements_6_0= ruleSlotRequirement ) ) (otherlv_7= ',' ( (lv_slotRequirements_8_0= ruleSlotRequirement ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleWeek() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_weekNumber_3_0 = null;

        EObject lv_slotRequirements_6_0 = null;

        EObject lv_slotRequirements_8_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:903:2: ( (otherlv_0= 'Week' otherlv_1= '{' otherlv_2= 'weekNumber' ( (lv_weekNumber_3_0= ruleEInt ) ) otherlv_4= 'slotRequirements' otherlv_5= '{' ( (lv_slotRequirements_6_0= ruleSlotRequirement ) ) (otherlv_7= ',' ( (lv_slotRequirements_8_0= ruleSlotRequirement ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalSrDsl.g:904:2: (otherlv_0= 'Week' otherlv_1= '{' otherlv_2= 'weekNumber' ( (lv_weekNumber_3_0= ruleEInt ) ) otherlv_4= 'slotRequirements' otherlv_5= '{' ( (lv_slotRequirements_6_0= ruleSlotRequirement ) ) (otherlv_7= ',' ( (lv_slotRequirements_8_0= ruleSlotRequirement ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalSrDsl.g:904:2: (otherlv_0= 'Week' otherlv_1= '{' otherlv_2= 'weekNumber' ( (lv_weekNumber_3_0= ruleEInt ) ) otherlv_4= 'slotRequirements' otherlv_5= '{' ( (lv_slotRequirements_6_0= ruleSlotRequirement ) ) (otherlv_7= ',' ( (lv_slotRequirements_8_0= ruleSlotRequirement ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalSrDsl.g:905:3: otherlv_0= 'Week' otherlv_1= '{' otherlv_2= 'weekNumber' ( (lv_weekNumber_3_0= ruleEInt ) ) otherlv_4= 'slotRequirements' otherlv_5= '{' ( (lv_slotRequirements_6_0= ruleSlotRequirement ) ) (otherlv_7= ',' ( (lv_slotRequirements_8_0= ruleSlotRequirement ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWeekAccess().getWeekKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getWeekAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWeekAccess().getWeekNumberKeyword_2());
            		
            // InternalSrDsl.g:917:3: ( (lv_weekNumber_3_0= ruleEInt ) )
            // InternalSrDsl.g:918:4: (lv_weekNumber_3_0= ruleEInt )
            {
            // InternalSrDsl.g:918:4: (lv_weekNumber_3_0= ruleEInt )
            // InternalSrDsl.g:919:5: lv_weekNumber_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getWeekAccess().getWeekNumberEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_weekNumber_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeekRule());
            					}
            					set(
            						current,
            						"weekNumber",
            						lv_weekNumber_3_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getWeekAccess().getSlotRequirementsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getWeekAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSrDsl.g:944:3: ( (lv_slotRequirements_6_0= ruleSlotRequirement ) )
            // InternalSrDsl.g:945:4: (lv_slotRequirements_6_0= ruleSlotRequirement )
            {
            // InternalSrDsl.g:945:4: (lv_slotRequirements_6_0= ruleSlotRequirement )
            // InternalSrDsl.g:946:5: lv_slotRequirements_6_0= ruleSlotRequirement
            {

            					newCompositeNode(grammarAccess.getWeekAccess().getSlotRequirementsSlotRequirementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_slotRequirements_6_0=ruleSlotRequirement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeekRule());
            					}
            					add(
            						current,
            						"slotRequirements",
            						lv_slotRequirements_6_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.SlotRequirement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSrDsl.g:963:3: (otherlv_7= ',' ( (lv_slotRequirements_8_0= ruleSlotRequirement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSrDsl.g:964:4: otherlv_7= ',' ( (lv_slotRequirements_8_0= ruleSlotRequirement ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_30); 

            	    				newLeafNode(otherlv_7, grammarAccess.getWeekAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSrDsl.g:968:4: ( (lv_slotRequirements_8_0= ruleSlotRequirement ) )
            	    // InternalSrDsl.g:969:5: (lv_slotRequirements_8_0= ruleSlotRequirement )
            	    {
            	    // InternalSrDsl.g:969:5: (lv_slotRequirements_8_0= ruleSlotRequirement )
            	    // InternalSrDsl.g:970:6: lv_slotRequirements_8_0= ruleSlotRequirement
            	    {

            	    						newCompositeNode(grammarAccess.getWeekAccess().getSlotRequirementsSlotRequirementParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_slotRequirements_8_0=ruleSlotRequirement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWeekRule());
            	    						}
            	    						add(
            	    							current,
            	    							"slotRequirements",
            	    							lv_slotRequirements_8_0,
            	    							"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.SlotRequirement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getWeekAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWeekAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleWeek"


    // $ANTLR start "entryRuleSlotRequirement"
    // InternalSrDsl.g:1000:1: entryRuleSlotRequirement returns [EObject current=null] : iv_ruleSlotRequirement= ruleSlotRequirement EOF ;
    public final EObject entryRuleSlotRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotRequirement = null;


        try {
            // InternalSrDsl.g:1000:56: (iv_ruleSlotRequirement= ruleSlotRequirement EOF )
            // InternalSrDsl.g:1001:2: iv_ruleSlotRequirement= ruleSlotRequirement EOF
            {
             newCompositeNode(grammarAccess.getSlotRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlotRequirement=ruleSlotRequirement();

            state._fsp--;

             current =iv_ruleSlotRequirement; 
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
    // $ANTLR end "entryRuleSlotRequirement"


    // $ANTLR start "ruleSlotRequirement"
    // InternalSrDsl.g:1007:1: ruleSlotRequirement returns [EObject current=null] : (otherlv_0= 'SlotRequirement' otherlv_1= '{' otherlv_2= 'activityType' ( (lv_activityType_3_0= ruleActivityType ) ) otherlv_4= 'duration' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'expectedStudents' ( (lv_expectedStudents_7_0= ruleEInt ) ) (otherlv_8= 'requiredPersonal' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'requiredRoom' ( ( ruleEString ) ) )? (otherlv_16= 'requiredSameDaySlots' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) ;
    public final EObject ruleSlotRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_activityType_3_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;

        AntlrDatatypeRuleToken lv_expectedStudents_7_0 = null;



        	enterRule();

        try {
            // InternalSrDsl.g:1013:2: ( (otherlv_0= 'SlotRequirement' otherlv_1= '{' otherlv_2= 'activityType' ( (lv_activityType_3_0= ruleActivityType ) ) otherlv_4= 'duration' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'expectedStudents' ( (lv_expectedStudents_7_0= ruleEInt ) ) (otherlv_8= 'requiredPersonal' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'requiredRoom' ( ( ruleEString ) ) )? (otherlv_16= 'requiredSameDaySlots' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) )
            // InternalSrDsl.g:1014:2: (otherlv_0= 'SlotRequirement' otherlv_1= '{' otherlv_2= 'activityType' ( (lv_activityType_3_0= ruleActivityType ) ) otherlv_4= 'duration' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'expectedStudents' ( (lv_expectedStudents_7_0= ruleEInt ) ) (otherlv_8= 'requiredPersonal' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'requiredRoom' ( ( ruleEString ) ) )? (otherlv_16= 'requiredSameDaySlots' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            {
            // InternalSrDsl.g:1014:2: (otherlv_0= 'SlotRequirement' otherlv_1= '{' otherlv_2= 'activityType' ( (lv_activityType_3_0= ruleActivityType ) ) otherlv_4= 'duration' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'expectedStudents' ( (lv_expectedStudents_7_0= ruleEInt ) ) (otherlv_8= 'requiredPersonal' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'requiredRoom' ( ( ruleEString ) ) )? (otherlv_16= 'requiredSameDaySlots' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            // InternalSrDsl.g:1015:3: otherlv_0= 'SlotRequirement' otherlv_1= '{' otherlv_2= 'activityType' ( (lv_activityType_3_0= ruleActivityType ) ) otherlv_4= 'duration' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'expectedStudents' ( (lv_expectedStudents_7_0= ruleEInt ) ) (otherlv_8= 'requiredPersonal' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'requiredRoom' ( ( ruleEString ) ) )? (otherlv_16= 'requiredSameDaySlots' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSlotRequirementAccess().getSlotRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getSlotRequirementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getSlotRequirementAccess().getActivityTypeKeyword_2());
            		
            // InternalSrDsl.g:1027:3: ( (lv_activityType_3_0= ruleActivityType ) )
            // InternalSrDsl.g:1028:4: (lv_activityType_3_0= ruleActivityType )
            {
            // InternalSrDsl.g:1028:4: (lv_activityType_3_0= ruleActivityType )
            // InternalSrDsl.g:1029:5: lv_activityType_3_0= ruleActivityType
            {

            					newCompositeNode(grammarAccess.getSlotRequirementAccess().getActivityTypeActivityTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_activityType_3_0=ruleActivityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSlotRequirementRule());
            					}
            					set(
            						current,
            						"activityType",
            						lv_activityType_3_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.ActivityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getSlotRequirementAccess().getDurationKeyword_4());
            		
            // InternalSrDsl.g:1050:3: ( (lv_duration_5_0= ruleEInt ) )
            // InternalSrDsl.g:1051:4: (lv_duration_5_0= ruleEInt )
            {
            // InternalSrDsl.g:1051:4: (lv_duration_5_0= ruleEInt )
            // InternalSrDsl.g:1052:5: lv_duration_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSlotRequirementAccess().getDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_34);
            lv_duration_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSlotRequirementRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_5_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getSlotRequirementAccess().getExpectedStudentsKeyword_6());
            		
            // InternalSrDsl.g:1073:3: ( (lv_expectedStudents_7_0= ruleEInt ) )
            // InternalSrDsl.g:1074:4: (lv_expectedStudents_7_0= ruleEInt )
            {
            // InternalSrDsl.g:1074:4: (lv_expectedStudents_7_0= ruleEInt )
            // InternalSrDsl.g:1075:5: lv_expectedStudents_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSlotRequirementAccess().getExpectedStudentsEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_35);
            lv_expectedStudents_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSlotRequirementRule());
            					}
            					set(
            						current,
            						"expectedStudents",
            						lv_expectedStudents_7_0,
            						"no.ntnu.tdt4250.group13.scheduling_requirements.xtext.SrDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSrDsl.g:1092:3: (otherlv_8= 'requiredPersonal' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSrDsl.g:1093:4: otherlv_8= 'requiredPersonal' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getSlotRequirementAccess().getRequiredPersonalKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSlotRequirementAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalSrDsl.g:1101:4: ( ( ruleEString ) )
                    // InternalSrDsl.g:1102:5: ( ruleEString )
                    {
                    // InternalSrDsl.g:1102:5: ( ruleEString )
                    // InternalSrDsl.g:1103:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSlotRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSrDsl.g:1117:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSrDsl.g:1118:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSlotRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSrDsl.g:1122:5: ( ( ruleEString ) )
                    	    // InternalSrDsl.g:1123:6: ( ruleEString )
                    	    {
                    	    // InternalSrDsl.g:1123:6: ( ruleEString )
                    	    // InternalSrDsl.g:1124:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSlotRequirementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSlotRequirementAccess().getRequiredPersonalTeacherCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,43,FOLLOW_38); 

                    				newLeafNode(otherlv_13, grammarAccess.getSlotRequirementAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalSrDsl.g:1144:3: (otherlv_14= 'requiredRoom' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSrDsl.g:1145:4: otherlv_14= 'requiredRoom' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getSlotRequirementAccess().getRequiredRoomKeyword_9_0());
                    			
                    // InternalSrDsl.g:1149:4: ( ( ruleEString ) )
                    // InternalSrDsl.g:1150:5: ( ruleEString )
                    {
                    // InternalSrDsl.g:1150:5: ( ruleEString )
                    // InternalSrDsl.g:1151:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSlotRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSlotRequirementAccess().getRequiredRoomRoomCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSrDsl.g:1166:3: (otherlv_16= 'requiredSameDaySlots' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSrDsl.g:1167:4: otherlv_16= 'requiredSameDaySlots' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,45,FOLLOW_36); 

                    				newLeafNode(otherlv_16, grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getSlotRequirementAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalSrDsl.g:1175:4: ( ( ruleEString ) )
                    // InternalSrDsl.g:1176:5: ( ruleEString )
                    {
                    // InternalSrDsl.g:1176:5: ( ruleEString )
                    // InternalSrDsl.g:1177:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSlotRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSrDsl.g:1191:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSrDsl.g:1192:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSlotRequirementAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSrDsl.g:1196:5: ( ( ruleEString ) )
                    	    // InternalSrDsl.g:1197:6: ( ruleEString )
                    	    {
                    	    // InternalSrDsl.g:1197:6: ( ruleEString )
                    	    // InternalSrDsl.g:1198:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSlotRequirementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsSlotRequirementCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getSlotRequirementAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getSlotRequirementAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleSlotRequirement"


    // $ANTLR start "ruleActivityType"
    // InternalSrDsl.g:1226:1: ruleActivityType returns [Enumerator current=null] : ( (enumLiteral_0= 'LECTURE' ) | (enumLiteral_1= 'EXERCISE' ) | (enumLiteral_2= 'LAB' ) | (enumLiteral_3= 'SUPERVISION' ) ) ;
    public final Enumerator ruleActivityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSrDsl.g:1232:2: ( ( (enumLiteral_0= 'LECTURE' ) | (enumLiteral_1= 'EXERCISE' ) | (enumLiteral_2= 'LAB' ) | (enumLiteral_3= 'SUPERVISION' ) ) )
            // InternalSrDsl.g:1233:2: ( (enumLiteral_0= 'LECTURE' ) | (enumLiteral_1= 'EXERCISE' ) | (enumLiteral_2= 'LAB' ) | (enumLiteral_3= 'SUPERVISION' ) )
            {
            // InternalSrDsl.g:1233:2: ( (enumLiteral_0= 'LECTURE' ) | (enumLiteral_1= 'EXERCISE' ) | (enumLiteral_2= 'LAB' ) | (enumLiteral_3= 'SUPERVISION' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt14=1;
                }
                break;
            case 47:
                {
                alt14=2;
                }
                break;
            case 48:
                {
                alt14=3;
                }
                break;
            case 49:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSrDsl.g:1234:3: (enumLiteral_0= 'LECTURE' )
                    {
                    // InternalSrDsl.g:1234:3: (enumLiteral_0= 'LECTURE' )
                    // InternalSrDsl.g:1235:4: enumLiteral_0= 'LECTURE'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getActivityTypeAccess().getLECTUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivityTypeAccess().getLECTUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSrDsl.g:1242:3: (enumLiteral_1= 'EXERCISE' )
                    {
                    // InternalSrDsl.g:1242:3: (enumLiteral_1= 'EXERCISE' )
                    // InternalSrDsl.g:1243:4: enumLiteral_1= 'EXERCISE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getActivityTypeAccess().getEXERCISEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivityTypeAccess().getEXERCISEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSrDsl.g:1250:3: (enumLiteral_2= 'LAB' )
                    {
                    // InternalSrDsl.g:1250:3: (enumLiteral_2= 'LAB' )
                    // InternalSrDsl.g:1251:4: enumLiteral_2= 'LAB'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getActivityTypeAccess().getLABEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActivityTypeAccess().getLABEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSrDsl.g:1258:3: (enumLiteral_3= 'SUPERVISION' )
                    {
                    // InternalSrDsl.g:1258:3: (enumLiteral_3= 'SUPERVISION' )
                    // InternalSrDsl.g:1259:4: enumLiteral_3= 'SUPERVISION'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getActivityTypeAccess().getSUPERVISIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActivityTypeAccess().getSUPERVISIONEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleActivityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000320000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000300000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000010000L});

}