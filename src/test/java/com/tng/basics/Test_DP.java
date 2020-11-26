package com.tng.basics;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_DP {
	@DataProvider
	public String[][] getData() {
		String data[][]=new String[2][2];
		//1st time
		data[0][0] = "selenium";
		data[0][1] = "hq";
		
		//2nd time
		data[1][0] = "web";
		data[1][1] = "driver";
		
		
		return data;
	}
}
