package com.ExceptionHandling;

public class ExceptionPropagation {

	//Rule 1: By default Unchecked Exceptions are forwarded in calling chain i.e propagated.
	
	public static void methodM() {
		
		int data = 50/0; //Arithmetic exception 
	}
	
	public static	void methodN() {
		
		methodM();
	}
	
	public static	void methodP() {
		try {
			methodN();
		} catch (Exception e) {
			
		System.out.println("Exception Handled");
		}
		
	}
	
	
	public static void main(String[] args) {
		ExceptionPropagation.methodP();
		
		/*
		 * ExceptionPropagation obj = new ExceptionPropagation(); 
		 * obj.methodP();
		 */
		
		System.out.println("Rest code ....");
		
		
		
		
		
		
	}

}
