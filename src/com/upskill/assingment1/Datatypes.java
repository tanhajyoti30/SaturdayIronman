package com.upskill.assingment1;

public class Datatypes {

	public static void main(String[] args) {
		
		//question 1
		int h = 5;
		int i = 7;
		int j = 11;
		int d = h+i+j;
		System.out.println("The perimeter of triangle is " +  d + " inches") ;
		
		//question 2
		
		int e = 9;
		int f = 13;
		int g = 2*(e+f);
		System.out.println("The perimeter of rectangle is " +  g + " inches") ;

		
		int a = 9;
		int b = 11;
		
		
		Datatypes obj = new Datatypes();
		
		System.out.println(a + b + obj.multiply(a,b));
		
		System.out.println("The result is  " + (obj.function2()-obj.function1()));
		
		System.out.println(obj.Student1() + " years old" );
		
		obj.Student2();
		
		Student3();
		
		
		
		
	}
	
public int multiply(int a, int b) {
	
	int c = a*b;
	
	return c;
}


public int function1() {
return 30;
}

public int function2() {
	return 50;
}

public String Student1() {
	String name = "Alexa ";
	int age = 10;
	return name +"is "+ age;
}

public void Student2() {
	
	int age = 20;
	String name = "Jack";
	System.out.println(name + " is "+ age + " years old" );
	
}
public static void Student3() {
	
	int age = 30;
	String name = "Hannah";
	System.out.println(name + " is "+ age + " years old" );

}

}
