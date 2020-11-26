package com.wd.loc;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverUtils {

	public static WebElement getElement(WebDriver driver,By locator) {
//		System.out.println("Finding "+locator);
		return driver.findElement(locator);
	}
	
	public static void click(WebDriver driver,By locator) {
		getElement(driver, locator).click();
		System.out.println("clicked on "+locator);
	}
	
	public static void click(WebDriver driver,ELocators locator) {
		getElement(driver, locator.getLocator()).click();
		System.out.println("clicked on "+locator.getName());
	}
	
	public static void click(WebDriver driver,String locator,Properties p) {
		getElement(driver, getBy(p, locator)).click();
		System.out.println("clicked on "+locator);
	}
	
	public static void enterText(WebDriver driver,By locator,String txtToEnter) {
		getElement(driver, locator).sendKeys(txtToEnter);;
		System.out.println(txtToEnter+" entered on "+locator);
	}
	
	public static void enterText(WebDriver driver,ELocators locator,String txtToEnter) {
		getElement(driver, locator.getLocator()).sendKeys(txtToEnter);;
		System.out.println(txtToEnter+" entered on "+locator.getName());
	}
	
	public static void enterText(WebDriver driver,String locator,String txtToEnter,Properties p) {
		getElement(driver, getBy(p, locator)).sendKeys(txtToEnter);;
		System.out.println(txtToEnter+" entered on "+locator);
	}
	
	public static By getBy(Properties p,String strProp) {		
		return By.xpath(p.getProperty(strProp));
	}
}













