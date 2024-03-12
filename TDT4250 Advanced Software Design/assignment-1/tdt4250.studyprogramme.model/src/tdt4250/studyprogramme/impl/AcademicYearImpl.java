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
import tdt4250.studyprogramme.CourseCombination;
import tdt4250.studyprogramme.Season;
import tdt4250.studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Academic Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.studyprogramme.impl.AcademicYearImpl#getFromYear <em>From Year</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.AcademicYearImpl#getFromSeason <em>From Season</em>}</li>
 *   <li>{@link tdt4250.studyprogramme.impl.AcademicYearImpl#getCourseCombinations <em>Course Combinations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcademicYearImpl extends MinimalEObjectImpl.Container implements AcademicYear {
	/**
	 * The default value of the '{@link #getFromYear() <em>From Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromYear()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFromYear() <em>From Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromYear()
	 * @generated
	 * @ordered
	 */
	protected int fromYear = FROM_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromSeason() <em>From Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSeason()
	 * @generated
	 * @ordered
	 */
	protected static final Season FROM_SEASON_EDEFAULT = Season.SPRING;

	/**
	 * The cached value of the '{@link #getFromSeason() <em>From Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSeason()
	 * @generated
	 * @ordered
	 */
	protected Season fromSeason = FROM_SEASON_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcademicYearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.ACADEMIC_YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFromYear() {
		return fromYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromYear(int newFromYear) {
		int oldFromYear = fromYear;
		fromYear = newFromYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.ACADEMIC_YEAR__FROM_YEAR, oldFromYear, fromYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Season getFromSeason() {
		return fromSeason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromSeason(Season newFromSeason) {
		Season oldFromSeason = fromSeason;
		fromSeason = newFromSeason == null ? FROM_SEASON_EDEFAULT : newFromSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.ACADEMIC_YEAR__FROM_SEASON, oldFromSeason, fromSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseCombination> getCourseCombinations() {
		if (courseCombinations == null) {
			courseCombinations = new EObjectContainmentEList<CourseCombination>(CourseCombination.class, this, StudyprogrammePackage.ACADEMIC_YEAR__COURSE_COMBINATIONS);
		}
		return courseCombinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.ACADEMIC_YEAR__COURSE_COMBINATIONS:
				return ((InternalEList<?>)getCourseCombinations()).basicRemove(otherEnd, msgs);
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
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_YEAR:
				return getFromYear();
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_SEASON:
				return getFromSeason();
			case StudyprogrammePackage.ACADEMIC_YEAR__COURSE_COMBINATIONS:
				return getCourseCombinations();
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
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_YEAR:
				setFromYear((Integer)newValue);
				return;
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_SEASON:
				setFromSeason((Season)newValue);
				return;
			case StudyprogrammePackage.ACADEMIC_YEAR__COURSE_COMBINATIONS:
				getCourseCombinations().clear();
				getCourseCombinations().addAll((Collection<? extends CourseCombination>)newValue);
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
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_YEAR:
				setFromYear(FROM_YEAR_EDEFAULT);
				return;
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_SEASON:
				setFromSeason(FROM_SEASON_EDEFAULT);
				return;
			case StudyprogrammePackage.ACADEMIC_YEAR__COURSE_COMBINATIONS:
				getCourseCombinations().clear();
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
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_YEAR:
				return fromYear != FROM_YEAR_EDEFAULT;
			case StudyprogrammePackage.ACADEMIC_YEAR__FROM_SEASON:
				return fromSeason != FROM_SEASON_EDEFAULT;
			case StudyprogrammePackage.ACADEMIC_YEAR__COURSE_COMBINATIONS:
				return courseCombinations != null && !courseCombinations.isEmpty();
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
		result.append(" (fromYear: ");
		result.append(fromYear);
		result.append(", fromSeason: ");
		result.append(fromSeason);
		result.append(')');
		return result.toString();
	}

} //AcademicYearImpl
