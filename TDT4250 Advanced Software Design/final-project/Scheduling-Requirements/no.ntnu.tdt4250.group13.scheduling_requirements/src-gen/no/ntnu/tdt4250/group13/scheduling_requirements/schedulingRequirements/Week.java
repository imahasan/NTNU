/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week#getWeekNumber <em>Week Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week#getSlotRequirements <em>Slot Requirements</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getWeek()
 * @model
 * @generated
 */
public interface Week extends EObject {
	/**
	 * Returns the value of the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week Number</em>' attribute.
	 * @see #setWeekNumber(int)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getWeek_WeekNumber()
	 * @model required="true"
	 * @generated
	 */
	int getWeekNumber();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week#getWeekNumber <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Number</em>' attribute.
	 * @see #getWeekNumber()
	 * @generated
	 */
	void setWeekNumber(int value);

	/**
	 * Returns the value of the '<em><b>Slot Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Requirements</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getWeek_SlotRequirements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SlotRequirement> getSlotRequirements();

} // Week
