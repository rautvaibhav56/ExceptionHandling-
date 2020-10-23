package com.ExceptionHandling;
//Finally=>Java finally block is always executed whether exception is handled or not
public class Finally {
	
	static int data=20/5; 
	
	public static void n() {
//java finally example where exception doesn't occur
				try{  
					   System.out.println(data); 
					   
					  }  
					  catch(NullPointerException e){
						  System.out.println(e);}
				
					  finally{
						  System.out.println("In finaly block");}  
				
					  System.out.println("rest of the code");  
				System.out.println("=============================");
				
// java finally example where exception occurs and handled
				
						  try{  
							   int data=20/0;  
							   
							   System.out.println(data);  
							  }  
							  catch(ArithmeticException e){
								  System.out.println(e);
								  }  
							  finally{
								  System.out.println("finally block ");
								  }  
							  System.out.println("rest of the code...");  

			}

		
	
	
	public static void main(String[] args) {	
		Finally.n();
		

}}
