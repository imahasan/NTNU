/**
 */
package no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.provider;

import java.util.Collection;
import java.util.List;

import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.ActivityType;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SlotRequirementItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotRequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRequiredPersonalPropertyDescriptor(object);
			addRequiredRoomPropertyDescriptor(object);
			addActivityTypePropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addExpectedStudentsPropertyDescriptor(object);
			addRequiredSameDaySlotsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required Personal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPersonalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SlotRequirement_requiredPersonal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SlotRequirement_requiredPersonal_feature",
								"_UI_SlotRequirement_type"),
						SchedulingRequirementsPackage.Literals.SLOT_REQUIREMENT__REQUIRED_PERSONAL, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Required Room feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredRoomPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SlotRequirement_requiredRoom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SlotRequirement_requiredRoom_feature",
								"_UI_SlotRequirement_type"),
						SchedulingRequirementsPackage.Literals.SLOT_REQUIREMENT__REQUIRED_ROOM, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Activity Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SlotRequirement_activityType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SlotRequirement_activityType_feature",
								"_UI_SlotRequirement_type"),
						SchedulingRequirementsPackage.Literals.SLOT_REQUIREMENT__ACTIVITY_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SlotRequirement_duration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SlotRequirement_duration_feature",
						"_UI_SlotRequirement_type"),
				SchedulingRequirementsPackage.Literals.SLOT_REQUIREMENT__DURATION, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expected Students feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectedStudentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SlotRequirement_expectedStudents_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SlotRequirement_expectedStudents_feature",
								"_UI_SlotRequirement_type"),
						SchedulingRequirementsPackage.Literals.SLOT_REQUIREMENT__EXPECTED_STUDENTS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Required Same Day Slots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredSameDaySlotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SlotRequirement_requiredSameDaySlots_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SlotRequirement_requiredSameDaySlots_feature", "_UI_SlotRequirement_type"),
						SchedulingRequirementsPackage.Literals.SLOT_REQUIREMENT__REQUIRED_SAME_DAY_SLOTS, true, false,
						true, null, null, null));
	}

	/**
	 * This returns SlotRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SlotRequirement"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActivityType labelValue = ((SlotRequirement) object).getActivityType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_SlotRequirement_type")
				: getString("_UI_SlotRequirement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SlotRequirement.class)) {
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__ACTIVITY_TYPE:
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__DURATION:
		case SchedulingRequirementsPackage.SLOT_REQUIREMENT__EXPECTED_STUDENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SchedulingRequirementsEditPlugin.INSTANCE;
	}

}
