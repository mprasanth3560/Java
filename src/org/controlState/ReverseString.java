package org.controlState;

public class ReverseString {
		
	//Reverse String
	  public static void reverse() {
		 String s = "Welcome";
		 String re = " ";
		 for (int i = s.length()-1; i >=0; i--) {
			re = re+s.charAt(i);
		 }
		 System.out.println("Reverse String :"+re);
	  }
	  
	  
	  
	  //Reverse each word of string
	  
	  public static void reverseword() {
		  String s = "Welcome to The World of MarkAntony";
		  String[] split = s.split(" ");
		  String reversestring = "";
		  for (String x : split) {
			String reverseword = "";
			for (int i = x.length()-1; i >= 0; i--) {
				reverseword = reverseword + x.charAt(i);
			}
			reversestring = reversestring + reverseword + " ";
		}
	  	
	  System.out.println("Original String :" + s);
	  System.out.println("Reverse of eachString :"+ reversestring);
	  }
	  
	  public static void main(String[] args) {
		reverse();
		reverseword();
	}
}
