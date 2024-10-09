package com.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {
    public static boolean taskZero(int[] array, int num) {
        boolean res = false;

        System.out.println(Arrays.toString(array));

        int biba = Arrays.binarySearch(array, num);

        if (biba < 0) {
            System.out.println("Нет такого числа");
        } else {
            System.out.println("Число имеет индекс: " + biba);
            res = true;
        }

        return res;
    }
}
