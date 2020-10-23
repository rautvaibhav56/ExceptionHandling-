package com.ExceptionHandling;
//Nested try=>The try block within a try block
public class NestedTry {
	
	public static void method1() {
		
		
	try{  
			
		    try{  
		    	
		     System.out.println("division");  
		     
		     int b =39/0;  
		     
		    }catch(ArithmeticException e){
		    	System.out.println(e);}  
		   
		    try{  
		    	
		    int a[]=new int[5];  
		    
		    a[11]=4;  
		    
		    }catch(ArrayIndexOutOfBoundsException e){
		    	
		    	System.out.println(e);}  
		     
		    System.out.println("other statement");  
		    
		  }catch(Exception e){
			  
			  System.out.println("handeled");}  
		  
		  System.out.println("normal flow..");  
	
	}

	public static void main(String[] args) {
		NestedTry.method1();
	}

}
