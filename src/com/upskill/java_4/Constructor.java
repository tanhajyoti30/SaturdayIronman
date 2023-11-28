package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	String StudentName;
	int Studentage;
	String Address;
	int salary;
	
	public Constructor(String name) {
		StudentName = name;
	}
	public Constructor( int age) {
		Studentage = age;
	}
	
	public Constructor( String name, int age) {
		Studentage = age;
		StudentName = name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor("hello");
		System.out.println(obj.StudentName);
		Constructor obj2 = new Constructor(30);
		System.out.println(obj2.Studentage);
		
		Constructor obj3 = new Constructor("Tanha ",20);
		System.out.println(obj3.StudentName + obj3.Studentage);
		System.out.println(obj3.Studentage);
		
		
		
	}

}
