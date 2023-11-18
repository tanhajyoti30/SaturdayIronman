package com.upskill.java_4;

public class Encapsulation {
	
	private String name = "Tanha";
	
	private int ssn = 45680;
	
	private String username = "tanhajyoti";
	
	public void setName(String value) {
		name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSsn(int value) {
		ssn = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public static void main(String[] args) {
		
		 Encapsulation obj = new Encapsulation();
		 
		 obj.setName("Tanha");
		 
		 obj.setSsn(2223);
		 
		 System.out.println(obj.getName());
		
		 System.out.println(obj.getUsername());
		}
	}
