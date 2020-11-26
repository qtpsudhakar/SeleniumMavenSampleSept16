package com.java.cls;

public class CreateMail {
	static int v = 10;
	int i = 100;
	public static void main(String[] args) {
		
		System.out.println(v); //with in class
		System.out.println(Gmail.company); //outside
		System.out.println(new CreateMail().i);
		
		Gmail gm1 = new Gmail("admin","asdf");
		gm1.login();
		
//		gm1.userName = "admin";
//		gm1.password = "asdf";
		System.out.println(Gmail.company);
		
		Gmail gm2 = new Gmail();
		
		gm2.login();
		
		gm2.userName = "guest";
		gm2.password = "zxcv";
		System.out.println(Gmail.company);
		gm2.login();
		
		Gmail.company = "Alphabet";
		System.out.println(Gmail.company);
		
		gm1.login();
		gm1.logout();
				
		gm2.login();
		gm2.logout();
	}

	void demo() {
		System.out.println(i);
	}
}
