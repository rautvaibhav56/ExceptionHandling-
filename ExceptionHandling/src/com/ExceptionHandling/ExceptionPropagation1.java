package com.ExceptionHandling;

public class ExceptionPropagation1 {

	//Rule 2:By default,Checked Exceptions are not forwarded in calling chain .
	

	public static void methodM() {
		
	//	throw new java.IOException("device error"); //ex	
	}
	
	public static void methodN() {
		
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
		
		/*
		 * ExceptionPropagation1 obj = new ExceptionPropagation1(); obj.methodP();
		 */
		
		ExceptionPropagation1.methodP();
		
		System.out.println("Normal flow");
		
	

	}

}
