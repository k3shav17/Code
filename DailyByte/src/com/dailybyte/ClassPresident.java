package com.dailybyte;

import java.util.Arrays;
import java.util.Scanner;

/*High school students are voting for their class president and you’re tasked with counting the votes. 
 * Each presidential candidates is represented by a unique integer and 
 * the candidate that should win the election is the candidate that has received more than half the votes. 
 * Given a list of integers, return the candidate that should become the class president.
Note: You may assume there is always a candidate that has received more than half the votes.

Ex: Given the following votes…

votes = [1, 1, 2, 2, 1], return 1.
Ex: Given the following votes…

votes = [1, 3, 2, 3, 1, 2, 3, 3, 3], return 3.*/
public class ClassPresident {

	public static int declaringTheWinner(int[] votes) {

		int voteCounter = 0;
		int maxVotes = 0;
		int tempVotes = 0;
		Arrays.sort(votes);

		for (int i = 0; i < votes.length - 1; i++) {

			if (votes[i] == votes[i + 1]) {
				voteCounter++;
				tempVotes = voteCounter;
				
				if (maxVotes > tempVotes) {
					break;
				} else {
					maxVotes = voteCounter;
					voteCounter = 0;
					continue;
				}
			}
		}
		return maxVotes;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number of votes...");
		Scanner in = new Scanner(System.in);

		int noOfVotes = in.nextInt();
		System.out.println("Enter the votes symbols or numbers");

		int[] votes = new int[noOfVotes];
		for (int i = 0; i < noOfVotes; i++) {
			votes[i] = in.nextInt();
		}

		System.out.println(ClassPresident.declaringTheWinner(votes));
		in.close();
	}

}
