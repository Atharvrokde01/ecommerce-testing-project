package testdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	public WebDriver driver = null;

	public BrowserUtility(WebDriver driver) {
		this.driver= driver;
	}
	public WebDriver browserUtility(String Browser) {
		if ("chrome".equalsIgnoreCase(Browser)) {
			driver = new ChromeDriver();	
		}
		
		else if ("edge".equalsIgnoreCase(Browser)) {
			driver = new EdgeDriver();
			
		}
		else {
			driver = new FirefoxDriver();
		}
	return driver;	
	}

	public void websiteAddress(String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		}

	public void deleteBrowserCoockies() {
		driver.manage().deleteAllCookies();
		
	}



}
