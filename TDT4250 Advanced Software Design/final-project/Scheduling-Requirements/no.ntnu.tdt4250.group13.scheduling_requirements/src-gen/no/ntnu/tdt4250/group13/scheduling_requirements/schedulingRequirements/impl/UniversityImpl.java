/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University;

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
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl#getCampi <em>Campi</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.UniversityImpl#getYear <em>Year</em>}</li>
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
	 * The cached value of the '{@link #getCampi() <em>Campi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampi()
	 * @generated
	 * @ordered
	 */
	protected EList<Campus> campi;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teachers;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

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
		return SchedulingRequirementsPackage.Literals.UNIVERSITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.UNIVERSITY__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Campus> getCampi() {
		if (campi == null) {
			campi = new EObjectContainmentEList<Campus>(Campus.class, this,
					SchedulingRequirementsPackage.UNIVERSITY__CAMPI);
		}
		return campi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.UNIVERSITY__COURSE, oldCourse, newCourse);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		if (newCourse != course) {
			NotificationChain msgs = null;
			if (course != null)
				msgs = ((InternalEObject) course).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SchedulingRequirementsPackage.UNIVERSITY__COURSE, null, msgs);
			if (newCourse != null)
				msgs = ((InternalEObject) newCourse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SchedulingRequirementsPackage.UNIVERSITY__COURSE, null, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.UNIVERSITY__COURSE,
					newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Teacher> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectContainmentEList<Teacher>(Teacher.class, this,
					SchedulingRequirementsPackage.UNIVERSITY__TEACHERS);
		}
		return teachers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.UNIVERSITY__YEAR,
					oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchedulingRequirementsPackage.UNIVERSITY__CAMPI:
			return ((InternalEList<?>) getCampi()).basicRemove(otherEnd, msgs);
		case SchedulingRequirementsPackage.UNIVERSITY__COURSE:
			return basicSetCourse(null, msgs);
		case SchedulingRequirementsPackage.UNIVERSITY__TEACHERS:
			return ((InternalEList<?>) getTeachers()).basicRemove(otherEnd, msgs);
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
		case SchedulingRequirementsPackage.UNIVERSITY__NAME:
			return getName();
		case SchedulingRequirementsPackage.UNIVERSITY__CAMPI:
			return getCampi();
		case SchedulingRequirementsPackage.UNIVERSITY__COURSE:
			return getCourse();
		case SchedulingRequirementsPackage.UNIVERSITY__TEACHERS:
			return getTeachers();
		case SchedulingRequirementsPackage.UNIVERSITY__YEAR:
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
		case SchedulingRequirementsPackage.UNIVERSITY__NAME:
			setName((String) newValue);
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__CAMPI:
			getCampi().clear();
			getCampi().addAll((Collection<? extends Campus>) newValue);
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__COURSE:
			setCourse((Course) newValue);
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__TEACHERS:
			getTeachers().clear();
			getTeachers().addAll((Collection<? extends Teacher>) newValue);
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__YEAR:
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
		case SchedulingRequirementsPackage.UNIVERSITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__CAMPI:
			getCampi().clear();
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__COURSE:
			setCourse((Course) null);
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__TEACHERS:
			getTeachers().clear();
			return;
		case SchedulingRequirementsPackage.UNIVERSITY__YEAR:
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
		case SchedulingRequirementsPackage.UNIVERSITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SchedulingRequirementsPackage.UNIVERSITY__CAMPI:
			return campi != null && !campi.isEmpty();
		case SchedulingRequirementsPackage.UNIVERSITY__COURSE:
			return course != null;
		case SchedulingRequirementsPackage.UNIVERSITY__TEACHERS:
			return teachers != null && !teachers.isEmpty();
		case SchedulingRequirementsPackage.UNIVERSITY__YEAR:
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
