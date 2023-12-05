package org.variables;

public class Stati {
	
	// declared inside the class and outside the method
	// Initialization not mandatory. It will take default value 0.
	// Access Anywhare in the program
	static int age = 24;
	int a = 1000;

	public static void age() {
		System.out.println("My age is : " + age);

	}

	public static void main(String[] args) {
		Stati s = new Stati();
		age();
		System.out.println(s.a);

	}

}
