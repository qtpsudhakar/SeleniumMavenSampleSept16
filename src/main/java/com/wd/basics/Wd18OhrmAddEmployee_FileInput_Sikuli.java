package com.wd.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Wd18OhrmAddEmployee_FileInput_Sikuli {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed {
		
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
		
		
		Point point = driver.findElement(By.id("photofile")).getLocation();
		int x = point.getX();
		int y = point.getY();
		
		new Actions(driver).moveByOffset(x+5, y+5).click().build().perform();
		
		Thread.sleep(1000);
		
		String flPath = "C:\\Users\\envy\\Desktop\\Sept16\\selenium.png";
		
		Screen screen = new Screen();
		screen.type("C:\\Users\\envy\\Desktop\\Sept16\\txtFileName.JPG", flPath);
		Thread.sleep(1000);
		screen.click("C:\\Users\\envy\\Desktop\\Sept16\\btnOpen.JPG");
		Thread.sleep(1000);
		driver.findElement(By.id("btnSave")).click();

	}

}