/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Always Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAlwaysConditionalStatement()
 * @model
 * @generated
 */
public interface AlwaysConditionalStatement extends ConditionalStatement
{
  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference.
   * @see #setClause(ConditionalClause)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getAlwaysConditionalStatement_Clause()
   * @model containment="true"
   * @generated
   */
  ConditionalClause getClause();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(ConditionalClause value);

} // AlwaysConditionalStatement
