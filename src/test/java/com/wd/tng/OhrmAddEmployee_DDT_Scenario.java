package com.wd.tng;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.util.DataUtils;
import com.wd.util.DriverFactory;

public class OhrmAddEmployee_DDT_Scenario extends OhrmBaseTest {
	
	@Test
	public void login() throws IOException {
//		tcMap = DataUtils.getTcData("TC_Ohrm_AddEmployee_001");
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys(tcMap.get("username"));

		driver.findElement(By.id("txtPassword")).sendKeys(tcMap.get("pasword"));
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Logged in to application");
	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.name("firstName")).sendKeys(tcMap.get("fname"));
		driver.findElement(By.id("lastName")).sendKeys(tcMap.get("lname"));
		driver.findElement(By.id("btnSave")).click();
		System.out.println("Employee Added");
	}

}
