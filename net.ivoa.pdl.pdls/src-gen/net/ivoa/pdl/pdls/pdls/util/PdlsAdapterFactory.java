/**
 */
package net.ivoa.pdl.pdls.pdls.util;

import net.ivoa.pdl.pdls.pdls.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.ivoa.pdl.pdls.pdls.PdlsPackage
 * @generated
 */
public class PdlsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PdlsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdlsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PdlsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PdlsSwitch<Adapter> modelSwitch =
    new PdlsSwitch<Adapter>()
    {
      @Override
      public Adapter casePDL(PDL object)
      {
        return createPDLAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseParameterGroup(ParameterGroup object)
      {
        return createParameterGroupAdapter();
      }
      @Override
      public Adapter caseConstraintOnGroup(ConstraintOnGroup object)
      {
        return createConstraintOnGroupAdapter();
      }
      @Override
      public Adapter caseConditionalStatement(ConditionalStatement object)
      {
        return createConditionalStatementAdapter();
      }
      @Override
      public Adapter caseWhenConditionalStatement(WhenConditionalStatement object)
      {
        return createWhenConditionalStatementAdapter();
      }
      @Override
      public Adapter caseIfThenConditionalStatement(IfThenConditionalStatement object)
      {
        return createIfThenConditionalStatementAdapter();
      }
      @Override
      public Adapter caseConditionalClause(ConditionalClause object)
      {
        return createConditionalClauseAdapter();
      }
      @Override
      public Adapter caseAlwaysConditionalStatement(AlwaysConditionalStatement object)
      {
        return createAlwaysConditionalStatementAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseValueLargerThan(ValueLargerThan object)
      {
        return createValueLargerThanAdapter();
      }
      @Override
      public Adapter caseValueSmallerThan(ValueSmallerThan object)
      {
        return createValueSmallerThanAdapter();
      }
      @Override
      public Adapter caseValueInRange(ValueInRange object)
      {
        return createValueInRangeAdapter();
      }
      @Override
      public Adapter caseValueDifferentFrom(ValueDifferentFrom object)
      {
        return createValueDifferentFromAdapter();
      }
      @Override
      public Adapter caseisReal(isReal object)
      {
        return createisRealAdapter();
      }
      @Override
      public Adapter caseisRational(isRational object)
      {
        return createisRationalAdapter();
      }
      @Override
      public Adapter caseisInteger(isInteger object)
      {
        return createisIntegerAdapter();
      }
      @Override
      public Adapter casedefaultValue(defaultValue object)
      {
        return createdefaultValueAdapter();
      }
      @Override
      public Adapter caseBelongsToSet(BelongsToSet object)
      {
        return createBelongsToSetAdapter();
      }
      @Override
      public Adapter caseisNull(isNull object)
      {
        return createisNullAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseAtomicParameterExpression(AtomicParameterExpression object)
      {
        return createAtomicParameterExpressionAdapter();
      }
      @Override
      public Adapter caseAtomicConstantExpression(AtomicConstantExpression object)
      {
        return createAtomicConstantExpressionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseParenthesisContent(ParenthesisContent object)
      {
        return createParenthesisContentAdapter();
      }
      @Override
      public Adapter caseCriterion(Criterion object)
      {
        return createCriterionAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.PDL <em>PDL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.PDL
   * @generated
   */
  public Adapter createPDLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup <em>Parameter Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ParameterGroup
   * @generated
   */
  public Adapter createParameterGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ConstraintOnGroup <em>Constraint On Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ConstraintOnGroup
   * @generated
   */
  public Adapter createConstraintOnGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ConditionalStatement <em>Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ConditionalStatement
   * @generated
   */
  public Adapter createConditionalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement <em>When Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.WhenConditionalStatement
   * @generated
   */
  public Adapter createWhenConditionalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement <em>If Then Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement
   * @generated
   */
  public Adapter createIfThenConditionalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ConditionalClause <em>Conditional Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ConditionalClause
   * @generated
   */
  public Adapter createConditionalClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement <em>Always Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement
   * @generated
   */
  public Adapter createAlwaysConditionalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ValueLargerThan <em>Value Larger Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ValueLargerThan
   * @generated
   */
  public Adapter createValueLargerThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ValueSmallerThan <em>Value Smaller Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ValueSmallerThan
   * @generated
   */
  public Adapter createValueSmallerThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ValueInRange <em>Value In Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ValueInRange
   * @generated
   */
  public Adapter createValueInRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ValueDifferentFrom <em>Value Different From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ValueDifferentFrom
   * @generated
   */
  public Adapter createValueDifferentFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.isReal <em>is Real</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.isReal
   * @generated
   */
  public Adapter createisRealAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.isRational <em>is Rational</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.isRational
   * @generated
   */
  public Adapter createisRationalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.isInteger <em>is Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.isInteger
   * @generated
   */
  public Adapter createisIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.defaultValue <em>default Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.defaultValue
   * @generated
   */
  public Adapter createdefaultValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.BelongsToSet <em>Belongs To Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.BelongsToSet
   * @generated
   */
  public Adapter createBelongsToSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.isNull <em>is Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.isNull
   * @generated
   */
  public Adapter createisNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression <em>Atomic Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.AtomicParameterExpression
   * @generated
   */
  public Adapter createAtomicParameterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression <em>Atomic Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.AtomicConstantExpression
   * @generated
   */
  public Adapter createAtomicConstantExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent <em>Parenthesis Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.ParenthesisContent
   * @generated
   */
  public Adapter createParenthesisContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.Criterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.Criterion
   * @generated
   */
  public Adapter createCriterionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.ivoa.pdl.pdls.pdls.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.ivoa.pdl.pdls.pdls.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PdlsAdapterFactory
