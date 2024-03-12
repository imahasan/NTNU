/**
 */
package tdt4250.studyprogramme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.studyprogramme.StudyprogrammePackage#getCourseLevel()
 * @model
 * @generated
 */
public enum CourseLevel implements Enumerator {
	/**
	 * The '<em><b>Basic Courses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_COURSES_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_COURSES(0, "basicCourses", "basicCourses"),

	/**
	 * The '<em><b>Advanced Courses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCED_COURSES_VALUE
	 * @generated
	 * @ordered
	 */
	ADVANCED_COURSES(1, "advancedCourses", "advancedCourses"),

	/**
	 * The '<em><b>Postgraduate Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRADUATE_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRADUATE_LEVEL(2, "postgraduateLevel", "postgraduateLevel"),

	/**
	 * The '<em><b>Doctoral Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTORAL_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTORAL_LEVEL(3, "doctoralLevel", "doctoralLevel");

	/**
	 * The '<em><b>Basic Courses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_COURSES
	 * @model name="basicCourses"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_COURSES_VALUE = 0;

	/**
	 * The '<em><b>Advanced Courses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCED_COURSES
	 * @model name="advancedCourses"
	 * @generated
	 * @ordered
	 */
	public static final int ADVANCED_COURSES_VALUE = 1;

	/**
	 * The '<em><b>Postgraduate Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRADUATE_LEVEL
	 * @model name="postgraduateLevel"
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRADUATE_LEVEL_VALUE = 2;

	/**
	 * The '<em><b>Doctoral Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTORAL_LEVEL
	 * @model name="doctoralLevel"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTORAL_LEVEL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseLevel[] VALUES_ARRAY =
		new CourseLevel[] {
			BASIC_COURSES,
			ADVANCED_COURSES,
			POSTGRADUATE_LEVEL,
			DOCTORAL_LEVEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(int value) {
		switch (value) {
			case BASIC_COURSES_VALUE: return BASIC_COURSES;
			case ADVANCED_COURSES_VALUE: return ADVANCED_COURSES;
			case POSTGRADUATE_LEVEL_VALUE: return POSTGRADUATE_LEVEL;
			case DOCTORAL_LEVEL_VALUE: return DOCTORAL_LEVEL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CourseLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CourseLevel
