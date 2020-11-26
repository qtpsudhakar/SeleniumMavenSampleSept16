package com.java.basics;

import javax.swing.JOptionPane;


public class C13WorkingWithString {

	public static void main(String[] args) {
		
		//comparision
		//verify sub string
		//extract substring
		//verify data standards
		//programming logics
		
//		String strAct = JOptionPane.showInputDialog("enter msg");
		String strAct = "welcome jenny, please update details";
		String strExp = "welcome sudhakar";
		
		//compare strings
		if(strAct.trim().equalsIgnoreCase(strExp)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are different");
		}

		if(strAct.trim().compareToIgnoreCase(strExp)==0) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are different");
		}
		
//		System.out.println(strAct.trim().compareToIgnoreCase(strExp));
		
		//verify string exist
		
		String vStr = "sudhakar";
		int position = strAct.indexOf(vStr);
		if(position>=0) {
			System.out.println("Sub string exist at position "+ position);
		}else {
			System.out.println("Sub string not exist");
		}
		
		if(strAct.contains(vStr)) {
			System.out.println("Sub string exist ");
		}else {
			System.out.println("Sub string not exist");
		}
		
		//extract sub string
		System.out.println(strAct.substring(8,13));
		System.out.println(strAct.substring(8,strAct.length()-23));
		
		System.out.println(strAct.split(" ")[1]);
		System.out.println(strAct.indexOf(","));
		System.out.println(strAct.substring(8,strAct.indexOf(",")));
		
		//verify data standards
		// pan number
		// mobile number
		
		//regular expressions
		
		// . : any single character
		// * : preceding character any number of times
		// ab. = abc, ab1
		// ab* = a,ab,abbbbbbbbbbbbbbbbb
		// ab.* = abjdskjfdskjfkj
		// ab[0-9] = ab0, ab1, ab2....ab9
		// ab[a-z] = aba, abb,abc...abz
		// [a-z]{2} = any two characters between a to z : hi, aa, so
		// [a-z]{2,5} = minimum 2 characters max 5 characters, food, hello
		
		//pan number : ABCDE1234Z : 5c, 4n, 1c
		// [A-Z]{5}[0-9]{4}[A-Z]
		
		//ABCDE1234Z
		//ABCD1234ZA
		//ABCDE12345
		
		String strPan = "ABCDE1234z";
		if(strPan.matches("[A-Z a-z]{5}[0-9]{4}[A-Z a-z]")) {
			System.out.println("valid pan number");
		}else {
			System.out.println("invalid pan");
		}
		
		//mobile numbers: 6,7,8,9
		// [6-9][0-9]{9}
		
		//reverse given string
		//selenium : muineles
		
	}

}









