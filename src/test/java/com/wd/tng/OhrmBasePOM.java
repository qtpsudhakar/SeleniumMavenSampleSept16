package com.wd.tng;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.OhrmBase;
import com.wd.util.DataUtils;
import com.wd.util.DriverFactory;

public class OhrmBasePOM {

	OhrmBase ohrmBase;
	
	@BeforeClass
	@Parameters({"browser"})
	public void openApplication(@Optional("chrome") String brName) throws IOException {
		ohrmBase = new OhrmBase();
		ohrmBase.openApplication(brName);
		System.out.println("Application Opened");
	}

	@AfterClass
	public void closeApplication() {
		ohrmBase.Close();
		System.out.println("Application Closed");
	}

}
