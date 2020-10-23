package com.ExceptionHandling;
//Final =>It is an keyword

//1.final class can't be inherited
//2.final method can't be overridden
//3.final variable value can't be changed
//Finally => it is an block , used to  place imp code 
//Finalize  = > It is a method ,used to perform clean up processing just before object is garbage collected.

public class FinalFinallyFinalize {

	static final int a = 10;// value can't be modified

	public void finalize() {

		System.out.println("In finalize method");
	}

	public static void m() {

		try {
			int b = a / 0;

		} catch (Exception e) {
			System.out.println("Arithmetic exception ");

		} finally {
			System.out.println("======================");
			System.out.println("In finally block");

		}

	}

	public static void main(String[] args) {

		FinalFinallyFinalize.m();
		
		  
		  FinalFinallyFinalize f = new FinalFinallyFinalize();
		  
		  f=null;
		  

		 
		System.gc();

	}

}
