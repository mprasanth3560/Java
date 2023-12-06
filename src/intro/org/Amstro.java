package intro.org;

import java.util.Scanner;

public class Amstro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0 , j  = 0 , a = 0 , n = 0 ;
		
		System.out.println("Enter the Number"); 
		n = sc.nextInt();
		a = n;
		while (a>0) {
			i = a%10;
			j = (j*10) +i;
			a = a/10;
		}
		if (n == j) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not an Amstrong Number");
		}
	}

}
