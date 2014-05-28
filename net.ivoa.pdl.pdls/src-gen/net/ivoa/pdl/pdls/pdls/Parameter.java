/**
 */
package net.ivoa.pdl.pdls.pdls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
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
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link net.ivoa.pdl.pdls.pdls.ParameterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see net.ivoa.pdl.pdls.pdls.ParameterType
   * @see #setType(ParameterType)
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getParameter_Type()
   * @model
   * @generated
   */
  ParameterType getType();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Parameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see net.ivoa.pdl.pdls.pdls.ParameterType
   * @see #getType()
   * @generated
   */
  void setType(ParameterType value);

} // Parameter
