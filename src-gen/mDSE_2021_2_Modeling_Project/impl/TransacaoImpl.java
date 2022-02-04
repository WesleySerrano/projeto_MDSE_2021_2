/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import java.lang.reflect.InvocationTargetException;
import javax.xml.datatype.XMLGregorianCalendar;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;
import mDSE_2021_2_Modeling_Project.Transacao;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TransacaoImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.TransacaoImpl#getDataHoraTransacao <em>Data Hora Transacao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransacaoImpl extends MinimalEObjectImpl.Container implements Transacao {
	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected Double valor = VALOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getDataHoraTransacao() <em>Data Hora Transacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataHoraTransacao()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_HORA_TRANSACAO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDataHoraTransacao() <em>Data Hora Transacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataHoraTransacao()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataHoraTransacao = DATA_HORA_TRANSACAO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.TRANSACAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(Double newValor) {
		Double oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__VALOR,
					oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataHoraTransacao() {
		return dataHoraTransacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataHoraTransacao(XMLGregorianCalendar newDataHoraTransacao) {
		XMLGregorianCalendar oldDataHoraTransacao = dataHoraTransacao;
		dataHoraTransacao = newDataHoraTransacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__DATA_HORA_TRANSACAO, oldDataHoraTransacao,
					dataHoraTransacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean transacaoDeDeposito() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__VALOR:
			return getValor();
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__DATA_HORA_TRANSACAO:
			return getDataHoraTransacao();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__VALOR:
			setValor((Double) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__DATA_HORA_TRANSACAO:
			setDataHoraTransacao((XMLGregorianCalendar) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__VALOR:
			setValor(VALOR_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__DATA_HORA_TRANSACAO:
			setDataHoraTransacao(DATA_HORA_TRANSACAO_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__VALOR:
			return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO__DATA_HORA_TRANSACAO:
			return DATA_HORA_TRANSACAO_EDEFAULT == null ? dataHoraTransacao != null
					: !DATA_HORA_TRANSACAO_EDEFAULT.equals(dataHoraTransacao);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO___TRANSACAO_DE_DEPOSITO:
			return transacaoDeDeposito();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (valor: ");
		result.append(valor);
		result.append(", dataHoraTransacao: ");
		result.append(dataHoraTransacao);
		result.append(')');
		return result.toString();
	}

} //TransacaoImpl
