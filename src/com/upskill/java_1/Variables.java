package com.upskill.java_1;

public class Variables {
	
	// Variables in Java
	
	
	
	//method parameter - variables used as method parameter
	
	public String country = "USA"; 	//Instance or global variable
	
	public static String region = "North America"; 	//local variable - variable declared in methods
	
	public static void main(String[] args) {
		
		String city = "New York";
		
		String police = "NYPD";
		
		System.out.println(region);
		
		nj("essex"); 
		pa("Bensalem");
		
		Variables obj = new Variables();
		System.out.println(obj.country);
	
		
	}
	public static void nj(String county) {
		
		String city = "Bloomflied"; 	//Static variable - variables belong to class and don't required creating object
		
		String police = "BPD";
		
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		
		
		
		
	}
	public static void pa(String county) {
		
		String city = "Phili";
		
		String police = "PPD";
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		
	}
	
}
