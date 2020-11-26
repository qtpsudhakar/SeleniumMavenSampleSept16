package com.wd.tng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.AddEmployeePage;
import com.wd.pom.EmployeeListPage;
import com.wd.pom.LoginPage;
import com.wd.pom.WelcomePage;
import com.wd.util.DriverFactory;

public class OhrmAddEmployee_POM extends OhrmBasePOM {

	@Test
	public void login() {
		try {
			LoginPage loginPage = new LoginPage();			
			loginPage.enterTextOnUserName("admin");
			loginPage.enterTextOnPassword("admin123");
			loginPage.clickOnLogin();
			Reporter.log("Logged in to application");
			
		} catch (Exception |Error e ) {
			Reporter.log("Failed to login" + e.getMessage());
			Assert.fail();
		}

	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() {
		try {
			WelcomePage welcomePage = new WelcomePage();
			welcomePage.clickOnPIM();
			
			EmployeeListPage employeeListPage = new EmployeeListPage();
			employeeListPage.clickOnAdd();
			
			AddEmployeePage addEmployeePage = new AddEmployeePage();
			addEmployeePage.enterTextOnFirstName("selenium");
			addEmployeePage.enterTextOnLastName("dev");
			addEmployeePage.clickOnSave();
		
			System.out.println("Employee Added");
		} catch (Exception e) {
			//log result
			Reporter.log("Failed to add employee");
			Assert.fail();
		}
	}

}
