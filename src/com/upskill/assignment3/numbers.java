package com.upskill.assignment3;

public class numbers {

	public static void main(String[] args) {
		

		String sen = "Hello 	 1230 ())56# " ;
		
		int vowel = 0;
		int consonant = 0;
		int tab = 0;
		int number = 0;
		int space = 0;
		int digit = 0;
		
		sen = sen.toLowerCase();
		
		for(int i=0;i<sen.length();i++) {
			
			if (sen.charAt(i)>='a' && sen.charAt(i)<='z') {
				
			if (sen.charAt(i)=='a' || sen.charAt(i)=='e'|| sen.charAt(i)=='i'|| sen.charAt(i)=='o'|| sen.charAt(i)=='u') {
				vowel ++;
			}
			
			else {
				consonant++;
			}
			
		}
			else if (sen.charAt(i)==' ') {
				space ++;
			}
			
			else if (sen.charAt(i)=='\t') {
				tab ++;
			}
			else if (sen.charAt(i)>='0' && sen.charAt(i)<='9') {
				number++;
			}
			else {
				digit ++;
			}
		
		}
		System.out.println("Vowels: " + vowel);
       System.out.println("Consonants: " + consonant);
       System.out.println("Number: " + number);
       System.out.println("Tabs: " + tab);
       System.out.println("Blank Spaces: " + space);
       System.out.println("Digit: " + digit);
	}

}
