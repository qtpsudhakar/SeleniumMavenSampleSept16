package com.wd.basics;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wd21HandleElementsUsingJavaScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriver("chrome");

		// wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys("Admin");

		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
		
		WebElement pwd = (WebElement) jsDriver.executeScript("return document.getElementById('txtPassword');");
		pwd.sendKeys("admin123");
		
//		jsDriver.executeScript("document.getElementById('txtPassword').style.border = 'thick solid #0000FF';");
		
		jsDriver.executeScript("arguments[0].style.border = 'thick solid #0000FF';"
				+ "arguments[1].style.border = 'thick solid #0000FF';", txtUserName,pwd);
		
//		jsDriver.executeScript("return document.getElementById('btnLogin').click();");

		//https://www.w3schools.com/jsref/dom_obj_all.asp
		
	}
}










