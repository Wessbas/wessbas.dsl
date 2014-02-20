/**
 */
package m4jdsl.impl;

import java.util.Collection;

import m4jdsl.ApplicationState;
import m4jdsl.M4jdslPackage;
import m4jdsl.SessionLayerEFSM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Layer EFSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMImpl#getStates <em>States</em>}</li>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMImpl#getExitState <em>Exit State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionLayerEFSMImpl extends MinimalEObjectImpl.Container implements SessionLayerEFSM {
    /**
     * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStates()
     * @generated
     * @ordered
     */
    protected EList<ApplicationState> states;

    /**
     * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialState()
     * @generated
     * @ordered
     */
    protected ApplicationState initialState;

    /**
     * The cached value of the '{@link #getExitState() <em>Exit State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExitState()
     * @generated
     * @ordered
     */
    protected ApplicationState exitState;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SessionLayerEFSMImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.SESSION_LAYER_EFSM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ApplicationState> getStates() {
        if (states == null) {
            states = new EObjectContainmentEList<ApplicationState>(ApplicationState.class, this, M4jdslPackage.SESSION_LAYER_EFSM__STATES);
        }
        return states;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationState getInitialState() {
        if (initialState != null && initialState.eIsProxy()) {
            InternalEObject oldInitialState = (InternalEObject)initialState;
            initialState = (ApplicationState)eResolveProxy(oldInitialState);
            if (initialState != oldInitialState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE, oldInitialState, initialState));
            }
        }
        return initialState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationState basicGetInitialState() {
        return initialState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialState(ApplicationState newInitialState) {
        ApplicationState oldInitialState = initialState;
        initialState = newInitialState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE, oldInitialState, initialState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationState getExitState() {
        if (exitState != null && exitState.eIsProxy()) {
            InternalEObject oldExitState = (InternalEObject)exitState;
            exitState = (ApplicationState)eResolveProxy(oldExitState);
            if (exitState != oldExitState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE, oldExitState, exitState));
            }
        }
        return exitState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationState basicGetExitState() {
        return exitState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExitState(ApplicationState newExitState) {
        ApplicationState oldExitState = exitState;
        exitState = newExitState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE, oldExitState, exitState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case M4jdslPackage.SESSION_LAYER_EFSM__STATES:
                return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
            case M4jdslPackage.SESSION_LAYER_EFSM__STATES:
                return getStates();
            case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
                if (resolve) return getInitialState();
                return basicGetInitialState();
            case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
                if (resolve) return getExitState();
                return basicGetExitState();
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
            case M4jdslPackage.SESSION_LAYER_EFSM__STATES:
                getStates().clear();
                getStates().addAll((Collection<? extends ApplicationState>)newValue);
                return;
            case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
                setInitialState((ApplicationState)newValue);
                return;
            case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
                setExitState((ApplicationState)newValue);
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
            case M4jdslPackage.SESSION_LAYER_EFSM__STATES:
                getStates().clear();
                return;
            case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
                setInitialState((ApplicationState)null);
                return;
            case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
                setExitState((ApplicationState)null);
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
            case M4jdslPackage.SESSION_LAYER_EFSM__STATES:
                return states != null && !states.isEmpty();
            case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
                return initialState != null;
            case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
                return exitState != null;
        }
        return super.eIsSet(featureID);
    }

} //SessionLayerEFSMImpl
