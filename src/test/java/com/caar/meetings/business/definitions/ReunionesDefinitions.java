package com.caar.meetings.business.definitions;

import com.caar.meetings.business.step.BusinessUnitStep;
import com.caar.meetings.business.step.LoginStep;
import com.caar.meetings.business.step.MeetingsStep;

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
	@Given("ingresar a la pagina con {string} y {string}")
	public void ingresar_a_la_pagina_con_y(String usuario, String clave)  {
		loginStep.ingresoALaPagina();
		loginStep.inicioSesion(usuario,clave);
	}

	@When("ir a la opcion de Business Unit")
	public void ir_a_la_opcion_de_business_unit() {
		businessUnitStep.IngresarAUnidadNegocio();
		
	}

	@When("crear una unidad de negocio {string} y {string}")
	public void crear_una_unidad_de_negocio_y(String nombre, String parentezco) {
		businessUnitStep.CrearUnidadNegocio(nombre, parentezco);
	}

	@When("ir a la opcion de reuniones")
	public void ir_a_la_opcion_de_reuniones() {
		meetingsStep.IngresarAReuniones();
	}

	@When("Diligenciar el formulario de reuniones")
	public void diligenciar_el_formulario_de_reuniones() {
		meetingsStep.diligenciarFormulario();
	}

	@Then("validar la creacion de la reunion")
	public void validar_la_creacion_de_la_reunion() {
	}


}
