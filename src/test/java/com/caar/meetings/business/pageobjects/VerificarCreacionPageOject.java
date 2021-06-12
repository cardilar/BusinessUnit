package com.caar.meetings.business.pageobjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;


public class VerificarCreacionPageOject extends PageObject{
	
	String Reunion ="//div[@class='slick-cell l1 r1']//a[contains(@class,'s-Meeting-MeetingLink')]";
	String buscaReunion="(//input[contains(@class,'s-QuickSearchInput')])[2]";

	public void Compara(String mensajeEsperado) {
		WebElement escribirReunion = getDriver().findElement(By.xpath(buscaReunion));
		escribirReunion.sendKeys(mensajeEsperado);
		WebElement element = getDriver().findElement(By.xpath(Reunion));
		element.isEnabled();
		String nombreReu = element.getText().toString();
		if(mensajeEsperado.contentEquals(nombreReu)) {
			System.out.println("True");
		}else {
			Assert.fail("No esta la promocion");
		}	
	}

}
