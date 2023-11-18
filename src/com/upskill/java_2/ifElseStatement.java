package com.upskill.java_2;

public class ifElseStatement {

	public static void main(String[] args) {
		
		int age = 0;
		
		if (age <= 13) {
			if (age <= 0) {
				System.out.println("Invalid");
			}
			
			else {
				
			System.out.println("You are a child");
			}
		}
		else if(age > 13 && age < 18) {
			System.out.println("You are a teenager");
		}
		
		else if ( age > 60) {
			if(age >= 100) {
				System.out.println("You are a Champion");
			}
			else {
				System.out.println("You are an Senior");
			}
		}
		else {
			System.out.println("You are an adult");
		}
	}

}
