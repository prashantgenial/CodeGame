package com.codinggame.examples.easy;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Temprature {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int closestIndex = -1 ;
        int diff = Integer.MAX_VALUE ;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            int abs = Math.abs(t);
            arr[i] = t ;
            if(abs < diff){
                closestIndex = i ;
                diff = abs ;
            }
            else if( abs == diff && arr[i] > 0 && arr[closestIndex] < 0){
                closestIndex = i ;    
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if(closestIndex == -1)
            System.out.println(0);
        else
            System.out.println(arr[closestIndex]);
    }
}