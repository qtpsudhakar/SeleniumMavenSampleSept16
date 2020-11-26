package com.wd.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wd4OhrmLogin {
	
//	static WebDriver driver;
	
	public static void main(String[] args) {
//		WebDriver driver = null;
		WebDriver driver = DriverFactory.getDriver("chrome");
//		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
	}

}
