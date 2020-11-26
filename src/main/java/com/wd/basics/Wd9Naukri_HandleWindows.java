package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wd9Naukri_HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver("chrome");
		
		//wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("em.fb-icon")).click();
		
		String mWndHandle = driver.getWindowHandle(); //current window
		
		Set<String> wndHandles =  driver.getWindowHandles(); //all window handles of the session
		for(String wndHandle:wndHandles) {
			System.out.println(wndHandle);
			driver.switchTo().window(wndHandle);
			String title = driver.getTitle();
			if (title.contains("Facebook")) {
				break;
			}
		}
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.close(); //closes current scope window
		
		driver.switchTo().window(mWndHandle); //switch to main window
		
		driver.quit(); //closes session (all windows)
	}

}