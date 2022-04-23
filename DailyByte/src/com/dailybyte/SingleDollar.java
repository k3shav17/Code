package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an integer array, nums, each value in the array represents a dollar amount. 
 * For every positive value you gain nums[i] dollars and for every negative value you lose nums[i] dollars. 
 * Return the minimum number of dollars you must start with such that your dollar value never becomes less than one.

Ex: Given the following nums...

nums = [1, -4, 2, -3], return 5 (5 + 1 - 4 + 2 - 3 = 1).

Ex: Given the following nums...

nums = [-10], return 11.*/
public class SingleDollar {
	
	public static int startingMoney(List<Integer> dollars) {
		
		int start = 0, sum = 0;
		
		for (int i = 0; i < dollars.size(); i++) {
		
			sum = sum + dollars.get(i);
		}
		
		if (sum < 1) {
			start = Math.abs(sum) + 1;
		} else start = sum;
		
		return start;
	}

	public static void main(String[] args) {
		
		System.out.println("enter the size of the array");
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		System.out.println("enter the elements in to the array");
		List<Integer> dollars = new ArrayList<Integer>();
		
		for (int i = 0; i < size; i++) {
			dollars.add(in.nextInt());
		}
		
		System.out.println(startingMoney(dollars));
		in.close();
	}
}
