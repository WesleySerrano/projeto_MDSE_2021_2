/**
 */
package mDSE_2021_2_Modeling_Project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface MDSE_2021_2_Modeling_ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mDSE_2021_2_Modeling_Project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mDSE_2021_2_Modeling_Project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mDSE_2021_2_Modeling_Project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDSE_2021_2_Modeling_ProjectPackage eINSTANCE = mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.UsuarioImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CPF = 1;

	/**
	 * The feature id for the '<em><b>Nome Mae</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOME_MAE = 2;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DATA_NASCIMENTO = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Senha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__SENHA = 5;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TELEFONE = 6;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO = 7;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__META = 8;

	/**
	 * The feature id for the '<em><b>Carteira</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CARTEIRA = 9;

	/**
	 * The feature id for the '<em><b>Contabancaria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CONTABANCARIA = 10;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Autenticar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___AUTENTICAR__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Validar Dados Na Receita</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___VALIDAR_DADOS_NA_RECEITA = 1;

	/**
	 * The operation id for the '<em>Realizar Deposito</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___REALIZAR_DEPOSITO__META_TITULO_DOUBLE_TIPODEPOSITO = 2;

	/**
	 * The operation id for the '<em>Retirar Valor Ted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___RETIRAR_VALOR_TED__META_DOUBLE_CONTABANCARIA = 3;

	/**
	 * The operation id for the '<em>Retirar Valor Pix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___RETIRAR_VALOR_PIX__META_DOUBLE_STRING = 4;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl <em>Endereco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.EnderecoImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getEndereco()
	 * @generated
	 */
	int ENDERECO = 1;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__CEP = 0;

	/**
	 * The feature id for the '<em><b>Logradouro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__LOGRADOURO = 1;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__NUMERO = 2;

	/**
	 * The feature id for the '<em><b>Complemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__COMPLEMENTO = 3;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__CIDADE = 4;

	/**
	 * The feature id for the '<em><b>Uf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO__UF = 5;

	/**
	 * The number of structural features of the '<em>Endereco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Valida Cep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO___VALIDA_CEP = 0;

	/**
	 * The operation id for the '<em>Busca Dados Cep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO___BUSCA_DADOS_CEP = 1;

	/**
	 * The number of operations of the '<em>Endereco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDERECO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.MetaImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getMeta()
	 * @generated
	 */
	int META = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__NOME = 0;

	/**
	 * The feature id for the '<em><b>Valor Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VALOR_TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Data Criacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__DATA_CRIACAO = 2;

	/**
	 * The feature id for the '<em><b>Valor Depositado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VALOR_DEPOSITADO = 3;

	/**
	 * The feature id for the '<em><b>Transacao</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TRANSACAO = 4;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Obter Estimativa Em Meses Para Conclusao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___OBTER_ESTIMATIVA_EM_MESES_PARA_CONCLUSAO = 0;

	/**
	 * The operation id for the '<em>Obter Valor Medio Depositado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___OBTER_VALOR_MEDIO_DEPOSITADO = 1;

	/**
	 * The operation id for the '<em>Depositar Valor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___DEPOSITAR_VALOR__DOUBLE = 2;

	/**
	 * The operation id for the '<em>Retirar Valor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___RETIRAR_VALOR__DOUBLE = 3;

	/**
	 * The operation id for the '<em>Obter Percentual De Conclusao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___OBTER_PERCENTUAL_DE_CONCLUSAO = 4;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.CarteiraImpl <em>Carteira</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.CarteiraImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getCarteira()
	 * @generated
	 */
	int CARTEIRA = 3;

	/**
	 * The feature id for the '<em><b>Transacao</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA__TRANSACAO = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA__TITULO = 1;

	/**
	 * The feature id for the '<em><b>Salvamentoautomatico</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA__SALVAMENTOAUTOMATICO = 2;

	/**
	 * The feature id for the '<em><b>Valor Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA__VALOR_TOTAL = 3;

	/**
	 * The number of structural features of the '<em>Carteira</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Realizar Retirada</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA___REALIZAR_RETIRADA__TITULO_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Realizar Deposito</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA___REALIZAR_DEPOSITO__TITULO_DOUBLE = 1;

	/**
	 * The number of operations of the '<em>Carteira</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTEIRA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.TransacaoImpl <em>Transacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.TransacaoImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getTransacao()
	 * @generated
	 */
	int TRANSACAO = 4;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__VALOR = 0;

	/**
	 * The feature id for the '<em><b>Data Hora Transacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO__DATA_HORA_TRANSACAO = 1;

	/**
	 * The number of structural features of the '<em>Transacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Transacao De Deposito</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO___TRANSACAO_DE_DEPOSITO = 0;

	/**
	 * The number of operations of the '<em>Transacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACAO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.SalvamentoAutomaticoImpl <em>Salvamento Automatico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.SalvamentoAutomaticoImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getSalvamentoAutomatico()
	 * @generated
	 */
	int SALVAMENTO_AUTOMATICO = 5;

	/**
	 * The feature id for the '<em><b>Cartaodecredito</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALVAMENTO_AUTOMATICO__CARTAODECREDITO = 0;

	/**
	 * The number of structural features of the '<em>Salvamento Automatico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALVAMENTO_AUTOMATICO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Salvamento Automatico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALVAMENTO_AUTOMATICO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl <em>Cartao De Credito</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getCartaoDeCredito()
	 * @generated
	 */
	int CARTAO_DE_CREDITO = 6;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Data Expiracao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO__DATA_EXPIRACAO = 1;

	/**
	 * The feature id for the '<em><b>Cvv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO__CVV = 2;

	/**
	 * The feature id for the '<em><b>Nome Impresso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO__NOME_IMPRESSO = 3;

	/**
	 * The number of structural features of the '<em>Cartao De Credito</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Validar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO___VALIDAR = 0;

	/**
	 * The operation id for the '<em>Obter Bandeira</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO___OBTER_BANDEIRA = 1;

	/**
	 * The number of operations of the '<em>Cartao De Credito</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTAO_DE_CREDITO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl <em>Titulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.TituloImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getTitulo()
	 * @generated
	 */
	int TITULO = 7;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Rentabilidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO__RENTABILIDADE = 1;

	/**
	 * The feature id for the '<em><b>Liquidez</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO__LIQUIDEZ = 2;

	/**
	 * The feature id for the '<em><b>Vencimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO__VENCIMENTO = 3;

	/**
	 * The feature id for the '<em><b>Valor Aplicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO__VALOR_APLICADO = 4;

	/**
	 * The feature id for the '<em><b>Data Primeira Aplicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO__DATA_PRIMEIRA_APLICACAO = 5;

	/**
	 * The number of structural features of the '<em>Titulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Titulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.impl.ContaBancariaImpl <em>Conta Bancaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.impl.ContaBancariaImpl
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getContaBancaria()
	 * @generated
	 */
	int CONTA_BANCARIA = 8;

	/**
	 * The feature id for the '<em><b>Codigo Banco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTA_BANCARIA__CODIGO_BANCO = 0;

	/**
	 * The feature id for the '<em><b>Agencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTA_BANCARIA__AGENCIA = 1;

	/**
	 * The feature id for the '<em><b>Conta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTA_BANCARIA__CONTA = 2;

	/**
	 * The number of structural features of the '<em>Conta Bancaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTA_BANCARIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conta Bancaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTA_BANCARIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.TipoDeposito <em>Tipo Deposito</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.TipoDeposito
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getTipoDeposito()
	 * @generated
	 */
	int TIPO_DEPOSITO = 9;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.BandeiraCartao <em>Bandeira Cartao</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.BandeiraCartao
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getBandeiraCartao()
	 * @generated
	 */
	int BANDEIRA_CARTAO = 10;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.LiquidezInvestimento <em>Liquidez Investimento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.LiquidezInvestimento
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getLiquidezInvestimento()
	 * @generated
	 */
	int LIQUIDEZ_INVESTIMENTO = 11;

	/**
	 * The meta object id for the '{@link mDSE_2021_2_Modeling_Project.PeriodicidadeSalvamentoAutomatico <em>Periodicidade Salvamento Automatico</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mDSE_2021_2_Modeling_Project.PeriodicidadeSalvamentoAutomatico
	 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getPeriodicidadeSalvamentoAutomatico()
	 * @generated
	 */
	int PERIODICIDADE_SALVAMENTO_AUTOMATICO = 12;

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Usuario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nome();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Usuario#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getCpf()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Usuario#getNomeMae <em>Nome Mae</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Mae</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getNomeMae()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_NomeMae();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Usuario#getDataNascimento <em>Data Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Nascimento</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getDataNascimento()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_DataNascimento();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Usuario#getSenha <em>Senha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Senha</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getSenha()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Senha();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Usuario#getTelefone <em>Telefone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefone</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getTelefone()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Telefone();

	/**
	 * Returns the meta object for the reference '{@link mDSE_2021_2_Modeling_Project.Usuario#getEndereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endereco</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getEndereco()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Endereco();

	/**
	 * Returns the meta object for the reference list '{@link mDSE_2021_2_Modeling_Project.Usuario#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getMeta()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Meta();

	/**
	 * Returns the meta object for the reference '{@link mDSE_2021_2_Modeling_Project.Usuario#getCarteira <em>Carteira</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carteira</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getCarteira()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Carteira();

	/**
	 * Returns the meta object for the reference list '{@link mDSE_2021_2_Modeling_Project.Usuario#getContabancaria <em>Contabancaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contabancaria</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#getContabancaria()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Contabancaria();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Usuario#autenticar(java.lang.String, java.lang.String) <em>Autenticar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Autenticar</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#autenticar(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getUsuario__Autenticar__String_String();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Usuario#validarDadosNaReceita() <em>Validar Dados Na Receita</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validar Dados Na Receita</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#validarDadosNaReceita()
	 * @generated
	 */
	EOperation getUsuario__ValidarDadosNaReceita();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Usuario#realizarDeposito(mDSE_2021_2_Modeling_Project.Meta, mDSE_2021_2_Modeling_Project.Titulo, java.lang.Double, mDSE_2021_2_Modeling_Project.TipoDeposito) <em>Realizar Deposito</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizar Deposito</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#realizarDeposito(mDSE_2021_2_Modeling_Project.Meta, mDSE_2021_2_Modeling_Project.Titulo, java.lang.Double, mDSE_2021_2_Modeling_Project.TipoDeposito)
	 * @generated
	 */
	EOperation getUsuario__RealizarDeposito__Meta_Titulo_Double_TipoDeposito();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Usuario#retirarValorTed(mDSE_2021_2_Modeling_Project.Meta, java.lang.Double, mDSE_2021_2_Modeling_Project.ContaBancaria) <em>Retirar Valor Ted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retirar Valor Ted</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#retirarValorTed(mDSE_2021_2_Modeling_Project.Meta, java.lang.Double, mDSE_2021_2_Modeling_Project.ContaBancaria)
	 * @generated
	 */
	EOperation getUsuario__RetirarValorTed__Meta_Double_ContaBancaria();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Usuario#retirarValorPix(mDSE_2021_2_Modeling_Project.Meta, java.lang.Double, java.lang.String) <em>Retirar Valor Pix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retirar Valor Pix</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Usuario#retirarValorPix(mDSE_2021_2_Modeling_Project.Meta, java.lang.Double, java.lang.String)
	 * @generated
	 */
	EOperation getUsuario__RetirarValorPix__Meta_Double_String();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.Endereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endereco</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Endereco
	 * @generated
	 */
	EClass getEndereco();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Endereco#getCep <em>Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#getCep()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Cep();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Endereco#getLogradouro <em>Logradouro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logradouro</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#getLogradouro()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Logradouro();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Endereco#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#getNumero()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Numero();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Endereco#getComplemento <em>Complemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complemento</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#getComplemento()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Complemento();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Endereco#getCidade <em>Cidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidade</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#getCidade()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Cidade();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Endereco#getUf <em>Uf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uf</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#getUf()
	 * @see #getEndereco()
	 * @generated
	 */
	EAttribute getEndereco_Uf();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Endereco#validaCep() <em>Valida Cep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valida Cep</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#validaCep()
	 * @generated
	 */
	EOperation getEndereco__ValidaCep();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Endereco#buscaDadosCep() <em>Busca Dados Cep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Busca Dados Cep</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Endereco#buscaDadosCep()
	 * @generated
	 */
	EOperation getEndereco__BuscaDadosCep();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Meta#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Meta#getNome()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Nome();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Meta#getValorTotal <em>Valor Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Total</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Meta#getValorTotal()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_ValorTotal();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Meta#getDataCriacao <em>Data Criacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Criacao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Meta#getDataCriacao()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_DataCriacao();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Meta#getValorDepositado <em>Valor Depositado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Depositado</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Meta#getValorDepositado()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_ValorDepositado();

	/**
	 * Returns the meta object for the reference list '{@link mDSE_2021_2_Modeling_Project.Meta#getTransacao <em>Transacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transacao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Meta#getTransacao()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Transacao();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Meta#obterEstimativaEmMesesParaConclusao() <em>Obter Estimativa Em Meses Para Conclusao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Obter Estimativa Em Meses Para Conclusao</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Meta#obterEstimativaEmMesesParaConclusao()
	 * @generated
	 */
	EOperation getMeta__ObterEstimativaEmMesesParaConclusao();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Meta#obterValorMedioDepositado() <em>Obter Valor Medio Depositado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Obter Valor Medio Depositado</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Meta#obterValorMedioDepositado()
	 * @generated
	 */
	EOperation getMeta__ObterValorMedioDepositado();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Meta#depositarValor(java.lang.Double) <em>Depositar Valor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Depositar Valor</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Meta#depositarValor(java.lang.Double)
	 * @generated
	 */
	EOperation getMeta__DepositarValor__Double();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Meta#retirarValor(java.lang.Double) <em>Retirar Valor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retirar Valor</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Meta#retirarValor(java.lang.Double)
	 * @generated
	 */
	EOperation getMeta__RetirarValor__Double();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Meta#obterPercentualDeConclusao() <em>Obter Percentual De Conclusao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Obter Percentual De Conclusao</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Meta#obterPercentualDeConclusao()
	 * @generated
	 */
	EOperation getMeta__ObterPercentualDeConclusao();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.Carteira <em>Carteira</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carteira</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Carteira
	 * @generated
	 */
	EClass getCarteira();

	/**
	 * Returns the meta object for the reference list '{@link mDSE_2021_2_Modeling_Project.Carteira#getTransacao <em>Transacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transacao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Carteira#getTransacao()
	 * @see #getCarteira()
	 * @generated
	 */
	EReference getCarteira_Transacao();

	/**
	 * Returns the meta object for the reference list '{@link mDSE_2021_2_Modeling_Project.Carteira#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Titulo</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Carteira#getTitulo()
	 * @see #getCarteira()
	 * @generated
	 */
	EReference getCarteira_Titulo();

	/**
	 * Returns the meta object for the reference '{@link mDSE_2021_2_Modeling_Project.Carteira#getSalvamentoautomatico <em>Salvamentoautomatico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Salvamentoautomatico</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Carteira#getSalvamentoautomatico()
	 * @see #getCarteira()
	 * @generated
	 */
	EReference getCarteira_Salvamentoautomatico();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Carteira#getValorTotal <em>Valor Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Total</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Carteira#getValorTotal()
	 * @see #getCarteira()
	 * @generated
	 */
	EAttribute getCarteira_ValorTotal();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Carteira#realizarRetirada(mDSE_2021_2_Modeling_Project.Titulo, java.lang.Double) <em>Realizar Retirada</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizar Retirada</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Carteira#realizarRetirada(mDSE_2021_2_Modeling_Project.Titulo, java.lang.Double)
	 * @generated
	 */
	EOperation getCarteira__RealizarRetirada__Titulo_Double();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Carteira#realizarDeposito(mDSE_2021_2_Modeling_Project.Titulo, java.lang.Double) <em>Realizar Deposito</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizar Deposito</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Carteira#realizarDeposito(mDSE_2021_2_Modeling_Project.Titulo, java.lang.Double)
	 * @generated
	 */
	EOperation getCarteira__RealizarDeposito__Titulo_Double();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.Transacao <em>Transacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transacao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Transacao
	 * @generated
	 */
	EClass getTransacao();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Transacao#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Transacao#getValor()
	 * @see #getTransacao()
	 * @generated
	 */
	EAttribute getTransacao_Valor();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Transacao#getDataHoraTransacao <em>Data Hora Transacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Hora Transacao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Transacao#getDataHoraTransacao()
	 * @see #getTransacao()
	 * @generated
	 */
	EAttribute getTransacao_DataHoraTransacao();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.Transacao#transacaoDeDeposito() <em>Transacao De Deposito</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transacao De Deposito</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.Transacao#transacaoDeDeposito()
	 * @generated
	 */
	EOperation getTransacao__TransacaoDeDeposito();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.SalvamentoAutomatico <em>Salvamento Automatico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salvamento Automatico</em>'.
	 * @see mDSE_2021_2_Modeling_Project.SalvamentoAutomatico
	 * @generated
	 */
	EClass getSalvamentoAutomatico();

	/**
	 * Returns the meta object for the reference '{@link mDSE_2021_2_Modeling_Project.SalvamentoAutomatico#getCartaodecredito <em>Cartaodecredito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cartaodecredito</em>'.
	 * @see mDSE_2021_2_Modeling_Project.SalvamentoAutomatico#getCartaodecredito()
	 * @see #getSalvamentoAutomatico()
	 * @generated
	 */
	EReference getSalvamentoAutomatico_Cartaodecredito();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito <em>Cartao De Credito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartao De Credito</em>'.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito
	 * @generated
	 */
	EClass getCartaoDeCredito();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNumero()
	 * @see #getCartaoDeCredito()
	 * @generated
	 */
	EAttribute getCartaoDeCredito_Numero();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getDataExpiracao <em>Data Expiracao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Expiracao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito#getDataExpiracao()
	 * @see #getCartaoDeCredito()
	 * @generated
	 */
	EAttribute getCartaoDeCredito_DataExpiracao();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getCvv <em>Cvv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvv</em>'.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito#getCvv()
	 * @see #getCartaoDeCredito()
	 * @generated
	 */
	EAttribute getCartaoDeCredito_Cvv();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNomeImpresso <em>Nome Impresso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Impresso</em>'.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNomeImpresso()
	 * @see #getCartaoDeCredito()
	 * @generated
	 */
	EAttribute getCartaoDeCredito_NomeImpresso();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#validar() <em>Validar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validar</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito#validar()
	 * @generated
	 */
	EOperation getCartaoDeCredito__Validar();

	/**
	 * Returns the meta object for the '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#obterBandeira() <em>Obter Bandeira</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Obter Bandeira</em>' operation.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito#obterBandeira()
	 * @generated
	 */
	EOperation getCartaoDeCredito__ObterBandeira();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.Titulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titulo</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Titulo
	 * @generated
	 */
	EClass getTitulo();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Titulo#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Titulo#getNome()
	 * @see #getTitulo()
	 * @generated
	 */
	EAttribute getTitulo_Nome();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Titulo#getRentabilidade <em>Rentabilidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rentabilidade</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Titulo#getRentabilidade()
	 * @see #getTitulo()
	 * @generated
	 */
	EAttribute getTitulo_Rentabilidade();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Titulo#getLiquidez <em>Liquidez</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liquidez</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Titulo#getLiquidez()
	 * @see #getTitulo()
	 * @generated
	 */
	EAttribute getTitulo_Liquidez();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Titulo#getVencimento <em>Vencimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vencimento</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Titulo#getVencimento()
	 * @see #getTitulo()
	 * @generated
	 */
	EAttribute getTitulo_Vencimento();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Titulo#getValorAplicado <em>Valor Aplicado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Aplicado</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Titulo#getValorAplicado()
	 * @see #getTitulo()
	 * @generated
	 */
	EAttribute getTitulo_ValorAplicado();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.Titulo#getDataPrimeiraAplicacao <em>Data Primeira Aplicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Primeira Aplicacao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.Titulo#getDataPrimeiraAplicacao()
	 * @see #getTitulo()
	 * @generated
	 */
	EAttribute getTitulo_DataPrimeiraAplicacao();

	/**
	 * Returns the meta object for class '{@link mDSE_2021_2_Modeling_Project.ContaBancaria <em>Conta Bancaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conta Bancaria</em>'.
	 * @see mDSE_2021_2_Modeling_Project.ContaBancaria
	 * @generated
	 */
	EClass getContaBancaria();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getCodigoBanco <em>Codigo Banco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Banco</em>'.
	 * @see mDSE_2021_2_Modeling_Project.ContaBancaria#getCodigoBanco()
	 * @see #getContaBancaria()
	 * @generated
	 */
	EAttribute getContaBancaria_CodigoBanco();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getAgencia <em>Agencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agencia</em>'.
	 * @see mDSE_2021_2_Modeling_Project.ContaBancaria#getAgencia()
	 * @see #getContaBancaria()
	 * @generated
	 */
	EAttribute getContaBancaria_Agencia();

	/**
	 * Returns the meta object for the attribute '{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getConta <em>Conta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conta</em>'.
	 * @see mDSE_2021_2_Modeling_Project.ContaBancaria#getConta()
	 * @see #getContaBancaria()
	 * @generated
	 */
	EAttribute getContaBancaria_Conta();

	/**
	 * Returns the meta object for enum '{@link mDSE_2021_2_Modeling_Project.TipoDeposito <em>Tipo Deposito</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Deposito</em>'.
	 * @see mDSE_2021_2_Modeling_Project.TipoDeposito
	 * @generated
	 */
	EEnum getTipoDeposito();

	/**
	 * Returns the meta object for enum '{@link mDSE_2021_2_Modeling_Project.BandeiraCartao <em>Bandeira Cartao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bandeira Cartao</em>'.
	 * @see mDSE_2021_2_Modeling_Project.BandeiraCartao
	 * @generated
	 */
	EEnum getBandeiraCartao();

	/**
	 * Returns the meta object for enum '{@link mDSE_2021_2_Modeling_Project.LiquidezInvestimento <em>Liquidez Investimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Liquidez Investimento</em>'.
	 * @see mDSE_2021_2_Modeling_Project.LiquidezInvestimento
	 * @generated
	 */
	EEnum getLiquidezInvestimento();

	/**
	 * Returns the meta object for enum '{@link mDSE_2021_2_Modeling_Project.PeriodicidadeSalvamentoAutomatico <em>Periodicidade Salvamento Automatico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Periodicidade Salvamento Automatico</em>'.
	 * @see mDSE_2021_2_Modeling_Project.PeriodicidadeSalvamentoAutomatico
	 * @generated
	 */
	EEnum getPeriodicidadeSalvamentoAutomatico();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MDSE_2021_2_Modeling_ProjectFactory getMDSE_2021_2_Modeling_ProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.UsuarioImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOME = eINSTANCE.getUsuario_Nome();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CPF = eINSTANCE.getUsuario_Cpf();

		/**
		 * The meta object literal for the '<em><b>Nome Mae</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOME_MAE = eINSTANCE.getUsuario_NomeMae();

		/**
		 * The meta object literal for the '<em><b>Data Nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__DATA_NASCIMENTO = eINSTANCE.getUsuario_DataNascimento();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>Senha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__SENHA = eINSTANCE.getUsuario_Senha();

		/**
		 * The meta object literal for the '<em><b>Telefone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TELEFONE = eINSTANCE.getUsuario_Telefone();

		/**
		 * The meta object literal for the '<em><b>Endereco</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__ENDERECO = eINSTANCE.getUsuario_Endereco();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__META = eINSTANCE.getUsuario_Meta();

		/**
		 * The meta object literal for the '<em><b>Carteira</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__CARTEIRA = eINSTANCE.getUsuario_Carteira();

		/**
		 * The meta object literal for the '<em><b>Contabancaria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__CONTABANCARIA = eINSTANCE.getUsuario_Contabancaria();

		/**
		 * The meta object literal for the '<em><b>Autenticar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___AUTENTICAR__STRING_STRING = eINSTANCE.getUsuario__Autenticar__String_String();

		/**
		 * The meta object literal for the '<em><b>Validar Dados Na Receita</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___VALIDAR_DADOS_NA_RECEITA = eINSTANCE.getUsuario__ValidarDadosNaReceita();

		/**
		 * The meta object literal for the '<em><b>Realizar Deposito</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___REALIZAR_DEPOSITO__META_TITULO_DOUBLE_TIPODEPOSITO = eINSTANCE
				.getUsuario__RealizarDeposito__Meta_Titulo_Double_TipoDeposito();

		/**
		 * The meta object literal for the '<em><b>Retirar Valor Ted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___RETIRAR_VALOR_TED__META_DOUBLE_CONTABANCARIA = eINSTANCE
				.getUsuario__RetirarValorTed__Meta_Double_ContaBancaria();

		/**
		 * The meta object literal for the '<em><b>Retirar Valor Pix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___RETIRAR_VALOR_PIX__META_DOUBLE_STRING = eINSTANCE
				.getUsuario__RetirarValorPix__Meta_Double_String();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.EnderecoImpl <em>Endereco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.EnderecoImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getEndereco()
		 * @generated
		 */
		EClass ENDERECO = eINSTANCE.getEndereco();

		/**
		 * The meta object literal for the '<em><b>Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__CEP = eINSTANCE.getEndereco_Cep();

		/**
		 * The meta object literal for the '<em><b>Logradouro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__LOGRADOURO = eINSTANCE.getEndereco_Logradouro();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__NUMERO = eINSTANCE.getEndereco_Numero();

		/**
		 * The meta object literal for the '<em><b>Complemento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__COMPLEMENTO = eINSTANCE.getEndereco_Complemento();

		/**
		 * The meta object literal for the '<em><b>Cidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__CIDADE = eINSTANCE.getEndereco_Cidade();

		/**
		 * The meta object literal for the '<em><b>Uf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDERECO__UF = eINSTANCE.getEndereco_Uf();

		/**
		 * The meta object literal for the '<em><b>Valida Cep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDERECO___VALIDA_CEP = eINSTANCE.getEndereco__ValidaCep();

		/**
		 * The meta object literal for the '<em><b>Busca Dados Cep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENDERECO___BUSCA_DADOS_CEP = eINSTANCE.getEndereco__BuscaDadosCep();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.MetaImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__NOME = eINSTANCE.getMeta_Nome();

		/**
		 * The meta object literal for the '<em><b>Valor Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__VALOR_TOTAL = eINSTANCE.getMeta_ValorTotal();

		/**
		 * The meta object literal for the '<em><b>Data Criacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__DATA_CRIACAO = eINSTANCE.getMeta_DataCriacao();

		/**
		 * The meta object literal for the '<em><b>Valor Depositado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__VALOR_DEPOSITADO = eINSTANCE.getMeta_ValorDepositado();

		/**
		 * The meta object literal for the '<em><b>Transacao</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__TRANSACAO = eINSTANCE.getMeta_Transacao();

		/**
		 * The meta object literal for the '<em><b>Obter Estimativa Em Meses Para Conclusao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META___OBTER_ESTIMATIVA_EM_MESES_PARA_CONCLUSAO = eINSTANCE
				.getMeta__ObterEstimativaEmMesesParaConclusao();

		/**
		 * The meta object literal for the '<em><b>Obter Valor Medio Depositado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META___OBTER_VALOR_MEDIO_DEPOSITADO = eINSTANCE.getMeta__ObterValorMedioDepositado();

		/**
		 * The meta object literal for the '<em><b>Depositar Valor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META___DEPOSITAR_VALOR__DOUBLE = eINSTANCE.getMeta__DepositarValor__Double();

		/**
		 * The meta object literal for the '<em><b>Retirar Valor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META___RETIRAR_VALOR__DOUBLE = eINSTANCE.getMeta__RetirarValor__Double();

		/**
		 * The meta object literal for the '<em><b>Obter Percentual De Conclusao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META___OBTER_PERCENTUAL_DE_CONCLUSAO = eINSTANCE.getMeta__ObterPercentualDeConclusao();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.CarteiraImpl <em>Carteira</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.CarteiraImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getCarteira()
		 * @generated
		 */
		EClass CARTEIRA = eINSTANCE.getCarteira();

		/**
		 * The meta object literal for the '<em><b>Transacao</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTEIRA__TRANSACAO = eINSTANCE.getCarteira_Transacao();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTEIRA__TITULO = eINSTANCE.getCarteira_Titulo();

		/**
		 * The meta object literal for the '<em><b>Salvamentoautomatico</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTEIRA__SALVAMENTOAUTOMATICO = eINSTANCE.getCarteira_Salvamentoautomatico();

		/**
		 * The meta object literal for the '<em><b>Valor Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTEIRA__VALOR_TOTAL = eINSTANCE.getCarteira_ValorTotal();

		/**
		 * The meta object literal for the '<em><b>Realizar Retirada</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTEIRA___REALIZAR_RETIRADA__TITULO_DOUBLE = eINSTANCE
				.getCarteira__RealizarRetirada__Titulo_Double();

		/**
		 * The meta object literal for the '<em><b>Realizar Deposito</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTEIRA___REALIZAR_DEPOSITO__TITULO_DOUBLE = eINSTANCE
				.getCarteira__RealizarDeposito__Titulo_Double();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.TransacaoImpl <em>Transacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.TransacaoImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getTransacao()
		 * @generated
		 */
		EClass TRANSACAO = eINSTANCE.getTransacao();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACAO__VALOR = eINSTANCE.getTransacao_Valor();

		/**
		 * The meta object literal for the '<em><b>Data Hora Transacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACAO__DATA_HORA_TRANSACAO = eINSTANCE.getTransacao_DataHoraTransacao();

		/**
		 * The meta object literal for the '<em><b>Transacao De Deposito</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSACAO___TRANSACAO_DE_DEPOSITO = eINSTANCE.getTransacao__TransacaoDeDeposito();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.SalvamentoAutomaticoImpl <em>Salvamento Automatico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.SalvamentoAutomaticoImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getSalvamentoAutomatico()
		 * @generated
		 */
		EClass SALVAMENTO_AUTOMATICO = eINSTANCE.getSalvamentoAutomatico();

		/**
		 * The meta object literal for the '<em><b>Cartaodecredito</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALVAMENTO_AUTOMATICO__CARTAODECREDITO = eINSTANCE.getSalvamentoAutomatico_Cartaodecredito();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl <em>Cartao De Credito</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.CartaoDeCreditoImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getCartaoDeCredito()
		 * @generated
		 */
		EClass CARTAO_DE_CREDITO = eINSTANCE.getCartaoDeCredito();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTAO_DE_CREDITO__NUMERO = eINSTANCE.getCartaoDeCredito_Numero();

		/**
		 * The meta object literal for the '<em><b>Data Expiracao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTAO_DE_CREDITO__DATA_EXPIRACAO = eINSTANCE.getCartaoDeCredito_DataExpiracao();

		/**
		 * The meta object literal for the '<em><b>Cvv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTAO_DE_CREDITO__CVV = eINSTANCE.getCartaoDeCredito_Cvv();

		/**
		 * The meta object literal for the '<em><b>Nome Impresso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTAO_DE_CREDITO__NOME_IMPRESSO = eINSTANCE.getCartaoDeCredito_NomeImpresso();

		/**
		 * The meta object literal for the '<em><b>Validar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTAO_DE_CREDITO___VALIDAR = eINSTANCE.getCartaoDeCredito__Validar();

		/**
		 * The meta object literal for the '<em><b>Obter Bandeira</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTAO_DE_CREDITO___OBTER_BANDEIRA = eINSTANCE.getCartaoDeCredito__ObterBandeira();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.TituloImpl <em>Titulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.TituloImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getTitulo()
		 * @generated
		 */
		EClass TITULO = eINSTANCE.getTitulo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITULO__NOME = eINSTANCE.getTitulo_Nome();

		/**
		 * The meta object literal for the '<em><b>Rentabilidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITULO__RENTABILIDADE = eINSTANCE.getTitulo_Rentabilidade();

		/**
		 * The meta object literal for the '<em><b>Liquidez</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITULO__LIQUIDEZ = eINSTANCE.getTitulo_Liquidez();

		/**
		 * The meta object literal for the '<em><b>Vencimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITULO__VENCIMENTO = eINSTANCE.getTitulo_Vencimento();

		/**
		 * The meta object literal for the '<em><b>Valor Aplicado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITULO__VALOR_APLICADO = eINSTANCE.getTitulo_ValorAplicado();

		/**
		 * The meta object literal for the '<em><b>Data Primeira Aplicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITULO__DATA_PRIMEIRA_APLICACAO = eINSTANCE.getTitulo_DataPrimeiraAplicacao();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.impl.ContaBancariaImpl <em>Conta Bancaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.impl.ContaBancariaImpl
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getContaBancaria()
		 * @generated
		 */
		EClass CONTA_BANCARIA = eINSTANCE.getContaBancaria();

		/**
		 * The meta object literal for the '<em><b>Codigo Banco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTA_BANCARIA__CODIGO_BANCO = eINSTANCE.getContaBancaria_CodigoBanco();

		/**
		 * The meta object literal for the '<em><b>Agencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTA_BANCARIA__AGENCIA = eINSTANCE.getContaBancaria_Agencia();

		/**
		 * The meta object literal for the '<em><b>Conta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTA_BANCARIA__CONTA = eINSTANCE.getContaBancaria_Conta();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.TipoDeposito <em>Tipo Deposito</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.TipoDeposito
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getTipoDeposito()
		 * @generated
		 */
		EEnum TIPO_DEPOSITO = eINSTANCE.getTipoDeposito();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.BandeiraCartao <em>Bandeira Cartao</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.BandeiraCartao
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getBandeiraCartao()
		 * @generated
		 */
		EEnum BANDEIRA_CARTAO = eINSTANCE.getBandeiraCartao();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.LiquidezInvestimento <em>Liquidez Investimento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.LiquidezInvestimento
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getLiquidezInvestimento()
		 * @generated
		 */
		EEnum LIQUIDEZ_INVESTIMENTO = eINSTANCE.getLiquidezInvestimento();

		/**
		 * The meta object literal for the '{@link mDSE_2021_2_Modeling_Project.PeriodicidadeSalvamentoAutomatico <em>Periodicidade Salvamento Automatico</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mDSE_2021_2_Modeling_Project.PeriodicidadeSalvamentoAutomatico
		 * @see mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectPackageImpl#getPeriodicidadeSalvamentoAutomatico()
		 * @generated
		 */
		EEnum PERIODICIDADE_SALVAMENTO_AUTOMATICO = eINSTANCE.getPeriodicidadeSalvamentoAutomatico();

	}

} //MDSE_2021_2_Modeling_ProjectPackage
