package com.java.basics;

public class C1DatatypesAndVariables {
	
	public static void main(String[] args) {
		
		//byte : 8 bit
		byte x=127;
		
		
		//short : 16 bit
		short s = 32000;
		
		s = x;
				
		//int 32 bit
		int i  = 2140000000;
		
		//long 64 bit
		long mobile = 987654321;
		long crNumber = 4444333322221111L;
		
		//float 32 bit
		float f = 1.1111111111111111111F; //7 floating
		System.out.println(f);
		
		//double 64 bit
		double d = 1.111111111111111111111111111111111; //16 floating
		System.out.println(d);
		
		char c = 'x'; //16 bit
		System.out.println(c);
		
		boolean isThere = false; //8 bit
		
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		
		int c1 = a+b;
		System.out.println(a==b);
		System.out.println(a<b);
		boolean isEqual = a==b;
		System.out.println(isEqual);
		
		final int fn = 10;
//		fn = 100;
		
		System.out.println("this is a latest change");
	}
}
