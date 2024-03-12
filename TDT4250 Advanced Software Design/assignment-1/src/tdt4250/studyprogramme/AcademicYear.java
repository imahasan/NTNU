/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Academic Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.AcademicYear#getFromYear <em>From Year</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.AcademicYear#getFromSeason <em>From Season</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.AcademicYear#getCourseCombinations <em>Course Combinations</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getAcademicYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasEnoughCredits'"
 * @generated
 */
public interface AcademicYear extends EObject {
	/**
	 * Returns the value of the '<em><b>From Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Year</em>' attribute.
	 * @see #setFromYear(int)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getAcademicYear_FromYear()
	 * @model dataType="tdt4250.studyprogramme.Year"
	 * @generated
	 */
	int getFromYear();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.AcademicYear#getFromYear <em>From Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Year</em>' attribute.
	 * @see #getFromYear()
	 * @generated
	 */
	void setFromYear(int value);

	/**
	 * Returns the value of the '<em><b>From Season</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyprogramme.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Season</em>' attribute.
	 * @see tdt4250.studyprogramme.Season
	 * @see #setFromSeason(Season)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getAcademicYear_FromSeason()
	 * @model
	 * @generated
	 */
	Season getFromSeason();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.AcademicYear#getFromSeason <em>From Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Season</em>' attribute.
	 * @see tdt4250.studyprogramme.Season
	 * @see #getFromSeason()
	 * @generated
	 */
	void setFromSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Course Combinations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.CourseCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Combinations</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getAcademicYear_CourseCombinations()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseCombination> getCourseCombinations();

} // AcademicYear
