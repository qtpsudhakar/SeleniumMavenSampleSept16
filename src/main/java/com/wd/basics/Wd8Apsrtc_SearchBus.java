package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd8Apsrtc_SearchBus {

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
		
		//select from place
		driver.findElement(By.id("fromPlaceName")).sendKeys(fromPlace);
		driver.findElement(By.linkText(fromPlace)).click();
		
		//select to place
		driver.findElement(By.id("toPlaceName")).sendKeys(toPlace);
		driver.findElement(By.linkText(toPlace)).click();
		
		//select date
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.linkText("30")).click();
		
		//click on check availability
		driver.findElement(By.cssSelector("input[value='Check Availability']")).click();
		
		//select bus type
		driver.findElement(By.id("BtFid")).click();
		driver.findElement(By.cssSelector("input[name='A/C CLASS']")).click();
		
		//get all ac service numbers
		List<WebElement> lstServiceNos = driver.findElements(By.xpath("//div[@class='srvceNO' and not(ancestor::*[@style='display: none;'])]"));
		
		System.out.println("Total AC services:"+lstServiceNos.size());
		
		for(WebElement service:lstServiceNos) {
			System.out.println(service.getText());
		}
			
	}

}