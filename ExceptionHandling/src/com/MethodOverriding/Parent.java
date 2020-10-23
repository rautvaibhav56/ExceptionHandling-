package com.MethodOverriding;
//	case A =>If the superclass method does not declare an exception.
import java.io.IOException;

public class Parent {		
			
	void method() {
		System.out.println("In parent");		
	}

}

class Chlid extends Parent {
	//i>subclass overridden method can not declare the checked exception.
	
	//void method()throws IOException {	System.out.println("In child");} => not allowed to child declare an checked exception
	
	
	//ii>subclass overridden method can declare the Unchecked exception.
public 	void  method() throws ArithmeticException{ //Unchecked=> allowed
		System.out.println("In child");
	}
	
	public static void main(String[] args) {
		
		
		  Parent p = new Chlid(); p.method();
		 
	}
}
