/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.Criterion#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCriterion()
 * @model abstract="true"
 * @generated
 */
public interface Criterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.studyprogramme.Criterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCriterion_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criterion> getCriteria();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model coursesMany="true"
	 * @generated
	 */
	EList<Course> filterCourses(EList<Course> courses);

} // Criterion
