/**
 */
package no.ntnu.tdt4250.group13.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Room#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Room#getMazemapLink <em>Mazemap Link</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Room#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getRoom()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TwoCoursesCannotBeScheduledInTheSameRoomAtTheSameTime'"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getRoom_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mazemap Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mazemap Link</em>' attribute.
	 * @see #setMazemapLink(String)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getRoom_MazemapLink()
	 * @model required="true"
	 * @generated
	 */
	String getMazemapLink();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Room#getMazemapLink <em>Mazemap Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mazemap Link</em>' attribute.
	 * @see #getMazemapLink()
	 * @generated
	 */
	void setMazemapLink(String value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.timetable.Slot}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.group13.timetable.Slot#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference list.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getRoom_Slot()
	 * @see no.ntnu.tdt4250.group13.timetable.Slot#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Slot> getSlot();

} // Room
