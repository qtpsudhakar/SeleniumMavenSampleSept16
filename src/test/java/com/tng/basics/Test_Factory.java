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
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Test_Factory {
	@Factory
	public Object[] createInstances() {
		Object[] result = new Object[2];
		for (int i = 0; i < result.length; i++) {
			result[i] = new Test1();
		}
		return result;
	}

}
