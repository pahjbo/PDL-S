/**
 */
package net.ivoa.pdl.pdls.pdls;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getFunctionType()
 * @model
 * @generated
 */
public enum FunctionType implements Enumerator
{
  /**
   * The '<em><b>Size</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIZE_VALUE
   * @generated
   * @ordered
   */
  SIZE(0, "size", "size"),

  /**
   * The '<em><b>Abs</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABS_VALUE
   * @generated
   * @ordered
   */
  ABS(1, "abs", "abs"),

  /**
   * The '<em><b>Sin</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIN_VALUE
   * @generated
   * @ordered
   */
  SIN(2, "sin", "sin"),

  /**
   * The '<em><b>Cos</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COS_VALUE
   * @generated
   * @ordered
   */
  COS(3, "cos", "cos"),

  /**
   * The '<em><b>Tan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TAN_VALUE
   * @generated
   * @ordered
   */
  TAN(4, "tan", "tan"),

  /**
   * The '<em><b>Asin</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASIN_VALUE
   * @generated
   * @ordered
   */
  ASIN(5, "asin", "asin"),

  /**
   * The '<em><b>Acos</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACOS_VALUE
   * @generated
   * @ordered
   */
  ACOS(6, "acos", "acos"),

  /**
   * The '<em><b>Atan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATAN_VALUE
   * @generated
   * @ordered
   */
  ATAN(7, "atan", "atan"),

  /**
   * The '<em><b>Exp</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXP_VALUE
   * @generated
   * @ordered
   */
  EXP(8, "exp", "exp"),

  /**
   * The '<em><b>Log</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOG_VALUE
   * @generated
   * @ordered
   */
  LOG(9, "log", "log"),

  /**
   * The '<em><b>Sum</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUM_VALUE
   * @generated
   * @ordered
   */
  SUM(10, "sum", "sum"),

  /**
   * The '<em><b>Product</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRODUCT_VALUE
   * @generated
   * @ordered
   */
  PRODUCT(11, "product", "product");

  /**
   * The '<em><b>Size</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Size</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIZE
   * @model name="size"
   * @generated
   * @ordered
   */
  public static final int SIZE_VALUE = 0;

  /**
   * The '<em><b>Abs</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Abs</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABS
   * @model name="abs"
   * @generated
   * @ordered
   */
  public static final int ABS_VALUE = 1;

  /**
   * The '<em><b>Sin</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sin</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIN
   * @model name="sin"
   * @generated
   * @ordered
   */
  public static final int SIN_VALUE = 2;

  /**
   * The '<em><b>Cos</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cos</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COS
   * @model name="cos"
   * @generated
   * @ordered
   */
  public static final int COS_VALUE = 3;

  /**
   * The '<em><b>Tan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TAN
   * @model name="tan"
   * @generated
   * @ordered
   */
  public static final int TAN_VALUE = 4;

  /**
   * The '<em><b>Asin</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Asin</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASIN
   * @model name="asin"
   * @generated
   * @ordered
   */
  public static final int ASIN_VALUE = 5;

  /**
   * The '<em><b>Acos</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Acos</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACOS
   * @model name="acos"
   * @generated
   * @ordered
   */
  public static final int ACOS_VALUE = 6;

  /**
   * The '<em><b>Atan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Atan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATAN
   * @model name="atan"
   * @generated
   * @ordered
   */
  public static final int ATAN_VALUE = 7;

  /**
   * The '<em><b>Exp</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exp</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXP
   * @model name="exp"
   * @generated
   * @ordered
   */
  public static final int EXP_VALUE = 8;

  /**
   * The '<em><b>Log</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Log</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOG
   * @model name="log"
   * @generated
   * @ordered
   */
  public static final int LOG_VALUE = 9;

  /**
   * The '<em><b>Sum</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sum</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUM
   * @model name="sum"
   * @generated
   * @ordered
   */
  public static final int SUM_VALUE = 10;

  /**
   * The '<em><b>Product</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Product</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRODUCT
   * @model name="product"
   * @generated
   * @ordered
   */
  public static final int PRODUCT_VALUE = 11;

  /**
   * An array of all the '<em><b>Function Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FunctionType[] VALUES_ARRAY =
    new FunctionType[]
    {
      SIZE,
      ABS,
      SIN,
      COS,
      TAN,
      ASIN,
      ACOS,
      ATAN,
      EXP,
      LOG,
      SUM,
      PRODUCT,
    };

  /**
   * A public read-only list of all the '<em><b>Function Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FunctionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Function Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FunctionType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Function Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FunctionType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Function Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionType get(int value)
  {
    switch (value)
    {
      case SIZE_VALUE: return SIZE;
      case ABS_VALUE: return ABS;
      case SIN_VALUE: return SIN;
      case COS_VALUE: return COS;
      case TAN_VALUE: return TAN;
      case ASIN_VALUE: return ASIN;
      case ACOS_VALUE: return ACOS;
      case ATAN_VALUE: return ATAN;
      case EXP_VALUE: return EXP;
      case LOG_VALUE: return LOG;
      case SUM_VALUE: return SUM;
      case PRODUCT_VALUE: return PRODUCT;
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
  private FunctionType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //FunctionType
