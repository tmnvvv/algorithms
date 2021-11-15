package com.company;

import java.util.Arrays;
/*
    Есть массив из целых положительных чисел.
    Написать функцию, которая определяет можно ли заданное число
    представить суммой чисел из массива(каждое число можно использовать один раз).
    Например: массив: {1,7,9}
    Число 10 можно представить суммой (1+9), число 5 нельзя
 */

public class Main {
    public static void main(String[] args) {
        int []array = new int[3];
        int value = 5;
        int idx = 0;
        int idy = 1;

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(findSumInMassive(array, value, idx, idy));

    }

    public static String findSumInMassive(int []array, int value, int idx, int idy) {
        String res = "Не возможно посчитать";
        if (array.length == 0 || array == null ) {
            return "Не верно задан массив";
        }
        if (idx + 1 == array.length) {
            return res;
        }
        if (array[idx] + array[idy] == value) {
            int []result = new int[2];
            result[0] = array[idx];
            result[1] = array[idy];
            return Arrays.toString(result);
        }
        if (idy + 1 < array.length) {
            return findSumInMassive(array, value, idx, idy + 1);
        } else {
            return findSumInMassive(array, value, idx + 1, idx+2);
        }

    }
}
