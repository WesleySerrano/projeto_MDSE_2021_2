/**
 */
package mDSE_2021_2_Modeling_Project;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage
 * @generated
 */
public interface MDSE_2021_2_Modeling_ProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDSE_2021_2_Modeling_ProjectFactory eINSTANCE = mDSE_2021_2_Modeling_Project.impl.MDSE_2021_2_Modeling_ProjectFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuario</em>'.
	 * @generated
	 */
	Usuario createUsuario();

	/**
	 * Returns a new object of class '<em>Endereco</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endereco</em>'.
	 * @generated
	 */
	Endereco createEndereco();

	/**
	 * Returns a new object of class '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta</em>'.
	 * @generated
	 */
	Meta createMeta();

	/**
	 * Returns a new object of class '<em>Carteira</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carteira</em>'.
	 * @generated
	 */
	Carteira createCarteira();

	/**
	 * Returns a new object of class '<em>Transacao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transacao</em>'.
	 * @generated
	 */
	Transacao createTransacao();

	/**
	 * Returns a new object of class '<em>Salvamento Automatico</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salvamento Automatico</em>'.
	 * @generated
	 */
	SalvamentoAutomatico createSalvamentoAutomatico();

	/**
	 * Returns a new object of class '<em>Cartao De Credito</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartao De Credito</em>'.
	 * @generated
	 */
	CartaoDeCredito createCartaoDeCredito();

	/**
	 * Returns a new object of class '<em>Titulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titulo</em>'.
	 * @generated
	 */
	Titulo createTitulo();

	/**
	 * Returns a new object of class '<em>Conta Bancaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conta Bancaria</em>'.
	 * @generated
	 */
	ContaBancaria createContaBancaria();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MDSE_2021_2_Modeling_ProjectPackage getMDSE_2021_2_Modeling_ProjectPackage();

} //MDSE_2021_2_Modeling_ProjectFactory
