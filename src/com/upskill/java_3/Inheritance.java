package com.upskill.java_3;

import com.upskill.java_1.MethodType;

public class Inheritance extends MethodType{
	
	 /* The process of obtaining the data members and methods from one class
	  - single inheritance
	  -multiple Inheritance		(Java does not support Multiple Inheritance directly rather through Interfaces)
	  -multilevel inheritance 
	  
	  */

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		
		obj.annualIncomeVoid();

		MethodType.weeklyIncomeStatic();
	}

}
