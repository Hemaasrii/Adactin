package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class FaceBook extends Base_Class {

	public FaceBook(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "email")
	private WebElement useName;
	
	
	public WebElement getUseName() {
		return useName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginClick() {
		return loginClick;
	}

	@FindBy(id = "passContainer")
	private WebElement passWord;
	
	@FindBy(name = "login")
	private WebElement loginClick;



}
