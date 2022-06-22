package com.dailybyte;
/* 
 * Given an integer array, salaries, salaries[i] represents the salary of the ith employee. Return the average employee salary not considering the largest or the smallest salary.
 * 
 * Ex: Given the following salaries…
 *
 * salaries = [5000, 2000, 3000, 4000], return 3500.00000 ((3000 + 4000) / 2).
 * */

public class DB220622 {

    public double averageSalary(int[] salaries) {

        for(int i = 0; i < salaries.length; i++) {
            int min = i;

            for (int j = i + 1; j < salaries.length; j++) {
                if (salaries[j] < salaries[min]) {
                    min = j;
                }
            }
            int temp = salaries[min];
            salaries[min] = salaries[i];
            salaries[i] = temp;
        }

        return (salaries[1] + salaries[salaries.length - 2]) / 2;
    }

    public static void main(String[] args) {

        int[] salaries = {5000, 2000, 3000, 4000};

        DB220622 db = new DB220622();
        System.out.println(db.averageSalary(salaries)); 
    } 
}
