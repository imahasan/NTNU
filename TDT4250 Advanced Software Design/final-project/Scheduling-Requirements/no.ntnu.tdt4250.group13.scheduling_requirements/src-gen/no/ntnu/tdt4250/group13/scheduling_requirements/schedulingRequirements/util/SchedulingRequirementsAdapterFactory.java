/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.util;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage
 * @generated
 */
public class SchedulingRequirementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulingRequirementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingRequirementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchedulingRequirementsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingRequirementsSwitch<Adapter> modelSwitch = new SchedulingRequirementsSwitch<Adapter>() {
		@Override
		public Adapter caseCourse(Course object) {
			return createCourseAdapter();
		}

		@Override
		public Adapter caseTeacher(Teacher object) {
			return createTeacherAdapter();
		}

		@Override
		public Adapter caseschedulingRequirements(schedulingRequirements object) {
			return createschedulingRequirementsAdapter();
		}

		@Override
		public Adapter caseRoom(Room object) {
			return createRoomAdapter();
		}

		@Override
		public Adapter caseSlotRequirement(SlotRequirement object) {
			return createSlotRequirementAdapter();
		}

		@Override
		public Adapter caseWeek(Week object) {
			return createWeekAdapter();
		}

		@Override
		public Adapter caseUniversity(University object) {
			return createUniversityAdapter();
		}

		@Override
		public Adapter caseCampus(Campus object) {
			return createCampusAdapter();
		}

		@Override
		public Adapter caseBuilding(Building object) {
			return createBuildingAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher
	 * @generated
	 */
	public Adapter createTeacherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements <em>scheduling Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements
	 * @generated
	 */
	public Adapter createschedulingRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement <em>Slot Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement
	 * @generated
	 */
	public Adapter createSlotRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week
	 * @generated
	 */
	public Adapter createWeekAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University
	 * @generated
	 */
	public Adapter createUniversityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus
	 * @generated
	 */
	public Adapter createCampusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building
	 * @generated
	 */
	public Adapter createBuildingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchedulingRequirementsAdapterFactory
