package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends OhrmBase{
	
	private By lnk_PIM = By.linkText("PIM");
	
	public void clickOnPIM() {
		getDriver().findElement(lnk_PIM).click();
		System.out.println("clicked on PIM Link");
	}
}
