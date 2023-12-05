package org.oops;

public class Method_overriding extends School {
	
	//Class names are different
	//method name and parameters will be same
	@Override
	public void name() {
		super.name();
		System.out.println("Prasanth");
	}
	
	@Override 
		public void id() {
		super.id();
		
	}
	
	public static void main(String[] args) {
		
		Method_overriding mor = new Method_overriding();
		mor.name();
		mor.id();
		mor.section();
	}
}	

