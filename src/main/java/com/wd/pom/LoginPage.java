package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends OhrmBase{
	
	private By txt_UserName =  By.id("txtUsername");
	private By txt_Password =  By.id("txtPassword");
	private By btn_Login =  By.id("btnLogin");
		
	public void enterTextOnUserName(String value) {
		getDriver().findElement(txt_UserName).sendKeys(value);
		System.out.println(value+" entered on UserName");
	}
	
	public void enterTextOnPassword(String value) {
		getDriver().findElement(txt_Password).sendKeys(value);
		System.out.println(value+" entered on Password");
	}
	
	public void clickOnLogin() {
		getDriver().findElement(btn_Login).click();
		System.out.println("clicked on login button");
	}
	
	public void Close() {
		getDriver().close();
		System.out.println("login page Closed");
	}
}
