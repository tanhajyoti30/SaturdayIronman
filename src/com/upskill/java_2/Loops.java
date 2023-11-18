package com.upskill.java_2;

public class Loops {
	//
/*
 
 	Types of Loops
 	1. For Loop
 	2. While Loop
 	3. Do While Loop
 	4. Infinite Loop
 */

	public static void main(String[] args) {
//		practiceforloop();
//		whileloop();
//		dowhileloop();
//		practiceinfiniteloop();	
		
		nestedloop();
	}	
	
public static void practiceforloop() {
	
	int i;
	
	for (i=1; i<=10; i++) {
		System.out.println("For Lopps number = " + i);
	}
}

public static void whileloop() {
	int i = 1;
	while (i <= 10) {
	
		System.out.println("While Loops number =  " + i);
		i++;
	}
	
}

public static void dowhileloop() {
	
	int i = 1;
	
	do {
		System.out.println("Do while loops number = " + i);
		i++;
		
	}
	while(i<=10);

}

public static void practiceinfiniteloop() {
	
	int i;
	
	for (i = 1;  ; i++) {
		System.out.println("Infinite Loops number = " + i);
	}
	
	}
public static void nestedloop() {
	int i;
	int j;
	for (i= 1; i<=5; i++ ) {
		for(j=1; j<=6; j++) {
			int multiplication = i*j;
			System.out.print(multiplication + " | " );
		}
		
		System.out.println(" -> ");
	}
}
}





