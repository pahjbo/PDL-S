/**
 */
package net.ivoa.pdl.pdls.pdls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Service#getName <em>Name</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Service#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Service#getInputs <em>Inputs</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.Service#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getService()
 * @model
 * @generated
 */
public interface Service extends PDL
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
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.ivoa.pdl.pdls.pdls.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link net.ivoa.pdl.pdls.pdls.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getService_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link net.ivoa.pdl.pdls.pdls.ParameterGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getService_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<ParameterGroup> getInputs();

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link net.ivoa.pdl.pdls.pdls.ParameterGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#getService_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<ParameterGroup> getOutputs();

} // Service
