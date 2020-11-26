package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Wd15WorkingWithMouseActions_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver("chrome");
		
		//wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		new Actions(driver).moveToElement(driver.findElement(By.linkText("API documentation")))
		.build().perform();
		
		WebElement frmElement =driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frmElement);
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement dstElement = driver.findElement(By.id("droppable"));
		
		//get location of an element
		Point point = dstElement.getLocation();
		int x = point.getX();
		int y= point.getY();
		
//		Rectangle rectangle = dstElement.getRect();
//		rectangle.getX()
		
		Actions actions = new Actions(driver);
//		actions.dragAndDrop(srcElement, dstElement).build().perform();		
		actions.dragAndDropBy(srcElement, x, y).build().perform();
		
	}

}