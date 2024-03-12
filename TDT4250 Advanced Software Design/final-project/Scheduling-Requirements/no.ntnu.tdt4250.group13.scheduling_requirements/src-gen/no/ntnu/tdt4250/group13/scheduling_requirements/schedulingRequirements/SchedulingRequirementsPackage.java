/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulingRequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schedulingRequirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/schedulingRequirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schedulingRequirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulingRequirementsPackage eINSTANCE = no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Schedulingrequirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SCHEDULINGREQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COORDINATOR = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.TeacherImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.schedulingRequirementsImpl <em>scheduling Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.schedulingRequirementsImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getschedulingRequirements()
	 * @generated
	 */
	int SCHEDULING_REQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Weeks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_REQUIREMENTS__WEEKS = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_REQUIREMENTS__SENDER = 1;

	/**
	 * The number of structural features of the '<em>scheduling Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_REQUIREMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>scheduling Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.RoomImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mazemap Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__MAZEMAP_LINK = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl <em>Slot Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getSlotRequirement()
	 * @generated
	 */
	int SLOT_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Required Personal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT__REQUIRED_PERSONAL = 0;

	/**
	 * The feature id for the '<em><b>Required Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT__REQUIRED_ROOM = 1;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT__ACTIVITY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Expected Students</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT__EXPECTED_STUDENTS = 4;

	/**
	 * The feature id for the '<em><b>Required Same Day Slots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS = 5;

	/**
	 * The number of structural features of the '<em>Slot Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Slot Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.WeekImpl <em>Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.WeekImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getWeek()
	 * @generated
	 */
	int WEEK = 5;

	/**
	 * The feature id for the '<em><b>Week Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK__WEEK_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Slot Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK__SLOT_REQUIREMENTS = 1;

	/**
	 * The number of structural features of the '<em>Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Campi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__CAMPI = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSE = 2;

	/**
	 * The feature id for the '<em><b>Teachers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__TEACHERS = 3;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__YEAR = 4;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CampusImpl <em>Campus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CampusImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getCampus()
	 * @generated
	 */
	int CAMPUS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__BUILDINGS = 1;

	/**
	 * The number of structural features of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.BuildingImpl
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ROOMS = 1;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType <em>Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getSchedulingrequirements <em>Schedulingrequirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedulingrequirements</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getSchedulingrequirements()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Schedulingrequirements();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course#getCoordinator()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Coordinator();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements <em>scheduling Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>scheduling Requirements</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements
	 * @generated
	 */
	EClass getschedulingRequirements();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements#getSender()
	 * @see #getschedulingRequirements()
	 * @generated
	 */
	EReference getschedulingRequirements_Sender();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weeks</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements#getWeeks()
	 * @see #getschedulingRequirements()
	 * @generated
	 */
	EReference getschedulingRequirements_Weeks();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room#getMazemapLink <em>Mazemap Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mazemap Link</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room#getMazemapLink()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_MazemapLink();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement <em>Slot Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Requirement</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement
	 * @generated
	 */
	EClass getSlotRequirement();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredPersonal <em>Required Personal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Personal</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredPersonal()
	 * @see #getSlotRequirement()
	 * @generated
	 */
	EReference getSlotRequirement_RequiredPersonal();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredRoom <em>Required Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Room</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredRoom()
	 * @see #getSlotRequirement()
	 * @generated
	 */
	EReference getSlotRequirement_RequiredRoom();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getActivityType()
	 * @see #getSlotRequirement()
	 * @generated
	 */
	EAttribute getSlotRequirement_ActivityType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getDuration()
	 * @see #getSlotRequirement()
	 * @generated
	 */
	EAttribute getSlotRequirement_Duration();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getExpectedStudents <em>Expected Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Students</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getExpectedStudents()
	 * @see #getSlotRequirement()
	 * @generated
	 */
	EAttribute getSlotRequirement_ExpectedStudents();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredSameDaySlots <em>Required Same Day Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Same Day Slots</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement#getRequiredSameDaySlots()
	 * @see #getSlotRequirement()
	 * @generated
	 */
	EReference getSlotRequirement_RequiredSameDaySlots();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Week</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week
	 * @generated
	 */
	EClass getWeek();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week#getWeekNumber <em>Week Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week Number</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week#getWeekNumber()
	 * @see #getWeek()
	 * @generated
	 */
	EAttribute getWeek_WeekNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week#getSlotRequirements <em>Slot Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot Requirements</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week#getSlotRequirements()
	 * @see #getWeek()
	 * @generated
	 */
	EReference getWeek_SlotRequirements();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getCampi <em>Campi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campi</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getCampi()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Campi();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Course</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getCourse()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teachers</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getTeachers()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Teachers();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University#getYear()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Year();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus
	 * @generated
	 */
	EClass getCampus();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus#getName()
	 * @see #getCampus()
	 * @generated
	 */
	EAttribute getCampus_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus#getBuildings()
	 * @see #getCampus()
	 * @generated
	 */
	EReference getCampus_Buildings();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building#getName()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building#getRooms()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Rooms();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Type</em>'.
	 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType
	 * @generated
	 */
	EEnum getActivityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulingRequirementsFactory getSchedulingRequirementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Schedulingrequirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__SCHEDULINGREQUIREMENTS = eINSTANCE.getCourse_Schedulingrequirements();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COORDINATOR = eINSTANCE.getCourse_Coordinator();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.TeacherImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.schedulingRequirementsImpl <em>scheduling Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.schedulingRequirementsImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getschedulingRequirements()
		 * @generated
		 */
		EClass SCHEDULING_REQUIREMENTS = eINSTANCE.getschedulingRequirements();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_REQUIREMENTS__SENDER = eINSTANCE.getschedulingRequirements_Sender();

		/**
		 * The meta object literal for the '<em><b>Weeks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_REQUIREMENTS__WEEKS = eINSTANCE.getschedulingRequirements_Weeks();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.RoomImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Mazemap Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__MAZEMAP_LINK = eINSTANCE.getRoom_MazemapLink();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl <em>Slot Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getSlotRequirement()
		 * @generated
		 */
		EClass SLOT_REQUIREMENT = eINSTANCE.getSlotRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Personal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_REQUIREMENT__REQUIRED_PERSONAL = eINSTANCE.getSlotRequirement_RequiredPersonal();

		/**
		 * The meta object literal for the '<em><b>Required Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_REQUIREMENT__REQUIRED_ROOM = eINSTANCE.getSlotRequirement_RequiredRoom();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_REQUIREMENT__ACTIVITY_TYPE = eINSTANCE.getSlotRequirement_ActivityType();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_REQUIREMENT__DURATION = eINSTANCE.getSlotRequirement_Duration();

		/**
		 * The meta object literal for the '<em><b>Expected Students</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT_REQUIREMENT__EXPECTED_STUDENTS = eINSTANCE.getSlotRequirement_ExpectedStudents();

		/**
		 * The meta object literal for the '<em><b>Required Same Day Slots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS = eINSTANCE.getSlotRequirement_RequiredSameDaySlots();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.WeekImpl <em>Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.WeekImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getWeek()
		 * @generated
		 */
		EClass WEEK = eINSTANCE.getWeek();

		/**
		 * The meta object literal for the '<em><b>Week Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK__WEEK_NUMBER = eINSTANCE.getWeek_WeekNumber();

		/**
		 * The meta object literal for the '<em><b>Slot Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEK__SLOT_REQUIREMENTS = eINSTANCE.getWeek_SlotRequirements();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '<em><b>Campi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__CAMPI = eINSTANCE.getUniversity_Campi();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSE = eINSTANCE.getUniversity_Course();

		/**
		 * The meta object literal for the '<em><b>Teachers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__TEACHERS = eINSTANCE.getUniversity_Teachers();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__YEAR = eINSTANCE.getUniversity_Year();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CampusImpl <em>Campus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CampusImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getCampus()
		 * @generated
		 */
		EClass CAMPUS = eINSTANCE.getCampus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS__NAME = eINSTANCE.getCampus_Name();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPUS__BUILDINGS = eINSTANCE.getCampus_Buildings();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.BuildingImpl
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__NAME = eINSTANCE.getBuilding_Name();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__ROOMS = eINSTANCE.getBuilding_Rooms();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType <em>Activity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType
		 * @see no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl#getActivityType()
		 * @generated
		 */
		EEnum ACTIVITY_TYPE = eINSTANCE.getActivityType();

	}

} //SchedulingRequirementsPackage
