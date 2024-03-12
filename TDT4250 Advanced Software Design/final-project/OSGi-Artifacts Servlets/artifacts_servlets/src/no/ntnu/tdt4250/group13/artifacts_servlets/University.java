/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets;

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
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getCampus <em>Campus</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getUniversity()
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
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getUniversity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Campus</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.artifacts_servlets.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campus</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getUniversity_Campus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Campus> getCampus();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.artifacts_servlets.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getUniversity_Course()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.group13.artifacts_servlets.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' containment reference list.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getUniversity_Teacher()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Teacher> getTeacher();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * The default value is <code>"2024"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage#getUniversity_Year()
	 * @model default="2024" required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // University
