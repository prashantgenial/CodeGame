package com.geeksforgeeks.examples;


/*
 * Permutations of a given string
 * https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
 * Example:
Input:
ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA 
 * */
public class Permutations1 {

public static void permutation(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}

public static void main(String[] args) {
	permutation("abc");
}
}
