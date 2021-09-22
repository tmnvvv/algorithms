package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1,7,9};

        while (true) {
            System.out.println("");
            System.out.println("1.С фором.");
            System.out.println("2.С рекусией.");
            System.out.println("0.Выход.");

            System.out.println("Введите номер задачи:");
            System.out.print("> ");

            int index = scanner.nextInt();
            System.out.println("ARRAY: " + Arrays.toString(array));
            switch (index) {
                case 0: {
                    System.exit(1);
                    break;
                }
                case 1: {
                    int number = scanner.nextInt();

                    String result = checkVersionWithFor(array, number);
                    System.out.println(result);
                    break;
                }
                case 2: {
                    int number = scanner.nextInt();

                    String result = checkVersionWithRecursion(array, number, 0, 1);
                    System.out.println(result);
                    break;
                }
                default: {
                    System.out.println("Такой задачи нет!");
                    break;
                }
            }
        }
    }

    public static String checkVersionWithFor(int[] array, int number) {
        if (array.length == 0 || array == null ) { throw new IllegalArgumentException(); }

        int[] result = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == number && j != i) {
                    result[0] = array[i];
                    result[1] = array[j];

                    return Arrays.toString(result);
                }
            }
        }

        return "Нельзя";
    }

    public static String checkVersionWithRecursion(int[] array, int number, int i, int j) {
        if (array.length == 0 || array == null ) { throw new IllegalArgumentException(); }

        int[] result = new int[2];
        String resultString = "Нельзя";

        if (array[i] + array[j] == number) {
            result[0] = array[i];
            result[1] = array[j];

            return Arrays.toString(result);
        }

        if (i + 1 == array.length) {
            return resultString;
        } else {
            if (j + 1 < array.length && array[j + 1] != array[j] ) {
                resultString = checkVersionWithRecursion(array, number, i, j + 1);
            } else {
                resultString = checkVersionWithRecursion(array, number, i + 1, 0);
            }
        }

        return resultString;
    }
}