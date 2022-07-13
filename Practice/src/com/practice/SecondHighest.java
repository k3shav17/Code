package com.practice;

public class SecondHighest {

    public static int second(int[] arr) {

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max; // I am so DUMB!!!!
                max = arr[i];
            }
           // if (arr[i] > secondMax && arr[i] == max) {
           //     secondMax = arr[i];
           // }
        }
        return secondMax;
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 1, 10, 14, 6};

        System.out.println(second(arr)); 
    } 
}
