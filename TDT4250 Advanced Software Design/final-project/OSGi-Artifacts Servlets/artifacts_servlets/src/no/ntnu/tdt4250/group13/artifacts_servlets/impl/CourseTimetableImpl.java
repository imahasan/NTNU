/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group13.artifacts_servlets.CourseTimetable;
import no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage;
import no.ntnu.tdt4250.group13.artifacts_servlets.Week;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseTimetableImpl#getWeek <em>Week</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseTimetableImpl extends MinimalEObjectImpl.Container implements CourseTimetable {
	/**
	 * The cached value of the '{@link #getWeek() <em>Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeek()
	 * @generated
	 * @ordered
	 */
	protected EList<Week> week;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseTimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.COURSE_TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Week> getWeek() {
		if (week == null) {
			week = new EObjectContainmentEList<Week>(Week.class, this, TimetablePackage.COURSE_TIMETABLE__WEEK);
		}
		return week;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimetablePackage.COURSE_TIMETABLE__WEEK:
			return ((InternalEList<?>) getWeek()).basicRemove(otherEnd, msgs);
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
		case TimetablePackage.COURSE_TIMETABLE__WEEK:
			return getWeek();
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
		case TimetablePackage.COURSE_TIMETABLE__WEEK:
			getWeek().clear();
			getWeek().addAll((Collection<? extends Week>) newValue);
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
		case TimetablePackage.COURSE_TIMETABLE__WEEK:
			getWeek().clear();
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
		case TimetablePackage.COURSE_TIMETABLE__WEEK:
			return week != null && !week.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CourseTimetableImpl
