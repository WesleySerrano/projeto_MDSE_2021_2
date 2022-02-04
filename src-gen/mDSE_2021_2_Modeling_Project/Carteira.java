/**
 */
package mDSE_2021_2_Modeling_Project;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carteira</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Carteira#getTransacao <em>Transacao</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Carteira#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Carteira#getSalvamentoautomatico <em>Salvamentoautomatico</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Carteira#getValorTotal <em>Valor Total</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCarteira()
 * @model
 * @generated
 */
public interface Carteira extends EObject {

	/**
	 * Returns the value of the '<em><b>Transacao</b></em>' reference list.
	 * The list contents are of type {@link mDSE_2021_2_Modeling_Project.Transacao}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transacao</em>' reference list.
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCarteira_Transacao()
	 * @model
	 * @generated
	 */
	EList<Transacao> getTransacao();

	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' reference list.
	 * The list contents are of type {@link mDSE_2021_2_Modeling_Project.Titulo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' reference list.
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCarteira_Titulo()
	 * @model
	 * @generated
	 */
	EList<Titulo> getTitulo();

	/**
	 * Returns the value of the '<em><b>Salvamentoautomatico</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salvamentoautomatico</em>' reference.
	 * @see #setSalvamentoautomatico(SalvamentoAutomatico)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCarteira_Salvamentoautomatico()
	 * @model
	 * @generated
	 */
	SalvamentoAutomatico getSalvamentoautomatico();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Carteira#getSalvamentoautomatico <em>Salvamentoautomatico</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salvamentoautomatico</em>' reference.
	 * @see #getSalvamentoautomatico()
	 * @generated
	 */
	void setSalvamentoautomatico(SalvamentoAutomatico value);

	/**
	 * Returns the value of the '<em><b>Valor Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Total</em>' attribute.
	 * @see #setValorTotal(Double)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getCarteira_ValorTotal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getValorTotal();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Carteira#getValorTotal <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Total</em>' attribute.
	 * @see #getValorTotal()
	 * @generated
	 */
	void setValorTotal(Double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valorDataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	void realizarRetirada(Titulo titulo, Double valor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valorDataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	void realizarDeposito(Titulo titulo, Double valor);
} // Carteira
