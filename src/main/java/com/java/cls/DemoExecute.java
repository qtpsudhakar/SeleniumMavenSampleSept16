package com.java.cls;

public class DemoExecute {

	public static void main(String[] args) {
		
		//new classname() will create an instance
		//using it we can reuse instance members of that class
		int x = 10;
		//classname.methodname()
		DemoMaths.demomul(2, 3); //static members can be accessed without instance
		
		
		DemoMaths dm  = new DemoMaths();
		dm.demoadd(); //10,20
		
		dm.x = 100;
		dm.y = 200;
		DemoMaths.z = 300;
		
		DemoMaths dm1  = new DemoMaths();
		dm1.x = 1000;
		dm1.y = 2000;
		System.out.println(DemoMaths.z);
		dm.demoadd();
		dm1.demoadd();
		
		
		dm.demomul(10, 20);		
		
		//object is an instance of the class
		//for each instance we can maintain different values
		Human h1 = new Human();
		h1.name = "sudhakar";
		h1.age = 0.1;
		
		Human h2 = new Human();
		h2.name = "jenny";
		h2.age = 0.1;
		
		//Feature: can be accessed with class name directly
		//Functionality: maintain global memory across all instances
		//Restriction : Static methods cannot access non static
		
		System.out.println(new SampleMath().demoAdd(10, 20));
	}

}











