package org.variables;

public class Instance {
	
	//declared inside the class and outside the method
	//Initialization not mandatory. It will take default value 0.
	//Access Anywhare in the program
	int age = 24 ;
	public void age() {
		System.out.println("My age is : " +age);
	}
	
	public static void main(String[] args) {
		Instance i = new Instance();
		i.age();
	}
}
