package com.wd.pof;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.wd.util.DriverFactory;

public class OhrmBase {

	public static WebDriver driver;
	
	public void openApplication(String brName) {
		driver = DriverFactory.getDriver(brName);

		// wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application Opened in "+brName);
	}
	
	public void Close() {
		driver.quit();
		System.out.println("Application Closed");
	}
}

