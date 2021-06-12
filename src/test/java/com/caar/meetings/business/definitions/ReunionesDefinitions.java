package com.caar.meetings.business.definitions;

import com.caar.meetings.business.step.BusinessUnitStep;
import com.caar.meetings.business.step.LoginStep;
import com.caar.meetings.business.step.MeetingsStep;
import com.caar.meetings.business.step.ValidacionCreacionReunionStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ReunionesDefinitions {
	@Steps
	LoginStep loginStep;
	@Steps
	BusinessUnitStep businessUnitStep;
	@Steps
	MeetingsStep meetingsStep;
	@Steps
	ValidacionCreacionReunionStep validacionCreacionReunionStep;
	
	@Given("ingresar a la pagina con {string} y {string}")
	public void ingresar_a_la_pagina_con_y(String usuario, String clave)  {
		loginStep.ingresoALaPagina();
		loginStep.inicioSesion(usuario,clave);
	}

	@When("ir a la opcion de Business Unit")
	public void ir_a_la_opcion_de_business_unit() {
		businessUnitStep.IngresarAUnidadNegocio();
		
	}

	@When("crear una unidad de negocio {string}")
	public void crear_una_unidad_de_negocio_y(String nombre) {
		businessUnitStep.CrearUnidadNegocio(nombre);
	}

	@When("ir a la opcion de reuniones")
	public void ir_a_la_opcion_de_reuniones() {
		meetingsStep.IngresarAReuniones();
	}

	@When("Diligenciar el formulario de reuniones {string} {string} {string}")
	public void diligenciar_el_formulario_de_reuniones(String nombreReunion, String telefono, String tipoReunion) {
		meetingsStep.diligenciarFormulario(nombreReunion, telefono, tipoReunion);
	}
	
	@When("Diligenciar datos de localizacion {string} {string}")
	public void diligencia_Datos_De_Localizacion(String nombreUbicacion, String direccion) {
		meetingsStep.DiligenciarLocalizacion(nombreUbicacion, direccion);
	}
	
	@When("Diligenciar datos de Organizacion {string} {string} {string} {string} {string}")
	public void diligenciar_Datos_De_Organizacion(String titulo, String nombre, String apellido, String correo, String dominio) {
		meetingsStep.diligenciarOgranizacion(titulo, nombre, apellido, correo, dominio);
	}

	@Then("validar la creacion de la reunion {string}")
	public void validar_la_creacion_de_la_reunion(String nombreReunion) {
		validacionCreacionReunionStep.validoReunion(nombreReunion);
	}


}
