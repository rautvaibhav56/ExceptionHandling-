package com.MethodOverriding;
//B. If super class method declares an exception

public class Parent2 {
	//i>In sub class we can not declare parent exception.
	
	void method1()throws ArithmeticException {
		System.out.println("In parent");
	}

	//iii>sub class have no exception

}
class Child2 extends Parent2{
	//parent exception
	// void method1()throws Exception {System.out.println("In child")};=>not allowed
	
	
	//ii> In sub class We can declare same exception as parent 
	void method1()throws ArithmeticException {System.out.println("In child.....");}
	
	public static void main(String[] args) {

		Parent2 p2 = new Child2();
		p2.method1();
		
	}	

	
}