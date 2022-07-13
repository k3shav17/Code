package com.gfg;
import java.util.Arrays;

public class SearchRotatedArray {

    public static int indexOfKey(int[] arr, int key) {

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            } 
        }

        int rotations = arr.length - index;

        Arrays.sort(arr);

        int low = 0, high = arr.length; 

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) return Math.abs(mid + 1 - rotations);
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1};
        int key = 1;

        System.out.println(indexOfKey(arr, key)); 
    } 
}
