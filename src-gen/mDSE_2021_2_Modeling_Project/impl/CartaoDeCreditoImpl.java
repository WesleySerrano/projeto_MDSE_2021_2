/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import java.lang.reflect.InvocationTargetException;
import javax.xml.datatype.XMLGregorianCalendar;
import mDSE_2021_2_Modeling_Project.BandeiraCartao;
import mDSE_2021_2_Modeling_Project.CartaoDeCredito;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartao De Credito</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl#getDataExpiracao <em>Data Expiracao</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl#getCvv <em>Cvv</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl#getNomeImpresso <em>Nome Impresso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartaoDeCreditoImpl extends MinimalEObjectImpl.Container implements CartaoDeCredito {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected String numero = NUMERO_EDEFAULT;
	/**
	 * The default value of the '{@link #getDataExpiracao() <em>Data Expiracao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExpiracao()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_EXPIRACAO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDataExpiracao() <em>Data Expiracao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExpiracao()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataExpiracao = DATA_EXPIRACAO_EDEFAULT;
	/**
	 * The default value of the '{@link #getCvv() <em>Cvv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvv()
	 * @generated
	 * @ordered
	 */
	protected static final String CVV_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCvv() <em>Cvv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvv()
	 * @generated
	 * @ordered
	 */
	protected String cvv = CVV_EDEFAULT;
	/**
	 * The default value of the '{@link #getNomeImpresso() <em>Nome Impresso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeImpresso()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_IMPRESSO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNomeImpresso() <em>Nome Impresso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeImpresso()
	 * @generated
	 * @ordered
	 */
	protected String nomeImpresso = NOME_IMPRESSO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartaoDeCreditoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.CARTAO_DE_CREDITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(String newNumero) {
		String oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataExpiracao() {
		return dataExpiracao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExpiracao(XMLGregorianCalendar newDataExpiracao) {
		XMLGregorianCalendar oldDataExpiracao = dataExpiracao;
		dataExpiracao = newDataExpiracao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__DATA_EXPIRACAO, oldDataExpiracao,
					dataExpiracao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCvv() {
		return cvv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCvv(String newCvv) {
		String oldCvv = cvv;
		cvv = newCvv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__CVV, oldCvv, cvv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeImpresso() {
		return nomeImpresso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeImpresso(String newNomeImpresso) {
		String oldNomeImpresso = nomeImpresso;
		nomeImpresso = newNomeImpresso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NOME_IMPRESSO, oldNomeImpresso,
					nomeImpresso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandeiraCartao obterBandeira() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NUMERO:
			return getNumero();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__DATA_EXPIRACAO:
			return getDataExpiracao();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__CVV:
			return getCvv();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NOME_IMPRESSO:
			return getNomeImpresso();
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
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NUMERO:
			setNumero((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__DATA_EXPIRACAO:
			setDataExpiracao((XMLGregorianCalendar) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__CVV:
			setCvv((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NOME_IMPRESSO:
			setNomeImpresso((String) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NUMERO:
			setNumero(NUMERO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__DATA_EXPIRACAO:
			setDataExpiracao(DATA_EXPIRACAO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__CVV:
			setCvv(CVV_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NOME_IMPRESSO:
			setNomeImpresso(NOME_IMPRESSO_EDEFAULT);
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
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NUMERO:
			return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__DATA_EXPIRACAO:
			return DATA_EXPIRACAO_EDEFAULT == null ? dataExpiracao != null
					: !DATA_EXPIRACAO_EDEFAULT.equals(dataExpiracao);
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__CVV:
			return CVV_EDEFAULT == null ? cvv != null : !CVV_EDEFAULT.equals(cvv);
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO__NOME_IMPRESSO:
			return NOME_IMPRESSO_EDEFAULT == null ? nomeImpresso != null : !NOME_IMPRESSO_EDEFAULT.equals(nomeImpresso);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO___VALIDAR:
			return validar();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO___OBTER_BANDEIRA:
			return obterBandeira();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(", dataExpiracao: ");
		result.append(dataExpiracao);
		result.append(", cvv: ");
		result.append(cvv);
		result.append(", nomeImpresso: ");
		result.append(nomeImpresso);
		result.append(')');
		return result.toString();
	}

} //CartaoDeCreditoImpl
