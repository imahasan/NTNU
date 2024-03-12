/**
 */
package no.ntnu.tdt4250.group13.timetable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getDay <em>Day</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getRoom <em>Room</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getActivity <em>Activity</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getEndTime <em>End Time</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getWeek <em>Week</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.timetable.Slot#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TheTeacherMustBeTheCourseCoordinatorOrALecturer StartAndEndTimesAreIncorrect'"
 * @generated
 */
public interface Slot extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.group13.timetable.DayEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.timetable.DayEnum
	 * @see #setDay(DayEnum)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_Day()
	 * @model required="true"
	 * @generated
	 */
	DayEnum getDay();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Slot#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.timetable.DayEnum
	 * @see #getDay()
	 * @generated
	 */
	void setDay(DayEnum value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.group13.timetable.Room#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_Room()
	 * @see no.ntnu.tdt4250.group13.timetable.Room#getSlot
	 * @model opposite="slot" required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Slot#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.timetable.Teacher}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.group13.timetable.Teacher#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' reference list.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_Lecturer()
	 * @see no.ntnu.tdt4250.group13.timetable.Teacher#getSlot
	 * @model opposite="slot" required="true"
	 * @generated
	 */
	EList<Teacher> getLecturer();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Slot#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(int)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_StartTime()
	 * @model required="true"
	 * @generated
	 */
	int getStartTime();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Slot#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(int value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(int)
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_EndTime()
	 * @model required="true"
	 * @generated
	 */
	int getEndTime();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.timetable.Slot#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(int value);

	/**
	 * Returns the value of the '<em><b>Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_Week()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getWeek();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_Course()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see no.ntnu.tdt4250.group13.timetable.TimetablePackage#getSlot_Date()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDate();

} // Slot
