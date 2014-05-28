package net.ivoa.pdl.pdls.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement;
import net.ivoa.pdl.pdls.pdls.AtomicConstantExpression;
import net.ivoa.pdl.pdls.pdls.AtomicParameterExpression;
import net.ivoa.pdl.pdls.pdls.BelongsToSet;
import net.ivoa.pdl.pdls.pdls.ConditionalClause;
import net.ivoa.pdl.pdls.pdls.ConstraintOnGroup;
import net.ivoa.pdl.pdls.pdls.Criterion;
import net.ivoa.pdl.pdls.pdls.Function;
import net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement;
import net.ivoa.pdl.pdls.pdls.Operation;
import net.ivoa.pdl.pdls.pdls.Parameter;
import net.ivoa.pdl.pdls.pdls.ParameterGroup;
import net.ivoa.pdl.pdls.pdls.ParenthesisContent;
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
import net.ivoa.pdl.pdls.services.PdlsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PdlsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PdlsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PdlsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PdlsPackage.ALWAYS_CONDITIONAL_STATEMENT:
				if(context == grammarAccess.getAlwaysConditionalStatementRule() ||
				   context == grammarAccess.getConditionalStatementRule()) {
					sequence_AlwaysConditionalStatement(context, (AlwaysConditionalStatement) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.ATOMIC_CONSTANT_EXPRESSION:
				if(context == grammarAccess.getAtomicConstantExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_AtomicConstantExpression(context, (AtomicConstantExpression) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.ATOMIC_PARAMETER_EXPRESSION:
				if(context == grammarAccess.getAtomicParameterExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_AtomicParameterExpression(context, (AtomicParameterExpression) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.BELONGS_TO_SET:
				if(context == grammarAccess.getBelongsToSetRule() ||
				   context == grammarAccess.getConditionRule()) {
					sequence_BelongsToSet(context, (BelongsToSet) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.CONDITIONAL_CLAUSE:
				if(context == grammarAccess.getConditionalClauseRule() ||
				   context == grammarAccess.getConditionalClauseAccess().getCriterionLeftAction_1_0() ||
				   context == grammarAccess.getTerminalClauseRule()) {
					sequence_TerminalClause(context, (ConditionalClause) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.CONSTRAINT_ON_GROUP:
				if(context == grammarAccess.getConstraintOnGroupRule()) {
					sequence_ConstraintOnGroup(context, (ConstraintOnGroup) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.CRITERION:
				if(context == grammarAccess.getConditionalClauseRule()) {
					sequence_ConditionalClause(context, (Criterion) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.FUNCTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getFunctionRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.IF_THEN_CONDITIONAL_STATEMENT:
				if(context == grammarAccess.getConditionalStatementRule() ||
				   context == grammarAccess.getIfThenConditionalStatementRule()) {
					sequence_IfThenConditionalStatement(context, (IfThenConditionalStatement) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.OPERATION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.PARAMETER_GROUP:
				if(context == grammarAccess.getParameterGroupRule()) {
					sequence_ParameterGroup(context, (ParameterGroup) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.PARENTHESIS_CONTENT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getOperationLeftAction_1_0_0() ||
				   context == grammarAccess.getParenthesisContentRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_ParenthesisContent(context, (ParenthesisContent) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.SERVICE:
				if(context == grammarAccess.getPDLRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.VALUE_DIFFERENT_FROM:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getValueDifferentFromRule()) {
					sequence_ValueDifferentFrom(context, (ValueDifferentFrom) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.VALUE_IN_RANGE:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getValueInRangeRule()) {
					sequence_ValueInRange(context, (ValueInRange) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.VALUE_LARGER_THAN:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getValueLargerThanRule()) {
					sequence_ValueLargerThan(context, (ValueLargerThan) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.VALUE_SMALLER_THAN:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getValueSmallerThanRule()) {
					sequence_ValueSmallerThan(context, (ValueSmallerThan) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.WHEN_CONDITIONAL_STATEMENT:
				if(context == grammarAccess.getConditionalStatementRule()) {
					sequence_ConditionalStatement_WhenConditionalStatement(context, (WhenConditionalStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWhenConditionalStatementRule()) {
					sequence_WhenConditionalStatement(context, (WhenConditionalStatement) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.DEFAULT_VALUE:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getDefaultValueRule()) {
					sequence_defaultValue(context, (defaultValue) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.IS_INTEGER:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getIsIntegerRule()) {
					sequence_isInteger(context, (isInteger) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.IS_NULL:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getIsNullRule()) {
					sequence_isNull(context, (isNull) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.IS_RATIONAL:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getIsRationalRule()) {
					sequence_isRational(context, (isRational) semanticObject); 
					return; 
				}
				else break;
			case PdlsPackage.IS_REAL:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getIsRealRule()) {
					sequence_isReal(context, (isReal) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     clause=ConditionalClause
	 */
	protected void sequence_AlwaysConditionalStatement(EObject context, AlwaysConditionalStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.ALWAYS_CONDITIONAL_STATEMENT__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.ALWAYS_CONDITIONAL_STATEMENT__CLAUSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlwaysConditionalStatementAccess().getClauseConditionalClauseParserRuleCall_1_0(), semanticObject.getClause());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((const=Number power=Expression?) | str=STRING)
	 */
	protected void sequence_AtomicConstantExpression(EObject context, AtomicConstantExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pref=[Parameter|ParameterID] power=Expression?)
	 */
	protected void sequence_AtomicParameterExpression(EObject context, AtomicParameterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=Expression values+=Expression*)
	 */
	protected void sequence_BelongsToSet(EObject context, BelongsToSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionalClause_Criterion_1_0 conn=LogicalConnector right=TerminalClause)
	 */
	protected void sequence_ConditionalClause(EObject context, Criterion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (criterion=ConditionalClause comment=STRING?)
	 */
	protected void sequence_ConditionalStatement_WhenConditionalStatement(EObject context, WhenConditionalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=ConditionalStatement+
	 */
	protected void sequence_ConstraintOnGroup(EObject context, ConstraintOnGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Operation_1_0_0 op=OperationType right=TerminalExpression)
	 */
	protected void sequence_Expression(EObject context, Operation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.OPERATION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.OPERATION__OP));
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.OPERATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getOpOperationTypeEnumRuleCall_1_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=FunctionType expr=Expression)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.FUNCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.FUNCTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.FUNCTION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.FUNCTION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getNameFunctionTypeEnumRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (criterion=ConditionalClause clause=ConditionalClause)
	 */
	protected void sequence_IfThenConditionalStatement(EObject context, IfThenConditionalStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.IF_THEN_CONDITIONAL_STATEMENT__CRITERION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.IF_THEN_CONDITIONAL_STATEMENT__CRITERION));
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.IF_THEN_CONDITIONAL_STATEMENT__CLAUSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfThenConditionalStatementAccess().getCriterionConditionalClauseParserRuleCall_1_0(), semanticObject.getCriterion());
		feeder.accept(grammarAccess.getIfThenConditionalStatementAccess().getClauseConditionalClauseParserRuleCall_3_0(), semanticObject.getClause());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (params+=[Parameter|ParameterID] params+=[Parameter|ParameterID]*)* 
	 *         constraint=ConstraintOnGroup? 
	 *         active=WhenConditionalStatement? 
	 *         groups+=ParameterGroup*
	 *     )
	 */
	protected void sequence_ParameterGroup(EObject context, ParameterGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ParameterID type=ParameterType)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameParameterIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression power=Expression?)
	 */
	protected void sequence_ParenthesisContent(EObject context, ParenthesisContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters+=Parameter+ inputs+=ParameterGroup* outputs+=ParameterGroup*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression cond=Condition)
	 */
	protected void sequence_TerminalClause(EObject context, ConditionalClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.CONDITIONAL_CLAUSE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.CONDITIONAL_CLAUSE__EXPR));
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.CONDITIONAL_CLAUSE__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.CONDITIONAL_CLAUSE__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalClauseAccess().getExprExpressionParserRuleCall_0_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getTerminalClauseAccess().getCondConditionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_ValueDifferentFrom(EObject context, ValueDifferentFrom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.VALUE_DIFFERENT_FROM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.VALUE_DIFFERENT_FROM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueDifferentFromAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (inf=Expression sup=Expression)
	 */
	protected void sequence_ValueInRange(EObject context, ValueInRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.VALUE_IN_RANGE__INF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.VALUE_IN_RANGE__INF));
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.VALUE_IN_RANGE__SUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.VALUE_IN_RANGE__SUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueInRangeAccess().getInfExpressionParserRuleCall_3_0(), semanticObject.getInf());
		feeder.accept(grammarAccess.getValueInRangeAccess().getSupExpressionParserRuleCall_5_0(), semanticObject.getSup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_ValueLargerThan(EObject context, ValueLargerThan semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.VALUE_LARGER_THAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.VALUE_LARGER_THAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueLargerThanAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_ValueSmallerThan(EObject context, ValueSmallerThan semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.VALUE_SMALLER_THAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.VALUE_SMALLER_THAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueSmallerThanAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     criterion=ConditionalClause
	 */
	protected void sequence_WhenConditionalStatement(EObject context, WhenConditionalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_defaultValue(EObject context, defaultValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.DEFAULT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.DEFAULT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     isInteger?='is'
	 */
	protected void sequence_isInteger(EObject context, isInteger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.IS_INTEGER__IS_INTEGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.IS_INTEGER__IS_INTEGER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsIntegerAccess().getIsIntegerIsKeyword_0_0(), semanticObject.isIsInteger());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     isNull?='is'
	 */
	protected void sequence_isNull(EObject context, isNull semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.IS_NULL__IS_NULL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.IS_NULL__IS_NULL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsNullAccess().getIsNullIsKeyword_0_0(), semanticObject.isIsNull());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     isRational?='is'
	 */
	protected void sequence_isRational(EObject context, isRational semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.IS_RATIONAL__IS_RATIONAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.IS_RATIONAL__IS_RATIONAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsRationalAccess().getIsRationalIsKeyword_0_0(), semanticObject.isIsRational());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     isReal?='is'
	 */
	protected void sequence_isReal(EObject context, isReal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PdlsPackage.Literals.IS_REAL__IS_REAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PdlsPackage.Literals.IS_REAL__IS_REAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsRealAccess().getIsRealIsKeyword_0_0(), semanticObject.isIsReal());
		feeder.finish();
	}
}
