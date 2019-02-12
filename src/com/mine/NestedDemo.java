package com.mine;

//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

public class NestedDemo {

	private int i = 0;
	
	public subclass1 getObj() {
		return new subclass1();
	}
	
	public void setI(int x) {
		this.i = x ;
	}

	private final class subclass1{
		
		public void printI() {
			//accessing outer class variable
			System.out.println("I:"+i);
		}
	}
	
	public static void main(String[] args) {
		NestedDemo nd = new NestedDemo();
		nd.setI(10);
		//accessing nested class methods.
		nd.getObj().printI();
		
	}
}
