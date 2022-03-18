package com.dailybyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given a list of nums and a target, return all the unique combinations of nums that sum to target.

Ex: Given the following nums and target...

nums = [8, 2, 2, 4, 5, 6, 3]
target = 9
return [[2,2,5],[2,3,4],[3,6],[4,5]].*/

public class SumToTarget {

	public static List<List<Integer>> sumOfLists(int target, ArrayList<Integer> numbers) {

		List<List<Integer>> sumList = new ArrayList<>();
		
		for (int i = 0; i < numbers.size(); i++) {
			ArrayList<Integer> list = new ArrayList<>();
			
			for (int j = 1; j < numbers.size(); j++) {
				if (numbers.get(i) + numbers.get(j) == target) {
					list.add(numbers.get(i));
					list.add(numbers.get(j));
				}
			}
			sumList.add(list);
		}
		return sumList;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		System.out.println("Enter the elements in to the array");
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			numbers.add(in.nextInt());
		}
		System.out.println("Enter the target, you want the sum of!!");
		int target = in.nextInt();
		System.out.println(SumToTarget.sumOfLists(target, numbers));
		in.close();
	}

}
