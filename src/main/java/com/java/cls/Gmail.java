package com.java.cls;

public class Gmail {

	public static void main(String[] args) {
		
	}
	String userName = "demo";
	String password = "demo";
	
	static String company = "Google";
	
	public Gmail() {
		
	}
	public Gmail(String uName, String pwd) {
		this.userName = uName;
		this.password = pwd;
	}
	
	 void login() {
		String userName = "sudhakar";
		System.out.println(userName);
		System.out.println(this.userName);
		System.out.println("Logged in to gmail with "+this.userName+" and "+this.password);
	}
	
	public void logout() {
		System.out.println(userName+" is loggedout of gmail");
	}
}
