package com.tng.basics;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeGroups(groups = "smoke")
	public void beforeSmoke() {
		
		System.out.println("smoke group pre condition executed");
	}
	
	@AfterGroups(groups = "smoke")
	public void afterSmoke() {
		System.out.println("smoke group post condition executed");
	}
	
	
	@Test(priority = 1)
	public void m2_test() {
		Assert.fail("Failed to open application");
		System.out.println("hello iam test method 2");
	}

	@Test(priority = 1)
	public void m1_test() {

		System.out.println("hello iam test method 1");
	}

	@Test(groups = "smoke")
	public void m3() {

		System.out.println("hello iam test method 3");
	}
}
