/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.provider;

import java.util.ArrayList;
import java.util.Collection;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.util.SchedulingRequirementsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulingRequirementsItemProviderAdapterFactory extends SchedulingRequirementsAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingRequirementsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseItemProvider courseItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCourseAdapter() {
		if (courseItemProvider == null) {
			courseItemProvider = new CourseItemProvider(this);
		}

		return courseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeacherItemProvider teacherItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeacherAdapter() {
		if (teacherItemProvider == null) {
			teacherItemProvider = new TeacherItemProvider(this);
		}

		return teacherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected schedulingRequirementsItemProvider schedulingRequirementsItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createschedulingRequirementsAdapter() {
		if (schedulingRequirementsItemProvider == null) {
			schedulingRequirementsItemProvider = new schedulingRequirementsItemProvider(this);
		}

		return schedulingRequirementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomItemProvider roomItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoomAdapter() {
		if (roomItemProvider == null) {
			roomItemProvider = new RoomItemProvider(this);
		}

		return roomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotRequirementItemProvider slotRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSlotRequirementAdapter() {
		if (slotRequirementItemProvider == null) {
			slotRequirementItemProvider = new SlotRequirementItemProvider(this);
		}

		return slotRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekItemProvider weekItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWeekAdapter() {
		if (weekItemProvider == null) {
			weekItemProvider = new WeekItemProvider(this);
		}

		return weekItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityItemProvider universityItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniversityAdapter() {
		if (universityItemProvider == null) {
			universityItemProvider = new UniversityItemProvider(this);
		}

		return universityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampusItemProvider campusItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCampusAdapter() {
		if (campusItemProvider == null) {
			campusItemProvider = new CampusItemProvider(this);
		}

		return campusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingItemProvider buildingItemProvider;

	/**
	 * This creates an adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBuildingAdapter() {
		if (buildingItemProvider == null) {
			buildingItemProvider = new BuildingItemProvider(this);
		}

		return buildingItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (courseItemProvider != null)
			courseItemProvider.dispose();
		if (teacherItemProvider != null)
			teacherItemProvider.dispose();
		if (schedulingRequirementsItemProvider != null)
			schedulingRequirementsItemProvider.dispose();
		if (roomItemProvider != null)
			roomItemProvider.dispose();
		if (slotRequirementItemProvider != null)
			slotRequirementItemProvider.dispose();
		if (weekItemProvider != null)
			weekItemProvider.dispose();
		if (universityItemProvider != null)
			universityItemProvider.dispose();
		if (campusItemProvider != null)
			campusItemProvider.dispose();
		if (buildingItemProvider != null)
			buildingItemProvider.dispose();
	}

}
