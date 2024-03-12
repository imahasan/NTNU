/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsFactory;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.util.SchedulingRequirementsValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingRequirementsPackageImpl extends EPackageImpl implements SchedulingRequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teacherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingRequirementsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotRequirementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchedulingRequirementsPackageImpl() {
		super(eNS_URI, SchedulingRequirementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SchedulingRequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchedulingRequirementsPackage init() {
		if (isInited)
			return (SchedulingRequirementsPackage) EPackage.Registry.INSTANCE
					.getEPackage(SchedulingRequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchedulingRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchedulingRequirementsPackageImpl theSchedulingRequirementsPackage = registeredSchedulingRequirementsPackage instanceof SchedulingRequirementsPackageImpl
				? (SchedulingRequirementsPackageImpl) registeredSchedulingRequirementsPackage
				: new SchedulingRequirementsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSchedulingRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulingRequirementsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSchedulingRequirementsPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return SchedulingRequirementsValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSchedulingRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchedulingRequirementsPackage.eNS_URI, theSchedulingRequirementsPackage);
		return theSchedulingRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Code() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Schedulingrequirements() {
		return (EReference) courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Coordinator() {
		return (EReference) courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeacher() {
		return teacherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeacher_Name() {
		return (EAttribute) teacherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getschedulingRequirements() {
		return schedulingRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getschedulingRequirements_Sender() {
		return (EReference) schedulingRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getschedulingRequirements_Weeks() {
		return (EReference) schedulingRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_Name() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_MazemapLink() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlotRequirement() {
		return slotRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlotRequirement_RequiredPersonal() {
		return (EReference) slotRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlotRequirement_RequiredRoom() {
		return (EReference) slotRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlotRequirement_ActivityType() {
		return (EAttribute) slotRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlotRequirement_Duration() {
		return (EAttribute) slotRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlotRequirement_ExpectedStudents() {
		return (EAttribute) slotRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlotRequirement_RequiredSameDaySlots() {
		return (EReference) slotRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeek() {
		return weekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWeek_WeekNumber() {
		return (EAttribute) weekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWeek_SlotRequirements() {
		return (EReference) weekEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversity() {
		return universityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversity_Name() {
		return (EAttribute) universityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Campi() {
		return (EReference) universityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Course() {
		return (EReference) universityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Teachers() {
		return (EReference) universityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversity_Year() {
		return (EAttribute) universityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCampus() {
		return campusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampus_Name() {
		return (EAttribute) campusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCampus_Buildings() {
		return (EReference) campusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuilding() {
		return buildingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuilding_Name() {
		return (EAttribute) buildingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuilding_Rooms() {
		return (EReference) buildingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActivityType() {
		return activityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingRequirementsFactory getSchedulingRequirementsFactory() {
		return (SchedulingRequirementsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CODE);
		createEReference(courseEClass, COURSE__SCHEDULINGREQUIREMENTS);
		createEReference(courseEClass, COURSE__COORDINATOR);

		teacherEClass = createEClass(TEACHER);
		createEAttribute(teacherEClass, TEACHER__NAME);

		schedulingRequirementsEClass = createEClass(SCHEDULING_REQUIREMENTS);
		createEReference(schedulingRequirementsEClass, SCHEDULING_REQUIREMENTS__WEEKS);
		createEReference(schedulingRequirementsEClass, SCHEDULING_REQUIREMENTS__SENDER);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NAME);
		createEAttribute(roomEClass, ROOM__MAZEMAP_LINK);

		slotRequirementEClass = createEClass(SLOT_REQUIREMENT);
		createEReference(slotRequirementEClass, SLOT_REQUIREMENT__REQUIRED_PERSONAL);
		createEReference(slotRequirementEClass, SLOT_REQUIREMENT__REQUIRED_ROOM);
		createEAttribute(slotRequirementEClass, SLOT_REQUIREMENT__ACTIVITY_TYPE);
		createEAttribute(slotRequirementEClass, SLOT_REQUIREMENT__DURATION);
		createEAttribute(slotRequirementEClass, SLOT_REQUIREMENT__EXPECTED_STUDENTS);
		createEReference(slotRequirementEClass, SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS);

		weekEClass = createEClass(WEEK);
		createEAttribute(weekEClass, WEEK__WEEK_NUMBER);
		createEReference(weekEClass, WEEK__SLOT_REQUIREMENTS);

		universityEClass = createEClass(UNIVERSITY);
		createEAttribute(universityEClass, UNIVERSITY__NAME);
		createEReference(universityEClass, UNIVERSITY__CAMPI);
		createEReference(universityEClass, UNIVERSITY__COURSE);
		createEReference(universityEClass, UNIVERSITY__TEACHERS);
		createEAttribute(universityEClass, UNIVERSITY__YEAR);

		campusEClass = createEClass(CAMPUS);
		createEAttribute(campusEClass, CAMPUS__NAME);
		createEReference(campusEClass, CAMPUS__BUILDINGS);

		buildingEClass = createEClass(BUILDING);
		createEAttribute(buildingEClass, BUILDING__NAME);
		createEReference(buildingEClass, BUILDING__ROOMS);

		// Create enums
		activityTypeEEnum = createEEnum(ACTIVITY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 1, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", null, 1, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Schedulingrequirements(), this.getschedulingRequirements(), null,
				"schedulingrequirements", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Coordinator(), this.getTeacher(), null, "coordinator", null, 1, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teacherEClass, Teacher.class, "Teacher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeacher_Name(), ecorePackage.getEString(), "name", null, 1, 1, Teacher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingRequirementsEClass, schedulingRequirements.class, "schedulingRequirements", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getschedulingRequirements_Weeks(), this.getWeek(), null, "weeks", null, 1, 52,
				schedulingRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getschedulingRequirements_Sender(), this.getTeacher(), null, "sender", null, 1, 1,
				schedulingRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 1, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_MazemapLink(), ecorePackage.getEString(), "mazemapLink", null, 1, 1, Room.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotRequirementEClass, SlotRequirement.class, "SlotRequirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlotRequirement_RequiredPersonal(), this.getTeacher(), null, "requiredPersonal", null, 0, -1,
				SlotRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlotRequirement_RequiredRoom(), this.getRoom(), null, "requiredRoom", null, 0, 1,
				SlotRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotRequirement_ActivityType(), this.getActivityType(), "activityType", null, 1, 1,
				SlotRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotRequirement_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1,
				SlotRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlotRequirement_ExpectedStudents(), ecorePackage.getEInt(), "expectedStudents", null, 1, 1,
				SlotRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSlotRequirement_RequiredSameDaySlots(), this.getSlotRequirement(), null,
				"requiredSameDaySlots", null, 0, -1, SlotRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weekEClass, Week.class, "Week", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeek_WeekNumber(), ecorePackage.getEInt(), "weekNumber", null, 1, 1, Week.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeek_SlotRequirements(), this.getSlotRequirement(), null, "slotRequirements", null, 1, -1,
				Week.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversity_Name(), ecorePackage.getEString(), "name", null, 1, 1, University.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Campi(), this.getCampus(), null, "campi", null, 1, -1, University.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Course(), this.getCourse(), null, "course", null, 1, 1, University.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Teachers(), this.getTeacher(), null, "teachers", null, 1, -1, University.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversity_Year(), ecorePackage.getEInt(), "year", null, 1, 1, University.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campusEClass, Campus.class, "Campus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampus_Name(), ecorePackage.getEString(), "name", null, 1, 1, Campus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampus_Buildings(), this.getBuilding(), null, "buildings", null, 1, -1, Campus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildingEClass, Building.class, "Building", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuilding_Name(), ecorePackage.getEString(), "name", null, 1, 1, Building.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilding_Rooms(), this.getRoom(), null, "rooms", null, 1, -1, Building.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activityTypeEEnum, ActivityType.class, "ActivityType");
		addEEnumLiteral(activityTypeEEnum, ActivityType.LECTURE);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EXERCISE);
		addEEnumLiteral(activityTypeEEnum, ActivityType.LAB);
		addEEnumLiteral(activityTypeEEnum, ActivityType.SUPERVISION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(schedulingRequirementsEClass, source,
				new String[] { "constraints", "SenderMustBeCourseCoordinator" });
		addAnnotation(slotRequirementEClass, source,
				new String[] { "constraints", "ExpectedStudentsMustBeGreaterThanZero DurationMustBeGreaterThanZero" });
	}

} //SchedulingRequirementsPackageImpl
