/*
 * generated by Xtext 2.31.0
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import no.ntnu.tdt4250.group13.scheduling_requirements.xtext.ide.contentassist.antlr.internal.InternalSrDslParser;
import no.ntnu.tdt4250.group13.scheduling_requirements.xtext.services.SrDslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SrDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SrDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SrDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getActivityTypeAccess().getAlternatives(), "rule__ActivityType__Alternatives");
			builder.put(grammarAccess.getUniversityAccess().getGroup(), "rule__University__Group__0");
			builder.put(grammarAccess.getUniversityAccess().getGroup_8(), "rule__University__Group_8__0");
			builder.put(grammarAccess.getUniversityAccess().getGroup_15(), "rule__University__Group_15__0");
			builder.put(grammarAccess.getCampusAccess().getGroup(), "rule__Campus__Group__0");
			builder.put(grammarAccess.getCampusAccess().getGroup_6(), "rule__Campus__Group_6__0");
			builder.put(grammarAccess.getCourseAccess().getGroup(), "rule__Course__Group__0");
			builder.put(grammarAccess.getTeacherAccess().getGroup(), "rule__Teacher__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getBuildingAccess().getGroup(), "rule__Building__Group__0");
			builder.put(grammarAccess.getBuildingAccess().getGroup_6(), "rule__Building__Group_6__0");
			builder.put(grammarAccess.getRoomAccess().getGroup(), "rule__Room__Group__0");
			builder.put(grammarAccess.getSchedulingRequirementsAccess().getGroup(), "rule__SchedulingRequirements__Group__0");
			builder.put(grammarAccess.getSchedulingRequirementsAccess().getGroup_7(), "rule__SchedulingRequirements__Group_7__0");
			builder.put(grammarAccess.getWeekAccess().getGroup(), "rule__Week__Group__0");
			builder.put(grammarAccess.getWeekAccess().getGroup_7(), "rule__Week__Group_7__0");
			builder.put(grammarAccess.getSlotRequirementAccess().getGroup(), "rule__SlotRequirement__Group__0");
			builder.put(grammarAccess.getSlotRequirementAccess().getGroup_8(), "rule__SlotRequirement__Group_8__0");
			builder.put(grammarAccess.getSlotRequirementAccess().getGroup_8_3(), "rule__SlotRequirement__Group_8_3__0");
			builder.put(grammarAccess.getSlotRequirementAccess().getGroup_9(), "rule__SlotRequirement__Group_9__0");
			builder.put(grammarAccess.getSlotRequirementAccess().getGroup_10(), "rule__SlotRequirement__Group_10__0");
			builder.put(grammarAccess.getSlotRequirementAccess().getGroup_10_3(), "rule__SlotRequirement__Group_10_3__0");
			builder.put(grammarAccess.getUniversityAccess().getNameAssignment_1(), "rule__University__NameAssignment_1");
			builder.put(grammarAccess.getUniversityAccess().getYearAssignment_4(), "rule__University__YearAssignment_4");
			builder.put(grammarAccess.getUniversityAccess().getCampiAssignment_7(), "rule__University__CampiAssignment_7");
			builder.put(grammarAccess.getUniversityAccess().getCampiAssignment_8_1(), "rule__University__CampiAssignment_8_1");
			builder.put(grammarAccess.getUniversityAccess().getCourseAssignment_11(), "rule__University__CourseAssignment_11");
			builder.put(grammarAccess.getUniversityAccess().getTeachersAssignment_14(), "rule__University__TeachersAssignment_14");
			builder.put(grammarAccess.getUniversityAccess().getTeachersAssignment_15_1(), "rule__University__TeachersAssignment_15_1");
			builder.put(grammarAccess.getCampusAccess().getNameAssignment_1(), "rule__Campus__NameAssignment_1");
			builder.put(grammarAccess.getCampusAccess().getBuildingsAssignment_5(), "rule__Campus__BuildingsAssignment_5");
			builder.put(grammarAccess.getCampusAccess().getBuildingsAssignment_6_1(), "rule__Campus__BuildingsAssignment_6_1");
			builder.put(grammarAccess.getCourseAccess().getNameAssignment_1(), "rule__Course__NameAssignment_1");
			builder.put(grammarAccess.getCourseAccess().getCodeAssignment_4(), "rule__Course__CodeAssignment_4");
			builder.put(grammarAccess.getCourseAccess().getCoordinatorAssignment_6(), "rule__Course__CoordinatorAssignment_6");
			builder.put(grammarAccess.getCourseAccess().getSchedulingrequirementsAssignment_8(), "rule__Course__SchedulingrequirementsAssignment_8");
			builder.put(grammarAccess.getTeacherAccess().getNameAssignment_1(), "rule__Teacher__NameAssignment_1");
			builder.put(grammarAccess.getBuildingAccess().getNameAssignment_1(), "rule__Building__NameAssignment_1");
			builder.put(grammarAccess.getBuildingAccess().getRoomsAssignment_5(), "rule__Building__RoomsAssignment_5");
			builder.put(grammarAccess.getBuildingAccess().getRoomsAssignment_6_1(), "rule__Building__RoomsAssignment_6_1");
			builder.put(grammarAccess.getRoomAccess().getNameAssignment_1(), "rule__Room__NameAssignment_1");
			builder.put(grammarAccess.getRoomAccess().getMazemapLinkAssignment_4(), "rule__Room__MazemapLinkAssignment_4");
			builder.put(grammarAccess.getSchedulingRequirementsAccess().getSenderAssignment_3(), "rule__SchedulingRequirements__SenderAssignment_3");
			builder.put(grammarAccess.getSchedulingRequirementsAccess().getWeeksAssignment_6(), "rule__SchedulingRequirements__WeeksAssignment_6");
			builder.put(grammarAccess.getSchedulingRequirementsAccess().getWeeksAssignment_7_1(), "rule__SchedulingRequirements__WeeksAssignment_7_1");
			builder.put(grammarAccess.getWeekAccess().getWeekNumberAssignment_3(), "rule__Week__WeekNumberAssignment_3");
			builder.put(grammarAccess.getWeekAccess().getSlotRequirementsAssignment_6(), "rule__Week__SlotRequirementsAssignment_6");
			builder.put(grammarAccess.getWeekAccess().getSlotRequirementsAssignment_7_1(), "rule__Week__SlotRequirementsAssignment_7_1");
			builder.put(grammarAccess.getSlotRequirementAccess().getActivityTypeAssignment_3(), "rule__SlotRequirement__ActivityTypeAssignment_3");
			builder.put(grammarAccess.getSlotRequirementAccess().getDurationAssignment_5(), "rule__SlotRequirement__DurationAssignment_5");
			builder.put(grammarAccess.getSlotRequirementAccess().getExpectedStudentsAssignment_7(), "rule__SlotRequirement__ExpectedStudentsAssignment_7");
			builder.put(grammarAccess.getSlotRequirementAccess().getRequiredPersonalAssignment_8_2(), "rule__SlotRequirement__RequiredPersonalAssignment_8_2");
			builder.put(grammarAccess.getSlotRequirementAccess().getRequiredPersonalAssignment_8_3_1(), "rule__SlotRequirement__RequiredPersonalAssignment_8_3_1");
			builder.put(grammarAccess.getSlotRequirementAccess().getRequiredRoomAssignment_9_1(), "rule__SlotRequirement__RequiredRoomAssignment_9_1");
			builder.put(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsAssignment_10_2(), "rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_2");
			builder.put(grammarAccess.getSlotRequirementAccess().getRequiredSameDaySlotsAssignment_10_3_1(), "rule__SlotRequirement__RequiredSameDaySlotsAssignment_10_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SrDslGrammarAccess grammarAccess;

	@Override
	protected InternalSrDslParser createParser() {
		InternalSrDslParser result = new InternalSrDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SrDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SrDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}