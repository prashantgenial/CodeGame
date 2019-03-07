package com.mine;

/**
 * 
 * @author Prashant Gupta
 *
 */
public class App {

	private App(){
		System.out.println("\nInside no Arg constructor");
		
	}	//1.If class Contains only Static Methods then make class constructor private
	
	public App(int i){}
	
	{
		System.out.println("\nInside Arg constructor");
	}
	
	{
		System.out.println("\nInitializer Block...this will be inserted in all constructor in the beginning...");
	}
	
	public static void main(String[] args) {
		
		App app = new App();
		
		//2. Calling static method Using Class Name which is recommended approach
		System.out.println("Hello "+ App.getName());
		
		//3. Calling static method Using Class Object
		System.out.println("Using Class Object "+app.getName());
		
		//instanceMethod();	//4. gives error as static method can not call instance method
		app.instanceMethod();	//4.1 calling instance method using class object is valid.
		
		A a = new A();
	}

	public static String getName(){
		return "Prashant Gupta" ;
	}
	
	//5. calling static method by instance method but reverse not possible
	public void instanceMethod(){
		
		System.out.println("\nInstance Method calling static method:"+getName());		
		
	}
}


class A{
	
	A(){
		System.out.println("\nCalling from class A");
		//If class Contains only Static Methods then make class constructor private 
		//App app = new App();	
		//Using Class Object
		//System.out.println("From Class A using class Object "+app.getName());
		
		//Using Class Name		
		System.out.println("Hello "+ App.getName());
	}
	
}