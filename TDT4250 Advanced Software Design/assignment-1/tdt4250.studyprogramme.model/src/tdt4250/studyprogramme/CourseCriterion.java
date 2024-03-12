/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.CourseCriterion#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCriterion()
 * @model
 * @generated
 */
public interface CourseCriterion extends Criterion {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250.studyprogramme.Course#getCourseCriterion <em>Course Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCriterion_Courses()
	 * @see tdt4250.studyprogramme.Course#getCourseCriterion
	 * @model opposite="courseCriterion"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model coursesMany="true"
	 * @generated
	 */
	EList<Course> filterCourses(EList<Course> courses);

} // CourseCriterion
