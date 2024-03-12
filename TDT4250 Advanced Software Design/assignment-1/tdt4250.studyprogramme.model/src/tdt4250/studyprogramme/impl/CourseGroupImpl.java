/**
 */
package tdt4250.studyprogramme.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.studyprogramme.Course;
import tdt4250.studyprogramme.CourseGroup;
import tdt4250.studyprogramme.CourseStatus;
import tdt4250.studyprogramme.Criterion;
import tdt4250.studyprogramme.StudyprogrammePackage;
import tdt4250.studyprogramme.UOD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseGroupImpl#getFromTerm <em>From Term</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseGroupImpl#getToTerm <em>To Term</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseGroupImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseGroupImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseGroupImpl#getRequiredCredits <em>Required Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getFromTerm() <em>From Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTerm()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_TERM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFromTerm() <em>From Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTerm()
	 * @generated
	 * @ordered
	 */
	protected int fromTerm = FROM_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTerm() <em>To Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTerm()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_TERM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToTerm() <em>To Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTerm()
	 * @generated
	 * @ordered
	 */
	protected int toTerm = TO_TERM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criterion> criteria;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStatus STATUS_EDEFAULT = CourseStatus.MANDATORY;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CourseStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredCredits() <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUIRED_CREDITS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRequiredCredits() <em>Required Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCredits()
	 * @generated
	 * @ordered
	 */
	protected double requiredCredits = REQUIRED_CREDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFromTerm() {
		return fromTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromTerm(int newFromTerm) {
		int oldFromTerm = fromTerm;
		fromTerm = newFromTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_GROUP__FROM_TERM, oldFromTerm, fromTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getToTerm() {
		return toTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTerm(int newToTerm) {
		int oldToTerm = toTerm;
		toTerm = newToTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_GROUP__TO_TERM, oldToTerm, toTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Criterion> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectContainmentEList<Criterion>(Criterion.class, this, StudyprogrammePackage.COURSE_GROUP__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(CourseStatus newStatus) {
		CourseStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_GROUP__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRequiredCredits() {
		return requiredCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredCredits(double newRequiredCredits) {
		double oldRequiredCredits = requiredCredits;
		requiredCredits = newRequiredCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_GROUP__REQUIRED_CREDITS, oldRequiredCredits, requiredCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Course> getCourses() {
		EList<Course> courses = new BasicEList<Course>();
		for (Criterion criterion : this.getCriteria()) {
			UOD root = (UOD) EcoreUtil.getRootContainer(this);
			EList<Course> allCourses = new BasicEList<Course>(root.getCourses());
			courses.addAll(criterion.filterCourses(allCourses));
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.COURSE_GROUP__CRITERIA:
				return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
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
			case StudyprogrammePackage.COURSE_GROUP__FROM_TERM:
				return getFromTerm();
			case StudyprogrammePackage.COURSE_GROUP__TO_TERM:
				return getToTerm();
			case StudyprogrammePackage.COURSE_GROUP__CRITERIA:
				return getCriteria();
			case StudyprogrammePackage.COURSE_GROUP__STATUS:
				return getStatus();
			case StudyprogrammePackage.COURSE_GROUP__REQUIRED_CREDITS:
				return getRequiredCredits();
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
			case StudyprogrammePackage.COURSE_GROUP__FROM_TERM:
				setFromTerm((Integer)newValue);
				return;
			case StudyprogrammePackage.COURSE_GROUP__TO_TERM:
				setToTerm((Integer)newValue);
				return;
			case StudyprogrammePackage.COURSE_GROUP__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criterion>)newValue);
				return;
			case StudyprogrammePackage.COURSE_GROUP__STATUS:
				setStatus((CourseStatus)newValue);
				return;
			case StudyprogrammePackage.COURSE_GROUP__REQUIRED_CREDITS:
				setRequiredCredits((Double)newValue);
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
			case StudyprogrammePackage.COURSE_GROUP__FROM_TERM:
				setFromTerm(FROM_TERM_EDEFAULT);
				return;
			case StudyprogrammePackage.COURSE_GROUP__TO_TERM:
				setToTerm(TO_TERM_EDEFAULT);
				return;
			case StudyprogrammePackage.COURSE_GROUP__CRITERIA:
				getCriteria().clear();
				return;
			case StudyprogrammePackage.COURSE_GROUP__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StudyprogrammePackage.COURSE_GROUP__REQUIRED_CREDITS:
				setRequiredCredits(REQUIRED_CREDITS_EDEFAULT);
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
			case StudyprogrammePackage.COURSE_GROUP__FROM_TERM:
				return fromTerm != FROM_TERM_EDEFAULT;
			case StudyprogrammePackage.COURSE_GROUP__TO_TERM:
				return toTerm != TO_TERM_EDEFAULT;
			case StudyprogrammePackage.COURSE_GROUP__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case StudyprogrammePackage.COURSE_GROUP__STATUS:
				return status != STATUS_EDEFAULT;
			case StudyprogrammePackage.COURSE_GROUP__REQUIRED_CREDITS:
				return requiredCredits != REQUIRED_CREDITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StudyprogrammePackage.COURSE_GROUP___GET_COURSES:
				return getCourses();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (fromTerm: ");
		result.append(fromTerm);
		result.append(", toTerm: ");
		result.append(toTerm);
		result.append(", status: ");
		result.append(status);
		result.append(", requiredCredits: ");
		result.append(requiredCredits);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
