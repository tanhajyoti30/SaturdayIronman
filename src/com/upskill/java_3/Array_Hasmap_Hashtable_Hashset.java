package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hasmap_Hashtable_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	                             //variable 
		
		int [] ageIronman= new int [] {25,32,37,21,27}; //Array

//array index [0], [1], [2], [3]
		
		System.out.println("student age : " + ageIronman[2]);
		
		System.out.println("Total Student : " + ageIronman.length);
		
		String [] nameIronman = new String [] {"Tanha", "Rahat","Mim", "Madan", "Yosouf"};
		
		System.out.println("student name : " + nameIronman[1]);
		
		System.out.println("Total Student : " + nameIronman.length);
		
		int [] [] ageIronman2D = {{25, 32, 37, 21, 27, 32}, //[0][0],[0][1],[0][2],[0][3],[0][4]
				{ 26, 30, 33, 28}}; //[1][0],[1][1],[1][2],[1][3],[1][4]
		
		System.out.println("Total Student : " + ageIronman2D[0][3]);
		
		//Hashmap store multiple data using key-value pair, implementation of map interface
		
		HashMap<String, Integer>Student = new HashMap<String, Integer>();
		
		Student.put("Yusuf",28);
		Student.put("Abdullah",22);
		Student.put("Madan",32);
		Student.put("Jannatul",24);
		
		System.out.println("Hashmap Student Age :" + Student.get("Madan"));
		
		
		HashMap<String, String>Capital = new HashMap<String, String>();
		
		Capital.put("Bangladesh","Dhaka");
		Capital.put("USA","Washington DC");
		Capital.put("France","Paris");
		Capital.put("England","London");
		
		System.out.println("Hashmap Student Age :" + Capital.get("England"));
		
		//Hashset store unordered collection containing unique value, implementation of map interface
		//no duplicate
		HashSet<String>car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Tesla");
		
		System.out.println("Car :"+ car);
		
		Hashtable<String, String> Region = new Hashtable <String, String>();
		
		Region.put ("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : "+ Region.get("BD"));
	}

}
