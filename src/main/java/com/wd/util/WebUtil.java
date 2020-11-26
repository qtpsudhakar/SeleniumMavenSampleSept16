package com.wd.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.pom.OhrmBase;

public class WebUtil extends OhrmBase{

	public static void selectListItem(By locator,String itemName) {
		
		WebElement lst =getDriver().findElement(locator);
		try {
			new Select(lst).selectByVisibleText(itemName);
		}catch(Exception e) {
			new Select(lst).selectByIndex(1);
		}
	}
	
	public static boolean isElementExist(By locator) {
		try {
			getDriver().findElement(locator);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
public static String getScreen() {
		
		TakesScreenshot scr = (TakesScreenshot) getDriver();
		File srcFile = scr.getScreenshotAs(OutputType.FILE);
		
		String flPath = "src\\..\\Reports\\ErrImg\\demo"+DataUtils.getUniqueId()+".png";
		File dstFile = new File(flPath);
		
		try {
			FileUtils.copyFile(srcFile, dstFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dstFile.getAbsolutePath();
	}
	
	public static String getScreen64() {
		
		TakesScreenshot scr = (TakesScreenshot) getDriver();
		
		return scr.getScreenshotAs(OutputType.BASE64);
	}
}
