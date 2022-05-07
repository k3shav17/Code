package com.dailybyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Given a list of nums and a target, return all the unique combinations of nums that sum to target.

Ex: Given the following nums and target...

nums = [8, 2, 2, 4, 5, 6, 3]
target = 9
return [[2,2,5],[2,3,4],[3,6],[4,5]].*/

public class SumToTarget {

	public static List<List<Integer>> sumOfLists(int target, List<Integer> numbers) {

		List<List<Integer>> sumList = new ArrayList<>();

		Collections.sort(numbers);

		for (int i = 0; i < numbers.size(); i++) {
			List<Integer> combinations = new ArrayList<Integer>();

			for (int j = i + 1; j < numbers.size(); j++) {
				for (int k = j + 1; k < numbers.size(); k++) {
					if (numbers.get(i) + numbers.get(j) + numbers.get(k) == target) {
						combinations.add(numbers.get(i));
						combinations.add(numbers.get(j));
						combinations.add(numbers.get(k));
					}
				}
			}

			sumList.add(combinations);
		}

		return sumList;

	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		System.out.println("Enter the elements in to the array");
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			numbers.add(in.nextInt());
		}
		System.out.println("Enter the target, you want the sum of!!");
		int target = in.nextInt();
		System.out.println(SumToTarget.sumOfLists(target, numbers));
		in.close();
	}

}
