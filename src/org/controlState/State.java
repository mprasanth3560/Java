
package org.controlState;

public class State {
	
	public static void main(String[] args) {
		
		String s = "Krishna Prasanth";
		
		//length
		int length = s.length();
		System.out.println("Length: " +length);
		
		//equals
		boolean equals = s.equals("KrishnaPrasanth");
		System.out.println("Equals or Not:" +equals);
		
		//equlsIgnorecase
		boolean equalsIgnoreCase = s.equalsIgnoreCase("krishnaprasant");
		System.out.println("Equalsignorecase:"+equalsIgnoreCase);
		
		//indexof
		int indexOf = s.indexOf("a");
		System.out.println("Index:" +indexOf);
		
		char charAt = s.charAt(4);
		System.out.println("Char of 4:" +charAt);
		
		String[] split = s.split(" ");
		for (String word : split) {
			System.out.println(word);
		}
	}

}
