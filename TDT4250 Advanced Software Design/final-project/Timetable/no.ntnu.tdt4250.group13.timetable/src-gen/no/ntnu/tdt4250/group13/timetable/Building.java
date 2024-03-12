/**
 */
package no.ntnu.tdt4250.group13.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Building#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Building#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getBuilding()
 * @model
 * @generated
 */
public interface Building extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getBuilding_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Building#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.timetable.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getBuilding_Room()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRoom();

} // Building
