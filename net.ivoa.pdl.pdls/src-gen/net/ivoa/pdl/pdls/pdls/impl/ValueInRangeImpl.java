/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.Expression;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;
import net.ivoa.pdl.pdls.pdls.ValueInRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value In Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ValueInRangeImpl#getInf <em>Inf</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ValueInRangeImpl#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueInRangeImpl extends ConditionImpl implements ValueInRange
{
  /**
   * The cached value of the '{@link #getInf() <em>Inf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInf()
   * @generated
   * @ordered
   */
  protected Expression inf;

  /**
   * The cached value of the '{@link #getSup() <em>Sup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSup()
   * @generated
   * @ordered
   */
  protected Expression sup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueInRangeImpl()
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
    return PdlsPackage.Literals.VALUE_IN_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getInf()
  {
    return inf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInf(Expression newInf, NotificationChain msgs)
  {
    Expression oldInf = inf;
    inf = newInf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.VALUE_IN_RANGE__INF, oldInf, newInf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInf(Expression newInf)
  {
    if (newInf != inf)
    {
      NotificationChain msgs = null;
      if (inf != null)
        msgs = ((InternalEObject)inf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.VALUE_IN_RANGE__INF, null, msgs);
      if (newInf != null)
        msgs = ((InternalEObject)newInf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.VALUE_IN_RANGE__INF, null, msgs);
      msgs = basicSetInf(newInf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.VALUE_IN_RANGE__INF, newInf, newInf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSup()
  {
    return sup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSup(Expression newSup, NotificationChain msgs)
  {
    Expression oldSup = sup;
    sup = newSup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.VALUE_IN_RANGE__SUP, oldSup, newSup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSup(Expression newSup)
  {
    if (newSup != sup)
    {
      NotificationChain msgs = null;
      if (sup != null)
        msgs = ((InternalEObject)sup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.VALUE_IN_RANGE__SUP, null, msgs);
      if (newSup != null)
        msgs = ((InternalEObject)newSup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.VALUE_IN_RANGE__SUP, null, msgs);
      msgs = basicSetSup(newSup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.VALUE_IN_RANGE__SUP, newSup, newSup));
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
      case PdlsPackage.VALUE_IN_RANGE__INF:
        return basicSetInf(null, msgs);
      case PdlsPackage.VALUE_IN_RANGE__SUP:
        return basicSetSup(null, msgs);
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
      case PdlsPackage.VALUE_IN_RANGE__INF:
        return getInf();
      case PdlsPackage.VALUE_IN_RANGE__SUP:
        return getSup();
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
      case PdlsPackage.VALUE_IN_RANGE__INF:
        setInf((Expression)newValue);
        return;
      case PdlsPackage.VALUE_IN_RANGE__SUP:
        setSup((Expression)newValue);
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
      case PdlsPackage.VALUE_IN_RANGE__INF:
        setInf((Expression)null);
        return;
      case PdlsPackage.VALUE_IN_RANGE__SUP:
        setSup((Expression)null);
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
      case PdlsPackage.VALUE_IN_RANGE__INF:
        return inf != null;
      case PdlsPackage.VALUE_IN_RANGE__SUP:
        return sup != null;
    }
    return super.eIsSet(featureID);
  }

} //ValueInRangeImpl
