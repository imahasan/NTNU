/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.Programme#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Programme#getFullName <em>Full Name</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Programme#getAcademicYears <em>Academic Years</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Programme#getLength <em>Length</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Programme#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.Programme#getCreditsRequirement <em>Credits Requirement</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Academic Years</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.AcademicYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Academic Years</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme_AcademicYears()
	 * @model containment="true"
	 * @generated
	 */
	EList<AcademicYear> getAcademicYears();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme_Code()
	 * @model dataType="tdt4250.studyprogramme.Code"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme_FullName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getFullName();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Programme#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme_Specialisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Credits Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits Requirement</em>' attribute.
	 * @see #setCreditsRequirement(double)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getProgramme_CreditsRequirement()
	 * @model
	 * @generated
	 */
	double getCreditsRequirement();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.Programme#getCreditsRequirement <em>Credits Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits Requirement</em>' attribute.
	 * @see #getCreditsRequirement()
	 * @generated
	 */
	void setCreditsRequirement(double value);

} // Programme
