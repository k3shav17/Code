package com.dailybyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*You are given a MxN matrix and a value k. 
 * Every value in the matrix is a one which represents an adult and a zero which represents a child. 
 * For every row in the matrix, adults appear before children. 
 * A row that has more adults than another row is more strongly supervised. 
 * Return the k rows of matrix that have the least amount of supervision in ascending order.
 * Note: It is guaranteed no ties will occur for the number of adults in a row.
 * Ex: Given the following matrix and k...

matrix = [
  [1, 1, 0],
  [1, 0, 0],
  [0, 0, 0]
], k = 3, return [2, 1, 0] (row 2 has least adults followed by row 1 and row 0).

Ex: Given the following matrix and k...

matrix = [
  [1, 1, 1],
  [1, 1, 0],
  [1, 0, 0]
], k = 2, return [2, 1].*/
public class AdultSupervision {

	public static List<Integer> leastSupervision(List<List<Integer>> childrenAndAdults, int k) {

		List<Integer> notGood = new ArrayList<Integer>();

		List<Integer> finalList = new LinkedList<Integer>();
		for (int i = 0; i < childrenAndAdults.size(); i++) {

			int count = 0;
			for (int j = 0; j < childrenAndAdults.get(i).size(); j++) {
				if (childrenAndAdults.get(i).get(j) == 1) {
					count++;
				}
			}
			notGood.add(count);
		}
		
		Collections.sort(notGood);

		for (int i = 0; i < k; i++) {
			finalList.add(notGood.get(i));
		}
		return finalList;
	}

	public static void main(String[] args) {
		System.out.println("enter the elements which are only ones and zeros");

		List<List<Integer>> childrenAndAdults = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			List<Integer> tempPeople = new ArrayList<>();

			for (int j = 0; j < 3; j++) {
				tempPeople.add(in.nextInt());
			}
			childrenAndAdults.add(tempPeople);
		}
		System.out.println("enter the no of rows for which you want the supervision");
		int k = in.nextInt();

		System.out.println(leastSupervision(childrenAndAdults, k));
		in.close();

	}
}
