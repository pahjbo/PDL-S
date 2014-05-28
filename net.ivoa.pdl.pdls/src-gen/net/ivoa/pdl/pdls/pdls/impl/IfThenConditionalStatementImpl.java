/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.ConditionalClause;
import net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.IfThenConditionalStatementImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link net.ivoa.pdl.pdls.pdls.impl.IfThenConditionalStatementImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenConditionalStatementImpl extends ConditionalStatementImpl implements IfThenConditionalStatement
{
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
   * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClause()
   * @generated
   * @ordered
   */
  protected ConditionalClause clause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfThenConditionalStatementImpl()
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
    return PdlsPackage.Literals.IF_THEN_CONDITIONAL_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION, oldCriterion, newCriterion);
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
        msgs = ((InternalEObject)criterion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION, null, msgs);
      if (newCriterion != null)
        msgs = ((InternalEObject)newCriterion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION, null, msgs);
      msgs = basicSetCriterion(newCriterion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION, newCriterion, newCriterion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalClause getClause()
  {
    return clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClause(ConditionalClause newClause, NotificationChain msgs)
  {
    ConditionalClause oldClause = clause;
    clause = newClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE, oldClause, newClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClause(ConditionalClause newClause)
  {
    if (newClause != clause)
    {
      NotificationChain msgs = null;
      if (clause != null)
        msgs = ((InternalEObject)clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE, null, msgs);
      if (newClause != null)
        msgs = ((InternalEObject)newClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE, null, msgs);
      msgs = basicSetClause(newClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE, newClause, newClause));
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
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION:
        return basicSetCriterion(null, msgs);
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE:
        return basicSetClause(null, msgs);
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
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION:
        return getCriterion();
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE:
        return getClause();
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
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION:
        setCriterion((ConditionalClause)newValue);
        return;
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE:
        setClause((ConditionalClause)newValue);
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
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION:
        setCriterion((ConditionalClause)null);
        return;
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE:
        setClause((ConditionalClause)null);
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
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CRITERION:
        return criterion != null;
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE:
        return clause != null;
    }
    return super.eIsSet(featureID);
  }

} //IfThenConditionalStatementImpl
