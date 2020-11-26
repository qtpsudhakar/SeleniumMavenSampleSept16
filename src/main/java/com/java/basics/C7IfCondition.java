package com.java.basics;

import javax.swing.JOptionPane;

public class C7IfCondition {

	public static void main(String[] args) {
		// find a number is odd

		// + addition
		// - subtraction
		// * mul
		// / devide
		// % reminder
		// == condition equal
		// > greater than
		// < less than
		// >= greater than or equal to
		// <= less than or equal to
				

		String val = JOptionPane.showInputDialog("enter value");

		int n = Integer.parseInt(val); // assigning a value
//		boolean isOdd = n%2==1; //check logic

		if (n % 2 == 1) { // verify output
			// execute this
			System.out.println(n + " is an odd number");
		} else {
			// execute this
			System.out.println(n + " is an even number");
		}

		//find which is bigger
		int x = 20;
		int y = 20;
		
		if (x>y) {
			System.out.println("x is bigger");
		} else if(y>x){
			System.out.println("y is bigger");
		}else {
			System.out.println("both are equal");
		}
		
		
	}

}
