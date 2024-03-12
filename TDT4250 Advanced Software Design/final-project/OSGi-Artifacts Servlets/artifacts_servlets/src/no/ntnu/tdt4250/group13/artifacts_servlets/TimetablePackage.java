/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets;

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
 * @see no.ntnu.tdt4250.group13.artifacts_servlets.TimetableFactory
 * @model kind="package"
 * @generated
 */
public interface TimetablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timetable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/timetable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timetable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimetablePackage eINSTANCE = no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Campus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__CAMPUS = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSE = 2;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__TEACHER = 3;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

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
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COORDINATOR = 2;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LECTURER = 3;

	/**
	 * The feature id for the '<em><b>Coursetimetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSETIMETABLE = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TeacherImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 2;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__SLOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CampusImpl <em>Campus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.CampusImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getCampus()
	 * @generated
	 */
	int CAMPUS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Building</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__BUILDING = 1;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.BuildingImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ROOM = 1;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.RoomImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 5;

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
	 * The feature id for the '<em><b>Slot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SLOT = 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.WeekImpl <em>Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.WeekImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getWeek()
	 * @generated
	 */
	int WEEK = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEK__SLOT = 1;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 7;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DAY = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__LECTURER = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__START_TIME = 4;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__END_TIME = 5;

	/**
	 * The feature id for the '<em><b>Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__WEEK = 6;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__COURSE = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DATE = 8;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.ActivityImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseTimetableImpl <em>Course Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseTimetableImpl
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getCourseTimetable()
	 * @generated
	 */
	int COURSE_TIMETABLE = 9;

	/**
	 * The feature id for the '<em><b>Week</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TIMETABLE__WEEK = 0;

	/**
	 * The number of structural features of the '<em>Course Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TIMETABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Course Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TIMETABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum <em>Activity Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getActivityEnum()
	 * @generated
	 */
	int ACTIVITY_ENUM = 10;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.DayEnum <em>Day Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.DayEnum
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getDayEnum()
	 * @generated
	 */
	int DAY_ENUM = 11;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getCampus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campus</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.University#getCampus()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Campus();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.University#getCourse()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teacher</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.University#getTeacher()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Teacher();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.University#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.University#getYear()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Year();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Course#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Course#getCoordinator()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Coordinator();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Course#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lecturer</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Course#getLecturer()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Lecturer();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Course#getCoursetimetable <em>Coursetimetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coursetimetable</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Course#getCoursetimetable()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Coursetimetable();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Teacher#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slot</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Teacher#getSlot()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Slot();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Teacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Teacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Campus
	 * @generated
	 */
	EClass getCampus();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Campus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Campus#getName()
	 * @see #getCampus()
	 * @generated
	 */
	EAttribute getCampus_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Campus#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Campus#getBuilding()
	 * @see #getCampus()
	 * @generated
	 */
	EReference getCampus_Building();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Building#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Building#getName()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Building#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Building#getRoom()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Room();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Room#getMazemapLink <em>Mazemap Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mazemap Link</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Room#getMazemapLink()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_MazemapLink();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Room#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slot</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Room#getSlot()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Slot();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Week <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Week</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Week
	 * @generated
	 */
	EClass getWeek();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Week#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Week#getNumber()
	 * @see #getWeek()
	 * @generated
	 */
	EAttribute getWeek_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Week#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Week#getSlot()
	 * @see #getWeek()
	 * @generated
	 */
	EReference getWeek_Slot();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getDay()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Day();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getRoom()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Room();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lecturer</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getLecturer()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Lecturer();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getActivity()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Activity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getStartTime()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getEndTime()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getWeek <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Week</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getWeek()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Week();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getCourse()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Course();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Slot#getDate()
	 * @see #getSlot()
	 * @generated
	 */
	EAttribute getSlot_Date();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.group13.artifacts_servlets.Activity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.Activity#getType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Type();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.group13.artifacts_servlets.CourseTimetable <em>Course Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Timetable</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.CourseTimetable
	 * @generated
	 */
	EClass getCourseTimetable();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.group13.artifacts_servlets.CourseTimetable#getWeek <em>Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Week</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.CourseTimetable#getWeek()
	 * @see #getCourseTimetable()
	 * @generated
	 */
	EReference getCourseTimetable_Week();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum <em>Activity Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Enum</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum
	 * @generated
	 */
	EEnum getActivityEnum();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.group13.artifacts_servlets.DayEnum <em>Day Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Enum</em>'.
	 * @see no.ntnu.tdt4250.group13.artifacts_servlets.DayEnum
	 * @generated
	 */
	EEnum getDayEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimetableFactory getTimetableFactory();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getUniversity()
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
		 * The meta object literal for the '<em><b>Campus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__CAMPUS = eINSTANCE.getUniversity_Campus();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSE = eINSTANCE.getUniversity_Course();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__TEACHER = eINSTANCE.getUniversity_Teacher();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__YEAR = eINSTANCE.getUniversity_Year();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getCourse()
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
		 * The meta object literal for the '<em><b>Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COORDINATOR = eINSTANCE.getCourse_Coordinator();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__LECTURER = eINSTANCE.getCourse_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Coursetimetable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSETIMETABLE = eINSTANCE.getCourse_Coursetimetable();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TeacherImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__SLOT = eINSTANCE.getTeacher_Slot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CampusImpl <em>Campus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.CampusImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getCampus()
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
		 * The meta object literal for the '<em><b>Building</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPUS__BUILDING = eINSTANCE.getCampus_Building();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.BuildingImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getBuilding()
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
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__ROOM = eINSTANCE.getBuilding_Room();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.RoomImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getRoom()
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
		 * The meta object literal for the '<em><b>Slot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SLOT = eINSTANCE.getRoom_Slot();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.WeekImpl <em>Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.WeekImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getWeek()
		 * @generated
		 */
		EClass WEEK = eINSTANCE.getWeek();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEEK__NUMBER = eINSTANCE.getWeek_Number();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEEK__SLOT = eINSTANCE.getWeek_Slot();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__DAY = eINSTANCE.getSlot_Day();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__ROOM = eINSTANCE.getSlot_Room();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__LECTURER = eINSTANCE.getSlot_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__ACTIVITY = eINSTANCE.getSlot_Activity();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__START_TIME = eINSTANCE.getSlot_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__END_TIME = eINSTANCE.getSlot_EndTime();

		/**
		 * The meta object literal for the '<em><b>Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__WEEK = eINSTANCE.getSlot_Week();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__COURSE = eINSTANCE.getSlot_Course();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOT__DATE = eINSTANCE.getSlot_Date();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.ActivityImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TYPE = eINSTANCE.getActivity_Type();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseTimetableImpl <em>Course Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseTimetableImpl
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getCourseTimetable()
		 * @generated
		 */
		EClass COURSE_TIMETABLE = eINSTANCE.getCourseTimetable();

		/**
		 * The meta object literal for the '<em><b>Week</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_TIMETABLE__WEEK = eINSTANCE.getCourseTimetable_Week();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum <em>Activity Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.ActivityEnum
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getActivityEnum()
		 * @generated
		 */
		EEnum ACTIVITY_ENUM = eINSTANCE.getActivityEnum();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.group13.artifacts_servlets.DayEnum <em>Day Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.DayEnum
		 * @see no.ntnu.tdt4250.group13.artifacts_servlets.impl.TimetablePackageImpl#getDayEnum()
		 * @generated
		 */
		EEnum DAY_ENUM = eINSTANCE.getDayEnum();

	}

} //TimetablePackage
