package com.mine;

public class ReverseStr {
	public static void main(String[] args) {
		String a = "java" ;
		StringBuilder sb = new StringBuilder(a);
		String r = sb.reverse().toString();
		if(r.equalsIgnoreCase(a)) {
			System.out.println("yes");
		}
	}
}
