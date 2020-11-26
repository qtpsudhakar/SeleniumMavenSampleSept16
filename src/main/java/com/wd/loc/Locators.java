package com.wd.loc;

import org.openqa.selenium.By;

public class Locators {

	public static final By txt_LoginPage_UserName =  By.id("txtUsername");
	public static final By txt_LoginPage_Password =  By.id("txtPassword");
	public static final By btn_LoginPage_Login =  By.id("btnLogin");
	
	public static final By lnk_WelcomePage_PIM = By.linkText("PIM");
	public static final By btn_EmployeeListPage_Add = By.cssSelector("input[value='Add']");
	public static final By txt_AddEmployeePage_FirstName = By.xpath("//input[@name='firstName']");
	public static final By txt_AddEmployeePage_LastName = By.xpath("//input[@name='lastName']");
	public static final By btn_AddEmployeePage_Save = By.id("btnSave");
	
}
