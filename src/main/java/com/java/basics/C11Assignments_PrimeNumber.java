package com.java.basics;

public class C11Assignments_PrimeNumber {

	public static void main(String[] args) {
		// Prime Number
		
		int n=2;
		
		boolean isPrime = true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				break; //get exit from for loop
			}
		}
		
		if(isPrime && n!=1 && n!=0) {
			System.out.println(n+" is a prime number");
		}else {
			System.out.println(n+" is not a prime number");
		}

	}

}
