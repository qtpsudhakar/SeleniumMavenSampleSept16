package com.wd.loc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.util.DriverFactory;

public class ReuseLocators_Properties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String flPath = "src\\com\\wd\\loc\\locators.properties";
		Properties properties = new Properties();
		properties.load(new FileReader(flPath));
		
//		System.out.println(properties.getProperty("txt_LoginPage_UserName"));
		
		WebDriver driver = DriverFactory.getDriver("chrome");

		// wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement txtUserName = driver.findElement(By.xpath(properties.getProperty("txt_LoginPage_UserName")));
		txtUserName.sendKeys("Admin");

		driver.findElement(By.xpath(properties.getProperty("txt_LoginPage_Password"))).sendKeys("admin123");
		driver.findElement(By.xpath(properties.getProperty("btn_LoginPage_Login"))).click();

		driver.findElement(By.xpath(properties.getProperty("lnk_WelcomePage_PIM"))).click();

		driver.findElement(By.xpath(properties.getProperty("btn_EmployeeListPage_Add"))).click();

//		driver.findElement(By.name("firstName")).sendKeys("web");
		driver.findElement(By.xpath(properties.getProperty("txt_AddEmployeePage_FirstName"))).sendKeys("web");

		driver.findElement(By.xpath(properties.getProperty("txt_AddEmployeePage_LastName"))).sendKeys("driver");
		driver.findElement(By.xpath(properties.getProperty("btn_AddEmployeePage_Save"))).click();

	}

}
