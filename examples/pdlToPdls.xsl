<?xml version="1.0" encoding="UTF-8"?>
<!-- stylesheet to convert PDL to PDL/S (not comprehensive) -->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:p="http://www.ivoa.net/xml/PDL/v1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  >
   <xsl:output method="text" indent="no"  />
   <xsl:strip-space elements="*"/>
	<xsl:template match="/">
		<xsl:apply-templates/>
	</xsl:template>
   <xsl:template match="p:Service">
      <xsl:value-of select="concat('service ',p:ServiceName)"/>
      <xsl:text>
      {
          parameters 
          {
            </xsl:text><xsl:apply-templates select="p:Parameters/p:parameter"/><xsl:text>
          }
          input
          {
             </xsl:text><xsl:apply-templates  select="p:Inputs"/><xsl:text>
          }
          output
          {
             </xsl:text><xsl:apply-templates select="p:Outputs"/><xsl:text>
          }
      }
   </xsl:text>
   </xsl:template>
   
   <xsl:template name="iogroup">
    
            params = <xsl:value-of select="p:ParameterRef/@ParameterName" separator=", "/><xsl:text>;</xsl:text>
            <xsl:apply-templates select="p:ConstraintOnGroup|p:ParameterGroup"/>
       
   </xsl:template>
   
   <xsl:template match="p:Inputs|p:Outputs">
      <xsl:call-template name="iogroup"></xsl:call-template>
   </xsl:template>
   
   <xsl:template match="p:parameter"><!-- this in particular is missing lots of parameter metadata -->
       <xsl:value-of select='p:Name'/>
       <xsl:if test="p:Dimension/p:Constant != 1">
       <xsl:value-of select='concat("[",p:Dimension/p:Constant,"]")'/>
       </xsl:if>
       <xsl:value-of select='concat(" : ", p:ParameterType, ";")'/><xsl:text>
       </xsl:text>
   </xsl:template>
   
   
   <xsl:template match="p:ParameterGroup">
        <xsl:value-of select='concat("group ",p:Name, " ")'/>
        {
        <xsl:call-template name="iogroup"></xsl:call-template>
        }
   </xsl:template>
   
   <xsl:template match="p:ConstraintOnGroup">
       constraints 
       <xsl:apply-templates/>
   </xsl:template>
   
   <xsl:template match='p:ConstraintOnGroup/p:ConditionalStatement'>
      <xsl:text>
      &lt;&lt; </xsl:text>
           <xsl:apply-templates select="*[not(self::p:comment)]"/>
           <xsl:apply-templates select="p:comment"/>
      <xsl:text> &gt;&gt;
      </xsl:text>
   </xsl:template>
   
   <xsl:template match="p:comment">
       <xsl:if test="string-length(.)!=0">
         <xsl:value-of select="concat(': &quot;',.,'&quot;')"/>
       </xsl:if>
    </xsl:template>
   

   <xsl:template match='p:always'>
      <xsl:text> assert </xsl:text><xsl:apply-templates/>
   </xsl:template>

   <xsl:template match='p:if'>
      <xsl:text> if </xsl:text><xsl:apply-templates/>
   </xsl:template>
   <xsl:template match='p:then'>
      <xsl:text> then </xsl:text><xsl:apply-templates/>
   </xsl:template>
   
   <xsl:template match='p:when'>
      <xsl:text> when </xsl:text><xsl:apply-templates/>
   </xsl:template>

 <xsl:template match="p:Criterion">
     <xsl:apply-templates/>
 </xsl:template>
 <xsl:template match="p:Expression[@xsi:type='ParenthesisContent']">
     <xsl:text>(</xsl:text><xsl:apply-templates/><xsl:text>)</xsl:text>
 </xsl:template>
 
 <xsl:template match="p:Expression">
     <xsl:apply-templates/>
 </xsl:template>
 
  <xsl:template match="p:Function">
     <xsl:value-of select="concat(@functionName,'(')"/>
     <xsl:apply-templates/>
     <xsl:text>)</xsl:text>
 </xsl:template>
 
 
   <xsl:template match='p:parameterRef'> <!-- inconsistent capitalization... -->
      <xsl:text>$</xsl:text><xsl:value-of select="@ParameterName"/>
   </xsl:template>
   
   <xsl:template match="p:Power">
      <xsl:text>^</xsl:text><xsl:apply-templates/>
   </xsl:template>
   <xsl:template match="p:expression">
      <xsl:apply-templates/>
   </xsl:template>
 
    <xsl:template match="p:Operation">
      <xsl:choose >
        <xsl:when test="@operationType='MINUS'"><xsl:text>-</xsl:text></xsl:when>
        <xsl:when test="@operationType='PLUS'"><xsl:text>+</xsl:text></xsl:when>
        <xsl:when test="@operationType='MULTIPLY'"><xsl:text>*</xsl:text></xsl:when>
        <xsl:when test="@operationType='DIVIDE'"><xsl:text>/</xsl:text></xsl:when>
        <xsl:when test="@operationType='SCALAR'"><xsl:text>·</xsl:text></xsl:when>
      </xsl:choose>
      <xsl:apply-templates/>
   </xsl:template>
   

   <xsl:template match='p:Constant'>
     <xsl:value-of select="."/>
   </xsl:template>
   
   <xsl:template match="p:ConditionType[@xsi:type='IsNull']">
     <xsl:text> is null </xsl:text> 
   </xsl:template>  
   <xsl:template match="p:ConditionType[@xsi:type='IsInteger']">
     <xsl:text> is integer </xsl:text> 
   </xsl:template>  
   <xsl:template match="p:ConditionType[@xsi:type='IsReal']">
     <xsl:text> is real </xsl:text> 
   </xsl:template>  
   <xsl:template match="p:ConditionType[@xsi:type='ValueDifferentFrom']">
     <xsl:text> != </xsl:text> 
     <xsl:apply-templates/>
   </xsl:template>  
   <xsl:template match="p:ConditionType[@xsi:type='ValueSmallerThan']">
     <xsl:text>&lt;</xsl:text> 
     <xsl:apply-templates/>
   </xsl:template>  
   <xsl:template match="p:ConditionType[@xsi:type='BelongToSet']"> <!-- TODO here want comma separated list -->
     <xsl:text> in { </xsl:text> 
       <xsl:for-each select="descendant::p:Value">
          <xsl:apply-templates select="."/>
          <xsl:if test="position()!=last()"><xsl:text>, </xsl:text></xsl:if>
       </xsl:for-each>
     
     <xsl:text> } </xsl:text>
   </xsl:template>  
   <xsl:template match="p:ConditionType[@xsi:type='ValueInRange']">
     <xsl:text> in range [</xsl:text> <xsl:apply-templates select="p:Inf"/><xsl:text>|</xsl:text><xsl:apply-templates select="p:Sup"/> <xsl:text>]</xsl:text>
   </xsl:template> 
   
   <xsl:template match="p:Inf">
       <xsl:apply-templates></xsl:apply-templates>
       <xsl:if test="@reached = 'false'"><xsl:text>&gt;</xsl:text></xsl:if>
   </xsl:template> 
   <xsl:template match="p:Sup">
       <xsl:if test="@reached = 'false'"><xsl:text>&gt;</xsl:text></xsl:if>
       <xsl:apply-templates/>
   </xsl:template> 
   <xsl:template match="p:Value">
      <xsl:choose>
         <xsl:when test="@ConstantType='string'"><xsl:text>"</xsl:text> <xsl:apply-templates/><xsl:text>"</xsl:text></xsl:when>
         <xsl:otherwise><xsl:apply-templates/></xsl:otherwise>
      </xsl:choose>
   </xsl:template>
   
   

<xsl:template match="p:LogicalConnector">
    <xsl:value-of select="concat(' ',lower-case(@xsi:type), ' ')"/>
    <xsl:apply-templates/>
</xsl:template>


<xsl:template match="*"> <!-- catchall to indicate where there might be missed element -->
  <xsl:value-of select="concat('***',name(.),'*** ')"/>
   <xsl:apply-templates/>
</xsl:template>


</xsl:stylesheet>