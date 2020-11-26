package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd5OhrmAddEmployee {

	public static void main(String[] args)  {
		
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
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.name("firstName")).sendKeys("web");
		driver.findElement(By.id("lastName")).sendKeys("driver");
		driver.findElement(By.id("btnSave")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} //wait for 2 seconds
		
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
		
		driver.findElement(By.linkText("PIM")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//switch on checkbox
		WebElement chkSelectAll = driver.findElement(By.id("ohrmList_chkSelectAll"));
		if (!chkSelectAll.isSelected()) {
			chkSelectAll.click();
		}
		
//		driver.quit();
	}

}





