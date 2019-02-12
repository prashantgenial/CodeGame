package com.geeksforgeeks.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * How to get frequency of each word in a paragraph of strings?
 * @author MHQG9765
 *
 */
public class WordFrequency {
	 public static void main(String args[]){
	        String paragraph= "ab bc ab bc abbbb bc ab cd ef bc bc ";
	         
	        String eachWord[]=paragraph.split(" ");
	         
	        List<String> listEachWord = new ArrayList(Arrays.asList(eachWord));
	        Map<String,Integer> numeach = new HashMap<>();
	          
	        for(int i=0;i<eachWord.length;i++){
	         numeach.put(eachWord[i],Collections.frequency(listEachWord,eachWord[i]));  
	        }
	          
	          
	        System.out.println(numeach);
	    }
}
