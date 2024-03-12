/**
 */
package no.ntnu.tdt4250.group13.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Teacher#getSlot <em>Slot</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Teacher#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getTeacher()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ATeacherCannotAppearInTwoRoomsAtTheSameTime'"
 * @generated
 */
public interface Teacher extends EObject {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.timetable.Slot}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.group13.timetable.Slot#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference list.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getTeacher_Slot()
	 * @see no.ntnu.tdt4250.group13.timetable.Slot#getLecturer
	 * @model opposite="lecturer" required="true"
	 * @generated
	 */
	EList<Slot> getSlot();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getTeacher_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Teacher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Teacher
