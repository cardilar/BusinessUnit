package com.caar.meetings.business.step;

import com.caar.meetings.business.pageobjects.LoginPageObject;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import utilities.Aplicativo;

public class LoginStep {
	
	private Aplicativo aplicativo;
	@Steps
	LoginPageObject loginPageObject;
	
	@Step
	public void ingresoALaPagina() {
		aplicativo.abrirPagina();
		Serenity.takeScreenshot();
	}

	@Step
	public void inicioSesion(String usuario, String clave) {
		loginPageObject.iniciaSesionAplicativo(usuario, clave);
	}

}
