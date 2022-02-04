/**
 */
package mDSE_2021_2_Modeling_Project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salvamento Automatico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.SalvamentoAutomatico#getCartaodecredito <em>Cartaodecredito</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getSalvamentoAutomatico()
 * @model
 * @generated
 */
public interface SalvamentoAutomatico extends EObject {

	/**
	 * Returns the value of the '<em><b>Cartaodecredito</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartaodecredito</em>' reference.
	 * @see #setCartaodecredito(CartaoDeCredito)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getSalvamentoAutomatico_Cartaodecredito()
	 * @model required="true"
	 * @generated
	 */
	CartaoDeCredito getCartaodecredito();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.SalvamentoAutomatico#getCartaodecredito <em>Cartaodecredito</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartaodecredito</em>' reference.
	 * @see #getCartaodecredito()
	 * @generated
	 */
	void setCartaodecredito(CartaoDeCredito value);
} // SalvamentoAutomatico
