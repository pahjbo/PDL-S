/**
 */
package net.ivoa.pdl.pdls.pdls.impl;

import net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement;
import net.ivoa.pdl.pdls.pdls.AtomicConstantExpression;
import net.ivoa.pdl.pdls.pdls.AtomicParameterExpression;
import net.ivoa.pdl.pdls.pdls.BelongsToSet;
import net.ivoa.pdl.pdls.pdls.Condition;
import net.ivoa.pdl.pdls.pdls.ConditionalClause;
import net.ivoa.pdl.pdls.pdls.ConditionalStatement;
import net.ivoa.pdl.pdls.pdls.ConstraintOnGroup;
import net.ivoa.pdl.pdls.pdls.Criterion;
import net.ivoa.pdl.pdls.pdls.Expression;
import net.ivoa.pdl.pdls.pdls.Function;
import net.ivoa.pdl.pdls.pdls.FunctionType;
import net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement;
import net.ivoa.pdl.pdls.pdls.LogicalConnector;
import net.ivoa.pdl.pdls.pdls.Operation;
import net.ivoa.pdl.pdls.pdls.OperationType;
import net.ivoa.pdl.pdls.pdls.Parameter;
import net.ivoa.pdl.pdls.pdls.ParameterGroup;
import net.ivoa.pdl.pdls.pdls.ParameterType;
import net.ivoa.pdl.pdls.pdls.ParenthesisContent;
import net.ivoa.pdl.pdls.pdls.PdlsFactory;
import net.ivoa.pdl.pdls.pdls.PdlsPackage;
import net.ivoa.pdl.pdls.pdls.Service;
import net.ivoa.pdl.pdls.pdls.ValueDifferentFrom;
import net.ivoa.pdl.pdls.pdls.ValueInRange;
import net.ivoa.pdl.pdls.pdls.ValueLargerThan;
import net.ivoa.pdl.pdls.pdls.ValueSmallerThan;
import net.ivoa.pdl.pdls.pdls.WhenConditionalStatement;
import net.ivoa.pdl.pdls.pdls.defaultValue;
import net.ivoa.pdl.pdls.pdls.isInteger;
import net.ivoa.pdl.pdls.pdls.isNull;
import net.ivoa.pdl.pdls.pdls.isRational;
import net.ivoa.pdl.pdls.pdls.isReal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdlsPackageImpl extends EPackageImpl implements PdlsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pdlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintOnGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenConditionalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifThenConditionalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alwaysConditionalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueLargerThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueSmallerThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueInRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueDifferentFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isRealEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isRationalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isIntegerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass belongsToSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicParameterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicConstantExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesisContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass criterionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum functionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logicalConnectorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.ivoa.pdl.pdls.pdls.PdlsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PdlsPackageImpl()
  {
    super(eNS_URI, PdlsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PdlsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PdlsPackage init()
  {
    if (isInited) return (PdlsPackage)EPackage.Registry.INSTANCE.getEPackage(PdlsPackage.eNS_URI);

    // Obtain or create and register package
    PdlsPackageImpl thePdlsPackage = (PdlsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PdlsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PdlsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePdlsPackage.createPackageContents();

    // Initialize created meta-data
    thePdlsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePdlsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PdlsPackage.eNS_URI, thePdlsPackage);
    return thePdlsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPDL()
  {
    return pdlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Parameters()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Inputs()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Outputs()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Type()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterGroup()
  {
    return parameterGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterGroup_Name()
  {
    return (EAttribute)parameterGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterGroup_Params()
  {
    return (EReference)parameterGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterGroup_Constraint()
  {
    return (EReference)parameterGroupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterGroup_Active()
  {
    return (EReference)parameterGroupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterGroup_Groups()
  {
    return (EReference)parameterGroupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintOnGroup()
  {
    return constraintOnGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintOnGroup_Statements()
  {
    return (EReference)constraintOnGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalStatement()
  {
    return conditionalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenConditionalStatement()
  {
    return whenConditionalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhenConditionalStatement_Comment()
  {
    return (EAttribute)whenConditionalStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenConditionalStatement_Criterion()
  {
    return (EReference)whenConditionalStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfThenConditionalStatement()
  {
    return ifThenConditionalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenConditionalStatement_Criterion()
  {
    return (EReference)ifThenConditionalStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenConditionalStatement_Clause()
  {
    return (EReference)ifThenConditionalStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalClause()
  {
    return conditionalClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalClause_Expr()
  {
    return (EReference)conditionalClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalClause_Cond()
  {
    return (EReference)conditionalClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlwaysConditionalStatement()
  {
    return alwaysConditionalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlwaysConditionalStatement_Clause()
  {
    return (EReference)alwaysConditionalStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueLargerThan()
  {
    return valueLargerThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueLargerThan_Value()
  {
    return (EReference)valueLargerThanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueSmallerThan()
  {
    return valueSmallerThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueSmallerThan_Value()
  {
    return (EReference)valueSmallerThanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueInRange()
  {
    return valueInRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueInRange_Inf()
  {
    return (EReference)valueInRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueInRange_Sup()
  {
    return (EReference)valueInRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueDifferentFrom()
  {
    return valueDifferentFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueDifferentFrom_Value()
  {
    return (EReference)valueDifferentFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getisReal()
  {
    return isRealEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getisReal_IsReal()
  {
    return (EAttribute)isRealEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getisRational()
  {
    return isRationalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getisRational_IsRational()
  {
    return (EAttribute)isRationalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getisInteger()
  {
    return isIntegerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getisInteger_IsInteger()
  {
    return (EAttribute)isIntegerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdefaultValue()
  {
    return defaultValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdefaultValue_Value()
  {
    return (EReference)defaultValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBelongsToSet()
  {
    return belongsToSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBelongsToSet_Values()
  {
    return (EReference)belongsToSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getisNull()
  {
    return isNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getisNull_IsNull()
  {
    return (EAttribute)isNullEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Expr()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicParameterExpression()
  {
    return atomicParameterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicParameterExpression_Pref()
  {
    return (EReference)atomicParameterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicParameterExpression_Power()
  {
    return (EReference)atomicParameterExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicConstantExpression()
  {
    return atomicConstantExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicConstantExpression_Const()
  {
    return (EAttribute)atomicConstantExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicConstantExpression_Power()
  {
    return (EReference)atomicConstantExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicConstantExpression_Str()
  {
    return (EAttribute)atomicConstantExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesisContent()
  {
    return parenthesisContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesisContent_Expr()
  {
    return (EReference)parenthesisContentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesisContent_Power()
  {
    return (EReference)parenthesisContentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCriterion()
  {
    return criterionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCriterion_Left()
  {
    return (EReference)criterionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCriterion_Conn()
  {
    return (EAttribute)criterionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCriterion_Right()
  {
    return (EReference)criterionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Left()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Op()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Right()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterType()
  {
    return parameterTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFunctionType()
  {
    return functionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperationType()
  {
    return operationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogicalConnector()
  {
    return logicalConnectorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PdlsFactory getPdlsFactory()
  {
    return (PdlsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pdlEClass = createEClass(PDL);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);
    createEReference(serviceEClass, SERVICE__PARAMETERS);
    createEReference(serviceEClass, SERVICE__INPUTS);
    createEReference(serviceEClass, SERVICE__OUTPUTS);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);
    createEAttribute(parameterEClass, PARAMETER__TYPE);

    parameterGroupEClass = createEClass(PARAMETER_GROUP);
    createEAttribute(parameterGroupEClass, PARAMETER_GROUP__NAME);
    createEReference(parameterGroupEClass, PARAMETER_GROUP__PARAMS);
    createEReference(parameterGroupEClass, PARAMETER_GROUP__CONSTRAINT);
    createEReference(parameterGroupEClass, PARAMETER_GROUP__ACTIVE);
    createEReference(parameterGroupEClass, PARAMETER_GROUP__GROUPS);

    constraintOnGroupEClass = createEClass(CONSTRAINT_ON_GROUP);
    createEReference(constraintOnGroupEClass, CONSTRAINT_ON_GROUP__STATEMENTS);

    conditionalStatementEClass = createEClass(CONDITIONAL_STATEMENT);

    whenConditionalStatementEClass = createEClass(WHEN_CONDITIONAL_STATEMENT);
    createEAttribute(whenConditionalStatementEClass, WHEN_CONDITIONAL_STATEMENT__COMMENT);
    createEReference(whenConditionalStatementEClass, WHEN_CONDITIONAL_STATEMENT__CRITERION);

    ifThenConditionalStatementEClass = createEClass(IF_THEN_CONDITIONAL_STATEMENT);
    createEReference(ifThenConditionalStatementEClass, IF_THEN_CONDITIONAL_STATEMENT__CRITERION);
    createEReference(ifThenConditionalStatementEClass, IF_THEN_CONDITIONAL_STATEMENT__CLAUSE);

    conditionalClauseEClass = createEClass(CONDITIONAL_CLAUSE);
    createEReference(conditionalClauseEClass, CONDITIONAL_CLAUSE__EXPR);
    createEReference(conditionalClauseEClass, CONDITIONAL_CLAUSE__COND);

    alwaysConditionalStatementEClass = createEClass(ALWAYS_CONDITIONAL_STATEMENT);
    createEReference(alwaysConditionalStatementEClass, ALWAYS_CONDITIONAL_STATEMENT__CLAUSE);

    conditionEClass = createEClass(CONDITION);

    valueLargerThanEClass = createEClass(VALUE_LARGER_THAN);
    createEReference(valueLargerThanEClass, VALUE_LARGER_THAN__VALUE);

    valueSmallerThanEClass = createEClass(VALUE_SMALLER_THAN);
    createEReference(valueSmallerThanEClass, VALUE_SMALLER_THAN__VALUE);

    valueInRangeEClass = createEClass(VALUE_IN_RANGE);
    createEReference(valueInRangeEClass, VALUE_IN_RANGE__INF);
    createEReference(valueInRangeEClass, VALUE_IN_RANGE__SUP);

    valueDifferentFromEClass = createEClass(VALUE_DIFFERENT_FROM);
    createEReference(valueDifferentFromEClass, VALUE_DIFFERENT_FROM__VALUE);

    isRealEClass = createEClass(IS_REAL);
    createEAttribute(isRealEClass, IS_REAL__IS_REAL);

    isRationalEClass = createEClass(IS_RATIONAL);
    createEAttribute(isRationalEClass, IS_RATIONAL__IS_RATIONAL);

    isIntegerEClass = createEClass(IS_INTEGER);
    createEAttribute(isIntegerEClass, IS_INTEGER__IS_INTEGER);

    defaultValueEClass = createEClass(DEFAULT_VALUE);
    createEReference(defaultValueEClass, DEFAULT_VALUE__VALUE);

    belongsToSetEClass = createEClass(BELONGS_TO_SET);
    createEReference(belongsToSetEClass, BELONGS_TO_SET__VALUES);

    isNullEClass = createEClass(IS_NULL);
    createEAttribute(isNullEClass, IS_NULL__IS_NULL);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__EXPR);

    atomicParameterExpressionEClass = createEClass(ATOMIC_PARAMETER_EXPRESSION);
    createEReference(atomicParameterExpressionEClass, ATOMIC_PARAMETER_EXPRESSION__PREF);
    createEReference(atomicParameterExpressionEClass, ATOMIC_PARAMETER_EXPRESSION__POWER);

    atomicConstantExpressionEClass = createEClass(ATOMIC_CONSTANT_EXPRESSION);
    createEAttribute(atomicConstantExpressionEClass, ATOMIC_CONSTANT_EXPRESSION__CONST);
    createEReference(atomicConstantExpressionEClass, ATOMIC_CONSTANT_EXPRESSION__POWER);
    createEAttribute(atomicConstantExpressionEClass, ATOMIC_CONSTANT_EXPRESSION__STR);

    expressionEClass = createEClass(EXPRESSION);

    parenthesisContentEClass = createEClass(PARENTHESIS_CONTENT);
    createEReference(parenthesisContentEClass, PARENTHESIS_CONTENT__EXPR);
    createEReference(parenthesisContentEClass, PARENTHESIS_CONTENT__POWER);

    criterionEClass = createEClass(CRITERION);
    createEReference(criterionEClass, CRITERION__LEFT);
    createEAttribute(criterionEClass, CRITERION__CONN);
    createEReference(criterionEClass, CRITERION__RIGHT);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__LEFT);
    createEAttribute(operationEClass, OPERATION__OP);
    createEReference(operationEClass, OPERATION__RIGHT);

    // Create enums
    parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
    functionTypeEEnum = createEEnum(FUNCTION_TYPE);
    operationTypeEEnum = createEEnum(OPERATION_TYPE);
    logicalConnectorEEnum = createEEnum(LOGICAL_CONNECTOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    serviceEClass.getESuperTypes().add(this.getPDL());
    whenConditionalStatementEClass.getESuperTypes().add(this.getConditionalStatement());
    ifThenConditionalStatementEClass.getESuperTypes().add(this.getConditionalStatement());
    alwaysConditionalStatementEClass.getESuperTypes().add(this.getConditionalStatement());
    valueLargerThanEClass.getESuperTypes().add(this.getCondition());
    valueSmallerThanEClass.getESuperTypes().add(this.getCondition());
    valueInRangeEClass.getESuperTypes().add(this.getCondition());
    valueDifferentFromEClass.getESuperTypes().add(this.getCondition());
    isRealEClass.getESuperTypes().add(this.getCondition());
    isRationalEClass.getESuperTypes().add(this.getCondition());
    isIntegerEClass.getESuperTypes().add(this.getCondition());
    defaultValueEClass.getESuperTypes().add(this.getCondition());
    belongsToSetEClass.getESuperTypes().add(this.getCondition());
    isNullEClass.getESuperTypes().add(this.getCondition());
    functionEClass.getESuperTypes().add(this.getExpression());
    atomicParameterExpressionEClass.getESuperTypes().add(this.getExpression());
    atomicConstantExpressionEClass.getESuperTypes().add(this.getExpression());
    parenthesisContentEClass.getESuperTypes().add(this.getExpression());
    criterionEClass.getESuperTypes().add(this.getConditionalClause());
    operationEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(pdlEClass, net.ivoa.pdl.pdls.pdls.PDL.class, "PDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Inputs(), this.getParameterGroup(), null, "inputs", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_Outputs(), this.getParameterGroup(), null, "outputs", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Type(), this.getParameterType(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterGroupEClass, ParameterGroup.class, "ParameterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterGroup_Params(), this.getParameter(), null, "params", null, 0, -1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterGroup_Constraint(), this.getConstraintOnGroup(), null, "constraint", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterGroup_Active(), this.getWhenConditionalStatement(), null, "active", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterGroup_Groups(), this.getParameterGroup(), null, "groups", null, 0, -1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintOnGroupEClass, ConstraintOnGroup.class, "ConstraintOnGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraintOnGroup_Statements(), this.getConditionalStatement(), null, "statements", null, 0, -1, ConstraintOnGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalStatementEClass, ConditionalStatement.class, "ConditionalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(whenConditionalStatementEClass, WhenConditionalStatement.class, "WhenConditionalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWhenConditionalStatement_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, WhenConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenConditionalStatement_Criterion(), this.getConditionalClause(), null, "criterion", null, 0, 1, WhenConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifThenConditionalStatementEClass, IfThenConditionalStatement.class, "IfThenConditionalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfThenConditionalStatement_Criterion(), this.getConditionalClause(), null, "criterion", null, 0, 1, IfThenConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenConditionalStatement_Clause(), this.getConditionalClause(), null, "clause", null, 0, 1, IfThenConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalClauseEClass, ConditionalClause.class, "ConditionalClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalClause_Expr(), this.getExpression(), null, "expr", null, 0, 1, ConditionalClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalClause_Cond(), this.getCondition(), null, "cond", null, 0, 1, ConditionalClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alwaysConditionalStatementEClass, AlwaysConditionalStatement.class, "AlwaysConditionalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlwaysConditionalStatement_Clause(), this.getConditionalClause(), null, "clause", null, 0, 1, AlwaysConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valueLargerThanEClass, ValueLargerThan.class, "ValueLargerThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueLargerThan_Value(), this.getExpression(), null, "value", null, 0, 1, ValueLargerThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueSmallerThanEClass, ValueSmallerThan.class, "ValueSmallerThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueSmallerThan_Value(), this.getExpression(), null, "value", null, 0, 1, ValueSmallerThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueInRangeEClass, ValueInRange.class, "ValueInRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueInRange_Inf(), this.getExpression(), null, "inf", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValueInRange_Sup(), this.getExpression(), null, "sup", null, 0, 1, ValueInRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueDifferentFromEClass, ValueDifferentFrom.class, "ValueDifferentFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueDifferentFrom_Value(), this.getExpression(), null, "value", null, 0, 1, ValueDifferentFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isRealEClass, isReal.class, "isReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getisReal_IsReal(), ecorePackage.getEBoolean(), "isReal", null, 0, 1, isReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isRationalEClass, isRational.class, "isRational", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getisRational_IsRational(), ecorePackage.getEBoolean(), "isRational", null, 0, 1, isRational.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isIntegerEClass, isInteger.class, "isInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getisInteger_IsInteger(), ecorePackage.getEBoolean(), "isInteger", null, 0, 1, isInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultValueEClass, defaultValue.class, "defaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdefaultValue_Value(), this.getExpression(), null, "value", null, 0, 1, defaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(belongsToSetEClass, BelongsToSet.class, "BelongsToSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBelongsToSet_Values(), this.getExpression(), null, "values", null, 0, -1, BelongsToSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isNullEClass, isNull.class, "isNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getisNull_IsNull(), ecorePackage.getEBoolean(), "isNull", null, 0, 1, isNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), this.getFunctionType(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Expr(), this.getExpression(), null, "expr", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicParameterExpressionEClass, AtomicParameterExpression.class, "AtomicParameterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicParameterExpression_Pref(), this.getParameter(), null, "pref", null, 0, 1, AtomicParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicParameterExpression_Power(), this.getExpression(), null, "power", null, 0, 1, AtomicParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicConstantExpressionEClass, AtomicConstantExpression.class, "AtomicConstantExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtomicConstantExpression_Const(), ecorePackage.getEString(), "const", null, 0, 1, AtomicConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicConstantExpression_Power(), this.getExpression(), null, "power", null, 0, 1, AtomicConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtomicConstantExpression_Str(), ecorePackage.getEString(), "str", null, 0, 1, AtomicConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parenthesisContentEClass, ParenthesisContent.class, "ParenthesisContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenthesisContent_Expr(), this.getExpression(), null, "expr", null, 0, 1, ParenthesisContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParenthesisContent_Power(), this.getExpression(), null, "power", null, 0, 1, ParenthesisContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(criterionEClass, Criterion.class, "Criterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCriterion_Left(), this.getConditionalClause(), null, "left", null, 0, 1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCriterion_Conn(), this.getLogicalConnector(), "conn", null, 0, 1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCriterion_Right(), this.getConditionalClause(), null, "right", null, 0, 1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Left(), this.getExpression(), null, "left", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Op(), this.getOperationType(), "op", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Right(), this.getExpression(), null, "right", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
    addEEnumLiteral(parameterTypeEEnum, ParameterType.BOOLEAN);
    addEEnumLiteral(parameterTypeEEnum, ParameterType.STRING);
    addEEnumLiteral(parameterTypeEEnum, ParameterType.INTEGER);
    addEEnumLiteral(parameterTypeEEnum, ParameterType.REAL);
    addEEnumLiteral(parameterTypeEEnum, ParameterType.DATE);

    initEEnum(functionTypeEEnum, FunctionType.class, "FunctionType");
    addEEnumLiteral(functionTypeEEnum, FunctionType.SIZE);
    addEEnumLiteral(functionTypeEEnum, FunctionType.ABS);
    addEEnumLiteral(functionTypeEEnum, FunctionType.SIN);
    addEEnumLiteral(functionTypeEEnum, FunctionType.COS);
    addEEnumLiteral(functionTypeEEnum, FunctionType.TAN);
    addEEnumLiteral(functionTypeEEnum, FunctionType.ASIN);
    addEEnumLiteral(functionTypeEEnum, FunctionType.ACOS);
    addEEnumLiteral(functionTypeEEnum, FunctionType.ATAN);
    addEEnumLiteral(functionTypeEEnum, FunctionType.EXP);
    addEEnumLiteral(functionTypeEEnum, FunctionType.LOG);
    addEEnumLiteral(functionTypeEEnum, FunctionType.SUM);
    addEEnumLiteral(functionTypeEEnum, FunctionType.PRODUCT);

    initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
    addEEnumLiteral(operationTypeEEnum, OperationType.PLUS);
    addEEnumLiteral(operationTypeEEnum, OperationType.MINUS);
    addEEnumLiteral(operationTypeEEnum, OperationType.MULTIPLY);
    addEEnumLiteral(operationTypeEEnum, OperationType.DIVIDE);
    addEEnumLiteral(operationTypeEEnum, OperationType.SCALAR);

    initEEnum(logicalConnectorEEnum, LogicalConnector.class, "LogicalConnector");
    addEEnumLiteral(logicalConnectorEEnum, LogicalConnector.AND);
    addEEnumLiteral(logicalConnectorEEnum, LogicalConnector.OR);

    // Create resource
    createResource(eNS_URI);
  }

} //PdlsPackageImpl
