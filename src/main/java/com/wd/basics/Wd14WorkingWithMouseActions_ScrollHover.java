package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Wd14WorkingWithMouseActions_ScrollHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver("chrome");
		
		//wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		WebElement frameElement = driver.findElement(By.xpath("//div[@class='demo code-demo']/iframe"));
		driver.switchTo().frame(frameElement);
		
		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.tagName("div"))).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		new Actions(driver).moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CLA")).click();
	}

}