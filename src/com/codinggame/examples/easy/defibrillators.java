package com.codinggame.examples.easy;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class defibrillators {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();
        
        int N = in.nextInt();
        String current = "";
        double closest = 3.402823e+38;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            //System.err.println(DEFIB.split(";")[5].replace(',','.'));
            double distance = get_distance(Double.parseDouble(LAT.replace(',', '.')), Double.parseDouble(DEFIB.split(";")[5].replace(',', '.')), Double.parseDouble(LON.replace(',', '.')), Double.parseDouble(DEFIB.split(";")[4].replace(',', '.')));
            
            if(distance<closest){
                current = DEFIB ;
                closest = distance ;    
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(current.split(";")[1]);
    }
    
    public static double get_distance(double lat_a,double lat_b,double long_a,double long_b){
        double x = (long_b - long_a)*Math.cos((lat_b + lat_a)/2);
        double y = lat_b - lat_a ;
        return Math.sqrt(x*x +y*y)*6371;
    }
}