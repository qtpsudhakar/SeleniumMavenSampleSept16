package com.java.cls;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
		
		//Set stores only unique values
		//Set is not index based
		
		Set<Integer> numbers = new HashSet<>();
//		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(40);
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		
		System.out.println(numbers);
		
		for(int i: numbers)
				System.out.println(i);
		
//		NavigableSet<Integer> desc = numbers.descendingSet();
//		System.out.println(desc);
		
		Object obj[] = numbers.toArray();
		System.out.println(obj[0]);

	}

}
