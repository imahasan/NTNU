/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets.util;

import java.util.Map;

import no.ntnu.tdt4250.group13.artifacts_servlets.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage
 * @generated
 */
public class TimetableValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TimetableValidator INSTANCE = new TimetableValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.group13.timetable";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TimetablePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TimetablePackage.UNIVERSITY:
			return validateUniversity((University) value, diagnostics, context);
		case TimetablePackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case TimetablePackage.TEACHER:
			return validateTeacher((Teacher) value, diagnostics, context);
		case TimetablePackage.CAMPUS:
			return validateCampus((Campus) value, diagnostics, context);
		case TimetablePackage.BUILDING:
			return validateBuilding((Building) value, diagnostics, context);
		case TimetablePackage.ROOM:
			return validateRoom((Room) value, diagnostics, context);
		case TimetablePackage.WEEK:
			return validateWeek((Week) value, diagnostics, context);
		case TimetablePackage.SLOT:
			return validateSlot((Slot) value, diagnostics, context);
		case TimetablePackage.ACTIVITY:
			return validateActivity((Activity) value, diagnostics, context);
		case TimetablePackage.COURSE_TIMETABLE:
			return validateCourseTimetable((CourseTimetable) value, diagnostics, context);
		case TimetablePackage.ACTIVITY_ENUM:
			return validateActivityEnum((ActivityEnum) value, diagnostics, context);
		case TimetablePackage.DAY_ENUM:
			return validateDayEnum((DayEnum) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCourse_ACourseCannotHaveTwoTimetablesForTheSameWeek(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ACourseCannotHaveTwoTimetablesForTheSameWeek constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_ACourseCannotHaveTwoTimetablesForTheSameWeek(Course course,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean constraint = true;
		EList<Week> weeks = course.getCoursetimetable().getWeek();
		for (int i = 0; i < weeks.size(); i++) {
			for (int j = i + 1; j < weeks.size(); j++) {
				if (weeks.get(i).getNumber() == weeks.get(j).getNumber()) {
					constraint = false;
				}
			}
		}
		if (!constraint) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"ACourseCannotHaveTwoTimetablesForTheSameWeek", getObjectLabel(course, context) },
						new Object[] { course }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeacher(Teacher teacher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(teacher, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(teacher, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTeacher_ATeacherCannotAppearInTwoRoomsAtTheSameTime(teacher, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ATeacherCannotAppearInTwoRoomsAtTheSameTime constraint of '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTeacher_ATeacherCannotAppearInTwoRoomsAtTheSameTime(Teacher teacher,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean constraint = true;
		EList<Slot> slots = teacher.getSlot();
		for (int i = 0; i < slots.size(); i++) {
			for (int j = i + 1; j < slots.size(); j++) {
				if (slots.get(i).getWeek() == slots.get(j).getWeek()) {
					if (slots.get(i).getDay() == slots.get(j).getDay()) {
						if ((slots.get(i).getStartTime() < slots.get(j).getEndTime())
								&& (slots.get(i).getEndTime() > slots.get(j).getStartTime())) {
							constraint = false;
						}
					}
				}
			}
		}
		if (!constraint) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"ATeacherCannotAppearInTwoRoomsAtTheSameTime", getObjectLabel(teacher, context) },
						new Object[] { teacher }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampus(Campus campus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(campus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuilding(Building building, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(building, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(room, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(room, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRoom_TwoCoursesCannotBeScheduledInTheSameRoomAtTheSameTime(room, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TwoCoursesCannotBeScheduledInTheSameRoomAtTheSameTime constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRoom_TwoCoursesCannotBeScheduledInTheSameRoomAtTheSameTime(Room room,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean constraint = true;
		EList<Slot> slots = room.getSlot();
		for (int i = 0; i < slots.size(); i++) {
			for (int j = i + 1; j < slots.size(); j++) {
				if (slots.get(i).getWeek() == slots.get(j).getWeek()) {
					if (slots.get(i).getDay() == slots.get(j).getDay()) {
						if ((slots.get(i).getStartTime() < slots.get(j).getEndTime())
								&& (slots.get(i).getEndTime() > slots.get(j).getStartTime())) {
							constraint = false;
						}
					}
				}
			}
		}
		if (!constraint) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "TwoCoursesCannotBeScheduledInTheSameRoomAtTheSameTime",
										getObjectLabel(room, context) },
								new Object[] { room }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeek(Week week, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(week, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(week, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWeek_WeekNumberMustBeBetween1And52(week, diagnostics, context);
		return result;
	}

	/**
	 * Validates the WeekNumberMustBeBetween1And52 constraint of '<em>Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateWeek_WeekNumberMustBeBetween1And52(Week week, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean constraint = true;
		if ((week.getNumber() < 1) || (week.getNumber() > 52)) {
			constraint = false;
		}
		if (!constraint) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "WeekNumberMustBeBetween1And52", getObjectLabel(week, context) },
								new Object[] { week }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(slot, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSlot_TheTeacherMustBeTheCourseCoordinatorOrALecturer(slot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSlot_StartAndEndTimesAreIncorrect(slot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TheTeacherMustBeTheCourseCoordinatorOrALecturer constraint of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSlot_TheTeacherMustBeTheCourseCoordinatorOrALecturer(Slot slot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		int lect = 0;
		Course course = slot.getCourse();
		for (Teacher slotLecturer : slot.getLecturer()) {
			for (Teacher courseLecturer : course.getLecturer()) {
				if (courseLecturer.getName() == slotLecturer.getName()) {
					lect++;
				}
			}
		}
		if (!(lect == slot.getLecturer().size())) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"TheTeacherMustBeTheCourseCoordinatorOrALecturer", getObjectLabel(slot, context) },
						new Object[] { slot }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the StartAndEndTimesAreIncorrect constraint of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSlot_StartAndEndTimesAreIncorrect(Slot slot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean constraint = true;
		if (slot.getStartTime() >= slot.getEndTime()) {
			constraint = false;
		}
		if (!constraint) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "StartAndEndTimesAreIncorrect", getObjectLabel(slot, context) },
								new Object[] { slot }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseTimetable(CourseTimetable courseTimetable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseTimetable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEnum(ActivityEnum activityEnum, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayEnum(DayEnum dayEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TimetableValidator
