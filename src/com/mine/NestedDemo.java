package com.mine;

public class NestedDemo {

	int i = 0;
	
	public subclass1 getObj() {
		return new subclass1();
	}

	public class subclass1{
		
		public void printI() {
			System.out.println("I:"+i);
		}
	}
	
	public static void main(String[] args) {
		NestedDemo nd = new NestedDemo();
		
		//accessing nested class methods.
		nd.getObj().printI();
		
	}
}
