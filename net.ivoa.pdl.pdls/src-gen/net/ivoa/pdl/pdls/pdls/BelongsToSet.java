/**
 */
package net.ivoa.pdl.pdls.pdls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Belongs To Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.BelongsToSet#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getBelongsToSet()
 * @model
 * @generated
 */
public interface BelongsToSet extends Condition
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link net.ivoa.pdl.pdls.pdls.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getBelongsToSet_Values()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getValues();

} // BelongsToSet
