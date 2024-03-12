/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingRequirementsFactoryImpl extends EFactoryImpl implements SchedulingRequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingRequirementsFactory init() {
		try {
			SchedulingRequirementsFactory theSchedulingRequirementsFactory = (SchedulingRequirementsFactory) EPackage.Registry.INSTANCE
					.getEFactory(SchedulingRequirementsPackage.eNS_URI);
			if (theSchedulingRequirementsFactory != null) {
				return theSchedulingRequirementsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchedulingRequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingRequirementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SchedulingRequirementsPackage.COURSE:
			return createCourse();
		case SchedulingRequirementsPackage.TEACHER:
			return createTeacher();
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS:
			return createschedulingRequirements();
		case SchedulingRequirementsPackage.ROOM:
			return createRoom();
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT:
			return createSlotRequirement();
		case SchedulingRequirementsPackage.WEEK:
			return createWeek();
		case SchedulingRequirementsPackage.UNIVERSITY:
			return createUniversity();
		case SchedulingRequirementsPackage.CAMPUS:
			return createCampus();
		case SchedulingRequirementsPackage.BUILDING:
			return createBuilding();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SchedulingRequirementsPackage.ACTIVITY_TYPE:
			return createActivityTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SchedulingRequirementsPackage.ACTIVITY_TYPE:
			return convertActivityTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teacher createTeacher() {
		TeacherImpl teacher = new TeacherImpl();
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public schedulingRequirements createschedulingRequirements() {
		schedulingRequirementsImpl schedulingRequirements = new schedulingRequirementsImpl();
		return schedulingRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlotRequirement createSlotRequirement() {
		SlotRequirementImpl slotRequirement = new SlotRequirementImpl();
		return slotRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Week createWeek() {
		WeekImpl week = new WeekImpl();
		return week;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Campus createCampus() {
		CampusImpl campus = new CampusImpl();
		return campus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeFromString(EDataType eDataType, String initialValue) {
		ActivityType result = ActivityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingRequirementsPackage getSchedulingRequirementsPackage() {
		return (SchedulingRequirementsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchedulingRequirementsPackage getPackage() {
		return SchedulingRequirementsPackage.eINSTANCE;
	}

} //SchedulingRequirementsFactoryImpl
