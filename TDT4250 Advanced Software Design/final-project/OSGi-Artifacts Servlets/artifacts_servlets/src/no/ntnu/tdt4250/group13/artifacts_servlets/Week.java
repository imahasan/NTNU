/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets;

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
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.Week#getNumber <em>Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.Week#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getWeek()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WeekNumberMustBeBetween1And52'"
 * @generated
 */
public interface Week extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getWeek_Number()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Week#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getWeek_Slot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Slot> getSlot();

} // Week
