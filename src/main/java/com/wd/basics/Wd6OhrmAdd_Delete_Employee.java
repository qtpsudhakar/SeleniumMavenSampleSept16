package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd6OhrmAdd_Delete_Employee {

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
		
		driver.findElement(By.id("btnSave")).click();
		
		//selecting radio
		
		//using id
		driver.findElement(By.id("personal_optGender_2")).click();
		
		//if id not available
		
		/*
		 * findElement return a sigle element or exception
		 * If multiple elements are there with same locator it returns first occurance
		 * 
		 * findElements return list of elements that are matching the given locator
		 */
//		driver.findElement(By.name("personal[optGender]")).click();
		List<WebElement> rdbElements = driver.findElements(By.name("personal[optGender]"));
		rdbElements.get(1).click(); //clicks on the 2nd radio
		
		//if value attribute exist use name and value combination
		// use cssselector or xpath 
		
		//select list item
		WebElement elmMaritalStatus = driver.findElement(By.id("personal_cmbMarital"));
		Select lstMaritalStatus  = new Select(elmMaritalStatus);
		lstMaritalStatus.selectByVisibleText("Married");
		
		//standard
		new Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("American");
		
		//if application is multi lang
		new Select(driver.findElement(By.id("personal_cmbMarital"))).selectByValue("Other");

		//to select a random
		new Select(driver.findElement(By.id("personal_cmbNation"))).selectByIndex(3);
		
		String empID = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
				
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		
		Thread.sleep(2000);
		String empIdXpath = "//tr[contains(.,'"+empID+"')]//input";
		//tr[contains(.,'0077')]//input
		
		WebElement elmEmpId = driver.findElement(By.xpath(empIdXpath));
		if (!elmEmpId.isSelected()) {
			elmEmpId.click();
		}
		
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
//		driver.quit();
	}

}





