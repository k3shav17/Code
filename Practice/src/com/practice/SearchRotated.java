package com.practice;

public class SearchRotated {

    public static int search(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) return mid;

            if (arr[start] <= arr[mid]) {
                if (key < arr[mid] && key >= arr[start]) {
                    end = mid - 1;
                } else start = mid + 1;
            }

            if (arr[mid] <= arr[end]) {
                if (key <= arr[end] && key > arr[mid]) {
                    start = mid + 1;
                } else end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 3;
        
        System.out.println(SearchRotated.search(arr, target));
        
    } 
}
