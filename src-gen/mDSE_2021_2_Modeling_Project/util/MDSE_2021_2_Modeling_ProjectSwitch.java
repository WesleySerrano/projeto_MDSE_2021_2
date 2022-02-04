/**
 */
package mDSE_2021_2_Modeling_Project.util;

import mDSE_2021_2_Modeling_Project.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage
 * @generated
 */
public class MDSE_2021_2_Modeling_ProjectSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MDSE_2021_2_Modeling_ProjectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSE_2021_2_Modeling_ProjectSwitch() {
		if (modelPackage == null) {
			modelPackage = MDSE_2021_2_Modeling_ProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO: {
			Usuario usuario = (Usuario) theEObject;
			T result = caseUsuario(usuario);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.ENDERECO: {
			Endereco endereco = (Endereco) theEObject;
			T result = caseEndereco(endereco);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.META: {
			Meta meta = (Meta) theEObject;
			T result = caseMeta(meta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.CARTEIRA: {
			Carteira carteira = (Carteira) theEObject;
			T result = caseCarteira(carteira);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.TRANSACAO: {
			Transacao transacao = (Transacao) theEObject;
			T result = caseTransacao(transacao);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.SALVAMENTO_AUTOMATICO: {
			SalvamentoAutomatico salvamentoAutomatico = (SalvamentoAutomatico) theEObject;
			T result = caseSalvamentoAutomatico(salvamentoAutomatico);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.CARTAO_DE_CREDITO: {
			CartaoDeCredito cartaoDeCredito = (CartaoDeCredito) theEObject;
			T result = caseCartaoDeCredito(cartaoDeCredito);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.TITULO: {
			Titulo titulo = (Titulo) theEObject;
			T result = caseTitulo(titulo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MDSE_2021_2_Modeling_ProjectPackage.CONTA_BANCARIA: {
			ContaBancaria contaBancaria = (ContaBancaria) theEObject;
			T result = caseContaBancaria(contaBancaria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endereco</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endereco</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndereco(Endereco object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeta(Meta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carteira</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carteira</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarteira(Carteira object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transacao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transacao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransacao(Transacao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salvamento Automatico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salvamento Automatico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalvamentoAutomatico(SalvamentoAutomatico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartao De Credito</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartao De Credito</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartaoDeCredito(CartaoDeCredito object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitulo(Titulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conta Bancaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conta Bancaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContaBancaria(ContaBancaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MDSE_2021_2_Modeling_ProjectSwitch
