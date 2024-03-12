/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UOD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.UOD#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.UOD#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getUOD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='programmesMustHaveUniqueCode'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 programmesMustHaveUniqueCode='self.programmes-&gt;isUnique( p | p.code)'"
 * @generated
 */
public interface UOD extends EObject {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getUOD_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getUOD_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // UOD
