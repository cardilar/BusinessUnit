package com.caar.meetings.business.step;

import com.caar.meetings.business.pageobjects.VerificarCreacionPageOject;

import net.thucydides.core.annotations.Steps;

public class ValidacionCreacionReunionStep {

	@Steps
	VerificarCreacionPageOject verificarCreacion;
	
	public void validoReunion(String reunion) {
		verificarCreacion.Compara(reunion);
	}
}
