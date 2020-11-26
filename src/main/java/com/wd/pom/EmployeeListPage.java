package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPage extends OhrmBase{
	
	private By btn_Add = By.cssSelector("input[value='Add']");
	
	public void clickOnAdd() {
		getDriver().findElement(btn_Add).click();
		System.out.println("clicked on Add Button");
	}
}
