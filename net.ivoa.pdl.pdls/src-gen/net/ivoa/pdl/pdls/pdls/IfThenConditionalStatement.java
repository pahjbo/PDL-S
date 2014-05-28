/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getIfThenConditionalStatement()
 * @model
 * @generated
 */
public interface IfThenConditionalStatement extends ConditionalStatement
{
  /**
   * Returns the value of the '<em><b>Criterion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Criterion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criterion</em>' containment reference.
   * @see #setCriterion(ConditionalClause)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getIfThenConditionalStatement_Criterion()
   * @model containment="true"
   * @generated
   */
  ConditionalClause getCriterion();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getCriterion <em>Criterion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criterion</em>' containment reference.
   * @see #getCriterion()
   * @generated
   */
  void setCriterion(ConditionalClause value);

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
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getIfThenConditionalStatement_Clause()
   * @model containment="true"
   * @generated
   */
  ConditionalClause getClause();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(ConditionalClause value);

} // IfThenConditionalStatement
