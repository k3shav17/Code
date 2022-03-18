package com.dailybyte;

import java.util.Scanner;

/*This question is asked by Amazon. 
 * You are at a birthday party and are asked to distribute cake to your guests. 
 * Each guess is only satisfied if the size of the piece of cake they’re given,
 *  matches their appetite (i.e. is greater than or equal to their appetite). 
 *  Given two arrays, appetite and cake where the ithelement of appetite represents the ith guest’s appetite, 
 *  and the elements of cake represents the sizes of cake you have to distribute, 
 *  return the maximum number of guests that you can satisfy.

Ex: Given the following arrays appetite and cake…

appetite = [1, 2, 3], cake = [1, 2, 3], return 3.
Ex: Given the following arrays appetite and cake…

appetite = [3, 4, 5], cake = [2], return 0.*/

public class BirthdayCake {

	public static int noOfGuestsSatisfied(int[] appetite, int[] cake) {

		int satisfied = 0;
		for (int i = 0; i < cake.length; i++) {
			for (int j = i; j <= i; j++) {
				if (appetite[i] <= cake[j])
					satisfied++;
			}
		}
		return satisfied;
	}

	public static void main(String[] args) {

		System.out.println("Enter the appetite of the guests and no of guests");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] appetite = new int[size];

		for (int i = 0; i < appetite.length; i++) {
			appetite[i] = in.nextInt();
		}

		System.out.println("Enter the no of cake pieces and the size of pieces");
		int pieces = in.nextInt();
		int[] cake = new int[pieces];

		for (int i = 0; i < cake.length; i++) {
			cake[i] = in.nextInt();
		}
		System.out.println(BirthdayCake.noOfGuestsSatisfied(appetite, cake));

		in.close();
	}

}
