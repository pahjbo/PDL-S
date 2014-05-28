/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent#getExpr <em>Expr</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParenthesisContent()
 * @model
 * @generated
 */
public interface ParenthesisContent extends Expression
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParenthesisContent_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

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
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParenthesisContent_Power()
   * @model containment="true"
   * @generated
   */
  Expression getPower();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent#getPower <em>Power</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power</em>' containment reference.
   * @see #getPower()
   * @generated
   */
  void setPower(Expression value);

} // ParenthesisContent
