package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends OhrmBase {

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	private WebElement txtUserName;

	@FindBy(id = "txtPassword")
	private WebElement txtPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;

	public void enterTextOnUserName(String value) {
		txtUserName.sendKeys(value);		
		System.out.println(value + " entered on UserName");
	}

	public void enterTextOnPassword(String value) {
		txtPassword.sendKeys(value);
		System.out.println(value + " entered on Password");
	}

	public void clickOnLogin() {
		btnLogin.click();
		System.out.println("clicked on login button");
	}
}
