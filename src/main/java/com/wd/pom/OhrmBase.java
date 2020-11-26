package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.wd.util.DriverFactory;

public class OhrmBase {

//	public static WebDriver driver;
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public void openApplication(String brName) {
		
		driver.set(DriverFactory.getDriver(brName));

		// wait for page navigation
		driver.get().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get().manage().window().maximize();

		driver.get().get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Application Opened in "+brName);
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	public void Close() {
		driver.get().quit();
		System.out.println("Application Closed");
	}
}

