package com.sde;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*Given an array of both positive and negative integers ‘arr[]’ which are sorted. The task is to sort the square of the numbers of the Array. 
Examples: 

Input  : arr[] =  {-6, -3, -1, 2, 4, 5}
Output : 1, 4, 9, 16, 25, 36 

Input  : arr[] = {-5, -4, -2, 0, 1}
Output : 0, 1, 4, 16, 25*/

public class SortSquares {

	public static List<Integer> sortedSquares(List<Integer> nums) {

		int[] arr = new int[nums.size()];

		for (int i = 0; i < nums.size(); i++) {
			arr[i] = nums.get(i);
		}
		for (int i = 0; i < nums.size(); i++) {
			int min = i;
			
			for (int j = i + 1; j < nums.size(); j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	
		List<Integer> sortedList = new LinkedList<>();
		
		for (int i = 0; i < nums.size(); i++) {
			sortedList.add(arr[i]);
		}
		return sortedList;
	}

	public static void main(String[] args) {

		System.out.println("enter the elements into the array, click x when you are done");
		Scanner in = new Scanner(System.in);

		List<Integer> nums = new ArrayList<Integer>();

		while (true) {
			String element = in.nextLine();

			if (element.equalsIgnoreCase("x")) {
				break;
			} else
				nums.add(Integer.parseInt(element));
		}

		List<Integer> squaredNums = nums.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(sortedSquares(sortedSquares(squaredNums)));
		in.close();
	}
}
