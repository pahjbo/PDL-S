/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.AtomicConstantExpression;
import net.ivoa.pdl.pdls.pdls.Expression;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.AtomicConstantExpressionImpl#getConst <em>Const</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.AtomicConstantExpressionImpl#getPower <em>Power</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.AtomicConstantExpressionImpl#getStr <em>Str</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicConstantExpressionImpl extends ExpressionImpl implements AtomicConstantExpression
{
  /**
   * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected static final String CONST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected String const_ = CONST_EDEFAULT;

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
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicConstantExpressionImpl()
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
    return PdlsPackage.Literals.ATOMIC_CONSTANT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(String newConst)
  {
    String oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__CONST, oldConst, const_));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER, oldPower, newPower);
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
        msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER, null, msgs);
      if (newPower != null)
        msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER, null, msgs);
      msgs = basicSetPower(newPower, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER, newPower, newPower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__STR, oldStr, str));
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
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER:
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
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__CONST:
        return getConst();
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER:
        return getPower();
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__STR:
        return getStr();
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
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__CONST:
        setConst((String)newValue);
        return;
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER:
        setPower((Expression)newValue);
        return;
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__STR:
        setStr((String)newValue);
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
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER:
        setPower((Expression)null);
        return;
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__STR:
        setStr(STR_EDEFAULT);
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
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__CONST:
        return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__POWER:
        return power != null;
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
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
    result.append(" (const: ");
    result.append(const_);
    result.append(", str: ");
    result.append(str);
    result.append(')');
    return result.toString();
  }

} //AtomicConstantExpressionImpl
