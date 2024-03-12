/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets.impl;

import java.util.Collection;
import java.util.HashMap;

import no.ntnu.tdt4250.group13.artifacts_servlets.Activity;
import no.ntnu.tdt4250.group13.artifacts_servlets.Course;
import no.ntnu.tdt4250.group13.artifacts_servlets.DayEnum;
import no.ntnu.tdt4250.group13.artifacts_servlets.Room;
import no.ntnu.tdt4250.group13.artifacts_servlets.Slot;
import no.ntnu.tdt4250.group13.artifacts_servlets.Teacher;
import no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage;
import no.ntnu.tdt4250.group13.artifacts_servlets.University;
import no.ntnu.tdt4250.group13.artifacts_servlets.Week;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getDay <em>Day</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getWeek <em>Week</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.SlotImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends MinimalEObjectImpl.Container implements Slot {
	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final DayEnum DAY_EDEFAULT = DayEnum.MONDAY;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected DayEnum day = DAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

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
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final int START_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected int startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final int END_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected int endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeek() <em>Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeek()
	 * @generated
	 * @ordered
	 */
	protected static final int WEEK_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayEnum getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(DayEnum newDay) {
		DayEnum oldDay = day;
		day = newDay == null ? DAY_EDEFAULT : newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.SLOT__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject) room;
			room = (Room) eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.SLOT__ROOM, oldRoom,
							room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimetablePackage.SLOT__ROOM,
					oldRoom, newRoom);
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
	public void setRoom(Room newRoom) {
		if (newRoom != room) {
			NotificationChain msgs = null;
			if (room != null)
				msgs = ((InternalEObject) room).eInverseRemove(this, TimetablePackage.ROOM__SLOT, Room.class, msgs);
			if (newRoom != null)
				msgs = ((InternalEObject) newRoom).eInverseAdd(this, TimetablePackage.ROOM__SLOT, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.SLOT__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Teacher> getLecturer() {
		if (lecturer == null) {
			lecturer = new EObjectWithInverseResolvingEList.ManyInverse<Teacher>(Teacher.class, this,
					TimetablePackage.SLOT__LECTURER, TimetablePackage.TEACHER__SLOT);
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TimetablePackage.SLOT__ACTIVITY, oldActivity, newActivity);
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
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject) activity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimetablePackage.SLOT__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject) newActivity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimetablePackage.SLOT__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.SLOT__ACTIVITY, newActivity,
					newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(int newStartTime) {
		int oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.SLOT__START_TIME, oldStartTime,
					startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(int newEndTime) {
		int oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.SLOT__END_TIME, oldEndTime,
					endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getWeek() {
		return ((Week) (this.eContainer())).getNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		Course course = basicGetCourse();
		return course != null && course.eIsProxy() ? (Course) eResolveProxy((InternalEObject) course) : course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Course basicGetCourse() {
		return (Course) this.eContainer().eContainer().eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getDate() {
		Integer year = ((University) (this.eContainer().eContainer().eContainer().eContainer())).getYear();
		String ret = "" + year;
		HashMap<Integer, Integer> years = new HashMap<Integer, Integer>();
		years.put(2024, 0);
		years.put(2025, 2);
		years.put(2026, 3);
		years.put(2027, 4);
		years.put(2028, 5);
		int dayOfTheYear = (this.getWeek() - 1) * 7;
		if (this.day.toString() == "Tuesday") {
			dayOfTheYear += 1;
		}
		if (this.day.toString() == "Wednesday") {
			dayOfTheYear += 2;
		}
		if (this.day.toString() == "Thursday") {
			dayOfTheYear += 3;
		}
		if (this.day.toString() == "Friday") {
			dayOfTheYear += 4;
		}
		int daysFebruary = (years.get(year) % 4 == 0) ? 29 : 28;
		for (int i = 0; i < 12; i++) {
			if (i == 1) {
				if (dayOfTheYear - 31 < 0) {
					ret = ret + "0" + i;
					for (int j = 0; j < 31; j++) {
						if (dayOfTheYear - j - years.get(year) == 0) {
							if (j + 1 < 10) {
								ret += "0";
							}
							ret += (j + 1);
							break;
						}
					}
					break;
				}
			} else if (i == 2) {
				if (dayOfTheYear - 31 - daysFebruary < 0) {
					ret = ret + "0" + i;
					for (int j = 0; j < daysFebruary; j++) {
						if (dayOfTheYear - 31 - j - years.get(year) == 0) {
							if (j + 1 < 10) {
								ret += "0";
							}
							ret += (j + 1);
							break;
						}
					}
					break;
				}
			} else if (i == 3 || i == 5 || i == 7) {
				if (dayOfTheYear - (i / 2 + 1) * 31 - (i / 2 - 1) * 30 - daysFebruary < 0) {
					ret = ret + "0" + i;
					for (int j = 0; j < 31; j++) {
						if (dayOfTheYear - (i / 2) * 31 - (i / 2 - 1) * 30 - daysFebruary - j - years.get(year) == 0) {
							if (j + 1 < 10) {
								ret += "0";
							}
							ret += (j + 1);
							break;
						}
					}
					break;
				}
			} else if (i == 2 || i == 4 || i == 6) {
				if (dayOfTheYear - (i / 2) * 31 - (i / 2 - 1) * 30 - daysFebruary < 0) {
					ret = ret + "0" + i;
					for (int j = 0; j < 31; j++) {
						if (dayOfTheYear - (i / 2) * 31 - (i / 2 - 2) * 30 - daysFebruary - j - years.get(year) == 0) {
							if (j + 1 < 10) {
								ret += "0";
							}
							ret += (j + 1);
							break;
						}
					}
					break;
				}
			} else if (i == 8 || i == 10 || i == 12) {
				if (dayOfTheYear - (i / 2 + 1) * 31 - (i / 2 - 2) * 30 - daysFebruary < 0) {
					ret = ret + "0" + i;
					for (int j = 0; j < 31; j++) {
						if (dayOfTheYear - (i / 2) * 31 - (i / 2 - 2) * 30 - daysFebruary - j - years.get(year) == 0) {
							if (j + 1 < 10) {
								ret += "0";
							}
							ret += (j + 1);
							break;
						}
					}
					break;
				}
			} else if (i == 9 || i == 11) {
				if (dayOfTheYear - (i / 2 + 1) * 31 - (i / 2 - 1) * 30 < 0) {
					ret = ret + "0" + i;
					for (int j = 0; j < 31; j++) {
						if (dayOfTheYear - (i / 2 + 1) * 31 - (i / 2 - 2) * 30 - daysFebruary - j
								- years.get(year) == 0) {
							if (j + 1 < 10) {
								ret += "0";
							}
							ret += (j + 1);
							break;
						}
					}
					break;
				}
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimetablePackage.SLOT__ROOM:
			if (room != null)
				msgs = ((InternalEObject) room).eInverseRemove(this, TimetablePackage.ROOM__SLOT, Room.class, msgs);
			return basicSetRoom((Room) otherEnd, msgs);
		case TimetablePackage.SLOT__LECTURER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLecturer()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TimetablePackage.SLOT__ROOM:
			return basicSetRoom(null, msgs);
		case TimetablePackage.SLOT__LECTURER:
			return ((InternalEList<?>) getLecturer()).basicRemove(otherEnd, msgs);
		case TimetablePackage.SLOT__ACTIVITY:
			return basicSetActivity(null, msgs);
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
		case TimetablePackage.SLOT__DAY:
			return getDay();
		case TimetablePackage.SLOT__ROOM:
			if (resolve)
				return getRoom();
			return basicGetRoom();
		case TimetablePackage.SLOT__LECTURER:
			return getLecturer();
		case TimetablePackage.SLOT__ACTIVITY:
			return getActivity();
		case TimetablePackage.SLOT__START_TIME:
			return getStartTime();
		case TimetablePackage.SLOT__END_TIME:
			return getEndTime();
		case TimetablePackage.SLOT__WEEK:
			return getWeek();
		case TimetablePackage.SLOT__COURSE:
			if (resolve)
				return getCourse();
			return basicGetCourse();
		case TimetablePackage.SLOT__DATE:
			return getDate();
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
		case TimetablePackage.SLOT__DAY:
			setDay((DayEnum) newValue);
			return;
		case TimetablePackage.SLOT__ROOM:
			setRoom((Room) newValue);
			return;
		case TimetablePackage.SLOT__LECTURER:
			getLecturer().clear();
			getLecturer().addAll((Collection<? extends Teacher>) newValue);
			return;
		case TimetablePackage.SLOT__ACTIVITY:
			setActivity((Activity) newValue);
			return;
		case TimetablePackage.SLOT__START_TIME:
			setStartTime((Integer) newValue);
			return;
		case TimetablePackage.SLOT__END_TIME:
			setEndTime((Integer) newValue);
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
		case TimetablePackage.SLOT__DAY:
			setDay(DAY_EDEFAULT);
			return;
		case TimetablePackage.SLOT__ROOM:
			setRoom((Room) null);
			return;
		case TimetablePackage.SLOT__LECTURER:
			getLecturer().clear();
			return;
		case TimetablePackage.SLOT__ACTIVITY:
			setActivity((Activity) null);
			return;
		case TimetablePackage.SLOT__START_TIME:
			setStartTime(START_TIME_EDEFAULT);
			return;
		case TimetablePackage.SLOT__END_TIME:
			setEndTime(END_TIME_EDEFAULT);
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
		case TimetablePackage.SLOT__DAY:
			return day != DAY_EDEFAULT;
		case TimetablePackage.SLOT__ROOM:
			return room != null;
		case TimetablePackage.SLOT__LECTURER:
			return lecturer != null && !lecturer.isEmpty();
		case TimetablePackage.SLOT__ACTIVITY:
			return activity != null;
		case TimetablePackage.SLOT__START_TIME:
			return startTime != START_TIME_EDEFAULT;
		case TimetablePackage.SLOT__END_TIME:
			return endTime != END_TIME_EDEFAULT;
		case TimetablePackage.SLOT__WEEK:
			return getWeek() != WEEK_EDEFAULT;
		case TimetablePackage.SLOT__COURSE:
			return basicGetCourse() != null;
		case TimetablePackage.SLOT__DATE:
			return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
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
		result.append(" (day: ");
		result.append(day);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //SlotImpl
