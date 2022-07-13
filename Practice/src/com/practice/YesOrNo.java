package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class YesOrNo {

	public List<String> isPresent(String[] str) {

		Set<String> strings = new HashSet<String>();
		List<String> yesOrNo = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {
			if (strings.contains(str[i]))
				yesOrNo.add("Yes");
			else {
				strings.add(str[i]);
				yesOrNo.add("No");
			}
		}

		return yesOrNo;
	}

	public static void main(String[] args) {

		String[] str = { "Geeks", "Hello", "Great", "Geeks", "Hello" };

		YesOrNo yN = new YesOrNo();
		System.out.println(yN.isPresent(str));
	}
}
