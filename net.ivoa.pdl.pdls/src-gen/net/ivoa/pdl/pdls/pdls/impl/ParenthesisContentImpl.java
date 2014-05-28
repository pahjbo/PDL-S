/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.Expression;
import net.ivoa.pdl.pdls.pdls.ParenthesisContent;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parenthesis Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ParenthesisContentImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.ParenthesisContentImpl#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParenthesisContentImpl extends ExpressionImpl implements ParenthesisContent
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

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
  protected ParenthesisContentImpl()
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
    return PdlsPackage.Literals.PARENTHESIS_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.PARENTHESIS_CONTENT__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARENTHESIS_CONTENT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARENTHESIS_CONTENT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.PARENTHESIS_CONTENT__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.PARENTHESIS_CONTENT__POWER, oldPower, newPower);
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
        msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARENTHESIS_CONTENT__POWER, null, msgs);
      if (newPower != null)
        msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.PARENTHESIS_CONTENT__POWER, null, msgs);
      msgs = basicSetPower(newPower, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.PARENTHESIS_CONTENT__POWER, newPower, newPower));
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
      case PdlsPackage.PARENTHESIS_CONTENT__EXPR:
        return basicSetExpr(null, msgs);
      case PdlsPackage.PARENTHESIS_CONTENT__POWER:
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
      case PdlsPackage.PARENTHESIS_CONTENT__EXPR:
        return getExpr();
      case PdlsPackage.PARENTHESIS_CONTENT__POWER:
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
      case PdlsPackage.PARENTHESIS_CONTENT__EXPR:
        setExpr((Expression)newValue);
        return;
      case PdlsPackage.PARENTHESIS_CONTENT__POWER:
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
      case PdlsPackage.PARENTHESIS_CONTENT__EXPR:
        setExpr((Expression)null);
        return;
      case PdlsPackage.PARENTHESIS_CONTENT__POWER:
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
      case PdlsPackage.PARENTHESIS_CONTENT__EXPR:
        return expr != null;
      case PdlsPackage.PARENTHESIS_CONTENT__POWER:
        return power != null;
    }
    return super.eIsSet(featureID);
  }

} //ParenthesisContentImpl
