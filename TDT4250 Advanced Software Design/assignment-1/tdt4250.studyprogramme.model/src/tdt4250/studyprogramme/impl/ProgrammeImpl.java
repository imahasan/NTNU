/**
 */
package tdt4250.studyprogramme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.studyprogramme.AcademicYear;
import tdt4250.studyprogramme.Programme;
import tdt4250.studyprogramme.Specialisation;
import tdt4250.studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.ProgrammeImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.ProgrammeImpl#getAcademicYears <em>Academic Years</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.ProgrammeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.ProgrammeImpl#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.ProgrammeImpl#getCreditsRequirement <em>Credits Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
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
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcademicYears() <em>Academic Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcademicYears()
	 * @generated
	 * @ordered
	 */
	protected EList<AcademicYear> academicYears;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisations;

	/**
	 * The default value of the '{@link #getCreditsRequirement() <em>Credits Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditsRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_REQUIREMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCreditsRequirement() <em>Credits Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditsRequirement()
	 * @generated
	 * @ordered
	 */
	protected double creditsRequirement = CREDITS_REQUIREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.PROGRAMME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AcademicYear> getAcademicYears() {
		if (academicYears == null) {
			academicYears = new EObjectContainmentEList<AcademicYear>(AcademicYear.class, this, StudyprogrammePackage.PROGRAMME__ACADEMIC_YEARS);
		}
		return academicYears;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getFullName() {
		return this.getCode() + " - " + this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisation> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, StudyprogrammePackage.PROGRAMME__SPECIALISATIONS);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCreditsRequirement() {
		return creditsRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditsRequirement(double newCreditsRequirement) {
		double oldCreditsRequirement = creditsRequirement;
		creditsRequirement = newCreditsRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__CREDITS_REQUIREMENT, oldCreditsRequirement, creditsRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.PROGRAMME__ACADEMIC_YEARS:
				return ((InternalEList<?>)getAcademicYears()).basicRemove(otherEnd, msgs);
			case StudyprogrammePackage.PROGRAMME__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				return getName();
			case StudyprogrammePackage.PROGRAMME__CODE:
				return getCode();
			case StudyprogrammePackage.PROGRAMME__FULL_NAME:
				return getFullName();
			case StudyprogrammePackage.PROGRAMME__ACADEMIC_YEARS:
				return getAcademicYears();
			case StudyprogrammePackage.PROGRAMME__LENGTH:
				return getLength();
			case StudyprogrammePackage.PROGRAMME__SPECIALISATIONS:
				return getSpecialisations();
			case StudyprogrammePackage.PROGRAMME__CREDITS_REQUIREMENT:
				return getCreditsRequirement();
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__ACADEMIC_YEARS:
				getAcademicYears().clear();
				getAcademicYears().addAll((Collection<? extends AcademicYear>)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__LENGTH:
				setLength((Integer)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__CREDITS_REQUIREMENT:
				setCreditsRequirement((Double)newValue);
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogrammePackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyprogrammePackage.PROGRAMME__ACADEMIC_YEARS:
				getAcademicYears().clear();
				return;
			case StudyprogrammePackage.PROGRAMME__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case StudyprogrammePackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
			case StudyprogrammePackage.PROGRAMME__CREDITS_REQUIREMENT:
				setCreditsRequirement(CREDITS_REQUIREMENT_EDEFAULT);
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogrammePackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyprogrammePackage.PROGRAMME__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
			case StudyprogrammePackage.PROGRAMME__ACADEMIC_YEARS:
				return academicYears != null && !academicYears.isEmpty();
			case StudyprogrammePackage.PROGRAMME__LENGTH:
				return length != LENGTH_EDEFAULT;
			case StudyprogrammePackage.PROGRAMME__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
			case StudyprogrammePackage.PROGRAMME__CREDITS_REQUIREMENT:
				return creditsRequirement != CREDITS_REQUIREMENT_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", length: ");
		result.append(length);
		result.append(", creditsRequirement: ");
		result.append(creditsRequirement);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
