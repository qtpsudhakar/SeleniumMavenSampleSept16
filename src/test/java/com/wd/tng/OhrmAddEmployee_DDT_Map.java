package com.wd.tng;

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

import com.wd.util.DriverFactory;

public class OhrmAddEmployee_DDT_Map extends OhrmBaseTest {

	@Test
	public void login() {
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Logged in to application");
	}

	@Test(dependsOnMethods = "login",dataProvider = "getEmpDataMapFromExcel",dataProviderClass = Ohrm_DP.class)
	public void addEmployee(HashMap<String, String> tcMap) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.name("firstName")).sendKeys(tcMap.get("firstname"));
		driver.findElement(By.id("lastName")).sendKeys(tcMap.get("lastname"));
//		System.out.println(tcMap.get("Nationality"));
		driver.findElement(By.id("btnSave")).click();
		System.out.println("Employee Added");
	}

}
