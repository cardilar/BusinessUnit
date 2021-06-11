package com.caar.meetings.business.step;

import com.caar.meetings.business.pageobjects.CrearReunion;

import net.thucydides.core.annotations.Steps;

public class MeetingsStep {
	@Steps
	CrearReunion crearReunion;	
	

	public void IngresarAReuniones() {
		crearReunion.IngresarAReuniones();
		
	}
	
	public void diligenciarFormulario() {
		crearReunion.CrearNuevaReunion();
	}

}
