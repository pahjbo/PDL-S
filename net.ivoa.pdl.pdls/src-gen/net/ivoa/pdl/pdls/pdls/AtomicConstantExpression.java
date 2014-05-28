/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getConst <em>Const</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getPower <em>Power</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getStr <em>Str</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAtomicConstantExpression()
 * @model
 * @generated
 */
public interface AtomicConstantExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(String)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAtomicConstantExpression_Const()
   * @model
   * @generated
   */
  String getConst();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(String value);

  /**
   * Returns the value of the '<em><b>Power</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Power</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Power</em>' containment reference.
   * @see #setPower(Expression)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAtomicConstantExpression_Power()
   * @model containment="true"
   * @generated
   */
  Expression getPower();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getPower <em>Power</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power</em>' containment reference.
   * @see #getPower()
   * @generated
   */
  void setPower(Expression value);

  /**
   * Returns the value of the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' attribute.
   * @see #setStr(String)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAtomicConstantExpression_Str()
   * @model
   * @generated
   */
  String getStr();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getStr <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' attribute.
   * @see #getStr()
   * @generated
   */
  void setStr(String value);

} // AtomicConstantExpression
