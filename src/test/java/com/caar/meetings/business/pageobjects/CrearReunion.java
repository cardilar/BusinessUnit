package com.caar.meetings.business.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import utilities.Aplicativo;

public class CrearReunion extends PageObject{
	private Aplicativo aplicativo;
	
	String pestanaReunion = "//i[@class='nav-icon fa fa-comments premium-feature']//following-sibling::span[contains(text(),'Meeting')]";
	String opcionReuniones = "//span[contains(text(),'Meetings')]";
	String btnNuevaReunion = "//span[contains(text(),'New Meeting')]";
	
	String nameMeeting= "//input[contains(@name,'MeetingName')]";
	String number= "//input[contains(@name,'MeetingNumber')]";
	String unit= "//div[contains(@id,'_MeetingDialog14_UnitId')]//child::a";
	String unitLast = "//input[@class='select2-input' and @id='s2id_autogen8_search']";
	
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
	
	String reporter = "//div[contains(@id,'MeetingDialog14_ReporterContactId')]//child::a";
	String attendeeList = "//div[contains(@id,'s2id_autogen11')]//child::a";
	String opcion1= "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']//div[contains(text(),'%s')]";
	
	String guardar="//span[contains(text(),' Save')]";
	
	public void IngresarAReuniones() {
		aplicativo.clickConJS(pestanaReunion);
		aplicativo.clickConJS(opcionReuniones);
		Serenity.takeScreenshot();
	}
	
	public void CrearNuevaReunion(String nombreReunio, String telefono, String tipoReuniones) {
		aplicativo.clickConJS(btnNuevaReunion);
		WebElement nombreReunion = getDriver().findElement(By.xpath(nameMeeting));
		nombreReunion.sendKeys(nombreReunio);
		WebElement numeroReunion = getDriver().findElement(By.xpath(number));
		numeroReunion.sendKeys(telefono);
		TipoReunion(tipoReuniones);
		Serenity.takeScreenshot();
	}

	private void TipoReunion(String tipoReuniones) {
		aplicativo.clickConJS(meetingType);
		WebElement nombreTipoReunion = getDriver().findElement(By.xpath(nameTypeLocation));
		nombreTipoReunion.clear();
		nombreTipoReunion.sendKeys(tipoReuniones);
		Serenity.takeScreenshot();
		aplicativo.clickConJS(updateTypeMeeting);
	}
	
	public void Localizacion(String nombre, String direccion) {
		aplicativo.clickConJS(location);
		WebElement direccionLocacion = getDriver().findElement(By.xpath(locationAddress));
		direccionLocacion.isDisplayed();
		direccionLocacion.sendKeys(direccion);
		WebElement nombreLocacion = getDriver().findElement(By.xpath(nameTypeLocation));
		nombreLocacion.sendKeys(nombre);
		Serenity.takeScreenshot();
		aplicativo.clickConJS(locationOrganizedBtnSave);
	}
	
	public void Organizada(String titulo, String nombre, String apellido, String correo, String dominio) {
		aplicativo.clickConJS(organized);
		aplicativo.esperarElementoVisible(organizedTitle);
		WebElement tituloOrganizada = getDriver().findElement(By.xpath(organizedTitle));
		tituloOrganizada.isDisplayed();
		tituloOrganizada.sendKeys(titulo);
		WebElement nombreOrganizador = getDriver().findElement(By.xpath(organizedFirstName));
		nombreOrganizador.isDisplayed();
		nombreOrganizador.sendKeys(nombre);
		WebElement apellidoOrganizador = getDriver().findElement(By.xpath(organizedLastName));
		apellidoOrganizador.sendKeys(apellido);
		WebElement emailOrganizador = getDriver().findElement(By.xpath(organizedMail));
		emailOrganizador.sendKeys(correo);
		WebElement dominiomail = getDriver().findElement(By.xpath(organizedMailDomain));
		dominiomail.sendKeys(dominio);
		Serenity.takeScreenshot();
		aplicativo.clickConJS(locationOrganizedBtnSave);
		element(unit).click();
		element(opcion1.replace("%s", "Castropol5")).click();
		element(reporter).click();
		element(opcion1.replace("%s", nombre)).click();
		element(attendeeList).click();
		element(opcion1.replace("%s", nombre)).click();
		Serenity.takeScreenshot();
		aplicativo.clickConJS(guardar);
	}
	

}
