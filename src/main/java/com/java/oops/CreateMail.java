package com.java.oops;

public class CreateMail {

	public static void main(String[] args) {
		
		Gmail gm1 = new Gmail(); //calls methods of same class, if not exist call parent methods
		gm1.userName = "guest";
		gm1.password = "guest123";
		gm1.login(); //gmail login overrides google login 
		gm1.search();
		gm1.login("sudhakar", "qtp");
		
		//className v = new classname();
		//interface v = new classname();
		//parentclass v = new childclass();
		
		Google google  = new Gmail(); //calls methods of google class, if any methods overrides by child clss that will be called
		google.login(); //gmail login overrides google login
		google.search();
		
		Google g1  = new Google(); //calls methods of same class
		g1.login();
		g1.search();
	}

}
