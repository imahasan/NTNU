/**
 */
package no.ntnu.tdt4250.group13.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Course#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Course#getCode <em>Code</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Course#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Course#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Course#getCoursetimetable <em>Coursetimetable</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ACourseCannotHaveTwoTimetablesForTheSameWeek'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' reference.
	 * @see #setCoordinator(Teacher)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCourse_Coordinator()
	 * @model required="true"
	 * @generated
	 */
	Teacher getCoordinator();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Course#getCoordinator <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator</em>' reference.
	 * @see #getCoordinator()
	 * @generated
	 */
	void setCoordinator(Teacher value);

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.timetable.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' reference list.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCourse_Lecturer()
	 * @model
	 * @generated
	 */
	EList<Teacher> getLecturer();

	/**
	 * Returns the value of the '<em><b>Coursetimetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coursetimetable</em>' containment reference.
	 * @see #setCoursetimetable(CourseTimetable)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getCourse_Coursetimetable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CourseTimetable getCoursetimetable();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Course#getCoursetimetable <em>Coursetimetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coursetimetable</em>' containment reference.
	 * @see #getCoursetimetable()
	 * @generated
	 */
	void setCoursetimetable(CourseTimetable value);

} // Course
