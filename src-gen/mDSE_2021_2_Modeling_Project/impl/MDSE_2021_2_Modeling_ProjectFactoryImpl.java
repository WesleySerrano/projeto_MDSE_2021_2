/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import mDSE_2021_2_Modeling_Project.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDSE_2021_2_Modeling_ProjectFactoryImpl extends EFactoryImpl
		implements MDSE_2021_2_Modeling_ProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MDSE_2021_2_Modeling_ProjectFactory init() {
		try {
			MDSE_2021_2_Modeling_ProjectFactory theMDSE_2021_2_Modeling_ProjectFactory = (MDSE_2021_2_Modeling_ProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(MDSE_2021_2_Modeling_ProjectPackage.eNS_URI);
			if (theMDSE_2021_2_Modeling_ProjectFactory != null) {
				return theMDSE_2021_2_Modeling_ProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MDSE_2021_2_Modeling_ProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSE_2021_2_Modeling_ProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO:
			return createUsuario();
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO:
			return createEndereco();
		case MDSE_2021_2_Modeling_ProjectPackage.META:
			return createMeta();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA:
			return createCarteira();
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO:
			return createTransacao();
		case MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO:
			return createSalvamentoAutomatico();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO:
			return createCartaoDeCredito();
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO:
			return createTitulo();
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA:
			return createContaBancaria();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MDSE_2021_2_Modeling_ProjectPackage.TIPO_DEPOSITO:
			return createTipoDepositoFromString(eDataType, initialValue);
		case MDSE_2021_2_Modeling_ProjectPackage.BANDEIRA_CARTAO:
			return createBandeiraCartaoFromString(eDataType, initialValue);
		case MDSE_2021_2_Modeling_ProjectPackage.LIQUIDEZ_INVESTIMENTO:
			return createLiquidezInvestimentoFromString(eDataType, initialValue);
		case MDSE_2021_2_Modeling_ProjectPackage.PERIODICIDADE_SALVAMENTO_AUTOMATICO:
			return createPeriodicidadeSalvamentoAutomaticoFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MDSE_2021_2_Modeling_ProjectPackage.TIPO_DEPOSITO:
			return convertTipoDepositoToString(eDataType, instanceValue);
		case MDSE_2021_2_Modeling_ProjectPackage.BANDEIRA_CARTAO:
			return convertBandeiraCartaoToString(eDataType, instanceValue);
		case MDSE_2021_2_Modeling_ProjectPackage.LIQUIDEZ_INVESTIMENTO:
			return convertLiquidezInvestimentoToString(eDataType, instanceValue);
		case MDSE_2021_2_Modeling_ProjectPackage.PERIODICIDADE_SALVAMENTO_AUTOMATICO:
			return convertPeriodicidadeSalvamentoAutomaticoToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endereco createEndereco() {
		EnderecoImpl endereco = new EnderecoImpl();
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carteira createCarteira() {
		CarteiraImpl carteira = new CarteiraImpl();
		return carteira;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transacao createTransacao() {
		TransacaoImpl transacao = new TransacaoImpl();
		return transacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalvamentoAutomatico createSalvamentoAutomatico() {
		SalvamentoAutomaticoImpl salvamentoAutomatico = new SalvamentoAutomaticoImpl();
		return salvamentoAutomatico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartaoDeCredito createCartaoDeCredito() {
		CartaoDeCreditoImpl cartaoDeCredito = new CartaoDeCreditoImpl();
		return cartaoDeCredito;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titulo createTitulo() {
		TituloImpl titulo = new TituloImpl();
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaBancaria createContaBancaria() {
		ContaBancariaImpl contaBancaria = new ContaBancariaImpl();
		return contaBancaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDeposito createTipoDepositoFromString(EDataType eDataType, String initialValue) {
		TipoDeposito result = TipoDeposito.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDepositoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandeiraCartao createBandeiraCartaoFromString(EDataType eDataType, String initialValue) {
		BandeiraCartao result = BandeiraCartao.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBandeiraCartaoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiquidezInvestimento createLiquidezInvestimentoFromString(EDataType eDataType, String initialValue) {
		LiquidezInvestimento result = LiquidezInvestimento.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiquidezInvestimentoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicidadeSalvamentoAutomatico createPeriodicidadeSalvamentoAutomaticoFromString(EDataType eDataType,
			String initialValue) {
		PeriodicidadeSalvamentoAutomatico result = PeriodicidadeSalvamentoAutomatico.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodicidadeSalvamentoAutomaticoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSE_2021_2_Modeling_ProjectPackage getMDSE_2021_2_Modeling_ProjectPackage() {
		return (MDSE_2021_2_Modeling_ProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MDSE_2021_2_Modeling_ProjectPackage getPackage() {
		return MDSE_2021_2_Modeling_ProjectPackage.eINSTANCE;
	}

} //MDSE_2021_2_Modeling_ProjectFactoryImpl
