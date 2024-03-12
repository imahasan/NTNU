/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl#getSchedulingrequirements <em>Schedulingrequirements</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.CourseImpl#getCoordinator <em>Coordinator</em>}</li>
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
	 * The cached value of the '{@link #getSchedulingrequirements() <em>Schedulingrequirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingrequirements()
	 * @generated
	 * @ordered
	 */
	protected schedulingRequirements schedulingrequirements;

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
		return SchedulingRequirementsPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.COURSE__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.COURSE__CODE, oldCode,
					code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public schedulingRequirements getSchedulingrequirements() {
		return schedulingrequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulingrequirements(schedulingRequirements newSchedulingrequirements,
			NotificationChain msgs) {
		schedulingRequirements oldSchedulingrequirements = schedulingrequirements;
		schedulingrequirements = newSchedulingrequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS, oldSchedulingrequirements,
					newSchedulingrequirements);
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
	public void setSchedulingrequirements(schedulingRequirements newSchedulingrequirements) {
		if (newSchedulingrequirements != schedulingrequirements) {
			NotificationChain msgs = null;
			if (schedulingrequirements != null)
				msgs = ((InternalEObject) schedulingrequirements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS, null,
						msgs);
			if (newSchedulingrequirements != null)
				msgs = ((InternalEObject) newSchedulingrequirements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS, null,
						msgs);
			msgs = basicSetSchedulingrequirements(newSchedulingrequirements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS, newSchedulingrequirements,
					newSchedulingrequirements));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SchedulingRequirementsPackage.COURSE__COORDINATOR, oldCoordinator, coordinator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.COURSE__COORDINATOR,
					oldCoordinator, coordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS:
			return basicSetSchedulingrequirements(null, msgs);
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
		case SchedulingRequirementsPackage.COURSE__NAME:
			return getName();
		case SchedulingRequirementsPackage.COURSE__CODE:
			return getCode();
		case SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS:
			return getSchedulingrequirements();
		case SchedulingRequirementsPackage.COURSE__COORDINATOR:
			if (resolve)
				return getCoordinator();
			return basicGetCoordinator();
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
		case SchedulingRequirementsPackage.COURSE__NAME:
			setName((String) newValue);
			return;
		case SchedulingRequirementsPackage.COURSE__CODE:
			setCode((String) newValue);
			return;
		case SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS:
			setSchedulingrequirements((schedulingRequirements) newValue);
			return;
		case SchedulingRequirementsPackage.COURSE__COORDINATOR:
			setCoordinator((Teacher) newValue);
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
		case SchedulingRequirementsPackage.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.COURSE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS:
			setSchedulingrequirements((schedulingRequirements) null);
			return;
		case SchedulingRequirementsPackage.COURSE__COORDINATOR:
			setCoordinator((Teacher) null);
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
		case SchedulingRequirementsPackage.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SchedulingRequirementsPackage.COURSE__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case SchedulingRequirementsPackage.COURSE__SCHEDULINGREQUIREMENTS:
			return schedulingrequirements != null;
		case SchedulingRequirementsPackage.COURSE__COORDINATOR:
			return coordinator != null;
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
