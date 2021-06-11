package com.caar.meetings.business.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import utilities.Aplicativo;

public class LoginPageObject extends PageObject{
	private Aplicativo aplicativo;
	
	String usuario_Login = "//input[contains(@name,'Username')]";
	
	String clave_Login = "//input[contains(@type,'password')]";
	
	String boton_Login="//button[contains(@id,'StartSharp_Membership_LoginPanel0_LoginButton')]";
	
	public void iniciaSesionAplicativo(String usuario, String clave) {
		WebElement user = getDriver().findElement(By.xpath(usuario_Login));
		user.sendKeys(usuario);
		WebElement pass= getDriver().findElement(By.xpath(clave_Login));
		pass.sendKeys(clave);
		Serenity.takeScreenshot();
		aplicativo.clickConJS(boton_Login);
		Serenity.takeScreenshot();
	}
	

	


}
