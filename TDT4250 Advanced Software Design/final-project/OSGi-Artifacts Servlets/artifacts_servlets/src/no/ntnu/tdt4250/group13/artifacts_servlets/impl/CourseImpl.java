/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group13.artifacts_servlets.Course;
import no.ntnu.tdt4250.group13.artifacts_servlets.CourseTimetable;
import no.ntnu.tdt4250.group13.artifacts_servlets.Teacher;
import no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.CourseImpl#getCoursetimetable <em>Coursetimetable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected Teacher coordinator;

	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> lecturer;

	/**
	 * The cached value of the '{@link #getCoursetimetable() <em>Coursetimetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursetimetable()
	 * @generated
	 * @ordered
	 */
	protected CourseTimetable coursetimetable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teacher getCoordinator() {
		if (coordinator != null && coordinator.eIsProxy()) {
			InternalEObject oldCoordinator = (InternalEObject) coordinator;
			coordinator = (Teacher) eResolveProxy(oldCoordinator);
			if (coordinator != oldCoordinator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.COURSE__COORDINATOR,
							oldCoordinator, coordinator));
			}
		}
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetCoordinator() {
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinator(Teacher newCoordinator) {
		Teacher oldCoordinator = coordinator;
		coordinator = newCoordinator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.COURSE__COORDINATOR, oldCoordinator,
					coordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Teacher> getLecturer() {
		if (lecturer == null) {
			lecturer = new EObjectResolvingEList<Teacher>(Teacher.class, this, TimetablePackage.COURSE__LECTURER);
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseTimetable getCoursetimetable() {
		return coursetimetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoursetimetable(CourseTimetable newCoursetimetable, NotificationChain msgs) {
		CourseTimetable oldCoursetimetable = coursetimetable;
		coursetimetable = newCoursetimetable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TimetablePackage.COURSE__COURSETIMETABLE, oldCoursetimetable, newCoursetimetable);
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
	public void setCoursetimetable(CourseTimetable newCoursetimetable) {
		if (newCoursetimetable != coursetimetable) {
			NotificationChain msgs = null;
			if (coursetimetable != null)
				msgs = ((InternalEObject) coursetimetable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimetablePackage.COURSE__COURSETIMETABLE, null, msgs);
			if (newCoursetimetable != null)
				msgs = ((InternalEObject) newCoursetimetable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimetablePackage.COURSE__COURSETIMETABLE, null, msgs);
			msgs = basicSetCoursetimetable(newCoursetimetable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.COURSE__COURSETIMETABLE,
					newCoursetimetable, newCoursetimetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimetablePackage.COURSE__COURSETIMETABLE:
			return basicSetCoursetimetable(null, msgs);
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
		case TimetablePackage.COURSE__NAME:
			return getName();
		case TimetablePackage.COURSE__CODE:
			return getCode();
		case TimetablePackage.COURSE__COORDINATOR:
			if (resolve)
				return getCoordinator();
			return basicGetCoordinator();
		case TimetablePackage.COURSE__LECTURER:
			return getLecturer();
		case TimetablePackage.COURSE__COURSETIMETABLE:
			return getCoursetimetable();
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
		case TimetablePackage.COURSE__NAME:
			setName((String) newValue);
			return;
		case TimetablePackage.COURSE__CODE:
			setCode((String) newValue);
			return;
		case TimetablePackage.COURSE__COORDINATOR:
			setCoordinator((Teacher) newValue);
			return;
		case TimetablePackage.COURSE__LECTURER:
			getLecturer().clear();
			getLecturer().addAll((Collection<? extends Teacher>) newValue);
			return;
		case TimetablePackage.COURSE__COURSETIMETABLE:
			setCoursetimetable((CourseTimetable) newValue);
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
		case TimetablePackage.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TimetablePackage.COURSE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case TimetablePackage.COURSE__COORDINATOR:
			setCoordinator((Teacher) null);
			return;
		case TimetablePackage.COURSE__LECTURER:
			getLecturer().clear();
			return;
		case TimetablePackage.COURSE__COURSETIMETABLE:
			setCoursetimetable((CourseTimetable) null);
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
		case TimetablePackage.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TimetablePackage.COURSE__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case TimetablePackage.COURSE__COORDINATOR:
			return coordinator != null;
		case TimetablePackage.COURSE__LECTURER:
			return lecturer != null && !lecturer.isEmpty();
		case TimetablePackage.COURSE__COURSETIMETABLE:
			return coursetimetable != null;
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
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
