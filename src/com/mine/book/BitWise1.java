package com.mine.book;

public class BitWise1 {

	public static void main(String[] args) {
		
		int j = 6, i = 2 ;
		
		int allones = ~0 ;
		System.out.println(allones);

		int left = allones << (j +1);
		System.out.println(left);
	}

}
