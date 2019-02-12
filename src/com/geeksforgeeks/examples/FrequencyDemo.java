package com.geeksforgeeks.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.Collections.frequency() method is present in java.util.Collections class. It is used to get the frequency of a element present in the specified list of Collection. More formally, it returns the number of elements e in the collection.
 * @author MHQG9765
 * c - the collection in which to determine the frequency of o
o - the object whose frequency is to be determined
Returns :
Returns the number of elements in the specified collection 
equal to the specified object.
Throws:
NullPointerException - if c is null
https://www.geeksforgeeks.org/java-util-collections-frequency-java-examples/
 *
 */
public class FrequencyDemo 
{ 
    public static void main(String[] args) 
    { 
        // Let us create a list of strings 
        List<String>  mylist = new ArrayList<String>(); 
        mylist.add("practice"); 
        mylist.add("code"); 
        mylist.add("code"); 
        mylist.add("quiz"); 
        mylist.add("prashant"); 
   
        // Here we are using frequency() method 
        // to get  frequency of element "code" 
        int freq = Collections.frequency(mylist, "code"); 
   
        System.out.println(freq); 
    } 
} 
