package com.upskill.assignment3;

public class Bank {
	
	 double getinterest() {
		
		return 0.0;
	}
	
public class Chasebank extends Bank{

	double getinterest() {
		
		return 0.08;
	}
	
}
public class Citybank extends Bank{

	double getinterest() {
		
		return 0.07;
	}
	
}
public class Tdbank extends Bank{

	double getinterest() {
		
		return 0.09;
	}
	
}
	

	public static void main(String[] args) {
		
		Bank obj = new Bank();
		
		Chasebank obj3 = obj.new Chasebank();
		System.out.println(obj3.getinterest());
		
		Citybank obj1 = obj.new Citybank();
		System.out.println(obj1.getinterest());
		
		Tdbank obj2 = obj.new Tdbank();
		System.out.println(obj2.getinterest());

		
		
		
		
	}

}
