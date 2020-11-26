package com.java.oops;

public class Google {

	public String userName="admin";
	public String password="admin123";
	
	public void search() {
		System.out.println( "Search for keyword in google");
	}
	
	public Google() {
		// TODO Auto-generated constructor stub
	}
	
	public Google(String uName) {
		// TODO Auto-generated constructor stub
	}
	
	
	public void login() {
		System.out.println("Logged into google with "+userName+" and "+password);
	}
	
	public void login(String userName, String password) {
		System.out.println("Logged into google with "+userName+" and "+password);
	}
}
