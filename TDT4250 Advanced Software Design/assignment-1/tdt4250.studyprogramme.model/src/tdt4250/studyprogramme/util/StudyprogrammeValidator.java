/**
 */
package tdt4250.studyprogramme.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.studyprogramme.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.studyprogramme.StudyprogrammePackage
 * @generated
 */
public class StudyprogrammeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyprogrammeValidator INSTANCE = new StudyprogrammeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.studyprogramme";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogrammeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyprogrammePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyprogrammePackage.UOD:
				return validateUOD((UOD)value, diagnostics, context);
			case StudyprogrammePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyprogrammePackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case StudyprogrammePackage.ACADEMIC_YEAR:
				return validateAcademicYear((AcademicYear)value, diagnostics, context);
			case StudyprogrammePackage.COURSE_COMBINATION:
				return validateCourseCombination((CourseCombination)value, diagnostics, context);
			case StudyprogrammePackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case StudyprogrammePackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case StudyprogrammePackage.CRITERION:
				return validateCriterion((Criterion)value, diagnostics, context);
			case StudyprogrammePackage.COURSE_CRITERION:
				return validateCourseCriterion((CourseCriterion)value, diagnostics, context);
			case StudyprogrammePackage.COURSE_LEVEL_CRITERION:
				return validateCourseLevelCriterion((CourseLevelCriterion)value, diagnostics, context);
			case StudyprogrammePackage.COURSE_LEVEL:
				return validateCourseLevel((CourseLevel)value, diagnostics, context);
			case StudyprogrammePackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			case StudyprogrammePackage.COURSE_STATUS:
				return validateCourseStatus((CourseStatus)value, diagnostics, context);
			case StudyprogrammePackage.CODE:
				return validateCode((String)value, diagnostics, context);
			case StudyprogrammePackage.YEAR:
				return validateYear((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUOD(UOD uod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(uod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(uod, diagnostics, context);
		if (result || diagnostics != null) result &= validateUOD_programmesMustHaveUniqueCode(uod, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the programmesMustHaveUniqueCode constraint of '<em>UOD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UOD__PROGRAMMES_MUST_HAVE_UNIQUE_CODE__EEXPRESSION = "self.programmes->isUnique( p | p.code)";

	/**
	 * Validates the programmesMustHaveUniqueCode constraint of '<em>UOD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUOD_programmesMustHaveUniqueCode(UOD uod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyprogrammePackage.Literals.UOD,
				 uod,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "programmesMustHaveUniqueCode",
				 UOD__PROGRAMMES_MUST_HAVE_UNIQUE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseGroup_minimumOneCoursePresent(courseGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the minimumOneCoursePresent constraint of '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseGroup_minimumOneCoursePresent(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (courseGroup.getCourses().size() < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "minimumOneCoursePresent", getObjectLabel(courseGroup, context) },
						 new Object[] { courseGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCriterion(CourseCriterion courseCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCombination(CourseCombination courseCombination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseCombination, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseCombination, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseCombination_containsEitherCourseCombinationsOrCourseGroups(courseCombination, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the containsEitherCourseCombinationsOrCourseGroups constraint of '<em>Course Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE_COMBINATION__CONTAINS_EITHER_COURSE_COMBINATIONS_OR_COURSE_GROUPS__EEXPRESSION = "if self.courseGroups->size() > 0 and self.courseCombinations->size() > 0 then false else true endif";

	/**
	 * Validates the containsEitherCourseCombinationsOrCourseGroups constraint of '<em>Course Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCombination_containsEitherCourseCombinationsOrCourseGroups(CourseCombination courseCombination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyprogrammePackage.Literals.COURSE_COMBINATION,
				 courseCombination,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "containsEitherCourseCombinationsOrCourseGroups",
				 COURSE_COMBINATION__CONTAINS_EITHER_COURSE_COMBINATIONS_OR_COURSE_GROUPS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevelCriterion(CourseLevelCriterion courseLevelCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseLevelCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcademicYear(AcademicYear academicYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(academicYear, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(academicYear, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcademicYear_hasEnoughCredits(academicYear, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasEnoughCredits constraint of '<em>Academic Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAcademicYear_hasEnoughCredits(AcademicYear academicYear, DiagnosticChain diagnostics, Map<Object, Object> context) {	
		
		class CourseCombinationsHelper {
			public EList<CourseGroup> getCourseCombinations(CourseCombination courseCombination) {
				BasicEList<CourseGroup> courseGroups = new BasicEList<CourseGroup>();
				if (courseCombination.getCourseGroups().size() > 0) {
					courseGroups.addAll(courseCombination.getCourseGroups());
					return courseGroups;
				}
				for (CourseCombination courseComb : courseCombination.getCourseCombinations()) {
					courseGroups.addAll(this.getCourseCombinations(courseComb));
				}		
				return courseGroups;
			}
		}

		BasicEList<CourseGroup> courseGroups = new BasicEList<CourseGroup>();
		for (CourseCombination courseCombination : academicYear.getCourseCombinations()) {
			CourseCombinationsHelper combinationsHelper = new CourseCombinationsHelper();
			courseGroups.addAll(combinationsHelper.getCourseCombinations(courseCombination));
		}
		
		// Calculate the possible total credits for the course groups.
		float credits = 0.0f;
		
		for (CourseGroup courseGroup : courseGroups) {
			if (CourseStatus.MANDATORY.equals(courseGroup.getStatus())) {
				// All mandatory course credits are accounted.
				for (Course course : courseGroup.getCourses()) {
					credits += course.getCredits();
				}
			} else if (CourseStatus.ELECTIVE.equals(courseGroup.getStatus())) {
				// The highest course credit is accounted.				
				float highestCredit = 0.0f;
				for (Course course : courseGroup.getCourses()) {
					if (course.getCredits() > highestCredit) {
						highestCredit = course.getCredits(); 
					}
				}
				credits += highestCredit;
			}
		}


		Programme programme = (Programme) academicYear.eContainer();
		if (credits < programme.getCreditsRequirement()) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasEnoughCredits", getObjectLabel(academicYear, context) },
						 new Object[] { academicYear },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStatus(CourseStatus courseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(String code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(int year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyprogrammeValidator
