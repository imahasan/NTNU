/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets.impl;

import java.util.Collection;
import no.ntnu.tdt4250.group13.artifacts_servlets.Campus;
import no.ntnu.tdt4250.group13.artifacts_servlets.Course;
import no.ntnu.tdt4250.group13.artifacts_servlets.Teacher;
import no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage;
import no.ntnu.tdt4250.group13.artifacts_servlets.University;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl#getCampus <em>Campus</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.UniversityImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCampus() <em>Campus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampus()
	 * @generated
	 * @ordered
	 */
	protected EList<Campus> campus;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teacher;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 2024;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.UNIVERSITY;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.UNIVERSITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Campus> getCampus() {
		if (campus == null) {
			campus = new EObjectContainmentEList<Campus>(Campus.class, this, TimetablePackage.UNIVERSITY__CAMPUS);
		}
		return campus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this, TimetablePackage.UNIVERSITY__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Teacher> getTeacher() {
		if (teacher == null) {
			teacher = new EObjectContainmentEList<Teacher>(Teacher.class, this, TimetablePackage.UNIVERSITY__TEACHER);
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.UNIVERSITY__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimetablePackage.UNIVERSITY__CAMPUS:
			return ((InternalEList<?>) getCampus()).basicRemove(otherEnd, msgs);
		case TimetablePackage.UNIVERSITY__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
		case TimetablePackage.UNIVERSITY__TEACHER:
			return ((InternalEList<?>) getTeacher()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimetablePackage.UNIVERSITY__NAME:
			return getName();
		case TimetablePackage.UNIVERSITY__CAMPUS:
			return getCampus();
		case TimetablePackage.UNIVERSITY__COURSE:
			return getCourse();
		case TimetablePackage.UNIVERSITY__TEACHER:
			return getTeacher();
		case TimetablePackage.UNIVERSITY__YEAR:
			return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimetablePackage.UNIVERSITY__NAME:
			setName((String) newValue);
			return;
		case TimetablePackage.UNIVERSITY__CAMPUS:
			getCampus().clear();
			getCampus().addAll((Collection<? extends Campus>) newValue);
			return;
		case TimetablePackage.UNIVERSITY__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case TimetablePackage.UNIVERSITY__TEACHER:
			getTeacher().clear();
			getTeacher().addAll((Collection<? extends Teacher>) newValue);
			return;
		case TimetablePackage.UNIVERSITY__YEAR:
			setYear((Integer) newValue);
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
		case TimetablePackage.UNIVERSITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TimetablePackage.UNIVERSITY__CAMPUS:
			getCampus().clear();
			return;
		case TimetablePackage.UNIVERSITY__COURSE:
			getCourse().clear();
			return;
		case TimetablePackage.UNIVERSITY__TEACHER:
			getTeacher().clear();
			return;
		case TimetablePackage.UNIVERSITY__YEAR:
			setYear(YEAR_EDEFAULT);
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
		case TimetablePackage.UNIVERSITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TimetablePackage.UNIVERSITY__CAMPUS:
			return campus != null && !campus.isEmpty();
		case TimetablePackage.UNIVERSITY__COURSE:
			return course != null && !course.isEmpty();
		case TimetablePackage.UNIVERSITY__TEACHER:
			return teacher != null && !teacher.isEmpty();
		case TimetablePackage.UNIVERSITY__YEAR:
			return year != YEAR_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //UniversityImpl
