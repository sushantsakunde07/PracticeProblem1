package com.bridgelabz;

import java.util.Scanner;

public class PracticeProblem {
    public static void main(String[] args) {
        int number, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        number = sc.nextInt();
        int arr[] = new int[number];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        for (int i = 0; i < number; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
    }
}