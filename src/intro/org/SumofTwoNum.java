package intro.org;

import java.util.Scanner;

public class SumofTwoNum {
	Scanner sc = new Scanner(System.in);
	
		public void Sum() {
		System.out.println("Enter the Number");
		int a= sc.nextInt();
		
		System.out.println("Enter the Number");
		int b =sc.nextInt();
		
		int c= a + b ;
		System.out.println(c);
	}
		public static void main(String[] args) {
			SumofTwoNum st = new SumofTwoNum();
			st.Sum();
			
		}
}
