/**
 */
package no.ntnu.tdt4250.group13.artifacts_servlets.impl;

import java.util.Collection;

import no.ntnu.tdt4250.group13.artifacts_servlets.Room;
import no.ntnu.tdt4250.group13.artifacts_servlets.Slot;
import no.ntnu.tdt4250.group13.artifacts_servlets.TimetablePackage;

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
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.RoomImpl#getMazemapLink <em>Mazemap Link</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.group13.artifacts_servlets.impl.RoomImpl#getSlot <em>Slot</em>}</li>
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
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slot;

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
		return TimetablePackage.Literals.ROOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.ROOM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.ROOM__MAZEMAP_LINK, oldMazemapLink,
					mazemapLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectWithInverseResolvingEList<Slot>(Slot.class, this, TimetablePackage.ROOM__SLOT,
					TimetablePackage.SLOT__ROOM);
		}
		return slot;
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
		case TimetablePackage.ROOM__SLOT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSlot()).basicAdd(otherEnd, msgs);
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
		case TimetablePackage.ROOM__SLOT:
			return ((InternalEList<?>) getSlot()).basicRemove(otherEnd, msgs);
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
		case TimetablePackage.ROOM__NAME:
			return getName();
		case TimetablePackage.ROOM__MAZEMAP_LINK:
			return getMazemapLink();
		case TimetablePackage.ROOM__SLOT:
			return getSlot();
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
		case TimetablePackage.ROOM__NAME:
			setName((String) newValue);
			return;
		case TimetablePackage.ROOM__MAZEMAP_LINK:
			setMazemapLink((String) newValue);
			return;
		case TimetablePackage.ROOM__SLOT:
			getSlot().clear();
			getSlot().addAll((Collection<? extends Slot>) newValue);
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
		case TimetablePackage.ROOM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TimetablePackage.ROOM__MAZEMAP_LINK:
			setMazemapLink(MAZEMAP_LINK_EDEFAULT);
			return;
		case TimetablePackage.ROOM__SLOT:
			getSlot().clear();
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
		case TimetablePackage.ROOM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TimetablePackage.ROOM__MAZEMAP_LINK:
			return MAZEMAP_LINK_EDEFAULT == null ? mazemapLink != null : !MAZEMAP_LINK_EDEFAULT.equals(mazemapLink);
		case TimetablePackage.ROOM__SLOT:
			return slot != null && !slot.isEmpty();
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
