package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage extends OhrmBase{
	
	private By txt_FirstName = By.xpath("//input[@name='firstName']");
	private By txt_LastName = By.xpath("//input[@name='lastName']");
	private By btn_Save = By.id("btnSave");
	
	public void enterTextOnFirstName(String value) {
		getDriver().findElement(txt_FirstName).sendKeys(value);
		System.out.println(value+" entered on FirstName");
	}
	
	public void enterTextOnLastName(String value) {
		getDriver().findElement(txt_LastName).sendKeys(value);
		System.out.println(value+" entered on LastName");
	}
	
	public void clickOnSave() {
		getDriver().findElement(btn_Save).click();
		System.out.println("clicked on Save button");
	}
}
