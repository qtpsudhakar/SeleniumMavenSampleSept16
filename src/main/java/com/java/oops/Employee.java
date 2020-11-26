package com.java.oops;

public class Employee {

	private int age = 30;
	
	//getter
	public int getAge() {
		return this.age;
	}
	
	//setter
	public void setAge(int age) {
		
		if (age>65) {
			System.out.println("Employee Age must be less than or eqal 65");
		}else if (age<18) {
			System.out.println("Employee Age must be greater or eqal 18");
		}else {
			this.age = age;
		}
	}
}
