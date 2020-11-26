package com.wd.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wd3WebDriverRealTime {

	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory.getDriver("chrome");
		
		driver.get("http://google.com"); //navigate to google
		
		System.out.println(driver.getTitle()); //get title and prints
		
		driver.quit(); //closes browser

	}

}
