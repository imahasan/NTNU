/**
 */
package tdt4250.studyprogramme.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tdt4250.studyprogramme.Course;
import tdt4250.studyprogramme.CourseLevel;
import tdt4250.studyprogramme.CourseLevelCriterion;
import tdt4250.studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Level Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseLevelCriterionImpl#getCourseLevel <em>Course Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseLevelCriterionImpl extends CriterionImpl implements CourseLevelCriterion {
	/**
	 * The default value of the '{@link #getCourseLevel() <em>Course Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CourseLevel COURSE_LEVEL_EDEFAULT = CourseLevel.BASIC_COURSES;
	/**
	 * The cached value of the '{@link #getCourseLevel() <em>Course Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseLevel()
	 * @generated
	 * @ordered
	 */
	protected CourseLevel courseLevel = COURSE_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseLevelCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.COURSE_LEVEL_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseLevel getCourseLevel() {
		return courseLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseLevel(CourseLevel newCourseLevel) {
		CourseLevel oldCourseLevel = courseLevel;
		courseLevel = newCourseLevel == null ? COURSE_LEVEL_EDEFAULT : newCourseLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_LEVEL_CRITERION__COURSE_LEVEL, oldCourseLevel, courseLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogrammePackage.COURSE_LEVEL_CRITERION__COURSE_LEVEL:
				return getCourseLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogrammePackage.COURSE_LEVEL_CRITERION__COURSE_LEVEL:
				setCourseLevel((CourseLevel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogrammePackage.COURSE_LEVEL_CRITERION__COURSE_LEVEL:
				setCourseLevel(COURSE_LEVEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogrammePackage.COURSE_LEVEL_CRITERION__COURSE_LEVEL:
				return courseLevel != COURSE_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (courseLevel: ");
		result.append(courseLevel);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<Course> filterCourses(EList<Course> courses) {
		List<Course> deleteList = new ArrayList<Course>();
		for (Course course : courses) {
			if (course.getLevel() != this.getCourseLevel()) {					
				deleteList.add(course);
			}
		}
		courses.removeAll(deleteList);
		// Filter sub nodes
		return super.filterCourses(courses);
	}
	
} //CourseLevelCriterionImpl
