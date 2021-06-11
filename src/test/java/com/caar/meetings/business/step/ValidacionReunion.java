package com.caar.meetings.business.step;

import com.caar.meetings.business.pageobjects.VerificarCreacion;

public class ValidacionReunion {

	public void correctamenteCreada(String reunion) {
		VerificarCreacion.Compara(reunion);
	}

}
