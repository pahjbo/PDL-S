/**
 */
package net.ivoa.pdl.pdls.pdls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.ivoa.pdl.pdls.pdls.PdlsFactory
 * @model kind="package"
 * @generated
 */
public interface PdlsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pdls";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ivoa.net/pdl/pdls/Pdls";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pdls";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PdlsPackage eINSTANCE = net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl.init();

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.PDLImpl <em>PDL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.PDLImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getPDL()
   * @generated
   */
  int PDL = 0;

  /**
   * The number of structural features of the '<em>PDL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PDL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ServiceImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getService()
   * @generated
   */
  int SERVICE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = PDL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__PARAMETERS = PDL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__INPUTS = PDL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__OUTPUTS = PDL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = PDL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ParameterImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParameterGroup()
   * @generated
   */
  int PARAMETER_GROUP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_GROUP__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_GROUP__CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Active</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_GROUP__ACTIVE = 3;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_GROUP__GROUPS = 4;

  /**
   * The number of structural features of the '<em>Parameter Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_GROUP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConstraintOnGroupImpl <em>Constraint On Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ConstraintOnGroupImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getConstraintOnGroup()
   * @generated
   */
  int CONSTRAINT_ON_GROUP = 4;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_ON_GROUP__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Constraint On Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_ON_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ConditionalStatementImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getConditionalStatement()
   * @generated
   */
  int CONDITIONAL_STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Conditional Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.WhenConditionalStatementImpl <em>When Conditional Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.WhenConditionalStatementImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getWhenConditionalStatement()
   * @generated
   */
  int WHEN_CONDITIONAL_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CONDITIONAL_STATEMENT__COMMENT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Criterion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CONDITIONAL_STATEMENT__CRITERION = CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Conditional Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CONDITIONAL_STATEMENT_FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.IfThenConditionalStatementImpl <em>If Then Conditional Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.IfThenConditionalStatementImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getIfThenConditionalStatement()
   * @generated
   */
  int IF_THEN_CONDITIONAL_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Criterion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_CONDITIONAL_STATEMENT__CRITERION = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_CONDITIONAL_STATEMENT__CLAUSE = CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Then Conditional Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_CONDITIONAL_STATEMENT_FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConditionalClauseImpl <em>Conditional Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ConditionalClauseImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getConditionalClause()
   * @generated
   */
  int CONDITIONAL_CLAUSE = 8;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CLAUSE__EXPR = 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CLAUSE__COND = 1;

  /**
   * The number of structural features of the '<em>Conditional Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.AlwaysConditionalStatementImpl <em>Always Conditional Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.AlwaysConditionalStatementImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getAlwaysConditionalStatement()
   * @generated
   */
  int ALWAYS_CONDITIONAL_STATEMENT = 9;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_CONDITIONAL_STATEMENT__CLAUSE = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Always Conditional Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALWAYS_CONDITIONAL_STATEMENT_FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ConditionImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 10;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueLargerThanImpl <em>Value Larger Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ValueLargerThanImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueLargerThan()
   * @generated
   */
  int VALUE_LARGER_THAN = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LARGER_THAN__VALUE = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Larger Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LARGER_THAN_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueSmallerThanImpl <em>Value Smaller Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ValueSmallerThanImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueSmallerThan()
   * @generated
   */
  int VALUE_SMALLER_THAN = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SMALLER_THAN__VALUE = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Smaller Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SMALLER_THAN_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueInRangeImpl <em>Value In Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ValueInRangeImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueInRange()
   * @generated
   */
  int VALUE_IN_RANGE = 13;

  /**
   * The feature id for the '<em><b>Inf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_IN_RANGE__INF = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_IN_RANGE__SUP = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value In Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_IN_RANGE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueDifferentFromImpl <em>Value Different From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ValueDifferentFromImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueDifferentFrom()
   * @generated
   */
  int VALUE_DIFFERENT_FROM = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DIFFERENT_FROM__VALUE = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Different From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DIFFERENT_FROM_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.isRealImpl <em>is Real</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.isRealImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisReal()
   * @generated
   */
  int IS_REAL = 15;

  /**
   * The feature id for the '<em><b>Is Real</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_REAL__IS_REAL = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>is Real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_REAL_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.isRationalImpl <em>is Rational</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.isRationalImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisRational()
   * @generated
   */
  int IS_RATIONAL = 16;

  /**
   * The feature id for the '<em><b>Is Rational</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_RATIONAL__IS_RATIONAL = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>is Rational</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_RATIONAL_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.isIntegerImpl <em>is Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.isIntegerImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisInteger()
   * @generated
   */
  int IS_INTEGER = 17;

  /**
   * The feature id for the '<em><b>Is Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_INTEGER__IS_INTEGER = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>is Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_INTEGER_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.defaultValueImpl <em>default Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.defaultValueImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getdefaultValue()
   * @generated
   */
  int DEFAULT_VALUE = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_VALUE__VALUE = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>default Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_VALUE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.BelongsToSetImpl <em>Belongs To Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.BelongsToSetImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getBelongsToSet()
   * @generated
   */
  int BELONGS_TO_SET = 19;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_SET__VALUES = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Belongs To Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_SET_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.isNullImpl <em>is Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.isNullImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisNull()
   * @generated
   */
  int IS_NULL = 20;

  /**
   * The feature id for the '<em><b>Is Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_NULL__IS_NULL = CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>is Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_NULL_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ExpressionImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 24;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.FunctionImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.AtomicParameterExpressionImpl <em>Atomic Parameter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.AtomicParameterExpressionImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getAtomicParameterExpression()
   * @generated
   */
  int ATOMIC_PARAMETER_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Pref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PARAMETER_EXPRESSION__PREF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Power</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PARAMETER_EXPRESSION__POWER = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atomic Parameter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PARAMETER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.AtomicConstantExpressionImpl <em>Atomic Constant Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.AtomicConstantExpressionImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getAtomicConstantExpression()
   * @generated
   */
  int ATOMIC_CONSTANT_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_CONSTANT_EXPRESSION__CONST = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Power</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_CONSTANT_EXPRESSION__POWER = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_CONSTANT_EXPRESSION__STR = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Atomic Constant Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.ParenthesisContentImpl <em>Parenthesis Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.ParenthesisContentImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParenthesisContent()
   * @generated
   */
  int PARENTHESIS_CONTENT = 25;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONTENT__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Power</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONTENT__POWER = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parenthesis Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_CONTENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.CriterionImpl <em>Criterion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.CriterionImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getCriterion()
   * @generated
   */
  int CRITERION = 26;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__EXPR = CONDITIONAL_CLAUSE__EXPR;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__COND = CONDITIONAL_CLAUSE__COND;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__LEFT = CONDITIONAL_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__CONN = CONDITIONAL_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__RIGHT = CONDITIONAL_CLAUSE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Criterion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION_FEATURE_COUNT = CONDITIONAL_CLAUSE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.impl.OperationImpl
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.ParameterType <em>Parameter Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.ParameterType
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 28;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.FunctionType <em>Function Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.FunctionType
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getFunctionType()
   * @generated
   */
  int FUNCTION_TYPE = 29;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.OperationType <em>Operation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.OperationType
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getOperationType()
   * @generated
   */
  int OPERATION_TYPE = 30;

  /**
   * The meta object id for the '{@link net.ivoa.pdl.pdls.pdls.LogicalConnector <em>Logical Connector</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.ivoa.pdl.pdls.pdls.LogicalConnector
   * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getLogicalConnector()
   * @generated
   */
  int LOGICAL_CONNECTOR = 31;


  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.PDL <em>PDL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PDL</em>'.
   * @see net.ivoa.pdl.pdls.pdls.PDL
   * @generated
   */
  EClass getPDL();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.ivoa.pdl.pdls.pdls.Service#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Service#getParameters()
   * @see #getService()
   * @generated
   */
  EReference getService_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link net.ivoa.pdl.pdls.pdls.Service#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Service#getInputs()
   * @see #getService()
   * @generated
   */
  EReference getService_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link net.ivoa.pdl.pdls.pdls.Service#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Service#getOutputs()
   * @see #getService()
   * @generated
   */
  EReference getService_Outputs();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Type();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup <em>Parameter Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Group</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParameterGroup
   * @generated
   */
  EClass getParameterGroup();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParameterGroup#getName()
   * @see #getParameterGroup()
   * @generated
   */
  EAttribute getParameterGroup_Name();

  /**
   * Returns the meta object for the reference list '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Params</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParameterGroup#getParams()
   * @see #getParameterGroup()
   * @generated
   */
  EReference getParameterGroup_Params();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParameterGroup#getConstraint()
   * @see #getParameterGroup()
   * @generated
   */
  EReference getParameterGroup_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParameterGroup#getActive()
   * @see #getParameterGroup()
   * @generated
   */
  EReference getParameterGroup_Active();

  /**
   * Returns the meta object for the containment reference list '{@link net.ivoa.pdl.pdls.pdls.ParameterGroup#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParameterGroup#getGroups()
   * @see #getParameterGroup()
   * @generated
   */
  EReference getParameterGroup_Groups();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ConstraintOnGroup <em>Constraint On Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint On Group</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ConstraintOnGroup
   * @generated
   */
  EClass getConstraintOnGroup();

  /**
   * Returns the meta object for the containment reference list '{@link net.ivoa.pdl.pdls.pdls.ConstraintOnGroup#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ConstraintOnGroup#getStatements()
   * @see #getConstraintOnGroup()
   * @generated
   */
  EReference getConstraintOnGroup_Statements();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ConditionalStatement <em>Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Statement</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ConditionalStatement
   * @generated
   */
  EClass getConditionalStatement();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement <em>When Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Conditional Statement</em>'.
   * @see net.ivoa.pdl.pdls.pdls.WhenConditionalStatement
   * @generated
   */
  EClass getWhenConditionalStatement();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getComment()
   * @see #getWhenConditionalStatement()
   * @generated
   */
  EAttribute getWhenConditionalStatement_Comment();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getCriterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Criterion</em>'.
   * @see net.ivoa.pdl.pdls.pdls.WhenConditionalStatement#getCriterion()
   * @see #getWhenConditionalStatement()
   * @generated
   */
  EReference getWhenConditionalStatement_Criterion();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement <em>If Then Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Conditional Statement</em>'.
   * @see net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement
   * @generated
   */
  EClass getIfThenConditionalStatement();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getCriterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Criterion</em>'.
   * @see net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getCriterion()
   * @see #getIfThenConditionalStatement()
   * @generated
   */
  EReference getIfThenConditionalStatement_Criterion();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement#getClause()
   * @see #getIfThenConditionalStatement()
   * @generated
   */
  EReference getIfThenConditionalStatement_Clause();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ConditionalClause <em>Conditional Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Clause</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ConditionalClause
   * @generated
   */
  EClass getConditionalClause();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ConditionalClause#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ConditionalClause#getExpr()
   * @see #getConditionalClause()
   * @generated
   */
  EReference getConditionalClause_Expr();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ConditionalClause#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ConditionalClause#getCond()
   * @see #getConditionalClause()
   * @generated
   */
  EReference getConditionalClause_Cond();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement <em>Always Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Always Conditional Statement</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement
   * @generated
   */
  EClass getAlwaysConditionalStatement();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement#getClause()
   * @see #getAlwaysConditionalStatement()
   * @generated
   */
  EReference getAlwaysConditionalStatement_Clause();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ValueLargerThan <em>Value Larger Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Larger Than</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueLargerThan
   * @generated
   */
  EClass getValueLargerThan();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ValueLargerThan#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueLargerThan#getValue()
   * @see #getValueLargerThan()
   * @generated
   */
  EReference getValueLargerThan_Value();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ValueSmallerThan <em>Value Smaller Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Smaller Than</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueSmallerThan
   * @generated
   */
  EClass getValueSmallerThan();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ValueSmallerThan#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueSmallerThan#getValue()
   * @see #getValueSmallerThan()
   * @generated
   */
  EReference getValueSmallerThan_Value();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ValueInRange <em>Value In Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value In Range</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueInRange
   * @generated
   */
  EClass getValueInRange();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ValueInRange#getInf <em>Inf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inf</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueInRange#getInf()
   * @see #getValueInRange()
   * @generated
   */
  EReference getValueInRange_Inf();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ValueInRange#getSup <em>Sup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sup</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueInRange#getSup()
   * @see #getValueInRange()
   * @generated
   */
  EReference getValueInRange_Sup();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ValueDifferentFrom <em>Value Different From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Different From</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueDifferentFrom
   * @generated
   */
  EClass getValueDifferentFrom();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ValueDifferentFrom#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ValueDifferentFrom#getValue()
   * @see #getValueDifferentFrom()
   * @generated
   */
  EReference getValueDifferentFrom_Value();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.isReal <em>is Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is Real</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isReal
   * @generated
   */
  EClass getisReal();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.isReal#isIsReal <em>Is Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Real</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isReal#isIsReal()
   * @see #getisReal()
   * @generated
   */
  EAttribute getisReal_IsReal();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.isRational <em>is Rational</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is Rational</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isRational
   * @generated
   */
  EClass getisRational();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.isRational#isIsRational <em>Is Rational</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Rational</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isRational#isIsRational()
   * @see #getisRational()
   * @generated
   */
  EAttribute getisRational_IsRational();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.isInteger <em>is Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is Integer</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isInteger
   * @generated
   */
  EClass getisInteger();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.isInteger#isIsInteger <em>Is Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Integer</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isInteger#isIsInteger()
   * @see #getisInteger()
   * @generated
   */
  EAttribute getisInteger_IsInteger();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.defaultValue <em>default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>default Value</em>'.
   * @see net.ivoa.pdl.pdls.pdls.defaultValue
   * @generated
   */
  EClass getdefaultValue();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.defaultValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see net.ivoa.pdl.pdls.pdls.defaultValue#getValue()
   * @see #getdefaultValue()
   * @generated
   */
  EReference getdefaultValue_Value();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.BelongsToSet <em>Belongs To Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belongs To Set</em>'.
   * @see net.ivoa.pdl.pdls.pdls.BelongsToSet
   * @generated
   */
  EClass getBelongsToSet();

  /**
   * Returns the meta object for the containment reference list '{@link net.ivoa.pdl.pdls.pdls.BelongsToSet#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see net.ivoa.pdl.pdls.pdls.BelongsToSet#getValues()
   * @see #getBelongsToSet()
   * @generated
   */
  EReference getBelongsToSet_Values();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.isNull <em>is Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is Null</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isNull
   * @generated
   */
  EClass getisNull();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.isNull#isIsNull <em>Is Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Null</em>'.
   * @see net.ivoa.pdl.pdls.pdls.isNull#isIsNull()
   * @see #getisNull()
   * @generated
   */
  EAttribute getisNull_IsNull();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.Function#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Function#getExpr()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Expr();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression <em>Atomic Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Parameter Expression</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AtomicParameterExpression
   * @generated
   */
  EClass getAtomicParameterExpression();

  /**
   * Returns the meta object for the reference '{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pref</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPref()
   * @see #getAtomicParameterExpression()
   * @generated
   */
  EReference getAtomicParameterExpression_Pref();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPower <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Power</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AtomicParameterExpression#getPower()
   * @see #getAtomicParameterExpression()
   * @generated
   */
  EReference getAtomicParameterExpression_Power();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression <em>Atomic Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Constant Expression</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AtomicConstantExpression
   * @generated
   */
  EClass getAtomicConstantExpression();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getConst()
   * @see #getAtomicConstantExpression()
   * @generated
   */
  EAttribute getAtomicConstantExpression_Const();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getPower <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Power</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getPower()
   * @see #getAtomicConstantExpression()
   * @generated
   */
  EReference getAtomicConstantExpression_Power();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str</em>'.
   * @see net.ivoa.pdl.pdls.pdls.AtomicConstantExpression#getStr()
   * @see #getAtomicConstantExpression()
   * @generated
   */
  EAttribute getAtomicConstantExpression_Str();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent <em>Parenthesis Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis Content</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParenthesisContent
   * @generated
   */
  EClass getParenthesisContent();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParenthesisContent#getExpr()
   * @see #getParenthesisContent()
   * @generated
   */
  EReference getParenthesisContent_Expr();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.ParenthesisContent#getPower <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Power</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParenthesisContent#getPower()
   * @see #getParenthesisContent()
   * @generated
   */
  EReference getParenthesisContent_Power();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.Criterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterion</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Criterion
   * @generated
   */
  EClass getCriterion();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.Criterion#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Criterion#getLeft()
   * @see #getCriterion()
   * @generated
   */
  EReference getCriterion_Left();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.Criterion#getConn <em>Conn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conn</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Criterion#getConn()
   * @see #getCriterion()
   * @generated
   */
  EAttribute getCriterion_Conn();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.Criterion#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Criterion#getRight()
   * @see #getCriterion()
   * @generated
   */
  EReference getCriterion_Right();

  /**
   * Returns the meta object for class '{@link net.ivoa.pdl.pdls.pdls.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link net.ivoa.pdl.pdls.pdls.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.ivoa.pdl.pdls.pdls.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.ivoa.pdl.pdls.pdls.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the meta object for enum '{@link net.ivoa.pdl.pdls.pdls.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Type</em>'.
   * @see net.ivoa.pdl.pdls.pdls.ParameterType
   * @generated
   */
  EEnum getParameterType();

  /**
   * Returns the meta object for enum '{@link net.ivoa.pdl.pdls.pdls.FunctionType <em>Function Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Function Type</em>'.
   * @see net.ivoa.pdl.pdls.pdls.FunctionType
   * @generated
   */
  EEnum getFunctionType();

  /**
   * Returns the meta object for enum '{@link net.ivoa.pdl.pdls.pdls.OperationType <em>Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operation Type</em>'.
   * @see net.ivoa.pdl.pdls.pdls.OperationType
   * @generated
   */
  EEnum getOperationType();

  /**
   * Returns the meta object for enum '{@link net.ivoa.pdl.pdls.pdls.LogicalConnector <em>Logical Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logical Connector</em>'.
   * @see net.ivoa.pdl.pdls.pdls.LogicalConnector
   * @generated
   */
  EEnum getLogicalConnector();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PdlsFactory getPdlsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.PDLImpl <em>PDL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.PDLImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getPDL()
     * @generated
     */
    EClass PDL = eINSTANCE.getPDL();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ServiceImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__PARAMETERS = eINSTANCE.getService_Parameters();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__INPUTS = eINSTANCE.getService_Inputs();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__OUTPUTS = eINSTANCE.getService_Outputs();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ParameterImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ParameterGroupImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParameterGroup()
     * @generated
     */
    EClass PARAMETER_GROUP = eINSTANCE.getParameterGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_GROUP__NAME = eINSTANCE.getParameterGroup_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_GROUP__PARAMS = eINSTANCE.getParameterGroup_Params();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_GROUP__CONSTRAINT = eINSTANCE.getParameterGroup_Constraint();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_GROUP__ACTIVE = eINSTANCE.getParameterGroup_Active();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_GROUP__GROUPS = eINSTANCE.getParameterGroup_Groups();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConstraintOnGroupImpl <em>Constraint On Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ConstraintOnGroupImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getConstraintOnGroup()
     * @generated
     */
    EClass CONSTRAINT_ON_GROUP = eINSTANCE.getConstraintOnGroup();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_ON_GROUP__STATEMENTS = eINSTANCE.getConstraintOnGroup_Statements();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ConditionalStatementImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getConditionalStatement()
     * @generated
     */
    EClass CONDITIONAL_STATEMENT = eINSTANCE.getConditionalStatement();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.WhenConditionalStatementImpl <em>When Conditional Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.WhenConditionalStatementImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getWhenConditionalStatement()
     * @generated
     */
    EClass WHEN_CONDITIONAL_STATEMENT = eINSTANCE.getWhenConditionalStatement();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHEN_CONDITIONAL_STATEMENT__COMMENT = eINSTANCE.getWhenConditionalStatement_Comment();

    /**
     * The meta object literal for the '<em><b>Criterion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_CONDITIONAL_STATEMENT__CRITERION = eINSTANCE.getWhenConditionalStatement_Criterion();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.IfThenConditionalStatementImpl <em>If Then Conditional Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.IfThenConditionalStatementImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getIfThenConditionalStatement()
     * @generated
     */
    EClass IF_THEN_CONDITIONAL_STATEMENT = eINSTANCE.getIfThenConditionalStatement();

    /**
     * The meta object literal for the '<em><b>Criterion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_CONDITIONAL_STATEMENT__CRITERION = eINSTANCE.getIfThenConditionalStatement_Criterion();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_CONDITIONAL_STATEMENT__CLAUSE = eINSTANCE.getIfThenConditionalStatement_Clause();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConditionalClauseImpl <em>Conditional Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ConditionalClauseImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getConditionalClause()
     * @generated
     */
    EClass CONDITIONAL_CLAUSE = eINSTANCE.getConditionalClause();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_CLAUSE__EXPR = eINSTANCE.getConditionalClause_Expr();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_CLAUSE__COND = eINSTANCE.getConditionalClause_Cond();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.AlwaysConditionalStatementImpl <em>Always Conditional Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.AlwaysConditionalStatementImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getAlwaysConditionalStatement()
     * @generated
     */
    EClass ALWAYS_CONDITIONAL_STATEMENT = eINSTANCE.getAlwaysConditionalStatement();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALWAYS_CONDITIONAL_STATEMENT__CLAUSE = eINSTANCE.getAlwaysConditionalStatement_Clause();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ConditionImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueLargerThanImpl <em>Value Larger Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ValueLargerThanImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueLargerThan()
     * @generated
     */
    EClass VALUE_LARGER_THAN = eINSTANCE.getValueLargerThan();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_LARGER_THAN__VALUE = eINSTANCE.getValueLargerThan_Value();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueSmallerThanImpl <em>Value Smaller Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ValueSmallerThanImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueSmallerThan()
     * @generated
     */
    EClass VALUE_SMALLER_THAN = eINSTANCE.getValueSmallerThan();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_SMALLER_THAN__VALUE = eINSTANCE.getValueSmallerThan_Value();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueInRangeImpl <em>Value In Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ValueInRangeImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueInRange()
     * @generated
     */
    EClass VALUE_IN_RANGE = eINSTANCE.getValueInRange();

    /**
     * The meta object literal for the '<em><b>Inf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_IN_RANGE__INF = eINSTANCE.getValueInRange_Inf();

    /**
     * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_IN_RANGE__SUP = eINSTANCE.getValueInRange_Sup();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ValueDifferentFromImpl <em>Value Different From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ValueDifferentFromImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getValueDifferentFrom()
     * @generated
     */
    EClass VALUE_DIFFERENT_FROM = eINSTANCE.getValueDifferentFrom();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_DIFFERENT_FROM__VALUE = eINSTANCE.getValueDifferentFrom_Value();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.isRealImpl <em>is Real</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.isRealImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisReal()
     * @generated
     */
    EClass IS_REAL = eINSTANCE.getisReal();

    /**
     * The meta object literal for the '<em><b>Is Real</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_REAL__IS_REAL = eINSTANCE.getisReal_IsReal();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.isRationalImpl <em>is Rational</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.isRationalImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisRational()
     * @generated
     */
    EClass IS_RATIONAL = eINSTANCE.getisRational();

    /**
     * The meta object literal for the '<em><b>Is Rational</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_RATIONAL__IS_RATIONAL = eINSTANCE.getisRational_IsRational();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.isIntegerImpl <em>is Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.isIntegerImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisInteger()
     * @generated
     */
    EClass IS_INTEGER = eINSTANCE.getisInteger();

    /**
     * The meta object literal for the '<em><b>Is Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_INTEGER__IS_INTEGER = eINSTANCE.getisInteger_IsInteger();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.defaultValueImpl <em>default Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.defaultValueImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getdefaultValue()
     * @generated
     */
    EClass DEFAULT_VALUE = eINSTANCE.getdefaultValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT_VALUE__VALUE = eINSTANCE.getdefaultValue_Value();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.BelongsToSetImpl <em>Belongs To Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.BelongsToSetImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getBelongsToSet()
     * @generated
     */
    EClass BELONGS_TO_SET = eINSTANCE.getBelongsToSet();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BELONGS_TO_SET__VALUES = eINSTANCE.getBelongsToSet_Values();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.isNullImpl <em>is Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.isNullImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getisNull()
     * @generated
     */
    EClass IS_NULL = eINSTANCE.getisNull();

    /**
     * The meta object literal for the '<em><b>Is Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_NULL__IS_NULL = eINSTANCE.getisNull_IsNull();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.FunctionImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPR = eINSTANCE.getFunction_Expr();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.AtomicParameterExpressionImpl <em>Atomic Parameter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.AtomicParameterExpressionImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getAtomicParameterExpression()
     * @generated
     */
    EClass ATOMIC_PARAMETER_EXPRESSION = eINSTANCE.getAtomicParameterExpression();

    /**
     * The meta object literal for the '<em><b>Pref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_PARAMETER_EXPRESSION__PREF = eINSTANCE.getAtomicParameterExpression_Pref();

    /**
     * The meta object literal for the '<em><b>Power</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_PARAMETER_EXPRESSION__POWER = eINSTANCE.getAtomicParameterExpression_Power();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.AtomicConstantExpressionImpl <em>Atomic Constant Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.AtomicConstantExpressionImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getAtomicConstantExpression()
     * @generated
     */
    EClass ATOMIC_CONSTANT_EXPRESSION = eINSTANCE.getAtomicConstantExpression();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_CONSTANT_EXPRESSION__CONST = eINSTANCE.getAtomicConstantExpression_Const();

    /**
     * The meta object literal for the '<em><b>Power</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_CONSTANT_EXPRESSION__POWER = eINSTANCE.getAtomicConstantExpression_Power();

    /**
     * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_CONSTANT_EXPRESSION__STR = eINSTANCE.getAtomicConstantExpression_Str();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ExpressionImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.ParenthesisContentImpl <em>Parenthesis Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.ParenthesisContentImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParenthesisContent()
     * @generated
     */
    EClass PARENTHESIS_CONTENT = eINSTANCE.getParenthesisContent();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS_CONTENT__EXPR = eINSTANCE.getParenthesisContent_Expr();

    /**
     * The meta object literal for the '<em><b>Power</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS_CONTENT__POWER = eINSTANCE.getParenthesisContent_Power();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.CriterionImpl <em>Criterion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.CriterionImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getCriterion()
     * @generated
     */
    EClass CRITERION = eINSTANCE.getCriterion();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERION__LEFT = eINSTANCE.getCriterion_Left();

    /**
     * The meta object literal for the '<em><b>Conn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRITERION__CONN = eINSTANCE.getCriterion_Conn();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRITERION__RIGHT = eINSTANCE.getCriterion_Right();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.impl.OperationImpl
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.ParameterType <em>Parameter Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.ParameterType
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getParameterType()
     * @generated
     */
    EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.FunctionType <em>Function Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.FunctionType
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getFunctionType()
     * @generated
     */
    EEnum FUNCTION_TYPE = eINSTANCE.getFunctionType();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.OperationType <em>Operation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.OperationType
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getOperationType()
     * @generated
     */
    EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

    /**
     * The meta object literal for the '{@link net.ivoa.pdl.pdls.pdls.LogicalConnector <em>Logical Connector</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.ivoa.pdl.pdls.pdls.LogicalConnector
     * @see net.ivoa.pdl.pdls.pdls.impl.PdlsPackageImpl#getLogicalConnector()
     * @generated
     */
    EEnum LOGICAL_CONNECTOR = eINSTANCE.getLogicalConnector();

  }

} //PdlsPackage
