package com.caar.meetings.business.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import utilities.Aplicativo;

public class CrearReunion extends PageObject{
	private Aplicativo aplicativo;
	
	String pestanaReunion = "//i[@class='nav-icon fa fa-comments premium-feature']//following-sibling::span[contains(text(),'Meeting')]";
	String opcionReuniones = "//span[contains(text(),'Meetings')]";
	String btnNuevaReunion = "//span[contains(text(),'New Meeting')]";
	
	String nameMeeting= "//input[contains(@name,'MeetingName')]";
	String number= "//input[contains(@name,'MeetingNumber')]";
	String unit= "//span[contains(@id,'select2-chosen-8')]";
	String unitLast = "//input[contains(@class,'select2-input') and contains(@id,'s2id_autogen8_search')]";
	
	String meetingType = "(//a[contains(@class,'inplace-button inplace-create')])[1]";
	String nameTypeLocation="(//label//following-sibling::input[contains(@name,'Name')])[2]";
	String updateTypeMeeting ="//span[contains(text(),' Update')]";
	
	
	String location = "(//a[contains(@class,'inplace-button inplace-create')])[2]";
	String locationAddress = "//input[contains(@id,'Address')]";
	String locationOrganizedBtnSave = "(//span[contains(text(),'Save')])[2]";
	
	String organized = "(//a[contains(@class,'inplace-button inplace-create')])[4]";
	String organizedTitle = "//input[contains(@name,'Title')]";
	String organizedFirstName = "//input[contains(@name,'FirstName')]";
	String organizedLastName = "//input[contains(@name,'LastName')]";
	String organizedMail = "//input[contains(@name,'Email')]";
	String organizedMailDomain = "//input[contains(@class,'emaildomain')]";
	
	String reporter = "(//span[contains(text(),'--select--')])[2]";
	String attendeeList = "//div[contains(@id,'s2id_autogen11')]";
	String opcion1= "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[1]";
	
	public void IngresarAReuniones() {
		aplicativo.clickConJS(pestanaReunion);
		aplicativo.clickConJS(opcionReuniones);	
	}
	
	public void CrearNuevaReunion() {
		aplicativo.clickConJS(btnNuevaReunion);
		WebElement nombreReunion = getDriver().findElement(By.xpath(nameMeeting));
		nombreReunion.sendKeys("Laboral");
		WebElement numeroReunion = getDriver().findElement(By.xpath(number));
		numeroReunion.sendKeys("31233987");
		TipoReunion();
		Localizacion();
		Organizada();
		aplicativo.clickConJS(reporter);
		aplicativo.clickConJS(opcion1);
		aplicativo.clickConJS(attendeeList);
		
	}

	private void TipoReunion() {
		aplicativo.clickConJS(meetingType);
		WebElement nombreTipoReunion = getDriver().findElement(By.xpath(nameTypeLocation));
		nombreTipoReunion.clear();
		nombreTipoReunion.sendKeys("Ordinaria");
		aplicativo.clickConJS(updateTypeMeeting);
	}
	
	private void Localizacion() {
		aplicativo.clickConJS(location);
		WebElement nombreLocacion = getDriver().findElement(By.xpath(nameTypeLocation));
		//aplicativo.esperarElementoVisible(nameTypeLocation);
		//nombreLocacion.isDisplayed();
		nombreLocacion.sendKeys("Carlos");
		if(nameTypeLocation.equalsIgnoreCase(null))
			nombreLocacion.sendKeys("Carlos");
		WebElement direccionLocacion = getDriver().findElement(By.xpath(locationAddress));
		direccionLocacion.isDisplayed();
		direccionLocacion.sendKeys("Calle 1 Carrera 1");
		aplicativo.clickConJS(locationOrganizedBtnSave);
	}
	
	private void Organizada() {
		aplicativo.clickConJS(organized);
		aplicativo.esperarElementoVisible(organizedTitle);
		WebElement tituloOrganizada = getDriver().findElement(By.xpath(organizedTitle));
		tituloOrganizada.isDisplayed();
		tituloOrganizada.sendKeys("Hakuna Matata");
		WebElement nombreOrganizador = getDriver().findElement(By.xpath(organizedFirstName));
		nombreOrganizador.isDisplayed();
		nombreOrganizador.sendKeys("Cesar");
		WebElement apellidoOrganizador = getDriver().findElement(By.xpath(organizedLastName));
		apellidoOrganizador.sendKeys("Ardil");
		WebElement emailOrganizador = getDriver().findElement(By.xpath(organizedMail));
		emailOrganizador.sendKeys("correoficticio");
		WebElement dominiomail = getDriver().findElement(By.xpath(organizedMailDomain));
		dominiomail.sendKeys("hotmail.com");
		aplicativo.clickConJS(locationOrganizedBtnSave);
	}
	

}
