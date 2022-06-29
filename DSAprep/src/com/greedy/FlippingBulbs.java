package com.greedy;

/*
 * Given N bulbs, either on (1) or off (0)
 * Turning on ith bulb causes all remaining bulbs on the right to flip.
 * 
 * Find the min number of switches to turn all the bulbs on.
 * 
 * constraints:
 * 1 <= N <= 1e5
 * A[i] = {0, 1}
 * */
public class FlippingBulbs {

	public int minCost(int[] bulbs) {

		int cost = 0;

		for (int i = 0; i < bulbs.length; i++) {

			if (cost % 2 == 0) {
				bulbs[i] = bulbs[i];
			} else {
				if (bulbs[i] == 1) {
					bulbs[i] = 0;
				} else {
					bulbs[i] = 1;
				}
			}
			if (bulbs[i] % 2 == 1) {
				continue;
			} else {
				cost++;
			}
		}
		return cost;
	}

	public static void main(String[] args) {

		int[] bulbs = { 0, 1, 0, 1, 1, 0, 1, 1 };
		FlippingBulbs fb = new FlippingBulbs();
		System.out.println(fb.minCost(bulbs));
	}
}
