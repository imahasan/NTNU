/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250.studyprogramme.StudyprogrammePackage
 * @generated
 */
public interface StudyprogrammeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyprogrammeFactory eINSTANCE = tdt4250.studyprogramme.impl.StudyprogrammeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UOD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UOD</em>'.
	 * @generated
	 */
	UOD createUOD();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme</em>'.
	 * @generated
	 */
	Programme createProgramme();

	/**
	 * Returns a new object of class '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Group</em>'.
	 * @generated
	 */
	CourseGroup createCourseGroup();

	/**
	 * Returns a new object of class '<em>Course Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Criterion</em>'.
	 * @generated
	 */
	CourseCriterion createCourseCriterion();

	/**
	 * Returns a new object of class '<em>Course Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Combination</em>'.
	 * @generated
	 */
	CourseCombination createCourseCombination();

	/**
	 * Returns a new object of class '<em>Course Level Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Level Criterion</em>'.
	 * @generated
	 */
	CourseLevelCriterion createCourseLevelCriterion();

	/**
	 * Returns a new object of class '<em>Academic Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Academic Year</em>'.
	 * @generated
	 */
	AcademicYear createAcademicYear();

	/**
	 * Returns a new object of class '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialisation</em>'.
	 * @generated
	 */
	Specialisation createSpecialisation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StudyprogrammePackage getStudyprogrammePackage();

} //StudyprogrammeFactory
