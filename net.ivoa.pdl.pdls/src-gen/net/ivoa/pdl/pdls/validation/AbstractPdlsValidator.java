/*
 * generated by Xtext
 */
package net.ivoa.pdl.pdls.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPdlsValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(net.ivoa.pdl.pdls.pdls.PdlsPackage.eINSTANCE);
		return result;
	}
}