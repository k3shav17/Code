package com.practice;

import java.util.Arrays;

public class PairSum {

    public static int[] consecutiveSum(int[] arr) {

        int[] elements = new int[2];

        if (arr.length == 0) return elements;

        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int maxEndHere = 0;
            maxEndHere = arr[i] + arr[i + 1];

            if (maxEndHere > maxSoFar) {
                elements[0] = arr[i];
                elements[1] = arr[i + 1];
            }
        }
        return elements;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 10, 6, 40};

        System.out.println(Arrays.toString(consecutiveSum(arr))); 

    } 
}
