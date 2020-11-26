package com.java.basics;

import com.java.cls.Gmail;
import com.java.cls.SampleMath;

public class Demo extends SampleMath{

	public static void main(String[] args) {

		SampleMath sm = new SampleMath();
//		System.out.println(sm.demoAdd(10, 20));
		System.out.println(new Demo().demoAdd(10, 20));
		
		System.out.println(new Demo().x);
		
		System.out.println("thi is my rnd branch");
	}

}
