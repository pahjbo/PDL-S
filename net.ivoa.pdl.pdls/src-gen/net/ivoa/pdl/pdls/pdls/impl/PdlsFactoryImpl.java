/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdlsFactoryImpl extends EFactoryImpl implements PdlsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PdlsFactory init()
  {
    try
    {
      PdlsFactory thePdlsFactory = (PdlsFactory)EPackage.Registry.INSTANCE.getEFactory(PdlsPackage.eNS_URI);
      if (thePdlsFactory != null)
      {
        return thePdlsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PdlsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdlsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PdlsPackage.PDL: return createPDL();
      case PdlsPackage.SERVICE: return createService();
      case PdlsPackage.PARAMETER: return createParameter();
      case PdlsPackage.PARAMETER_GROUP: return createParameterGroup();
      case PdlsPackage.CONSTRAINT_ON_GROUP: return createConstraintOnGroup();
      case PdlsPackage.CONDITIONAL_STATEMENT: return createConditionalStatement();
      case PdlsPackage.WHEN_CONDITIONAL_STATEMENT: return createWhenConditionalStatement();
      case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT: return createIfThenConditionalStatement();
      case PdlsPackage.CONDITIONAL_CLAUSE: return createConditionalClause();
      case PdlsPackage.ALWAYS_CONDITIONAL_STATEMENT: return createAlwaysConditionalStatement();
      case PdlsPackage.CONDITION: return createCondition();
      case PdlsPackage.VALUE_LARGER_THAN: return createValueLargerThan();
      case PdlsPackage.VALUE_SMALLER_THAN: return createValueSmallerThan();
      case PdlsPackage.VALUE_IN_RANGE: return createValueInRange();
      case PdlsPackage.VALUE_DIFFERENT_FROM: return createValueDifferentFrom();
      case PdlsPackage.IS_REAL: return createisReal();
      case PdlsPackage.IS_RATIONAL: return createisRational();
      case PdlsPackage.IS_INTEGER: return createisInteger();
      case PdlsPackage.DEFAULT_VALUE: return createdefaultValue();
      case PdlsPackage.BELONGS_TO_SET: return createBelongsToSet();
      case PdlsPackage.IS_NULL: return createisNull();
      case PdlsPackage.FUNCTION: return createFunction();
      case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION: return createAtomicParameterExpression();
      case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION: return createAtomicConstantExpression();
      case PdlsPackage.EXPRESSION: return createExpression();
      case PdlsPackage.PARENTHESIS_CONTENT: return createParenthesisContent();
      case PdlsPackage.CRITERION: return createCriterion();
      case PdlsPackage.OPERATION: return createOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PdlsPackage.PARAMETER_TYPE:
        return createParameterTypeFromString(eDataType, initialValue);
      case PdlsPackage.FUNCTION_TYPE:
        return createFunctionTypeFromString(eDataType, initialValue);
      case PdlsPackage.OPERATION_TYPE:
        return createOperationTypeFromString(eDataType, initialValue);
      case PdlsPackage.LOGICAL_CONNECTOR:
        return createLogicalConnectorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PdlsPackage.PARAMETER_TYPE:
        return convertParameterTypeToString(eDataType, instanceValue);
      case PdlsPackage.FUNCTION_TYPE:
        return convertFunctionTypeToString(eDataType, instanceValue);
      case PdlsPackage.OPERATION_TYPE:
        return convertOperationTypeToString(eDataType, instanceValue);
      case PdlsPackage.LOGICAL_CONNECTOR:
        return convertLogicalConnectorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL createPDL()
  {
    PDLImpl pdl = new PDLImpl();
    return pdl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterGroup createParameterGroup()
  {
    ParameterGroupImpl parameterGroup = new ParameterGroupImpl();
    return parameterGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintOnGroup createConstraintOnGroup()
  {
    ConstraintOnGroupImpl constraintOnGroup = new ConstraintOnGroupImpl();
    return constraintOnGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalStatement createConditionalStatement()
  {
    ConditionalStatementImpl conditionalStatement = new ConditionalStatementImpl();
    return conditionalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenConditionalStatement createWhenConditionalStatement()
  {
    WhenConditionalStatementImpl whenConditionalStatement = new WhenConditionalStatementImpl();
    return whenConditionalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenConditionalStatement createIfThenConditionalStatement()
  {
    IfThenConditionalStatementImpl ifThenConditionalStatement = new IfThenConditionalStatementImpl();
    return ifThenConditionalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalClause createConditionalClause()
  {
    ConditionalClauseImpl conditionalClause = new ConditionalClauseImpl();
    return conditionalClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlwaysConditionalStatement createAlwaysConditionalStatement()
  {
    AlwaysConditionalStatementImpl alwaysConditionalStatement = new AlwaysConditionalStatementImpl();
    return alwaysConditionalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueLargerThan createValueLargerThan()
  {
    ValueLargerThanImpl valueLargerThan = new ValueLargerThanImpl();
    return valueLargerThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSmallerThan createValueSmallerThan()
  {
    ValueSmallerThanImpl valueSmallerThan = new ValueSmallerThanImpl();
    return valueSmallerThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueInRange createValueInRange()
  {
    ValueInRangeImpl valueInRange = new ValueInRangeImpl();
    return valueInRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueDifferentFrom createValueDifferentFrom()
  {
    ValueDifferentFromImpl valueDifferentFrom = new ValueDifferentFromImpl();
    return valueDifferentFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public isReal createisReal()
  {
    isRealImpl isReal = new isRealImpl();
    return isReal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public isRational createisRational()
  {
    isRationalImpl isRational = new isRationalImpl();
    return isRational;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public isInteger createisInteger()
  {
    isIntegerImpl isInteger = new isIntegerImpl();
    return isInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public defaultValue createdefaultValue()
  {
    defaultValueImpl defaultValue = new defaultValueImpl();
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BelongsToSet createBelongsToSet()
  {
    BelongsToSetImpl belongsToSet = new BelongsToSetImpl();
    return belongsToSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public isNull createisNull()
  {
    isNullImpl isNull = new isNullImpl();
    return isNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicParameterExpression createAtomicParameterExpression()
  {
    AtomicParameterExpressionImpl atomicParameterExpression = new AtomicParameterExpressionImpl();
    return atomicParameterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicConstantExpression createAtomicConstantExpression()
  {
    AtomicConstantExpressionImpl atomicConstantExpression = new AtomicConstantExpressionImpl();
    return atomicConstantExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesisContent createParenthesisContent()
  {
    ParenthesisContentImpl parenthesisContent = new ParenthesisContentImpl();
    return parenthesisContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Criterion createCriterion()
  {
    CriterionImpl criterion = new CriterionImpl();
    return criterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue)
  {
    ParameterType result = ParameterType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionType createFunctionTypeFromString(EDataType eDataType, String initialValue)
  {
    FunctionType result = FunctionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFunctionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue)
  {
    OperationType result = OperationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalConnector createLogicalConnectorFromString(EDataType eDataType, String initialValue)
  {
    LogicalConnector result = LogicalConnector.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicalConnectorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdlsPackage getPdlsPackage()
  {
    return (PdlsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PdlsPackage getPackage()
  {
    return PdlsPackage.eINSTANCE;
  }

} //PdlsFactoryImpl
