/**
 */
package mDSE_2021_2_Modeling_Project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conta Bancaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getCodigoBanco <em>Codigo Banco</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getAgencia <em>Agencia</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getConta <em>Conta</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getContaBancaria()
 * @model
 * @generated
 */
public interface ContaBancaria extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo Banco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Banco</em>' attribute.
	 * @see #setCodigoBanco(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getContaBancaria_CodigoBanco()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCodigoBanco();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getCodigoBanco <em>Codigo Banco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Banco</em>' attribute.
	 * @see #getCodigoBanco()
	 * @generated
	 */
	void setCodigoBanco(String value);

	/**
	 * Returns the value of the '<em><b>Agencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agencia</em>' attribute.
	 * @see #setAgencia(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getContaBancaria_Agencia()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getAgencia();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getAgencia <em>Agencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agencia</em>' attribute.
	 * @see #getAgencia()
	 * @generated
	 */
	void setAgencia(String value);

	/**
	 * Returns the value of the '<em><b>Conta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conta</em>' attribute.
	 * @see #setConta(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getContaBancaria_Conta()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getConta();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.ContaBancaria#getConta <em>Conta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conta</em>' attribute.
	 * @see #getConta()
	 * @generated
	 */
	void setConta(String value);

} // ContaBancaria
