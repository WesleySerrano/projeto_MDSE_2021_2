/**
 */
package mDSE_2021_2_Modeling_Project;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getNome <em>Nome</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getCpf <em>Cpf</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getNomeMae <em>Nome Mae</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getEmail <em>Email</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getSenha <em>Senha</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getMeta <em>Meta</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getCarteira <em>Carteira</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Usuario#getContabancaria <em>Contabancaria</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Nome()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpf</em>' attribute.
	 * @see #setCpf(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Cpf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCpf();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(String value);

	/**
	 * Returns the value of the '<em><b>Nome Mae</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Mae</em>' attribute.
	 * @see #setNomeMae(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_NomeMae()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNomeMae();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getNomeMae <em>Nome Mae</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Mae</em>' attribute.
	 * @see #getNomeMae()
	 * @generated
	 */
	void setNomeMae(String value);

	/**
	 * Returns the value of the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Nascimento</em>' attribute.
	 * @see #setDataNascimento(XMLGregorianCalendar)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_DataNascimento()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getDataNascimento();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getDataNascimento <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Nascimento</em>' attribute.
	 * @see #getDataNascimento()
	 * @generated
	 */
	void setDataNascimento(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Email()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Senha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senha</em>' attribute.
	 * @see #setSenha(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Senha()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSenha();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getSenha <em>Senha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Senha</em>' attribute.
	 * @see #getSenha()
	 * @generated
	 */
	void setSenha(String value);

	/**
	 * Returns the value of the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefone</em>' attribute.
	 * @see #setTelefone(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Telefone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTelefone();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getTelefone <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefone</em>' attribute.
	 * @see #getTelefone()
	 * @generated
	 */
	void setTelefone(String value);

	/**
	 * Returns the value of the '<em><b>Endereco</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco</em>' reference.
	 * @see #setEndereco(Endereco)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Endereco()
	 * @model
	 * @generated
	 */
	Endereco getEndereco();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getEndereco <em>Endereco</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco</em>' reference.
	 * @see #getEndereco()
	 * @generated
	 */
	void setEndereco(Endereco value);

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' reference list.
	 * The list contents are of type {@link mDSE_2021_2_Modeling_Project.Meta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' reference list.
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Meta()
	 * @model
	 * @generated
	 */
	EList<Meta> getMeta();

	/**
	 * Returns the value of the '<em><b>Carteira</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carteira</em>' reference.
	 * @see #setCarteira(Carteira)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Carteira()
	 * @model required="true"
	 * @generated
	 */
	Carteira getCarteira();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Usuario#getCarteira <em>Carteira</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carteira</em>' reference.
	 * @see #getCarteira()
	 * @generated
	 */
	void setCarteira(Carteira value);

	/**
	 * Returns the value of the '<em><b>Contabancaria</b></em>' reference list.
	 * The list contents are of type {@link mDSE_2021_2_Modeling_Project.ContaBancaria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contabancaria</em>' reference list.
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getUsuario_Contabancaria()
	 * @model
	 * @generated
	 */
	EList<ContaBancaria> getContabancaria();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" emailDataType="org.eclipse.emf.ecore.xml.type.String" senhaDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Boolean autenticar(String email, String senha);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean validarDadosNaReceita();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valorDataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	void realizarDeposito(Meta meta, Titulo titulo, Double valor, TipoDeposito tipoDeposito);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valorDataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	void retirarValorTed(Meta meta, Double valor, ContaBancaria contaRetirada);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valorDataType="org.eclipse.emf.ecore.xml.type.DoubleObject" chavePixDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void retirarValorPix(Meta meta, Double valor, String chavePix);

} // Usuario
