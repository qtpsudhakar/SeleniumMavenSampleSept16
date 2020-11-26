package com.wd.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wd1ChromeDemo {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		try {
			// specify chrome driver exe path
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
			// webdriver.gecko.driver
			// webdriver.edge.driver
			// webdriver.ie.driver
			driver = new ChromeDriver(); // creates new browser

			driver.get("http://google.com"); // navigate to google

			System.out.println(driver.getTitle()); // get title and prints

		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			driver.quit(); // closes browser
		}

	}

}
