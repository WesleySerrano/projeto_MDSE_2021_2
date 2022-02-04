/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import mDSE_2021_2_Modeling_Project.Carteira;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;

import mDSE_2021_2_Modeling_Project.SalvamentoAutomatico;
import mDSE_2021_2_Modeling_Project.Titulo;
import mDSE_2021_2_Modeling_Project.Transacao;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carteira</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CarteiraImpl#getTransacao <em>Transacao</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CarteiraImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CarteiraImpl#getSalvamentoautomatico <em>Salvamentoautomatico</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.CarteiraImpl#getValorTotal <em>Valor Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarteiraImpl extends MinimalEObjectImpl.Container implements Carteira {
	/**
	 * The cached value of the '{@link #getTransacao() <em>Transacao</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransacao()
	 * @generated
	 * @ordered
	 */
	protected EList<Transacao> transacao;
	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected EList<Titulo> titulo;
	/**
	 * The cached value of the '{@link #getSalvamentoautomatico() <em>Salvamentoautomatico</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalvamentoautomatico()
	 * @generated
	 * @ordered
	 */
	protected SalvamentoAutomatico salvamentoautomatico;
	/**
	 * The default value of the '{@link #getValorTotal() <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALOR_TOTAL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValorTotal() <em>Valor Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorTotal()
	 * @generated
	 * @ordered
	 */
	protected Double valorTotal = VALOR_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarteiraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.CARTEIRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transacao> getTransacao() {
		if (transacao == null) {
			transacao = new EObjectResolvingEList<Transacao>(Transacao.class, this,
					MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TRANSACAO);
		}
		return transacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Titulo> getTitulo() {
		if (titulo == null) {
			titulo = new EObjectResolvingEList<Titulo>(Titulo.class, this,
					MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TITULO);
		}
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalvamentoAutomatico getSalvamentoautomatico() {
		if (salvamentoautomatico != null && salvamentoautomatico.eIsProxy()) {
			InternalEObject oldSalvamentoautomatico = (InternalEObject) salvamentoautomatico;
			salvamentoautomatico = (SalvamentoAutomatico) eResolveProxy(oldSalvamentoautomatico);
			if (salvamentoautomatico != oldSalvamentoautomatico) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__SALVAMENTOAUTOMATICO, oldSalvamentoautomatico,
							salvamentoautomatico));
			}
		}
		return salvamentoautomatico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalvamentoAutomatico basicGetSalvamentoautomatico() {
		return salvamentoautomatico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalvamentoautomatico(SalvamentoAutomatico newSalvamentoautomatico) {
		SalvamentoAutomatico oldSalvamentoautomatico = salvamentoautomatico;
		salvamentoautomatico = newSalvamentoautomatico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__SALVAMENTOAUTOMATICO, oldSalvamentoautomatico,
					salvamentoautomatico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValorTotal() {
		return valorTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorTotal(Double newValorTotal) {
		Double oldValorTotal = valorTotal;
		valorTotal = newValorTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__VALOR_TOTAL, oldValorTotal, valorTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void realizarRetirada(Titulo titulo, Double valor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void realizarDeposito(Titulo titulo, Double valor) {
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
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TRANSACAO:
			return getTransacao();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TITULO:
			return getTitulo();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__SALVAMENTOAUTOMATICO:
			if (resolve)
				return getSalvamentoautomatico();
			return basicGetSalvamentoautomatico();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__VALOR_TOTAL:
			return getValorTotal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TRANSACAO:
			getTransacao().clear();
			getTransacao().addAll((Collection<? extends Transacao>) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TITULO:
			getTitulo().clear();
			getTitulo().addAll((Collection<? extends Titulo>) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__SALVAMENTOAUTOMATICO:
			setSalvamentoautomatico((SalvamentoAutomatico) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__VALOR_TOTAL:
			setValorTotal((Double) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TRANSACAO:
			getTransacao().clear();
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TITULO:
			getTitulo().clear();
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__SALVAMENTOAUTOMATICO:
			setSalvamentoautomatico((SalvamentoAutomatico) null);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__VALOR_TOTAL:
			setValorTotal(VALOR_TOTAL_EDEFAULT);
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
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TRANSACAO:
			return transacao != null && !transacao.isEmpty();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__TITULO:
			return titulo != null && !titulo.isEmpty();
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__SALVAMENTOAUTOMATICO:
			return salvamentoautomatico != null;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA__VALOR_TOTAL:
			return VALOR_TOTAL_EDEFAULT == null ? valorTotal != null : !VALOR_TOTAL_EDEFAULT.equals(valorTotal);
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
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA___REALIZAR_RETIRADA__TITULO_DOUBLE:
			realizarRetirada((Titulo) arguments.get(0), (Double) arguments.get(1));
			return null;
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA___REALIZAR_DEPOSITO__TITULO_DOUBLE:
			realizarDeposito((Titulo) arguments.get(0), (Double) arguments.get(1));
			return null;
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
		result.append(" (valorTotal: ");
		result.append(valorTotal);
		result.append(')');
		return result.toString();
	}

} //CarteiraImpl
