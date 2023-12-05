package org.controlState;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0 , n = 0 , i = 0 , j = 0 ;
		System.out.println("Enter a Number");
		n = sc.nextInt();
		a = n ;
		while (a > 0) {
			i = a%10 ;
			j = (j*10) + i ;
			a = a/10;
		}
		if (n == j) {
			System.out.println("True");
		}
		else {
			System.out.println("Failed");
		}
	}

}
