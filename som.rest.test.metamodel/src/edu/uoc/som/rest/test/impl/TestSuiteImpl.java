/**
 */
package edu.uoc.som.rest.test.impl;

import edu.uoc.som.rest.test.TestCase;
import edu.uoc.som.rest.test.TestPackage;
import edu.uoc.som.rest.test.TestSuite;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.rest.test.impl.TestSuiteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.TestSuiteImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.TestSuiteImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.TestSuiteImpl#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link edu.uoc.som.rest.test.impl.TestSuiteImpl#getApi <em>Api</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestSuiteImpl extends NamedElementImpl implements TestSuite {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date updatedAt = UPDATED_AT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCases;

	/**
	 * The default value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected static final String API_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected String api = API_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		Date oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedAt(Date newUpdatedAt) {
		Date oldUpdatedAt = updatedAt;
		updatedAt = newUpdatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__UPDATED_AT, oldUpdatedAt, updatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectContainmentEList<TestCase>(TestCase.class, this, TestPackage.TEST_SUITE__TEST_CASES);
		}
		return testCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(String newApi) {
		String oldApi = api;
		api = newApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_SUITE__API, oldApi, api));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_SUITE__TEST_CASES:
				return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
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
			case TestPackage.TEST_SUITE__DESCRIPTION:
				return getDescription();
			case TestPackage.TEST_SUITE__CREATED_AT:
				return getCreatedAt();
			case TestPackage.TEST_SUITE__UPDATED_AT:
				return getUpdatedAt();
			case TestPackage.TEST_SUITE__TEST_CASES:
				return getTestCases();
			case TestPackage.TEST_SUITE__API:
				return getApi();
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
			case TestPackage.TEST_SUITE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TestPackage.TEST_SUITE__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case TestPackage.TEST_SUITE__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case TestPackage.TEST_SUITE__TEST_CASES:
				getTestCases().clear();
				getTestCases().addAll((Collection<? extends TestCase>)newValue);
				return;
			case TestPackage.TEST_SUITE__API:
				setApi((String)newValue);
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
			case TestPackage.TEST_SUITE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TestPackage.TEST_SUITE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case TestPackage.TEST_SUITE__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case TestPackage.TEST_SUITE__TEST_CASES:
				getTestCases().clear();
				return;
			case TestPackage.TEST_SUITE__API:
				setApi(API_EDEFAULT);
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
			case TestPackage.TEST_SUITE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TestPackage.TEST_SUITE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case TestPackage.TEST_SUITE__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updatedAt != null : !UPDATED_AT_EDEFAULT.equals(updatedAt);
			case TestPackage.TEST_SUITE__TEST_CASES:
				return testCases != null && !testCases.isEmpty();
			case TestPackage.TEST_SUITE__API:
				return API_EDEFAULT == null ? api != null : !API_EDEFAULT.equals(api);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", updatedAt: ");
		result.append(updatedAt);
		result.append(", api: ");
		result.append(api);
		result.append(')');
		return result.toString();
	}

} //TestSuiteImpl
