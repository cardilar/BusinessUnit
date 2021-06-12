package com.caar.meetings.business.step;

import com.caar.meetings.business.pageobjects.CrearReunion;

import net.thucydides.core.annotations.Steps;

public class MeetingsStep {
	@Steps
	CrearReunion crearReunion;	
	

	public void IngresarAReuniones() {
		crearReunion.IngresarAReuniones();
		
	}
	
	public void diligenciarFormulario(String nombreReunion, String telefono, String tipoReunion) {
		crearReunion.CrearNuevaReunion(nombreReunion, telefono, tipoReunion);
	}

	public void DiligenciarLocalizacion(String nombre, String direccion) {
		crearReunion.Localizacion(nombre, direccion);
	}

	public void diligenciarOgranizacion(String titulo, String nombre, String apellido, String correo, String dominio, String unidadNegocio) {
		crearReunion.Organizada(titulo, nombre, apellido, correo, dominio, unidadNegocio);
	}

}
