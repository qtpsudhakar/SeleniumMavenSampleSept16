package com.java.oops;

public class Gmail extends Google{

	public Gmail() {
		System.out.println("Gmail opened");
	}
	public Gmail(String brName) {
		System.out.println("Gmail opened in "+brName);
	}
	public void login() {
		System.out.println("Logged into gmail with "+userName+" and "+password);
	}
}
