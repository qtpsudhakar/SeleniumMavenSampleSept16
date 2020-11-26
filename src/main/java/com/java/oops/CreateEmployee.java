package com.java.oops;

public class CreateEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println(emp1.getAge());
		emp1.setAge(40);
		
		Employee emp2 = new Employee();
		
		emp2.setAge(66);
		System.out.println(emp2.getAge());
		emp2.setAge(17);
		System.out.println(emp2.getAge());
		emp2.setAge(25);
		System.out.println(emp2.getAge());
		System.out.println(emp1.getAge());		
	}

}
