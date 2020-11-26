package com.tng.basics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4_Assertions {

	
	@BeforeClass
	public void openApplication() {
		
//		System.out.println("Application Opened");
		boolean isAppOpened = true;
				
		assertTrue(isAppOpened, "IsApplicationOpened");
		
//		assertEquals("selenium", "webdriver","isValuesEqual");
		
		
//		if (isAppOpened) {
//			System.out.println("Application opened");
//		}else {
//			Assert.fail("Failed to open application");
//		}
//		
//		if ("selenium".equalsIgnoreCase("webdriver")) {
//			System.out.println("Both are equal");
//		}else {
//			Assert.fail("Strings not equal");
//		}
	}
	
	@AfterClass
	public void closeApplication() {
		System.out.println("application closed");
	}


	@BeforeMethod
	public void login() {
		
		SoftAssert sa = new SoftAssert();
		boolean isUserNameExist = true;
		sa.assertTrue(isUserNameExist, "UserName Textbox existance");
		sa.assertTrue(false, "Password Textbox existance");
		sa.assertTrue(false, "Login button existance");		

		System.out.println("Logged in to application");
		
		sa.assertAll();//this will raise error
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logged out of application");
	}
	
	@Test(groups = "smoke")
	public void addEmployee() {
		System.out.println("Employee Added");
	}

	@Test(dependsOnMethods = "addEmployee")
	public void editEmployee() {
		System.out.println("Employee Edited and modified");
	}
	
	@Test(dependsOnMethods = "addEmployee",groups = "smoke")
	public void deleteEmployee() {
		System.out.println("Employee deleted");
	}
	
	


}
