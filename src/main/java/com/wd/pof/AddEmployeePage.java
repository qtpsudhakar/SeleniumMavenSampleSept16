package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends OhrmBase{
	
	public AddEmployeePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement txtFirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement txtLastName;
	
	@FindBy(id="btnSave")
	private WebElement btnSave ;
	
	public void enterTextOnFirstName(String value) {
		txtFirstName.sendKeys(value);
		System.out.println(value+" entered on FirstName");
	}
	
	public void enterTextOnLastName(String value) {
		txtLastName.sendKeys(value);
		System.out.println(value+" entered on LastName");
	}
	
	public void clickOnSave() {
		btnSave.click();
		System.out.println("clicked on Save button");
	}
}
