package com.wd.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wd2FirefoxDemo {

	public static void main(String[] args) {
		
		//specify firefox driver exe path
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
		//webdriver.gecko.driver
		//webdriver.edge.driver
		//webdriver.ie.driver
		WebDriver driver = new FirefoxDriver(); //creates new browser
		
		driver.get("http://google.com"); //navigate to google
		
		System.out.println(driver.getTitle()); //get title and prints
		
		driver.quit(); //closes browser

	}

}
