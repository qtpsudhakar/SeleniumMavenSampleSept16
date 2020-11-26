package com.java.basics;

public class C9ForLoop {

	public static void main(String[] args) {
		
		//print number 10 for 5 times
		
		for(int i=11;i<=15;i++) {
			//int i=1 : initialization : counter 
			//i<=5 : condition : Where to stop
			//i++ : incrementation = i=i+1 // how to count
			System.out.println(10);
		}
		
		//print numbers from 1 to 10
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}

		//print numbers from 10 to 1
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		//print odd numbers between 10 and 30
		for(int i=11;i<=30;i+=2) {
			System.out.println(i);
		}
		
		//print odd numbers between 10 and 30
		for(int i=10;i<=30;i+=2) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		// print factors of a number
		//20 : 1,2,4,5,10,20
		
		int n=20;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		//print values of an array
		int numbers[] = {10,20,30,40};

		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//print addition of array
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
				
		for(int i :numbers) {//advnced for loop / extended for loop / for each
			System.out.println(i);
		}
		
	}

}









