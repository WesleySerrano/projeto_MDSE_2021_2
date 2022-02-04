/**
 */
package mDSE_2021_2_Modeling_Project;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Meta#getNome <em>Nome</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Meta#getValorTotal <em>Valor Total</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Meta#getDataCriacao <em>Data Criacao</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Meta#getValorDepositado <em>Valor Depositado</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Meta#getTransacao <em>Transacao</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends EObject {

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getMeta_Nome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Meta#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Valor Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Total</em>' attribute.
	 * @see #setValorTotal(Double)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getMeta_ValorTotal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getValorTotal();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Meta#getValorTotal <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Total</em>' attribute.
	 * @see #getValorTotal()
	 * @generated
	 */
	void setValorTotal(Double value);

	/**
	 * Returns the value of the '<em><b>Data Criacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Criacao</em>' attribute.
	 * @see #setDataCriacao(XMLGregorianCalendar)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getMeta_DataCriacao()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getDataCriacao();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Meta#getDataCriacao <em>Data Criacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Criacao</em>' attribute.
	 * @see #getDataCriacao()
	 * @generated
	 */
	void setDataCriacao(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valor Depositado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Depositado</em>' attribute.
	 * @see #setValorDepositado(Double)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getMeta_ValorDepositado()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getValorDepositado();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Meta#getValorDepositado <em>Valor Depositado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Depositado</em>' attribute.
	 * @see #getValorDepositado()
	 * @generated
	 */
	void setValorDepositado(Double value);

	/**
	 * Returns the value of the '<em><b>Transacao</b></em>' reference list.
	 * The list contents are of type {@link mDSE_2021_2_Modeling_Project.Transacao}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transacao</em>' reference list.
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getMeta_Transacao()
	 * @model
	 * @generated
	 */
	EList<Transacao> getTransacao();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.LongObject"
	 * @generated
	 */
	Long obterEstimativaEmMesesParaConclusao();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double obterValorMedioDepositado();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valorDataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	void depositarValor(Double valor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valorDataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	void retirarValor(Double valor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double obterPercentualDeConclusao();
} // Meta
