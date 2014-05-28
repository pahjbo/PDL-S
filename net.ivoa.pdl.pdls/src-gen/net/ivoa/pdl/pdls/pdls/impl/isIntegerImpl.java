/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.PdlsPackage;
import net.ivoa.pdl.pdls.pdls.isInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>is Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.isIntegerImpl#isIsInteger <em>Is Integer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class isIntegerImpl extends ConditionImpl implements isInteger
{
  /**
   * The default value of the '{@link #isIsInteger() <em>Is Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInteger()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INTEGER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInteger() <em>Is Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInteger()
   * @generated
   * @ordered
   */
  protected boolean isInteger = IS_INTEGER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected isIntegerImpl()
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
    return PdlsPackage.Literals.IS_INTEGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInteger()
  {
    return isInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInteger(boolean newIsInteger)
  {
    boolean oldIsInteger = isInteger;
    isInteger = newIsInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.IS_INTEGER__IS_INTEGER, oldIsInteger, isInteger));
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
      case PdlsPackage.IS_INTEGER__IS_INTEGER:
        return isIsInteger();
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
      case PdlsPackage.IS_INTEGER__IS_INTEGER:
        setIsInteger((Boolean)newValue);
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
      case PdlsPackage.IS_INTEGER__IS_INTEGER:
        setIsInteger(IS_INTEGER_EDEFAULT);
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
      case PdlsPackage.IS_INTEGER__IS_INTEGER:
        return isInteger != IS_INTEGER_EDEFAULT;
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
    result.append(" (isInteger: ");
    result.append(isInteger);
    result.append(')');
    return result.toString();
  }

} //isIntegerImpl
