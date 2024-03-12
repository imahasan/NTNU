/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredPersonal <em>Required Personal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredRoom <em>Required Room</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getDuration <em>Duration</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getExpectedStudents <em>Expected Students</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredSameDaySlots <em>Required Same Day Slots</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getSlotRequirement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExpectedStudentsMustBeGreaterThanZero DurationMustBeGreaterThanZero'"
 * @generated
 */
public interface SlotRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Personal</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Personal</em>' reference list.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getSlotRequirement_RequiredPersonal()
	 * @model
	 * @generated
	 */
	EList<Teacher> getRequiredPersonal();

	/**
	 * Returns the value of the '<em><b>Required Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Room</em>' reference.
	 * @see #setRequiredRoom(Room)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getSlotRequirement_RequiredRoom()
	 * @model
	 * @generated
	 */
	Room getRequiredRoom();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredRoom <em>Required Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Room</em>' reference.
	 * @see #getRequiredRoom()
	 * @generated
	 */
	void setRequiredRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Activity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Type</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType
	 * @see #setActivityType(ActivityType)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getSlotRequirement_ActivityType()
	 * @model required="true"
	 * @generated
	 */
	ActivityType getActivityType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(ActivityType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getSlotRequirement_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Expected Students</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Students</em>' attribute.
	 * @see #setExpectedStudents(int)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getSlotRequirement_ExpectedStudents()
	 * @model required="true"
	 * @generated
	 */
	int getExpectedStudents();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getExpectedStudents <em>Expected Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Students</em>' attribute.
	 * @see #getExpectedStudents()
	 * @generated
	 */
	void setExpectedStudents(int value);

	/**
	 * Returns the value of the '<em><b>Required Same Day Slots</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Same Day Slots</em>' reference list.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getSlotRequirement_RequiredSameDaySlots()
	 * @model
	 * @generated
	 */
	EList<SlotRequirement> getRequiredSameDaySlots();

} // SlotRequirement
