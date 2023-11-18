package com.upskill.assignment2;

public class Assingnment2_9 {
	//Write a program to swap two string variables (Talen, Tech) and display result on the 
	
	public static void main(String[] args) {
		
		
		swap();

	}
	
	public static void swap() {
		
		String va1 = "Talen";
		String va2 =  "Tech";
		String swap;
		
		swap = va1;
		
		va1 = va2;
		
		va2 = swap;
		
		System.out.println(va1);
		System.out.println(va2);
		
		
	}

}
