package com.codinggame.examples.easy;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 https://github.com/vadim-job-hg/Codingame/tree/master/EASY
 **/
class Powerofthor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int current_x = initialTX;
        int current_y = initialTY ;
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String move_string = "" ;
            if (current_y <lightY){
	            move_string = "S" ;
	            current_y = current_y + 1 ;
            }
            else if( current_y > lightY){
	            move_string = "N" ;
	            current_y = current_y - 1 ;
            }

            if (current_x < lightX){
	            move_string = move_string + "E" ;
	            current_x = current_x + 1 ;
            }
            else if (current_x > lightX){
	            move_string = move_string + "W" ;
	            current_x = current_x - 1 ;
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(move_string);
        }
    }
}