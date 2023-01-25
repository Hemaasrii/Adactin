package TestNg;

import org.testng.annotations.Test;

import BaseClass.Base_Class;
import PageObjectManager.PageObject;

public class DependencyTest extends Base_Class{
	
	PageObject obj=new PageObject(driver);
	
	@Test(dependsOnMethods = "beforeLogin")
	private void afterLaunch() {

		elementSendKeys(obj.getFacebookLogin().getUseName(), "hemasri1697@gmail.com");

		elementSendKeys(obj.getFacebookLogin().getPassWord(), "9600952785");
	}
	
	@Test
	private void beforeLogin() {
		launchBrowser();
		getUrl("https://www.facebook.com/");
	}
	
	@Test (dependsOnMethods = "afterLaunch")
	private void loginClick() {
		elementOnClick(obj.getFacebookLogin().getLoginClick());
		System.out.println("Login Succesfull");
		
	}

}
