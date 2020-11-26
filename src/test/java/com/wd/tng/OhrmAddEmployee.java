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

import com.wd.util.DriverFactory;

public class OhrmAddEmployee extends OhrmBaseTest {

	@Test
	public void login() {
		try {
			WebElement txtUserName = driver.findElement(By.id("txtUsername"));
			txtUserName.sendKeys("Admin");
			Reporter.log("Admin Entered in User Name Text box");
			driver.findElement(By.id("txtPassword1")).sendKeys("admin123");
			Reporter.log("Admin123 Entered in password Text box");
			driver.findElement(By.id("btnLogin")).click();
			Reporter.log("clicked on login button");
			Reporter.log("Logged in to application");
		} catch (Exception |Error e ) {
			Reporter.log("Failed to find an element" + e.getMessage());
			Assert.fail();
		}

	}

	@Test(dependsOnMethods = "login", dataProvider = "getEmpData", dataProviderClass = Ohrm_DP.class)
	public void addEmployee(String fname, String lname) {
		try {
			driver.findElement(By.linkText("PIM")).click();
			Reporter.log("clicked on PIM Link");
			driver.findElement(By.name("btnAdd")).click();
			Reporter.log("clicked on add button");
			driver.findElement(By.name("firstName")).sendKeys(fname);
			Reporter.log(fname + " entered on first name");
			driver.findElement(By.id("lastName")).sendKeys(lname);
			Reporter.log(lname + " entered on lname name");
			driver.findElement(By.id("btnSave")).click();
			Reporter.log("clicked on save button");
			System.out.println("Employee Added");
		} catch (Exception e) {
			//log result
			Reporter.log("Failed to add employee");
			Assert.fail();
		}
	}

}
