/**
 */
package mDSE_2021_2_Modeling_Project.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import mDSE_2021_2_Modeling_Project.Carteira;
import mDSE_2021_2_Modeling_Project.ContaBancaria;
import mDSE_2021_2_Modeling_Project.Endereco;
import mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage;
import mDSE_2021_2_Modeling_Project.Meta;
import mDSE_2021_2_Modeling_Project.TipoDeposito;
import mDSE_2021_2_Modeling_Project.Titulo;
import mDSE_2021_2_Modeling_Project.Usuario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getNomeMae <em>Nome Mae</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getSenha <em>Senha</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getCarteira <em>Carteira</em>}</li>
 *   <li>{@link mDSE_2021_2_Modeling_Project.impl.UsuarioImpl#getContabancaria <em>Contabancaria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomeMae() <em>Nome Mae</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeMae()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_MAE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeMae() <em>Nome Mae</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeMae()
	 * @generated
	 * @ordered
	 */
	protected String nomeMae = NOME_MAE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATA_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dataNascimento = DATA_NASCIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSenha() <em>Senha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenha()
	 * @generated
	 * @ordered
	 */
	protected static final String SENHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSenha() <em>Senha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenha()
	 * @generated
	 * @ordered
	 */
	protected String senha = SENHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected String telefone = TELEFONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndereco() <em>Endereco</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected Endereco endereco;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected EList<Meta> meta;

	/**
	 * The cached value of the '{@link #getCarteira() <em>Carteira</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarteira()
	 * @generated
	 * @ordered
	 */
	protected Carteira carteira;

	/**
	 * The cached value of the '{@link #getContabancaria() <em>Contabancaria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContabancaria()
	 * @generated
	 * @ordered
	 */
	protected EList<ContaBancaria> contabancaria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSE_2021_2_Modeling_ProjectPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME,
					oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(String newCpf) {
		String oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CPF,
					oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeMae() {
		return nomeMae;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeMae(String newNomeMae) {
		String oldNomeMae = nomeMae;
		nomeMae = newNomeMae;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME_MAE,
					oldNomeMae, nomeMae));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataNascimento(XMLGregorianCalendar newDataNascimento) {
		XMLGregorianCalendar oldDataNascimento = dataNascimento;
		dataNascimento = newDataNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MDSE_2021_2_Modeling_ProjectPackage.USUARIO__DATA_NASCIMENTO, oldDataNascimento, dataNascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__EMAIL,
					oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenha(String newSenha) {
		String oldSenha = senha;
		senha = newSenha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__SENHA,
					oldSenha, senha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefone(String newTelefone) {
		String oldTelefone = telefone;
		telefone = newTelefone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__TELEFONE,
					oldTelefone, telefone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endereco getEndereco() {
		if (endereco != null && endereco.eIsProxy()) {
			InternalEObject oldEndereco = (InternalEObject) endereco;
			endereco = (Endereco) eResolveProxy(oldEndereco);
			if (endereco != oldEndereco) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MDSE_2021_2_Modeling_ProjectPackage.USUARIO__ENDERECO, oldEndereco, endereco));
			}
		}
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endereco basicGetEndereco() {
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco(Endereco newEndereco) {
		Endereco oldEndereco = endereco;
		endereco = newEndereco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__ENDERECO,
					oldEndereco, endereco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectResolvingEList<Meta>(Meta.class, this, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carteira getCarteira() {
		if (carteira != null && carteira.eIsProxy()) {
			InternalEObject oldCarteira = (InternalEObject) carteira;
			carteira = (Carteira) eResolveProxy(oldCarteira);
			if (carteira != oldCarteira) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CARTEIRA, oldCarteira, carteira));
			}
		}
		return carteira;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carteira basicGetCarteira() {
		return carteira;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarteira(Carteira newCarteira) {
		Carteira oldCarteira = carteira;
		carteira = newCarteira;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CARTEIRA,
					oldCarteira, carteira));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContaBancaria> getContabancaria() {
		if (contabancaria == null) {
			contabancaria = new EObjectResolvingEList<ContaBancaria>(ContaBancaria.class, this,
					MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CONTABANCARIA);
		}
		return contabancaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean autenticar(String email, String senha) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean validarDadosNaReceita() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void realizarDeposito(Meta meta, Titulo titulo, Double valor, TipoDeposito tipoDeposito) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void retirarValorTed(Meta meta, Double valor, ContaBancaria contaRetirada) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void retirarValorPix(Meta meta, Double valor, String chavePix) {
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
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME:
			return getNome();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CPF:
			return getCpf();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME_MAE:
			return getNomeMae();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__DATA_NASCIMENTO:
			return getDataNascimento();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__EMAIL:
			return getEmail();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__SENHA:
			return getSenha();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__TELEFONE:
			return getTelefone();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__ENDERECO:
			if (resolve)
				return getEndereco();
			return basicGetEndereco();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__META:
			return getMeta();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CARTEIRA:
			if (resolve)
				return getCarteira();
			return basicGetCarteira();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CONTABANCARIA:
			return getContabancaria();
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
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME:
			setNome((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CPF:
			setCpf((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME_MAE:
			setNomeMae((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__DATA_NASCIMENTO:
			setDataNascimento((XMLGregorianCalendar) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__EMAIL:
			setEmail((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__SENHA:
			setSenha((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__TELEFONE:
			setTelefone((String) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__ENDERECO:
			setEndereco((Endereco) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__META:
			getMeta().clear();
			getMeta().addAll((Collection<? extends Meta>) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CARTEIRA:
			setCarteira((Carteira) newValue);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CONTABANCARIA:
			getContabancaria().clear();
			getContabancaria().addAll((Collection<? extends ContaBancaria>) newValue);
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
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME:
			setNome(NOME_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CPF:
			setCpf(CPF_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME_MAE:
			setNomeMae(NOME_MAE_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__DATA_NASCIMENTO:
			setDataNascimento(DATA_NASCIMENTO_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__SENHA:
			setSenha(SENHA_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__TELEFONE:
			setTelefone(TELEFONE_EDEFAULT);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__ENDERECO:
			setEndereco((Endereco) null);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__META:
			getMeta().clear();
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CARTEIRA:
			setCarteira((Carteira) null);
			return;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CONTABANCARIA:
			getContabancaria().clear();
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
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME:
			return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CPF:
			return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__NOME_MAE:
			return NOME_MAE_EDEFAULT == null ? nomeMae != null : !NOME_MAE_EDEFAULT.equals(nomeMae);
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__DATA_NASCIMENTO:
			return DATA_NASCIMENTO_EDEFAULT == null ? dataNascimento != null
					: !DATA_NASCIMENTO_EDEFAULT.equals(dataNascimento);
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__SENHA:
			return SENHA_EDEFAULT == null ? senha != null : !SENHA_EDEFAULT.equals(senha);
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__TELEFONE:
			return TELEFONE_EDEFAULT == null ? telefone != null : !TELEFONE_EDEFAULT.equals(telefone);
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__ENDERECO:
			return endereco != null;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__META:
			return meta != null && !meta.isEmpty();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CARTEIRA:
			return carteira != null;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO__CONTABANCARIA:
			return contabancaria != null && !contabancaria.isEmpty();
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
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO___AUTENTICAR__STRING_STRING:
			return autenticar((String) arguments.get(0), (String) arguments.get(1));
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO___VALIDAR_DADOS_NA_RECEITA:
			return validarDadosNaReceita();
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO___REALIZAR_DEPOSITO__META_TITULO_DOUBLE_TIPODEPOSITO:
			realizarDeposito((Meta) arguments.get(0), (Titulo) arguments.get(1), (Double) arguments.get(2),
					(TipoDeposito) arguments.get(3));
			return null;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO___RETIRAR_VALOR_TED__META_DOUBLE_CONTABANCARIA:
			retirarValorTed((Meta) arguments.get(0), (Double) arguments.get(1), (ContaBancaria) arguments.get(2));
			return null;
		case MDSE_2021_2_Modeling_ProjectPackage.USUARIO___RETIRAR_VALOR_PIX__META_DOUBLE_STRING:
			retirarValorPix((Meta) arguments.get(0), (Double) arguments.get(1), (String) arguments.get(2));
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
		result.append(" (nome: ");
		result.append(nome);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", nomeMae: ");
		result.append(nomeMae);
		result.append(", dataNascimento: ");
		result.append(dataNascimento);
		result.append(", email: ");
		result.append(email);
		result.append(", senha: ");
		result.append(senha);
		result.append(", telefone: ");
		result.append(telefone);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
