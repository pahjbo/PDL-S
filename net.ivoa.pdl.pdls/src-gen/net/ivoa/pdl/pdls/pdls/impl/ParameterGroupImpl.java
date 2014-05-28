/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import java.util.Collection;

import net.ivoa.pdl.pdls.pdls.ConstraintOnGroup;
import net.ivoa.pdl.pdls.pdls.Parameter;
import net.ivoa.pdl.pdls.pdls.ParameterGroup;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;
import net.ivoa.pdl.pdls.pdls.WhenConditionalStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl#getParams <em>Params</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl#getActive <em>Active</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterGroupImpl extends MinimalEObjectImpl.Container implements ParameterGroup
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected ConstraintOnGroup constraint;

  /**
   * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActive()
   * @generated
   * @ordered
   */
  protected WhenConditionalStatement active;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<ParameterGroup> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterGroupImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PdlsPackage.Literals.PARAMETER_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.PARAMETER_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectResolvingEList<Parameter>(Parameter.class, this, PdlsPackage.PARAMETER_GROUP__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintOnGroup getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(ConstraintOnGroup newConstraint, NotificationChain msgs)
  {
    ConstraintOnGroup oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.PARAMETER_GROUP__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(ConstraintOnGroup newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARAMETER_GROUP__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARAMETER_GROUP__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.PARAMETER_GROUP__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenConditionalStatement getActive()
  {
    return active;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActive(WhenConditionalStatement newActive, NotificationChain msgs)
  {
    WhenConditionalStatement oldActive = active;
    active = newActive;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.PARAMETER_GROUP__ACTIVE, oldActive, newActive);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActive(WhenConditionalStatement newActive)
  {
    if (newActive != active)
    {
      NotificationChain msgs = null;
      if (active != null)
        msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARAMETER_GROUP__ACTIVE, null, msgs);
      if (newActive != null)
        msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARAMETER_GROUP__ACTIVE, null, msgs);
      msgs = basicSetActive(newActive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.PARAMETER_GROUP__ACTIVE, newActive, newActive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<ParameterGroup>(ParameterGroup.class, this, PdlsPackage.PARAMETER_GROUP__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PdlsPackage.PARAMETER_GROUP__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case PdlsPackage.PARAMETER_GROUP__ACTIVE:
        return basicSetActive(null, msgs);
      case PdlsPackage.PARAMETER_GROUP__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PdlsPackage.PARAMETER_GROUP__NAME:
        return getName();
      case PdlsPackage.PARAMETER_GROUP__PARAMS:
        return getParams();
      case PdlsPackage.PARAMETER_GROUP__CONSTRAINT:
        return getConstraint();
      case PdlsPackage.PARAMETER_GROUP__ACTIVE:
        return getActive();
      case PdlsPackage.PARAMETER_GROUP__GROUPS:
        return getGroups();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdlsPackage.PARAMETER_GROUP__NAME:
        setName((String)newValue);
        return;
      case PdlsPackage.PARAMETER_GROUP__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case PdlsPackage.PARAMETER_GROUP__CONSTRAINT:
        setConstraint((ConstraintOnGroup)newValue);
        return;
      case PdlsPackage.PARAMETER_GROUP__ACTIVE:
        setActive((WhenConditionalStatement)newValue);
        return;
      case PdlsPackage.PARAMETER_GROUP__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends ParameterGroup>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PdlsPackage.PARAMETER_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PdlsPackage.PARAMETER_GROUP__PARAMS:
        getParams().clear();
        return;
      case PdlsPackage.PARAMETER_GROUP__CONSTRAINT:
        setConstraint((ConstraintOnGroup)null);
        return;
      case PdlsPackage.PARAMETER_GROUP__ACTIVE:
        setActive((WhenConditionalStatement)null);
        return;
      case PdlsPackage.PARAMETER_GROUP__GROUPS:
        getGroups().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PdlsPackage.PARAMETER_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PdlsPackage.PARAMETER_GROUP__PARAMS:
        return params != null && !params.isEmpty();
      case PdlsPackage.PARAMETER_GROUP__CONSTRAINT:
        return constraint != null;
      case PdlsPackage.PARAMETER_GROUP__ACTIVE:
        return active != null;
      case PdlsPackage.PARAMETER_GROUP__GROUPS:
        return groups != null && !groups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ParameterGroupImpl
