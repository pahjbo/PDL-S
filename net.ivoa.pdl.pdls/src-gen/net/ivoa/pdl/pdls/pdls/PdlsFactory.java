/**
 */
package net.ivoa.pdl.pdls.pdls;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage
 * @generated
 */
public interface PdlsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PdlsFactory eINSTANCE = net.ivoa.pdl.pdls.pdls.impl.PdlsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>PDL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PDL</em>'.
   * @generated
   */
  PDL createPDL();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Parameter Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Group</em>'.
   * @generated
   */
  ParameterGroup createParameterGroup();

  /**
   * Returns a new object of class '<em>Constraint On Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint On Group</em>'.
   * @generated
   */
  ConstraintOnGroup createConstraintOnGroup();

  /**
   * Returns a new object of class '<em>Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Statement</em>'.
   * @generated
   */
  ConditionalStatement createConditionalStatement();

  /**
   * Returns a new object of class '<em>When Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Conditional Statement</em>'.
   * @generated
   */
  WhenConditionalStatement createWhenConditionalStatement();

  /**
   * Returns a new object of class '<em>If Then Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Then Conditional Statement</em>'.
   * @generated
   */
  IfThenConditionalStatement createIfThenConditionalStatement();

  /**
   * Returns a new object of class '<em>Conditional Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Clause</em>'.
   * @generated
   */
  ConditionalClause createConditionalClause();

  /**
   * Returns a new object of class '<em>Always Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Always Conditional Statement</em>'.
   * @generated
   */
  AlwaysConditionalStatement createAlwaysConditionalStatement();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Value Larger Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Larger Than</em>'.
   * @generated
   */
  ValueLargerThan createValueLargerThan();

  /**
   * Returns a new object of class '<em>Value Smaller Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Smaller Than</em>'.
   * @generated
   */
  ValueSmallerThan createValueSmallerThan();

  /**
   * Returns a new object of class '<em>Value In Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value In Range</em>'.
   * @generated
   */
  ValueInRange createValueInRange();

  /**
   * Returns a new object of class '<em>Value Different From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Different From</em>'.
   * @generated
   */
  ValueDifferentFrom createValueDifferentFrom();

  /**
   * Returns a new object of class '<em>is Real</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>is Real</em>'.
   * @generated
   */
  isReal createisReal();

  /**
   * Returns a new object of class '<em>is Rational</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>is Rational</em>'.
   * @generated
   */
  isRational createisRational();

  /**
   * Returns a new object of class '<em>is Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>is Integer</em>'.
   * @generated
   */
  isInteger createisInteger();

  /**
   * Returns a new object of class '<em>default Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>default Value</em>'.
   * @generated
   */
  defaultValue createdefaultValue();

  /**
   * Returns a new object of class '<em>Belongs To Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Belongs To Set</em>'.
   * @generated
   */
  BelongsToSet createBelongsToSet();

  /**
   * Returns a new object of class '<em>is Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>is Null</em>'.
   * @generated
   */
  isNull createisNull();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Atomic Parameter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Parameter Expression</em>'.
   * @generated
   */
  AtomicParameterExpression createAtomicParameterExpression();

  /**
   * Returns a new object of class '<em>Atomic Constant Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Constant Expression</em>'.
   * @generated
   */
  AtomicConstantExpression createAtomicConstantExpression();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Parenthesis Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesis Content</em>'.
   * @generated
   */
  ParenthesisContent createParenthesisContent();

  /**
   * Returns a new object of class '<em>Criterion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Criterion</em>'.
   * @generated
   */
  Criterion createCriterion();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PdlsPackage getPdlsPackage();

} //PdlsFactory
