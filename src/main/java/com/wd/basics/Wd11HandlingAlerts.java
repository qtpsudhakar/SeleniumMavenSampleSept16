package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd11HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver("chrome");
		
		//wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://apsrtconline.in/oprs-web");
		
		String fromPlace = "VIJAYAWADA";
		String toPlace = "BANGALORE";
		
		//click on check availability
		driver.findElement(By.cssSelector("input[value='Check Availability']")).click();
		
		Thread.sleep(2000);
				
		Alert alert = driver.switchTo().alert();		
		
		if (alert.getText().contains("Please select start place.")) {
			System.out.println("from place validation successful");
		}else {
			System.out.println("from place validation is failed");
		}
				
		alert.accept();
		
		//select from place
		driver.findElement(By.id("fromPlaceName")).sendKeys(fromPlace);
		driver.findElement(By.linkText(fromPlace)).click();
		
		//click on check availability
		driver.findElement(By.cssSelector("input[value='Check Availability']")).click();
		Thread.sleep(2000);
		
		if (alert.getText().contains("Please select end place.")) {
			System.out.println("to place validation successful");
		}else {
			System.out.println("to place validation is failed");
		}
		
		alert.accept();
		
		//select to place
		driver.findElement(By.id("toPlaceName")).sendKeys(toPlace);
		driver.findElement(By.linkText(toPlace)).click();
		
		//select date
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.linkText("30")).click();
		
		//click on check availability
		driver.findElement(By.cssSelector("input[value='Check Availability']")).click();
		
					
	}

}