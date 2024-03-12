/**
 */
package no.ntnu.tdt4250.group13.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Campus#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Campus#getBuilding <em>Building</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCampus()
 * @model
 * @generated
 */
public interface Campus extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCampus_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Campus#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Building</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.timetable.Building}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCampus_Building()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Building> getBuilding();

} // Campus
