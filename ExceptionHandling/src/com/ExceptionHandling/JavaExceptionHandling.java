package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//JavaExceptionHandling
public class JavaExceptionHandling {

	static   private int  i=50;  
	static   private  int j=0;  
	static   private int data1;  

	         
	public static void main(String[] args) {
		//ArithmeticException
		 try{   
			   data1=i/0;  
		      
		   }catch(ArithmeticException e){
			   
			   System.out.println(e);}  
		
		   //NullPointerException 
		 
		 try {
			String s1 =  null;
			System.out.println(s1.length());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		 
		//NumberFormatException  
		 
		 try {
			String s2 = "abc";
			int i = Integer.parseInt(s2);
			 
		} catch (Exception e) {
			System.out.println(e);
		}
		 
		 //ArrayIndexOutOfBoundsException 
		 
		 try {
			int a[]=new int[4];
			a[6]=10;
		} catch (Exception e) {
			System.out.println(e);
		}
		 
		 //FileNotFoundException 
		 
		 PrintWriter pw;  
	        try {  
	            pw = new PrintWriter("jtp.txt"); //may throw exception   
	            pw.println("saved");  
	        }  
	        
 
	 catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  
	        }         
	        System.out.println("===============");
	    System.out.println("File saved successfully");  
	    System.out.println("===============");
	    
	    
		 
		 //resolve the exception in a catch block   **data declared globally
	        try  
	        {  
	        data1=i/j;
	        }  
	            
	        catch(Exception e)  
	        {  
	              
	            System.out.println(i/(j+2));  //resolve exception in catch block
	        }  
		 
	}

}
