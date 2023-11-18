package com.upskill.assignment2;
// Write a java program to find the prime number from 1 to 100 and print them.
public class assingment2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printprime(100);


	}
	public static boolean isprime(int n ) {
		int i;
		for ( i = 2; i<n; i++) {
			if(n%i==0) {
				return true;
			}			
		}
		return false;
	}
 public static void printprime(int j) {
	for (int i=2;i<=j;i++) {
		
	 if (isprime(i)==false) {
		 
		System.out.println(i);
	 }
		 
 }
	
 }
 
}
