package com.practice;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

    public static List<Integer> union(int[] arr1, int[] arr2) {

        List<Integer> list1 = new ArrayList<>();
        Set<Integer> set1 = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }

        for (Integer integer : set1) {
            list1.add(integer);
        }
        return list1;
    }

    public static List<Integer> intersection(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            } else if(arr1[i] > arr2[j]) {
                j++;
            } else {
                list.add(arr2[j++]);
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        System.out.println(ArrayIntersection.union(arr1, arr2));
        System.out.println(ArrayIntersection.intersection(arr1, arr2));

    } 
}
