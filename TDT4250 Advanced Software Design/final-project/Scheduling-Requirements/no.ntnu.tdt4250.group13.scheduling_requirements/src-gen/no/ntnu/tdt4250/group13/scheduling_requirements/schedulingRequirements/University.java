/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getCampi <em>Campi</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getUniversity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Campi</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campi</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getUniversity_Campi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Campus> getCampi();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference.
	 * @see #setCourse(Course)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getUniversity_Course()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getCourse <em>Course</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' containment reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getUniversity_Teachers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Teacher> getTeachers();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#getUniversity_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // University
