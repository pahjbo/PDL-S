/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPref <em>Pref</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAtomicParameterExpression()
 * @model
 * @generated
 */
public interface AtomicParameterExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Pref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pref</em>' reference.
   * @see #setPref(Parameter)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAtomicParameterExpression_Pref()
   * @model
   * @generated
   */
  Parameter getPref();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPref <em>Pref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pref</em>' reference.
   * @see #getPref()
   * @generated
   */
  void setPref(Parameter value);

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
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAtomicParameterExpression_Power()
   * @model containment="true"
   * @generated
   */
  Expression getPower();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPower <em>Power</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power</em>' containment reference.
   * @see #getPower()
   * @generated
   */
  void setPower(Expression value);

} // AtomicParameterExpression
