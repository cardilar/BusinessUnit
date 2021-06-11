package com.caar.meetings.business.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;



	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(
			features = "src/test/resources/features/ReunionUnidadNegocio.feature"
			,tags = "@tag2"
			,glue= {"com.caar.meetings.business.definitions"})
	public class reunionesRunner {

		
	}


