/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.CourseCombination#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseCombination#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseCombination#getCreditsRequirement <em>Credits Requirement</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseCombination#getFromTerm <em>From Term</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseCombination#getCourseCombinations <em>Course Combinations</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseCombination#getCourseGroups <em>Course Groups</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCombination()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containsEitherCourseCombinationsOrCourseGroups'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 containsEitherCourseCombinationsOrCourseGroups='if self.courseGroups-&gt;size() &gt; 0 and self.courseCombinations-&gt;size() &gt; 0 then false else true endif'"
 * @generated
 */
public interface CourseCombination extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCombination_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseCombination#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCombination_CourseGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' reference.
	 * @see #setSpecialisation(Specialisation)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCombination_Specialisation()
	 * @model
	 * @generated
	 */
	Specialisation getSpecialisation();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseCombination#getSpecialisation <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(Specialisation value);

	/**
	 * Returns the value of the '<em><b>Course Combinations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.CourseCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Combinations</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCombination_CourseCombinations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseCombination> getCourseCombinations();

	/**
	 * Returns the value of the '<em><b>Credits Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits Requirement</em>' attribute.
	 * @see #setCreditsRequirement(double)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCombination_CreditsRequirement()
	 * @model
	 * @generated
	 */
	double getCreditsRequirement();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseCombination#getCreditsRequirement <em>Credits Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits Requirement</em>' attribute.
	 * @see #getCreditsRequirement()
	 * @generated
	 */
	void setCreditsRequirement(double value);

	/**
	 * Returns the value of the '<em><b>From Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Term</em>' attribute.
	 * @see #setFromTerm(int)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseCombination_FromTerm()
	 * @model
	 * @generated
	 */
	int getFromTerm();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseCombination#getFromTerm <em>From Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Term</em>' attribute.
	 * @see #getFromTerm()
	 * @generated
	 */
	void setFromTerm(int value);

} // CourseCombination
