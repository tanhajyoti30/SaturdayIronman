package com.upskill.java_1;

public class MethodType {
	
	public static int hourlyIncome = 65;
	

	public static void main(String[] args) {
		
	MethodType obj = new MethodType();
	obj.annualIncomeVoid();
		
System.out.println("My monthly Income = " + obj.monthlyIncomeReturn());

weeklyIncomeStatic();
	}
public void annualIncomeVoid() {
	int calculateAnnualIncome = hourlyIncome *2000;
	System.out.println("My Annual Income = "+  calculateAnnualIncome);
}
public int monthlyIncomeReturn() {
	int calculateMonthlyIncome = hourlyIncome *180;
	return calculateMonthlyIncome;
}

public static void weeklyIncomeStatic() {
	int calculateWeeklyIncome = hourlyIncome *40;
	System.out.println("My Weekly Income = " + calculateWeeklyIncome);
}
}
