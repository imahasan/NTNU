/**
 */
package tdt4250.studyprogramme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see tdt4250.studyprogramme.StudyprogrammeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudyprogrammePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studyprogramme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.studyprogramme.model/model/studyprogramme.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "studyprogramme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyprogrammePackage eINSTANCE = tdt4250.studyprogramme.impl.StudyprogrammePackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.UODImpl <em>UOD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.UODImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getUOD()
	 * @generated
	 */
	int UOD = 0;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOD__PROGRAMMES = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOD__COURSES = 1;

	/**
	 * The number of structural features of the '<em>UOD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UOD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.CourseImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Course Criterion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CRITERION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 4;

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
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.ProgrammeImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 1;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__FULL_NAME = 2;

	/**
	 * The feature id for the '<em><b>Academic Years</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__ACADEMIC_YEARS = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALISATIONS = 5;

	/**
	 * The feature id for the '<em><b>Credits Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CREDITS_REQUIREMENT = 6;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.CourseGroupImpl <em>Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.CourseGroupImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseGroup()
	 * @generated
	 */
	int COURSE_GROUP = 6;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.CriterionImpl <em>Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.CriterionImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCriterion()
	 * @generated
	 */
	int CRITERION = 7;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.CourseCriterionImpl <em>Course Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.CourseCriterionImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseCriterion()
	 * @generated
	 */
	int COURSE_CRITERION = 8;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.CourseCombinationImpl <em>Course Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.CourseCombinationImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseCombination()
	 * @generated
	 */
	int COURSE_COMBINATION = 4;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.CourseLevelCriterionImpl <em>Course Level Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.CourseLevelCriterionImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseLevelCriterion()
	 * @generated
	 */
	int COURSE_LEVEL_CRITERION = 9;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.AcademicYearImpl <em>Academic Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.AcademicYearImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getAcademicYear()
	 * @generated
	 */
	int ACADEMIC_YEAR = 3;

	/**
	 * The feature id for the '<em><b>From Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_YEAR__FROM_YEAR = 0;

	/**
	 * The feature id for the '<em><b>From Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_YEAR__FROM_SEASON = 1;

	/**
	 * The feature id for the '<em><b>Course Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_YEAR__COURSE_COMBINATIONS = 2;

	/**
	 * The number of structural features of the '<em>Academic Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_YEAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Academic Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_YEAR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION__SPECIALISATION = 1;

	/**
	 * The feature id for the '<em><b>Credits Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION__CREDITS_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>From Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION__FROM_TERM = 3;

	/**
	 * The feature id for the '<em><b>Course Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION__COURSE_COMBINATIONS = 4;

	/**
	 * The feature id for the '<em><b>Course Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION__COURSE_GROUPS = 5;

	/**
	 * The number of structural features of the '<em>Course Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Course Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_COMBINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.SpecialisationImpl
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 5;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SPECIALISATION = 0;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>From Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__FROM_TERM = 0;

	/**
	 * The feature id for the '<em><b>To Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__TO_TERM = 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__CRITERIA = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Required Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__REQUIRED_CREDITS = 4;

	/**
	 * The number of structural features of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP___GET_COURSES = 0;

	/**
	 * The number of operations of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION__CRITERIA = 0;

	/**
	 * The number of structural features of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Filter Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION___FILTER_COURSES__ELIST = 0;

	/**
	 * The number of operations of the '<em>Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CRITERION__CRITERIA = CRITERION__CRITERIA;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CRITERION__COURSES = CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Course Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CRITERION_FEATURE_COUNT = CRITERION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Filter Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CRITERION___FILTER_COURSES__ELIST = CRITERION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_CRITERION_OPERATION_COUNT = CRITERION_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LEVEL_CRITERION__CRITERIA = CRITERION__CRITERIA;

	/**
	 * The feature id for the '<em><b>Course Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LEVEL_CRITERION__COURSE_LEVEL = CRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Course Level Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LEVEL_CRITERION_FEATURE_COUNT = CRITERION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Filter Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LEVEL_CRITERION___FILTER_COURSES__ELIST = CRITERION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course Level Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LEVEL_CRITERION_OPERATION_COUNT = CRITERION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.CourseLevel <em>Course Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.CourseLevel
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseLevel()
	 * @generated
	 */
	int COURSE_LEVEL = 10;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.Season <em>Season</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.Season
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 11;

	/**
	 * The meta object id for the '{@link tdt4250.studyprogramme.CourseStatus <em>Course Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.CourseStatus
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseStatus()
	 * @generated
	 */
	int COURSE_STATUS = 12;

	/**
	 * The meta object id for the '<em>Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCode()
	 * @generated
	 */
	int CODE = 13;

	/**
	 * The meta object id for the '<em>Year</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 14;


	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.UOD <em>UOD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UOD</em>'.
	 * @see tdt4250.studyprogramme.UOD
	 * @generated
	 */
	EClass getUOD();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.UOD#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see tdt4250.studyprogramme.UOD#getProgrammes()
	 * @see #getUOD()
	 * @generated
	 */
	EReference getUOD_Programmes();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.UOD#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see tdt4250.studyprogramme.UOD#getCourses()
	 * @see #getUOD()
	 * @generated
	 */
	EReference getUOD_Courses();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.studyprogramme.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.studyprogramme.Course#getCourseCriterion <em>Course Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course Criterion</em>'.
	 * @see tdt4250.studyprogramme.Course#getCourseCriterion()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseCriterion();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.studyprogramme.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tdt4250.studyprogramme.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see tdt4250.studyprogramme.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.studyprogramme.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see tdt4250.studyprogramme.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.studyprogramme.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.Programme#getAcademicYears <em>Academic Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Academic Years</em>'.
	 * @see tdt4250.studyprogramme.Programme#getAcademicYears()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_AcademicYears();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.studyprogramme.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Programme#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see tdt4250.studyprogramme.Programme#getFullName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_FullName();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Programme#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see tdt4250.studyprogramme.Programme#getLength()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Length();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.Programme#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisations</em>'.
	 * @see tdt4250.studyprogramme.Programme#getSpecialisations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specialisations();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Programme#getCreditsRequirement <em>Credits Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits Requirement</em>'.
	 * @see tdt4250.studyprogramme.Programme#getCreditsRequirement()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_CreditsRequirement();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.CourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Group</em>'.
	 * @see tdt4250.studyprogramme.CourseGroup
	 * @generated
	 */
	EClass getCourseGroup();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseGroup#getFromTerm <em>From Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Term</em>'.
	 * @see tdt4250.studyprogramme.CourseGroup#getFromTerm()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_FromTerm();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseGroup#getToTerm <em>To Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Term</em>'.
	 * @see tdt4250.studyprogramme.CourseGroup#getToTerm()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_ToTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.CourseGroup#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see tdt4250.studyprogramme.CourseGroup#getCriteria()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Criteria();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseGroup#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see tdt4250.studyprogramme.CourseGroup#getStatus()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Status();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseGroup#getRequiredCredits <em>Required Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Credits</em>'.
	 * @see tdt4250.studyprogramme.CourseGroup#getRequiredCredits()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_RequiredCredits();

	/**
	 * Returns the meta object for the '{@link tdt4250.studyprogramme.CourseGroup#getCourses() <em>Get Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Courses</em>' operation.
	 * @see tdt4250.studyprogramme.CourseGroup#getCourses()
	 * @generated
	 */
	EOperation getCourseGroup__GetCourses();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion</em>'.
	 * @see tdt4250.studyprogramme.Criterion
	 * @generated
	 */
	EClass getCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.Criterion#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see tdt4250.studyprogramme.Criterion#getCriteria()
	 * @see #getCriterion()
	 * @generated
	 */
	EReference getCriterion_Criteria();

	/**
	 * Returns the meta object for the '{@link tdt4250.studyprogramme.Criterion#filterCourses(org.eclipse.emf.common.util.EList) <em>Filter Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter Courses</em>' operation.
	 * @see tdt4250.studyprogramme.Criterion#filterCourses(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCriterion__FilterCourses__EList();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.CourseCriterion <em>Course Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Criterion</em>'.
	 * @see tdt4250.studyprogramme.CourseCriterion
	 * @generated
	 */
	EClass getCourseCriterion();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.studyprogramme.CourseCriterion#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see tdt4250.studyprogramme.CourseCriterion#getCourses()
	 * @see #getCourseCriterion()
	 * @generated
	 */
	EReference getCourseCriterion_Courses();

	/**
	 * Returns the meta object for the '{@link tdt4250.studyprogramme.CourseCriterion#filterCourses(org.eclipse.emf.common.util.EList) <em>Filter Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter Courses</em>' operation.
	 * @see tdt4250.studyprogramme.CourseCriterion#filterCourses(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCourseCriterion__FilterCourses__EList();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.CourseCombination <em>Course Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Combination</em>'.
	 * @see tdt4250.studyprogramme.CourseCombination
	 * @generated
	 */
	EClass getCourseCombination();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseCombination#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.studyprogramme.CourseCombination#getName()
	 * @see #getCourseCombination()
	 * @generated
	 */
	EAttribute getCourseCombination_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.CourseCombination#getCourseGroups <em>Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Groups</em>'.
	 * @see tdt4250.studyprogramme.CourseCombination#getCourseGroups()
	 * @see #getCourseCombination()
	 * @generated
	 */
	EReference getCourseCombination_CourseGroups();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.studyprogramme.CourseCombination#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialisation</em>'.
	 * @see tdt4250.studyprogramme.CourseCombination#getSpecialisation()
	 * @see #getCourseCombination()
	 * @generated
	 */
	EReference getCourseCombination_Specialisation();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.CourseCombination#getCourseCombinations <em>Course Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Combinations</em>'.
	 * @see tdt4250.studyprogramme.CourseCombination#getCourseCombinations()
	 * @see #getCourseCombination()
	 * @generated
	 */
	EReference getCourseCombination_CourseCombinations();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseCombination#getCreditsRequirement <em>Credits Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits Requirement</em>'.
	 * @see tdt4250.studyprogramme.CourseCombination#getCreditsRequirement()
	 * @see #getCourseCombination()
	 * @generated
	 */
	EAttribute getCourseCombination_CreditsRequirement();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseCombination#getFromTerm <em>From Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Term</em>'.
	 * @see tdt4250.studyprogramme.CourseCombination#getFromTerm()
	 * @see #getCourseCombination()
	 * @generated
	 */
	EAttribute getCourseCombination_FromTerm();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.CourseLevelCriterion <em>Course Level Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Level Criterion</em>'.
	 * @see tdt4250.studyprogramme.CourseLevelCriterion
	 * @generated
	 */
	EClass getCourseLevelCriterion();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.CourseLevelCriterion#getCourseLevel <em>Course Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Level</em>'.
	 * @see tdt4250.studyprogramme.CourseLevelCriterion#getCourseLevel()
	 * @see #getCourseLevelCriterion()
	 * @generated
	 */
	EAttribute getCourseLevelCriterion_CourseLevel();

	/**
	 * Returns the meta object for the '{@link tdt4250.studyprogramme.CourseLevelCriterion#filterCourses(org.eclipse.emf.common.util.EList) <em>Filter Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter Courses</em>' operation.
	 * @see tdt4250.studyprogramme.CourseLevelCriterion#filterCourses(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCourseLevelCriterion__FilterCourses__EList();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.AcademicYear <em>Academic Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Academic Year</em>'.
	 * @see tdt4250.studyprogramme.AcademicYear
	 * @generated
	 */
	EClass getAcademicYear();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.AcademicYear#getFromYear <em>From Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Year</em>'.
	 * @see tdt4250.studyprogramme.AcademicYear#getFromYear()
	 * @see #getAcademicYear()
	 * @generated
	 */
	EAttribute getAcademicYear_FromYear();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.AcademicYear#getFromSeason <em>From Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Season</em>'.
	 * @see tdt4250.studyprogramme.AcademicYear#getFromSeason()
	 * @see #getAcademicYear()
	 * @generated
	 */
	EAttribute getAcademicYear_FromSeason();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.studyprogramme.AcademicYear#getCourseCombinations <em>Course Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Combinations</em>'.
	 * @see tdt4250.studyprogramme.AcademicYear#getCourseCombinations()
	 * @see #getAcademicYear()
	 * @generated
	 */
	EReference getAcademicYear_CourseCombinations();

	/**
	 * Returns the meta object for class '{@link tdt4250.studyprogramme.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see tdt4250.studyprogramme.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.studyprogramme.Specialisation#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialisation</em>'.
	 * @see tdt4250.studyprogramme.Specialisation#getSpecialisation()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Specialisation();

	/**
	 * Returns the meta object for enum '{@link tdt4250.studyprogramme.CourseLevel <em>Course Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Level</em>'.
	 * @see tdt4250.studyprogramme.CourseLevel
	 * @generated
	 */
	EEnum getCourseLevel();

	/**
	 * Returns the meta object for enum '{@link tdt4250.studyprogramme.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Season</em>'.
	 * @see tdt4250.studyprogramme.Season
	 * @generated
	 */
	EEnum getSeason();

	/**
	 * Returns the meta object for enum '{@link tdt4250.studyprogramme.CourseStatus <em>Course Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Status</em>'.
	 * @see tdt4250.studyprogramme.CourseStatus
	 * @generated
	 */
	EEnum getCourseStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCode();

	/**
	 * Returns the meta object for data type '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Year</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getYear();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyprogrammeFactory getStudyprogrammeFactory();

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
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.UODImpl <em>UOD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.UODImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getUOD()
		 * @generated
		 */
		EClass UOD = eINSTANCE.getUOD();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOD__PROGRAMMES = eINSTANCE.getUOD_Programmes();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOD__COURSES = eINSTANCE.getUOD_Courses();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.CourseImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Criterion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSE_CRITERION = eINSTANCE.getCourse_CourseCriterion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.ProgrammeImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Academic Years</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__ACADEMIC_YEARS = eINSTANCE.getProgramme_AcademicYears();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__FULL_NAME = eINSTANCE.getProgramme_FullName();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__LENGTH = eINSTANCE.getProgramme_Length();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALISATIONS = eINSTANCE.getProgramme_Specialisations();

		/**
		 * The meta object literal for the '<em><b>Credits Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CREDITS_REQUIREMENT = eINSTANCE.getProgramme_CreditsRequirement();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.CourseGroupImpl <em>Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.CourseGroupImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseGroup()
		 * @generated
		 */
		EClass COURSE_GROUP = eINSTANCE.getCourseGroup();

		/**
		 * The meta object literal for the '<em><b>From Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__FROM_TERM = eINSTANCE.getCourseGroup_FromTerm();

		/**
		 * The meta object literal for the '<em><b>To Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__TO_TERM = eINSTANCE.getCourseGroup_ToTerm();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__CRITERIA = eINSTANCE.getCourseGroup_Criteria();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__STATUS = eINSTANCE.getCourseGroup_Status();

		/**
		 * The meta object literal for the '<em><b>Required Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__REQUIRED_CREDITS = eINSTANCE.getCourseGroup_RequiredCredits();

		/**
		 * The meta object literal for the '<em><b>Get Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE_GROUP___GET_COURSES = eINSTANCE.getCourseGroup__GetCourses();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.CriterionImpl <em>Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.CriterionImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCriterion()
		 * @generated
		 */
		EClass CRITERION = eINSTANCE.getCriterion();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERION__CRITERIA = eINSTANCE.getCriterion_Criteria();

		/**
		 * The meta object literal for the '<em><b>Filter Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRITERION___FILTER_COURSES__ELIST = eINSTANCE.getCriterion__FilterCourses__EList();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.CourseCriterionImpl <em>Course Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.CourseCriterionImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseCriterion()
		 * @generated
		 */
		EClass COURSE_CRITERION = eINSTANCE.getCourseCriterion();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_CRITERION__COURSES = eINSTANCE.getCourseCriterion_Courses();

		/**
		 * The meta object literal for the '<em><b>Filter Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE_CRITERION___FILTER_COURSES__ELIST = eINSTANCE.getCourseCriterion__FilterCourses__EList();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.CourseCombinationImpl <em>Course Combination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.CourseCombinationImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseCombination()
		 * @generated
		 */
		EClass COURSE_COMBINATION = eINSTANCE.getCourseCombination();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_COMBINATION__NAME = eINSTANCE.getCourseCombination_Name();

		/**
		 * The meta object literal for the '<em><b>Course Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_COMBINATION__COURSE_GROUPS = eINSTANCE.getCourseCombination_CourseGroups();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_COMBINATION__SPECIALISATION = eINSTANCE.getCourseCombination_Specialisation();

		/**
		 * The meta object literal for the '<em><b>Course Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_COMBINATION__COURSE_COMBINATIONS = eINSTANCE.getCourseCombination_CourseCombinations();

		/**
		 * The meta object literal for the '<em><b>Credits Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_COMBINATION__CREDITS_REQUIREMENT = eINSTANCE.getCourseCombination_CreditsRequirement();

		/**
		 * The meta object literal for the '<em><b>From Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_COMBINATION__FROM_TERM = eINSTANCE.getCourseCombination_FromTerm();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.CourseLevelCriterionImpl <em>Course Level Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.CourseLevelCriterionImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseLevelCriterion()
		 * @generated
		 */
		EClass COURSE_LEVEL_CRITERION = eINSTANCE.getCourseLevelCriterion();

		/**
		 * The meta object literal for the '<em><b>Course Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_LEVEL_CRITERION__COURSE_LEVEL = eINSTANCE.getCourseLevelCriterion_CourseLevel();

		/**
		 * The meta object literal for the '<em><b>Filter Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE_LEVEL_CRITERION___FILTER_COURSES__ELIST = eINSTANCE.getCourseLevelCriterion__FilterCourses__EList();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.AcademicYearImpl <em>Academic Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.AcademicYearImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getAcademicYear()
		 * @generated
		 */
		EClass ACADEMIC_YEAR = eINSTANCE.getAcademicYear();

		/**
		 * The meta object literal for the '<em><b>From Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_YEAR__FROM_YEAR = eINSTANCE.getAcademicYear_FromYear();

		/**
		 * The meta object literal for the '<em><b>From Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_YEAR__FROM_SEASON = eINSTANCE.getAcademicYear_FromSeason();

		/**
		 * The meta object literal for the '<em><b>Course Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMIC_YEAR__COURSE_COMBINATIONS = eINSTANCE.getAcademicYear_CourseCombinations();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.SpecialisationImpl
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__SPECIALISATION = eINSTANCE.getSpecialisation_Specialisation();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.CourseLevel <em>Course Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.CourseLevel
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseLevel()
		 * @generated
		 */
		EEnum COURSE_LEVEL = eINSTANCE.getCourseLevel();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.Season <em>Season</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.Season
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getSeason()
		 * @generated
		 */
		EEnum SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '{@link tdt4250.studyprogramme.CourseStatus <em>Course Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.CourseStatus
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCourseStatus()
		 * @generated
		 */
		EEnum COURSE_STATUS = eINSTANCE.getCourseStatus();

		/**
		 * The meta object literal for the '<em>Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getCode()
		 * @generated
		 */
		EDataType CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em>Year</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.studyprogramme.impl.StudyprogrammePackageImpl#getYear()
		 * @generated
		 */
		EDataType YEAR = eINSTANCE.getYear();

	}

} //StudyprogrammePackage
