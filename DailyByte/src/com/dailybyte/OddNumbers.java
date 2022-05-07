package com.dailybyte;

import java.util.Scanner;

/*Given two non-negative integers low and high, return the total count of odd numbers between them (inclusive).

Ex: Given the following low and high…

low = 1, high = 3, return 2 (1 and 3 are both odd).

Ex: Given the following low and high…

low = 1, high = 10, return 5.*/

public class OddNumbers {

	public static void main(String[] args) {
	
		System.out.println("enter the low and high values, in which you want to add the odd numbers");
		
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		int low = in.nextInt(), high = in.nextInt();
		
		for (int i = low; i <= high; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
