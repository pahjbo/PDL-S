/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.ConditionalClause;
import net.ivoa.pdl.pdls.pdls.Criterion;
import net.ivoa.pdl.pdls.pdls.LogicalConnector;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.CriterionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.CriterionImpl#getConn <em>Conn</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.CriterionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriterionImpl extends ConditionalClauseImpl implements Criterion
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ConditionalClause left;

  /**
   * The default value of the '{@link #getConn() <em>Conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConn()
   * @generated
   * @ordered
   */
  protected static final LogicalConnector CONN_EDEFAULT = LogicalConnector.AND;

  /**
   * The cached value of the '{@link #getConn() <em>Conn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConn()
   * @generated
   * @ordered
   */
  protected LogicalConnector conn = CONN_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected ConditionalClause right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CriterionImpl()
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
    return PdlsPackage.Literals.CRITERION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalClause getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(ConditionalClause newLeft, NotificationChain msgs)
  {
    ConditionalClause oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.CRITERION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ConditionalClause newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.CRITERION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.CRITERION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.CRITERION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalConnector getConn()
  {
    return conn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConn(LogicalConnector newConn)
  {
    LogicalConnector oldConn = conn;
    conn = newConn == null ? CONN_EDEFAULT : newConn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.CRITERION__CONN, oldConn, conn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalClause getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(ConditionalClause newRight, NotificationChain msgs)
  {
    ConditionalClause oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.CRITERION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(ConditionalClause newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.CRITERION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.CRITERION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.CRITERION__RIGHT, newRight, newRight));
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
      case PdlsPackage.CRITERION__LEFT:
        return basicSetLeft(null, msgs);
      case PdlsPackage.CRITERION__RIGHT:
        return basicSetRight(null, msgs);
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
      case PdlsPackage.CRITERION__LEFT:
        return getLeft();
      case PdlsPackage.CRITERION__CONN:
        return getConn();
      case PdlsPackage.CRITERION__RIGHT:
        return getRight();
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
      case PdlsPackage.CRITERION__LEFT:
        setLeft((ConditionalClause)newValue);
        return;
      case PdlsPackage.CRITERION__CONN:
        setConn((LogicalConnector)newValue);
        return;
      case PdlsPackage.CRITERION__RIGHT:
        setRight((ConditionalClause)newValue);
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
      case PdlsPackage.CRITERION__LEFT:
        setLeft((ConditionalClause)null);
        return;
      case PdlsPackage.CRITERION__CONN:
        setConn(CONN_EDEFAULT);
        return;
      case PdlsPackage.CRITERION__RIGHT:
        setRight((ConditionalClause)null);
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
      case PdlsPackage.CRITERION__LEFT:
        return left != null;
      case PdlsPackage.CRITERION__CONN:
        return conn != CONN_EDEFAULT;
      case PdlsPackage.CRITERION__RIGHT:
        return right != null;
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
    result.append(" (conn: ");
    result.append(conn);
    result.append(')');
    return result.toString();
  }

} //CriterionImpl
