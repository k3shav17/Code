package com.tejas;

public class CommonPrefix {

	public static void main(String[] args) {

		String[] arr = { "flowers", "flow", "flight" };
		System.out.println(longestCommonPrefix(arr));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		String pre = strs[0];
		System.out.println(pre);
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0) {
				pre = pre.substring(0, pre.length() - 1);
				System.out.println(pre);
			}
			i++;
		}
		return pre;
	}
}
