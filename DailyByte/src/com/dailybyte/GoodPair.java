package com.dailybyte;

import java.util.ArrayList;
import java.util.Scanner;

/*Given an integer array that is sorted in ascending order and a value target, 
 * return two unique indices (one based) such that the values at those indices sums to the given target.
Note: If no two such indices exist, return null.

Ex: Given the following nums and target…

nums = [1, 2, 5, 7, 9], target = 10, return [1,5].
Ex: Given the following nums and target…

nums = [1, 3, 8], target = 13, return null.*/
public class GoodPair {

	public static void findingGoodPair(ArrayList<Integer> elements, int target) {

		ArrayList<Integer> indices = new ArrayList<>();

		for (int i = 0; i < elements.size(); i++) {
			for (int j = i + 1; j < elements.size(); j++) {
				if ((elements.get(i) + elements.get(j)) == target) {
					indices.add(i + 1);
					indices.add(j + 1);
				}
			}
		}

		if (indices.size() >= 1) {
			System.out.println(indices);
		} else
			System.out.println("null");
	}

	public static void main(String[] args) {

		System.out.println("Enter the number of elements you want to enter");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Now enter the elements");
		ArrayList<Integer> elements = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			elements.add(in.nextInt());
		}

		System.out.println("Enter the target value");
		int target = in.nextInt();

		GoodPair.findingGoodPair(elements, target);
		in.close();

	}

}
