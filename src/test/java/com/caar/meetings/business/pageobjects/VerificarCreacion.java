package com.caar.meetings.business.pageobjects;


import org.junit.Assert;

import net.serenitybdd.core.pages.PageObject;
import utilities.Aplicativo;

public class VerificarCreacion extends PageObject{
	private static Aplicativo aplicativo;
	
	static String Reunion ="//div[@class='slick-cell l1 r1']//a[contains(@class,'s-Meeting-MeetingLink')]";

	public static void Compara(String mensajeEsperado) {
		String nombreReu = aplicativo.extraerTexto(Reunion);
		if(mensajeEsperado.contentEquals(nombreReu)) {
			System.out.println("True");
		}else {
			Assert.fail("No esta la promocion");
		}	
	}

}
