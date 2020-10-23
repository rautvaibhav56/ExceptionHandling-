package com.ExceptionHandling;
//MultiCatchBlock=> try block can be followed by one or more catch blocks

public class MultiCatchBlock {
	
	public static void m11() {
		try{    
            int a[]=new int[5];    
            a[5]=30/0;  
           
            System.out.println(a[10]);  //does't execute bcz only one exception can be handled at a time
            
          
           }    
		   catch(ArithmeticException e)  
           {  
         System.out.println("Arithmetic Exception occurs");  
           } 
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
		 
           catch(Exception e)  
              {  
           	//If we didn't provide corresponding exception type then Parent Exception get executed
               System.out.println("Parent Exception occurs"); 
              }    
		 
		 
           System.out.println("rest of the code");   
           System.out.println("===========================");
			

           
           try{    
               String s=null;  
               System.out.println(s.length());  
              }    
              catch(ArithmeticException e)  
                 {  
                  System.out.println("Arithmetic Exception occurs");  
                 }    
              catch(ArrayIndexOutOfBoundsException e)  
                 {  
                  System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                 }    
              catch(Exception e)  
                 {  
                  System.out.println("Parent Exception occurs");// Parent Exception 
                 }             
              System.out.println("rest of the code");    
   }  

		
	

	public static void main(String[] args) {
		
		MultiCatchBlock.m11();  
           
            
            
            
	
	}

}
