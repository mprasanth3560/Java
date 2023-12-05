package org.oops;

public class Method_Overloading {
	
	// In same class,method name are same
	//parameters or arguments will be differ based on data type,count ,order
	public void age(int a) {
		System.out.println("Age :" +a);

	}
	
	public void age(String a) {
		 System.out.println("Age :" +a);

	}
	
public static void main(String[] args) {
		
		Method_Overloading mo = new Method_Overloading();
		mo.age(25);
		mo.age("24");
	}
}