package testdemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;

public class RunTest {
	public static WebDriver driver;
	public static void main(String[] args) {
	 BrowserUtility util= new BrowserUtility(driver);
	 driver= util.browserUtility("chrome");
	 util.deleteBrowserCoockies();
	 util.websiteAddress("https://automationexercise.com/");
	 By byLoginbtn= By.xpath("//a[normalize-space()='Signup / Login']");
	 ElementUtility eleutil= new ElementUtility(driver);
	 eleutil.doClick(byLoginbtn);
	 By byEmail= By.xpath("//input[@data-qa='login-email']");
	 eleutil.doSendkey(byEmail, "admin12344321@gmail.com");
	 By byPassword= By.xpath("//input[@placeholder='Password']");
	 eleutil.doSendkey(byPassword,"Admin123");
	 By bySignIn= By.xpath("//button[normalize-space()='Login']");
	 eleutil.doClick(bySignIn);
	 

	}


}
