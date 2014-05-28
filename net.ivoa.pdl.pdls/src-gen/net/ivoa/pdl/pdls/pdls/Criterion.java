/**
 */
package net.ivoa.pdl.pdls.pdls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Criterion#getLeft <em>Left</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Criterion#getConn <em>Conn</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Criterion#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getCriterion()
 * @model
 * @generated
 */
public interface Criterion extends ConditionalClause
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ConditionalClause)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getCriterion_Left()
   * @model containment="true"
   * @generated
   */
  ConditionalClause getLeft();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Criterion#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ConditionalClause value);

  /**
   * Returns the value of the '<em><b>Conn</b></em>' attribute.
   * The literals are from the enumeration {@link net.ivoa.pdl.pdls.pdls.LogicalConnector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conn</em>' attribute.
   * @see net.ivoa.pdl.pdls.pdls.LogicalConnector
   * @see #setConn(LogicalConnector)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getCriterion_Conn()
   * @model
   * @generated
   */
  LogicalConnector getConn();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Criterion#getConn <em>Conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conn</em>' attribute.
   * @see net.ivoa.pdl.pdls.pdls.LogicalConnector
   * @see #getConn()
   * @generated
   */
  void setConn(LogicalConnector value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ConditionalClause)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getCriterion_Right()
   * @model containment="true"
   * @generated
   */
  ConditionalClause getRight();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Criterion#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ConditionalClause value);

} // Criterion
