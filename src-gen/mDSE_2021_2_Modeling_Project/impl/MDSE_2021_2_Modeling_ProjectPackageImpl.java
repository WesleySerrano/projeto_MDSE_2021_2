/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import mDSE_2021_2_Modeling_Project.BandeiraCartao;
import mDSE_2021_2_Modeling_Project.CartaoDeCredito;
import mDSE_2021_2_Modeling_Project.Carteira;
import mDSE_2021_2_Modeling_Project.ContaBancaria;
import mDSE_2021_2_Modeling_Project.Endereco;
import mDSE_2021_2_Modeling_Project.LiquidezInvestimento;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectFactory;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;
import mDSE_2021_2_Modeling_Project.Meta;
import mDSE_2021_2_Modeling_Project.PeriodicidadeSalvamentoAutomatico;
import mDSE_2021_2_Modeling_Project.SalvamentoAutomatico;
import mDSE_2021_2_Modeling_Project.TipoDeposito;
import mDSE_2021_2_Modeling_Project.Titulo;
import mDSE_2021_2_Modeling_Project.Transacao;
import mDSE_2021_2_Modeling_Project.Usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDSE_2021_2_Modeling_ProjectPackageImpl extends EPackageImpl
		implements MDSE_2021_2_Modeling_ProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enderecoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carteiraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transacaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salvamentoAutomaticoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartaoDeCreditoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tituloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contaBancariaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDepositoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bandeiraCartaoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum liquidezInvestimentoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum periodicidadeSalvamentoAutomaticoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MDSE_2021_2_Modeling_ProjectPackageImpl() {
		super(eNS_URI, MDSE_2021_2_Modeling_ProjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MDSE_2021_2_Modeling_ProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MDSE_2021_2_Modeling_ProjectPackage init() {
		if (isInited)
			return (MDSE_2021_2_Modeling_ProjectPackage) EPackage.Registry.INSTANCE
					.getEPackage(MDSE_2021_2_Modeling_ProjectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMDSE_2021_2_Modeling_ProjectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MDSE_2021_2_Modeling_ProjectPackageImpl theMDSE_2021_2_Modeling_ProjectPackage = registeredMDSE_2021_2_Modeling_ProjectPackage instanceof MDSE_2021_2_Modeling_ProjectPackageImpl
				? (MDSE_2021_2_Modeling_ProjectPackageImpl) registeredMDSE_2021_2_Modeling_ProjectPackage
				: new MDSE_2021_2_Modeling_ProjectPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMDSE_2021_2_Modeling_ProjectPackage.createPackageContents();

		// Initialize created meta-data
		theMDSE_2021_2_Modeling_ProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMDSE_2021_2_Modeling_ProjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MDSE_2021_2_Modeling_ProjectPackage.eNS_URI,
				theMDSE_2021_2_Modeling_ProjectPackage);
		return theMDSE_2021_2_Modeling_ProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Nome() {
		return (EAttribute) usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cpf() {
		return (EAttribute) usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_NomeMae() {
		return (EAttribute) usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_DataNascimento() {
		return (EAttribute) usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Email() {
		return (EAttribute) usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Senha() {
		return (EAttribute) usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Telefone() {
		return (EAttribute) usuarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_Endereco() {
		return (EReference) usuarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_Meta() {
		return (EReference) usuarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_Carteira() {
		return (EReference) usuarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_Contabancaria() {
		return (EReference) usuarioEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__Autenticar__String_String() {
		return usuarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__ValidarDadosNaReceita() {
		return usuarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__RealizarDeposito__Meta_Titulo_Double_TipoDeposito() {
		return usuarioEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__RetirarValorTed__Meta_Double_ContaBancaria() {
		return usuarioEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__RetirarValorPix__Meta_Double_String() {
		return usuarioEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndereco() {
		return enderecoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Cep() {
		return (EAttribute) enderecoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Logradouro() {
		return (EAttribute) enderecoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Numero() {
		return (EAttribute) enderecoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Complemento() {
		return (EAttribute) enderecoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Cidade() {
		return (EAttribute) enderecoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndereco_Uf() {
		return (EAttribute) enderecoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndereco__ValidaCep() {
		return enderecoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndereco__BuscaDadosCep() {
		return enderecoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Nome() {
		return (EAttribute) metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_ValorTotal() {
		return (EAttribute) metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_DataCriacao() {
		return (EAttribute) metaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_ValorDepositado() {
		return (EAttribute) metaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeta_Transacao() {
		return (EReference) metaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeta__ObterEstimativaEmMesesParaConclusao() {
		return metaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeta__ObterValorMedioDepositado() {
		return metaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeta__DepositarValor__Double() {
		return metaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeta__RetirarValor__Double() {
		return metaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeta__ObterPercentualDeConclusao() {
		return metaEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarteira() {
		return carteiraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarteira_Transacao() {
		return (EReference) carteiraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarteira_Titulo() {
		return (EReference) carteiraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarteira_Salvamentoautomatico() {
		return (EReference) carteiraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarteira_ValorTotal() {
		return (EAttribute) carteiraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarteira__RealizarRetirada__Titulo_Double() {
		return carteiraEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarteira__RealizarDeposito__Titulo_Double() {
		return carteiraEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransacao() {
		return transacaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransacao_Valor() {
		return (EAttribute) transacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransacao_DataHoraTransacao() {
		return (EAttribute) transacaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransacao__TransacaoDeDeposito() {
		return transacaoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalvamentoAutomatico() {
		return salvamentoAutomaticoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalvamentoAutomatico_Cartaodecredito() {
		return (EReference) salvamentoAutomaticoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartaoDeCredito() {
		return cartaoDeCreditoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartaoDeCredito_Numero() {
		return (EAttribute) cartaoDeCreditoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartaoDeCredito_DataExpiracao() {
		return (EAttribute) cartaoDeCreditoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartaoDeCredito_Cvv() {
		return (EAttribute) cartaoDeCreditoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartaoDeCredito_NomeImpresso() {
		return (EAttribute) cartaoDeCreditoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartaoDeCredito__Validar() {
		return cartaoDeCreditoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartaoDeCredito__ObterBandeira() {
		return cartaoDeCreditoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitulo() {
		return tituloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitulo_Nome() {
		return (EAttribute) tituloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitulo_Rentabilidade() {
		return (EAttribute) tituloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitulo_Liquidez() {
		return (EAttribute) tituloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitulo_Vencimento() {
		return (EAttribute) tituloEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitulo_ValorAplicado() {
		return (EAttribute) tituloEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitulo_DataPrimeiraAplicacao() {
		return (EAttribute) tituloEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContaBancaria() {
		return contaBancariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaBancaria_CodigoBanco() {
		return (EAttribute) contaBancariaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaBancaria_Agencia() {
		return (EAttribute) contaBancariaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaBancaria_Conta() {
		return (EAttribute) contaBancariaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDeposito() {
		return tipoDepositoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBandeiraCartao() {
		return bandeiraCartaoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiquidezInvestimento() {
		return liquidezInvestimentoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPeriodicidadeSalvamentoAutomatico() {
		return periodicidadeSalvamentoAutomaticoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSE_2021_2_Modeling_ProjectFactory getMDSE_2021_2_Modeling_ProjectFactory() {
		return (MDSE_2021_2_Modeling_ProjectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__NOME);
		createEAttribute(usuarioEClass, USUARIO__CPF);
		createEAttribute(usuarioEClass, USUARIO__NOME_MAE);
		createEAttribute(usuarioEClass, USUARIO__DATA_NASCIMENTO);
		createEAttribute(usuarioEClass, USUARIO__EMAIL);
		createEAttribute(usuarioEClass, USUARIO__SENHA);
		createEAttribute(usuarioEClass, USUARIO__TELEFONE);
		createEReference(usuarioEClass, USUARIO__ENDERECO);
		createEReference(usuarioEClass, USUARIO__META);
		createEReference(usuarioEClass, USUARIO__CARTEIRA);
		createEReference(usuarioEClass, USUARIO__CONTABANCARIA);
		createEOperation(usuarioEClass, USUARIO___AUTENTICAR__STRING_STRING);
		createEOperation(usuarioEClass, USUARIO___VALIDAR_DADOS_NA_RECEITA);
		createEOperation(usuarioEClass, USUARIO___REALIZAR_DEPOSITO__META_TITULO_DOUBLE_TIPODEPOSITO);
		createEOperation(usuarioEClass, USUARIO___RETIRAR_VALOR_TED__META_DOUBLE_CONTABANCARIA);
		createEOperation(usuarioEClass, USUARIO___RETIRAR_VALOR_PIX__META_DOUBLE_STRING);

		enderecoEClass = createEClass(ENDERECO);
		createEAttribute(enderecoEClass, ENDERECO__CEP);
		createEAttribute(enderecoEClass, ENDERECO__LOGRADOURO);
		createEAttribute(enderecoEClass, ENDERECO__NUMERO);
		createEAttribute(enderecoEClass, ENDERECO__COMPLEMENTO);
		createEAttribute(enderecoEClass, ENDERECO__CIDADE);
		createEAttribute(enderecoEClass, ENDERECO__UF);
		createEOperation(enderecoEClass, ENDERECO___VALIDA_CEP);
		createEOperation(enderecoEClass, ENDERECO___BUSCA_DADOS_CEP);

		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__NOME);
		createEAttribute(metaEClass, META__VALOR_TOTAL);
		createEAttribute(metaEClass, META__DATA_CRIACAO);
		createEAttribute(metaEClass, META__VALOR_DEPOSITADO);
		createEReference(metaEClass, META__TRANSACAO);
		createEOperation(metaEClass, META___OBTER_ESTIMATIVA_EM_MESES_PARA_CONCLUSAO);
		createEOperation(metaEClass, META___OBTER_VALOR_MEDIO_DEPOSITADO);
		createEOperation(metaEClass, META___DEPOSITAR_VALOR__DOUBLE);
		createEOperation(metaEClass, META___RETIRAR_VALOR__DOUBLE);
		createEOperation(metaEClass, META___OBTER_PERCENTUAL_DE_CONCLUSAO);

		carteiraEClass = createEClass(CARTEIRA);
		createEReference(carteiraEClass, CARTEIRA__TRANSACAO);
		createEReference(carteiraEClass, CARTEIRA__TITULO);
		createEReference(carteiraEClass, CARTEIRA__SALVAMENTOAUTOMATICO);
		createEAttribute(carteiraEClass, CARTEIRA__VALOR_TOTAL);
		createEOperation(carteiraEClass, CARTEIRA___REALIZAR_RETIRADA__TITULO_DOUBLE);
		createEOperation(carteiraEClass, CARTEIRA___REALIZAR_DEPOSITO__TITULO_DOUBLE);

		transacaoEClass = createEClass(TRANSACAO);
		createEAttribute(transacaoEClass, TRANSACAO__VALOR);
		createEAttribute(transacaoEClass, TRANSACAO__DATA_HORA_TRANSACAO);
		createEOperation(transacaoEClass, TRANSACAO___TRANSACAO_DE_DEPOSITO);

		salvamentoAutomaticoEClass = createEClass(SALVAMENTO_AUTOMATICO);
		createEReference(salvamentoAutomaticoEClass, SALVAMENTO_AUTOMATICO__CARTAODECREDITO);

		cartaoDeCreditoEClass = createEClass(CARTAO_DE_CREDITO);
		createEAttribute(cartaoDeCreditoEClass, CARTAO_DE_CREDITO__NUMERO);
		createEAttribute(cartaoDeCreditoEClass, CARTAO_DE_CREDITO__DATA_EXPIRACAO);
		createEAttribute(cartaoDeCreditoEClass, CARTAO_DE_CREDITO__CVV);
		createEAttribute(cartaoDeCreditoEClass, CARTAO_DE_CREDITO__NOME_IMPRESSO);
		createEOperation(cartaoDeCreditoEClass, CARTAO_DE_CREDITO___VALIDAR);
		createEOperation(cartaoDeCreditoEClass, CARTAO_DE_CREDITO___OBTER_BANDEIRA);

		tituloEClass = createEClass(TITULO);
		createEAttribute(tituloEClass, TITULO__NOME);
		createEAttribute(tituloEClass, TITULO__RENTABILIDADE);
		createEAttribute(tituloEClass, TITULO__LIQUIDEZ);
		createEAttribute(tituloEClass, TITULO__VENCIMENTO);
		createEAttribute(tituloEClass, TITULO__VALOR_APLICADO);
		createEAttribute(tituloEClass, TITULO__DATA_PRIMEIRA_APLICACAO);

		contaBancariaEClass = createEClass(CONTA_BANCARIA);
		createEAttribute(contaBancariaEClass, CONTA_BANCARIA__CODIGO_BANCO);
		createEAttribute(contaBancariaEClass, CONTA_BANCARIA__AGENCIA);
		createEAttribute(contaBancariaEClass, CONTA_BANCARIA__CONTA);

		// Create enums
		tipoDepositoEEnum = createEEnum(TIPO_DEPOSITO);
		bandeiraCartaoEEnum = createEEnum(BANDEIRA_CARTAO);
		liquidezInvestimentoEEnum = createEEnum(LIQUIDEZ_INVESTIMENTO);
		periodicidadeSalvamentoAutomaticoEEnum = createEEnum(PERIODICIDADE_SALVAMENTO_AUTOMATICO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_Nome(), theXMLTypePackage.getString(), "nome", null, 0, 1, Usuario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getUsuario_Cpf(), theXMLTypePackage.getString(), "cpf", null, 0, 1, Usuario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_NomeMae(), theXMLTypePackage.getString(), "nomeMae", null, 0, 1, Usuario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_DataNascimento(), theXMLTypePackage.getDate(), "dataNascimento", null, 0, 1,
				Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Email(), theXMLTypePackage.getString(), "email", null, 0, 1, Usuario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Senha(), theXMLTypePackage.getString(), "senha", null, 0, 1, Usuario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Telefone(), theXMLTypePackage.getString(), "telefone", null, 0, 1, Usuario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Endereco(), this.getEndereco(), null, "endereco", null, 0, 1, Usuario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Meta(), this.getMeta(), null, "meta", null, 0, -1, Usuario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUsuario_Carteira(), this.getCarteira(), null, "carteira", null, 1, 1, Usuario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Contabancaria(), this.getContaBancaria(), null, "contabancaria", null, 0, -1,
				Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUsuario__Autenticar__String_String(), theXMLTypePackage.getBooleanObject(),
				"autenticar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "email", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "senha", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUsuario__ValidarDadosNaReceita(), theXMLTypePackage.getBooleanObject(),
				"validarDadosNaReceita", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsuario__RealizarDeposito__Meta_Titulo_Double_TipoDeposito(), null, "realizarDeposito",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMeta(), "meta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTitulo(), "titulo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDoubleObject(), "valor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTipoDeposito(), "tipoDeposito", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsuario__RetirarValorTed__Meta_Double_ContaBancaria(), null, "retirarValorTed", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMeta(), "meta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDoubleObject(), "valor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContaBancaria(), "contaRetirada", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsuario__RetirarValorPix__Meta_Double_String(), null, "retirarValorPix", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getMeta(), "meta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDoubleObject(), "valor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "chavePix", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enderecoEClass, Endereco.class, "Endereco", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndereco_Cep(), theXMLTypePackage.getString(), "cep", null, 0, 1, Endereco.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndereco_Logradouro(), theXMLTypePackage.getString(), "logradouro", null, 0, 1,
				Endereco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndereco_Numero(), theXMLTypePackage.getShortObject(), "numero", null, 0, 1, Endereco.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndereco_Complemento(), theXMLTypePackage.getString(), "complemento", null, 0, 1,
				Endereco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndereco_Cidade(), theXMLTypePackage.getString(), "cidade", null, 0, 1, Endereco.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndereco_Uf(), theXMLTypePackage.getString(), "uf", null, 0, 1, Endereco.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEndereco__ValidaCep(), theXMLTypePackage.getBoolean(), "validaCep", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getEndereco__BuscaDadosCep(), null, "buscaDadosCep", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Nome(), theXMLTypePackage.getString(), "nome", null, 0, 1, Meta.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_ValorTotal(), theXMLTypePackage.getDoubleObject(), "valorTotal", null, 0, 1, Meta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_DataCriacao(), theXMLTypePackage.getDate(), "dataCriacao", null, 0, 1, Meta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_ValorDepositado(), theXMLTypePackage.getDoubleObject(), "valorDepositado", null, 0, 1,
				Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMeta_Transacao(), this.getTransacao(), null, "transacao", null, 0, -1, Meta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMeta__ObterEstimativaEmMesesParaConclusao(), theXMLTypePackage.getLongObject(),
				"obterEstimativaEmMesesParaConclusao", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeta__ObterValorMedioDepositado(), theXMLTypePackage.getDoubleObject(),
				"obterValorMedioDepositado", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMeta__DepositarValor__Double(), null, "depositarValor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDoubleObject(), "valor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMeta__RetirarValor__Double(), null, "retirarValor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDoubleObject(), "valor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeta__ObterPercentualDeConclusao(), theXMLTypePackage.getDoubleObject(),
				"obterPercentualDeConclusao", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(carteiraEClass, Carteira.class, "Carteira", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarteira_Transacao(), this.getTransacao(), null, "transacao", null, 0, -1, Carteira.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarteira_Titulo(), this.getTitulo(), null, "titulo", null, 0, -1, Carteira.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarteira_Salvamentoautomatico(), this.getSalvamentoAutomatico(), null, "salvamentoautomatico",
				null, 0, 1, Carteira.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarteira_ValorTotal(), theXMLTypePackage.getDoubleObject(), "valorTotal", null, 0, 1,
				Carteira.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCarteira__RealizarRetirada__Titulo_Double(), null, "realizarRetirada", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getTitulo(), "titulo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDoubleObject(), "valor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCarteira__RealizarDeposito__Titulo_Double(), null, "realizarDeposito", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getTitulo(), "titulo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getDoubleObject(), "valor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transacaoEClass, Transacao.class, "Transacao", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransacao_Valor(), theXMLTypePackage.getDoubleObject(), "valor", null, 0, 1, Transacao.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransacao_DataHoraTransacao(), theXMLTypePackage.getDateTime(), "dataHoraTransacao", null, 0,
				1, Transacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getTransacao__TransacaoDeDeposito(), theXMLTypePackage.getBooleanObject(), "transacaoDeDeposito",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(salvamentoAutomaticoEClass, SalvamentoAutomatico.class, "SalvamentoAutomatico", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalvamentoAutomatico_Cartaodecredito(), this.getCartaoDeCredito(), null, "cartaodecredito",
				null, 1, 1, SalvamentoAutomatico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartaoDeCreditoEClass, CartaoDeCredito.class, "CartaoDeCredito", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartaoDeCredito_Numero(), theXMLTypePackage.getString(), "numero", null, 0, 1,
				CartaoDeCredito.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartaoDeCredito_DataExpiracao(), theXMLTypePackage.getDate(), "dataExpiracao", null, 0, 1,
				CartaoDeCredito.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartaoDeCredito_Cvv(), theXMLTypePackage.getString(), "cvv", null, 0, 1,
				CartaoDeCredito.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartaoDeCredito_NomeImpresso(), theXMLTypePackage.getString(), "nomeImpresso", null, 0, 1,
				CartaoDeCredito.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getCartaoDeCredito__Validar(), theXMLTypePackage.getBooleanObject(), "validar", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCartaoDeCredito__ObterBandeira(), this.getBandeiraCartao(), "obterBandeira", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(tituloEClass, Titulo.class, "Titulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitulo_Nome(), theXMLTypePackage.getString(), "nome", null, 0, 1, Titulo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitulo_Rentabilidade(), theXMLTypePackage.getDoubleObject(), "rentabilidade", null, 0, 1,
				Titulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitulo_Liquidez(), this.getLiquidezInvestimento(), "liquidez", null, 0, 1, Titulo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitulo_Vencimento(), theXMLTypePackage.getDate(), "vencimento", null, 0, 1, Titulo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitulo_ValorAplicado(), theXMLTypePackage.getDoubleObject(), "valorAplicado", null, 0, 1,
				Titulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitulo_DataPrimeiraAplicacao(), theXMLTypePackage.getDate(), "dataPrimeiraAplicacao", null, 0,
				1, Titulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(contaBancariaEClass, ContaBancaria.class, "ContaBancaria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContaBancaria_CodigoBanco(), theXMLTypePackage.getString(), "codigoBanco", null, 0, 1,
				ContaBancaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContaBancaria_Agencia(), theXMLTypePackage.getString(), "agencia", null, 0, 1,
				ContaBancaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContaBancaria_Conta(), theXMLTypePackage.getString(), "conta", null, 0, 1,
				ContaBancaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoDepositoEEnum, TipoDeposito.class, "TipoDeposito");
		addEEnumLiteral(tipoDepositoEEnum, TipoDeposito.PIX);
		addEEnumLiteral(tipoDepositoEEnum, TipoDeposito.TED);
		addEEnumLiteral(tipoDepositoEEnum, TipoDeposito.BOLETO);

		initEEnum(bandeiraCartaoEEnum, BandeiraCartao.class, "BandeiraCartao");

		initEEnum(liquidezInvestimentoEEnum, LiquidezInvestimento.class, "LiquidezInvestimento");
		addEEnumLiteral(liquidezInvestimentoEEnum, LiquidezInvestimento.DIARIA);
		addEEnumLiteral(liquidezInvestimentoEEnum, LiquidezInvestimento.VENCIMENTO);

		initEEnum(periodicidadeSalvamentoAutomaticoEEnum, PeriodicidadeSalvamentoAutomatico.class,
				"PeriodicidadeSalvamentoAutomatico");
		addEEnumLiteral(periodicidadeSalvamentoAutomaticoEEnum, PeriodicidadeSalvamentoAutomatico.SEMANAL);
		addEEnumLiteral(periodicidadeSalvamentoAutomaticoEEnum, PeriodicidadeSalvamentoAutomatico.MENSAL);

		// Create resource
		createResource(eNS_URI);
	}

} //MDSE_2021_2_Modeling_ProjectPackageImpl
