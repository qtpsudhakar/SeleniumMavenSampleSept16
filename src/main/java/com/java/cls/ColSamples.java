package com.java.cls;

import java.util.ArrayList;

public class ColSamples {

	public static void main(String[] args) {
		ArrayList<Integer> pLst = getPrimeNumbers(1, 100);
		System.out.println(pLst);
		
		for(int i:pLst) {
			System.out.println(i);
		}
	}

	// write a method to return prime numbers between 1 and 100
	public static ArrayList<Integer> getPrimeNumbers(int rangeStart, int rangeEnd) {

		ArrayList<Integer> lst = new ArrayList();
		
		for (int n = rangeStart; n <= rangeEnd; n++) {

			boolean isPrime = true;

			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break; // get exit from for loop
				}
			}

			if (isPrime && n != 1 && n != 0)
				lst.add(n);
			
		}
		
		return lst;
	}
}
