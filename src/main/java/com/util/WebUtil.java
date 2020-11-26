package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.OhrmBase;
import com.wd.util.DataUtils;


public class WebUtil extends OhrmBase{

	public void demo() {
		System.out.println("this is demo");
		System.out.println("this is new change");
		System.out.println("this is a change from remote");
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
