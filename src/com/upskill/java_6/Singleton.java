package com.upskill.java_6;

public class Singleton {

	
	private Singleton() {
			
	}
	private static Singleton SingletonObj = new Singleton();

	public static Singleton getInstance() {
	return SingletonObj;
	}
	protected static void demo1() {
		System.out.println("Demo I method for singleton");
	}
	protected static void demo2() {
		System.out.println("Demo II method for singleton");
	}
	protected static void demo3() {
		System.out.println("Demo III method for singleton");
	}

}
