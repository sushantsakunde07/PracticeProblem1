package com.bridgelabz;

import java.util.Scanner;

public class PracticeProblem {
    public static void main(String[] args) {
        int number, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        number = sc.nextInt();
        int arr[] = new int[number];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 0; i < number; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }
}