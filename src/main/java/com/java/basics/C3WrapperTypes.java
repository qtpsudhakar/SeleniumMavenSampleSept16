package com.java.basics;

public class C3WrapperTypes {

	public static void main(String[] args) {
		
		String x = "10";
		int y= 20;
		System.out.println(x+y);

		//number + number : addition
		//number + string or string +number or string +string: concatenation
		
		Byte b = 10;

		byte n = Byte.parseByte(x);
		System.out.println(n+y);
		
		String va = "1.1";
		float f = Float.parseFloat(va);
		System.out.println(f);
		
//		Byte
//		Short
//		Integer
//		Long
//		Float
//		Double
//		Character
//		Boolean
		
		//most used types in automation: int,double,boolean,String, Object
	}

}
