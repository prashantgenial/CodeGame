package com.codinggame.examples.easy;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        
        int land_x_prev= 0;
        int land_y_prev = 0 ;
        int landing_start = 0;
        int landing_end = 7000 ;
        int landing_height = 0 ;
        int lastY = 0 ;
        
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            
            if(land_x_prev != 0 && land_y_prev == landY){
                landing_height = lastY;
                landing_start = land_x_prev ;
                landing_end = landX;                
            }
            land_x_prev = landX; 
            land_y_prev = landY;
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if(landing_start<X && X<landing_end){
               int dist = Y-landing_height ;
                if(vSpeed<-35){
                    power = 4;
        		}	
                else{
                    power = 3 ;
        		}
                if(dist>1200 && vSpeed>-45){
                    power = (int)(power*(1-dist/3000));
        		}
            }
            // 2 integers: rotate power. rotate is the desired rotation angle (should be 0 for level 1), power is the desired thrust power (0 to 4).
            System.out.println("0 "+power);
        }
    }
}