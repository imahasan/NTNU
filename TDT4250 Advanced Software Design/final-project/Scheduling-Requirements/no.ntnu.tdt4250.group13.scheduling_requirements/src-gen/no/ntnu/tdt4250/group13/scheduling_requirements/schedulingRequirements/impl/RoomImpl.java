/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.RoomImpl#getMazemapLink <em>Mazemap Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
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
	 * The default value of the '{@link #getMazemapLink() <em>Mazemap Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMazemapLink()
	 * @generated
	 * @ordered
	 */
	protected static final String MAZEMAP_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMazemapLink() <em>Mazemap Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMazemapLink()
	 * @generated
	 * @ordered
	 */
	protected String mazemapLink = MAZEMAP_LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingRequirementsPackage.Literals.ROOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.ROOM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMazemapLink() {
		return mazemapLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMazemapLink(String newMazemapLink) {
		String oldMazemapLink = mazemapLink;
		mazemapLink = newMazemapLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingRequirementsPackage.ROOM__MAZEMAP_LINK,
					oldMazemapLink, mazemapLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchedulingRequirementsPackage.ROOM__NAME:
			return getName();
		case SchedulingRequirementsPackage.ROOM__MAZEMAP_LINK:
			return getMazemapLink();
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
		case SchedulingRequirementsPackage.ROOM__NAME:
			setName((String) newValue);
			return;
		case SchedulingRequirementsPackage.ROOM__MAZEMAP_LINK:
			setMazemapLink((String) newValue);
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
		case SchedulingRequirementsPackage.ROOM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SchedulingRequirementsPackage.ROOM__MAZEMAP_LINK:
			setMazemapLink(MAZEMAP_LINK_EDEFAULT);
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
		case SchedulingRequirementsPackage.ROOM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SchedulingRequirementsPackage.ROOM__MAZEMAP_LINK:
			return MAZEMAP_LINK_EDEFAULT == null ? mazemapLink != null : !MAZEMAP_LINK_EDEFAULT.equals(mazemapLink);
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
		result.append(", mazemapLink: ");
		result.append(mazemapLink);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
