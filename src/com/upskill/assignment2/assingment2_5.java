package com.upskill.assignment2;
//Write a program in Java to display the multiplication table of (eight)8.
public class assingment2_5 {

	public static void main(String[] args) {
		multipleof8();

	}

	
public static void multipleof8() {
	int i = 8;
	
	while (i<=8) {
		
		for( int j = 1; j<=10; j++) {
			
			System.out.print(" | "+ i*j);
		}
		System.out.println("  ");
		break;
		
	
	}

}
}
