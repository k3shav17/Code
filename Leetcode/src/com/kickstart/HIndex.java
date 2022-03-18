package com.kickstart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Jorge is a physicist who has published many research papers and wants to know how much impact they have had in the academic community. 
 * To measure impact, he has developed a metric, H-index, to score each of his papers based on the number of times it has been cited by other papers. 
 * Specifically, the H-index score of a researcher is the largest integer H such that the researcher has H papers with at least H citations each.

Jorge has written N papers in his lifetime. The i-th paper has Ci citations. 
Each paper was written sequentially in the order provided, and the number of citations that each paper has will never change. 
Please help Jorge determine his H-index score after each paper he wrote.

Input
The first line of the input gives the number of test cases, T. 
T test cases follow. Each test case begins with a line containing N, the number of papers Jorge wrote. 
The second line contains N integers. The i-th integer is Ci, the number of citations that the i-th paper has.

Output
For each test case, output one line containing Case #x
: y, where x is the test case number (starting from 1) and y is a space-separated list of N integers. 
The i-th integer is Jorge's H-index score after writing his i-th paper. 

2
3
5 1 2
6
1 3 3 2 2 15

Case #1: 1 1 2
Case #2: 1 1 2 2 2 3


 The input contains 2 test cases. In Sample Case #1, Jorge wrote N = 3 papers.

    After the 1st paper, Jorge's H-index score is 1, since he has 1 paper with at least 1 citation.
    After the 2nd paper, Jorge's H-index score is still 1.
    After the 3rd paper, Jorge's H-index score is 2, since he has 2 papers with at least 2 citations (the 1st and 3rd papers).

In Sample Case #2, Jorge wrote N = 6 papers.

    After the 1st paper, Jorge's H-index score is 1, since he has 1 paper with at least 1 citation.
    After the 2nd paper, Jorge's H-index score is still 1.
    After the 3rd paper, Jorge's H-index score is 2, since he has 2 papers with at least 2 citations (the 2nd and 3rd papers).
    After the 4th paper, Jorge's H-index score is still 2.
    After the 5th paper, Jorge's H-index score is still 2.
    After the 6th paper, Jorge's H-index score is 3, since he has 3 papers with at least 3 citations (the 2nd, 3rd and 6th papers).

*/

public class HIndex {

	public static String indexScore(int papers, int[] citations) {

		int score = 1;
		String result = "";

		for (int i = 1; i < papers; i++) {

			if (citations[i - 1] >= citations[i]) {
				score++;
				result = result + score + " ";
			} else if (citations[i - 1] > citations[i]) {
				score++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter the no of test cases");

		try (Scanner in = new Scanner(System.in)) {
			int T = 1;

			for (int t = 1; t <= T; ++t) {
				int papers = 6;
//				int[] citations = new int[papers];
				int[] citations = { 1, 3, 3, 2, 2, 15 };

//				for (int i = 0; i < papers; i++) {
//					citations[i] = in.nextInt();
//				}
				System.out.println("Case #" + t + ": " + indexScore(papers, citations));
			}
		}
	}
}
