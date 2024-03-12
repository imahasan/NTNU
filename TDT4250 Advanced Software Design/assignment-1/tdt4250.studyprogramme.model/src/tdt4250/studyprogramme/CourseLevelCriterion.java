/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Level Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.CourseLevelCriterion#getCourseLevel <em>Course Level</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseLevelCriterion()
 * @model
 * @generated
 */
public interface CourseLevelCriterion extends Criterion {
	/**
	 * Returns the value of the '<em><b>Course Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyprogramme.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Level</em>' attribute.
	 * @see tdt4250.studyprogramme.CourseLevel
	 * @see #setCourseLevel(CourseLevel)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseLevelCriterion_CourseLevel()
	 * @model
	 * @generated
	 */
	CourseLevel getCourseLevel();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseLevelCriterion#getCourseLevel <em>Course Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Level</em>' attribute.
	 * @see tdt4250.studyprogramme.CourseLevel
	 * @see #getCourseLevel()
	 * @generated
	 */
	void setCourseLevel(CourseLevel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model coursesMany="true"
	 * @generated
	 */
	EList<Course> filterCourses(EList<Course> courses);

} // CourseLevelCriterion
