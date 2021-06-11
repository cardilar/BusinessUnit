package com.caar.meetings.business.step;

import com.caar.meetings.business.pageobjects.BusinessUnitPageObject;

import net.thucydides.core.annotations.Steps;

public class BusinessUnitStep {
	
	@Steps
	BusinessUnitPageObject businessUnitPageObject; 
	
	public void IngresarAUnidadNegocio(){
		businessUnitPageObject.pestanaOrganization();
		businessUnitPageObject.pestanaBusinessUnit();
	}

	public void CrearUnidadNegocio(String nombre, String parentezco) {
		businessUnitPageObject.creaBusinessUnit(nombre, parentezco);
		
	}
	

}
