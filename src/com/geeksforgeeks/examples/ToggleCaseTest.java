package com.geeksforgeeks.examples;

public class ToggleCaseTest {

	// tOGGLE cASE = swaps CAPS to lower
    // case and lower case to CAPS
    static String toggleCase(char[] a)
    {
        for (int i=0; i<a.length; i++) {
       
            // Bitwise EXOR with 32
            a[i]^=32;
        }
        return new String(a);
    }
    
	public static void main(String[] args) {
		 String str = "CheRrY";
	        System.out.print("Toggle case: ");
	        str = toggleCase(str.toCharArray());
	        System.out.println(str);
	         
	        System.out.print("Original string: ");
	        str = toggleCase(str.toCharArray());
	        System.out.println(str);    

	}

}
