package com.caar.meetings.business.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utilities.Aplicativo;

public class BusinessUnitPageObject extends PageObject{
	private Aplicativo aplicativo;
	
	String pestanaOrganizationUnit = "//span[contains(text(),'Organization')]";
	String pestanaBusiness = "//span[contains(text(),'Business Units')]";
	
	String nuevaUnidadNegocio = "//span[contains(text(),'New Business Unit')]";
	String nombreUnidad ="//input[contains(@name,'Name')]";
	
	@FindBy(xpath = "(//a[@class='select2-choice select2-default']//following-sibling::span)[1]")
	private WebElementFacade parent;
	
	String guardar = "//span[@class='button-inner' and contains(text(),'Save')]";
	
	public void pestanaOrganization() {
		aplicativo.clickConJS(pestanaOrganizationUnit);
		Serenity.takeScreenshot();
	}
	
	public void pestanaBusinessUnit() {
		aplicativo.clickConJS(pestanaBusiness);
		Serenity.takeScreenshot();
	}

	public void creaBusinessUnit(String nombre) {
		aplicativo.clickConJS(nuevaUnidadNegocio);
		WebElement name= getDriver().findElement(By.xpath(nombreUnidad));
		name.sendKeys(nombre);
		Serenity.takeScreenshot();
		aplicativo.clickConJS(guardar);
		Serenity.takeScreenshot();
	}

}
