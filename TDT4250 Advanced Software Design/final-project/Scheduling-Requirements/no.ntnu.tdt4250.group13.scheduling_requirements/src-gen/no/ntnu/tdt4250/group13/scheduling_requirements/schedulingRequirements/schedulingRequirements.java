/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>scheduling Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getschedulingRequirements()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SenderMustBeCourseCoordinator'"
 * @generated
 */
public interface schedulingRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Teacher)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getschedulingRequirements_Sender()
	 * @model required="true"
	 * @generated
	 */
	Teacher getSender();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Teacher value);

	/**
	 * Returns the value of the '<em><b>Weeks</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weeks</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getschedulingRequirements_Weeks()
	 * @model containment="true" required="true" upper="52"
	 * @generated
	 */
	EList<Week> getWeeks();

} // schedulingRequirements
