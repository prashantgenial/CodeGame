package com.mine;

public class Chocolate {

	 // Returns number of chocolates we can 
    // have from given number of chocolates 
    // and number of wrappers required to 
    // get a chocolate. 
    static int countRec(int choc, int wrap) 
    { 
          
        // If number of chocolates is less than 
        // number of wrappers required. 
        if (choc < wrap) 
            return 0; 
      
        // We can immediatly get newChoc using 
        // wrappers of choc. 
        int newChoc = choc / wrap; 
      
        // Now we have "newChoc + choc%wrap"  
        // wrappers. 
        return newChoc + countRec(newChoc +  
                          choc % wrap, wrap); 
    } 
    
 // Returns maximum number of chocolates 
    // we can eat with given money, price of 
    // chocolate and number of wrappers  
    // required to get a chocolate. 
    static int countMaxChoco(int money,  
                          int price, int wrap) 
    { 
          
        // We can directly buy below number of 
        // chocolates 
        int choc = money/price; 
      
        // countRec returns number of chocolates 
        // we can have from given number of  
        // chocolates 
        return choc + countRec(choc, wrap); 
    } 
    
 // Returns maximum number of chocolates  
    // we can eat with given money, price  
    // of chocolate and number of wrapprices 
    // required to get a chocolate. 
    static int countMaxChoco1(int money,  
                        int price, int wrap) 
    { 
          
        // Corner case 
        if (money < price) 
            return 0; 
      
        // First find number of chocolates  
        // that can be purchased with the 
        // given amount 
        int choc = money / price; 
      
        // Now just add number of chocolates 
        // with the chocolates gained by 
        // wrapprices 
        choc = choc + (choc - 1) / (wrap - 1); 
        return choc; 
    } 
    
    //https://www.geeksforgeeks.org/program-chocolate-wrapper-puzzle/
 // Driver code 
    public static void main (String[] args) 
    { 
        int money = 10 ; // total money 
        int price = 2; // cost of each candy 
          
        // no of wrappers needs to be 
        // exchanged for one chocolate. 
        int wrap = 5 ;  
        System.out.println(  
            countMaxChoco(money, price, wrap));
        
        System.out.println(  
                countMaxChoco1(money, price, wrap));
    } 
}
