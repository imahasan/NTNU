/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.Activity#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum
	 * @see #setType(ActivityEnum)
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getActivity_Type()
	 * @model required="true"
	 * @generated
	 */
	ActivityEnum getType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Activity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(ActivityEnum value);

} // Activity
