/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.AtomicParameterExpression;
import net.ivoa.pdl.pdls.pdls.Expression;
import net.ivoa.pdl.pdls.pdls.Parameter;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.AtomicParameterExpressionImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.AtomicParameterExpressionImpl#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicParameterExpressionImpl extends ExpressionImpl implements AtomicParameterExpression
{
  /**
   * The cached value of the '{@link #getPref() <em>Pref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected Parameter pref;

  /**
   * The cached value of the '{@link #getPower() <em>Power</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPower()
   * @generated
   * @ordered
   */
  protected Expression power;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicParameterExpressionImpl()
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
    return PdlsPackage.Literals.ATOMIC_PARAMETER_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getPref()
  {
    if (pref != null && pref.eIsProxy())
    {
      InternalEObject oldPref = (InternalEObject)pref;
      pref = (Parameter)eResolveProxy(oldPref);
      if (pref != oldPref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__PREF, oldPref, pref));
      }
    }
    return pref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetPref()
  {
    return pref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPref(Parameter newPref)
  {
    Parameter oldPref = pref;
    pref = newPref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__PREF, oldPref, pref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getPower()
  {
    return power;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPower(Expression newPower, NotificationChain msgs)
  {
    Expression oldPower = power;
    power = newPower;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER, oldPower, newPower);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPower(Expression newPower)
  {
    if (newPower != power)
    {
      NotificationChain msgs = null;
      if (power != null)
        msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER, null, msgs);
      if (newPower != null)
        msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER, null, msgs);
      msgs = basicSetPower(newPower, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER, newPower, newPower));
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
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER:
        return basicSetPower(null, msgs);
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
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__PREF:
        if (resolve) return getPref();
        return basicGetPref();
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER:
        return getPower();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__PREF:
        setPref((Parameter)newValue);
        return;
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER:
        setPower((Expression)newValue);
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
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__PREF:
        setPref((Parameter)null);
        return;
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER:
        setPower((Expression)null);
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
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__PREF:
        return pref != null;
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION__POWER:
        return power != null;
    }
    return super.eIsSet(featureID);
  }

} //AtomicParameterExpressionImpl
