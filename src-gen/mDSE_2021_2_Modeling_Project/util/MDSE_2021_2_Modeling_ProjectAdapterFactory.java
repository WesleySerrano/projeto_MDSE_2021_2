/**
 */
package mDSE_2021_2_Modeling_Project.util;

import mDSE_2021_2_Modeling_Project.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage
 * @generated
 */
public class MDSE_2021_2_Modeling_ProjectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MDSE_2021_2_Modeling_ProjectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSE_2021_2_Modeling_ProjectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MDSE_2021_2_Modeling_ProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDSE_2021_2_Modeling_ProjectSwitch<Adapter> modelSwitch = new MDSE_2021_2_Modeling_ProjectSwitch<Adapter>() {
		@Override
		public Adapter caseUsuario(Usuario object) {
			return createUsuarioAdapter();
		}

		@Override
		public Adapter caseEndereco(Endereco object) {
			return createEnderecoAdapter();
		}

		@Override
		public Adapter caseMeta(Meta object) {
			return createMetaAdapter();
		}

		@Override
		public Adapter caseCarteira(Carteira object) {
			return createCarteiraAdapter();
		}

		@Override
		public Adapter caseTransacao(Transacao object) {
			return createTransacaoAdapter();
		}

		@Override
		public Adapter caseSalvamentoAutomatico(SalvamentoAutomatico object) {
			return createSalvamentoAutomaticoAdapter();
		}

		@Override
		public Adapter caseCartaoDeCredito(CartaoDeCredito object) {
			return createCartaoDeCreditoAdapter();
		}

		@Override
		public Adapter caseTitulo(Titulo object) {
			return createTituloAdapter();
		}

		@Override
		public Adapter caseContaBancaria(ContaBancaria object) {
			return createContaBancariaAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.Endereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.Endereco
	 * @generated
	 */
	public Adapter createEnderecoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.Meta
	 * @generated
	 */
	public Adapter createMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.Carteira <em>Carteira</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.Carteira
	 * @generated
	 */
	public Adapter createCarteiraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.Transacao <em>Transacao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.Transacao
	 * @generated
	 */
	public Adapter createTransacaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.SalvamentoAutomatico <em>Salvamento Automatico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.SalvamentoAutomatico
	 * @generated
	 */
	public Adapter createSalvamentoAutomaticoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.CartaoDeCredito <em>Cartao De Credito</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.CartaoDeCredito
	 * @generated
	 */
	public Adapter createCartaoDeCreditoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.Titulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.Titulo
	 * @generated
	 */
	public Adapter createTituloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mDSE_2021_2_Modeling_Project.ContaBancaria <em>Conta Bancaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mDSE_2021_2_Modeling_Project.ContaBancaria
	 * @generated
	 */
	public Adapter createContaBancariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MDSE_2021_2_Modeling_ProjectAdapterFactory
