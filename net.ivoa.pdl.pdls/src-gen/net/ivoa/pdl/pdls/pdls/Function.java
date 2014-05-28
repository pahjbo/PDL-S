/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Function#getName <em>Name</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Function#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link net.ivoa.pdl.pdls.pdls.FunctionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see net.ivoa.pdl.pdls.pdls.FunctionType
   * @see #setName(FunctionType)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getFunction_Name()
   * @model
   * @generated
   */
  FunctionType getName();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see net.ivoa.pdl.pdls.pdls.FunctionType
   * @see #getName()
   * @generated
   */
  void setName(FunctionType value);

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
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getFunction_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Function#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // Function
