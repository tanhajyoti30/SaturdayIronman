package com.upskill.java_6;

public class MultiThreading {
	
	/*Multitreading is a Java feature that allows concurrent execution of two or more parts of a program
	 Threads can be created by using two mechanisms
	 
	 1. Extending the Thred class
	 2. Implementing the Runnable Interface
	*/
	public static void main(String[] args ) {
		int n = 6;
		for (int i =0; i < n; i++) {
			MultiThreadingTread  obj = new MultiThreadingTread ();
			obj.start();
			
			Thread obj2 = new Thread(new MultiThreadingRunable());
			obj2.start();
		}
		
	}

}
