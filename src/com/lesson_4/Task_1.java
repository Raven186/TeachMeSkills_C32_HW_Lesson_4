package com.lesson_4;

import java.util.Arrays;

public class Task_1 {
    public static void taskOne(int[] array, int num, boolean taskZeroResult) {
        if (taskZeroResult) {
            array = Arrays.stream(array).filter(x -> x != num).toArray();
            System.out.println("Удалили из массива элемент " + num);
            System.out.println(Arrays.toString(array));
        }
    }
}
