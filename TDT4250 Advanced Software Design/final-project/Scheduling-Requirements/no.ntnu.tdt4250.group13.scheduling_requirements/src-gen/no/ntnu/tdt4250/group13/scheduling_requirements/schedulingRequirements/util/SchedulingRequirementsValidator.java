/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.util;

import java.util.Map;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage
 * @generated
 */
public class SchedulingRequirementsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SchedulingRequirementsValidator INSTANCE = new SchedulingRequirementsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements";

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
	public SchedulingRequirementsValidator() {
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
		return SchedulingRequirementsPackage.eINSTANCE;
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
		case SchedulingRequirementsPackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case SchedulingRequirementsPackage.TEACHER:
			return validateTeacher((Teacher) value, diagnostics, context);
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS:
			return validateschedulingRequirements((schedulingRequirements) value, diagnostics, context);
		case SchedulingRequirementsPackage.ROOM:
			return validateRoom((Room) value, diagnostics, context);
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT:
			return validateSlotRequirement((SlotRequirement) value, diagnostics, context);
		case SchedulingRequirementsPackage.WEEK:
			return validateWeek((Week) value, diagnostics, context);
		case SchedulingRequirementsPackage.UNIVERSITY:
			return validateUniversity((University) value, diagnostics, context);
		case SchedulingRequirementsPackage.CAMPUS:
			return validateCampus((Campus) value, diagnostics, context);
		case SchedulingRequirementsPackage.BUILDING:
			return validateBuilding((Building) value, diagnostics, context);
		case SchedulingRequirementsPackage.ACTIVITY_TYPE:
			return validateActivityType((ActivityType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeacher(Teacher teacher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(teacher, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateschedulingRequirements(schedulingRequirements schedulingRequirements,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(schedulingRequirements, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(schedulingRequirements, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateschedulingRequirements_SenderMustBeCourseCoordinator(schedulingRequirements, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the SenderMustBeCourseCoordinator constraint of '<em>scheduling Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateschedulingRequirements_SenderMustBeCourseCoordinator(
			schedulingRequirements schedulingRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = (schedulingRequirements.getSender()
				.equals(((Course) schedulingRequirements.eContainer()).getCoordinator()));

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "SenderMustBeCourseCoordinator",
										getObjectLabel(schedulingRequirements, context) },
								new Object[] { schedulingRequirements }, context));
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
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotRequirement(SlotRequirement slotRequirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(slotRequirement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(slotRequirement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSlotRequirement_ExpectedStudentsMustBeGreaterThanZero(slotRequirement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateSlotRequirement_DurationMustBeGreaterThanZero(slotRequirement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExpectedStudentsMustBeGreaterThanZero constraint of '<em>Slot Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSlotRequirement_ExpectedStudentsMustBeGreaterThanZero(SlotRequirement slotRequirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = slotRequirement.getExpectedStudents() > 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic", new Object[] {
								"ExpectedStudentsMustBeGreaterThanZero", getObjectLabel(slotRequirement, context) },
						new Object[] { slotRequirement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DurationMustBeGreaterThanZero constraint of '<em>Slot Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSlotRequirement_DurationMustBeGreaterThanZero(SlotRequirement slotRequirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = slotRequirement.getDuration() > 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "DurationMustBeGreaterThanZero", getObjectLabel(slotRequirement, context) },
						new Object[] { slotRequirement }, context));
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
		return validate_EveryDefaultConstraint(week, diagnostics, context);
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
	public boolean validateActivityType(ActivityType activityType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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

} //SchedulingRequirementsValidator
