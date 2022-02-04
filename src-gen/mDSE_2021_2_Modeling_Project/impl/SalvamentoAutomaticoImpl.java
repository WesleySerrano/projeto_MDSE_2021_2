/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import mDSE_2021_2_Modeling_Project.CartaoDeCredito;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;
import mDSE_2021_2_Modeling_Project.SalvamentoAutomatico;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salvamento Automatico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.SalvamentoAutomaticoImpl#getCartaodecredito <em>Cartaodecredito</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalvamentoAutomaticoImpl extends MinimalEObjectImpl.Container implements SalvamentoAutomatico {
	/**
	 * The cached value of the '{@link #getCartaodecredito() <em>Cartaodecredito</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartaodecredito()
	 * @generated
	 * @ordered
	 */
	protected CartaoDeCredito cartaodecredito;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalvamentoAutomaticoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.SALVAMENTO_AUTOMATICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartaoDeCredito getCartaodecredito() {
		if (cartaodecredito != null && cartaodecredito.eIsProxy()) {
			InternalEObject oldCartaodecredito = (InternalEObject) cartaodecredito;
			cartaodecredito = (CartaoDeCredito) eResolveProxy(oldCartaodecredito);
			if (cartaodecredito != oldCartaodecredito) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO__CARTAODECREDITO,
							oldCartaodecredito, cartaodecredito));
			}
		}
		return cartaodecredito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartaoDeCredito basicGetCartaodecredito() {
		return cartaodecredito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartaodecredito(CartaoDeCredito newCartaodecredito) {
		CartaoDeCredito oldCartaodecredito = cartaodecredito;
		cartaodecredito = newCartaodecredito;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO__CARTAODECREDITO, oldCartaodecredito,
					cartaodecredito));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO__CARTAODECREDITO:
			if (resolve)
				return getCartaodecredito();
			return basicGetCartaodecredito();
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
		case MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO__CARTAODECREDITO:
			setCartaodecredito((CartaoDeCredito) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO__CARTAODECREDITO:
			setCartaodecredito((CartaoDeCredito) null);
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
		case MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO__CARTAODECREDITO:
			return cartaodecredito != null;
		}
		return super.eIsSet(featureID);
	}

} //SalvamentoAutomaticoImpl
