package com.upskill.assignment3;

public class Dingdon {
	

	public static void main(String[] args) {
		Dong();
	
	}
public static void Dong() {
	
	
	for( int i=0;i<=50;i++) {
		if (i%3==0 && i%5==0) {
			System.out.println("Dingdon");
		}
		else if (i%3==0) {
			System.out.println("Ding");
		}
		else if (i%5==0) {
			System.out.println("Dong");
	}
		else {
			System.out.println(i);
		}
		
	
 }
	
}

}