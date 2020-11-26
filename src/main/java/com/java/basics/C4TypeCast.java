package com.java.basics;

public class C4TypeCast {

	public static void main(String[] args) {
		
		byte b = 20;// 8 bit
		int i= 100; // 32 bit
		
		//memory, value
			
		short s = b; // 16 bit //implicit cast
		
		System.out.println(s);
		
		s = (short) i; //explicit cast
		System.out.println(s);
		
		int si = 1281;
		byte b1 = (byte) si;
		System.out.println(b1);
		
	}

}
