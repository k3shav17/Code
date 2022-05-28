package com.hr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int entries = 3;

		Map<String, Integer> phoneBook = new HashMap<>();

		for (int i = 0; i < entries; i++) {
			String name = in.nextLine();
			int num = in.nextInt();
			in.nextLine();
			phoneBook.put(name, num);
		}

		List<String> names = new ArrayList<>();

		for (int i = 0; i < entries; i++) {
			names.add(in.nextLine());
		}

		Set<Entry<String, Integer>> entry = phoneBook.entrySet();

		Iterator<Entry<String, Integer>> it = entry.iterator();

		while (it.hasNext()) {

			boolean flag = false;
			Entry<String, Integer> contact = it.next();

			for (int i = 0; i < entries; i++) {
				if (contact.getKey().equals(names.get(i))) {

					flag = true;
				}
			}

			if (flag) {
				System.out.println(contact.getKey() + "=" + contact.getValue());
			} else
				System.out.println("Not found");
		}
		in.close();
	}

}
