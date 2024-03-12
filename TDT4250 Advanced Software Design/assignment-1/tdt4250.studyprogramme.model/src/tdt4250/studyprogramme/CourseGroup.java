/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.CourseGroup#getFromTerm <em>From Term</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseGroup#getToTerm <em>To Term</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseGroup#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseGroup#getStatus <em>Status</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.CourseGroup#getRequiredCredits <em>Required Credits</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minimumOneCoursePresent'"
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>From Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Term</em>' attribute.
	 * @see #setFromTerm(int)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseGroup_FromTerm()
	 * @model
	 * @generated
	 */
	int getFromTerm();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseGroup#getFromTerm <em>From Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Term</em>' attribute.
	 * @see #getFromTerm()
	 * @generated
	 */
	void setFromTerm(int value);

	/**
	 * Returns the value of the '<em><b>To Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Term</em>' attribute.
	 * @see #setToTerm(int)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseGroup_ToTerm()
	 * @model
	 * @generated
	 */
	int getToTerm();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseGroup#getToTerm <em>To Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Term</em>' attribute.
	 * @see #getToTerm()
	 * @generated
	 */
	void setToTerm(int value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.Criterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseGroup_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criterion> getCriteria();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.studyprogramme.CourseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see tdt4250.studyprogramme.CourseStatus
	 * @see #setStatus(CourseStatus)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseGroup_Status()
	 * @model
	 * @generated
	 */
	CourseStatus getStatus();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseGroup#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see tdt4250.studyprogramme.CourseStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CourseStatus value);

	/**
	 * Returns the value of the '<em><b>Required Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Credits</em>' attribute.
	 * @see #setRequiredCredits(double)
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseGroup_RequiredCredits()
	 * @model
	 * @generated
	 */
	double getRequiredCredits();

	/**
	 * Sets the value of the '{@link tdt4250.studyprogramme.CourseGroup#getRequiredCredits <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Credits</em>' attribute.
	 * @see #getRequiredCredits()
	 * @generated
	 */
	void setRequiredCredits(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Course> getCourses();

} // CourseGroup
