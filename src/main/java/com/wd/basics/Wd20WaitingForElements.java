package com.wd.basics;

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

public class Wd20WaitingForElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriver("chrome");

		// wait for page navigation
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// wait for finding elements
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement txtUserName = driver.findElement(By.id("txtUsername"));
		txtUserName.sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("PIM")).click();

//		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.cssSelector("input[value='Add']")).click();

//		driver.findElement(By.name("firstName")).sendKeys("web");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("web");

		driver.findElement(By.id("lastName")).sendKeys("driver");
		driver.findElement(By.id("btnSave")).click();

//		Thread.sleep(2000); //wait for 2 seconds

		driver.findElement(By.id("btnSave")).click();

		// selecting radio

		// using id
		driver.findElement(By.id("personal_optGender_2")).click();

		// if id not available

		/*
		 * findElement return a sigle element or exception If multiple elements are
		 * there with same locator it returns first occurance
		 * 
		 * findElements return list of elements that are matching the given locator
		 */
//		driver.findElement(By.name("personal[optGender]")).click();
		List<WebElement> rdbElements = driver.findElements(By.name("personal[optGender]"));
		rdbElements.get(1).click(); // clicks on the 2nd radio

		// if value attribute exist use name and value combination
		// use cssselector or xpath

		// select list item
		WebElement elmMaritalStatus = driver.findElement(By.id("personal_cmbMarital"));
		Select lstMaritalStatus = new Select(elmMaritalStatus);
		lstMaritalStatus.selectByVisibleText("Married");

		// standard
		new Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("American");

		// if application is multi lang
		new Select(driver.findElement(By.id("personal_cmbMarital"))).selectByValue("Other");

		// to select a random
		new Select(driver.findElement(By.id("personal_cmbNation"))).selectByIndex(3);

		String empID = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");

		driver.findElement(By.id("btnSave")).click();

//		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Edit']")));

//		wait.until(new ExpectedCondition<WebElement>() {
//			@Override
//			public WebElement apply(WebDriver driver) {
//				try {
//					int h = driver.findElement(By.xpath("//input[@value='Edit']")).getRect().getHeight();
//					if (h>20) {
//						return driver.findElement(By.xpath("//input[@value='Edit']"));
//					}else {
//						return null;
//					}					
//				} catch (StaleElementReferenceException e) {
//					return null;
//				}
//			}
//		});

//		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//
//		Boolean foo = wait.until(new Function<WebDriver, Boolean>() {
//			public Boolean apply(WebDriver driver) {
//
//				return driver.findElement(By.xpath("//input[@value='Edit']")).isDisplayed();
//			}
//		});

		driver.findElement(By.linkText("Employee List")).click();

//		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultTable")));

		String empIdXpath = "//tr[contains(.,'" + empID + "')]//input";
		// tr[contains(.,'0077')]//input

		WebElement elmEmpId = driver.findElement(By.xpath(empIdXpath));
		if (!elmEmpId.isSelected()) {
			elmEmpId.click();
		}

		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();

//		driver.quit();
	}

	public ExpectedCondition<WebElement> waitForElementHeightToBeMoreThan(By locator,int height) {
		return new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				try {
					int h = driver.findElement(locator).getRect().getHeight();
					if (h>height) {
						return driver.findElement(locator);
					}else {
						return null;
					}					
				} catch (StaleElementReferenceException e) {
					return null;
				}
			}
		};
	}
}










