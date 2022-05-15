package com.hashmaps;

import java.util.HashMap;
import java.util.Map;

/*This question is asked by Amazon. 
 * You are at a birthday party and are asked to distribute cake to your guests. 
 * Each guess is only satisfied if the size of the piece of cake they’re given,
 * matches their appetite (i.e. is greater than or equal to their appetite). 
 * Given two arrays, appetite and cake where the ith element of appetite represents the ith guest’s appetite, 
 * and the elements of cake represents the sizes of cake you have to distribute, 
 * return the maximum number of guests that you can satisfy.

Ex: Given the following arrays appetite and cake…

appetite = [1, 2, 3], cake = [1, 2, 3], return 3.
Ex: Given the following arrays appetite and cake…

appetite = [3, 4, 5], cake = [2], return 0.*/
public class BirthdayCake {
	
	public static int noOfStatisfiedGuests(int[] appetite, int[] cake) {
		
		Map<Integer, Integer> guest = new HashMap<Integer, Integer>();
		int count = 0;
		
		for (int i = 0; i < appetite.length; i++) {
			guest.put(appetite[i], i);
		}
		
		for (int i = 0; i < cake.length; i++) {
			if (guest.containsKey(cake[i])) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int[] appetite = {3, 4, 5};
		int[] cake = {2};
		System.out.println(noOfStatisfiedGuests(appetite, cake));
	}
}
