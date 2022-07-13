package com.tejas;

public class Permutations {

	public static void main(String[] args) {

		String str = "TJS";
		int len = str.length();
		Permutations permutation = new Permutations();
		permutation.permute(str, 0, len - 1);

	}

	private void permute(String str, int low, int high) {

		if (low == high) {
			System.out.println(str);
		} else {
			for (int i = low; i <= high; i++) {
				str = swap(str, low, i);
				permute(str, low + 1, high);
			}
		}
	}

	public String swap(String str, int i, int j) {

		char temp;
		char[] letters = str.toCharArray();
		temp = letters[i];
		letters[i] = letters[j];
		letters[j] = temp;

		return String.valueOf(letters);
	}
}
