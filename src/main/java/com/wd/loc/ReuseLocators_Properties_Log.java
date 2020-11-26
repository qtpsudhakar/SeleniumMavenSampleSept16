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

public class ReuseLocators_Properties_Log {

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

		DriverUtils.enterText(driver, "txt_LoginPage_UserName", "admin", properties);
		DriverUtils.enterText(driver, "txt_LoginPage_Password", "admin123", properties);
		DriverUtils.click(driver, "btn_LoginPage_Login", properties);
		
	}

}
