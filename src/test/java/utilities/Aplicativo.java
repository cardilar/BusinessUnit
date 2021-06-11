package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class Aplicativo extends PageObject{
	
	public void abrirPagina() {
		openAt("https://serenity.is/demo");
	}
	
	public void esperarElementoVisible(String xpath) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void clickConJS(String xpath) {
		WebElement element = getDriver().findElement(By.xpath(xpath));
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click();", element);
	}


}
