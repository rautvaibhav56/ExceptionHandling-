package com.ExceptionHandling;
//ThrowKeyword=> throw keyword is used to explicitly throw an exception
public class ThrowKeyword {

	
	   static int validate(int age){ 
		   
		     if(age<18)  
		   
		    	 throw new ArithmeticException("not valid");  
		     
		     else  
		     
		    	 System.out.println("welcome to vote");
		     
			return age;  
		   }  
	   
	   
	public static void main(String[] args) {
		
			validate(21);  
	    
	}

}
