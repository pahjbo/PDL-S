/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value In Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ValueInRange#getInf <em>Inf</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ValueInRange#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getValueInRange()
 * @model
 * @generated
 */
public interface ValueInRange extends Condition
{
  /**
   * Returns the value of the '<em><b>Inf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inf</em>' containment reference.
   * @see #setInf(Expression)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getValueInRange_Inf()
   * @model containment="true"
   * @generated
   */
  Expression getInf();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.ValueInRange#getInf <em>Inf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inf</em>' containment reference.
   * @see #getInf()
   * @generated
   */
  void setInf(Expression value);

  /**
   * Returns the value of the '<em><b>Sup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sup</em>' containment reference.
   * @see #setSup(Expression)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getValueInRange_Sup()
   * @model containment="true"
   * @generated
   */
  Expression getSup();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.ValueInRange#getSup <em>Sup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sup</em>' containment reference.
   * @see #getSup()
   * @generated
   */
  void setSup(Expression value);

} // ValueInRange
