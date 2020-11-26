package com.java.cls;

public class SampleMath {
	//Access Modifiers
	
	//private : can be accessed with in class
	//public : can be accessed any where
	//default : can be accessed only with in package
	//protected : can be accessed with in package and in sub classes of any package
	protected int x;
	
	public static void main(String[] args) {
		SampleMath sm = new SampleMath();
		int r = sm.demoAdd(2, 3);
		System.out.println(r);

		System.out.println(sm.isOdd(10));
		System.out.println(sm.isOdd(15));
		System.out.println(sm.isOdd(21));
		
		int num[] = {10,20,30,40,50,60};
		System.out.println(sm.isValueExist(num, 40));
		
		System.out.println(sm.addNumbers(num));
		System.out.println(sm.addNumbers(1,2,3,4));
		int v [] = {1,2,3,4};
		System.out.println(sm.addNumbers1(v));
	}

	public SampleMath() {
		// constructor will be with same class name and without return type
		// it is optional
		//pre condition
		System.out.println("constructor Executed");
		x = 100;
	}
	
	 protected int demoAdd(int x, int y) {		 
		return x + y;
	}

	public boolean isOdd(int n) {
		if (n % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isValueExist(int arr[], int exp) {
		
		for (int i : arr) {
			if (i == exp) {
				return true;
			}
		}
		return false;
	}

	public String[] getUserData() {
		String udata[] = new String[3];
		udata[0] = "admin";
		udata[1] = "password";
		udata[2] = "test";
		
		return udata;
	}
	
	public int addNumbers1(int[] numbers) { //rest parameter
		//... parameter accept any number of values or an array
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		return sum;		
	}
	
	public int addNumbers(int... numbers) { //rest parameter
		//... parameter accept any number of values or an array
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		return sum;		
	}
	
	//are we going use it
	//is selenium used it
}
















