/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week;

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
 * An implementation of the model object '<em><b>Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.WeekImpl#getWeekNumber <em>Week Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.WeekImpl#getSlotRequirements <em>Slot Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeekImpl extends MinimalEObjectImpl.Container implements Week {
	/**
	 * The default value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int WEEK_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeekNumber() <em>Week Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekNumber()
	 * @generated
	 * @ordered
	 */
	protected int weekNumber = WEEK_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSlotRequirements() <em>Slot Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<SlotRequirement> slotRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingRequirementsPackage.Literals.WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeekNumber() {
		return weekNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeekNumber(int newWeekNumber) {
		int oldWeekNumber = weekNumber;
		weekNumber = newWeekNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.WEEK__WEEK_NUMBER,
					oldWeekNumber, weekNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SlotRequirement> getSlotRequirements() {
		if (slotRequirements == null) {
			slotRequirements = new EObjectContainmentEList<SlotRequirement>(SlotRequirement.class, this,
					SchedulingRequirementsPackage.WEEK__SLOT_REQUIREMENTS);
		}
		return slotRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchedulingRequirementsPackage.WEEK__SLOT_REQUIREMENTS:
			return ((InternalEList<?>) getSlotRequirements()).basicRemove(otherEnd, msgs);
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
		case SchedulingRequirementsPackage.WEEK__WEEK_NUMBER:
			return getWeekNumber();
		case SchedulingRequirementsPackage.WEEK__SLOT_REQUIREMENTS:
			return getSlotRequirements();
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
		case SchedulingRequirementsPackage.WEEK__WEEK_NUMBER:
			setWeekNumber((Integer) newValue);
			return;
		case SchedulingRequirementsPackage.WEEK__SLOT_REQUIREMENTS:
			getSlotRequirements().clear();
			getSlotRequirements().addAll((Collection<? extends SlotRequirement>) newValue);
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
		case SchedulingRequirementsPackage.WEEK__WEEK_NUMBER:
			setWeekNumber(WEEK_NUMBER_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.WEEK__SLOT_REQUIREMENTS:
			getSlotRequirements().clear();
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
		case SchedulingRequirementsPackage.WEEK__WEEK_NUMBER:
			return weekNumber != WEEK_NUMBER_EDEFAULT;
		case SchedulingRequirementsPackage.WEEK__SLOT_REQUIREMENTS:
			return slotRequirements != null && !slotRequirements.isEmpty();
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
		result.append(" (weekNumber: ");
		result.append(weekNumber);
		result.append(')');
		return result.toString();
	}

} //WeekImpl
