package com.wd.basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Wd23GridSmple {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.FIREFOX);
		
		//local grid
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.171:4444/wd/hub"), capabilities);
		
		//docker
//		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
		
		//saucelabs cloud : Register user -> user settings -> Driver creation
		WebDriver driver = new RemoteWebDriver(new URL("https://sudhakarkakunuri:0c782c00-f711-4808-8f61-e111fb00c061@ondemand.us-west-1.saucelabs.com:443/wd/hub"), capabilities);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(20000);
		System.out.println(driver.getTitle());
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
	}

}
