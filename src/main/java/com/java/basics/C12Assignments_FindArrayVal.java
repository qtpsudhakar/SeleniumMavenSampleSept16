package com.java.basics;

public class C12Assignments_FindArrayVal {

	public static void main(String[] args) {
		
		int numbers[] = {10,20,30,40,50,60};
		
		boolean isValueExist = false;
		for(int i:numbers) {
			if(i==45) {
				isValueExist = true;
				break;
			}
		}
		if(isValueExist) {
			System.out.println("value exist");
		}else {
			System.out.println("value is not exist");
		}

	}

}
