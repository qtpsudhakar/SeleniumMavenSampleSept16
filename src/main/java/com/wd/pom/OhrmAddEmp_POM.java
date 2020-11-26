package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.wd.util.DriverFactory;

public class OhrmAddEmp_POM {

	public static void main(String[] args) {

		OhrmBase ohrmBase = new OhrmBase();
		ohrmBase.openApplication("chrome");
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.enterTextOnUserName("admin");
		loginPage.enterTextOnPassword("admin123");
		loginPage.clickOnLogin();

		WelcomePage welcomePage = new WelcomePage();
		welcomePage.clickOnPIM();
		
		EmployeeListPage employeeListPage = new EmployeeListPage();
		employeeListPage.clickOnAdd();
		
		AddEmployeePage addEmployeePage = new AddEmployeePage();
		addEmployeePage.enterTextOnFirstName("selenium");
		addEmployeePage.enterTextOnLastName("dev");
		addEmployeePage.clickOnSave();
		
				
	}

}
