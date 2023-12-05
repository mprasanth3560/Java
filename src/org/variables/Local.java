package org.variables;

public class Local {
	//declared inside the method and access inside the method
	//should be initialized
	public void age() {
		int age = 0 ;
		age = age + 24; 
		System.out.println("My age is : " + age);
		
	}
	
	public static void main(String[] args) {
		Local l = new Local();
		l.age();
	}	
}
