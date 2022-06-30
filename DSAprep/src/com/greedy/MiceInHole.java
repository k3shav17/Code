package com.greedy;

import java.util.Arrays;

/*
 * There are N mice and N holes. A mice takes 1 minute to travel 1 unit left or right.
 * Find the minimum time after which all mice are in holes.
 * 
 * Constraints
 * 1 <= N < 1e5
 * -1e9 <= A[i] <= B[i] <= 1e9
 * 
 * */
public class MiceInHole {

	public int mininumTime(int[] mice, int[] holes) {
		
		int ans = 0;
		Arrays.sort(mice);
		Arrays.sort(holes);
		
		for (int i = 0; i < mice.length; i++) {
			ans = Math.max(ans, Math.abs(mice[i] - holes[i]));
		}
		
		return ans;
	}
	public static void main(String[] args) {

		int[] mice = { 3, 2, -4 };
		int[] holes = { 0, -2, 4 };

		MiceInHole mih = new MiceInHole();
		System.out.println(mih.mininumTime(mice, holes));
	}
}
