package com.wd.loc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.util.DriverFactory;

public class ReuseLocators_Enum {

	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory.getDriver("chrome");

		// wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		DriverUtils.getElement(driver, ELocators.txt_LoginPage_UserName.getLocator()).sendKeys("admin");
		
		WebElement txtUserName = driver.findElement(ELocators.txt_LoginPage_UserName.getLocator());
		txtUserName.sendKeys("Admin");

		driver.findElement(ELocators.txt_LoginPage_Password.getLocator()).sendKeys("admin123");
		driver.findElement(ELocators.btn_LoginPage_Login.getLocator()).click();

		driver.findElement(ELocators.lnk_WelcomePage_PIM.getLocator()).click();

		driver.findElement(ELocators.btn_EmployeeListPage_Add.getLocator()).click();

		driver.findElement(ELocators.txt_AddEmployeePage_FirstName.getLocator()).sendKeys("web");

		driver.findElement(ELocators.txt_AddEmployeePage_LastName.getLocator()).sendKeys("driver");
		driver.findElement(ELocators.btn_AddEmployeePage_Save.getLocator()).click();
	}
	


}
