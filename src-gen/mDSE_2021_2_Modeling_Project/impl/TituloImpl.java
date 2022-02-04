/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import javax.xml.datatype.XMLGregorianCalendar;
import mDSE_2021_2_Modeling_Project.LiquidezInvestimento;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;
import mDSE_2021_2_Modeling_Project.Titulo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Titulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl#getRentabilidade <em>Rentabilidade</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl#getLiquidez <em>Liquidez</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl#getVencimento <em>Vencimento</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl#getValorAplicado <em>Valor Aplicado</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl#getDataPrimeiraAplicacao <em>Data Primeira Aplicacao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TituloImpl extends MinimalEObjectImpl.Container implements Titulo {
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
	 * The default value of the '{@link #getRentabilidade() <em>Rentabilidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentabilidade()
	 * @generated
	 * @ordered
	 */
	protected static final Double RENTABILIDADE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRentabilidade() <em>Rentabilidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentabilidade()
	 * @generated
	 * @ordered
	 */
	protected Double rentabilidade = RENTABILIDADE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLiquidez() <em>Liquidez</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiquidez()
	 * @generated
	 * @ordered
	 */
	protected static final LiquidezInvestimento LIQUIDEZ_EDEFAULT = LiquidezInvestimento.DIARIA;
	/**
	 * The cached value of the '{@link #getLiquidez() <em>Liquidez</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiquidez()
	 * @generated
	 * @ordered
	 */
	protected LiquidezInvestimento liquidez = LIQUIDEZ_EDEFAULT;
	/**
	 * The default value of the '{@link #getVencimento() <em>Vencimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVencimento()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VENCIMENTO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVencimento() <em>Vencimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVencimento()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar vencimento = VENCIMENTO_EDEFAULT;
	/**
	 * The default value of the '{@link #getValorAplicado() <em>Valor Aplicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAplicado()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALOR_APLICADO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValorAplicado() <em>Valor Aplicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAplicado()
	 * @generated
	 * @ordered
	 */
	protected Double valorAplicado = VALOR_APLICADO_EDEFAULT;
	/**
	 * The default value of the '{@link #getDataPrimeiraAplicacao() <em>Data Primeira Aplicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPrimeiraAplicacao()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_PRIMEIRA_APLICACAO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDataPrimeiraAplicacao() <em>Data Primeira Aplicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPrimeiraAplicacao()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataPrimeiraAplicacao = DATA_PRIMEIRA_APLICACAO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TituloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.TITULO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.TITULO__NOME,
					oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRentabilidade() {
		return rentabilidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRentabilidade(Double newRentabilidade) {
		Double oldRentabilidade = rentabilidade;
		rentabilidade = newRentabilidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.TITULO__RENTABILIDADE, oldRentabilidade, rentabilidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiquidezInvestimento getLiquidez() {
		return liquidez;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiquidez(LiquidezInvestimento newLiquidez) {
		LiquidezInvestimento oldLiquidez = liquidez;
		liquidez = newLiquidez == null ? LIQUIDEZ_EDEFAULT : newLiquidez;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.TITULO__LIQUIDEZ,
					oldLiquidez, liquidez));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVencimento() {
		return vencimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVencimento(XMLGregorianCalendar newVencimento) {
		XMLGregorianCalendar oldVencimento = vencimento;
		vencimento = newVencimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.TITULO__VENCIMENTO, oldVencimento, vencimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValorAplicado() {
		return valorAplicado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorAplicado(Double newValorAplicado) {
		Double oldValorAplicado = valorAplicado;
		valorAplicado = newValorAplicado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.TITULO__VALOR_APLICADO, oldValorAplicado, valorAplicado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataPrimeiraAplicacao() {
		return dataPrimeiraAplicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPrimeiraAplicacao(XMLGregorianCalendar newDataPrimeiraAplicacao) {
		XMLGregorianCalendar oldDataPrimeiraAplicacao = dataPrimeiraAplicacao;
		dataPrimeiraAplicacao = newDataPrimeiraAplicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.TITULO__DATA_PRIMEIRA_APLICACAO, oldDataPrimeiraAplicacao,
					dataPrimeiraAplicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__NOME:
			return getNome();
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__RENTABILIDADE:
			return getRentabilidade();
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__LIQUIDEZ:
			return getLiquidez();
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VENCIMENTO:
			return getVencimento();
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VALOR_APLICADO:
			return getValorAplicado();
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__DATA_PRIMEIRA_APLICACAO:
			return getDataPrimeiraAplicacao();
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
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__NOME:
			setNome((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__RENTABILIDADE:
			setRentabilidade((Double) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__LIQUIDEZ:
			setLiquidez((LiquidezInvestimento) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VENCIMENTO:
			setVencimento((XMLGregorianCalendar) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VALOR_APLICADO:
			setValorAplicado((Double) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__DATA_PRIMEIRA_APLICACAO:
			setDataPrimeiraAplicacao((XMLGregorianCalendar) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__RENTABILIDADE:
			setRentabilidade(RENTABILIDADE_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__LIQUIDEZ:
			setLiquidez(LIQUIDEZ_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VENCIMENTO:
			setVencimento(VENCIMENTO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VALOR_APLICADO:
			setValorAplicado(VALOR_APLICADO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__DATA_PRIMEIRA_APLICACAO:
			setDataPrimeiraAplicacao(DATA_PRIMEIRA_APLICACAO_EDEFAULT);
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
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__RENTABILIDADE:
			return RENTABILIDADE_EDEFAULT == null ? rentabilidade != null
					: !RENTABILIDADE_EDEFAULT.equals(rentabilidade);
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__LIQUIDEZ:
			return liquidez != LIQUIDEZ_EDEFAULT;
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VENCIMENTO:
			return VENCIMENTO_EDEFAULT == null ? vencimento != null : !VENCIMENTO_EDEFAULT.equals(vencimento);
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__VALOR_APLICADO:
			return VALOR_APLICADO_EDEFAULT == null ? valorAplicado != null
					: !VALOR_APLICADO_EDEFAULT.equals(valorAplicado);
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO__DATA_PRIMEIRA_APLICACAO:
			return DATA_PRIMEIRA_APLICACAO_EDEFAULT == null ? dataPrimeiraAplicacao != null
					: !DATA_PRIMEIRA_APLICACAO_EDEFAULT.equals(dataPrimeiraAplicacao);
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(", rentabilidade: ");
		result.append(rentabilidade);
		result.append(", liquidez: ");
		result.append(liquidez);
		result.append(", vencimento: ");
		result.append(vencimento);
		result.append(", valorAplicado: ");
		result.append(valorAplicado);
		result.append(", dataPrimeiraAplicacao: ");
		result.append(dataPrimeiraAplicacao);
		result.append(')');
		return result.toString();
	}

} //TituloImpl
