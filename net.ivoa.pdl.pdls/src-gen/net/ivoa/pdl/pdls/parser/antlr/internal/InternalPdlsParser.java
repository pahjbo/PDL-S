package net.ivoa.pdl.pdls.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.ivoa.pdl.pdls.services.PdlsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPdlsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'service'", "'{'", "'parameters'", "'}'", "'input'", "'output'", "':'", "';'", "'group'", "'params'", "'='", "','", "'active'", "'constraints '", "'['", "']'", "'when'", "'if'", "'then'", "'assert'", "'>'", "'<'", "'in'", "'range'", "'...'", "'!='", "'is'", "'real'", "'rational'", "'integer'", "'default '", "'null'", "'('", "')'", "'$'", "'^'", "'+'", "'-'", "'boolean'", "'string'", "'date'", "'size'", "'abs'", "'sin'", "'cos'", "'tan'", "'asin'", "'acos'", "'atan'", "'exp'", "'log'", "'sum'", "'product'", "'*'", "'/'", "'.'", "'and'", "'or'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalPdlsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPdlsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPdlsParser.tokenNames; }
    public String getGrammarFileName() { return "../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g"; }



     	private PdlsGrammarAccess grammarAccess;
     	
        public InternalPdlsParser(TokenStream input, PdlsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PDL";	
       	}
       	
       	@Override
       	protected PdlsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePDL"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:68:1: entryRulePDL returns [EObject current=null] : iv_rulePDL= rulePDL EOF ;
    public final EObject entryRulePDL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePDL = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:69:2: (iv_rulePDL= rulePDL EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:70:2: iv_rulePDL= rulePDL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPDLRule()); 
            }
            pushFollow(FOLLOW_rulePDL_in_entryRulePDL75);
            iv_rulePDL=rulePDL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePDL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePDL85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePDL"


    // $ANTLR start "rulePDL"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:77:1: rulePDL returns [EObject current=null] : this_Service_0= ruleService ;
    public final EObject rulePDL() throws RecognitionException {
        EObject current = null;

        EObject this_Service_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:80:28: (this_Service_0= ruleService )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:82:5: this_Service_0= ruleService
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPDLAccess().getServiceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleService_in_rulePDL131);
            this_Service_0=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Service_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePDL"


    // $ANTLR start "entryRuleService"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:98:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:99:2: (iv_ruleService= ruleService EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:100:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_ruleService_in_entryRuleService165);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleService175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:107:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parameters' otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' otherlv_7= 'input' otherlv_8= '{' ( (lv_inputs_9_0= ruleParameterGroup ) )* otherlv_10= '}' otherlv_11= 'output' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameterGroup ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_inputs_9_0 = null;

        EObject lv_outputs_13_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:110:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parameters' otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' otherlv_7= 'input' otherlv_8= '{' ( (lv_inputs_9_0= ruleParameterGroup ) )* otherlv_10= '}' otherlv_11= 'output' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameterGroup ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:111:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parameters' otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' otherlv_7= 'input' otherlv_8= '{' ( (lv_inputs_9_0= ruleParameterGroup ) )* otherlv_10= '}' otherlv_11= 'output' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameterGroup ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:111:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parameters' otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' otherlv_7= 'input' otherlv_8= '{' ( (lv_inputs_9_0= ruleParameterGroup ) )* otherlv_10= '}' otherlv_11= 'output' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameterGroup ) )* otherlv_14= '}' otherlv_15= '}' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:111:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'parameters' otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' otherlv_7= 'input' otherlv_8= '{' ( (lv_inputs_9_0= ruleParameterGroup ) )* otherlv_10= '}' otherlv_11= 'output' otherlv_12= '{' ( (lv_outputs_13_0= ruleParameterGroup ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleService212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:115:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:116:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:116:1: (lv_name_1_0= RULE_ID )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:117:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getServiceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleService246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleService258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getParametersKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleService270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:145:1: ( (lv_parameters_5_0= ruleParameter ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:146:1: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:146:1: (lv_parameters_5_0= ruleParameter )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:147:3: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameter_in_ruleService291);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_5_0, 
            	              		"Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleService304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleService316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getInputKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleService328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:175:1: ( (lv_inputs_9_0= ruleParameterGroup ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:176:1: (lv_inputs_9_0= ruleParameterGroup )
            	    {
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:176:1: (lv_inputs_9_0= ruleParameterGroup )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:177:3: lv_inputs_9_0= ruleParameterGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getInputsParameterGroupParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterGroup_in_ruleService349);
            	    lv_inputs_9_0=ruleParameterGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_9_0, 
            	              		"ParameterGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleService362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleService374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getOutputKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleService386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_12());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:205:1: ( (lv_outputs_13_0= ruleParameterGroup ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:206:1: (lv_outputs_13_0= ruleParameterGroup )
            	    {
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:206:1: (lv_outputs_13_0= ruleParameterGroup )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:207:3: lv_outputs_13_0= ruleParameterGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getServiceAccess().getOutputsParameterGroupParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterGroup_in_ruleService407);
            	    lv_outputs_13_0=ruleParameterGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outputs",
            	              		lv_outputs_13_0, 
            	              		"ParameterGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleService420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_14());
                  
            }
            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleService432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_15());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParameterID"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:239:1: entryRuleParameterID returns [String current=null] : iv_ruleParameterID= ruleParameterID EOF ;
    public final String entryRuleParameterID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterID = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:240:2: (iv_ruleParameterID= ruleParameterID EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:241:2: iv_ruleParameterID= ruleParameterID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterIDRule()); 
            }
            pushFollow(FOLLOW_ruleParameterID_in_entryRuleParameterID469);
            iv_ruleParameterID=ruleParameterID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterID480); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterID"


    // $ANTLR start "ruleParameterID"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:248:1: ruleParameterID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleParameterID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:251:28: (this_ID_0= RULE_ID )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:252:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterID519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getParameterIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterID"


    // $ANTLR start "entryRuleParameter"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:267:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:268:2: (iv_ruleParameter= ruleParameter EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:269:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter563);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter573); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:276:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleParameterID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= ';' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:279:28: ( ( ( (lv_name_0_0= ruleParameterID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= ';' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:280:1: ( ( (lv_name_0_0= ruleParameterID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= ';' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:280:1: ( ( (lv_name_0_0= ruleParameterID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= ';' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:280:2: ( (lv_name_0_0= ruleParameterID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= ';'
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:280:2: ( (lv_name_0_0= ruleParameterID ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:281:1: (lv_name_0_0= ruleParameterID )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:281:1: (lv_name_0_0= ruleParameterID )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:282:3: lv_name_0_0= ruleParameterID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameParameterIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterID_in_ruleParameter619);
            lv_name_0_0=ruleParameterID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ParameterID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleParameter631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:302:1: ( (lv_type_2_0= ruleParameterType ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:303:1: (lv_type_2_0= ruleParameterType )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:303:1: (lv_type_2_0= ruleParameterType )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:304:3: lv_type_2_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterType_in_ruleParameter652);
            lv_type_2_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ParameterType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleParameter664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterGroup"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:332:1: entryRuleParameterGroup returns [EObject current=null] : iv_ruleParameterGroup= ruleParameterGroup EOF ;
    public final EObject entryRuleParameterGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterGroup = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:333:2: (iv_ruleParameterGroup= ruleParameterGroup EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:334:2: iv_ruleParameterGroup= ruleParameterGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterGroupRule()); 
            }
            pushFollow(FOLLOW_ruleParameterGroup_in_entryRuleParameterGroup700);
            iv_ruleParameterGroup=ruleParameterGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterGroup710); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterGroup"


    // $ANTLR start "ruleParameterGroup"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:341:1: ruleParameterGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '=' ( ( ruleParameterID ) ) (otherlv_6= ',' ( ( ruleParameterID ) ) )* )* ( (lv_constraint_8_0= ruleConstraintOnGroup ) )? (otherlv_9= 'active' ( (lv_active_10_0= ruleWhenConditionalStatement ) ) otherlv_11= ';' )? ( (lv_groups_12_0= ruleParameterGroup ) )* otherlv_13= '}' ) ;
    public final EObject ruleParameterGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_constraint_8_0 = null;

        EObject lv_active_10_0 = null;

        EObject lv_groups_12_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:344:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '=' ( ( ruleParameterID ) ) (otherlv_6= ',' ( ( ruleParameterID ) ) )* )* ( (lv_constraint_8_0= ruleConstraintOnGroup ) )? (otherlv_9= 'active' ( (lv_active_10_0= ruleWhenConditionalStatement ) ) otherlv_11= ';' )? ( (lv_groups_12_0= ruleParameterGroup ) )* otherlv_13= '}' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:345:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '=' ( ( ruleParameterID ) ) (otherlv_6= ',' ( ( ruleParameterID ) ) )* )* ( (lv_constraint_8_0= ruleConstraintOnGroup ) )? (otherlv_9= 'active' ( (lv_active_10_0= ruleWhenConditionalStatement ) ) otherlv_11= ';' )? ( (lv_groups_12_0= ruleParameterGroup ) )* otherlv_13= '}' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:345:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '=' ( ( ruleParameterID ) ) (otherlv_6= ',' ( ( ruleParameterID ) ) )* )* ( (lv_constraint_8_0= ruleConstraintOnGroup ) )? (otherlv_9= 'active' ( (lv_active_10_0= ruleWhenConditionalStatement ) ) otherlv_11= ';' )? ( (lv_groups_12_0= ruleParameterGroup ) )* otherlv_13= '}' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:345:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'params' otherlv_4= '=' ( ( ruleParameterID ) ) (otherlv_6= ',' ( ( ruleParameterID ) ) )* )* ( (lv_constraint_8_0= ruleConstraintOnGroup ) )? (otherlv_9= 'active' ( (lv_active_10_0= ruleWhenConditionalStatement ) ) otherlv_11= ';' )? ( (lv_groups_12_0= ruleParameterGroup ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleParameterGroup747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterGroupAccess().getGroupKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:349:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:350:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:350:1: (lv_name_1_0= RULE_ID )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:351:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterGroup764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterGroupAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterGroupRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleParameterGroup781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterGroupAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:371:1: (otherlv_3= 'params' otherlv_4= '=' ( ( ruleParameterID ) ) (otherlv_6= ',' ( ( ruleParameterID ) ) )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:371:3: otherlv_3= 'params' otherlv_4= '=' ( ( ruleParameterID ) ) (otherlv_6= ',' ( ( ruleParameterID ) ) )*
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleParameterGroup794); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getParameterGroupAccess().getParamsKeyword_3_0());
            	          
            	    }
            	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleParameterGroup806); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getParameterGroupAccess().getEqualsSignKeyword_3_1());
            	          
            	    }
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:379:1: ( ( ruleParameterID ) )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:380:1: ( ruleParameterID )
            	    {
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:380:1: ( ruleParameterID )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:381:3: ruleParameterID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getParameterGroupRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterGroupAccess().getParamsParameterCrossReference_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterID_in_ruleParameterGroup829);
            	    ruleParameterID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:394:2: (otherlv_6= ',' ( ( ruleParameterID ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==23) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:394:4: otherlv_6= ',' ( ( ruleParameterID ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleParameterGroup842); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_6, grammarAccess.getParameterGroupAccess().getCommaKeyword_3_3_0());
            	    	          
            	    	    }
            	    	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:398:1: ( ( ruleParameterID ) )
            	    	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:399:1: ( ruleParameterID )
            	    	    {
            	    	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:399:1: ( ruleParameterID )
            	    	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:400:3: ruleParameterID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getParameterGroupRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getParameterGroupAccess().getParamsParameterCrossReference_3_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleParameterID_in_ruleParameterGroup865);
            	    	    ruleParameterID();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:413:6: ( (lv_constraint_8_0= ruleConstraintOnGroup ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:414:1: (lv_constraint_8_0= ruleConstraintOnGroup )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:414:1: (lv_constraint_8_0= ruleConstraintOnGroup )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:415:3: lv_constraint_8_0= ruleConstraintOnGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterGroupAccess().getConstraintConstraintOnGroupParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstraintOnGroup_in_ruleParameterGroup890);
                    lv_constraint_8_0=ruleConstraintOnGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_8_0, 
                              		"ConstraintOnGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:431:3: (otherlv_9= 'active' ( (lv_active_10_0= ruleWhenConditionalStatement ) ) otherlv_11= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:431:5: otherlv_9= 'active' ( (lv_active_10_0= ruleWhenConditionalStatement ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleParameterGroup904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getParameterGroupAccess().getActiveKeyword_5_0());
                          
                    }
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:435:1: ( (lv_active_10_0= ruleWhenConditionalStatement ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:436:1: (lv_active_10_0= ruleWhenConditionalStatement )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:436:1: (lv_active_10_0= ruleWhenConditionalStatement )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:437:3: lv_active_10_0= ruleWhenConditionalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterGroupAccess().getActiveWhenConditionalStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhenConditionalStatement_in_ruleParameterGroup925);
                    lv_active_10_0=ruleWhenConditionalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"active",
                              		lv_active_10_0, 
                              		"WhenConditionalStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleParameterGroup937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getParameterGroupAccess().getSemicolonKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:457:3: ( (lv_groups_12_0= ruleParameterGroup ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:458:1: (lv_groups_12_0= ruleParameterGroup )
            	    {
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:458:1: (lv_groups_12_0= ruleParameterGroup )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:459:3: lv_groups_12_0= ruleParameterGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterGroupAccess().getGroupsParameterGroupParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterGroup_in_ruleParameterGroup960);
            	    lv_groups_12_0=ruleParameterGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"groups",
            	              		lv_groups_12_0, 
            	              		"ParameterGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleParameterGroup973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getParameterGroupAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterGroup"


    // $ANTLR start "entryRuleConstraintOnGroup"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:487:1: entryRuleConstraintOnGroup returns [EObject current=null] : iv_ruleConstraintOnGroup= ruleConstraintOnGroup EOF ;
    public final EObject entryRuleConstraintOnGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintOnGroup = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:488:2: (iv_ruleConstraintOnGroup= ruleConstraintOnGroup EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:489:2: iv_ruleConstraintOnGroup= ruleConstraintOnGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintOnGroupRule()); 
            }
            pushFollow(FOLLOW_ruleConstraintOnGroup_in_entryRuleConstraintOnGroup1009);
            iv_ruleConstraintOnGroup=ruleConstraintOnGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintOnGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintOnGroup1019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintOnGroup"


    // $ANTLR start "ruleConstraintOnGroup"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:496:1: ruleConstraintOnGroup returns [EObject current=null] : (otherlv_0= 'constraints ' (otherlv_1= '[' ( (lv_statements_2_0= ruleConditionalStatement ) ) otherlv_3= ']' )+ ) ;
    public final EObject ruleConstraintOnGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:499:28: ( (otherlv_0= 'constraints ' (otherlv_1= '[' ( (lv_statements_2_0= ruleConditionalStatement ) ) otherlv_3= ']' )+ ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:500:1: (otherlv_0= 'constraints ' (otherlv_1= '[' ( (lv_statements_2_0= ruleConditionalStatement ) ) otherlv_3= ']' )+ )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:500:1: (otherlv_0= 'constraints ' (otherlv_1= '[' ( (lv_statements_2_0= ruleConditionalStatement ) ) otherlv_3= ']' )+ )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:500:3: otherlv_0= 'constraints ' (otherlv_1= '[' ( (lv_statements_2_0= ruleConditionalStatement ) ) otherlv_3= ']' )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleConstraintOnGroup1056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstraintOnGroupAccess().getConstraintsKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:504:1: (otherlv_1= '[' ( (lv_statements_2_0= ruleConditionalStatement ) ) otherlv_3= ']' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:504:3: otherlv_1= '[' ( (lv_statements_2_0= ruleConditionalStatement ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleConstraintOnGroup1069); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getConstraintOnGroupAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:508:1: ( (lv_statements_2_0= ruleConditionalStatement ) )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:509:1: (lv_statements_2_0= ruleConditionalStatement )
            	    {
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:509:1: (lv_statements_2_0= ruleConditionalStatement )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:510:3: lv_statements_2_0= ruleConditionalStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstraintOnGroupAccess().getStatementsConditionalStatementParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalStatement_in_ruleConstraintOnGroup1090);
            	    lv_statements_2_0=ruleConditionalStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstraintOnGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"ConditionalStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleConstraintOnGroup1102); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getConstraintOnGroupAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintOnGroup"


    // $ANTLR start "entryRuleConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:538:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:539:2: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:540:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalStatement_in_entryRuleConditionalStatement1140);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalStatement1150); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:547:1: ruleConditionalStatement returns [EObject current=null] : (this_AlwaysConditionalStatement_0= ruleAlwaysConditionalStatement | this_IfThenConditionalStatement_1= ruleIfThenConditionalStatement | (this_WhenConditionalStatement_2= ruleWhenConditionalStatement ( (lv_comment_3_0= RULE_STRING ) )? ) ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token lv_comment_3_0=null;
        EObject this_AlwaysConditionalStatement_0 = null;

        EObject this_IfThenConditionalStatement_1 = null;

        EObject this_WhenConditionalStatement_2 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:550:28: ( (this_AlwaysConditionalStatement_0= ruleAlwaysConditionalStatement | this_IfThenConditionalStatement_1= ruleIfThenConditionalStatement | (this_WhenConditionalStatement_2= ruleWhenConditionalStatement ( (lv_comment_3_0= RULE_STRING ) )? ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:551:1: (this_AlwaysConditionalStatement_0= ruleAlwaysConditionalStatement | this_IfThenConditionalStatement_1= ruleIfThenConditionalStatement | (this_WhenConditionalStatement_2= ruleWhenConditionalStatement ( (lv_comment_3_0= RULE_STRING ) )? ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:551:1: (this_AlwaysConditionalStatement_0= ruleAlwaysConditionalStatement | this_IfThenConditionalStatement_1= ruleIfThenConditionalStatement | (this_WhenConditionalStatement_2= ruleWhenConditionalStatement ( (lv_comment_3_0= RULE_STRING ) )? ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:552:5: this_AlwaysConditionalStatement_0= ruleAlwaysConditionalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalStatementAccess().getAlwaysConditionalStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysConditionalStatement_in_ruleConditionalStatement1197);
                    this_AlwaysConditionalStatement_0=ruleAlwaysConditionalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlwaysConditionalStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:562:5: this_IfThenConditionalStatement_1= ruleIfThenConditionalStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalStatementAccess().getIfThenConditionalStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfThenConditionalStatement_in_ruleConditionalStatement1224);
                    this_IfThenConditionalStatement_1=ruleIfThenConditionalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfThenConditionalStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:571:6: (this_WhenConditionalStatement_2= ruleWhenConditionalStatement ( (lv_comment_3_0= RULE_STRING ) )? )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:571:6: (this_WhenConditionalStatement_2= ruleWhenConditionalStatement ( (lv_comment_3_0= RULE_STRING ) )? )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:572:5: this_WhenConditionalStatement_2= ruleWhenConditionalStatement ( (lv_comment_3_0= RULE_STRING ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionalStatementAccess().getWhenConditionalStatementParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhenConditionalStatement_in_ruleConditionalStatement1252);
                    this_WhenConditionalStatement_2=ruleWhenConditionalStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhenConditionalStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:580:1: ( (lv_comment_3_0= RULE_STRING ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_STRING) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:581:1: (lv_comment_3_0= RULE_STRING )
                            {
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:581:1: (lv_comment_3_0= RULE_STRING )
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:582:3: lv_comment_3_0= RULE_STRING
                            {
                            lv_comment_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConditionalStatement1268); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_comment_3_0, grammarAccess.getConditionalStatementAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getConditionalStatementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"comment",
                                      		lv_comment_3_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleWhenConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:606:1: entryRuleWhenConditionalStatement returns [EObject current=null] : iv_ruleWhenConditionalStatement= ruleWhenConditionalStatement EOF ;
    public final EObject entryRuleWhenConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenConditionalStatement = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:607:2: (iv_ruleWhenConditionalStatement= ruleWhenConditionalStatement EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:608:2: iv_ruleWhenConditionalStatement= ruleWhenConditionalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhenConditionalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhenConditionalStatement_in_entryRuleWhenConditionalStatement1311);
            iv_ruleWhenConditionalStatement=ruleWhenConditionalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhenConditionalStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenConditionalStatement1321); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenConditionalStatement"


    // $ANTLR start "ruleWhenConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:615:1: ruleWhenConditionalStatement returns [EObject current=null] : (otherlv_0= 'when' ( (lv_criterion_1_0= ruleConditionalClause ) ) ) ;
    public final EObject ruleWhenConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_criterion_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:618:28: ( (otherlv_0= 'when' ( (lv_criterion_1_0= ruleConditionalClause ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:619:1: (otherlv_0= 'when' ( (lv_criterion_1_0= ruleConditionalClause ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:619:1: (otherlv_0= 'when' ( (lv_criterion_1_0= ruleConditionalClause ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:619:3: otherlv_0= 'when' ( (lv_criterion_1_0= ruleConditionalClause ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleWhenConditionalStatement1358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhenConditionalStatementAccess().getWhenKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:623:1: ( (lv_criterion_1_0= ruleConditionalClause ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:624:1: (lv_criterion_1_0= ruleConditionalClause )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:624:1: (lv_criterion_1_0= ruleConditionalClause )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:625:3: lv_criterion_1_0= ruleConditionalClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhenConditionalStatementAccess().getCriterionConditionalClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalClause_in_ruleWhenConditionalStatement1379);
            lv_criterion_1_0=ruleConditionalClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhenConditionalStatementRule());
              	        }
                     		set(
                     			current, 
                     			"criterion",
                      		lv_criterion_1_0, 
                      		"ConditionalClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenConditionalStatement"


    // $ANTLR start "entryRuleIfThenConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:649:1: entryRuleIfThenConditionalStatement returns [EObject current=null] : iv_ruleIfThenConditionalStatement= ruleIfThenConditionalStatement EOF ;
    public final EObject entryRuleIfThenConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenConditionalStatement = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:650:2: (iv_ruleIfThenConditionalStatement= ruleIfThenConditionalStatement EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:651:2: iv_ruleIfThenConditionalStatement= ruleIfThenConditionalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenConditionalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfThenConditionalStatement_in_entryRuleIfThenConditionalStatement1415);
            iv_ruleIfThenConditionalStatement=ruleIfThenConditionalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenConditionalStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenConditionalStatement1425); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenConditionalStatement"


    // $ANTLR start "ruleIfThenConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:658:1: ruleIfThenConditionalStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_criterion_1_0= ruleConditionalClause ) ) otherlv_2= 'then' ( (lv_clause_3_0= ruleConditionalClause ) ) ) ;
    public final EObject ruleIfThenConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_criterion_1_0 = null;

        EObject lv_clause_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:661:28: ( (otherlv_0= 'if' ( (lv_criterion_1_0= ruleConditionalClause ) ) otherlv_2= 'then' ( (lv_clause_3_0= ruleConditionalClause ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:662:1: (otherlv_0= 'if' ( (lv_criterion_1_0= ruleConditionalClause ) ) otherlv_2= 'then' ( (lv_clause_3_0= ruleConditionalClause ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:662:1: (otherlv_0= 'if' ( (lv_criterion_1_0= ruleConditionalClause ) ) otherlv_2= 'then' ( (lv_clause_3_0= ruleConditionalClause ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:662:3: otherlv_0= 'if' ( (lv_criterion_1_0= ruleConditionalClause ) ) otherlv_2= 'then' ( (lv_clause_3_0= ruleConditionalClause ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleIfThenConditionalStatement1462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfThenConditionalStatementAccess().getIfKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:666:1: ( (lv_criterion_1_0= ruleConditionalClause ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:667:1: (lv_criterion_1_0= ruleConditionalClause )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:667:1: (lv_criterion_1_0= ruleConditionalClause )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:668:3: lv_criterion_1_0= ruleConditionalClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenConditionalStatementAccess().getCriterionConditionalClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalClause_in_ruleIfThenConditionalStatement1483);
            lv_criterion_1_0=ruleConditionalClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenConditionalStatementRule());
              	        }
                     		set(
                     			current, 
                     			"criterion",
                      		lv_criterion_1_0, 
                      		"ConditionalClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleIfThenConditionalStatement1495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfThenConditionalStatementAccess().getThenKeyword_2());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:688:1: ( (lv_clause_3_0= ruleConditionalClause ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:689:1: (lv_clause_3_0= ruleConditionalClause )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:689:1: (lv_clause_3_0= ruleConditionalClause )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:690:3: lv_clause_3_0= ruleConditionalClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenConditionalStatementAccess().getClauseConditionalClauseParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalClause_in_ruleIfThenConditionalStatement1516);
            lv_clause_3_0=ruleConditionalClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenConditionalStatementRule());
              	        }
                     		set(
                     			current, 
                     			"clause",
                      		lv_clause_3_0, 
                      		"ConditionalClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenConditionalStatement"


    // $ANTLR start "entryRuleConditionalClause"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:714:1: entryRuleConditionalClause returns [EObject current=null] : iv_ruleConditionalClause= ruleConditionalClause EOF ;
    public final EObject entryRuleConditionalClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalClause = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:715:2: (iv_ruleConditionalClause= ruleConditionalClause EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:716:2: iv_ruleConditionalClause= ruleConditionalClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalClause_in_entryRuleConditionalClause1552);
            iv_ruleConditionalClause=ruleConditionalClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalClause1562); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalClause"


    // $ANTLR start "ruleConditionalClause"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:723:1: ruleConditionalClause returns [EObject current=null] : (this_TerminalClause_0= ruleTerminalClause ( () ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) ) ( (lv_right_3_0= ruleTerminalClause ) ) )? ) ;
    public final EObject ruleConditionalClause() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalClause_0 = null;

        Enumerator lv_conn_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:726:28: ( (this_TerminalClause_0= ruleTerminalClause ( () ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) ) ( (lv_right_3_0= ruleTerminalClause ) ) )? ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:727:1: (this_TerminalClause_0= ruleTerminalClause ( () ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) ) ( (lv_right_3_0= ruleTerminalClause ) ) )? )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:727:1: (this_TerminalClause_0= ruleTerminalClause ( () ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) ) ( (lv_right_3_0= ruleTerminalClause ) ) )? )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:728:5: this_TerminalClause_0= ruleTerminalClause ( () ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) ) ( (lv_right_3_0= ruleTerminalClause ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalClauseAccess().getTerminalClauseParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalClause_in_ruleConditionalClause1609);
            this_TerminalClause_0=ruleTerminalClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalClause_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:736:1: ( () ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) ) ( (lv_right_3_0= ruleTerminalClause ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=68 && LA12_0<=69)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:736:2: () ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) ) ( (lv_right_3_0= ruleTerminalClause ) )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:736:2: ()
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:737:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalClauseAccess().getCriterionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:742:2: ( ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:742:3: ( ( ruleLogicalConnector ) )=> (lv_conn_2_0= ruleLogicalConnector )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:747:1: (lv_conn_2_0= ruleLogicalConnector )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:748:3: lv_conn_2_0= ruleLogicalConnector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalClauseAccess().getConnLogicalConnectorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalConnector_in_ruleConditionalClause1649);
                    lv_conn_2_0=ruleLogicalConnector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"conn",
                              		lv_conn_2_0, 
                              		"LogicalConnector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:764:2: ( (lv_right_3_0= ruleTerminalClause ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:765:1: (lv_right_3_0= ruleTerminalClause )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:765:1: (lv_right_3_0= ruleTerminalClause )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:766:3: lv_right_3_0= ruleTerminalClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalClauseAccess().getRightTerminalClauseParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerminalClause_in_ruleConditionalClause1670);
                    lv_right_3_0=ruleTerminalClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"TerminalClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalClause"


    // $ANTLR start "entryRuleTerminalClause"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:790:1: entryRuleTerminalClause returns [EObject current=null] : iv_ruleTerminalClause= ruleTerminalClause EOF ;
    public final EObject entryRuleTerminalClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalClause = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:791:2: (iv_ruleTerminalClause= ruleTerminalClause EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:792:2: iv_ruleTerminalClause= ruleTerminalClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalClauseRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalClause_in_entryRuleTerminalClause1708);
            iv_ruleTerminalClause=ruleTerminalClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalClause1718); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalClause"


    // $ANTLR start "ruleTerminalClause"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:799:1: ruleTerminalClause returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpression ) ) ( (lv_cond_1_0= ruleCondition ) ) ) ;
    public final EObject ruleTerminalClause() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_cond_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:802:28: ( ( ( (lv_expr_0_0= ruleExpression ) ) ( (lv_cond_1_0= ruleCondition ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:803:1: ( ( (lv_expr_0_0= ruleExpression ) ) ( (lv_cond_1_0= ruleCondition ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:803:1: ( ( (lv_expr_0_0= ruleExpression ) ) ( (lv_cond_1_0= ruleCondition ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:803:2: ( (lv_expr_0_0= ruleExpression ) ) ( (lv_cond_1_0= ruleCondition ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:803:2: ( (lv_expr_0_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:804:1: (lv_expr_0_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:804:1: (lv_expr_0_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:805:3: lv_expr_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTerminalClauseAccess().getExprExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalClause1764);
            lv_expr_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTerminalClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:821:2: ( (lv_cond_1_0= ruleCondition ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:822:1: (lv_cond_1_0= ruleCondition )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:822:1: (lv_cond_1_0= ruleCondition )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:823:3: lv_cond_1_0= ruleCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTerminalClauseAccess().getCondConditionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCondition_in_ruleTerminalClause1785);
            lv_cond_1_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTerminalClauseRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_1_0, 
                      		"Condition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalClause"


    // $ANTLR start "entryRuleAlwaysConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:847:1: entryRuleAlwaysConditionalStatement returns [EObject current=null] : iv_ruleAlwaysConditionalStatement= ruleAlwaysConditionalStatement EOF ;
    public final EObject entryRuleAlwaysConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysConditionalStatement = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:848:2: (iv_ruleAlwaysConditionalStatement= ruleAlwaysConditionalStatement EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:849:2: iv_ruleAlwaysConditionalStatement= ruleAlwaysConditionalStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysConditionalStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysConditionalStatement_in_entryRuleAlwaysConditionalStatement1821);
            iv_ruleAlwaysConditionalStatement=ruleAlwaysConditionalStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysConditionalStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysConditionalStatement1831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlwaysConditionalStatement"


    // $ANTLR start "ruleAlwaysConditionalStatement"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:856:1: ruleAlwaysConditionalStatement returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_clause_1_0= ruleConditionalClause ) ) ) ;
    public final EObject ruleAlwaysConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_clause_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:859:28: ( (otherlv_0= 'assert' ( (lv_clause_1_0= ruleConditionalClause ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:860:1: (otherlv_0= 'assert' ( (lv_clause_1_0= ruleConditionalClause ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:860:1: (otherlv_0= 'assert' ( (lv_clause_1_0= ruleConditionalClause ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:860:3: otherlv_0= 'assert' ( (lv_clause_1_0= ruleConditionalClause ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAlwaysConditionalStatement1868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlwaysConditionalStatementAccess().getAssertKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:864:1: ( (lv_clause_1_0= ruleConditionalClause ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:865:1: (lv_clause_1_0= ruleConditionalClause )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:865:1: (lv_clause_1_0= ruleConditionalClause )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:866:3: lv_clause_1_0= ruleConditionalClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlwaysConditionalStatementAccess().getClauseConditionalClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalClause_in_ruleAlwaysConditionalStatement1889);
            lv_clause_1_0=ruleConditionalClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlwaysConditionalStatementRule());
              	        }
                     		set(
                     			current, 
                     			"clause",
                      		lv_clause_1_0, 
                      		"ConditionalClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlwaysConditionalStatement"


    // $ANTLR start "entryRuleCondition"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:890:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:891:2: (iv_ruleCondition= ruleCondition EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:892:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1925);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1935); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:899:1: ruleCondition returns [EObject current=null] : (this_isNull_0= ruleisNull | this_BelongsToSet_1= ruleBelongsToSet | this_defaultValue_2= ruledefaultValue | this_isInteger_3= ruleisInteger | this_isRational_4= ruleisRational | this_isReal_5= ruleisReal | this_ValueDifferentFrom_6= ruleValueDifferentFrom | this_ValueInRange_7= ruleValueInRange | this_ValueSmallerThan_8= ruleValueSmallerThan | this_ValueLargerThan_9= ruleValueLargerThan ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_isNull_0 = null;

        EObject this_BelongsToSet_1 = null;

        EObject this_defaultValue_2 = null;

        EObject this_isInteger_3 = null;

        EObject this_isRational_4 = null;

        EObject this_isReal_5 = null;

        EObject this_ValueDifferentFrom_6 = null;

        EObject this_ValueInRange_7 = null;

        EObject this_ValueSmallerThan_8 = null;

        EObject this_ValueLargerThan_9 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:902:28: ( (this_isNull_0= ruleisNull | this_BelongsToSet_1= ruleBelongsToSet | this_defaultValue_2= ruledefaultValue | this_isInteger_3= ruleisInteger | this_isRational_4= ruleisRational | this_isReal_5= ruleisReal | this_ValueDifferentFrom_6= ruleValueDifferentFrom | this_ValueInRange_7= ruleValueInRange | this_ValueSmallerThan_8= ruleValueSmallerThan | this_ValueLargerThan_9= ruleValueLargerThan ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:903:1: (this_isNull_0= ruleisNull | this_BelongsToSet_1= ruleBelongsToSet | this_defaultValue_2= ruledefaultValue | this_isInteger_3= ruleisInteger | this_isRational_4= ruleisRational | this_isReal_5= ruleisReal | this_ValueDifferentFrom_6= ruleValueDifferentFrom | this_ValueInRange_7= ruleValueInRange | this_ValueSmallerThan_8= ruleValueSmallerThan | this_ValueLargerThan_9= ruleValueLargerThan )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:903:1: (this_isNull_0= ruleisNull | this_BelongsToSet_1= ruleBelongsToSet | this_defaultValue_2= ruledefaultValue | this_isInteger_3= ruleisInteger | this_isRational_4= ruleisRational | this_isReal_5= ruleisReal | this_ValueDifferentFrom_6= ruleValueDifferentFrom | this_ValueInRange_7= ruleValueInRange | this_ValueSmallerThan_8= ruleValueSmallerThan | this_ValueLargerThan_9= ruleValueLargerThan )
            int alt13=10;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:904:5: this_isNull_0= ruleisNull
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getIsNullParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleisNull_in_ruleCondition1982);
                    this_isNull_0=ruleisNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_isNull_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:914:5: this_BelongsToSet_1= ruleBelongsToSet
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getBelongsToSetParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBelongsToSet_in_ruleCondition2009);
                    this_BelongsToSet_1=ruleBelongsToSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BelongsToSet_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:924:5: this_defaultValue_2= ruledefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getDefaultValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruledefaultValue_in_ruleCondition2036);
                    this_defaultValue_2=ruledefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_defaultValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:934:5: this_isInteger_3= ruleisInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getIsIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleisInteger_in_ruleCondition2063);
                    this_isInteger_3=ruleisInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_isInteger_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:944:5: this_isRational_4= ruleisRational
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getIsRationalParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleisRational_in_ruleCondition2090);
                    this_isRational_4=ruleisRational();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_isRational_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:954:5: this_isReal_5= ruleisReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getIsRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleisReal_in_ruleCondition2117);
                    this_isReal_5=ruleisReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_isReal_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:964:5: this_ValueDifferentFrom_6= ruleValueDifferentFrom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getValueDifferentFromParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueDifferentFrom_in_ruleCondition2144);
                    this_ValueDifferentFrom_6=ruleValueDifferentFrom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueDifferentFrom_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:974:5: this_ValueInRange_7= ruleValueInRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getValueInRangeParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueInRange_in_ruleCondition2171);
                    this_ValueInRange_7=ruleValueInRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueInRange_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:984:5: this_ValueSmallerThan_8= ruleValueSmallerThan
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getValueSmallerThanParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueSmallerThan_in_ruleCondition2198);
                    this_ValueSmallerThan_8=ruleValueSmallerThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueSmallerThan_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:994:5: this_ValueLargerThan_9= ruleValueLargerThan
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getValueLargerThanParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueLargerThan_in_ruleCondition2225);
                    this_ValueLargerThan_9=ruleValueLargerThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueLargerThan_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleValueLargerThan"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1010:1: entryRuleValueLargerThan returns [EObject current=null] : iv_ruleValueLargerThan= ruleValueLargerThan EOF ;
    public final EObject entryRuleValueLargerThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueLargerThan = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1011:2: (iv_ruleValueLargerThan= ruleValueLargerThan EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1012:2: iv_ruleValueLargerThan= ruleValueLargerThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueLargerThanRule()); 
            }
            pushFollow(FOLLOW_ruleValueLargerThan_in_entryRuleValueLargerThan2260);
            iv_ruleValueLargerThan=ruleValueLargerThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueLargerThan; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueLargerThan2270); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueLargerThan"


    // $ANTLR start "ruleValueLargerThan"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1019:1: ruleValueLargerThan returns [EObject current=null] : (otherlv_0= '>' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleValueLargerThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1022:28: ( (otherlv_0= '>' ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1023:1: (otherlv_0= '>' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1023:1: (otherlv_0= '>' ( (lv_value_1_0= ruleExpression ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1023:3: otherlv_0= '>' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleValueLargerThan2307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueLargerThanAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1027:1: ( (lv_value_1_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1028:1: (lv_value_1_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1028:1: (lv_value_1_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1029:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueLargerThanAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleValueLargerThan2328);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueLargerThanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueLargerThan"


    // $ANTLR start "entryRuleValueSmallerThan"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1053:1: entryRuleValueSmallerThan returns [EObject current=null] : iv_ruleValueSmallerThan= ruleValueSmallerThan EOF ;
    public final EObject entryRuleValueSmallerThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSmallerThan = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1054:2: (iv_ruleValueSmallerThan= ruleValueSmallerThan EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1055:2: iv_ruleValueSmallerThan= ruleValueSmallerThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSmallerThanRule()); 
            }
            pushFollow(FOLLOW_ruleValueSmallerThan_in_entryRuleValueSmallerThan2364);
            iv_ruleValueSmallerThan=ruleValueSmallerThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSmallerThan; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSmallerThan2374); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueSmallerThan"


    // $ANTLR start "ruleValueSmallerThan"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1062:1: ruleValueSmallerThan returns [EObject current=null] : (otherlv_0= '<' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleValueSmallerThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1065:28: ( (otherlv_0= '<' ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1066:1: (otherlv_0= '<' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1066:1: (otherlv_0= '<' ( (lv_value_1_0= ruleExpression ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1066:3: otherlv_0= '<' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleValueSmallerThan2411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueSmallerThanAccess().getLessThanSignKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1070:1: ( (lv_value_1_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1071:1: (lv_value_1_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1071:1: (lv_value_1_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1072:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueSmallerThanAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleValueSmallerThan2432);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueSmallerThanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueSmallerThan"


    // $ANTLR start "entryRuleValueInRange"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1096:1: entryRuleValueInRange returns [EObject current=null] : iv_ruleValueInRange= ruleValueInRange EOF ;
    public final EObject entryRuleValueInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueInRange = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1097:2: (iv_ruleValueInRange= ruleValueInRange EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1098:2: iv_ruleValueInRange= ruleValueInRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueInRangeRule()); 
            }
            pushFollow(FOLLOW_ruleValueInRange_in_entryRuleValueInRange2468);
            iv_ruleValueInRange=ruleValueInRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueInRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueInRange2478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueInRange"


    // $ANTLR start "ruleValueInRange"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1105:1: ruleValueInRange returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= '[' ( (lv_inf_3_0= ruleExpression ) ) ( ( '...' )=>otherlv_4= '...' ) ( (lv_sup_5_0= ruleExpression ) ) otherlv_6= ']' ) ;
    public final EObject ruleValueInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inf_3_0 = null;

        EObject lv_sup_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1108:28: ( (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= '[' ( (lv_inf_3_0= ruleExpression ) ) ( ( '...' )=>otherlv_4= '...' ) ( (lv_sup_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1109:1: (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= '[' ( (lv_inf_3_0= ruleExpression ) ) ( ( '...' )=>otherlv_4= '...' ) ( (lv_sup_5_0= ruleExpression ) ) otherlv_6= ']' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1109:1: (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= '[' ( (lv_inf_3_0= ruleExpression ) ) ( ( '...' )=>otherlv_4= '...' ) ( (lv_sup_5_0= ruleExpression ) ) otherlv_6= ']' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1109:3: otherlv_0= 'in' otherlv_1= 'range' otherlv_2= '[' ( (lv_inf_3_0= ruleExpression ) ) ( ( '...' )=>otherlv_4= '...' ) ( (lv_sup_5_0= ruleExpression ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleValueInRange2515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueInRangeAccess().getInKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleValueInRange2527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getValueInRangeAccess().getRangeKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleValueInRange2539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getValueInRangeAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1121:1: ( (lv_inf_3_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1122:1: (lv_inf_3_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1122:1: (lv_inf_3_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1123:3: lv_inf_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueInRangeAccess().getInfExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleValueInRange2560);
            lv_inf_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueInRangeRule());
              	        }
                     		set(
                     			current, 
                     			"inf",
                      		lv_inf_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1139:2: ( ( '...' )=>otherlv_4= '...' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1139:3: ( '...' )=>otherlv_4= '...'
            {
            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleValueInRange2580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getValueInRangeAccess().getFullStopFullStopFullStopKeyword_4());
                  
            }

            }

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1144:2: ( (lv_sup_5_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1145:1: (lv_sup_5_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1145:1: (lv_sup_5_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1146:3: lv_sup_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueInRangeAccess().getSupExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleValueInRange2602);
            lv_sup_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueInRangeRule());
              	        }
                     		set(
                     			current, 
                     			"sup",
                      		lv_sup_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleValueInRange2614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getValueInRangeAccess().getRightSquareBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueInRange"


    // $ANTLR start "entryRuleValueDifferentFrom"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1174:1: entryRuleValueDifferentFrom returns [EObject current=null] : iv_ruleValueDifferentFrom= ruleValueDifferentFrom EOF ;
    public final EObject entryRuleValueDifferentFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueDifferentFrom = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1175:2: (iv_ruleValueDifferentFrom= ruleValueDifferentFrom EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1176:2: iv_ruleValueDifferentFrom= ruleValueDifferentFrom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueDifferentFromRule()); 
            }
            pushFollow(FOLLOW_ruleValueDifferentFrom_in_entryRuleValueDifferentFrom2650);
            iv_ruleValueDifferentFrom=ruleValueDifferentFrom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueDifferentFrom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueDifferentFrom2660); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueDifferentFrom"


    // $ANTLR start "ruleValueDifferentFrom"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1183:1: ruleValueDifferentFrom returns [EObject current=null] : (otherlv_0= '!=' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleValueDifferentFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1186:28: ( (otherlv_0= '!=' ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1187:1: (otherlv_0= '!=' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1187:1: (otherlv_0= '!=' ( (lv_value_1_0= ruleExpression ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1187:3: otherlv_0= '!=' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleValueDifferentFrom2697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueDifferentFromAccess().getExclamationMarkEqualsSignKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1191:1: ( (lv_value_1_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1192:1: (lv_value_1_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1192:1: (lv_value_1_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1193:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueDifferentFromAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleValueDifferentFrom2718);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueDifferentFromRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueDifferentFrom"


    // $ANTLR start "entryRuleisReal"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1217:1: entryRuleisReal returns [EObject current=null] : iv_ruleisReal= ruleisReal EOF ;
    public final EObject entryRuleisReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisReal = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1218:2: (iv_ruleisReal= ruleisReal EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1219:2: iv_ruleisReal= ruleisReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsRealRule()); 
            }
            pushFollow(FOLLOW_ruleisReal_in_entryRuleisReal2754);
            iv_ruleisReal=ruleisReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleisReal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleisReal2764); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleisReal"


    // $ANTLR start "ruleisReal"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1226:1: ruleisReal returns [EObject current=null] : ( ( (lv_isReal_0_0= 'is' ) ) otherlv_1= 'real' ) ;
    public final EObject ruleisReal() throws RecognitionException {
        EObject current = null;

        Token lv_isReal_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1229:28: ( ( ( (lv_isReal_0_0= 'is' ) ) otherlv_1= 'real' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1230:1: ( ( (lv_isReal_0_0= 'is' ) ) otherlv_1= 'real' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1230:1: ( ( (lv_isReal_0_0= 'is' ) ) otherlv_1= 'real' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1230:2: ( (lv_isReal_0_0= 'is' ) ) otherlv_1= 'real'
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1230:2: ( (lv_isReal_0_0= 'is' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1231:1: (lv_isReal_0_0= 'is' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1231:1: (lv_isReal_0_0= 'is' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1232:3: lv_isReal_0_0= 'is'
            {
            lv_isReal_0_0=(Token)match(input,38,FOLLOW_38_in_ruleisReal2807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_isReal_0_0, grammarAccess.getIsRealAccess().getIsRealIsKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIsRealRule());
              	        }
                     		setWithLastConsumed(current, "isReal", true, "is");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleisReal2832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIsRealAccess().getRealKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleisReal"


    // $ANTLR start "entryRuleisRational"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1257:1: entryRuleisRational returns [EObject current=null] : iv_ruleisRational= ruleisRational EOF ;
    public final EObject entryRuleisRational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisRational = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1258:2: (iv_ruleisRational= ruleisRational EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1259:2: iv_ruleisRational= ruleisRational EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsRationalRule()); 
            }
            pushFollow(FOLLOW_ruleisRational_in_entryRuleisRational2868);
            iv_ruleisRational=ruleisRational();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleisRational; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleisRational2878); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleisRational"


    // $ANTLR start "ruleisRational"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1266:1: ruleisRational returns [EObject current=null] : ( ( (lv_isRational_0_0= 'is' ) ) otherlv_1= 'rational' ) ;
    public final EObject ruleisRational() throws RecognitionException {
        EObject current = null;

        Token lv_isRational_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1269:28: ( ( ( (lv_isRational_0_0= 'is' ) ) otherlv_1= 'rational' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1270:1: ( ( (lv_isRational_0_0= 'is' ) ) otherlv_1= 'rational' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1270:1: ( ( (lv_isRational_0_0= 'is' ) ) otherlv_1= 'rational' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1270:2: ( (lv_isRational_0_0= 'is' ) ) otherlv_1= 'rational'
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1270:2: ( (lv_isRational_0_0= 'is' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1271:1: (lv_isRational_0_0= 'is' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1271:1: (lv_isRational_0_0= 'is' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1272:3: lv_isRational_0_0= 'is'
            {
            lv_isRational_0_0=(Token)match(input,38,FOLLOW_38_in_ruleisRational2921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_isRational_0_0, grammarAccess.getIsRationalAccess().getIsRationalIsKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIsRationalRule());
              	        }
                     		setWithLastConsumed(current, "isRational", true, "is");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleisRational2946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIsRationalAccess().getRationalKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleisRational"


    // $ANTLR start "entryRuleisInteger"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1297:1: entryRuleisInteger returns [EObject current=null] : iv_ruleisInteger= ruleisInteger EOF ;
    public final EObject entryRuleisInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisInteger = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1298:2: (iv_ruleisInteger= ruleisInteger EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1299:2: iv_ruleisInteger= ruleisInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleisInteger_in_entryRuleisInteger2982);
            iv_ruleisInteger=ruleisInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleisInteger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleisInteger2992); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleisInteger"


    // $ANTLR start "ruleisInteger"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1306:1: ruleisInteger returns [EObject current=null] : ( ( (lv_isInteger_0_0= 'is' ) ) otherlv_1= 'integer' ) ;
    public final EObject ruleisInteger() throws RecognitionException {
        EObject current = null;

        Token lv_isInteger_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1309:28: ( ( ( (lv_isInteger_0_0= 'is' ) ) otherlv_1= 'integer' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1310:1: ( ( (lv_isInteger_0_0= 'is' ) ) otherlv_1= 'integer' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1310:1: ( ( (lv_isInteger_0_0= 'is' ) ) otherlv_1= 'integer' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1310:2: ( (lv_isInteger_0_0= 'is' ) ) otherlv_1= 'integer'
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1310:2: ( (lv_isInteger_0_0= 'is' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1311:1: (lv_isInteger_0_0= 'is' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1311:1: (lv_isInteger_0_0= 'is' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1312:3: lv_isInteger_0_0= 'is'
            {
            lv_isInteger_0_0=(Token)match(input,38,FOLLOW_38_in_ruleisInteger3035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_isInteger_0_0, grammarAccess.getIsIntegerAccess().getIsIntegerIsKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIsIntegerRule());
              	        }
                     		setWithLastConsumed(current, "isInteger", true, "is");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleisInteger3060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIsIntegerAccess().getIntegerKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleisInteger"


    // $ANTLR start "entryRuledefaultValue"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1337:1: entryRuledefaultValue returns [EObject current=null] : iv_ruledefaultValue= ruledefaultValue EOF ;
    public final EObject entryRuledefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefaultValue = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1338:2: (iv_ruledefaultValue= ruledefaultValue EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1339:2: iv_ruledefaultValue= ruledefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruledefaultValue_in_entryRuledefaultValue3096);
            iv_ruledefaultValue=ruledefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledefaultValue3106); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledefaultValue"


    // $ANTLR start "ruledefaultValue"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1346:1: ruledefaultValue returns [EObject current=null] : (otherlv_0= 'default ' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruledefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1349:28: ( (otherlv_0= 'default ' ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1350:1: (otherlv_0= 'default ' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1350:1: (otherlv_0= 'default ' ( (lv_value_1_0= ruleExpression ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1350:3: otherlv_0= 'default ' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruledefaultValue3143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefaultValueAccess().getDefaultKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1354:1: ( (lv_value_1_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1355:1: (lv_value_1_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1355:1: (lv_value_1_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1356:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultValueAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruledefaultValue3164);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledefaultValue"


    // $ANTLR start "entryRuleBelongsToSet"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1380:1: entryRuleBelongsToSet returns [EObject current=null] : iv_ruleBelongsToSet= ruleBelongsToSet EOF ;
    public final EObject entryRuleBelongsToSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsToSet = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1381:2: (iv_ruleBelongsToSet= ruleBelongsToSet EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1382:2: iv_ruleBelongsToSet= ruleBelongsToSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBelongsToSetRule()); 
            }
            pushFollow(FOLLOW_ruleBelongsToSet_in_entryRuleBelongsToSet3200);
            iv_ruleBelongsToSet=ruleBelongsToSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBelongsToSet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelongsToSet3210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBelongsToSet"


    // $ANTLR start "ruleBelongsToSet"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1389:1: ruleBelongsToSet returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '{' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* ) otherlv_5= '}' ) ;
    public final EObject ruleBelongsToSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1392:28: ( (otherlv_0= 'in' otherlv_1= '{' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* ) otherlv_5= '}' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1393:1: (otherlv_0= 'in' otherlv_1= '{' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* ) otherlv_5= '}' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1393:1: (otherlv_0= 'in' otherlv_1= '{' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* ) otherlv_5= '}' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1393:3: otherlv_0= 'in' otherlv_1= '{' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleBelongsToSet3247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBelongsToSetAccess().getInKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBelongsToSet3259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBelongsToSetAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1401:1: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1401:2: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1401:2: ( (lv_values_2_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1402:1: (lv_values_2_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1402:1: (lv_values_2_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1403:3: lv_values_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBelongsToSetAccess().getValuesExpressionParserRuleCall_2_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleBelongsToSet3281);
            lv_values_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBelongsToSetRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1419:2: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1419:4: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleBelongsToSet3294); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getBelongsToSetAccess().getCommaKeyword_2_1_0());
            	          
            	    }
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1423:1: ( (lv_values_4_0= ruleExpression ) )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1424:1: (lv_values_4_0= ruleExpression )
            	    {
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1424:1: (lv_values_4_0= ruleExpression )
            	    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1425:3: lv_values_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBelongsToSetAccess().getValuesExpressionParserRuleCall_2_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBelongsToSet3315);
            	    lv_values_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBelongsToSetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleBelongsToSet3330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBelongsToSetAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBelongsToSet"


    // $ANTLR start "entryRuleisNull"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1453:1: entryRuleisNull returns [EObject current=null] : iv_ruleisNull= ruleisNull EOF ;
    public final EObject entryRuleisNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisNull = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1454:2: (iv_ruleisNull= ruleisNull EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1455:2: iv_ruleisNull= ruleisNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsNullRule()); 
            }
            pushFollow(FOLLOW_ruleisNull_in_entryRuleisNull3366);
            iv_ruleisNull=ruleisNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleisNull; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleisNull3376); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleisNull"


    // $ANTLR start "ruleisNull"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1462:1: ruleisNull returns [EObject current=null] : ( ( (lv_isNull_0_0= 'is' ) ) otherlv_1= 'null' ) ;
    public final EObject ruleisNull() throws RecognitionException {
        EObject current = null;

        Token lv_isNull_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1465:28: ( ( ( (lv_isNull_0_0= 'is' ) ) otherlv_1= 'null' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1466:1: ( ( (lv_isNull_0_0= 'is' ) ) otherlv_1= 'null' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1466:1: ( ( (lv_isNull_0_0= 'is' ) ) otherlv_1= 'null' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1466:2: ( (lv_isNull_0_0= 'is' ) ) otherlv_1= 'null'
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1466:2: ( (lv_isNull_0_0= 'is' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1467:1: (lv_isNull_0_0= 'is' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1467:1: (lv_isNull_0_0= 'is' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1468:3: lv_isNull_0_0= 'is'
            {
            lv_isNull_0_0=(Token)match(input,38,FOLLOW_38_in_ruleisNull3419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_isNull_0_0, grammarAccess.getIsNullAccess().getIsNullIsKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIsNullRule());
              	        }
                     		setWithLastConsumed(current, "isNull", true, "is");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleisNull3444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIsNullAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleisNull"


    // $ANTLR start "entryRuleFunction"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1493:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1494:2: (iv_ruleFunction= ruleFunction EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1495:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3480);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1502:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionType ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1505:28: ( ( ( (lv_name_0_0= ruleFunctionType ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1506:1: ( ( (lv_name_0_0= ruleFunctionType ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1506:1: ( ( (lv_name_0_0= ruleFunctionType ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1506:2: ( (lv_name_0_0= ruleFunctionType ) ) otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1506:2: ( (lv_name_0_0= ruleFunctionType ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1507:1: (lv_name_0_0= ruleFunctionType )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1507:1: (lv_name_0_0= ruleFunctionType )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1508:3: lv_name_0_0= ruleFunctionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getNameFunctionTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionType_in_ruleFunction3536);
            lv_name_0_0=ruleFunctionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"FunctionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleFunction3548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1528:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1529:1: (lv_expr_2_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1529:1: (lv_expr_2_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1530:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunction3569);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleFunction3581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleAtomicParameterExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1558:1: entryRuleAtomicParameterExpression returns [EObject current=null] : iv_ruleAtomicParameterExpression= ruleAtomicParameterExpression EOF ;
    public final EObject entryRuleAtomicParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicParameterExpression = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1559:2: (iv_ruleAtomicParameterExpression= ruleAtomicParameterExpression EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1560:2: iv_ruleAtomicParameterExpression= ruleAtomicParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicParameterExpression_in_entryRuleAtomicParameterExpression3617);
            iv_ruleAtomicParameterExpression=ruleAtomicParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicParameterExpression3627); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicParameterExpression"


    // $ANTLR start "ruleAtomicParameterExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1567:1: ruleAtomicParameterExpression returns [EObject current=null] : (otherlv_0= '$' ( ( ruleParameterID ) ) (otherlv_2= '^' ( (lv_power_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAtomicParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_power_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1570:28: ( (otherlv_0= '$' ( ( ruleParameterID ) ) (otherlv_2= '^' ( (lv_power_3_0= ruleExpression ) ) )? ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1571:1: (otherlv_0= '$' ( ( ruleParameterID ) ) (otherlv_2= '^' ( (lv_power_3_0= ruleExpression ) ) )? )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1571:1: (otherlv_0= '$' ( ( ruleParameterID ) ) (otherlv_2= '^' ( (lv_power_3_0= ruleExpression ) ) )? )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1571:3: otherlv_0= '$' ( ( ruleParameterID ) ) (otherlv_2= '^' ( (lv_power_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleAtomicParameterExpression3664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAtomicParameterExpressionAccess().getDollarSignKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1575:1: ( ( ruleParameterID ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1576:1: ( ruleParameterID )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1576:1: ( ruleParameterID )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1577:3: ruleParameterID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAtomicParameterExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAtomicParameterExpressionAccess().getPrefParameterCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterID_in_ruleAtomicParameterExpression3687);
            ruleParameterID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1590:2: (otherlv_2= '^' ( (lv_power_3_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1590:4: otherlv_2= '^' ( (lv_power_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleAtomicParameterExpression3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicParameterExpressionAccess().getCircumflexAccentKeyword_2_0());
                          
                    }
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1594:1: ( (lv_power_3_0= ruleExpression ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1595:1: (lv_power_3_0= ruleExpression )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1595:1: (lv_power_3_0= ruleExpression )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1596:3: lv_power_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicParameterExpressionAccess().getPowerExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtomicParameterExpression3721);
                    lv_power_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicParameterExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"power",
                              		lv_power_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicParameterExpression"


    // $ANTLR start "entryRuleAtomicConstantExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1620:1: entryRuleAtomicConstantExpression returns [EObject current=null] : iv_ruleAtomicConstantExpression= ruleAtomicConstantExpression EOF ;
    public final EObject entryRuleAtomicConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicConstantExpression = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1621:2: (iv_ruleAtomicConstantExpression= ruleAtomicConstantExpression EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1622:2: iv_ruleAtomicConstantExpression= ruleAtomicConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicConstantExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicConstantExpression_in_entryRuleAtomicConstantExpression3759);
            iv_ruleAtomicConstantExpression=ruleAtomicConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicConstantExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicConstantExpression3769); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicConstantExpression"


    // $ANTLR start "ruleAtomicConstantExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1629:1: ruleAtomicConstantExpression returns [EObject current=null] : ( ( ( (lv_const_0_0= ruleNumber ) ) (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )? ) | ( (lv_str_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAtomicConstantExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_str_3_0=null;
        AntlrDatatypeRuleToken lv_const_0_0 = null;

        EObject lv_power_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1632:28: ( ( ( ( (lv_const_0_0= ruleNumber ) ) (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )? ) | ( (lv_str_3_0= RULE_STRING ) ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1633:1: ( ( ( (lv_const_0_0= ruleNumber ) ) (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )? ) | ( (lv_str_3_0= RULE_STRING ) ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1633:1: ( ( ( (lv_const_0_0= ruleNumber ) ) (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )? ) | ( (lv_str_3_0= RULE_STRING ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_FLOAT && LA17_0<=RULE_INT)||(LA17_0>=48 && LA17_0<=49)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1633:2: ( ( (lv_const_0_0= ruleNumber ) ) (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )? )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1633:2: ( ( (lv_const_0_0= ruleNumber ) ) (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )? )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1633:3: ( (lv_const_0_0= ruleNumber ) ) (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )?
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1633:3: ( (lv_const_0_0= ruleNumber ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1634:1: (lv_const_0_0= ruleNumber )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1634:1: (lv_const_0_0= ruleNumber )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1635:3: lv_const_0_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicConstantExpressionAccess().getConstNumberParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleAtomicConstantExpression3816);
                    lv_const_0_0=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicConstantExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"const",
                              		lv_const_0_0, 
                              		"Number");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1651:2: (otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==47) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1651:4: otherlv_1= '^' ( (lv_power_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleAtomicConstantExpression3829); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getAtomicConstantExpressionAccess().getCircumflexAccentKeyword_0_1_0());
                                  
                            }
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1655:1: ( (lv_power_2_0= ruleExpression ) )
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1656:1: (lv_power_2_0= ruleExpression )
                            {
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1656:1: (lv_power_2_0= ruleExpression )
                            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1657:3: lv_power_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAtomicConstantExpressionAccess().getPowerExpressionParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleAtomicConstantExpression3850);
                            lv_power_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAtomicConstantExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"power",
                                      		lv_power_2_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1674:6: ( (lv_str_3_0= RULE_STRING ) )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1674:6: ( (lv_str_3_0= RULE_STRING ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1675:1: (lv_str_3_0= RULE_STRING )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1675:1: (lv_str_3_0= RULE_STRING )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1676:3: lv_str_3_0= RULE_STRING
                    {
                    lv_str_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomicConstantExpression3876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_str_3_0, grammarAccess.getAtomicConstantExpressionAccess().getStrSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicConstantExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"str",
                              		lv_str_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicConstantExpression"


    // $ANTLR start "entryRuleExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1700:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1701:2: (iv_ruleExpression= ruleExpression EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1702:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3917);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3927); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1709:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( '+' | '-' | '*' | '/' | '.' )=> ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1712:28: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( '+' | '-' | '*' | '/' | '.' )=> ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) ) )? ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1713:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( '+' | '-' | '*' | '/' | '.' )=> ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) ) )? )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1713:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( '+' | '-' | '*' | '/' | '.' )=> ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) ) )? )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1714:5: this_TerminalExpression_0= ruleTerminalExpression ( ( '+' | '-' | '*' | '/' | '.' )=> ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression3974);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1722:1: ( ( '+' | '-' | '*' | '/' | '.' )=> ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) ) )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA18_1 = input.LA(2);

                    if ( (synpred3_InternalPdls()) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 49:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred3_InternalPdls()) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 65:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred3_InternalPdls()) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 66:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred3_InternalPdls()) ) {
                        alt18=1;
                    }
                    }
                    break;
                case 67:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred3_InternalPdls()) ) {
                        alt18=1;
                    }
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1722:2: ( '+' | '-' | '*' | '/' | '.' )=> ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1727:4: ( () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1727:5: () ( (lv_op_2_0= ruleOperationType ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1727:5: ()
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1728:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpressionAccess().getOperationLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1733:2: ( (lv_op_2_0= ruleOperationType ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1734:1: (lv_op_2_0= ruleOperationType )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1734:1: (lv_op_2_0= ruleOperationType )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1735:3: lv_op_2_0= ruleOperationType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getOpOperationTypeEnumRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationType_in_ruleExpression4040);
                    lv_op_2_0=ruleOperationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"OperationType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1751:2: ( (lv_right_3_0= ruleTerminalExpression ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1752:1: (lv_right_3_0= ruleTerminalExpression )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1752:1: (lv_right_3_0= ruleTerminalExpression )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1753:3: lv_right_3_0= ruleTerminalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression4061);
                    lv_right_3_0=ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"TerminalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1777:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1778:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1779:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4100);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression4110); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1786:1: ruleTerminalExpression returns [EObject current=null] : (this_ParenthesisContent_0= ruleParenthesisContent | this_AtomicConstantExpression_1= ruleAtomicConstantExpression | this_AtomicParameterExpression_2= ruleAtomicParameterExpression | this_Function_3= ruleFunction ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesisContent_0 = null;

        EObject this_AtomicConstantExpression_1 = null;

        EObject this_AtomicParameterExpression_2 = null;

        EObject this_Function_3 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1789:28: ( (this_ParenthesisContent_0= ruleParenthesisContent | this_AtomicConstantExpression_1= ruleAtomicConstantExpression | this_AtomicParameterExpression_2= ruleAtomicParameterExpression | this_Function_3= ruleFunction ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1790:1: (this_ParenthesisContent_0= ruleParenthesisContent | this_AtomicConstantExpression_1= ruleAtomicConstantExpression | this_AtomicParameterExpression_2= ruleAtomicParameterExpression | this_Function_3= ruleFunction )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1790:1: (this_ParenthesisContent_0= ruleParenthesisContent | this_AtomicConstantExpression_1= ruleAtomicConstantExpression | this_AtomicParameterExpression_2= ruleAtomicParameterExpression | this_Function_3= ruleFunction )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
            case RULE_FLOAT:
            case RULE_INT:
            case 48:
            case 49:
                {
                alt19=2;
                }
                break;
            case 46:
                {
                alt19=3;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1791:5: this_ParenthesisContent_0= ruleParenthesisContent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getParenthesisContentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesisContent_in_ruleTerminalExpression4157);
                    this_ParenthesisContent_0=ruleParenthesisContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesisContent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1801:5: this_AtomicConstantExpression_1= ruleAtomicConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getAtomicConstantExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicConstantExpression_in_ruleTerminalExpression4184);
                    this_AtomicConstantExpression_1=ruleAtomicConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicConstantExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1811:5: this_AtomicParameterExpression_2= ruleAtomicParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getAtomicParameterExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicParameterExpression_in_ruleTerminalExpression4211);
                    this_AtomicParameterExpression_2=ruleAtomicParameterExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicParameterExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1821:5: this_Function_3= ruleFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleTerminalExpression4238);
                    this_Function_3=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Function_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleParenthesisContent"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1837:1: entryRuleParenthesisContent returns [EObject current=null] : iv_ruleParenthesisContent= ruleParenthesisContent EOF ;
    public final EObject entryRuleParenthesisContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisContent = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1838:2: (iv_ruleParenthesisContent= ruleParenthesisContent EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1839:2: iv_ruleParenthesisContent= ruleParenthesisContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisContentRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisContent_in_entryRuleParenthesisContent4273);
            iv_ruleParenthesisContent=ruleParenthesisContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisContent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisContent4283); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesisContent"


    // $ANTLR start "ruleParenthesisContent"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1846:1: ruleParenthesisContent returns [EObject current=null] : (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' (otherlv_3= '^' ( (lv_power_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleParenthesisContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expr_1_0 = null;

        EObject lv_power_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1849:28: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' (otherlv_3= '^' ( (lv_power_4_0= ruleExpression ) ) )? ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1850:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' (otherlv_3= '^' ( (lv_power_4_0= ruleExpression ) ) )? )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1850:1: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' (otherlv_3= '^' ( (lv_power_4_0= ruleExpression ) ) )? )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1850:3: otherlv_0= '(' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ')' (otherlv_3= '^' ( (lv_power_4_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleParenthesisContent4320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesisContentAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1854:1: ( (lv_expr_1_0= ruleExpression ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1855:1: (lv_expr_1_0= ruleExpression )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1855:1: (lv_expr_1_0= ruleExpression )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1856:3: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesisContentAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesisContent4341);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesisContentRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleParenthesisContent4353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesisContentAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1876:1: (otherlv_3= '^' ( (lv_power_4_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1876:3: otherlv_3= '^' ( (lv_power_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleParenthesisContent4366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParenthesisContentAccess().getCircumflexAccentKeyword_3_0());
                          
                    }
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1880:1: ( (lv_power_4_0= ruleExpression ) )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1881:1: (lv_power_4_0= ruleExpression )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1881:1: (lv_power_4_0= ruleExpression )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1882:3: lv_power_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParenthesisContentAccess().getPowerExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleParenthesisContent4387);
                    lv_power_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParenthesisContentRule());
                      	        }
                             		set(
                             			current, 
                             			"power",
                              		lv_power_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesisContent"


    // $ANTLR start "entryRuleNumber"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1906:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1910:2: (iv_ruleNumber= ruleNumber EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1911:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber4432);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber4443); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1921:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= ruleINTEGER | this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_1=null;
        AntlrDatatypeRuleToken this_INTEGER_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1925:28: ( (this_INTEGER_0= ruleINTEGER | this_FLOAT_1= RULE_FLOAT ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1926:1: (this_INTEGER_0= ruleINTEGER | this_FLOAT_1= RULE_FLOAT )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1926:1: (this_INTEGER_0= ruleINTEGER | this_FLOAT_1= RULE_FLOAT )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||(LA21_0>=48 && LA21_0<=49)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_FLOAT) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1927:5: this_INTEGER_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberAccess().getINTEGERParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleINTEGER_in_ruleNumber4494);
                    this_INTEGER_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INTEGER_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1938:10: this_FLOAT_1= RULE_FLOAT
                    {
                    this_FLOAT_1=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleNumber4520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOAT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOAT_1, grammarAccess.getNumberAccess().getFLOATTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleINTEGER"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1956:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1957:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1958:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FOLLOW_ruleINTEGER_in_entryRuleINTEGER4570);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER4581); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1965:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1968:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1969:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1969:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1969:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1969:2: (kw= '+' | kw= '-' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            else if ( (LA22_0==49) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1970:2: kw= '+'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleINTEGER4620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getINTEGERAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1977:2: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleINTEGER4639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTEGER4656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "ruleParameterType"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1997:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1999:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2000:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2000:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'integer' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt23=1;
                }
                break;
            case 51:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            case 39:
                {
                alt23=4;
                }
                break;
            case 52:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2000:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2000:2: (enumLiteral_0= 'boolean' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2000:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleParameterType4715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2006:6: (enumLiteral_1= 'string' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2006:6: (enumLiteral_1= 'string' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2006:8: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleParameterType4732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2012:6: (enumLiteral_2= 'integer' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2012:6: (enumLiteral_2= 'integer' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2012:8: enumLiteral_2= 'integer'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleParameterType4749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2018:6: (enumLiteral_3= 'real' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2018:6: (enumLiteral_3= 'real' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2018:8: enumLiteral_3= 'real'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_39_in_ruleParameterType4766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2024:6: (enumLiteral_4= 'date' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2024:6: (enumLiteral_4= 'date' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2024:8: enumLiteral_4= 'date'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_52_in_ruleParameterType4783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterTypeAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getParameterTypeAccess().getDateEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "ruleFunctionType"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2034:1: ruleFunctionType returns [Enumerator current=null] : ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'abs' ) | (enumLiteral_2= 'sin' ) | (enumLiteral_3= 'cos' ) | (enumLiteral_4= 'tan' ) | (enumLiteral_5= 'asin' ) | (enumLiteral_6= 'acos' ) | (enumLiteral_7= 'atan' ) | (enumLiteral_8= 'exp' ) | (enumLiteral_9= 'log' ) | (enumLiteral_10= 'sum' ) | (enumLiteral_11= 'product' ) ) ;
    public final Enumerator ruleFunctionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2036:28: ( ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'abs' ) | (enumLiteral_2= 'sin' ) | (enumLiteral_3= 'cos' ) | (enumLiteral_4= 'tan' ) | (enumLiteral_5= 'asin' ) | (enumLiteral_6= 'acos' ) | (enumLiteral_7= 'atan' ) | (enumLiteral_8= 'exp' ) | (enumLiteral_9= 'log' ) | (enumLiteral_10= 'sum' ) | (enumLiteral_11= 'product' ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2037:1: ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'abs' ) | (enumLiteral_2= 'sin' ) | (enumLiteral_3= 'cos' ) | (enumLiteral_4= 'tan' ) | (enumLiteral_5= 'asin' ) | (enumLiteral_6= 'acos' ) | (enumLiteral_7= 'atan' ) | (enumLiteral_8= 'exp' ) | (enumLiteral_9= 'log' ) | (enumLiteral_10= 'sum' ) | (enumLiteral_11= 'product' ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2037:1: ( (enumLiteral_0= 'size' ) | (enumLiteral_1= 'abs' ) | (enumLiteral_2= 'sin' ) | (enumLiteral_3= 'cos' ) | (enumLiteral_4= 'tan' ) | (enumLiteral_5= 'asin' ) | (enumLiteral_6= 'acos' ) | (enumLiteral_7= 'atan' ) | (enumLiteral_8= 'exp' ) | (enumLiteral_9= 'log' ) | (enumLiteral_10= 'sum' ) | (enumLiteral_11= 'product' ) )
            int alt24=12;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt24=1;
                }
                break;
            case 54:
                {
                alt24=2;
                }
                break;
            case 55:
                {
                alt24=3;
                }
                break;
            case 56:
                {
                alt24=4;
                }
                break;
            case 57:
                {
                alt24=5;
                }
                break;
            case 58:
                {
                alt24=6;
                }
                break;
            case 59:
                {
                alt24=7;
                }
                break;
            case 60:
                {
                alt24=8;
                }
                break;
            case 61:
                {
                alt24=9;
                }
                break;
            case 62:
                {
                alt24=10;
                }
                break;
            case 63:
                {
                alt24=11;
                }
                break;
            case 64:
                {
                alt24=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2037:2: (enumLiteral_0= 'size' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2037:2: (enumLiteral_0= 'size' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2037:4: enumLiteral_0= 'size'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleFunctionType4828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getSizeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getFunctionTypeAccess().getSizeEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2043:6: (enumLiteral_1= 'abs' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2043:6: (enumLiteral_1= 'abs' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2043:8: enumLiteral_1= 'abs'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleFunctionType4845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getAbsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getFunctionTypeAccess().getAbsEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2049:6: (enumLiteral_2= 'sin' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2049:6: (enumLiteral_2= 'sin' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2049:8: enumLiteral_2= 'sin'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleFunctionType4862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getSinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getFunctionTypeAccess().getSinEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2055:6: (enumLiteral_3= 'cos' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2055:6: (enumLiteral_3= 'cos' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2055:8: enumLiteral_3= 'cos'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_ruleFunctionType4879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getCosEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getFunctionTypeAccess().getCosEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2061:6: (enumLiteral_4= 'tan' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2061:6: (enumLiteral_4= 'tan' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2061:8: enumLiteral_4= 'tan'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_ruleFunctionType4896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getTanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getFunctionTypeAccess().getTanEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2067:6: (enumLiteral_5= 'asin' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2067:6: (enumLiteral_5= 'asin' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2067:8: enumLiteral_5= 'asin'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_ruleFunctionType4913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getAsinEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getFunctionTypeAccess().getAsinEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2073:6: (enumLiteral_6= 'acos' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2073:6: (enumLiteral_6= 'acos' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2073:8: enumLiteral_6= 'acos'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_ruleFunctionType4930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getAcosEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getFunctionTypeAccess().getAcosEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2079:6: (enumLiteral_7= 'atan' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2079:6: (enumLiteral_7= 'atan' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2079:8: enumLiteral_7= 'atan'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_ruleFunctionType4947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getAtanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getFunctionTypeAccess().getAtanEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2085:6: (enumLiteral_8= 'exp' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2085:6: (enumLiteral_8= 'exp' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2085:8: enumLiteral_8= 'exp'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_ruleFunctionType4964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getExpEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getFunctionTypeAccess().getExpEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2091:6: (enumLiteral_9= 'log' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2091:6: (enumLiteral_9= 'log' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2091:8: enumLiteral_9= 'log'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_ruleFunctionType4981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getLogEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getFunctionTypeAccess().getLogEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2097:6: (enumLiteral_10= 'sum' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2097:6: (enumLiteral_10= 'sum' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2097:8: enumLiteral_10= 'sum'
                    {
                    enumLiteral_10=(Token)match(input,63,FOLLOW_63_in_ruleFunctionType4998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getSumEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getFunctionTypeAccess().getSumEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2103:6: (enumLiteral_11= 'product' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2103:6: (enumLiteral_11= 'product' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2103:8: enumLiteral_11= 'product'
                    {
                    enumLiteral_11=(Token)match(input,64,FOLLOW_64_in_ruleFunctionType5015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getFunctionTypeAccess().getProductEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getFunctionTypeAccess().getProductEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "ruleOperationType"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2113:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '.' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2115:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '.' ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2116:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '.' ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2116:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '.' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case 65:
                {
                alt25=3;
                }
                break;
            case 66:
                {
                alt25=4;
                }
                break;
            case 67:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2116:2: (enumLiteral_0= '+' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2116:2: (enumLiteral_0= '+' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2116:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleOperationType5060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationTypeAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getPLUSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2122:6: (enumLiteral_1= '-' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2122:6: (enumLiteral_1= '-' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2122:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleOperationType5077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationTypeAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getMINUSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2128:6: (enumLiteral_2= '*' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2128:6: (enumLiteral_2= '*' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2128:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleOperationType5094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationTypeAccess().getMULTIPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperationTypeAccess().getMULTIPLYEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2134:6: (enumLiteral_3= '/' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2134:6: (enumLiteral_3= '/' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2134:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleOperationType5111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationTypeAccess().getDIVIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperationTypeAccess().getDIVIDEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2140:6: (enumLiteral_4= '.' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2140:6: (enumLiteral_4= '.' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2140:8: enumLiteral_4= '.'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleOperationType5128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperationTypeAccess().getSCALAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperationTypeAccess().getSCALAREnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleLogicalConnector"
    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2150:1: ruleLogicalConnector returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleLogicalConnector() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2152:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2153:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2153:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==68) ) {
                alt26=1;
            }
            else if ( (LA26_0==69) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2153:2: (enumLiteral_0= 'and' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2153:2: (enumLiteral_0= 'and' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2153:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleLogicalConnector5173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicalConnectorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicalConnectorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2159:6: (enumLiteral_1= 'or' )
                    {
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2159:6: (enumLiteral_1= 'or' )
                    // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:2159:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleLogicalConnector5190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicalConnectorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLogicalConnectorAccess().getOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalConnector"

    // $ANTLR start synpred3_InternalPdls
    public final void synpred3_InternalPdls_fragment() throws RecognitionException {   
        // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:1722:2: ( '+' | '-' | '*' | '/' | '.' )
        // ../net.ivoa.pdl.pdls/src-gen/net/ivoa/pdl/pdls/parser/antlr/internal/InternalPdls.g:
        {
        if ( (input.LA(1)>=48 && input.LA(1)<=49)||(input.LA(1)>=65 && input.LA(1)<=67) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred3_InternalPdls

    // Delegated rules

    public final boolean synpred3_InternalPdls() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPdls_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\15\uffff";
    static final String DFA13_eofS =
        "\15\uffff";
    static final String DFA13_minS =
        "\1\40\1\47\1\15\12\uffff";
    static final String DFA13_maxS =
        "\1\52\1\53\1\43\12\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\7\1\11\1\12\1\5\1\4\1\6\1\1\1\2\1\10";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\6\1\5\1\2\2\uffff\1\4\1\1\3\uffff\1\3",
            "\1\11\1\7\1\10\1\uffff\1\12",
            "\1\13\25\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "903:1: (this_isNull_0= ruleisNull | this_BelongsToSet_1= ruleBelongsToSet | this_defaultValue_2= ruledefaultValue | this_isInteger_3= ruleisInteger | this_isRational_4= ruleisRational | this_isReal_5= ruleisReal | this_ValueDifferentFrom_6= ruleValueDifferentFrom | this_ValueInRange_7= ruleValueInRange | this_ValueSmallerThan_8= ruleValueSmallerThan | this_ValueLargerThan_9= ruleValueLargerThan )";
        }
    }
 

    public static final BitSet FOLLOW_rulePDL_in_entryRulePDL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePDL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rulePDL131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleService212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService229 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleService258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleService291 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleService304 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleService316 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService328 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_ruleParameterGroup_in_ruleService349 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleService362 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService386 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_ruleParameterGroup_in_ruleService407 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleService420 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleService432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterID_in_entryRuleParameterID469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterID480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterID519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterID_in_ruleParameter619 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleParameter631 = new BitSet(new long[]{0x001C028000000000L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleParameter652 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleParameter664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterGroup_in_entryRuleParameterGroup700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterGroup710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleParameterGroup747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterGroup764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleParameterGroup781 = new BitSet(new long[]{0x0000000003308000L});
    public static final BitSet FOLLOW_21_in_ruleParameterGroup794 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleParameterGroup806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterID_in_ruleParameterGroup829 = new BitSet(new long[]{0x0000000003B08000L});
    public static final BitSet FOLLOW_23_in_ruleParameterGroup842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterID_in_ruleParameterGroup865 = new BitSet(new long[]{0x0000000003B08000L});
    public static final BitSet FOLLOW_ruleConstraintOnGroup_in_ruleParameterGroup890 = new BitSet(new long[]{0x0000000001108000L});
    public static final BitSet FOLLOW_24_in_ruleParameterGroup904 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleWhenConditionalStatement_in_ruleParameterGroup925 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleParameterGroup937 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_ruleParameterGroup_in_ruleParameterGroup960 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleParameterGroup973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintOnGroup_in_entryRuleConstraintOnGroup1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintOnGroup1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConstraintOnGroup1056 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleConstraintOnGroup1069 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_ruleConditionalStatement_in_ruleConstraintOnGroup1090 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleConstraintOnGroup1102 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleConditionalStatement_in_entryRuleConditionalStatement1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalStatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysConditionalStatement_in_ruleConditionalStatement1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenConditionalStatement_in_ruleConditionalStatement1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenConditionalStatement_in_ruleConditionalStatement1252 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConditionalStatement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenConditionalStatement_in_entryRuleWhenConditionalStatement1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenConditionalStatement1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleWhenConditionalStatement1358 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleConditionalClause_in_ruleWhenConditionalStatement1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenConditionalStatement_in_entryRuleIfThenConditionalStatement1415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenConditionalStatement1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIfThenConditionalStatement1462 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleConditionalClause_in_ruleIfThenConditionalStatement1483 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIfThenConditionalStatement1495 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleConditionalClause_in_ruleIfThenConditionalStatement1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalClause_in_entryRuleConditionalClause1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalClause1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalClause_in_ruleConditionalClause1609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleLogicalConnector_in_ruleConditionalClause1649 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTerminalClause_in_ruleConditionalClause1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalClause_in_entryRuleTerminalClause1708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalClause1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalClause1764 = new BitSet(new long[]{0x0000046700000000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleTerminalClause1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysConditionalStatement_in_entryRuleAlwaysConditionalStatement1821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysConditionalStatement1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAlwaysConditionalStatement1868 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleConditionalClause_in_ruleAlwaysConditionalStatement1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisNull_in_ruleCondition1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsToSet_in_ruleCondition2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledefaultValue_in_ruleCondition2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisInteger_in_ruleCondition2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisRational_in_ruleCondition2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisReal_in_ruleCondition2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueDifferentFrom_in_ruleCondition2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueInRange_in_ruleCondition2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSmallerThan_in_ruleCondition2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueLargerThan_in_ruleCondition2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueLargerThan_in_entryRuleValueLargerThan2260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueLargerThan2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleValueLargerThan2307 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValueLargerThan2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSmallerThan_in_entryRuleValueSmallerThan2364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSmallerThan2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleValueSmallerThan2411 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValueSmallerThan2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueInRange_in_entryRuleValueInRange2468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueInRange2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleValueInRange2515 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleValueInRange2527 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleValueInRange2539 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValueInRange2560 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleValueInRange2580 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValueInRange2602 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleValueInRange2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueDifferentFrom_in_entryRuleValueDifferentFrom2650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueDifferentFrom2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleValueDifferentFrom2697 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleValueDifferentFrom2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisReal_in_entryRuleisReal2754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleisReal2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleisReal2807 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleisReal2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisRational_in_entryRuleisRational2868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleisRational2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleisRational2921 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleisRational2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisInteger_in_entryRuleisInteger2982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleisInteger2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleisInteger3035 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleisInteger3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledefaultValue_in_entryRuledefaultValue3096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledefaultValue3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruledefaultValue3143 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruledefaultValue3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsToSet_in_entryRuleBelongsToSet3200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelongsToSet3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBelongsToSet3247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBelongsToSet3259 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBelongsToSet3281 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleBelongsToSet3294 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBelongsToSet3315 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleBelongsToSet3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleisNull_in_entryRuleisNull3366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleisNull3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleisNull3419 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleisNull3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionType_in_ruleFunction3536 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleFunction3548 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunction3569 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleFunction3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicParameterExpression_in_entryRuleAtomicParameterExpression3617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicParameterExpression3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAtomicParameterExpression3664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterID_in_ruleAtomicParameterExpression3687 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAtomicParameterExpression3700 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtomicParameterExpression3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicConstantExpression_in_entryRuleAtomicConstantExpression3759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicConstantExpression3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleAtomicConstantExpression3816 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleAtomicConstantExpression3829 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtomicConstantExpression3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomicConstantExpression3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression3974 = new BitSet(new long[]{0x0003000000000002L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleOperationType_in_ruleExpression4040 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisContent_in_ruleTerminalExpression4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicConstantExpression_in_ruleTerminalExpression4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicParameterExpression_in_ruleTerminalExpression4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleTerminalExpression4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisContent_in_entryRuleParenthesisContent4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisContent4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParenthesisContent4320 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesisContent4341 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleParenthesisContent4353 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleParenthesisContent4366 = new BitSet(new long[]{0xFFE35000000000E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesisContent4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber4432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleNumber4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleNumber4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER4570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleINTEGER4620 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_49_in_ruleINTEGER4639 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleParameterType4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleParameterType4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleParameterType4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleParameterType4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleParameterType4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFunctionType4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFunctionType4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFunctionType4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFunctionType4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFunctionType4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFunctionType4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFunctionType4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFunctionType4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFunctionType4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleFunctionType4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleFunctionType4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFunctionType5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOperationType5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOperationType5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperationType5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperationType5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperationType5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLogicalConnector5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLogicalConnector5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalPdls3983 = new BitSet(new long[]{0x0000000000000002L});

}