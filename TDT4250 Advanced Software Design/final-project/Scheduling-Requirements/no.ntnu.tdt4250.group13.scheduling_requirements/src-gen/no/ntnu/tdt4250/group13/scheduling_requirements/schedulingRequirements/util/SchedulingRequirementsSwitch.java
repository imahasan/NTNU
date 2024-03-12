/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.util;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage
 * @generated
 */
public class SchedulingRequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulingRequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingRequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = SchedulingRequirementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SchedulingRequirementsPackage.COURSE: {
			Course course = (Course) theEObject;
			T result = caseCourse(course);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.TEACHER: {
			Teacher teacher = (Teacher) theEObject;
			T result = caseTeacher(teacher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS: {
			schedulingRequirements schedulingRequirements = (schedulingRequirements) theEObject;
			T result = caseschedulingRequirements(schedulingRequirements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.ROOM: {
			Room room = (Room) theEObject;
			T result = caseRoom(room);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT: {
			SlotRequirement slotRequirement = (SlotRequirement) theEObject;
			T result = caseSlotRequirement(slotRequirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.WEEK: {
			Week week = (Week) theEObject;
			T result = caseWeek(week);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.UNIVERSITY: {
			University university = (University) theEObject;
			T result = caseUniversity(university);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.CAMPUS: {
			Campus campus = (Campus) theEObject;
			T result = caseCampus(campus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulingRequirementsPackage.BUILDING: {
			Building building = (Building) theEObject;
			T result = caseBuilding(building);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teacher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeacher(Teacher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>scheduling Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>scheduling Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseschedulingRequirements(schedulingRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotRequirement(SlotRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Week</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Week</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeek(Week object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>University</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversity(University object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampus(Campus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilding(Building object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SchedulingRequirementsSwitch
