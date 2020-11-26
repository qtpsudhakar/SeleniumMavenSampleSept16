package com.tng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2_AddEmp {

	@Test
	public void openApplication() {
		System.out.println(this.getClass().getSimpleName());
//		Assert.fail("Failed to open application");
		System.out.println("Application Opened");
		
	}

	@Test(dependsOnMethods = "openApplication")
	public void login() {
		Assert.fail();
		System.out.println("Logged in to application");
	}

	@Test(dependsOnMethods = "login",alwaysRun = true)
	public void addEmployee() {
		System.out.println("Employee Added");
	}

	@Test(dependsOnMethods = "addEmployee")
	public void logout() {
		System.out.println("Logged out of application");
	}

	@Test(dependsOnMethods = "logout")
	public void closeApplication() {
		System.out.println("application closed");
	}

}
