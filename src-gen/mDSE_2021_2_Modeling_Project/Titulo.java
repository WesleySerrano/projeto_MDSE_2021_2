/**
 */
package mDSE_2021_2_Modeling_Project;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Titulo#getNome <em>Nome</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Titulo#getRentabilidade <em>Rentabilidade</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Titulo#getLiquidez <em>Liquidez</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Titulo#getVencimento <em>Vencimento</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Titulo#getValorAplicado <em>Valor Aplicado</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.Titulo#getDataPrimeiraAplicacao <em>Data Primeira Aplicacao</em>}</li>
 * </ul>
 *
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTitulo()
 * @model
 * @generated
 */
public interface Titulo extends EObject {

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTitulo_Nome()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Titulo#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Rentabilidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rentabilidade</em>' attribute.
	 * @see #setRentabilidade(Double)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTitulo_Rentabilidade()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getRentabilidade();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Titulo#getRentabilidade <em>Rentabilidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rentabilidade</em>' attribute.
	 * @see #getRentabilidade()
	 * @generated
	 */
	void setRentabilidade(Double value);

	/**
	 * Returns the value of the '<em><b>Liquidez</b></em>' attribute.
	 * The literals are from the enumeration {@link mDSE_2021_2_Modeling_Project.LiquidezInvestimento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liquidez</em>' attribute.
	 * @see mDSE_2021_2_Modeling_Project.LiquidezInvestimento
	 * @see #setLiquidez(LiquidezInvestimento)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTitulo_Liquidez()
	 * @model
	 * @generated
	 */
	LiquidezInvestimento getLiquidez();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Titulo#getLiquidez <em>Liquidez</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liquidez</em>' attribute.
	 * @see mDSE_2021_2_Modeling_Project.LiquidezInvestimento
	 * @see #getLiquidez()
	 * @generated
	 */
	void setLiquidez(LiquidezInvestimento value);

	/**
	 * Returns the value of the '<em><b>Vencimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vencimento</em>' attribute.
	 * @see #setVencimento(XMLGregorianCalendar)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTitulo_Vencimento()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getVencimento();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Titulo#getVencimento <em>Vencimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vencimento</em>' attribute.
	 * @see #getVencimento()
	 * @generated
	 */
	void setVencimento(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Valor Aplicado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Aplicado</em>' attribute.
	 * @see #setValorAplicado(Double)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTitulo_ValorAplicado()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getValorAplicado();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Titulo#getValorAplicado <em>Valor Aplicado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Aplicado</em>' attribute.
	 * @see #getValorAplicado()
	 * @generated
	 */
	void setValorAplicado(Double value);

	/**
	 * Returns the value of the '<em><b>Data Primeira Aplicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Primeira Aplicacao</em>' attribute.
	 * @see #setDataPrimeiraAplicacao(XMLGregorianCalendar)
	 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getTitulo_DataPrimeiraAplicacao()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getDataPrimeiraAplicacao();

	/**
	 * Sets the value of the '{@link mDSE_2021_2_Modeling_Project.Titulo#getDataPrimeiraAplicacao <em>Data Primeira Aplicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Primeira Aplicacao</em>' attribute.
	 * @see #getDataPrimeiraAplicacao()
	 * @generated
	 */
	void setDataPrimeiraAplicacao(XMLGregorianCalendar value);
} // Titulo
