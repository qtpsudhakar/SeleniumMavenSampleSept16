package com.wd.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.config.OhrmConfig;

public abstract class DriverFactory {

	public static WebDriver getDriver(String brName) {
		
		WebDriver driver;
		switch (brName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
			//--disable-notifications
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
			FirefoxOptions fOptions = new FirefoxOptions();
			fOptions.addPreference("dom.webnotifications.enabled",false);
			
			driver = new FirefoxDriver(fOptions);
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		return driver;
	}
	
	public static WebDriver getRemoteDriver(String brName, String OSName) {
		WebDriver driver=null;
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			switch (brName.toLowerCase()) {
			case "chrome":
				capabilities.setBrowserName(BrowserType.CHROME);
				break;
			case "firefox":
				capabilities.setBrowserName(BrowserType.FIREFOX);
				break;

			default:
				capabilities.setBrowserName(BrowserType.CHROME);
			}			

			
			switch (OSName.toLowerCase()) {
			case "windows":
				capabilities.setPlatform(Platform.WINDOWS);
				break;
			case "mac":
				capabilities.setPlatform(Platform.MAC);
				break;
			default:
				capabilities.setPlatform(Platform.ANY);
			}
			
			driver = new RemoteWebDriver(new URL(OhrmConfig.GRID_URL), capabilities);
						
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
}
