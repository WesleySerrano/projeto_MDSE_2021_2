/**
 */
package mDSE_2021_2_Modeling_Project;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartao De Credito</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNumero <em>Numero</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getDataExpiracao <em>Data Expiracao</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getCvv <em>Cvv</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNomeImpresso <em>Nome Impresso</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCartaoDeCredito()
 * @model
 * @generated
 */
public interface CartaoDeCredito extends EObject {

	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCartaoDeCredito_Numero()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNumero();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(String value);

	/**
	 * Returns the value of the '<em><b>Data Expiracao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Expiracao</em>' attribute.
	 * @see #setDataExpiracao(XMLGregorianCalendar)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCartaoDeCredito_DataExpiracao()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getDataExpiracao();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getDataExpiracao <em>Data Expiracao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Expiracao</em>' attribute.
	 * @see #getDataExpiracao()
	 * @generated
	 */
	void setDataExpiracao(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Cvv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvv</em>' attribute.
	 * @see #setCvv(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCartaoDeCredito_Cvv()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCvv();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getCvv <em>Cvv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvv</em>' attribute.
	 * @see #getCvv()
	 * @generated
	 */
	void setCvv(String value);

	/**
	 * Returns the value of the '<em><b>Nome Impresso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Impresso</em>' attribute.
	 * @see #setNomeImpresso(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCartaoDeCredito_NomeImpresso()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNomeImpresso();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito#getNomeImpresso <em>Nome Impresso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Impresso</em>' attribute.
	 * @see #getNomeImpresso()
	 * @generated
	 */
	void setNomeImpresso(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean validar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BandeiraCartao obterBandeira();
} // CartaoDeCredito
