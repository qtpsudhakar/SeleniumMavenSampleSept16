package com.wd.loc;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class ReuseLocators_Enum_Log {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriver("chrome");

		// wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		DriverUtils.enterText(driver, ELocators.txt_LoginPage_UserName, "admin");		
		DriverUtils.enterText(driver, ELocators.txt_LoginPage_Password, "admin123");
		DriverUtils.click(driver, ELocators.btn_LoginPage_Login);
		
		DriverUtils.click(driver, ELocators.lnk_WelcomePage_PIM);
		DriverUtils.click(driver, ELocators.btn_EmployeeListPage_Add);
		
		DriverUtils.enterText(driver, ELocators.txt_AddEmployeePage_FirstName, "selenium");
		DriverUtils.enterText(driver, ELocators.txt_AddEmployeePage_LastName, "dev");
		DriverUtils.click(driver, ELocators.btn_AddEmployeePage_Save);
		
	}
}
