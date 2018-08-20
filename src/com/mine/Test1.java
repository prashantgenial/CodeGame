package com.mine;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while(true) {
			int max = 0;
			int imax = 0 ;
			for(int i= 0;i <8 ;i++) {
				int mountainH = in.nextInt();
				if(mountainH > max) {
					max = mountainH ;
					imax = i ;
				}
				
			}
			
			System.out.println(imax);
			
		}

	}

}
