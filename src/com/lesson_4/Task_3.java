package com.lesson_4;

import java.util.Arrays;

public class Task_3 {
    public static void taskThree() {
        int[] first = new int[5];
        int[] second = new int[5];

        for (int i = 0; i < first.length; i++) {
            first[i] = (int) Math.round(Math.random() * 100);
            second[i] = (int) Math.round(Math.random() * 100);
        }

        double average1 = Arrays.stream(first).average().getAsDouble();
        double average2 = Arrays.stream(second).average().getAsDouble();

        if (average1 > average2) {
            System.out.println("Average of array1 more then average of array2: " + "average1: " + average1 + " average2: " + average2);
        } else if (average2 > average1) {
            System.out.println("Average of array2 more then average of array1: " + "average2: " + average2 + " average1: " + average1);
        } else {
            System.out.println("It's equal to average1: " + average1 + "average2: " + average2);
        }
    }
}
