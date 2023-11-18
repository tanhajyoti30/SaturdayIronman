package com.upskill.assignment4;

public class leapyear {
	public static boolean isLeapYear(int year) {
        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400, so a leap year
                } else {
                    return false; // Divisible by 100 but not 400, not a leap year
                }
            } else {
                return true; // Divisible by 4 but not 100, so a leap year
            }
        } else {
            return false; // Not divisible by 4, not a leap year
        }
    }

    public static void main(String[] args) {
        int year = 1700;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
	

    }
    }
