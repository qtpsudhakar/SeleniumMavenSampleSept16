package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeListPage extends OhrmBase{
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="input[value='Add']")
	private WebElement btnAdd;
	
	@FindBy(css ="input[id='select']")
	private WebElement lstPosition;
	
	public void clickOnAdd() {
		btnAdd.click();
		System.out.println("clicked on Add Button");
	}
	
	public void selectListItem(String lstItem) {
		new Select(lstPosition).selectByVisibleText(lstItem);
		System.out.println(lstItem+" selected");		
	}
	
	public void selectListItem(int lstItemIndex) {
		new Select(lstPosition).selectByIndex(lstItemIndex);
		System.out.println("item selected by index "+lstItemIndex);		
	}
	
}
