package com.upskill.assignment4;

public class reverse {

	public static String stringreverse(String input){
	
	
	
	char[] charArray = input.toCharArray();
	
	int l = 0;
	int r = charArray.length-1;
	
	while(l< r) {
		char temp = charArray[l];
		charArray[l]= charArray[r];
		charArray[r]= temp;
		l++;
		r--;
		
	}
	
	 return new String(charArray);
	
	
		
		
				
	}	

	

	public static void main(String[] args) {
		String originalString = "Hello, World!";
        String reversedString = stringreverse(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
		
	}



	

}

