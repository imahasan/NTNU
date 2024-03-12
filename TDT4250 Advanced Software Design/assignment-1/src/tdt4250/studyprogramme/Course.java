/**
 */
package tdt4250.studyprogramme;

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
 *   <li>{@link tdt4250.studyprogramme.Course#getCourseCriterion <em>Course Criterion</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Course#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourse_Code()
	 * @model dataType="tdt4250.studyprogramme.Code"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Course Criterion</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.CourseCriterion}.
	 * It is bidirectional and its opposite is '{@link tdt4250.studyprogramme.CourseCriterion#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Criterion</em>' reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourse_CourseCriterion()
	 * @see tdt4250.studyprogramme.CourseCriterion#getCourses
	 * @model opposite="courses"
	 * @generated
	 */
	EList<CourseCriterion> getCourseCriterion();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyprogramme.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see tdt4250.studyprogramme.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see tdt4250.studyprogramme.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

} // Course
