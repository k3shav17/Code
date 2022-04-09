package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Code {
//
	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[4];
		String search;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < medicine.length; i++) {
			String medicineName = sc.nextLine();
			String batchNo = sc.nextLine();
			String disease = sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			medicine[i] = new Medicine(medicineName, batchNo, disease, price);

		}

		search = sc.nextLine();
		Integer[] price = medicinePriceForGivenDisease(medicine, search);

		for (int i = 0; i < price.length; i++) {
			System.out.println(price[i]);
		}
	}

	public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine, String disease) {

		Integer[] price = new Integer[medicine.length];
		Integer[] finalPrice = new Integer[1];
		for (int i = 0; i < medicine.length; i++) {
			if (medicine[i].getDisease().equalsIgnoreCase(disease)) {

				price[i] = medicine[i].getPrice();
			}
		}
		Arrays.sort(price);
		int i = 0;
		while (price[i] != null) {
			finalPrice[i++] = price[i];
		}
		return price;
	}
}

class Medicine {

	String medicineName;
	String batchNo;
	String disease;
	int price;

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Medicine(String medicineName, String batchNo, String disease, int price) {
		super();
		this.medicineName = medicineName;
		this.batchNo = batchNo;
		this.disease = disease;
		this.price = price;
	}
}
