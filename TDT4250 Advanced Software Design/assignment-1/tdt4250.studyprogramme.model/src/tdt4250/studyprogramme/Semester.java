/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Semester#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogramPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='test'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 test='self.year&gt;0.0f'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see tdt4250.studyprogramme.StudyprogramPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyprogramme.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see tdt4250.studyprogramme.Season
	 * @see #setSeason(Season)
	 * @see tdt4250.studyprogramme.StudyprogramPackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see tdt4250.studyprogramme.Season
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.Criterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogramPackage#getSemester_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criterion> getCriteria();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Course> getCourses();

} // Semester
