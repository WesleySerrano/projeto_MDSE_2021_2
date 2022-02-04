/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import java.lang.reflect.InvocationTargetException;
import mDSE_2021_2_Modeling_Project.Endereco;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endereco</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl#getCep <em>Cep</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl#getLogradouro <em>Logradouro</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl#getComplemento <em>Complemento</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl#getCidade <em>Cidade</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl#getUf <em>Uf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnderecoImpl extends MinimalEObjectImpl.Container implements Endereco {
	/**
	 * The default value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected static final String CEP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected String cep = CEP_EDEFAULT;
	/**
	 * The default value of the '{@link #getLogradouro() <em>Logradouro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogradouro()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGRADOURO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLogradouro() <em>Logradouro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogradouro()
	 * @generated
	 * @ordered
	 */
	protected String logradouro = LOGRADOURO_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final Short NUMERO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected Short numero = NUMERO_EDEFAULT;
	/**
	 * The default value of the '{@link #getComplemento() <em>Complemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplemento()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENTO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComplemento() <em>Complemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplemento()
	 * @generated
	 * @ordered
	 */
	protected String complemento = COMPLEMENTO_EDEFAULT;
	/**
	 * The default value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDADE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected String cidade = CIDADE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUf() <em>Uf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUf()
	 * @generated
	 * @ordered
	 */
	protected static final String UF_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUf() <em>Uf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUf()
	 * @generated
	 * @ordered
	 */
	protected String uf = UF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnderecoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.ENDERECO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCep(String newCep) {
		String oldCep = cep;
		cep = newCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CEP,
					oldCep, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogradouro(String newLogradouro) {
		String oldLogradouro = logradouro;
		logradouro = newLogradouro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__LOGRADOURO, oldLogradouro, logradouro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(Short newNumero) {
		Short oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__NUMERO,
					oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplemento(String newComplemento) {
		String oldComplemento = complemento;
		complemento = newComplemento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__COMPLEMENTO, oldComplemento, complemento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidade(String newCidade) {
		String oldCidade = cidade;
		cidade = newCidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CIDADE,
					oldCidade, cidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUf(String newUf) {
		String oldUf = uf;
		uf = newUf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__UF,
					oldUf, uf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validaCep() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void buscaDadosCep() {
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
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CEP:
			return getCep();
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__LOGRADOURO:
			return getLogradouro();
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__NUMERO:
			return getNumero();
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__COMPLEMENTO:
			return getComplemento();
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CIDADE:
			return getCidade();
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__UF:
			return getUf();
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
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CEP:
			setCep((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__LOGRADOURO:
			setLogradouro((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__NUMERO:
			setNumero((Short) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__COMPLEMENTO:
			setComplemento((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CIDADE:
			setCidade((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__UF:
			setUf((String) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CEP:
			setCep(CEP_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__LOGRADOURO:
			setLogradouro(LOGRADOURO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__NUMERO:
			setNumero(NUMERO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__COMPLEMENTO:
			setComplemento(COMPLEMENTO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CIDADE:
			setCidade(CIDADE_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__UF:
			setUf(UF_EDEFAULT);
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
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CEP:
			return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__LOGRADOURO:
			return LOGRADOURO_EDEFAULT == null ? logradouro != null : !LOGRADOURO_EDEFAULT.equals(logradouro);
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__NUMERO:
			return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__COMPLEMENTO:
			return COMPLEMENTO_EDEFAULT == null ? complemento != null : !COMPLEMENTO_EDEFAULT.equals(complemento);
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__CIDADE:
			return CIDADE_EDEFAULT == null ? cidade != null : !CIDADE_EDEFAULT.equals(cidade);
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO__UF:
			return UF_EDEFAULT == null ? uf != null : !UF_EDEFAULT.equals(uf);
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
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO___VALIDA_CEP:
			return validaCep();
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO___BUSCA_DADOS_CEP:
			buscaDadosCep();
			return null;
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
		result.append(" (cep: ");
		result.append(cep);
		result.append(", logradouro: ");
		result.append(logradouro);
		result.append(", numero: ");
		result.append(numero);
		result.append(", complemento: ");
		result.append(complemento);
		result.append(", cidade: ");
		result.append(cidade);
		result.append(", uf: ");
		result.append(uf);
		result.append(')');
		return result.toString();
	}

} //EnderecoImpl
