package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.Base_Class;

public class CrossBrowseTest extends Base_Class{
	
	@BeforeMethod
	@Parameters("browser")
	public void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		launchBrowser();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			launchEdgeBrowser();
		}
		maxWindow();
		getUrl("https://www.irctc.co.in/nget/train-search");
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void X() {
		System.out.println("Inside Method X");
	}
	

	@Test
	public void Y() {
		System.out.println("Inside Method Y");
	}

}
