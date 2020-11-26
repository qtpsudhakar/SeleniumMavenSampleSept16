package com.java.basics;

public class C15Assignments_Denominations {

	public static void main(String[] args) {

		int n = 9999;

		int den[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int d : den) {
			System.out.println(n / d + "*" + d);
			n = n % d;
		}

	}

}
