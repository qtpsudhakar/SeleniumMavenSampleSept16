package com.wd.loc;

import org.openqa.selenium.By;

public enum ELocators {
	
	txt_LoginPage_UserName(By.id("txtUsername")),
	txt_LoginPage_Password(By.id("txtPassword")),
	btn_LoginPage_Login(By.id("btnLogin")),
	lnk_WelcomePage_PIM (By.linkText("PIM")),
	btn_EmployeeListPage_Add (By.cssSelector("input[value='Add']")),
	txt_AddEmployeePage_FirstName ( By.xpath("//input[@name='firstName']")),
	txt_AddEmployeePage_LastName (By.xpath("//input[@name='lastName']")),
	btn_AddEmployeePage_Save (By.id("btnSave"));

	private By locator;
	
	ELocators(By loc) {
		this.locator = loc; 
	}
	
	public By getLocator() {
		return this.locator;
	}
	
	public String getName() {
		return this.name();
	}
	
}
