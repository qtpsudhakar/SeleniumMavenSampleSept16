package com.java.basics;

import javax.swing.JOptionPane;

public class C8SwitchCase {

	public static void main(String[] args) {

		String stateCode = JOptionPane.showInputDialog("enter statecode");

		switch (stateCode) {

		case "ap":
			System.out.println("amaravathi");
			break;

		case "ts":
			System.out.println("hyderabad");
			break;

		case "ka":
			System.out.println("bangalore");
			break;

		default:
			System.out.println("no statecode found");
			break;
		}

		if (stateCode.equals("ap")) {
			System.out.println("amaravathi");
		} else if (stateCode.equals("ts")) {
			System.out.println("hyderabad");
		} else if (stateCode.equals("ka")) {
			System.out.println("bangalore");
		}
	}

}
