/**
 */
package mDSE_2021_2_Modeling_Project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Liquidez Investimento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mDSE_2021_2_Modeling_Project.MDSE_2021_2_Modeling_ProjectPackage#getLiquidezInvestimento()
 * @model
 * @generated
 */
public enum LiquidezInvestimento implements Enumerator {
	/**
	 * The '<em><b>DIARIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARIA_VALUE
	 * @generated
	 * @ordered
	 */
	DIARIA(0, "DIARIA", "DIARIA"),

	/**
	 * The '<em><b>VENCIMENTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENCIMENTO_VALUE
	 * @generated
	 * @ordered
	 */
	VENCIMENTO(1, "VENCIMENTO", "VENCIMENTO");

	/**
	 * The '<em><b>DIARIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIARIA_VALUE = 0;

	/**
	 * The '<em><b>VENCIMENTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENCIMENTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VENCIMENTO_VALUE = 1;

	/**
	 * An array of all the '<em><b>Liquidez Investimento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LiquidezInvestimento[] VALUES_ARRAY = new LiquidezInvestimento[] { DIARIA, VENCIMENTO, };

	/**
	 * A public read-only list of all the '<em><b>Liquidez Investimento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LiquidezInvestimento> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Liquidez Investimento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LiquidezInvestimento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiquidezInvestimento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Liquidez Investimento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LiquidezInvestimento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiquidezInvestimento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Liquidez Investimento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LiquidezInvestimento get(int value) {
		switch (value) {
		case DIARIA_VALUE:
			return DIARIA;
		case VENCIMENTO_VALUE:
			return VENCIMENTO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LiquidezInvestimento(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //LiquidezInvestimento
