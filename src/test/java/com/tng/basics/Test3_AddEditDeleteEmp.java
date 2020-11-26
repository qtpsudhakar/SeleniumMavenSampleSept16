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
import org.testng.annotations.Test;

public class Test3_AddEditDeleteEmp {

	@BeforeSuite
	public void configReport() {
		System.out.println("Suite Report Configured");
	}
	
	@AfterSuite
	public void closeReport() {
		System.out.println("Suite Report Closed");
	}
	
	@BeforeTest
	public void cleanUp() {
		System.out.println("log cleaned");
	}
	
	@AfterTest
	public void cleanUpT() {
		System.out.println("log cleaned");
	}
	
	@BeforeClass
	public void openApplication() {
//		Assert.fail("Failed to open application");
		System.out.println("Application Opened");
		
	}
	
	@AfterClass
	public void closeApplication() {
		System.out.println("application closed");
	}


	@BeforeMethod
	public void login() {

		System.out.println("Logged in to application");
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
