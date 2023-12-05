package org.controlState;

import java.util.Scanner;

public class Amstrong {
	
	public static void Number() {
		
		Scanner sc = new Scanner(System.in);
		int n = 0, a = 0 , i = 0 , j = 0;
		
		System.out.println("Enter a Number");
		n = sc.nextInt();
		a = n ;
		while (a>0) {
			 i = a%10 ;
			 j = j + (i*i*i);	// (j*10) +i ;------>Palindrome Number or not
			 a = a/10 ;
			
		}
		if (n==j) {
			
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		Number();
	}

}
