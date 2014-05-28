/*
* generated by Xtext
*/
package net.ivoa.pdl.pdls.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import net.ivoa.pdl.pdls.services.PdlsGrammarAccess;

public class PdlsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private PdlsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected net.ivoa.pdl.pdls.parser.antlr.internal.InternalPdlsParser createParser(XtextTokenStream stream) {
		return new net.ivoa.pdl.pdls.parser.antlr.internal.InternalPdlsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "PDL";
	}
	
	public PdlsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PdlsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
