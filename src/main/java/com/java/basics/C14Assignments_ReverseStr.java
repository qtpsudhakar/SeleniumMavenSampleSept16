package com.java.basics;

public class C14Assignments_ReverseStr {

	public static void main(String[] args) {

		String str = "selenium";

		String t = "";
		for (int i = str.length(); i > 0; i--) {
			t = t + str.substring(i - 1, i);
		}
		System.out.println(t);

		String tst = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			tst = tst + str.charAt(i);
		}
		System.out.println(tst);

	}

}
