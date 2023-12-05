package org.controlState;

public class Newone {
	
	public static void main(String[] args) {
		//Normal 3*3
//		for (int i = 1; i <= 3; i++) {
//			
//			for (int j = 1; j <= 3; j++) {
//				
//				System.out.print(i+" ");
//			}
//			
//			System.out.println();
//		}
		
		//Triangle---------->Column Depends on Row
//		for (int i = 1; i <= 3; i++) {
//			
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j+ " ");
//			}
//			System.out.println();
//		}
		
	// Rectangle-----> Row Depends on Column	
	for (int i = 3; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print( " *");
			}
			System.out.println();
		}
	}

}
