package com.java.basics;

import javax.swing.JOptionPane;

public class C10WhileDo {

	public static void main(String[] args) {
		
		int n=10;
		
		while(n<10) { // 0 or more times
			System.out.println(n);
			n++;
		}
		
		do { // 1 or more times
			System.out.println(n);
		}while(n<10);
		
		
		boolean isMsgExist = false;
		
		while(!isMsgExist) {
			System.out.println("message is not displayed");
			String vf = JOptionPane.showInputDialog("verify msg exist");
			isMsgExist = Boolean.parseBoolean(vf);
		}

		//find factorial of 5
		// 5*4*3*2*1
		
		n=5;
		int res = 1;
		while(n>1) {
			res = res*n;			
			n--;
		}
		
		System.out.println(res);
		
		// write a program to find given number is prime number
		// write a program to verify a value exist in an array
		
		// {10,20,30,40,50}
		
	}

}
