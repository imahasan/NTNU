/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage
 * @generated
 */
public interface SchedulingRequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulingRequirementsFactory eINSTANCE = no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teacher</em>'.
	 * @generated
	 */
	Teacher createTeacher();

	/**
	 * Returns a new object of class '<em>scheduling Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>scheduling Requirements</em>'.
	 * @generated
	 */
	schedulingRequirements createschedulingRequirements();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Slot Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Requirement</em>'.
	 * @generated
	 */
	SlotRequirement createSlotRequirement();

	/**
	 * Returns a new object of class '<em>Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Week</em>'.
	 * @generated
	 */
	Week createWeek();

	/**
	 * Returns a new object of class '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University</em>'.
	 * @generated
	 */
	University createUniversity();

	/**
	 * Returns a new object of class '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campus</em>'.
	 * @generated
	 */
	Campus createCampus();

	/**
	 * Returns a new object of class '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building</em>'.
	 * @generated
	 */
	Building createBuilding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulingRequirementsPackage getSchedulingRequirementsPackage();

} //SchedulingRequirementsFactory
