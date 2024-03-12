/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl#getRequiredPersonal <em>Required Personal</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl#getRequiredRoom <em>Required Room</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl#getExpectedStudents <em>Expected Students</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SlotRequirementImpl#getRequiredSameDaySlots <em>Required Same Day Slots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotRequirementImpl extends MinimalEObjectImpl.Container implements SlotRequirement {
	/**
	 * The cached value of the '{@link #getRequiredPersonal() <em>Required Personal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPersonal()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> requiredPersonal;

	/**
	 * The cached value of the '{@link #getRequiredRoom() <em>Required Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoom()
	 * @generated
	 * @ordered
	 */
	protected Room requiredRoom;

	/**
	 * The default value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType ACTIVITY_TYPE_EDEFAULT = ActivityType.LECTURE;

	/**
	 * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected ActivityType activityType = ACTIVITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedStudents() <em>Expected Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedStudents()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPECTED_STUDENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpectedStudents() <em>Expected Students</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedStudents()
	 * @generated
	 * @ordered
	 */
	protected int expectedStudents = EXPECTED_STUDENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredSameDaySlots() <em>Required Same Day Slots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSameDaySlots()
	 * @generated
	 * @ordered
	 */
	protected EList<SlotRequirement> requiredSameDaySlots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingRequirementsPackage.Literals.SLOT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Teacher> getRequiredPersonal() {
		if (requiredPersonal == null) {
			requiredPersonal = new EObjectResolvingEList<Teacher>(Teacher.class, this,
					SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_PERSONAL);
		}
		return requiredPersonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getRequiredRoom() {
		if (requiredRoom != null && requiredRoom.eIsProxy()) {
			InternalEObject oldRequiredRoom = (InternalEObject) requiredRoom;
			requiredRoom = (Room) eResolveProxy(oldRequiredRoom);
			if (requiredRoom != oldRequiredRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_ROOM, oldRequiredRoom,
							requiredRoom));
			}
		}
		return requiredRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRequiredRoom() {
		return requiredRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredRoom(Room newRequiredRoom) {
		Room oldRequiredRoom = requiredRoom;
		requiredRoom = newRequiredRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_ROOM, oldRequiredRoom, requiredRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityType getActivityType() {
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityType(ActivityType newActivityType) {
		ActivityType oldActivityType = activityType;
		activityType = newActivityType == null ? ACTIVITY_TYPE_EDEFAULT : newActivityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.SLOT_REQUIREMENT__ACTIVITY_TYPE, oldActivityType, activityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.SLOT_REQUIREMENT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExpectedStudents() {
		return expectedStudents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedStudents(int newExpectedStudents) {
		int oldExpectedStudents = expectedStudents;
		expectedStudents = newExpectedStudents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SchedulingRequirementsPackage.SLOT_REQUIREMENT__EXPECTED_STUDENTS, oldExpectedStudents,
					expectedStudents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SlotRequirement> getRequiredSameDaySlots() {
		if (requiredSameDaySlots == null) {
			requiredSameDaySlots = new EObjectResolvingEList<SlotRequirement>(SlotRequirement.class, this,
					SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS);
		}
		return requiredSameDaySlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_PERSONAL:
			return getRequiredPersonal();
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_ROOM:
			if (resolve)
				return getRequiredRoom();
			return basicGetRequiredRoom();
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__ACTIVITY_TYPE:
			return getActivityType();
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__DURATION:
			return getDuration();
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__EXPECTED_STUDENTS:
			return getExpectedStudents();
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS:
			return getRequiredSameDaySlots();
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
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_PERSONAL:
			getRequiredPersonal().clear();
			getRequiredPersonal().addAll((Collection<? extends Teacher>) newValue);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_ROOM:
			setRequiredRoom((Room) newValue);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__ACTIVITY_TYPE:
			setActivityType((ActivityType) newValue);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__DURATION:
			setDuration((Integer) newValue);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__EXPECTED_STUDENTS:
			setExpectedStudents((Integer) newValue);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS:
			getRequiredSameDaySlots().clear();
			getRequiredSameDaySlots().addAll((Collection<? extends SlotRequirement>) newValue);
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
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_PERSONAL:
			getRequiredPersonal().clear();
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_ROOM:
			setRequiredRoom((Room) null);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__ACTIVITY_TYPE:
			setActivityType(ACTIVITY_TYPE_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__EXPECTED_STUDENTS:
			setExpectedStudents(EXPECTED_STUDENTS_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS:
			getRequiredSameDaySlots().clear();
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
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_PERSONAL:
			return requiredPersonal != null && !requiredPersonal.isEmpty();
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_ROOM:
			return requiredRoom != null;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__ACTIVITY_TYPE:
			return activityType != ACTIVITY_TYPE_EDEFAULT;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__DURATION:
			return duration != DURATION_EDEFAULT;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__EXPECTED_STUDENTS:
			return expectedStudents != EXPECTED_STUDENTS_EDEFAULT;
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS:
			return requiredSameDaySlots != null && !requiredSameDaySlots.isEmpty();
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
		result.append(" (activityType: ");
		result.append(activityType);
		result.append(", duration: ");
		result.append(duration);
		result.append(", expectedStudents: ");
		result.append(expectedStudents);
		result.append(')');
		return result.toString();
	}

} //SlotRequirementImpl
