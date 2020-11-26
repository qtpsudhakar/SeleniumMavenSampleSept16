package com.wd.tng;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.util.DataUtils;
import com.wd.util.DriverFactory;

public class OhrmBaseTestRemote {
	
	WebDriver driver;
	HashMap<String, String> tcMap ;
	
	@BeforeClass
	@Parameters({"browser","os"})
	public void openApplication(@Optional("chrome") String brName,String osName) throws IOException {
		tcMap = DataUtils.getTcData("TC_Ohrm_AddEmployee_001");
//		tcMap = DataUtils.getTcData(this.getClass().getSimpleName());
		System.out.println(this.getClass().getName());
		driver = DriverFactory.getRemoteDriver(brName, osName);

		// wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application Opened");
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		System.out.println("Application Closed");
	}

}
