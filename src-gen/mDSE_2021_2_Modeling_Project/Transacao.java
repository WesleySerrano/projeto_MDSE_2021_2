/**
 */
package mDSE_2021_2_Modeling_Project;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Transacao#getValor <em>Valor</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Transacao#getDataHoraTransacao <em>Data Hora Transacao</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTransacao()
 * @model
 * @generated
 */
public interface Transacao extends EObject {

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(Double)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTransacao_Valor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getValor();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Transacao#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(Double value);

	/**
	 * Returns the value of the '<em><b>Data Hora Transacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Hora Transacao</em>' attribute.
	 * @see #setDataHoraTransacao(XMLGregorianCalendar)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTransacao_DataHoraTransacao()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getDataHoraTransacao();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Transacao#getDataHoraTransacao <em>Data Hora Transacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Hora Transacao</em>' attribute.
	 * @see #getDataHoraTransacao()
	 * @generated
	 */
	void setDataHoraTransacao(XMLGregorianCalendar value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean transacaoDeDeposito();
} // Transacao
