/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.ConditionalClause;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;
import net.ivoa.pdl.pdls.pdls.WhenConditionalStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.WhenConditionalStatementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.WhenConditionalStatementImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenConditionalStatementImpl extends ConditionalStatementImpl implements WhenConditionalStatement
{
  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriterion()
   * @generated
   * @ordered
   */
  protected ConditionalClause criterion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenConditionalStatementImpl()
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
    return PdlsPackage.Literals.WHEN_CONDITIONAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.WHEN_CONDITIONAL_STATEMENT__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalClause getCriterion()
  {
    return criterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCriterion(ConditionalClause newCriterion, NotificationChain msgs)
  {
    ConditionalClause oldCriterion = criterion;
    criterion = newCriterion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION, oldCriterion, newCriterion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCriterion(ConditionalClause newCriterion)
  {
    if (newCriterion != criterion)
    {
      NotificationChain msgs = null;
      if (criterion != null)
        msgs = ((InternalEObject)criterion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION, null, msgs);
      if (newCriterion != null)
        msgs = ((InternalEObject)newCriterion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION, null, msgs);
      msgs = basicSetCriterion(newCriterion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION, newCriterion, newCriterion));
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
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION:
        return basicSetCriterion(null, msgs);
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
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__COMMENT:
        return getComment();
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION:
        return getCriterion();
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
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__COMMENT:
        setComment((String)newValue);
        return;
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION:
        setCriterion((ConditionalClause)newValue);
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
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION:
        setCriterion((ConditionalClause)null);
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
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT__CRITERION:
        return criterion != null;
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
    result.append(" (comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //WhenConditionalStatementImpl
