package com.upskill.assignment4;


	public class DuplicateCounter {
	    public static int countDuplicates(int[] arr) {
	        int duplicateCount = 0;

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    duplicateCount++;
	                    break; // Break out of the inner loop once a duplicate is found
	                }
	            }
	        }

	        return duplicateCount;
	    }

	    public static void main(String[] args) {
	        int[] myArray = {1, 2, 2, 3, 4, 4, 5};
	        int result = countDuplicates(myArray);
	        System.out.println("Number of duplicate values: " + result);
	    }
	}


