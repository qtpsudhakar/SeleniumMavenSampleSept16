package com.java.cls;

public class DemoMaths {
	// instance
	// static
	
	int x = 10;
	int y = 20;
	static int z = 250; 

	public void demoadd() {
		//a method is a reusable code block
		//public defines access
		//void defines return type
		//demoadd is the method name
		System.out.println(x+y);
		System.out.println(z);
		int d = 100;
	}
	
	//non static cannot be accessed from static
	public static void demomul(int a,int b) {
		System.out.println(a*b);
		
		System.out.println(z);
		System.out.println(new DemoMaths().x);
	}
}
