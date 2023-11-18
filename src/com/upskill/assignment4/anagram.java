package com.upskill.assignment4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	
	public static boolean ana() {
		Scanner gram = new Scanner(System.in);
		System.out.println("Enter the first string");
		String string1 = gram.nextLine();
		System.out.println("Enter the second string");
		String string2 = gram.nextLine();
		
		char [] same = string1.toCharArray();
		char [] dup = string2.toCharArray();
		
//		if (string1.length() != string2.length()) {
//			System.out.println("Not anagram");
//			return false;
//		}
		
		Arrays.sort(same);
		Arrays.sort(dup);
		
		for (int i=0; i<string1.length(); i++) {
			if (same[i] != dup[i]) {
				System.out.println("Not anagram");
				return false;
			}
			
		}
		System.out.println("They are anagram");
		return true;
		
	}

	public static void main(String[] args) {
		ana();
		

	}

}
