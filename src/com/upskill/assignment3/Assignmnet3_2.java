package com.upskill.assignment3;



public class Assignmnet3_2 {
String name;
int age;
String add;
int salary;

public  Assignmnet3_2(String name, int age, String add,  int salary) {
	this.name = name;
	this.age = age;
	this.add = add;
	this.salary = salary;
}


	public static void main(String[] args) {
		Assignmnet3_2 obj = new Assignmnet3_2("Sara" , 30, " 666 3rd Ave, NY, NY ", 234560);
		System.out.println ("The name of the first employee is "+ obj.name + ". she is " +obj.age + " Her home address is"+ obj.add + "Her salary  is "+obj.salary +" dollar");
		
		Assignmnet3_2 obj1 = new Assignmnet3_2("Zara" , 20, " 70 2nd Ave, NY, NY ", 134542);
		System.out.println ("The name of the second employee is "+ obj1.name + ". He is " +obj1.age + " Her home address is"+ obj1.add + "Her salary  is "+obj1.salary +" dollar");
		
		Assignmnet3_2 obj2 = new Assignmnet3_2("Nora" , 25, " 60 Hillside Ave, NY, NY ", 122542);
		System.out.println ("The name of the third employee is "+ obj2.name + ". He is " +obj2.age + " Her home address is"+ obj2.add + "Her salary  is "+obj2.salary +" dollar");
		
		Assignmnet3_2 obj3 = new Assignmnet3_2("Zora" , 24, " 60 4th Ave, NY, NY ", 178542);
		System.out.println ("The name of the fourth employee is "+ obj3.name + ". He is " +obj3.age + " Her home address is"+ obj3.add + "Her salary  is "+obj3.salary +" dollar");
		
		Assignmnet3_2 obj4 = new Assignmnet3_2("Maha" , 27, " 50 5th Ave, NY, NY ", 398542);
		System.out.println ("The name of the fifth employee is "+ obj4.name + ". He is " +obj4.age + " Her home address is"+ obj4.add + "Her salary  is "+obj4.salary +" dollar");
	}
	

}