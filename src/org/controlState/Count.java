package org.controlState;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0 , n = 0 , i = 0 , j = 0 ;
		System.out.println("Enter a Number");
		n = sc.nextInt();
		a = n ;
		while (a > 0) {
		//	i = a%10;
		//	j = j+ i; -------> Sum of the Digits
			a = a/10;
			i++;
		}
		 System.out.println("Number of Digits Present :"+ i);
	}

}
