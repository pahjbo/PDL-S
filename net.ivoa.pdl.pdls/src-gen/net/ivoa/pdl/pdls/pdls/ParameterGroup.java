/**
 */
package net.ivoa.pdl.pdls.pdls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getName <em>Name</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getParams <em>Params</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getActive <em>Active</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameterGroup()
 * @model
 * @generated
 */
public interface ParameterGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameterGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' reference list.
   * The list contents are of type {@link net.ivoa.pdl.pdls.pdls.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' reference list.
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameterGroup_Params()
   * @model
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(ConstraintOnGroup)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameterGroup_Constraint()
   * @model containment="true"
   * @generated
   */
  ConstraintOnGroup getConstraint();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(ConstraintOnGroup value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' containment reference.
   * @see #setActive(WhenConditionalStatement)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameterGroup_Active()
   * @model containment="true"
   * @generated
   */
  WhenConditionalStatement getActive();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getActive <em>Active</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active</em>' containment reference.
   * @see #getActive()
   * @generated
   */
  void setActive(WhenConditionalStatement value);

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link net.ivoa.pdl.pdls.pdls.ParameterGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameterGroup_Groups()
   * @model containment="true"
   * @generated
   */
  EList<ParameterGroup> getGroups();

} // ParameterGroup
