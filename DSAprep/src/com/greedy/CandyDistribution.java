package com.greedy;

/*
 * Given N kids stand in a line, each having an integer rating.
 * We distribute candies as follow:
 * 
 * 	Each kid getts at least 1 candy
 * 	Kids with higher ratings than neighbours get more candies
 *
 * Find the minimum candies required
 * 
 * Constraints
 * 1 <= N < 1e5
 * 
 * Input: [1, 3, 7, 1]
 * Output: 7
 * */
public class CandyDistribution {

	public int minimumCandies(int[] kids) {

		int low = 0, high = kids.length - 1;
		int i = 0;
		int candies = 0;

		while (low < high) {

			if (kids[i] > kids[low]) {
				candies += kids[low] + 1;
				low++;
			}
			if (kids[i] > kids[high]) {
				candies += kids[high] + 1;
				high--;
			}
			i++;
		}
		return candies;
	}

	public static void main(String[] args) {

		int[] kids = { 1, 3, 7, 1 };

		CandyDistribution cd = new CandyDistribution();
		System.out.println(cd.minimumCandies(kids));
	}
}
