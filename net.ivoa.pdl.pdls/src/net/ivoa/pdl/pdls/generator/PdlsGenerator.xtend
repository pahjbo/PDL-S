/*
 * Paul Harrison
 */
package net.ivoa.pdl.pdls.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import net.ivoa.pdl.pdls.pdls.Service
import net.ivoa.pdl.pdls.pdls.Parameter
import net.ivoa.pdl.pdls.pdls.ParameterGroup
import net.ivoa.pdl.pdls.pdls.ConditionalStatement
import net.ivoa.pdl.pdls.pdls.IfThenConditionalStatement
import net.ivoa.pdl.pdls.pdls.WhenConditionalStatement
import net.ivoa.pdl.pdls.pdls.AlwaysConditionalStatement
import net.ivoa.pdl.pdls.pdls.ConditionalClause
import net.ivoa.pdl.pdls.pdls.Expression
import net.ivoa.pdl.pdls.pdls.Condition

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class PdlsGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val sdecl = resource.allContents.filter(typeof(Service)).head // surely there must be a better way of getting this one....
		val filename = sdecl.name + '.pdl.xml'
		fsa.generateFile(filename, sdecl.pdl)
	}
	
	def pdl(Service service)'''
	<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
	<Service xmlns="http://www.ivoa.net/xml/PDL/v1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.ivoa.net/xml/Parameter/v0.1 PDL-V1.0.xsd">
	<!-- file generated from PDL/S -->
		<ServiceName>«service.name»</ServiceName>
		<Parameters>
		«FOR f:service.parameters»
		   «f.pdl»
		«ENDFOR»
		</Parameters>
		<Inputs>
		«FOR f:service.inputs»
			«f.pdl»
		«ENDFOR»
		</Inputs>
		<Outputs>
		«FOR f:service.outputs»
			«f.pdl»
		«ENDFOR»
		</Outputs>
   </Service>
	'''
   def pdl(Parameter e)'''
   <parameter>
 		<Name>«e.name»</Name>
 		<ParameterType>«e.type»</ParameterType>
   </parameter>
   '''
 
   def pdl(ParameterGroup e)'''
   <ParameterGroup>
     <Name>«e.name»</Name>
     «FOR f:e.params»
     <ParameterRef ParameterName="«f.name»"/>
     «ENDFOR»
     «IF e.constraint != null»
     <ConstraintOnGroup>
        «FOR f:e.constraint.statements»
        		«f.pdl»
        «ENDFOR»
     </ConstraintOnGroup>
     «ENDIF»
   </ParameterGroup>
   '''
 
   def pdl (ConditionalStatement e)
   {
   	switch e {
   		IfThenConditionalStatement: (e as IfThenConditionalStatement).pdl
   		WhenConditionalStatement: (e as WhenConditionalStatement).pdl
   		AlwaysConditionalStatement: (e as AlwaysConditionalStatement).pdl
   		default: "unknown statement" + e.class
   		
   	}
   }
 
    def pdl(IfThenConditionalStatement e)'''
    <ConditionalStatement xsi:type="IfThenConditionalStatement">
       <if>
         «e.criterion.pdl»
       </if>
       <then>
         «e.clause.pdl»
       </then>
    </ConditionalStatement>
    '''
    def pdl(WhenConditionalStatement e)'''
    <ConditionalStatement xsi:type="WhenConditionalStatement">
       <when>
         «e.criterion.pdl»
       </when>
    </ConditionalStatement>
    '''
    def pdl(AlwaysConditionalStatement e)'''
    <ConditionalStatement xsi:type="AlwaysConditionalStatement">
       <always>
          «e.clause.pdl»
       </always>
    </ConditionalStatement>
    '''
 
 	def pdl(ConditionalClause e)'''
 	<Criterion xsi:type="Criterion">
 	  «e.expr.pdl»
 	  «e.cond.pdl»
 	</Criterion>
 	'''
 	
 	def pdl(Expression e)'''
 	<Expression>
 	</Expression>
 	'''
 	
 	def pdl(Condition e)'''
 	<ConditionType>
 	</ConditionType>
 	'''
}
