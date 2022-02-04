/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;
import mDSE_2021_2_Modeling_Project.Meta;

import mDSE_2021_2_Modeling_Project.Transacao;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.MetaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.MetaImpl#getValorTotal <em>Valor Total</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.MetaImpl#getDataCriacao <em>Data Criacao</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.MetaImpl#getValorDepositado <em>Valor Depositado</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.MetaImpl#getTransacao <em>Transacao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaImpl extends MinimalEObjectImpl.Container implements Meta {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;
	/**
	 * The default value of the '{@link #getValorTotal() <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALOR_TOTAL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValorTotal() <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorTotal()
	 * @generated
	 * @ordered
	 */
	protected Double valorTotal = VALOR_TOTAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getDataCriacao() <em>Data Criacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCriacao()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_CRIACAO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDataCriacao() <em>Data Criacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCriacao()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataCriacao = DATA_CRIACAO_EDEFAULT;
	/**
	 * The default value of the '{@link #getValorDepositado() <em>Valor Depositado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDepositado()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALOR_DEPOSITADO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValorDepositado() <em>Valor Depositado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDepositado()
	 * @generated
	 * @ordered
	 */
	protected Double valorDepositado = VALOR_DEPOSITADO_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTransacao() <em>Transacao</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransacao()
	 * @generated
	 * @ordered
	 */
	protected EList<Transacao> transacao;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.META__NOME,
					oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValorTotal() {
		return valorTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorTotal(Double newValorTotal) {
		Double oldValorTotal = valorTotal;
		valorTotal = newValorTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_TOTAL,
					oldValorTotal, valorTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCriacao(XMLGregorianCalendar newDataCriacao) {
		XMLGregorianCalendar oldDataCriacao = dataCriacao;
		dataCriacao = newDataCriacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.META__DATA_CRIACAO, oldDataCriacao, dataCriacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValorDepositado() {
		return valorDepositado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorDepositado(Double newValorDepositado) {
		Double oldValorDepositado = valorDepositado;
		valorDepositado = newValorDepositado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_DEPOSITADO, oldValorDepositado, valorDepositado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transacao> getTransacao() {
		if (transacao == null) {
			transacao = new EObjectResolvingEList<Transacao>(Transacao.class, this,
					MDSE_2021_2_Modeling_ProjectPackage.META__TRANSACAO);
		}
		return transacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long obterEstimativaEmMesesParaConclusao() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double obterValorMedioDepositado() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void depositarValor(Double valor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void retirarValor(Double valor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double obterPercentualDeConclusao() {
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
		case MDSE_2021_2_Modeling_ProjectPackage.META__NOME:
			return getNome();
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_TOTAL:
			return getValorTotal();
		case MDSE_2021_2_Modeling_ProjectPackage.META__DATA_CRIACAO:
			return getDataCriacao();
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_DEPOSITADO:
			return getValorDepositado();
		case MDSE_2021_2_Modeling_ProjectPackage.META__TRANSACAO:
			return getTransacao();
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
		case MDSE_2021_2_Modeling_ProjectPackage.META__NOME:
			setNome((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_TOTAL:
			setValorTotal((Double) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__DATA_CRIACAO:
			setDataCriacao((XMLGregorianCalendar) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_DEPOSITADO:
			setValorDepositado((Double) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__TRANSACAO:
			getTransacao().clear();
			getTransacao().addAll((Collection<? extends Transacao>) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.META__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_TOTAL:
			setValorTotal(VALOR_TOTAL_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__DATA_CRIACAO:
			setDataCriacao(DATA_CRIACAO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_DEPOSITADO:
			setValorDepositado(VALOR_DEPOSITADO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.META__TRANSACAO:
			getTransacao().clear();
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
		case MDSE_2021_2_Modeling_ProjectPackage.META__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_TOTAL:
			return VALOR_TOTAL_EDEFAULT == null ? valorTotal != null : !VALOR_TOTAL_EDEFAULT.equals(valorTotal);
		case MDSE_2021_2_Modeling_ProjectPackage.META__DATA_CRIACAO:
			return DATA_CRIACAO_EDEFAULT == null ? dataCriacao != null : !DATA_CRIACAO_EDEFAULT.equals(dataCriacao);
		case MDSE_2021_2_Modeling_ProjectPackage.META__VALOR_DEPOSITADO:
			return VALOR_DEPOSITADO_EDEFAULT == null ? valorDepositado != null
					: !VALOR_DEPOSITADO_EDEFAULT.equals(valorDepositado);
		case MDSE_2021_2_Modeling_ProjectPackage.META__TRANSACAO:
			return transacao != null && !transacao.isEmpty();
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
		case MDSE_2021_2_Modeling_ProjectPackage.META___OBTER_ESTIMATIVA_EM_MESES_PARA_CONCLUSAO:
			return obterEstimativaEmMesesParaConclusao();
		case MDSE_2021_2_Modeling_ProjectPackage.META___OBTER_VALOR_MEDIO_DEPOSITADO:
			return obterValorMedioDepositado();
		case MDSE_2021_2_Modeling_ProjectPackage.META___DEPOSITAR_VALOR__DOUBLE:
			depositarValor((Double) arguments.get(0));
			return null;
		case MDSE_2021_2_Modeling_ProjectPackage.META___RETIRAR_VALOR__DOUBLE:
			retirarValor((Double) arguments.get(0));
			return null;
		case MDSE_2021_2_Modeling_ProjectPackage.META___OBTER_PERCENTUAL_DE_CONCLUSAO:
			return obterPercentualDeConclusao();
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(", valorTotal: ");
		result.append(valorTotal);
		result.append(", dataCriacao: ");
		result.append(dataCriacao);
		result.append(", valorDepositado: ");
		result.append(valorDepositado);
		result.append(')');
		return result.toString();
	}

} //MetaImpl
