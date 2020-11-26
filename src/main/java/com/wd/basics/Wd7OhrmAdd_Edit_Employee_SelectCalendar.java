package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd7OhrmAdd_Edit_Employee_SelectCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver("chrome");
		
		//wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		
//		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		
		
//		driver.findElement(By.name("firstName")).sendKeys("web");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("web");
		
		driver.findElement(By.id("lastName")).sendKeys("driver");
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(2000); //wait for 2 seconds
		
		driver.findElement(By.cssSelector("input[value='Edit']")).click();
		
		//label[text()='Date of Birth']/following-sibling::img[@class='ui-datepicker-trigger']
		
		//(//img[@class='ui-datepicker-trigger'])[2]
		
		driver.findElement(By.xpath("//label[text()='Date of Birth']/following-sibling::img[@class='ui-datepicker-trigger']")).click();
		
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText("1984");
		driver.findElement(By.className("ui-datepicker-month"))
			.findElement(By.xpath("//option[text()='Sep']")).click();
		
		//select[@class='ui-datepicker-month']/option[text()='Sep']
		
		driver.findElement(By.linkText("14")).click();
	}

}





