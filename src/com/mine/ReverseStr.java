package com.mine;

public class ReverseStr {
	public static void main(String[] args) {
		//String a = "java" ;
		String a = "hooh" ;
		StringBuilder sb = new StringBuilder(a);
		String r = sb.reverse().toString();
		if(r.equalsIgnoreCase(a)) {
			System.out.println("yes");
		}
		else
			System.out.println("NO");
	}
}
