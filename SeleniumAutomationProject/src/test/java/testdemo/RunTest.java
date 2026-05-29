package testdemo;

import java.awt.Menu;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;

public class RunTest {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
	 BrowserUtility util= new BrowserUtility(driver);
	 driver= util.browserUtility("firefox");
	 util.deleteBrowserCoockies();
	 util.websiteAddress("https://automationexercise.com/");
	 Thread.sleep(2000);
	 By byLoginbtn= By.xpath("//a[normalize-space()='Signup / Login']");
	 ElementUtility eleutil= new ElementUtility(driver);
	 eleutil.doClick(byLoginbtn);
	 By byEmail= By.xpath("//input[@data-qa='login-email']");
	 eleutil.doSendkey(byEmail, "admin12344321@gmail.com");
	 By byPassword= By.xpath("//input[@placeholder='Password']");
	 eleutil.doSendkey(byPassword,"Admin123");
	 By bySignIn= By.xpath("//button[normalize-space()='Login']");
	 eleutil.doClick(bySignIn);
	 Thread.sleep(2000);
	 By byPro_name= By.xpath("//a[@href='/products']");
	 eleutil.doClick(byPro_name);
	 By byPro_search= By.xpath("//input[@id='search_product']");
	 eleutil.doSendkey(byPro_search, "Men Tshirt");
	 By bySearch= By.xpath("//button[@id='submit_search']");
	 eleutil.doClick(bySearch);
	 Thread.sleep(2000);
	 By byViewPro= By.xpath("//a[normalize-space()='View Product']");
	 eleutil.doClick(byViewPro);
	 Thread.sleep(2000);
	 By byAddToCart= By.xpath("//button[normalize-space()='Add to cart']");
	 eleutil.doClick(byAddToCart);
	 Thread.sleep(2000);
	 By byViewCart= By.xpath("//u[normalize-space()='View Cart']");
	 eleutil.doClick(byViewCart);
	 Thread.sleep(2000);
	 By doLogOut= By.xpath("//a[normalize-space()='Logout']");
	 eleutil.doClick(doLogOut);
	 util.minimizePage();
	 util.closeBrowser();
	 
	
	}



}
