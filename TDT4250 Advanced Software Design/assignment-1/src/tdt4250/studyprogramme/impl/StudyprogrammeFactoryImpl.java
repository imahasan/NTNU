/**
 */
package tdt4250.studyprogramme.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.studyprogramme.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogrammeFactoryImpl extends EFactoryImpl implements StudyprogrammeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyprogrammeFactory init() {
		try {
			StudyprogrammeFactory theStudyprogrammeFactory = (StudyprogrammeFactory)EPackage.Registry.INSTANCE.getEFactory(StudyprogrammePackage.eNS_URI);
			if (theStudyprogrammeFactory != null) {
				return theStudyprogrammeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyprogrammeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogrammeFactoryImpl() {
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
			case StudyprogrammePackage.UOD: return createUOD();
			case StudyprogrammePackage.COURSE: return createCourse();
			case StudyprogrammePackage.PROGRAMME: return createProgramme();
			case StudyprogrammePackage.ACADEMIC_YEAR: return createAcademicYear();
			case StudyprogrammePackage.COURSE_COMBINATION: return createCourseCombination();
			case StudyprogrammePackage.SPECIALISATION: return createSpecialisation();
			case StudyprogrammePackage.COURSE_GROUP: return createCourseGroup();
			case StudyprogrammePackage.COURSE_CRITERION: return createCourseCriterion();
			case StudyprogrammePackage.COURSE_LEVEL_CRITERION: return createCourseLevelCriterion();
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
			case StudyprogrammePackage.COURSE_LEVEL:
				return createCourseLevelFromString(eDataType, initialValue);
			case StudyprogrammePackage.SEASON:
				return createSeasonFromString(eDataType, initialValue);
			case StudyprogrammePackage.COURSE_STATUS:
				return createCourseStatusFromString(eDataType, initialValue);
			case StudyprogrammePackage.CODE:
				return createCodeFromString(eDataType, initialValue);
			case StudyprogrammePackage.YEAR:
				return createYearFromString(eDataType, initialValue);
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
			case StudyprogrammePackage.COURSE_LEVEL:
				return convertCourseLevelToString(eDataType, instanceValue);
			case StudyprogrammePackage.SEASON:
				return convertSeasonToString(eDataType, instanceValue);
			case StudyprogrammePackage.COURSE_STATUS:
				return convertCourseStatusToString(eDataType, instanceValue);
			case StudyprogrammePackage.CODE:
				return convertCodeToString(eDataType, instanceValue);
			case StudyprogrammePackage.YEAR:
				return convertYearToString(eDataType, instanceValue);
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
	public UOD createUOD() {
		UODImpl uod = new UODImpl();
		return uod;
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
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup createCourseGroup() {
		CourseGroupImpl courseGroup = new CourseGroupImpl();
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseCriterion createCourseCriterion() {
		CourseCriterionImpl courseCriterion = new CourseCriterionImpl();
		return courseCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseCombination createCourseCombination() {
		CourseCombinationImpl courseCombination = new CourseCombinationImpl();
		return courseCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseLevelCriterion createCourseLevelCriterion() {
		CourseLevelCriterionImpl courseLevelCriterion = new CourseLevelCriterionImpl();
		return courseLevelCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcademicYear createAcademicYear() {
		AcademicYearImpl academicYear = new AcademicYearImpl();
		return academicYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation createSpecialisation() {
		SpecialisationImpl specialisation = new SpecialisationImpl();
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseLevel createCourseLevelFromString(EDataType eDataType, String initialValue) {
		CourseLevel result = CourseLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season createSeasonFromString(EDataType eDataType, String initialValue) {
		Season result = Season.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseStatus createCourseStatusFromString(EDataType eDataType, String initialValue) {
		CourseStatus result = CourseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String createCodeFromString(EDataType eDataType, String initialValue) {
		if (! initialValue.matches("[A-Z]+[0-9]*")) {
			throw new IllegalArgumentException("Code must have the format [A-Z]+[1-9]+");
		}
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer createYearFromString(EDataType eDataType, String initialValue) {
		if (! initialValue.matches("[0-9]+")) {
			throw new IllegalArgumentException("Code must have the format [A-Z]+[1-9]+");
		}
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYearToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyprogrammePackage getStudyprogrammePackage() {
		return (StudyprogrammePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyprogrammePackage getPackage() {
		return StudyprogrammePackage.eINSTANCE;
	}

} //StudyprogrammeFactoryImpl
