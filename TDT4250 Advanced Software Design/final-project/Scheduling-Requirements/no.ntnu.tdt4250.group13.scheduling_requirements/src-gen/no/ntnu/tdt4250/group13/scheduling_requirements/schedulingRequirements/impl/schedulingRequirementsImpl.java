/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import java.util.Collection;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements;

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
 * An implementation of the model object '<em><b>scheduling Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.schedulingRequirementsImpl#getWeeks <em>Weeks</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.schedulingRequirementsImpl#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class schedulingRequirementsImpl extends MinimalEObjectImpl.Container implements schedulingRequirements {
	/**
	 * The cached value of the '{@link #getWeeks() <em>Weeks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeks()
	 * @generated
	 * @ordered
	 */
	protected EList<Week> weeks;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Teacher sender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected schedulingRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingRequirementsPackage.Literals.SCHEDULING_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teacher getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject) sender;
			sender = (Teacher) eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSender(Teacher newSender) {
		Teacher oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Week> getWeeks() {
		if (weeks == null) {
			weeks = new EObjectContainmentEList<Week>(Week.class, this,
					SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__WEEKS);
		}
		return weeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__WEEKS:
			return ((InternalEList<?>) getWeeks()).basicRemove(otherEnd, msgs);
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
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__WEEKS:
			return getWeeks();
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__SENDER:
			if (resolve)
				return getSender();
			return basicGetSender();
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
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__WEEKS:
			getWeeks().clear();
			getWeeks().addAll((Collection<? extends Week>) newValue);
			return;
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__SENDER:
			setSender((Teacher) newValue);
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
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__WEEKS:
			getWeeks().clear();
			return;
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__SENDER:
			setSender((Teacher) null);
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
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__WEEKS:
			return weeks != null && !weeks.isEmpty();
		case SchedulingRequirementsPackage.SCHEDULING_REQUIREMENTS__SENDER:
			return sender != null;
		}
		return super.eIsSet(featureID);
	}

} //schedulingRequirementsImpl
