/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getComment <em>Comment</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getCriterion <em>Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getWhenConditionalStatement()
 * @model
 * @generated
 */
public interface WhenConditionalStatement extends ConditionalStatement
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getWhenConditionalStatement_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

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
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getWhenConditionalStatement_Criterion()
   * @model containment="true"
   * @generated
   */
  ConditionalClause getCriterion();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getCriterion <em>Criterion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criterion</em>' containment reference.
   * @see #getCriterion()
   * @generated
   */
  void setCriterion(ConditionalClause value);

} // WhenConditionalStatement
