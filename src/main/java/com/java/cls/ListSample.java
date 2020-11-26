package com.java.cls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		
		//generic
		//premitive types not accepted 
//		ArrayList<Integer> lst = new ArrayList();
		List<Integer> lst = new LinkedList();
		lst.add(10);
		lst.add(20);
		
		lst.add(0, 30);
				
		//ArrayList accepts duplicate values
		//ArrayList accepts values dynamically
		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		for(int i:lst) {
			System.out.println(i);
		}
	}

}
