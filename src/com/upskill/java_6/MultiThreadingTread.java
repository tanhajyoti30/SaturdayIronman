package com.upskill.java_6;

public class MultiThreadingTread  extends Thread{
	public void run() {
		try {
			System.out.println("Thread number # " + Thread.currentThread().getId() + " is running"); 
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception is caught");
		}
	}

}
