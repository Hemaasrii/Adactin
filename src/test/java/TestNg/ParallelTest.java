package TestNg;

import org.testng.annotations.Test;

import BaseClass.Base_Class;

public class ParallelTest extends Base_Class {
	
	
	@Test
	public void openGoogle() {
		launchBrowser();
		getUrl("https://www.google.com/");
		System.out.println("Second Launch");
		driver.quit();
		
		
		
	}
	
	
	@Test
	public void openBing() {
		launchEdgeBrowser();
		getUrl("https://www.bing.com/");
		System.out.println("First Launch");
		driver.quit();
		
	}
	
	

}
