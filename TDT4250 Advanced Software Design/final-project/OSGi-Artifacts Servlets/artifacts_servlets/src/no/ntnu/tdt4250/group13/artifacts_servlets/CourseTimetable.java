/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.CourseTimetable#getWeek <em>Week</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getCourseTimetable()
 * @model
 * @generated
 */
public interface CourseTimetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Week</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.artifacts_servlets.Week}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Week</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getCourseTimetable_Week()
	 * @model containment="true" required="true" upper="52"
	 * @generated
	 */
	EList<Week> getWeek();

} // CourseTimetable
