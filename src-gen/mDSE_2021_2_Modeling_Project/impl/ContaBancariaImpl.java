/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import mDSE_2021_2_Modeling_Project.ContaBancaria;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conta Bancaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.ContaBancariaImpl#getCodigoBanco <em>Codigo Banco</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.ContaBancariaImpl#getAgencia <em>Agencia</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.ContaBancariaImpl#getConta <em>Conta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContaBancariaImpl extends MinimalEObjectImpl.Container implements ContaBancaria {
	/**
	 * The default value of the '{@link #getCodigoBanco() <em>Codigo Banco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoBanco()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_BANCO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigoBanco() <em>Codigo Banco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoBanco()
	 * @generated
	 * @ordered
	 */
	protected String codigoBanco = CODIGO_BANCO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgencia() <em>Agencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgencia()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgencia() <em>Agencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgencia()
	 * @generated
	 * @ordered
	 */
	protected String agencia = AGENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getConta() <em>Conta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConta()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConta() <em>Conta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConta()
	 * @generated
	 * @ordered
	 */
	protected String conta = CONTA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContaBancariaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.CONTA_BANCARIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodigoBanco() {
		return codigoBanco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoBanco(String newCodigoBanco) {
		String oldCodigoBanco = codigoBanco;
		codigoBanco = newCodigoBanco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CODIGO_BANCO, oldCodigoBanco, codigoBanco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgencia(String newAgencia) {
		String oldAgencia = agencia;
		agencia = newAgencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__AGENCIA, oldAgencia, agencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConta() {
		return conta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConta(String newConta) {
		String oldConta = conta;
		conta = newConta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CONTA, oldConta, conta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CODIGO_BANCO:
			return getCodigoBanco();
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__AGENCIA:
			return getAgencia();
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CONTA:
			return getConta();
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
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CODIGO_BANCO:
			setCodigoBanco((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__AGENCIA:
			setAgencia((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CONTA:
			setConta((String) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CODIGO_BANCO:
			setCodigoBanco(CODIGO_BANCO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__AGENCIA:
			setAgencia(AGENCIA_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CONTA:
			setConta(CONTA_EDEFAULT);
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
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CODIGO_BANCO:
			return CODIGO_BANCO_EDEFAULT == null ? codigoBanco != null : !CODIGO_BANCO_EDEFAULT.equals(codigoBanco);
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__AGENCIA:
			return AGENCIA_EDEFAULT == null ? agencia != null : !AGENCIA_EDEFAULT.equals(agencia);
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA__CONTA:
			return CONTA_EDEFAULT == null ? conta != null : !CONTA_EDEFAULT.equals(conta);
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
		result.append(" (codigoBanco: ");
		result.append(codigoBanco);
		result.append(", agencia: ");
		result.append(agencia);
		result.append(", conta: ");
		result.append(conta);
		result.append(')');
		return result.toString();
	}

} //ContaBancariaImpl
