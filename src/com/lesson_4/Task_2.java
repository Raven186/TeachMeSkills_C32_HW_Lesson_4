package com.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void taskTwo() {
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int)(Math.round(Math.random()*100));
        }
        System.out.println("Your random number array is: " + Arrays.toString(array));

        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        double average = Arrays.stream(array).average().getAsDouble();

        System.out.println("Min value: " + min + "\nMax value: " + max + "\nAverage: " + average);
    }
}
