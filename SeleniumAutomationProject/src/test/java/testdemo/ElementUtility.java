package testdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {
	WebDriver driver;
	public ElementUtility(WebDriver driver) {
		this.driver= driver;
	}

	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public  void doSendkey(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
		
	}
	public boolean verifyIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	} 
}
