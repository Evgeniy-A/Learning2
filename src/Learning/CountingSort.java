package Learning;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // вычисляю количество элементов массива счетчика (максимальное значение array[] + 1)

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        // Заполняю масив счетчик

        int[] arrayCounter = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            int ind = array[i];
            arrayCounter[ind]++;
        }
        // заполняю массив отсортироваными данными

        int index = 0;
        for (int i = 0; i < arrayCounter.length; i++) {
            for (int j = 0; j < arrayCounter[i]; j++) {
                array[index++] = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}