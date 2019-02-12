package com.codinggame.examples.hard;

import java.util.*;
 
class Benderthemoneymachine {
 
    private static int nbRooms;
    private static Room[] rooms;
 
    /** This class represents a room, which is characterized by 
     * unique id in [0, nbRooms-1], the sum of money in the room 
     * and the ids of the 2 next rooms (nbRoom for an exit) */
    class Room {
        int id;
        int sum;
        int[] next; 
        
        /** Initializes a new room with the 4 fields of line*/
        public Room(String line) {
            String[] fields = line.split(" ");
            id = Integer.parseInt(fields[0]);
            sum = Integer.parseInt(fields[1]);
            next = new int[2];
            next[0] = (fields[2].equals("E")) ? nbRooms : Integer.parseInt(fields[2]);
            next[1] = (fields[3].equals("E")) ? nbRooms : Integer.parseInt(fields[3]);
        }
    }
 
    public static void main(String args[]) {
 
        // Reads input and initializes the array of rooms
        Scanner in = new Scanner(System.in);        
        nbRooms = in.nextInt();
        in.nextLine();
        rooms = new Room[nbRooms];
        //uncomment below lines
      /*  for (int i = 0; i < nbRooms; i++)
            rooms[i] = new Room(in.nextLine());*/
 
        /* The array money contains the amount of money pocketted on the
           "best" path found yet (index nbRooms correspond to a virtual exit room)
           It is initially filled with zeros*/
        int money[] = new int[nbRooms+1];
 
        // Searches the building, updating money when finding a better path
        LinkedList<Room> q = new LinkedList<Room>();
        q.add(rooms[0]);
        while (q.size() > 0) {
            Room r = q.remove();
            for (int n : r.next)
                if (money[r.id] + r.sum > money[n]) {
                    money[n] = money[r.id] + r.sum;
                    if (n < nbRooms)
                        q.add(rooms[n]);
                }
        }
 
        /* At this point, money[nbRooms] is the maximum amount of money pocketted 
        on a path to the exit.*/
        System.out.println(money[nbRooms]);
    }
}