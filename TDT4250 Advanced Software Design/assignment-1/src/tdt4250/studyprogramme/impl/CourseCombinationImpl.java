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

import tdt4250.studyprogramme.CourseCombination;
import tdt4250.studyprogramme.CourseGroup;
import tdt4250.studyprogramme.Specialisation;
import tdt4250.studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseCombinationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseCombinationImpl#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseCombinationImpl#getCreditsRequirement <em>Credits Requirement</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseCombinationImpl#getFromTerm <em>From Term</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseCombinationImpl#getCourseCombinations <em>Course Combinations</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.CourseCombinationImpl#getCourseGroups <em>Course Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseCombinationImpl extends MinimalEObjectImpl.Container implements CourseCombination {
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
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected Specialisation specialisation;

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
	 * The cached value of the '{@link #getCourseCombinations() <em>Course Combinations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCombinations()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseCombination> courseCombinations;

	/**
	 * The cached value of the '{@link #getCourseGroups() <em>Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> courseGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseCombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.COURSE_COMBINATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_COMBINATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCourseGroups() {
		if (courseGroups == null) {
			courseGroups = new EObjectContainmentEList<CourseGroup>(CourseGroup.class, this, StudyprogrammePackage.COURSE_COMBINATION__COURSE_GROUPS);
		}
		return courseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation getSpecialisation() {
		if (specialisation != null && specialisation.eIsProxy()) {
			InternalEObject oldSpecialisation = (InternalEObject)specialisation;
			specialisation = (Specialisation)eResolveProxy(oldSpecialisation);
			if (specialisation != oldSpecialisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyprogrammePackage.COURSE_COMBINATION__SPECIALISATION, oldSpecialisation, specialisation));
			}
		}
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation basicGetSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialisation(Specialisation newSpecialisation) {
		Specialisation oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_COMBINATION__SPECIALISATION, oldSpecialisation, specialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseCombination> getCourseCombinations() {
		if (courseCombinations == null) {
			courseCombinations = new EObjectContainmentEList<CourseCombination>(CourseCombination.class, this, StudyprogrammePackage.COURSE_COMBINATION__COURSE_COMBINATIONS);
		}
		return courseCombinations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_COMBINATION__CREDITS_REQUIREMENT, oldCreditsRequirement, creditsRequirement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.COURSE_COMBINATION__FROM_TERM, oldFromTerm, fromTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_COMBINATIONS:
				return ((InternalEList<?>)getCourseCombinations()).basicRemove(otherEnd, msgs);
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
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
			case StudyprogrammePackage.COURSE_COMBINATION__NAME:
				return getName();
			case StudyprogrammePackage.COURSE_COMBINATION__SPECIALISATION:
				if (resolve) return getSpecialisation();
				return basicGetSpecialisation();
			case StudyprogrammePackage.COURSE_COMBINATION__CREDITS_REQUIREMENT:
				return getCreditsRequirement();
			case StudyprogrammePackage.COURSE_COMBINATION__FROM_TERM:
				return getFromTerm();
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_COMBINATIONS:
				return getCourseCombinations();
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_GROUPS:
				return getCourseGroups();
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
			case StudyprogrammePackage.COURSE_COMBINATION__NAME:
				setName((String)newValue);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__SPECIALISATION:
				setSpecialisation((Specialisation)newValue);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__CREDITS_REQUIREMENT:
				setCreditsRequirement((Double)newValue);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__FROM_TERM:
				setFromTerm((Integer)newValue);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_COMBINATIONS:
				getCourseCombinations().clear();
				getCourseCombinations().addAll((Collection<? extends CourseCombination>)newValue);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_GROUPS:
				getCourseGroups().clear();
				getCourseGroups().addAll((Collection<? extends CourseGroup>)newValue);
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
			case StudyprogrammePackage.COURSE_COMBINATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__SPECIALISATION:
				setSpecialisation((Specialisation)null);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__CREDITS_REQUIREMENT:
				setCreditsRequirement(CREDITS_REQUIREMENT_EDEFAULT);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__FROM_TERM:
				setFromTerm(FROM_TERM_EDEFAULT);
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_COMBINATIONS:
				getCourseCombinations().clear();
				return;
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_GROUPS:
				getCourseGroups().clear();
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
			case StudyprogrammePackage.COURSE_COMBINATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogrammePackage.COURSE_COMBINATION__SPECIALISATION:
				return specialisation != null;
			case StudyprogrammePackage.COURSE_COMBINATION__CREDITS_REQUIREMENT:
				return creditsRequirement != CREDITS_REQUIREMENT_EDEFAULT;
			case StudyprogrammePackage.COURSE_COMBINATION__FROM_TERM:
				return fromTerm != FROM_TERM_EDEFAULT;
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_COMBINATIONS:
				return courseCombinations != null && !courseCombinations.isEmpty();
			case StudyprogrammePackage.COURSE_COMBINATION__COURSE_GROUPS:
				return courseGroups != null && !courseGroups.isEmpty();
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
		result.append(", creditsRequirement: ");
		result.append(creditsRequirement);
		result.append(", fromTerm: ");
		result.append(fromTerm);
		result.append(')');
		return result.toString();
	}

} //CourseCombinationImpl
