/**
 */
package tdt4250.studyprogramme.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tdt4250.studyprogramme.AcademicYear;
import tdt4250.studyprogramme.Course;
import tdt4250.studyprogramme.CourseCombination;
import tdt4250.studyprogramme.CourseCriterion;
import tdt4250.studyprogramme.CourseGroup;
import tdt4250.studyprogramme.CourseLevel;
import tdt4250.studyprogramme.CourseLevelCriterion;
import tdt4250.studyprogramme.CourseStatus;
import tdt4250.studyprogramme.Criterion;
import tdt4250.studyprogramme.Programme;
import tdt4250.studyprogramme.Season;
import tdt4250.studyprogramme.Specialisation;
import tdt4250.studyprogramme.StudyprogrammeFactory;
import tdt4250.studyprogramme.StudyprogrammePackage;
import tdt4250.studyprogramme.util.StudyprogrammeValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogrammePackageImpl extends EPackageImpl implements StudyprogrammePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uodEClass = null;

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
	private EClass programmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseLevelCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass academicYearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yearEDataType = null;

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
	 * @see tdt4250.studyprogramme.StudyprogrammePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StudyprogrammePackageImpl() {
		super(eNS_URI, StudyprogrammeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StudyprogrammePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StudyprogrammePackage init() {
		if (isInited) return (StudyprogrammePackage)EPackage.Registry.INSTANCE.getEPackage(StudyprogrammePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStudyprogrammePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StudyprogrammePackageImpl theStudyprogrammePackage = registeredStudyprogrammePackage instanceof StudyprogrammePackageImpl ? (StudyprogrammePackageImpl)registeredStudyprogrammePackage : new StudyprogrammePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStudyprogrammePackage.createPackageContents();

		// Initialize created meta-data
		theStudyprogrammePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStudyprogrammePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return StudyprogrammeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStudyprogrammePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StudyprogrammePackage.eNS_URI, theStudyprogrammePackage);
		return theStudyprogrammePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUOD() {
		return uodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUOD_Programmes() {
		return (EReference)uodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUOD_Courses() {
		return (EReference)uodEClass.getEStructuralFeatures().get(1);
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
	public EReference getCourse_CourseCriterion() {
		return (EReference)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Level() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramme() {
		return programmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Name() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_AcademicYears() {
		return (EReference)programmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Code() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_FullName() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Length() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_Specialisations() {
		return (EReference)programmeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_CreditsRequirement() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseGroup() {
		return courseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseGroup_FromTerm() {
		return (EAttribute)courseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseGroup_ToTerm() {
		return (EAttribute)courseGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseGroup_Criteria() {
		return (EReference)courseGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseGroup_Status() {
		return (EAttribute)courseGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseGroup_RequiredCredits() {
		return (EAttribute)courseGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCourseGroup__GetCourses() {
		return courseGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriterion() {
		return criterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCriterion_Criteria() {
		return (EReference)criterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCriterion__FilterCourses__EList() {
		return criterionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseCriterion() {
		return courseCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseCriterion_Courses() {
		return (EReference)courseCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCourseCriterion__FilterCourses__EList() {
		return courseCriterionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseCombination() {
		return courseCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseCombination_Name() {
		return (EAttribute)courseCombinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseCombination_CourseGroups() {
		return (EReference)courseCombinationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseCombination_Specialisation() {
		return (EReference)courseCombinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseCombination_CourseCombinations() {
		return (EReference)courseCombinationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseCombination_CreditsRequirement() {
		return (EAttribute)courseCombinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseCombination_FromTerm() {
		return (EAttribute)courseCombinationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseLevelCriterion() {
		return courseLevelCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseLevelCriterion_CourseLevel() {
		return (EAttribute)courseLevelCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCourseLevelCriterion__FilterCourses__EList() {
		return courseLevelCriterionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcademicYear() {
		return academicYearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcademicYear_FromYear() {
		return (EAttribute)academicYearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcademicYear_FromSeason() {
		return (EAttribute)academicYearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcademicYear_CourseCombinations() {
		return (EReference)academicYearEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialisation() {
		return specialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialisation_Specialisation() {
		return (EAttribute)specialisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCourseLevel() {
		return courseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeason() {
		return seasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCourseStatus() {
		return courseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCode() {
		return codeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getYear() {
		return yearEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyprogrammeFactory getStudyprogrammeFactory() {
		return (StudyprogrammeFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uodEClass = createEClass(UOD);
		createEReference(uodEClass, UOD__PROGRAMMES);
		createEReference(uodEClass, UOD__COURSES);

		courseEClass = createEClass(COURSE);
		createEReference(courseEClass, COURSE__COURSE_CRITERION);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEAttribute(courseEClass, COURSE__LEVEL);
		createEAttribute(courseEClass, COURSE__CODE);

		programmeEClass = createEClass(PROGRAMME);
		createEAttribute(programmeEClass, PROGRAMME__NAME);
		createEAttribute(programmeEClass, PROGRAMME__CODE);
		createEAttribute(programmeEClass, PROGRAMME__FULL_NAME);
		createEReference(programmeEClass, PROGRAMME__ACADEMIC_YEARS);
		createEAttribute(programmeEClass, PROGRAMME__LENGTH);
		createEReference(programmeEClass, PROGRAMME__SPECIALISATIONS);
		createEAttribute(programmeEClass, PROGRAMME__CREDITS_REQUIREMENT);

		academicYearEClass = createEClass(ACADEMIC_YEAR);
		createEAttribute(academicYearEClass, ACADEMIC_YEAR__FROM_YEAR);
		createEAttribute(academicYearEClass, ACADEMIC_YEAR__FROM_SEASON);
		createEReference(academicYearEClass, ACADEMIC_YEAR__COURSE_COMBINATIONS);

		courseCombinationEClass = createEClass(COURSE_COMBINATION);
		createEAttribute(courseCombinationEClass, COURSE_COMBINATION__NAME);
		createEReference(courseCombinationEClass, COURSE_COMBINATION__SPECIALISATION);
		createEAttribute(courseCombinationEClass, COURSE_COMBINATION__CREDITS_REQUIREMENT);
		createEAttribute(courseCombinationEClass, COURSE_COMBINATION__FROM_TERM);
		createEReference(courseCombinationEClass, COURSE_COMBINATION__COURSE_COMBINATIONS);
		createEReference(courseCombinationEClass, COURSE_COMBINATION__COURSE_GROUPS);

		specialisationEClass = createEClass(SPECIALISATION);
		createEAttribute(specialisationEClass, SPECIALISATION__SPECIALISATION);

		courseGroupEClass = createEClass(COURSE_GROUP);
		createEAttribute(courseGroupEClass, COURSE_GROUP__FROM_TERM);
		createEAttribute(courseGroupEClass, COURSE_GROUP__TO_TERM);
		createEReference(courseGroupEClass, COURSE_GROUP__CRITERIA);
		createEAttribute(courseGroupEClass, COURSE_GROUP__STATUS);
		createEAttribute(courseGroupEClass, COURSE_GROUP__REQUIRED_CREDITS);
		createEOperation(courseGroupEClass, COURSE_GROUP___GET_COURSES);

		criterionEClass = createEClass(CRITERION);
		createEReference(criterionEClass, CRITERION__CRITERIA);
		createEOperation(criterionEClass, CRITERION___FILTER_COURSES__ELIST);

		courseCriterionEClass = createEClass(COURSE_CRITERION);
		createEReference(courseCriterionEClass, COURSE_CRITERION__COURSES);
		createEOperation(courseCriterionEClass, COURSE_CRITERION___FILTER_COURSES__ELIST);

		courseLevelCriterionEClass = createEClass(COURSE_LEVEL_CRITERION);
		createEAttribute(courseLevelCriterionEClass, COURSE_LEVEL_CRITERION__COURSE_LEVEL);
		createEOperation(courseLevelCriterionEClass, COURSE_LEVEL_CRITERION___FILTER_COURSES__ELIST);

		// Create enums
		courseLevelEEnum = createEEnum(COURSE_LEVEL);
		seasonEEnum = createEEnum(SEASON);
		courseStatusEEnum = createEEnum(COURSE_STATUS);

		// Create data types
		codeEDataType = createEDataType(CODE);
		yearEDataType = createEDataType(YEAR);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		courseCriterionEClass.getESuperTypes().add(this.getCriterion());
		courseLevelCriterionEClass.getESuperTypes().add(this.getCriterion());

		// Initialize classes, features, and operations; add parameters
		initEClass(uodEClass, tdt4250.studyprogramme.UOD.class, "UOD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUOD_Programmes(), this.getProgramme(), null, "programmes", null, 0, -1, tdt4250.studyprogramme.UOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUOD_Courses(), this.getCourse(), null, "courses", null, 0, -1, tdt4250.studyprogramme.UOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourse_CourseCriterion(), this.getCourseCriterion(), this.getCourseCriterion_Courses(), "courseCriterion", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), ecorePackage.getEFloat(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Level(), this.getCourseLevel(), "level", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Code(), this.getCode(), "code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeEClass, Programme.class, "Programme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramme_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_Code(), this.getCode(), "code", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Programme.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_AcademicYears(), this.getAcademicYear(), null, "academicYears", null, 0, -1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Specialisations(), this.getSpecialisation(), null, "specialisations", null, 0, -1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_CreditsRequirement(), ecorePackage.getEDouble(), "creditsRequirement", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(academicYearEClass, AcademicYear.class, "AcademicYear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcademicYear_FromYear(), this.getYear(), "fromYear", null, 0, 1, AcademicYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcademicYear_FromSeason(), this.getSeason(), "fromSeason", null, 0, 1, AcademicYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcademicYear_CourseCombinations(), this.getCourseCombination(), null, "courseCombinations", null, 0, -1, AcademicYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseCombinationEClass, CourseCombination.class, "CourseCombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseCombination_Name(), ecorePackage.getEString(), "name", null, 0, 1, CourseCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseCombination_Specialisation(), this.getSpecialisation(), null, "specialisation", null, 0, 1, CourseCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseCombination_CreditsRequirement(), ecorePackage.getEDouble(), "creditsRequirement", null, 0, 1, CourseCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseCombination_FromTerm(), ecorePackage.getEInt(), "fromTerm", null, 0, 1, CourseCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseCombination_CourseCombinations(), this.getCourseCombination(), null, "courseCombinations", null, 0, -1, CourseCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseCombination_CourseGroups(), this.getCourseGroup(), null, "courseGroups", null, 0, -1, CourseCombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialisationEClass, Specialisation.class, "Specialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialisation_Specialisation(), ecorePackage.getEString(), "specialisation", null, 0, 1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseGroupEClass, CourseGroup.class, "CourseGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseGroup_FromTerm(), ecorePackage.getEInt(), "fromTerm", null, 0, 1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseGroup_ToTerm(), ecorePackage.getEInt(), "toTerm", null, 0, 1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseGroup_Criteria(), this.getCriterion(), null, "criteria", null, 0, -1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseGroup_Status(), this.getCourseStatus(), "status", null, 0, 1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseGroup_RequiredCredits(), ecorePackage.getEDouble(), "requiredCredits", null, 0, 1, CourseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCourseGroup__GetCourses(), this.getCourse(), "getCourses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(criterionEClass, Criterion.class, "Criterion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCriterion_Criteria(), this.getCriterion(), null, "criteria", null, 0, -1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCriterion__FilterCourses__EList(), this.getCourse(), "filterCourses", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCourse(), "courses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(courseCriterionEClass, CourseCriterion.class, "CourseCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseCriterion_Courses(), this.getCourse(), this.getCourse_CourseCriterion(), "courses", null, 0, -1, CourseCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCourseCriterion__FilterCourses__EList(), this.getCourse(), "filterCourses", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCourse(), "courses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(courseLevelCriterionEClass, CourseLevelCriterion.class, "CourseLevelCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseLevelCriterion_CourseLevel(), this.getCourseLevel(), "courseLevel", null, 0, 1, CourseLevelCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCourseLevelCriterion__FilterCourses__EList(), this.getCourse(), "filterCourses", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCourse(), "courses", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(courseLevelEEnum, CourseLevel.class, "CourseLevel");
		addEEnumLiteral(courseLevelEEnum, CourseLevel.BASIC_COURSES);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.ADVANCED_COURSES);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.POSTGRADUATE_LEVEL);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.DOCTORAL_LEVEL);

		initEEnum(seasonEEnum, Season.class, "Season");
		addEEnumLiteral(seasonEEnum, Season.SPRING);
		addEEnumLiteral(seasonEEnum, Season.AUTUMN);

		initEEnum(courseStatusEEnum, CourseStatus.class, "CourseStatus");
		addEEnumLiteral(courseStatusEEnum, CourseStatus.MANDATORY);
		addEEnumLiteral(courseStatusEEnum, CourseStatus.ELECTIVE);

		// Initialize data types
		initEDataType(codeEDataType, String.class, "Code", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yearEDataType, int.class, "Year", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (uodEClass,
		   source,
		   new String[] {
			   "constraints", "programmesMustHaveUniqueCode"
		   });
		addAnnotation
		  (academicYearEClass,
		   source,
		   new String[] {
			   "constraints", "hasEnoughCredits"
		   });
		addAnnotation
		  (courseCombinationEClass,
		   source,
		   new String[] {
			   "constraints", "containsEitherCourseCombinationsOrCourseGroups"
		   });
		addAnnotation
		  (courseGroupEClass,
		   source,
		   new String[] {
			   "constraints", "minimumOneCoursePresent"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (uodEClass,
		   source,
		   new String[] {
			   "programmesMustHaveUniqueCode", "self.programmes->isUnique( p | p.code)"
		   });
		addAnnotation
		  (courseCombinationEClass,
		   source,
		   new String[] {
			   "containsEitherCourseCombinationsOrCourseGroups", "if self.courseGroups->size() > 0 and self.courseCombinations->size() > 0 then false else true endif"
		   });
	}

} //StudyprogrammePackageImpl
