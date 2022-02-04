/**
 */
package mDSE_2021_2_Modeling_Project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endereco</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Endereco#getCep <em>Cep</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Endereco#getLogradouro <em>Logradouro</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Endereco#getNumero <em>Numero</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Endereco#getComplemento <em>Complemento</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Endereco#getCidade <em>Cidade</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Endereco#getUf <em>Uf</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getEndereco()
 * @model
 * @generated
 */
public interface Endereco extends EObject {

	/**
	 * Returns the value of the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cep</em>' attribute.
	 * @see #setCep(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getEndereco_Cep()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCep();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Endereco#getCep <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cep</em>' attribute.
	 * @see #getCep()
	 * @generated
	 */
	void setCep(String value);

	/**
	 * Returns the value of the '<em><b>Logradouro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logradouro</em>' attribute.
	 * @see #setLogradouro(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getEndereco_Logradouro()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLogradouro();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Endereco#getLogradouro <em>Logradouro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logradouro</em>' attribute.
	 * @see #getLogradouro()
	 * @generated
	 */
	void setLogradouro(String value);

	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(Short)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getEndereco_Numero()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ShortObject"
	 * @generated
	 */
	Short getNumero();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Endereco#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(Short value);

	/**
	 * Returns the value of the '<em><b>Complemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complemento</em>' attribute.
	 * @see #setComplemento(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getEndereco_Complemento()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComplemento();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Endereco#getComplemento <em>Complemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complemento</em>' attribute.
	 * @see #getComplemento()
	 * @generated
	 */
	void setComplemento(String value);

	/**
	 * Returns the value of the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidade</em>' attribute.
	 * @see #setCidade(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getEndereco_Cidade()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCidade();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Endereco#getCidade <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidade</em>' attribute.
	 * @see #getCidade()
	 * @generated
	 */
	void setCidade(String value);

	/**
	 * Returns the value of the '<em><b>Uf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uf</em>' attribute.
	 * @see #setUf(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getEndereco_Uf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUf();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Endereco#getUf <em>Uf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uf</em>' attribute.
	 * @see #getUf()
	 * @generated
	 */
	void setUf(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean validaCep();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buscaDadosCep();
} // Endereco
