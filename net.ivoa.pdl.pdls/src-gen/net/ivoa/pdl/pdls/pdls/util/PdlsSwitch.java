/**
 */
package net.ivoa.pdl.pdls.pdls.util;

import net.ivoa.pdl.pdls.pdls.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage
 * @generated
 */
public class PdlsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdlsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdlsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PdlsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PdlsPackage.PDL:
      {
        PDL pdl = (PDL)theEObject;
        T result = casePDL(pdl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = casePDL(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.PARAMETER_GROUP:
      {
        ParameterGroup parameterGroup = (ParameterGroup)theEObject;
        T result = caseParameterGroup(parameterGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.CONSTRAINT_ON_GROUP:
      {
        ConstraintOnGroup constraintOnGroup = (ConstraintOnGroup)theEObject;
        T result = caseConstraintOnGroup(constraintOnGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.CONDITIONAL_STATEMENT:
      {
        ConditionalStatement conditionalStatement = (ConditionalStatement)theEObject;
        T result = caseConditionalStatement(conditionalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT:
      {
        WhenConditionalStatement whenConditionalStatement = (WhenConditionalStatement)theEObject;
        T result = caseWhenConditionalStatement(whenConditionalStatement);
        if (result == null) result = caseConditionalStatement(whenConditionalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT:
      {
        IfThenConditionalStatement ifThenConditionalStatement = (IfThenConditionalStatement)theEObject;
        T result = caseIfThenConditionalStatement(ifThenConditionalStatement);
        if (result == null) result = caseConditionalStatement(ifThenConditionalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.CONDITIONAL_CLAUSE:
      {
        ConditionalClause conditionalClause = (ConditionalClause)theEObject;
        T result = caseConditionalClause(conditionalClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.ALWAYS_CONDITIONAL_STATEMENT:
      {
        AlwaysConditionalStatement alwaysConditionalStatement = (AlwaysConditionalStatement)theEObject;
        T result = caseAlwaysConditionalStatement(alwaysConditionalStatement);
        if (result == null) result = caseConditionalStatement(alwaysConditionalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.VALUE_LARGER_THAN:
      {
        ValueLargerThan valueLargerThan = (ValueLargerThan)theEObject;
        T result = caseValueLargerThan(valueLargerThan);
        if (result == null) result = caseCondition(valueLargerThan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.VALUE_SMALLER_THAN:
      {
        ValueSmallerThan valueSmallerThan = (ValueSmallerThan)theEObject;
        T result = caseValueSmallerThan(valueSmallerThan);
        if (result == null) result = caseCondition(valueSmallerThan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.VALUE_IN_RANGE:
      {
        ValueInRange valueInRange = (ValueInRange)theEObject;
        T result = caseValueInRange(valueInRange);
        if (result == null) result = caseCondition(valueInRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.VALUE_DIFFERENT_FROM:
      {
        ValueDifferentFrom valueDifferentFrom = (ValueDifferentFrom)theEObject;
        T result = caseValueDifferentFrom(valueDifferentFrom);
        if (result == null) result = caseCondition(valueDifferentFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.IS_REAL:
      {
        isReal isReal = (isReal)theEObject;
        T result = caseisReal(isReal);
        if (result == null) result = caseCondition(isReal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.IS_RATIONAL:
      {
        isRational isRational = (isRational)theEObject;
        T result = caseisRational(isRational);
        if (result == null) result = caseCondition(isRational);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.IS_INTEGER:
      {
        isInteger isInteger = (isInteger)theEObject;
        T result = caseisInteger(isInteger);
        if (result == null) result = caseCondition(isInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.DEFAULT_VALUE:
      {
        defaultValue defaultValue = (defaultValue)theEObject;
        T result = casedefaultValue(defaultValue);
        if (result == null) result = caseCondition(defaultValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.BELONGS_TO_SET:
      {
        BelongsToSet belongsToSet = (BelongsToSet)theEObject;
        T result = caseBelongsToSet(belongsToSet);
        if (result == null) result = caseCondition(belongsToSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.IS_NULL:
      {
        isNull isNull = (isNull)theEObject;
        T result = caseisNull(isNull);
        if (result == null) result = caseCondition(isNull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseExpression(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION:
      {
        AtomicParameterExpression atomicParameterExpression = (AtomicParameterExpression)theEObject;
        T result = caseAtomicParameterExpression(atomicParameterExpression);
        if (result == null) result = caseExpression(atomicParameterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION:
      {
        AtomicConstantExpression atomicConstantExpression = (AtomicConstantExpression)theEObject;
        T result = caseAtomicConstantExpression(atomicConstantExpression);
        if (result == null) result = caseExpression(atomicConstantExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.PARENTHESIS_CONTENT:
      {
        ParenthesisContent parenthesisContent = (ParenthesisContent)theEObject;
        T result = caseParenthesisContent(parenthesisContent);
        if (result == null) result = caseExpression(parenthesisContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.CRITERION:
      {
        Criterion criterion = (Criterion)theEObject;
        T result = caseCriterion(criterion);
        if (result == null) result = caseConditionalClause(criterion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PdlsPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseExpression(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PDL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PDL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePDL(PDL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterGroup(ParameterGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint On Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint On Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintOnGroup(ConstraintOnGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalStatement(ConditionalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Conditional Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenConditionalStatement(WhenConditionalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Conditional Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenConditionalStatement(IfThenConditionalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalClause(ConditionalClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Always Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Always Conditional Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlwaysConditionalStatement(AlwaysConditionalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Larger Than</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Larger Than</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueLargerThan(ValueLargerThan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Smaller Than</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Smaller Than</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueSmallerThan(ValueSmallerThan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value In Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value In Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueInRange(ValueInRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Different From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Different From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueDifferentFrom(ValueDifferentFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>is Real</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>is Real</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseisReal(isReal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>is Rational</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>is Rational</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseisRational(isRational object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>is Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>is Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseisInteger(isInteger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>default Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>default Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedefaultValue(defaultValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Belongs To Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Belongs To Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBelongsToSet(BelongsToSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>is Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>is Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseisNull(isNull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Parameter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Parameter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicParameterExpression(AtomicParameterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Constant Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Constant Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicConstantExpression(AtomicConstantExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesis Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesis Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesisContent(ParenthesisContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCriterion(Criterion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PdlsSwitch
