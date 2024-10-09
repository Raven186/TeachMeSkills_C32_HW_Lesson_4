import com.lesson_4.Task_0;
import com.lesson_4.Task_1;
import com.lesson_4.Task_2;
import com.lesson_4.Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сюда целое число: ");
        Scanner sc = new Scanner(System.in);
        int scannerValue = sc.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        Arrays.sort(array);
        int[] arrayForTaskOne = Arrays.copyOf(array, array.length);
        boolean taskZeroResult = Task_0.taskZero(array, scannerValue);
        Task_1.taskOne(arrayForTaskOne, scannerValue, taskZeroResult);
        Task_2.taskTwo();
        Task_3.taskThree();
    }
}
